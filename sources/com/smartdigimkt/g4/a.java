package com.smartdigimkt.g4;

import android.os.Parcel;
import android.os.Parcelable;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.p4.f0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new C0491a();
    public static final String f = "APIC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35404c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f35405e;

    /* JADX INFO: renamed from: com.smartdigimkt.g4.a$a, reason: collision with other inner class name */
    public class C0491a implements Parcelable.Creator<a> {
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

    public a(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.f35403b = str;
        this.f35404c = str2;
        this.d = i2;
        this.f35405e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && f0.a((Object) this.f35403b, (Object) aVar.f35403b) && f0.a((Object) this.f35404c, (Object) aVar.f35404c) && Arrays.equals(this.f35405e, aVar.f35405e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = (this.d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f35403b;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f35404c;
        return Arrays.hashCode(this.f35405e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.smartdigimkt.g4.h
    public String toString() {
        return this.f35432a + ": mimeType=" + this.f35403b + ", description=" + this.f35404c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f35403b);
        parcel.writeString(this.f35404c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.f35405e);
    }

    public a(Parcel parcel) {
        super("APIC");
        this.f35403b = parcel.readString();
        this.f35404c = parcel.readString();
        this.d = parcel.readInt();
        this.f35405e = parcel.createByteArray();
    }
}
