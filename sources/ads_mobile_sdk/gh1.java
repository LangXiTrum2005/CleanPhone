package ads_mobile_sdk;

import android.net.Uri;
import com.ironsource.X3;
import java.io.File;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;
import p002kotlin.time.DurationUnit;
import saneness.blighty;
import saneness.grout;
import saneness.hobby;
import saneness.strother;

/* JADX INFO: loaded from: classes.dex */
public final class gh1 implements strother {
    public static final long d;
    public static final long e;
    public final jk0 a;
    public final blighty b;
    public final hobby c;

    static {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        d = p002kotlin.time.dern.molybdenite(60, DurationUnit.SECONDS);
        e = p002kotlin.time.saneness.gintrap(p002kotlin.time.dern.molybdenite(1, DurationUnit.HOURS));
    }

    public gh1(jk0 flags, blighty userAgentProvider, hobby httpClient) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.a = flags;
        this.b = userAgentProvider;
        this.c = httpClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r12 == r2) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.gq0 r10, android.webkit.WebResourceRequest r11, wretchedly.dern r12) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.gh1.a(ads_mobile_sdk.gq0, android.webkit.WebResourceRequest, wretchedly.dern):java.lang.Object");
    }

    public final String a(gq0 webView, String requestUrl) {
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(webView, "webView");
        return a(Uri.parse(requestUrl), webView);
    }

    public final String a(Uri uri, gq0 gq0Var) {
        String path = uri.getPath();
        if (path == null || !dovishness.stratoscope(new File(path).getName(), "mraid.js", true)) {
            return null;
        }
        if (gq0Var.l.get()) {
            jk0 jk0Var = this.a;
            grout.attabal(jk0Var, "gad:mraid:url_expanded_banner", X3.i.W, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js", "defaultValue");
            return (String) jk0Var.a("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js", zk.o);
        }
        if (gq0Var.e().a == ha3.FULLSCREEN) {
            jk0 jk0Var2 = this.a;
            grout.attabal(jk0Var2, "gad:mraid:url_interstitial", X3.i.W, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js", "defaultValue");
            return (String) jk0Var2.a("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js", zk.o);
        }
        jk0 jk0Var3 = this.a;
        grout.attabal(jk0Var3, "gad:mraid:url_banner", X3.i.W, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js", "defaultValue");
        return (String) jk0Var3.a("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js", zk.o);
    }
}
