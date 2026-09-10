package androidx.compose.ui.graphics.colorspace;

import com.applovin.sdk.AppLovinMediationProvider;
import com.ironsource.C3414a2;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import restrictive.dent;

/* JADX INFO: compiled from: Rgb.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 c2\u00020\u0001:\u0001dB]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0016BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0019B!\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b)\u0010*J=\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\"J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0096\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u00109R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010>R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010>R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u001a\u0010J\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010D\u001a\u0004\bI\u0010FR\u001a\u0010O\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170P8\u0006¢\u0006\f\n\u0004\b!\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010U\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010L\u001a\u0004\bT\u0010NR\u001a\u0010W\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010L\u001a\u0004\bV\u0010NR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170P8\u0006¢\u0006\f\n\u0004\bX\u0010Q\u001a\u0004\bY\u0010SR\u001a\u0010\\\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010L\u001a\u0004\b[\u0010NR\u001a\u0010_\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010b\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010^\u001a\u0004\bG\u0010`\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006e"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/dern;", "", "name", "", "primaries", "Landroidx/compose/ui/graphics/colorspace/preprohormone;", "whitePoint", "transform", "Landroidx/compose/ui/graphics/colorspace/cutely;", "oetf", "eotf", "", "min", AppLovinMediationProvider.MAX, "Landroidx/compose/ui/graphics/colorspace/rotuma;", "transferParameters", "", "id", "<init>", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/preprohormone;[FLandroidx/compose/ui/graphics/colorspace/cutely;Landroidx/compose/ui/graphics/colorspace/cutely;FFLandroidx/compose/ui/graphics/colorspace/rotuma;I)V", "function", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/preprohormone;Landroidx/compose/ui/graphics/colorspace/rotuma;I)V", "", "gamma", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/preprohormone;DFFI)V", "colorSpace", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/preprohormone;)V", "component", "beachfront", "(I)F", "marial", "v", "formularize", "([F)[F", "v0", "v1", "v2", "", "cutely", "(FFF)J", "impassible", "(FFF)F", "x", "y", "z", "a", "Lrestrictive/overspeculate;", "triweekly", "(FFFFLandroidx/compose/ui/graphics/colorspace/dern;)J", "saneness", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "wireman", "Landroidx/compose/ui/graphics/colorspace/preprohormone;", "saran", "()Landroidx/compose/ui/graphics/colorspace/preprohormone;", "F", "competently", "Landroidx/compose/ui/graphics/colorspace/rotuma;", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/rotuma;", "impromptu", "[F", "getPrimaries$ui_graphics_release", "()[F", "taiyuan", "grimness", "merc", "inverseTransform", "apical", "Landroidx/compose/ui/graphics/colorspace/cutely;", "seminary", "()Landroidx/compose/ui/graphics/colorspace/cutely;", "oetfOrig", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getOetf", "()Lkotlin/jvm/functions/Function1;", "polder", "oetfFunc", "restrictive", "eotfOrig", "kowloon", "getEotf", "arytenoidectomy", "supplicat", "eotfFunc", "monoploid", "Z", "isWideGamut", "()Z", "polloi", "isSrgb", "molybdenite", "attabal", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Rgb extends dern {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public final cutely oetfOrig;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final cutely eotfFunc;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final float max;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final TransferParameters transferParameters;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final float[] inverseTransform;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public final Function1<Double, Double> oetf;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public final cutely oetfFunc;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final float[] primaries;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Function1<Double, Double> eotf;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final float min;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final boolean isWideGamut;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final boolean isSrgb;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final float[] transform;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public final cutely eotfOrig;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final WhitePoint whitePoint;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final cutely f6469graveside = new cutely() { // from class: androidx.compose.ui.graphics.colorspace.monoploid
        @Override // androidx.compose.ui.graphics.colorspace.cutely
        public final double attabal(double d) {
            return Rgb.rotuma(d);
        }
    };

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.Rgb$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Rgb.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001a\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010!\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$attabal;", "", "<init>", "()V", "", "primaries", "Landroidx/compose/ui/graphics/colorspace/preprohormone;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/cutely;", "OETF", "EOTF", "", "min", AppLovinMediationProvider.MAX, "", "id", "", "cutely", "([FLandroidx/compose/ui/graphics/colorspace/preprohormone;Landroidx/compose/ui/graphics/colorspace/cutely;Landroidx/compose/ui/graphics/colorspace/cutely;FFI)Z", "", "point", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "beachfront", "(DLandroidx/compose/ui/graphics/colorspace/cutely;Landroidx/compose/ui/graphics/colorspace/cutely;)Z", "apical", "([FFF)Z", "marial", "([F)F", "ax", "ay", "bx", "by", "taiyuan", "(FFFF)F", "p1", "p2", "impromptu", "([F[F)Z", "formularize", "([F)[F", "competently", "([FLandroidx/compose/ui/graphics/colorspace/preprohormone;)[F", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/cutely;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean apical(float[] primaries, float min, float max) {
            float fMarial = marial(primaries);
            competently competentlyVar = competently.f6507attabal;
            if (fMarial / marial(competentlyVar.beachfront()) <= 0.9f || !impromptu(primaries, competentlyVar.taiyuan())) {
                return min < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && max > 1.0f;
            }
            return true;
        }

        public final boolean beachfront(double point, cutely a, cutely b) {
            return Math.abs(a.attabal(point) - b.attabal(point)) <= 0.001d;
        }

        public final float[] competently(float[] primaries, WhitePoint whitePoint) {
            float f = primaries[0];
            float f2 = primaries[1];
            float f3 = primaries[2];
            float f4 = primaries[3];
            float f5 = primaries[4];
            float f6 = primaries[5];
            float x = whitePoint.getX();
            float y = whitePoint.getY();
            float f7 = 1;
            float f8 = (f7 - f) / f2;
            float f9 = (f7 - f3) / f4;
            float f10 = (f7 - f5) / f6;
            float f11 = (f7 - x) / y;
            float f12 = f / f2;
            float f13 = (f3 / f4) - f12;
            float f14 = (x / y) - f12;
            float f15 = f9 - f8;
            float f16 = (f5 / f6) - f12;
            float f17 = (((f11 - f8) * f13) - (f14 * f15)) / (((f10 - f8) * f13) - (f15 * f16));
            float f18 = (f14 - (f16 * f17)) / f13;
            float f19 = (1.0f - f18) - f17;
            float f20 = f19 / f2;
            float f21 = f18 / f4;
            float f22 = f17 / f6;
            return new float[]{f20 * f, f19, f20 * ((1.0f - f) - f2), f21 * f3, f18, f21 * ((1.0f - f3) - f4), f22 * f5, f17, f22 * ((1.0f - f5) - f6)};
        }

        public final boolean cutely(float[] primaries, WhitePoint whitePoint, cutely OETF, cutely EOTF, float min, float max, int id) {
            if (id == 0) {
                return true;
            }
            competently competentlyVar = competently.f6507attabal;
            if (!wireman.competently(primaries, competentlyVar.taiyuan()) || !wireman.beachfront(whitePoint, apical.f6488attabal.marial()) || min != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || max != 1.0f) {
                return false;
            }
            Rgb rgbImpromptu = competentlyVar.impromptu();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!beachfront(d, OETF, rgbImpromptu.getOetfOrig()) || !beachfront(d, EOTF, rgbImpromptu.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        public final float[] formularize(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length != 9) {
                p002kotlin.collections.arytenoidectomy.apical(primaries, fArr, 0, 0, 6, 6, null);
                return fArr;
            }
            float f = primaries[0];
            float f2 = primaries[1];
            float f3 = f + f2 + primaries[2];
            fArr[0] = f / f3;
            fArr[1] = f2 / f3;
            float f4 = primaries[3];
            float f5 = primaries[4];
            float f6 = f4 + f5 + primaries[5];
            fArr[2] = f4 / f6;
            fArr[3] = f5 / f6;
            float f7 = primaries[6];
            float f8 = primaries[7];
            float f9 = f7 + f8 + primaries[8];
            fArr[4] = f7 / f9;
            fArr[5] = f8 / f9;
            return fArr;
        }

        public final boolean impromptu(float[] p1, float[] p2) {
            float f = p1[0];
            float f2 = p2[0];
            float f3 = p1[1];
            float f4 = p2[1];
            float f5 = p1[2] - p2[2];
            float f6 = p1[3] - p2[3];
            float f7 = p1[4];
            float f8 = p2[4];
            float f9 = p1[5];
            float f10 = p2[5];
            float[] fArr = {f - f2, f3 - f4, f5, f6, f7 - f8, f9 - f10};
            return taiyuan(fArr[0], fArr[1], f2 - f8, f4 - f10) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && taiyuan(p2[0] - p2[2], p2[1] - p2[3], fArr[0], fArr[1]) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && taiyuan(fArr[2], fArr[3], p2[2] - p2[0], p2[3] - p2[1]) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && taiyuan(p2[2] - p2[4], p2[3] - p2[5], fArr[2], fArr[3]) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && taiyuan(fArr[4], fArr[5], p2[4] - p2[2], p2[5] - p2[3]) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && taiyuan(p2[4] - p2[0], p2[5] - p2[1], fArr[4], fArr[5]) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public final float marial(float[] primaries) {
            float f = primaries[0];
            float f2 = primaries[1];
            float f3 = primaries[2];
            float f4 = primaries[3];
            float f5 = primaries[4];
            float f6 = primaries[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -f7 : f7;
        }

        public final float taiyuan(float ax, float ay, float bx, float by) {
            return (ax * by) - (ay * bx);
        }

        public Companion() {
        }
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, cutely cutelyVar, cutely cutelyVar2, float f, float f2, TransferParameters transferParameters, int i) {
        super(str, saneness.INSTANCE.saneness(), i, null);
        this.whitePoint = whitePoint;
        this.min = f;
        this.max = f2;
        this.transferParameters = transferParameters;
        this.oetfOrig = cutelyVar;
        this.oetf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d) {
                return invoke(d.doubleValue());
            }

            public final Double invoke(double d) {
                return Double.valueOf(p002kotlin.ranges.wireman.taiyuan(this.this$0.getOetfOrig().attabal(d), this.this$0.min, this.this$0.max));
            }
        };
        this.oetfFunc = new cutely() { // from class: androidx.compose.ui.graphics.colorspace.kowloon
            @Override // androidx.compose.ui.graphics.colorspace.cutely
            public final double attabal(double d) {
                return Rgb.privatdozent(this.f6550attabal, d);
            }
        };
        this.eotfOrig = cutelyVar2;
        this.eotf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d) {
                return invoke(d.doubleValue());
            }

            public final Double invoke(double d) {
                return Double.valueOf(this.this$0.getEotfOrig().attabal(p002kotlin.ranges.wireman.taiyuan(d, this.this$0.min, this.this$0.max)));
            }
        };
        this.eotfFunc = new cutely() { // from class: androidx.compose.ui.graphics.colorspace.arytenoidectomy
            @Override // androidx.compose.ui.graphics.colorspace.cutely
            public final double attabal(double d) {
                return Rgb.kattegat(this.f6498attabal, d);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] fArrFormularize = companion.formularize(fArr);
        this.primaries = fArrFormularize;
        if (fArr2 == null) {
            this.transform = companion.competently(fArrFormularize, whitePoint);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        }
        this.inverseTransform = wireman.apical(this.transform);
        this.isWideGamut = companion.apical(fArrFormularize, f, f2);
        this.isSrgb = companion.cutely(fArrFormularize, whitePoint, cutelyVar, cutelyVar2, f, f2, i);
    }

    public static final double cord(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    public static final double cuirassed(TransferParameters transferParameters, double d) {
        return wireman.kowloon(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    public static final double kattegat(Rgb rgb, double d) {
        return rgb.eotfOrig.attabal(p002kotlin.ranges.wireman.taiyuan(d, rgb.min, rgb.max));
    }

    public static final double oilcan(TransferParameters transferParameters, double d) {
        return wireman.polloi(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    public static final double preprohormone(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    public static final double privatdozent(Rgb rgb, double d) {
        return p002kotlin.ranges.wireman.taiyuan(rgb.oetfOrig.attabal(d), rgb.min, rgb.max);
    }

    public static final double stratoscope(TransferParameters transferParameters, double d) {
        return wireman.arytenoidectomy(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    public static final double trm(TransferParameters transferParameters, double d) {
        return wireman.monoploid(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public float beachfront(int component) {
        return this.min;
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public long cutely(float v0, float v1, float v2) {
        float fAttabal = (float) this.eotfFunc.attabal(v0);
        float fAttabal2 = (float) this.eotfFunc.attabal(v1);
        float fAttabal3 = (float) this.eotfFunc.attabal(v2);
        float[] fArr = this.transform;
        return (((long) Float.floatToRawIntBits(((fArr[0] * fAttabal) + (fArr[3] * fAttabal2)) + (fArr[6] * fAttabal3))) << 32) | (((long) Float.floatToRawIntBits((fArr[1] * fAttabal) + (fArr[4] * fAttabal2) + (fArr[7] * fAttabal3))) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || Rgb.class != other.getClass() || !super.equals(other)) {
            return false;
        }
        Rgb rgb = (Rgb) other;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !Intrinsics.wireman(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return Intrinsics.wireman(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (Intrinsics.wireman(this.oetfOrig, rgb.oetfOrig)) {
            return Intrinsics.wireman(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public float[] formularize(float[] v) {
        v[0] = (float) this.eotfFunc.attabal(v[0]);
        v[1] = (float) this.eotfFunc.attabal(v[1]);
        v[2] = (float) this.eotfFunc.attabal(v[2]);
        return wireman.triweekly(this.transform, v);
    }

    /* JADX INFO: renamed from: grimness, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f = this.min;
        int iFloatToIntBits = (iHashCode + (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : Float.floatToIntBits(f2))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        return this.transferParameters == null ? (((iHashCode2 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode() : iHashCode2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public float impassible(float v0, float v1, float v2) {
        float fAttabal = (float) this.eotfFunc.attabal(v0);
        float fAttabal2 = (float) this.eotfFunc.attabal(v1);
        float fAttabal3 = (float) this.eotfFunc.attabal(v2);
        float[] fArr = this.transform;
        return (fArr[2] * fAttabal) + (fArr[5] * fAttabal2) + (fArr[8] * fAttabal3);
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public float marial(int component) {
        return this.max;
    }

    /* JADX INFO: renamed from: merc, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    /* JADX INFO: renamed from: polder, reason: from getter */
    public final cutely getOetfFunc() {
        return this.oetfFunc;
    }

    /* JADX INFO: renamed from: restrictive, reason: from getter */
    public final cutely getEotfOrig() {
        return this.eotfOrig;
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public float[] saneness(float[] v) {
        wireman.triweekly(this.inverseTransform, v);
        v[0] = (float) this.oetfFunc.attabal(v[0]);
        v[1] = (float) this.oetfFunc.attabal(v[1]);
        v[2] = (float) this.oetfFunc.attabal(v[2]);
        return v;
    }

    /* JADX INFO: renamed from: saran, reason: from getter */
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    /* JADX INFO: renamed from: seminary, reason: from getter */
    public final cutely getOetfOrig() {
        return this.oetfOrig;
    }

    /* JADX INFO: renamed from: supplicat, reason: from getter */
    public final cutely getEotfFunc() {
        return this.eotfFunc;
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public long triweekly(float x, float y, float z, float a, dern colorSpace) {
        float[] fArr = this.inverseTransform;
        return dent.attabal((float) this.oetfFunc.attabal((fArr[0] * x) + (fArr[3] * y) + (fArr[6] * z)), (float) this.oetfFunc.attabal((fArr[1] * x) + (fArr[4] * y) + (fArr[7] * z)), (float) this.oetfFunc.attabal((fArr[2] * x) + (fArr[5] * y) + (fArr[8] * z)), a, colorSpace);
    }

    public static final double rotuma(double d) {
        return d;
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final TransferParameters transferParameters, int i) {
        this(str, fArr, whitePoint, null, (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new cutely() { // from class: androidx.compose.ui.graphics.colorspace.graveside
            @Override // androidx.compose.ui.graphics.colorspace.cutely
            public final double attabal(double d) {
                return Rgb.cuirassed(transferParameters, d);
            }
        } : new cutely() { // from class: androidx.compose.ui.graphics.colorspace.adultoid
            @Override // androidx.compose.ui.graphics.colorspace.cutely
            public final double attabal(double d) {
                return Rgb.stratoscope(transferParameters, d);
            }
        }, (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new cutely() { // from class: androidx.compose.ui.graphics.colorspace.dovishness
            @Override // androidx.compose.ui.graphics.colorspace.cutely
            public final double attabal(double d) {
                return Rgb.trm(transferParameters, d);
            }
        } : new cutely() { // from class: androidx.compose.ui.graphics.colorspace.gintrap
            @Override // androidx.compose.ui.graphics.colorspace.cutely
            public final double attabal(double d) {
                return Rgb.oilcan(transferParameters, d);
            }
        }, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, transferParameters, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final double d, float f, float f2, int i) {
        cutely cutelyVar;
        cutely cutelyVar2;
        if (d == 1.0d) {
            cutelyVar = f6469graveside;
        } else {
            cutelyVar = new cutely() { // from class: androidx.compose.ui.graphics.colorspace.polloi
                @Override // androidx.compose.ui.graphics.colorspace.cutely
                public final double attabal(double d2) {
                    return Rgb.preprohormone(d, d2);
                }
            };
        }
        cutely cutelyVar3 = cutelyVar;
        if (d == 1.0d) {
            cutelyVar2 = f6469graveside;
        } else {
            cutelyVar2 = new cutely() { // from class: androidx.compose.ui.graphics.colorspace.molybdenite
                @Override // androidx.compose.ui.graphics.colorspace.cutely
                public final double attabal(double d2) {
                    return Rgb.cord(d, d2);
                }
            };
        }
        this(str, fArr, whitePoint, null, cutelyVar3, cutelyVar2, f, f2, new TransferParameters(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i);
    }

    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }
}
