package g6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.b f41709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41711c;

    public y(Class cls, Class cls2, Class cls3, List list, l0.b bVar) {
        this.f41709a = bVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f41710b = list;
        this.f41711c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final a0 a(int i10, int i11, b2.w wVar, com.bumptech.glide.load.data.g gVar, e6.i iVar) {
        l0.b bVar = this.f41709a;
        Object objG = bVar.g();
        a7.h.c(objG, "Argument must not be null");
        List list = (List) objG;
        try {
            List list2 = this.f41710b;
            int size = list2.size();
            a0 a0VarA = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    a0VarA = ((k) list2.get(i12)).a(i10, i11, wVar, gVar, iVar);
                } catch (w e10) {
                    list.add(e10);
                }
                if (a0VarA != null) {
                    break;
                }
            }
            if (a0VarA == null) {
                throw new w(this.f41711c, new ArrayList(list));
            }
            bVar.e(list);
            return a0VarA;
        } catch (Throwable th2) {
            bVar.e(list);
            throw th2;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f41710b.toArray()) + '}';
    }
}
