package a3;

import com.google.android.gms.internal.ads.o6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d5.u;
import go.k;
import i1.b0;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3377f;

    public b(int i10, int i11, String str, String str2, String str3, boolean z10) {
        k.i(i11 == -1 || i11 > 0);
        this.f3372a = i10;
        this.f3373b = str;
        this.f3374c = str2;
        this.f3375d = str3;
        this.f3376e = z10;
        this.f3377f = i11;
    }

    public static b d(Map map) {
        boolean z10;
        int i10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        List list = (List) map.get("icy-br");
        boolean z11 = true;
        int i12 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i11 = Integer.parseInt(str4) * 1000;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        l1.a.s("IcyHeaders", "Invalid bitrate: " + str4);
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        u.q("Invalid bitrate header: ", str4, "IcyHeaders");
                        z10 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            z10 = false;
            i10 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z10 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i13 = Integer.parseInt(str5);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        l1.a.s("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        u.q("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        int i14 = i12;
        if (z10) {
            return new b(i10, i14, str, str2, str3, zEquals);
        }
        return null;
    }

    @Override // i1.b0
    public final void b(o6 o6Var) {
        String str = this.f3374c;
        if (str != null) {
            o6Var.f18173x = str;
        }
        String str2 = this.f3373b;
        if (str2 != null) {
            o6Var.f18172w = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f3372a == bVar.f3372a && Objects.equals(this.f3373b, bVar.f3373b) && Objects.equals(this.f3374c, bVar.f3374c) && Objects.equals(this.f3375d, bVar.f3375d) && this.f3376e == bVar.f3376e && this.f3377f == bVar.f3377f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f3372a) * 31;
        String str = this.f3373b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3374c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3375d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f3376e ? 1 : 0)) * 31) + this.f3377f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f3374c + "\", genre=\"" + this.f3373b + "\", bitrate=" + this.f3372a + ", metadataInterval=" + this.f3377f;
    }
}
