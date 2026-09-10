package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ni f18056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f18057b;

    public o(ni niVar, int[] iArr) {
        if (iArr.length == 0) {
            v71.J("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f18056a = niVar;
        this.f18057b = iArr;
    }
}
