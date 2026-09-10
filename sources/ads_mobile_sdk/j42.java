package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class j42 extends Lambda implements Function1 {
    public final /* synthetic */ w52 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j42(w52 w52Var) {
        super(1);
        this.a = w52Var;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yf2 it = (yf2) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it == yf2.e && this.a.q);
    }
}
