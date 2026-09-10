package q7;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends l0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f48708o = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f48709n;

    public static void g(l lVar) {
        super.cancel();
    }

    @Override // q7.l0
    public final Bundle c(String str) {
        Bundle bundleE = e0.E(Uri.parse(str).getQuery());
        String string = bundleE.getString("bridge_args");
        bundleE.remove("bridge_args");
        if (!e0.w(string)) {
            try {
                bundleE.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", e.a(new JSONObject(string)));
            } catch (JSONException e10) {
                e0.C("q7.l", "Unable to parse bridge_args JSON", e10);
            }
        }
        String string2 = bundleE.getString("method_results");
        bundleE.remove("method_results");
        if (!e0.w(string2)) {
            try {
                bundleE.putBundle("com.facebook.platform.protocol.RESULT_ARGS", e.a(new JSONObject(string2)));
            } catch (JSONException e11) {
                e0.C("q7.l", "Unable to parse bridge_args JSON", e11);
            }
        }
        bundleE.remove("version");
        z zVar = z.f48798a;
        int iIntValue = 0;
        if (!v7.a.b(z.class)) {
            try {
                iIntValue = z.f48801d[0].intValue();
            } catch (Throwable th2) {
                v7.a.a(z.class, th2);
            }
        }
        bundleE.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", iIntValue);
        return bundleE;
    }

    @Override // q7.l0, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        k0 k0Var = this.f48714d;
        if (!this.f48721k || this.f48719i || k0Var == null || !k0Var.isShown()) {
            super.cancel();
        } else {
            if (this.f48709n) {
                return;
            }
            this.f48709n = true;
            k0Var.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new q1.c(this, 1), 1500L);
        }
    }
}
