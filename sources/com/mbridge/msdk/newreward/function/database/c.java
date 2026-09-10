package com.mbridge.msdk.newreward.function.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.mbridge.msdk.newreward.function.common.DatabaseUtils;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    private static volatile c c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f1696a = new a();
    private com.mbridge.msdk.newreward.function.database.a b;

    public static final class a extends SQLiteOpenHelper {
        public a() {
            super(com.mbridge.msdk.foundation.controller.c.n().d(), MBridgeCommon.Database.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (DatabaseUtils.isDatabaseAvailable(sQLiteDatabase)) {
                sQLiteDatabase.execSQL("create table if not exists campaign(_id integer primary key autoincrement,ad_type integer,app_id text,unit_id text,placement_id text,request_id text,local_id text,bid_token text,header_bidding integer,load_start_time integer,state integer,session_id text,system_id text,backup_id text,parent_session_id text,template integer,invalid_time integer,invalid_time_2 integer,invalid_time_backup integer,ecppv integer,show_count integer,token_rule integer,r_index text,s_show_index text,data text)");
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (DatabaseUtils.isDatabaseAvailable(sQLiteDatabase)) {
                sQLiteDatabase.execSQL("drop table if exists campaign");
                sQLiteDatabase.execSQL("create table if not exists campaign(_id integer primary key autoincrement,ad_type integer,app_id text,unit_id text,placement_id text,request_id text,local_id text,bid_token text,header_bidding integer,load_start_time integer,state integer,session_id text,system_id text,backup_id text,parent_session_id text,template integer,invalid_time integer,invalid_time_2 integer,invalid_time_backup integer,ecppv integer,show_count integer,token_rule integer,r_index text,s_show_index text,data text)");
            }
        }
    }

    private c() {
    }

    public static c c() {
        if (c == null) {
            synchronized (c.class) {
                try {
                    if (c == null) {
                        c = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public com.mbridge.msdk.newreward.function.database.a a() {
        if (this.b == null) {
            this.b = new com.mbridge.msdk.newreward.function.database.a(b());
        }
        return this.b;
    }

    public SQLiteDatabase b() {
        try {
            return this.f1696a.getWritableDatabase();
        } catch (Exception unused) {
            return null;
        }
    }
}
