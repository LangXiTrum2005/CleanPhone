package com.airbnb.lottie.value;

/* JADX INFO: loaded from: classes.dex */
public class ScaleXY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f9965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f9966b;

    public ScaleXY(float f, float f2) {
        this.f9965a = f;
        this.f9966b = f2;
    }

    public final String toString() {
        return this.f9965a + "x" + this.f9966b;
    }

    public ScaleXY() {
        this(1.0f, 1.0f);
    }
}
