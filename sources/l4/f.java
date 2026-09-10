package l4;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SQLiteStatement f45036d;

    public f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement, 1);
        this.f45036d = sQLiteStatement;
    }

    public final void t() {
        this.f45036d.executeUpdateDelete();
    }
}
