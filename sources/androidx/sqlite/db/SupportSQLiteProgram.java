package androidx.sqlite.db;

import java.io.Closeable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteProgram;", "Ljava/io/Closeable;", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SupportSQLiteProgram extends Closeable {
    void B0(int i2);

    void c(int i2, double d);

    void d0(int i2, String str);

    void k0(int i2, long j);

    void r0(int i2, byte[] bArr);

    void w();
}
