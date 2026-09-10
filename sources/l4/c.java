package l4;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import ea.f2;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements DatabaseErrorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f2 f45024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b[] f45025b;

    public c(f2 f2Var, b[] bVarArr) {
        this.f45024a = f2Var;
        this.f45025b = bVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        b bVarA = d.a(this.f45025b, sQLiteDatabase);
        this.f45024a.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + ((SQLiteDatabase) bVarA.f45023b).getPath());
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) bVarA.f45023b;
        if (!sQLiteDatabase2.isOpen()) {
            f2.c(sQLiteDatabase2.getPath());
            return;
        }
        List<Pair<String, String>> attachedDbs = null;
        try {
            try {
                attachedDbs = sQLiteDatabase2.getAttachedDbs();
            } finally {
                if (attachedDbs != null) {
                    Iterator<Pair<String, String>> it = attachedDbs.iterator();
                    while (it.hasNext()) {
                        f2.c((String) it.next().second);
                    }
                } else {
                    f2.c(sQLiteDatabase2.getPath());
                }
            }
        } catch (SQLiteException unused) {
        }
        try {
            bVarA.close();
        } catch (IOException unused2) {
        }
    }
}
