package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import saneness.habitue;

/* JADX INFO: loaded from: classes.dex */
public final class tl0 extends Lambda implements Function1 {
    public static final tl0 a = new tl0();

    public tl0() {
        super(1);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        habitue it = (habitue) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        it.onPause();
        return Unit.f29295attabal;
    }
}
