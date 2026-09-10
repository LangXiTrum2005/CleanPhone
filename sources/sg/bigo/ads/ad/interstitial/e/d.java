package sg.bigo.ads.ad.interstitial.e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final sg.bigo.ads.ad.interstitial.e.b.a f46231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final List<NativeAd> f46232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final sg.bigo.ads.ad.interstitial.e.a.b f46233c;
    protected final Context d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final b f46234e;
    protected boolean f = false;
    protected final sg.bigo.ads.ad.interstitial.e.a.b.a g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final float f46235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f46236i;

    public d(sg.bigo.ads.ad.interstitial.e.b.a aVar, List<NativeAd> list, sg.bigo.ads.ad.interstitial.e.a.b bVar) {
        this.f46231a = aVar;
        this.f46232b = list;
        this.f46233c = bVar;
        Context context = aVar.getContext();
        this.d = context;
        this.g = bVar.c();
        this.f46235h = sg.bigo.ads.common.utils.e.a(context, 1);
        this.f46236i = sg.bigo.ads.common.utils.e.a(context, 4);
        this.f46234e = a();
    }

    public abstract List<View> a(a aVar);

    public abstract b a();

    public final void a(int i2, int i3, int i4, int i5) {
        this.f46231a.setPadding(sg.bigo.ads.common.utils.e.a(this.d, i2), sg.bigo.ads.common.utils.e.a(this.d, i3), sg.bigo.ads.common.utils.e.a(this.d, i4), sg.bigo.ads.common.utils.e.a(this.d, i5));
    }

    public final int b() {
        return this.f46232b.size();
    }

    public final void c() {
        a(this.f46231a, (b) null);
    }

    public final void a(View view) {
        a(view, (b) null);
    }

    public final void b(View view) {
        view.setPadding(sg.bigo.ads.common.utils.e.a(this.d, 12), sg.bigo.ads.common.utils.e.a(this.d, 0), sg.bigo.ads.common.utils.e.a(this.d, 12), sg.bigo.ads.common.utils.e.a(this.d, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(View view, b bVar) {
        if (bVar == null) {
            bVar = this.f46234e;
        }
        if (bVar == null || view == 0) {
            return;
        }
        Drawable drawableA = bVar.a();
        if (drawableA != null) {
            view.setBackground(drawableA);
            view.setPadding(0, 0, 0, 0);
        } else if (view instanceof sg.bigo.ads.common.view.a.c) {
            ((sg.bigo.ads.common.view.a.c) view).setBlurStyle(bVar);
        }
    }

    public void a(TextView textView) {
    }

    public final void a(a aVar, boolean z2) {
        this.f46231a.removeAllViews();
        List<View> listA = a(aVar);
        if (sg.bigo.ads.common.utils.k.a((Collection) listA)) {
            return;
        }
        for (int i2 = 0; i2 < listA.size() && i2 < this.f46232b.size(); i2++) {
            View view = listA.get(i2);
            NativeAd nativeAd = this.f46232b.get(i2);
            if (view != null && nativeAd != null) {
                ArrayList arrayList = new ArrayList();
                RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) view.findViewById(R.id.inter_icon_ads_icon_item_layout);
                if (roundedFrameLayout != null) {
                    roundedFrameLayout.setStrokeWidth(this.f46235h);
                    roundedFrameLayout.setStrokeColor(this.g.j);
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.inter_icon_ads_item_icon);
                if (imageView != null) {
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    imageView.setTag(1);
                    arrayList.add(imageView);
                    imageView.setBackgroundColor(this.g.f46185i);
                    imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(imageView.getContext(), R.drawable.bigo_ad_icon_default));
                }
                TextView textView = (TextView) view.findViewById(R.id.inter_icon_ads_item_title);
                if (textView != null) {
                    if (z2) {
                        textView.setTextColor(this.g.d);
                    }
                    textView.setText(nativeAd.getTitle());
                    textView.setTag(2);
                    arrayList.add(textView);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.inter_icon_ads_item_sponsored);
                if (textView2 != null) {
                    if (z2) {
                        textView2.setTextColor(this.g.d);
                    }
                    textView2.setText(nativeAd.getSponsored());
                    textView2.setTag(3);
                    a(textView2);
                    arrayList.add(textView2);
                }
                TextView textView3 = (TextView) view.findViewById(R.id.inter_icon_ads_item_desc);
                if (textView3 != null) {
                    if (z2) {
                        textView3.setTextColor(this.g.d);
                    }
                    textView3.setText(nativeAd.getDescription());
                    textView3.setTag(6);
                    arrayList.add(textView3);
                }
                Button button = (Button) view.findViewById(R.id.inter_icon_ads_item_btn_cta);
                if (button != null) {
                    button.setText(nativeAd.getCallToAction());
                    button.setTag(7);
                    arrayList.add(button);
                    float f = this.f46236i;
                    sg.bigo.ads.ad.interstitial.e.a.b.a aVar2 = this.g;
                    button.setBackground(sg.bigo.ads.common.utils.d.a(f, f, f, f, aVar2.k, aVar2.f46186l, this.f46235h));
                }
                ViewGroup viewGroup = listA.size() == 1 ? this.f46231a : (ViewGroup) view;
                if (nativeAd instanceof sg.bigo.ads.ad.b.c) {
                    sg.bigo.ads.ad.b.c cVar = (sg.bigo.ads.ad.b.c) nativeAd;
                    cVar.f45465I = this.f46233c.l();
                    if (this.f) {
                        sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup, 1, cVar, this.f46233c.l());
                    }
                }
                nativeAd.registerViewForInteraction(viewGroup, (MediaView) null, imageView, (AdOptionsView) null, arrayList);
            }
        }
    }

    public final void a(b bVar) {
        a(this.f46231a, bVar);
    }
}
