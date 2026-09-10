package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfwm extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwm(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i2, zzfwo zzfwoVar) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, i2);
        zzfwj.zza();
    }
}
