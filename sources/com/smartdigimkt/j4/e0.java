package com.smartdigimkt.j4;

import android.os.Parcel;
import android.os.Parcelable;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.smartdigimkt.w3.m[] f35965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35966c;

    public class a implements Parcelable.Creator<e0> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e0 createFromParcel(Parcel parcel) {
            return new e0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e0[] newArray(int i2) {
            return new e0[i2];
        }
    }

    public e0(com.smartdigimkt.w3.m... mVarArr) {
        com.smartdigimkt.p4.a.b(mVarArr.length > 0);
        this.f35965b = mVarArr;
        this.f35964a = mVarArr.length;
    }

    public com.smartdigimkt.w3.m a(int i2) {
        return this.f35965b[i2];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.class == obj.getClass()) {
            e0 e0Var = (e0) obj;
            if (this.f35964a == e0Var.f35964a && Arrays.equals(this.f35965b, e0Var.f35965b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f35966c == 0) {
            this.f35966c = Arrays.hashCode(this.f35965b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f35966c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f35964a);
        for (int i3 = 0; i3 < this.f35964a; i3++) {
            parcel.writeParcelable(this.f35965b[i3], 0);
        }
    }

    public int a(com.smartdigimkt.w3.m mVar) {
        int i2 = 0;
        while (true) {
            com.smartdigimkt.w3.m[] mVarArr = this.f35965b;
            if (i2 >= mVarArr.length) {
                return -1;
            }
            if (mVar == mVarArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    public e0(Parcel parcel) {
        int i2 = parcel.readInt();
        this.f35964a = i2;
        this.f35965b = new com.smartdigimkt.w3.m[i2];
        for (int i3 = 0; i3 < this.f35964a; i3++) {
            this.f35965b[i3] = (com.smartdigimkt.w3.m) parcel.readParcelable(com.smartdigimkt.w3.m.class.getClassLoader());
        }
    }
}
