package ads_mobile_sdk;

import android.app.Activity;
import kurbash.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.MutablePropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import saneness.interaction;
import saneness.subsynchronous;

/* JADX INFO: loaded from: classes.dex */
public final class w71 extends mj implements gargoyle.attabal {
    public final interaction b;
    public final vw2 c;
    public static final /* synthetic */ formularize[] e = {polloi.competently(new MutablePropertyReference1Impl(w71.class, "adEventCallback", "getAdEventCallback()Lcom/google/android/libraries/ads/mobile/sdk/interstitial/InterstitialAdEventCallback;", 0))};
    public static final subsynchronous d = new subsynchronous();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w71(interaction internalInterstitialAd) {
        super(internalInterstitialAd);
        Intrinsics.checkNotNullParameter(internalInterstitialAd, "internalInterstitialAd");
        this.b = internalInterstitialAd;
        this.c = new vw2(new v71(this), null);
    }

    @Override // gargoyle.attabal
    public final void setAdEventCallback(gargoyle.saneness sanenessVar) {
        this.c.setValue(this, e[0], sanenessVar);
    }

    @Override // gargoyle.attabal
    public final void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b.a(activity);
    }
}
