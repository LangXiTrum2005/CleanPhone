package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function4 {
    public final /* synthetic */ SupportSQLiteQuery X;

    public /* synthetic */ a(SupportSQLiteQuery supportSQLiteQuery) {
        this.X = supportSQLiteQuery;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        String[] strArr = FrameworkSQLiteDatabase.f8372Y;
        Intrinsics.c(sQLiteQuery);
        this.X.h(new FrameworkSQLiteProgram(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
