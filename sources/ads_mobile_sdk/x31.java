package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.fishpound;
import saneness.imperceivable;
import saneness.orthocephalic;

/* JADX INFO: loaded from: classes.dex */
public final class x31 extends orthocephalic {
    public final complexometry.wireman a;
    public final Function1 b;

    public x31(complexometry.wireman loadCallback, Function1 wrap) {
        Intrinsics.checkNotNullParameter(loadCallback, "loadCallback");
        Intrinsics.checkNotNullParameter(wrap, "wrap");
        this.a = loadCallback;
        this.b = wrap;
    }

    @Override // saneness.orthocephalic
    public final void a() {
    }

    @Override // saneness.orthocephalic
    public final void a(LoadAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.onAdFailedToLoad(error);
    }

    @Override // saneness.orthocephalic
    public final Object a(imperceivable imperceivableVar, wretchedly.dern dernVar) {
        this.a.onAdLoaded(this.b.invoke((fishpound) imperceivableVar));
        return Unit.f29295attabal;
    }
}
