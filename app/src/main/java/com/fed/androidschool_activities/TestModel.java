package com.fed.androidschool_activities;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class TestModel implements Parcelable {

    String string;
    List<Integer> integers;
    List<Float> floats;
    public TestModel(String str, List<Integer> ints, List<Float> flts){
        this.string = str;
        this.floats = flts;
        this.integers = ints;    }


    protected TestModel(Parcel in) {
        this.string = in.readString();;
        this.floats = in.readArrayList(null);
        this.integers = in.readArrayList(null);
    }

    public static final Creator<TestModel> CREATOR = new Creator<TestModel>() {
        @Override
        public TestModel createFromParcel(Parcel in) {
            return  new TestModel(in);
        }

        @Override
        public TestModel[] newArray(int size) {
            return new TestModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(string);
        parcel.writeList(floats);
        parcel.writeList(integers);
    }
}
