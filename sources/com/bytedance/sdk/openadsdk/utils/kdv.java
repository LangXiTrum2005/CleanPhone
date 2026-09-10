package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;

/* JADX INFO: loaded from: classes3.dex */
public class kdv implements Handler.Callback, com.bytedance.sdk.openadsdk.core.exu.mml.qdl.InterfaceC0111qdl {
    private int fs;
    private boolean jpc;
    private final com.bytedance.sdk.openadsdk.core.model.ljh mml;
    private boolean mo;
    private final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl mzz;
    private int to;
    private boolean tvp;
    private boolean wd;
    private float qdl = 1.0f;
    private int ud = 1000;
    private final Handler lnr = new Handler(Looper.getMainLooper(), this);
    private int rq = 0;

    public kdv(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        this.to = 0;
        this.fs = 0;
        this.mzz = qdlVar;
        this.mml = ljhVar;
        if (ljhVar.mq()) {
            if (ljhVar.qg() >= 0) {
                this.fs = ljhVar.qg();
            } else {
                this.fs = com.bytedance.sdk.openadsdk.core.yt.mml().to(String.valueOf(ljhVar.fz()));
            }
        } else if (ljhVar.nni()) {
            if (ljhVar.ws() >= 0) {
                this.fs = ljhVar.ws();
            } else {
                this.fs = com.bytedance.sdk.openadsdk.core.yt.mml().exc(String.valueOf(ljhVar.fz()));
            }
        }
        this.to = (int) qdlVar.bch.fco();
        com.bytedance.sdk.component.utils.aaj.qdl("TTAD.TopLayoutHelper", "totalTime: " + this.to + ", skipTime=" + this.fs);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1024) {
            int i2 = this.to;
            int i3 = this.rq;
            int i4 = i2 - i3;
            this.mzz.bch.qdl(((long) i3) * 1000);
            com.bytedance.sdk.component.utils.aaj.qdl("TTAD.TopLayoutHelper", "handleMessage: currentTime= " + this.rq + ", mRemainTimeInSeconds=" + i4);
            if (i4 > 0) {
                Activity activity = this.mzz.ag;
                if (activity instanceof TTRewardVideoActivity) {
                    ((TTRewardVideoActivity) activity).lnr(((long) this.rq) * 1000, this.to);
                }
                com.bytedance.sdk.openadsdk.component.reward.view.to toVar = this.mzz.bqt;
                boolean z2 = false;
                if (toVar != null && toVar.qdl() != null) {
                    this.mzz.bqt.qdl().setTime(String.valueOf(i4), this.rq, 0, false);
                }
                if (this.mml.mq()) {
                    com.bytedance.sdk.openadsdk.component.reward.view.to toVar2 = this.mzz.bqt;
                    if (toVar2 != null) {
                        if (toVar2.tvp() && this.fs > 0) {
                            z2 = true;
                        }
                        this.tvp = z2;
                    }
                    if (!this.tvp || this.rq < this.fs || this.mzz.ud.taz() == 5 || this.mzz.ud.taz() == 33) {
                        this.mzz.fco.qdl(String.valueOf(i4), null);
                    } else {
                        this.mzz.qdl(true);
                        this.mzz.fco.qdl(String.valueOf(i4), TTAdDislikeToast.getSkipText());
                        this.mzz.fco.mzz(true);
                    }
                } else if (this.mml.nni() && (this.mzz.bqt.tvp() || this.mzz.ud.au())) {
                    Activity activity2 = this.mzz.ag;
                    if (activity2 instanceof TTFullScreenVideoActivity) {
                        ((TTFullScreenVideoActivity) activity2).lnr(this.rq);
                    }
                    this.mzz.fco.mml(true);
                    this.mzz.fco.qdl(String.valueOf(i4), null);
                }
                this.rq++;
                if (this.mzz.bch.lnr()) {
                    com.bytedance.sdk.openadsdk.core.model.rc rcVarEu = this.mzz.ud.eu();
                    if (rcVarEu != null) {
                        float fQdl = rcVarEu.qdl();
                        this.qdl = fQdl;
                        if (fQdl <= 0.0f) {
                            this.qdl = 1.0f;
                        }
                    }
                } else {
                    this.qdl = 1.0f;
                }
                int i5 = (int) (1000.0f / this.qdl);
                com.bytedance.sdk.component.utils.aaj.qdl("TTAD.TopLayoutHelper", "handleMessage: next msg intervalInMillis = ".concat(String.valueOf(i5)));
                this.lnr.sendEmptyMessageDelayed(message.what, i5);
            }
        }
        return true;
    }

    public void lnr() {
        if (this.mo) {
            this.lnr.removeMessages(1024);
            this.lnr.sendEmptyMessage(1024);
            this.wd = false;
        }
    }

    public void mml() {
        if (!this.mo || this.wd) {
            return;
        }
        this.lnr.removeMessages(1024);
        this.wd = true;
    }

    public void mzz() {
        this.lnr.removeMessages(1024);
        this.mo = false;
        this.jpc = true;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.mzz;
        if (qdlVar != null) {
            qdlVar.bch.rc();
        }
    }

    public boolean qdl() {
        return this.mo;
    }

    public void ud() {
        this.lnr.sendEmptyMessage(1024);
        this.wd = false;
    }

    public void qdl(long j) {
        int iCeil = (int) Math.ceil(j / 1000.0d);
        if (this.wd && !this.jpc) {
            this.rq = iCeil;
            lnr();
        } else {
            if (this.mo || this.jpc) {
                return;
            }
            this.rq = iCeil;
            this.mo = true;
            ud();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.qdl.InterfaceC0111qdl
    public void qdl(int i2) {
        com.bytedance.sdk.component.utils.aaj.qdl("TTAD.TopLayoutHelper", "onPlayerStateChanged: ".concat(String.valueOf(i2)));
        if (i2 == 1) {
            lnr();
            return;
        }
        if (i2 == 2) {
            mml();
        } else if (i2 == 3 || i2 == 4) {
            mzz();
        }
    }
}
