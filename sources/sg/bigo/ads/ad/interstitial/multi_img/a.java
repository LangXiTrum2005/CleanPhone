package sg.bigo.ads.ad.interstitial.multi_img;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ViewGroup f46362a;
    final ViewFlow d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f46365e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sg.bigo.ads.ad.interstitial.d f46366h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f46363b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f46364c = -1;
    public boolean f = true;
    float g = Float.MIN_VALUE;

    public a(ViewGroup viewGroup, ViewFlow viewFlow, sg.bigo.ads.ad.interstitial.d dVar, int i2) {
        this.f46362a = viewGroup;
        this.d = viewFlow;
        this.f46366h = dVar;
        this.f46365e = i2;
    }

    public final void a(final int i2) {
        if (this.f) {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    int i3 = i2;
                    if (i3 == aVar.f46363b && i3 == aVar.f46364c) {
                        aVar.b(i3);
                    }
                }
            });
        }
    }

    public final void b(int i2) {
        if (this.f) {
            View viewA = this.d.a(i2);
            Object tag = viewA.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f46423e);
            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                this.f46363b = i2;
                this.g = Float.MIN_VALUE;
                this.f46364c = i2;
                if (dVar.d(this.f46365e)) {
                    this.f46362a.setBackgroundColor(this.f46366h.a(dVar.f46428n));
                    return;
                }
                if (dVar.c(this.f46365e)) {
                    this.f46366h.a(dVar.o);
                    Bitmap bitmap = dVar.f46429p;
                    int i3 = dVar.q;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(viewA.getResources(), bitmap);
                    bitmapDrawable.setAlpha(i3);
                    ViewGroup viewGroup = this.f46362a;
                    if (bitmap == null) {
                        bitmapDrawable = null;
                    }
                    a(viewGroup, bitmapDrawable, (BitmapDrawable) null);
                }
            }
        }
    }

    public static void a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
        a(viewGroup, "adview_background_main_tag", bitmapDrawable);
        a(viewGroup, "adview_background_second_tag", bitmapDrawable2);
    }

    public static void a(ViewGroup viewGroup, Object obj, BitmapDrawable bitmapDrawable) {
        ImageView imageView;
        View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
        if (viewFindViewWithTag instanceof ImageView) {
            imageView = (ImageView) viewFindViewWithTag;
        } else {
            Context context = viewGroup.getContext();
            if (context != null) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setTag(obj);
                imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                u.a(imageView2, viewGroup, null, 0);
                imageView = imageView2;
            } else {
                imageView = null;
            }
        }
        if (imageView != null) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageDrawable(bitmapDrawable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    public final void a(sg.bigo.ads.ad.interstitial.multi_img.view.d dVar, float f, int i2) {
        Integer numValueOf;
        if (i2 != this.f46363b) {
            return;
        }
        boolean zD = dVar.d(this.f46365e);
        int i3 = zD ? dVar.f46428n : dVar.o;
        this.g = f;
        this.f46364c = f > 0.0f ? i2 - 1 : i2 + 1;
        View viewA = this.d.a(this.f46364c);
        if (viewA != null) {
            Object tag = viewA.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f46423e);
            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar2 = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                numValueOf = Integer.valueOf(zD ? dVar2.f46428n : dVar2.o);
            } else {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        int iA = this.f46366h.a(sg.bigo.ads.common.w.b.a(Math.abs(f), i3, numValueOf == null ? i3 : numValueOf.intValue()));
        if (zD) {
            this.f46362a.setBackgroundColor(iA);
        }
    }
}
