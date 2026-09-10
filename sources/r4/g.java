package r4;

import android.net.Uri;
import android.webkit.WebView;
import java.util.Set;
import java.util.WeakHashMap;
import s4.i;
import s4.m;
import s4.o;
import s4.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f49404a;

    static {
        Uri.parse("*");
        Uri.parse("");
        f49404a = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, f fVar) {
        if (!m.f50118d.a()) {
            throw m.a();
        }
        p pVarB = b(webView);
        pVarB.f50127a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new no.a(new i(fVar)));
    }

    public static p b(WebView webView) {
        if (!m.f50123i.a()) {
            return new p(o.f50126a.createWebView(webView));
        }
        WeakHashMap weakHashMap = f49404a;
        p pVar = (p) weakHashMap.get(webView);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(o.f50126a.createWebView(webView));
        weakHashMap.put(webView, pVar2);
        return pVar2;
    }

    public static String c() {
        if (m.f50120f.a()) {
            return o.f50126a.getStatics().getVariationsHeader();
        }
        throw m.a();
    }

    public static void d(WebView webView, String str) {
        if (!m.f50118d.a()) {
            throw m.a();
        }
        b(webView).f50127a.removeWebMessageListener(str);
    }
}
