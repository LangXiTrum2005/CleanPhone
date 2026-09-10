package mb;

import cn.d0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.n;
import tb.q;
import tb.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements tb.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f45938b = new h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f45939c = new h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f45940d = new h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f45941e = new h(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45942a;

    public /* synthetic */ h(int i10) {
        this.f45942a = i10;
    }

    @Override // tb.d
    public final Object g(s sVar) {
        switch (this.f45942a) {
            case 0:
                Object objG = sVar.g(new q(sb.a.class, Executor.class));
                n.e(objG, "get(...)");
                return d0.o((Executor) objG);
            case 1:
                Object objG2 = sVar.g(new q(sb.c.class, Executor.class));
                n.e(objG2, "get(...)");
                return d0.o((Executor) objG2);
            case 2:
                Object objG3 = sVar.g(new q(sb.b.class, Executor.class));
                n.e(objG3, "get(...)");
                return d0.o((Executor) objG3);
            default:
                Object objG4 = sVar.g(new q(sb.d.class, Executor.class));
                n.e(objG4, "get(...)");
                return d0.o((Executor) objG4);
        }
    }
}
