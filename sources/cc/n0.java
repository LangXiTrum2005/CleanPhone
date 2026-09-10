package cc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f6190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f6192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s2 f6193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r2 f6194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c2 f6195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f6196k;
    public final int l;

    public n0(String str, String str2, String str3, long j10, Long l, boolean z10, b2 b2Var, s2 s2Var, r2 r2Var, c2 c2Var, List list, int i10) {
        this.f6186a = str;
        this.f6187b = str2;
        this.f6188c = str3;
        this.f6189d = j10;
        this.f6190e = l;
        this.f6191f = z10;
        this.f6192g = b2Var;
        this.f6193h = s2Var;
        this.f6194i = r2Var;
        this.f6195j = c2Var;
        this.f6196k = list;
        this.l = i10;
    }

    @Override // cc.t2
    public final m0 a() {
        m0 m0Var = new m0();
        m0Var.f6164a = this.f6186a;
        m0Var.f6165b = this.f6187b;
        m0Var.f6166c = this.f6188c;
        m0Var.f6167d = this.f6189d;
        m0Var.f6168e = this.f6190e;
        m0Var.f6169f = this.f6191f;
        m0Var.f6170g = this.f6192g;
        m0Var.f6171h = this.f6193h;
        m0Var.f6172i = this.f6194i;
        m0Var.f6173j = this.f6195j;
        m0Var.f6174k = this.f6196k;
        m0Var.l = this.l;
        m0Var.f6175m = (byte) 7;
        return m0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l;
        s2 s2Var;
        r2 r2Var;
        c2 c2Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t2) {
            n0 n0Var = (n0) ((t2) obj);
            List list2 = n0Var.f6196k;
            c2 c2Var2 = n0Var.f6195j;
            r2 r2Var2 = n0Var.f6194i;
            s2 s2Var2 = n0Var.f6193h;
            Long l10 = n0Var.f6190e;
            String str2 = n0Var.f6188c;
            if (this.f6186a.equals(n0Var.f6186a) && this.f6187b.equals(n0Var.f6187b) && ((str = this.f6188c) != null ? str.equals(str2) : str2 == null) && this.f6189d == n0Var.f6189d && ((l = this.f6190e) != null ? l.equals(l10) : l10 == null) && this.f6191f == n0Var.f6191f && this.f6192g.equals(n0Var.f6192g) && ((s2Var = this.f6193h) != null ? s2Var.equals(s2Var2) : s2Var2 == null) && ((r2Var = this.f6194i) != null ? r2Var.equals(r2Var2) : r2Var2 == null) && ((c2Var = this.f6195j) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((list = this.f6196k) != null ? list.equals(list2) : list2 == null) && this.l == n0Var.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f6186a.hashCode() ^ 1000003) * 1000003) ^ this.f6187b.hashCode()) * 1000003;
        String str = this.f6188c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f6189d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        Long l = this.f6190e;
        int iHashCode3 = (((((i10 ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f6191f ? 1231 : 1237)) * 1000003) ^ this.f6192g.hashCode()) * 1000003;
        s2 s2Var = this.f6193h;
        int iHashCode4 = (iHashCode3 ^ (s2Var == null ? 0 : s2Var.hashCode())) * 1000003;
        r2 r2Var = this.f6194i;
        int iHashCode5 = (iHashCode4 ^ (r2Var == null ? 0 : r2Var.hashCode())) * 1000003;
        c2 c2Var = this.f6195j;
        int iHashCode6 = (iHashCode5 ^ (c2Var == null ? 0 : c2Var.hashCode())) * 1000003;
        List list = this.f6196k;
        return this.l ^ ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f6186a);
        sb2.append(", identifier=");
        sb2.append(this.f6187b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f6188c);
        sb2.append(", startedAt=");
        sb2.append(this.f6189d);
        sb2.append(", endedAt=");
        sb2.append(this.f6190e);
        sb2.append(", crashed=");
        sb2.append(this.f6191f);
        sb2.append(", app=");
        sb2.append(this.f6192g);
        sb2.append(", user=");
        sb2.append(this.f6193h);
        sb2.append(", os=");
        sb2.append(this.f6194i);
        sb2.append(", device=");
        sb2.append(this.f6195j);
        sb2.append(", events=");
        sb2.append(this.f6196k);
        sb2.append(", generatorType=");
        return l1.d.i(sb2, this.l, "}");
    }
}
