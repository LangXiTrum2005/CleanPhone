package ads_mobile_sdk;

import android.content.Context;
import com.ironsource.X3;
import http.kowloon;
import http.monoploid;
import java.util.Set;
import p002kotlin.collections.creditor;
import p002kotlin.collections.privatdozent;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.lateral;

/* JADX INFO: loaded from: classes.dex */
public abstract class ml {
    public final Context a;
    public final lateral b;
    public final jk0 c;

    public ml(Context context, lateral webViewProfileNameProvider, jk0 flags) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webViewProfileNameProvider, "webViewProfileNameProvider");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = context;
        this.b = webViewProfileNameProvider;
        this.c = flags;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0049  */
    public final void a(ms executor, boolean z, t83 callback) {
        Set<String> setWireman;
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        jk0 jk0Var = this.c;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:webview_profile:enabled", X3.i.W);
        Boolean bool = Boolean.FALSE;
        jk jkVar = zk.b;
        if (((Boolean) jk0Var.a("gads:webview_profile:enabled", bool, jkVar)).booleanValue()) {
            jk0 jk0Var2 = this.c;
            jk0Var2.getClass();
            Intrinsics.checkNotNullParameter("gads:init_profile_during_webview_startup:enabled", X3.i.W);
            if (((Boolean) jk0Var2.a("gads:init_profile_during_webview_startup:enabled", bool, jkVar)).booleanValue()) {
                setWireman = creditor.impromptu("GMA_WEBVIEW_PROFILE", "Default");
            } else {
                setWireman = privatdozent.wireman("Default");
            }
        } else {
            setWireman = privatdozent.wireman("Default");
        }
        kowloon.arytenoidectomy(this.a, new monoploid.saneness(executor).dern(z).saneness(setWireman).attabal(), callback);
    }
}
