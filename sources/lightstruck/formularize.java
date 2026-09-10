package lightstruck;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: ViewingConditions.java */
/* JADX INFO: loaded from: classes.dex */
public final class formularize {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final formularize f32963apical = apical(saneness.f32998dern, (float) ((((double) saneness.impromptu(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final float f32964attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final float f32965beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final float[] f32966competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final float f32967cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final float f32968dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final float f32969impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final float f32970marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final float f32971saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final float f32972taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final float f32973wireman;

    public formularize(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f32965beachfront = f;
        this.f32964attabal = f2;
        this.f32971saneness = f3;
        this.f32968dern = f4;
        this.f32973wireman = f5;
        this.f32970marial = f6;
        this.f32966competently = fArr;
        this.f32969impromptu = f7;
        this.f32972taiyuan = f8;
        this.f32967cutely = f9;
    }

    public static formularize apical(float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = saneness.f32997attabal;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f4;
        float f6 = fArr[1];
        float f7 = f5 + (fArr3[1] * f6);
        float f8 = fArr[2];
        float f9 = f7 + (fArr3[2] * f8);
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[0] * f4) + (fArr4[1] * f6) + (fArr4[2] * f8);
        float[] fArr5 = fArr2[2];
        float f11 = (f4 * fArr5[0]) + (f6 * fArr5[1]) + (f8 * fArr5[2]);
        float f12 = (f3 / 10.0f) + 0.8f;
        float fWireman = ((double) f12) >= 0.9d ? saneness.wireman(0.59f, 0.69f, (f12 - 0.9f) * 10.0f) : saneness.wireman(0.525f, 0.59f, (f12 - 0.8f) * 10.0f);
        float fExp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f12;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float[] fArr6 = {(((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp};
        float f13 = 1.0f / ((5.0f * f) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float fCbrt = (f14 * f) + (0.1f * f15 * f15 * ((float) Math.cbrt(((double) f) * 5.0d)));
        float fImpromptu = saneness.impromptu(f2) / fArr[1];
        double d2 = fImpromptu;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f9)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f10)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f11)) / 100.0d, 0.42d)};
        float f16 = fArr7[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[2];
        float[] fArr8 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        return new formularize(fImpromptu, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fWireman, f12, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public float attabal() {
        return this.f32964attabal;
    }

    public float beachfront() {
        return this.f32971saneness;
    }

    public float competently() {
        return this.f32970marial;
    }

    public float cutely() {
        return this.f32967cutely;
    }

    public float dern() {
        return this.f32969impromptu;
    }

    public float impromptu() {
        return this.f32968dern;
    }

    public float marial() {
        return this.f32965beachfront;
    }

    public float saneness() {
        return this.f32973wireman;
    }

    public float[] taiyuan() {
        return this.f32966competently;
    }

    public float wireman() {
        return this.f32972taiyuan;
    }
}
