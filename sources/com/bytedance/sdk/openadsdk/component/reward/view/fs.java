package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.qdl.rdp;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.bjy;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class fs {
    private int aaj;
    public aaj bjy;
    private final String exc;
    rdp fs;
    private final boolean jl;
    View jpc;
    com.bytedance.sdk.openadsdk.core.mo.mo jtx;
    private boolean jyq;
    private com.bytedance.sdk.openadsdk.core.widget.rq ljh;
    protected final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl lnr;
    final ljh mml;
    FrameLayout mo;
    ImageView mzz;
    private mzz oth;
    RelativeLayout rq;
    ImageView to;
    PAGLogoView tvp;
    final Activity ud;
    View wd;
    int qdl = 3;
    protected int exu = 0;
    protected final AtomicBoolean rdp = new AtomicBoolean(false);
    Runnable yt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fs.2
        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            try {
                ljh ljhVar = fs.this.mml;
                if ((ljhVar == null || !ljhVar.au()) && (imageView = fs.this.mzz) != null) {
                    int[] iArr = new int[2];
                    imageView.getLocationOnScreen(iArr);
                    fs.this.lnr.fco.qdl(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    public fs(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.lnr = qdlVar;
        this.ud = qdlVar.ag;
        this.mml = qdlVar.ud;
        this.exc = qdlVar.mzz;
        this.jl = qdlVar.mml;
    }

    private void jl() {
        RelativeLayout relativeLayout;
        mzz mzzVar = (mzz) this.lnr.ax.findViewById(jtx.fs);
        this.oth = mzzVar;
        mzzVar.qdl(this.lnr);
        com.bytedance.sdk.openadsdk.core.widget.rq rqVar = (com.bytedance.sdk.openadsdk.core.widget.rq) this.lnr.ax.findViewById(jtx.ew);
        this.ljh = rqVar;
        if (rqVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.lnr;
            rqVar.qdl(qdlVar.ud, qdlVar.mzz, null);
        }
        this.tvp = (PAGLogoView) this.lnr.ax.findViewById(520093757);
        this.to = (ImageView) this.lnr.ax.findViewById(jtx.xmr);
        this.mzz = (ImageView) this.lnr.ax.findViewById(520093708);
        this.mo = (FrameLayout) this.lnr.ax.findViewById(jtx.rq);
        this.wd = this.lnr.ax.findViewById(jtx.jtx);
        this.jpc = this.lnr.ax.findViewById(jtx.blf);
        this.rq = (RelativeLayout) this.lnr.ax.findViewById(jtx.fc);
        rdp rdpVar = this.fs;
        if (rdpVar == null || rdpVar.mml() == null || (relativeLayout = this.rq) == null) {
            return;
        }
        relativeLayout.addView(this.fs.mml(), new LinearLayout.LayoutParams(-1, -1));
        this.fs.ud();
    }

    public void bjy() {
        aaj aajVar = this.bjy;
        if (aajVar != null) {
            aajVar.wd();
        }
    }

    public void exu() {
        try {
            Activity activity = this.lnr.ag;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(activity, com.bytedance.sdk.component.utils.ljh.tvp(activity, "tt_fade_out"));
            if (animationLoadAnimation == null) {
                this.lnr.gy.fs();
            } else {
                animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fs.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        fs.this.lnr.gy.fs();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                this.lnr.gy.qdl(animationLoadAnimation);
            }
        } catch (Throwable unused) {
            this.lnr.gy.fs();
        }
    }

    public void fs() {
        try {
            rdp rdpVar = this.fs;
            if (rdpVar != null) {
                rdpVar.lnr();
            }
            RelativeLayout relativeLayout = this.rq;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.rq;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public void jpc() {
        mzz mzzVar = this.oth;
        if (mzzVar == null) {
            return;
        }
        mzzVar.qdl();
    }

    public void jtx() {
        aaj aajVar = this.bjy;
        if (aajVar != null) {
            aajVar.jpc();
        }
    }

    public void lnr() {
        this.mo.removeAllViews();
    }

    public void mml() {
        if (this.lnr.ud.qur() && vu.lnr(this.lnr.ud)) {
            return;
        }
        ax.qdl((View) this.mo, 8);
        ax.qdl((View) this.ljh, 8);
        ax.qdl(this.wd, 8);
        ax.qdl(this.jpc, 8);
        ud(8);
        ax.qdl((View) this.mzz, 8);
        ax.qdl((View) this.tvp, 8);
        ax.qdl((View) this.rq, 8);
        ax.qdl((View) this.to, 8);
    }

    public FrameLayout mo() {
        return this.mo;
    }

    public void mzz() {
        int iBlf = this.mml.blf();
        this.qdl = iBlf;
        if (iBlf == -200) {
            this.qdl = yt.mml().bjy(String.valueOf(this.mml.fz()));
        }
        if (this.qdl != -1 || qdl()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr.en;
        if ((udVar instanceof com.bytedance.sdk.openadsdk.component.reward.ud.mml) || (udVar instanceof com.bytedance.sdk.openadsdk.component.reward.ud.lnr)) {
            return;
        }
        ud(0);
    }

    public boolean qdl() {
        return true;
    }

    public void rdp() {
        aaj aajVar = this.bjy;
        if (aajVar != null) {
            aajVar.mo();
        }
        ImageView imageView = this.mzz;
        if (imageView != null) {
            imageView.removeCallbacks(this.yt);
        }
    }

    public View rq() {
        return this.oth;
    }

    public View to() {
        return this.mzz;
    }

    public boolean tvp() {
        ImageView imageView = this.mzz;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public void ud() {
        if (this.jyq) {
            return;
        }
        this.jyq = true;
        this.aaj = this.lnr.zlt;
        if (qdl()) {
            rdp rdpVar = new rdp(this.lnr);
            this.fs = rdpVar;
            rdpVar.qdl();
        }
        jl();
        Activity activity = this.ud;
        ljh ljhVar = this.mml;
        String str = this.exc;
        FrameLayout frameLayout = this.mo;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.lnr;
        aaj aajVar = new aaj(activity, ljhVar, str, frameLayout, qdlVar.wc, qdlVar.ax);
        this.bjy = aajVar;
        aajVar.qdl();
    }

    public void wd() {
        if (this.to.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.to.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.to.setLayoutParams(marginLayoutParams);
        }
    }

    public void yt() {
        com.bytedance.sdk.openadsdk.core.lnr.mzz mzzVarMzz = this.lnr.vu.mzz();
        View view = this.oth;
        if (view == null) {
            view = this.lnr.ax;
        }
        mzzVarMzz.onClick(view);
    }

    public void lnr(int i2) {
        ljh ljhVar = this.mml;
        if (ljhVar != null && ljhVar.qur() && vu.lnr(this.mml)) {
            ax.qdl((View) this.ljh, i2);
        }
    }

    public void mo(int i2) {
        ax.qdl((View) this.mzz, i2);
    }

    public void qdl(boolean z2) {
        ax.qdl((View) this.tvp, vu.lnr(this.mml) ? 8 : 0);
        ax.qdl((View) this.to, (this.mml.uj() && this.mml.exc()) ? 0 : 8);
        ud(z2);
        if (this.jl) {
            mzz();
        }
    }

    public void mzz(int i2) {
        int i3 = this.qdl;
        if (i3 == -1 || i2 != i3 || this.rdp.get()) {
            return;
        }
        ud(0);
        this.rdp.set(true);
        jpc();
    }

    public void qdl(int i2) {
        if (this.jtx == null) {
            this.jtx = new com.bytedance.sdk.openadsdk.core.mo.mo(this.lnr.ag);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.jtx.setLayoutParams(layoutParams);
            this.jtx.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.rq.qdl(this.lnr.ag, "tt_video_loading_progress_bar"));
            this.lnr.gy.mo().addView(this.jtx);
        }
        this.jtx.setVisibility(i2);
    }

    public void ud(boolean z2) {
        ImageView imageView;
        int iQdl;
        if (this.aaj != 1 && (imageView = this.mzz) != null && z2) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (iQdl = qdl("navigation_bar_height")) > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (iQdl > marginLayoutParams.rightMargin) {
                    marginLayoutParams.rightMargin = iQdl;
                }
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr.en;
        if ((udVar instanceof com.bytedance.sdk.openadsdk.component.reward.ud.mml) || (udVar instanceof com.bytedance.sdk.openadsdk.component.reward.ud.lnr)) {
            return;
        }
        ud(0);
    }

    public void mml(int i2) {
        ax.qdl((View) this.tvp, i2);
    }

    public void qdl(int i2, int i3) {
        FrameLayout frameLayout;
        if (this.mml.gg() == 1 && (frameLayout = this.mo) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int iLnr = ax.lnr((Context) this.ud);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mo.getLayoutParams();
            layoutParams.width = iLnr;
            int i4 = (iLnr * 9) / 16;
            layoutParams.height = i4;
            this.mo.setLayoutParams(layoutParams);
            this.exu = (ax.mzz(this.ud) - i4) / 2;
        }
    }

    public void ud(int i2) {
        ljh ljhVar = this.mml;
        if (ljhVar != null && ljhVar.uj() && bjy.qdl(this.mml)) {
            ax.qdl((View) this.oth, 8);
        } else {
            ax.qdl((View) this.oth, i2);
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.lnr.lnr lnrVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        ljh ljhVar;
        if (this.mo != null && (ljhVar = this.mml) != null && ljhVar.rzg() != null) {
            if (this.mml.rzg().mo && !aaj.ud(this.mml)) {
                qdl((View.OnClickListener) lnrVar);
                qdl(lnrVar);
            } else {
                qdl(onClickListener);
            }
        }
        ljh ljhVar2 = this.mml;
        if (ljhVar2 != null && ljhVar2.gg() == 1) {
            if (this.mml.rzg() != null && (view2 = this.wd) != null) {
                ax.qdl(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.wd.getLayoutParams();
                layoutParams.height = this.exu;
                this.wd.setLayoutParams(layoutParams);
                if (this.mml.rzg().ud) {
                    this.wd.setOnClickListener(lnrVar);
                    this.wd.setOnTouchListener(onTouchListener);
                } else {
                    this.wd.setOnClickListener(onClickListener);
                }
            }
            if (this.mml.rzg() != null && (view = this.jpc) != null) {
                ax.qdl(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.jpc.getLayoutParams();
                layoutParams2.height = this.exu;
                this.jpc.setLayoutParams(layoutParams2);
                if (this.mml.rzg().mml) {
                    this.jpc.setOnClickListener(lnrVar);
                    this.jpc.setOnTouchListener(onTouchListener);
                } else {
                    this.jpc.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.tvp;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fs.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    try {
                        fs fsVar = fs.this;
                        TTWebsiteActivity.qdl(fsVar.ud, fsVar.mml, fsVar.exc);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.aaj.lnr("TTAD.RFullVideoLayout", th.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.to;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.jl.ud.ud().qdl((int) ax.qdl(yt.qdl(), 14.0f, true), this.to, this.lnr.ud);
        }
    }

    private int qdl(String str) {
        Resources resources = this.ud.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void qdl(View.OnClickListener onClickListener) {
        ax.qdl(this.mo, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.lnr.lnr lnrVar) {
        ax.qdl((View) this.mo, (View.OnTouchListener) lnrVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void qdl(float f) {
        ax.qdl(this.mzz, f);
    }

    public void qdl(Animation animation) {
        RelativeLayout relativeLayout = this.rq;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }

    public void qdl(int i2, com.bytedance.sdk.component.adexpress.ud.rdp rdpVar) {
        aaj aajVar = this.bjy;
        if (aajVar != null) {
            aajVar.qdl(i2, rdpVar);
        }
    }
}
