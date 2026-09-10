package ads_mobile_sdk;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import saneness.capitulant;
import saneness.reuter;

/* JADX INFO: loaded from: classes.dex */
public abstract class ov1 extends AsyncTask {
    public capitulant a;
    public final reuter b;

    public ov1(zu2 zu2Var) {
        this.b = zu2Var;
    }

    public final void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(String str) {
        capitulant capitulantVar = this.a;
        if (capitulantVar != null) {
            pv1 pv1Var = (pv1) capitulantVar;
            pv1Var.c = null;
            pv1Var.a();
        }
    }
}
