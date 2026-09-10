package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MX implements ID {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IX f3407a;
    public final List b;
    public final int c;
    public final C4813v60 d;
    public final HY e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public MX(IX ix, List list, int i, C4813v60 c4813v60, HY hy, int i2, int i3, int i4) {
        AbstractC2995aW.q(ix, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(list, "interceptors");
        AbstractC2995aW.q(hy, J0.REQUEST_KEY_EXTRA);
        this.f3407a = ix;
        this.b = list;
        this.c = i;
        this.d = c4813v60;
        this.e = hy;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static MX a(MX mx, int i, C4813v60 c4813v60, HY hy, int i2) {
        if ((i2 & 1) != 0) {
            i = mx.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            c4813v60 = mx.d;
        }
        C4813v60 c4813v61 = c4813v60;
        if ((i2 & 4) != 0) {
            hy = mx.e;
        }
        HY hy2 = hy;
        int i4 = mx.f;
        int i5 = mx.g;
        int i6 = mx.h;
        mx.getClass();
        AbstractC2995aW.q(hy2, J0.REQUEST_KEY_EXTRA);
        return new MX(mx.f3407a, mx.b, i3, c4813v61, hy2, i4, i5, i6);
    }

    public final C5021xZ b(HY hy) {
        AbstractC2995aW.q(hy, J0.REQUEST_KEY_EXTRA);
        List list = this.b;
        int size = list.size();
        int i = this.c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.i++;
        C4813v60 c4813v60 = this.d;
        if (c4813v60 != null) {
            if (!((C4352ps) c4813v60.d).b(hy.f3175a)) {
                throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        MX mxA = a(this, i2, null, hy, 58);
        JD jd = (JD) list.get(i);
        C5021xZ c5021xZIntercept = jd.intercept(mxA);
        if (c5021xZIntercept == null) {
            throw new NullPointerException("interceptor " + jd + " returned null");
        }
        if (c4813v60 != null && i2 < list.size() && mxA.i != 1) {
            throw new IllegalStateException(("network interceptor " + jd + " must call proceed() exactly once").toString());
        }
        if (c5021xZIntercept.g != null) {
            return c5021xZIntercept;
        }
        throw new IllegalStateException(("interceptor " + jd + " returned a response with no body").toString());
    }
}
