package sg.bigo.ads.ad.interstitial.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.MediaView;

/* JADX INFO: loaded from: classes7.dex */
public class w extends sg.bigo.ads.ad.d.f {
    protected boolean k;

    public w(sg.bigo.ads.ad.b.c cVar, sg.bigo.ads.api.a.m mVar) {
        super(cVar, mVar);
        this.k = false;
    }

    public final int a(final MediaView mediaView, sg.bigo.ads.ad.interstitial.t tVar, boolean z2) {
        int i2;
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f45682l;
        if ((mVar == null ? 1 : mVar.a("endpage.ad_component_layout")) == 1) {
            int width = mediaView.getWidth();
            int height = mediaView.getHeight();
            ViewGroup.LayoutParams layoutParams = mediaView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(width, height);
            } else {
                layoutParams.width = width;
                layoutParams.height = height;
            }
            mediaView.setLayoutParams(layoutParams);
        }
        this.k = false;
        sg.bigo.ads.ad.interstitial.a.b bVar = tVar.f46643A;
        if (bVar == null || bVar.f45820b || !bVar.f45819a) {
            i2 = 0;
        } else {
            if (bVar.b()) {
                View view = bVar.f.f45783i;
                if (view != null) {
                    mediaView.removeAllViews();
                    a(bVar, view, mediaView, new FrameLayout.LayoutParams(-1, -1, 17));
                    view.setTag(19);
                    mediaView.setTag(19);
                    bVar.a(1);
                    this.k = true;
                    sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "show playable");
                    i2 = 5;
                }
            } else {
                sg.bigo.ads.common.t.a.a(0, "PopupEndPageRender", "playableAdCompanion is not ResourceReady");
                bVar.f.f();
            }
            i2 = 0;
        }
        if (i2 == 0) {
            sg.bigo.ads.ad.interstitial.a.a aVar = tVar.f46644B;
            if (aVar == null || !aVar.f45773a) {
                i2 = 0;
            } else {
                if (aVar.b()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "[VastCompanion] companion resource is available and ready.");
                    View viewA = aVar.a();
                    if (viewA != null) {
                        sg.bigo.ads.ad.interstitial.c.b((ViewGroup) mediaView);
                        mediaView.removeAllViews();
                        sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "[VastCompanion] show companion end page view.");
                        a(aVar, viewA, mediaView, new FrameLayout.LayoutParams(-1, -1, 17));
                        viewA.setTag(20);
                        mediaView.setTag(20);
                        aVar.a(1);
                        sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "show companion");
                        this.k = aVar.f45774b instanceof sg.bigo.ads.ad.interstitial.a.a.b;
                        i2 = 7;
                    }
                } else {
                    sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "[VastCompanion] companion resource is not available.");
                    aVar.f();
                }
                i2 = 0;
            }
        }
        if (i2 == 0 && z2) {
            sg.bigo.ads.core.a.a aVarE = tVar.f();
            if (aVarE.bh() != null) {
                ((sg.bigo.ads.ad.d.f) this).f45683n = (Bitmap) aVarE.bh().first;
                sg.bigo.ads.ad.interstitial.c.a((ViewGroup) mediaView);
                mediaView.removeAllViews();
                a((ViewGroup) mediaView);
                mediaView.a((Bitmap) aVarE.bh().first);
                sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "show backup end image");
            } else {
                sg.bigo.ads.ad.interstitial.a.b bVar2 = tVar.f46643A;
                if (bVar2 != null && bVar2.b()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "video is not ready, endpage show HTML for backup.");
                    aVarE.j(3);
                    View view2 = bVar2.f.f45783i;
                    if (view2 != null) {
                        sg.bigo.ads.ad.interstitial.c.b((ViewGroup) mediaView);
                        mediaView.removeAllViews();
                        a(bVar2, view2, mediaView, new FrameLayout.LayoutParams(-1, -1, 17));
                        view2.setTag(19);
                        mediaView.setTag(19);
                        bVar2.a(1);
                        sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "show backup end HTML");
                        this.k = true;
                    }
                }
                i2 = 0;
            }
            i2 = 1;
        }
        if (i2 != 0) {
            return i2;
        }
        final ValueCallback<Bitmap> valueCallback = new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.w.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                if (bitmap2 == null || bitmap2.getWidth() <= 0 || bitmap2.getHeight() <= 0) {
                    return;
                }
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.w.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.this.g = bitmap2;
                        sg.bigo.ads.ad.interstitial.c.a((ViewGroup) mediaView);
                        mediaView.removeAllViews();
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        w.this.a((ViewGroup) mediaView);
                        mediaView.a(bitmap2);
                    }
                });
            }
        };
        Bitmap bitmap = this.f46658h;
        if (bitmap != null) {
            valueCallback.onReceiveValue(bitmap);
        } else {
            a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.w.2
                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(Bitmap bitmap2) {
                    valueCallback.onReceiveValue(bitmap2);
                }
            });
        }
        sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "show normal style");
        return 1;
    }

    public final void c(ViewGroup viewGroup) {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f45682l;
        boolean z2 = mVar != null && mVar.c("endpage.media_view_clickable_switch");
        sg.bigo.ads.api.a.m mVar2 = ((sg.bigo.ads.ad.d.f) this).f45682l;
        boolean z3 = mVar2 != null && mVar2.c("endpage.ad_component_clickable_switch");
        sg.bigo.ads.api.a.m mVar3 = ((sg.bigo.ads.ad.d.f) this).f45682l;
        boolean z4 = mVar3 != null && mVar3.c("endpage.other_space_clickable_switch");
        sg.bigo.ads.api.a.m mVar4 = ((sg.bigo.ads.ad.d.f) this).f45682l;
        a(viewGroup, z2, z3, z4, mVar4 != null ? mVar4.a("endpage.click_type") : 1);
    }

    @Override // sg.bigo.ads.ad.d.f
    public void d(ViewGroup viewGroup) {
        if (!this.k || viewGroup == null) {
            super.d(viewGroup);
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_warning);
        if (textView != null) {
            textView.setVisibility(8);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.inter_popup_msg);
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
    }

    @Override // sg.bigo.ads.ad.d.f
    public final boolean j() {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f45682l;
        if (mVar == null) {
            return false;
        }
        return mVar.c("endpage.is_widget");
    }

    @Override // sg.bigo.ads.ad.d.f
    public final int k() {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f45682l;
        if (mVar == null) {
            return 1;
        }
        return mVar.a("endpage.close_button_style");
    }

    @Override // sg.bigo.ads.ad.d.f
    public final boolean l() {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f45682l;
        if (mVar == null) {
            return false;
        }
        return mVar.c("endpage.is_cta_show_animation");
    }

    public final int m() {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f45682l;
        if (mVar == null) {
            return 0;
        }
        return mVar.a("endpage.force_staying_time", 0);
    }

    public final int n() {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f45682l;
        if (mVar != null) {
            return mVar.a("endpage.webview_layout");
        }
        return 0;
    }

    public final int o() {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f45682l;
        if (mVar != null) {
            return mVar.a("endpage.webview_force_time");
        }
        return 0;
    }

    @Override // sg.bigo.ads.ad.d.f
    public final void a(Context context, final ViewGroup viewGroup) {
        final sg.bigo.ads.ad.d.f.b bVar = new sg.bigo.ads.ad.d.f.b(context, viewGroup);
        viewGroup.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.w.5
            @Override // java.lang.Runnable
            public final void run() {
                bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                bVar.setBackgroundColor(Color.parseColor("#66000000"));
                sg.bigo.ads.common.utils.u.a(bVar, viewGroup, null, 1);
            }
        });
    }

    @Override // sg.bigo.ads.ad.d.f
    public void a(final AdCountDownButton adCountDownButton, ViewGroup viewGroup, sg.bigo.ads.ad.d.f.a aVar) {
        super.a(adCountDownButton, viewGroup, aVar);
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() == 0) {
            adCountDownButton.clearAnimation();
            adCountDownButton.setVisibility(4);
        }
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.w.4
            @Override // java.lang.Runnable
            public final void run() {
                if (adCountDownButton.getVisibility() == 4) {
                    adCountDownButton.setVisibility(0);
                }
            }
        }, ((long) m()) * 1000);
    }

    private void a(final sg.bigo.ads.ad.interstitial.a.b.a aVar, final View view, final ViewGroup viewGroup, final ViewGroup.LayoutParams layoutParams) {
        if (aVar == null || view == null || viewGroup == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 != null && layoutParams2.height == -2) {
            layoutParams2.height = -1;
            sg.bigo.ads.common.utils.u.a(viewGroup, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.c.w.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    aVar.a(viewGroup.getWidth(), viewGroup.getHeight());
                    sg.bigo.ads.common.utils.u.a(view, viewGroup, layoutParams, -1);
                }
            });
        } else {
            if (layoutParams2 != null) {
                aVar.a(layoutParams2.width, layoutParams2.height);
            }
            sg.bigo.ads.common.utils.u.a(view, viewGroup, layoutParams, -1);
        }
    }
}
