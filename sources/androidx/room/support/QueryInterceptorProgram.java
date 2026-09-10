package androidx.room.support;

import androidx.sqlite.db.SupportSQLiteProgram;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/support/QueryInterceptorProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryInterceptorProgram implements SupportSQLiteProgram {
    public final ArrayList X = new ArrayList();

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void B0(int i2) {
        a(i2, null);
    }

    public final void a(int i2, Object obj) {
        int size;
        int i3 = i2 - 1;
        ArrayList arrayList = this.X;
        if (i3 >= arrayList.size() && (size = arrayList.size()) <= i3) {
            while (true) {
                arrayList.add(null);
                if (size == i3) {
                    break;
                } else {
                    size++;
                }
            }
        }
        arrayList.set(i3, obj);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void c(int i2, double d) {
        a(i2, Double.valueOf(d));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void d0(int i2, String str) {
        a(i2, str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void k0(int i2, long j) {
        a(i2, Long.valueOf(j));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void r0(int i2, byte[] bArr) {
        a(i2, bArr);
    }
}
