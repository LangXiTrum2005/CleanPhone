package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp.aaj;
import com.bytedance.sdk.openadsdk.core.tvp.jpc;
import com.bytedance.sdk.openadsdk.core.tvp.tvp;
import com.p004ironsource.d9;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends lnr {
    private boolean bjy;
    private final com.bytedance.sdk.openadsdk.component.mo.ud exu;
    private com.bytedance.sdk.openadsdk.component.tvp.wd jtx;
    private com.bytedance.sdk.openadsdk.component.tvp.ud rdp;

    public ud(Activity activity, ljh ljhVar, FrameLayout frameLayout, qdl qdlVar, int i2, boolean z2, com.bytedance.sdk.openadsdk.component.jpc.qdl qdlVar2, com.bytedance.sdk.openadsdk.component.mo.ud udVar) {
        super(activity, ljhVar, frameLayout, qdlVar, i2, z2, qdlVar2);
        this.exu = udVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.lnr
    public void mzz() {
        com.bytedance.sdk.openadsdk.component.tvp.ud udVar = this.rdp;
        if (udVar != null) {
            udVar.jl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.lnr
    public void lnr() {
        super.lnr();
        com.bytedance.sdk.openadsdk.component.tvp.ud udVar = this.rdp;
        if (udVar != null) {
            udVar.fs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.lnr
    public int mml() {
        return this.rdp.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.lnr
    public void ud() {
        this.rdp.exc();
    }

    @Override // com.bytedance.sdk.openadsdk.component.lnr
    public void qdl(ViewGroup viewGroup) {
        Pair<Float, Float> pairQdl = com.bytedance.sdk.openadsdk.core.tvp.qdl.qdl.qdl(this.qdl.getWindow(), this.wd);
        com.bytedance.sdk.openadsdk.component.tvp.ud udVar = new com.bytedance.sdk.openadsdk.component.tvp.ud(this.qdl, this.ud, new AdSlot.Builder().setCodeId(String.valueOf(this.ud.fz())).setExpressViewAcceptedSize(((Float) pairQdl.first).floatValue(), ((Float) pairQdl.second).floatValue()).build(), "open_ad", this.mzz, this.exu, this.fs);
        this.rdp = udVar;
        udVar.setTopListener(this.mzz);
        this.rdp.setExpressVideoListenerProxy(this.mzz);
        this.rdp.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.ud.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i2) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i2) {
                ud.this.mzz.mml();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                if (ud.this.rdp.jyq()) {
                    ud.this.bjy = true;
                    if (ud.this.jtx != null) {
                        ud udVar2 = ud.this;
                        if (udVar2.mml == udVar2.jtx.getParent()) {
                            ud udVar3 = ud.this;
                            udVar3.mml.removeView(udVar3.jtx);
                        }
                    }
                    ud udVar4 = ud.this;
                    ud.super.qdl((ViewGroup) udVar4.mml);
                    ud.super.qdl();
                    ud.super.ud();
                    return;
                }
                if (ud.this.ud.xmv()) {
                    ud.this.mzz.lnr();
                    return;
                }
                ud udVar5 = ud.this;
                if (!udVar5.lnr) {
                    udVar5.mzz.lnr();
                } else if (!udVar5.qdl(udVar5.rdp.getVideoFrameLayout())) {
                    ud.this.mzz.mml();
                } else {
                    ud.this.rdp.setVideoManager(ud.this.wd());
                    ud.this.mzz.lnr();
                }
            }
        });
        this.ud.bjy(1);
        this.mml.addView(this.rdp, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.tvp.wd wdVar = new com.bytedance.sdk.openadsdk.component.tvp.wd(this.qdl);
        this.jtx = wdVar;
        this.mml.addView(wdVar);
        this.tvp = this.jtx.getTopDislike();
        this.to = this.jtx.getTopSkip();
        this.rq = this.jtx.getTopCountDown();
    }

    @Override // com.bytedance.sdk.openadsdk.component.lnr
    public void qdl() {
        tvp tvpVarQdl = com.bytedance.sdk.openadsdk.component.qdl.ud.qdl(this.ud, this.qdl, this.fs, this.rdp);
        tvpVarQdl.qdl(new com.bytedance.sdk.openadsdk.core.lnr.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.component.ud.2
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud.qdl
            public void qdl(View view, int i2) {
                ud.this.mzz.mzz();
            }
        });
        this.rdp.setClickListener(tvpVarQdl);
        jpc jpcVarUd = com.bytedance.sdk.openadsdk.component.qdl.ud.ud(this.ud, this.qdl, this.fs, this.rdp);
        this.rdp.setClickCreativeListener(jpcVarUd);
        jpcVarUd.qdl(new com.bytedance.sdk.openadsdk.core.lnr.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.component.ud.3
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud.qdl
            public void qdl(View view, int i2) {
                ud.this.mzz.mzz();
            }
        });
        super.mo();
        this.rdp.setBackupListener(new com.bytedance.sdk.component.adexpress.ud.lnr() { // from class: com.bytedance.sdk.openadsdk.component.ud.4
            @Override // com.bytedance.sdk.component.adexpress.ud.lnr
            public boolean qdl(ViewGroup viewGroup, int i2) {
                StringBuilder sb = new StringBuilder("isUseBackup() called with: view = [");
                sb.append(viewGroup);
                sb.append("], errCode = [");
                sb.append(i2);
                sb.append(d9.i.f24752e);
                try {
                    ((aaj) viewGroup).aaj();
                    new com.bytedance.sdk.openadsdk.component.tvp.qdl(ud.this.qdl).qdl((aaj) ud.this.rdp);
                    return true;
                } catch (Exception e2) {
                    Log.e("AppOpenAdExpressManager", "", e2);
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.lnr
    public void qdl(int i2, boolean z2) {
        super.qdl(i2, z2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.lnr
    public JSONObject qdl(JSONObject jSONObject) {
        return this.rdp.qdl(jSONObject, this.ud);
    }

    public void qdl(long j, long j2) {
        com.bytedance.sdk.openadsdk.component.tvp.ud udVar = this.rdp;
        if (udVar != null) {
            udVar.qdl(j, j2);
        }
    }
}
