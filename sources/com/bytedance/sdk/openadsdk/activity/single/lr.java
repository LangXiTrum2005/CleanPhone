package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.sdk.openadsdk.component.reward.bu;
import com.bytedance.sdk.openadsdk.component.reward.co;
import com.bytedance.sdk.openadsdk.component.reward.ri.sf;
import com.bytedance.sdk.openadsdk.component.reward.slm;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.ay;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.ka.qt;
import com.ironsource.C3700q2;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static com.bytedance.sdk.openadsdk.ri.ik.lr ik;
    private static com.bytedance.sdk.openadsdk.ri.fi.ri lr;
    private final boolean ac;
    private Activity aw;
    private int bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final boolean f18075co;
    private final com.bytedance.sdk.openadsdk.aw.jbs di;
    private final boolean jbs;
    private final wjv ka;
    private com.bytedance.sdk.openadsdk.ri.ik.lr mj;
    private boolean nr;
    private final boolean qt;
    public co ri;
    private com.bytedance.sdk.openadsdk.activity.single.ik sf;
    private Runnable slm;
    private boolean tan;
    private Bundle vr;
    private com.bytedance.sdk.openadsdk.ri.fi.ri xha;
    private final Bundle fi = new Bundle();
    private final sf.lr bu = new sf.lr();
    private final boolean ihz = com.bytedance.sdk.openadsdk.wjv.fi.qt();

    public static class fi {
        public boolean fi;
        public final com.bytedance.sdk.openadsdk.component.reward.ri.ri ik;
        public boolean ka;
        public final int lr;
        public final Bundle ri = new Bundle();

        public fi(int i, com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
            this.lr = i;
            this.ik = riVar;
        }

        public String toString() {
            return super.toString();
        }
    }

    public static class ik implements Runnable {
        private final wjv ri;

        public ik(wjv wjvVar) {
            this.ri = wjvVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.ri.bl()) {
                return;
            }
            if (this.ri.qa()) {
                if (com.bytedance.sdk.openadsdk.utils.lr.lr()) {
                    bu.ri(nr.ri()).ri(this.ri.eb());
                    return;
                } else {
                    slm.ri(nr.ri()).ri(this.ri.eb());
                    return;
                }
            }
            if (com.bytedance.sdk.openadsdk.utils.lr.lr()) {
                com.bytedance.sdk.openadsdk.component.reward.xha.ri(nr.ri()).ri(this.ri.eb());
            } else {
                com.bytedance.sdk.openadsdk.component.reward.di.ri(nr.ri()).ri(this.ri.eb());
            }
        }
    }

    public static class ka extends AbstractC0223lr {

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        private boolean f18076co;
        private final int qt;
        private int sf;

        public ka(lr lrVar, wjv wjvVar, com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar) {
            super(lrVar, wjvVar, ikVar);
            if (wjvVar == null) {
                this.qt = 100;
            } else if (wjvVar.zk() >= 0) {
                this.qt = Math.min(100, wjvVar.zk());
            } else {
                this.qt = nr.ka().su(String.valueOf(wjvVar.ur())).di;
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.lr.AbstractC0223lr, android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (!this.f18076co && this.ka <= this.sf) {
                this.f18076co = true;
                mj mjVarSf = this.ri.sf();
                if (mjVarSf != null) {
                    mjVarSf.bnj();
                }
            }
            super.handleMessage(message);
            return true;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.lr.AbstractC0223lr
        public int ri(wjv wjvVar) {
            if (wjvVar != null) {
                return wjvVar.vnt();
            }
            return 30;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.lr.AbstractC0223lr
        public void ri(int i, wjv wjvVar) {
            boolean z = this.di == 0;
            int i2 = this.ka;
            super.ri(i, wjvVar);
            if (!z) {
                if (this.ik < i2) {
                    this.sf = (int) ((1.0f - (this.qt / 100.0f)) * this.ka);
                    return;
                }
                return;
            }
            if (this.di == 1) {
                this.sf = 3;
            } else {
                this.sf = (int) ((1.0f - (this.qt / 100.0f)) * this.ik);
            }
            co coVar = this.ri.ri;
            if (coVar != null) {
                coVar.ri(this.ka);
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.lr$lr, reason: collision with other inner class name */
    public static abstract class AbstractC0223lr implements Handler.Callback {
        private int ac;
        private int ay;
        private boolean bgr;
        private boolean bu;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        private final Context f18077co;
        protected int di;
        private boolean dw;
        private int dzy;
        private boolean feb;
        protected int fi;
        private int fr;
        private boolean ig;
        private boolean igq;
        private int ihz;
        protected float ik;
        private int jc;
        protected int ka;
        private int kt;
        protected wjv lr;
        private float nr;
        private int oh;
        private int ory;
        private boolean pv;
        private boolean qd;
        protected final lr ri;
        private final com.bytedance.sdk.openadsdk.component.reward.top.ik sf;
        private boolean slm;
        private int srn;
        private boolean su;
        private boolean tnn;
        private int uq;
        private boolean vr;
        private int wjv;
        private int xd;
        private int zf;
        private boolean zyn;
        private final Handler qt = new Handler(Looper.getMainLooper(), this);
        private final int aw = 1000;
        protected int xha = -1;
        private int tan = 1000;
        private boolean hcw = false;
        boolean mj = false;
        public int jbs = -1;

        public AbstractC0223lr(lr lrVar, wjv wjvVar, com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar) {
            this.ri = lrVar;
            this.lr = wjvVar;
            this.sf = ikVar;
            this.f18077co = ikVar.getContext();
            this.ka = ri(wjvVar);
        }

        private void aw() {
            int i = this.xd;
            int i2 = this.srn;
            boolean z = this.zyn;
            int i3 = this.kt;
            int i4 = this.jc;
            if (i < i2 || z) {
                return;
            }
            if (i3 >= i4) {
                this.feb = false;
            } else {
                this.kt = i3 + 1;
                bgr();
            }
        }

        private void bgr() {
            mj mjVarSf;
            this.zyn = true;
            this.xd = 0;
            lr lrVar = this.ri;
            if (lrVar == null || (mjVarSf = lrVar.sf()) == null || mjVarSf.tw()) {
                return;
            }
            co();
        }

        private void co() {
            com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar;
            if (this.dw || this.vr || this.slm || (ikVar = this.sf) == null) {
                return;
            }
            ikVar.setShowEndCardNextAd(true, this.lr);
        }

        private void fi(int i) {
            if (this.tnn && i == 4) {
                this.di = i;
                ri(i, 1000);
            }
        }

        private void ka(int i) {
            if (this.xha > 0 && this.bu && i == 3) {
                this.di = i;
                ri(i, 1000);
            }
        }

        private void qt() {
            int i = this.xha;
            if (i > 0) {
                this.xha = i - 1;
            }
            if (this.xha == 0 && this.bu) {
                this.bu = false;
                lr lrVar = this.ri;
                if (lrVar == null || lrVar.sf() == null) {
                    return;
                }
                mj mjVarSf = this.ri.sf();
                if (mjVarSf instanceof com.bytedance.sdk.openadsdk.activity.single.fi) {
                    ((com.bytedance.sdk.openadsdk.activity.single.fi) mjVarSf).ihz();
                }
            }
        }

        private void sf() {
            if (this.ri.ac()) {
                this.sf.showSkipButton();
                this.vr = true;
            } else {
                this.slm = true;
                this.sf.showCloseButton();
            }
            this.sf.setShowPlayableNextAd(false, this.lr);
        }

        public void di() {
            this.igq = true;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1 || i == 2) {
                ri(message);
            } else if (i == 3) {
                if (this.xha > 0) {
                    qt();
                    if (this.xha >= 0) {
                        ri(message.what, 1000);
                    }
                }
            } else if (i == 4) {
                if (this.tnn) {
                    fi();
                    if (this.tnn && !this.dw) {
                        ri(message.what, 1000);
                    }
                }
            } else if (i == 5 && this.feb) {
                xha();
                if (this.feb && !this.dw) {
                    ri(message.what, 1000);
                }
            }
            return true;
        }

        public void ik() {
            this.qt.removeMessages(this.di);
        }

        public void jbs() {
            if (this.feb) {
                this.zyn = true;
            }
        }

        public void lr() {
            this.tnn = false;
            this.feb = false;
            this.mj = false;
            this.ory = 0;
            this.jbs = -1;
            this.zyn = false;
            this.jc = 0;
            this.xd = 0;
            this.oh = 0;
            this.su = false;
            this.kt = 0;
            this.hcw = false;
            com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar = this.sf;
            if (ikVar != null) {
                ikVar.setShowPlayableNextAd(false, this.lr);
            }
        }

        public void mj() {
            if (this.feb) {
                co();
                this.zyn = false;
            }
        }

        public int ri() {
            return this.ka;
        }

        public abstract int ri(wjv wjvVar);

        public void xha() {
            if (this.igq && this.feb && !this.dw) {
                int i = this.oh;
                int i2 = this.xd;
                boolean z = this.su;
                int i3 = i + 1;
                this.oh = i3;
                this.xd = i2 + 1;
                if (z && i3 >= this.dzy) {
                    co();
                }
                if (this.ig || this.pv) {
                    aw();
                }
            }
        }

        public void ik(int i) {
            this.xha = i;
            if (i > 0) {
                this.bu = true;
                if (this.ka <= 0 || this.vr) {
                    ka(3);
                }
            }
        }

        public void ri(boolean z) {
            this.su = z;
            this.xd = 0;
            if (z) {
                int i = this.wjv;
                int i2 = this.ihz;
                this.ac = i - i2;
                this.fr = i2;
                this.ay = i;
            }
        }

        public void fi() {
            if (this.igq && this.tnn) {
                if (this.slm) {
                    this.tnn = false;
                }
                if (this.dw) {
                    return;
                }
                int i = this.zf;
                boolean z = this.su;
                int i2 = i + 1;
                this.zf = i2;
                if (z) {
                    this.ay = this.wjv;
                } else {
                    this.ay = this.ac + this.ihz;
                }
                if (i2 >= this.ac) {
                    if (!this.mj) {
                        this.ory++;
                        this.mj = true;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("click_countdown_remaining", this.ka);
                            jSONObject.put("hint_sequence", this.ory);
                            com.bytedance.sdk.openadsdk.ka.ik.ka(this.lr, this.ri.sf().d_(), jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                    com.bytedance.sdk.openadsdk.activity.single.ik ikVar = this.ri.sf;
                    int i3 = this.fr;
                    this.fr = i3 - 1;
                    ikVar.ri(i3, this.ka);
                } else {
                    this.mj = false;
                    this.ri.sf.ri(-1, this.ka);
                }
                if (this.su && this.zf >= this.uq) {
                    boolean z2 = this.vr;
                    boolean z3 = this.slm;
                    if (!z2 && !z3) {
                        this.sf.setShowPlayableNextAd(true, this.lr);
                    }
                }
                if (this.zf < this.ay || this.ri.sf() == null) {
                    return;
                }
                mj mjVarSf = this.ri.sf();
                if (mjVarSf instanceof com.bytedance.sdk.openadsdk.activity.single.fi) {
                    this.qt.removeMessages(4);
                    ((com.bytedance.sdk.openadsdk.activity.single.fi) mjVarSf).ihz();
                }
            }
        }

        public void ka() {
            if (this.vr || this.slm) {
                return;
            }
            ri(-1);
            this.hcw = true;
            com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar = this.sf;
            if (ikVar != null) {
                ikVar.setCountDownFor1InN("", -1);
                this.sf.setShowEndCardNextAd(true, this.lr);
            }
        }

        public void ri(int i) {
            int i2 = this.di;
            if (i != -1) {
                this.jbs = i;
            }
            this.qt.removeMessages(i2);
        }

        private void ri(Message message) {
            int i = this.ka;
            if (i > 0) {
                int i2 = this.fi;
                int i3 = (int) ((((double) (i2 - i)) * 100.0d) / ((double) i2));
                com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar = this.sf;
                StringBuilder sb = new StringBuilder();
                int i4 = this.ka;
                this.ka = i4 - 1;
                sb.append(i4);
                sb.append("s");
                ikVar.setCountDownFor1InN(sb.toString(), i3);
                qt();
                fi();
                if (this.ka >= 0) {
                    ri(message.what, this.tan);
                }
                xha();
                return;
            }
            ka(3);
            fi(4);
            ri(5, true);
            sf();
        }

        public void lr(int i) {
            if (this.jbs != 2 || i == 1) {
                if (i != -1) {
                    this.jbs = i;
                }
                if (this.qt.hasMessages(this.di) || this.hcw) {
                    return;
                }
                lr lrVar = this.ri;
                if (lrVar == null || lrVar.sf() == null || this.ri.sf().ay() == null || !this.ri.sf().ay().qt.get()) {
                    int i2 = this.ka;
                    boolean z = this.vr;
                    int i3 = this.di;
                    if (i3 == 1 || i3 == 2) {
                        if (i2 < 0 || z || this.slm) {
                            return;
                        }
                        this.qt.sendEmptyMessageDelayed(i3, this.tan);
                        return;
                    }
                    if (i3 == 3) {
                        ka(3);
                    } else if (i3 == 4) {
                        fi(4);
                    } else if (i3 == 5) {
                        ri(5, true);
                    }
                }
            }
        }

        private void ri(int i, int i2) {
            if (this.hcw) {
                return;
            }
            this.qt.removeMessages(i);
            this.qt.sendEmptyMessageDelayed(i, i2);
        }

        private void ri(int i, boolean z) {
            if (this.feb && i == 5) {
                this.di = i;
                if (z) {
                    ri(i, 1000);
                } else {
                    this.qt.sendEmptyMessage(i);
                }
            }
        }

        public void lr(boolean z) {
            if (z) {
                this.tan = (int) (1000.0f / this.nr);
            } else {
                this.tan = 1000;
            }
        }

        public void ri(wjv wjvVar, boolean z) {
            this.ac = dw.ihz(wjvVar);
            this.ihz = dw.fr(wjvVar);
            this.uq = dw.su(wjvVar);
            this.wjv = dw.igq(wjvVar);
            this.fr = this.ihz;
            this.igq = false;
            this.su = false;
            this.zf = 0;
            this.tnn = true;
            com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar = this.sf;
            if (ikVar != null) {
                ikVar.setShowPlayableNextAd(false, wjvVar);
            }
            this.dw = z;
            if (this.ka <= 0 || this.vr) {
                fi(4);
            }
        }

        public void ri(int i, wjv wjvVar) {
            if (wjvVar != null && wjvVar.cmy() != null) {
                this.nr = wjvVar.cmy().ri();
                this.lr = wjvVar;
            }
            int i2 = this.ka;
            boolean z = this.vr;
            boolean z2 = this.slm;
            int i3 = this.di;
            if (z || z2) {
                return;
            }
            float f = i;
            this.ik = f;
            if (f <= i2) {
                this.di = 2;
                this.ka = (int) f;
            } else if (i3 == 0) {
                this.di = 1;
            }
            if (!this.bgr) {
                this.fi = this.ka;
                this.bgr = true;
            }
            int i4 = this.di;
            if (i3 == i4 && this.qt.hasMessages(i4)) {
                return;
            }
            this.qt.removeCallbacksAndMessages(null);
            this.qt.sendEmptyMessage(this.di);
        }

        public void ri(mj mjVar) {
            wjv wjvVar;
            ay ayVarRi;
            if (mjVar == null || (wjvVar = mjVar.di) == null || (ayVarRi = wjvVar.ri()) == null) {
                return;
            }
            this.dzy = ayVarRi.ik();
            this.dw = mjVar.bu;
            this.jc = ayVarRi.ri();
            this.qd = mjVar.slm;
            this.srn = ayVarRi.lr();
            this.pv = ac.di(mjVar.di);
            this.ig = ac.fi(mjVar.di);
            this.feb = true;
            if ((this.ka <= 0 || this.vr) && !this.qt.hasMessages(5)) {
                ri(5, false);
            }
        }
    }

    public static class ri extends AbstractC0223lr {
        public ri(lr lrVar, wjv wjvVar, com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar) {
            super(lrVar, wjvVar, ikVar);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.lr.AbstractC0223lr
        public int ri(wjv wjvVar) {
            if (wjvVar != null) {
                return wjvVar.sp();
            }
            return 5;
        }
    }

    public lr(Activity activity, wjv wjvVar, boolean z) {
        this.ka = wjvVar;
        this.tan = z;
        this.aw = activity;
        this.di = new com.bytedance.sdk.openadsdk.aw.jbs(activity.getApplicationContext());
        boolean zZyn = wjvVar.zyn();
        this.jbs = zZyn;
        this.qt = zZyn && 39 == wjvVar.nd();
        this.f18075co = zZyn && 40 == wjvVar.nd();
        int iNd = wjvVar.nd();
        if (iNd == 43 || iNd == 44) {
            this.sf = new com.bytedance.sdk.openadsdk.activity.single.ka(this.aw, wjvVar, this);
        } else {
            this.sf = new jbs(this.aw, wjvVar, this);
        }
        this.ac = com.bytedance.sdk.openadsdk.wjv.fi.ri("adapt_decor_size", 0) == 1;
        this.sf.ri();
        xd();
    }

    private void xd() {
        if (this.ka.qa()) {
            this.ri = new co(new co.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.lr.1
                @Override // com.bytedance.sdk.openadsdk.component.reward.co.ri
                public void ri(int i) {
                    mj mjVarSf;
                    if (lr.this.co().getBoolean("reward_verify", false) || lr.this.bu() || lr.this.aw() || (mjVarSf = lr.this.sf()) == null) {
                        return;
                    }
                    mjVarSf.ik(i);
                }
            });
        }
    }

    public boolean ac() {
        return this.sf.ka();
    }

    public boolean aw() {
        return this.ka.slm();
    }

    public com.bytedance.sdk.openadsdk.component.reward.top.ik ay() {
        return this.sf.co();
    }

    public void bgr() {
        com.bytedance.sdk.openadsdk.ri.fi.ri riVar = this.xha;
        if (riVar != null) {
            riVar.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.ri.ik.lr lrVar = this.mj;
        if (lrVar != null) {
            lrVar.onAdClicked();
        }
    }

    public boolean bu() {
        wjv wjvVar = this.ka;
        return wjvVar != null && wjvVar.jc();
    }

    public Bundle co() {
        return this.fi;
    }

    public boolean di() {
        return this.jbs;
    }

    public void dw() {
        this.sf.bu();
    }

    public boolean fi() {
        if (this.ka != null && this.jbs) {
            return this.qt || this.f18075co;
        }
        return false;
    }

    public mj fr() {
        return this.sf.aw();
    }

    public void hcw() {
        this.sf.tan();
    }

    public boolean igq() {
        return this.nr;
    }

    public void ihz() {
        this.ka.mj(true);
        this.sf.slm();
    }

    public boolean ik() {
        return this.ihz;
    }

    public void jbs() {
        this.sf.jbs();
    }

    public boolean ka() {
        return this.f18075co;
    }

    public Activity mj() {
        com.bytedance.sdk.openadsdk.activity.single.ik ikVar = this.sf;
        return ikVar == null ? this.aw : ikVar.ri;
    }

    public void nr() {
        wjv wjvVar = this.ka;
        if (wjvVar != null) {
            wjvVar.jbs(true);
        }
        co coVar = this.ri;
        if (coVar != null) {
            coVar.ik();
        }
    }

    public int oh() {
        return this.sf.mj();
    }

    public void ory() {
        this.sf.nr();
    }

    public int qt() {
        return this.sf.qt();
    }

    public mj sf() {
        return this.sf.sf();
    }

    public void slm() {
        if (tan()) {
            return;
        }
        ihz();
        Objects.toString(this.xha);
        Objects.toString(this.mj);
        com.bytedance.sdk.openadsdk.ri.fi.ri riVar = this.xha;
        if (riVar != null) {
            riVar.ri();
        } else {
            com.bytedance.sdk.openadsdk.ri.ik.lr lrVar = this.mj;
            if (lrVar != null) {
                lrVar.ri();
            } else {
                mj mjVarSf = sf();
                qt.ri(this.ka, C3700q2.v, mjVarSf != null ? mjVarSf.srn() : 0);
            }
        }
        Runnable runnable = this.slm;
        if (runnable != null) {
            runnable.run();
            this.slm = null;
        }
    }

    public boolean su() {
        return this.sf instanceof com.bytedance.sdk.openadsdk.activity.single.ka;
    }

    public boolean tan() {
        return this.ka.srn();
    }

    public com.bytedance.sdk.openadsdk.aw.jbs uq() {
        return this.di;
    }

    public void vr() {
        com.bytedance.sdk.openadsdk.ri.fi.ri riVar = this.xha;
        if (riVar != null) {
            riVar.lr();
            return;
        }
        com.bytedance.sdk.openadsdk.ri.ik.lr lrVar = this.mj;
        if (lrVar != null) {
            lrVar.lr();
        } else {
            mj mjVarSf = sf();
            qt.ri(this.ka, "close", mjVarSf != null ? mjVarSf.srn() : 0);
        }
    }

    public boolean wjv() {
        return this.sf.fi();
    }

    public void xha() {
        Activity activity = this.aw;
        if (activity != null) {
            activity.finish();
        }
    }

    public List<wjv> zf() {
        return this.sf.vr();
    }

    public void ik(TTAdActivity tTAdActivity) {
        this.bgr = 4;
        this.sf.ik();
        co coVar = this.ri;
        if (coVar != null) {
            coVar.ri();
        }
    }

    public void ka(TTAdActivity tTAdActivity) {
        this.bgr = 5;
        this.sf.xha();
    }

    public boolean lr() {
        return this.ac;
    }

    public wjv ri() {
        return this.ka;
    }

    public void lr(TTAdActivity tTAdActivity) {
        this.bgr = 3;
        this.sf.lr();
        co coVar = this.ri;
        if (coVar != null) {
            coVar.lr();
        }
        this.bu.ri(tTAdActivity, this.ka.bbu(), this.ka.gz(), this.ac);
    }

    public boolean ri(wjv wjvVar) {
        return (wjvVar == null || ac.aw(wjvVar) || wjvVar.tl() || wjvVar.dob() == null || wjvVar.dob().ka() <= 0) ? false : true;
    }

    public void fi(TTAdActivity tTAdActivity) {
        this.bgr = 6;
        this.sf.ri(tTAdActivity);
        this.bu.ri(tTAdActivity);
        this.aw = null;
    }

    public void ik(boolean z) {
        this.nr = z;
    }

    public void ri(TTAdActivity tTAdActivity, Bundle bundle, com.bytedance.sdk.openadsdk.ri.fi.ri riVar, com.bytedance.sdk.openadsdk.ri.ik.lr lrVar) {
        this.vr = bundle;
        this.bgr = 1;
        this.xha = riVar;
        this.mj = lrVar;
        if (!this.tan && bundle != null) {
            if (riVar == null) {
                this.xha = lr;
                lr = null;
            }
            if (lrVar == null) {
                this.mj = ik;
                ik = null;
            }
        }
        this.sf.ri(bundle);
    }

    public void lr(boolean z) {
        try {
            wjv wjvVar = this.ka;
            if (wjvVar != null) {
                wjvVar.ik(z);
            }
            co.ri(this.ka, false, 3);
        } catch (Throwable unused) {
        }
    }

    public void lr(mj mjVar) {
        mjVar.ri(this.aw, this.vr);
        int i = this.bgr;
        if (i == 2) {
            mjVar.aw();
            return;
        }
        if (i == 3) {
            mjVar.aw();
            mjVar.ik();
            mjVar.ik(true);
        } else if (i == 4) {
            mjVar.ik(false);
            mjVar.bgr();
        } else {
            if (i != 5) {
                return;
            }
            mjVar.ka();
        }
    }

    public void ri(TTAdActivity tTAdActivity) {
        this.bgr = 2;
        this.sf.di();
    }

    public void ri(boolean z) {
        this.sf.ri(z);
    }

    public void ri(TTAdActivity tTAdActivity, Bundle bundle, int i) {
        com.bytedance.sdk.openadsdk.component.reward.ri.lr.ri(this.ka, tTAdActivity != null ? tTAdActivity.getIntent() : null, bundle, i);
        if (this.tan) {
            return;
        }
        com.bytedance.sdk.openadsdk.ri.fi.ri riVar = this.xha;
        if (riVar != null) {
            lr = riVar;
            return;
        }
        com.bytedance.sdk.openadsdk.ri.ik.lr lrVar = this.mj;
        if (lrVar != null) {
            ik = lrVar;
        }
    }

    public void lr(mj mjVar, fi fiVar) {
        this.sf.ri(mjVar, fiVar);
    }

    public void lr(mj mjVar, int i) {
        this.sf.lr(mjVar, i);
    }

    public void ri(mj mjVar, fi fiVar) {
        this.sf.ri(mjVar, null, fiVar);
    }

    public void ri(Activity activity) {
        this.sf.lr(activity);
    }

    public void ri(final mj mjVar, final boolean z, final int i, final String str, final int i2, final String str2, final int i3) {
        Activity activity;
        if (!tan()) {
            this.slm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.lr.2
                @Override // java.lang.Runnable
                public void run() {
                    lr.this.ri(mjVar, z, i, str, i2, str2, i3);
                }
            };
            return;
        }
        if (bu()) {
            return;
        }
        nr();
        if (this.xha != null && (activity = this.aw) != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.lr.3
                @Override // java.lang.Runnable
                public void run() {
                    lr.this.xha.ri(z, i, str, i2, str2);
                }
            });
            co.ri(this.ka, z, i3);
        } else {
            co.ri(this.ka, false, i3);
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.activity.single.ri riVar, boolean z) {
        this.sf.ri(riVar, z);
    }

    public void ri(mj mjVar) {
        com.bytedance.sdk.openadsdk.activity.single.ik ikVar = this.sf;
        if (ikVar == null) {
            return;
        }
        ikVar.ri(mjVar);
    }

    public void ri(mj mjVar, boolean z) {
        com.bytedance.sdk.openadsdk.activity.single.ik ikVar = this.sf;
        if (ikVar == null) {
            return;
        }
        ikVar.ri(mjVar, z);
    }

    public void ri(View view) {
        this.sf.ri(view);
    }

    public void ri(View view, boolean z) {
        this.sf.ri(view, z);
    }

    public boolean ri(mj mjVar, int i) {
        return this.sf.ri(mjVar, i);
    }

    public void ri(float f) {
        this.sf.ri(f);
    }

    public void ri(Map<String, Object> map, mj mjVar, float f, float f2) {
        this.sf.ri(map, mjVar, f, f2);
    }

    public void ri(int i) {
        this.sf.ri(i);
    }

    public void ri(mj mjVar, boolean z, boolean z2, boolean z3, int i) {
        this.sf.ri(mjVar, z, z2, z3, i);
    }
}
