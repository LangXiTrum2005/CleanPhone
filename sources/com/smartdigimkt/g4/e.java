package com.smartdigimkt.g4;

import android.os.Parcel;
import android.os.Parcelable;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.p4.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f35414e = "COMM";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35416c;
    public final String d;

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

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f35415b = str;
        this.f35416c = str2;
        this.d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (f0.a((Object) this.f35416c, (Object) eVar.f35416c) && f0.a((Object) this.f35415b, (Object) eVar.f35415b) && f0.a((Object) this.d, (Object) eVar.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f35415b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f35416c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.smartdigimkt.g4.h
    public String toString() {
        return this.f35432a + ": language=" + this.f35415b + ", description=" + this.f35416c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f35432a);
        parcel.writeString(this.f35415b);
        parcel.writeString(this.d);
    }

    public e(Parcel parcel) {
        super("COMM");
        this.f35415b = parcel.readString();
        this.f35416c = parcel.readString();
        this.d = parcel.readString();
    }
}
