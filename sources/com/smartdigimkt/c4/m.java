package com.smartdigimkt.c4;

import com.smartdigimkt.p4.f0;

/* JADX INFO: loaded from: classes5.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f34292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f34294c;
    public final int[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34295e;
    public final long[] f;
    public final int[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f34296h;

    public m(j jVar, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j) {
        com.smartdigimkt.p4.a.a(iArr.length == jArr2.length);
        com.smartdigimkt.p4.a.a(jArr.length == jArr2.length);
        com.smartdigimkt.p4.a.a(iArr2.length == jArr2.length);
        this.f34292a = jVar;
        this.f34294c = jArr;
        this.d = iArr;
        this.f34295e = i2;
        this.f = jArr2;
        this.g = iArr2;
        this.f34296h = j;
        this.f34293b = jArr.length;
    }

    public int a(long j) {
        for (int iB = f0.b(this.f, j, true, false); iB >= 0; iB--) {
            if ((this.g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int iA = f0.a(this.f, j, true, false); iA < this.f.length; iA++) {
            if ((this.g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
