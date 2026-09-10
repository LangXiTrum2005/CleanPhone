package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/RoomSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "Binding", "Companion", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {
    public static final TreeMap j0 = new TreeMap();
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public volatile String f8246Y;
    public final long[] Z;
    public final double[] e0;
    public final String[] f0;
    public final byte[][] g0;
    public final int[] h0;
    public int i0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Binding;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface Binding {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Companion;", "", "", "NULL", "I", "LONG", "DOUBLE", "STRING", "BLOB", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RoomSQLiteQuery(int i2) {
        this.X = i2;
        int i3 = i2 + 1;
        this.h0 = new int[i3];
        this.Z = new long[i3];
        this.e0 = new double[i3];
        this.f0 = new String[i3];
        this.g0 = new byte[i3][];
    }

    public static final RoomSQLiteQuery a(int i2, String query) {
        Intrinsics.f(query, "query");
        TreeMap treeMap = j0;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (entryCeilingEntry == null) {
                RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i2);
                roomSQLiteQuery.f8246Y = query;
                roomSQLiteQuery.i0 = i2;
                return roomSQLiteQuery;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            RoomSQLiteQuery roomSQLiteQuery2 = (RoomSQLiteQuery) entryCeilingEntry.getValue();
            roomSQLiteQuery2.getClass();
            roomSQLiteQuery2.f8246Y = query;
            roomSQLiteQuery2.i0 = i2;
            return roomSQLiteQuery2;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void B0(int i2) {
        this.h0[i2] = 1;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void c(int i2, double d) {
        this.h0[i2] = 3;
        this.e0[i2] = d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    /* JADX INFO: renamed from: d */
    public final String getX() {
        String str = this.f8246Y;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void d0(int i2, String value) {
        Intrinsics.f(value, "value");
        this.h0[i2] = 4;
        this.f0[i2] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void h(SupportSQLiteProgram supportSQLiteProgram) {
        int i2 = this.i0;
        if (1 > i2) {
            return;
        }
        int i3 = 1;
        while (true) {
            int i4 = this.h0[i3];
            if (i4 == 1) {
                supportSQLiteProgram.B0(i3);
            } else if (i4 == 2) {
                supportSQLiteProgram.k0(i3, this.Z[i3]);
            } else if (i4 == 3) {
                supportSQLiteProgram.c(i3, this.e0[i3]);
            } else if (i4 == 4) {
                String str = this.f0[i3];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                supportSQLiteProgram.d0(i3, str);
            } else if (i4 == 5) {
                byte[] bArr = this.g0[i3];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                supportSQLiteProgram.r0(i3, bArr);
            }
            if (i3 == i2) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void k0(int i2, long j) {
        this.h0[i2] = 2;
        this.Z[i2] = j;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void r0(int i2, byte[] bArr) {
        this.h0[i2] = 5;
        this.g0[i2] = bArr;
    }

    public final void release() {
        TreeMap treeMap = j0;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.X), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                Intrinsics.e(it, "iterator(...)");
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }
}
