package sg.bigo.ads.ad.c.a;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f45629h;

    public b(sg.bigo.ads.ad.b.c cVar, Context context) {
        super(cVar, context);
        sg.bigo.ads.api.c.b.a(0);
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int a() {
        return R.layout.bigo_ad_native_banner_medium;
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int b() {
        return e.a(this.f45612c, 8);
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int[] c() {
        return new int[]{e.a(this.f45612c, -57), e.a(this.f45612c, 153)};
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final void d() {
        this.f45611b = new FrameLayout(this.f45612c);
        int iA = e.a(this.f45612c, 276);
        int iA2 = e.a(this.f45612c, 174);
        MediaView mediaView = new MediaView(this.f45612c);
        this.d = mediaView;
        mediaView.setImageBlurBorder(false);
        this.d.setLayoutParams(new ViewGroup.LayoutParams(iA, iA2));
        View viewA = sg.bigo.ads.common.utils.a.a(this.f45612c, R.layout.bigo_ad_banner_placeholder_img, null, false);
        this.f45629h = viewA;
        if (viewA != null) {
            u.a(viewA, this.d, null, -1);
            View view = this.f45629h;
            a.a((TextView) view.findViewById(R.id.bigo_ad_banner_background_text), this.f45610a.getTitle(), "");
            a.a((TextView) view.findViewById(R.id.bigo_ad_image_title), this.f45610a.getTitle(), "");
            a.a((TextView) view.findViewById(R.id.bigo_ad_banner_image_description), this.f45610a.getDescription(), "");
            TextView textView = (TextView) view.findViewById(R.id.bigo_ad_banner_image_domain);
            String advertiser = this.f45610a.getAdvertiser();
            if (textView != null) {
                if (TextUtils.isEmpty(advertiser)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(advertiser);
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int i() {
        return 300;
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int j() {
        return 250;
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final void b(int i2) {
        if (this.f45629h != null) {
            this.f45629h.setBackground(new BitmapDrawable(this.f45612c.getResources(), g()));
        }
        super.b(i2);
    }
}
