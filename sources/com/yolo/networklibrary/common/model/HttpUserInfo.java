package com.yolo.networklibrary.common.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes3.dex */
public class HttpUserInfo {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    @SerializedName("uid")
    private String f23949attabal = "";

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    @SerializedName("token")
    private String f23950saneness = "";

    public String attabal() {
        return this.f23950saneness;
    }

    public String saneness() {
        return this.f23949attabal;
    }
}
