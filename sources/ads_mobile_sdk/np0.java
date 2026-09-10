package ads_mobile_sdk;

import java.util.UUID;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class np0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ gq0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ UUID c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np0(gq0 gq0Var, String str, UUID uuid, String str2, String str3, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = gq0Var;
        this.b = str;
        this.c = uuid;
        this.d = str2;
        this.e = str3;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new np0(this.a, this.b, this.c, this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((np0) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.evaluateJavascript(this.b + "({\"id\": \"" + this.c + "\", \"args\": " + this.d + ", \"use_javascript_interface\": \"" + this.e + "\"});", null);
        return Unit.f29295attabal;
    }
}
