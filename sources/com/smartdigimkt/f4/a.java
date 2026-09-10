package com.smartdigimkt.f4;

import android.os.Parcel;
import android.os.Parcelable;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.p4.f0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements com.smartdigimkt.e4.a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0480a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35081c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f35082e;
    public final byte[] f;
    private int g;

    /* JADX INFO: renamed from: com.smartdigimkt.f4.a$a, reason: collision with other inner class name */
    public class C0480a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public a(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        this.f35079a = str;
        this.f35080b = str2;
        this.f35081c = j;
        this.f35082e = j2;
        this.f = bArr;
        this.d = j3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && this.f35081c == aVar.f35081c && this.f35082e == aVar.f35082e && f0.a((Object) this.f35079a, (Object) aVar.f35079a) && f0.a((Object) this.f35080b, (Object) aVar.f35080b) && Arrays.equals(this.f, aVar.f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.g == 0) {
            String str = this.f35079a;
            int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f35080b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.d;
            int i2 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f35081c;
            int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f35082e;
            this.g = Arrays.hashCode(this.f) + ((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
        }
        return this.g;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f35079a + ", id=" + this.f35082e + ", value=" + this.f35080b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f35079a);
        parcel.writeString(this.f35080b);
        parcel.writeLong(this.d);
        parcel.writeLong(this.f35081c);
        parcel.writeLong(this.f35082e);
        parcel.writeByteArray(this.f);
    }

    public a(Parcel parcel) {
        this.f35079a = parcel.readString();
        this.f35080b = parcel.readString();
        this.d = parcel.readLong();
        this.f35081c = parcel.readLong();
        this.f35082e = parcel.readLong();
        this.f = parcel.createByteArray();
    }
}
