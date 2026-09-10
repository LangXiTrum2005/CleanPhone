package rotissomat;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.overspeculate;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: KeyframeParser.java */
/* JADX INFO: loaded from: classes.dex */
public class graveside {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static overspeculate<WeakReference<Interpolator>> f36855saneness;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Interpolator f36853attabal = new LinearInterpolator();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static JsonReader.attabal f36854dern = JsonReader.attabal.attabal("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static JsonReader.attabal f36856wireman = JsonReader.attabal.attabal("x", "y");

    public static WeakReference<Interpolator> attabal(int i) {
        WeakReference<Interpolator> weakReferenceBeachfront;
        synchronized (graveside.class) {
            weakReferenceBeachfront = competently().beachfront(i);
        }
        return weakReferenceBeachfront;
    }

    public static <T> com.airbnb.lottie.value.attabal<T> beachfront(JsonReader jsonReader, float f, saran<T> saranVar) throws IOException {
        return new com.airbnb.lottie.value.attabal<>(saranVar.attabal(jsonReader, f));
    }

    public static overspeculate<WeakReference<Interpolator>> competently() {
        if (f36855saneness == null) {
            f36855saneness = new overspeculate<>();
        }
        return f36855saneness;
    }

    public static <T> com.airbnb.lottie.value.attabal<T> dern(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar, float f, saran<T> saranVar, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return marial(impromptuVar, jsonReader, f, saranVar);
        }
        return z ? wireman(impromptuVar, jsonReader, f, saranVar) : beachfront(jsonReader, f, saranVar);
    }

