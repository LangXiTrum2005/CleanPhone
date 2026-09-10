package b2;

import android.net.Uri;
import java.util.Objects;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa.o0 f5351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f5352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f5357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f5360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5361k;
    public final String l;

    public o0(n0 n0Var) {
        this.f5351a = oa.o0.e(n0Var.f5337a);
        this.f5352b = n0Var.f5338b.g();
        String str = n0Var.f5340d;
        String str2 = l1.y.f44830a;
        this.f5353c = str;
        this.f5354d = n0Var.f5341e;
        this.f5355e = n0Var.f5342f;
        this.f5357g = n0Var.f5343g;
        this.f5358h = n0Var.f5344h;
        this.f5356f = n0Var.f5339c;
        this.f5359i = n0Var.f5345i;
        this.f5360j = n0Var.f5347k;
        this.f5361k = n0Var.l;
        this.l = n0Var.f5346j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0.class != obj.getClass()) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (this.f5356f != o0Var.f5356f) {
            return false;
        }
        oa.o0 o0Var2 = o0Var.f5351a;
        oa.o0 o0Var3 = this.f5351a;
        o0Var3.getClass();
        return oa.q.g(o0Var2, o0Var3) && this.f5352b.equals(o0Var.f5352b) && Objects.equals(this.f5354d, o0Var.f5354d) && Objects.equals(this.f5353c, o0Var.f5353c) && Objects.equals(this.f5355e, o0Var.f5355e) && Objects.equals(this.l, o0Var.l) && Objects.equals(this.f5357g, o0Var.f5357g) && Objects.equals(this.f5360j, o0Var.f5360j) && Objects.equals(this.f5361k, o0Var.f5361k) && Objects.equals(this.f5358h, o0Var.f5358h) && Objects.equals(this.f5359i, o0Var.f5359i);
    }

    public final int hashCode() {
        int iHashCode = (this.f5352b.hashCode() + ((this.f5351a.hashCode() + 217) * 31)) * 31;
        String str = this.f5354d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5353c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5355e;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f5356f) * 31;
        String str4 = this.l;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f5357g;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f5360j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5361k;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5358h;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f5359i;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
