package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f21460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21461e;

    public w9(int i10, int i11) {
        switch (i11) {
            case 1:
                this.f21457a = i10;
                byte[] bArr = new byte[131];
                this.f21460d = bArr;
                bArr[2] = 1;
                break;
            default:
                this.f21457a = i10;
                byte[] bArr2 = new byte[131];
                this.f21460d = bArr2;
                bArr2[2] = 1;
                break;
        }
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f21458b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f21460d;
            int length = bArr2.length;
            int i13 = this.f21461e;
            if (length < i13 + i12) {
                this.f21460d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f21460d, this.f21461e, i12);
            this.f21461e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f21458b) {
            return false;
        }
        this.f21461e -= i10;
        this.f21458b = false;
        this.f21459c = true;
        return true;
    }

    public void c() {
        this.f21458b = false;
        this.f21459c = false;
    }

    public void d(int i10) {
        go.k.t(!this.f21458b);
        boolean z10 = i10 == this.f21457a;
        this.f21458b = z10;
        if (z10) {
            this.f21461e = 3;
            this.f21459c = false;
        }
    }

    public void e() {
        this.f21458b = false;
        this.f21459c = false;
    }

    public void f(int i10) {
        ps1.c0(!this.f21458b);
        boolean z10 = i10 == this.f21457a;
        this.f21458b = z10;
        if (z10) {
            this.f21461e = 3;
            this.f21459c = false;
        }
    }

    public void g(byte[] bArr, int i10, int i11) {
        if (this.f21458b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f21460d;
            int length = bArr2.length;
            int i13 = this.f21461e + i12;
            if (length < i13) {
                this.f21460d = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f21460d, this.f21461e, i12);
            this.f21461e += i12;
        }
    }

    public boolean h(int i10) {
        if (!this.f21458b) {
            return false;
        }
        this.f21461e -= i10;
        this.f21458b = false;
        this.f21459c = true;
        return true;
    }
}
