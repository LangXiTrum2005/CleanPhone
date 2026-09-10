package com.smartdigimkt.g4;

import android.os.Parcel;
import android.os.Parcelable;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f35406b;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f35406b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f35432a.equals(bVar.f35432a) && Arrays.equals(this.f35406b, bVar.f35406b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f35406b) + androidx.datastore.preferences.protobuf.a.b(this.f35432a, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f35432a);
        parcel.writeByteArray(this.f35406b);
    }

    public b(Parcel parcel) {
        super(parcel.readString());
        this.f35406b = parcel.createByteArray();
    }
}
