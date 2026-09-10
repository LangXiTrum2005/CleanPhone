package androidx.sqlite;

import kotlin.Metadata;
import kotlin.NotImplementedError;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/sqlite/SQLiteConnection;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SQLiteConnection extends AutoCloseable {
    SQLiteStatement R0(String str);

    default boolean v() {
        throw new NotImplementedError(this + " does not implement inTransaction().");
    }
}
