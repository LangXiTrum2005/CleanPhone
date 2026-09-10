package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class hcw implements Handler.Callback, com.bytedance.sdk.openadsdk.core.bgr.ka.ri.InterfaceC0235ri {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private int f18171co;
    private boolean di;
    private final com.bytedance.sdk.openadsdk.component.reward.ri.ri fi;
    private boolean jbs;
    private final com.bytedance.sdk.openadsdk.core.model.wjv ka;
    private boolean mj;
    private int qt;
    private boolean xha;
    private float ri = 1.0f;
    private int lr = 1000;
    private final Handler ik = new Handler(Looper.getMainLooper(), this);
    private int sf = 0;

    public hcw(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        this.qt = 0;
        this.f18171co = 0;
        this.fi = riVar;
        this.ka = wjvVar;
        if (wjvVar.qa()) {
            if (wjvVar.plm() >= 0) {
                this.f18171co = wjvVar.plm();
            } else {
                this.f18171co = com.bytedance.sdk.openadsdk.core.nr.ka().qt(String.valueOf(wjvVar.ur()));
            }
        } else if (wjvVar.pg()) {
            if (wjvVar.mhp() >= 0) {
                this.f18171co = wjvVar.mhp();
            } else {
                this.f18171co = com.bytedance.sdk.openadsdk.core.nr.ka().tan(String.valueOf(wjvVar.ur()));
            }
        }
        this.qt = (int) riVar.ihz.qd();
        com.bytedance.sdk.component.utils.ac.ri("TTAD.TopLayoutHelper", "totalTime: " + this.qt + ", skipTime=" + this.f18171co);
    }

    public void fi() {
        this.ik.removeMessages(1024);
        this.di = false;
        this.mj = true;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.fi;
        if (riVar != null) {
            riVar.ihz.oh();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1024) {
            int i = this.qt;
            int i2 = this.sf;
            int i3 = i - i2;
            this.fi.ihz.ri(((long) i2) * 1000);
            com.bytedance.sdk.component.utils.ac.ri("TTAD.TopLayoutHelper", "handleMessage: currentTime= " + this.sf + ", mRemainTimeInSeconds=" + i3);
            if (i3 > 0) {
                Activity activity = this.fi.ig;
                if (activity instanceof TTRewardVideoActivity) {
                    ((TTRewardVideoActivity) activity).ik(((long) this.sf) * 1000, this.qt);
                }
                com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar = this.fi.ay;
                boolean z = false;
                if (jbsVar != null && jbsVar.ri() != null) {
                    this.fi.ay.ri().setTime(String.valueOf(i3), this.sf, 0, false);
                }
                if (this.ka.qa()) {
                    com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar2 = this.fi.ay;
                    if (jbsVar2 != null) {
                        if (jbsVar2.jbs() && this.f18171co > 0) {
                            z = true;
                        }
                        this.jbs = z;
                    }
                    if (!this.jbs || this.sf < this.f18171co || this.fi.lr.nd() == 5 || this.fi.lr.nd() == 33) {
                        this.fi.oh.ri(String.valueOf(i3), null);
                    } else {
                        this.fi.ri(true);
                        this.fi.oh.ri(String.valueOf(i3), TTAdDislikeToast.getSkipText());
                        this.fi.oh.fi(true);
                    }
                } else if (this.ka.pg() && (this.fi.ay.jbs() || this.fi.lr.vgs())) {
                    Activity activity2 = this.fi.ig;
                    if (activity2 instanceof TTFullScreenVideoActivity) {
                        ((TTFullScreenVideoActivity) activity2).ri(this.sf);
                    }
                    this.fi.oh.ka(true);
                    this.fi.oh.ri(String.valueOf(i3), null);
                }
                this.sf++;
                if (this.fi.ihz.ik()) {
                    com.bytedance.sdk.openadsdk.core.model.ory oryVarCmy = this.fi.lr.cmy();
                    if (oryVarCmy != null) {
                        float fRi = oryVarCmy.ri();
                        this.ri = fRi;
                        if (fRi <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            this.ri = 1.0f;
                        }
                    }
                } else {
                    this.ri = 1.0f;
                }
                int i4 = (int) (1000.0f / this.ri);
                com.bytedance.sdk.component.utils.ac.ri("TTAD.TopLayoutHelper", "handleMessage: next msg intervalInMillis = ".concat(String.valueOf(i4)));
                this.ik.sendEmptyMessageDelayed(message.what, i4);
            }
        }
        return true;
    }

    public void ik() {
        if (this.di) {
            this.ik.removeMessages(1024);
            this.ik.sendEmptyMessage(1024);
            this.xha = false;
        }
    }

    public void ka() {
        if (!this.di || this.xha) {
            return;
        }
        this.ik.removeMessages(1024);
        this.xha = true;
    }

    public void lr() {
        this.ik.sendEmptyMessage(1024);
        this.xha = false;
    }

    public boolean ri() {
        return this.di;
    }

    public void ri(long j) {
        int iCeil = (int) Math.ceil(j / 1000.0d);
        if (this.xha && !this.mj) {
            this.sf = iCeil;
            ik();
        } else {
            if (this.di || this.mj) {
                return;
            }
            this.sf = iCeil;
            this.di = true;
            lr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ri.InterfaceC0235ri
    public void ri(int i) {
        com.bytedance.sdk.component.utils.ac.ri("TTAD.TopLayoutHelper", "onPlayerStateChanged: ".concat(String.valueOf(i)));
        if (i == 1) {
            ik();
            return;
        }
        if (i == 2) {
            ka();
        } else if (i == 3 || i == 4) {
            fi();
        }
    }
}
