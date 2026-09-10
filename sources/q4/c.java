package q4;

import android.os.Parcel;
import android.util.SparseIntArray;
import x.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f48647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f48648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f48649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f48650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f48651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f48652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f48653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f48654k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(0), new e(0), new e(0));
    }

    @Override // q4.b
    public final c a() {
        Parcel parcel = this.f48648e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f48653j;
        if (i10 == this.f48649f) {
            i10 = this.f48650g;
        }
        return new c(parcel, iDataPosition, i10, defpackage.e.q(this.f48651h, "  ", new StringBuilder()), this.f48644a, this.f48645b, this.f48646c);
    }

    @Override // q4.b
    public final boolean e(int i10) {
        while (this.f48653j < this.f48650g) {
            int i11 = this.f48654k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f48653j;
            Parcel parcel = this.f48648e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f48654k = parcel.readInt();
            this.f48653j += i13;
        }
        return this.f48654k == i10;
    }

    @Override // q4.b
    public final void i(int i10) {
        int i11 = this.f48652i;
        SparseIntArray sparseIntArray = this.f48647d;
        Parcel parcel = this.f48648e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(iDataPosition - i12);
            parcel.setDataPosition(iDataPosition);
        }
        this.f48652i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f48647d = new SparseIntArray();
        this.f48652i = -1;
        this.f48654k = -1;
        this.f48648e = parcel;
        this.f48649f = i10;
        this.f48650g = i11;
        this.f48653j = i10;
        this.f48651h = str;
    }
}
