package com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lk {
    private final Context Lxb;
    protected final List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> LD = new ArrayList();
    private boolean lk = false;
    private final Runnable ZU = new Runnable() { // from class: com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.lk.1
        @Override // java.lang.Runnable
        public void run() {
            synchronized (lk.this) {
                try {
                    if (lk.this.LD.isEmpty()) {
                        lk.this.lk = false;
                        return;
                    }
                    ArrayList arrayList = new ArrayList(lk.this.LD);
                    lk.this.LD.clear();
                    lk.this.lk = false;
                    lk.this.ZU(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public lk(Context context) {
        this.Lxb = context;
    }

    public Context JXs() {
        return this.Lxb;
    }

    public abstract String LD();

    public void ZU(List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list) {
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lk.Lxb(JXs(), LD(), list);
    }

    public void lk(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            Iterator<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> it = this.LD.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.lc.Lxb.ZU.Lxb next = it.next();
                if (next != null) {
                    String strLk = next.lk();
                    if (!TextUtils.isEmpty(strLk) && list.contains(strLk)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            LD();
            th.getMessage();
        }
    }

    private void Lxb() {
        if (this.lk) {
            return;
        }
        com.bytedance.sdk.component.lc.Lxb.ebl.Lxb.Lxb().postDelayed(this.ZU, com.bytedance.sdk.component.lc.Lxb.ebl.Lxb.LD());
        this.lk = true;
    }

    public synchronized void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        if (lxb.ebl() != null && !TextUtils.isEmpty(lxb.lk())) {
            this.LD.add(lxb);
            Lxb();
        }
    }
}
