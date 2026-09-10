package com.smartdigimkt.c4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f34272l = 0;
    public static final int m = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f34275c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f34276e;
    public final com.smartdigimkt.w3.m f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f34277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f34278i;
    public final int j;
    private final k[] k;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public j(int i2, int i3, long j, long j2, long j3, com.smartdigimkt.w3.m mVar, int i4, k[] kVarArr, int i5, long[] jArr, long[] jArr2) {
        this.f34273a = i2;
        this.f34274b = i3;
        this.f34275c = j;
        this.d = j2;
        this.f34276e = j3;
        this.f = mVar;
        this.g = i4;
        this.k = kVarArr;
        this.j = i5;
        this.f34277h = jArr;
        this.f34278i = jArr2;
    }

    public k a(int i2) {
        k[] kVarArr = this.k;
        if (kVarArr == null) {
            return null;
        }
        return kVarArr[i2];
    }
}
