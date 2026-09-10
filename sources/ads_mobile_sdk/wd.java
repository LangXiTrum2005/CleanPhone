package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import saneness.fishpound;

/* JADX INFO: loaded from: classes.dex */
public final class wd extends Lambda implements Function1 {
    public static final wd a = new wd();

    public wd() {
        super(1);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fishpound it = (fishpound) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return new ce(it);
    }
}
