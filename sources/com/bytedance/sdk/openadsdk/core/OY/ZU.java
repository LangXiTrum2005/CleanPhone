package com.bytedance.sdk.openadsdk.core.OY;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    private static int LD;
    private static volatile ZU lk;
    private final List<JXs> Lxb = new ArrayList();

    public static ZU Lxb() {
        if (lk == null) {
            synchronized (ZU.class) {
                try {
                    if (lk == null) {
                        lk = new ZU();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lk;
    }

    @Nullable
    public JXs LD() {
        JXs jXsRemove;
        if (lk() > 0 && (jXsRemove = this.Lxb.remove(0)) != null) {
            return jXsRemove;
        }
        return null;
    }

    public int lk() {
        return this.Lxb.size();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void lk(JXs jXs) {
        if (jXs == null || jXs.getWebView() == null) {
            return;
        }
        if (jXs.getParent() != null) {
            ((ViewGroup) jXs.getParent()).removeView(jXs);
        }
        try {
            jXs.removeAllViews();
            jXs.lk();
            jXs.setWebChromeClient(null);
            jXs.setWebViewClient(null);
            jXs.setDownloadListener(null);
            jXs.setDefaultTextEncodingName(C.UTF8_NAME);
            jXs.setAllowFileAccess(false);
            jXs.setJavaScriptEnabled(true);
            jXs.setCacheMode(-1);
            jXs.setDatabaseEnabled(true);
            jXs.setSupportZoom(false);
            jXs.getWebView().setLayerType(0, null);
            jXs.setBackgroundColor(0);
            jXs.getWebView().setHorizontalScrollBarEnabled(false);
            jXs.getWebView().setHorizontalScrollbarOverlay(false);
            jXs.getWebView().setVerticalScrollBarEnabled(false);
            jXs.getWebView().setVerticalScrollbarOverlay(false);
            com.bytedance.sdk.openadsdk.core.widget.Lxb.lk.Lxb(jXs);
            jXs.nBu();
            jXs.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    public void LD(JXs jXs) {
        if (jXs != null) {
            if (this.Lxb.size() >= LD) {
                jXs.sLN();
            } else {
                if (this.Lxb.contains(jXs)) {
                    return;
                }
                lk(jXs);
                this.Lxb.add(jXs);
            }
        }
    }

    @UiThread
    public void Lxb(JXs jXs) {
        if (jXs != null) {
            LD(jXs);
        }
    }
}
