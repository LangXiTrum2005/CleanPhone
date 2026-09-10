package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
final class ChunkReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackOutput f17607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17609c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17610e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17612i;
    public int j;
    public long[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f17613l;

    public ChunkReader(int i2, int i3, long j, int i4, TrackOutput trackOutput) {
        boolean z2 = true;
        if (i3 != 1 && i3 != 2) {
            z2 = false;
        }
        Assertions.b(z2);
        this.d = j;
        this.f17610e = i4;
        this.f17607a = trackOutput;
        int i5 = (((i2 % 10) + 48) << 8) | ((i2 / 10) + 48);
        this.f17608b = (i3 == 2 ? 1667497984 : 1651965952) | i5;
        this.f17609c = i3 == 2 ? i5 | 1650720768 : -1;
        this.k = new long[512];
        this.f17613l = new int[512];
    }

    public final SeekPoint a(int i2) {
        return new SeekPoint(((this.d * ((long) 1)) / ((long) this.f17610e)) * ((long) this.f17613l[i2]), this.k[i2]);
    }

    public final SeekMap.SeekPoints b(long j) {
        int i2 = (int) (j / ((this.d * ((long) 1)) / ((long) this.f17610e)));
        int iE = Util.e(this.f17613l, i2, true, true);
        if (this.f17613l[iE] == i2) {
            SeekPoint seekPointA = a(iE);
            return new SeekMap.SeekPoints(seekPointA, seekPointA);
        }
        SeekPoint seekPointA2 = a(iE);
        int i3 = iE + 1;
        return i3 < this.k.length ? new SeekMap.SeekPoints(seekPointA2, a(i3)) : new SeekMap.SeekPoints(seekPointA2, seekPointA2);
    }
}
