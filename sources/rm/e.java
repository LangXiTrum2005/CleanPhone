package rm;

import d5.u;
import il.o;
import im.n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import qk.i0;
import xj.v;
import xj.x;
import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class e implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49662b;

    public e(int i10, String... formatParams) {
        String str;
        u.n(i10, "kind");
        kotlin.jvm.internal.n.f(formatParams, "formatParams");
        switch (i10) {
            case 1:
                str = "No member resolution should be done on captured type, it used only during constraint system resolution";
                break;
            case 2:
                str = "Scope for integer literal type (%s)";
                break;
            case 3:
                str = "Error scope for erased receiver type";
                break;
            case 4:
                str = "Scope for abbreviation %s";
                break;
            case 5:
                str = "Scope for stub type %s";
                break;
            case 6:
                str = "A scope for common supertype which is not a normal classifier";
                break;
            case 7:
                str = "Scope for error type %s";
                break;
            case 8:
                str = "Scope for unsupported type %s";
                break;
            case 9:
                str = "Error scope for class %s with arguments: %s";
                break;
            case 10:
                str = "Error resolution candidate for call %s";
                break;
            default:
                throw null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f49662b = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // im.n
    public Set b() {
        return x.f53868a;
    }

    @Override // im.p
    public zk.g c(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        return new a(yl.f.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{name}, 1))));
    }

    @Override // im.p
    public Collection d(im.f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        return v.f53866a;
    }

    @Override // im.n
    public Set e() {
        return x.f53868a;
    }

    @Override // im.n
    public Set g() {
        return x.f53868a;
    }

    @Override // im.n
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set a(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        a containingDeclaration = i.f49700c;
        kotlin.jvm.internal.n.f(containingDeclaration, "containingDeclaration");
        b bVar2 = new b(containingDeclaration, null, al.i.f3645a, yl.f.g("<Error function>"), 1, j0.C9);
        f fVarC = i.c(h.RETURN_TYPE_FOR_FUNCTION, new String[0]);
        o oVar = zk.n.f54978e;
        v vVar = v.f53866a;
        bVar2.O0(null, null, vVar, vVar, vVar, fVarC, 3, oVar);
        return i0.k0(bVar2);
    }

    @Override // im.n
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set f(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        return i.f49703f;
    }

    public String toString() {
        return wi.d.k(new StringBuilder("ErrorScope{"), this.f49662b, '}');
    }
}
