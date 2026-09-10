package ads_mobile_sdk;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: loaded from: classes.dex */
public final class w73 implements AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ x73 a;

    public w73(x73 x73Var) {
        this.a = x73Var;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        synchronized (this.a) {
            try {
                if (z) {
                    x73 x73Var = this.a;
                    x73Var.a.getClass();
                    x73Var.d = System.currentTimeMillis();
                    this.a.g = true;
                } else {
                    this.a.a.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    x73 x73Var2 = this.a;
                    long j = x73Var2.e;
                    if (j > 0 && jCurrentTimeMillis >= j) {
                        x73Var2.f = jCurrentTimeMillis - j;
                    }
                    x73Var2.g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
