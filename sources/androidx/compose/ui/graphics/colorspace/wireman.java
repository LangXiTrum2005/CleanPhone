package androidx.compose.ui.graphics.colorspace;

import androidx.collection.yemenite;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ColorSpace.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0011\u001a*\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a(\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a%\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u001aO\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aO\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001d\u0010\u001c\u001a?\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001e\u0010\u0017\u001a?\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001f\u0010\u0017\u001a\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010$\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020#H\u0000¢\u0006\u0004\b$\u0010%\u001a\u0017\u0010'\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0000¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010+\u001a\u00020#2\u0006\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020#H\u0000¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010-\u001a\u00020#2\u0006\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020#H\u0000¢\u0006\u0004\b-\u0010,\u001a\u001f\u0010.\u001a\u00020#2\u0006\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020#H\u0000¢\u0006\u0004\b.\u0010,\u001a'\u00102\u001a\u00020#2\u0006\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020#H\u0000¢\u0006\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/dern;", "source", "destination", "Landroidx/compose/ui/graphics/colorspace/triweekly;", "intent", "Landroidx/compose/ui/graphics/colorspace/impromptu;", "cutely", "(Landroidx/compose/ui/graphics/colorspace/dern;Landroidx/compose/ui/graphics/colorspace/dern;I)Landroidx/compose/ui/graphics/colorspace/impromptu;", "impromptu", "Landroidx/compose/ui/graphics/colorspace/preprohormone;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/attabal;", "adaptation", "dern", "(Landroidx/compose/ui/graphics/colorspace/dern;Landroidx/compose/ui/graphics/colorspace/preprohormone;Landroidx/compose/ui/graphics/colorspace/attabal;)Landroidx/compose/ui/graphics/colorspace/dern;", "", "x", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "g", "kowloon", "(DDDDDD)D", "monoploid", "e", "f", "arytenoidectomy", "(DDDDDDDD)D", "polloi", "attabal", "saneness", "", "beachfront", "(Landroidx/compose/ui/graphics/colorspace/preprohormone;Landroidx/compose/ui/graphics/colorspace/preprohormone;)Z", "", "competently", "([F[F)Z", "m", "apical", "([F)[F", "lhs", "rhs", "formularize", "([F[F)[F", "triweekly", "impassible", "matrix", "srcWhitePoint", "dstWhitePoint", "marial", "([F[F[F)[F", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class wireman {
    public static final float[] apical(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final double arytenoidectomy(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 * d4 ? (Math.pow(d - d6, 1.0d / d8) - d3) / d2 : (d - d7) / d4;
    }

    public static final double attabal(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(kowloon(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    public static final boolean beachfront(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean competently(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(fArr[i], fArr2[i]) != 0 && Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final impromptu cutely(dern dernVar, dern dernVar2, int i) {
        if (dernVar == dernVar2) {
            return impromptu.INSTANCE.dern(dernVar);
        }
        long jCompetently = dernVar.getCom.ironsource.L6.B java.lang.String();
        saneness.Companion companion = saneness.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (!saneness.marial(jCompetently, companion.saneness()) || !saneness.marial(dernVar2.getCom.ironsource.L6.B java.lang.String(), companion.saneness())) {
            return new impromptu(dernVar, dernVar2, i, defaultConstructorMarker);
        }
        Intrinsics.competently(dernVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        Intrinsics.competently(dernVar2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new impromptu.saneness((Rgb) dernVar, (Rgb) dernVar2, i, defaultConstructorMarker);
    }

    public static final dern dern(dern dernVar, WhitePoint whitePoint, attabal attabalVar) {
        if (saneness.marial(dernVar.getCom.ironsource.L6.B java.lang.String(), saneness.INSTANCE.saneness())) {
            Intrinsics.competently(dernVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) dernVar;
            if (!beachfront(rgb.getWhitePoint(), whitePoint)) {
                return new Rgb(rgb, formularize(marial(attabalVar.getTransform(), rgb.getWhitePoint().dern(), whitePoint.dern()), rgb.getTransform()), whitePoint);
            }
        }
        return dernVar;
    }

    public static final float[] formularize(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = fArr[1];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = (f8 * f2) + (f9 * f4) + (f10 * f6);
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f2 * f12) + (f4 * f13) + (f6 * f14);
        float f16 = fArr2[3];
        float f17 = fArr2[4];
        float f18 = fArr2[5];
        float f19 = (f * f16) + (f3 * f17) + (f5 * f18);
        float f20 = (f8 * f16) + (f9 * f17) + (f10 * f18);
        float f21 = (f16 * f12) + (f17 * f13) + (f18 * f14);
        float f22 = fArr2[6];
        float f23 = fArr2[7];
        float f24 = (f * f22) + (f3 * f23);
        float f25 = fArr2[8];
        return new float[]{f7, f11, f15, f19, f20, f21, f24 + (f5 * f25), (f8 * f22) + (f9 * f23) + (f10 * f25), (f12 * f22) + (f13 * f23) + (f14 * f25)};
    }

    public static final float[] impassible(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0] * f;
        float f3 = fArr[1];
        float f4 = fArr2[1] * f3;
        float f5 = fArr[2];
        return new float[]{f2, f4, fArr2[2] * f5, fArr2[3] * f, fArr2[4] * f3, fArr2[5] * f5, f * fArr2[6], f3 * fArr2[7], f5 * fArr2[8]};
    }

    public static final impromptu impromptu(dern dernVar, dern dernVar2, int i) {
        int iWireman = dernVar.getId();
        int iWireman2 = dernVar2.getId();
        if ((iWireman | iWireman2) < 0) {
            return cutely(dernVar, dernVar2, i);
        }
        yemenite<impromptu> yemeniteVarAttabal = taiyuan.attabal();
        int i2 = iWireman | (iWireman2 << 6) | (i << 12);
        impromptu impromptuVarDern = yemeniteVarAttabal.dern(i2);
        if (impromptuVarDern == null) {
            impromptuVarDern = cutely(dernVar, dernVar2, i);
            yemeniteVarAttabal.molybdenite(i2, impromptuVarDern);
        }
        return impromptuVarDern;
    }

    public static final double kowloon(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static final float[] marial(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrTriweekly = triweekly(fArr, fArr2);
        float[] fArrTriweekly2 = triweekly(fArr, fArr3);
        return formularize(apical(fArr), impassible(new float[]{fArrTriweekly2[0] / fArrTriweekly[0], fArrTriweekly2[1] / fArrTriweekly[1], fArrTriweekly2[2] / fArrTriweekly[2]}, fArr));
    }

    public static final double monoploid(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d4 * d;
    }

    public static final double polloi(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d8) + d6 : (d4 * d) + d7;
    }

    public static final double saneness(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(monoploid(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    public static /* synthetic */ impromptu taiyuan(dern dernVar, dern dernVar2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dernVar2 = competently.f6507attabal.impromptu();
        }
        if ((i2 & 2) != 0) {
            i = triweekly.INSTANCE.saneness();
        }
        return impromptu(dernVar, dernVar2, i);
    }

    public static final float[] triweekly(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        return fArr2;
    }

    public static /* synthetic */ dern wireman(dern dernVar, WhitePoint whitePoint, attabal attabalVar, int i, Object obj) {
        if ((i & 2) != 0) {
            attabalVar = attabal.INSTANCE.attabal();
        }
        return dern(dernVar, whitePoint, attabalVar);
    }
}
