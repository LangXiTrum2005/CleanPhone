package com.smartdigimkt.g4;

import android.os.Parcel;
import android.os.Parcelable;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.p4.f0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f35407h = "CHAP";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35409c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f35410e;
    public final long f;
    private final h[] g;

    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i2) {
            return new c[i2];
        }
    }

    public c(String str, int i2, int i3, long j, long j2, h[] hVarArr) {
        super("CHAP");
        this.f35408b = str;
        this.f35409c = i2;
        this.d = i3;
        this.f35410e = j;
        this.f = j2;
        this.g = hVarArr;
    }

    public int a() {
        return this.g.length;
    }

    @Override // com.smartdigimkt.g4.h, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f35409c == cVar.f35409c && this.d == cVar.d && this.f35410e == cVar.f35410e && this.f == cVar.f && f0.a((Object) this.f35408b, (Object) cVar.f35408b) && Arrays.equals(this.g, cVar.g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = (((((((this.f35409c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.d) * 31) + ((int) this.f35410e)) * 31) + ((int) this.f)) * 31;
        String str = this.f35408b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f35408b);
        parcel.writeInt(this.f35409c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.f35410e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g.length);
        for (h hVar : this.g) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    public h a(int i2) {
        return this.g[i2];
    }

    public c(Parcel parcel) {
        super("CHAP");
        this.f35408b = parcel.readString();
        this.f35409c = parcel.readInt();
        this.d = parcel.readInt();
        this.f35410e = parcel.readLong();
        this.f = parcel.readLong();
        int i2 = parcel.readInt();
        this.g = new h[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.g[i3] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
