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
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.ri.bgr;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.vr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class sf {
    private int ac;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    bgr f18099co;
    FrameLayout di;
    ImageView fi;
    private boolean ihz;
    protected final com.bytedance.sdk.openadsdk.component.reward.ri.ri ik;
    PAGLogoView jbs;
    final wjv ka;
    final Activity lr;
    View mj;
    private final boolean nr;
    ImageView qt;
    RelativeLayout sf;
    com.bytedance.sdk.openadsdk.core.di.di slm;
    private final String tan;
    private ka uq;
    public ac vr;
    private com.bytedance.sdk.openadsdk.core.widget.sf wjv;
    View xha;
    int ri = 3;
    protected int aw = 0;
    protected final AtomicBoolean bgr = new AtomicBoolean(false);
    Runnable bu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.sf.2
        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            try {
                wjv wjvVar = sf.this.ka;
                if ((wjvVar == null || !wjvVar.vgs()) && (imageView = sf.this.fi) != null) {
                    int[] iArr = new int[2];
                    imageView.getLocationOnScreen(iArr);
                    sf.this.ik.oh.ri(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    public sf(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        this.ik = riVar;
        this.lr = riVar.ig;
        this.ka = riVar.lr;
        this.tan = riVar.fi;
        this.nr = riVar.ka;
    }

    private void nr() {
        RelativeLayout relativeLayout;
        ka kaVar = (ka) this.ik.pv.findViewById(slm.bgr);
        this.uq = kaVar;
        kaVar.ri(this.ik);
        com.bytedance.sdk.openadsdk.core.widget.sf sfVar = (com.bytedance.sdk.openadsdk.core.widget.sf) this.ik.pv.findViewById(slm.vt);
        this.wjv = sfVar;
        if (sfVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ik;
            sfVar.ri(riVar.lr, riVar.fi, null);
        }
        this.jbs = (PAGLogoView) this.ik.pv.findViewById(520093757);
        this.qt = (ImageView) this.ik.pv.findViewById(slm.hqg);
        this.fi = (ImageView) this.ik.pv.findViewById(520093708);
        this.di = (FrameLayout) this.ik.pv.findViewById(slm.aw);
        this.xha = this.ik.pv.findViewById(slm.nr);
        this.mj = this.ik.pv.findViewById(slm.iph);
        this.sf = (RelativeLayout) this.ik.pv.findViewById(slm.ugd);
        bgr bgrVar = this.f18099co;
        if (bgrVar == null || bgrVar.ka() == null || (relativeLayout = this.sf) == null) {
            return;
        }
        relativeLayout.addView(this.f18099co.ka(), new LinearLayout.LayoutParams(-1, -1));
        this.f18099co.lr();
    }

    public void aw() {
        try {
            Activity activity = this.ik.ig;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(activity, uq.jbs(activity, "tt_fade_out"));
            if (animationLoadAnimation == null) {
                this.ik.dzy.co();
            } else {
                animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.sf.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        sf.this.ik.dzy.co();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                this.ik.dzy.ri(animationLoadAnimation);
            }
        } catch (Throwable unused) {
            this.ik.dzy.co();
        }
    }

    public void bgr() {
        ac acVar = this.vr;
        if (acVar != null) {
            acVar.di();
        }
        ImageView imageView = this.fi;
        if (imageView != null) {
            imageView.removeCallbacks(this.bu);
        }
    }

    public void bu() {
        com.bytedance.sdk.openadsdk.core.ik.fi fiVarFi = this.ik.su.fi();
        View view = this.uq;
        if (view == null) {
            view = this.ik.pv;
        }
        fiVarFi.onClick(view);
    }

    public void co() {
        try {
            bgr bgrVar = this.f18099co;
            if (bgrVar != null) {
                bgrVar.ik();
            }
            RelativeLayout relativeLayout = this.sf;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.sf;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
    }

    public FrameLayout di() {
        return this.di;
    }

    public void fi() {
        int iVt = this.ka.vt();
        this.ri = iVt;
        if (iVt == -200) {
            this.ri = nr.ka().vr(String.valueOf(this.ka.ur()));
        }
        if (this.ri != -1 || ri()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar = this.ik.nd;
        if ((lrVar instanceof com.bytedance.sdk.openadsdk.component.reward.lr.ka) || (lrVar instanceof com.bytedance.sdk.openadsdk.component.reward.lr.ik)) {
            return;
        }
        lr(0);
    }

    public void ik() {
        this.di.removeAllViews();
    }

    public boolean jbs() {
        ImageView imageView = this.fi;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public void ka() {
        if (this.ik.lr.biu() && dw.ik(this.ik.lr)) {
            return;
        }
        qd.ri((View) this.di, 8);
        qd.ri((View) this.wjv, 8);
        qd.ri(this.xha, 8);
        qd.ri(this.mj, 8);
        lr(8);
        qd.ri((View) this.fi, 8);
        qd.ri((View) this.jbs, 8);
        qd.ri((View) this.sf, 8);
        qd.ri((View) this.qt, 8);
    }

    public void lr() {
        if (this.ihz) {
            return;
        }
        this.ihz = true;
        this.ac = this.ik.bnj;
        if (ri()) {
            bgr bgrVar = new bgr(this.ik);
            this.f18099co = bgrVar;
            bgrVar.ri();
        }
        nr();
        Activity activity = this.lr;
        wjv wjvVar = this.ka;
        String str = this.tan;
        FrameLayout frameLayout = this.di;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ik;
        ac acVar = new ac(activity, wjvVar, str, frameLayout, riVar.qd, riVar.pv);
        this.vr = acVar;
        acVar.ri();
    }

    public void mj() {
        ka kaVar = this.uq;
        if (kaVar == null) {
            return;
        }
        kaVar.ri();
    }

    public View qt() {
        return this.fi;
    }

    public boolean ri() {
        return true;
    }

    public View sf() {
        return this.uq;
    }

    public void slm() {
        ac acVar = this.vr;
        if (acVar != null) {
            acVar.mj();
        }
    }

    public void vr() {
        ac acVar = this.vr;
        if (acVar != null) {
            acVar.xha();
        }
    }

    public void xha() {
        if (this.qt.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.qt.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.qt.setLayoutParams(marginLayoutParams);
        }
    }

    public void di(int i) {
        qd.ri((View) this.fi, i);
    }

    public void ik(int i) {
        wjv wjvVar = this.ka;
        if (wjvVar != null && wjvVar.biu() && dw.ik(this.ka)) {
            qd.ri((View) this.wjv, i);
        }
    }

    public void ri(boolean z) {
        qd.ri((View) this.jbs, dw.ik(this.ka) ? 8 : 0);
        qd.ri((View) this.qt, (this.ka.zz() && this.ka.wjv()) ? 0 : 8);
        lr(z);
        if (this.nr) {
            fi();
        }
    }

    public void fi(int i) {
        int i2 = this.ri;
        if (i2 == -1 || i != i2 || this.bgr.get()) {
            return;
        }
        lr(0);
        this.bgr.set(true);
        mj();
    }

    public void ri(int i) {
        if (this.slm == null) {
            this.slm = new com.bytedance.sdk.openadsdk.core.di.di(this.ik.ig);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.slm.setLayoutParams(layoutParams);
            this.slm.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.sf.ri(this.ik.ig, "tt_video_loading_progress_bar"));
            this.ik.dzy.di().addView(this.slm);
        }
        this.slm.setVisibility(i);
    }

    public void lr(boolean z) {
        ImageView imageView;
        int iRi;
        if (this.ac != 1 && (imageView = this.fi) != null && z) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (iRi = ri("navigation_bar_height")) > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (iRi > marginLayoutParams.rightMargin) {
                    marginLayoutParams.rightMargin = iRi;
                }
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar = this.ik.nd;
        if ((lrVar instanceof com.bytedance.sdk.openadsdk.component.reward.lr.ka) || (lrVar instanceof com.bytedance.sdk.openadsdk.component.reward.lr.ik)) {
            return;
        }
        lr(0);
    }

    public void ka(int i) {
        qd.ri((View) this.jbs, i);
    }

    public void ri(int i, int i2) {
        FrameLayout frameLayout;
        if (this.ka.jxw() == 1 && (frameLayout = this.di) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int iIk = qd.ik((Context) this.lr);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.di.getLayoutParams();
            layoutParams.width = iIk;
            int i3 = (iIk * 9) / 16;
            layoutParams.height = i3;
            this.di.setLayoutParams(layoutParams);
            this.aw = (qd.fi(this.lr) - i3) / 2;
        }
    }

    public void lr(int i) {
        wjv wjvVar = this.ka;
        if (wjvVar != null && wjvVar.zz() && vr.ri(this.ka)) {
            qd.ri((View) this.uq, 8);
        } else {
            qd.ri((View) this.uq, i);
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.core.ik.ik ikVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        wjv wjvVar;
        if (this.di != null && (wjvVar = this.ka) != null && wjvVar.nh() != null) {
            if (this.ka.nh().di && !ac.lr(this.ka)) {
                ri((View.OnClickListener) ikVar);
                ri(ikVar);
            } else {
                ri(onClickListener);
            }
        }
        wjv wjvVar2 = this.ka;
        if (wjvVar2 != null && wjvVar2.jxw() == 1) {
            if (this.ka.nh() != null && (view2 = this.xha) != null) {
                qd.ri(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.xha.getLayoutParams();
                layoutParams.height = this.aw;
                this.xha.setLayoutParams(layoutParams);
                if (this.ka.nh().lr) {
                    this.xha.setOnClickListener(ikVar);
                    this.xha.setOnTouchListener(onTouchListener);
                } else {
                    this.xha.setOnClickListener(onClickListener);
                }
            }
            if (this.ka.nh() != null && (view = this.mj) != null) {
                qd.ri(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.mj.getLayoutParams();
                layoutParams2.height = this.aw;
                this.mj.setLayoutParams(layoutParams2);
                if (this.ka.nh().ka) {
                    this.mj.setOnClickListener(ikVar);
                    this.mj.setOnTouchListener(onTouchListener);
                } else {
                    this.mj.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.jbs;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.sf.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    try {
                        sf sfVar = sf.this;
                        TTWebsiteActivity.ri(sfVar.lr, sfVar.ka, sfVar.tan);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.ac.ik("TTAD.RFullVideoLayout", th.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.qt;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri((int) qd.ri(nr.ri(), 14.0f, true), this.qt, this.ik.lr);
        }
    }

    private int ri(String str) {
        Resources resources = this.lr.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void ri(View.OnClickListener onClickListener) {
        qd.ri(this.di, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void ri(com.bytedance.sdk.openadsdk.core.ik.ik ikVar) {
        qd.ri((View) this.di, (View.OnTouchListener) ikVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void ri(float f) {
        qd.ri(this.fi, f);
    }

    public void ri(Animation animation) {
        RelativeLayout relativeLayout = this.sf;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }

    public void ri(int i, com.bytedance.sdk.component.adexpress.lr.bgr bgrVar) {
        ac acVar = this.vr;
        if (acVar != null) {
            acVar.ri(i, bgrVar);
        }
    }
}
