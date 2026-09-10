package com.google.android.exoplayer2.database;

import android.database.sqlite.SQLiteDatabase;
import com.chartboost.sdk.impl.p7;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultDatabaseProvider implements DatabaseProvider {
    public final p7 X;

    public DefaultDatabaseProvider(p7 p7Var) {
        this.X = p7Var;
    }

    @Override // com.google.android.exoplayer2.database.DatabaseProvider
    public final SQLiteDatabase getReadableDatabase() {
        return this.X.getReadableDatabase();
    }

    @Override // com.google.android.exoplayer2.database.DatabaseProvider
    public final SQLiteDatabase getWritableDatabase() {
        return this.X.getWritableDatabase();
    }
}
