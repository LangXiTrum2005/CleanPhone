package ads_mobile_sdk;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import saneness.inrooted;

/* JADX INFO: loaded from: classes.dex */
public final class f62 implements inrooted {
    public final k62 a;

    public f62(k62 k62Var) {
        this.a = k62Var;
    }

    public final void a(b42 b42Var) {
        k62 k62Var = this.a;
        hc1 hc1Var = k62.c;
        hc1Var.a("prewarm(%s)", k62Var.b);
        if (k62Var.a == null) {
            Object[] objArr = {"Play Store not found."};
            if (Log.isLoggable("PlayCore", 6)) {
                hc1.a(hc1Var.a, "error: %s", objArr);
                return;
            }
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        qm2 qm2Var = k62Var.a;
        i62 i62Var = new i62(k62Var, taskCompletionSource, b42Var, taskCompletionSource);
        qm2Var.getClass();
        qm2Var.b(new km2(qm2Var, taskCompletionSource, taskCompletionSource, i62Var));
    }
}
