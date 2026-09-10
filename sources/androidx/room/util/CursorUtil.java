package androidx.room.util;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import androidx.media3.extractor.text.ttml.a;
import com.thinkup.core.common.n.mo;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CursorUtil {
    public static final int a(Cursor c2, String str) {
        String strI;
        Intrinsics.f(c2, "c");
        Intrinsics.f(c2, "c");
        int columnIndex = c2.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = c2.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = c2.getColumnNames();
                    Intrinsics.c(columnNames);
                    String strConcat = mo.ono.concat(str);
                    String strI2 = a.i('`', mo.ono, str);
                    int length = columnNames.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            String str2 = columnNames[i3];
                            int i4 = i2 + 1;
                            if (str2.length() < str.length() + 2 || !(StringsKt.p(str2, strConcat, false) || (str2.charAt(0) == '`' && StringsKt.p(str2, strI2, false)))) {
                                i3++;
                                i2 = i4;
                            } else {
                                columnIndex = i2;
                            }
                        } else {
                            columnIndex = -1;
                        }
                    }
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = c2.getColumnNames();
            Intrinsics.e(columnNames2, "getColumnNames(...)");
            strI = ArraysKt.I(columnNames2, null, null, null, 63);
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            strI = "unknown";
        }
        throw new IllegalArgumentException(android.support.v4.media.a.o("column '", str, "' does not exist. Available columns: ", strI));
    }
}
