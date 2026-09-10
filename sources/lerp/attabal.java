package lerp;

import java.util.Arrays;

/* JADX INFO: compiled from: ArcCurveFit.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal extends saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final double[] f32757attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f32758dern = true;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public C0718attabal[] f32759saneness;

    /* JADX INFO: renamed from: lerp.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ArcCurveFit.java */
    public static class C0718attabal {

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public static double[] f32760molybdenite = new double[91];

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public double f32761apical;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public double f32762arytenoidectomy;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public double[] f32763attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public double f32764beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public double f32765competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public double f32766cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public double f32767dern;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public double f32768formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public double f32769impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public double f32770impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public double f32771kowloon;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public double f32772marial;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public boolean f32773monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public boolean f32774polloi;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public double f32775saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public double f32776taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public double f32777triweekly;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public double f32778wireman;

        public C0718attabal(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            this.f32774polloi = false;
            double d7 = d5 - d3;
            double d8 = d6 - d4;
            if (i == 1) {
                this.f32773monoploid = true;
            } else if (i == 4) {
                this.f32773monoploid = d8 > 0.0d;
            } else if (i != 5) {
                this.f32773monoploid = false;
            } else {
                this.f32773monoploid = d8 < 0.0d;
            }
            this.f32767dern = d;
            this.f32778wireman = d2;
            this.f32776taiyuan = 1.0d / (d2 - d);
            if (3 == i) {
                this.f32774polloi = true;
            }
            if (!this.f32774polloi && Math.abs(d7) >= 0.001d && Math.abs(d8) >= 0.001d) {
                this.f32763attabal = new double[101];
                boolean z = this.f32773monoploid;
                this.f32766cutely = d7 * ((double) (z ? -1 : 1));
                this.f32761apical = d8 * ((double) (z ? 1 : -1));
                this.f32768formularize = z ? d5 : d3;
                this.f32769impassible = z ? d4 : d6;
                attabal(d3, d4, d5, d6);
                this.f32777triweekly = this.f32775saneness * this.f32776taiyuan;
                return;
            }
            this.f32774polloi = true;
            this.f32772marial = d3;
            this.f32764beachfront = d5;
            this.f32765competently = d4;
            this.f32770impromptu = d6;
            double dHypot = Math.hypot(d8, d7);
            this.f32775saneness = dHypot;
            this.f32777triweekly = dHypot * this.f32776taiyuan;
            double d9 = this.f32778wireman;
            double d10 = this.f32767dern;
            this.f32768formularize = d7 / (d9 - d10);
            this.f32769impassible = d8 / (d9 - d10);
        }

        public void apical(double d) {
            double dCutely = cutely((this.f32773monoploid ? this.f32778wireman - d : d - this.f32767dern) * this.f32776taiyuan) * 1.5707963267948966d;
            this.f32771kowloon = Math.sin(dCutely);
            this.f32762arytenoidectomy = Math.cos(dCutely);
        }

        public final void attabal(double d, double d2, double d3, double d4) {
            double d5 = d3 - d;
            double d6 = d2 - d4;
            int i = 0;
            double dHypot = 0.0d;
            double d7 = 0.0d;
            double d8 = 0.0d;
            while (true) {
                double[] dArr = f32760molybdenite;
                if (i >= dArr.length) {
                    break;
                }
                int i2 = i;
                double radians = Math.toRadians((((double) i) * 90.0d) / ((double) (dArr.length - 1)));
                double dSin = Math.sin(radians) * d5;
                double dCos = Math.cos(radians) * d6;
                if (i2 > 0) {
                    dHypot += Math.hypot(dSin - d7, dCos - d8);
                    f32760molybdenite[i2] = dHypot;
                }
                i = i2 + 1;
                d7 = dSin;
                d8 = dCos;
            }
            this.f32775saneness = dHypot;
            int i3 = 0;
            while (true) {
                double[] dArr2 = f32760molybdenite;
                if (i3 >= dArr2.length) {
                    break;
                }
                dArr2[i3] = dArr2[i3] / dHypot;
                i3++;
            }
            int i4 = 0;
            while (true) {
                double[] dArr3 = this.f32763attabal;
                if (i4 >= dArr3.length) {
                    return;
                }
                double length = ((double) i4) / ((double) (dArr3.length - 1));
                int iBinarySearch = Arrays.binarySearch(f32760molybdenite, length);
                if (iBinarySearch >= 0) {
                    this.f32763attabal[i4] = ((double) iBinarySearch) / ((double) (f32760molybdenite.length - 1));
                } else if (iBinarySearch == -1) {
                    this.f32763attabal[i4] = 0.0d;
                } else {
                    int i5 = -iBinarySearch;
                    int i6 = i5 - 2;
                    double[] dArr4 = f32760molybdenite;
                    double d9 = dArr4[i6];
                    this.f32763attabal[i4] = (((double) i6) + ((length - d9) / (dArr4[i5 - 1] - d9))) / ((double) (dArr4.length - 1));
                }
                i4++;
            }
        }

        public double beachfront(double d) {
            double d2 = (d - this.f32767dern) * this.f32776taiyuan;
            double d3 = this.f32772marial;
            return d3 + (d2 * (this.f32764beachfront - d3));
        }

        public double competently(double d) {
            double d2 = (d - this.f32767dern) * this.f32776taiyuan;
            double d3 = this.f32765competently;
            return d3 + (d2 * (this.f32770impromptu - d3));
        }

        public double cutely(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f32763attabal;
            double length = d * ((double) (dArr.length - 1));
            int i = (int) length;
            double d2 = length - ((double) i);
            double d3 = dArr[i];
            return d3 + (d2 * (dArr[i + 1] - d3));
        }

        public double dern() {
            double d = this.f32766cutely * this.f32762arytenoidectomy;
            double d2 = (-this.f32761apical) * this.f32771kowloon;
            double dHypot = this.f32777triweekly / Math.hypot(d, d2);
            return this.f32773monoploid ? (-d2) * dHypot : d2 * dHypot;
        }

        public double impromptu() {
            return this.f32768formularize + (this.f32766cutely * this.f32771kowloon);
        }

        public double marial(double d) {
            return this.f32769impassible;
        }

        public double saneness() {
            double d = this.f32766cutely * this.f32762arytenoidectomy;
            double dHypot = this.f32777triweekly / Math.hypot(d, (-this.f32761apical) * this.f32771kowloon);
            return this.f32773monoploid ? (-d) * dHypot : d * dHypot;
        }

        public double taiyuan() {
            return this.f32769impassible + (this.f32761apical * this.f32762arytenoidectomy);
        }

        public double wireman(double d) {
            return this.f32768formularize;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    public attabal(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f32757attabal = dArr;
        this.f32759saneness = new C0718attabal[dArr.length - 1];
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            C0718attabal[] c0718attabalArr = this.f32759saneness;
            if (i3 >= c0718attabalArr.length) {
                return;
            }
            int i4 = iArr[i3];
            int i5 = 3;
            if (i4 != 0) {
                if (i4 == 1) {
                    i = 1;
                    i5 = i;
                } else {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            i5 = 4;
                            if (i4 != 4) {
                                i5 = 5;
                                if (i4 != 5) {
                                    i5 = i2;
                                }
                            }
                        } else {
                            if (i != 1) {
                                i = 1;
                            }
                            i5 = i;
                        }
                    }
                    i = 2;
                    i5 = i;
                }
            }
            double d = dArr[i3];
            int i6 = i3 + 1;
            double d2 = dArr[i6];
            double[] dArr3 = dArr2[i3];
            double d3 = dArr3[0];
            double d4 = dArr3[1];
            double[] dArr4 = dArr2[i6];
            c0718attabalArr[i3] = new C0718attabal(i5, d, d2, d3, d4, dArr4[0], dArr4[1]);
            i3 = i6;
            i2 = i5;
        }
    }

    @Override // lerp.saneness
    public double beachfront(double d, int i) {
        C0718attabal[] c0718attabalArr = this.f32759saneness;
        int i2 = 0;
        double d2 = c0718attabalArr[0].f32767dern;
        if (d < d2) {
            d = d2;
        }
        if (d > c0718attabalArr[c0718attabalArr.length - 1].f32778wireman) {
            d = c0718attabalArr[c0718attabalArr.length - 1].f32778wireman;
        }
        while (true) {
            C0718attabal[] c0718attabalArr2 = this.f32759saneness;
            if (i2 >= c0718attabalArr2.length) {
                return Double.NaN;
            }
            C0718attabal c0718attabal = c0718attabalArr2[i2];
            if (d <= c0718attabal.f32778wireman) {
                if (c0718attabal.f32774polloi) {
                    return i == 0 ? c0718attabal.wireman(d) : c0718attabal.marial(d);
                }
                c0718attabal.apical(d);
                return i == 0 ? this.f32759saneness[i2].saneness() : this.f32759saneness[i2].dern();
            }
            i2++;
        }
    }

    @Override // lerp.saneness
    public void competently(double d, double[] dArr) {
        C0718attabal[] c0718attabalArr = this.f32759saneness;
        double d2 = c0718attabalArr[0].f32767dern;
        if (d < d2) {
            d = d2;
        } else if (d > c0718attabalArr[c0718attabalArr.length - 1].f32778wireman) {
            d = c0718attabalArr[c0718attabalArr.length - 1].f32778wireman;
        }
        int i = 0;
        while (true) {
            C0718attabal[] c0718attabalArr2 = this.f32759saneness;
            if (i >= c0718attabalArr2.length) {
                return;
            }
            C0718attabal c0718attabal = c0718attabalArr2[i];
            if (d <= c0718attabal.f32778wireman) {
                if (c0718attabal.f32774polloi) {
                    dArr[0] = c0718attabal.wireman(d);
                    dArr[1] = this.f32759saneness[i].marial(d);
                    return;
                } else {
                    c0718attabal.apical(d);
                    dArr[0] = this.f32759saneness[i].saneness();
                    dArr[1] = this.f32759saneness[i].dern();
                    return;
                }
            }
            i++;
        }
    }

    @Override // lerp.saneness
    public double dern(double d, int i) {
        double dCompetently;
        double dMarial;
        double dTaiyuan;
        double dDern;
        double dCompetently2;
        double dMarial2;
        int i2 = 0;
        if (this.f32758dern) {
            C0718attabal[] c0718attabalArr = this.f32759saneness;
            C0718attabal c0718attabal = c0718attabalArr[0];
            double d2 = c0718attabal.f32767dern;
            if (d < d2) {
                double d3 = d - d2;
                if (c0718attabal.f32774polloi) {
                    if (i == 0) {
                        dCompetently2 = c0718attabal.beachfront(d2);
                        dMarial2 = this.f32759saneness[0].wireman(d2);
                    } else {
                        dCompetently2 = c0718attabal.competently(d2);
                        dMarial2 = this.f32759saneness[0].marial(d2);
                    }
                    return dCompetently2 + (d3 * dMarial2);
                }
                c0718attabal.apical(d2);
                if (i == 0) {
                    dTaiyuan = this.f32759saneness[0].impromptu();
                    dDern = this.f32759saneness[0].saneness();
                } else {
                    dTaiyuan = this.f32759saneness[0].taiyuan();
                    dDern = this.f32759saneness[0].dern();
                }
                return dTaiyuan + (d3 * dDern);
            }
            if (d > c0718attabalArr[c0718attabalArr.length - 1].f32778wireman) {
                double d4 = c0718attabalArr[c0718attabalArr.length - 1].f32778wireman;
                double d5 = d - d4;
                int length = c0718attabalArr.length - 1;
                if (i == 0) {
                    dCompetently = c0718attabalArr[length].beachfront(d4);
                    dMarial = this.f32759saneness[length].wireman(d4);
                } else {
                    dCompetently = c0718attabalArr[length].competently(d4);
                    dMarial = this.f32759saneness[length].marial(d4);
                }
                return dCompetently + (d5 * dMarial);
            }
        } else {
            C0718attabal[] c0718attabalArr2 = this.f32759saneness;
            double d6 = c0718attabalArr2[0].f32767dern;
            if (d < d6) {
                d = d6;
            } else if (d > c0718attabalArr2[c0718attabalArr2.length - 1].f32778wireman) {
                d = c0718attabalArr2[c0718attabalArr2.length - 1].f32778wireman;
            }
        }
        while (true) {
            C0718attabal[] c0718attabalArr3 = this.f32759saneness;
            if (i2 >= c0718attabalArr3.length) {
                return Double.NaN;
            }
            C0718attabal c0718attabal2 = c0718attabalArr3[i2];
            if (d <= c0718attabal2.f32778wireman) {
                if (c0718attabal2.f32774polloi) {
                    return i == 0 ? c0718attabal2.beachfront(d) : c0718attabal2.competently(d);
                }
                c0718attabal2.apical(d);
                return i == 0 ? this.f32759saneness[i2].impromptu() : this.f32759saneness[i2].taiyuan();
            }
            i2++;
        }
    }

    @Override // lerp.saneness
    public double[] impromptu() {
        return this.f32757attabal;
    }

    @Override // lerp.saneness
    public void marial(double d, float[] fArr) {
        if (this.f32758dern) {
            C0718attabal[] c0718attabalArr = this.f32759saneness;
            C0718attabal c0718attabal = c0718attabalArr[0];
            double d2 = c0718attabal.f32767dern;
            if (d < d2) {
                double d3 = d - d2;
                if (c0718attabal.f32774polloi) {
                    fArr[0] = (float) (c0718attabal.beachfront(d2) + (this.f32759saneness[0].wireman(d2) * d3));
                    fArr[1] = (float) (this.f32759saneness[0].competently(d2) + (d3 * this.f32759saneness[0].marial(d2)));
                    return;
                } else {
                    c0718attabal.apical(d2);
                    fArr[0] = (float) (this.f32759saneness[0].impromptu() + (this.f32759saneness[0].saneness() * d3));
                    fArr[1] = (float) (this.f32759saneness[0].taiyuan() + (d3 * this.f32759saneness[0].dern()));
                    return;
                }
            }
            if (d > c0718attabalArr[c0718attabalArr.length - 1].f32778wireman) {
                double d4 = c0718attabalArr[c0718attabalArr.length - 1].f32778wireman;
                double d5 = d - d4;
                int length = c0718attabalArr.length - 1;
                C0718attabal c0718attabal2 = c0718attabalArr[length];
                if (c0718attabal2.f32774polloi) {
                    fArr[0] = (float) (c0718attabal2.beachfront(d4) + (this.f32759saneness[length].wireman(d4) * d5));
                    fArr[1] = (float) (this.f32759saneness[length].competently(d4) + (d5 * this.f32759saneness[length].marial(d4)));
                    return;
                } else {
                    c0718attabal2.apical(d);
                    fArr[0] = (float) this.f32759saneness[length].impromptu();
                    fArr[1] = (float) this.f32759saneness[length].taiyuan();
                    return;
                }
            }
        } else {
            C0718attabal[] c0718attabalArr2 = this.f32759saneness;
            double d6 = c0718attabalArr2[0].f32767dern;
            if (d < d6) {
                d = d6;
            } else if (d > c0718attabalArr2[c0718attabalArr2.length - 1].f32778wireman) {
                d = c0718attabalArr2[c0718attabalArr2.length - 1].f32778wireman;
            }
        }
        int i = 0;
        while (true) {
            C0718attabal[] c0718attabalArr3 = this.f32759saneness;
            if (i >= c0718attabalArr3.length) {
                return;
            }
            C0718attabal c0718attabal3 = c0718attabalArr3[i];
            if (d <= c0718attabal3.f32778wireman) {
                if (c0718attabal3.f32774polloi) {
                    fArr[0] = (float) c0718attabal3.beachfront(d);
                    fArr[1] = (float) this.f32759saneness[i].competently(d);
                    return;
                } else {
                    c0718attabal3.apical(d);
                    fArr[0] = (float) this.f32759saneness[i].impromptu();
                    fArr[1] = (float) this.f32759saneness[i].taiyuan();
                    return;
                }
            }
            i++;
        }
    }

    @Override // lerp.saneness
    public void wireman(double d, double[] dArr) {
        if (this.f32758dern) {
            C0718attabal[] c0718attabalArr = this.f32759saneness;
            C0718attabal c0718attabal = c0718attabalArr[0];
            double d2 = c0718attabal.f32767dern;
            if (d < d2) {
                double d3 = d - d2;
                if (c0718attabal.f32774polloi) {
                    dArr[0] = c0718attabal.beachfront(d2) + (this.f32759saneness[0].wireman(d2) * d3);
                    dArr[1] = this.f32759saneness[0].competently(d2) + (d3 * this.f32759saneness[0].marial(d2));
                    return;
                } else {
                    c0718attabal.apical(d2);
                    dArr[0] = this.f32759saneness[0].impromptu() + (this.f32759saneness[0].saneness() * d3);
                    dArr[1] = this.f32759saneness[0].taiyuan() + (d3 * this.f32759saneness[0].dern());
                    return;
                }
            }
            if (d > c0718attabalArr[c0718attabalArr.length - 1].f32778wireman) {
                double d4 = c0718attabalArr[c0718attabalArr.length - 1].f32778wireman;
                double d5 = d - d4;
                int length = c0718attabalArr.length - 1;
                C0718attabal c0718attabal2 = c0718attabalArr[length];
                if (c0718attabal2.f32774polloi) {
                    dArr[0] = c0718attabal2.beachfront(d4) + (this.f32759saneness[length].wireman(d4) * d5);
                    dArr[1] = this.f32759saneness[length].competently(d4) + (d5 * this.f32759saneness[length].marial(d4));
                    return;
                } else {
                    c0718attabal2.apical(d);
                    dArr[0] = this.f32759saneness[length].impromptu() + (this.f32759saneness[length].saneness() * d5);
                    dArr[1] = this.f32759saneness[length].taiyuan() + (d5 * this.f32759saneness[length].dern());
                    return;
                }
            }
        } else {
            C0718attabal[] c0718attabalArr2 = this.f32759saneness;
            double d6 = c0718attabalArr2[0].f32767dern;
            if (d < d6) {
                d = d6;
            }
            if (d > c0718attabalArr2[c0718attabalArr2.length - 1].f32778wireman) {
                d = c0718attabalArr2[c0718attabalArr2.length - 1].f32778wireman;
            }
        }
        int i = 0;
        while (true) {
            C0718attabal[] c0718attabalArr3 = this.f32759saneness;
            if (i >= c0718attabalArr3.length) {
                return;
            }
            C0718attabal c0718attabal3 = c0718attabalArr3[i];
            if (d <= c0718attabal3.f32778wireman) {
                if (c0718attabal3.f32774polloi) {
                    dArr[0] = c0718attabal3.beachfront(d);
                    dArr[1] = this.f32759saneness[i].competently(d);
                    return;
                } else {
                    c0718attabal3.apical(d);
                    dArr[0] = this.f32759saneness[i].impromptu();
                    dArr[1] = this.f32759saneness[i].taiyuan();
                    return;
                }
            }
            i++;
        }
    }
}
