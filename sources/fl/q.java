package fl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends v implements pl.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Constructor f41005a;

    public q(Constructor member) {
        kotlin.jvm.internal.n.f(member, "member");
        this.f41005a = member;
    }

    @Override // fl.v
    public final Member b() {
        return this.f41005a;
    }

    @Override // pl.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f41005a.getTypeParameters();
        kotlin.jvm.internal.n.e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new b0(typeVariable));
        }
        return arrayList;
    }
}
