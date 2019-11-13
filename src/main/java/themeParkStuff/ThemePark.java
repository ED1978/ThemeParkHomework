package themeParkStuff;

import attractions.*;
import behaviours.IReviewed;
import stalls.CandyFlossStall;
import stalls.FagStall;
import stalls.IceCreamStall;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {


    private String name;
    private Attraction dogems;
    private Attraction park;
    private Attraction playGround;
    private Attraction rollerCoaster;
    private Stall candyFlossStall;
    private Stall fagStall;
    private Stall iceCreamStall;
    private ArrayList<IReviewed> parkFeatures;
    private ArrayList<IReviewed> reviewedFeatures;


    public ThemePark(String name){
        this.name = name;
        this.dogems = new Dogems();
        this.park = new Park();
        this.playGround = new PlayGround();
        this.rollerCoaster = new RollerCoaster();
        this.candyFlossStall = new CandyFlossStall("Francis");
        this.fagStall = new FagStall("Mavis");
        this.iceCreamStall = new IceCreamStall("Sheena");
        this.parkFeatures = new ArrayList<IReviewed>();
        this.reviewedFeatures = new ArrayList<IReviewed>();
        this.parkFeatures.add(dogems);
        this.parkFeatures.add(park);
        this.parkFeatures.add(rollerCoaster);
        this.parkFeatures.add(playGround);
        this.parkFeatures.add(candyFlossStall);
        this.parkFeatures.add(fagStall);
        this.parkFeatures.add(iceCreamStall);
    }

    public int getFeaturesLength(){
        return this.parkFeatures.size();
    }

    public int getReviewedFeaturesLength(){
        return this.reviewedFeatures.size();
    }

    public int getDogemsRating(){
        return this.dogems.getRating();
    }


    public void updateFeatureRating(String featureName, int rating){
        for ( IReviewed feature : parkFeatures){
            if (featureName == feature.getName()){
                feature.setRating(rating);
            }
        }
        populateReviewedFeatures();
    }

    public void populateReviewedFeatures(){
        this.reviewedFeatures.removeAll(reviewedFeatures);
        for (IReviewed feature : parkFeatures){
            if(feature.getRating() != 0){
                this.reviewedFeatures.add(feature);
            }
        }
    }


}