    public static void impromptu(int i, WeakReference<Interpolator> weakReference) {
        synchronized (graveside.class) {
            f36855saneness.apical(i, weakReference);
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01e2  */
    public static <T> com.airbnb.lottie.value.attabal<T> marial(com.airbnb.lottie.impromptu impromptuVar, JsonReader jsonReader, float f, saran<T> saranVar) throws IOException {
        Interpolator interpolatorSaneness;
        Interpolator interpolatorSaneness2;
        Interpolator interpolatorSaneness3;
        T t;
        Interpolator interpolator;
        PointF pointF;
        com.airbnb.lottie.value.attabal<T> attabalVar;
        PointF pointF2;
        boolean z;
        float f2;
        jsonReader.dern();
        boolean z2 = false;
        PointF pointFMarial = null;
        PointF pointFMarial2 = null;
        PointF pointF3 = null;
        T tAttabal = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointFMarial3 = null;
        PointF pointFMarial4 = null;
        float fMonoploid = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        T tAttabal2 = null;
        while (jsonReader.formularize()) {
            switch (jsonReader.polder(f36854dern)) {
                case 0:
                    fMonoploid = (float) jsonReader.monoploid();
                    break;
                case 1:
                    tAttabal = saranVar.attabal(jsonReader, f);
                    break;
                case 2:
                    tAttabal2 = saranVar.attabal(jsonReader, f);
                    break;
                case 3:
                    boolean z3 = z2;
                    if (jsonReader.restrictive() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.dern();
                        float fMonoploid2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fMonoploid3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fMonoploid4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fMonoploid5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (jsonReader.formularize()) {
                            int iPolder = jsonReader.polder(f36856wireman);
                            if (iPolder == 0) {
                                pointF2 = pointF5;
                                JsonReader.Token tokenRestrictive = jsonReader.restrictive();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (tokenRestrictive == token) {
                                    fMonoploid4 = (float) jsonReader.monoploid();
                                    fMonoploid2 = fMonoploid4;
                                } else {
                                    jsonReader.saneness();
                                    fMonoploid2 = (float) jsonReader.monoploid();
                                    fMonoploid4 = jsonReader.restrictive() == token ? (float) jsonReader.monoploid() : fMonoploid2;
                                    jsonReader.marial();
                                }
                            } else if (iPolder != 1) {
                                jsonReader.saran();
                            } else {
                                JsonReader.Token tokenRestrictive2 = jsonReader.restrictive();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (tokenRestrictive2 == token2) {
                                    pointF2 = pointF5;
                                    fMonoploid5 = (float) jsonReader.monoploid();
                                    fMonoploid3 = fMonoploid5;
                                } else {
                                    pointF2 = pointF5;
                                    jsonReader.saneness();
                                    fMonoploid3 = (float) jsonReader.monoploid();
                                    fMonoploid5 = jsonReader.restrictive() == token2 ? (float) jsonReader.monoploid() : fMonoploid3;
                                    jsonReader.marial();
                                }
                            }
                            pointF5 = pointF2;
                        }
                        pointF3 = new PointF(fMonoploid2, fMonoploid3);
                        pointF4 = new PointF(fMonoploid4, fMonoploid5);
                        jsonReader.cutely();
                    } else {
                        pointFMarial = molybdenite.marial(jsonReader, f);
                    }
                    z2 = z3;
                    break;
                case 4:
                    if (jsonReader.restrictive() != JsonReader.Token.BEGIN_OBJECT) {
                        pointFMarial2 = molybdenite.marial(jsonReader, f);
                    } else {
                        jsonReader.dern();
                        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fMonoploid6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fMonoploid7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (jsonReader.formularize()) {
                            int iPolder2 = jsonReader.polder(f36856wireman);
                            if (iPolder2 != 0) {
                                z = z2;
                                if (iPolder2 != 1) {
                                    jsonReader.saran();
                                } else {
                                    JsonReader.Token tokenRestrictive3 = jsonReader.restrictive();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (tokenRestrictive3 == token3) {
                                        fMonoploid7 = (float) jsonReader.monoploid();
                                        f4 = fMonoploid7;
                                    } else {
                                        jsonReader.saneness();
                                        PointF pointF7 = pointFMarial3;
                                        float fMonoploid8 = (float) jsonReader.monoploid();
                                        fMonoploid7 = jsonReader.restrictive() == token3 ? (float) jsonReader.monoploid() : fMonoploid8;
                                        jsonReader.marial();
                                        pointFMarial3 = pointF7;
                                        f4 = fMonoploid8;
                                    }
                                }
                            } else {
                                z = z2;
                                PointF pointF8 = pointFMarial3;
                                JsonReader.Token tokenRestrictive4 = jsonReader.restrictive();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (tokenRestrictive4 == token4) {
                                    pointFMarial3 = pointF8;
                                    fMonoploid6 = (float) jsonReader.monoploid();
                                    f3 = fMonoploid6;
                                } else {
                                    pointFMarial3 = pointF8;
                                    jsonReader.saneness();
                                    float fMonoploid9 = (float) jsonReader.monoploid();
                                    if (jsonReader.restrictive() == token4) {
                                        f2 = fMonoploid9;
                                        fMonoploid6 = (float) jsonReader.monoploid();
                                    } else {
                                        f2 = fMonoploid9;
                                        fMonoploid6 = f2;
                                    }
                                    jsonReader.marial();
                                    f3 = f2;
                                }
                            }
                            z2 = z;
                        }
                        PointF pointF9 = new PointF(f3, f4);
                        PointF pointF10 = new PointF(fMonoploid6, fMonoploid7);
                        jsonReader.cutely();
                        pointF6 = pointF10;
                        pointF5 = pointF9;
                    }
                    break;
                case 5:
                    z2 = jsonReader.dovishness() == 1;
                    break;
                case 6:
                    pointFMarial3 = molybdenite.marial(jsonReader, f);
                    break;
                case 7:
                    pointFMarial4 = molybdenite.marial(jsonReader, f);
                    break;
                default:
                    jsonReader.saran();
                    break;
            }
        }
        boolean z4 = z2;
        PointF pointF11 = pointF5;
        jsonReader.cutely();
        if (z4) {
            interpolator = f36853attabal;
            t = tAttabal;
        } else {
            if (pointFMarial == null || pointFMarial2 == null) {
                if (pointF3 == null || pointF4 == null || pointF11 == null || pointF6 == null) {
                    interpolatorSaneness = f36853attabal;
                } else {
                    interpolatorSaneness2 = saneness(pointF3, pointF11);
                    interpolatorSaneness3 = saneness(pointF4, pointF6);
                    t = tAttabal2;
                    interpolator = null;
                }
                if (interpolatorSaneness2 != null || interpolatorSaneness3 == null) {
                    pointF = pointFMarial4;
                    attabalVar = new com.airbnb.lottie.value.attabal<>(impromptuVar, tAttabal, t, interpolator, fMonoploid, null);
                } else {
                    pointF = pointFMarial4;
                    attabalVar = new com.airbnb.lottie.value.attabal<>(impromptuVar, tAttabal, t, interpolatorSaneness2, interpolatorSaneness3, fMonoploid, null);
                }
                attabalVar.f16254kowloon = pointFMarial3;
                attabalVar.f16245arytenoidectomy = pointF;
                return attabalVar;
            }
            interpolatorSaneness = saneness(pointFMarial, pointFMarial2);
            interpolator = interpolatorSaneness;
            t = tAttabal2;
        }
        interpolatorSaneness2 = null;
        interpolatorSaneness3 = null;
        if (interpolatorSaneness2 != null) {
            pointF = pointFMarial4;
            attabalVar = new com.airbnb.lottie.value.attabal<>(impromptuVar, tAttabal, t, interpolator, fMonoploid, null);
        } else {
            pointF = pointFMarial4;
            attabalVar = new com.airbnb.lottie.value.attabal<>(impromptuVar, tAttabal, t, interpolator, fMonoploid, null);
        }
        attabalVar.f16254kowloon = pointFMarial3;
        attabalVar.f16245arytenoidectomy = pointF;
        return attabalVar;
    }

    public static Interpolator saneness(PointF pointF, PointF pointF2) {
        Interpolator interpolatorAttabal;
        pointF.x = utwa.apical.saneness(pointF.x, -1.0f, 1.0f);
        pointF.y = utwa.apical.saneness(pointF.y, -100.0f, 100.0f);
        pointF2.x = utwa.apical.saneness(pointF2.x, -1.0f, 1.0f);
        float fSaneness = utwa.apical.saneness(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fSaneness;
        int iTaiyuan = utwa.arytenoidectomy.taiyuan(pointF.x, pointF.y, pointF2.x, fSaneness);
        WeakReference<Interpolator> weakReferenceAttabal = com.airbnb.lottie.wireman.marial() ? null : attabal(iTaiyuan);
        Interpolator interpolator = weakReferenceAttabal != null ? weakReferenceAttabal.get() : null;
        if (weakReferenceAttabal != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorAttabal = dhss.attabal.attabal(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            interpolatorAttabal = "The Path cannot loop back on itself.".equals(e.getMessage()) ? dhss.attabal.attabal(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), pointF2.y) : new LinearInterpolator();
        }
        if (!com.airbnb.lottie.wireman.marial()) {
            try {
                impromptu(iTaiyuan, new WeakReference(interpolatorAttabal));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolatorAttabal;
    }

    public static <T> com.airbnb.lottie.value.attabal<T> wireman(com.airbnb.lottie.impromptu impromptuVar, JsonReader jsonReader, float f, saran<T> saranVar) throws IOException {
        Interpolator interpolatorSaneness;
        T t;
        jsonReader.dern();
        PointF pointFMarial = null;
        T tAttabal = null;
        T tAttabal2 = null;
        PointF pointFMarial2 = null;
        PointF pointFMarial3 = null;
        float fMonoploid = 0.0f;
        boolean z = false;
        PointF pointFMarial4 = null;
        while (jsonReader.formularize()) {
            switch (jsonReader.polder(f36854dern)) {
                case 0:
                    fMonoploid = (float) jsonReader.monoploid();
                    break;
                case 1:
                    tAttabal2 = saranVar.attabal(jsonReader, f);
                    break;
                case 2:
                    tAttabal = saranVar.attabal(jsonReader, f);
                    break;
                case 3:
                    pointFMarial = molybdenite.marial(jsonReader, 1.0f);
                    break;
                case 4:
                    pointFMarial4 = molybdenite.marial(jsonReader, 1.0f);
                    break;
                case 5:
                    z = jsonReader.dovishness() == 1;
                    break;
                case 6:
                    pointFMarial2 = molybdenite.marial(jsonReader, f);
                    break;
                case 7:
                    pointFMarial3 = molybdenite.marial(jsonReader, f);
                    break;
                default:
                    jsonReader.saran();
                    break;
            }
        }
        jsonReader.cutely();
        if (z) {
            interpolatorSaneness = f36853attabal;
            t = tAttabal2;
        } else {
            interpolatorSaneness = (pointFMarial == null || pointFMarial4 == null) ? f36853attabal : saneness(pointFMarial, pointFMarial4);
            t = tAttabal;
        }
        com.airbnb.lottie.value.attabal<T> attabalVar = new com.airbnb.lottie.value.attabal<>(impromptuVar, tAttabal2, t, interpolatorSaneness, fMonoploid, null);
        attabalVar.f16254kowloon = pointFMarial2;
        attabalVar.f16245arytenoidectomy = pointFMarial3;
        return attabalVar;
    }
}
