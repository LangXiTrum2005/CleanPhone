package com.kochava.core.errorreport.internal;

import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.network.internal.NetworkValidateListener;

/* JADX INFO: loaded from: classes5.dex */
public final class ErrorReport implements ErrorReportApi, Runnable, NetworkValidateListener {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            synchronized (this) {
                JsonObject jsonObjectW = JsonObject.w();
                jsonObjectW.g("action", "error");
                jsonObjectW.g("kochava_app_id", null);
                JsonObject.w();
                JsonObject.w().g("kochava_app_id", null);
                throw null;
            }
        } catch (Throwable unused) {
        }
    }
}
