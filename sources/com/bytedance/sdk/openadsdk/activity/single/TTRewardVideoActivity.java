package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.nr;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.slm;
import com.bytedance.sdk.openadsdk.component.reward.co;
import com.bytedance.sdk.openadsdk.core.ay;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.zf;
import com.bytedance.sdk.openadsdk.ka.fi.lr.vr;
import com.bytedance.sdk.openadsdk.ka.qt;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.su;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.C3700q2;
import com.ironsource.L6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String ac;
    private static String ihz;
    private static com.bytedance.sdk.openadsdk.ri.fi.ri su;
    private static String tan;
    private static String uq;
    private static String wjv;
    private String ay;
    protected int bu;
    private String fr;
    protected com.bytedance.sdk.openadsdk.ri.fi.ri nr;
    protected int slm;
    private final AtomicBoolean igq = new AtomicBoolean(false);
    private int zf = -1;

    private JSONObject jc() {
        JSONObject jSONObject = new JSONObject();
        int iIgq = (int) this.lr.ihz.igq();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.lr.lr.saa());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.lr.lr.pc());
            jSONObject.put("network", nr.ik(getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int iHd = this.lr.lr.hd();
            String strKa = "unKnow";
            if (iHd == 2) {
                strKa = ig.lr();
            } else if (iHd == 1) {
                strKa = ig.ka();
            }
            jSONObject.put("user_agent", strKa);
            JSONObject jSONObjectLjo = this.lr.lr.ljo();
            jSONObjectLjo.put(L6.V0, com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.ri().lr());
            jSONObject.put("extra", jSONObjectLjo);
            jSONObject.put("media_extra", this.ay);
            jSONObject.put("video_duration", this.lr.lr.eu().beachfront());
            jSONObject.put("play_start_ts", this.slm);
            jSONObject.put("play_end_ts", this.bu);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, iIgq);
            jSONObject.put("user_id", this.fr);
            jSONObject.put("trans_id", su.ri().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            ac.ri("TTAD.RVA", "", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x00a1  */
    public void qd() {
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        com.bytedance.sdk.openadsdk.component.reward.view.ik ikVarRi;
        vr.ri riVar = new vr.ri();
        riVar.lr(this.lr.ihz.aw());
        riVar.ka(this.lr.ihz.su());
        riVar.ik(this.lr.ihz.bu());
        riVar.ik(3);
        riVar.ka(this.lr.ihz.fr());
        riVar.ri(this.lr.ihz.lr());
        com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(this.lr.ihz.mj(), riVar, this.lr.ihz.fi());
        zf.ik(this.lr.di);
        this.lr.ihz.ri("skip", false);
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.lr;
        if (riVar2.ik) {
            if (com.bytedance.sdk.openadsdk.core.model.ac.ik(riVar2.lr) && (ikVarRi = this.lr.ay.ri()) != null && ikVarRi.ka == 0) {
                finish();
            } else {
                ri(true, 4);
            }
            if (com.bytedance.sdk.openadsdk.core.model.ac.ri(this.lr.lr) && !this.lr.aw.get()) {
                finish();
            }
        } else {
            finish();
        }
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = this.lr.lr.qc();
        if (kaVarQc != null && (kaVarRi = kaVarQc.ri()) != null) {
            long jAw = this.lr.ihz.aw();
            kaVarRi.di(jAw);
            kaVarRi.fi(jAw);
        }
        com.bytedance.sdk.openadsdk.ay.lr.fi.ri(this.lr.lr, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void srn() {
        toString();
        com.bytedance.sdk.openadsdk.ri.fi.ri riVar = this.nr;
        if (riVar != null) {
            riVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void ac() {
        com.bytedance.sdk.openadsdk.component.reward.view.ik ikVarRi;
        super.ac();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || (ikVarRi = riVar.ay.ri()) == null) {
            return;
        }
        ikVarRi.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.fi() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.fi
            public void ri() {
                TTRewardVideoActivity.this.srn();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void aw() {
        this.lr.oh.ri(null, TTAdDislikeToast.getSkipText());
        this.lr.oh.fi(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean ay() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void bu() {
        ig();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void di() {
        co coVar;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || (coVar = riVar.zk) == null) {
            return;
        }
        coVar.ka();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void dw() {
        this.bu = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void dzy() {
        ri(2);
    }

    public void fi(boolean z) {
        wjv wjvVar;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || (wjvVar = riVar.lr) == null) {
            return;
        }
        wjvVar.ik(z);
        co.ri(this.lr.lr, false, 3);
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.f18063co) {
            return;
        }
        su = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.lr != null) {
            com.bytedance.sdk.openadsdk.di.lr.ri().ri("videoForceBreak", this.lr.lr);
        }
        xha();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean fr() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void gcp() {
        srn();
        this.lr.lr.qx();
        this.lr.lr.ka(true);
        if (wjv.fi(this.lr.lr)) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
            wjv wjvVar = riVar.lr;
            com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, riVar.fi, wjvVar.hp());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout hcw() {
        return this.lr.dzy.di();
    }

    public void ig() {
        ri(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void ik() {
        final wjv wjvVar;
        super.ik();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || (wjvVar = riVar.lr) == null || wjvVar.jc()) {
            return;
        }
        this.lr.zk = new co(new co.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.co.ri
            public void ri(int i) {
                if (wjvVar.jc() || wjvVar.slm()) {
                    return;
                }
                TTRewardVideoActivity.this.ri(i);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public slm jbs() {
        return new slm(this.lr) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.slm
            public void ik() {
                TTRewardVideoActivity.this.finish();
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            public boolean lr() {
                wjv wjvVar;
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.xha;
                return (riVar == null || (wjvVar = riVar.lr) == null || !wjvVar.jc()) ? false : true;
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            public boolean ri() {
                wjv wjvVar;
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.xha;
                return (riVar == null || (wjvVar = riVar.lr) == null || !wjvVar.slm()) ? false : true;
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            public void ri(boolean z) {
                TTRewardVideoActivity.this.fi(z);
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            public void ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
                com.bytedance.sdk.openadsdk.common.ri.ri(riVar, new com.bytedance.sdk.openadsdk.common.ri.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.2.1
                    @Override // com.bytedance.sdk.openadsdk.common.ri.lr
                    public void ri(boolean z, int i) {
                        TTRewardVideoActivity.this.ri(z, i);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.ri.lr
                    public void ri() {
                        TTRewardVideoActivity.this.finish();
                    }
                });
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void ka() {
        com.bytedance.sdk.openadsdk.ri.fi.ri riVar = this.nr;
        if (riVar != null) {
            riVar.lr();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.lr;
            qt.ri(riVar2 != null ? riVar2.lr : null, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void nr() {
        com.bytedance.sdk.openadsdk.ri.fi.ri riVar = this.nr;
        if (riVar != null) {
            riVar.ri();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.lr;
            qt.ri(riVar2 != null ? riVar2.lr : null, C3700q2.v, 0);
        }
        if (su()) {
            this.lr.ay.aw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (tan == null) {
                tan = uq.ri(this, "tt_reward_msg");
                ac = uq.ri(this, "tt_msgPlayable");
                ihz = uq.ri(this, "tt_negtiveBtnBtnText");
                uq = uq.ri(this, "tt_postiveBtnText");
                wjv = uq.ri(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            ac.ik("TTAD.RVA", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        xha();
        ri(isFinishing(), isChangingConfigurations());
        if (this.f18063co) {
            return;
        }
        this.nr = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        co coVar;
        super.onPause();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || (coVar = riVar.zk) == null) {
            return;
        }
        coVar.ri();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        co coVar;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || (coVar = riVar.zk) == null) {
            return;
        }
        coVar.lr();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.f18063co) {
            su = this.nr;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ri(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void wjv() {
        final View viewQt = this.lr.dzy.qt();
        if (viewQt != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTRewardVideoActivity.this.lr.ory.ac() && TTRewardVideoActivity.this.lr.jbs.get()) {
                        boolean zAw = TTRewardVideoActivity.this.lr.hcw.aw();
                        TTRewardVideoActivity.this.lr.ory.di(zAw);
                        TTRewardVideoActivity.this.lr.dzy.di(8);
                        View view2 = viewQt;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.di.ka) {
                            ((com.bytedance.sdk.openadsdk.core.di.ka) view2).setImageResource(uq.ka(TTRewardVideoActivity.this.lr.srn, "tt_close_btn"));
                        }
                        TTRewardVideoActivity.this.lr.jc.sendEmptyMessageDelayed(600, 5000L);
                        if (!wjv.ik(TTRewardVideoActivity.this.lr.lr)) {
                            return;
                        }
                        if (wjv.ik(TTRewardVideoActivity.this.lr.lr) && zAw) {
                            return;
                        }
                    }
                    TTRewardVideoActivity.this.lr.ory.ihz();
                    TTRewardVideoActivity.this.lr.hcw.sf();
                    TTRewardVideoActivity.this.lr.su.di();
                    if (dw.ka(TTRewardVideoActivity.this.lr.lr)) {
                        TTRewardVideoActivity.this.ik(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            };
            viewQt.setOnClickListener(onClickListener);
            viewQt.setTag(viewQt.getId(), onClickListener);
        }
        this.lr.oh.ri(new com.bytedance.sdk.openadsdk.component.reward.top.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ik(View view) {
                View view2 = viewQt;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void lr(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.lr.zf.ri(tTRewardVideoActivity.ik);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ri(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.ik(dw.ik(tTRewardVideoActivity.lr.lr), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ri(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.ka kaVarQc;
                com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = TTRewardVideoActivity.this.lr;
                riVar.zyn = !riVar.zyn;
                StringBuilder sb = new StringBuilder("will set is Mute ");
                sb.append(TTRewardVideoActivity.this.lr.zyn);
                sb.append(" mLastVolume=");
                sb.append(TTRewardVideoActivity.this.lr.dw.ri());
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = TTRewardVideoActivity.this.lr;
                riVar2.ihz.ri(riVar2.zyn, str);
                if (!dw.slm(TTRewardVideoActivity.this.lr.lr) || TTRewardVideoActivity.this.lr.jbs.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar3 = TTRewardVideoActivity.this.lr;
                    riVar3.ory.fi(riVar3.zyn);
                    com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar4 = TTRewardVideoActivity.this.lr;
                    riVar4.wjv.lr(riVar4.zyn);
                    wjv wjvVar = TTRewardVideoActivity.this.lr.lr;
                    if (wjvVar == null || (kaVarQc = wjvVar.qc()) == null || (kaVarRi = kaVarQc.ri()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar5 = TTRewardVideoActivity.this.lr;
                    if (riVar5.zyn) {
                        kaVarRi.mj(riVar5.ihz.aw());
                    } else {
                        kaVarRi.jbs(riVar5.ihz.aw());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ka(View view) {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void xd() {
        srn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void zf() {
        ig();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void lr(boolean z, boolean z2) {
        this.slm = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void lr(int i) {
        if (i == 10000) {
            ig();
        }
    }

    public void lr(long j, long j2) {
        if (j2 <= 0) {
            return;
        }
        if (this.zf == -1) {
            this.zf = Math.min(100, this.lr.lr.zk());
        }
        if (((j / 1000.0f) / j2) * 100.0f >= this.zf) {
            ig();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik(final boolean z, boolean z2) {
        wjv wjvVar;
        wjv wjvVar2;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || (wjvVar = riVar.lr) == null) {
            return;
        }
        if (!z2 && wjvVar.slm() && this.lr.jbs.get() && dw.mj(this.lr.lr)) {
            this.lr.wjv.jbs();
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.nr.ka().mj(String.valueOf(this.lr.di))) {
            if (!z2 && this.lr.jbs.get() && dw.mj(this.lr.lr)) {
                this.lr.wjv.jbs();
                return;
            } else if (z) {
                finish();
                return;
            } else {
                qd();
                return;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.lr;
        if (riVar2 != null && (wjvVar2 = riVar2.lr) != null && wjvVar2.jc()) {
            if (this.lr.jbs.get() && dw.mj(this.lr.lr)) {
                this.lr.wjv.jbs();
                return;
            } else if (z) {
                finish();
                return;
            } else {
                qd();
                return;
            }
        }
        if (dw.mj(this.lr.lr) && this.lr.ory.mj().getVisibility() == 0) {
            this.lr.wjv.jbs();
            return;
        }
        this.lr.bu.set(true);
        this.lr.ihz.uq();
        if (z) {
            this.lr.wjv.di();
        }
        final com.bytedance.sdk.openadsdk.core.widget.lr lrVar = new com.bytedance.sdk.openadsdk.core.widget.lr(this);
        this.ik.f18093co = lrVar;
        if (z) {
            lrVar.ri(ac).lr(wjv).ik(ihz);
        } else {
            lrVar.ri(tan).lr(uq).ik(ihz);
        }
        this.ik.f18093co.ri(new com.bytedance.sdk.openadsdk.core.widget.lr.InterfaceC0262lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.lr.InterfaceC0262lr
            public void lr() {
                lrVar.dismiss();
                TTRewardVideoActivity.this.fi(true);
                TTRewardVideoActivity.this.lr.bu.set(false);
                TTRewardVideoActivity.this.lr.wjv.lr(Integer.MAX_VALUE);
                if (!z || !dw.di(TTRewardVideoActivity.this.lr.lr)) {
                    TTRewardVideoActivity.this.qd();
                } else if (dw.mj(TTRewardVideoActivity.this.lr.lr)) {
                    TTRewardVideoActivity.this.lr.wjv.jbs();
                } else {
                    TTRewardVideoActivity.this.lr.su.di();
                    TTRewardVideoActivity.this.finish();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.lr.InterfaceC0262lr
            public void ri() {
                TTRewardVideoActivity.this.lr.ihz.ihz();
                if (z) {
                    TTRewardVideoActivity.this.lr.wjv.ri(1000);
                }
                lrVar.dismiss();
                TTRewardVideoActivity.this.lr.bu.set(false);
            }
        }).show();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ri(Bundle bundle) {
        if (this.f18063co) {
            super.ri(bundle);
            this.nr = (com.bytedance.sdk.openadsdk.ri.fi.ri) com.bytedance.sdk.openadsdk.core.dw.ri().ri(this.qt, com.bytedance.sdk.openadsdk.ri.fi.ri.class);
        } else {
            com.bytedance.sdk.openadsdk.ri.fi.ri riVarLr = com.bytedance.sdk.openadsdk.core.dw.ri().lr();
            this.nr = riVarLr;
            if (riVarLr == null && bundle != null) {
                this.nr = su;
                su = null;
            }
        }
        Objects.toString(this.nr);
        Objects.toString(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void lr(boolean z) {
        if (z) {
            ig();
            return;
        }
        if ((1.0d - (((double) this.fi) / this.lr.ihz.qd())) * 100.0d >= com.bytedance.sdk.openadsdk.core.nr.ka().su(String.valueOf(this.lr.di)).di) {
            ig();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void ri(Intent intent) {
        super.ri(intent);
        this.ay = intent.getStringExtra("media_extra");
        this.fr = intent.getStringExtra("user_id");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void ri(long j, long j2) {
        int i = (int) (j / 1000);
        int iPlm = this.lr.lr.plm();
        boolean z = iPlm >= 0;
        ik(j, j2);
        if (this.fi > 0) {
            this.lr.oh.ka(true);
            if (z && i >= iPlm) {
                this.lr.ri(true);
                this.lr.oh.ri(String.valueOf(this.fi), TTAdDislikeToast.getSkipText());
                this.lr.oh.fi(true);
                return;
            }
            this.lr.oh.ri(String.valueOf(this.fi), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(final boolean z, final int i, final String str, final int i2, final String str2, final int i3) {
        toString();
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.7
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.ri.fi.ri riVar = TTRewardVideoActivity.this.nr;
                if (riVar != null) {
                    riVar.ri(z, i, str, i2, str2);
                    co.ri(TTRewardVideoActivity.this.lr.lr, z, i3);
                }
            }
        });
    }

    public void ri(final int i) {
        wjv wjvVar;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || (wjvVar = riVar.lr) == null || wjvVar.jc() || this.lr.lr.slm()) {
            return;
        }
        this.lr.lr.jbs(true);
        co coVar = this.lr.zk;
        if (coVar != null) {
            coVar.ik();
        }
        if (com.bytedance.sdk.openadsdk.core.nr.ka().slm(String.valueOf(this.lr.di))) {
            ri(true, this.lr.lr.pc(), this.lr.lr.saa(), 0, "", i);
        } else {
            com.bytedance.sdk.openadsdk.core.nr.ik().ri(jc(), new com.bytedance.sdk.openadsdk.core.wjv.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.wjv.lr
                public void ri(int i2, String str) {
                    TTRewardVideoActivity.this.ri(false, 0, "", i2, str, i);
                }

                @Override // com.bytedance.sdk.openadsdk.core.wjv.lr
                public void ri(ay.lr lrVar) {
                    boolean z = lrVar.lr;
                    TTRewardVideoActivity.this.ri(lrVar.lr, lrVar.ik.ri(), lrVar.ik.lr(), 0, "", i);
                }
            });
        }
    }

    public void ik(long j, long j2) {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        boolean z = false;
        if (riVar != null) {
            if (riVar.lr.zk() >= 0 && this.lr.lr.jva() >= 0) {
                z = true;
            }
            if (z) {
                j2 = this.lr.lr.jva();
            }
        }
        long j3 = j + (((long) this.lr.fe) * 1000);
        if (z) {
            lr(j3, j2);
            return;
        }
        if (this.zf == -1) {
            this.zf = com.bytedance.sdk.openadsdk.core.nr.ka().su(String.valueOf(this.lr.di)).di;
        }
        if (j2 <= 0) {
            return;
        }
        if (j2 >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL && j3 >= 27000) {
            ig();
        } else if ((j3 * 100) / j2 >= this.zf) {
            ig();
        }
    }
}
