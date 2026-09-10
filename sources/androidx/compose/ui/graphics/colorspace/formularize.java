package androidx.compose.ui.graphics.colorspace;

import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import restrictive.dent;

/* JADX INFO: compiled from: Lab.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/formularize;", "Landroidx/compose/ui/graphics/colorspace/dern;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "beachfront", "(I)F", "marial", "", "v", "formularize", "([F)[F", "v0", "v1", "v2", "", "cutely", "(FFF)J", "impassible", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Lrestrictive/overspeculate;", "triweekly", "(FFFFLandroidx/compose/ui/graphics/colorspace/dern;)J", "saneness", "wireman", "attabal", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class formularize extends dern {
    public formularize(String str, int i) {
        super(str, saneness.INSTANCE.attabal(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public float beachfront(int component) {
        if (component == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public long cutely(float v0, float v1, float v2) {
        if (v0 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            v0 = 0.0f;
        }
        if (v0 > 100.0f) {
            v0 = 100.0f;
        }
        if (v1 < -128.0f) {
            v1 = -128.0f;
        }
        if (v1 > 128.0f) {
            v1 = 128.0f;
        }
        float f = (v0 + 16.0f) / 116.0f;
        float f2 = (v1 * 0.002f) + f;
        float f3 = f2 > 0.20689656f ? f2 * f2 * f2 : (f2 - 0.13793103f) * 0.12841855f;
        float f4 = f > 0.20689656f ? f * f * f : (f - 0.13793103f) * 0.12841855f;
        apical apicalVar = apical.f6488attabal;
        return (((long) Float.floatToRawIntBits(f4 * apicalVar.dern()[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f3 * apicalVar.dern()[0])) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public float[] formularize(float[] v) {
        float f = v[0];
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        v[0] = f;
        float f2 = v[1];
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        v[1] = f2;
        float f3 = v[2];
        float f4 = f3 >= -128.0f ? f3 : -128.0f;
        float f5 = f4 <= 128.0f ? f4 : 128.0f;
        v[2] = f5;
        float f6 = (f + 16.0f) / 116.0f;
        float f7 = (f2 * 0.002f) + f6;
        float f8 = f6 - (f5 * 0.005f);
        float f9 = f7 > 0.20689656f ? f7 * f7 * f7 : (f7 - 0.13793103f) * 0.12841855f;
        float f10 = f6 > 0.20689656f ? f6 * f6 * f6 : (f6 - 0.13793103f) * 0.12841855f;
        float f11 = f8 > 0.20689656f ? f8 * f8 * f8 : (f8 - 0.13793103f) * 0.12841855f;
        apical apicalVar = apical.f6488attabal;
        v[0] = f9 * apicalVar.dern()[0];
        v[1] = f10 * apicalVar.dern()[1];
        v[2] = f11 * apicalVar.dern()[2];
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public float impassible(float v0, float v1, float v2) {
        if (v0 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            v0 = 0.0f;
        }
        if (v0 > 100.0f) {
            v0 = 100.0f;
        }
        if (v2 < -128.0f) {
            v2 = -128.0f;
        }
        if (v2 > 128.0f) {
            v2 = 128.0f;
        }
        float f = ((v0 + 16.0f) / 116.0f) - (v2 * 0.005f);
        return (f > 0.20689656f ? f * f * f : 0.12841855f * (f - 0.13793103f)) * apical.f6488attabal.dern()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public float marial(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public float[] saneness(float[] v) {
        float f = v[0];
        apical apicalVar = apical.f6488attabal;
        float f2 = f / apicalVar.dern()[0];
        float f3 = v[1] / apicalVar.dern()[1];
        float f4 = v[2] / apicalVar.dern()[2];
        float fCbrt = f2 > 0.008856452f ? (float) Math.cbrt(f2) : (f2 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f3 > 0.008856452f ? (float) Math.cbrt(f3) : (f3 * 7.787037f) + 0.13793103f;
        float fCbrt3 = f4 > 0.008856452f ? (float) Math.cbrt(f4) : (f4 * 7.787037f) + 0.13793103f;
        float f5 = (116.0f * fCbrt2) - 16.0f;
        float f6 = (fCbrt - fCbrt2) * 500.0f;
        float f7 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f5 = 0.0f;
        }
        if (f5 > 100.0f) {
            f5 = 100.0f;
        }
        v[0] = f5;
        if (f6 < -128.0f) {
            f6 = -128.0f;
        }
        if (f6 > 128.0f) {
            f6 = 128.0f;
        }
        v[1] = f6;
        if (f7 < -128.0f) {
            f7 = -128.0f;
        }
        v[2] = f7 <= 128.0f ? f7 : 128.0f;
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.dern
    public long triweekly(float x, float y, float z, float a, dern colorSpace) {
        apical apicalVar = apical.f6488attabal;
        float f = x / apicalVar.dern()[0];
        float f2 = y / apicalVar.dern()[1];
        float f3 = z / apicalVar.dern()[2];
        float fCbrt = f > 0.008856452f ? (float) Math.cbrt(f) : (f * 7.787037f) + 0.13793103f;
        float fCbrt2 = f2 > 0.008856452f ? (float) Math.cbrt(f2) : (f2 * 7.787037f) + 0.13793103f;
        float f4 = (116.0f * fCbrt2) - 16.0f;
        float f5 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f3 > 0.008856452f ? (float) Math.cbrt(f3) : (f3 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f4 = 0.0f;
        }
        if (f4 > 100.0f) {
            f4 = 100.0f;
        }
        if (f5 < -128.0f) {
            f5 = -128.0f;
        }
        if (f5 > 128.0f) {
            f5 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return dent.attabal(f4, f5, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, a, colorSpace);
    }
}
