package com.mbridge.msdk.config.component.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f32033b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f32034a;

    private a(Context context) {
        this.f32034a = new b(context);
    }

    public static synchronized a a() {
        try {
            if (f32033b == null) {
                f32033b = new a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f32033b;
    }

    public Map<String, Object> b(String str) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            map.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            map.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), "SQL is null");
            return map;
        }
        try {
            a(true).execSQL(str);
            map.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 1);
            return map;
        } catch (Throwable th2) {
            q0.b("ComponentDatabase", th2.getMessage());
            map.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            map.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), th2.getMessage());
            return map;
        }
    }

    public Map<String, Object> c(String str) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            map.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            map.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), "SQL is null");
            return map;
        }
        try {
            return b(str);
        } catch (Throwable th2) {
            q0.b("ComponentDatabase", th2.getMessage());
            map.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            map.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), th2.getMessage());
            return map;
        }
    }

    public Map<String, Object> d(String str) {
        int i10 = 2;
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            map.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            map.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), "SQL is null");
            return map;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        try {
            Cursor cursorRawQuery = a(false).rawQuery(str, null);
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.getCount() > 0) {
                        String[] columnNames = cursorRawQuery.getColumnNames();
                        while (cursorRawQuery.moveToNext()) {
                            HashMap map2 = new HashMap();
                            int length = columnNames.length;
                            int i12 = i11;
                            while (i12 < length) {
                                String str2 = columnNames[i12];
                                int columnIndex = cursorRawQuery.getColumnIndex(str2);
                                if (columnIndex != -1) {
                                    int type = cursorRawQuery.getType(columnIndex);
                                    if (type == 0) {
                                        map2.put(str2, null);
                                    } else if (type == 1) {
                                        map2.put(str2, String.valueOf(cursorRawQuery.getLong(columnIndex)));
                                    } else if (type == i10) {
                                        map2.put(str2, String.valueOf(cursorRawQuery.getFloat(columnIndex)));
                                    } else if (type == 3) {
                                        map2.put(str2, cursorRawQuery.getString(columnIndex));
                                    } else if (type == 4) {
                                        map2.put(str2, new String(cursorRawQuery.getBlob(columnIndex)));
                                    }
                                }
                                i12++;
                                i10 = 2;
                            }
                            arrayList.add(map2);
                            i10 = 2;
                            i11 = 0;
                        }
                    }
                } catch (Throwable th2) {
                    if (cursorRawQuery == null) {
                        throw th2;
                    }
                    try {
                        cursorRawQuery.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            map.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 1);
            map.put(com.mbridge.msdk.config.component.common.util.c.c("data"), arrayList);
            if (cursorRawQuery == null) {
                return map;
            }
            cursorRawQuery.close();
            return map;
        } catch (Throwable th4) {
            q0.b("ComponentDatabase", th4.getMessage());
            map.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            map.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), th4.getMessage());
            return map;
        }
    }

    public SQLiteDatabase a(boolean z10) {
        try {
            return z10 ? this.f32034a.getWritableDatabase() : this.f32034a.getReadableDatabase();
        } catch (Throwable th2) {
            q0.b("ComponentDatabase", th2.getMessage());
            return null;
        }
    }

    public Map<String, Object> a(String str) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            map.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            map.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), "SQL is null");
            return map;
        }
        try {
            b(str);
            if (str.contains(c.TABLE_FILE_DB)) {
                new com.mbridge.msdk.config.component.database.file.a().a(str);
            }
            map.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 1);
            return map;
        } catch (Throwable th2) {
            q0.b("ComponentDatabase", th2.getMessage());
            map.put(com.mbridge.msdk.config.component.common.util.c.c("code"), 2);
            map.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), th2.getMessage());
            return map;
        }
    }
}
