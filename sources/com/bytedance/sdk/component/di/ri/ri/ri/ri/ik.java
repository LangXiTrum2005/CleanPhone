package com.bytedance.sdk.component.di.ri.ri.ri.ri;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.ironsource.Ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ik {
    private static int ik = 20;
    private boolean fi;
    private boolean mj;
    private final Context ri;
    protected final List<com.bytedance.sdk.component.di.ri.ka.ri> lr = new ArrayList();
    private final List<com.bytedance.sdk.component.di.ri.ka.ri> ka = new ArrayList();
    private boolean di = false;
    private volatile boolean xha = false;
    private final Runnable jbs = new Runnable() { // from class: com.bytedance.sdk.component.di.ri.ri.ri.ri.ik.1
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            synchronized (ik.this) {
                try {
                    ik.this.xha = false;
                    if (ik.this.lr.isEmpty()) {
                        ik.this.di = false;
                        return;
                    }
                    if (ik.this.fi) {
                        int size = ik.this.lr.size();
                        for (int i = 0; i < size; i++) {
                            ik.this.ka.add(ik.this.lr.get(i));
                        }
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(ik.this.lr);
                    }
                    ik.this.lr.clear();
                    ik.this.di = false;
                    if (arrayList != null) {
                        ik.this.ka(arrayList);
                        return;
                    }
                    ik ikVar = ik.this;
                    ikVar.ka(ikVar.ka);
                    ik.this.ka.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public ik(Context context) {
        this.mj = true;
        this.ri = context;
        try {
            com.bytedance.sdk.component.di.ri.fi fiVarVr = com.bytedance.sdk.component.di.ri.xha.di().vr();
            if (fiVarVr != null) {
                this.mj = fiVarVr.aw();
                this.fi = fiVarVr.bgr();
                ik = fiVarVr.vr();
            }
            ac.ri("DBInsertMemRepo", "enableOpt:" + this.mj + ",BATCH_SIZE:" + ik, Boolean.valueOf(this.fi));
        } catch (Throwable unused) {
        }
    }

    public long di() {
        return Ua.s;
    }

    public Context fi() {
        return this.ri;
    }

    public synchronized void ik(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    Iterator<com.bytedance.sdk.component.di.ri.ka.ri> it = this.lr.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.di.ri.ka.ri next = it.next();
                        if (next != null) {
                            String strIk = next.ik();
                            if (!TextUtils.isEmpty(strIk) && list.contains(strIk)) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th) {
                    lr();
                    th.getMessage();
                }
            }
        }
    }

    public void ka(List<com.bytedance.sdk.component.di.ri.ka.ri> list) {
        com.bytedance.sdk.component.di.ri.ri.ri.ik.ri(fi(), lr(), list);
    }

    public abstract String lr();

    private void ri() {
        if (!this.di) {
            com.bytedance.sdk.component.di.ri.xha.ri.ri().postDelayed(this.jbs, this.fi ? di() : com.bytedance.sdk.component.di.ri.xha.ri.lr());
            this.di = true;
        }
        if (this.mj && this.lr.size() >= ik && !this.xha) {
            com.bytedance.sdk.component.di.ri.xha.ri.ri().removeCallbacks(this.jbs);
            com.bytedance.sdk.component.di.ri.xha.ri.ri().post(this.jbs);
            this.di = true;
            this.xha = true;
        }
    }

    public synchronized void ri(com.bytedance.sdk.component.di.ri.ka.ri riVar) {
        if (riVar.di() != null && !TextUtils.isEmpty(riVar.ik())) {
            this.lr.add(riVar);
            ri();
        }
    }
}
