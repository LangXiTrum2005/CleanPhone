package i4;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f42867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f42868g;

    public a(int i10, int i11, String str, String str2, String str3, boolean z10) {
        this.f42862a = str;
        this.f42863b = str2;
        this.f42865d = z10;
        this.f42866e = i10;
        int i12 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i12 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i12 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i12 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.f42864c = i12;
        this.f42867f = str3;
        this.f42868g = i11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            int i10 = aVar.f42868g;
            String str = aVar.f42867f;
            if (this.f42866e != aVar.f42866e || !this.f42862a.equals(aVar.f42862a) || this.f42865d != aVar.f42865d) {
                return false;
            }
            String str2 = this.f42867f;
            int i11 = this.f42868g;
            if (i11 == 1 && i10 == 2 && str2 != null && !str2.equals(str)) {
                return false;
            }
            if (i11 == 2 && i10 == 1 && str != null && !str.equals(str2)) {
                return false;
            }
            if (i11 != 0 && i11 == i10) {
                if (str2 != null) {
                    if (!str2.equals(str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f42864c != aVar.f42864c) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f42862a.hashCode() * 31) + this.f42864c) * 31) + (this.f42865d ? 1231 : 1237)) * 31) + this.f42866e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Column{name='");
        sb2.append(this.f42862a);
        sb2.append("', type='");
        sb2.append(this.f42863b);
        sb2.append("', affinity='");
        sb2.append(this.f42864c);
        sb2.append("', notNull=");
        sb2.append(this.f42865d);
        sb2.append(", primaryKeyPosition=");
        sb2.append(this.f42866e);
        sb2.append(", defaultValue='");
        return defpackage.e.q(this.f42867f, "'}", sb2);
    }
}
