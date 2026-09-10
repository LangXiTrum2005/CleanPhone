package sg.bigo.ads.ad.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.c.w;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f extends u {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final sg.bigo.ads.core.adview.h f45681p = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.d.f.1
        @Override // sg.bigo.ads.core.adview.h
        public final void a(int i2, int i3, int i4, int i5, int i6, int i7) {
            sg.bigo.ads.common.t.a.a(0, 4, "emptyClick", "emptyClick stop event Propagation");
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected m f45682l;
    protected b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Bitmap f45683n;
    protected d o;

    public interface a {
        void d_();
    }

    public static class b extends ImageView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private View f45692a;

        public b(Context context, View view) {
            super(context);
            this.f45692a = view;
        }

        @Override // android.widget.ImageView, android.view.View
        public final void onMeasure(int i2, int i3) {
            View view = this.f45692a;
            if (view == null) {
                super.onMeasure(i2, i3);
            } else {
                setMeasuredDimension(view.getMeasuredWidth(), this.f45692a.getMeasuredHeight());
            }
        }
    }

    public f(sg.bigo.ads.ad.b.c cVar) {
        super(cVar);
    }

    private Bitmap a(Context context, boolean z2) {
        Bitmap bitmapA;
        Bitmap bitmapA2 = sg.bigo.ads.common.utils.d.a(context.getResources(), z2 ? R.drawable.bigo_ad_layer_gift_shadow : R.drawable.bigo_ad_layer_heart_shadow);
        if (bitmapA2 == null || bitmapA2.getHeight() <= 0 || bitmapA2.getWidth() <= 0 || (bitmapA = sg.bigo.ads.common.utils.d.a(bitmapA2.getWidth(), bitmapA2.getHeight(), bitmapA2.getConfig())) == null) {
            return null;
        }
        Canvas canvas = new Canvas(bitmapA);
        int iA = sg.bigo.ads.common.utils.e.a(context, 1);
        canvas.drawBitmap(bitmapA2, z2 ? iA : -iA, iA, (Paint) null);
        float[] fArr = {0.0f, 75.0f, 85.0f};
        Color.colorToHSV(s.a(((u) this).f46656c, 3, null), fArr);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColorFilter(new PorterDuffColorFilter(Color.HSVToColor(fArr), PorterDuff.Mode.SRC_IN));
        Bitmap bitmapA3 = sg.bigo.ads.common.utils.d.a(context.getResources(), z2 ? R.drawable.bigo_ad_layer_gift_color : R.drawable.bigo_ad_layer_heart_color);
        if (bitmapA3 != null && bitmapA3.getHeight() > 0 && bitmapA3.getWidth() > 0) {
            canvas.drawBitmap(bitmapA3, 0.0f, 0.0f, paint);
            Bitmap bitmapA4 = sg.bigo.ads.common.utils.d.a(context.getResources(), z2 ? R.drawable.bigo_ad_gift_widget : R.drawable.bigo_ad_heart_widget);
            if (bitmapA4 != null) {
                canvas.drawBitmap(bitmapA4, 0.0f, 0.0f, (Paint) null);
            }
            return bitmapA;
        }
        return null;
    }

    public abstract void a(Context context, ViewGroup viewGroup);

    @Override // sg.bigo.ads.ad.interstitial.u
    public final void b(final ViewGroup viewGroup) {
        viewGroup.post(new Runnable() { // from class: sg.bigo.ads.ad.d.f.4
            @Override // java.lang.Runnable
            public final void run() {
                View viewFindViewWithTag = viewGroup.findViewWithTag("adview_background_main_tag");
                if (viewFindViewWithTag instanceof ImageView) {
                    f.this.m = (b) viewFindViewWithTag;
                } else {
                    Context context = viewGroup.getContext();
                    if (context != null) {
                        f.this.m = new b(context, viewGroup);
                        f.this.m.setTag("adview_background_main_tag");
                        f.this.m.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        sg.bigo.ads.common.utils.u.a(f.this.m, viewGroup, null, 0);
                        f.this.a(context, viewGroup);
                    }
                }
                b bVar = f.this.m;
                if (bVar != null) {
                    bVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    Bitmap bitmapA = f.a(f.this);
                    if (bitmapA != null) {
                        sg.bigo.ads.common.utils.d.a(f.this.m.getContext(), bitmapA, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.d.f.4.1
                            @Override // android.webkit.ValueCallback
                            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                                Bitmap bitmap2 = bitmap;
                                if (bitmap2 != null) {
                                    f.this.m.setImageBitmap(bitmap2);
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    public void d(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        final TextView textView = (TextView) viewGroup.findViewById(R.id.inter_warning);
        final ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.media_layout);
        if (textView == null || viewGroup2 == null) {
            return;
        }
        sg.bigo.ads.common.utils.u.a(viewGroup2, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.d.f.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                textView.getLayoutParams().height = Math.round(viewGroup2.getHeight() * 15 * 0.01f);
            }
        });
    }

    public final void f(ViewGroup viewGroup) {
        final View viewFindViewById = viewGroup != null ? viewGroup.findViewById(R.id.inter_btn_cta_layout) : null;
        if (viewFindViewById == null) {
            return;
        }
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.d.f.2
            @Override // java.lang.Runnable
            public final void run() {
                if (f.this.l()) {
                    sg.bigo.ads.ad.interstitial.c.e(viewFindViewById);
                } else {
                    viewFindViewById.clearAnimation();
                }
            }
        });
    }

    public final void g(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        a(viewGroup, (ImageView) viewGroup.findViewById(R.id.gift_widget), true);
        a(viewGroup, (ImageView) viewGroup.findViewById(R.id.heart_widget), false);
    }

    public final void h(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_title);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_description);
        if (q.a((CharSequence) ((u) this).f46656c.getDescription())) {
            if (textView != null) {
                textView.setLines(2);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
    }

    public abstract boolean j();

    public abstract int k();

    public abstract boolean l();

    public final void p() {
        n nVar;
        d dVar = this.o;
        if (dVar == null || (nVar = dVar.f45678e) == null) {
            return;
        }
        nVar.d();
    }

    public final void q() {
        n nVar;
        d dVar = this.o;
        if (dVar == null || dVar.f || (nVar = dVar.f45678e) == null || !nVar.e()) {
            return;
        }
        dVar.f45678e.c();
    }

    public f(sg.bigo.ads.ad.b.c cVar, m mVar) {
        this(cVar);
        this.f45682l = mVar;
    }

    public static /* synthetic */ Bitmap a(f fVar) {
        Bitmap bitmap = fVar.g;
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmap2 = fVar.f45683n;
        if (bitmap2 != null) {
            return bitmap2;
        }
        o oVar = (o) ((u) fVar).f46656c.f();
        if (oVar.bh() == null) {
            return null;
        }
        Bitmap bitmap3 = (Bitmap) oVar.bh().first;
        fVar.f45683n = bitmap3;
        return bitmap3;
    }

    private void a(ViewGroup viewGroup, ImageView imageView, boolean z2) {
        if (imageView == null) {
            return;
        }
        if (!j()) {
            imageView.clearAnimation();
            imageView.setVisibility(4);
            return;
        }
        imageView.setImageBitmap(a(imageView.getContext(), z2));
        sg.bigo.ads.ad.interstitial.c.a(imageView, z2);
        imageView.setVisibility(0);
        imageView.setTag(32);
        int i2 = this instanceof w ? 9 : 8;
        sg.bigo.ads.ad.b.c cVar = ((u) this).f46656c;
        sg.bigo.ads.ad.b.a.a(viewGroup, imageView, i2, cVar, cVar.f45465I);
    }

    public final void a(ViewGroup viewGroup, boolean z2, boolean z3, boolean z4, int i2) {
        int i3 = this instanceof w ? 9 : 8;
        MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media);
        if (mediaView != null) {
            mediaView.setTag(5);
        }
        if (mediaView != null) {
            sg.bigo.ads.ad.b.a.a(viewGroup, mediaView, i3, ((u) this).f46656c, i2);
            if (z2) {
                mediaView.setMediaAreaClickable(true);
                mediaView.b().a(false);
            } else {
                mediaView.setMediaAreaClickable(false);
                mediaView.b().a(true);
            }
        }
        viewGroup.setTag(31);
        sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup, i3, z4 ? ((u) this).f46656c : f45681p, i2);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.inter_ad_info);
        if (viewGroup2 != null) {
            viewGroup2.setTag(18);
            sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup2, i3, z3 ? ((u) this).f46656c : f45681p, i2);
        }
    }

    public void a(AdCountDownButton adCountDownButton, ViewGroup viewGroup, a aVar) {
        if (adCountDownButton == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int iK = k();
        if (iK != 1) {
            if (iK == 3) {
                layoutParams.addRule(7, R.id.media_layout);
                layoutParams.addRule(2, R.id.media_layout);
            } else {
                if (iK != 4) {
                    return;
                }
                layoutParams.addRule(7, R.id.media_layout);
                layoutParams.addRule(6, R.id.media_layout);
                layoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(adCountDownButton.getContext(), 12);
                layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(adCountDownButton.getContext(), 12);
            }
            adCountDownButton.setLayoutParams(layoutParams);
        }
        layoutParams.addRule(2, R.id.media_layout);
        layoutParams.addRule(14, -1);
        layoutParams.bottomMargin = sg.bigo.ads.common.utils.e.a(adCountDownButton.getContext(), -84);
        adCountDownButton.setLayoutParams(layoutParams);
    }
}
