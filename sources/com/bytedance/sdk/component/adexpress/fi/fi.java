package com.bytedance.sdk.component.adexpress.fi;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.jbs.di;
import com.bytedance.sdk.component.ri.ac;
import com.bytedance.sdk.component.utils.zf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private static int di = 10;
    private static final byte[] fi = new byte[0];
    private static volatile fi jbs = null;
    private static int mj = 10;
    private final AtomicBoolean xha = new AtomicBoolean(false);
    private List<di> ri = new ArrayList();
    private List<di> lr = new ArrayList();
    private Map<Integer, ik> ik = new HashMap();
    private Map<Integer, ka> ka = new HashMap();

    private fi() {
        com.bytedance.sdk.component.adexpress.ri.ri.ik ikVarIk = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik();
        if (ikVarIk != null) {
            di = ikVarIk.qt();
            mj = ikVarIk.sf();
        }
    }

    private void di(di diVar) {
        if (diVar == null) {
            return;
        }
        if (zf.lr(diVar.getScene())) {
            zf.ri(diVar);
            return;
        }
        if (this.ri.size() >= di) {
            try {
                Context context = diVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                diVar.slm();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.ri.contains(diVar)) {
            return;
        }
        try {
            Context context2 = diVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                diVar.setRecycler(true);
                this.ri.add(diVar);
                ik();
            }
        } catch (Throwable th2) {
            ik();
            th2.getMessage();
        }
    }

    public static fi ri() {
        if (jbs == null) {
            synchronized (fi.class) {
                try {
                    if (jbs == null) {
                        jbs = new fi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return jbs;
    }

    public void fi(di diVar) {
        WebView webView;
        if (diVar == null || (webView = diVar.getWebView()) == null) {
            return;
        }
        ik ikVar = this.ik.get(Integer.valueOf(webView.hashCode()));
        if (ikVar != null) {
            ikVar.ri(null);
        }
        diVar.b_("SDK_INJECT_GLOBAL");
    }

    public void ik(di diVar) {
        if (diVar == null) {
            return;
        }
        zf.lr(diVar);
        diVar.b_("SDK_INJECT_GLOBAL");
        fi(diVar);
        di(diVar);
    }

    public boolean ka(di diVar) {
        if (diVar == null) {
            return false;
        }
        try {
            Context context = diVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            diVar.slm();
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void lr(di diVar) {
        if (diVar == null) {
            return;
        }
        zf.lr(diVar);
        diVar.b_("SDK_INJECT_GLOBAL");
        fi(diVar);
        ri(diVar);
    }

    public int ik() {
        return this.ri.size();
    }

    public di lr(Context context, String str) {
        di.ik ikVar = di.ik.ADS;
        if (zf.lr(ikVar)) {
            if (!com.bytedance.sdk.component.adexpress.ka.fi.ri(str) || zf.ri(ikVar) > 1) {
                return zf.ri(context, null, 0, ikVar);
            }
            return null;
        }
        if (ik() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.ka.fi.ri(str) && ik() <= 1) {
            ik();
            return null;
        }
        di diVarRemove = this.ri.remove(0);
        if (diVarRemove == null) {
            return null;
        }
        try {
            Context context2 = diVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                diVarRemove.setRecycler(false);
                ik();
            }
            return diVarRemove;
        } catch (Throwable unused) {
            ik();
            return null;
        }
    }

    public int ka() {
        return this.lr.size();
    }

    public di ri(Context context, String str) {
        di.ik ikVar = di.ik.ADS_V3;
        if (zf.lr(ikVar)) {
            if (!com.bytedance.sdk.component.adexpress.ka.fi.ri(str) || zf.ri(ikVar) > 1) {
                return zf.ri(context, null, 0, ikVar);
            }
            return null;
        }
        if (ka() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.ka.fi.ri(str) && ka() <= 1) {
            ka();
            return null;
        }
        di diVarRemove = this.lr.remove(0);
        if (diVarRemove == null) {
            return null;
        }
        try {
            Context context2 = diVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                diVarRemove.setRecycler(false);
                ka();
            }
            return diVarRemove;
        } catch (Throwable unused) {
            ka();
            return null;
        }
    }

    public void lr() {
        for (di diVar : this.ri) {
            if (diVar != null) {
                try {
                    Context context = diVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    diVar.slm();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        this.ri.clear();
        for (di diVar2 : this.lr) {
            if (diVar2 != null) {
                try {
                    Context context2 = diVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    diVar2.slm();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.lr.clear();
    }

    public void ri(di diVar) {
        if (diVar == null) {
            return;
        }
        if (zf.lr(diVar.getScene())) {
            zf.ri(diVar);
            return;
        }
        if (this.lr.size() >= mj) {
            try {
                Context context = diVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                diVar.slm();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.lr.contains(diVar)) {
            return;
        }
        try {
            Context context2 = diVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                diVar.setRecycler(true);
                this.lr.add(diVar);
                ka();
            }
        } catch (Throwable th2) {
            ka();
            th2.getMessage();
        }
    }

    public void lr(int i) {
        synchronized (fi) {
            mj = i;
        }
    }

    public void ri(di diVar, lr lrVar) {
        WebView webView;
        if (diVar == null || lrVar == null || (webView = diVar.getWebView()) == null) {
            return;
        }
        ik ikVar = this.ik.get(Integer.valueOf(webView.hashCode()));
        if (ikVar != null) {
            ikVar.ri(lrVar);
        } else {
            ikVar = new ik(lrVar);
            this.ik.put(Integer.valueOf(webView.hashCode()), ikVar);
        }
        diVar.ri(ikVar, "SDK_INJECT_GLOBAL");
    }

    public void ri(WebView webView, ac acVar, String str) {
        if (webView == null || acVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        ka kaVar = this.ka.get(Integer.valueOf(webView.hashCode()));
        if (kaVar != null) {
            kaVar.ri(acVar);
        } else {
            kaVar = new ka(acVar);
            this.ka.put(Integer.valueOf(webView.hashCode()), kaVar);
        }
        webView.addJavascriptInterface(kaVar, str);
    }

    public void ri(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        ka kaVar = this.ka.get(Integer.valueOf(webView.hashCode()));
        if (kaVar != null) {
            kaVar.ri(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void ri(int i) {
        synchronized (fi) {
            di = i;
        }
    }
}
