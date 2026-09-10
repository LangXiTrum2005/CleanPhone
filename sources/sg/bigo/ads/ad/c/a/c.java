package sg.bigo.ads.ad.c.a;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vungle.ads.internal.protos.Sdk;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MaxWidthMediaView;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends a {
    public c(sg.bigo.ads.ad.b.c cVar, Context context) {
        super(cVar, context);
        sg.bigo.ads.api.c.b.a(20);
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int a() {
        return R.layout.bigo_ad_native_banner_small;
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int b() {
        return e.a(this.f45612c, 6);
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int[] c() {
        return new int[]{e.a(this.f45612c, -24), e.a(this.f45612c, 236)};
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final void d() {
        this.f45611b = new FrameLayout(this.f45612c);
        int iA = e.a(this.f45612c, 38);
        int iA2 = e.a(this.f45612c, 60);
        MaxWidthMediaView maxWidthMediaView = new MaxWidthMediaView(this.f45612c);
        this.d = maxWidthMediaView;
        maxWidthMediaView.setLayoutParams(new ViewGroup.LayoutParams(-2, iA));
        this.d.setMinimumWidth(iA);
        ((MaxWidthMediaView) this.d).setMaxWidth(iA2);
        this.d.setImageBlurBorder(true);
        this.d.setVisibility(8);
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int i() {
        return Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int j() {
        return 50;
    }
}
