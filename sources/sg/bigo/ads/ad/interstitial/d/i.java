package sg.bigo.ads.ad.interstitial.d;

import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes7.dex */
public class i extends g {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private IconListView f46034N;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.d.i$4, reason: invalid class name */
    public class AnonymousClass4 implements sg.bigo.ads.common.utils.u.a {
        public AnonymousClass4() {
        }

        @Override // sg.bigo.ads.common.utils.u.a
        public final void a(Rect rect) {
            i.this.B();
        }
    }

    public i(sg.bigo.ads.ad.b.c cVar) {
        super(cVar);
    }

    public static /* synthetic */ void a(i iVar) {
        if (((b) iVar).y == null || iVar.f45986w) {
            return;
        }
        final boolean zV = iVar.v();
        final boolean[] zArr = {false, false};
        Context context = ((b) iVar).y.getContext();
        int iA = sg.bigo.ads.common.utils.e.a(context, 12);
        int iA2 = sg.bigo.ads.common.utils.e.a(context, 8);
        int iA3 = sg.bigo.ads.common.utils.e.a(context, 48);
        final a.C0812a c0812aU = iVar.u();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new b.a());
        transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.d.i.3
            @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                boolean[] zArr2 = zArr;
                zArr2[0] = true;
                sg.bigo.ads.ad.interstitial.multi_img.e.a(i.this.G, true, zArr2[1], zV);
            }

            @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
            public final void onTransitionStart(final Transition transition) {
                sg.bigo.ads.common.w.b.a(((b) i.this).y, -1, new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.d.i.3.1
                    @Override // sg.bigo.ads.common.w.b.a
                    public final long a() {
                        return transition.getDuration();
                    }
                });
                Button button = i.this.G;
                sg.bigo.ads.ad.interstitial.multi_img.e.a(button, button, c0812aU.f46007a, zArr, zV, transition.getDuration());
            }
        });
        transitionSet.setDuration(300L);
        TransitionManager.beginDelayedTransition(iVar.r, transitionSet);
        TextView textView = iVar.f46011E;
        if (textView != null) {
            sg.bigo.ads.common.w.b.a(textView.getCurrentTextColor(), sg.bigo.ads.ad.interstitial.b.f45825a.f, transitionSet.getDuration(), iVar.f46011E);
        }
        TextView textView2 = iVar.f46012F;
        if (textView2 != null) {
            sg.bigo.ads.common.w.b.a(textView2.getCurrentTextColor(), sg.bigo.ads.ad.interstitial.b.f45825a.g, transitionSet.getDuration(), iVar.f46012F);
        }
        ((b) iVar).y.setOutlineProvider(new sg.bigo.ads.common.view.b.b(sg.bigo.ads.common.utils.e.a(context, 12)));
        ((b) iVar).y.setPadding(iA, iA, iA, iA);
        ((b) iVar).y.getLayoutParams().width = sg.bigo.ads.common.utils.e.a(((b) iVar).y.getContext(), com.smartdigimkt.b0.a.a1);
        LinearLayout linearLayout = ((g) iVar).M;
        if (linearLayout != null) {
            linearLayout.setMinimumHeight(iA3);
            ((RelativeLayout.LayoutParams) ((g) iVar).M.getLayoutParams()).addRule(0, 0);
        }
        RoundedImageView roundedImageView = iVar.f46013I;
        if (roundedImageView != null) {
            ViewGroup.LayoutParams layoutParams = roundedImageView.getLayoutParams();
            layoutParams.width = iA3;
            layoutParams.height = iA3;
        }
        TextView textView3 = iVar.f46011E;
        if (textView3 != null) {
            textView3.setMaxLines(2);
        }
        int id = R.id.inter_text_layout;
        IconListView iconListView = iVar.f46034N;
        if (iconListView != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) iconListView.getLayoutParams();
            if (sg.bigo.ads.common.utils.k.a((Collection) iVar.f46034N.getItems())) {
                iVar.f46034N.setVisibility(8);
            } else {
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                layoutParams2.topMargin = iA2;
                id = iVar.f46034N.getId();
                iVar.f46034N.setVisibility(0);
                sg.bigo.ads.ad.interstitial.c.a(10, 100, 300L, new ValueCallback<Integer>() { // from class: sg.bigo.ads.ad.interstitial.d.i.5
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Integer num) {
                        i.this.f46034N.setAlpha((num.intValue() * 1.0f) / 100.0f);
                    }
                }, new ValueCallback<Void>() { // from class: sg.bigo.ads.ad.interstitial.d.i.6
                    @Override // android.webkit.ValueCallback
                    public final /* bridge */ /* synthetic */ void onReceiveValue(Void r1) {
                    }
                });
                iA = iA2;
            }
        }
        Button button = iVar.G;
        if (button != null) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) button.getLayoutParams();
            layoutParams3.width = -1;
            layoutParams3.addRule(3, id);
            layoutParams3.addRule(1, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
            layoutParams3.topMargin = iA;
        }
        sg.bigo.ads.ad.interstitial.b bVar = sg.bigo.ads.ad.interstitial.b.f45825a;
        bVar.a(iVar.f46011E, iVar.f46012F);
        bVar.b(((b) iVar).y);
        bVar.a(iVar.G);
        bVar.a(iVar.f46013I);
        ((b) iVar).y.requestLayout();
    }

    @Override // sg.bigo.ads.ad.interstitial.d.b
    public final void A() {
        if (((b) this).y == null) {
            return;
        }
        int iMax = Math.max(1, super.y());
        final Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.i.1
            @Override // java.lang.Runnable
            public final void run() {
                i.a(i.this);
            }
        };
        a(iMax, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.i.2
            @Override // java.lang.Runnable
            public final void run() {
                ((b) i.this).y.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.i.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i.this.f46034N != null) {
                            ((RelativeLayout.LayoutParams) i.this.f46034N.getLayoutParams()).width = (((b) i.this).y.getMeasuredWidth() - ((b) i.this).y.getPaddingLeft()) - ((b) i.this).y.getPaddingRight();
                            i.this.f46034N.requestLayout();
                        }
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        ((b) i.this).y.post(runnable);
                    }
                });
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.d.b
    public final void G() {
        super.G();
        IconListView iconListView = this.f46034N;
        if (iconListView != null) {
            List<IconListView.a> items = iconListView.getItems();
            for (int i2 = 0; items != null && i2 < items.size(); i2++) {
                IconListView.a aVar = items.get(i2);
                sg.bigo.ads.ad.b.a.a(aVar.d, 26);
                sg.bigo.ads.ad.b.a.a(this.q, aVar.d, 8, ((sg.bigo.ads.ad.interstitial.u) this).f46656c, this.s.f46717i);
                sg.bigo.ads.ad.b.a.a(aVar.g, 26);
                sg.bigo.ads.ad.b.a.a(this.q, aVar.g, 8, ((sg.bigo.ads.ad.interstitial.u) this).f46656c, this.s.f46717i);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.g
    public final void c(int i2) {
        Button button = this.G;
        if (button != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) button.getLayoutParams();
            layoutParams.addRule(11);
            layoutParams.addRule(1);
            LinearLayout linearLayout = ((g) this).M;
            if (linearLayout != null) {
                ((RelativeLayout.LayoutParams) linearLayout.getLayoutParams()).addRule(0, this.G.getId());
            }
        }
        super.c(i2);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final int y() {
        return Math.min(0, super.y());
    }

    @Override // sg.bigo.ads.ad.interstitial.d.g, sg.bigo.ads.ad.interstitial.d.b
    public final int z() {
        return R.id.inter_component_26;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.g, sg.bigo.ads.ad.interstitial.d.b
    public final boolean a(sg.bigo.ads.ad.interstitial.b bVar) {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout;
        if (!super.a(bVar) || (realtimeBlurLinearLayout = ((b) this).y) == null) {
            return false;
        }
        IconListView iconListView = (IconListView) realtimeBlurLinearLayout.findViewById(R.id.inter_download_msg);
        this.f46034N = iconListView;
        iconListView.a(this.f45985u);
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.g
    public final void b(int i2) {
    }
}
