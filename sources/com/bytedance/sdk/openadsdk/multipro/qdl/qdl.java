package com.bytedance.sdk.openadsdk.multipro.qdl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.bytedance.sdk.component.mo.qdl.mo;
import com.bytedance.sdk.openadsdk.core.mzz;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.multipro.mml;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    public static mo qdl;
    private static final ConcurrentHashMap<String, Object> ud = new ConcurrentHashMap<>();

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x000f A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    public static mo qdl(Context context) {
        if (context == null) {
            try {
                yt.qdl();
                if (qdl == null) {
                    if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                        qdl = mo.qdl.qdl(com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl().qdl(5));
                    } else {
                        qdl = com.bytedance.sdk.openadsdk.multipro.aidl.qdl.mo.ud();
                    }
                }
            } catch (Throwable unused) {
                gy.jpc("binder error");
            }
        } else if (qdl == null) {
            if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                qdl = mo.qdl.qdl(com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl().qdl(5));
            } else {
                qdl = com.bytedance.sdk.openadsdk.multipro.aidl.qdl.mo.ud();
            }
        }
        return qdl;
    }

    private static String qdl() {
        return a.r(new StringBuilder(), mml.ud, "/t_db/ttopensdk.db/");
    }

    public static void qdl(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (qdl(str)) {
            try {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                        mzz.qdl(context).qdl().qdl(str, (String) null, contentValues);
                        return;
                    }
                    mo moVarQdl = qdl(context);
                    if (moVarQdl != null) {
                        moVarQdl.qdl(Uri.parse(qdl() + str), contentValues);
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int qdl(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (qdl(str)) {
            try {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                        return mzz.qdl(context).qdl().qdl(str, str2, strArr);
                    }
                    mo moVarQdl = qdl(context);
                    if (moVarQdl != null) {
                        return moVarQdl.qdl(Uri.parse(qdl() + str), str2, strArr);
                    }
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static int qdl(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (qdl(str)) {
                try {
                    try {
                        if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                            return mzz.qdl(context).qdl().qdl(str, contentValues, str2, strArr);
                        }
                        mo moVarQdl = qdl(context);
                        if (moVarQdl != null) {
                            return moVarQdl.qdl(Uri.parse(qdl() + str), contentValues, str2, strArr);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return 0;
    }

    public static Map<String, List<String>> qdl(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (qdl(str)) {
            try {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                        return qdl(mzz.qdl(context).qdl().qdl(str, strArr, str2, strArr2, str3, str4, str5));
                    }
                    mo moVarQdl = qdl(context);
                    if (moVarQdl != null) {
                        return moVarQdl.qdl(Uri.parse(qdl() + str), strArr, str2, strArr2, str5);
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static Map<String, List<String>> qdl(Cursor cursor) {
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

    private static Object qdl(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = ud;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (qdl.class) {
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
