package l7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f45208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f45209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f45210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final jj.d f45201j = new jj.d(14);
    public static final Parcelable.Creator<q> CREATOR = new h(3);

    /* JADX WARN: Code duplicated, block: B:7:0x0034  */
    public q(int i10, int i11, int i12, String str, String str2, String str3, String str4, Object obj, n nVar, boolean z10) {
        Set set;
        Set set2;
        Set set3;
        this.f45202a = i10;
        this.f45203b = i11;
        this.f45204c = i12;
        this.f45205d = str;
        this.f45206e = str3;
        this.f45207f = str4;
        this.f45208g = obj;
        this.f45209h = str2;
        jj.d dVar = f45201j;
        int i13 = 2;
        if (nVar != null) {
            this.f45210i = nVar;
        } else {
            this.f45210i = new u(this, a());
            q7.j jVarX = dVar.x();
            Map map = jVarX.f48704b;
            Map map2 = jVarX.f48705c;
            Map map3 = jVarX.f48703a;
            if (z10) {
                i13 = 3;
            } else if (map3 == null || !map3.containsKey(Integer.valueOf(i11)) || ((set3 = (Set) map3.get(Integer.valueOf(i11))) != null && !set3.contains(Integer.valueOf(i12)))) {
                if (map2 != null && map2.containsKey(Integer.valueOf(i11)) && ((set2 = (Set) map2.get(Integer.valueOf(i11))) == null || set2.contains(Integer.valueOf(i12)))) {
                    i13 = 1;
                } else if (map != null && map.containsKey(Integer.valueOf(i11)) && ((set = (Set) map.get(Integer.valueOf(i11))) == null || set.contains(Integer.valueOf(i12)))) {
                    i13 = 3;
                }
            }
        }
        dVar.x();
        int i14 = q7.i.f48696a[v0.i.c(i13)];
    }

    public final String a() {
        String str = this.f45209h;
        if (str != null) {
            return str;
        }
        n nVar = this.f45210i;
        if (nVar != null) {
            return nVar.getLocalizedMessage();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = "{HttpStatus: " + this.f45202a + ", errorCode: " + this.f45203b + ", subErrorCode: " + this.f45204c + ", errorType: " + this.f45205d + ", errorMessage: " + a() + "}";
        kotlin.jvm.internal.n.e(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        kotlin.jvm.internal.n.f(out, "out");
        out.writeInt(this.f45202a);
        out.writeInt(this.f45203b);
        out.writeInt(this.f45204c);
        out.writeString(this.f45205d);
        out.writeString(a());
        out.writeString(this.f45206e);
        out.writeString(this.f45207f);
    }

    public q(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof n ? (n) exc : new n(exc), false);
    }

    public q(int i10, String str, String str2) {
        this(-1, i10, -1, str, str2, null, null, null, null, false);
    }
}
