package com.iab.omid.library.vungle.messagelistener;

import android.net.Uri;
import android.webkit.WebView;
import com.iab.omid.library.vungle.utils.d;
import com.iab.omid.library.vungle.utils.g;
import com.iab.omid.library.vungle.utils.i;
import http.arytenoidectomy;
import http.attabal;
import http.competently;
import http.kowloon;
import java.util.Arrays;
import java.util.HashSet;
import org.chromium.support_lib_boundary.util.Features;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static final i c = new i();
    private final WebView a;
    private final b b;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.messagelistener.a$a, reason: collision with other inner class name */
    public class C0361a implements kowloon.saneness {
        public C0361a() {
        }

        @Override // http.kowloon.saneness
        public void onPostMessage(WebView webView, competently competentlyVar, Uri uri, boolean z, attabal attabalVar) {
            a.this.a(competentlyVar.saneness());
        }
    }

    public a(WebView webView, b bVar) {
        g.a(webView, "WebView is null");
        this.a = webView;
        this.b = bVar;
    }

    public void a() {
        try {
            if (!arytenoidectomy.attabal(Features.WEB_MESSAGE_LISTENER)) {
                this.b.onWebMessageListenerUnsupported();
                return;
            }
            try {
                b();
                c.a(this.a, this.b.getListenerName(), new HashSet(Arrays.asList("*")), new C0361a());
                return;
            } catch (Exception e) {
                d.a("Error adding WebView listener", e);
            }
        } catch (NoClassDefFoundError unused) {
        }
        this.b.onWebMessageListenerUnsupported();
    }

    public void b() {
        c.a(this.a, this.b.getListenerName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.b.onMessageReceived(jSONObject.getString("method"), jSONObject.getJSONObject("data"));
        } catch (JSONException e) {
            d.a("Error parsing JS message", e);
        }
    }
}
