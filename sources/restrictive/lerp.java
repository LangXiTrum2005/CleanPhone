package restrictive;

import com.ironsource.C3414a2;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import supplicat.MutableRect;

/* JADX INFO: compiled from: Matrix.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001*B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ+\u0010 \u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J+\u0010\"\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010!J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Lrestrictive/lerp;", "", "", "values", "saneness", "([F)[F", "Lsupplicat/competently;", "point", "beachfront", "([FJ)J", "Lsupplicat/marial;", "rect", "", "competently", "([FLsupplicat/marial;)V", "m", "triweekly", "([F[F)V", "", "kowloon", "([F)Ljava/lang/String;", "impromptu", "([F)V", "", "degrees", "taiyuan", "([FF)V", "cutely", "apical", "x", "y", "z", "formularize", "([FFFF)V", "arytenoidectomy", "", "marial", "([F)I", C3414a2.d, "", "wireman", "([FLjava/lang/Object;)Z", "attabal", "[F", "getValues", "()[F", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class lerp {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final float[] values;

    public /* synthetic */ lerp(float[] fArr) {
        this.values = fArr;
    }

    public static final void apical(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = (fCos * f2) + (fSin * f3);
        float f5 = -fSin;
        float f6 = fArr[1];
        float f7 = fArr[5];
        float f8 = (fCos * f6) + (fSin * f7);
        float f9 = fArr[2];
        float f10 = fArr[6];
        float f11 = (fCos * f9) + (fSin * f10);
        float f12 = fArr[3];
        float f13 = fArr[7];
        fArr[0] = f4;
        fArr[1] = f8;
        fArr[2] = f11;
        fArr[3] = (fCos * f12) + (fSin * f13);
        fArr[4] = (f2 * f5) + (f3 * fCos);
        fArr[5] = (f6 * f5) + (f7 * fCos);
        fArr[6] = (f9 * f5) + (f10 * fCos);
        fArr[7] = (f5 * f12) + (fCos * f13);
    }

    public static final void arytenoidectomy(float[] fArr, float f, float f2, float f3) {
        float f4 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        float f5 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        float f6 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        float f7 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f7;
    }

    public static final /* synthetic */ lerp attabal(float[] fArr) {
        return new lerp(fArr);
    }

    public static final long beachfront(float[] fArr, long j) {
        float fApical = supplicat.competently.apical(j);
        float fFormularize = supplicat.competently.formularize(j);
        float f = 1 / (((fArr[3] * fApical) + (fArr[7] * fFormularize)) + fArr[15]);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return supplicat.impromptu.attabal(((fArr[0] * fApical) + (fArr[4] * fFormularize) + fArr[12]) * f, f * ((fArr[1] * fApical) + (fArr[5] * fFormularize) + fArr[13]));
    }

    public static final void competently(float[] fArr, MutableRect mutableRect) {
        long jBeachfront = beachfront(fArr, supplicat.impromptu.attabal(mutableRect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), mutableRect.getTop()));
        long jBeachfront2 = beachfront(fArr, supplicat.impromptu.attabal(mutableRect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), mutableRect.getBottom()));
        long jBeachfront3 = beachfront(fArr, supplicat.impromptu.attabal(mutableRect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String(), mutableRect.getTop()));
        long jBeachfront4 = beachfront(fArr, supplicat.impromptu.attabal(mutableRect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String(), mutableRect.getBottom()));
        mutableRect.taiyuan(Math.min(Math.min(supplicat.competently.apical(jBeachfront), supplicat.competently.apical(jBeachfront2)), Math.min(supplicat.competently.apical(jBeachfront3), supplicat.competently.apical(jBeachfront4))));
        mutableRect.apical(Math.min(Math.min(supplicat.competently.formularize(jBeachfront), supplicat.competently.formularize(jBeachfront2)), Math.min(supplicat.competently.formularize(jBeachfront3), supplicat.competently.formularize(jBeachfront4))));
        mutableRect.cutely(Math.max(Math.max(supplicat.competently.apical(jBeachfront), supplicat.competently.apical(jBeachfront2)), Math.max(supplicat.competently.apical(jBeachfront3), supplicat.competently.apical(jBeachfront4))));
        mutableRect.impromptu(Math.max(Math.max(supplicat.competently.formularize(jBeachfront), supplicat.competently.formularize(jBeachfront2)), Math.max(supplicat.competently.formularize(jBeachfront3), supplicat.competently.formularize(jBeachfront4))));
    }

    public static final void cutely(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[2];
        float f4 = fArr[4];
        float f5 = fArr[6];
        float f6 = fArr[8];
        float f7 = fArr[10];
        float f8 = fArr[12];
        float f9 = fArr[14];
        fArr[0] = (f2 * fCos) + (f3 * fSin);
        fArr[2] = ((-f2) * fSin) + (f3 * fCos);
        fArr[4] = (f4 * fCos) + (f5 * fSin);
        fArr[6] = ((-f4) * fSin) + (f5 * fCos);
        fArr[8] = (f6 * fCos) + (f7 * fSin);
        fArr[10] = ((-f6) * fSin) + (f7 * fCos);
        fArr[12] = (f8 * fCos) + (f9 * fSin);
        fArr[14] = ((-f8) * fSin) + (f9 * fCos);
    }

    public static /* synthetic */ float[] dern(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        }
        return saneness(fArr);
    }

    public static final void formularize(float[] fArr, float f, float f2, float f3) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    public static /* synthetic */ void impassible(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        formularize(fArr, f, f2, f3);
    }

    public static final void impromptu(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                i2++;
            }
            i++;
        }
    }

    public static String kowloon(float[] fArr) {
        return p002kotlin.text.arytenoidectomy.cutely("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static int marial(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static /* synthetic */ void monoploid(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        arytenoidectomy(fArr, f, f2, f3);
    }

    public static final void taiyuan(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[9];
        float f7 = fArr[10];
        float f8 = fArr[13];
        float f9 = fArr[14];
        fArr[1] = (f2 * fCos) - (f3 * fSin);
        fArr[2] = (f2 * fSin) + (f3 * fCos);
        fArr[5] = (f4 * fCos) - (f5 * fSin);
        fArr[6] = (f4 * fSin) + (f5 * fCos);
        fArr[9] = (f6 * fCos) - (f7 * fSin);
        fArr[10] = (f6 * fSin) + (f7 * fCos);
        fArr[13] = (f8 * fCos) - (f9 * fSin);
        fArr[14] = (f8 * fSin) + (f9 * fCos);
    }

    public static final void triweekly(float[] fArr, float[] fArr2) {
        float fSaneness = nosophobia.saneness(fArr, 0, fArr2, 0);
        float fSaneness2 = nosophobia.saneness(fArr, 0, fArr2, 1);
        float fSaneness3 = nosophobia.saneness(fArr, 0, fArr2, 2);
        float fSaneness4 = nosophobia.saneness(fArr, 0, fArr2, 3);
        float fSaneness5 = nosophobia.saneness(fArr, 1, fArr2, 0);
        float fSaneness6 = nosophobia.saneness(fArr, 1, fArr2, 1);
        float fSaneness7 = nosophobia.saneness(fArr, 1, fArr2, 2);
        float fSaneness8 = nosophobia.saneness(fArr, 1, fArr2, 3);
        float fSaneness9 = nosophobia.saneness(fArr, 2, fArr2, 0);
        float fSaneness10 = nosophobia.saneness(fArr, 2, fArr2, 1);
        float fSaneness11 = nosophobia.saneness(fArr, 2, fArr2, 2);
        float fSaneness12 = nosophobia.saneness(fArr, 2, fArr2, 3);
        float fSaneness13 = nosophobia.saneness(fArr, 3, fArr2, 0);
        float fSaneness14 = nosophobia.saneness(fArr, 3, fArr2, 1);
        float fSaneness15 = nosophobia.saneness(fArr, 3, fArr2, 2);
        float fSaneness16 = nosophobia.saneness(fArr, 3, fArr2, 3);
        fArr[0] = fSaneness;
        fArr[1] = fSaneness2;
        fArr[2] = fSaneness3;
        fArr[3] = fSaneness4;
        fArr[4] = fSaneness5;
        fArr[5] = fSaneness6;
        fArr[6] = fSaneness7;
        fArr[7] = fSaneness8;
        fArr[8] = fSaneness9;
        fArr[9] = fSaneness10;
        fArr[10] = fSaneness11;
        fArr[11] = fSaneness12;
        fArr[12] = fSaneness13;
        fArr[13] = fSaneness14;
        fArr[14] = fSaneness15;
        fArr[15] = fSaneness16;
    }

    public static boolean wireman(float[] fArr, Object obj) {
        return (obj instanceof lerp) && Intrinsics.wireman(fArr, ((lerp) obj).getValues());
    }

    public boolean equals(Object obj) {
        return wireman(this.values, obj);
    }

    public int hashCode() {
        return marial(this.values);
    }

    /* JADX INFO: renamed from: polloi, reason: from getter */
    public final /* synthetic */ float[] getValues() {
        return this.values;
    }

    public String toString() {
        return kowloon(this.values);
    }

    public static float[] saneness(float[] fArr) {
        return fArr;
    }
}
