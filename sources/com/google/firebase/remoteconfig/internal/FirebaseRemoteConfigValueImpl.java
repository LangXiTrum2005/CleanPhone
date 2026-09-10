package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseRemoteConfigValueImpl implements FirebaseRemoteConfigValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20992b;

    public FirebaseRemoteConfigValueImpl(String str, int i2) {
        this.f20991a = str;
        this.f20992b = i2;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public final String a() {
        return this.f20992b == 0 ? "" : this.f20991a;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public final double b() {
        if (this.f20992b == 0) {
            return 0.0d;
        }
        String strTrim = a().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException(android.support.v4.media.a.n("[Value: ", strTrim, "] cannot be converted to a double."), e2);
        }
    }
}
