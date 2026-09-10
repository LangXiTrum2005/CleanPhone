package com.bytedance.sdk.component.mo.qdl;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.jyq;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class mml {
    public static final mml qdl = new mml();

    private boolean lnr() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    private void ud(qdl qdlVar, Context context) {
        lnr.qdl(context, "context == null");
        lnr.qdl(qdlVar, "AdLogConfig == null");
        lnr.qdl(qdlVar.mml(), "AdLogDepend ==null");
    }

    public void qdl(qdl qdlVar, Context context) {
        ud(qdlVar, context);
        jpc.wd().qdl(context);
        jpc.wd().qdl(qdlVar.to());
        jpc.wd().ud(qdlVar.wd());
        jpc.wd().lnr(qdlVar.jpc());
        jpc.wd().qdl(qdlVar.ud());
        jpc.wd().mml(qdlVar.tvp());
        jpc.wd().mzz(qdlVar.mo());
        jpc.wd().qdl(qdlVar.qdl() == null ? com.bytedance.sdk.component.mo.qdl.qdl.qdl.mzz.qdl : qdlVar.qdl());
        jpc.wd().ud(qdlVar.rq());
        jpc.wd().qdl(qdlVar.mml());
        jpc.wd().qdl(qdlVar.lnr());
        jpc.wd().qdl(qdlVar.mzz());
        com.bytedance.sdk.component.mo.qdl.ud.lnr.lnr.qdl(qdlVar.exu());
        com.bytedance.sdk.component.mo.qdl.ud.lnr.lnr.ud(qdlVar.fs());
        qdl(qdlVar);
    }

    public void ud() {
        final mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx == null || jpc.wd().mo() == null || mzzVarJtx.mml() == null) {
            return;
        }
        if (jpc.wd().ud()) {
            if (qdl(jpc.wd().mo(), mzzVarJtx)) {
                jpc.wd().rq();
                return;
            } else if (lnr()) {
                mzzVarJtx.mml().execute(new com.bytedance.sdk.component.mo.qdl.mzz.mzz("stop") { // from class: com.bytedance.sdk.component.mo.qdl.mml.3
                    @Override // java.lang.Runnable
                    public void run() {
                        mml.this.ud(mzzVarJtx.mo());
                    }
                });
                return;
            } else {
                ud(mzzVarJtx.mo());
                return;
            }
        }
        jpc.wd().rq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(int i2) {
        if (i2 == 0) {
            com.bytedance.sdk.component.mo.qdl.ud.ud.qdl.ud();
        } else if (i2 == 1) {
            com.bytedance.sdk.component.mo.qdl.ud.ud.ud.ud();
        }
    }

    private void ud(final com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        final mzz mzzVarJtx = jpc.wd().jtx();
        if (qdlVar == null || mzzVarJtx == null || jpc.wd().mo() == null || mzzVarJtx.mml() == null) {
            return;
        }
        if (jpc.wd().ud()) {
            if (qdl(jpc.wd().mo(), mzzVarJtx)) {
                jpc.wd().qdl(qdlVar);
                return;
            }
            lnr();
            if (lnr()) {
                mzzVarJtx.mml().execute(new com.bytedance.sdk.component.mo.qdl.mzz.mzz("dispatchEvent") { // from class: com.bytedance.sdk.component.mo.qdl.mml.4
                    @Override // java.lang.Runnable
                    public void run() {
                        mml.this.qdl(qdlVar, mzzVarJtx.mo());
                    }
                });
                return;
            } else {
                qdl(qdlVar, mzzVarJtx.mo());
                return;
            }
        }
        jpc.wd().qdl(qdlVar);
    }

    private void qdl(qdl qdlVar) {
        Executor executorMzz;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.mo.qdl.lnr.qdl.ud()) {
            com.bytedance.sdk.component.mo.qdl.lnr.qdl.qdl();
            return;
        }
        mzz mzzVarMml = qdlVar.mml();
        if (mzzVarMml == null || !com.bytedance.sdk.component.mo.qdl.lnr.qdl.ud() || (executorMzz = mzzVarMml.mzz()) == null) {
            return;
        }
        executorMzz.execute(new Runnable() { // from class: com.bytedance.sdk.component.mo.qdl.mml.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.mo.qdl.lnr.qdl.qdl();
            }
        });
    }

    public void qdl(boolean z2) {
        jpc.wd().qdl(z2);
    }

    private boolean qdl(Context context, mzz mzzVar) {
        if (context == null || mzzVar == null) {
            return false;
        }
        if (mzzVar.mo() == 2) {
            return true;
        }
        if (mzzVar.mo() == 1) {
            return mzzVar.exu();
        }
        try {
            return jyq.qdl(context);
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void qdl() {
        final mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx == null || jpc.wd().mo() == null || mzzVarJtx.mml() == null) {
            return;
        }
        if (jpc.wd().ud()) {
            if (qdl(jpc.wd().mo(), mzzVarJtx)) {
                jpc.wd().tvp();
                return;
            } else if (lnr()) {
                mzzVarJtx.mml().execute(new com.bytedance.sdk.component.mo.qdl.mzz.mzz("start") { // from class: com.bytedance.sdk.component.mo.qdl.mml.2
                    @Override // java.lang.Runnable
                    public void run() {
                        mml.this.qdl(mzzVarJtx.mo());
                    }
                });
                return;
            } else {
                qdl(mzzVarJtx.mo());
                return;
            }
        }
        jpc.wd().tvp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(int i2) {
        if (i2 == 0) {
            com.bytedance.sdk.component.mo.qdl.ud.ud.qdl.qdl();
        } else if (i2 == 1) {
            com.bytedance.sdk.component.mo.qdl.ud.ud.ud.qdl();
        }
    }

    public void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        ud(qdlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar, int i2) {
        if (i2 == 0) {
            com.bytedance.sdk.component.mo.qdl.ud.ud.qdl.qdl(qdlVar);
        } else if (i2 == 1) {
            com.bytedance.sdk.component.mo.qdl.ud.ud.ud.qdl(qdlVar);
        }
    }

    public void qdl(final String str, final List<String> list, final boolean z2, Map<String, String> map, final int i2, final String str2) {
        final mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx == null || jpc.wd().mo() == null || mzzVarJtx.mml() == null || !mzzVarJtx.jpc()) {
            return;
        }
        if (mzzVarJtx.mo() == 1) {
            if (list == null || list.isEmpty()) {
                return;
            }
        } else if (mzzVarJtx.mo() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
            return;
        }
        if (jpc.wd().ud() && !qdl(jpc.wd().mo(), mzzVarJtx)) {
            if (lnr()) {
                mzzVarJtx.mml().execute(new com.bytedance.sdk.component.mo.qdl.mzz.mzz("trackFailed") { // from class: com.bytedance.sdk.component.mo.qdl.mml.5
                    @Override // java.lang.Runnable
                    public void run() {
                        mml.this.qdl(str, (List<String>) list, z2, mzzVarJtx.mo(), i2, str2);
                    }
                });
                return;
            } else {
                qdl(str, list, z2, mzzVarJtx.mo(), i2, str2);
                return;
            }
        }
        jpc.wd().qdl(str, list, z2, map, i2, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(String str, List<String> list, boolean z2, int i2, int i3, String str2) {
        if (i2 == 0) {
            com.bytedance.sdk.component.mo.qdl.ud.ud.qdl.qdl(str, list, z2);
        } else if (i2 == 1) {
            com.bytedance.sdk.component.mo.qdl.ud.ud.ud.qdl(str, list, z2, i3, str2);
        }
    }

    public void qdl(final String str, final boolean z2) {
        final mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx == null || jpc.wd().mo() == null || mzzVarJtx.mml() == null || !mzzVarJtx.jpc() || (mzzVarJtx.mo() == 0 && TextUtils.isEmpty(str))) {
            return;
        }
        if (jpc.wd().ud() && !qdl(jpc.wd().mo(), mzzVarJtx)) {
            if (lnr()) {
                mzzVarJtx.mml().execute(new com.bytedance.sdk.component.mo.qdl.mzz.mzz("trackFailed") { // from class: com.bytedance.sdk.component.mo.qdl.mml.6
                    @Override // java.lang.Runnable
                    public void run() {
                        mml.this.qdl(str, mzzVarJtx.mo(), z2);
                    }
                });
                return;
            } else {
                qdl(str, mzzVarJtx.mo(), z2);
                return;
            }
        }
        jpc.wd().qdl(str, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(String str, int i2, boolean z2) {
        if (i2 == 0) {
            com.bytedance.sdk.component.mo.qdl.ud.ud.qdl.qdl(str);
        } else if (i2 == 1) {
            com.bytedance.sdk.component.mo.qdl.ud.ud.ud.qdl(str, z2);
        }
    }
}
