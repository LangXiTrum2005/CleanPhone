package ads_mobile_sdk;

import okhttp3.marial;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import tetrahedral.triweekly;

/* JADX INFO: loaded from: classes.dex */
public final class qt0 extends Lambda implements triweekly {
    public final /* synthetic */ marial a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt0(marial marialVar) {
        super(3);
        this.a = marialVar;
    }

    @Override // tetrahedral.triweekly
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter((Throwable) obj, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter((tn0) obj2, "<anonymous parameter 1>");
        Intrinsics.checkNotNullParameter((CoroutineContext) obj3, "<anonymous parameter 2>");
        this.a.cancel();
        return Unit.f29295attabal;
    }
}
