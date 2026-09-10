package com.bytedance.sdk.openadsdk.ZU;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.model.tD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class OY {
    private final boolean JXs;
    private final tD Lxb;
    private final WebView OY;
    private int ebl;
    private int lc;
    private long nBu;
    private String QAg = "landingpage";
    private final Map<Integer, Long> LD = new HashMap();
    private final List<Integer> lk = new ArrayList();
    private final Map<Integer, String> ZU = new HashMap();

    public OY(tD tDVar, WebView webView, boolean z) {
        this.Lxb = tDVar;
        this.OY = webView;
        this.JXs = z;
    }

    public void LD(String str) {
        String str2 = this.ZU.get(Integer.valueOf(this.lc));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str3 = str2;
        int i = this.lc;
        if (i > 0) {
            lk.Lxb(this.Lxb, this.QAg, i, str3, str, 1);
        }
    }

    public void Lxb(String str, int i) {
        if (this.JXs) {
            i++;
        }
        if (Lxb(true)) {
            lk.Lxb(this.Lxb, this.QAg, this.lc, str, i);
            this.ZU.put(Integer.valueOf(this.lc), str);
            this.nBu = SystemClock.elapsedRealtime();
        }
    }

    public void lk(String str) {
        this.QAg = str;
    }

    private void LD(boolean z) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = this.OY.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                if (z) {
                    int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                    this.lc = currentIndex + 1;
                    if (this.JXs) {
                        this.lc = currentIndex + 2;
                        return;
                    }
                    return;
                }
                int currentIndex2 = webBackForwardListCopyBackForwardList.getCurrentIndex();
                this.ebl = currentIndex2 + 1;
                if (this.JXs) {
                    this.ebl = currentIndex2 + 2;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("ArbitrageLandingLog", th.toString());
        }
    }

    public void Lxb(String str) {
        if (Lxb(false)) {
            lk.Lxb(this.Lxb, this.QAg, this.lc, str, SystemClock.elapsedRealtime() - this.nBu);
        }
    }

    public void Lxb(WebView webView, String str) {
        tD tDVar = this.Lxb;
        if (tDVar == null || !com.bytedance.sdk.component.QAg.LD.Lxb(tDVar.JVA().lk(), str)) {
            return;
        }
        String str2 = this.ZU.get(Integer.valueOf(this.lc));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        lk.Lxb(this.Lxb, this.QAg, this.lc, str2, str, 2);
    }

    private boolean Lxb(boolean z) {
        int i = z ? this.lc : this.ebl;
        LD(z);
        int i2 = z ? this.lc : this.ebl;
        return i2 > 0 && i2 != i;
    }
}
