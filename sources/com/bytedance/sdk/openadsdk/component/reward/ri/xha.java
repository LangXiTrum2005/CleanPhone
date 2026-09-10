package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends jbs implements Handler.Callback {
    private final Handler ac;
    private boolean ay;
    boolean di;
    int fi;
    private int fr;
    private boolean igq;
    private boolean ihz;
    int ik;
    int ka;
    long lr;
    boolean ri;
    private int su;
    private int uq;
    private int wjv;
    protected int xha;

    public xha(ri riVar) {
        super(riVar);
        this.ac = new Handler(this);
        this.ri = false;
        this.lr = 0L;
        this.ik = 0;
        this.ka = 0;
        this.fi = 0;
        this.di = false;
        this.ihz = false;
        this.uq = 0;
        this.ay = false;
        this.fr = 0;
        this.su = 0;
        this.igq = false;
        this.xha = dw.jbs(this.qt);
        this.ka = this.qt.gy();
        int iYe = this.qt.ye();
        this.fi = iYe;
        this.fr = Math.max(0, this.ka - iYe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bu() {
        int i = !this.ay ? this.fi - this.ik : this.fi + this.su;
        int i2 = nr.ka().su(String.valueOf(this.f18095co.di)).di;
        int i3 = this.ka;
        boolean z = false;
        boolean z2 = i3 <= 0 || (((float) i) / ((float) i3)) * 100.0f >= ((float) i2);
        int iRi = nr.ka().ri(String.valueOf(this.f18095co.di));
        if (iRi == 0) {
            com.bytedance.sdk.openadsdk.uq.ri.ri riVar = this.nr;
            boolean zDi = riVar != null ? riVar.di() : false;
            if (this.vr) {
                zDi = true;
            }
            if (z2 && zDi) {
                z = true;
            }
        } else if (iRi == 1) {
            z = z2;
        }
        if (z) {
            this.f18095co.qd.lr(true);
        }
    }

    private boolean nr() {
        return this.mj && dw.ik(this.f18095co.lr) && !this.tan.get();
    }

    private boolean slm() {
        if (this.f18095co.xe) {
            return false;
        }
        int i = this.xha;
        return 1 == i || 2 == i;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.jbs
    public void di() {
        if (this.bgr && !this.slm) {
            super.di();
            this.ac.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.jbs
    public void fi() {
        if (this.bgr) {
            super.fi();
            jbs();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 900 || !nr()) {
            return true;
        }
        int i = message.arg1;
        boolean z = false;
        if (this.ay) {
            int i2 = this.fi;
            int i3 = this.su;
            int i4 = i2 + i3;
            int i5 = this.ka;
            if (i4 < i5) {
                this.su = i3 + 1;
                Message messageObtain = Message.obtain();
                messageObtain.what = 900;
                messageObtain.arg1 = 0;
                this.ac.sendMessageDelayed(messageObtain, 1000L);
            } else {
                this.su = i5 - i2;
            }
        } else if (i > 0) {
            if (this.uq == 0 && 2 == this.xha) {
                z = true;
            }
            this.f18095co.oh.ka(true);
            if (!z) {
                this.f18095co.oh.ri(String.valueOf(i), null);
            }
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 900;
            int i6 = i - 1;
            messageObtain2.arg1 = i6;
            this.ac.sendMessageDelayed(messageObtain2, 1000L);
            this.ik = i6;
            this.wjv = i;
        } else {
            this.di = true;
            if (!dw.mj(this.qt) || (dw.ac(this.qt) && this.nr.fi())) {
                this.f18095co.oh.ka(false);
                this.f18095co.slm.set(true);
                this.f18095co.nd.aw();
            } else {
                this.f18095co.oh.ik();
                this.f18095co.oh.fi(true);
            }
            com.bytedance.sdk.openadsdk.uq.ri.ri riVar = this.nr;
            if (riVar == null || riVar.fi()) {
                this.vr = true;
            }
            if (this.fr > 0) {
                this.ay = true;
                this.su++;
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 900;
                messageObtain3.arg1 = 0;
                this.ac.sendMessageDelayed(messageObtain3, 1000L);
            }
            this.wjv = 0;
        }
        bu();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.jbs
    public void ik() {
        if (this.bgr) {
            this.mj = true;
            boolean zSlm = slm();
            if (zSlm) {
                this.nr.ri(new com.bytedance.sdk.openadsdk.uq.ri.ri.InterfaceC0278ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.xha.2
                    @Override // com.bytedance.sdk.openadsdk.uq.ri.ri.InterfaceC0278ri
                    public void ri(int i) {
                        if (xha.this.igq) {
                            return;
                        }
                        xha.this.uq = i;
                        xha.this.nr.ri((com.bytedance.sdk.openadsdk.uq.ri.ri.InterfaceC0278ri) null);
                        xha.this.lr(i);
                    }
                });
            }
            this.nr.ri();
            if (dw.mj(this.qt)) {
                this.f18095co.ory.di();
            }
            this.lr = System.currentTimeMillis();
            if (!zSlm) {
                lr(0);
            }
            this.f18095co.qd.zb();
            com.bytedance.sdk.openadsdk.component.reward.co coVar = this.f18095co.zk;
            if (coVar != null) {
                coVar.ri(this.ka);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.jbs
    public void jbs() {
        if (this.bgr) {
            this.ihz = true;
            this.ac.removeMessages(900);
            this.ac.removeMessages(600);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.jbs
    public void ka() {
        com.bytedance.sdk.openadsdk.core.widget.lr lrVar;
        if (this.bgr) {
            super.ka();
            if (DeviceUtils.xha() == 0) {
                this.f18095co.zyn = true;
            }
            ri riVar = this.f18095co;
            if (riVar.zyn) {
                riVar.oh.lr(true);
                ik(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar2 = this.f18095co.nd;
            if ((lrVar2 == null || (lrVar = lrVar2.f18093co) == null || !lrVar.isShowing()) && sf() && xha() > 0) {
                ri(0L);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.jbs
    public int mj() {
        return this.wjv;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.jbs
    public boolean qt() {
        return this.di;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.jbs
    public int xha() {
        return this.ik;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.jbs
    public com.bytedance.sdk.openadsdk.aw.di lr() {
        return new com.bytedance.sdk.openadsdk.aw.di() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.xha.1
            @Override // com.bytedance.sdk.openadsdk.aw.di
            public void ri() {
                xha.this.bu();
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.jbs
    public void ri() {
        if (this.bgr && !this.aw) {
            super.ri();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(int i) {
        ri(this.fi);
        if (this.ihz) {
            return;
        }
        Handler handler = this.ac;
        handler.sendMessage(handler.obtainMessage(900, this.fi, i));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.jbs
    public void ri(boolean z) {
        if (this.bu != null) {
            try {
                com.bytedance.sdk.openadsdk.uq.ri.lr lrVarRi = com.bytedance.sdk.openadsdk.uq.ri.ka.ri().ri(this.qt, this.bu, lr());
                this.nr = lrVarRi;
                lrVarRi.ri(this.f18095co.qd);
            } catch (Throwable th) {
                ac.ik("RVIVPlayableNewManager", "PreRender injection exception" + th.getMessage());
            }
            if (this.nr == null) {
                super.ri(z);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.jbs
    public void ri(int i) {
        this.ik = i;
        this.wjv = i;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.jbs
    public void ri(long j) {
        if (this.bgr && this.mj && !this.f18095co.qt.get() && this.ihz) {
            this.ihz = false;
            Message messageObtain = Message.obtain();
            messageObtain.what = 900;
            messageObtain.arg1 = xha();
            messageObtain.arg2 = this.uq;
            this.ac.sendMessageDelayed(messageObtain, j);
        }
    }
}
