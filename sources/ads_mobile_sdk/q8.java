package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.initialization.AdapterStatus;
import java.util.LinkedHashMap;
import java.util.List;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.conclusively;
import saneness.naming;
import saneness.plo;

/* JADX INFO: loaded from: classes.dex */
public final class q8 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ v8 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ j8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(v8 v8Var, String str, j8 j8Var, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.b = v8Var;
        this.c = str;
        this.d = j8Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new q8(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((q8) create((wretchedly.dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        p002kotlin.dern.saneness(obj);
        v8 v8Var = this.b;
        String adapterName = this.c;
        j8 j8Var = this.d;
        this.a = 1;
        List list = v8.o;
        v8Var.getClass();
        if (v8.o.contains(adapterName)) {
            objA = new tn0(Unit.f29295attabal);
        } else {
            conclusively conclusivelyVarAttabal = naming.attabal(v8Var.d, adapterName, false, true, null, 10);
            if (conclusivelyVarAttabal == null) {
                synchronized (v8Var) {
                    plo ploVar = v8Var.e;
                    LinkedHashMap adapterStatusMap = v8Var.n;
                    n8 adapterStatus = new n8(AdapterStatus.InitializationState.FAILED, "The adapter was unable to be instantiated via reflection.", 0);
                    ploVar.getClass();
                    Intrinsics.checkNotNullParameter(adapterStatusMap, "adapterStatusMap");
                    Intrinsics.checkNotNullParameter(adapterName, "adapterName");
                    Intrinsics.checkNotNullParameter(adapterStatus, "adapterStatus");
                    adapterStatusMap.put(adapterName, new Pair(adapterStatus, null));
                    Unit unit = Unit.f29295attabal;
                }
                objA = new rn0("The adapter was unable to be instantiated via reflection.", k41.INTERNAL_ERROR);
            } else {
                objA = v8Var.a(conclusivelyVarAttabal, adapterName, j8Var, this);
            }
        }
        return objA == objBeachfront ? objBeachfront : objA;
    }
}
