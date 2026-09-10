package n2;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f46490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f46491b;

    public s(u uVar, u uVar2) {
        this.f46490a = uVar;
        this.f46491b = uVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f46490a.equals(sVar.f46490a) && this.f46491b.equals(sVar.f46491b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f46491b.hashCode() + (this.f46490a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder(X3.j.f27834d);
        u uVar = this.f46490a;
        sb2.append(uVar);
        u uVar2 = this.f46491b;
        if (uVar.equals(uVar2)) {
            str = "";
        } else {
            str = ", " + uVar2;
        }
        return defpackage.e.q(str, X3.j.f27836e, sb2);
    }
}
