package com.bytedance.sdk.openadsdk.component.reward.ud;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.fs;
import com.bytedance.sdk.openadsdk.component.reward.view.tvp;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;
import com.bytedance.sdk.openadsdk.utils.rdp;

/* JADX INFO: loaded from: classes3.dex */
public class mml extends ud {
    public mml(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        super(qdlVar);
    }

    private static ImageView lnr(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        mmlVar.setScaleType(ImageView.ScaleType.FIT_XY);
        mmlVar.setImageResource(ljh.mml(context, "tt_up_slide"));
        mmlVar.setId(jtx.oth);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ax.ud(context, 18.0f), ax.ud(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = ax.ud(context, 45.0f);
        mmlVar.setLayoutParams(layoutParams);
        return mmlVar;
    }

    public static boolean qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        return aaj.ud(ljhVar) || aaj.mml(ljhVar) || aaj.wd(ljhVar);
    }

    private static LinearLayout ud(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setId(jtx.jyq);
        mzzVar.setOrientation(1);
        mzzVar.setVisibility(8);
        mzzVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return mzzVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public void exu() {
        fs fsVar;
        aaj aajVar;
        if (aaj.ud(this.qdl.ud) && (fsVar = this.qdl.gy) != null && (aajVar = fsVar.bjy) != null) {
            if (aajVar.mml()) {
                this.qdl.gy.ud(0);
                this.qdl.jtx.set(true);
            } else {
                this.qdl.yt.set(true);
                qdl(true, false, true, 80);
            }
        }
        if (aaj.mml(this.qdl.ud) || aaj.wd(this.qdl.ud)) {
            qdl(true, false, true, 70);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public RFEndCardBackUpLayout jpc() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public boolean mo() {
        if (aaj.ud(this.qdl.ud)) {
            return true;
        }
        return (aaj.mml(this.qdl.ud) || aaj.wd(this.qdl.ud)) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public boolean mzz() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public void wd() {
    }

    public static void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        if (aaj.ud(ljhVar)) {
            qdl(frameLayout, ljhVar);
        } else if (aaj.mml(ljhVar) || aaj.wd(ljhVar)) {
            ud(frameLayout, ljhVar);
        } else {
            ud.qdl(frameLayout, qdlVar);
        }
    }

    public static void ud(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        lnrVar.setId(jtx.exc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = ax.ud(yt.qdl(), 58.0f);
        frameLayout.addView(lnrVar, layoutParams);
        lnrVar.addView(qdl(context, ljhVar));
        LinearLayout linearLayoutUd = ud(context);
        linearLayoutUd.setBackgroundColor(Color.parseColor("#99161823"));
        lnrVar.addView(linearLayoutUd);
        linearLayoutUd.addView(lnr(context));
        com.bytedance.sdk.openadsdk.component.reward.view.mo.qdl(lnrVar, ljhVar);
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar2 = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        lnrVar2.setId(jtx.ekw);
        frameLayout.addView(lnrVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar3 = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        lnrVar3.setId(jtx.to);
        lnrVar2.addView(lnrVar3, new FrameLayout.LayoutParams(-1, -1));
        lnrVar3.addView(ud.qdl(context));
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar4 = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        lnrVar4.setId(jtx.yt);
        lnrVar4.setVisibility(8);
        lnrVar4.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        lnrVar3.addView(lnrVar4, layoutParams2);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        mmlVar.setId(jtx.jl);
        mmlVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        lnrVar4.addView(mmlVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.mo.qdl(lnrVar2);
    }

    public static void qdl(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setOrientation(1);
        frameLayout.addView(mzzVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        lnrVar.setId(jtx.ekw);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        mzzVar.addView(lnrVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar2 = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        lnrVar2.setId(jtx.to);
        lnrVar.addView(lnrVar2, new FrameLayout.LayoutParams(-1, -1));
        lnrVar2.addView(ud.qdl(context));
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar3 = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        lnrVar3.setId(jtx.yt);
        lnrVar3.setVisibility(8);
        lnrVar3.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        lnrVar2.addView(lnrVar3, layoutParams2);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        mmlVar.setId(jtx.jl);
        mmlVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        lnrVar3.addView(mmlVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.mo.qdl(lnrVar);
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar4 = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        lnrVar4.setId(jtx.exc);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 0.0f;
        mzzVar.addView(lnrVar4, layoutParams3);
        lnrVar4.addView(qdl(context, ljhVar));
        LinearLayout linearLayoutUd = ud(context);
        linearLayoutUd.setBackgroundColor(Color.parseColor("#70161823"));
        lnrVar4.addView(linearLayoutUd);
        linearLayoutUd.addView(lnr(context));
        com.bytedance.sdk.openadsdk.component.reward.view.mo.qdl(lnrVar4, ljhVar);
    }

    public static com.bytedance.sdk.component.tvp.mo qdl(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        com.bytedance.sdk.component.tvp.mo moVarUd = com.bytedance.sdk.openadsdk.exu.qdl.qdl().ud(ljhVar);
        if (moVarUd != null) {
            moVarUd.setLpPreRender(true);
            ViewGroup viewGroup = (ViewGroup) moVarUd.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(moVarUd);
            }
        } else {
            moVarUd = new com.bytedance.sdk.component.tvp.mo(context, true, com.bytedance.sdk.component.tvp.mo.lnr.LANDING_PAGE_LOADING);
            moVarUd.setLayerType(2, null);
        }
        ax.qdl((View) moVarUd, 0);
        moVarUd.setId(jtx.aaj);
        moVarUd.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return moVarUd;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public void qdl(tvp tvpVar) {
        qdl(this.ud, tvpVar, this.qdl);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public void qdl(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar;
        rdp rdpVar;
        if (!aaj.mml(this.qdl.ud) || this.qdl.ud.ax() || (rdpVar = (qdlVar = this.qdl).kab) == null) {
            return;
        }
        rdpVar.qdl(qdlVar.ud.aaj().ud() * 1000);
    }
}
