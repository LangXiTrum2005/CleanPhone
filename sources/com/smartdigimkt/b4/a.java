package com.smartdigimkt.b4;

import com.smartdigimkt.p4.f0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements k {
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f33902e;
    public final long[] f;
    public final long[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f33903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f33904i;

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f33902e = iArr;
        this.f = jArr;
        this.g = jArr2;
        this.f33903h = jArr3;
        int length = iArr.length;
        this.d = length;
        if (length <= 0) {
            this.f33904i = 0L;
        } else {
            int i2 = length - 1;
            this.f33904i = jArr2[i2] + jArr3[i2];
        }
    }

    @Override // com.smartdigimkt.b4.k
    public boolean a() {
        return true;
    }

    public int b(long j) {
        return f0.b(this.f33903h, j, true, true);
    }

    public String toString() {
        return "ChunkIndex(length=" + this.d + ", sizes=" + Arrays.toString(this.f33902e) + ", offsets=" + Arrays.toString(this.f) + ", timeUs=" + Arrays.toString(this.f33903h) + ", durationsUs=" + Arrays.toString(this.g) + ")";
    }

    @Override // com.smartdigimkt.b4.k
    public k.a a(long j) {
        int iB = b(j);
        l lVar = new l(this.f33903h[iB], this.f[iB]);
        if (lVar.f33926a >= j || iB == this.d - 1) {
            return new k.a(lVar);
        }
        int i2 = iB + 1;
        return new k.a(lVar, new l(this.f33903h[i2], this.f[i2]));
    }

    @Override // com.smartdigimkt.b4.k
    public long b() {
        return this.f33904i;
    }
}
