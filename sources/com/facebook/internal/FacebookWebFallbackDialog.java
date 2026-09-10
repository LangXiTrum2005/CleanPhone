package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class FacebookWebFallbackDialog extends WebDialog {
    public static final /* synthetic */ int p0 = 0;
    public boolean o0;

    @Override // com.facebook.internal.WebDialog
    public final Bundle c(String str) {
        Bundle bundleL = Utility.L(Uri.parse(str).getQuery());
        String string = bundleL.getString("bridge_args");
        bundleL.remove("bridge_args");
        if (!Utility.C(string)) {
            try {
                bundleL.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", BundleJSONConverter.a(new JSONObject(string)));
            } catch (JSONException unused) {
                HashSet hashSet = FacebookSdk.f15915a;
            }
        }
        String string2 = bundleL.getString("method_results");
        bundleL.remove("method_results");
        if (!Utility.C(string2)) {
            if (Utility.C(string2)) {
                string2 = JsonUtils.EMPTY_JSON;
            }
            try {
                bundleL.putBundle("com.facebook.platform.protocol.RESULT_ARGS", BundleJSONConverter.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                HashSet hashSet2 = FacebookSdk.f15915a;
            }
        }
        bundleL.remove("version");
        bundleL.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", NativeProtocol.m());
        return bundleL;
    }

    @Override // com.facebook.internal.WebDialog, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        WebView webView = this.e0;
        if (!this.l0 || this.j0 || webView == null || !webView.isShown()) {
            super.cancel();
        } else {
            if (this.o0) {
                return;
            }
            this.o0 = true;
            webView.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.internal.FacebookWebFallbackDialog.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (CrashShieldHandler.b(this)) {
                        return;
                    }
                    try {
                        FacebookWebFallbackDialog.super.cancel();
                    } catch (Throwable th) {
                        CrashShieldHandler.a(this, th);
                    }
                }
            }, 1500L);
        }
    }
}
