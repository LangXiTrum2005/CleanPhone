package com.smartdigimkt.j4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0[] f35975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35976c;
    public static final f0 d = new f0(new e0[0]);
    public static final Parcelable.Creator<f0> CREATOR = new a();

    public class a implements Parcelable.Creator<f0> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f0 createFromParcel(Parcel parcel) {
            return new f0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f0[] newArray(int i2) {
            return new f0[i2];
        }
    }

    public f0(e0... e0VarArr) {
        this.f35975b = e0VarArr;
        this.f35974a = e0VarArr.length;
    }

    public e0 a(int i2) {
        return this.f35975b[i2];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f0.class == obj.getClass()) {
            f0 f0Var = (f0) obj;
            if (this.f35974a == f0Var.f35974a && Arrays.equals(this.f35975b, f0Var.f35975b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f35976c == 0) {
            this.f35976c = Arrays.hashCode(this.f35975b);
        }
        return this.f35976c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f35974a);
        for (int i3 = 0; i3 < this.f35974a; i3++) {
            parcel.writeParcelable(this.f35975b[i3], 0);
        }
    }

    public int a(e0 e0Var) {
        for (int i2 = 0; i2 < this.f35974a; i2++) {
            if (this.f35975b[i2] == e0Var) {
                return i2;
            }
        }
        return -1;
    }

    public f0(Parcel parcel) {
        int i2 = parcel.readInt();
        this.f35974a = i2;
        this.f35975b = new e0[i2];
        for (int i3 = 0; i3 < this.f35974a; i3++) {
            this.f35975b[i3] = (e0) parcel.readParcelable(e0.class.getClassLoader());
        }
    }

    public boolean a() {
        return this.f35974a == 0;
    }
}
