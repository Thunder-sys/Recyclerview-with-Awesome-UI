package com.example.recy.modelcla;

public class Recyclemodel {
    int img;
    String tourname;
    public Recyclemodel(int img, String tourname) {
        this.img = img;
        this.tourname = tourname;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTourname() {
        return tourname;
    }

    public void setTourname(String tourname) {
        this.tourname = tourname;
    }


}
