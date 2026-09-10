package androidx.sqlite;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/sqlite/SQLiteStatement;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SQLiteStatement extends AutoCloseable {
    boolean P0();

    int getColumnCount();

    String getColumnName(int i2);

    default List getColumnNames() {
        int columnCount = getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i2 = 0; i2 < columnCount; i2++) {
            arrayList.add(getColumnName(i2));
        }
        return arrayList;
    }

    double getDouble(int i2);

    default float getFloat(int i2) {
        return (float) getDouble(i2);
    }

    default int getInt(int i2) {
        return (int) getLong(i2);
    }

    long getLong(int i2);

    boolean isNull(int i2);

    default boolean l0() {
        return getLong(0) != 0;
    }

    void reset();

    void w();

    String y0(int i2);
}
