package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f4249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f4251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f4252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f4257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CharSequence f4259k;
    public final ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f4260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f4261n;

    public b(a aVar) {
        int size = aVar.f4226a.size();
        this.f4249a = new int[size * 6];
        if (!aVar.f4232g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f4250b = new ArrayList(size);
        this.f4251c = new int[size];
        this.f4252d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            q1 q1Var = (q1) aVar.f4226a.get(i11);
            int i12 = i10 + 1;
            this.f4249a[i10] = q1Var.f4446a;
            ArrayList arrayList = this.f4250b;
            Fragment fragment = q1Var.f4447b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f4249a;
            iArr[i12] = q1Var.f4448c ? 1 : 0;
            iArr[i10 + 2] = q1Var.f4449d;
            iArr[i10 + 3] = q1Var.f4450e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = q1Var.f4451f;
            i10 += 6;
            iArr[i13] = q1Var.f4452g;
            this.f4251c[i11] = q1Var.f4453h.ordinal();
            this.f4252d[i11] = q1Var.f4454i.ordinal();
        }
        this.f4253e = aVar.f4231f;
        this.f4254f = aVar.f4233h;
        this.f4255g = aVar.f4243s;
        this.f4256h = aVar.f4234i;
        this.f4257i = aVar.f4235j;
        this.f4258j = aVar.f4236k;
        this.f4259k = aVar.l;
        this.l = aVar.f4237m;
        this.f4260m = aVar.f4238n;
        this.f4261n = aVar.f4239o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f4249a);
        parcel.writeStringList(this.f4250b);
        parcel.writeIntArray(this.f4251c);
        parcel.writeIntArray(this.f4252d);
        parcel.writeInt(this.f4253e);
        parcel.writeString(this.f4254f);
        parcel.writeInt(this.f4255g);
        parcel.writeInt(this.f4256h);
        TextUtils.writeToParcel(this.f4257i, parcel, 0);
        parcel.writeInt(this.f4258j);
        TextUtils.writeToParcel(this.f4259k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.f4260m);
        parcel.writeInt(this.f4261n ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f4249a = parcel.createIntArray();
        this.f4250b = parcel.createStringArrayList();
        this.f4251c = parcel.createIntArray();
        this.f4252d = parcel.createIntArray();
        this.f4253e = parcel.readInt();
        this.f4254f = parcel.readString();
        this.f4255g = parcel.readInt();
        this.f4256h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f4257i = (CharSequence) creator.createFromParcel(parcel);
        this.f4258j = parcel.readInt();
        this.f4259k = (CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.f4260m = parcel.createStringArrayList();
        this.f4261n = parcel.readInt() != 0;
    }
}
