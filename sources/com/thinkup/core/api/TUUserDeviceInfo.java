package com.thinkup.core.api;

import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
public class TUUserDeviceInfo {
    String devGaid;
    String devImei;
    String devOaid;
    String devUID2Token;

    public TUUserDeviceInfo() {
    }

    public String getDevGaid() {
        return this.devGaid;
    }

    public String getDevImei() {
        return this.devImei;
    }

    public String getDevOaid() {
        return this.devOaid;
    }

    public String getDevUID2Token() {
        return this.devUID2Token;
    }

    public void setDevGaid(String str) {
        this.devGaid = str;
    }

    public void setDevImei(String str) {
        this.devImei = str;
    }

    public void setDevOaid(String str) {
        this.devOaid = str;
    }

    public void setDevUID2Token(String str) {
        this.devUID2Token = str;
    }

    public TUUserDeviceInfo(Parcel parcel) {
        this.devGaid = parcel.readString();
        this.devImei = parcel.readString();
        this.devOaid = parcel.readString();
        this.devUID2Token = parcel.readString();
    }
}
