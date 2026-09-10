package jj;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f43955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f43956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f43957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f43958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f43959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f43960f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (Objects.equals(this.f43955a, lVar.f43955a) && this.f43956b.equals(lVar.f43956b) && this.f43957c.equals(lVar.f43957c) && Objects.equals(this.f43958d, lVar.f43958d) && Objects.equals(this.f43959e, lVar.f43959e) && Objects.equals(this.f43960f, lVar.f43960f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43955a, this.f43956b, this.f43957c, this.f43958d, this.f43959e, this.f43960f);
    }
}
