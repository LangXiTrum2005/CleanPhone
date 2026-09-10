package im;

import cl.q0;
import zk.h0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f43184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f43185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f43186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f43187i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f43188e;

    static {
        int i10 = 1;
        f43184f = new k(i10, 0);
        f43185g = new k(i10, 1);
        f43186h = new k(i10, 2);
        f43187i = new k(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        super(i10);
        this.f43188e = i11;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f43188e) {
            case 0:
                yl.f it = (yl.f) obj;
                kotlin.jvm.internal.n.f(it, "it");
                return Boolean.TRUE;
            case 1:
                zk.b selectMostSpecificInEachOverridableGroup = (zk.b) obj;
                kotlin.jvm.internal.n.f(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            case 2:
                q0 selectMostSpecificInEachOverridableGroup2 = (q0) obj;
                kotlin.jvm.internal.n.f(selectMostSpecificInEachOverridableGroup2, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup2;
            default:
                h0 selectMostSpecificInEachOverridableGroup3 = (h0) obj;
                kotlin.jvm.internal.n.f(selectMostSpecificInEachOverridableGroup3, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup3;
        }
    }
}
