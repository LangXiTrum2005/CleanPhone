package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bs1 extends OutputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f12875f = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12878c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12880e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12876a = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12877b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f12879d = new byte[128];

    public final synchronized cs1 d() {
        try {
            int i10 = this.f12880e;
            byte[] bArr = this.f12879d;
            if (i10 >= bArr.length) {
                this.f12877b.add(new as1(this.f12879d));
                this.f12879d = f12875f;
            } else if (i10 > 0) {
                this.f12877b.add(new as1(Arrays.copyOf(bArr, i10)));
            }
            this.f12878c += this.f12880e;
            this.f12880e = 0;
        } catch (Throwable th2) {
            throw th2;
        }
        return cs1.F(this.f12877b);
    }

    public final void h(int i10) {
        this.f12877b.add(new as1(this.f12879d));
        int length = this.f12878c + this.f12879d.length;
        this.f12878c = length;
        this.f12879d = new byte[Math.max(this.f12876a, Math.max(i10, length >>> 1))];
        this.f12880e = 0;
    }

    public final String toString() {
        int i10;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i10 = this.f12878c + this.f12880e;
        }
        return "<ByteString.Output@" + hexString + " size=" + i10 + ">";
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        try {
            if (this.f12880e == this.f12879d.length) {
                h(1);
            }
            byte[] bArr = this.f12879d;
            int i11 = this.f12880e;
            this.f12880e = i11 + 1;
            bArr[i11] = (byte) i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f12879d;
        int length = bArr2.length;
        int i12 = this.f12880e;
        int i13 = length - i12;
        if (i11 <= i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f12880e += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i13);
        int i14 = i11 - i13;
        h(i14);
        System.arraycopy(bArr, i10 + i13, this.f12879d, 0, i14);
        this.f12880e = i14;
    }
}
