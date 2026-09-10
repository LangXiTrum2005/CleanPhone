package saneness;

import ads_mobile_sdk.h;
import ads_mobile_sdk.nw1;
import ads_mobile_sdk.r4;
import ads_mobile_sdk.rv1;
import ads_mobile_sdk.s4;
import ads_mobile_sdk.t4;
import ads_mobile_sdk.zu2;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class mahratti extends h {
    public mahratti(zu2 zu2Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zu2Var, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (nw1.c(this.d, ((zu2) this.b).a)) {
            return null;
        }
        reuter reuterVar = this.b;
        JSONObject jSONObject = this.d;
        ((zu2) reuterVar).a = jSONObject;
        return jSONObject.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.ov1, android.os.AsyncTask
    public final void onPostExecute(String str) {
        s4 s4Var;
        if (!TextUtils.isEmpty(str) && (s4Var = s4.c) != null) {
            for (r4 r4Var : Collections.unmodifiableCollection(s4Var.a)) {
                if (this.c.contains(r4Var.g)) {
                    t4 t4Var = r4Var.d;
                    if (this.e >= t4Var.d) {
                        t4Var.c = 2;
                        rv1.a.a((WebView) t4Var.b.get(), "setNativeViewHierarchy", str, t4Var.a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }
}
