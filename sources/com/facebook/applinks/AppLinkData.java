package com.facebook.applinks;

import com.facebook.FacebookException;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AppLinkData {

    /* JADX INFO: renamed from: com.facebook.applinks.AppLinkData$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                try {
                    new JSONObject().put("event", "DEFERRED_APP_LINK");
                    AttributionIdentifiers.Companion.a(null);
                    throw null;
                } catch (JSONException e2) {
                    throw new FacebookException("An error occurred while preparing deferred app link", e2);
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
            }
        }
    }

    public interface CompletionHandler {
    }
}
