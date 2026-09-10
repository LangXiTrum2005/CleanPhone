package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.qd;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ihz {
    private View ac;
    private ImageView aw;
    private com.bytedance.sdk.openadsdk.core.di.fi ay;
    private com.bytedance.sdk.openadsdk.core.widget.ri.di.ri bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private ImageView f18086co;
    private final RelativeLayout di;
    ac fi;
    private ImageView jbs;
    TTAdDislikeToast lr;
    private final Context mj;
    private final String nr;
    private com.bytedance.sdk.openadsdk.core.di.di qt;
    bu ri;
    private ImageView sf;
    private final com.bytedance.sdk.component.jbs.di slm;
    private boolean tan;
    private TextView uq;
    private boolean vr;
    private TextView wjv;
    private final wjv xha;
    final AtomicBoolean ik = new AtomicBoolean(false);
    final AtomicBoolean ka = new AtomicBoolean(false);
    private boolean ihz = false;
    private final int bgr = qd.lr(com.bytedance.sdk.openadsdk.core.nr.ri(), 44.0f);

    public ihz(Context context, RelativeLayout relativeLayout, wjv wjvVar, com.bytedance.sdk.component.jbs.di diVar, String str, boolean z) {
        this.mj = context;
        this.di = relativeLayout;
        this.xha = wjvVar;
        this.slm = diVar;
        this.nr = str;
        this.tan = z;
        this.fi = new ac(context, this.tan);
        xha();
        mj();
    }

    private void jbs() {
        try {
            if (this.ri == null) {
                bu buVar = new bu(this.mj, this.xha);
                this.ri = buVar;
                buVar.setDislikeSource("landing_page");
                this.ri.setCallback(new bu.ri() { // from class: com.bytedance.sdk.openadsdk.common.ihz.2
                    @Override // com.bytedance.sdk.openadsdk.common.bu.ri
                    public void lr(View view) {
                        ihz.this.ik.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bu.ri
                    public void ri(View view) {
                        ihz.this.ik.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bu.ri
                    public void ri(FilterWord filterWord) {
                        if (ihz.this.ka.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        ihz.this.ka.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) this.di.getRootView().findViewById(R.id.content);
            frameLayout.addView(this.ri);
            if (this.lr == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.mj);
                this.lr = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th);
        }
    }

    private void mj() {
        View view = this.ac;
        if (view == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.competently
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f18083kowloon.ri(view2);
            }
        });
    }

    private void qt() {
        this.lr.show(TTAdDislikeToast.getDislikeTip());
    }

    private boolean sf() {
        return this.mj.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    private void xha() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.di.getLayoutParams();
        layoutParams.height = this.bgr;
        this.di.setLayoutParams(layoutParams);
        int iLr = qd.lr(this.mj, 8.0f);
        this.di.setPadding(iLr, 0, iLr, 0);
        this.jbs = (ImageView) this.di.findViewById(com.bytedance.sdk.openadsdk.utils.slm.saa);
        this.sf = (ImageView) this.di.findViewById(com.bytedance.sdk.openadsdk.utils.slm.ud);
        this.f18086co = (ImageView) this.di.findViewById(com.bytedance.sdk.openadsdk.utils.slm.hpn);
        this.aw = (ImageView) this.di.findViewById(520093740);
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = (com.bytedance.sdk.openadsdk.core.di.fi) this.di.findViewById(com.bytedance.sdk.openadsdk.utils.slm.pc);
        this.ay = fiVar;
        this.uq = (TextView) fiVar.findViewById(com.bytedance.sdk.openadsdk.utils.slm.ri);
        this.wjv = (TextView) this.ay.findViewById(com.bytedance.sdk.openadsdk.utils.slm.lr);
        if (sf()) {
            this.uq.setTextDirection(4);
            this.wjv.setTextDirection(4);
            this.uq.setGravity(8388629);
            this.wjv.setGravity(8388629);
            this.sf.setImageResource(uq.ka(this.mj, "tt_titlebar_forward"));
            this.f18086co.setImageResource(uq.ka(this.mj, "tt_titlebar_backward"));
        }
        this.qt = (com.bytedance.sdk.openadsdk.core.di.di) this.di.findViewById(com.bytedance.sdk.openadsdk.utils.slm.xe);
        this.f18086co.setVisibility(0);
        this.sf.setVisibility(0);
        this.jbs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ihz.this.slm != null) {
                    ihz.this.slm.xha();
                    ihz.this.slm.removeAllViews();
                    ViewGroup viewGroup = (ViewGroup) ihz.this.slm.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(ihz.this.slm);
                    }
                    ihz.this.slm.slm();
                }
                if (ihz.this.mj instanceof Activity) {
                    ((Activity) ihz.this.mj).finish();
                }
            }
        });
        this.sf.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ihz.this.slm == null || !ihz.this.slm.jbs()) {
                    return;
                }
                if (ihz.this.bu != null) {
                    ihz.this.bu.ri();
                }
                ihz.this.slm.qt();
            }
        });
        this.f18086co.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ihz.this.slm == null || !ihz.this.slm.sf()) {
                    return;
                }
                ihz.this.slm.co();
            }
        });
        this.aw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ihz ihzVar = ihz.this;
                ihzVar.ri(ihzVar.fi, view);
            }
        });
        ri(true);
        this.sf.setClickable(false);
        this.f18086co.setClickable(false);
        ImageView imageView = this.sf;
        int color = Color.parseColor("#A8FFFFFF");
        PorterDuff.Mode mode = PorterDuff.Mode.ADD;
        imageView.setColorFilter(color, mode);
        this.f18086co.setColorFilter(Color.parseColor("#A8FFFFFF"), mode);
        this.ac = this.di;
    }

    public void di() {
        if (this.ka.get()) {
            qt();
            return;
        }
        if (this.ri == null) {
            jbs();
        }
        bu buVar = this.ri;
        if (buVar != null) {
            buVar.ri();
        }
    }

    public TextView fi() {
        return this.wjv;
    }

    public ImageView ik() {
        return this.jbs;
    }

    public TextView ka() {
        return this.uq;
    }

    private boolean ka(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (Character.getDirectionality(c) == 1 || Character.getDirectionality(c) == 2) {
                return true;
            }
        }
        return false;
    }

    public String ik(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host)) {
                return host.startsWith("www.") ? host.substring(4) : host;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public void lr() {
        try {
            final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.di.getLayoutParams();
            if (this.vr) {
                return;
            }
            int i = layoutParams.height;
            int i2 = this.bgr;
            if (i == i2) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i2 / 2);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.9
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ihz.this.di.setLayoutParams(layoutParams);
                        ihz.this.di.requestLayout();
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.10
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ihz.this.vr = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        ihz.this.vr = true;
                        ihz.this.ri(8);
                        ihz.this.ri(false);
                        ihz.this.ihz = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ri(View view) {
        if (this.ihz) {
            ri();
            this.ihz = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(final ac acVar, View view) {
        acVar.setOnMenuItemClickListener(new ac.ri() { // from class: com.bytedance.sdk.openadsdk.common.ihz.6
            @Override // com.bytedance.sdk.openadsdk.common.ac.ri
            public void ik() {
                if (ihz.this.slm != null) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = ihz.this.slm.getWebView().getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.lr.ri(ihz.this.mj, intent, null);
                    }
                    acVar.ri();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.ac.ri
            public void ka() {
                if (!ihz.this.tan) {
                    ihz.this.di();
                }
                acVar.ri();
            }

            @Override // com.bytedance.sdk.openadsdk.common.ac.ri
            public void lr() {
                ClipboardManager clipboardManager;
                if (ihz.this.slm != null) {
                    String url = ihz.this.slm.getWebView().getUrl();
                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) ihz.this.mj.getSystemService("clipboard")) != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                    }
                }
                acVar.ri();
            }

            @Override // com.bytedance.sdk.openadsdk.common.ac.ri
            public void ri() {
                if (ihz.this.slm != null) {
                    ihz.this.slm.mj();
                    if (ihz.this.qt != null) {
                        ihz.this.qt.setVisibility(0);
                        ihz.this.qt.setProgress(0);
                    }
                    acVar.ri();
                }
            }
        });
        acVar.ri(view);
    }

    public void lr(String str) {
        String strIk = ik(str);
        TextView textView = this.wjv;
        if (!TextUtils.isEmpty(strIk)) {
            str = strIk;
        }
        textView.setText(str);
    }

    public void ri(boolean z) {
        if (this.uq == null || this.wjv == null) {
            return;
        }
        String string = ka().getText().toString();
        String strReplaceAll = TextUtils.isEmpty(string) ? " " : string.replaceAll("[\n\r]+", " ");
        String string2 = fi().getText().toString();
        this.uq.setText(strReplaceAll);
        this.wjv.setText(string2);
        if (z) {
            this.uq.setVisibility(0);
            com.bytedance.sdk.openadsdk.core.di.fi fiVar = this.ay;
            if (fiVar != null) {
                ViewGroup.LayoutParams layoutParams = fiVar.getLayoutParams();
                layoutParams.width = -2;
                this.ay.setLayoutParams(layoutParams);
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.di.getLayoutParams();
            layoutParams2.height = this.bgr;
            this.di.setLayoutParams(layoutParams2);
            return;
        }
        this.uq.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.di.fi fiVar2 = this.ay;
        if (fiVar2 != null) {
            ViewGroup.LayoutParams layoutParams3 = fiVar2.getLayoutParams();
            layoutParams3.width = -1;
            this.ay.setLayoutParams(layoutParams3);
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.di.getLayoutParams();
        layoutParams4.height = this.bgr / 2;
        this.di.setLayoutParams(layoutParams4);
    }

    public void ri() {
        try {
            final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.di.getLayoutParams();
            if (this.vr) {
                return;
            }
            int i = layoutParams.height;
            int i2 = this.bgr;
            if (i == i2 / 2) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2 / 2, i2);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.7
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ihz.this.di.setLayoutParams(layoutParams);
                        ihz.this.di.requestLayout();
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.8
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ihz.this.vr = false;
                        ihz.this.ri(0);
                        ihz.this.ri(true);
                        ihz.this.ihz = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        ihz.this.vr = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public void ri(String str) {
        this.uq.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(int i) {
        ImageView imageView = this.jbs;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        ImageView imageView2 = this.sf;
        if (imageView2 != null) {
            imageView2.setVisibility(i);
        }
        ImageView imageView3 = this.f18086co;
        if (imageView3 != null) {
            imageView3.setVisibility(i);
        }
        ImageView imageView4 = this.aw;
        if (imageView4 != null) {
            imageView4.setVisibility(i);
        }
    }

    public void ri(WebView webView, com.bytedance.sdk.openadsdk.core.widget.ri.di.ri riVar) {
        this.bu = riVar;
        try {
            if (this.sf != null) {
                if (webView.canGoBack()) {
                    this.sf.setClickable(true);
                    this.sf.clearColorFilter();
                } else {
                    this.sf.setClickable(false);
                    this.sf.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.f18086co != null) {
                if (webView.canGoForward()) {
                    this.f18086co.setClickable(true);
                    this.f18086co.clearColorFilter();
                } else {
                    this.f18086co.setClickable(false);
                    this.f18086co.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
