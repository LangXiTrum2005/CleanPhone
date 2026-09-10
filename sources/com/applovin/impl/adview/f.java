package com.applovin.impl.adview;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.o1;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
class f extends Dialog implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f7496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f7498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f7499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f7500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RelativeLayout f7501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f7502g;

    public f(com.applovin.impl.sdk.ad.a aVar, b bVar, Activity activity, com.applovin.impl.sdk.l lVar) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f7497b = lVar;
        this.f7498c = lVar.Q();
        this.f7496a = activity;
        this.f7499d = bVar;
        this.f7500e = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    private void g() {
        this.f7496a.runOnUiThread(new t(this, 1));
    }

    @Override // com.applovin.impl.o1
    public void dismiss(String str) {
        this.f7496a.runOnUiThread(new t(this, 0));
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f7499d.a("javascript:al_onBackPressed();");
        dismiss("expanded_ad_dialog_back_button");
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f7496a.getWindow().getAttributes().flags, this.f7496a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (com.applovin.impl.sdk.p.a()) {
                this.f7498c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7498c.a("ExpandedAdDialog", "Setting window flags failed.", th2);
            }
        }
    }

    private void a() {
        this.f7499d.a("javascript:al_onCloseTapped();");
        dismiss("expanded_ad_dialog_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.f7502g.isClickable()) {
            this.f7502g.performClick();
        }
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f7499d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f7496a);
        this.f7501f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f7501f.setBackgroundColor(-1157627904);
        this.f7501f.addView(this.f7499d);
        if (!this.f7500e.i1()) {
            a(this.f7500e.c1());
            g();
        }
        setContentView(this.f7501f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f7501f.removeView(this.f7499d);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            if (this.f7502g == null) {
                a();
            }
            this.f7502g.setVisibility(0);
            this.f7502g.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.f7502g.startAnimation(alphaAnimation);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7498c.a("ExpandedAdDialog", "Unable to fade in close button", th2);
            }
            a();
        }
    }

    public b c() {
        return this.f7499d;
    }

    private void a(e.a aVar) {
        if (this.f7502g != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7498c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        e eVarA = e.a(aVar, this.f7496a);
        this.f7502g = eVarA;
        eVarA.setVisibility(8);
        final int i10 = 0;
        this.f7502g.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f7527b;

            {
                this.f7527b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                f fVar = this.f7527b;
                switch (i11) {
                    case 0:
                        fVar.a(view);
                        break;
                    default:
                        fVar.b(view);
                        break;
                }
            }
        });
        this.f7502g.setClickable(false);
        int iA = a(((Integer) this.f7497b.a(z4.D1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.l lVar = this.f7497b;
        z4 z4Var = z4.G1;
        layoutParams.addRule(((Boolean) lVar.a(z4Var)).booleanValue() ? 9 : 11);
        this.f7502g.a(iA);
        int iA2 = a(((Integer) this.f7497b.a(z4.F1)).intValue());
        int iA3 = a(((Integer) this.f7497b.a(z4.E1)).intValue());
        layoutParams.setMargins(iA3, iA2, iA3, 0);
        this.f7501f.addView(this.f7502g, layoutParams);
        this.f7502g.bringToFront();
        int iA4 = a(((Integer) this.f7497b.a(z4.H1)).intValue());
        View view = new View(this.f7496a);
        view.setBackgroundColor(0);
        int i11 = iA + iA4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i11, i11);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f7497b.a(z4Var)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(iA3 - a(5), iA2 - a(5), iA3 - a(5), 0);
        final int i12 = 1;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f7527b;

            {
                this.f7527b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                f fVar = this.f7527b;
                switch (i13) {
                    case 0:
                        fVar.a(view2);
                        break;
                    default:
                        fVar.b(view2);
                        break;
                }
            }
        });
        this.f7501f.addView(view, layoutParams2);
        view.bringToFront();
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f7500e;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            f.this.f7502g.setClickable(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    private int a(int i10) {
        return AppLovinSdkUtils.dpToPx(this.f7496a, i10);
    }
}
