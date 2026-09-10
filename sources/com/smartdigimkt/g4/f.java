package com.smartdigimkt.g4;

import android.os.Parcel;
import android.os.Parcelable;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.p4.f0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new a();
    public static final String f = "GEOB";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35418c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f35419e;

    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f35417b = str;
        this.f35418c = str2;
        this.d = str3;
        this.f35419e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (f0.a((Object) this.f35417b, (Object) fVar.f35417b) && f0.a((Object) this.f35418c, (Object) fVar.f35418c) && f0.a((Object) this.d, (Object) fVar.d) && Arrays.equals(this.f35419e, fVar.f35419e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f35417b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f35418c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return Arrays.hashCode(this.f35419e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.smartdigimkt.g4.h
    public String toString() {
        return this.f35432a + ": mimeType=" + this.f35417b + ", filename=" + this.f35418c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f35417b);
        parcel.writeString(this.f35418c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f35419e);
    }

    public f(Parcel parcel) {
        super("GEOB");
        this.f35417b = parcel.readString();
        this.f35418c = parcel.readString();
        this.d = parcel.readString();
        this.f35419e = parcel.createByteArray();
    }
}
