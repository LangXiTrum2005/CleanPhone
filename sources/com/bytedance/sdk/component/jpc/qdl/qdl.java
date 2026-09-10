package com.bytedance.sdk.component.jpc.qdl;

import android.os.Handler;
import com.bytedance.sdk.component.utils.jpc;
import com.bytedance.sdk.component.utils.koa;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private final mml<ud> qdl;
    private Handler ud;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.jpc.qdl.qdl$qdl, reason: collision with other inner class name */
    public static class C0083qdl {
        private static final qdl qdl = new qdl();
    }

    public Handler ud() {
        if (this.ud == null) {
            synchronized (qdl.class) {
                try {
                    if (this.ud == null) {
                        this.ud = qdl("csj_io_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.ud;
    }

    private qdl() {
        this.qdl = mml.qdl(2);
    }

    public static qdl qdl() {
        return C0083qdl.qdl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.jpc.qdl.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    qdl.this.qdl(handler, handler2);
                }
            }, 1000L);
        }
    }

    private ud ud(koa.qdl qdlVar, String str) {
        return new ud(jpc.qdl(str), qdlVar);
    }

    public koa qdl(koa.qdl qdlVar, final String str) {
        ud udVar = (ud) this.qdl.qdl();
        if (udVar != null) {
            udVar.qdl(qdlVar);
            udVar.post(new Runnable() { // from class: com.bytedance.sdk.component.jpc.qdl.qdl.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return udVar;
        }
        return ud(qdlVar, str);
    }

    public koa qdl(String str) {
        return qdl((koa.qdl) null, str);
    }

    public boolean qdl(koa koaVar) {
        if (!(koaVar instanceof ud)) {
            return false;
        }
        ud udVar = (ud) koaVar;
        if (this.qdl.qdl(udVar)) {
            return true;
        }
        udVar.ud();
        return true;
    }
}
