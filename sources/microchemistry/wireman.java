package microchemistry;

import com.ironsource.C3414a2;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Cubic.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\b\u0016\u0018\u0000 12\u00020\u0001:\u0001\u001aB\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B9\b\u0010\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\t\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\u000b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0004\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0012\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u001c2\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\b/\u00100R\u0011\u00103\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b4\u00102R\u0011\u00107\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b6\u00102R\u0011\u00109\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b8\u00102R\u0011\u0010;\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b:\u00102R\u0011\u0010=\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b<\u00102R\u0011\u0010?\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b>\u00102R\u0011\u0010A\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b@\u00102\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Lmicrochemistry/wireman;", "", "", "points", "<init>", "([F)V", "Landroidx/collection/competently;", "Landroidx/graphics/shapes/Point;", "anchor0", "control0", "control1", "anchor1", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "value", "", "kowloon", "(F)Z", "t", "apical", "(F)J", "arytenoidectomy", "()Z", "bounds", "approximate", "", "attabal", "([FZ)V", "Lkotlin/Pair;", "impassible", "(F)Lkotlin/Pair;", "formularize", "()Lmicrochemistry/wireman;", "", "toString", "()Ljava/lang/String;", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "Lmicrochemistry/monoploid;", "f", "triweekly", "(Lmicrochemistry/monoploid;)Lmicrochemistry/wireman;", "", "hashCode", "()I", "[F", "cutely", "()[F", "saneness", "()F", "anchor0X", "dern", "anchor0Y", "beachfront", "control0X", "competently", "control0Y", "impromptu", "control1X", "taiyuan", "control1Y", "wireman", "anchor1X", "marial", "anchor1Y", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class wireman {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final float[] points;

    /* JADX INFO: renamed from: microchemistry.wireman$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Cubic.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lmicrochemistry/wireman$attabal;", "", "<init>", "()V", "", "x0", "y0", "x1", "y1", "Lmicrochemistry/wireman;", "saneness", "(FFFF)Lmicrochemistry/wireman;", "centerX", "centerY", "attabal", "(FFFFFF)Lmicrochemistry/wireman;", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wireman attabal(float centerX, float centerY, float x0, float y0, float x1, float y1) {
            float f = x0 - centerX;
            float f2 = y0 - centerY;
            long jDern = preprohormone.dern(f, f2);
            float f3 = x1 - centerX;
            float f4 = y1 - centerY;
            long jDern2 = preprohormone.dern(f3, f4);
            long jImpassible = preprohormone.impassible(jDern);
            long jImpassible2 = preprohormone.impassible(jDern2);
            boolean z = arytenoidectomy.dern(jImpassible, f3, f4) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float fWireman = arytenoidectomy.wireman(jDern, jDern2);
            if (fWireman > 0.999f) {
                return saneness(x0, y0, x1, y1);
            }
            float f5 = 1;
            float f6 = f5 - fWireman;
            float fWireman2 = ((((preprohormone.wireman(f, f2) * 4.0f) / 3.0f) * (((float) Math.sqrt(2 * f6)) - ((float) Math.sqrt(f5 - (fWireman * fWireman))))) / f6) * (z ? 1.0f : -1.0f);
            return marial.attabal(x0, y0, x0 + (arytenoidectomy.competently(jImpassible) * fWireman2), y0 + (arytenoidectomy.impromptu(jImpassible) * fWireman2), x1 - (arytenoidectomy.competently(jImpassible2) * fWireman2), y1 - (arytenoidectomy.impromptu(jImpassible2) * fWireman2), x1, y1);
        }

        public final wireman saneness(float x0, float y0, float x1, float y1) {
            return marial.attabal(x0, y0, preprohormone.taiyuan(x0, x1, 0.33333334f), preprohormone.taiyuan(y0, y1, 0.33333334f), preprohormone.taiyuan(x0, x1, 0.6666667f), preprohormone.taiyuan(y0, y1, 0.6666667f), x1, y1);
        }

        public Companion() {
        }
    }

    public wireman() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final long apical(float t) {
        float f = 1 - t;
        float f2 = f * f * f;
        float f3 = 3 * t;
        float f4 = f3 * f * f;
        float f5 = f3 * t * f;
        float f6 = t * t * t;
        return androidx.collection.competently.saneness((saneness() * f2) + (beachfront() * f4) + (impromptu() * f5) + (wireman() * f6), (dern() * f2) + (competently() * f4) + (taiyuan() * f5) + (marial() * f6));
    }

    public final boolean arytenoidectomy() {
        return Math.abs(saneness() - wireman()) < 1.0E-4f && Math.abs(dern() - marial()) < 1.0E-4f;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c9 A[PHI: r3 r7
  0x01c9: PHI (r3v15 float) = (r3v12 float), (r3v21 float) binds: [B:85:0x0218, B:62:0x01c7] A[DONT_GENERATE, DONT_INLINE]
  0x01c9: PHI (r7v14 float) = (r7v10 float), (r7v16 float) binds: [B:85:0x0218, B:62:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x021b A[PHI: r9 r15
  0x021b: PHI (r9v5 float) = (r9v2 float), (r9v3 float), (r9v3 float), (r9v2 float), (r9v2 float), (r9v2 float) binds: [B:65:0x01d2, B:77:0x0201, B:79:0x0205, B:51:0x01a6, B:54:0x01b0, B:56:0x01b4] A[DONT_GENERATE, DONT_INLINE]
  0x021b: PHI (r15v13 float) = (r15v9 float), (r15v10 float), (r15v10 float), (r15v9 float), (r15v9 float), (r15v9 float) binds: [B:65:0x01d2, B:77:0x0201, B:79:0x0205, B:51:0x01a6, B:54:0x01b0, B:56:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    public final void attabal(float[] bounds, boolean approximate) {
        char c;
        char c2;
        char c3;
        float f;
        float fCompetently;
        float fDern;
        float fCompetently2;
        float f2;
        float fSqrt;
        float fSqrt2;
        float fImpromptu;
        float f3;
        float fImpromptu2;
        float f4;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (arytenoidectomy()) {
            bounds[0] = saneness();
            bounds[1] = dern();
            bounds[2] = saneness();
            bounds[3] = dern();
            return;
        }
        float fMin = Math.min(saneness(), wireman());
        float fMin2 = Math.min(dern(), marial());
        float fMax = Math.max(saneness(), wireman());
        float fMax2 = Math.max(dern(), marial());
        if (approximate) {
            bounds[0] = Math.min(fMin, Math.min(beachfront(), impromptu()));
            bounds[1] = Math.min(fMin2, Math.min(competently(), taiyuan()));
            bounds[2] = Math.max(fMax, Math.max(beachfront(), impromptu()));
            bounds[3] = Math.max(fMax2, Math.max(competently(), taiyuan()));
            return;
        }
        float f5 = 3;
        float fBeachfront = (((-saneness()) + (beachfront() * f5)) - (impromptu() * f5)) + wireman();
        float f6 = 2;
        float f7 = 4;
        float fSaneness = ((saneness() * f6) - (beachfront() * f7)) + (impromptu() * f6);
        float fBeachfront2 = (-saneness()) + beachfront();
        if (!kowloon(fBeachfront)) {
            float f8 = (fSaneness * fSaneness) - ((f7 * fBeachfront) * fBeachfront2);
            if (f8 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f9 = -fSaneness;
                c = 0;
                c2 = 3;
                double d = f8;
                c3 = 2;
                f = fMin2;
                float f10 = fBeachfront * f6;
                float fSqrt3 = (((float) Math.sqrt(d)) + f9) / f10;
                if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fSqrt3 && fSqrt3 <= 1.0f) {
                    float fCompetently3 = arytenoidectomy.competently(apical(fSqrt3));
                    if (fCompetently3 < fMin) {
                        fMin = fCompetently3;
                    }
                    if (fCompetently3 > fMax) {
                        fMax = fCompetently3;
                    }
                }
                float fSqrt4 = (f9 - ((float) Math.sqrt(d))) / f10;
                if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fSqrt4 && fSqrt4 <= 1.0f) {
                    float fCompetently4 = arytenoidectomy.competently(apical(fSqrt4));
                    if (fCompetently4 < fMin) {
                        fMin = fCompetently4;
                    }
                    if (fCompetently4 > fMax) {
                        fMax = fCompetently4;
                    }
                }
            }
            fCompetently = (((-dern()) + (competently() * f5)) - (f5 * taiyuan())) + marial();
            fDern = ((dern() * f6) - (competently() * f7)) + (taiyuan() * f6);
            fCompetently2 = (-dern()) + competently();
            if (kowloon(fCompetently)) {
                f2 = (fDern * fDern) - ((f7 * fCompetently) * fCompetently2);
                if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f11 = -fDern;
                    double d2 = f2;
                    float f12 = f6 * fCompetently;
                    fSqrt = (((float) Math.sqrt(d2)) + f11) / f12;
                    if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fSqrt && fSqrt <= 1.0f) {
                        fImpromptu2 = arytenoidectomy.impromptu(apical(fSqrt));
                        if (fImpromptu2 < f) {
                            f = fImpromptu2;
                        }
                        if (fImpromptu2 > fMax2) {
                            fMax2 = fImpromptu2;
                        }
                    }
                    fSqrt2 = (f11 - ((float) Math.sqrt(d2))) / f12;
                    if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fSqrt2 || fSqrt2 > 1.0f) {
                        f3 = f;
                    } else {
                        fImpromptu = arytenoidectomy.impromptu(apical(fSqrt2));
                        f3 = fImpromptu < f ? fImpromptu : f;
                        if (fImpromptu > fMax2) {
                            fMax2 = fImpromptu;
                        }
                    }
                } else {
                    f3 = f;
                }
            } else if (fDern == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f3 = f;
            } else {
                f4 = (f6 * fCompetently2) / ((-2) * fDern);
                if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f4 || f4 > 1.0f) {
                    f3 = f;
                } else {
                    fImpromptu = arytenoidectomy.impromptu(apical(f4));
                    f3 = fImpromptu < f ? fImpromptu : f;
                    if (fImpromptu > fMax2) {
                        fMax2 = fImpromptu;
                    }
                }
            }
            bounds[c] = fMin;
            bounds[1] = f3;
            bounds[c3] = fMax;
            bounds[c2] = fMax2;
        }
        if (fSaneness != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f13 = (fBeachfront2 * f6) / ((-2) * fSaneness);
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f13 && f13 <= 1.0f) {
                float fCompetently5 = arytenoidectomy.competently(apical(f13));
                if (fCompetently5 < fMin) {
                    fMin = fCompetently5;
                }
                if (fCompetently5 > fMax) {
                    fMax = fCompetently5;
                }
            }
        }
        c = 0;
        c2 = 3;
        c3 = 2;
        f = fMin2;
        fCompetently = (((-dern()) + (competently() * f5)) - (f5 * taiyuan())) + marial();
        fDern = ((dern() * f6) - (competently() * f7)) + (taiyuan() * f6);
        fCompetently2 = (-dern()) + competently();
        if (kowloon(fCompetently)) {
            f2 = (fDern * fDern) - ((f7 * fCompetently) * fCompetently2);
            if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f14 = -fDern;
                double d3 = f2;
                float f15 = f6 * fCompetently;
                fSqrt = (((float) Math.sqrt(d3)) + f14) / f15;
                if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fSqrt) {
                    fImpromptu2 = arytenoidectomy.impromptu(apical(fSqrt));
                    if (fImpromptu2 < f) {
                        f = fImpromptu2;
                    }
                    if (fImpromptu2 > fMax2) {
                        fMax2 = fImpromptu2;
                    }
                }
                fSqrt2 = (f14 - ((float) Math.sqrt(d3))) / f15;
                if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fSqrt2) {
                    f3 = f;
                } else {
                    f3 = f;
                }
            } else {
                f3 = f;
            }
        } else if (fDern == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = f;
        } else {
            f4 = (f6 * fCompetently2) / ((-2) * fDern);
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f4) {
                f3 = f;
            } else {
                f3 = f;
            }
        }
        bounds[c] = fMin;
        bounds[1] = f3;
        bounds[c3] = fMax;
        bounds[c2] = fMax2;
    }

    public final float beachfront() {
        return this.points[2];
    }

    public final float competently() {
        return this.points[3];
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final float[] getPoints() {
        return this.points;
    }

    public final float dern() {
        return this.points[1];
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof wireman) {
            return Arrays.equals(this.points, ((wireman) other).points);
        }
        return false;
    }

    public final wireman formularize() {
        return marial.attabal(wireman(), marial(), impromptu(), taiyuan(), beachfront(), competently(), saneness(), dern());
    }

    public int hashCode() {
        return Arrays.hashCode(this.points);
    }

    public final Pair<wireman, wireman> impassible(float t) {
        float f = 1 - t;
        long jApical = apical(t);
        float f2 = f * f;
        float f3 = 2 * f * t;
        float f4 = t * t;
        return patroclinal.formularize.attabal(marial.attabal(saneness(), dern(), (saneness() * f) + (beachfront() * t), (dern() * f) + (competently() * t), (saneness() * f2) + (beachfront() * f3) + (impromptu() * f4), (dern() * f2) + (competently() * f3) + (taiyuan() * f4), arytenoidectomy.competently(jApical), arytenoidectomy.impromptu(jApical)), marial.attabal(arytenoidectomy.competently(jApical), arytenoidectomy.impromptu(jApical), (beachfront() * f2) + (impromptu() * f3) + (wireman() * f4), (competently() * f2) + (taiyuan() * f3) + (marial() * f4), (impromptu() * f) + (wireman() * t), (taiyuan() * f) + (marial() * t), wireman(), marial()));
    }

    public final float impromptu() {
        return this.points[4];
    }

    public final boolean kowloon(float value) {
        return Math.abs(value) < 1.0E-4f;
    }

    public final float marial() {
        return this.points[7];
    }

    public final float saneness() {
        return this.points[0];
    }

    public final float taiyuan() {
        return this.points[5];
    }

    public String toString() {
        return "anchor0: (" + saneness() + ", " + dern() + ") control0: (" + beachfront() + ", " + competently() + "), control1: (" + impromptu() + ", " + taiyuan() + "), anchor1: (" + wireman() + ", " + marial() + ')';
    }

    public final wireman triweekly(monoploid f) {
        Intrinsics.checkNotNullParameter(f, "f");
        kowloon kowloonVar = new kowloon();
        p002kotlin.collections.arytenoidectomy.apical(this.points, kowloonVar.getPoints(), 0, 0, 0, 14, null);
        kowloonVar.monoploid(f);
        return kowloonVar;
    }

    public final float wireman() {
        return this.points[6];
    }

    public /* synthetic */ wireman(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    public wireman(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.points = points;
        if (points.length != 8) {
            throw new IllegalArgumentException("Points array size should be 8");
        }
    }

    public /* synthetic */ wireman(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new float[8] : fArr);
    }

    public wireman(long j, long j2, long j3, long j4) {
        this(new float[]{arytenoidectomy.competently(j), arytenoidectomy.impromptu(j), arytenoidectomy.competently(j2), arytenoidectomy.impromptu(j2), arytenoidectomy.competently(j3), arytenoidectomy.impromptu(j3), arytenoidectomy.competently(j4), arytenoidectomy.impromptu(j4)});
    }
}
