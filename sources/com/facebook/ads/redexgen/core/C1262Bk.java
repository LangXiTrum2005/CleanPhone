package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1262Bk {
    public final C6 A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final DownloadRequest A07;

    public C1262Bk(DownloadRequest downloadRequest, int i2, long j, long j2, long j3, int i3, int i4) {
        this(downloadRequest, i2, j, j2, j3, i3, i4, new C6());
    }

    public C1262Bk(DownloadRequest downloadRequest, int i2, long j, long j2, long j3, int i3, int i4, C6 c6) {
        AbstractC10843y.A01(c6);
        AbstractC10843y.A07((i4 == 0) == (i2 != 4));
        if (i3 != 0) {
            AbstractC10843y.A07((i2 == 2 || i2 == 0) ? false : true);
        }
        this.A07 = downloadRequest;
        this.A02 = i2;
        this.A05 = j;
        this.A06 = j2;
        this.A04 = j3;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = c6;
    }

    public final float A00() {
        return this.A00.A00;
    }

    public final long A01() {
        return this.A00.A01;
    }

    public final boolean A02() {
        return this.A02 == 3 || this.A02 == 4;
    }
}
