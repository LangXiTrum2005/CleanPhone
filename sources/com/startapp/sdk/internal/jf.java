package com.startapp.sdk.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f41144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41146c;
    public final int[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f41147e;
    public final Integer f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f41148h;

    public jf(a3 a3Var, ArrayList arrayList, int i2, int[] iArr, Integer num, Integer num2, int i3, int i4) {
        this.f41144a = a3Var;
        this.f41145b = arrayList;
        this.f41146c = i2;
        this.d = iArr;
        this.f41147e = num;
        this.f = num2;
        this.g = i3;
        this.f41148h = i4;
    }

    public final boolean a(int i2) {
        return (i2 & this.f41148h) != 0;
    }
}
