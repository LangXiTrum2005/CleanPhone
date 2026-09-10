package com.bytedance.sdk.openadsdk.core.jbs;

import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    private static volatile ka ik;
    private static int lr;
    private final List<fi> ri = new ArrayList();

    public static ka ri() {
        if (ik == null) {
            synchronized (ka.class) {
                try {
                    if (ik == null) {
                        ik = new ka();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ik;
    }

    public int ik() {
        return this.ri.size();
    }

    public fi lr() {
        fi fiVarRemove;
        if (ik() > 0 && (fiVarRemove = this.ri.remove(0)) != null) {
            return fiVarRemove;
        }
        return null;
    }

    public void ik(fi fiVar) {
        if (fiVar == null || fiVar.getWebView() == null) {
            return;
        }
        if (fiVar.getParent() != null) {
            ((ViewGroup) fiVar.getParent()).removeView(fiVar);
        }
        try {
            fiVar.removeAllViews();
            fiVar.xha();
            fiVar.setWebChromeClient(null);
            fiVar.setWebViewClient(null);
            fiVar.setDownloadListener(null);
            fiVar.setDefaultTextEncodingName(C.UTF8_NAME);
            fiVar.setAllowFileAccess(false);
            fiVar.setJavaScriptEnabled(true);
            fiVar.setCacheMode(-1);
            fiVar.setDatabaseEnabled(true);
            fiVar.setSupportZoom(false);
            fiVar.getWebView().setLayerType(0, null);
            fiVar.setBackgroundColor(0);
            fiVar.getWebView().setHorizontalScrollBarEnabled(false);
            fiVar.getWebView().setHorizontalScrollbarOverlay(false);
            fiVar.getWebView().setVerticalScrollBarEnabled(false);
            fiVar.getWebView().setVerticalScrollbarOverlay(false);
            com.bytedance.sdk.openadsdk.core.widget.ri.ik.ri(fiVar);
            fiVar.bgr();
            fiVar.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    public void lr(fi fiVar) {
        if (fiVar != null) {
            if (this.ri.size() >= lr) {
                fiVar.slm();
            } else {
                if (this.ri.contains(fiVar)) {
                    return;
                }
                ik(fiVar);
                this.ri.add(fiVar);
            }
        }
    }

    public void ri(fi fiVar) {
        if (fiVar != null) {
            lr(fiVar);
        }
    }
}
