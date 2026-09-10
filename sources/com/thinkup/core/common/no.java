package com.thinkup.core.common;

import android.content.Context;
import android.os.Handler;
import com.thinkup.core.common.on.mnm;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public abstract class no<T extends mnm> {
    protected Context o0;
    final String o = getClass().getSimpleName();
    ArrayList<T> m = new ArrayList<>();
    private final AtomicBoolean on = new AtomicBoolean(false);
    Runnable om = new Runnable() { // from class: com.thinkup.core.common.no.1
        @Override // java.lang.Runnable
        public final void run() {
            no.this.on.set(false);
            no.this.o(true);
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f41987n = com.thinkup.core.common.n.o0n.m().o00();
    protected final Handler oo = com.thinkup.core.common.ooo.m.m.o().o(9);

    public no(Context context) {
        this.o0 = context.getApplicationContext();
    }

    public abstract void o(List<T> list);

    public final synchronized void o(T t, boolean z2) {
        Handler handler;
        if (!com.thinkup.core.common.n.o0n.m().o()) {
            this.m.add(t);
            return;
        }
        boolean z3 = true;
        if (z2) {
            this.m.add(t);
            o(true);
            return;
        }
        com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(this.o0).m(this.f41987n);
        if (!this.on.compareAndSet(false, true)) {
            z3 = false;
        } else if (mVarM.nn0() > 0 && (handler = this.oo) != null) {
            handler.removeCallbacks(this.om);
            this.oo.postDelayed(this.om, mVarM.nn0());
            z3 = false;
        }
        this.m.add(t);
        o(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(boolean z2) {
        Handler handler;
        try {
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.m);
                if (arrayList.size() > 0) {
                    o(arrayList);
                }
                this.m.clear();
            } else {
                com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(this.o0).m(this.f41987n);
                ArrayList arrayList2 = new ArrayList();
                if (this.m.size() >= mVarM.nmm()) {
                    for (int iNmm = mVarM.nmm() - 1; iNmm >= 0; iNmm--) {
                        arrayList2.add(this.m.get(iNmm));
                        this.m.remove(iNmm);
                    }
                    if (arrayList2.size() > 0) {
                        o(arrayList2);
                    }
                }
            }
            if (this.m.isEmpty() && (handler = this.oo) != null) {
                handler.removeCallbacks(this.om);
                this.on.set(false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
