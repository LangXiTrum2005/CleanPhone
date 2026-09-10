package com.smartdigimkt.g4;

import android.os.Parcel;
import android.os.Parcelable;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.p4.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35439c;

    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i2) {
            return new k[i2];
        }
    }

    public k(String str, String str2, String str3) {
        super(str);
        this.f35438b = str2;
        this.f35439c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f35432a.equals(kVar.f35432a) && f0.a((Object) this.f35438b, (Object) kVar.f35438b) && f0.a((Object) this.f35439c, (Object) kVar.f35439c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iB = androidx.datastore.preferences.protobuf.a.b(this.f35432a, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f35438b;
        int iHashCode = (iB + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f35439c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.smartdigimkt.g4.h
    public String toString() {
        return this.f35432a + ": value=" + this.f35439c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f35432a);
        parcel.writeString(this.f35438b);
        parcel.writeString(this.f35439c);
    }

    public k(Parcel parcel) {
        super(parcel.readString());
        this.f35438b = parcel.readString();
        this.f35439c = parcel.readString();
    }
}
