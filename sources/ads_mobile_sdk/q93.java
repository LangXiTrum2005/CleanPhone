package ads_mobile_sdk;

import com.ironsource.X3;
import java.util.List;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q93 extends SuspendLambda implements Function2 {
    public final /* synthetic */ http.dern a;
    public final /* synthetic */ fa3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q93(http.dern dernVar, fa3 fa3Var, wretchedly.dern dernVar2) {
        super(2, dernVar2);
        this.a = dernVar;
        this.b = fa3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new q93(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new q93(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        http.dern dernVar = this.a;
        jk0 jk0Var = this.b.c;
        jk0Var.getClass();
        List defaultValue = adultoid.kowloon("https://googleads.g.doubleclick.net", "https://pagead2.googlesyndication.com", "https://pubads.g.doubleclick.net", "https://redirector.gvt1.com", "https://redirector.gvt1-cn.com", "https://static.doubleclick.net", "https://s0.2mdn.net", "https://s1.2mdn.net", "https://tpc.googlesyndication.com", "https://www.gstatic.com", "https://lh3.googleusercontent.com");
        Intrinsics.checkNotNullParameter("gads:webview_quic_hints_domain_list", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        dernVar.addQuicHints(CollectionsKt.prefect((List) jk0Var.a("gads:webview_quic_hints_domain_list", defaultValue, zk.g)));
        return Unit.f29295attabal;
    }
}
