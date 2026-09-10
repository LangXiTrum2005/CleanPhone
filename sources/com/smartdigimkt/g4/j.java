package com.smartdigimkt.g4;

import android.os.Parcel;
import android.os.Parcelable;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.p4.f0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new a();
    public static final String d = "PRIV";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f35437c;

    public class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i2) {
            return new j[i2];
        }
    }

    public j(String str, byte[] bArr) {
        super("PRIV");
        this.f35436b = str;
        this.f35437c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (f0.a((Object) this.f35436b, (Object) jVar.f35436b) && Arrays.equals(this.f35437c, jVar.f35437c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f35436b;
        return Arrays.hashCode(this.f35437c) + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // com.smartdigimkt.g4.h
    public String toString() {
        return this.f35432a + ": owner=" + this.f35436b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f35436b);
        parcel.writeByteArray(this.f35437c);
    }

    public j(Parcel parcel) {
        super("PRIV");
        this.f35436b = parcel.readString();
        this.f35437c = parcel.createByteArray();
    }
}
