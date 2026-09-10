package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Rect;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes7.dex */
public class g extends a {
    protected View o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected RoundedImageView f45909p;
    protected TextView q;
    protected TextView r;
    protected Button s;

    public g(sg.bigo.ads.ad.b.c cVar, int i2, sg.bigo.ads.api.a.m mVar, sg.bigo.ads.ad.interstitial.e.c cVar2) {
        super(cVar, i2, mVar, cVar2);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public void a(double d) {
        TextView textView;
        int i2;
        if (d <= 3.0d) {
            textView = this.f45877l;
            if (textView == null) {
                return;
            } else {
                i2 = sg.bigo.ads.ad.interstitial.d.f45977b;
            }
        } else {
            textView = this.f45877l;
            if (textView == null) {
                return;
            } else {
                i2 = sg.bigo.ads.ad.interstitial.d.f45976a;
            }
        }
        textView.setTextColor(sg.bigo.ads.common.w.b.a(i2, 0.6f));
    }

    public final void b(Runnable runnable) {
        super.a(runnable);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public void d(sg.bigo.ads.ad.interstitial.r rVar) {
        ViewGroup viewGroup = this.k;
        if (viewGroup == null) {
            return;
        }
        this.o = viewGroup.findViewById(R.id.inter_end_page);
        l();
        this.q = (TextView) this.k.findViewById(R.id.inter_title);
        this.r = (TextView) this.k.findViewById(R.id.inter_description);
        this.f45909p = (RoundedImageView) this.k.findViewById(R.id.inter_icon);
        sg.bigo.ads.ad.interstitial.b bVar = sg.bigo.ads.ad.interstitial.b.f45825a;
        bVar.a(this.q, this.r);
        bVar.a(this.f45909p);
        a(f(rVar));
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final boolean f() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_14_15;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void i() {
        String strI = ((sg.bigo.ads.core.a.a) this.f.f()).i();
        TextView textView = (TextView) this.k.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(strI)) {
            textView.setVisibility(8);
        } else {
            textView.setText(strI);
        }
    }

    public void l() {
        if (this.o != null) {
            float fA = sg.bigo.ads.common.utils.e.a(this.k.getContext(), 16);
            this.o.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, -1));
            sg.bigo.ads.ad.interstitial.b.f45825a.b(this.o);
        }
    }

    public void m() {
        if (this.s == null || !j()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.c.e(this.s);
    }

    public void a(int i2) {
        Button button = (Button) this.k.findViewById(R.id.inter_btn_cta);
        this.s = button;
        if (button != null) {
            float fA = sg.bigo.ads.common.utils.e.a(this.k.getContext(), 8);
            this.s.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, i2));
            sg.bigo.ads.ad.interstitial.d.a(this.s, sg.bigo.ads.common.w.b.a(i2));
            sg.bigo.ads.ad.interstitial.b.f45825a.a(this.s);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public void a(int i2, boolean z2, boolean z3) {
        sg.bigo.ads.ad.b.a.a(this.o, 5);
        if (z2) {
            sg.bigo.ads.ad.b.a.a(this.j, this.o, 4, this.f, i2);
        } else {
            sg.bigo.ads.ad.b.a.a(this.j, this.o, 4, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
        }
        sg.bigo.ads.ad.b.a.a(this.k, 9);
        if (z3) {
            sg.bigo.ads.ad.b.a.a(this.j, this.k, 4, this.f, i2);
        } else {
            sg.bigo.ads.ad.b.a.a(this.j, this.k, 4, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public void a(final Runnable runnable) {
        final Runnable runnable2 = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.g.1
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable3 = runnable;
                if (runnable3 != null) {
                    runnable3.run();
                }
                g.this.m();
            }
        };
        if (this.k == null) {
            runnable2.run();
        } else {
            sg.bigo.ads.common.utils.u.c(this.o, 0, 0);
            this.k.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.g.2
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new sg.bigo.ads.common.utils.b.a() { // from class: sg.bigo.ads.ad.interstitial.c.g.2.1
                        @Override // sg.bigo.ads.common.utils.b.a
                        public final void a(TransitionValues transitionValues, TransitionValues transitionValues2) {
                            if (transitionValues.view == g.this.o) {
                                Rect rect = (Rect) transitionValues2.values.get("android:changeBounds:bounds");
                                transitionValues.values.put("android:changeBounds:bounds", new Rect(rect.centerX(), rect.centerY(), rect.centerX(), rect.centerY()));
                            }
                        }
                    });
                    transitionSet.setDuration(300L);
                    TransitionManager.beginDelayedTransition(g.this.k, transitionSet);
                    sg.bigo.ads.ad.interstitial.c.a(g.this.k, 0.1f, 1.0f, new sg.bigo.ads.common.utils.b.c() { // from class: sg.bigo.ads.ad.interstitial.c.g.2.2
                        @Override // sg.bigo.ads.common.utils.b.c, android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation) {
                            super.onAnimationEnd(animation);
                            runnable2.run();
                        }
                    });
                    sg.bigo.ads.common.utils.u.c(g.this.o, -1, -2);
                }
            });
        }
    }
}
