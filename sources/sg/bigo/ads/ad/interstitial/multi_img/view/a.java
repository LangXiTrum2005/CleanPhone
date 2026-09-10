package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import sg.bigo.ads.R;
import sg.bigo.ads.common.p.f;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends d<AdImageView> implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sg.bigo.ads.ad.interstitial.multi_img.b f46408a;
    private final ValueCallback<a> t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f46409u;

    public a(Context context, sg.bigo.ads.ad.interstitial.multi_img.b bVar, sg.bigo.ads.ad.interstitial.multi_img.c cVar, int i2, int i3, String str, boolean z2, ValueCallback<a> valueCallback) {
        super(context, cVar, false, i2, i3, R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_item_layout, R.id.inter_media_item_layout, R.id.inter_media_item, R.id.inter_media_item_background);
        this.f46408a = bVar;
        this.f46409u = str;
        this.t = valueCallback;
        if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
            ((AdImageView) this.f46427l).a(this);
            ((AdImageView) this.f46427l).a(str, z2);
            if (bVar != null) {
                bVar.a(str, 0);
            }
        }
        ((AdImageView) this.f46427l).setFadeEnable(true);
        this.j.setStrokeWidth(e.a(context, 1));
        this.j.setStrokeColor(q.b("#08000000", -7829368));
        ((AdImageView) this.f46427l).setBackgroundColor(q.b("#FFE1E1E6", -7829368));
        ((AdImageView) this.f46427l).setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_icon_default_only_icon));
    }

    @Override // sg.bigo.ads.common.p.g
    public final void a(int i2, String str, String str2) {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f46408a;
        if (bVar != null) {
            bVar.a(this.f46409u, 2);
        }
        ((AdImageView) this.f46427l).post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.a.3
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.t != null) {
                    a.this.t.onReceiveValue(a.this);
                }
            }
        });
    }

    public final void a(final Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        ((AdImageView) this.f46427l).post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.a(a.this, bitmap);
                ((AdImageView) a.this.f46427l).setImageBitmap(bitmap);
            }
        });
    }

    @Override // sg.bigo.ads.common.p.g
    public final void a(final Bitmap bitmap, f fVar) {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f46408a;
        if (bVar != null) {
            bVar.a(this.f46409u, 1);
        }
        ((AdImageView) this.f46427l).post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.a(a.this, bitmap);
                ((AdImageView) a.this.f46427l).setBackground(null);
            }
        });
    }

    public static /* synthetic */ void a(a aVar, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 0 && height > 0) {
            ViewGroup.LayoutParams layoutParams = aVar.j.getLayoutParams();
            if (layoutParams instanceof ViewFlow.b) {
                ViewFlow.b bVar = (ViewFlow.b) layoutParams;
                bVar.f47653a = width;
                bVar.f47654b = height;
            }
            aVar.j.setLayoutParams(layoutParams);
            aVar.a(width, height);
        }
        aVar.b(bitmap);
    }

    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d
    public final boolean a() {
        if (super.a()) {
            return true;
        }
        sg.bigo.ads.ad.interstitial.multi_img.c cVar = this.g;
        if (cVar == null) {
            return false;
        }
        int i2 = cVar.d;
        return i2 == 3 || i2 == 2;
    }
}
