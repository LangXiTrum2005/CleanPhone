package zl;

import java.io.Serializable;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n extends a implements Serializable {
    public static m j(a aVar, a aVar2, int i10, i0 i0Var, Class cls) {
        return new m(aVar, Collections.EMPTY_LIST, aVar2, new l(i10, i0Var, true), cls);
    }

    public static m k(a aVar, Object obj, a aVar2, int i10, i0 i0Var, Class cls) {
        return new m(aVar, obj, aVar2, new l(i10, i0Var, false), cls);
    }
}
