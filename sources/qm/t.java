package qm;

import kotlin.jvm.internal.d0;
import pm.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.j implements jk.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49201b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i10, int i11, Object obj) {
        super(i10, obj);
        this.f49201b = i11;
    }

    @Override // kotlin.jvm.internal.d, qk.c
    public final String getName() {
        switch (this.f49201b) {
            case 0:
                return "isStrictSupertype";
            default:
                return "equalTypes";
        }
    }

    @Override // kotlin.jvm.internal.d
    public final qk.f getOwner() {
        switch (this.f49201b) {
            case 0:
                return d0.f44761a.b(u.class);
            default:
                return d0.f44761a.b(l.class);
        }
    }

    @Override // kotlin.jvm.internal.d
    public final String getSignature() {
        switch (this.f49201b) {
            case 0:
                return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            default:
                return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f49201b) {
            case 0:
                y p10 = (y) obj;
                y p11 = (y) obj2;
                kotlin.jvm.internal.n.f(p10, "p0");
                kotlin.jvm.internal.n.f(p11, "p1");
                ((u) this.receiver).getClass();
                k.f49190b.getClass();
                l lVar = j.f49189b;
                return Boolean.valueOf(lVar.b(p10, p11) && !lVar.b(p11, p10));
            default:
                y p12 = (y) obj;
                y p13 = (y) obj2;
                kotlin.jvm.internal.n.f(p12, "p0");
                kotlin.jvm.internal.n.f(p13, "p1");
                return Boolean.valueOf(((l) this.receiver).a(p12, p13));
        }
    }
}
