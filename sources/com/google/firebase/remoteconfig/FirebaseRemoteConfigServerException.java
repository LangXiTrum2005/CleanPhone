package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    public final int X;

    public FirebaseRemoteConfigServerException(int i2, String str) {
        super(str);
        this.X = i2;
    }

    public FirebaseRemoteConfigServerException(int i2, String str, FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        super(str, firebaseRemoteConfigServerException);
        this.X = i2;
    }

    public FirebaseRemoteConfigServerException(int i2, String str, int i3) {
        super(str);
        this.X = i2;
    }

    public FirebaseRemoteConfigServerException(String str) {
        super(str);
        this.X = -1;
    }
}
