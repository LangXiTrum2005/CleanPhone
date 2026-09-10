package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import saneness.interaction;

/* JADX INFO: loaded from: classes.dex */
public final class q71 extends Lambda implements Function1 {
    public static final q71 a = new q71();

    public q71() {
        super(1);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        interaction it = (interaction) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return new w71(it);
    }
}
