package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;
import saneness.terni;

/* JADX INFO: loaded from: classes.dex */
public final class dn0 extends Lambda implements Function0 {
    public static final dn0 a = new dn0();

    public dn0() {
        super(0);
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (terni) en0.b.a("MobileAds.initialize must be called before using the Google Mobile Ads SDK.");
    }
}
