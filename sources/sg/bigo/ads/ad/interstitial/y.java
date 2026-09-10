package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public class y extends a {
    protected boolean G;
    private boolean H;
    private final AtomicBoolean L;
    private boolean M;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.y$1, reason: invalid class name */
    public class AnonymousClass1 extends sg.bigo.ads.common.utils.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f46720a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, View view) {
            super(j, 1000L);
            this.f46720a = view;
        }

        @Override // sg.bigo.ads.common.utils.n
        public final void a() {
            y yVar = y.this;
            yVar.a(yVar.f45748u, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass1.this.f46720a.setVisibility(0);
                    c.a(AnonymousClass1.this.f46720a, new sg.bigo.ads.common.utils.b.c() { // from class: sg.bigo.ads.ad.interstitial.y.1.1.1
                        @Override // sg.bigo.ads.common.utils.b.c, android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            if (y.this.f46632E == null || anonymousClass1.f46720a.getTop() <= 0 || y.this.f46632E.getBottom() <= AnonymousClass1.this.f46720a.getTop() || !(y.this.f46632E.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                                return;
                            }
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) y.this.f46632E.getLayoutParams();
                            layoutParams.addRule(8, 0);
                            layoutParams.addRule(2, R.id.inter_ad_info);
                            y.this.f46632E.setLayoutParams(layoutParams);
                        }
                    });
                    y.this.E();
                    y.this.ae();
                }
            });
        }

        @Override // sg.bigo.ads.common.utils.n
        public final void a(long j) {
        }
    }

    public y(Activity activity) {
        super(activity);
        this.H = false;
        this.G = true;
        this.L = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        final View viewFindViewById;
        sg.bigo.ads.api.a.m mVar;
        if ((Z() instanceof sg.bigo.ads.ad.interstitial.d.a) || (viewFindViewById = this.D.findViewById(R.id.inter_btn_cta_layout)) == null) {
            return;
        }
        boolean z2 = this.d;
        if (!z2 || (mVar = ((a) this).f45741c) == null) {
            if (z2) {
                return;
            }
            this.k.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) y.this.y)) {
                        return;
                    }
                    c.e(viewFindViewById);
                }
            }, ((long) ((a) this).f45740b.a("interstitial_image_style.main_page.cta_impression")) * 1000);
        } else if (mVar.c("video_play_page.is_cta_show_animation")) {
            c.e(viewFindViewById);
        }
    }

    private void af() {
        Z().a();
        sg.bigo.ads.common.utils.n nVar = this.f45748u;
        if (nVar != null) {
            nVar.b();
        }
        if (this.L.get()) {
            c(this.f45748u, Z());
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public void C() {
        this.f45742e = true;
        super.C();
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void H() {
        long jA;
        int i2 = this.f45743h.j;
        sg.bigo.ads.api.a.m mVar = ((a) this).f45741c;
        int iA = mVar != null ? mVar.a("video_play_page.auto_click_sec") : 0;
        if (i2 == 2) {
            jA = sg.bigo.ads.common.utils.r.f47535a.a(5);
        } else if (i2 == 4) {
            jA = sg.bigo.ads.common.utils.r.f47535a.a(iA);
        } else if (i2 != 5) {
            return;
        } else {
            jA = sg.bigo.ads.common.utils.r.f47535a.a(Math.max(this.f45743h.f46714c - iA, 0));
        }
        if (jA >= 0) {
            if (jA == 0) {
                jA = 500;
            }
            this.f45749w = new sg.bigo.ads.common.utils.n(jA) { // from class: sg.bigo.ads.ad.interstitial.y.3
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    if (y.this.M) {
                        return;
                    }
                    y yVar = y.this;
                    if (yVar.f45742e) {
                        return;
                    }
                    yVar.f45742e = true;
                    ((t) yVar.y).f46647z.a(8, 22);
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j) {
                }
            };
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public int R() {
        if (!this.d) {
            int iA = ((a) this).f45740b.a("interstitial_image_style.image_format");
            if (iA == 1) {
                return R.layout.bigo_ad_activity_interstitial_native_top;
            }
            return iA == 2 ? R.layout.bigo_ad_activity_interstitial_bottom_card : R.layout.bigo_ad_activity_interstitial_native_center;
        }
        int iN = n();
        if (aq()) {
            if (iN == 1) {
                return R.layout.bigo_ad_activity_interstitial_style_landscape_1;
            }
            if (iN == 3) {
                return R.layout.bigo_ad_activity_interstitial_style_landscape_3;
            }
            if (iN != 4) {
                return iN != 5 ? R.layout.bigo_ad_activity_interstitial_style_landscape_2 : R.layout.bigo_ad_activity_interstitial_percent_warning_landscape;
            }
            return R.layout.bigo_ad_activity_interstitial_style_landscape_4;
        }
        switch (iN) {
            case 2:
                return R.layout.bigo_ad_activity_interstitial_rich_video_2;
            case 3:
                return R.layout.bigo_ad_activity_interstitial_rich_video_3;
            case 4:
                return R.layout.bigo_ad_activity_interstitial_rich_video_4;
            case 5:
                return R.layout.bigo_ad_activity_interstitial_rich_video_5;
            case 6:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_6;
            case 7:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_7;
            case 8:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_8;
            case 9:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_9;
            case 10:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_10;
            case 11:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_11;
            case 12:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_12;
            case 13:
            case 18:
                return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_13;
            case 14:
                return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_14;
            case 15:
                return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_15;
            case 16:
                return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_16;
            case 17:
                return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_17;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return R.layout.bigo_ad_activity_interstitial_rich_video_19_29;
            case 30:
                return R.layout.bigo_ad_activity_interstitial_percent_warning;
            case 31:
            case 32:
                return s.a(s.a(this.C), iN);
            default:
                return R.layout.bigo_ad_activity_interstitial_rich_video;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean S() {
        return this.d;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.f.b.InterfaceC0819b
    public final void a(int i2) {
        super.a(i2);
        this.M = true;
        sg.bigo.ads.common.utils.n nVar = this.f45749w;
        if (nVar != null) {
            nVar.b();
            this.f45749w = null;
        }
        if (c() == 0 && i2 == 0 && k() && !l()) {
            Z().f46167b = new e.a() { // from class: sg.bigo.ads.ad.interstitial.y.7
                @Override // sg.bigo.ads.ad.interstitial.e.a
                public final boolean a(Runnable runnable) {
                    y yVar = y.this;
                    return yVar.a(yVar.Z(), runnable);
                }
            };
            q qVar = this.r;
            if (qVar != null) {
                qVar.C = new q.c() { // from class: sg.bigo.ads.ad.interstitial.y.8
                    @Override // sg.bigo.ads.ad.interstitial.q.c
                    public final boolean a(Runnable runnable) {
                        y yVar = y.this;
                        return yVar.a(yVar.r, runnable);
                    }
                };
            }
            this.L.set(true);
            a(this.f45748u, Z(), this.r);
        }
    }

    public void ad() {
        MediaView mediaView;
        ViewGroup viewGroup = this.D;
        if (viewGroup == null || (mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media)) == null) {
            return;
        }
        if (!this.G) {
            mediaView.setMediaAreaClickable(false);
        }
        if (mediaView instanceof MaximumHeightMediaView) {
            ((MaximumHeightMediaView) mediaView).setMaxHeight(sg.bigo.ads.common.utils.e.c(this.f47011I) - sg.bigo.ads.common.utils.e.a(this.f47011I, 292));
        }
        I();
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public x b() {
        x xVar = new x();
        sg.bigo.ads.api.a.m mVar = ((a) this).f45741c;
        if (mVar == null) {
            this.d = false;
            xVar.f46712a = ((a) this).f45740b.c("interstitial_image_style.main_page.is_global_click");
            xVar.f46713b = ((a) this).f45740b.a("interstitial_image_style.main_page.impression_close_seconds");
            xVar.f46714c = ((a) this).f45740b.a("interstitial_image_style.main_page.close_click_seconds");
            xVar.d = ((a) this).f45740b.c("interstitial_image_style.main_page.is_jump_layer");
            xVar.f46715e = ((a) this).f45740b.a("interstitial_image_style.layer.impression_layer_close_seconds");
            xVar.j = 1;
            return xVar;
        }
        this.d = true;
        boolean zC = mVar.c("video_play_page.media_view_clickable_switch");
        xVar.f = zC;
        this.G = zC;
        xVar.f46716h = ((a) this).f45741c.c("video_play_page.ad_component_clickable_switch");
        xVar.g = ((a) this).f45741c.c("video_play_page.other_space_clickable_switch");
        xVar.f46717i = ((a) this).f45741c.a("video_play_page.click_type");
        xVar.k = ((a) this).f45741c.c("layer.other_space_clickable_switch");
        xVar.f46718l = ((a) this).f45741c.a("layer.click_type");
        xVar.f46712a = false;
        xVar.f46713b = 0;
        xVar.f46714c = ((a) this).f45741c.a("video_play_page.force_staying_time");
        xVar.d = ((a) this).f45741c.c("layer.is_show_layer");
        xVar.f46715e = ((a) this).f45741c.a("layer.force_staying_time");
        xVar.j = ((a) this).f45741c.a("video_play_page.auto_click");
        return xVar;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.f.b.InterfaceC0819b
    public final void d(int i2) {
        super.d(i2);
        if (c() != 0) {
            af();
        }
        if (this.L.compareAndSet(true, false)) {
            b(this.f45748u, Z(), this.r);
            e();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public boolean f(boolean z2) {
        q qVar;
        int iC = c();
        if (iC != 0 && iC != 10) {
            return z2;
        }
        v();
        b(true);
        if (iC != 10 && (qVar = this.r) != null && (qVar.y.a() || this.r.D)) {
            f(10);
            return false;
        }
        boolean zA = A();
        if (zA) {
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) ((t) this.y).f(), 9, 2);
        }
        return z2 && !zA;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void g(int i2) {
        ViewGroup viewGroupK;
        super.g(i2);
        if (this.D == null) {
            return;
        }
        a(false);
        u uVarZ = Z();
        if (uVarZ instanceof sg.bigo.ads.ad.interstitial.d.a) {
            if (uVarZ instanceof sg.bigo.ads.ad.interstitial.d.m) {
                sg.bigo.ads.ad.interstitial.d.m mVar = (sg.bigo.ads.ad.interstitial.d.m) uVarZ;
                if (!mVar.C()) {
                    return;
                } else {
                    viewGroupK = mVar.k();
                }
            } else {
                viewGroupK = ((sg.bigo.ads.ad.interstitial.d.a) uVarZ).k();
            }
            b(viewGroupK);
            return;
        }
        ad();
        k(i2);
        sg.bigo.ads.common.utils.n nVar = this.v;
        if (nVar != null) {
            nVar.c();
        }
        sg.bigo.ads.common.utils.n nVar2 = this.f45749w;
        if (nVar2 != null) {
            nVar2.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void h() {
        super.h();
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton != null && !adCountDownButton.f45723c) {
            adCountDownButton.c();
        }
        sg.bigo.ads.common.utils.n nVar = this.f45748u;
        if (nVar != null && nVar.e()) {
            this.f45748u.c();
        }
        sg.bigo.ads.common.utils.n nVar2 = this.f45749w;
        if (nVar2 != null && nVar2.e()) {
            this.f45749w.c();
        }
        q qVar = this.r;
        if (qVar != null) {
            qVar.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void j() {
        super.j();
        sg.bigo.ads.common.utils.n nVar = this.f45748u;
        if (nVar != null) {
            nVar.d();
        }
        sg.bigo.ads.common.utils.n nVar2 = this.f45749w;
        if (nVar2 != null) {
            nVar2.d();
        }
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton != null && !adCountDownButton.f45723c) {
            adCountDownButton.b();
        }
        q qVar = this.r;
        if (qVar != null) {
            qVar.d();
        }
    }

    public void k(int i2) {
        sg.bigo.ads.ad.b.c cVar;
        sg.bigo.ads.api.core.c.d popPage;
        sg.bigo.ads.api.a.m mVar;
        String str;
        RoundedFrameLayout roundedFrameLayout;
        if (t() || M()) {
            ViewGroup viewGroup = (ViewGroup) this.D.findViewById(R.id.inter_media_layout);
            TextView textView = (TextView) this.D.findViewById(R.id.inter_company);
            if (!(Z() instanceof sg.bigo.ads.ad.interstitial.d.a) && this.g && textView != null && (cVar = this.C) != null && (popPage = cVar.getPopPage()) != null && sg.bigo.ads.common.utils.q.a((CharSequence) popPage.f())) {
                String title = this.C.getTitle();
                if (sg.bigo.ads.common.utils.q.a((CharSequence) title)) {
                    textView.setText(R.string.bigo_ad_title_default);
                } else {
                    textView.setText(title);
                }
                textView.setVisibility(0);
            }
            if (viewGroup != null) {
                I();
                if (this.f) {
                    int iA = this.f47011I.getResources().getDisplayMetrics().widthPixels - sg.bigo.ads.common.utils.e.a(this.f47011I, 80);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.width = iA;
                    layoutParams.height = iA;
                    viewGroup.setLayoutParams(layoutParams);
                }
                b(viewGroup);
            }
        }
        e(i2);
        View viewFindViewById = this.D.findViewById(R.id.inter_ad_info);
        if (viewFindViewById != null) {
            int i3 = o().f46312a;
            if (i3 > 0) {
                Context context = viewFindViewById.getContext();
                ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.leftMargin = sg.bigo.ads.common.utils.e.a(context, 10);
                    marginLayoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(context, 10);
                    marginLayoutParams.bottomMargin = sg.bigo.ads.common.utils.e.a(context, i3);
                }
                View viewFindViewById2 = this.D.findViewById(R.id.inter_ad_info_background);
                if (viewFindViewById2 != null) {
                    if (viewFindViewById2 instanceof RoundedFrameLayout) {
                        roundedFrameLayout = (RoundedFrameLayout) viewFindViewById2;
                        roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 16));
                    }
                } else if (viewFindViewById instanceof RoundedFrameLayout) {
                    roundedFrameLayout = (RoundedFrameLayout) viewFindViewById;
                    roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 16));
                }
            }
            if (t() || M()) {
                ae();
                return;
            }
            if (this.d) {
                mVar = ((a) this).f45741c;
                str = "video_play_page.ad_component_show_time";
            } else {
                mVar = ((a) this).f45740b;
                str = "interstitial_video_style.video_play_page.impression_ad_seconds";
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(((long) mVar.a(str)) * 1000, viewFindViewById);
            this.f45748u = anonymousClass1;
            anonymousClass1.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public void x() {
        super.x();
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(false);
            this.f46325A.setTakeoverTickEvent(false);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public void y() {
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.f46325A.setVisibility(0);
            c.b((View) this.f46325A);
        }
        if (c() == 0) {
            this.f46325A.a(this.f45743h.f46714c, new AdCountDownButton.b() { // from class: sg.bigo.ads.ad.interstitial.y.6
                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
                public final void a() {
                    q qVar = y.this.r;
                    if (qVar != null) {
                        qVar.y.a(null);
                    }
                    y yVar = y.this;
                    if (yVar.f45743h.j != 3 || yVar.M) {
                        return;
                    }
                    y yVar2 = y.this;
                    if (yVar2.f45742e) {
                        return;
                    }
                    yVar2.f45742e = true;
                    sg.bigo.ads.common.t.a.a(0, 4, "Interstitial Static", "auto click when force staying finish");
                    ((t) y.this.y).f46647z.a(8, 22);
                }
            });
        }
    }

    private void b(final ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        viewGroup.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.4
            @Override // java.lang.Runnable
            public final void run() {
                y yVar = y.this;
                if (!yVar.d || ((a) yVar).f45741c == null || sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) yVar.y) || !((a) y.this).f45741c.c("video_play_page.img_animation")) {
                    return;
                }
                y.a(y.this, viewGroup);
            }
        }, 100L);
    }

    public static /* synthetic */ void a(y yVar, ViewGroup viewGroup) {
        final MediaView mediaView;
        if (viewGroup == null || (mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media)) == null) {
            return;
        }
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.5
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) y.this.y)) {
                    return;
                }
                MediaView mediaView2 = mediaView;
                View image = mediaView2.getImage();
                float fB = mediaView2.b(mediaView2.getHeight(), mediaView2.getWidth());
                AnimationSet animationSet = new AnimationSet(true);
                float f = fB * 1.5f;
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f, 1.0f, f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(500L);
                scaleAnimation.setStartOffset(300L);
                scaleAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(3));
                AlphaAnimation alphaAnimationE = androidx.media3.extractor.text.ttml.a.e(1.0f, 0.5f, 500L);
                alphaAnimationE.setStartOffset(300L);
                animationSet.setFillAfter(true);
                animationSet.addAnimation(scaleAnimation);
                animationSet.addAnimation(alphaAnimationE);
                animationSet.setAnimationListener(new sg.bigo.ads.common.utils.b.c() { // from class: sg.bigo.ads.ad.interstitial.c.13

                    /* JADX INFO: renamed from: b */
                    final /* synthetic */ float f45850b;

                    public AnonymousClass13() {
                        f = fB;
                    }

                    @Override // sg.bigo.ads.common.utils.b.c, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        MediaView mediaView3 = mediaView;
                        float f2 = f;
                        View image2 = mediaView3.getImage();
                        AnimationSet animationSet2 = new AnimationSet(true);
                        float f3 = f2 * 1.5f;
                        ScaleAnimation scaleAnimation2 = new ScaleAnimation(f3, 1.0f, f3, 1.0f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation2.setDuration(1500L);
                        scaleAnimation2.setInterpolator(sg.bigo.ads.common.utils.b.a(3));
                        AlphaAnimation alphaAnimationE2 = androidx.media3.extractor.text.ttml.a.e(0.5f, 1.0f, 1500L);
                        animationSet2.addAnimation(scaleAnimation2);
                        animationSet2.addAnimation(alphaAnimationE2);
                        if (image2 != null) {
                            image2.startAnimation(animationSet2);
                        }
                    }
                });
                if (image != null) {
                    image.startAnimation(animationSet);
                }
            }
        }, 100L);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void b(boolean z2) {
        super.b(z2);
        af();
    }
}
