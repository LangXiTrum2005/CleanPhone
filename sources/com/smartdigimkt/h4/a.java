package com.smartdigimkt.h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.smartdigimkt.p4.s;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0501a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f35634c;

    /* JADX INFO: renamed from: com.smartdigimkt.h4.a$a, reason: collision with other inner class name */
    public class C0501a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public /* synthetic */ a(Parcel parcel, C0501a c0501a) {
        this(parcel);
    }

    public static a a(s sVar, int i2, long j) {
        long jZ = sVar.z();
        int i3 = i2 - 4;
        byte[] bArr = new byte[i3];
        sVar.a(bArr, 0, i3);
        return new a(jZ, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f35632a);
        parcel.writeLong(this.f35633b);
        parcel.writeInt(this.f35634c.length);
        parcel.writeByteArray(this.f35634c);
    }

    private a(long j, byte[] bArr, long j2) {
        this.f35632a = j2;
        this.f35633b = j;
        this.f35634c = bArr;
    }

    private a(Parcel parcel) {
        this.f35632a = parcel.readLong();
        this.f35633b = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f35634c = bArr;
        parcel.readByteArray(bArr);
    }
}
