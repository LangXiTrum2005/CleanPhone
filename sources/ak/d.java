package ak;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k[] f3616a;

    public d(k[] kVarArr) {
        this.f3616a = kVarArr;
    }

    private final Object readResolve() {
        k[] kVarArr = this.f3616a;
        k kVarPlus = l.f3620a;
        for (k kVar : kVarArr) {
            kVarPlus = kVarPlus.plus(kVar);
        }
        return kVarPlus;
    }
}
