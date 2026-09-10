package l8;

import an.p;
import android.database.Cursor;
import android.util.Log;
import d5.u;
import defpackage.e;
import java.io.Serializable;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f45240a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f45241b;

    public static final void a(Serializable serializable) {
        String string;
        if (f45241b) {
            if (serializable == null || (string = serializable.toString()) == null) {
                string = "null";
            }
            Log.d("PhotoManager", string);
        }
    }

    public static final void b(Object obj) {
        String string;
        if (f45241b) {
            if (obj instanceof Exception) {
                string = ((Exception) obj).getLocalizedMessage();
            } else {
                string = obj != null ? obj.toString() : null;
            }
            if (string == null) {
                string = "null";
            }
            Log.e("PhotoManager", string);
        }
    }

    public static final void c(String str, Exception exc) {
        if (f45241b) {
            String string = str != null ? str.toString() : null;
            if (string == null) {
                string = "null";
            }
            Log.e("PhotoManager", string, exc);
        }
    }

    public static final void d(Object obj) {
        String string;
        if (f45241b) {
            if (obj == null || (string = obj.toString()) == null) {
                string = "null";
            }
            Log.i("PhotoManager", string);
        }
    }

    public static final void e(Cursor cursor) {
        String strH;
        if (cursor == null) {
            a("The cursor is null");
            return;
        }
        a("The cursor row: " + cursor.getCount());
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            StringBuilder sb2 = new StringBuilder();
            int columnIndex = cursor.getColumnIndex("bucket_id");
            if (columnIndex != -1) {
                String string = cursor.getString(columnIndex);
                sb2.append("\nid: ");
                sb2.append(string);
                sb2.append("\n");
            }
            kotlin.jvm.internal.b bVarA = m.a(cursor.getColumnNames());
            while (bVarA.hasNext()) {
                String str = (String) bVarA.next();
                int columnIndex2 = cursor.getColumnIndex(str);
                try {
                    strH = cursor.getString(columnIndex2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    strH = e.h(cursor.getBlob(columnIndex2).length, "blob(", ")");
                }
                if (!p.i0(str, "bucket_id")) {
                    u.r(sb2, "|--", str, " : ", strH);
                    sb2.append("\n");
                }
            }
            a(sb2);
        }
        cursor.moveToPosition(-1);
    }
}
