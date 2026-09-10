package saneness;

import ads_mobile_sdk.b53;
import java.util.Set;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tau extends b53 implements Set {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tau(Set delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
