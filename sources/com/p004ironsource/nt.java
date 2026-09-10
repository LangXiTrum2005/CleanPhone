package com.p004ironsource;

import android.util.Log;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.logger.d;
import com.p004ironsource.mediationsdk.server.HttpFunctions;
import com.p004ironsource.mediationsdk.server.ServerURL;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class nt {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26317c;

        public a(String str, boolean z2, int i2) {
            this.f26315a = str;
            this.f26316b = z2;
            this.f26317c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            nt.c(this.f26315a, this.f26316b, this.f26317c);
        }
    }

    public static void b(String str, boolean z2, int i2) {
        Thread thread = new Thread(new a(str, z2, i2), "callAsyncRequestURL");
        thread.setUncaughtExceptionHandler(new d());
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, boolean z2, int i2) {
        try {
            new JSONObject(HttpFunctions.getStringFromURL(ServerURL.getRequestURL(str, z2, i2)));
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NETWORK, "callRequestURL(reqUrl:" + str + ", hit:" + z2 + ")", 1);
        } catch (Throwable th) {
            StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("callRequestURL(reqUrl:", th);
            if (str == null) {
                str = AbstractJsonLexerKt.NULL;
            }
            sbP.append(str);
            sbP.append(", hit:");
            sbP.append(z2);
            sbP.append(")");
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NETWORK, sbP.toString() + ", e:" + Log.getStackTraceString(th), 0);
        }
    }
}
