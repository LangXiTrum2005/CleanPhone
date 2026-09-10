package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;

/* JADX INFO: loaded from: classes.dex */
public final class gn0 extends Exception implements evenfall {
    public final Throwable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn0(Throwable wrappedException) {
        super(wrappedException);
        Intrinsics.checkNotNullParameter(wrappedException, "wrappedException");
        this.a = wrappedException;
    }

    @Override // saneness.evenfall
    public final Throwable a() {
        return this.a;
    }
}
