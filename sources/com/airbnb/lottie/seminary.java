package com.airbnb.lottie;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: LottieImageAsset.java */
/* JADX INFO: loaded from: classes.dex */
public class seminary {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f16186attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public Bitmap f16187beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f16188dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String f16189marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f16190saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f16191wireman;

    public seminary(int i, int i2, String str, String str2, String str3) {
        this.f16186attabal = i;
        this.f16190saneness = i2;
        this.f16188dern = str;
        this.f16191wireman = str2;
        this.f16189marial = str3;
    }

    public seminary attabal(float f) {
        seminary seminaryVar = new seminary((int) (this.f16186attabal * f), (int) (this.f16190saneness * f), this.f16188dern, this.f16191wireman, this.f16189marial);
        Bitmap bitmap = this.f16187beachfront;
        if (bitmap != null) {
            seminaryVar.competently(Bitmap.createScaledBitmap(bitmap, seminaryVar.f16186attabal, seminaryVar.f16190saneness, true));
        }
        return seminaryVar;
    }

    public int beachfront() {
        return this.f16186attabal;
    }

    public void competently(Bitmap bitmap) {
        this.f16187beachfront = bitmap;
    }

    public String dern() {
        return this.f16191wireman;
    }

    public String marial() {
        return this.f16188dern;
    }

    public Bitmap saneness() {
        return this.f16187beachfront;
    }

    public int wireman() {
        return this.f16190saneness;
    }
}
