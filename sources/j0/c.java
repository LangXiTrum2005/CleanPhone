package j0;

import android.util.Base64;
import d5.u;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f43550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f43551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f43552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f43553g;

    public c(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f43547a = str;
        str2.getClass();
        this.f43548b = str2;
        this.f43549c = str3;
        list.getClass();
        this.f43550d = list;
        this.f43551e = str4;
        this.f43552f = str5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("-");
        sb2.append(str2);
        sb2.append("-");
        sb2.append(str3);
        this.f43553g = u.h(sb2, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f43547a + ", mProviderPackage: " + this.f43548b + ", mQuery: " + this.f43549c + ", mSystemFont: " + this.f43551e + ", mVariationSettings: " + this.f43552f + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List list = this.f43550d;
            if (i10 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i10++;
        }
    }
}
