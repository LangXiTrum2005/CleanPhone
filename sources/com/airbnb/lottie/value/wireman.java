package com.airbnb.lottie.value;

/* JADX INFO: compiled from: ScaleXY.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public float f16269attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public float f16270saneness;

    public wireman(float f, float f2) {
        this.f16269attabal = f;
        this.f16270saneness = f2;
    }

    public boolean attabal(float f, float f2) {
        return this.f16269attabal == f && this.f16270saneness == f2;
    }

    public float dern() {
        return this.f16270saneness;
    }

    public float saneness() {
        return this.f16269attabal;
    }

    public String toString() {
        return saneness() + "x" + dern();
    }

    public void wireman(float f, float f2) {
        this.f16269attabal = f;
        this.f16270saneness = f2;
    }

    public wireman() {
        this(1.0f, 1.0f);
    }
}
