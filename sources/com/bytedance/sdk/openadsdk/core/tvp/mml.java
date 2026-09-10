package com.bytedance.sdk.openadsdk.core.tvp;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class mml {
    private static volatile mml lnr;
    private static int ud;
    private final List<mzz> qdl = new ArrayList();

    public static mml qdl() {
        if (lnr == null) {
            synchronized (mml.class) {
                try {
                    if (lnr == null) {
                        lnr = new mml();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lnr;
    }

    public int lnr() {
        return this.qdl.size();
    }

    public mzz ud() {
        mzz mzzVarRemove;
        if (lnr() > 0 && (mzzVarRemove = this.qdl.remove(0)) != null) {
            return mzzVarRemove;
        }
        return null;
    }

    public void lnr(mzz mzzVar) {
        if (mzzVar == null || mzzVar.getWebView() == null) {
            return;
        }
        if (mzzVar.getParent() != null) {
            ((ViewGroup) mzzVar.getParent()).removeView(mzzVar);
        }
        try {
            mzzVar.removeAllViews();
            mzzVar.wd();
            mzzVar.setWebChromeClient(null);
            mzzVar.setWebViewClient(null);
            mzzVar.setDownloadListener(null);
            mzzVar.setDefaultTextEncodingName("UTF-8");
            mzzVar.setAllowFileAccess(false);
            mzzVar.setJavaScriptEnabled(true);
            mzzVar.setCacheMode(-1);
            mzzVar.setDatabaseEnabled(true);
            mzzVar.setSupportZoom(false);
            mzzVar.getWebView().setLayerType(0, null);
            mzzVar.setBackgroundColor(0);
            mzzVar.getWebView().setHorizontalScrollBarEnabled(false);
            mzzVar.getWebView().setHorizontalScrollbarOverlay(false);
            mzzVar.getWebView().setVerticalScrollBarEnabled(false);
            mzzVar.getWebView().setVerticalScrollbarOverlay(false);
            com.bytedance.sdk.openadsdk.core.widget.qdl.lnr.qdl(mzzVar);
            mzzVar.rdp();
            mzzVar.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    public void ud(mzz mzzVar) {
        if (mzzVar != null) {
            if (this.qdl.size() >= ud) {
                mzzVar.jtx();
            } else {
                if (this.qdl.contains(mzzVar)) {
                    return;
                }
                lnr(mzzVar);
                this.qdl.add(mzzVar);
            }
        }
    }

    public void qdl(mzz mzzVar) {
        if (mzzVar != null) {
            ud(mzzVar);
        }
    }
}
