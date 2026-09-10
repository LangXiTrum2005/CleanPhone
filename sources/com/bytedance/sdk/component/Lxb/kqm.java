package com.bytedance.sdk.component.Lxb;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class kqm {
    static HD Lxb;
    private final List<STP> JXs;
    private final Lxb LD;
    private final nBu ZU;
    private volatile boolean lc;
    private final WebView lk;

    public kqm(nBu nbu) {
        ArrayList arrayList = new ArrayList();
        this.JXs = arrayList;
        this.lc = false;
        this.ZU = nbu;
        if (nbu.OY && Lxb != null) {
            throw null;
        }
        if (nbu.Lxb != null) {
            Lxb lxb = nbu.LD;
            if (lxb == null) {
                this.LD = new CSn();
            } else {
                this.LD = lxb;
            }
        } else {
            this.LD = nbu.LD;
        }
        this.LD.Lxb(nbu, (Sfi) null);
        this.lk = nbu.Lxb;
        arrayList.add(nbu.nBu);
        aH.Lxb(nbu.ebl);
    }

    private void LD() {
        if (this.lc) {
            QAg.Lxb(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public static nBu Lxb(WebView webView) {
        return new nBu(webView);
    }

    public kqm Lxb(String str, JXs<?, ?> jXs) {
        return Lxb(str, (String) null, jXs);
    }

    public kqm Lxb(String str, String str2, JXs<?, ?> jXs) {
        LD();
        this.LD.ebl.Lxb(str, jXs);
        return this;
    }

    public kqm Lxb(String str, ZU.LD ld) {
        return Lxb(str, (String) null, ld);
    }

    public kqm Lxb(String str, String str2, ZU.LD ld) {
        LD();
        this.LD.ebl.Lxb(str, ld);
        return this;
    }

    public void Lxb() {
        if (this.lc) {
            return;
        }
        this.LD.LD();
        this.lc = true;
        Iterator<STP> it = this.JXs.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
