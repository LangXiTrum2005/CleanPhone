package j9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends l9.a {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new r(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43736d;

    public g(int i10, int i11, int i12, boolean z10) {
        this.f43733a = i10;
        this.f43734b = i11;
        this.f43735c = i12;
        this.f43736d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f43733a == gVar.f43733a && this.f43734b == gVar.f43734b && this.f43735c == gVar.f43735c && this.f43736d == gVar.f43736d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f43733a), Integer.valueOf(this.f43734b), Integer.valueOf(this.f43735c), Boolean.valueOf(this.f43736d)});
    }

    public final String toString() {
        int i10 = this.f43733a;
        int length = String.valueOf(i10).length();
        int i11 = this.f43734b;
        int length2 = String.valueOf(i11).length();
        int i12 = this.f43735c;
        int length3 = String.valueOf(i12).length();
        boolean z10 = this.f43736d;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z10).length() + 1);
        l1.d.p(sb2, "ComplianceOptions{callerProductId=", i10, ", dataOwnerProductId=", i11);
        sb2.append(", processingReason=");
        sb2.append(i12);
        sb2.append(", isUserData=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f43733a);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f43734b);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f43735c);
        r9.b.Q(parcel, 4, 4);
        parcel.writeInt(this.f43736d ? 1 : 0);
        r9.b.S(parcel, iR);
    }
}
