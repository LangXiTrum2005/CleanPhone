package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.slm;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.zf;
import com.bytedance.sdk.openadsdk.ka.fi.lr.vr;
import com.bytedance.sdk.openadsdk.ka.qt;
import com.ironsource.C3700q2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.ri.ik.lr bu;
    private boolean nr;
    private com.bytedance.sdk.openadsdk.ri.ik.lr slm;

    /* JADX INFO: Access modifiers changed from: private */
    public void ig() {
        toString();
        com.bytedance.sdk.openadsdk.ri.ik.lr lrVar = this.slm;
        if (lrVar != null) {
            lrVar.onAdClicked();
        }
    }

    private void ik(int i) {
        this.lr.oh.ri(null, String.format(uq.ri(nr.ri(), "tt_skip_ad_time_text"), Integer.valueOf(i)));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void ac() {
        com.bytedance.sdk.openadsdk.component.reward.view.ik ikVarRi;
        super.ac();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || (ikVarRi = riVar.ay.ri()) == null) {
            return;
        }
        ikVarRi.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.fi() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.fi
            public void ri() {
                TTFullScreenVideoActivity.this.ig();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void aw() {
        if (wjv.fi(this.lr.lr)) {
            this.lr.oh.ri(null, TTAdDislikeToast.getSkipText());
        } else {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
            if (riVar.ik) {
                this.lr.oh.ri(null, TTAdDislikeToast.getSkipText());
            } else {
                riVar.oh.ri(null, "X");
            }
        }
        this.lr.oh.fi(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean ay() {
        return false;
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.f18063co) {
            return;
        }
        bu = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.lr != null) {
            com.bytedance.sdk.openadsdk.di.lr.ri().ri("videoForceBreak", this.lr.lr);
        }
        try {
            xha();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean fr() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void gcp() {
        ig();
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

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public slm jbs() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void ka() {
        toString();
        com.bytedance.sdk.openadsdk.ri.ik.lr lrVar = this.slm;
        if (lrVar != null) {
            lrVar.lr();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
            qt.ri(riVar != null ? riVar.lr : null, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void lr(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void nr() {
        com.bytedance.sdk.openadsdk.ri.ik.lr lrVar = this.slm;
        if (lrVar != null) {
            lrVar.ri();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
            qt.ri(riVar != null ? riVar.lr : null, C3700q2.v, 0);
        }
        if (su()) {
            this.lr.ay.aw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || wjv.fi(riVar.lr)) {
            return;
        }
        com.bykv.vk.openvk.ri.ri.ri.ik.attabal attabalVarEu = this.lr.lr.eu();
        if (attabalVarEu == null) {
            com.bykv.vk.openvk.ri.ri.ri.ik.attabal attabalVar = new com.bykv.vk.openvk.ri.ri.ri.ik.attabal();
            attabalVar.oilcan(10.0d);
            this.lr.lr.ri(attabalVar);
        } else if (attabalVarEu.beachfront() <= 0.0d) {
            attabalVarEu.oilcan(10.0d);
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
        this.slm = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.f18063co) {
            bu = this.slm;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || !lr(riVar.lr) || ri(this.lr.lr)) {
            return;
        }
        if (this.nr) {
            this.nr = false;
            finish();
        } else if (this.lr.ory.su()) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ri(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void wjv() {
        final View viewQt = this.lr.dzy.qt();
        if (viewQt != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTFullScreenVideoActivity.this.lr.ory.ac() && TTFullScreenVideoActivity.this.lr.jbs.get()) {
                        boolean zAw = TTFullScreenVideoActivity.this.lr.hcw.aw();
                        TTFullScreenVideoActivity.this.lr.ory.di(zAw);
                        TTFullScreenVideoActivity.this.lr.dzy.di(8);
                        View view2 = viewQt;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.di.ka) {
                            ((com.bytedance.sdk.openadsdk.core.di.ka) view2).setImageResource(uq.ka(TTFullScreenVideoActivity.this.lr.srn, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.lr.jc.sendEmptyMessageDelayed(600, 5000L);
                        if (!wjv.ik(TTFullScreenVideoActivity.this.lr.lr)) {
                            return;
                        }
                        if (wjv.ik(TTFullScreenVideoActivity.this.lr.lr) && zAw) {
                            return;
                        }
                    }
                    TTFullScreenVideoActivity.this.lr.ory.ihz();
                    TTFullScreenVideoActivity.this.lr.hcw.sf();
                    TTFullScreenVideoActivity.this.lr.su.di();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            viewQt.setOnClickListener(onClickListener);
            viewQt.setTag(viewQt.getId(), onClickListener);
        }
        this.lr.oh.ri(new com.bytedance.sdk.openadsdk.component.reward.top.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ik(View view) {
                View view2 = viewQt;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void lr(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.lr.zf.ri(tTFullScreenVideoActivity.ik);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ri(View view) {
                com.bytedance.sdk.openadsdk.core.model.ka kaVarQc;
                com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
                com.bytedance.sdk.openadsdk.component.reward.view.ik ikVarRi;
                if (dw.di(TTFullScreenVideoActivity.this.lr.lr) || (dw.fi(TTFullScreenVideoActivity.this.lr.lr) && TTFullScreenVideoActivity.this.lr.wjv.ka(com.bytedance.sdk.openadsdk.component.reward.ri.mj.lr))) {
                    if (dw.mj(TTFullScreenVideoActivity.this.lr.lr)) {
                        TTFullScreenVideoActivity.this.lr.wjv.jbs();
                        return;
                    }
                    View view2 = viewQt;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                        return;
                    }
                }
                if (ac.ri(TTFullScreenVideoActivity.this.lr.lr) && !TTFullScreenVideoActivity.this.lr.aw.get()) {
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                vr.ri riVar = new vr.ri();
                riVar.lr(TTFullScreenVideoActivity.this.lr.ihz.aw());
                riVar.ka(TTFullScreenVideoActivity.this.lr.ihz.su());
                riVar.ik(TTFullScreenVideoActivity.this.lr.ihz.bu());
                riVar.ik(3);
                riVar.ka(TTFullScreenVideoActivity.this.lr.ihz.fr());
                riVar.ri(TTFullScreenVideoActivity.this.lr.ihz.lr());
                com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(TTFullScreenVideoActivity.this.lr.ihz.mj(), riVar, TTFullScreenVideoActivity.this.lr.ihz.fi());
                zf.ik(TTFullScreenVideoActivity.this.lr.di);
                TTFullScreenVideoActivity.this.lr.ihz.ri("skip", false);
                TTFullScreenVideoActivity.this.lr.oh.ka(false);
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = TTFullScreenVideoActivity.this.lr;
                if (!riVar2.ik || (ac.ik(riVar2.lr) && (ikVarRi = TTFullScreenVideoActivity.this.lr.ay.ri()) != null && ikVarRi.ka == 0)) {
                    TTFullScreenVideoActivity.this.finish();
                } else {
                    TTFullScreenVideoActivity.this.ri(true, 4);
                }
                wjv wjvVar = TTFullScreenVideoActivity.this.lr.lr;
                if (wjvVar != null && (kaVarQc = wjvVar.qc()) != null && (kaVarRi = kaVarQc.ri()) != null) {
                    kaVarRi.di(TTFullScreenVideoActivity.this.lr.ihz.aw());
                    kaVarRi.fi(TTFullScreenVideoActivity.this.lr.ihz.aw());
                }
                com.bytedance.sdk.openadsdk.ay.lr.fi.ri(TTFullScreenVideoActivity.this.lr.lr, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ka(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ri(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.ka kaVarQc;
                com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = TTFullScreenVideoActivity.this.lr;
                boolean z = !riVar.zyn;
                riVar.zyn = z;
                riVar.ihz.ri(z, str);
                if (!dw.slm(TTFullScreenVideoActivity.this.lr.lr) || TTFullScreenVideoActivity.this.lr.jbs.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = TTFullScreenVideoActivity.this.lr;
                    riVar2.ory.fi(riVar2.zyn);
                    com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar3 = TTFullScreenVideoActivity.this.lr;
                    riVar3.wjv.lr(riVar3.zyn);
                    wjv wjvVar = TTFullScreenVideoActivity.this.lr.lr;
                    if (wjvVar == null || (kaVarQc = wjvVar.qc()) == null || (kaVarRi = kaVarQc.ri()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar4 = TTFullScreenVideoActivity.this.lr;
                    if (riVar4.zyn) {
                        kaVarRi.mj(riVar4.ihz.aw());
                    } else {
                        kaVarRi.jbs(riVar4.ihz.aw());
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void xd() {
        if (this.lr.lr.gz() != 100.0f) {
            this.nr = true;
        }
        ig();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void lr(boolean z) {
    }

    private boolean lr(wjv wjvVar) {
        if (wjvVar == null) {
            return false;
        }
        return nr.ka().ac(String.valueOf(this.lr.di));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void ri(Intent intent) {
        super.ri(intent);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ri(Bundle bundle) {
        if (this.f18063co) {
            super.ri(bundle);
            this.slm = (com.bytedance.sdk.openadsdk.ri.ik.lr) com.bytedance.sdk.openadsdk.core.dw.ri().ri(this.qt, com.bytedance.sdk.openadsdk.ri.ik.lr.class);
            return;
        }
        com.bytedance.sdk.openadsdk.ri.ik.lr lrVarIk = com.bytedance.sdk.openadsdk.core.dw.ri().ik();
        this.slm = lrVarIk;
        if (lrVarIk != null || bundle == null) {
            return;
        }
        this.slm = bu;
        bu = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void ri(long j, long j2) {
        ri((int) (j / 1000));
        int i = this.fi;
        if (i >= 0) {
            this.lr.oh.ri(String.valueOf(i), null);
        }
    }

    public void ri(int i) {
        int iMhp = this.lr.lr.mhp();
        if (!nr.ka().di(String.valueOf(this.lr.di)) || (!wjv.fi(this.lr.lr) && !this.lr.ik)) {
            if (i >= iMhp) {
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
                if (!riVar.qh) {
                    riVar.ri(true);
                }
                aw();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.lr;
        if (!riVar2.qh) {
            riVar2.ri(true);
        }
        if (i <= iMhp) {
            ik(iMhp - i);
            this.lr.oh.fi(false);
        } else {
            aw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void di() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void dzy() {
    }

    private boolean ri(wjv wjvVar) {
        return wjvVar == null || wjvVar.gz() == 100.0f;
    }
}
