package com.smartdigimkt.g4;

import android.os.Parcel;
import android.os.Parcelable;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.p4.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f35433e = "----";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35435c;
    public final String d;

    public class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i2) {
            return new i[i2];
        }
    }

    public i(String str, String str2, String str3) {
        super("----");
        this.f35434b = str;
        this.f35435c = str2;
        this.d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (f0.a((Object) this.f35435c, (Object) iVar.f35435c) && f0.a((Object) this.f35434b, (Object) iVar.f35434b) && f0.a((Object) this.d, (Object) iVar.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f35434b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f35435c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.smartdigimkt.g4.h
    public String toString() {
        return this.f35432a + ": domain=" + this.f35434b + ", description=" + this.f35435c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f35432a);
        parcel.writeString(this.f35434b);
        parcel.writeString(this.d);
    }

    public i(Parcel parcel) {
        super("----");
        this.f35434b = (String) com.smartdigimkt.p4.a.a(parcel.readString());
        this.f35435c = (String) com.smartdigimkt.p4.a.a(parcel.readString());
        this.d = (String) com.smartdigimkt.p4.a.a(parcel.readString());
    }
}
