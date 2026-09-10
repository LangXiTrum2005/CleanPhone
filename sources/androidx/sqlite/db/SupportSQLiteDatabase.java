package androidx.sqlite.db;

import android.database.Cursor;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "Ljava/io/Closeable;", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SupportSQLiteDatabase extends Closeable {
    List A();

    void B();

    void C(String str);

    boolean D();

    boolean K0();

    long L();

    boolean M();

    void N();

    void O();

    boolean Q();

    void R();

    Cursor V(SupportSQLiteQuery supportSQLiteQuery);

    SupportSQLiteStatement f0(String str);

    int getVersion();

    default void h0() {
        x();
    }

    boolean i0();

    boolean isOpen();

    void m0(Object[] objArr);

    long p0();

    String u();

    boolean v();

    boolean v0();

    void x();
}
