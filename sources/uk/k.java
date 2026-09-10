package uk;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f52235e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Field field, boolean z10, int i10) {
        super(field, z10);
        this.f52235e = i10;
    }

    @Override // uk.u
    public void c(Object[] args) {
        switch (this.f52235e) {
            case 1:
                kotlin.jvm.internal.n.f(args, "args");
                com.google.android.gms.internal.auth.o.c(this, args);
                d(xj.k.p0(args));
                break;
            default:
                super.c(args);
                break;
        }
    }
}
