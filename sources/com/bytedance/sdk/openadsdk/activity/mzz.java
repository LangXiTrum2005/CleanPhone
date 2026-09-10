package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.component.reward.view.to;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mzz extends jpc implements koa.qdl {
    private static String aaj;
    private static String jyq;
    private static String mml;
    private static String mzz;
    private static String oth;
    private int bch;
    private boolean bqt;
    private boolean ekw;
    private boolean kdv;
    private long koa;
    private Bundle ljh;
    protected com.bytedance.sdk.openadsdk.component.reward.ud.ud lnr;
    public boolean qdl;
    private int rc;
    protected final koa ud;
    private ud.mzz uw;
    private JSONObject vu;
    private boolean xmv;

    public mzz(ud udVar, ljh ljhVar, int i2, int i3, boolean z2, boolean z3, boolean z4) {
        super(udVar, ljhVar, i2, i3, z3);
        this.ud = new koa(Looper.getMainLooper(), this);
        boolean z5 = false;
        this.bch = 0;
        this.ekw = true;
        this.jtx = z2;
        this.exu = udVar.mml();
        this.kdv = z2 && vu.lnr(ljhVar);
        this.qdl = z4;
        if (this.jtx && vu.lnr(ljhVar)) {
            z5 = true;
        }
        this.kdv = z5;
        qdl(ljhVar, this.ljh);
    }

    private void dk() {
        try {
            oth();
        } catch (Throwable unused) {
            wak();
        }
        uw();
        if (!aaj.mo(this.mo) || this.qdl) {
            return;
        }
        lte();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ekw() {
        ud.mzz mzzVar = new ud.mzz(7, this.tvp);
        mzzVar.mml = this.tvp.gt;
        this.wd.ud(this, mzzVar);
    }

    private boolean kdv() {
        if (this.tvp.to.get() && this.tvp.wd) {
            return false;
        }
        if (this.mo.mo()) {
            return this.tvp.to.get();
        }
        return true;
    }

    private void koa() {
        final View view = this.tvp.gy.to();
        if (view != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.mzz.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (mzz.this.tvp.hkc.aaj()) {
                        boolean zExu = mzz.this.tvp.hzv.exu();
                        mzz.this.tvp.hkc.mo(zExu);
                        mzz.this.tvp.gy.mo(8);
                        View view3 = view;
                        if (view3 instanceof com.bytedance.sdk.openadsdk.core.mo.mml) {
                            ((com.bytedance.sdk.openadsdk.core.mo.mml) view3).setImageResource(com.bytedance.sdk.component.utils.ljh.mml(mzz.this.tvp.om, "tt_close_btn"));
                        }
                        mzz.this.tvp.cx.sendEmptyMessageDelayed(600, 5000L);
                        if (!ljh.lnr(mzz.this.tvp.ud)) {
                            return;
                        }
                        if (ljh.lnr(mzz.this.tvp.ud) && zExu) {
                            return;
                        }
                    }
                    mzz.this.tvp.hkc.jyq();
                    mzz.this.tvp.hzv.rq();
                    mzz.this.tvp.vu.mo();
                    if (vu.mml(mzz.this.tvp.ud) && mzz.this.qdl(true, true, (Runnable) null)) {
                        return;
                    }
                    mzz.this.wak();
                }
            };
            view.setOnClickListener(onClickListener);
            view.setTag(view.getId(), onClickListener);
        }
        this.tvp.fco.qdl(new com.bytedance.sdk.openadsdk.component.reward.top.ud() { // from class: com.bytedance.sdk.openadsdk.activity.mzz.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void lnr(View view2) {
                View view3 = view;
                if (view3 != null) {
                    view3.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void mml(View view2) {
                Log.e("TTAD.EndCardScene", "onPlayableChangeNext: click");
                mzz mzzVar = mzz.this;
                mzzVar.qdl(mzzVar.tvp);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void qdl(View view2) {
                mzz mzzVar = mzz.this;
                if (mzzVar.qdl(vu.lnr(mzzVar.tvp.ud), false, (Runnable) null) || mzz.this.vu()) {
                    return;
                }
                if (!vu.mzz(mzz.this.tvp.ud)) {
                    if (!aaj.qdl(mzz.this.tvp.ud) || mzz.this.tvp.jtx.get()) {
                        mzz.this.wak();
                        return;
                    } else {
                        mzz.this.wak();
                        return;
                    }
                }
                if (vu.jpc(mzz.this.tvp.ud)) {
                    mzz.this.tvp.xmv.tvp();
                    return;
                }
                View view3 = view;
                if (view3 != null) {
                    view3.performClick();
                } else {
                    mzz.this.wak();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void ud(View view2) {
                mzz.this.c_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void qdl(View view2, String str) {
                mzz.this.qdl(str);
            }
        });
    }

    private void oth() {
        if (this.bqt) {
            return;
        }
        this.bqt = true;
        if (!this.qdl) {
            this.tvp.fzn = this.wd.oth();
        }
        this.tvp.ax.qdl(this.lnr);
        this.lnr.qdl(this, this.ud);
        this.lnr.rq();
    }

    private void uw() {
        if (this.xmv) {
            return;
        }
        this.xmv = true;
        if (com.bytedance.sdk.openadsdk.jyq.qdl.qdl("ivrv_new_arch_endcard_view_add_at_first", 0) == 1) {
            if (this.exu) {
                this.wd.qdl(qdl(), ag());
            } else {
                this.wd.qdl(qdl());
            }
        }
        this.lnr.xmv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean vu() {
        ud udVar;
        if (this.qdl || (udVar = this.wd) == null || !udVar.jl()) {
            return false;
        }
        try {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), this.mo, this.tvp.mzz, "skip", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.mzz.3
                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject qdl() {
                    if (mzz.this.vu != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("scene_type", mzz.this.tvp.qdl);
                            return jSONObject;
                        } catch (Throwable unused) {
                        }
                    }
                    return null;
                }

                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject ud() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", mzz.this.koa);
                        jSONObject.put("percent", mzz.this.rc);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable unused) {
        }
        this.wd.qdl(this, true, false, false, 4);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public boolean a_() {
        return this.tvp.mml;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void aaj() {
        super.aaj();
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar == null) {
            return;
        }
        udVar.jyq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public String b_() {
        return this.tvp.mzz;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public String bch() {
        return this.tvp.wak;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public final void bjy() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void c_() {
        this.tvp.kdv.qdl(this.lnr);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public boolean d_() {
        return this.tvp.gt;
    }

    public boolean exc() {
        return this.tvp.hkc.koa();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public final void exu() {
        super.exu();
        if (this.tvp == null || com.bytedance.sdk.component.utils.ud.qdl(yh())) {
            return;
        }
        this.tvp.hkc.xmv();
        com.bytedance.sdk.openadsdk.utils.mml.qdl(yh(), this.tvp.ud);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void fs() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void hkc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void jl() {
        xi();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public final View jtx() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void jyq() {
        super.jyq();
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar != null) {
            udVar.oth();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public boolean ljh() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        return qdlVar != null && qdlVar.bch.kdv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mml(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mo() {
        com.bytedance.sdk.component.utils.aaj.qdl("TTAD.EndCardScene", "onPlayableLoadingDismiss()---" + this.to + ",scene = " + this);
        ud udVar = this.wd;
        if (udVar != null) {
            udVar.qdl(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public boolean qdl(long j, boolean z2) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public final void rdp() {
        super.rdp();
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar == null) {
            return;
        }
        udVar.exc();
    }

    public void to() {
        if (ag()) {
            return;
        }
        ud.mzz mzzVar = new ud.mzz(8, this.tvp);
        mzzVar.mml = this.tvp.gt;
        ud udVar = this.wd;
        if (udVar != null) {
            udVar.qdl(this, mzzVar);
        }
    }

    public final void wd() {
        if (this.wd == null) {
            return;
        }
        this.tvp.mrf.qdl(this.uw.qdl.getBoolean("isSkip", false), this.uw.qdl.getBoolean("force", false), this.uw.qdl.getBoolean("isFromLandingPage", false), this.lnr, this.uw.ud);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public com.bytedance.sdk.openadsdk.component.reward.qdl.qdl xmv() {
        return this.tvp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public final void yt() {
        if (this.tvp.rdp.getAndSet(true)) {
            return;
        }
        this.tvp.vu.qdl();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public final void lnr() {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar;
        super.lnr();
        if (this.tvp == null || (udVar = this.lnr) == null) {
            return;
        }
        udVar.yt();
        this.tvp.irn = true;
        if (kdv()) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
            qdlVar.fco.qdl(qdlVar.ud.tvf());
        }
        this.tvp.gy.bjy();
        this.tvp.hkc.yt();
        this.tvp.xmv.mzz();
        if (this.lnr.ud()) {
            this.tvp.bch.qdl(this.lnr);
            this.tvp.bch.qdl(false, this, this.bch != 0);
        }
        this.bch++;
        to toVar = this.tvp.bqt;
        if (toVar != null) {
            toVar.wd();
        }
        this.tvp.koa.qdl(this.ud);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void ud(boolean z2) {
        if (!z2 || this.tvp.ra) {
            return;
        }
        xi();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void mml() {
        super.mml();
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar == null) {
            return;
        }
        udVar.aaj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public final void qdl(Activity activity, Bundle bundle) {
        this.ljh = bundle;
        super.qdl(activity, bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public final com.bytedance.sdk.openadsdk.component.reward.view.tvp qdl() {
        return this.tvp.ax;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void qdl(Activity activity, ud.mzz mzzVar) {
        ud udVar;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar;
        this.uw = mzzVar;
        Intent intent = activity.getIntent();
        this.bjy = intent.getStringExtra("media_extra");
        this.rdp = intent.getStringExtra("user_id");
        try {
            if (jyq == null) {
                jyq = com.bytedance.sdk.component.utils.ljh.qdl(this.tvp.om, "tt_reward_msg");
                mml = com.bytedance.sdk.component.utils.ljh.qdl(this.tvp.om, "tt_msgPlayable");
                aaj = com.bytedance.sdk.component.utils.ljh.qdl(this.tvp.om, "tt_negtiveBtnBtnText");
                oth = com.bytedance.sdk.component.utils.ljh.qdl(this.tvp.om, "tt_postiveBtnText");
                mzz = com.bytedance.sdk.component.utils.ljh.qdl(this.tvp.om, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.EndCardScene", th.getMessage());
        }
        if (mzzVar != null && (qdlVar = mzzVar.lnr) != null) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.tvp;
            qdlVar2.dk = qdlVar.dk;
            qdlVar2.gt = qdlVar.gt;
            if ((this.exu || this.jtx) && !ag()) {
                this.tvp.fs.set(qdlVar.fs.get());
            }
            if (!this.kdv) {
                this.tvp.exu.set(qdlVar.exu.get());
                this.tvp.rdp.set(qdlVar.rdp.get());
            }
            this.tvp.bch.qdl(qdlVar.bch.mzz());
            qdl(this.tvp, qdlVar);
        }
        if (this.exu || this.jtx) {
            try {
                oth();
            } catch (Throwable unused) {
                wak();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.tvp;
        if (qdlVar3 != null && (udVar = this.wd) != null) {
            qdlVar3.gg = udVar.qdl;
        }
        uw();
        koa();
        wd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void lnr(boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.to toVar;
        long j = this.ekw ? this.tvp.dk : 0L;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        if (qdlVar != null && (toVar = qdlVar.vu) != null) {
            toVar.ud(z2);
            this.tvp.vu.lnr(z2);
            if (z2 && j > 0) {
                this.tvp.dk = j;
            }
        }
        if (z2) {
            this.ekw = false;
        }
    }

    private void qdl(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar, com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2) {
        if (!this.exu || ag() || qdlVar == null || qdlVar2 == null) {
            return;
        }
        try {
            this.koa = qdlVar2.bch.exu();
            if (this.mo.yh()) {
                this.koa = qdlVar2.lnr();
            }
            this.rc = qdlVar2.bch.ljh();
            this.vu = gy.qdl(this.mo, qdlVar2.bch.jtx(), qdlVar2.bch.yt());
        } catch (Throwable unused) {
        }
    }

    private void qdl(ljh ljhVar, Bundle bundle) {
        Activity activityYh = yh();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = new com.bytedance.sdk.openadsdk.component.reward.qdl.qdl(activityYh, this.ud, ljhVar, this, 2, this.wd.ud());
        this.tvp = qdlVar;
        qdlVar.rzg = this.jtx;
        boolean z2 = this.qdl;
        qdlVar.ew = z2;
        qdlVar.blf = qdlVar.ra && !z2;
        qdlVar.ra = this.wd.mzz();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.tvp;
        qdlVar2.qk = this.exu;
        qdlVar2.tqd = this.wd.lnr();
        if (!this.qdl) {
            this.tvp.fzn = this.wd.oth();
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.tvp;
        qdlVar3.lq = this;
        qdlVar3.ekw = this.wd.aaj();
        com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(this.tvp, activityYh.getIntent(), bundle);
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVarQdl = com.bytedance.sdk.openadsdk.component.reward.ud.mo.qdl(this.tvp);
        this.lnr = udVarQdl;
        this.tvp.en = udVarQdl;
        Objects.toString(udVarQdl);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void qdl(String str) {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar != null && udVar.mml() != null) {
            this.lnr.mml().qdl(this.tvp.gt);
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        qdlVar.gt = !qdlVar.gt;
        StringBuilder sb = new StringBuilder("will set is Mute ");
        sb.append(this.tvp.gt);
        sb.append(" mLastVolume=");
        sb.append(this.tvp.ekw.qdl());
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.tvp;
        qdlVar2.bch.qdl(qdlVar2.gt, str);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.tvp;
        qdlVar3.hkc.mzz(qdlVar3.gt);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = this.tvp;
        qdlVar4.xmv.ud(qdlVar4.gt);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void qdl(Activity activity) {
        super.qdl(activity);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        if (qdlVar == null) {
            return;
        }
        qdlVar.koa.qdl();
    }

    @Override // com.bytedance.sdk.component.utils.koa.qdl
    public final void qdl(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar == null) {
            return;
        }
        udVar.qdl(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(String str, JSONObject jSONObject) {
        if (str == null || !"skipToNextAd".equals(str) || this.wd == null || ag()) {
            return;
        }
        if (this.wd.ljh() == null && qdl(vu.lnr(this.tvp.ud), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.mzz.4
            @Override // java.lang.Runnable
            public void run() {
                mzz.this.ekw();
            }
        })) {
            return;
        }
        ekw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(boolean z2) {
        ud udVar = this.wd;
        if (udVar != null) {
            udVar.qdl(this, z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void qdl(jpc jpcVar, jpc jpcVar2, ud.mzz mzzVar) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar;
        super.qdl(jpcVar, jpcVar2, mzzVar);
        com.bytedance.sdk.component.utils.aaj.qdl("TTAD.EndCardScene", "【onActiveSceneChanged】" + this.to + ",scene = " + this + ",newScene = " + jpcVar2 + ",oldScene = " + jpcVar + ",isPlayable = " + this.jtx);
        boolean z2 = this.to == jpcVar2.to + 1;
        if (jpcVar != null && (qdlVar = this.tvp) != null) {
            qdlVar.gt = mzzVar.mml;
        }
        if (z2) {
            com.bytedance.sdk.component.utils.aaj.qdl("TTAD.EndCardScene", "preload index =" + this.to + ",new index =" + jpcVar2.to + ",isPlayableProxy = " + this.jtx);
            dk();
        }
        if (jpcVar == null && this.qdl) {
            com.bytedance.sdk.component.utils.aaj.qdl("TTAD.EndCardScene", "preload agg-endcard =" + this.to + ",new index =" + jpcVar2.to + ",isPlayableProxy = " + this.jtx);
            dk();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qdl(final boolean z2, boolean z3, final Runnable runnable) {
        if (!this.tvp.mml || this.wd.rq().getBoolean("reward_verify", false) || this.wd.bjy()) {
            return false;
        }
        if (!z3 && this.wd.rq().getBoolean("user_has_give_up_reward", false)) {
            return false;
        }
        if (!yt.mml().jpc(String.valueOf(this.tvp.mo))) {
            if (!z3) {
                return false;
            }
            if (runnable == null && z2) {
                wak();
                return true;
            }
        }
        this.tvp.aaj.set(true);
        if (z2) {
            this.tvp.xmv.mo();
        }
        final com.bytedance.sdk.openadsdk.core.widget.ud udVar = new com.bytedance.sdk.openadsdk.core.widget.ud(this.tvp.ag);
        this.lnr.exu = udVar;
        if (z2) {
            udVar.qdl(mml).ud(mzz).lnr(aaj);
        } else {
            udVar.qdl(jyq).ud(oth).lnr(aaj);
        }
        this.lnr.exu.qdl(new com.bytedance.sdk.openadsdk.core.widget.ud.InterfaceC0139ud() { // from class: com.bytedance.sdk.openadsdk.activity.mzz.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.ud.InterfaceC0139ud
            public void qdl() {
                if (z2) {
                    mzz.this.tvp.xmv.qdl(1000);
                }
                udVar.dismiss();
                mzz.this.tvp.aaj.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ud.InterfaceC0139ud
            public void ud() {
                udVar.dismiss();
                mzz.this.wd.rq().putBoolean("user_has_give_up_reward", true);
                mzz.this.tvp.aaj.set(false);
                mzz.this.tvp.xmv.ud(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z2) {
                    mzz.this.vu();
                } else {
                    mzz.this.tvp.vu.mo();
                    mzz.this.wak();
                }
            }
        }).show();
        return true;
    }
}
