package com.bytedance.sdk.openadsdk.tan.lr;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.di;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static final ConcurrentHashMap<String, Object> ri = new ConcurrentHashMap<>();

    public static void ri(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (ri(str)) {
            try {
                di.ri(context).ri().ri(str, (String) null, contentValues);
            } catch (Throwable unused) {
            }
        }
    }

    public static int ri(Context context, String str, String str2, String[] strArr) {
        int iRi;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (ri(str)) {
            try {
                iRi = di.ri(context).ri().ri(str, str2, strArr);
            } catch (Throwable unused) {
                return 0;
            }
        }
        return iRi;
    }

    public static int ri(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        int iRi;
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (ri(str)) {
                try {
                    iRi = di.ri(context).ri().ri(str, contentValues, str2, strArr);
                } catch (Throwable unused) {
                }
            }
            return iRi;
        }
        return 0;
    }

    public static Map<String, List<String>> ri(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        Map<String, List<String>> mapRi;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (ri(str)) {
            try {
                mapRi = ri(di.ri(context).ri().ri(str, strArr, str2, strArr2, str3, str4, str5));
            } catch (Throwable unused) {
                return null;
            }
        }
        return mapRi;
    }

    public static Map<String, List<String>> ri(Cursor cursor) {
        HashMap map = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!map.containsKey(str)) {
                            map.put(str, new LinkedList());
                        }
                        ((List) map.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
                cursor.close();
                return map;
            } catch (Throwable unused) {
                cursor.close();
            }
        }
        return map;
    }

    private static Object ri(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = ri;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (ri.class) {
            try {
                obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new Object();
                    concurrentHashMap.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
