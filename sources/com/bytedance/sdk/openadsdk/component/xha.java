package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.core.jbs;
import com.bytedance.sdk.openadsdk.core.model.hcw;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.uq;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.core.wjv;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.pv;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class xha implements igq.ri {
    private AdSlot di;
    private final di ik;
    private final wjv<com.bytedance.sdk.openadsdk.ka.ri> lr;
    private int mj;
    private final Context ri;
    private boolean sf;
    private PAGAppOpenAdLoadListener xha;
    private final AtomicBoolean ka = new AtomicBoolean(false);
    private int fi = 0;
    private volatile int jbs = 0;
    private final hcw qt = new hcw();

    public xha(Context context) {
        if (context != null) {
            this.ri = context.getApplicationContext();
        } else {
            this.ri = nr.ri();
        }
        this.lr = nr.ik();
        this.ik = di.ri(this.ri);
    }

    private void ik(final AdSlot adSlot) {
        final pv pvVarLr = pv.lr();
        com.bytedance.sdk.openadsdk.core.model.igq igqVar = new com.bytedance.sdk.openadsdk.core.model.igq();
        igqVar.sf = this.qt;
        igqVar.ka = 1;
        igqVar.jbs = 2;
        this.lr.ri(adSlot, igqVar, 3, new uq() { // from class: com.bytedance.sdk.openadsdk.component.xha.1
            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(int i, String str) {
                xha.this.jbs = 3;
                xha.this.ri(new com.bytedance.sdk.openadsdk.component.fi.ik(2, 100, i, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar) {
                xha.this.ri(riVar, ikVar, adSlot, pvVarLr);
            }
        });
    }

    private void lr(AdSlot adSlot) {
        this.jbs = 1;
        ik(adSlot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr() {
        final pv pvVarLr = pv.lr();
        com.bytedance.sdk.openadsdk.core.model.igq igqVar = new com.bytedance.sdk.openadsdk.core.model.igq();
        igqVar.sf = this.qt;
        igqVar.ka = 1;
        igqVar.jbs = 2;
        this.jbs = 1;
        this.lr.ri(this.di, igqVar, 3, new uq() { // from class: com.bytedance.sdk.openadsdk.component.xha.4
            boolean ri = false;

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.ihz
            public String ri() {
                if (!com.bytedance.sdk.openadsdk.component.xha.ri.fi()) {
                    return xha.this.ik.ik(xha.this.fi);
                }
                com.bytedance.sdk.openadsdk.component.fi.lr lrVarRi = com.bytedance.sdk.openadsdk.common.nr.ri().ri(xha.this.di);
                if (lrVarRi == null) {
                    return null;
                }
                xha.this.di.setCacheTime(lrVarRi.ka());
                return lrVarRi.lr();
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.ihz
            public boolean ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVarDi;
                if (riVar != null && riVar.fi() && (wjvVarDi = riVar.di()) != null) {
                    boolean zFi = com.bytedance.sdk.openadsdk.core.model.wjv.fi(wjvVarDi);
                    if (wjvVarDi.ory() || !zFi || com.bytedance.sdk.openadsdk.component.xha.ri.di() || !TextUtils.isEmpty(xha.this.ik.ri(wjvVarDi))) {
                        this.ri = !xha.this.ik.lr(wjvVarDi.eb());
                    } else {
                        this.ri = false;
                        com.bytedance.sdk.openadsdk.component.ka.ri.lr(riVar.di());
                    }
                    com.bytedance.sdk.openadsdk.core.aw.ik.ka.ri(wjvVarDi);
                }
                return this.ri;
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(int i, String str) {
                xha.this.jbs = 3;
                xha.this.ri(new com.bytedance.sdk.openadsdk.component.fi.ik(2, 100, i, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar) {
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVarDi;
                if (riVar == null || (wjvVarDi = riVar.di()) == null) {
                    return;
                }
                wjvVarDi.ik(xha.this.qt.qt());
                if (this.ri) {
                    xha.this.ik.ri(wjvVarDi.eb(), wjvVarDi.jf());
                    xha.this.ri(new com.bytedance.sdk.openadsdk.component.fi.ik(1, 101, wjvVarDi, (com.bytedance.sdk.openadsdk.core.model.ri) null));
                } else {
                    xha xhaVar = xha.this;
                    xhaVar.ri(riVar, ikVar, xhaVar.di, pvVarLr);
                }
            }
        });
    }

    public static xha ri(Context context) {
        return new xha(context);
    }

    public void ri(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.xha xhaVar, int i) {
        if (xhaVar == null) {
            return;
        }
        if (i <= 0) {
            i = com.bytedance.sdk.openadsdk.component.xha.ri.xha();
        }
        this.di = adSlot;
        adSlot.setCacheScene(0);
        this.qt.ri = !TextUtils.isEmpty(this.di.getBidAdm());
        if (xhaVar instanceof PAGAppOpenAdLoadListener) {
            this.xha = (PAGAppOpenAdLoadListener) xhaVar;
        }
        this.fi = ri(this.di);
        this.mj = i;
        this.qt.ri(pv.lr());
        this.qt.lr(com.bytedance.sdk.openadsdk.component.xha.ri.lr());
        this.qt.lr(com.bytedance.sdk.openadsdk.component.xha.ri.ik());
        if (this.qt.ri) {
            lr(this.di);
        } else {
            new igq(vr.lr().getLooper(), this).sendEmptyMessageDelayed(1, i);
            ri();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(final com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar, AdSlot adSlot, pv pvVar) {
        this.jbs = 2;
        if (riVar != null && riVar.ka() != null && riVar.ka().size() != 0) {
            final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = riVar.ka().get(0);
            long jGcp = wjvVar.gcp();
            hcw hcwVar = this.qt;
            hcwVar.lr = jGcp;
            wjvVar.ik(hcwVar.qt());
            boolean zDi = com.bytedance.sdk.openadsdk.core.model.wjv.di(wjvVar);
            if (wjvVar.ory()) {
                ri(new com.bytedance.sdk.openadsdk.component.fi.ik(1, 100, wjvVar, riVar));
                return;
            }
            if (!zDi && !wjvVar.bl()) {
                if (com.bytedance.sdk.openadsdk.core.model.wjv.fi(wjvVar)) {
                    if (com.bytedance.sdk.openadsdk.component.xha.ri.di()) {
                        hcw hcwVar2 = this.qt;
                        hcwVar2.lr = -1L;
                        hcwVar2.ri(3);
                        ri(new com.bytedance.sdk.openadsdk.component.fi.ik(1, 100, wjvVar, riVar));
                        ri(wjvVar, adSlot, false, riVar);
                        return;
                    }
                    ri(wjvVar, adSlot, !this.qt.ri, riVar);
                    if (this.qt.ri) {
                        com.bytedance.sdk.openadsdk.slm.ka.ri(wjvVar, pvVar.ka());
                        if (jGcp == 0) {
                            this.qt.ri(2);
                            ri(new com.bytedance.sdk.openadsdk.component.fi.ik(1, 100, wjvVar, riVar));
                            return;
                        } else {
                            vr.lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.xha.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    xha.this.qt.ri(2);
                                    xha.this.ri(new com.bytedance.sdk.openadsdk.component.fi.ik(1, 100, wjvVar, riVar));
                                }
                            }, jGcp);
                            return;
                        }
                    }
                    return;
                }
                hcw hcwVar3 = this.qt;
                hcwVar3.lr = -1L;
                hcwVar3.ri(3);
                ri(new com.bytedance.sdk.openadsdk.component.fi.ik(1, 100, wjvVar, riVar));
                ri(wjvVar, false, riVar);
                return;
            }
            ri(new com.bytedance.sdk.openadsdk.component.fi.ik(1, 100, wjvVar, riVar));
            if (com.bytedance.sdk.openadsdk.core.model.wjv.fi(wjvVar)) {
                ri(wjvVar, adSlot, false, riVar);
                return;
            } else {
                ri(wjvVar, false, riVar);
                return;
            }
        }
        this.jbs = 3;
        ri(new com.bytedance.sdk.openadsdk.component.fi.ik(2, 100, Sdk$SDKError.Reason.AD_SERVER_ERROR_VALUE, jbs.ri(Sdk$SDKError.Reason.AD_SERVER_ERROR_VALUE)));
        ikVar.ri(-3);
        ikVar.ik(3);
        com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar);
    }

    private void ri() {
        dzy.ik((Runnable) new com.bytedance.sdk.component.mj.lr.ik("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.xha.3
            @Override // java.lang.Runnable
            public void run() {
                xha.this.lr();
            }
        });
    }

    private void ri(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot, final boolean z, final com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        this.ik.ri(wjvVar, adSlot, this.qt, new di.lr() { // from class: com.bytedance.sdk.openadsdk.component.xha.5
            @Override // com.bytedance.sdk.openadsdk.component.di.lr
            public void ri() {
                if (z) {
                    xha.this.jbs = 4;
                    com.bytedance.sdk.openadsdk.component.fi.ik ikVar = new com.bytedance.sdk.openadsdk.component.fi.ik(1, 100, wjvVar, riVar);
                    ikVar.ri(true);
                    xha.this.ri(ikVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.di.lr
            public void ri(int i, String str) {
                if (z) {
                    xha.this.jbs = 5;
                    xha.this.ri(new com.bytedance.sdk.openadsdk.component.fi.ik(2, 100, 10003, jbs.ri(10003)));
                }
            }
        });
    }

    private void ri(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final boolean z, final com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        this.ik.ri(wjvVar, this.qt, new di.ri() { // from class: com.bytedance.sdk.openadsdk.component.xha.6
            @Override // com.bytedance.sdk.openadsdk.component.di.ri
            public void ri(com.bytedance.sdk.openadsdk.ac.ri.lr lrVar) {
                if (z) {
                    xha.this.jbs = 4;
                    com.bytedance.sdk.openadsdk.component.fi.ik ikVar = new com.bytedance.sdk.openadsdk.component.fi.ik(1, 100, wjvVar, riVar);
                    ikVar.ri(true);
                    xha.this.ri(ikVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.di.ri
            public void ri() {
                if (z) {
                    xha.this.jbs = 5;
                    xha.this.ri(new com.bytedance.sdk.openadsdk.component.fi.ik(2, 100, 10003, jbs.ri(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(com.bytedance.sdk.openadsdk.component.fi.ik ikVar) {
        int iLr = ikVar.lr();
        int iIk = ikVar.ik();
        com.bytedance.sdk.openadsdk.component.ka.ri.ri(this.qt, iIk, iLr);
        if (!this.ka.compareAndSet(false, true)) {
            if (iLr == 1 && iIk == 100 && !this.qt.ri) {
                di.ri(nr.ri()).ri(new com.bytedance.sdk.openadsdk.component.fi.ri(this.fi, ikVar.ka(), ikVar.ri()));
                if (this.sf) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.ka.ri.ri(ikVar.ka(), 1, this.qt);
                return;
            }
            return;
        }
        if (iLr != 1) {
            if (iLr == 2 || iLr == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.xha;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(ikVar.fi(), ikVar.di());
                }
                if (iLr == 3) {
                    com.bytedance.sdk.openadsdk.component.ka.ri.ri(this.jbs, this.mj, this.qt);
                    return;
                }
                return;
            }
            return;
        }
        if (iIk == 100 && !this.qt.ri) {
            this.ik.ri(new com.bytedance.sdk.openadsdk.component.fi.ri(this.fi, ikVar.ka(), ikVar.ri()));
        }
        if (this.xha != null) {
            this.xha.onAdLoaded(new ka(this.ri, ikVar.ka(), iIk == 101, this.di));
        }
        if (iIk == 101) {
            com.bytedance.sdk.openadsdk.component.ka.ri.ri(ikVar.ka(), this.qt.ri().ka());
        } else if (iIk == 100) {
            com.bytedance.sdk.openadsdk.component.ka.ri.ri(ikVar.ka(), 0, this.qt);
            this.sf = true;
        }
    }

    public int ri(AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
        if (message.what != 1 || this.ka.get()) {
            return;
        }
        ri(new com.bytedance.sdk.openadsdk.component.fi.ik(3, 102, Sdk$SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, jbs.ri(Sdk$SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE)));
    }
}
