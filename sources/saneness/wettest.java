package saneness;

import ads_mobile_sdk.s23;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class wettest implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = s23.i;
        if (handler != null) {
            handler.post(s23.j);
            s23.i.postDelayed(s23.k, 200L);
        }
    }
}
