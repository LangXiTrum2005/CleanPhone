package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import complexometry.ResponseInfo;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.imperceivable;
import saneness.truantry;

/* JADX INFO: loaded from: classes.dex */
public final class li1 implements truantry, imperceivable {
    public final InternalNativeAd a;

    public li1(InternalNativeAd internalNativeAd) {
        Intrinsics.checkNotNullParameter(internalNativeAd, "internalNativeAd");
        this.a = internalNativeAd;
    }

    @Override // saneness.imperceivable
    public final l13 a() {
        return this.a.a();
    }

    @Override // saneness.imperceivable
    public final h1 b() {
        return this.a.b();
    }

    @Override // saneness.imperceivable
    public final void destroy() {
        this.a.destroy();
    }

    @Override // saneness.imperceivable
    public final ResponseInfo getResponseInfo() {
        return this.a.getResponseInfo();
    }

    @Override // saneness.imperceivable
    public final Object a(wretchedly.dern dernVar) {
        return this.a.a(dernVar);
    }

    @Override // saneness.imperceivable
    public final void a(ResponseInfo responseInfo) {
        Intrinsics.checkNotNullParameter(responseInfo, "<set-?>");
        InternalNativeAd internalNativeAd = this.a;
        internalNativeAd.getClass();
        Intrinsics.checkNotNullParameter(responseInfo, "<set-?>");
        internalNativeAd.j = responseInfo;
    }
}
