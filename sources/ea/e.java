package ea;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends l9.a {
    public static final Parcelable.Creator<e> CREATOR = new android.support.v4.media.a(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f39353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i4 f39354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f39355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f39357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f39358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f39359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u f39360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f39361j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f39362k;

    public e(e eVar) {
        k9.c0.h(eVar);
        this.f39352a = eVar.f39352a;
        this.f39353b = eVar.f39353b;
        this.f39354c = eVar.f39354c;
        this.f39355d = eVar.f39355d;
        this.f39356e = eVar.f39356e;
        this.f39357f = eVar.f39357f;
        this.f39358g = eVar.f39358g;
        this.f39359h = eVar.f39359h;
        this.f39360i = eVar.f39360i;
        this.f39361j = eVar.f39361j;
        this.f39362k = eVar.f39362k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 2, this.f39352a);
        r9.b.J(parcel, 3, this.f39353b);
        r9.b.I(parcel, 4, this.f39354c, i10);
        long j10 = this.f39355d;
        r9.b.Q(parcel, 5, 8);
        parcel.writeLong(j10);
        boolean z10 = this.f39356e;
        r9.b.Q(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        r9.b.J(parcel, 7, this.f39357f);
        r9.b.I(parcel, 8, this.f39358g, i10);
        long j11 = this.f39359h;
        r9.b.Q(parcel, 9, 8);
        parcel.writeLong(j11);
        r9.b.I(parcel, 10, this.f39360i, i10);
        r9.b.Q(parcel, 11, 8);
        parcel.writeLong(this.f39361j);
        r9.b.I(parcel, 12, this.f39362k, i10);
        r9.b.S(parcel, iR);
    }

    public e(String str, String str2, i4 i4Var, long j10, boolean z10, String str3, u uVar, long j11, u uVar2, long j12, u uVar3) {
        this.f39352a = str;
        this.f39353b = str2;
        this.f39354c = i4Var;
        this.f39355d = j10;
        this.f39356e = z10;
        this.f39357f = str3;
        this.f39358g = uVar;
        this.f39359h = j11;
        this.f39360i = uVar2;
        this.f39361j = j12;
        this.f39362k = uVar3;
    }
}
