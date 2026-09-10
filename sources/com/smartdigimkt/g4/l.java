package com.smartdigimkt.g4;

import android.os.Parcel;
import android.os.Parcelable;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.p4.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35441c;

    public class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i2) {
            return new l[i2];
        }
    }

    public l(String str, String str2, String str3) {
        super(str);
        this.f35440b = str2;
        this.f35441c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f35432a.equals(lVar.f35432a) && f0.a((Object) this.f35440b, (Object) lVar.f35440b) && f0.a((Object) this.f35441c, (Object) lVar.f35441c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iB = androidx.datastore.preferences.protobuf.a.b(this.f35432a, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f35440b;
        int iHashCode = (iB + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f35441c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.smartdigimkt.g4.h
    public String toString() {
        return this.f35432a + ": url=" + this.f35441c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f35432a);
        parcel.writeString(this.f35440b);
        parcel.writeString(this.f35441c);
    }

    public l(Parcel parcel) {
        super(parcel.readString());
        this.f35440b = parcel.readString();
        this.f35441c = parcel.readString();
    }
}
