package com.bytedance.sdk.component.ri;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class vr {
    private volatile boolean fi;
    private final jbs ik;
    private final List<co> ka;
    private final WebView lr;
    private final ri ri;

    public vr(jbs jbsVar) {
        ArrayList arrayList = new ArrayList();
        this.ka = arrayList;
        this.fi = false;
        this.ik = jbsVar;
        if (jbsVar.ri != null) {
            ri riVar = jbsVar.lr;
            if (riVar == null) {
                this.ri = new ac();
            } else {
                this.ri = riVar;
            }
        } else {
            this.ri = jbsVar.lr;
        }
        this.ri.ik(jbsVar);
        this.lr = jbsVar.ri;
        arrayList.add(jbsVar.jbs);
        tan.ri(jbsVar.xha);
    }

    private void lr() {
        if (this.fi) {
            mj.ri(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public static jbs ri(WebView webView) {
        return new jbs(webView);
    }

    public vr ri(String str, ka<?, ?> kaVar) {
        return ri(str, (String) null, kaVar);
    }

    public vr ri(Set<String> set, nr<?, ?> nrVar) {
        return ri(set, (String) null, nrVar);
    }

    public vr ri(String str, String str2, ka<?, ?> kaVar) {
        lr();
        this.ri.xha.ri(str, kaVar);
        return this;
    }

    public vr ri(Set<String> set, String str, nr<?, ?> nrVar) {
        lr();
        this.ri.xha.ri(set, nrVar);
        return this;
    }

    public vr ri(String str, ik.lr lrVar) {
        return ri(str, (String) null, lrVar);
    }

    public vr ri(String str, String str2, ik.lr lrVar) {
        lr();
        this.ri.xha.ri(str, lrVar);
        return this;
    }

    public void ri() {
        if (this.fi) {
            return;
        }
        this.ri.lr();
        this.fi = true;
        Iterator<co> it = this.ka.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
