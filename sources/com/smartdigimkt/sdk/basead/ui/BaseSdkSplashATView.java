package com.smartdigimkt.sdk.basead.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.sdk.api.SDMSDK;
import com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;
import com.smartdigimkt.v3.l;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseSdkSplashATView extends BaseSplashATView {
    public static final int TYPE_ASSEBLEM = 1;
    public static final int TYPE_SINGLE_PICTURE = 0;
    protected RoundImageView d1;
    protected MuteImageView e1;
    ImageView f1;
    ImageView g1;
    protected final View.OnClickListener h1;
    private SplashEndCardView i1;
    private ValueAnimator j1;
    protected boolean k1;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.w6.g gVar = BaseSdkSplashATView.this.f0.t;
            if (gVar == null || gVar.T() != 0) {
                return;
            }
            BaseSdkSplashATView.this.a(1, 3);
        }
    }

    public class b implements BaseEndCardView.b {
        public b() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.BaseEndCardView.b
        public void a() {
            BaseSdkSplashATView.this.a(true, 1);
        }

        @Override // com.smartdigimkt.sdk.basead.ui.BaseEndCardView.a
        public void b() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.BaseEndCardView.a
        public void a(int i2) {
            BaseSdkSplashATView.this.a(i2 != 9 ? 1 : 4, i2);
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f38324a;

        public c(View view) {
            this.f38324a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BaseSdkSplashATView.this.i1 != null) {
                BaseSdkSplashATView.this.i1.setAlpha(fFloatValue);
            }
            View view = this.f38324a;
            if (view != null) {
                view.setAlpha((float) (1.0d - ((((double) fFloatValue) - 0.2d) * 1.25d)));
            }
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f38326a;

        public d(View view) {
            this.f38326a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = this.f38326a;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    public class e implements com.smartdigimkt.q5.a.c {
        public e() {
        }

        @Override // com.smartdigimkt.q5.a.c
        public l a() {
            return BaseSdkSplashATView.this.b();
        }

        @Override // com.smartdigimkt.q5.a.c
        public com.smartdigimkt.v3.a b() {
            return BaseSdkSplashATView.this.getAdClickRecord();
        }
    }

    public class f implements BasePlayerView.a {
        public f() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void b(long j) {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void c() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void d() {
            BaseSdkSplashATView.this.C();
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void e() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void onVideoDownloadResume() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a(int i2) {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void b() {
            ImageView imageView = BaseSdkSplashATView.this.g1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = BaseSdkSplashATView.this.f1;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a(long j) {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a(com.smartdigimkt.v3.h hVar) {
            BaseSdkSplashATView.this.C();
            BaseSdkSplashATView baseSdkSplashATView = BaseSdkSplashATView.this;
            com.smartdigimkt.i7.d.a(baseSdkSplashATView.f0, baseSdkSplashATView.g0, 2, hVar.c());
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void b(int i2) {
            if (BaseSdkSplashATView.this.f0.t.T() != 1) {
                BaseSdkSplashATView.this.a(i2, 3);
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSdkSplashATView baseSdkSplashATView = BaseSdkSplashATView.this;
            com.smartdigimkt.q5.a aVar = baseSdkSplashATView.r0;
            if (aVar == null || baseSdkSplashATView.e1 == null) {
                return;
            }
            if (aVar.h()) {
                BaseSdkSplashATView.this.e1.setMute(false);
                BaseSdkSplashATView.this.r0.d(false);
            } else {
                BaseSdkSplashATView.this.e1.setMute(true);
                BaseSdkSplashATView.this.r0.d(true);
            }
        }
    }

    public class h implements com.smartdigimkt.d7.b.f {
        public h() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, BaseSdkSplashATView.this.g0.s())) {
                ImageView imageView = BaseSdkSplashATView.this.g1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                BaseSdkSplashATView.this.f1.setImageBitmap(bitmap);
            }
        }
    }

    public BaseSdkSplashATView(Context context) {
        super(context);
        this.h1 = new a();
        this.k1 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        this.k1 = true;
        E();
        if (this.b1) {
            a(true, 7);
        }
    }

    public static boolean isSinglePicture(com.smartdigimkt.w6.f fVar, com.smartdigimkt.w6.g gVar) {
        if ((fVar instanceof com.smartdigimkt.z6.a) && (gVar instanceof com.smartdigimkt.z6.c)) {
            return 2 == ((com.smartdigimkt.z6.c) gVar).S1();
        }
        return (fVar instanceof com.smartdigimkt.w6.l) && 1 == ((com.smartdigimkt.w6.l) fVar).B0();
    }

    private void y() {
        if (!i.g(this.g0, this.f0)) {
            ImageView imageView = this.g1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f1;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f1 == null || TextUtils.isEmpty(this.g0.s())) {
            return;
        }
        ImageView imageView3 = this.g1;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        ImageView imageView4 = this.f1;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
        com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, this.g0.s()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new h());
    }

    public void A() {
        com.smartdigimkt.q5.a aVar = new com.smartdigimkt.q5.a(this, this.f0, this.g0);
        this.r0 = aVar;
        aVar.e(getATViewType());
        com.smartdigimkt.w5.a aVar2 = this.s0;
        if (aVar2 != null) {
            this.r0.a(aVar2);
        }
        int i2 = 0;
        this.k1 = this.r0.c() == null;
        this.r0.e(true);
        this.r0.a(new e());
        this.r0.a(new f());
        if (h()) {
            this.r0.f(0);
            this.r0.a(true, (List<Bitmap>) null, this.A0);
        }
        MuteImageView muteImageView = (MuteImageView) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_btn_mute_id", "id"));
        this.e1 = muteImageView;
        if (muteImageView != null) {
            muteImageView.setMute(true);
            this.e1.setVisibility(0);
            this.e1.setOnClickListener(new g());
            if (this.g0.O() == 4) {
                try {
                    if (SDMSDK.getInstance().getDirectlyOfferSetting().getDirectlySplashMuteIconVisible() != null) {
                        MuteImageView muteImageView2 = this.e1;
                        if (!SDMSDK.getInstance().getDirectlyOfferSetting().getDirectlySplashMuteIconVisible().booleanValue()) {
                            i2 = 8;
                        }
                        muteImageView2.setVisibility(i2);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void B() {
        D();
        this.d1 = (RoundImageView) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_ad_logo", "id"));
        this.f1 = (ImageView) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_player_view_cover_img_id", "id"));
        this.g1 = (ImageView) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_player_view_cover_icon_id", "id"));
        this.E0 = (ViewGroup) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_feedback_ll_id", "id"));
        y();
        if (i.g(this.g0, this.f0)) {
            A();
        } else {
            z();
        }
    }

    public abstract void D();

    public void E() {
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar != null) {
            aVar.b(2);
        }
    }

    public abstract void F();

    public void G() {
        if (this.r0 != null) {
            com.smartdigimkt.k3.d dVar = this.P0;
            if ((dVar == null || !dVar.a()) && !this.k1) {
                if (!this.b1 || this.f0.t.E1() == 1) {
                    this.r0.p();
                }
            }
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSplashATView
    public void beforeSplashEndCardShow() {
        super.beforeSplashEndCardShow();
        TextView textView = this.C0;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View view = this.q0;
        if (view != null) {
            view.setVisibility(8);
        }
        View viewFindViewById = findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_fl_invalid_btn", "id"));
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar != null) {
            aVar.b(5);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void c() {
        super.c();
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar != null) {
            aVar.a(this.s0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001e  */
    @Override // com.smartdigimkt.sdk.basead.ui.BaseSplashATView, com.smartdigimkt.sdk.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.j1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar != null) {
            int i2 = this.T0;
            int i3 = 2;
            if (i2 != 1) {
                if (i2 == 2) {
                    i3 = 1;
                } else if (i2 != 6) {
                    if (i2 != 7) {
                        i3 = 4;
                    } else {
                        i3 = 1;
                    }
                }
            }
            aVar.c(i3);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSplashATView
    public void onSplashEndCardCountDownTick(long j) {
        super.onSplashEndCardCountDownTick(j);
        if (this.i1 == null) {
            beforeSplashEndCardShow();
            SplashEndCardView splashEndCardView = new SplashEndCardView(getContext(), this.g0, this.f0);
            this.i1 = splashEndCardView;
            splashEndCardView.init(new b(), this.x0);
            RelativeLayout.LayoutParams layoutParamsF = androidx.media3.extractor.text.ttml.a.f(-2, -2, 13);
            this.i1.setAlpha(0.2f);
            addView(this.i1, layoutParamsF);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.2f, 1.0f);
            this.j1 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(500L);
            this.j1.setRepeatCount(0);
            View viewFindViewById = findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_splash_ad_content_image_area", "id"));
            this.j1.addUpdateListener(new c(viewFindViewById));
            this.j1.addListener(new d(viewFindViewById));
            this.j1.start();
        }
        this.i1.onCountDownTick(j);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSplashATView
    public boolean r() {
        return !this.k1 && this.f0.t.E1() == 1;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSplashATView
    public void u() {
        super.u();
        setOnClickListener(this.h1);
    }

    public void z() {
        this.k1 = true;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSplashATView, com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a(int i2) {
        super.a(i2);
        if (i2 == 110) {
            G();
        } else {
            if (i2 != 111) {
                return;
            }
            E();
        }
    }

    public BaseSdkSplashATView(Context context, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, com.smartdigimkt.f5.a aVar2) {
        super(context, aVar, fVar, aVar2);
        this.h1 = new a();
        this.k1 = false;
        F();
        u();
        a((com.smartdigimkt.l5.b) this.D0, false);
    }
}
