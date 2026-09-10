package ads_mobile_sdk;

import com.google.common.base.triweekly;
import java.util.LinkedHashMap;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class g42 extends SuspendLambda implements Function2 {
    public formularization.attabal a;
    public w52 b;
    public yf2 c;
    public String d;
    public int e;
    public final /* synthetic */ w52 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ yf2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g42(yf2 yf2Var, w52 w52Var, String str, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.f = w52Var;
        this.g = str;
        this.h = yf2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new g42(this.h, this.f, this.g, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g42) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        formularization.attabal attabalVar;
        w52 w52Var;
        String str;
        yf2 yf2Var;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.e;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = this.f.n;
                w52Var = this.f;
                yf2 yf2Var2 = this.h;
                str = this.g;
                this.a = attabalVar;
                this.b = w52Var;
                this.c = yf2Var2;
                this.d = str;
                this.e = 1;
                if (attabalVar.attabal(null, this) != objBeachfront) {
                    yf2Var = yf2Var2;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
                return obj;
            }
            str = this.d;
            yf2Var = this.c;
            w52Var = this.b;
            attabalVar = this.a;
            p002kotlin.dern.saneness(obj);
            LinkedHashMap linkedHashMapA = w52.a(w52Var, yf2Var);
            x3 x3Var = linkedHashMapA != null ? (x3) linkedHashMapA.get(str) : null;
            attabalVar.wireman(null);
            if (x3Var != null) {
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = 2;
                Object objA = x3Var.a((wretchedly.dern) this);
                return objA == objBeachfront ? objBeachfront : objA;
            }
            triweekly triweeklyVar = kn0.a;
            kn0.c("No preload found for preload ID " + this.g, null);
            return igo.attabal.attabal(false);
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }
}
