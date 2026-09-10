package com.smartdigimkt.p4;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37554c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37555e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f37556h;

    public j(byte[] bArr, int i2) {
        r rVar = new r(bArr);
        rVar.b(i2 * 8);
        this.f37552a = rVar.a(16);
        this.f37553b = rVar.a(16);
        this.f37554c = rVar.a(24);
        this.d = rVar.a(24);
        this.f37555e = rVar.a(20);
        this.f = rVar.a(3) + 1;
        this.g = rVar.a(5) + 1;
        this.f37556h = ((((long) rVar.a(4)) & 15) << 32) | (((long) rVar.a(32)) & 4294967295L);
    }

    public int a() {
        return this.g * this.f37555e;
    }

    public long b() {
        return (this.f37556h * 1000000) / ((long) this.f37555e);
    }

    public long c() {
        long j;
        long j2;
        int i2 = this.d;
        if (i2 > 0) {
            j = (((long) i2) + ((long) this.f37554c)) / 2;
            j2 = 1;
        } else {
            int i3 = this.f37552a;
            j = ((((i3 != this.f37553b || i3 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i3) * ((long) this.f)) * ((long) this.g)) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public int d() {
        return (this.g / 8) * this.f37553b * this.f;
    }

    public long a(long j) {
        return f0.b((j * ((long) this.f37555e)) / 1000000, 0L, this.f37556h - 1);
    }

    public j(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        this.f37552a = i2;
        this.f37553b = i3;
        this.f37554c = i4;
        this.d = i5;
        this.f37555e = i6;
        this.f = i7;
        this.g = i8;
        this.f37556h = j;
    }
}
