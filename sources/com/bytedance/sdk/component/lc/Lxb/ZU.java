package com.bytedance.sdk.component.lc.Lxb;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.kqm;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    public static final ZU Lxb = new ZU();

    private boolean lk() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    private void LD(Lxb lxb, Context context) {
        lk.Lxb(context, "context == null");
        lk.Lxb(lxb, "AdLogConfig == null");
        lk.Lxb(lxb.ZU(), "AdLogDepend ==null");
    }

    public void LD() {
        final JXs jXsVVE = OY.ebl().VVE();
        if (jXsVVE == null || OY.ebl().lc() == null || jXsVVE.ZU() == null) {
            return;
        }
        if (OY.ebl().LD()) {
            if (Lxb(OY.ebl().lc(), jXsVVE)) {
                OY.ebl().JVA();
                return;
            } else if (lk()) {
                jXsVVE.ZU().execute(new com.bytedance.sdk.component.lc.Lxb.JXs.JXs("stop") { // from class: com.bytedance.sdk.component.lc.Lxb.ZU.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ZU.this.LD(jXsVVE.lc());
                    }
                });
                return;
            } else {
                LD(jXsVVE.lc());
                return;
            }
        }
        OY.ebl().JVA();
    }

    public void Lxb(Lxb lxb, Context context) {
        LD(lxb, context);
        OY.ebl().Lxb(context);
        OY.ebl().Lxb(lxb.nBu());
        OY.ebl().LD(lxb.ebl());
        OY.ebl().lk(lxb.OY());
        OY.ebl().Lxb(lxb.LD());
        OY.ebl().ZU(lxb.QAg());
        OY.ebl().JXs(lxb.lc());
        OY.ebl().Lxb(lxb.Lxb() == null ? com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.JXs.Lxb : lxb.Lxb());
        OY.ebl().LD(lxb.JVA());
        OY.ebl().Lxb(lxb.ZU());
        OY.ebl().Lxb(lxb.lk());
        OY.ebl().Lxb(lxb.JXs());
        com.bytedance.sdk.component.lc.Lxb.LD.lk.lk.Lxb(lxb.NXR());
        com.bytedance.sdk.component.lc.Lxb.LD.lk.lk.LD(lxb.sLN());
        Lxb(lxb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(int i) {
        if (i == 0) {
            com.bytedance.sdk.component.lc.Lxb.LD.LD.Lxb.LD();
        } else if (i == 1) {
            com.bytedance.sdk.component.lc.Lxb.LD.LD.LD.LD();
        }
    }

    private void LD(final com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        final JXs jXsVVE = OY.ebl().VVE();
        if (lxb == null || jXsVVE == null || OY.ebl().lc() == null || jXsVVE.ZU() == null) {
            return;
        }
        if (OY.ebl().LD()) {
            if (Lxb(OY.ebl().lc(), jXsVVE)) {
                OY.ebl().Lxb(lxb);
                return;
            }
            lk();
            if (lk()) {
                jXsVVE.ZU().execute(new com.bytedance.sdk.component.lc.Lxb.JXs.JXs("dispatchEvent") { // from class: com.bytedance.sdk.component.lc.Lxb.ZU.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ZU.this.Lxb(lxb, jXsVVE.lc());
                    }
                });
                return;
            } else {
                Lxb(lxb, jXsVVE.lc());
                return;
            }
        }
        OY.ebl().Lxb(lxb);
    }

    private void Lxb(Lxb lxb) {
        Executor executorJXs;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.lc.Lxb.lk.Lxb.LD()) {
            com.bytedance.sdk.component.lc.Lxb.lk.Lxb.Lxb();
            return;
        }
        JXs jXsZU = lxb.ZU();
        if (jXsZU == null || !com.bytedance.sdk.component.lc.Lxb.lk.Lxb.LD() || (executorJXs = jXsZU.JXs()) == null) {
            return;
        }
        executorJXs.execute(new Runnable() { // from class: com.bytedance.sdk.component.lc.Lxb.ZU.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.lc.Lxb.lk.Lxb.Lxb();
            }
        });
    }

    public void Lxb(boolean z) {
        OY.ebl().Lxb(z);
    }

    private boolean Lxb(Context context, JXs jXs) {
        if (context == null || jXs == null) {
            return false;
        }
        if (jXs.lc() == 2) {
            return true;
        }
        if (jXs.lc() == 1) {
            return jXs.STP();
        }
        try {
            return kqm.Lxb(context);
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void Lxb() {
        final JXs jXsVVE = OY.ebl().VVE();
        if (jXsVVE == null || OY.ebl().lc() == null || jXsVVE.ZU() == null) {
            return;
        }
        if (OY.ebl().LD()) {
            if (Lxb(OY.ebl().lc(), jXsVVE)) {
                OY.ebl().QAg();
                return;
            } else if (lk()) {
                jXsVVE.ZU().execute(new com.bytedance.sdk.component.lc.Lxb.JXs.JXs("start") { // from class: com.bytedance.sdk.component.lc.Lxb.ZU.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ZU.this.Lxb(jXsVVE.lc());
                    }
                });
                return;
            } else {
                Lxb(jXsVVE.lc());
                return;
            }
        }
        OY.ebl().QAg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(int i) {
        if (i == 0) {
            com.bytedance.sdk.component.lc.Lxb.LD.LD.Lxb.Lxb();
        } else if (i == 1) {
            com.bytedance.sdk.component.lc.Lxb.LD.LD.LD.Lxb();
        }
    }

    public void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        LD(lxb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb, int i) {
        if (i == 0) {
            com.bytedance.sdk.component.lc.Lxb.LD.LD.Lxb.Lxb(lxb);
        } else if (i == 1) {
            com.bytedance.sdk.component.lc.Lxb.LD.LD.LD.Lxb(lxb);
        }
    }

    public void Lxb(final String str, final List<String> list, final boolean z, Map<String, String> map, final int i, final String str2) {
        final JXs jXsVVE = OY.ebl().VVE();
        if (jXsVVE == null || OY.ebl().lc() == null || jXsVVE.ZU() == null) {
            return;
        }
        if (jXsVVE.OY()) {
            if (jXsVVE.lc() == 1) {
                if (list == null || list.isEmpty()) {
                    return;
                }
            } else if (jXsVVE.lc() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
                return;
            }
            if (OY.ebl().LD() && !Lxb(OY.ebl().lc(), jXsVVE)) {
                if (lk()) {
                    jXsVVE.ZU().execute(new com.bytedance.sdk.component.lc.Lxb.JXs.JXs("trackFailed") { // from class: com.bytedance.sdk.component.lc.Lxb.ZU.5
                        @Override // java.lang.Runnable
                        public void run() {
                            ZU.this.Lxb(str, (List<String>) list, z, jXsVVE.lc(), i, str2);
                        }
                    });
                    return;
                } else {
                    Lxb(str, list, z, jXsVVE.lc(), i, str2);
                    return;
                }
            }
            OY.ebl().Lxb(str, list, z, map, i, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(String str, List<String> list, boolean z, int i, int i2, String str2) {
        if (i == 0) {
            com.bytedance.sdk.component.lc.Lxb.LD.LD.Lxb.Lxb(str, list, z);
        } else if (i == 1) {
            com.bytedance.sdk.component.lc.Lxb.LD.LD.LD.Lxb(str, list, z, i2, str2);
        }
    }

    public void Lxb(final String str, final boolean z) {
        final JXs jXsVVE = OY.ebl().VVE();
        if (jXsVVE == null || OY.ebl().lc() == null || jXsVVE.ZU() == null || !jXsVVE.OY()) {
            return;
        }
        if (jXsVVE.lc() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        if (OY.ebl().LD() && !Lxb(OY.ebl().lc(), jXsVVE)) {
            if (lk()) {
                jXsVVE.ZU().execute(new com.bytedance.sdk.component.lc.Lxb.JXs.JXs("trackFailed") { // from class: com.bytedance.sdk.component.lc.Lxb.ZU.6
                    @Override // java.lang.Runnable
                    public void run() {
                        ZU.this.Lxb(str, jXsVVE.lc(), z);
                    }
                });
                return;
            } else {
                Lxb(str, jXsVVE.lc(), z);
                return;
            }
        }
        OY.ebl().Lxb(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(String str, int i, boolean z) {
        if (i == 0) {
            com.bytedance.sdk.component.lc.Lxb.LD.LD.Lxb.Lxb(str);
        } else if (i == 1) {
            com.bytedance.sdk.component.lc.Lxb.LD.LD.LD.Lxb(str, z);
        }
    }
}
