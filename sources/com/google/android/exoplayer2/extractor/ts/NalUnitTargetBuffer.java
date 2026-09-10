package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class NalUnitTargetBuffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18034c;
    public byte[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18035e;

    public NalUnitTargetBuffer(int i2) {
        this.f18032a = i2;
        byte[] bArr = new byte[131];
        this.d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i2, int i3) {
        if (this.f18033b) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i5 = this.f18035e;
            if (length < i5 + i4) {
                this.d = Arrays.copyOf(bArr2, (i5 + i4) * 2);
            }
            System.arraycopy(bArr, i2, this.d, this.f18035e, i4);
            this.f18035e += i4;
        }
    }

    public final boolean b(int i2) {
        if (!this.f18033b) {
            return false;
        }
        this.f18035e -= i2;
        this.f18033b = false;
        this.f18034c = true;
        return true;
    }

    public final void c() {
        this.f18033b = false;
        this.f18034c = false;
    }

    public final void d(int i2) {
        Assertions.d(!this.f18033b);
        boolean z2 = i2 == this.f18032a;
        this.f18033b = z2;
        if (z2) {
            this.f18035e = 3;
            this.f18034c = false;
        }
    }
}
