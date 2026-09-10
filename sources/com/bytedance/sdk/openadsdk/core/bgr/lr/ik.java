package com.bytedance.sdk.openadsdk.core.bgr.lr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.ri.ri.ri.ik.saneness;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.jbs;
import com.bytedance.sdk.component.utils.nr;
import com.bytedance.sdk.component.utils.su;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.jbs.ay;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.ka.fi.lr.vr;
import com.bytedance.sdk.openadsdk.ka.xha;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.unity3d.services.UnityAdsConstants;
import euthanasia.attabal;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import logician.dern;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends com.bytedance.sdk.openadsdk.core.bgr.ri.ri {
    private lr bnj;
    private long dzy;
    private int fe;
    private WeakReference<attabal.saneness> feb;
    private int gcp;
    private final boolean ig;
    private final boolean jc;
    private boolean kt;
    private long pv;
    private final String qd;
    private final su.ri qh;
    private final Runnable rzk;
    private int siy;
    private final boolean srn;
    private xha ta;
    private int tnn;
    private boolean tw;
    private final dern.attabal whw;
    private int xm;
    private WeakReference<ri> zyn;

    public interface ri {
        void di();

        void ri(int i);
    }

    public ik(Context context, ViewGroup viewGroup, wjv wjvVar, String str, boolean z, boolean z2, boolean z3, xha xhaVar) {
        super(context, wjvVar, viewGroup);
        this.dzy = 0L;
        this.pv = 0L;
        this.kt = true;
        this.tnn = 0;
        this.fe = 0;
        this.whw = new dern.attabal() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1
            @Override // logician.dern.attabal
            public void fi(dern dernVar) {
                com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
                com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).mj.qc();
                if (kaVarQc != null && (kaVarRi = kaVarQc.ri()) != null) {
                    kaVarRi.ik(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).jbs);
                }
                if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).zf != null) {
                    ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).zf.ri(1);
                }
            }

            @Override // logician.dern.attabal
            public void ka(dern dernVar) {
                com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
                com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).mj.qc();
                if (kaVarQc != null && (kaVarRi = kaVarQc.ri()) != null) {
                    kaVarRi.lr(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).jbs);
                }
                com.bytedance.sdk.openadsdk.ay.lr.fi.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).mj, 3);
                if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).zf != null) {
                    ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).zf.ri(0);
                }
            }

            @Override // logician.dern.attabal
            public void lr(dern dernVar) {
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ik.removeCallbacks(ik.this.rzk);
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ik.this.feb != null && ik.this.feb.get() != null) {
                            ik.this.feb.get();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha != null) {
                            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha.lr();
                        }
                    }
                });
                if (ik.this.ig) {
                    return;
                }
                ik ikVar = ik.this;
                ikVar.ri(ikVar.ta);
            }

            @Override // logician.dern.attabal
            public void ri(dern dernVar) {
                com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.bytedance.sdk.openadsdk.ay.lr.fi.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).mj, 5);
                            com.bytedance.sdk.openadsdk.ay.ri.ik.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).mj, 5);
                            if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).zf != null) {
                                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).zf.ri(9);
                            }
                        } catch (Exception unused) {
                        }
                        ik.this.srn();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).mj.qc();
                if (kaVarQc == null || (kaVarRi = kaVarQc.ri()) == null) {
                    return;
                }
                kaVarRi.ka(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).jbs);
            }

            @Override // logician.dern.attabal
            public void lr(dern dernVar, int i) {
            }

            @Override // logician.dern.attabal
            public void ri(dern dernVar, long j) {
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ay = false;
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ik.removeCallbacks(ik.this.rzk);
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha != null) {
                            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha.lr();
                        }
                        if (!((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).vr || ik.this.zyn == null || ik.this.zyn.get() == null) {
                            return;
                        }
                        ((ri) ik.this.zyn.get()).di();
                    }
                });
                ik.this.xd();
                com.bytedance.sdk.openadsdk.ay.lr.fi.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).mj, 0);
                if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).zf != null) {
                    ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).zf.ik();
                }
                ik ikVar = ik.this;
                ikVar.ri(ikVar.ta);
            }

            @Override // logician.dern.attabal
            public void ri(dern dernVar, final saneness sanenessVar) {
                com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
                String unused = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ri;
                sanenessVar.dern();
                sanenessVar.saneness();
                sanenessVar.attabal();
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        int iDern = sanenessVar.dern();
                        int iSaneness = sanenessVar.saneness();
                        if (!ik.this.igq() || iSaneness == -1004) {
                            if (ik.this.ka(iDern, iSaneness)) {
                                String unused2 = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ri;
                                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha.ri2(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).mj, (WeakReference<Context>) null, false);
                                ik.this.lr(true);
                                ik.this.fi();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha != null) {
                                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha.lr();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).igq != null) {
                                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).igq.lr(ik.this.pv, benzoyl.saneness.attabal(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).jbs, ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).oh));
                            }
                            if (ik.this.feb == null || ik.this.feb.get() == null || ik.this.igq()) {
                                return;
                            }
                            ((attabal.saneness) ik.this.feb.get()).ri(iDern, iSaneness);
                        }
                    }
                });
                ik.this.ri(sanenessVar);
                com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).mj.qc();
                if (kaVarQc != null && (kaVarRi = kaVarQc.ri()) != null) {
                    kaVarRi.ri(com.bytedance.sdk.openadsdk.core.aw.ri.ri.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.ay.lr.fi.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).mj, 6);
                com.bytedance.sdk.openadsdk.ay.ri.ik.lr(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).mj);
                if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).zf != null) {
                    ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).zf.ri(14);
                }
            }

            @Override // logician.dern.attabal
            public void ri(dern dernVar, boolean z4) {
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha != null) {
                            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha.lr();
                        }
                    }
                });
            }

            @Override // logician.dern.attabal
            public void ri(dern dernVar, int i, int i2) {
                jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        ik.this.kt();
                    }
                });
            }

            @Override // logician.dern.attabal
            public void ri(dern dernVar, int i, int i2, int i3) {
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ay = true;
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha != null) {
                            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha.bu();
                            ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ik.postDelayed(ik.this.rzk, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.ay.lr.fi.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).mj, 2);
                if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).zf != null) {
                    ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).zf.ri(4);
                }
            }

            @Override // logician.dern.attabal
            public void ik(dern dernVar) {
            }

            @Override // logician.dern.attabal
            public void ri(dern dernVar, int i) {
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ay = false;
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ik.removeCallbacks(ik.this.rzk);
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha.lr();
                    }
                });
                com.bytedance.sdk.openadsdk.ay.lr.fi.ri(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).mj, 0);
                if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).zf != null) {
                    ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).zf.ri(5);
                }
            }

            @Override // logician.dern.attabal
            public void ri(dern dernVar, final long j, final long j2) {
                if (Math.abs(j - ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).jbs) < 50) {
                    return;
                }
                ik ikVar = ik.this;
                ikVar.ri(ikVar.ta);
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        ik.this.ri(j, j2);
                        ik.this.lr(j, j2);
                    }
                });
            }
        };
        this.xm = 0;
        this.rzk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.4
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha != null) {
                    ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha.ri2(((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).mj, (WeakReference<Context>) null, false);
                    ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha.lr();
                    ik.this.lr(true);
                    String unused = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ri;
                }
            }
        };
        this.qh = new su.ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.6
            @Override // com.bytedance.sdk.component.utils.su.ri
            public void ri(Context context2, Intent intent, boolean z4, final int i) {
                dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ik.this.di(i);
                    }
                });
            }
        };
        this.tw = false;
        this.gcp = nr.ik(context);
        ri(z);
        this.qd = str;
        try {
            this.tnn = viewGroup.getWidth();
            this.fe = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        ri(context);
        this.ig = true;
        this.srn = z2;
        this.jc = z3;
        if (xhaVar != null) {
            this.ta = xhaVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ka(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bykv.vk.openvk.ri.ri.ri.di.attabal feb() {
        fi fiVar;
        if (this.sf.getResources().getConfiguration().orientation != 1 || (fiVar = this.xha) == null) {
            return null;
        }
        return fiVar.aw();
    }

    private void jc() {
        com.bytedance.sdk.openadsdk.core.bgr.ka.ik ikVar = this.di;
        if (ikVar != null) {
            if (!ikVar.xha()) {
                this.di.ri(false, this.jbs, this.slm);
            } else if (this.aw) {
                ac();
            } else {
                lr(this.xd);
            }
        }
        if (this.ac.get()) {
            zf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kt() {
        com.bytedance.sdk.openadsdk.core.bgr.ka.ik ikVar;
        int i;
        int i2;
        try {
            if (feb() != null && (ikVar = this.di) != null && this.fr != null) {
                int iKa = ikVar.ka();
                int iFi = this.di.fi();
                final int width = this.fr.getWidth();
                final int height = this.fr.getHeight();
                if (width > 0 && height > 0 && iFi > 0 && iKa > 0) {
                    if (iKa == iFi) {
                        i2 = width > height ? height : width;
                        i = i2;
                    } else if (iKa > iFi) {
                        i2 = (int) ((((double) width) * 1.0d) / ((double) ((iKa * 1.0f) / iFi)));
                        i = width;
                    } else {
                        i = (int) ((((double) height) * 1.0d) / ((double) ((iFi * 1.0f) / iKa)));
                        i2 = height;
                    }
                    if (i2 <= height && i2 > 0) {
                        height = i2;
                    }
                    if (i <= width && i > 0) {
                        width = i;
                    }
                    this.ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.5
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (ik.this.feb() instanceof TextureView) {
                                    ((TextureView) ik.this.feb()).setLayoutParams(layoutParams);
                                    String unused = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ri;
                                } else if (ik.this.feb() instanceof SurfaceView) {
                                    ((SurfaceView) ik.this.feb()).setLayoutParams(layoutParams);
                                    String unused2 = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ri;
                                }
                            } catch (Throwable unused3) {
                                String unused4 = ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).ri;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            Objects.toString(this.sf);
            Objects.toString(feb());
        } catch (Throwable th) {
            th.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void srn() {
        this.xm++;
        fi fiVar = this.xha;
        if (fiVar == null) {
            return;
        }
        fiVar.lr();
        attabal.wireman wiremanVar = this.igq;
        if (wiremanVar != null) {
            wiremanVar.ri(this.pv, benzoyl.saneness.attabal(this.jbs, this.oh));
        }
        this.pv = System.currentTimeMillis() - this.dzy;
        if (this.kt) {
            this.xha.ri2(this.mj, (WeakReference<Context>) null, true);
        }
        if (!this.ihz) {
            this.ihz = true;
            long j = this.oh;
            lr(j, j);
            long j2 = this.oh;
            this.jbs = j2;
            this.qt = j2;
            lr(this.ta);
        }
        if (!this.vr && this.tan) {
            fi(this.xha, null);
        }
        this.bgr = true;
    }

    public void di(boolean z) {
        this.kt = z;
    }

    public void dzy() {
        if (this.tw && this.uq) {
            this.tw = false;
            su.ri(this.qh);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri, euthanasia.attabal
    public void fi() {
        com.bytedance.sdk.openadsdk.core.bgr.ka.ik ikVar = this.di;
        if (ikVar != null) {
            ikVar.co();
            this.di = null;
        }
        if (this.kt) {
            if ("embeded_ad".equals(this.qd)) {
                this.xha.ac();
            } else {
                this.xha.ri2(this.mj, (WeakReference<Context>) null, true);
            }
            this.ik.removeCallbacksAndMessages(null);
            this.f18105co.clear();
            if (this.vr) {
                dzy();
            }
        }
    }

    public void ig() {
        if (this.di != null) {
            lr(false);
            ory();
            this.ac.set(false);
            this.ihz = false;
            ri(this.ta);
            this.di.jbs();
        }
    }

    public void pv() {
        com.bytedance.sdk.openadsdk.core.aw.di diVar = this.zf;
        if (diVar != null) {
            diVar.ri(13);
        }
    }

    public int qd() {
        return this.siy;
    }

    public void slm() {
        if (this.tw || !this.uq) {
            return;
        }
        Context applicationContext = com.bytedance.sdk.openadsdk.core.nr.ri().getApplicationContext();
        this.tw = true;
        su.ri(this.qh, applicationContext);
    }

    public void xha(boolean z) {
        fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.ri();
        }
        fi fiVar2 = this.xha;
        if (fiVar2 != null && z) {
            fiVar2.nr();
        }
        jc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void di(int i) {
        fi(i);
        if (i == 4) {
            this.bu = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri, euthanasia.attabal
    public void ka() {
        ri(true, 3);
    }

    private void ik(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar) {
        ikVar.ka(0);
        this.di.ri(ikVar);
        this.dzy = System.currentTimeMillis();
        this.xha.ik(8);
        this.xha.ik(0);
        ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).di == null) {
                    return;
                }
                ik.this.dzy = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).xha.ka(0);
                ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).di.ri(true, ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).jbs, ((com.bytedance.sdk.openadsdk.core.bgr.ri.ri) ik.this).slm);
            }
        });
        if (this.vr) {
            slm();
        }
    }

    public void ka(int i) {
        this.siy = i;
    }

    public void lr(int i, int i2) {
        ri(i, i2);
        fi fiVar = this.xha;
        if (fiVar == null || i <= 0 || i2 <= 0) {
            return;
        }
        fiVar.ik(i, i2);
        this.xha.ri(i, i2);
        kt();
    }

    public void ri(final di.ri riVar) {
        fi fiVar;
        if (!this.vr || (fiVar = this.xha) == null) {
            return;
        }
        fiVar.ri(new di.ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.2
            @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.di.ri
            public void ri(View view, int i) {
                di.ri riVar2 = riVar;
                if (riVar2 != null) {
                    riVar2.ri(view, i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(long j, long j2) {
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        this.mj.ka(j);
        this.jbs = j;
        this.oh = j2;
        this.xha.ri(j, j2);
        this.xha.ri(benzoyl.saneness.attabal(j, j2));
        try {
            attabal.wireman wiremanVar = this.igq;
            if (wiremanVar != null) {
                wiremanVar.ri(j, j2);
            }
        } catch (Throwable th) {
            ac.ri(this.ri, "onProgressUpdate error: ", th);
        }
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = this.mj.qc();
        if (kaVarQc == null || (kaVarRi = kaVarQc.ri()) == null) {
            return;
        }
        kaVarRi.ri(j, j2, this.zf);
    }

    public void ri(PAGNativeAd pAGNativeAd) {
        fi fiVar;
        if (!this.vr || (fiVar = this.xha) == null) {
            return;
        }
        fiVar.ri(pAGNativeAd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri, euthanasia.attabal
    public void ik() {
        fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.ri();
        }
        fi fiVar2 = this.xha;
        if (fiVar2 != null) {
            fiVar2.nr();
        }
        jc();
    }

    private void fi(int i) {
        if (this.gcp == i) {
            return;
        }
        this.gcp = i;
        if (i != 4 && i != 0) {
            this.nr = false;
        }
        if (!this.nr && !aw() && this.srn) {
            ik(2, i);
        }
        WeakReference<ri> weakReference = this.zyn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zyn.get().ri(this.gcp);
    }

    public void ri(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.tnn = i;
        this.fe = i2;
    }

    public void ri(lr lrVar) {
        this.bnj = lrVar;
    }

    private void ri(Context context) {
        ViewGroup ikVar;
        ik ikVar2;
        if (this.vr) {
            ikVar = new com.bytedance.sdk.openadsdk.vr.ka(context);
        } else {
            ikVar = new com.bytedance.sdk.openadsdk.vr.ik(context);
        }
        ViewGroup viewGroup = ikVar;
        if (this.vr) {
            ikVar2 = this;
            ikVar2.xha = new fi(context, viewGroup, true, 17, this.mj, ikVar2, uq());
        } else {
            ikVar2 = this;
            ikVar2.xha = new ka(context, viewGroup, true, 17, ikVar2.mj, ikVar2, false);
        }
        ikVar2.xha.ri(this);
    }

    private boolean ik(int i, int i2) {
        if (i2 == 0) {
            lr();
            this.bu = true;
            fi fiVar = this.xha;
            if (fiVar != null) {
                fiVar.ri2(this.mj, (WeakReference<Context>) null, false);
            }
        }
        if (i2 != 4 && i2 != 0) {
            fi fiVar2 = this.xha;
            if (fiVar2 != null) {
                fiVar2.ri();
            }
            lr();
            this.bu = true;
            this.nr = false;
            fi fiVar3 = this.xha;
            if (fiVar3 != null) {
                return fiVar3.ri(i, this.mj.eu(), this.jc);
            }
        } else if (i2 == 4) {
            this.bu = false;
            fi fiVar4 = this.xha;
            if (fiVar4 != null) {
                fiVar4.vr();
            }
        }
        return true;
    }

    public com.bytedance.sdk.openadsdk.core.aw.di ri(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.mj.yj()) {
            return null;
        }
        if (this.zf == null) {
            this.zf = com.bytedance.sdk.openadsdk.core.aw.di.ri();
        }
        this.zf.ri(view, this.mj);
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    Object obj = pair.second;
                    this.zf.ri((View) pair.first, obj == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) obj);
                }
            }
        }
        return this.zf;
    }

    public void ik(int i) {
        fi(i);
        if (i == 4) {
            this.bu = false;
            ik();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri
    public void ri(attabal.saneness sanenessVar) {
        this.feb = new WeakReference<>(sanenessVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri, euthanasia.attabal
    public void ri() {
        com.bytedance.sdk.openadsdk.core.bgr.ka.ik ikVar = this.di;
        if (ikVar != null) {
            ikVar.jbs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri, euthanasia.attabal
    public boolean ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar) {
        super.ri(ikVar);
        if (this.di != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(ikVar.slm())) {
            return false;
        }
        lr(false);
        ikVar.slm();
        ikVar.lr(com.bytedance.sdk.openadsdk.wjv.fi.ri("player_force_raw_url", 0) == 1);
        int i = this.siy + 1;
        this.siy = i;
        ikVar.fi = i;
        lr(ikVar);
        ory();
        com.bytedance.sdk.openadsdk.core.aw.di diVar = this.zf;
        if (diVar != null) {
            diVar.ri(false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (!ay.lr(this.qd) || this.jbs <= 0) {
            this.jbs = ikVar.qt();
        }
        if (ay.lr(this.qd) && this.jbs == this.oh) {
            this.jbs = 0L;
        }
        if (ikVar.qt() <= 0) {
            this.ihz = false;
            this.ac.set(false);
        } else {
            long jQt = ikVar.qt();
            this.jbs = jQt;
            this.qt = Math.max(this.qt, jQt);
        }
        fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.ri();
            if (this.xm == 0) {
                this.xha.xha();
            }
            this.xha.ik(ikVar.mj(), ikVar.jbs());
            this.xha.ik(this.fr);
            this.xha.ri(ikVar.mj(), ikVar.jbs());
        }
        if (this.di == null) {
            com.bytedance.sdk.openadsdk.core.bgr.ka.ik ikVar2 = new com.bytedance.sdk.openadsdk.core.bgr.ka.ik();
            this.di = ikVar2;
            ikVar2.ri(this.whw);
        }
        nr();
        this.pv = 0L;
        try {
            ik(ikVar);
            return true;
        } catch (Exception e) {
            ri(new saneness(-10, 0, e.getMessage()));
            ac.ik(this.ri, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e)));
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri
    public void ri(boolean z, int i) {
        if (!this.ihz && this.ac.get()) {
            if (z) {
                ri(i, false);
                this.ihz = false;
            } else {
                dw();
            }
        }
        fi();
        com.bytedance.sdk.openadsdk.core.aw.di diVar = this.zf;
        if (diVar != null) {
            diVar.ka();
        }
    }

    public final void ri(int i, boolean z) {
        if (z || this.hcw) {
            if (z) {
                this.hcw = false;
            }
            if (this.ihz || !this.ac.get()) {
                return;
            }
            vr.ri riVar = new vr.ri();
            riVar.lr(di());
            riVar.ka(jbs());
            riVar.ik(xha());
            riVar.ik(i);
            riVar.ka(mj());
            com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(this.xha, riVar, this.ta);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri, com.bytedance.sdk.openadsdk.core.bgr.lr.ri
    public void ri(euthanasia.saneness sanenessVar, View view) {
        com.bytedance.sdk.openadsdk.core.bgr.ka.ik ikVar = this.di;
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
        xha(false);
        fi fiVar3 = this.xha;
        if (fiVar3 != null) {
            fiVar3.lr(false, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ri.ri
    public void ri(euthanasia.saneness sanenessVar, View view, boolean z) {
        ik(!this.tan);
        if (this.sf instanceof Activity) {
            fi fiVar = this.xha;
            if (fiVar != null) {
                fiVar.lr(this.fr);
                this.xha.ik(false);
            }
            ri(1);
            WeakReference<attabal.dern> weakReference = this.su;
            attabal.dern dernVar = weakReference != null ? weakReference.get() : null;
            if (dernVar != null) {
                dernVar.ri(this.tan);
            }
        }
    }

    public void ri(ri riVar) {
        this.zyn = new WeakReference<>(riVar);
    }
}
