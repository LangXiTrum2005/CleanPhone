package androidx.compose.ui.graphics.colorspace;

import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import restrictive.dent;

/* JADX INFO: compiled from: Oklab.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/impassible;", "Landroidx/compose/ui/graphics/colorspace/dern;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "beachfront", "(I)F", "marial", "", "v", "formularize", "([F)[F", "v0", "v1", "v2", "", "cutely", "(FFF)J", "impassible", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Lrestrictive/overspeculate;", "triweekly", "(FFFFLandroidx/compose/ui/graphics/colorspace/dern;)J", "saneness", "wireman", "attabal", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class impassible extends dern {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final float[] f6535beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final float[] f6536competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final float[] f6537impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final float[] f6538marial;

    static {
        float[] transform = attabal.INSTANCE.attabal().getTransform();
        apical apicalVar = apical.f6488attabal;
        float[] fArrFormularize = wireman.formularize(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, wireman.marial(transform, apicalVar.saneness().dern(), apicalVar.marial().dern()));
        f6538marial = fArrFormularize;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f6535beachfront = fArr;
        f6536competently = wireman.apical(fArrFormularize);
        f6537impromptu = wireman.apical(fArr);
    }

    public impassible(String str, int i) {
        super(str, saneness.INSTANCE.attabal(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public float beachfront(int component) {
        if (component == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public long cutely(float v0, float v1, float v2) {
        if (v0 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            v0 = 0.0f;
        }
        if (v0 > 1.0f) {
            v0 = 1.0f;
        }
        if (v1 < -0.5f) {
            v1 = -0.5f;
        }
        if (v1 > 0.5f) {
            v1 = 0.5f;
        }
        if (v2 < -0.5f) {
            v2 = -0.5f;
        }
        float f = v2 <= 0.5f ? v2 : 0.5f;
        float[] fArr = f6537impromptu;
        float f2 = (fArr[0] * v0) + (fArr[3] * v1) + (fArr[6] * f);
        float f3 = (fArr[1] * v0) + (fArr[4] * v1) + (fArr[7] * f);
        float f4 = (fArr[2] * v0) + (fArr[5] * v1) + (fArr[8] * f);
        float f5 = f2 * f2 * f2;
        float f6 = f3 * f3 * f3;
        float f7 = f4 * f4 * f4;
        float[] fArr2 = f6536competently;
        return (((long) Float.floatToRawIntBits(((fArr2[0] * f5) + (fArr2[3] * f6)) + (fArr2[6] * f7))) << 32) | (((long) Float.floatToRawIntBits((fArr2[1] * f5) + (fArr2[4] * f6) + (fArr2[7] * f7))) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public float[] formularize(float[] v) {
        float f = v[0];
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        v[0] = f;
        float f2 = v[1];
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        v[1] = f2;
        float f3 = v[2];
        float f4 = f3 >= -0.5f ? f3 : -0.5f;
        v[2] = f4 <= 0.5f ? f4 : 0.5f;
        wireman.triweekly(f6537impromptu, v);
        float f5 = v[0];
        v[0] = f5 * f5 * f5;
        float f6 = v[1];
        v[1] = f6 * f6 * f6;
        float f7 = v[2];
        v[2] = f7 * f7 * f7;
        wireman.triweekly(f6536competently, v);
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public float impassible(float v0, float v1, float v2) {
        if (v0 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            v0 = 0.0f;
        }
        if (v0 > 1.0f) {
            v0 = 1.0f;
        }
        if (v1 < -0.5f) {
            v1 = -0.5f;
        }
        if (v1 > 0.5f) {
            v1 = 0.5f;
        }
        if (v2 < -0.5f) {
            v2 = -0.5f;
        }
        float f = v2 <= 0.5f ? v2 : 0.5f;
        float[] fArr = f6537impromptu;
        float f2 = (fArr[0] * v0) + (fArr[3] * v1) + (fArr[6] * f);
        float f3 = (fArr[1] * v0) + (fArr[4] * v1) + (fArr[7] * f);
        float f4 = (fArr[2] * v0) + (fArr[5] * v1) + (fArr[8] * f);
        float f5 = f2 * f2 * f2;
        float f6 = f3 * f3 * f3;
        float[] fArr2 = f6536competently;
        return (fArr2[2] * f5) + (fArr2[5] * f6) + (fArr2[8] * f4 * f4 * f4);
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public float marial(int component) {
        return component == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public float[] saneness(float[] v) {
        wireman.triweekly(f6538marial, v);
        v[0] = itchy.saneness.attabal(v[0]);
        v[1] = itchy.saneness.attabal(v[1]);
        v[2] = itchy.saneness.attabal(v[2]);
        wireman.triweekly(f6535beachfront, v);
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public long triweekly(float x, float y, float z, float a, dern colorSpace) {
        float[] fArr = f6538marial;
        float f = (fArr[0] * x) + (fArr[3] * y) + (fArr[6] * z);
        float f2 = (fArr[1] * x) + (fArr[4] * y) + (fArr[7] * z);
        float f3 = (fArr[2] * x) + (fArr[5] * y) + (fArr[8] * z);
        float fAttabal = itchy.saneness.attabal(f);
        float fAttabal2 = itchy.saneness.attabal(f2);
        float fAttabal3 = itchy.saneness.attabal(f3);
        float[] fArr2 = f6535beachfront;
        return dent.attabal((fArr2[0] * fAttabal) + (fArr2[3] * fAttabal2) + (fArr2[6] * fAttabal3), (fArr2[1] * fAttabal) + (fArr2[4] * fAttabal2) + (fArr2[7] * fAttabal3), (fArr2[2] * fAttabal) + (fArr2[5] * fAttabal2) + (fArr2[8] * fAttabal3), a, colorSpace);
    }
}
