package com.smartdigimkt.g4;

import android.os.Parcel;
import android.os.Parcelable;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.p4.f0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new a();
    public static final String g = "CTOC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f35412c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f35413e;
    private final h[] f;

    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i2) {
            return new d[i2];
        }
    }

    public d(String str, boolean z2, boolean z3, String[] strArr, h[] hVarArr) {
        super("CTOC");
        this.f35411b = str;
        this.f35412c = z2;
        this.d = z3;
        this.f35413e = strArr;
        this.f = hVarArr;
    }

    public int a() {
        return this.f.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f35412c == dVar.f35412c && this.d == dVar.d && f0.a((Object) this.f35411b, (Object) dVar.f35411b) && Arrays.equals(this.f35413e, dVar.f35413e) && Arrays.equals(this.f, dVar.f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = ((((this.f35412c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f35411b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f35411b);
        parcel.writeByte(this.f35412c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f35413e);
        parcel.writeInt(this.f.length);
        for (h hVar : this.f) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    public h a(int i2) {
        return this.f[i2];
    }

    public d(Parcel parcel) {
        super("CTOC");
        this.f35411b = parcel.readString();
        this.f35412c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.f35413e = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.f = new h[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f[i3] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
