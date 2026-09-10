package com.bytedance.sdk.component.adexpress.JXs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.Lxb.CSn;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class JXs {
    private static final byte[] JXs = new byte[0];
    private static int OY = 10;
    private static volatile JXs QAg = null;
    private static int lc = 10;
    private final AtomicBoolean ebl = new AtomicBoolean(false);
    private List<com.bytedance.sdk.component.QAg.ZU> Lxb = new ArrayList();
    private List<com.bytedance.sdk.component.QAg.ZU> LD = new ArrayList();
    private Map<Integer, lk> lk = new HashMap();
    private Map<Integer, ZU> ZU = new HashMap();

    private JXs() {
        com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk lkVarLk = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk();
        if (lkVarLk != null) {
            lc = lkVarLk.nBu();
            OY = lkVarLk.JVA();
        }
    }

    public static JXs Lxb() {
        if (QAg == null) {
            synchronized (JXs.class) {
                try {
                    if (QAg == null) {
                        QAg = new JXs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return QAg;
    }

    private void ebl(com.bytedance.sdk.component.QAg.ZU zu) {
        try {
            zu.removeAllViews();
            zu.lk();
            zu.setWebChromeClient(null);
            zu.setWebViewClient(null);
            zu.setDownloadListener(null);
            zu.setJavaScriptEnabled(true);
            zu.setCacheMode(-1);
            zu.setSupportZoom(false);
            zu.setUseWideViewPort(true);
            zu.setJavaScriptCanOpenWindowsAutomatically(true);
            zu.setDomStorageEnabled(true);
            zu.setBuiltInZoomControls(false);
            zu.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            zu.setLoadWithOverviewMode(false);
            zu.setDefaultTextEncodingName(C.UTF8_NAME);
            zu.setDefaultFontSize(16);
        } catch (Throwable unused) {
        }
    }

    public boolean JXs(com.bytedance.sdk.component.QAg.ZU zu) {
        if (zu == null) {
            return false;
        }
        try {
            Context context = zu.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            zu.sLN();
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    @UiThread
    public void LD(com.bytedance.sdk.component.QAg.ZU zu) {
        if (zu == null) {
            return;
        }
        ebl(zu);
        zu.b_("SDK_INJECT_GLOBAL");
        lc(zu);
        Lxb(zu);
    }

    public void ZU(com.bytedance.sdk.component.QAg.ZU zu) {
        if (zu == null) {
            return;
        }
        if (this.Lxb.size() >= lc) {
            try {
                Context context = zu.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                zu.sLN();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.Lxb.contains(zu)) {
            return;
        }
        try {
            Context context2 = zu.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                zu.setRecycler(true);
                this.Lxb.add(zu);
                lk();
            }
        } catch (Throwable th2) {
            lk();
            th2.getMessage();
        }
    }

    public void lc(com.bytedance.sdk.component.QAg.ZU zu) {
        if (zu == null) {
            return;
        }
        lk lkVar = this.lk.get(Integer.valueOf(zu.hashCode()));
        if (lkVar != null) {
            lkVar.Lxb(null);
        }
        zu.b_("SDK_INJECT_GLOBAL");
    }

    @UiThread
    public void lk(com.bytedance.sdk.component.QAg.ZU zu) {
        if (zu == null) {
            return;
        }
        ebl(zu);
        zu.b_("SDK_INJECT_GLOBAL");
        lc(zu);
        ZU(zu);
    }

    @Nullable
    public com.bytedance.sdk.component.QAg.ZU LD(Context context, String str) {
        if (lk() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.ZU.JXs.Lxb(str) && lk() <= 1) {
            lk();
            return null;
        }
        com.bytedance.sdk.component.QAg.ZU zuRemove = this.Lxb.remove(0);
        if (zuRemove == null) {
            return null;
        }
        try {
            Context context2 = zuRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                zuRemove.setRecycler(false);
                lk();
            }
            return zuRemove;
        } catch (Throwable unused) {
            lk();
            return null;
        }
    }

    public int lk() {
        return this.Lxb.size();
    }

    @Nullable
    public com.bytedance.sdk.component.QAg.ZU Lxb(Context context, String str) {
        if (ZU() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.ZU.JXs.Lxb(str) && ZU() <= 1) {
            ZU();
            return null;
        }
        com.bytedance.sdk.component.QAg.ZU zuRemove = this.LD.remove(0);
        if (zuRemove == null) {
            return null;
        }
        try {
            Context context2 = zuRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                zuRemove.setRecycler(false);
                ZU();
            }
            return zuRemove;
        } catch (Throwable unused) {
            ZU();
            return null;
        }
    }

    public void LD() {
        for (com.bytedance.sdk.component.QAg.ZU zu : this.Lxb) {
            if (zu != null) {
                try {
                    Context context = zu.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    zu.sLN();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        this.Lxb.clear();
        for (com.bytedance.sdk.component.QAg.ZU zu2 : this.LD) {
            if (zu2 != null) {
                try {
                    Context context2 = zu2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    zu2.sLN();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.LD.clear();
    }

    public int ZU() {
        return this.LD.size();
    }

    public void Lxb(com.bytedance.sdk.component.QAg.ZU zu) {
        if (zu == null) {
            return;
        }
        if (this.LD.size() >= OY) {
            try {
                Context context = zu.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                zu.sLN();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.LD.contains(zu)) {
            return;
        }
        try {
            Context context2 = zu.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                zu.setRecycler(true);
                this.LD.add(zu);
                ZU();
            }
        } catch (Throwable th2) {
            ZU();
            th2.getMessage();
        }
    }

    public void LD(int i) {
        synchronized (JXs) {
            OY = i;
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void Lxb(com.bytedance.sdk.component.QAg.ZU zu, LD ld) {
        if (zu == null || ld == null) {
            return;
        }
        lk lkVar = this.lk.get(Integer.valueOf(zu.hashCode()));
        if (lkVar != null) {
            lkVar.Lxb(ld);
        } else {
            lkVar = new lk(ld);
            this.lk.put(Integer.valueOf(zu.hashCode()), lkVar);
        }
        zu.Lxb(lkVar, "SDK_INJECT_GLOBAL");
    }

    @SuppressLint({"JavascriptInterface"})
    public void Lxb(WebView webView, CSn cSn, String str) {
        if (webView == null || cSn == null || TextUtils.isEmpty(str)) {
            return;
        }
        ZU zu = this.ZU.get(Integer.valueOf(webView.hashCode()));
        if (zu != null) {
            zu.Lxb(cSn);
        } else {
            zu = new ZU(cSn);
            this.ZU.put(Integer.valueOf(webView.hashCode()), zu);
        }
        webView.addJavascriptInterface(zu, str);
    }

    public void Lxb(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        ZU zu = this.ZU.get(Integer.valueOf(webView.hashCode()));
        if (zu != null) {
            zu.Lxb(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void Lxb(int i) {
        synchronized (JXs) {
            lc = i;
        }
    }
}
