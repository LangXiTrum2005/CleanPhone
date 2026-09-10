package uk;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f52237g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Field field, boolean z10, boolean z11, int i10) {
        super(field, z10, z11);
        this.f52237g = i10;
    }

    @Override // uk.p, uk.u
    public void c(Object[] args) {
        switch (this.f52237g) {
            case 1:
                kotlin.jvm.internal.n.f(args, "args");
                super.c(args);
                d(xj.k.p0(args));
                break;
            default:
                super.c(args);
                break;
        }
    }
}
