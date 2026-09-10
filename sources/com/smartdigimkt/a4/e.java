package com.smartdigimkt.a4;

import android.os.Parcel;
import android.os.Parcelable;
import com.smartdigimkt.p4.f0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f33636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33638c;
    public final int d;

    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i2) {
            return new e[i2];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f33639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final UUID f33640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f33641c;
        public final String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f33642e;
        public final boolean f;

        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i2) {
                return new b[i2];
            }
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public boolean b(b bVar) {
            return a() && !bVar.a() && a(bVar.f33640b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return f0.a((Object) this.f33641c, (Object) bVar.f33641c) && f0.a((Object) this.d, (Object) bVar.d) && f0.a(this.f33640b, bVar.f33640b) && Arrays.equals(this.f33642e, bVar.f33642e);
        }

        public int hashCode() {
            if (this.f33639a == 0) {
                int iHashCode = this.f33640b.hashCode() * 31;
                String str = this.f33641c;
                this.f33639a = Arrays.hashCode(this.f33642e) + androidx.datastore.preferences.protobuf.a.b(this.d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f33639a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f33640b.getMostSignificantBits());
            parcel.writeLong(this.f33640b.getLeastSignificantBits());
            parcel.writeString(this.f33641c);
            parcel.writeString(this.d);
            parcel.writeByteArray(this.f33642e);
            parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        }

        public b(UUID uuid, String str, byte[] bArr, boolean z2) {
            this(uuid, null, str, bArr, z2);
        }

        public boolean a(UUID uuid) {
            return com.smartdigimkt.w3.b.h1.equals(this.f33640b) || uuid.equals(this.f33640b);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr, boolean z2) {
            this.f33640b = (UUID) com.smartdigimkt.p4.a.a(uuid);
            this.f33641c = str;
            this.d = (String) com.smartdigimkt.p4.a.a(str2);
            this.f33642e = bArr;
            this.f = z2;
        }

        public boolean a() {
            return this.f33642e != null;
        }

        public b(Parcel parcel) {
            this.f33640b = new UUID(parcel.readLong(), parcel.readLong());
            this.f33641c = parcel.readString();
            this.d = parcel.readString();
            this.f33642e = parcel.createByteArray();
            this.f = parcel.readByte() != 0;
        }
    }

    public e(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[list.size()]));
    }

    public static e a(e eVar, e eVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (eVar != null) {
            str = eVar.f33638c;
            for (b bVar : eVar.f33636a) {
                if (bVar.a()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (eVar2 != null) {
            if (str == null) {
                str = eVar2.f33638c;
            }
            int size = arrayList.size();
            for (b bVar2 : eVar2.f33636a) {
                if (bVar2.a() && !a(arrayList, size, bVar2.f33640b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new e(str, arrayList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (f0.a((Object) this.f33638c, (Object) eVar.f33638c) && Arrays.equals(this.f33636a, eVar.f33636a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f33637b == 0) {
            String str = this.f33638c;
            this.f33637b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f33636a);
        }
        return this.f33637b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f33638c);
        parcel.writeTypedArray(this.f33636a, 0);
    }

    public e(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[list.size()]));
    }

    public e(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public e(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    private e(String str, boolean z2, b... bVarArr) {
        this.f33638c = str;
        bVarArr = z2 ? (b[]) bVarArr.clone() : bVarArr;
        Arrays.sort(bVarArr, this);
        this.f33636a = bVarArr;
        this.d = bVarArr.length;
    }

    public e(Parcel parcel) {
        this.f33638c = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f33636a = bVarArr;
        this.d = bVarArr.length;
    }

    @Deprecated
    public b a(UUID uuid) {
        for (b bVar : this.f33636a) {
            if (bVar.a(uuid)) {
                return bVar;
            }
        }
        return null;
    }

    public b a(int i2) {
        return this.f33636a[i2];
    }

    public e a(String str) {
        return f0.a((Object) this.f33638c, (Object) str) ? this : new e(str, false, this.f33636a);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = com.smartdigimkt.w3.b.h1;
        if (uuid.equals(bVar.f33640b)) {
            return uuid.equals(bVar2.f33640b) ? 0 : 1;
        }
        return bVar.f33640b.compareTo(bVar2.f33640b);
    }

    private static boolean a(ArrayList<b> arrayList, int i2, UUID uuid) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (arrayList.get(i3).f33640b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }
}
