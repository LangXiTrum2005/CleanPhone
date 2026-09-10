package b4;

import ak.f;
import androidx.work.CoroutineWorker;
import ck.i;
import cn.a0;
import fn.e;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.c0;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5480h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, f fVar, int i10) {
        super(2, fVar);
        this.f5478f = i10;
        this.f5480h = obj;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        switch (this.f5478f) {
            case 0:
                return new a((d) this.f5480h, fVar, 0);
            case 1:
                return new a((dh.b) this.f5480h, fVar, 1);
            case 2:
                return new a((CoroutineWorker) this.f5480h, fVar, 2);
            case 3:
                return new a((c0) this.f5480h, fVar, 3);
            case 4:
                return new a((Date) this.f5480h, fVar, 4);
            case 5:
                return new a((Set) this.f5480h, fVar, 5);
            case 6:
                return new a((e) this.f5480h, fVar, 6);
            case 7:
                return new a((LinkedHashMap) this.f5480h, fVar, 7);
            case 8:
                return new a((jc.c) this.f5480h, fVar, 8);
            case 9:
                return new a((kn.a) this.f5480h, fVar, 9);
            default:
                return new a((com.bumptech.glide.c) this.f5480h, fVar, 10);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        f fVar = (f) obj2;
        switch (this.f5478f) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return ((a) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x022d, code lost:
    
        if (r11 == r7) goto L145;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ck.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
