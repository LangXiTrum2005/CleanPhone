package ads_mobile_sdk;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bohunk;
import saneness.weimar;

/* JADX INFO: loaded from: classes.dex */
public final class ik1 implements weimar {
    public final NativeAdMapper a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final gk1 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final View k;
    public final View l;
    public final Object m;
    public final Bundle n;
    public final boolean o;
    public final boolean p;
    public final float q;

    public ik1(NativeAdMapper nativeAdMapper) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(nativeAdMapper, "nativeAdMapper");
        this.a = nativeAdMapper;
        this.b = nativeAdMapper.getHeadline();
        List<NativeAd.Image> images = nativeAdMapper.getImages();
        if (images != null) {
            arrayList = new ArrayList(dovishness.gintrap(images, 10));
            Iterator<T> it = images.iterator();
            while (it.hasNext()) {
                arrayList.add(new hk1((NativeAd.Image) it.next()));
            }
        } else {
            arrayList = null;
        }
        this.c = arrayList;
        this.d = this.a.getBody();
        NativeAd.Image icon = this.a.getIcon();
        this.e = icon != null ? new gk1(icon) : null;
        this.f = this.a.getCallToAction();
        this.g = this.a.getCom.ironsource.X3.i.F0 java.lang.String();
        this.a.getStarRating();
        this.h = this.a.getCom.ironsource.X3.i.U java.lang.String();
        this.i = this.a.getPrice();
        this.a.getVideoController();
        this.j = this.a.getHasVideoContent();
        NativeAd.AdChoicesInfo attributionInfo = this.a.getAttributionInfo();
        if (attributionInfo != null) {
            attributionInfo.getText();
            List<NativeAd.Image> images2 = attributionInfo.getImages();
            if (images2 != null) {
                ArrayList arrayList2 = new ArrayList(dovishness.gintrap(images2, 10));
                Iterator<T> it2 = images2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new fk1((NativeAd.Image) it2.next()));
                }
            }
        }
        this.k = this.a.getAdChoicesContent();
        this.l = this.a.getMediatedMediaView();
        this.m = this.a.getMediatedAd();
        this.n = this.a.getExtras();
        this.o = this.a.getOverrideImpressionRecording();
        this.p = this.a.getOverrideClickHandling();
        this.q = this.a.getMediaContentAspectRatio();
    }

    @Override // saneness.weimar
    public final View a() {
        return this.l;
    }

    @Override // saneness.weimar
    public final boolean b() {
        return this.o;
    }

    @Override // saneness.weimar
    public final View c() {
        return this.k;
    }

    @Override // saneness.weimar
    public final boolean d() {
        return this.p;
    }

    @Override // saneness.weimar
    public final void destroy() {
        this.a.destroy();
    }

    @Override // saneness.weimar
    public final float e() {
        return this.q;
    }

    @Override // saneness.weimar
    public final ArrayList f() {
        return this.c;
    }

    @Override // saneness.weimar
    public final String getAdvertiser() {
        return this.g;
    }

    @Override // saneness.weimar
    public final String getBody() {
        return this.d;
    }

    @Override // saneness.weimar
    public final String getCallToAction() {
        return this.f;
    }

    @Override // saneness.weimar
    public final Bundle getExtras() {
        return this.n;
    }

    @Override // saneness.weimar
    public final boolean getHasVideoContent() {
        return this.j;
    }

    @Override // saneness.weimar
    public final String getHeadline() {
        return this.b;
    }

    @Override // saneness.weimar
    public final bohunk getIcon() {
        return this.e;
    }

    @Override // saneness.weimar
    public final String getPrice() {
        return this.i;
    }

    @Override // saneness.weimar
    public final String getStore() {
        return this.h;
    }

    @Override // saneness.weimar
    public final void recordImpression() {
        this.a.recordImpression();
    }

    @Override // saneness.weimar
    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a.handleClick(view);
    }

    @Override // saneness.weimar
    public final void a(FrameLayout frameLayout, Map clickableAssetViews, Map nonclickableAssetViews) {
        Intrinsics.checkNotNullParameter(clickableAssetViews, "clickableAssetViews");
        Intrinsics.checkNotNullParameter(nonclickableAssetViews, "nonclickableAssetViews");
        this.a.trackViews(frameLayout, clickableAssetViews, nonclickableAssetViews);
    }

    @Override // saneness.weimar
    public final void a(FrameLayout frameLayout) {
        this.a.untrackView(frameLayout);
    }
}
