package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import com.inmobi.media.AbstractC2948h9;
import java.util.ArrayList;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.h9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2948h9 {
    public static final taiyuan a = saneness.saneness(new Function0() { // from class: adsuki.phytopathogen
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC2948h9.a();
        }
    });

    public static final X8 a() {
        Context context = Ji.a;
        Intrinsics.checkNotNullParameter("com.im_11.1.0.db", "name");
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter("ad_quality_db", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)", "tableSchema");
        arrayList.add(new Nj("ad_quality_db", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)"));
        Intrinsics.checkNotNullParameter("click", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )", "tableSchema");
        arrayList.add(new Nj("click", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )"));
        Intrinsics.checkNotNullParameter("config_db", "tableName");
        Intrinsics.checkNotNullParameter("(config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(config_type))", "tableSchema");
        arrayList.add(new Nj("config_db", "(config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(config_type))"));
        Intrinsics.checkNotNullParameter("c_data", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )", "tableSchema");
        arrayList.add(new Nj("c_data", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )"));
        Intrinsics.checkNotNullParameter(AppMeasurement.CRASH_ORIGIN, "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)", "tableSchema");
        arrayList.add(new Nj(AppMeasurement.CRASH_ORIGIN, "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)"));
        Intrinsics.checkNotNullParameter("logs_v2", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )", "tableSchema");
        arrayList.add(new Nj("logs_v2", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )"));
        Intrinsics.checkNotNullParameter("pings", "tableName");
        Intrinsics.checkNotNullParameter("(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT)", "tableSchema");
        arrayList.add(new Nj("pings", "(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT)"));
        Intrinsics.checkNotNullParameter("telemetry", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)", "tableSchema");
        arrayList.add(new Nj("telemetry", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)"));
        C3018k5 c3018k5 = new C3018k5(context, arrayList, Aa.a());
        X8 x8 = new X8(c3018k5);
        C3346x9 c3346x9 = new C3346x9(c3018k5);
        C2923g9 c2923g9 = new C2923g9(c3346x9, c3018k5);
        x8.a = c2923g9;
        try {
            c2923g9.c = c3346x9.getWritableDatabase();
        } catch (Exception unused) {
        }
        try {
            c2923g9.d = c2923g9.a.getReadableDatabase();
        } catch (Exception unused2) {
        }
        return x8;
    }

    public static final C2923g9 b() {
        C2923g9 c2923g9 = ((X8) a.getValue()).a;
        if (c2923g9 != null) {
            return c2923g9;
        }
        Intrinsics.preprohormone("_inmobiDatabaseHelper");
        return null;
    }
}
