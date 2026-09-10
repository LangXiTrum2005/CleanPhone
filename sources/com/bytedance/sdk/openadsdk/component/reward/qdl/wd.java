package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.smartdigimkt.o1.b;

/* JADX INFO: loaded from: classes3.dex */
public class wd extends tvp implements Handler.Callback {
    private final Handler aaj;
    private boolean bch;
    private boolean bqt;
    private boolean jyq;
    private int ljh;
    int lnr;
    int mml;
    boolean mo;
    int mzz;
    private int oth;
    boolean qdl;
    long ud;
    private int uw;
    protected int wd;
    private int xmv;

    public wd(qdl qdlVar) {
        super(qdlVar);
        this.aaj = new Handler(this);
        this.qdl = false;
        this.ud = 0L;
        this.lnr = 0;
        this.mml = 0;
        this.mzz = 0;
        this.mo = false;
        this.jyq = false;
        this.oth = 0;
        this.bch = false;
        this.uw = 0;
        this.xmv = 0;
        this.bqt = false;
        this.wd = vu.tvp(this.to);
        this.mml = this.to.icv();
        int iSxp = this.to.sxp();
        this.mzz = iSxp;
        this.uw = Math.max(0, this.mml - iSxp);
    }

    private boolean jl() {
        return this.jpc && vu.lnr(this.fs.ud) && !this.exc.get();
    }

