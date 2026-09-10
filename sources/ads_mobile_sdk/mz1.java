package ads_mobile_sdk;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.p000activity.ComponentActivity;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.MediaView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.aesthesia;

/* JADX INFO: loaded from: classes.dex */
public final class mz1 extends aesthesia {
    public final /* synthetic */ Context a;
    public final /* synthetic */ nz1 b;
    public final /* synthetic */ InternalNativeAd c;
    public final /* synthetic */ ImageView.ScaleType d;

    public mz1(Context context, nz1 nz1Var, InternalNativeAd internalNativeAd, ImageView.ScaleType scaleType) {
        this.a = context;
        this.b = nz1Var;
        this.c = internalNativeAd;
        this.d = scaleType;
    }

    @Override // saneness.aesthesia
    public final void a(ComponentActivity activity, LinearLayout layout) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(layout, "layout");
        NativeAdView nativeAdView = new NativeAdView(activity);
        nativeAdView.setTag("ad_view_tag");
        nativeAdView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        layout.setBackgroundColor(-1);
        layout.addView(nativeAdView);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        nativeAdView.addView(linearLayout);
        Resources resources = this.a.getResources();
        if (resources == null) {
            return;
        }
        String string = resources.getString(danae.dern.native_headline);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        linearLayout.addView(nz1.a(this.b, activity, string, "headline_header_tag"));
        String str = (String) this.c.getF19437saneness().d.get("headline");
        if (str == null) {
            str = "";
        }
        View viewB = nz1.b(this.b, activity, str, "headline_tag");
        nativeAdView.setHeadlineView(viewB);
        linearLayout.addView(viewB);
        String string2 = resources.getString(danae.dern.native_body);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        linearLayout.addView(nz1.a(this.b, activity, string2, "body_header_tag"));
        String str2 = (String) this.c.getF19437saneness().d.get("body");
        View viewB2 = nz1.b(this.b, activity, str2 != null ? str2 : "", "body_tag");
        nativeAdView.setBodyView(viewB2);
        linearLayout.addView(viewB2);
        String string3 = resources.getString(danae.dern.native_media_view);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        linearLayout.addView(nz1.a(this.b, activity, string3, "media_view_header_tag"));
        MediaView mediaView = new MediaView(activity);
        mediaView.setTag("media_view_tag");
        mediaView.setImageScaleType(this.d);
        linearLayout.addView(mediaView);
        nativeAdView.registerNativeAd(new ak1(this.c), mediaView);
    }

    @Override // saneness.sunback
    public final void onDestroy() {
        this.c.destroy();
    }
}
