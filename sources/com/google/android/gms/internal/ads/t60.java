package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f20201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f20202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f20203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20209k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f20210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f20213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f20214q;

    public t60(int i10, int i11, float f10, float f11, int i12, boolean z10, int i13) {
        switch (i13) {
            case 1:
                this.f20199a = i10;
                this.f20200b = i11;
                this.f20201c = f10;
                this.f20202d = f11;
                this.f20203e = i10 / i12;
                this.f20204f = i10 / 400;
                int i14 = i10 / 65;
                this.f20205g = i14;
                this.f20206h = i14 * 2;
                this.f20214q = z10 ? new t50(this, false) : new j60(this, false);
                break;
            default:
                this.f20199a = i10;
                this.f20200b = i11;
                this.f20201c = f10;
                this.f20202d = f11;
                this.f20203e = i10 / i12;
                this.f20204f = i10 / 400;
                int i15 = i10 / 65;
                this.f20205g = i15;
                this.f20206h = i15 + i15;
                this.f20214q = z10 ? new t50(this) : new j60(this);
                break;
        }
    }

    public void a(int i10, int i11) {
        j1.m mVar = (j1.m) this.f20214q;
        mVar.h(i11);
        Object objS = mVar.s();
        int i12 = this.f20200b;
        System.arraycopy(objS, i10 * i12, mVar.t(), this.f20208j * i12, i12 * i11);
        this.f20208j += i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b() {
        int i10;
        int iN;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10;
        long j11;
        j1.m mVar = (j1.m) this.f20214q;
        int i15 = this.f20208j;
        float f10 = this.f20201c;
        float f11 = this.f20202d;
        double d10 = f10 / f11;
        float f12 = this.f20203e * f11;
        int i16 = this.f20199a;
        int i17 = 1;
        int i18 = this.f20200b;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            int i19 = this.f20207i;
            int i20 = this.f20206h;
            if (i19 >= i20) {
                int i21 = 0;
                while (true) {
                    int i22 = this.f20211n;
                    if (i22 > 0) {
                        int iMin = Math.min(i20, i22);
                        a(i21, iMin);
                        this.f20211n -= iMin;
                        i21 += iMin;
                        i10 = i20;
                        i17 = i17;
                        i18 = i18;
                    } else {
                        int i23 = i16 > 4000 ? i16 / 4000 : i17;
                        int i24 = this.f20205g;
                        int i25 = this.f20204f;
                        if (i18 == i17 && i23 == i17) {
                            iN = mVar.g(i21, i25, i24);
                            i10 = i20;
                        } else {
                            mVar.f(i21, i23);
                            i10 = i20;
                            int iN2 = mVar.n(i25 / i23, i24 / i23);
                            if (i23 != i17) {
                                int i26 = iN2 * i23;
                                int i27 = i23 * 4;
                                int i28 = i26 - i27;
                                int i29 = i26 + i27;
                                if (i28 >= i25) {
                                    i25 = i28;
                                }
                                if (i29 <= i24) {
                                    i24 = i29;
                                }
                                if (i18 == i17) {
                                    iN = mVar.g(i21, i25, i24);
                                } else {
                                    mVar.f(i21, i17);
                                    iN = mVar.n(i25, i24);
                                }
                            } else {
                                iN = iN2;
                            }
                        }
                        int i30 = mVar.i() ? this.f20212o : iN;
                        mVar.r();
                        this.f20212o = iN;
                        if (d10 > 1.0d) {
                            if (d10 >= 2.0d) {
                                double d11 = (((double) i30) / (d10 - 1.0d)) + this.f20213p;
                                int iRound = (int) Math.round(d11);
                                this.f20213p = d11 - ((double) iRound);
                                i12 = iRound;
                            } else {
                                double d12 = (((2.0d - d10) * ((double) i30)) / (d10 - 1.0d)) + this.f20213p;
                                int iRound2 = (int) Math.round(d12);
                                this.f20211n = iRound2;
                                this.f20213p = d12 - ((double) iRound2);
                                i12 = i30;
                            }
                            mVar.h(i12);
                            mVar.j(i12, this.f20200b, this.f20208j, i21, i21 + i30);
                            this.f20208j += i12;
                            i21 = i30 + i12 + i21;
                        } else {
                            i17 = i17;
                            i18 = i18;
                            if (d10 < 0.5d) {
                                double d13 = ((((double) i30) * d10) / (1.0d - d10)) + this.f20213p;
                                int iRound3 = (int) Math.round(d13);
                                this.f20213p = d13 - ((double) iRound3);
                                i11 = iRound3;
                            } else {
                                double d14 = ((((2.0d * d10) - 1.0d) * ((double) i30)) / (1.0d - d10)) + this.f20213p;
                                int iRound4 = (int) Math.round(d14);
                                this.f20211n = iRound4;
                                this.f20213p = d14 - ((double) iRound4);
                                i11 = i30;
                            }
                            int i31 = i30 + i11;
                            mVar.h(i31);
                            System.arraycopy(mVar.s(), i21 * i18, mVar.t(), this.f20208j * i18, i30 * i18);
                            int i32 = i21;
                            mVar = mVar;
                            mVar.j(i11, this.f20200b, this.f20208j + i30, i21 + i30, i32);
                            this.f20208j += i31;
                            i21 = i32 + i11;
                        }
                    }
                    if (i21 + i10 > i19) {
                        break;
                    }
                    i20 = i10;
                    i17 = i17;
                    i18 = i18;
                }
                int i33 = this.f20207i - i21;
                System.arraycopy(mVar.s(), i21 * i18, mVar.s(), 0, i33 * i18);
                this.f20207i = i33;
            }
            if (f12 != 1.0f || this.f20208j == i15) {
            }
            long j12 = (long) (i16 / f12);
            long j13 = i16;
            while (j12 != 0 && j13 != 0 && j12 % 2 == 0 && j13 % 2 == 0) {
                j12 /= 2;
                j13 /= 2;
            }
            int i34 = this.f20208j - i15;
            mVar.x(i34);
            System.arraycopy(mVar.t(), i15 * i18, mVar.w(), this.f20209k * i18, i34 * i18);
            this.f20208j = i15;
            this.f20209k += i34;
            int i35 = 0;
            while (true) {
                i13 = this.f20209k - 1;
                if (i35 >= i13) {
                    break;
                }
                while (true) {
                    i14 = this.l + 1;
                    j10 = i14;
                    long j14 = j10 * j12;
                    j11 = this.f20210m;
                    if (j14 <= j11 * j13) {
                        break;
                    }
                    int i36 = i17;
                    mVar.h(i36);
                    mVar.p(i35, j13, j12);
                    this.f20210m += i36;
                    this.f20208j += i36;
                }
                int i37 = i17;
                this.l = i14;
                if (j10 == j13) {
                    this.l = 0;
                    go.k.t(j11 == j12 ? i37 : 0);
                    this.f20210m = 0;
                }
                i35++;
                i17 = i37;
            }
            if (i13 == 0) {
                return;
            }
            System.arraycopy(mVar.w(), i13 * i18, mVar.w(), 0, (this.f20209k - i13) * i18);
            this.f20209k -= i13;
            return;
        }
        a(0, this.f20207i);
        this.f20207i = 0;
        i17 = 1;
        i18 = i18;
        if (f12 != 1.0f) {
        }
    }

    public void c(int i10, int i11) {
        x50 x50Var = (x50) this.f20214q;
        x50Var.b(i11);
        Object objZzr = x50Var.zzr();
        Object objZzq = x50Var.zzq();
        int i12 = this.f20208j;
        int i13 = this.f20200b;
        System.arraycopy(objZzr, i10 * i13, objZzq, i12 * i13, i11 * i13);
        this.f20208j += i11;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:52:0x0109  */
    /* JADX WARN: Code duplicated, block: B:53:0x011e  */
    public void d() {
        int i10;
        int i11;
        int iM;
        int i12;
        int i13;
        double d10;
        int i14;
        double d11;
        int i15;
        int iRound;
        double d12;
        int iRound2;
        int i16;
        int i17;
        long j10;
        long j11;
        int i18;
        long j12;
        x50 x50Var = (x50) this.f20214q;
        float f10 = this.f20201c;
        float f11 = this.f20202d;
        double d13 = f10 / f11;
        int i19 = this.f20208j;
        int i20 = this.f20199a;
        int i21 = this.f20200b;
        int i22 = 1;
        if (d13 > 1.0000100135803223d || d13 < 0.9999899864196777d) {
            int i23 = this.f20207i;
            int i24 = this.f20206h;
            if (i23 >= i24) {
                int i25 = 0;
                while (true) {
                    int i26 = this.f20211n;
                    if (i26 > 0) {
                        int iMin = Math.min(i24, i26);
                        c(i25, iMin);
                        this.f20211n -= iMin;
                        i25 += iMin;
                        i11 = i24;
                    } else {
                        int i27 = i20 > 4000 ? i20 / 4000 : i22;
                        int i28 = this.f20205g;
                        int i29 = this.f20204f;
                        if (i21 == i22) {
                            if (i27 == i22) {
                                iM = x50Var.o(i25, i29, i28);
                                i11 = i24;
                                i10 = i22;
                            } else {
                                i10 = i22;
                            }
                            if (x50Var.zzc()) {
                                i12 = this.f20212o;
                            } else {
                                i12 = iM;
                            }
                            i13 = i25 + i12;
                            x50Var.zzi();
                            this.f20212o = iM;
                            d10 = i12;
                            if (d13 > 1.0d) {
                                d12 = d13 - 1.0d;
                                if (d13 >= 2.0d) {
                                    double d14 = (d10 / d12) + this.f20213p;
                                    iRound2 = (int) Math.round(d14);
                                    this.f20213p = d14 - ((double) iRound2);
                                } else {
                                    double d15 = (((2.0d - d13) * d10) / d12) + this.f20213p;
                                    int iRound3 = (int) Math.round(d15);
                                    this.f20211n = iRound3;
                                    this.f20213p = d15 - ((double) iRound3);
                                    iRound2 = i12;
                                }
                                x50Var.b(iRound2);
                                x50Var.v(iRound2, i10, this.f20208j, i25, i13);
                                this.f20208j += iRound2;
                                i25 = i12 + iRound2 + i25;
                            } else {
                                i14 = i10;
                                d11 = 1.0d - d13;
                                if (d13 < 0.5d) {
                                    double d16 = ((d10 * d13) / d11) + this.f20213p;
                                    iRound = (int) Math.round(d16);
                                    i15 = i14;
                                    this.f20213p = d16 - ((double) iRound);
                                } else {
                                    i15 = i14;
                                    double d17 = ((((d13 + d13) - 1.0d) * d10) / d11) + this.f20213p;
                                    int iRound4 = (int) Math.round(d17);
                                    this.f20211n = iRound4;
                                    this.f20213p = d17 - ((double) iRound4);
                                    iRound = i12;
                                }
                                int i30 = i12 + iRound;
                                x50Var.b(i30);
                                x50 x50Var2 = x50Var;
                                int i31 = iRound;
                                int i32 = i25;
                                System.arraycopy(x50Var2.zzr(), i25 * i15, x50Var2.zzq(), this.f20208j * i15, i12 * i15);
                                x50Var = x50Var2;
                                x50Var.v(i31, i15, this.f20208j + i12, i13, i32);
                                this.f20208j += i30;
                                i25 = i32 + i31;
                            }
                        } else {
                            i10 = i21;
                        }
                        x50Var.k(i25, i27);
                        i11 = i24;
                        int iM2 = x50Var.m(i29 / i27, i28 / i27);
                        if (i27 != 1) {
                            int i33 = iM2 * i27;
                            int i34 = i27 * 4;
                            int i35 = i33 - i34;
                            if (i35 >= i29) {
                                i29 = i35;
                            }
                            int i36 = i33 + i34;
                            if (i36 <= i28) {
                                i28 = i36;
                            }
                            if (i10 == 1) {
                                iM = x50Var.o(i25, i29, i28);
                            } else {
                                x50Var.k(i25, 1);
                                iM = x50Var.m(i29, i28);
                            }
                        } else {
                            iM = iM2;
                        }
                        if (x50Var.zzc()) {
                            i12 = this.f20212o;
                        } else {
                            i12 = iM;
                        }
                        i13 = i25 + i12;
                        x50Var.zzi();
                        this.f20212o = iM;
                        d10 = i12;
                        if (d13 > 1.0d) {
                            d12 = d13 - 1.0d;
                            if (d13 >= 2.0d) {
                                double d18 = (d10 / d12) + this.f20213p;
                                iRound2 = (int) Math.round(d18);
                                this.f20213p = d18 - ((double) iRound2);
                            } else {
                                double d19 = (((2.0d - d13) * d10) / d12) + this.f20213p;
                                int iRound5 = (int) Math.round(d19);
                                this.f20211n = iRound5;
                                this.f20213p = d19 - ((double) iRound5);
                                iRound2 = i12;
                            }
                            x50Var.b(iRound2);
                            x50Var.v(iRound2, i10, this.f20208j, i25, i13);
                            this.f20208j += iRound2;
                            i25 = i12 + iRound2 + i25;
                        } else {
                            i14 = i10;
                            d11 = 1.0d - d13;
                            if (d13 < 0.5d) {
                                double d110 = ((d10 * d13) / d11) + this.f20213p;
                                iRound = (int) Math.round(d110);
                                i15 = i14;
                                this.f20213p = d110 - ((double) iRound);
                            } else {
                                i15 = i14;
                                double d111 = ((((d13 + d13) - 1.0d) * d10) / d11) + this.f20213p;
                                int iRound6 = (int) Math.round(d111);
                                this.f20211n = iRound6;
                                this.f20213p = d111 - ((double) iRound6);
                                iRound = i12;
                            }
                            int i37 = i12 + iRound;
                            x50Var.b(i37);
                            x50 x50Var3 = x50Var;
                            int i38 = iRound;
                            int i39 = i25;
                            System.arraycopy(x50Var3.zzr(), i25 * i15, x50Var3.zzq(), this.f20208j * i15, i12 * i15);
                            x50Var = x50Var3;
                            x50Var.v(i38, i15, this.f20208j + i12, i13, i39);
                            this.f20208j += i37;
                            i25 = i39 + i38;
                        }
                    }
                    if (i25 + i11 > i23) {
                        break;
                    }
                    i24 = i11;
                    i22 = 1;
                }
                int i40 = this.f20207i - i25;
                System.arraycopy(x50Var.zzr(), i25 * i21, x50Var.zzr(), 0, i40 * i21);
                this.f20207i = i40;
            }
        } else {
            c(0, this.f20207i);
            this.f20207i = 0;
        }
        float f12 = this.f20203e * f11;
        if (f12 == 1.0f || this.f20208j == i19) {
            return;
        }
        long j13 = i20;
        long j14 = (long) (i20 / f12);
        while (j14 != 0 && j13 != 0 && j14 % 2 == 0 && j13 % 2 == 0) {
            j14 /= 2;
            j13 /= 2;
        }
        int i41 = this.f20208j - i19;
        x50Var.u(i41);
        System.arraycopy(x50Var.zzq(), i19 * i21, x50Var.zzp(), this.f20209k * i21, i41 * i21);
        this.f20208j = i19;
        this.f20209k += i41;
        int i42 = 0;
        while (true) {
            i16 = this.f20209k - 1;
            if (i42 >= i16) {
                break;
            }
            while (true) {
                i17 = this.l + 1;
                j10 = i17;
                long j15 = j10 * j14;
                j11 = j13;
                i18 = i42;
                j12 = this.f20210m;
                if (j15 <= j12 * j11) {
                    break;
                }
                x50Var.b(1);
                i42 = i18;
                x50Var.q(i42, j11, j14);
                this.f20210m++;
                this.f20208j++;
                j13 = j11;
            }
            this.l = i17;
            if (j10 == j11) {
                this.l = 0;
                ps1.c0(j12 == j14);
                this.f20210m = 0;
            }
            i42 = i18 + 1;
            j13 = j11;
        }
        if (i16 != 0) {
            System.arraycopy(x50Var.zzp(), i16 * i21, x50Var.zzp(), 0, (this.f20209k - i16) * i21);
            this.f20209k -= i16;
        }
    }
}
