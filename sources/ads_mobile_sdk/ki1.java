package ads_mobile_sdk;

import complexometry.ResponseInfo;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.imperceivable;
import saneness.truantry;

/* JADX INFO: loaded from: classes.dex */
public final class ki1 implements truantry, imperceivable {
    public final d41 a;

    public ki1(d41 internalBannerAd) {
        Intrinsics.checkNotNullParameter(internalBannerAd, "internalBannerAd");
        this.a = internalBannerAd;
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
        d41 d41Var = this.a;
        d41Var.getClass();
        return v21.a(d41Var, dernVar);
    }

    @Override // saneness.imperceivable
    public final void a(ResponseInfo responseInfo) {
        Intrinsics.checkNotNullParameter(responseInfo, "<set-?>");
        d41 d41Var = this.a;
        d41Var.getClass();
        Intrinsics.checkNotNullParameter(responseInfo, "<set-?>");
        d41Var.j = responseInfo;
    }
}
