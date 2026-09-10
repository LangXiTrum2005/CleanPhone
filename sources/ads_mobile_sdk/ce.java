package ads_mobile_sdk;

import android.app.Activity;
import kurbash.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.MutablePropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import saneness.fishpound;
import saneness.kattegat;

/* JADX INFO: loaded from: classes.dex */
public final class ce extends mj implements extensimeter.attabal {
    public final fishpound b;
    public final vw2 c;
    public static final /* synthetic */ formularize[] e = {polloi.competently(new MutablePropertyReference1Impl(ce.class, "adEventCallback", "getAdEventCallback()Lcom/google/android/libraries/ads/mobile/sdk/appopen/AppOpenAdEventCallback;", 0))};
    public static final kattegat d = new kattegat();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(fishpound internalAppOpenAd) {
        super(internalAppOpenAd);
        Intrinsics.checkNotNullParameter(internalAppOpenAd, "internalAppOpenAd");
        this.b = internalAppOpenAd;
        this.c = new vw2(new be(this), null);
    }

    @Override // extensimeter.attabal
    public final void setAdEventCallback(extensimeter.saneness sanenessVar) {
        this.c.setValue(this, e[0], sanenessVar);
    }

    @Override // extensimeter.attabal
    public final void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b.a(activity);
    }
}
