package stupefactive;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: Sonic.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f38220adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f38221apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f38222arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f38223attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f38224beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f38225competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public short[] f38226cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final float f38227dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f38228dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public short[] f38229formularize;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public int f38230graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f38231impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final int f38232impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f38233kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final float f38234marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f38235molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f38236monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f38237polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f38238saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final short[] f38239taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public short[] f38240triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final float f38241wireman;

    public saneness(int i, int i2, float f, float f2, int i3) {
        this.f38223attabal = i;
        this.f38238saneness = i2;
        this.f38227dern = f;
        this.f38241wireman = f2;
        this.f38234marial = i / i3;
        this.f38224beachfront = i / 400;
        int i4 = i / 65;
        this.f38225competently = i4;
        int i5 = i4 * 2;
        this.f38232impromptu = i5;
        this.f38239taiyuan = new short[i5];
        this.f38226cutely = new short[i5 * i2];
        this.f38229formularize = new short[i5 * i2];
        this.f38240triweekly = new short[i5 * i2];
    }

    public static void arytenoidectomy(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final void adultoid(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f38240triweekly;
        int i2 = this.f38238saneness;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.f38233kowloon - i) * i2);
        this.f38233kowloon -= i;
    }

    public int apical() {
        return this.f38231impassible * this.f38238saneness * 2;
    }

    public final void attabal(float f, int i) {
        int i2;
        int i3;
        if (this.f38231impassible == i) {
            return;
        }
        int i4 = this.f38223attabal;
        int i5 = (int) (i4 / f);
        while (true) {
            if (i5 <= 16384 && i4 <= 16384) {
                break;
            }
            i5 /= 2;
            i4 /= 2;
        }
        kowloon(i);
        int i6 = 0;
        while (true) {
            int i7 = this.f38233kowloon;
            if (i6 >= i7 - 1) {
                adultoid(i7 - 1);
                return;
            }
            while (true) {
                i2 = this.f38222arytenoidectomy;
                int i8 = (i2 + 1) * i5;
                i3 = this.f38236monoploid;
                if (i8 <= i3 * i4) {
                    break;
                }
                this.f38229formularize = beachfront(this.f38229formularize, this.f38231impassible, 1);
                int i9 = 0;
                while (true) {
                    int i10 = this.f38238saneness;
                    if (i9 < i10) {
                        this.f38229formularize[(this.f38231impassible * i10) + i9] = triweekly(this.f38240triweekly, (i10 * i6) + i9, i4, i5);
                        i9++;
                    }
                }
                this.f38236monoploid++;
                this.f38231impassible++;
            }
            int i11 = i2 + 1;
            this.f38222arytenoidectomy = i11;
            if (i11 == i4) {
                this.f38222arytenoidectomy = 0;
                decarock.attabal.competently(i3 == i5);
                this.f38236monoploid = 0;
            }
            i6++;
        }
    }

    public final short[] beachfront(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f38238saneness;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int competently(short[] sArr, int i) {
        int iImpromptu;
        int i2 = this.f38223attabal;
        int i3 = i2 > 4000 ? i2 / 4000 : 1;
        if (this.f38238saneness == 1 && i3 == 1) {
            iImpromptu = impromptu(sArr, i, this.f38224beachfront, this.f38225competently);
        } else {
            marial(sArr, i, i3);
            int iImpromptu2 = impromptu(this.f38239taiyuan, 0, this.f38224beachfront / i3, this.f38225competently / i3);
            if (i3 != 1) {
                int i4 = iImpromptu2 * i3;
                int i5 = i3 * 4;
                int i6 = i4 - i5;
                int i7 = i4 + i5;
                int i8 = this.f38224beachfront;
                if (i6 < i8) {
                    i6 = i8;
                }
                int i9 = this.f38225competently;
                if (i7 > i9) {
                    i7 = i9;
                }
                if (this.f38238saneness == 1) {
                    iImpromptu = impromptu(sArr, i, i6, i7);
                } else {
                    marial(sArr, i, 1);
                    iImpromptu = impromptu(this.f38239taiyuan, 0, i6, i7);
                }
            } else {
                iImpromptu = iImpromptu2;
            }
        }
        int i10 = monoploid(this.f38220adultoid, this.f38228dovishness) ? this.f38235molybdenite : iImpromptu;
        this.f38230graveside = this.f38220adultoid;
        this.f38235molybdenite = iImpromptu;
        return i10;
    }

    public void cutely(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f38238saneness, this.f38231impassible);
        shortBuffer.put(this.f38229formularize, 0, this.f38238saneness * iMin);
        int i = this.f38231impassible - iMin;
        this.f38231impassible = i;
        short[] sArr = this.f38229formularize;
        int i2 = this.f38238saneness;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    public final int dern(int i) {
        int iMin = Math.min(this.f38232impromptu, this.f38237polloi);
        wireman(this.f38226cutely, i, iMin);
        this.f38237polloi -= iMin;
        return iMin;
    }

    public final void dovishness(int i) {
        int i2 = this.f38221apical - i;
        short[] sArr = this.f38226cutely;
        int i3 = this.f38238saneness;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f38221apical = i2;
    }

    public int formularize() {
        return this.f38221apical * this.f38238saneness * 2;
    }

    public final int gintrap(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.f38237polloi = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] sArrBeachfront = beachfront(this.f38229formularize, this.f38231impassible, i3);
        this.f38229formularize = sArrBeachfront;
        arytenoidectomy(i3, this.f38238saneness, sArrBeachfront, this.f38231impassible, sArr, i, sArr, i + i2);
        this.f38231impassible += i3;
        return i3;
    }

    public void graveside(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.f38238saneness;
        int i2 = iRemaining / i;
        short[] sArrBeachfront = beachfront(this.f38226cutely, this.f38221apical, i2);
        this.f38226cutely = sArrBeachfront;
        shortBuffer.get(sArrBeachfront, this.f38221apical * this.f38238saneness, ((i * i2) * 2) / 2);
        this.f38221apical += i2;
        polloi();
    }

    public final int impassible(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.f38237polloi = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] sArrBeachfront = beachfront(this.f38229formularize, this.f38231impassible, i4);
        this.f38229formularize = sArrBeachfront;
        int i5 = this.f38238saneness;
        System.arraycopy(sArr, i * i5, sArrBeachfront, this.f38231impassible * i5, i5 * i2);
        arytenoidectomy(i3, this.f38238saneness, this.f38229formularize, this.f38231impassible + i2, sArr, i + i2, sArr, i);
        this.f38231impassible += i4;
        return i3;
    }

    public final int impromptu(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f38238saneness;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.f38220adultoid = i6 / i7;
        this.f38228dovishness = i8 / i5;
        return i7;
    }

    public final void kowloon(int i) {
        int i2 = this.f38231impassible - i;
        short[] sArrBeachfront = beachfront(this.f38240triweekly, this.f38233kowloon, i2);
        this.f38240triweekly = sArrBeachfront;
        short[] sArr = this.f38229formularize;
        int i3 = this.f38238saneness;
        System.arraycopy(sArr, i * i3, sArrBeachfront, this.f38233kowloon * i3, i3 * i2);
        this.f38231impassible = i;
        this.f38233kowloon += i2;
    }

    public final void marial(short[] sArr, int i, int i2) {
        int i3 = this.f38232impromptu / i2;
        int i4 = this.f38238saneness;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f38239taiyuan[i7] = (short) (i8 / i5);
        }
    }

    public void molybdenite() {
        int i;
        int i2 = this.f38221apical;
        float f = this.f38227dern;
        float f2 = this.f38241wireman;
        int i3 = this.f38231impassible + ((int) ((((i2 / (f / f2)) + this.f38233kowloon) / (this.f38234marial * f2)) + 0.5f));
        this.f38226cutely = beachfront(this.f38226cutely, i2, (this.f38232impromptu * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f38232impromptu;
            int i5 = this.f38238saneness;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f38226cutely[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f38221apical += i * 2;
        polloi();
        if (this.f38231impassible > i3) {
            this.f38231impassible = i3;
        }
        this.f38221apical = 0;
        this.f38237polloi = 0;
        this.f38233kowloon = 0;
    }

    public final boolean monoploid(int i, int i2) {
        return i != 0 && this.f38235molybdenite != 0 && i2 <= i * 3 && i * 2 > this.f38230graveside * 3;
    }

    public final void polloi() {
        int i = this.f38231impassible;
        float f = this.f38227dern;
        float f2 = this.f38241wireman;
        float f3 = f / f2;
        float f4 = this.f38234marial * f2;
        double d = f3;
        if (d > 1.00001d || d < 0.99999d) {
            saneness(f3);
        } else {
            wireman(this.f38226cutely, 0, this.f38221apical);
            this.f38221apical = 0;
        }
        if (f4 != 1.0f) {
            attabal(f4, i);
        }
    }

    public final void saneness(float f) {
        int iGintrap;
        int i = this.f38221apical;
        if (i < this.f38232impromptu) {
            return;
        }
        int i2 = 0;
        do {
            if (this.f38237polloi > 0) {
                iGintrap = dern(i2);
            } else {
                int iCompetently = competently(this.f38226cutely, i2);
                iGintrap = ((double) f) > 1.0d ? iCompetently + gintrap(this.f38226cutely, i2, f, iCompetently) : impassible(this.f38226cutely, i2, f, iCompetently);
            }
            i2 += iGintrap;
        } while (this.f38232impromptu + i2 <= i);
        dovishness(i2);
    }

    public void taiyuan() {
        this.f38221apical = 0;
        this.f38231impassible = 0;
        this.f38233kowloon = 0;
        this.f38222arytenoidectomy = 0;
        this.f38236monoploid = 0;
        this.f38237polloi = 0;
        this.f38235molybdenite = 0;
        this.f38230graveside = 0;
        this.f38220adultoid = 0;
        this.f38228dovishness = 0;
    }

    public final short triweekly(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f38238saneness];
        int i4 = this.f38236monoploid * i2;
        int i5 = this.f38222arytenoidectomy;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    public final void wireman(short[] sArr, int i, int i2) {
        short[] sArrBeachfront = beachfront(this.f38229formularize, this.f38231impassible, i2);
        this.f38229formularize = sArrBeachfront;
        int i3 = this.f38238saneness;
        System.arraycopy(sArr, i * i3, sArrBeachfront, this.f38231impassible * i3, i3 * i2);
        this.f38231impassible += i2;
    }
}
