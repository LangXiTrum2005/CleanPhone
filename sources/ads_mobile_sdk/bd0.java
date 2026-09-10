package ads_mobile_sdk;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public final class bd0 implements Runnable {
    public final /* synthetic */ cd0 a;

    public bd0(cd0 cd0Var) {
        this.a = cd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        cd0 cd0Var = this.a;
        int streamVolume = cd0Var.c.getStreamVolume(3);
        int streamMaxVolume = cd0Var.c.getStreamMaxVolume(3);
        cd0Var.d.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            f = streamVolume / streamMaxVolume;
            if (f > 1.0f) {
                f = 1.0f;
            }
        }
        this.a.g.set(false);
        if (((Float) this.a.f.getAndSet(Float.valueOf(f))).floatValue() != f) {
            this.a.a.post(new ad0(this, f));
        }
    }
}
