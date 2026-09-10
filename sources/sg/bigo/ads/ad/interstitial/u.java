package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;

/* JADX INFO: loaded from: classes7.dex */
public class u extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.ad.b.c f46656c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ImageView f46657e;
    ImageView f;
    public Bitmap g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Bitmap f46658h;
    private int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<w> f46660l = new ArrayList();
    private boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f46661n = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46659i = 0;
    final AtomicBoolean j = new AtomicBoolean(false);
    final d d = new d();

    public interface a {
        Pair<String, String> a(TextView textView, String str, String str2);
    }

    public u(sg.bigo.ads.ad.b.c cVar) {
        this.f46656c = cVar;
    }

    public final synchronized void a(Bitmap bitmap) {
        try {
            this.g = bitmap;
            Iterator<w> it = this.f46660l.iterator();
            while (it.hasNext()) {
                it.next().a();
                it.remove();
            }
            this.k = 2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b(final ViewGroup viewGroup) {
        sg.bigo.ads.common.utils.d.a(viewGroup.getContext(), this.g, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.u.4
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                View viewFindViewWithTag = viewGroup.findViewWithTag("adview_background_main_tag");
                if (viewFindViewWithTag instanceof ImageView) {
                    u.this.f = (ImageView) viewFindViewWithTag;
                } else {
                    Context context = viewGroup.getContext();
                    if (context != null) {
                        u.this.f = new ImageView(context);
                        u.this.f.setTag("adview_background_main_tag");
                        u.this.f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        sg.bigo.ads.common.utils.u.a(u.this.f, viewGroup, null, 0);
                    }
                }
                ImageView imageView = u.this.f;
                if (imageView == null || bitmap2 == null) {
                    return;
                }
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                u.this.f.setImageBitmap(bitmap2);
            }
        });
    }

    public final void d() {
        if (this.g == null) {
            ImageView imageView = this.f46657e;
            if (imageView != null && this.m) {
                a(imageView);
            }
            if (this.f == null || !this.f46661n) {
                return;
            }
            a(new w() { // from class: sg.bigo.ads.ad.interstitial.u.9
                @Override // sg.bigo.ads.ad.interstitial.w
                public final void a() {
                    final Bitmap bitmapB = sg.bigo.ads.common.utils.d.b(u.this.f.getContext(), u.this.g);
                    u.this.f.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.u.9.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            u.this.f.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            sg.bigo.ads.common.utils.d.a(u.this.f, bitmapB);
                        }
                    });
                }
            });
        }
    }

    public d e() {
        return this.d;
    }

    public void f() {
    }

    public final synchronized Bitmap g() {
        Bitmap bitmap = this.f46658h;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        return this.f46658h;
    }

    public final synchronized sg.bigo.ads.common.p h() {
        Bitmap bitmap = this.f46658h;
        if (bitmap != null) {
            return new sg.bigo.ads.common.p(bitmap.getWidth(), this.f46658h.getHeight());
        }
        return new sg.bigo.ads.common.p(-1, -1);
    }

    public final synchronized void i() {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) this.f46656c.f();
        if (aVar.aR()) {
            Bitmap bitmap = this.f46658h;
            if (bitmap == null || bitmap.isRecycled()) {
                if (this.j.compareAndSet(false, true)) {
                    String strAT = aVar.aT();
                    if (sg.bigo.ads.common.utils.q.a((CharSequence) strAT)) {
                        return;
                    }
                    sg.bigo.ads.common.p.e.a(this.f46656c.f45584b.f47035e, strAT, aVar.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.u.6
                        @Override // sg.bigo.ads.common.p.g
                        public final void a(int i2, String str, String str2) {
                            u.this.j.set(false);
                        }

                        @Override // sg.bigo.ads.common.p.g
                        public final void a(Bitmap bitmap2, sg.bigo.ads.common.p.f fVar) {
                            u uVar = u.this;
                            uVar.f46658h = bitmap2;
                            uVar.f46659i = sg.bigo.ads.common.w.b.a(bitmap2, 0);
                            u.this.j.set(false);
                        }
                    });
                }
            }
        }
    }

    public static void a(View view) {
        AdOptionsView adOptionsView;
        if (view == null || (adOptionsView = (AdOptionsView) view.findViewById(R.id.inter_options)) == null) {
            return;
        }
        adOptionsView.setVisibility(adOptionsView.findViewWithTag("ad_options_real_view") == null ? 8 : 0);
    }

    private synchronized void b(final ValueCallback<Bitmap> valueCallback) {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) this.f46656c.f();
        if (!aVar.aR()) {
            String strAT = aVar.aT();
            if (sg.bigo.ads.common.utils.q.a((CharSequence) strAT)) {
                valueCallback.onReceiveValue(null);
                return;
            } else {
                sg.bigo.ads.common.p.e.a(this.f46656c.f45584b.f47035e, strAT, aVar.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.u.14
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i2, String str, String str2) {
                        valueCallback.onReceiveValue(null);
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
                        valueCallback.onReceiveValue(bitmap);
                    }
                });
                return;
            }
        }
        String strB = sg.bigo.ads.common.o.b(this.f46656c.f45584b.f47035e, aVar.aN());
        if (sg.bigo.ads.common.utils.q.a((CharSequence) strB)) {
            valueCallback.onReceiveValue(null);
        } else {
            final String path = Uri.parse(strB).getPath();
            sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.u.13
                @Override // java.lang.Runnable
                public final void run() {
                    valueCallback.onReceiveValue(sg.bigo.ads.common.utils.d.a(Uri.parse(path).getPath(), u.this.f46656c.f45584b.f47035e));
                }
            });
        }
    }

    public void a(final ViewGroup viewGroup) {
        this.f46661n = true;
        a(new w() { // from class: sg.bigo.ads.ad.interstitial.u.3
            @Override // sg.bigo.ads.ad.interstitial.w
            public final void a() {
                Integer numA = sg.bigo.ads.common.w.b.a(u.this.g);
                if (numA != null) {
                    u.this.d.a(numA.intValue());
                }
                u.this.b(viewGroup);
            }
        });
    }

    public final void a(final ViewGroup viewGroup, final int i2) {
        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.u.5
            @Override // java.lang.Runnable
            public final void run() {
                View viewFindViewWithTag = viewGroup.findViewWithTag("adview_background_main_tag");
                if (viewFindViewWithTag instanceof ImageView) {
                    u.this.f = (ImageView) viewFindViewWithTag;
                } else {
                    Context context = viewGroup.getContext();
                    if (context != null) {
                        u.this.f = new ImageView(context);
                        u.this.f.setTag("adview_background_main_tag");
                        u.this.f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        sg.bigo.ads.common.utils.u.a(u.this.f, viewGroup, null, 0);
                    }
                }
                ImageView imageView = u.this.f;
                if (imageView != null) {
                    imageView.setBackgroundColor(i2);
                }
            }
        });
    }

    public void a(ViewGroup viewGroup, View view, int i2, int i3, int i4, View... viewArr) {
        a(viewGroup, view, null, i2, i3, i4, viewArr);
    }

    /* JADX WARN: Type inference failed for: r15v26, types: [sg.bigo.ads.api.core.c] */
    public void a(ViewGroup viewGroup, View view, a aVar, int i2, int i3, int i4, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        sg.bigo.ads.api.core.c.d popPage = this.f46656c.getPopPage();
        TextView textView = (TextView) view.findViewById(R.id.inter_title);
        if (textView != null) {
            textView.setTag(2);
            a(aVar, textView, this.f46656c.getTitle(), popPage == null ? "" : popPage.b());
            arrayList.add(textView);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.inter_description);
        if (textView2 != null) {
            textView2.setTag(6);
            a(aVar, textView2, this.f46656c.getDescription(), popPage == null ? "" : popPage.c());
            arrayList.add(textView2);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.inter_warning);
        if (textView3 != null) {
            textView3.setTag(8);
            String warning = this.f46656c.getWarning();
            if (TextUtils.isEmpty(warning)) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(warning);
            }
            arrayList.add(textView3);
        }
        TextView textView4 = (TextView) view.findViewById(R.id.inter_btn_cta);
        if (textView4 != null) {
            textView4.setTag(7);
            a(aVar, textView4, this.f46656c.getCallToAction(), "");
            arrayList.add(textView4);
        }
        TextView textView5 = (TextView) view.findViewById(R.id.inter_btn_cta_main);
        if (textView5 != null) {
            textView5.setTag(7);
            a(aVar, textView5, sg.bigo.ads.common.utils.a.a(textView5.getContext(), R.string.bigo_ad_cta_default, new Object[0]), "");
            arrayList.add(textView5);
        }
        final ImageView imageView = (ImageView) view.findViewById(R.id.inter_end_page_image);
        if (imageView != null) {
            imageView.setTag(5);
            final ValueCallback<Bitmap> valueCallback = new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.u.1
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    final Bitmap bitmap2 = bitmap;
                    imageView.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.u.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            imageView.setImageBitmap(bitmap2);
                        }
                    });
                }
            };
            Bitmap bitmap = this.f46658h;
            if (bitmap != null) {
                valueCallback.onReceiveValue(bitmap);
            } else {
                a(new w() { // from class: sg.bigo.ads.ad.interstitial.u.7
                    @Override // sg.bigo.ads.ad.interstitial.w
                    public final void a() {
                        valueCallback.onReceiveValue(u.this.g);
                    }
                });
            }
        }
        TextView textView6 = (TextView) view.findViewById(R.id.inter_company);
        if (textView6 != null) {
            textView6.setTag(26);
            if (popPage == null || sg.bigo.ads.common.utils.q.a((CharSequence) popPage.f())) {
                textView6.setVisibility(8);
            } else {
                a(aVar, textView6, popPage.f(), "");
            }
            arrayList.add(textView6);
        }
        TextView textView7 = (TextView) view.findViewById(R.id.inter_star_num);
        View viewFindViewById = view.findViewById(R.id.inter_star_layout);
        if (textView7 != null && viewFindViewById != null) {
            viewFindViewById.setTag(26);
            textView7.setText(sg.bigo.ads.ad.b.f.c(((sg.bigo.ads.core.a.a) this.f46656c.f()).n()));
            arrayList.add(viewFindViewById);
        }
        TextView textView8 = (TextView) view.findViewById(R.id.inter_commit_num);
        if (textView8 != null) {
            textView8.setTag(26);
            StringBuilder sbX = android.support.v4.media.a.x(sg.bigo.ads.ad.b.f.b(((sg.bigo.ads.core.a.a) this.f46656c.f()).n()), " ");
            sbX.append(sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), R.string.bigo_ad_comment_num_text, new Object[0]));
            textView8.setText(sbX.toString());
            arrayList.add(textView8);
        }
        TextView textView9 = (TextView) view.findViewById(R.id.inter_download_num);
        View viewFindViewById2 = view.findViewById(R.id.inter_download_num_layout);
        if (textView9 != null && viewFindViewById2 != null) {
            viewFindViewById2.setTag(26);
            textView9.setText(sg.bigo.ads.ad.b.f.a(((sg.bigo.ads.core.a.a) this.f46656c.f()).n()));
            arrayList.add(viewFindViewById2);
        }
        View viewFindViewById3 = view.findViewById(R.id.inter_everyone_layout);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setTag(26);
            arrayList.add(viewFindViewById3);
        }
        this.f46657e = (ImageView) view.findViewById(R.id.inter_icon);
        AdOptionsView adOptionsView = (AdOptionsView) view.findViewById(R.id.inter_options);
        MediaView mediaView = (MediaView) view.findViewById(R.id.inter_media);
        sg.bigo.ads.ad.b.c cVar = this.f46656c;
        cVar.f45465I = i4;
        cVar.a(viewGroup, mediaView, this.f46657e, adOptionsView, (List<View>) arrayList, i3, viewArr);
        if (this.f46657e == null || this.f46656c.hasIcon()) {
            return;
        }
        String strA = popPage != null ? popPage.a() : "";
        if (sg.bigo.ads.common.utils.q.a((CharSequence) strA) || !URLUtil.isNetworkUrl(strA)) {
            if (i2 == 2) {
                this.f46657e.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f46657e.getContext(), R.drawable.bigo_ad_icon_default));
                return;
            } else if (i2 == 1) {
                a(this.f46657e);
                return;
            } else {
                if (i2 == 3) {
                    this.f46657e.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f46657e.getContext(), R.drawable.bigo_ad_icon_novideo_default));
                    return;
                }
                return;
            }
        }
        if (!sg.bigo.ads.api.a.i.f46986a.n().a(9) || !URLUtil.isHttpUrl(strA)) {
            sg.bigo.ads.ad.b.c cVar2 = this.f46656c;
            sg.bigo.ads.common.p.e.b(cVar2.f45584b.f47035e, null, strA, ((sg.bigo.ads.core.a.a) cVar2.f()).al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.u.8
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i5, String str, String str2) {
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(Bitmap bitmap2, sg.bigo.ads.common.p.f fVar) {
                    ImageView imageView2 = u.this.f46657e;
                    if (imageView2 != null) {
                        imageView2.setImageBitmap(bitmap2);
                    }
                }
            });
            return;
        }
        sg.bigo.ads.ad.b.c cVar3 = this.f46656c;
        if (cVar3 == null || cVar3.f() == 0) {
            return;
        }
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) this.f46656c.f(), 3000, 10220, "Invalid http url: ".concat(String.valueOf(strA)));
    }

    public final synchronized void a(final ValueCallback<Bitmap> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        a(new w() { // from class: sg.bigo.ads.ad.interstitial.u.12
            @Override // sg.bigo.ads.ad.interstitial.w
            public final void a() {
                valueCallback.onReceiveValue(u.this.g);
            }
        });
    }

    public final void a(final ImageView imageView) {
        this.m = true;
        a(new w() { // from class: sg.bigo.ads.ad.interstitial.u.2
            @Override // sg.bigo.ads.ad.interstitial.w
            public final void a() {
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.u.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        imageView.setImageBitmap(u.this.g);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    }
                });
            }
        });
    }

    private static void a(a aVar, TextView textView, String str, String str2) {
        Pair<String, String> pairA;
        if (aVar != null && (pairA = aVar.a(textView, str, str2)) != null) {
            str = (String) pairA.first;
            str2 = (String) pairA.second;
        }
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            textView.setText(str2);
        }
    }

    private synchronized void a(w wVar) {
        if (this.g != null) {
            wVar.a();
            return;
        }
        this.f46660l.add(wVar);
        if (this.k == 1) {
            return;
        }
        this.k = 1;
        b(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.u.11
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                u.this.a(bitmap);
            }
        });
    }
}
