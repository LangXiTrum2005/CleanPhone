package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;
import saneness.glassmaker;

/* JADX INFO: loaded from: classes.dex */
public final class jv1 extends Lambda implements Function0 {
    public final /* synthetic */ glassmaker a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv1(glassmaker glassmakerVar) {
        super(0);
        this.a = glassmakerVar;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.b();
        return Unit.f29295attabal;
    }
}
