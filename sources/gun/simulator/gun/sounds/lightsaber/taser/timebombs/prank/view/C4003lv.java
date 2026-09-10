package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4003lv implements InterfaceC3368eh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4003lv f4674a = new C4003lv();
    public static final C4003lv b = new C4003lv();

    public static void b(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            webView.evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: " + str);
        }
    }

    public void a(WebView webView, String str, Object... objArr) {
        String string;
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        string = "null";
                    } else {
                        if (obj instanceof String) {
                            string = obj.toString();
                            if (!string.startsWith("{")) {
                                sb.append('\"');
                                sb.append(string);
                                sb.append('\"');
                            }
                        } else {
                            sb.append(obj);
                        }
                        sb.append(",");
                    }
                    sb.append(string);
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String string2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                b(webView, string2);
            } else {
                handler.post(new RunnableC3163cN(this, webView, string2, 3));
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3368eh0
    public Object m(MF mf, float f) {
        return Float.valueOf(YF.d(mf) * f);
    }
}
