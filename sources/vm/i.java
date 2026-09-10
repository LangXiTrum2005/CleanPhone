package vm;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl.f f52674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an.g f52675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f52676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jk.b f52677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e[] f52678e;

    public i(yl.f fVar, an.g gVar, Collection collection, jk.b bVar, e... eVarArr) {
        this.f52674a = fVar;
        this.f52675b = gVar;
        this.f52676c = collection;
        this.f52677d = bVar;
        this.f52678e = eVarArr;
    }

    public /* synthetic */ i(yl.f fVar, e[] eVarArr) {
        this(fVar, eVarArr, h.f52665f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(yl.f name, e[] eVarArr, jk.b bVar) {
        this(name, null, null, bVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        kotlin.jvm.internal.n.f(name, "name");
    }

    public /* synthetic */ i(Collection collection, e[] eVarArr) {
        this(collection, eVarArr, h.f52667h);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Collection nameList, e[] eVarArr, jk.b bVar) {
        this(null, null, nameList, bVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        kotlin.jvm.internal.n.f(nameList, "nameList");
    }
}
