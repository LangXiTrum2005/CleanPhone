package com.smartdigimkt.e4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0466a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f34610a;

    /* JADX INFO: renamed from: com.smartdigimkt.e4.a$a, reason: collision with other inner class name */
    public class C0466a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[0];
        }
    }

    public interface b extends Parcelable {
    }

    public a(b... bVarArr) {
        this.f34610a = bVarArr == null ? new b[0] : bVarArr;
    }

    public int a() {
        return this.f34610a.length;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f34610a, ((a) obj).f34610a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f34610a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f34610a.length);
        for (b bVar : this.f34610a) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public b a(int i2) {
        return this.f34610a[i2];
    }

    public a(List<? extends b> list) {
        if (list != null) {
            b[] bVarArr = new b[list.size()];
            this.f34610a = bVarArr;
            list.toArray(bVarArr);
            return;
        }
        this.f34610a = new b[0];
    }

    public a(Parcel parcel) {
        this.f34610a = new b[parcel.readInt()];
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.f34610a;
            if (i2 >= bVarArr.length) {
                return;
            }
            bVarArr[i2] = (b) parcel.readParcelable(b.class.getClassLoader());
            i2++;
        }
    }
}
