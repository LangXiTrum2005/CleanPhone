package com.chartboost.sdk.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p7 extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(Context context, String name, SQLiteDatabase.CursorFactory cursorFactory, int i2) {
        super(context, name, cursorFactory, i2);
        Intrinsics.f(context, "context");
        Intrinsics.f(name, "name");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public /* synthetic */ p7(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? "chartboost_exoplayer.db" : str, (i3 & 4) != 0 ? null : cursorFactory, (i3 & 8) != 0 ? 1 : i2);
    }
}
