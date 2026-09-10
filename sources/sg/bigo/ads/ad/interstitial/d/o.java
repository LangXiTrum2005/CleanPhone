package sg.bigo.ads.ad.interstitial.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes7.dex */
public class o extends m {
    private View G;
    private TextView H;

    public o(sg.bigo.ads.ad.b.c cVar) {
        super(cVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final sg.bigo.ads.ad.interstitial.multi_img.d E() {
        sg.bigo.ads.ad.interstitial.multi_img.d dVarE = super.E();
        if (!L() || dVarE != sg.bigo.ads.ad.interstitial.multi_img.d.LTR) {
            return dVarE;
        }
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.s.a(((sg.bigo.ads.ad.interstitial.u) this).f46656c);
        return (!pVarA.a() || pVarA.f47362b < pVarA.f47363c) ? dVarE : sg.bigo.ads.ad.interstitial.multi_img.d.TILE;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final sg.bigo.ads.ad.interstitial.multi_img.c F() {
        return E() == sg.bigo.ads.ad.interstitial.multi_img.d.TILE ? sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_SELF : super.F();
    }

    public boolean L() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public void b(int i2) {
        super.b(i2);
        final View viewFindViewById = this.q.findViewById(R.id.inter_media_ad_desc);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setVisibility(4);
        if (i2 < 0) {
            return;
        }
        viewFindViewById.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.o.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) ((sg.bigo.ads.ad.interstitial.u) o.this).f46656c)) {
                    return;
                }
                viewFindViewById.setVisibility(0);
                o.b(o.this);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.625f, 1, 0.0f);
                translateAnimation.setDuration(600L);
                viewFindViewById.startAnimation(translateAnimation);
            }
        }, ((long) i2) * 1000);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m, sg.bigo.ads.ad.interstitial.d.a
    public final void t() {
        super.t();
        if (E() == sg.bigo.ads.ad.interstitial.multi_img.d.TILE) {
            if (this.f46053z != null) {
                ((m) this).y.setType(1);
                LinearLayout linearLayout = (LinearLayout) this.q.findViewById(R.id.inter_media_container);
                if (linearLayout != null) {
                    Object tag = this.f46053z.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f46423e);
                    if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.b) {
                        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = (sg.bigo.ads.ad.interstitial.multi_img.view.b) tag;
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bVar.k.getLayoutParams();
                        layoutParams.gravity = 17;
                        layoutParams.topMargin = 0;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.height = -1;
                        layoutParams.width = -1;
                        bVar.k.setLayoutParams(layoutParams);
                    }
                    ((m) this).x.removeView(this.f46053z);
                    Context context = ((m) this).x.getContext();
                    int iA = sg.bigo.ads.common.utils.e.a(context, 20);
                    int iA2 = sg.bigo.ads.common.utils.e.a(context, 12);
                    final LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.leftMargin = iA;
                    layoutParams2.rightMargin = iA;
                    layoutParams2.bottomMargin = iA2;
                    linearLayout.addView(this.f46053z, 1, layoutParams2);
                    final LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((m) this).x.getLayoutParams();
                    sg.bigo.ads.common.utils.u.a(((m) this).x, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.o.2
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            int iA3 = sg.bigo.ads.common.utils.e.a(((m) o.this).x.getContext(), 100);
                            int measuredHeight = ((m) o.this).x.getMeasuredHeight();
                            if (measuredHeight < iA3) {
                                LinearLayout.LayoutParams layoutParams4 = layoutParams3;
                                layoutParams4.weight = 0.0f;
                                layoutParams4.height = iA3;
                                ((m) o.this).x.setLayoutParams(layoutParams4);
                                int measuredHeight2 = o.this.f46053z.getMeasuredHeight();
                                LinearLayout.LayoutParams layoutParams5 = layoutParams2;
                                layoutParams5.height = measuredHeight2 - (iA3 - measuredHeight);
                                o.this.f46053z.setLayoutParams(layoutParams5);
                            }
                        }
                    });
                }
            }
            K();
        }
    }

    public static /* synthetic */ void b(o oVar) {
        View view = oVar.G;
        if (view == null || oVar.H == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        oVar.H.getLocationOnScreen(iArr2);
        ViewGroup.LayoutParams layoutParams = oVar.H.getLayoutParams();
        layoutParams.width = (iArr[0] - iArr2[0]) - sg.bigo.ads.common.utils.e.a(oVar.q.getContext(), 28);
        oVar.H.setLayoutParams(layoutParams);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void a(int i2, boolean z2, int i3, boolean z3) {
        if (E() == sg.bigo.ads.ad.interstitial.multi_img.d.TILE) {
            z3 = false;
            i3 = i2;
        }
        super.a(i2, z2, i3, z3);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public void a(sg.bigo.ads.ad.interstitial.r rVar) {
        super.a(rVar);
        this.G = rVar != null ? rVar.o(R.id.inter_btn_close) : null;
        TextView textView = (TextView) this.q.findViewById(R.id.inter_title);
        this.H = textView;
        this.o.b(textView);
        this.o.b(this.v);
        if (C()) {
            ((m) this).y.setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
            marginLayoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.v.getContext(), 0);
            this.v.setLayoutParams(marginLayoutParams);
        }
    }
}
