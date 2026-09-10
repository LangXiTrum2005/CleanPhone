package ads_mobile_sdk;

import android.os.Bundle;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.ironsource.X3;
import complexometry.kowloon;
import kurbash.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.MutablePropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import saneness.tectonization;

/* JADX INFO: loaded from: classes.dex */
public final class ak1 extends mj implements NativeAd {
    public static final /* synthetic */ formularize[] p = {polloi.competently(new MutablePropertyReference1Impl(ak1.class, "adEventCallback", "getAdEventCallback()Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAdEventCallback;", 0))};
    public final InternalNativeAd b;
    public final vw2 c;
    public final String d;
    public final kowloon e;
    public final String f;
    public final String g;
    public final String h;
    public final Double i;
    public final String j;
    public final String k;
    public final kowloon l;
    public final Bundle m;
    public final complexometry.saneness n;
    public final id1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak1(InternalNativeAd internalNativeAd) {
        super(internalNativeAd);
        Intrinsics.checkNotNullParameter(internalNativeAd, "internalNativeAd");
        this.b = internalNativeAd;
        this.c = new vw2(new zj1(this), null);
        this.d = (String) internalNativeAd.getF19437saneness().d.get("headline");
        g61 g61Var = internalNativeAd.getF19437saneness().f;
        this.e = g61Var != null ? g61Var.a() : null;
        this.f = (String) internalNativeAd.getF19437saneness().d.get("body");
        this.g = (String) internalNativeAd.getF19437saneness().d.get("call_to_action");
        this.h = (String) internalNativeAd.getF19437saneness().d.get(X3.i.F0);
        this.i = internalNativeAd.getF19437saneness().e;
        this.j = (String) internalNativeAd.getF19437saneness().d.get(X3.i.U);
        this.k = (String) internalNativeAd.getF19437saneness().d.get("price");
        g61 g61Var2 = internalNativeAd.getF19437saneness().g;
        this.l = g61Var2 != null ? g61Var2.a() : null;
        this.m = internalNativeAd.getF19437saneness().r;
        b41 b41Var = internalNativeAd.getF19437saneness().h;
        this.n = b41Var != null ? tectonization.attabal(b41Var) : null;
        this.o = new id1(internalNativeAd);
        internalNativeAd.impromptu();
        internalNativeAd.saneness();
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd
    public final acidy.dern getAdEventCallback() {
        return (acidy.dern) this.c.getValue(this, p[0]);
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd
    public final String getAdvertiser() {
        return this.h;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd
    public final String getBody() {
        return this.f;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd
    public final String getCallToAction() {
        return this.g;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd
    public final String getHeadline() {
        return this.d;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd
    public final kowloon getIcon() {
        return this.l;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd
    public final acidy.saneness getMediaContent() {
        return this.o;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd
    public final Double getStarRating() {
        return this.i;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd
    public final String getStore() {
        return this.j;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd
    public final void setAdEventCallback(acidy.dern dernVar) {
        this.c.setValue(this, p[0], dernVar);
    }
}
