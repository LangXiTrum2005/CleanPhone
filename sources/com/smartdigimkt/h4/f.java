package com.smartdigimkt.h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.smartdigimkt.p4.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends com.smartdigimkt.h4.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f35650a;

    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f35652b;

        public /* synthetic */ b(int i2, long j, a aVar) {
            this(i2, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b b(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeInt(this.f35651a);
            parcel.writeLong(this.f35652b);
        }

        private b(int i2, long j) {
            this.f35651a = i2;
            this.f35652b = j;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f35653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f35654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f35655c;
        public final boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f35656e;
        public final List<b> f;
        public final boolean g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f35657h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f35658i;
        public final int j;
        public final int k;

        private c(long j, boolean z2, boolean z3, boolean z4, List<b> list, long j2, boolean z5, long j3, int i2, int i3, int i4) {
            this.f35653a = j;
            this.f35654b = z2;
            this.f35655c = z3;
            this.d = z4;
            this.f = Collections.unmodifiableList(list);
            this.f35656e = j2;
            this.g = z5;
            this.f35657h = j3;
            this.f35658i = i2;
            this.j = i3;
            this.k = i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(s sVar) {
            ArrayList arrayList;
            boolean z2;
            boolean z3;
            long j;
            boolean z4;
            long j2;
            int i2;
            int i3;
            int iX;
            boolean z5;
            long jZ;
            long jZ2 = sVar.z();
            boolean z6 = true;
            if ((sVar.x() & 128) == 0) {
                z6 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z6) {
                arrayList = arrayList2;
                z2 = false;
                z3 = false;
                j = -9223372036854775807L;
                z4 = false;
                j2 = -9223372036854775807L;
                i2 = 0;
                i3 = 0;
                iX = 0;
            } else {
                int iX2 = sVar.x();
                boolean z7 = (iX2 & 128) != 0;
                boolean z8 = (iX2 & 64) != 0 ? z6 : false;
                boolean z9 = (iX2 & 32) != 0 ? z6 : false;
                long jZ3 = z8 ? sVar.z() : -9223372036854775807L;
                if (!z8) {
                    int iX3 = sVar.x();
                    ArrayList arrayList3 = new ArrayList(iX3);
                    int i4 = 0;
                    while (i4 < iX3) {
                        arrayList3.add(new b(sVar.x(), sVar.z(), null));
                        i4++;
                        iX3 = iX3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z9) {
                    long jX = sVar.x();
                    boolean z10 = (128 & jX) != 0;
                    jZ = ((((jX & 1) << 32) | sVar.z()) * 1000) / 90;
                    z5 = z10;
                } else {
                    z5 = false;
                    jZ = -9223372036854775807L;
                }
                int iD = sVar.D();
                int iX4 = sVar.x();
                boolean z11 = z7;
                z4 = z5;
                z2 = z11;
                iX = sVar.x();
                long j3 = jZ3;
                i2 = iD;
                i3 = iX4;
                long j4 = jZ;
                arrayList = arrayList2;
                z3 = z8;
                j = j3;
                j2 = j4;
            }
            return new c(jZ2, z6, z2, z3, arrayList, j, z4, j2, i2, i3, iX);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeLong(this.f35653a);
            parcel.writeByte(this.f35654b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f35655c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            int size = this.f.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f.get(i2).c(parcel);
            }
            parcel.writeLong(this.f35656e);
            parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f35657h);
            parcel.writeInt(this.f35658i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }

        private c(Parcel parcel) {
            this.f35653a = parcel.readLong();
            this.f35654b = parcel.readByte() == 1;
            this.f35655c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(b.b(parcel));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.f35656e = parcel.readLong();
            this.g = parcel.readByte() == 1;
            this.f35657h = parcel.readLong();
            this.f35658i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(Parcel parcel) {
            return new c(parcel);
        }
    }

    public /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static f a(s sVar) {
        int iX = sVar.x();
        ArrayList arrayList = new ArrayList(iX);
        for (int i2 = 0; i2 < iX; i2++) {
            arrayList.add(c.b(sVar));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int size = this.f35650a.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.f35650a.get(i3).c(parcel);
        }
    }

    private f(List<c> list) {
        this.f35650a = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(c.b(parcel));
        }
        this.f35650a = Collections.unmodifiableList(arrayList);
    }
}
