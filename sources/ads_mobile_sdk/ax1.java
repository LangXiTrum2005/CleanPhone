package ads_mobile_sdk;

import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import saneness.baptize;
import saneness.huckleberry;
import saneness.underexposure;
import saneness.untruth;

/* JADX INFO: loaded from: classes.dex */
public final class ax1 implements huckleberry, baptize {
    public static ax1 f;
    public float a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public final untruth b;
    public final underexposure c;
    public cd0 d;
    public s4 e;

    public ax1(untruth untruthVar, underexposure underexposureVar) {
        this.b = untruthVar;
        this.c = underexposureVar;
    }

    @Override // saneness.huckleberry
    public final void a(boolean z) {
        if (!z) {
            s23.g.getClass();
            Handler handler = s23.i;
            if (handler != null) {
                handler.removeCallbacks(s23.k);
                s23.i = null;
                return;
            }
            return;
        }
        s23.g.getClass();
        if (s23.i == null) {
            Handler handler2 = new Handler(Looper.getMainLooper());
            s23.i = handler2;
            handler2.post(s23.j);
            s23.i.postDelayed(s23.k, 200L);
        }
    }

    public static ax1 a() {
        if (f == null) {
            f = new ax1(new untruth(), new underexposure());
        }
        return f;
    }
}
