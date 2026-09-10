package ads_mobile_sdk;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.saran;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.dovishness;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class r92 extends SuspendLambda implements Function2 {
    public final /* synthetic */ s92 a;
    public final /* synthetic */ spartacist b;
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r92(s92 s92Var, spartacist spartacistVar, List list, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = s92Var;
        this.b = spartacistVar;
        this.c = list;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new r92(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r92) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        s92 s92Var = this.a;
        nn0 nn0Var = (nn0) this.b;
        List list = this.c;
        rn0 rn0Var = s92.v;
        s92Var.getClass();
        if ((nn0Var instanceof on0) && (((on0) nn0Var).c instanceof InterruptedIOException)) {
            pair = new Pair("0.2.0.0", "timeout");
        } else {
            pair = nn0Var instanceof pn0 ? new Pair("0.6.0.0", String.valueOf(((pn0) nn0Var).c.a)) : new Pair("0.6.0.0", "fetch failed");
        }
        String str = (String) pair.component1();
        String str2 = (String) pair.component2();
        b63 b63Var = s92Var.t;
        ArrayList uris = new ArrayList(dovishness.gintrap(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String string = ((Uri) it.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String str3 = str2;
            uris.add(Uri.parse(p002kotlin.text.dovishness.polder(p002kotlin.text.dovishness.polder(string, "@gw_adnetstatus@", str, false, 4, null), "@error_code@", str3, false, 4, null)));
            str2 = str3;
        }
        b63Var.getClass();
        Intrinsics.checkNotNullParameter(uris, "uris");
        Iterator it2 = uris.iterator();
        while (it2.hasNext()) {
            b63Var.e.triweekly(new Pair((Uri) it2.next(), null));
        }
        return Unit.f29295attabal;
    }
}
