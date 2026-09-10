package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/Timestamp;", "", "Landroid/os/Parcelable;", "Companion", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    public static final Parcelable.Creator<Timestamp> CREATOR = new Timestamp$Companion$CREATOR$1();
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f20160Y;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/Timestamp$Companion;", "", "Landroid/os/Parcelable$Creator;", "Lcom/google/firebase/Timestamp;", "CREATOR", "Landroid/os/Parcelable$Creator;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: com.google.firebase.Timestamp$compareTo$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends PropertyReference1Impl {
        public static final AnonymousClass1 X = new AnonymousClass1("seconds", Timestamp.class, "getSeconds()J");

        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
        public final Object get(Object obj) {
            return Long.valueOf(((Timestamp) obj).X);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.Timestamp$compareTo$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass2 extends PropertyReference1Impl {
        public static final AnonymousClass2 X = new AnonymousClass2("nanoseconds", Timestamp.class, "getNanoseconds()I");

        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
        public final Object get(Object obj) {
            return Integer.valueOf(((Timestamp) obj).f20160Y);
        }
    }

    public Timestamp(long j, int i2) {
        if (i2 < 0 || i2 >= 1000000000) {
            throw new IllegalArgumentException(android.support.v4.media.a.h(i2, "Timestamp nanoseconds out of range: ").toString());
        }
        if (-62135596800L > j || j >= 253402300800L) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.i(j, "Timestamp seconds out of range: ").toString());
        }
        this.X = j;
        this.f20160Y = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Timestamp other) {
        Intrinsics.f(other, "other");
        Function1[] function1Arr = {AnonymousClass1.X, AnonymousClass2.X};
        for (int i2 = 0; i2 < 2; i2++) {
            Function1 function1 = function1Arr[i2];
            int iA = ComparisonsKt.a((Comparable) function1.invoke(this), (Comparable) function1.invoke(other));
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.X;
        return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.f20160Y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timestamp(seconds=");
        sb.append(this.X);
        sb.append(", nanoseconds=");
        return android.support.v4.media.a.p(sb, this.f20160Y, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.f(dest, "dest");
        dest.writeLong(this.X);
        dest.writeInt(this.f20160Y);
    }
}
