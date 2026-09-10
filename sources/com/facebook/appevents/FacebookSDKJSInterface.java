package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import l7.g0;
import org.json.JSONException;
import org.json.JSONObject;
import q7.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00068GX\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/FacebookSDKJSInterface;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "pixelId", X3.i.f27798j0, "jsonString", "Lwj/r;", "sendEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "protocol", "Ljava/lang/String;", "getProtocol", "()Ljava/lang/String;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class FacebookSDKJSInterface {
    private static final String PARAMETER_FBSDK_PIXEL_REFERRAL = "_fb_pixel_referral_id";
    private final Context context;
    private final String protocol = "fbmq-0.1";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "FacebookSDKJSInterface";

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/facebook/appevents/FacebookSDKJSInterface$Companion;", "", "()V", "PARAMETER_FBSDK_PIXEL_REFERRAL", "", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "jsonStringToBundle", "Landroid/os/Bundle;", "jsonString", "jsonToBundle", "jsonObject", "Lorg/json/JSONObject;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle jsonStringToBundle(String jsonString) {
            try {
                return jsonToBundle(new JSONObject(jsonString));
            } catch (JSONException unused) {
                return new Bundle();
            }
        }

        private final Bundle jsonToBundle(JSONObject jsonObject) throws JSONException {
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jsonObject.keys();
            n.e(itKeys, "jsonObject.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                n.d(next, "null cannot be cast to non-null type kotlin.String");
                String str = next;
                bundle.putString(str, jsonObject.getString(str));
            }
            return bundle;
        }

        public final String getTAG() {
            return FacebookSDKJSInterface.access$getTAG$cp();
        }

        private Companion() {
        }
    }

    public FacebookSDKJSInterface(Context context) {
        this.context = context;
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        if (v7.a.b(FacebookSDKJSInterface.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th2) {
            v7.a.a(FacebookSDKJSInterface.class, th2);
            return null;
        }
    }

    @JavascriptInterface
    public final String getProtocol() {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            return this.protocol;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    @JavascriptInterface
    public final void sendEvent(String pixelId, String eventName, String jsonString) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (pixelId != null) {
                InternalAppEventsLogger internalAppEventsLoggerCreateInstance$default = InternalAppEventsLogger.Companion.createInstance$default(InternalAppEventsLogger.INSTANCE, this.context, null, 2, null);
                Bundle bundleJsonStringToBundle = INSTANCE.jsonStringToBundle(jsonString);
                bundleJsonStringToBundle.putString(PARAMETER_FBSDK_PIXEL_REFERRAL, pixelId);
                internalAppEventsLoggerCreateInstance$default.logEvent(eventName, bundleJsonStringToBundle);
                return;
            }
            ne.a aVar = x.f48792c;
            g0 g0Var = g0.f45137e;
            String TAG2 = TAG;
            n.e(TAG2, "TAG");
            aVar.s(g0Var, TAG2, "Can't bridge an event without a referral Pixel ID. Check your webview Pixel configuration");
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }
}
