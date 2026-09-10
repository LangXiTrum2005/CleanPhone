package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public abstract class F4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22808a = 0;

    public static final ArrayList a(Context context) {
        File databasePath;
        Intrinsics.f(context, "context");
        ArrayList arrayList = new ArrayList();
        String[] strArrDatabaseList = context.databaseList();
        if (strArrDatabaseList != null && strArrDatabaseList.length != 0) {
            for (String str : strArrDatabaseList) {
                Intrinsics.c(str);
                if (new Regex("com\\.im_([0-9]+\\.){3}db").b(str)) {
                    int i2 = C3331z3.f24142a;
                    if (!str.equals("com.im_10.8.7.db") && (databasePath = context.getDatabasePath(str)) != null && databasePath.exists() && !context.deleteDatabase(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(Context context) {
        Intrinsics.f(context, "context");
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        Iterator it = CollectionsKt.I("com.im.keyValueStore.carb_store", "com.im.keyValueStore.aes_key_store", "com.im.keyValueStore.mraid_js_store", "com.im.keyValueStore.omid_js_store", "com.im.keyValueStore.user_info_store", "com.im.keyValueStore.coppa_store", "com.im.keyValueStore.gesture_info_store", "com.im.keyValueStore.display_info_store", "com.im.keyValueStore.unified_id_info_store", "com.im.keyValueStore.app_bundle_store", "com.im.keyValueStore.pub_signals_store", "com.im.keyValueStore.CrashSession-store").iterator();
        while (it.hasNext()) {
            context.deleteSharedPreferences((String) it.next());
        }
        return !a(context).isEmpty();
    }

    public static final void a(File path) {
        Intrinsics.f(path, "path");
        try {
            if (path.exists()) {
                File[] fileArrListFiles = path.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (file.isDirectory()) {
                            a(file);
                        } else if (file.delete()) {
                            file.getName();
                        }
                    }
                }
                if (path.delete()) {
                    path.getName();
                }
            }
        } catch (Exception unused) {
        }
    }
}
