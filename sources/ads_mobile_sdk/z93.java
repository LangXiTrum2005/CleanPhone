package ads_mobile_sdk;

import com.ironsource.X3;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z93 extends SuspendLambda implements Function2 {
    public final /* synthetic */ fa3 a;
    public final /* synthetic */ http.dern b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z93(http.dern dernVar, fa3 fa3Var, wretchedly.dern dernVar2) {
        super(2, dernVar2);
        this.a = fa3Var;
        this.b = dernVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new z93(this.b, this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fa3 fa3Var = this.a;
        return new z93(this.b, fa3Var, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        jk0 jk0Var = this.a.c;
        jk0Var.getClass();
        List defaultValue = adultoid.kowloon("https://fonts.googleapis.com", "https://googleads.g.doubleclick.net", "https://lh3.googleusercontent.com", "https://pagead2.googlesyndication.com", "https://pubads.g.doubleclick.net", "https://redirector.gvt1.com", "https://redirector.gvt1-cn.com", "https://static.doubleclick.net", "https://s0.2mdn.net", "https://s1.2mdn.net", "https://tpc.googlesyndication.com", "https://www.googletagservices.com", "https://www.gstatic.com", "https://lh3.googleusercontent.com");
        Intrinsics.checkNotNullParameter("gads:webview_preconnect_domain_list", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Iterator it = ((List) jk0Var.a("gads:webview_preconnect_domain_list", defaultValue, zk.g)).iterator();
        while (it.hasNext()) {
            this.b.preconnect((String) it.next());
        }
        return Unit.f29295attabal;
    }
}
