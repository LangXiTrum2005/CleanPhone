package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class zf {
    private static final HashMap<String, ri> ri = new HashMap<>();

    public static WebView lr(Context context, AttributeSet attributeSet, int i, com.bytedance.sdk.component.jbs.di.ik ikVar) {
        return ri(context, attributeSet, i, ikVar, true);
    }

    public static com.bytedance.sdk.component.jbs.di ri(Context context, AttributeSet attributeSet, int i, com.bytedance.sdk.component.jbs.di.ik ikVar) {
        WebView webViewRi = ri(context, attributeSet, i, ikVar, false);
        if (webViewRi == null) {
            return null;
        }
        com.bytedance.sdk.component.jbs.di diVar = new com.bytedance.sdk.component.jbs.di(context, true, ikVar);
        diVar.setWebView(webViewRi);
        diVar.fi();
        return diVar;
    }

    public static void lr(com.bytedance.sdk.component.jbs.di diVar) {
        if (diVar == null) {
            return;
        }
        try {
            diVar.removeAllViews();
            diVar.xha();
            diVar.setWebChromeClient(null);
            diVar.setWebViewClient(null);
            diVar.setDownloadListener(null);
            diVar.setJavaScriptEnabled(true);
            diVar.setCacheMode(-1);
            diVar.setSupportZoom(false);
            diVar.setUseWideViewPort(true);
            diVar.setJavaScriptCanOpenWindowsAutomatically(true);
            diVar.setDomStorageEnabled(true);
            diVar.setBuiltInZoomControls(false);
            diVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            diVar.setLoadWithOverviewMode(false);
            diVar.setDefaultTextEncodingName(C.UTF8_NAME);
            diVar.setDefaultFontSize(16);
            WebView webView = diVar.getWebView();
            if (webView instanceof com.bytedance.sdk.component.jbs.fi) {
                ((com.bytedance.sdk.component.jbs.fi) webView).ri();
            }
        } catch (Throwable unused) {
        }
    }

    private static WebView ri(Context context, AttributeSet attributeSet, int i, com.bytedance.sdk.component.jbs.di.ik ikVar, boolean z) {
        WebView webViewLr;
        ri riVar;
        if (ikVar == null || attributeSet != null || i != 0 || (riVar = ri.get(ikVar.aw)) == null) {
            webViewLr = null;
        } else {
            webViewLr = riVar.lr();
            if (webViewLr != null) {
                if (webViewLr instanceof com.bytedance.sdk.component.jbs.fi) {
                    ((com.bytedance.sdk.component.jbs.fi) webViewLr).setRecycler(false);
                }
                ri(ikVar, false);
            }
        }
        if (webViewLr != null || !z) {
            return webViewLr;
        }
        if (!(context instanceof MutableContextWrapper)) {
            context = new MutableContextWrapper(context);
        }
        ri(ikVar, true);
        return i != 0 ? new com.bytedance.sdk.component.jbs.fi(context, attributeSet, i) : new com.bytedance.sdk.component.jbs.fi(context, attributeSet);
    }

    public static class ri {
        private final String ka;
        public final int lr;
        public final HashSet<String> ri = new HashSet<>();
        private final ArrayList<WebView> ik = new ArrayList<>();

        public ri(String str, JSONObject jSONObject) {
            this.ka = str;
            this.lr = jSONObject.optInt("max_count");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("scene");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.ri.add(strOptString);
                    }
                }
            }
        }

        public int ik() {
            return this.ik.size();
        }

        public WebView lr() {
            if (this.ik.isEmpty()) {
                return null;
            }
            return this.ik.remove(0);
        }

        public boolean ri(WebView webView) {
            if (webView != null && this.ik.size() < this.lr && !this.ik.contains(webView)) {
                Context context = webView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    if (webView instanceof com.bytedance.sdk.component.jbs.fi) {
                        ((com.bytedance.sdk.component.jbs.fi) webView).setRecycler(true);
                    }
                    ViewParent parent = webView.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(webView);
                    }
                    this.ik.add(webView);
                    return true;
                }
            }
            return false;
        }

        public HashSet<String> ri() {
            return this.ri;
        }
    }

    private static void ri(final com.bytedance.sdk.component.jbs.di.ik ikVar, final boolean z) {
        wjv.ri("webview_allocate", new wjv.ri() { // from class: com.bytedance.sdk.component.utils.zf.1
            @Override // com.bytedance.sdk.component.utils.wjv.ri
            public JSONObject ri() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z ? 1 : 0);
                    jSONObject.put("scene", ikVar.aw);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ri(com.bytedance.sdk.component.jbs.di diVar) {
        WebView webView;
        if (diVar == null || (webView = diVar.getWebView()) == null) {
            return;
        }
        ri riVar = ri.get(diVar.getScene().aw);
        if (riVar != null && riVar.ri(webView)) {
            lr(diVar);
        } else {
            ri(webView);
        }
    }

    public static boolean lr(com.bytedance.sdk.component.jbs.di.ik ikVar) {
        return (ikVar == null || ri.get(ikVar.aw) == null) ? false : true;
    }

    private static void ri(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            Context context = webView.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception unused) {
        }
    }

    public static void ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    ri riVar = new ri(next, jSONObject.getJSONObject(next));
                    Iterator<String> it = riVar.ri().iterator();
                    while (it.hasNext()) {
                        ri.put(it.next(), riVar);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static int ri(com.bytedance.sdk.component.jbs.di.ik ikVar) {
        ri riVar;
        if (ikVar == null || (riVar = ri.get(ikVar.aw)) == null) {
            return 0;
        }
        return riVar.ik();
    }
}
