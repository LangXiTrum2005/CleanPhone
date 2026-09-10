package i9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import eb.d0;
import java.util.Arrays;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends l9.a {

    @NonNull
    public static final Parcelable.Creator<c> CREATOR = new f9.d(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f42923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42924d;

    public c(long j10, int i10, String str, boolean z10) {
        this.f42921a = str;
        this.f42922b = i10;
        this.f42923c = j10;
        this.f42924d = z10;
    }

    public final long b() {
        long j10 = this.f42923c;
        return j10 == -1 ? this.f42922b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (c0.l(this.f42921a, cVar.f42921a) && b() == cVar.b() && this.f42924d == cVar.f42924d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42921a, Long.valueOf(b()), Boolean.valueOf(this.f42924d)});
    }

    public final String toString() {
        d0 d0Var = new d0(this);
        d0Var.P0(this.f42921a, "name");
        d0Var.P0(Long.valueOf(b()), "version");
        d0Var.P0(Boolean.valueOf(this.f42924d), "is_fully_rolled_out");
        return d0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 1, this.f42921a);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f42922b);
        long jB = b();
        r9.b.Q(parcel, 3, 8);
        parcel.writeLong(jB);
        r9.b.Q(parcel, 4, 4);
        parcel.writeInt(this.f42924d ? 1 : 0);
        r9.b.S(parcel, iR);
    }

    public c(String str, long j10) {
        this(j10, -1, str, false);
    }
}
