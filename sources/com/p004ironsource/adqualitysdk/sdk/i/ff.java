package com.p004ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes5.dex */
public class ff<T> extends ee {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private T f1974;

    public ff(T t, dm dmVar) {
        super(dmVar);
        this.f1974 = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            T t = this.f1974;
            T t2 = ((ff) obj).f1974;
            if (t != null) {
                return t.equals(t2);
            }
            if (t2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t = this.f1974;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1974);
        return sb.toString();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    public final du mo2050(dr drVar, cp cpVar) {
        return new du(this.f1974);
    }
}
