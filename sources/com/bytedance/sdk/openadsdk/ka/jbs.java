package com.bytedance.sdk.openadsdk.ka;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class jbs {
    private int di;
    private final boolean fi;
    private final WebView mj;
    private long qt;
    private final wjv ri;
    private int xha;
    private String jbs = "landingpage";
    private final Map<Integer, Long> lr = new HashMap();
    private final List<Integer> ik = new ArrayList();
    private final Map<Integer, String> ka = new HashMap();

    public jbs(wjv wjvVar, WebView webView, boolean z) {
        this.ri = wjvVar;
        this.mj = webView;
        this.fi = z;
    }

    public void ik(String str) {
        this.jbs = str;
    }

    public void lr(String str) {
        String str2 = this.ka.get(Integer.valueOf(this.di));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str3 = str2;
        int i = this.di;
        if (i > 0) {
            ik.ri(this.ri, this.jbs, i, str3, str, 1);
        }
    }

    public void ri(String str, int i) {
        if (this.fi) {
            i++;
        }
        if (ri(true)) {
            ik.ri(this.ri, this.jbs, this.di, str, i);
            this.ka.put(Integer.valueOf(this.di), str);
            this.qt = SystemClock.elapsedRealtime();
        }
    }

    private void lr(boolean z) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = this.mj.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                if (z) {
                    int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                    this.di = currentIndex + 1;
                    if (this.fi) {
                        this.di = currentIndex + 2;
                        return;
                    }
                    return;
                }
                int currentIndex2 = webBackForwardListCopyBackForwardList.getCurrentIndex();
                this.xha = currentIndex2 + 1;
                if (this.fi) {
                    this.xha = currentIndex2 + 2;
                }
            }
        } catch (Throwable th) {
            ac.ik("ArbitrageLandingLog", th.toString());
        }
    }

    public void ri(String str) {
        if (ri(false)) {
            ik.ri(this.ri, this.jbs, this.di, str, SystemClock.elapsedRealtime() - this.qt);
        }
    }

    public void ri(WebView webView, String str) {
        wjv wjvVar = this.ri;
        if (wjvVar == null || !com.bytedance.sdk.component.jbs.lr.ri(wjvVar.fr().ik(), str)) {
            return;
        }
        String str2 = this.ka.get(Integer.valueOf(this.di));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        ik.ri(this.ri, this.jbs, this.di, str2, str, 2);
    }

    private boolean ri(boolean z) {
        int i = z ? this.di : this.xha;
        lr(z);
        int i2 = z ? this.di : this.xha;
        return i2 > 0 && i2 != i;
    }
}
