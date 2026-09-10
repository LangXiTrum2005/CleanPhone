package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.thinkup.core.common.inner.ui.oo.n;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.on;
import com.thinkup.core.common.res.m;
import com.thinkup.core.common.res.oo;
import com.thinkup.core.common.ui.component.RoundImageView;

/* JADX INFO: loaded from: classes6.dex */
public class AsseblemSplashTUView extends BaseSdkSplashTUView {
    protected TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected RoundImageView f41831n;
    protected TextView o;
    protected View o0;

    public AsseblemSplashTUView(Context context) {
        super(context);
    }

    @Override // com.thinkup.core.common.inner.ui.BaseSdkSplashTUView
    public final void m() {
        this.o0 = findViewById(o00.o(getContext(), "myoffer_splash_ad_bottom_container", "id"));
        this.o = (TextView) findViewById(o00.o(getContext(), "myoffer_splash_ad_title", "id"));
        this.m = (TextView) findViewById(o00.o(getContext(), "myoffer_splash_desc", "id"));
        this.f41831n = (RoundImageView) findViewById(o00.o(getContext(), "myoffer_splash_icon", "id"));
        this.mo0 = (ScanningAnimButton) findViewById(o00.o(getContext(), "myoffer_splash_ad_cta_layout", "id"));
        if (TextUtils.isEmpty(this.m00.no())) {
            RoundImageView roundImageView = this.f41831n;
            ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
            layoutParams.width = 0;
            roundImageView.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f41831n.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.rightMargin = 0;
                this.f41831n.setLayoutParams(layoutParams2);
            }
            if (this.onn.oo0.n0() != 2) {
                TextView textView = this.o;
                if (textView != null) {
                    textView.setGravity(17);
                }
                TextView textView2 = this.m;
                if (textView2 != null) {
                    textView2.setGravity(17);
                }
            }
        } else {
            this.f41831n.setVisibility(0);
            this.f41831n.setNeedRadiu(true);
            this.f41831n.setRadiusInDip(12);
            int i2 = this.f41831n.getLayoutParams().width;
            m.o(getContext()).o(new oo(1, this.m00.no()), i2, i2, new m.o() { // from class: com.thinkup.core.common.inner.ui.AsseblemSplashTUView.1
                @Override // com.thinkup.core.common.res.m.o
                public final void onFail(String str, String str2) {
                }

                @Override // com.thinkup.core.common.res.m.o
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(str, AsseblemSplashTUView.this.m00.no())) {
                        AsseblemSplashTUView.this.f41831n.setImageBitmap(bitmap);
                    }
                }
            });
        }
        if (this.onn.oo0.o0o() != 1) {
            this.m0n.add(this.f41831n);
        }
        if (TextUtils.isEmpty(this.m00.mn())) {
            this.o.setVisibility(4);
        } else {
            this.o.setText(this.m00.mn());
            this.o.setVisibility(0);
        }
        if (this.onn.oo0.o0o() != 1) {
            this.m0n.add(this.o);
        }
        if (this.mo0 != null) {
            if (TextUtils.isEmpty(this.m00.o00())) {
                this.mo0.setText(n.o(getContext(), this.m00));
            } else {
                this.mo0.setText(this.m00.o00());
            }
            this.mo0.startAnimation(this.onn.oo0.onm());
            this.m0n.add(this.mo0);
        }
        if (this.m != null) {
            if (TextUtils.isEmpty(this.m00.n0())) {
                this.m.setVisibility(8);
            } else {
                this.m.setText(this.m00.n0());
            }
            if (this.onn.oo0.o0o() != 1) {
                this.m0n.add(this.m);
            }
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseSdkSplashTUView
    public final void n() {
        super.n();
        final FrameLayout frameLayout = (FrameLayout) findViewById(o00.o(getContext(), "myoffer_splash_ad_content_image_area", "id"));
        final RoundImageView roundImageView = (RoundImageView) findViewById(o00.o(getContext(), "myoffer_splash_bg", "id"));
        frameLayout.removeAllViews();
        final WrapRoundImageView wrapRoundImageView = new WrapRoundImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        wrapRoundImageView.setLayoutParams(layoutParams);
        wrapRoundImageView.setNeedRadiu(false);
        wrapRoundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        wrapRoundImageView.setVisibility(4);
        frameLayout.addView(wrapRoundImageView, layoutParams);
        frameLayout.setVisibility(0);
        roundImageView.setNeedRadiu(false);
        roundImageView.setVisibility(0);
        if (TextUtils.isEmpty(this.m00.nm())) {
            roundImageView.setBackgroundColor(Color.parseColor("#EFEFEF"));
            return;
        }
        m.o(getContext()).o(new oo(1, this.m00.nm()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new m.o() { // from class: com.thinkup.core.common.inner.ui.AsseblemSplashTUView.2
            @Override // com.thinkup.core.common.res.m.o
            public final void onFail(String str, String str2) {
            }

            @Override // com.thinkup.core.common.res.m.o
            public final void onSuccess(String str, final Bitmap bitmap) {
                if (TextUtils.equals(str, AsseblemSplashTUView.this.m00.nm())) {
                    frameLayout.post(new Runnable() { // from class: com.thinkup.core.common.inner.ui.AsseblemSplashTUView.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            wrapRoundImageView.setBitmapAndResize(bitmap, frameLayout.getWidth(), frameLayout.getHeight());
                            wrapRoundImageView.setVisibility(0);
                        }
                    });
                    on.o(AsseblemSplashTUView.this.getContext(), bitmap, new on.o() { // from class: com.thinkup.core.common.inner.ui.AsseblemSplashTUView.2.2
                        @Override // com.thinkup.core.common.ooo.on.o
                        public final void o() {
                        }

                        @Override // com.thinkup.core.common.ooo.on.o
                        public final void o(Bitmap bitmap2) {
                            roundImageView.setImageBitmap(bitmap2);
                        }
                    });
                }
            }
        });
        if (this.onn.oo0.o0o() != 1) {
            this.m0n.add(wrapRoundImageView);
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public final void o() {
        if (this.onn.oo0.n0() == 2) {
            LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_splash_ad_layout_asseblem_vertical_land", "layout"), this);
        } else {
            LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_splash_ad_layout_asseblem_vertical_port", "layout"), this);
        }
        o0();
    }

    public AsseblemSplashTUView(Context context, oom oomVar, ooo oooVar, com.thinkup.core.common.inner.oo.o oVar) {
        super(context, oomVar, oooVar, oVar);
    }
}
