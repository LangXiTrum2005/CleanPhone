package ads_mobile_sdk;

import complexometry.formularize;
import java.util.Map;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class kj2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pj2 b;
    public final /* synthetic */ Map.Entry c;
    public final /* synthetic */ formularize d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ String f;
    public final /* synthetic */ liquory.attabal g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj2(pj2 pj2Var, Map.Entry entry, formularize formularizeVar, Map map, String str, liquory.attabal attabalVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = pj2Var;
        this.c = entry;
        this.d = formularizeVar;
        this.e = map;
        this.f = str;
        this.g = attabalVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new kj2(this.b, this.c, this.d, this.e, this.f, this.g, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kj2) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            pj2 pj2Var = this.b;
            Map.Entry entry = this.c;
            formularize formularizeVar = this.d;
            Map map = this.e;
            String str = this.f;
            liquory.attabal attabalVar = this.g;
            this.a = 1;
            if (pj2.a(pj2Var, entry, formularizeVar, map, str, attabalVar, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}
