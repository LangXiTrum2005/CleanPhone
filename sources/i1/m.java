package i1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Comparator, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new k(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l[] f42577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42580d;

    public m(ArrayList arrayList, String str) {
        this(str, false, (l[]) arrayList.toArray(new l[0]));
    }

    public final m a(String str) {
        return Objects.equals(this.f42579c, str) ? this : new m(str, false, this.f42577a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        l lVar = (l) obj;
        l lVar2 = (l) obj2;
        UUID uuid = g.f42538a;
        if (uuid.equals(lVar.f42570b)) {
            return uuid.equals(lVar2.f42570b) ? 0 : 1;
        }
        return lVar.f42570b.compareTo(lVar2.f42570b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f42579c, mVar.f42579c) && Arrays.equals(this.f42577a, mVar.f42577a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f42578b == 0) {
            String str = this.f42579c;
            this.f42578b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f42577a);
        }
        return this.f42578b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42579c);
        parcel.writeTypedArray(this.f42577a, 0);
    }

    public m(l... lVarArr) {
        this(null, true, lVarArr);
    }

    public m(String str, boolean z10, l... lVarArr) {
        this.f42579c = str;
        lVarArr = z10 ? (l[]) lVarArr.clone() : lVarArr;
        this.f42577a = lVarArr;
        this.f42580d = lVarArr.length;
        Arrays.sort(lVarArr, this);
    }

    public m(Parcel parcel) {
        this.f42579c = parcel.readString();
        l[] lVarArr = (l[]) parcel.createTypedArray(l.CREATOR);
        String str = l1.y.f44830a;
        this.f42577a = lVarArr;
        this.f42580d = lVarArr.length;
    }
}
