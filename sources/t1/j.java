package t1;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f50381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f50382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f50384d;

    public j(String str, long j10, long j11) {
        this.f50383c = str == null ? "" : str;
        this.f50381a = j10;
        this.f50382b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String strP = l1.a.p(str, this.f50383c);
        if (jVar != null) {
            long j10 = jVar.f50382b;
            if (strP.equals(l1.a.p(str, jVar.f50383c))) {
                long j11 = this.f50382b;
                if (j11 != -1) {
                    long j12 = this.f50381a;
                    jVar2 = null;
                    if (j12 + j11 == jVar.f50381a) {
                        return new j(strP, j12, j10 != -1 ? j11 + j10 : -1L);
                    }
                } else {
                    jVar2 = null;
                }
                if (j10 == -1) {
                    return jVar2;
                }
                long j13 = jVar.f50381a;
                if (j13 + j10 == this.f50381a) {
                    return new j(strP, j13, j11 != -1 ? j10 + j11 : -1L);
                }
                return jVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f50381a == jVar.f50381a && this.f50382b == jVar.f50382b && this.f50383c.equals(jVar.f50383c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f50384d == 0) {
            this.f50384d = this.f50383c.hashCode() + ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.f50381a)) * 31) + ((int) this.f50382b)) * 31);
        }
        return this.f50384d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f50383c);
        sb2.append(", start=");
        sb2.append(this.f50381a);
        sb2.append(", length=");
        return defpackage.e.r(sb2, this.f50382b, ")");
    }
}
