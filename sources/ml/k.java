package ml;

import cl.q0;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f46207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f46208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f46209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f46210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k f46211j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46212e;

    static {
        int i10 = 1;
        f46207f = new k(i10, 0);
        f46208g = new k(i10, 1);
        f46209h = new k(i10, 2);
        f46210i = new k(i10, 3);
        f46211j = new k(i10, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        super(i10);
        this.f46212e = i11;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f46212e) {
            case 0:
                fl.v it = (fl.v) obj;
                kotlin.jvm.internal.n.f(it, "it");
                return Boolean.valueOf(!Modifier.isStatic(it.b().getModifiers()));
            case 1:
                q0 selectMostSpecificInEachOverridableGroup = (q0) obj;
                kotlin.jvm.internal.n.f(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            case 2:
                fl.v it2 = (fl.v) obj;
                kotlin.jvm.internal.n.f(it2, "it");
                return Boolean.valueOf(Modifier.isStatic(it2.b().getModifiers()));
            case 3:
                im.n it3 = (im.n) obj;
                kotlin.jvm.internal.n.f(it3, "it");
                return it3.g();
            default:
                zk.g gVarE = ((pm.y) obj).P().e();
                if (gVarE instanceof zk.e) {
                    return (zk.e) gVarE;
                }
                return null;
        }
    }
}
