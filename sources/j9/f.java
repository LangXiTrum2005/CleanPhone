package j9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends l9.a {

    @NonNull
    public static final Parcelable.Creator<f> CREATOR = r.f43754b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f43729d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f43730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43732c;

    static {
        f fVar = new f(null, false);
        fVar.f43732c = false;
        f43729d = fVar;
    }

    public f(g gVar, boolean z10) {
        this.f43730a = gVar;
        this.f43731b = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return c0.l(this.f43730a, fVar.f43730a) && this.f43732c == fVar.f43732c && this.f43731b == fVar.f43731b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43730a, Boolean.valueOf(this.f43732c), Boolean.valueOf(this.f43731b)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f43730a);
        return q4.a.j(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (this.f43732c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iR = r9.b.R(parcel, 20293);
        r9.b.I(parcel, 1, this.f43730a, i10);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f43731b ? 1 : 0);
        r9.b.S(parcel, iR);
    }
}
