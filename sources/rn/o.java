package rn;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements pn.d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn.d f49739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f49741c;

    public o(pn.d original) {
        Set setA;
        kotlin.jvm.internal.n.f(original, "original");
        this.f49739a = original;
        this.f49740b = original.h() + '?';
        kotlin.jvm.internal.n.f(original, "<this>");
        if (original instanceof b) {
            setA = ((b) original).a();
        } else {
            HashSet hashSet = new HashSet(original.d());
            int iD = original.d();
            for (int i10 = 0; i10 < iD; i10++) {
                hashSet.add(original.e(i10));
            }
            setA = hashSet;
        }
        this.f49741c = setA;
    }

    @Override // rn.b
    public final Set a() {
        return this.f49741c;
    }

    @Override // pn.d
    public final boolean b() {
        return true;
    }

    @Override // pn.d
    public final int c(String name) {
        kotlin.jvm.internal.n.f(name, "name");
        return this.f49739a.c(name);
    }

    @Override // pn.d
    public final int d() {
        return this.f49739a.d();
    }

    @Override // pn.d
    public final String e(int i10) {
        return this.f49739a.e(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return kotlin.jvm.internal.n.a(this.f49739a, ((o) obj).f49739a);
        }
        return false;
    }

    @Override // pn.d
    public final List f(int i10) {
        return this.f49739a.f(i10);
    }

    @Override // pn.d
    public final pn.d g(int i10) {
        return this.f49739a.g(i10);
    }

    @Override // pn.d
    public final List getAnnotations() {
        return this.f49739a.getAnnotations();
    }

    @Override // pn.d
    public final com.google.android.gms.internal.auth.o getKind() {
        return this.f49739a.getKind();
    }

    @Override // pn.d
    public final String h() {
        return this.f49740b;
    }

    public final int hashCode() {
        return this.f49739a.hashCode() * 31;
    }

    @Override // pn.d
    public final boolean i(int i10) {
        return this.f49739a.i(i10);
    }

    @Override // pn.d
    public final boolean isInline() {
        return this.f49739a.isInline();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f49739a);
        sb2.append('?');
        return sb2.toString();
    }
}
