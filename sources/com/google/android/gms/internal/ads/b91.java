package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f12700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f12701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f12702k;
    public final byte l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte f12703m;

    /* JADX WARN: Code duplicated, block: B:68:0x011d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    public b91(n81 n81Var) {
        byte bH;
        int i10 = n81Var.f17713a;
        ByteBuffer byteBuffer = n81Var.f17714b;
        boolean zG = false;
        ps1.v(i10 == 1);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        gp0 gp0Var = new gp0(bArr, iRemaining);
        this.f12698g = gp0Var.h(3);
        gp0Var.e();
        boolean zG2 = gp0Var.g();
        this.f12692a = zG2;
        if (zG2) {
            gp0Var.h(5);
            this.f12693b = false;
            this.f12699h = false;
        } else {
            if (gp0Var.g()) {
                gp0Var.f(64);
                if (gp0Var.g()) {
                    int i11 = 0;
                    while (!gp0Var.g()) {
                        i11++;
                    }
                    if (i11 < 32) {
                        gp0Var.f(i11);
                    }
                }
                boolean zG3 = gp0Var.g();
                this.f12693b = zG3;
                if (zG3) {
                    gp0Var.f(47);
                }
            } else {
                this.f12693b = false;
            }
            this.f12699h = gp0Var.g();
            int iH = gp0Var.h(5);
            for (int i12 = 0; i12 <= iH; i12++) {
                gp0Var.f(12);
                if (i12 == 0) {
                    if (gp0Var.h(5) > 7) {
                        gp0Var.g();
                    }
                } else if (gp0Var.h(5) > 7) {
                    gp0Var.e();
                }
                if (this.f12693b) {
                    gp0Var.e();
                }
                if (this.f12699h && gp0Var.g()) {
                    if (i12 == 0) {
                        gp0Var.h(4);
                    } else {
                        gp0Var.f(4);
                    }
                }
            }
        }
        int iH2 = gp0Var.h(4);
        int iH3 = gp0Var.h(4);
        gp0Var.f(iH2 + 1);
        gp0Var.f(iH3 + 1);
        if (this.f12692a) {
            this.f12694c = false;
        } else {
            boolean zG4 = gp0Var.g();
            this.f12694c = zG4;
            if (zG4) {
                gp0Var.f(4);
                gp0Var.f(3);
            }
        }
        gp0Var.f(3);
        if (this.f12692a) {
            this.f12696e = true;
            this.f12695d = true;
            this.f12697f = 0;
        } else {
            gp0Var.f(4);
            boolean zG5 = gp0Var.g();
            if (zG5) {
                gp0Var.f(2);
            }
            if (gp0Var.g()) {
                this.f12695d = true;
            } else {
                boolean zG6 = gp0Var.g();
                this.f12695d = zG6;
                if (!zG6) {
                    this.f12696e = true;
                }
                if (zG5) {
                    this.f12697f = gp0Var.h(3) + 1;
                } else {
                    this.f12697f = 0;
                }
            }
            if (gp0Var.g()) {
                this.f12696e = true;
            } else {
                this.f12696e = gp0Var.g();
            }
            if (zG5) {
                this.f12697f = gp0Var.h(3) + 1;
            } else {
                this.f12697f = 0;
            }
        }
        gp0Var.f(3);
        boolean zG7 = gp0Var.g();
        if (this.f12698g == 2 && zG7) {
            this.f12700i = gp0Var.g();
        } else {
            this.f12700i = false;
        }
        if (this.f12698g != 1) {
            this.f12701j = gp0Var.g();
        } else {
            this.f12701j = false;
        }
        if (gp0Var.g()) {
            this.l = (byte) gp0Var.h(8);
            this.f12703m = (byte) gp0Var.h(8);
            bH = (byte) gp0Var.h(8);
        } else {
            this.l = (byte) 0;
            this.f12703m = (byte) 0;
            bH = 0;
        }
        if (this.f12701j) {
            gp0Var.e();
            this.f12702k = false;
        } else if (this.l == 1 && this.f12703m == 13 && bH == 0) {
            this.f12702k = false;
        } else {
            gp0Var.e();
            int i13 = this.f12698g;
            if (i13 == 0) {
                this.f12702k = true;
                zG = true;
            } else if (i13 == 1) {
                this.f12702k = false;
            } else if (this.f12700i) {
                boolean zG8 = gp0Var.g();
                this.f12702k = zG8;
                if (zG8) {
                    zG = gp0Var.g();
                }
            } else {
                this.f12702k = true;
            }
            if (this.f12702k && zG) {
                gp0Var.h(2);
            }
        }
        gp0Var.e();
    }
}
