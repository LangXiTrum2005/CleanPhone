package com.smartdigimkt.h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.smartdigimkt.p4.c0;
import com.smartdigimkt.p4.s;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35660b;

    public class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i2) {
            return new g[i2];
        }
    }

    public /* synthetic */ g(long j, long j2, a aVar) {
        this(j, j2);
    }

    public static g a(s sVar, long j, c0 c0Var) {
        long jA = a(sVar, j);
        return new g(jA, c0Var.b(jA));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f35659a);
        parcel.writeLong(this.f35660b);
    }

    private g(long j, long j2) {
        this.f35659a = j;
        this.f35660b = j2;
    }

    public static long a(s sVar, long j) {
        long jX = sVar.x();
        if ((128 & jX) != 0) {
            return 8589934591L & ((((jX & 1) << 32) | sVar.z()) + j);
        }
        return -9223372036854775807L;
    }
}
