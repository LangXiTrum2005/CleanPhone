package androidx.media3.extractor.avi;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes.dex */
final class ChunkReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackOutput f6851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6853c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6854e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6856i;
    public int j;
    public long[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f6857l;

    public ChunkReader(int i2, int i3, long j, int i4, TrackOutput trackOutput) {
        boolean z2 = true;
        if (i3 != 1 && i3 != 2) {
            z2 = false;
        }
        Assertions.b(z2);
        this.d = j;
        this.f6854e = i4;
        this.f6851a = trackOutput;
        int i5 = (((i2 % 10) + 48) << 8) | ((i2 / 10) + 48);
        this.f6852b = (i3 == 2 ? 1667497984 : 1651965952) | i5;
        this.f6853c = i3 == 2 ? i5 | 1650720768 : -1;
        this.k = new long[512];
        this.f6857l = new int[512];
    }

    public final SeekPoint a(int i2) {
        return new SeekPoint(((this.d * ((long) 1)) / ((long) this.f6854e)) * ((long) this.f6857l[i2]), this.k[i2]);
    }

    public final SeekMap.SeekPoints b(long j) {
        int i2 = (int) (j / ((this.d * ((long) 1)) / ((long) this.f6854e)));
        int iD = Util.d(this.f6857l, i2, true, true);
        if (this.f6857l[iD] == i2) {
            SeekPoint seekPointA = a(iD);
            return new SeekMap.SeekPoints(seekPointA, seekPointA);
        }
        SeekPoint seekPointA2 = a(iD);
        int i3 = iD + 1;
        return i3 < this.k.length ? new SeekMap.SeekPoints(seekPointA2, a(i3)) : new SeekMap.SeekPoints(seekPointA2, seekPointA2);
    }
}
