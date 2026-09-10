package com.bytedance.sdk.component.mj.ri;

import android.os.Handler;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.component.utils.mj;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private Handler lr;
    private final ka<lr> ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.mj.ri.ri$ri, reason: collision with other inner class name */
    public static class C0215ri {
        private static final ri ri = new ri();
    }

    public Handler lr() {
        if (this.lr == null) {
            synchronized (ri.class) {
                try {
                    if (this.lr == null) {
                        this.lr = ri("csj_io_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.lr;
    }

    private ri() {
        this.ri = ka.ri(2);
    }

    public static ri ri() {
        return C0215ri.ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.mj.ri.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    ri.this.ri(handler, handler2);
                }
            }, 1000L);
        }
    }

    private lr lr(igq.ri riVar, String str) {
        return new lr(mj.ri(str), riVar);
    }

    public igq ri(igq.ri riVar, final String str) {
        lr lrVar = (lr) this.ri.ri();
        if (lrVar != null) {
            lrVar.ri(riVar);
            lrVar.post(new Runnable() { // from class: com.bytedance.sdk.component.mj.ri.ri.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return lrVar;
        }
        return lr(riVar, str);
    }

    public igq ri(String str) {
        return ri((igq.ri) null, str);
    }

    public boolean ri(igq igqVar) {
        if (!(igqVar instanceof lr)) {
            return false;
        }
        lr lrVar = (lr) igqVar;
        if (this.ri.ri(lrVar)) {
            return true;
        }
        lrVar.lr();
        return true;
    }
}
