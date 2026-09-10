package androidx.room.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/util/ForeignKeyWithSequence;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f8339Y;
    public final String Z;
    public final String e0;

    public ForeignKeyWithSequence(int i2, int i3, String from, String to) {
        Intrinsics.f(from, "from");
        Intrinsics.f(to, "to");
        this.X = i2;
        this.f8339Y = i3;
        this.Z = from;
        this.e0 = to;
    }

    @Override // java.lang.Comparable
    public final int compareTo(ForeignKeyWithSequence foreignKeyWithSequence) {
        ForeignKeyWithSequence other = foreignKeyWithSequence;
        Intrinsics.f(other, "other");
        int i2 = this.X - other.X;
        return i2 == 0 ? this.f8339Y - other.f8339Y : i2;
    }
}
