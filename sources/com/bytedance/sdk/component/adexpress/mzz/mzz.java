package com.bytedance.sdk.component.adexpress.mzz;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.qdl.aaj;
import com.bytedance.sdk.component.tvp.mo;
import com.bytedance.sdk.component.utils.vu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class mzz {
    private static int jpc = 10;
    private static int mo = 10;
    private static final byte[] mzz = new byte[0];
    private static volatile mzz tvp;
    private final AtomicBoolean wd = new AtomicBoolean(false);
    private List<mo> qdl = new ArrayList();
    private List<mo> ud = new ArrayList();
    private Map<Integer, lnr> lnr = new HashMap();
    private Map<Integer, mml> mml = new HashMap();

    private mzz() {
        com.bytedance.sdk.component.adexpress.qdl.qdl.lnr lnrVarLnr = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr();
        if (lnrVarLnr != null) {
            mo = lnrVarLnr.to();
            jpc = lnrVarLnr.rq();
        }
    }

    private void mo(mo moVar) {
        if (moVar == null) {
            return;
        }
        if (vu.ud(moVar.getScene())) {
            vu.qdl(moVar);
            return;
        }
        if (this.qdl.size() >= mo) {
            try {
                Context context = moVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                moVar.jtx();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.qdl.contains(moVar)) {
            return;
        }
        try {
            Context context2 = moVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                moVar.setRecycler(true);
                this.qdl.add(moVar);
                lnr();
            }
        } catch (Throwable th2) {
            lnr();
            th2.getMessage();
        }
    }

    public static mzz qdl() {
        if (tvp == null) {
            synchronized (mzz.class) {
                try {
                    if (tvp == null) {
                        tvp = new mzz();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return tvp;
    }

    public void lnr(mo moVar) {
        if (moVar == null) {
            return;
        }
        vu.ud(moVar);
        moVar.b_("SDK_INJECT_GLOBAL");
        mzz(moVar);
        mo(moVar);
    }

    public boolean mml(mo moVar) {
        if (moVar == null) {
            return false;
        }
        try {
            Context context = moVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            moVar.jtx();
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void mzz(mo moVar) {
        WebView webView;
        if (moVar == null || (webView = moVar.getWebView()) == null) {
            return;
        }
        lnr lnrVar = this.lnr.get(Integer.valueOf(webView.hashCode()));
        if (lnrVar != null) {
            lnrVar.qdl(null);
        }
        moVar.b_("SDK_INJECT_GLOBAL");
    }

    public void ud(mo moVar) {
        if (moVar == null) {
            return;
        }
        vu.ud(moVar);
        moVar.b_("SDK_INJECT_GLOBAL");
        mzz(moVar);
        qdl(moVar);
    }

    public int lnr() {
        return this.qdl.size();
    }

    public mo ud(Context context, String str) {
        mo.lnr lnrVar = mo.lnr.ADS;
        if (vu.ud(lnrVar)) {
            if (!com.bytedance.sdk.component.adexpress.mml.mzz.qdl(str) || vu.qdl(lnrVar) > 1) {
                return vu.qdl(context, null, 0, lnrVar);
            }
            return null;
        }
        if (lnr() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.mml.mzz.qdl(str) && lnr() <= 1) {
            lnr();
            return null;
        }
        mo moVarRemove = this.qdl.remove(0);
        if (moVarRemove == null) {
            return null;
        }
        try {
            Context context2 = moVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                moVarRemove.setRecycler(false);
                lnr();
            }
            return moVarRemove;
        } catch (Throwable unused) {
            lnr();
            return null;
        }
    }

    public int mml() {
        return this.ud.size();
    }

    public mo qdl(Context context, String str) {
        mo.lnr lnrVar = mo.lnr.ADS_V3;
        if (vu.ud(lnrVar)) {
            if (!com.bytedance.sdk.component.adexpress.mml.mzz.qdl(str) || vu.qdl(lnrVar) > 1) {
                return vu.qdl(context, null, 0, lnrVar);
            }
            return null;
        }
        if (mml() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.mml.mzz.qdl(str) && mml() <= 1) {
            mml();
            return null;
        }
        mo moVarRemove = this.ud.remove(0);
        if (moVarRemove == null) {
            return null;
        }
        try {
            Context context2 = moVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                moVarRemove.setRecycler(false);
                mml();
            }
            return moVarRemove;
        } catch (Throwable unused) {
            mml();
            return null;
        }
    }

    public void ud() {
        for (mo moVar : this.qdl) {
            if (moVar != null) {
                try {
                    Context context = moVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    moVar.jtx();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        this.qdl.clear();
        for (mo moVar2 : this.ud) {
            if (moVar2 != null) {
                try {
                    Context context2 = moVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    moVar2.jtx();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.ud.clear();
    }

    public void qdl(mo moVar) {
        if (moVar == null) {
            return;
        }
        if (vu.ud(moVar.getScene())) {
            vu.qdl(moVar);
            return;
        }
        if (this.ud.size() >= jpc) {
            try {
                Context context = moVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                moVar.jtx();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.ud.contains(moVar)) {
            return;
        }
        try {
            Context context2 = moVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                moVar.setRecycler(true);
                this.ud.add(moVar);
                mml();
            }
        } catch (Throwable th2) {
            mml();
            th2.getMessage();
        }
    }

    public void ud(int i2) {
        synchronized (mzz) {
            jpc = i2;
        }
    }

    public void qdl(mo moVar, ud udVar) {
        WebView webView;
        if (moVar == null || udVar == null || (webView = moVar.getWebView()) == null) {
            return;
        }
        lnr lnrVar = this.lnr.get(Integer.valueOf(webView.hashCode()));
        if (lnrVar != null) {
            lnrVar.qdl(udVar);
        } else {
            lnrVar = new lnr(udVar);
            this.lnr.put(Integer.valueOf(webView.hashCode()), lnrVar);
        }
        moVar.qdl(lnrVar, "SDK_INJECT_GLOBAL");
    }

    public void qdl(WebView webView, aaj aajVar, String str) {
        if (webView == null || aajVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        mml mmlVar = this.mml.get(Integer.valueOf(webView.hashCode()));
        if (mmlVar != null) {
            mmlVar.qdl(aajVar);
        } else {
            mmlVar = new mml(aajVar);
            this.mml.put(Integer.valueOf(webView.hashCode()), mmlVar);
        }
        webView.addJavascriptInterface(mmlVar, str);
    }

    public void qdl(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        mml mmlVar = this.mml.get(Integer.valueOf(webView.hashCode()));
        if (mmlVar != null) {
            mmlVar.qdl(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void qdl(int i2) {
        synchronized (mzz) {
            mo = i2;
        }
    }
}
