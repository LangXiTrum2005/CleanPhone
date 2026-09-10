package gn;

import cn.b2;
import cn.d0;
import cn.j0;
import cn.k2;
import cn.w;
import cn.x0;
import com.google.android.gms.internal.play_billing.q1;
import xj.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements fn.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ en.e f41992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41993b;

    public g(en.e eVar, int i10) {
        this.f41992a = eVar;
        this.f41993b = i10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // fn.f
    public final Object emit(Object obj, ak.f fVar) throws j0 {
        f fVar2;
        Object obj2;
        if (fVar instanceof f) {
            fVar2 = (f) fVar;
            int i10 = fVar2.f41991h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar2.f41991h = i10 - Integer.MIN_VALUE;
            } else {
                fVar2 = new f(this, fVar);
            }
        } else {
            fVar2 = new f(this, fVar);
        }
        Object obj3 = fVar2.f41989f;
        int i11 = fVar2.f41991h;
        bk.a aVar = bk.a.f5708a;
        wj.r rVar = wj.r.f53297a;
        if (i11 == 0) {
            t9.e.z(obj3);
            y yVar = new y(this.f41993b, obj);
            fVar2.f41991h = 1;
            if (this.f41992a.b(fVar2, yVar) != aVar) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj3);
            return rVar;
        }
        t9.e.z(obj3);
        fVar2.f41991h = 2;
        ak.k context = fVar2.getContext();
        d0.m(context);
        ak.f fVarT = q1.t(fVar2);
        hn.g gVar = fVarT instanceof hn.g ? (hn.g) fVarT : null;
        if (gVar == null) {
            obj2 = rVar;
        } else {
            w wVar = gVar.f42428d;
            if (hn.b.j(wVar, context)) {
                gVar.f42430f = rVar;
                gVar.f6735c = 1;
                wVar.q(context, gVar);
            } else {
                k2 k2Var = new k2(k2.f6728b);
                ak.k kVarPlus = context.plus(k2Var);
                gVar.f42430f = rVar;
                gVar.f6735c = 1;
                wVar.q(kVarPlus, gVar);
                if (k2Var.f6729a) {
                    x0 x0VarA = b2.a();
                    xj.j jVar = x0VarA.f6787d;
                    if (!(jVar != null ? jVar.isEmpty() : true)) {
                        if (x0VarA.f6785b >= 4294967296L) {
                            gVar.f42430f = rVar;
                            gVar.f6735c = 1;
                            x0VarA.u(gVar);
                        } else {
                            x0VarA.w(true);
                            try {
                                gVar.run();
                                do {
                                } while (x0VarA.y());
                            } catch (Throwable th2) {
                                try {
                                    gVar.i(th2);
                                } catch (Throwable th3) {
                                    x0VarA.t(true);
                                    throw th3;
                                }
                            }
                            x0VarA.t(true);
                        }
                    }
                    obj2 = rVar;
                }
            }
            obj2 = aVar;
        }
        if (obj2 != aVar) {
            obj2 = rVar;
        }
        return obj2 == aVar ? aVar : rVar;
    }
}
