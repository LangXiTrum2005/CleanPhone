package com.bytedance.sdk.openadsdk.core.bgr.ka;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import benzoyl.saneness;
import com.bytedance.sdk.component.utils.jbs;
import com.bytedance.sdk.openadsdk.component.reward.view.mj;
import com.bytedance.sdk.openadsdk.core.aw.di;
import com.bytedance.sdk.openadsdk.core.bgr.lr.fi;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.ka.xha;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.bytedance.sdk.openadsdk.utils.srn;
import com.bytedance.sdk.openadsdk.vr.ka;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.unity3d.services.UnityAdsConstants;
import euthanasia.attabal;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import logician.dern;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends com.bytedance.sdk.openadsdk.core.bgr.ri.ri {
    protected long dzy;
    private final Runnable fe;
    private final int feb;
    final ik.lr ig;
    private long jc;
    private boolean kt;
    protected boolean pv;
    private final xha qd;
    private long srn;
    private InterfaceC0235ri ta;
    private boolean tnn;
    private final AtomicBoolean zyn;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.ka.ri$ri, reason: collision with other inner class name */
    public interface InterfaceC0235ri {
        void ri(int i);
    }

    public ri(Context context, ViewGroup viewGroup, wjv wjvVar, xha xhaVar) {
        super(context, wjvVar, viewGroup);
        this.srn = 0L;
        this.jc = 0L;
        this.kt = false;
        this.dzy = 0L;
        this.pv = false;
        this.zyn = new AtomicBoolean(false);
        this.ig = new AnonymousClass1();
        this.fe = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ka.ri.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).igq != null) {
                    ri.this.slm();
                    ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).igq.ri();
                }
            }
        };
        this.qd = xhaVar;
        this.feb = wjvVar.ur();
        if (wjvVar.yj() && this.fr != null) {
            if (this.zf == null) {
                this.zf = di.ri();
            }
            this.zf.ri(this.fr, wjvVar);
        }
        fi fiVar = new fi(context.getApplicationContext(), new ka(context), true, 17, this.mj, this);
        this.xha = fiVar;
        fiVar.ri(this);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri
    public boolean fr() {
        return true;
    }

    public void slm() {
    }

    private boolean fe() {
        return ig() == null || this.di == null || (!com.bytedance.sdk.openadsdk.core.co.fi.ri(this.mj.hpn()) ? this.mj.sez() != null : this.mj.zv() != null) || this.mj.jxw() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void feb() {
        int iBnj;
        int i = this.wjv.di;
        if (i == 2 || i == 1) {
            iBnj = nr.ka().bnj() * 1000;
        } else {
            iBnj = i == 4 ? nr.ka().jbs(String.valueOf(this.feb)) : 5000;
        }
        this.ik.removeCallbacks(this.fe);
        this.ik.postDelayed(this.fe, iBnj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jc() {
        lr(this.qd);
        this.wjv.fi = this.di.ihz();
        ory();
        this.ac.set(false);
        this.zyn.set(false);
        ri(this.qd);
    }

    private void kt() {
        this.di.ik(hcw());
        this.di.ri(this.wjv);
        this.srn = System.currentTimeMillis();
        this.xha.ik(8);
        this.xha.ik(0);
        ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ka.ri.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).di == null) {
                    return;
                }
                ri.this.srn = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).xha.ka(0);
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).di.ri(true, ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).jbs, ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).slm);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tnn() {
        return this.mj.gz() == 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zyn() {
        if (this.xha == null) {
            return;
        }
        this.ik.removeCallbacks(this.fe);
        this.xha.lr();
        this.jc = System.currentTimeMillis() - this.srn;
        if (!this.kt) {
            this.kt = true;
            long j = this.oh;
            lr(j, j);
            long j2 = this.oh;
            this.jbs = j2;
            this.qt = j2;
            lr(this.qd);
        }
        attabal.wireman wiremanVar = this.igq;
        if (wiremanVar != null) {
            wiremanVar.ri(this.jc, saneness.attabal(this.jbs, this.oh));
        }
        this.bgr = true;
    }

    public void di(boolean z) {
        this.tnn = z;
    }

    public void dzy() {
        this.ig.ri((dern) null, 0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri, euthanasia.attabal
    public void fi() {
        ka();
    }

    public com.bykv.vk.openvk.ri.ri.ri.di.attabal ig() {
        fi fiVar = this.xha;
        if (fiVar != null) {
            return fiVar.aw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri, euthanasia.attabal
    public void ka() {
        ik ikVar = this.di;
        if (ikVar == null) {
            return;
        }
        ikVar.co();
        this.di = null;
        fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.jbs();
        }
        this.ik.removeCallbacks(this.fe);
        this.ik.removeCallbacksAndMessages(null);
        di diVar = this.zf;
        if (diVar != null) {
            diVar.ka();
        }
    }

    public void pv() {
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        if (this.kt || !this.ac.get()) {
            return;
        }
        zf();
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = this.mj.qc();
        if (kaVarQc == null || (kaVarRi = kaVarQc.ri()) == null) {
            return;
        }
        kaVarRi.ik(di());
    }

    public void qd() {
        di diVar = this.zf;
        if (diVar != null) {
            diVar.ri(2);
        }
    }

    public void srn() {
        di diVar = this.zf;
        if (diVar != null) {
            diVar.ri(13);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.ka.ri$1, reason: invalid class name */
    public class AnonymousClass1 implements ik.lr {
        private boolean lr = true;

        public AnonymousClass1() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ik.lr, logician.dern.attabal
        public void fi(dern dernVar) {
            com.bytedance.sdk.openadsdk.ay.lr.fi.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj, 0);
            if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).zf != null) {
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).zf.ri(1);
            }
            if (ri.this.ta != null) {
                ri.this.ta.ri(1);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ik.lr, logician.dern.attabal
        public void ik(dern dernVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ri;
        }

        @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ik.lr, logician.dern.attabal
        public void ka(dern dernVar) {
            com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
            com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj.qc();
            if (kaVarQc != null && (kaVarRi = kaVarQc.ri()) != null) {
                kaVarRi.lr(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).jbs);
            }
            com.bytedance.sdk.openadsdk.ay.lr.fi.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj, 3);
            if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).zf != null) {
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).zf.ri(0);
            }
            if (ri.this.ta != null) {
                ri.this.ta.ri(2);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ik.lr, logician.dern.attabal
        public void lr(dern dernVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ri;
            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ik.removeCallbacks(ri.this.fe);
            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ka.ri.1.3
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).xha != null) {
                        ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).xha.lr();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ik.lr, logician.dern.attabal
        public void ri(dern dernVar) {
            com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
            if (ri.this.zyn.compareAndSet(false, true)) {
                String unused = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ri;
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ka.ri.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).zf != null) {
                            try {
                                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).zf.ri(9);
                            } catch (Exception unused2) {
                            }
                        }
                        ri.this.zyn();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj.qc();
                if (kaVarQc != null && (kaVarRi = kaVarQc.ri()) != null) {
                    long jDi = ri.this.di();
                    kaVarRi.ka(jDi);
                    kaVarRi.fi(jDi);
                }
                com.bytedance.sdk.openadsdk.ay.lr.fi.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj, 5);
                com.bytedance.sdk.openadsdk.ay.ri.ik.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj, 5);
                if (ri.this.ta != null) {
                    ri.this.ta.ri(3);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ik.lr, logician.dern.attabal
        public void lr(dern dernVar, int i) {
        }

        @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ik.lr, logician.dern.attabal
        public void ri(dern dernVar, long j) {
            String unused = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ri;
            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ay = false;
            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ik.removeCallbacks(ri.this.fe);
            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ka.ri.1.2
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).xha != null) {
                        ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).xha.lr();
                    }
                }
            });
            if (!((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ac.get()) {
                ri riVar = ri.this;
                riVar.dzy = j;
                riVar.ri(riVar.qd);
                ri.this.xd();
            }
            if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).zf != null) {
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).zf.ik();
            }
            com.bytedance.sdk.openadsdk.ay.lr.fi.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj, 0);
            if (ri.this.ta != null) {
                ri.this.ta.ri(1);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ik.lr, logician.dern.attabal
        public void ri(dern dernVar, com.bykv.vk.openvk.ri.ri.ri.ik.saneness sanenessVar) {
            com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
            String unused = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ri;
            sanenessVar.dern();
            sanenessVar.saneness();
            sanenessVar.attabal();
            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ik.removeCallbacks(ri.this.fe);
            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ka.ri.1.4
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).xha != null) {
                        ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).xha.lr();
                    }
                    if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).igq != null) {
                        ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).igq.lr(ri.this.jc, saneness.attabal(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).jbs, ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).oh));
                    }
                }
            });
            ri.this.ri(sanenessVar);
            com.bytedance.sdk.openadsdk.ay.lr.fi.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj, 6);
            com.bytedance.sdk.openadsdk.ay.ri.ik.lr(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj);
            if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).zf != null) {
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).zf.ri(14);
            }
            if (ri.this.ta != null) {
                ri.this.ta.ri(4);
            }
            com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj.qc();
            if (kaVarQc == null || (kaVarRi = kaVarQc.ri()) == null) {
                return;
            }
            kaVarRi.ri(com.bytedance.sdk.openadsdk.core.aw.ri.ri.GENERAL_LINEAR_AD_ERROR);
        }

        @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ik.lr, logician.dern.attabal
        public void ri(dern dernVar, boolean z) {
            String unused = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ri;
            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ik.removeCallbacks(ri.this.fe);
            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ka.ri.1.5
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).xha != null) {
                        ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).xha.lr();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ik.lr, logician.dern.attabal
        public void ri(dern dernVar, int i, int i2) {
            String unused = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ri;
            jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ka.ri.1.6
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).di == null) {
                        return;
                    }
                    try {
                        final float fKa = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).di.ka();
                        final float fFi = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).di.fi();
                        if (fKa == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fFi == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ka.ri.1.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (!ri.this.tnn()) {
                                    ri.this.ri(fKa, fFi);
                                    return;
                                }
                                if (ac.lr(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj) || ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).wjv.di == 4) {
                                    ri.this.ri(true, fKa, fFi);
                                    return;
                                }
                                if (ac.ik(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj)) {
                                    ri.this.ri(true, fKa, fFi);
                                    return;
                                }
                                if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj.hws() == 3) {
                                    ri.this.ri(true, fKa, fFi);
                                } else if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj.hws() == 0) {
                                    ri.this.ik(fKa, fFi);
                                } else {
                                    ri.this.lr(fKa, fFi);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.ac.ik(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ri, th.getMessage());
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ik.lr, logician.dern.attabal
        public void ri(dern dernVar, int i, int i2, int i3) {
            String unused = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ri;
            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ay = true;
            ri.this.feb();
            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ka.ri.1.7
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).xha != null) {
                        ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).xha.bu();
                    }
                }
            });
            com.bytedance.sdk.openadsdk.ay.lr.fi.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj, 3);
            if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).zf != null) {
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).zf.ri(4);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ik.lr, logician.dern.attabal
        public void ri(dern dernVar, int i) {
            String unused = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ri;
            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ay = false;
            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ik.removeCallbacks(ri.this.fe);
            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ka.ri.1.8
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).xha != null) {
                        ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).xha.lr();
                    }
                }
            });
            com.bytedance.sdk.openadsdk.ay.lr.fi.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj, 0);
            if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).zf != null) {
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).zf.ri(5);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ik.lr, logician.dern.attabal
        public void ri(final dern dernVar, long j, long j2) {
            long j3;
            long j4;
            com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
            if (Math.abs(j - ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).jbs) < 50) {
                return;
            }
            ri riVar = ri.this;
            riVar.ri(riVar.qd);
            ri.this.ri(j, j2);
            ri.this.lr(j, j2);
            com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).mj.qc();
            if (kaVarQc == null || (kaVarRi = kaVarQc.ri()) == null) {
                j3 = j;
                j4 = j2;
            } else {
                j3 = j;
                j4 = j2;
                kaVarRi.ri(j3, j4, ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).zf);
            }
            if (!this.lr || j4 - j3 >= 500) {
                return;
            }
            this.lr = false;
            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ik.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ka.ri.1.9
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass1.this.ri(dernVar);
                }
            }, 1000L);
        }

        @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ik.lr
        public void ri(int i, int i2) {
            ri.this.jc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri, euthanasia.attabal
    public void ik() {
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.ri();
            this.xha.vr();
            this.xha.nr();
        }
        ik ikVar = this.di;
        if (ikVar != null) {
            if (ikVar.xha()) {
                if (this.aw) {
                    if (qt.ac()) {
                        this.di.lr(3);
                        ik ikVar2 = this.di;
                        ikVar2.ri(false, ikVar2.nr(), this.slm);
                    } else {
                        ac();
                    }
                } else {
                    lr(this.xd);
                }
            } else {
                this.di.ri(false, this.jbs, this.slm);
            }
        }
        if (this.kt || !this.ac.get()) {
            return;
        }
        zf();
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = this.mj.qc();
        if (kaVarQc == null || (kaVarRi = kaVarQc.ri()) == null) {
            return;
        }
        kaVarRi.ik(di());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    public void lr(float f, float f2) {
        Throwable th;
        float f3;
        float f4;
        float f5;
        float f6;
        try {
            Objects.toString(this.mj.eb());
            if (fe()) {
                return;
            }
            int[] iArrLr = qd.lr(nr.ri());
            boolean z = false;
            boolean z2 = this.mj.bbu() == 1;
            float f7 = iArrLr[0];
            float f8 = iArrLr[1];
            try {
                if (!z2) {
                    f3 = f;
                    f4 = f2;
                    if (f3 < f4) {
                        ri(f7, f8, f3, f4, false);
                        return;
                    }
                } else if (f > f2) {
                    try {
                        ri(f7, f8, f, f2, true);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    f3 = f;
                    f4 = f2;
                }
                float f9 = f3 / f4;
                float f10 = f7 / f8;
                if (z2) {
                    if (f10 >= 0.5625f || f9 != 0.5625f) {
                        f6 = f3;
                        f5 = f4;
                    } else {
                        f6 = (f8 * 9.0f) / 16.0f;
                        z = true;
                        f5 = f8;
                    }
                } else if (f10 <= 1.7777778f || f9 != 1.7777778f) {
                    f6 = f3;
                    f5 = f4;
                } else {
                    f5 = (f7 * 9.0f) / 16.0f;
                    z = true;
                    f6 = f7;
                }
                if (z) {
                    f7 = f6;
                    f8 = f5;
                }
                int i = (int) f7;
                int i2 = (int) f8;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
                layoutParams.addRule(13);
                if (ig() != null) {
                    if (ig() instanceof TextureView) {
                        ((TextureView) ig()).setLayoutParams(layoutParams);
                    } else if (ig() instanceof SurfaceView) {
                        ((SurfaceView) ig()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.fr.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = i2;
                        layoutParams2.width = i;
                        this.fr.setLayoutParams(layoutParams2);
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        com.bytedance.sdk.component.utils.ac.ri(this.ri, "changeSize error", th);
    }

    public void ri(boolean z, float f, float f2) {
        try {
            Objects.toString(this.mj.eb());
            if (!fe() || z) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f, (int) f2);
                layoutParams.addRule(13);
                if (ig() != null) {
                    if (ig() instanceof TextureView) {
                        ((TextureView) ig()).setLayoutParams(layoutParams);
                    } else if (ig() instanceof SurfaceView) {
                        ((SurfaceView) ig()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.fr.getLayoutParams();
                    if (this.fr.getHeight() > 0) {
                        float fMin = Math.min(this.fr.getWidth() / f, this.fr.getHeight() / f2);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (f * fMin);
                            layoutParams.height = (int) (f2 * fMin);
                            if (ig() instanceof TextureView) {
                                ((TextureView) ig()).setLayoutParams(layoutParams);
                            } else if (ig() instanceof SurfaceView) {
                                ((SurfaceView) ig()).setLayoutParams(layoutParams);
                            }
                            if (this.wjv.di == 4) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.fr.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ri(this.ri, "changeSize error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik(float f, float f2) {
        try {
            if (ig() != null && this.di != null) {
                boolean z = this.mj.bbu() == 1;
                int[] iArrLr = qd.lr(nr.ri());
                ri(iArrLr[0], iArrLr[1], f, f2, z);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(final long j, final long j2) {
        this.mj.ka(j);
        this.jbs = j;
        this.oh = j2;
        final int iAttabal = saneness.attabal(j, j2);
        this.ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ka.ri.4
            @Override // java.lang.Runnable
            public void run() {
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).xha.ri(j, j2);
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).xha.ri(iAttabal);
                try {
                    if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).igq != null) {
                        ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).igq.ri(j, j2);
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ac.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ri.this).ri, "onProgressUpdate error: ", th);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri, euthanasia.attabal
    public boolean ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar) {
        int iMhp;
        super.ri(ikVar);
        if (this.di != null) {
            return false;
        }
        ikVar.slm();
        if (TextUtils.isEmpty(ikVar.slm())) {
            return false;
        }
        ikVar.lr(com.bytedance.sdk.openadsdk.wjv.fi.ri("player_force_raw_url", 0) == 1);
        lr(ikVar);
        ikVar.ka(1);
        this.pv = !ikVar.slm().startsWith("http");
        if (this.zf != null) {
            if (this.wjv.di == 1) {
                iMhp = this.mj.plm();
            } else {
                iMhp = this.mj.mhp();
            }
            if (this.fr != null) {
                try {
                    int iGo = this.mj.go();
                    if (iGo == 7 || iGo == 8) {
                        View viewRi = srn.ri(this.fr, (Class<? extends View>) mj.class);
                        if (viewRi != null) {
                            View viewFindViewById = viewRi.findViewById(slm.bgr);
                            View viewFindViewById2 = viewRi.findViewById(slm.udw);
                            View viewFindViewById3 = viewRi.findViewById(slm.ugd);
                            di diVar = this.zf;
                            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                            diVar.ri(viewFindViewById2, friendlyObstructionPurpose);
                            this.zf.ri(viewFindViewById, friendlyObstructionPurpose);
                            this.zf.ri(viewFindViewById3, friendlyObstructionPurpose);
                            if (this.tnn) {
                                View viewRi2 = srn.ri(this.fr, (Class<? extends View>) com.bytedance.sdk.openadsdk.core.co.lr.di.ri.class);
                                if (viewRi2 instanceof com.bytedance.sdk.openadsdk.core.co.lr.di.ri) {
                                    this.zf.ri(((com.bytedance.sdk.openadsdk.core.co.lr.di.ri) viewRi2).getMarkView(), friendlyObstructionPurpose);
                                }
                            }
                        }
                        Iterator<View> it = srn.ri(this.fr, 1).iterator();
                        while (it.hasNext()) {
                            this.zf.ri(it.next(), FriendlyObstructionPurpose.OTHER);
                        }
                    } else if (iGo == 3) {
                        Iterator<View> it2 = srn.ri(this.fr, 2).iterator();
                        while (it2.hasNext()) {
                            this.zf.ri(it2.next(), FriendlyObstructionPurpose.OTHER);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            this.zf.ri(iMhp > 0, iMhp / 1000.0f);
        }
        ory();
        if (ikVar.qt() > 0) {
            long jQt = ikVar.qt();
            this.jbs = jQt;
            this.qt = Math.max(this.qt, jQt);
        }
        if (this.jbs == this.oh) {
            this.jbs = 0L;
        }
        fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.ri();
            this.xha.xha();
            this.xha.ik(ikVar.mj(), ikVar.jbs());
            this.xha.ik(this.fr);
        }
        ik ikVar2 = new ik();
        this.di = ikVar2;
        ikVar2.ri(this.ig);
        nr();
        this.jc = 0L;
        kt();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri
    public void ri(boolean z, int i) {
        ka();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(float f, float f2) {
        ViewGroup viewGroup;
        try {
            if (ig() != null && this.di != null && (viewGroup = this.fr) != null) {
                float width = viewGroup.getWidth();
                float f3 = f / (width * 1.0f);
                float height = this.fr.getHeight();
                if (f3 <= f2 / (1.0f * height)) {
                    width = f * (height / f2);
                } else {
                    height = f2 * (width / f);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) width, (int) height);
                layoutParams.addRule(13);
                if (ig() instanceof TextureView) {
                    ((TextureView) ig()).setLayoutParams(layoutParams);
                } else if (ig() instanceof SurfaceView) {
                    ((SurfaceView) ig()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ri(this.ri, "changeVideoSizeSupportInteraction error", th);
        }
    }

    private void ri(float f, float f2, float f3, float f4, boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            try {
                f3 = this.mj.eu().impassible();
                f4 = this.mj.eu().adultoid();
            } catch (Throwable unused) {
                return;
            }
        }
        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (z) {
                if (f3 < f4) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f, (int) ((f4 * f) / f3));
            } else if (f3 > f4) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f3 * f2) / f4), (int) f2);
            }
            layoutParams.addRule(13);
            if (ig() != null) {
                if (ig() instanceof TextureView) {
                    ((TextureView) ig()).setLayoutParams(layoutParams);
                } else if (ig() instanceof SurfaceView) {
                    ((SurfaceView) ig()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.fr.getLayoutParams();
                if (!com.bytedance.sdk.component.adexpress.ka.lr.ri(nr.ri()) || this.fr.getHeight() <= 0 || layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.fr.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri, com.bytedance.sdk.openadsdk.core.bgr.lr.ri
    public void ri(euthanasia.saneness sanenessVar, View view) {
        ik ikVar = this.di;
        if (ikVar == null) {
            return;
        }
        if (ikVar.di()) {
            lr();
            this.xha.lr(true, false);
            this.xha.di();
            return;
        }
        if (!this.di.xha()) {
            fi fiVar = this.xha;
            if (fiVar != null) {
                fiVar.ik(this.fr);
            }
            fi(this.jbs);
            fi fiVar2 = this.xha;
            if (fiVar2 != null) {
                fiVar2.lr(false, false);
                return;
            }
            return;
        }
        ik();
        fi fiVar3 = this.xha;
        if (fiVar3 != null) {
            fiVar3.lr(false, false);
        }
    }

    public void ri(InterfaceC0235ri interfaceC0235ri) {
        this.ta = interfaceC0235ri;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri, euthanasia.attabal
    public void ri() {
        if (this.di != null) {
            jc();
            this.di.jbs();
        }
    }
}
