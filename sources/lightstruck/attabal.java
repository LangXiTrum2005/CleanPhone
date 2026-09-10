package lightstruck;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: CamColor.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final float f32949attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final float f32950beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final float f32951competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final float f32952dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final float f32953impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final float f32954marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final float f32955saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final float f32956taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final float f32957wireman;

    public attabal(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f32949attabal = f;
        this.f32955saneness = f2;
        this.f32952dern = f3;
        this.f32957wireman = f4;
        this.f32954marial = f5;
        this.f32950beachfront = f6;
        this.f32951competently = f7;
        this.f32953impromptu = f8;
        this.f32956taiyuan = f9;
    }

    public static attabal beachfront(float f, float f2, float f3, formularize formularizeVar) {
        double d = ((double) f) / 100.0d;
        float fSaneness = (4.0f / formularizeVar.saneness()) * ((float) Math.sqrt(d)) * (formularizeVar.attabal() + 4.0f) * formularizeVar.wireman();
        float fWireman = formularizeVar.wireman() * f2;
        float fSqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * formularizeVar.saneness()) / (formularizeVar.attabal() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) fWireman) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new attabal(f3, f2, f, fSaneness, fWireman, fSqrt, f4, ((float) Math.cos(d2)) * fLog, fLog * ((float) Math.sin(d2)));
    }

    public static attabal dern(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        wireman(i, formularize.f32963apical, fArr, fArr2);
        return new attabal(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static int impassible(float f, float f2, float f3) {
        return triweekly(f, f2, f3, formularize.f32963apical);
    }

    public static attabal marial(float f, float f2, float f3) {
        return beachfront(f, f2, f3, formularize.f32963apical);
    }

    public static attabal saneness(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        attabal attabalVar = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int iArytenoidectomy = marial(f8, f2, f).arytenoidectomy();
            float fSaneness = saneness.saneness(iArytenoidectomy);
            float fAbs = Math.abs(f3 - fSaneness);
            if (fAbs < 0.2f) {
                attabal attabalVarDern = dern(iArytenoidectomy);
                float fAttabal = attabalVarDern.attabal(marial(attabalVarDern.apical(), attabalVarDern.taiyuan(), f));
                if (fAttabal <= 1.0f) {
                    attabalVar = attabalVarDern;
                    f5 = fAbs;
                    f7 = fAttabal;
                }
            }
            if (f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f7 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return attabalVar;
            }
            if (fSaneness < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return attabalVar;
    }

    public static int triweekly(float f, float f2, float f3, formularize formularizeVar) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return saneness.attabal(f3);
        }
        float fMin = f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : Math.min(360.0f, f);
        attabal attabalVar = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            attabal attabalVarSaneness = saneness(fMin, f5, f3);
            if (!z) {
                if (attabalVarSaneness == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    attabalVar = attabalVarSaneness;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            } else {
                if (attabalVarSaneness != null) {
                    return attabalVarSaneness.kowloon(formularizeVar);
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
                z = false;
            }
        }
        return attabalVar == null ? saneness.attabal(f3) : attabalVar.kowloon(formularizeVar);
    }

    public static void wireman(int i, formularize formularizeVar, float[] fArr, float[] fArr2) {
        saneness.beachfront(i, fArr2);
        float[][] fArr3 = saneness.f32997attabal;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr4[0] * f;
        float f3 = fArr2[1];
        float f4 = f2 + (fArr4[1] * f3);
        float f5 = fArr2[2];
        float f6 = f4 + (fArr4[2] * f5);
        float[] fArr5 = fArr3[1];
        float f7 = (fArr5[0] * f) + (fArr5[1] * f3) + (fArr5[2] * f5);
        float[] fArr6 = fArr3[2];
        float f8 = (f * fArr6[0]) + (f3 * fArr6[1]) + (f5 * fArr6[2]);
        float f9 = formularizeVar.taiyuan()[0] * f6;
        float f10 = formularizeVar.taiyuan()[1] * f7;
        float f11 = formularizeVar.taiyuan()[2] * f8;
        float fPow = (float) Math.pow(((double) (formularizeVar.dern() * Math.abs(f9))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (formularizeVar.dern() * Math.abs(f10))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (formularizeVar.dern() * Math.abs(f11))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f9) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f10) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f11) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f12 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d)) / 11.0f;
        float f13 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = (((fSignum * 20.0f) + f14) + (21.0f * fSignum3)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f16 * formularizeVar.beachfront()) / formularizeVar.attabal(), formularizeVar.saneness() * formularizeVar.cutely())) * 100.0f;
        float fSaneness = (4.0f / formularizeVar.saneness()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (formularizeVar.attabal() + 4.0f) * formularizeVar.wireman();
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, formularizeVar.marial()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * formularizeVar.competently()) * formularizeVar.impromptu()) * ((float) Math.sqrt((f12 * f12) + (f13 * f13)))) / (f15 + 0.305f), 0.9d));
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * fPow5;
        float fWireman = formularizeVar.wireman() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((fPow5 * formularizeVar.saneness()) / (formularizeVar.attabal() + 4.0f))) * 50.0f;
        float f18 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fWireman) + 1.0f)) * 43.85965f;
        double d2 = f17;
        float fCos = ((float) Math.cos(d2)) * fLog;
        float fSin = fLog * ((float) Math.sin(d2));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fSaneness;
            fArr[2] = fWireman;
            fArr[3] = fSqrt2;
            fArr[4] = f18;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    public float apical() {
        return this.f32952dern;
    }

    public int arytenoidectomy() {
        return kowloon(formularize.f32963apical);
    }

    public float attabal(attabal attabalVar) {
        float fFormularize = formularize() - attabalVar.formularize();
        float fCompetently = competently() - attabalVar.competently();
        float fImpromptu = impromptu() - attabalVar.impromptu();
        return (float) (Math.pow(Math.sqrt((fFormularize * fFormularize) + (fCompetently * fCompetently) + (fImpromptu * fImpromptu)), 0.63d) * 1.41d);
    }

    public float competently() {
        return this.f32953impromptu;
    }

    public float cutely() {
        return this.f32949attabal;
    }

    public float formularize() {
        return this.f32951competently;
    }

    public float impromptu() {
        return this.f32956taiyuan;
    }

    public int kowloon(formularize formularizeVar) {
        float fPow = (float) Math.pow(((double) ((((double) taiyuan()) == 0.0d || ((double) apical()) == 0.0d) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : taiyuan() / ((float) Math.sqrt(((double) apical()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, formularizeVar.marial()), 0.73d), 1.1111111111111112d);
        double dCutely = (cutely() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dCutely) + 3.8d)) * 0.25f;
        float fAttabal = formularizeVar.attabal() * ((float) Math.pow(((double) apical()) / 100.0d, (1.0d / ((double) formularizeVar.saneness())) / ((double) formularizeVar.cutely())));
        float fCompetently = fCos * 3846.1538f * formularizeVar.competently() * formularizeVar.impromptu();
        float fBeachfront = fAttabal / formularizeVar.beachfront();
        float fSin = (float) Math.sin(dCutely);
        float fCos2 = (float) Math.cos(dCutely);
        float f = (((0.305f + fBeachfront) * 23.0f) * fPow) / (((fCompetently * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f2 = fCos2 * f;
        float f3 = f * fSin;
        float f4 = fBeachfront * 460.0f;
        float f5 = (((451.0f * f2) + f4) + (288.0f * f3)) / 1403.0f;
        float f6 = ((f4 - (891.0f * f2)) - (261.0f * f3)) / 1403.0f;
        float f7 = ((f4 - (f2 * 220.0f)) - (f3 * 6300.0f)) / 1403.0f;
        float fSignum = Math.signum(f5) * (100.0f / formularizeVar.dern()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f5)) * 27.13d) / (400.0d - ((double) Math.abs(f5)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f6) * (100.0f / formularizeVar.dern()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f7) * (100.0f / formularizeVar.dern()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7)))), 2.380952380952381d));
        float f8 = fSignum / formularizeVar.taiyuan()[0];
        float f9 = fSignum2 / formularizeVar.taiyuan()[1];
        float f10 = fSignum3 / formularizeVar.taiyuan()[2];
        float[][] fArr = saneness.f32999saneness;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[0] * f8) + (fArr2[1] * f9) + (fArr2[2] * f10);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[0] * f8) + (fArr3[1] * f9) + (fArr3[2] * f10);
        float[] fArr4 = fArr[2];
        return monroe.dern.saneness(f11, f12, (f8 * fArr4[0]) + (f9 * fArr4[1]) + (f10 * fArr4[2]));
    }

    public float taiyuan() {
        return this.f32955saneness;
    }
}
