package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class vu {
    private static final HashMap<String, qdl> qdl = new HashMap<>();

    public static com.bytedance.sdk.component.tvp.mo qdl(Context context, AttributeSet attributeSet, int i2, com.bytedance.sdk.component.tvp.mo.lnr lnrVar) {
        WebView webViewQdl = qdl(context, attributeSet, i2, lnrVar, false);
        if (webViewQdl == null) {
            return null;
        }
        com.bytedance.sdk.component.tvp.mo moVar = new com.bytedance.sdk.component.tvp.mo(context, true, lnrVar);
        moVar.setWebView(webViewQdl);
        moVar.mzz();
        return moVar;
    }

    public static WebView ud(Context context, AttributeSet attributeSet, int i2, com.bytedance.sdk.component.tvp.mo.lnr lnrVar) {
        return qdl(context, attributeSet, i2, lnrVar, true);
    }

    public static void ud(com.bytedance.sdk.component.tvp.mo moVar) {
        try {
            moVar.removeAllViews();
            moVar.wd();
            moVar.setWebChromeClient(null);
            moVar.setWebViewClient(null);
            moVar.setDownloadListener(null);
            moVar.setJavaScriptEnabled(true);
            moVar.setCacheMode(-1);
            moVar.setSupportZoom(false);
            moVar.setUseWideViewPort(true);
            moVar.setJavaScriptCanOpenWindowsAutomatically(true);
            moVar.setDomStorageEnabled(true);
            moVar.setBuiltInZoomControls(false);
            moVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            moVar.setLoadWithOverviewMode(false);
            moVar.setDefaultTextEncodingName("UTF-8");
            moVar.setDefaultFontSize(16);
        } catch (Throwable unused) {
        }
    }

    private static WebView qdl(Context context, AttributeSet attributeSet, int i2, com.bytedance.sdk.component.tvp.mo.lnr lnrVar, boolean z2) {
        WebView webViewUd;
        qdl qdlVar;
        if (lnrVar == null || attributeSet != null || i2 != 0 || (qdlVar = qdl.get(lnrVar.exu)) == null) {
            webViewUd = null;
        } else {
            webViewUd = qdlVar.ud();
            if (webViewUd != null) {
                if (webViewUd instanceof com.bytedance.sdk.component.tvp.mzz) {
                    ((com.bytedance.sdk.component.tvp.mzz) webViewUd).setRecycler(false);
                }
                qdl(lnrVar, false);
            }
        }
        if (webViewUd != null || !z2) {
            return webViewUd;
        }
        if (!(context instanceof MutableContextWrapper)) {
            context = new MutableContextWrapper(context);
        }
        qdl(lnrVar, true);
        return i2 != 0 ? new com.bytedance.sdk.component.tvp.mzz(context, attributeSet, i2) : new com.bytedance.sdk.component.tvp.mzz(context, attributeSet);
    }

    public static class qdl {
        private final String mml;
        public final int ud;
        public final HashSet<String> qdl = new HashSet<>();
        private final ArrayList<WebView> lnr = new ArrayList<>();

        public qdl(String str, JSONObject jSONObject) {
            this.mml = str;
            this.ud = jSONObject.optInt("max_count");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("scene");
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i2);
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.qdl.add(strOptString);
                    }
                }
            }
        }

        public int lnr() {
            return this.lnr.size();
        }

        public boolean qdl(WebView webView) {
            if (webView != null && this.lnr.size() < this.ud && !this.lnr.contains(webView)) {
                Context context = webView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    if (webView instanceof com.bytedance.sdk.component.tvp.mzz) {
                        ((com.bytedance.sdk.component.tvp.mzz) webView).setRecycler(true);
                    }
                    ViewParent parent = webView.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(webView);
                    }
                    this.lnr.add(webView);
                    return true;
                }
            }
            return false;
        }

        public WebView ud() {
            if (this.lnr.isEmpty()) {
                return null;
            }
            return this.lnr.remove(0);
        }

        public HashSet<String> qdl() {
            return this.qdl;
        }
    }

    private static void qdl(final com.bytedance.sdk.component.tvp.mo.lnr lnrVar, final boolean z2) {
        bch.qdl("webview_allocate", new bch.qdl() { // from class: com.bytedance.sdk.component.utils.vu.1
            @Override // com.bytedance.sdk.component.utils.bch.qdl
            public JSONObject qdl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z2 ? 1 : 0);
                    jSONObject.put("scene", lnrVar.exu);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void qdl(com.bytedance.sdk.component.tvp.mo moVar) {
        WebView webView;
        if (moVar == null || (webView = moVar.getWebView()) == null) {
            return;
        }
        qdl qdlVar = qdl.get(moVar.getScene().exu);
        if (qdlVar != null && qdlVar.qdl(webView)) {
            ud(moVar);
        } else {
            qdl(webView);
        }
    }

    public static boolean ud(com.bytedance.sdk.component.tvp.mo.lnr lnrVar) {
        return (lnrVar == null || qdl.get(lnrVar.exu) == null) ? false : true;
    }

    private static void qdl(WebView webView) {
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

    public static void qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    qdl qdlVar = new qdl(next, jSONObject.getJSONObject(next));
                    Iterator<String> it = qdlVar.qdl().iterator();
                    while (it.hasNext()) {
                        qdl.put(it.next(), qdlVar);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static int qdl(com.bytedance.sdk.component.tvp.mo.lnr lnrVar) {
        qdl qdlVar;
        if (lnrVar == null || (qdlVar = qdl.get(lnrVar.exu)) == null) {
            return 0;
        }
        return qdlVar.lnr();
    }
}