    private boolean jtx() {
        if (this.fs.ra) {
            return false;
        }
        int i2 = this.wd;
        return 1 == i2 || 2 == i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yt() {
        int i2 = !this.bch ? this.mzz - this.lnr : this.mzz + this.xmv;
        int i3 = com.bytedance.sdk.openadsdk.core.yt.mml().xmv(String.valueOf(this.fs.mo)).mo;
        int i4 = this.mml;
        boolean z2 = false;
        boolean z3 = i4 <= 0 || (((float) i2) / ((float) i4)) * 100.0f >= ((float) i3);
        int iQdl = com.bytedance.sdk.openadsdk.core.yt.mml().qdl(String.valueOf(this.fs.mo));
        if (iQdl == 0) {
            com.bytedance.sdk.openadsdk.aaj.qdl.qdl qdlVar = this.jl;
            boolean zMo = qdlVar != null ? qdlVar.mo() : false;
            if (this.bjy) {
                zMo = true;
            }
            if (z3 && zMo) {
                z2 = true;
            }
        } else if (iQdl == 1) {
            z2 = z3;
        }
        if (z2) {
            this.fs.wc.ud(true);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 900 || !jl()) {
            return true;
        }
        int i2 = message.arg1;
        boolean z2 = false;
        if (this.bch) {
            int i3 = this.mzz;
            int i4 = this.xmv;
            int i5 = i3 + i4;
            int i6 = this.mml;
            if (i5 < i6) {
                this.xmv = i4 + 1;
                Message messageObtain = Message.obtain();
                messageObtain.what = b.z1;
                messageObtain.arg1 = 0;
                this.aaj.sendMessageDelayed(messageObtain, 1000L);
            } else {
                this.xmv = i6 - i3;
            }
        } else if (i2 > 0) {
            if (this.oth == 0 && 2 == this.wd) {
                z2 = true;
            }
            this.fs.fco.mml(true);
            if (!z2) {
                this.fs.fco.qdl(String.valueOf(i2), null);
            }
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = b.z1;
            int i7 = i2 - 1;
            messageObtain2.arg1 = i7;
            this.aaj.sendMessageDelayed(messageObtain2, 1000L);
            this.lnr = i7;
            this.ljh = i2;
        } else {
            this.mo = true;
            if (!vu.jpc(this.to) || (vu.aaj(this.to) && this.jl.mzz())) {
                this.fs.fco.mml(false);
                this.fs.exc.set(true);
                this.fs.en.bjy();
            } else {
                this.fs.fco.lnr();
                this.fs.fco.mzz(true);
            }
            com.bytedance.sdk.openadsdk.aaj.qdl.qdl qdlVar = this.jl;
            if (qdlVar == null || qdlVar.mzz()) {
                this.bjy = true;
            }
            if (this.uw > 0) {
                this.bch = true;
                this.xmv++;
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = b.z1;
                messageObtain3.arg1 = 0;
                this.aaj.sendMessageDelayed(messageObtain3, 1000L);
            }
            this.ljh = 0;
        }
        yt();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public int jpc() {
        return this.ljh;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void lnr() {
        if (this.rdp) {
            this.jpc = true;
            boolean zJtx = jtx();
            if (zJtx) {
                this.jl.qdl(new com.bytedance.sdk.openadsdk.aaj.qdl.qdl.InterfaceC0099qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.wd.2
                    @Override // com.bytedance.sdk.openadsdk.aaj.qdl.qdl.InterfaceC0099qdl
                    public void qdl(int i2) {
                        if (wd.this.bqt) {
                            return;
                        }
                        wd.this.oth = i2;
                        wd.this.jl.qdl((com.bytedance.sdk.openadsdk.aaj.qdl.qdl.InterfaceC0099qdl) null);
                        wd.this.ud(i2);
                    }
                });
            }
            this.jl.qdl();
            if (vu.jpc(this.to)) {
                this.fs.hkc.mo();
            }
            this.ud = System.currentTimeMillis();
            if (!zJtx) {
                ud(0);
            }
            this.fs.wc.yt();
            com.bytedance.sdk.openadsdk.component.reward.rq rqVar = this.fs.gg;
            if (rqVar != null) {
                rqVar.qdl(this.mml);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void mml() {
        com.bytedance.sdk.openadsdk.core.widget.ud udVar;
        if (this.rdp) {
            super.mml();
            if (DeviceUtils.wd() == 0) {
                this.fs.gt = true;
            }
            qdl qdlVar = this.fs;
            if (qdlVar.gt) {
                qdlVar.fco.ud(true);
                lnr(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar2 = this.fs.en;
            if ((udVar2 == null || (udVar = udVar2.exu) == null || !udVar.isShowing()) && rq() && wd() > 0) {
                qdl(0L);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void mo() {
        if (this.rdp && !this.jtx) {
            super.mo();
            this.aaj.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void mzz() {
        if (this.rdp) {
            super.mzz();
            tvp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public boolean to() {
        return this.mo;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void tvp() {
        if (this.rdp) {
            this.jyq = true;
            this.aaj.removeMessages(b.z1);
            this.aaj.removeMessages(600);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public int wd() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void qdl() {
        if (this.rdp && !this.exu) {
            super.qdl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public com.bytedance.sdk.openadsdk.fs.mo ud() {
        return new com.bytedance.sdk.openadsdk.fs.mo() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.wd.1
            @Override // com.bytedance.sdk.openadsdk.fs.mo
            public void qdl() {
                wd.this.yt();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(int i2) {
        qdl(this.mzz);
        if (this.jyq) {
            return;
        }
        Handler handler = this.aaj;
        handler.sendMessage(handler.obtainMessage(b.z1, this.mzz, i2));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void qdl(boolean z2) {
        if (this.yt != null) {
            try {
                com.bytedance.sdk.openadsdk.aaj.qdl.ud udVarQdl = com.bytedance.sdk.openadsdk.aaj.qdl.mml.qdl().qdl(this.to, this.yt, ud());
                this.jl = udVarQdl;
                udVarQdl.qdl(this.fs.wc);
            } catch (Throwable th) {
                aaj.lnr("RVIVPlayableNewManager", "PreRender injection exception" + th.getMessage());
            }
            if (this.jl == null) {
                super.qdl(z2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void qdl(int i2) {
        this.lnr = i2;
        this.ljh = i2;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void qdl(long j) {
        if (this.rdp && this.jpc && !this.fs.rq.get() && this.jyq) {
            this.jyq = false;
            Message messageObtain = Message.obtain();
            messageObtain.what = b.z1;
            messageObtain.arg1 = wd();
            messageObtain.arg2 = this.oth;
            this.aaj.sendMessageDelayed(messageObtain, j);
        }
    }
}
