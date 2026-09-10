package fm;

import java.io.Serializable;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import yk.j;
import ym.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41016b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f41018d;

    public c(String str, c0 c0Var) {
        this.f41018d = str;
        this.f41017c = c0Var;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [jk.b, kotlin.jvm.internal.o] */
    @Override // ym.l
    public void b(Object obj) {
        switch (this.f41016b) {
            case 0:
                zk.c current = (zk.c) obj;
                n.f(current, "current");
                c0 c0Var = (c0) this.f41017c;
                if (c0Var.f44760a == null && ((Boolean) ((o) this.f41018d).invoke(current)).booleanValue()) {
                    c0Var.f44760a = current;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, jk.b] */
    @Override // ym.l
    public final boolean c(Object obj) {
        switch (this.f41016b) {
            case 0:
                zk.c current = (zk.c) obj;
                n.f(current, "current");
                return ((c0) this.f41017c).f44760a == null;
            case 1:
                zk.e javaClassDescriptor = (zk.e) obj;
                c0 c0Var = (c0) this.f41017c;
                n.f(javaClassDescriptor, "javaClassDescriptor");
                String strH = go.c.H(javaClassDescriptor, (String) this.f41018d);
                if (yk.n.f54494b.contains(strH)) {
                    c0Var.f44760a = j.f54475a;
                } else if (yk.n.f54495c.contains(strH)) {
                    c0Var.f44760a = j.f54476b;
                } else if (yk.n.f54493a.contains(strH)) {
                    c0Var.f44760a = j.f54478d;
                }
                return c0Var.f44760a == null;
            default:
                boolean[] zArr = (boolean[]) this.f41018d;
                if (((Boolean) this.f41017c.invoke(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
        }
    }

    @Override // ym.l
    public final Object i() {
        switch (this.f41016b) {
            case 0:
                return (zk.c) ((c0) this.f41017c).f44760a;
            case 1:
                j jVar = (j) ((c0) this.f41017c).f44760a;
                return jVar == null ? j.f54477c : jVar;
            default:
                return Boolean.valueOf(((boolean[]) this.f41018d)[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(jk.b bVar, boolean[] zArr) {
        this.f41017c = bVar;
        this.f41018d = zArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(c0 c0Var, jk.b bVar) {
        this.f41017c = c0Var;
        this.f41018d = (o) bVar;
    }
}
