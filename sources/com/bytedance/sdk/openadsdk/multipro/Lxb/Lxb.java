package com.bytedance.sdk.openadsdk.multipro.Lxb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.lc.Lxb.lc;
import com.bytedance.sdk.openadsdk.core.JXs;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.multipro.ZU;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private static final ConcurrentHashMap<String, Object> LD = new ConcurrentHashMap<>();
    public static lc Lxb;

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x000f A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    public static lc Lxb(Context context) {
        if (context == null) {
            try {
                kqm.Lxb();
                if (Lxb == null) {
                    if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                        Lxb = lc.Lxb.Lxb(com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb().Lxb(5));
                    } else {
                        Lxb = com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.lc.LD();
                    }
                }
            } catch (Throwable unused) {
                nJ.OY("binder error");
            }
        } else if (Lxb == null) {
            if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                Lxb = lc.Lxb.Lxb(com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb().Lxb(5));
            } else {
                Lxb = com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.lc.LD();
            }
        }
        return Lxb;
    }

    private static String Lxb() {
        return DM.m(new StringBuilder(), ZU.LD, "/t_db/ttopensdk.db/");
    }

    public static void Lxb(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (Lxb(str)) {
            try {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                        JXs.Lxb(context).Lxb().Lxb(str, (String) null, contentValues);
                        return;
                    }
                    lc lcVarLxb = Lxb(context);
                    if (lcVarLxb != null) {
                        lcVarLxb.Lxb(Uri.parse(Lxb() + str), contentValues);
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int Lxb(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (Lxb(str)) {
            try {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                        return JXs.Lxb(context).Lxb().Lxb(str, str2, strArr);
                    }
                    lc lcVarLxb = Lxb(context);
                    if (lcVarLxb != null) {
                        return lcVarLxb.Lxb(Uri.parse(Lxb() + str), str2, strArr);
                    }
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static int Lxb(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (Lxb(str)) {
                try {
                    try {
                        if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                            return JXs.Lxb(context).Lxb().Lxb(str, contentValues, str2, strArr);
                        }
                        lc lcVarLxb = Lxb(context);
                        if (lcVarLxb != null) {
                            return lcVarLxb.Lxb(Uri.parse(Lxb() + str), contentValues, str2, strArr);
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

    public static Map<String, List<String>> Lxb(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (Lxb(str)) {
            try {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                        return Lxb(JXs.Lxb(context).Lxb().Lxb(str, strArr, str2, strArr2, str3, str4, str5));
                    }
                    lc lcVarLxb = Lxb(context);
                    if (lcVarLxb != null) {
                        return lcVarLxb.Lxb(Uri.parse(Lxb() + str), strArr, str2, strArr2, str5);
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static Map<String, List<String>> Lxb(Cursor cursor) {
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
            } catch (Throwable unused) {
            }
            cursor.close();
        }
        return map;
    }

    private static Object Lxb(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = LD;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (Lxb.class) {
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
