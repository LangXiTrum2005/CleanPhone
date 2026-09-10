package l1;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44821b;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(int i10, int i11) {
        String strH;
        if (i10 == 0) {
            strH = defpackage.e.h(i11, "Player stuck buffering and not loading for ", " ms");
        } else if (i10 == 1) {
            strH = defpackage.e.h(i11, "Player stuck buffering with no progress for ", " ms");
        } else if (i10 == 2) {
            strH = defpackage.e.h(i11, "Player stuck playing with no progress for ", " ms");
        } else if (i10 == 3) {
            strH = defpackage.e.h(i11, "Player stuck playing without ending for ", " ms");
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            strH = defpackage.e.h(i11, "Player stuck suppressed for ", " ms");
        }
        super(strH);
        this.f44820a = i10;
        this.f44821b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f44820a == tVar.f44820a && this.f44821b == tVar.f44821b;
    }

    public final int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f44820a) * 31) + this.f44821b;
    }
}
