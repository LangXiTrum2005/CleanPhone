package q8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f48856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f48862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f48863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f48864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f48865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f48866k;
    public final String l;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f48856a = num;
        this.f48857b = str;
        this.f48858c = str2;
        this.f48859d = str3;
        this.f48860e = str4;
        this.f48861f = str5;
        this.f48862g = str6;
        this.f48863h = str7;
        this.f48864i = str8;
        this.f48865j = str9;
        this.f48866k = str10;
        this.l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f48856a;
            if (num != null ? num.equals(((l) aVar).f48856a) : ((l) aVar).f48856a == null) {
                String str = this.f48857b;
                if (str != null ? str.equals(((l) aVar).f48857b) : ((l) aVar).f48857b == null) {
                    String str2 = this.f48858c;
                    if (str2 != null ? str2.equals(((l) aVar).f48858c) : ((l) aVar).f48858c == null) {
                        String str3 = this.f48859d;
                        if (str3 != null ? str3.equals(((l) aVar).f48859d) : ((l) aVar).f48859d == null) {
                            String str4 = this.f48860e;
                            if (str4 != null ? str4.equals(((l) aVar).f48860e) : ((l) aVar).f48860e == null) {
                                String str5 = this.f48861f;
                                if (str5 != null ? str5.equals(((l) aVar).f48861f) : ((l) aVar).f48861f == null) {
                                    String str6 = this.f48862g;
                                    if (str6 != null ? str6.equals(((l) aVar).f48862g) : ((l) aVar).f48862g == null) {
                                        String str7 = this.f48863h;
                                        if (str7 != null ? str7.equals(((l) aVar).f48863h) : ((l) aVar).f48863h == null) {
                                            String str8 = this.f48864i;
                                            if (str8 != null ? str8.equals(((l) aVar).f48864i) : ((l) aVar).f48864i == null) {
                                                String str9 = this.f48865j;
                                                if (str9 != null ? str9.equals(((l) aVar).f48865j) : ((l) aVar).f48865j == null) {
                                                    String str10 = this.f48866k;
                                                    if (str10 != null ? str10.equals(((l) aVar).f48866k) : ((l) aVar).f48866k == null) {
                                                        String str11 = this.l;
                                                        if (str11 != null ? str11.equals(((l) aVar).l) : ((l) aVar).l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f48856a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f48857b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f48858c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f48859d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f48860e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f48861f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f48862g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f48863h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f48864i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f48865j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f48866k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f48856a);
        sb2.append(", model=");
        sb2.append(this.f48857b);
        sb2.append(", hardware=");
        sb2.append(this.f48858c);
        sb2.append(", device=");
        sb2.append(this.f48859d);
        sb2.append(", product=");
        sb2.append(this.f48860e);
        sb2.append(", osBuild=");
        sb2.append(this.f48861f);
        sb2.append(", manufacturer=");
        sb2.append(this.f48862g);
        sb2.append(", fingerprint=");
        sb2.append(this.f48863h);
        sb2.append(", locale=");
        sb2.append(this.f48864i);
        sb2.append(", country=");
        sb2.append(this.f48865j);
        sb2.append(", mccMnc=");
        sb2.append(this.f48866k);
        sb2.append(", applicationBuild=");
        return defpackage.e.q(this.l, "}", sb2);
    }
}
