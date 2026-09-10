package com.bykv.vk.openvk.preload.geckox.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class b extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f12911a;

    private b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
        super(context, str, cursorFactory, 1);
    }

    public static b a(Context context) {
        if (f12911a == null) {
            synchronized (b.class) {
                try {
                    if (f12911a == null) {
                        f12911a = new b(context.getApplicationContext(), "geckox_clean_statistic" + com.bykv.vk.openvk.preload.geckox.utils.a.a() + ".db", null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12911a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists geckox_clean_statistic (id integer primary key autoincrement,access_key text,channel text,clean_type integer,status integer,pkg_id integer,err_code integer,clean_strategy integer,clean_duration integer,err_msg text)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public final void a(String str, String str2, int i2, int i3, long j, int i4, String str3, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("access_key", str);
        contentValues.put("channel", str2);
        contentValues.put("clean_type", Integer.valueOf(i2));
        contentValues.put("status", Integer.valueOf(i3));
        contentValues.put("pkg_id", Long.valueOf(j));
        contentValues.put("err_code", Integer.valueOf(i4));
        contentValues.put("err_msg", str3);
        contentValues.put("clean_duration", Long.valueOf(j2));
        contentValues.put("clean_strategy", (Integer) 1);
        try {
            getWritableDatabase().insert("geckox_clean_statistic", null, contentValues);
        } catch (Exception e2) {
            GeckoLogger.w("clean-channel", "insert failed", e2);
        }
    }

    public final List<StatisticModel.PackageStatisticModel> a() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorQuery = getWritableDatabase().query("geckox_clean_statistic", null, null, null, null, null, null);
            if (cursorQuery == null) {
                return arrayList;
            }
            while (cursorQuery.moveToNext()) {
                try {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("access_key"));
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("channel"));
                    int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("clean_type"));
                    int i3 = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                    long j = cursorQuery.getInt(cursorQuery.getColumnIndex("pkg_id"));
                    int i4 = cursorQuery.getInt(cursorQuery.getColumnIndex("err_code"));
                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("err_msg"));
                    int i5 = cursorQuery.getInt(cursorQuery.getColumnIndex("clean_strategy"));
                    long j2 = cursorQuery.getLong(cursorQuery.getColumnIndex("clean_duration"));
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    packageStatisticModel.accessKey = string;
                    packageStatisticModel.channel = string2;
                    packageStatisticModel.statsType = Integer.valueOf(i3);
                    packageStatisticModel.id = Long.valueOf(j);
                    packageStatisticModel.errCode = i4 == 0 ? null : String.valueOf(i4);
                    packageStatisticModel.errMsg = string3;
                    packageStatisticModel.cleanType = Integer.valueOf(i2);
                    packageStatisticModel.cleanDuration = Long.valueOf(j2);
                    packageStatisticModel.cleanStrategy = Integer.valueOf(i5);
                    arrayList.add(packageStatisticModel);
                } catch (Exception e2) {
                    e = e2;
                    cursor = cursorQuery;
                    GeckoLogger.w("clean-channel", "get all statistic failed!", e);
                    cursorQuery = cursor;
                }
            }
            getWritableDatabase().delete("geckox_clean_statistic", null, null);
            CloseableUtils.close(cursorQuery);
            return arrayList;
        } catch (Exception e3) {
            e = e3;
        }
    }
}
