package ads_mobile_sdk;

import android.view.View;
import android.webkit.WebView;
import http.arytenoidectomy;
import http.kowloon;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.support_lib_boundary.util.Features;
import saneness.dovishness;
import saneness.glassmaker;
import saneness.labourwallah;

/* JADX INFO: loaded from: classes.dex */
public final class d91 {
    public final w02 a;
    public final WebView b;
    public final boolean c;
    public dovishness d;
    public final HashMap e = new HashMap();
    public final wk0 f = new wk0();

    public d91(w02 w02Var, WebView webView, boolean z) {
        labourwallah.attabal();
        labourwallah.saneness(w02Var, "Partner is null");
        labourwallah.saneness(webView, "WebView is null");
        this.a = w02Var;
        this.b = webView;
        this.c = z;
        if (z) {
            a(webView);
        }
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view) {
        dovishness dovishnessVar = this.d;
        if ((dovishnessVar == null ? null : (View) dovishnessVar.get()) == view) {
            return;
        }
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            ((glassmaker) it.next()).a(view);
        }
        this.d = new dovishness(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        p4 p4VarB;
        fw fwVar = fw.b;
        iv0 iv0Var = iv0.b;
        sz1 sz1Var = sz1.c;
        o4 o4VarA = o4.a(fwVar, iv0Var, sz1Var, sz1Var, false);
        if (this.c) {
            p4VarB = p4.a(this.a, this.b, null, null);
        } else {
            p4VarB = p4.b(this.a, this.b, null, null);
        }
        r4 r4Var = new r4(o4VarA, p4VarB, str);
        this.e.put(str, r4Var);
        dovishness dovishnessVar = this.d;
        r4Var.a(dovishnessVar != null ? (View) dovishnessVar.get() : null);
        for (uk0 uk0Var : this.f.a) {
            View view = (View) uk0Var.a.get();
            vk0 vk0Var = uk0Var.c;
            String str2 = uk0Var.d;
            if (!r4Var.f) {
                r4Var.b.a(view, vk0Var, str2);
            }
        }
        r4Var.b();
    }

    public final void a() {
        if (arytenoidectomy.attabal(Features.WEB_MESSAGE_LISTENER)) {
            kowloon.impassible(this.b, "omidJsSessionService");
            kowloon.marial(this.b, "omidJsSessionService", new HashSet(Arrays.asList("*")), new b91(this));
            return;
        }
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }
}
