package androidx.room.util;

import android.os.Build;
import androidx.media3.extractor.text.ttml.a;
import androidx.sqlite.SQLiteStatement;
import com.thinkup.core.common.n.mo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"androidx/room/util/SQLiteStatementUtil__StatementUtilKt", "androidx/room/util/SQLiteStatementUtil__StatementUtil_androidKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class SQLiteStatementUtil {
    public static final int a(SQLiteStatement sQLiteStatement, String str) {
        Intrinsics.f(sQLiteStatement, "<this>");
        int iB = b(sQLiteStatement, str);
        if (iB >= 0) {
            return iB;
        }
        int iB2 = b(sQLiteStatement, "`" + str + '`');
        if (iB2 >= 0) {
            return iB2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        int columnCount = sQLiteStatement.getColumnCount();
        String strConcat = mo.ono.concat(str);
        String strI = a.i('`', mo.ono, str);
        for (int i2 = 0; i2 < columnCount; i2++) {
            String columnName = sQLiteStatement.getColumnName(i2);
            if (columnName.length() >= str.length() + 2 && (StringsKt.p(columnName, strConcat, false) || (columnName.charAt(0) == '`' && StringsKt.p(columnName, strI, false)))) {
                return i2;
            }
        }
        return -1;
    }

    public static final int b(SQLiteStatement sQLiteStatement, String name) {
        Intrinsics.f(sQLiteStatement, "<this>");
        Intrinsics.f(name, "name");
        if (sQLiteStatement instanceof MappedColumnsSQLiteStatementWrapper) {
            throw null;
        }
        int columnCount = sQLiteStatement.getColumnCount();
        for (int i2 = 0; i2 < columnCount; i2++) {
            if (name.equals(sQLiteStatement.getColumnName(i2))) {
                return i2;
            }
        }
        return -1;
    }
}
