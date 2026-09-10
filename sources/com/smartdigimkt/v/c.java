package com.smartdigimkt.v;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile c f38959b;

    private c(Context context) {
        super(context);
    }

    public static c a(Context context) {
        if (f38959b == null) {
            synchronized (c.class) {
                try {
                    if (f38959b == null) {
                        f38959b = new c(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38959b;
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaign'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'frequence'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaignclick'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'click_time'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'load_stat'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'fq_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dailyplaycap'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'display_resource_type'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'unit_id'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'c_replace_temp'");
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.smartdigimkt.v.b
    public int b() {
        return 72;
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // com.smartdigimkt.v.b
    public void b(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        c(sQLiteDatabase);
        b(sQLiteDatabase);
    }

    @Override // com.smartdigimkt.v.b
    public String a() {
        return "sdm_expressad.db";
    }

    @Override // com.smartdigimkt.v.b
    public void a(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
    }

    @Override // com.smartdigimkt.v.b
    public void a(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        c(sQLiteDatabase);
        b(sQLiteDatabase);
    }
}
