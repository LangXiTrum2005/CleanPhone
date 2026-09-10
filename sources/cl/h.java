package cl;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements jk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6517b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f6516a = i10;
        this.f6517b = obj;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f6516a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("Scope for type parameter ");
                i iVar = (i) this.f6517b;
                sb2.append(((yl.f) iVar.f6521b).b());
                return android.support.v4.media.session.a.l(sb2.toString(), ((k) iVar.f6522c).getUpperBounds());
            case 1:
                u uVar = (u) this.f6517b;
                HashSet hashSet = new HashSet();
                for (yl.f fVar : (Set) uVar.f6602e.f6605i.invoke()) {
                    if (fVar == null) {
                        u.h(5);
                        throw null;
                    }
                    hashSet.addAll((Collection) uVar.f6599b.invoke(fVar));
                    hashSet.addAll((Collection) uVar.f6600c.invoke(fVar));
                }
                return hashSet;
            default:
                return (List) this.f6517b;
        }
    }
}
