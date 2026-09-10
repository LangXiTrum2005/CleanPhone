package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class vi1 extends Lambda implements Function1 {
    public static final vi1 a = new vi1();

    public vi1() {
        super(1);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d41 ad = (d41) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        return new ki1(ad);
    }
}
