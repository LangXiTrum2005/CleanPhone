package m5;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f45873b;

    public c(String str, long j10) {
        this.f45872a = str;
        this.f45873b = Long.valueOf(j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Long l = cVar.f45873b;
        if (!this.f45872a.equals(cVar.f45872a)) {
            return false;
        }
        Long l10 = this.f45873b;
        if (l10 != null) {
            return l10.equals(l);
        }
        return l == null;
    }

    public final int hashCode() {
        int iHashCode = this.f45872a.hashCode() * 31;
        Long l = this.f45873b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }
}
