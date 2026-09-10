package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp.bjy;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class to {
    private final String jpc;
    private final Activity mo;
    com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo qdl;
    private boolean rq;
    private com.bytedance.sdk.openadsdk.component.reward.qdl.qdl to;
    private mml tvp;
    Handler ud;
    private final ljh wd;
    boolean lnr = false;
    boolean mml = false;
    boolean mzz = false;

    public to(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.to = qdlVar;
        this.mo = qdlVar.ag;
        this.wd = qdlVar.ud;
        this.jpc = qdlVar.mzz;
    }

    public void bjy() {
        if (ljh.mzz(this.wd) && this.wd.fzn() == 3 && this.wd.gg() == 0) {
            try {
                if (this.wd.jb() == 1) {
                    int iUd = ax.ud(yt.qdl(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.tvp.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = iUd;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void exu() {
        mml mmlVar = this.tvp;
        if (mmlVar == null) {
            return;
        }
        mmlVar.jl();
    }

    public boolean fs() {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            return mmlVar.koa instanceof com.bytedance.sdk.component.adexpress.mzz.qdl;
        }
        return false;
    }

    public void jpc() {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            mmlVar.rq();
        }
    }

    public boolean lnr() {
        return this.lnr;
    }

    public boolean mml() {
        return this.mml;
    }

    public void mo() {
        if (this.rq) {
            return;
        }
        this.rq = true;
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            mmlVar.fs();
        }
        Handler handler = this.ud;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public Handler mzz() {
        if (this.ud == null) {
            this.ud = new Handler(Looper.getMainLooper());
        }
        return this.ud;
    }

    public void qdl(AdSlot adSlot, aaj aajVar) {
        if (this.mzz) {
            return;
        }
        this.mzz = true;
        mml mmlVar = new mml(this.to, adSlot, this.jpc);
        this.tvp = mmlVar;
        aajVar.qdl(mmlVar, mmlVar.getVideoFrameLayout());
    }

    public void rdp() {
        mml mmlVar = this.tvp;
        if (mmlVar == null) {
            return;
        }
        mmlVar.exc();
        this.tvp.to();
    }

    public int rq() {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            return mmlVar.getDynamicShowType();
        }
        return 0;
    }

    public boolean to() {
        mml mmlVar = this.tvp;
        return mmlVar != null && mmlVar.ljh();
    }

    public boolean tvp() {
        mml mmlVar = this.tvp;
        if (mmlVar == null) {
            return false;
        }
        return mmlVar.jyq();
    }

    public FrameLayout ud() {
        mml mmlVar = this.tvp;
        if (mmlVar == null) {
            return null;
        }
        FrameLayout videoFrameLayout = mmlVar.getVideoFrameLayout();
        if (this.tvp.jyq()) {
            bjy();
        }
        return videoFrameLayout;
    }

    public void wd() {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            mmlVar.to();
        }
    }

    public mml qdl() {
        return this.tvp;
    }

    public void ud(boolean z2) {
        this.mml = z2;
    }

    private com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo ud(ljh ljhVar) {
        if (ljhVar.ygv() == 4) {
            return com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd.qdl(this.mo, this.jpc);
        }
        return null;
    }

    public void qdl(boolean z2) {
        this.lnr = z2;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.tvp.tvp tvpVar, com.bytedance.sdk.openadsdk.core.tvp.jpc jpcVar) {
        ljh ljhVar;
        if (this.tvp == null || (ljhVar = this.wd) == null) {
            return;
        }
        this.qdl = ud(ljhVar);
        tvpVar.qdl(this.tvp);
        tvpVar.qdl(this.qdl);
        this.tvp.setClickListener(tvpVar);
        jpcVar.qdl((View) this.tvp);
        jpcVar.qdl(this.qdl);
        this.tvp.setClickCreativeListener(jpcVar);
    }

    public void qdl(bjy bjyVar) {
        mml mmlVar = this.tvp;
        if (mmlVar == null) {
            return;
        }
        mmlVar.setExpressVideoListenerProxy(bjyVar);
    }

    public void qdl(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        mml mmlVar = this.tvp;
        if (mmlVar == null) {
            return;
        }
        mmlVar.setExpressInteractionListener(pAGExpressAdWrapperListener);
    }

    public JSONObject qdl(JSONObject jSONObject) {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            return mmlVar.qdl(jSONObject, this.to.ud);
        }
        return null;
    }

    public void qdl(int i2, boolean z2) {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            mmlVar.qdl(i2, z2, false);
        }
    }

    public void qdl(int i2, String str) {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            mmlVar.ud(i2, str);
        }
    }

    public void qdl(ljh ljhVar) {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            AdSlot adSlotJi = ljhVar.ji();
            String strMzz = ljhVar.mzz();
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.to;
            mmlVar.qdl(ljhVar, adSlotJi, strMzz, qdlVar.gt, !qdlVar.ra);
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.to = qdlVar;
    }
}
