package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.jl;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.jtx;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class lnr extends com.bytedance.sdk.openadsdk.core.tvp.qdl {
    private com.bytedance.sdk.openadsdk.core.lnr.mzz aaj;
    private int bjy;
    private FrameLayout exc;
    private boolean exu;
    private View jl;
    private int jtx;
    private float qdl;
    private int rdp;
    private View yt;

    public lnr(Context context, String str) {
        super(context, str);
        this.jtx = 1;
        this.ud = context;
    }

    private void exu() {
        com.bytedance.sdk.openadsdk.rdp.tvp tvpVar = new com.bytedance.sdk.openadsdk.rdp.tvp(this.ud);
        this.yt = tvpVar;
        ud(tvpVar);
        mml();
        mo();
    }

    private void fs() {
        com.bytedance.sdk.openadsdk.rdp.wd wdVar = new com.bytedance.sdk.openadsdk.rdp.wd(this.ud);
        this.yt = wdVar;
        ud(wdVar);
        mml();
    }

    private float getHeightDp() {
        return ax.lnr(this.ud, ax.fs(this.ud));
    }

    private float getWidthDp() {
        return ax.lnr(this.ud, ax.exu(this.ud));
    }

    private void jpc() {
        com.bytedance.sdk.openadsdk.rdp.mml mmlVar = new com.bytedance.sdk.openadsdk.rdp.mml(this.ud);
        this.yt = mmlVar;
        ud(mmlVar);
        mml();
    }

    private void rq() {
        View mzzVar = new com.bytedance.sdk.openadsdk.rdp.mzz(this.ud);
        this.yt = mzzVar;
        ud(mzzVar);
        this.exc = (FrameLayout) this.yt.findViewById(jtx.lme);
        ImageView imageView = (ImageView) this.yt.findViewById(jtx.kr);
        TextView textView = (TextView) this.yt.findViewById(jtx.xx);
        View viewFindViewById = this.yt.findViewById(520093739);
        qdl(this.exc, imageView);
        textView.setText(getDescription());
        lnr(this.exc);
        lnr(imageView);
        lnr(textView);
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.lnr);
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lnr.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.qdl(((com.bytedance.sdk.openadsdk.core.tvp.qdl) lnr.this).ud, ((com.bytedance.sdk.openadsdk.core.tvp.qdl) lnr.this).lnr, ((com.bytedance.sdk.openadsdk.core.tvp.qdl) lnr.this).mo);
                } catch (Throwable th) {
                    aaj.lnr("FullInteractionStyleView", th.getMessage());
                }
            }
        });
    }

    private void to() {
        com.bytedance.sdk.openadsdk.rdp.jpc jpcVar = new com.bytedance.sdk.openadsdk.rdp.jpc(this.ud);
        this.yt = jpcVar;
        ud(jpcVar);
        mml();
    }

    private void tvp() {
        com.bytedance.sdk.openadsdk.rdp.mo moVar = new com.bytedance.sdk.openadsdk.rdp.mo(this.ud);
        this.yt = moVar;
        ud(moVar);
        mml();
        mo();
    }

    private void wd() {
        com.bytedance.sdk.openadsdk.rdp.ud udVar = new com.bytedance.sdk.openadsdk.rdp.ud(this.ud);
        this.yt = udVar;
        ud(udVar);
        mml();
        mo();
    }

    public View getInteractionStyleRootView() {
        return this;
    }

    public FrameLayout getVideoContainer() {
        return this.exc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.qdl
    public void qdl(View view, int i2, com.bytedance.sdk.openadsdk.core.model.jtx jtxVar) {
    }

    public void setDownloadListener(com.bytedance.sdk.openadsdk.core.lnr.mzz mzzVar) {
        this.aaj = mzzVar;
    }

    public void setIsMute(boolean z2) {
        this.exu = z2;
        View view = this.jl;
        if (view != null && (view instanceof com.bytedance.sdk.openadsdk.core.exu.ud.mo)) {
            ((com.bytedance.sdk.openadsdk.core.exu.ud.mo) view).qdl(z2, "interactionStyle");
        }
    }

    private void lnr() {
        com.bytedance.sdk.openadsdk.rdp.qdl qdlVar = new com.bytedance.sdk.openadsdk.rdp.qdl(this.ud);
        this.yt = qdlVar;
        ud(qdlVar);
        mml();
        mo();
    }

    private void mml() {
        this.exc = (FrameLayout) this.yt.findViewById(jtx.lme);
        ImageView imageView = (ImageView) this.yt.findViewById(jtx.iw);
        yt ytVar = (yt) this.yt.findViewById(jtx.bx);
        TextView textView = (TextView) this.yt.findViewById(jtx.xdk);
        TextView textView2 = (TextView) this.yt.findViewById(jtx.jut);
        View viewFindViewById = this.yt.findViewById(520093739);
        if (!TextUtils.isEmpty(this.lnr.uvi())) {
            textView2.setText(this.lnr.uvi());
        }
        qdl(this.exc, imageView);
        if (this.lnr.hcs() != null && !TextUtils.isEmpty(this.lnr.hcs().qdl())) {
            com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.lnr.hcs().qdl(), this.lnr.hcs().ud(), this.lnr.hcs().lnr(), ytVar, this.lnr);
        }
        textView.setText(getTitle());
        lnr(this.exc);
        lnr(imageView);
        lnr(ytVar);
        lnr(textView);
        lnr(textView2);
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.lnr);
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lnr.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.qdl(((com.bytedance.sdk.openadsdk.core.tvp.qdl) lnr.this).ud, ((com.bytedance.sdk.openadsdk.core.tvp.qdl) lnr.this).lnr, ((com.bytedance.sdk.openadsdk.core.tvp.qdl) lnr.this).mo);
                } catch (Throwable th) {
                    aaj.lnr("FullInteractionStyleView", th.getMessage());
                }
            }
        });
    }

    private void mo() {
        TextView textView = (TextView) this.yt.findViewById(jtx.dps);
        if (textView != null) {
            textView.setText(getDescription());
            lnr(textView);
        }
    }

    private void mzz() {
        com.bytedance.sdk.openadsdk.rdp.lnr lnrVar = new com.bytedance.sdk.openadsdk.rdp.lnr(this.ud);
        this.yt = lnrVar;
        ud(lnrVar);
        mml();
        mo();
    }

    private void ud() {
        this.wd = ax.ud(this.ud, this.rdp);
        this.jpc = ax.ud(this.ud, this.bjy);
        int i2 = (int) (this.qdl * 1000.0f);
        if (this.jtx == 1) {
            if (i2 == 666) {
                mzz();
                return;
            }
            if (i2 == 1000) {
                lnr();
                return;
            }
            if (i2 == 1500) {
                rq();
                return;
            } else if (i2 == 1777) {
                exu();
                return;
            } else {
                qdl(0.562f);
                fs();
                return;
            }
        }
        if (i2 == 562) {
            tvp();
            return;
        }
        if (i2 == 666) {
            wd();
            return;
        }
        if (i2 == 1000) {
            lnr();
        } else if (i2 == 1500) {
            jpc();
        } else {
            qdl(1.777f);
            to();
        }
    }

    public void qdl(ljh ljhVar, float f, int i2, int i3, int i4) {
        this.qdl = f;
        this.jtx = i2;
        this.lnr = ljhVar;
        this.mo = "fullscreen_interstitial_ad";
        this.rdp = i3;
        this.bjy = i4;
        qdl(this.tvp);
        ud();
    }

    private void lnr(View view) {
        if (view == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar = this.aaj;
        if (qdlVar == null) {
            Context context = this.ud;
            ljh ljhVar = this.lnr;
            String str = this.mo;
            qdlVar = new com.bytedance.sdk.openadsdk.core.lnr.qdl(context, ljhVar, str, gy.qdl(str));
            qdlVar.qdl(qdl(this.lnr, this.ud));
        }
        view.setOnTouchListener(qdlVar);
        view.setOnClickListener(qdlVar);
    }

    private void qdl(FrameLayout frameLayout, ImageView imageView) {
        ljh ljhVar = this.lnr;
        if (ljhVar == null) {
            return;
        }
        boolean zMzz = ljh.mzz(ljhVar);
        if (this.lnr.tdy() != null && zMzz) {
            ax.qdl((View) imageView, 8);
            ax.qdl((View) frameLayout, 0);
        } else {
            qdl(imageView);
            ax.qdl((View) imageView, 0);
            ax.qdl((View) frameLayout, 8);
        }
    }

    private void ud(View view) {
        if (view.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            view.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            addView(view);
        }
    }

    private void qdl(ImageView imageView) {
        List<jl> listVm;
        jl jlVar;
        ljh ljhVar = this.lnr;
        if (ljhVar == null || (listVm = ljhVar.vm()) == null || listVm.size() <= 0 || (jlVar = listVm.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.tvp.mml.qdl(jlVar).lnr(1).qdl(com.bytedance.sdk.openadsdk.tvp.lnr.qdl(this.lnr, jlVar.qdl(), imageView));
    }

    private com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo qdl(ljh ljhVar, Context context) {
        if (ljhVar != null && ljhVar.ygv() == 4) {
            return new com.bytedance.sdk.openadsdk.exc.qdl.qdl.mml(context, this.mo);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    private void qdl(float f) {
        float fMin;
        float fMax;
        int iMax;
        int i2;
        int iMax2;
        float heightDp = getHeightDp();
        float widthDp = getWidthDp();
        if (this.jtx == 2) {
            fMin = Math.max(heightDp, widthDp);
            fMax = Math.min(heightDp, widthDp);
        } else {
            fMin = Math.min(heightDp, widthDp);
            fMax = Math.max(heightDp, widthDp);
        }
        if (this.jtx != 2 && ax.lnr((Activity) this.ud)) {
            fMax -= ax.lnr(this.ud, ax.qdl());
        }
        int i3 = 20;
        if (this.jtx != 2) {
            if (f == 0.0f || f == 100.0f) {
                i3 = 0;
                iMax2 = 0;
                iMax = 0;
                i2 = 0;
            } else {
                iMax2 = (int) Math.max((fMax - (((fMin - 20.0f) - 20.0f) / f)) / 2.0f, 0.0f);
                iMax = 20;
                i2 = 20;
                i3 = iMax2;
            }
        } else if (f == 0.0f || f == 100.0f) {
            i3 = 0;
            iMax2 = 0;
            iMax = 0;
            i2 = 0;
        } else {
            iMax = (int) Math.max((fMin - (((fMax - 20.0f) - 20.0f) * f)) / 2.0f, 0.0f);
            i2 = iMax;
            iMax2 = 20;
        }
        ((Activity) this.ud).getWindow().getDecorView().setPadding(ax.ud(this.ud, iMax), ax.ud(this.ud, i3), ax.ud(this.ud, i2), ax.ud(this.ud, iMax2));
    }
}
