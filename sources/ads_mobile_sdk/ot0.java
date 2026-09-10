package ads_mobile_sdk;

import okhttp3.marial;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ot0 extends Lambda implements Function1 {
    public final /* synthetic */ marial a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot0(marial marialVar) {
        super(1);
        this.a = marialVar;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.cancel();
        return Unit.f29295attabal;
    }
}
