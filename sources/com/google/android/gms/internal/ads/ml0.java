package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f17473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17474e;

    public long a() {
        int i10 = this.f17472c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f17473d;
        int i11 = this.f17470a;
        long j10 = jArr[i11];
        this.f17470a = this.f17474e & (i11 + 1);
        this.f17472c = i10 - 1;
        return j10;
    }

    public long b() {
        int i10 = this.f17472c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f17473d;
        int i11 = this.f17470a;
        long j10 = jArr[i11];
        this.f17470a = this.f17474e & (i11 + 1);
        this.f17472c = i10 - 1;
        return j10;
    }
}
