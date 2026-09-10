package ads_mobile_sdk;

import java.util.Iterator;
import java.util.Timer;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;
import saneness.fastrack;
import saneness.glassmaker;

/* JADX INFO: loaded from: classes.dex */
public final class bv1 extends Lambda implements Function0 {
    public final /* synthetic */ d91 a;
    public final /* synthetic */ fastrack b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv1(d91 d91Var, fastrack fastrackVar) {
        super(0);
        this.a = d91Var;
        this.b = fastrackVar;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        d91 d91Var = this.a;
        fastrack fastrackVar = this.b;
        Iterator it = d91Var.e.values().iterator();
        while (it.hasNext()) {
            ((glassmaker) it.next()).a();
        }
        Timer timer = new Timer();
        timer.schedule(new a91(d91Var, fastrackVar, timer), 1000L);
        return Unit.f29295attabal;
    }
}
