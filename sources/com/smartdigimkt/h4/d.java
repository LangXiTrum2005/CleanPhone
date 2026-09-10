package com.smartdigimkt.h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.smartdigimkt.p4.c0;
import com.smartdigimkt.p4.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends com.smartdigimkt.h4.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f35642c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f35643e;
    public final long f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<b> f35644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f35645i;
    public final long j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f35646l;
    public final int m;

    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i2) {
            return new d[i2];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f35648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f35649c;

        public /* synthetic */ b(int i2, long j, long j2, a aVar) {
            this(i2, j, j2);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f35647a);
            parcel.writeLong(this.f35648b);
            parcel.writeLong(this.f35649c);
        }

        private b(int i2, long j, long j2) {
            this.f35647a = i2;
            this.f35648b = j;
            this.f35649c = j2;
        }
    }

    public /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static d a(s sVar, long j, c0 c0Var) {
        List list;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        int iX;
        int iX2;
        boolean z6;
        long jZ = sVar.z();
        boolean z7 = (sVar.x() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long jZ2 = -9223372036854775807L;
        if (z7) {
            list = list2;
            j2 = -9223372036854775807L;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            i2 = 0;
            iX = 0;
            iX2 = 0;
        } else {
            int iX3 = sVar.x();
            boolean z8 = (iX3 & 128) != 0;
            boolean z9 = (iX3 & 64) != 0;
            boolean z10 = (iX3 & 32) != 0;
            boolean z11 = (iX3 & 16) != 0;
            long jA = (!z9 || z11) ? -9223372036854775807L : g.a(sVar, j);
            if (!z9) {
                int iX4 = sVar.x();
                ArrayList arrayList = new ArrayList(iX4);
                int i3 = 0;
                while (i3 < iX4) {
                    int iX5 = sVar.x();
                    long jA2 = !z11 ? g.a(sVar, j) : -9223372036854775807L;
                    arrayList.add(new b(iX5, jA2, c0Var.b(jA2), null));
                    i3++;
                    iX4 = iX4;
                }
                list2 = arrayList;
            }
            if (z10) {
                long jX = sVar.x();
                boolean z12 = (128 & jX) != 0;
                jZ2 = ((((jX & 1) << 32) | sVar.z()) * 1000) / 90;
                z6 = z12;
            } else {
                z6 = false;
            }
            int iD = sVar.D();
            long j3 = jA;
            j2 = jZ2;
            jZ2 = j3;
            iX = sVar.x();
            iX2 = sVar.x();
            i2 = iD;
            z5 = z6;
            z2 = z8;
            z3 = z9;
            list = list2;
            z4 = z11;
        }
        return new d(jZ, z7, z2, z3, z4, jZ2, c0Var.b(jZ2), list, z5, j2, i2, iX, iX2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f35640a);
        parcel.writeByte(this.f35641b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35642c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35643e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        int size = this.f35644h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.f35644h.get(i3).b(parcel);
        }
        parcel.writeByte(this.f35645i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.f35646l);
        parcel.writeInt(this.m);
    }

    private d(long j, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, List<b> list, boolean z6, long j4, int i2, int i3, int i4) {
        this.f35640a = j;
        this.f35641b = z2;
        this.f35642c = z3;
        this.d = z4;
        this.f35643e = z5;
        this.f = j2;
        this.g = j3;
        this.f35644h = Collections.unmodifiableList(list);
        this.f35645i = z6;
        this.j = j4;
        this.k = i2;
        this.f35646l = i3;
        this.m = i4;
    }

    private d(Parcel parcel) {
        this.f35640a = parcel.readLong();
        this.f35641b = parcel.readByte() == 1;
        this.f35642c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.f35643e = parcel.readByte() == 1;
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(b.a(parcel));
        }
        this.f35644h = Collections.unmodifiableList(arrayList);
        this.f35645i = parcel.readByte() == 1;
        this.j = parcel.readLong();
        this.k = parcel.readInt();
        this.f35646l = parcel.readInt();
        this.m = parcel.readInt();
    }
}
