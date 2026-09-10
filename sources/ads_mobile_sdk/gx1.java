package ads_mobile_sdk;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.walach;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import saneness.glassmaker;

/* JADX INFO: loaded from: classes.dex */
public final class gx1 extends SuspendLambda implements Function2 {
    public Object a;
    public Object b;
    public formularization.attabal c;
    public tx1 d;
    public int e;
    public final /* synthetic */ Ref$ObjectRef f;
    public final /* synthetic */ tx1 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Ref$ObjectRef i;
    public final /* synthetic */ iv0 j;
    public final /* synthetic */ Ref$ObjectRef k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx1(Ref$ObjectRef ref$ObjectRef, tx1 tx1Var, String str, Ref$ObjectRef ref$ObjectRef2, iv0 iv0Var, Ref$ObjectRef ref$ObjectRef3, boolean z, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.f = ref$ObjectRef;
        this.g = tx1Var;
        this.h = str;
        this.i = ref$ObjectRef2;
        this.j = iv0Var;
        this.k = ref$ObjectRef3;
        this.l = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new gx1(this.f, this.g, this.h, this.i, this.j, this.k, this.l, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gx1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        walach walachVar;
        Object objDent;
        Object objCompetently;
        gq0 gq0Var;
        tx1 tx1Var;
        formularization.attabal attabalVar;
        glassmaker glassmakerVar;
        tx1 tx1Var2;
        formularization.attabal attabalVar2;
        glassmaker glassmakerVar2;
        tx1 tx1Var3;
        formularization.attabal attabalVar3;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.e;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                T t = this.f.element;
                if (t == 0) {
                    Intrinsics.preprohormone("deferredWebView");
                    walachVar = null;
                } else {
                    walachVar = (walach) t;
                }
                this.e = 1;
                objDent = walachVar.dent(this);
                if (objDent == objBeachfront) {
                }
                return objBeachfront;
            }
            if (i != 1) {
                if (i == 2) {
                    tx1Var = (tx1) this.b;
                    attabalVar = (formularization.attabal) this.a;
                    p002kotlin.dern.saneness(obj);
                    try {
                        tx1Var.j = null;
                        return Unit.f29295attabal;
                    } finally {
                        attabalVar.wireman(null);
                    }
                }
                if (i == 3) {
                    gq0 gq0Var2 = (gq0) this.a;
                    p002kotlin.dern.saneness(obj);
                    gq0Var = gq0Var2;
                    objCompetently = obj;
                    glassmakerVar = (glassmaker) objCompetently;
                    tx1Var2 = this.g;
                    attabalVar2 = tx1Var2.i;
                    this.a = gq0Var;
                    this.b = glassmakerVar;
                    this.c = attabalVar2;
                    this.d = tx1Var2;
                    this.e = 4;
                    if (attabalVar2.attabal(null, this) != objBeachfront) {
                        glassmakerVar2 = glassmakerVar;
                        tx1Var3 = tx1Var2;
                        attabalVar3 = attabalVar2;
                    }
                    return objBeachfront;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tx1Var3 = this.d;
                attabalVar3 = this.c;
                glassmakerVar2 = (glassmaker) this.b;
                gq0Var = (gq0) this.a;
                p002kotlin.dern.saneness(obj);
                try {
                    tx1Var3.l = glassmakerVar2;
                    tx1Var3.k = gq0Var;
                    Unit unit = Unit.f29295attabal;
                    return Unit.f29295attabal;
                } finally {
                    attabalVar3.wireman(null);
                }
            }
            p002kotlin.dern.saneness(obj);
            objDent = obj;
            gq0 gq0Var3 = (gq0) objDent;
            if (gq0Var3 == null) {
                tx1 tx1Var4 = this.g;
                formularization.attabal attabalVar4 = tx1Var4.i;
                this.a = attabalVar4;
                this.b = tx1Var4;
                this.e = 2;
                if (attabalVar4.attabal(null, this) != objBeachfront) {
                    tx1Var = tx1Var4;
                    attabalVar = attabalVar4;
                    tx1Var.j = null;
                    return Unit.f29295attabal;
                }
            } else {
                tx1 tx1Var5 = this.g;
                CoroutineContext coroutineContext = tx1Var5.b;
                fx1 fx1Var = new fx1(tx1Var5, gq0Var3, this.h, this.i, this.j, this.k, this.l, null);
                this.a = gq0Var3;
                this.e = 3;
                objCompetently = impromptu.competently(coroutineContext, fx1Var, this);
                if (objCompetently != objBeachfront) {
                    gq0Var = gq0Var3;
                    glassmakerVar = (glassmaker) objCompetently;
                    tx1Var2 = this.g;
                    attabalVar2 = tx1Var2.i;
                    this.a = gq0Var;
                    this.b = glassmakerVar;
                    this.c = attabalVar2;
                    this.d = tx1Var2;
                    this.e = 4;
                    if (attabalVar2.attabal(null, this) != objBeachfront) {
                        glassmakerVar2 = glassmakerVar;
                        tx1Var3 = tx1Var2;
                        attabalVar3 = attabalVar2;
                        tx1Var3.l = glassmakerVar2;
                        tx1Var3.k = gq0Var;
                        Unit unit2 = Unit.f29295attabal;
                        return Unit.f29295attabal;
                    }
                }
            }
            return objBeachfront;
        } catch (CancellationException unused) {
            kn0.c("omid session creation was cancelled in onAdWillBeReturned", null);
        }
    }
}
