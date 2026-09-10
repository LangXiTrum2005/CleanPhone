package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class fm<T> extends ef {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final T f2066;

    public fm(T t10) {
        this.f2066 = t10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fm fmVar = (fm) obj;
            T t10 = this.f2066;
            if (t10 != null) {
                return t10.equals(fmVar.f2066);
            }
            if (fmVar.f2066 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t10 = this.f2066;
        if (t10 != null) {
            return t10.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2066);
        return sb2.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public final ea mo2164(ee eeVar, cl clVar) {
        return new ea(this.f2066);
    }
}
