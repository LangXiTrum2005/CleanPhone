package tk;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j1 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k1 f50998f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(k1 k1Var, int i10) {
        super(0);
        this.f50997e = i10;
        this.f50998f = k1Var;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f50997e) {
            case 0:
                o1 o1Var = this.f50998f.f51003b;
                Type type = o1Var != null ? (Type) o1Var.invoke() : null;
                kotlin.jvm.internal.n.c(type);
                return fl.c.c(type);
            default:
                k1 k1Var = this.f50998f;
                return k1Var.a(k1Var.f51002a);
        }
    }
}
