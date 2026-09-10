package androidx.sqlite.db;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Companion", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {
    public final String X;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery$Companion;", "", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public SimpleSQLiteQuery(String str) {
        this.X = str;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getX() {
        return this.X;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void h(SupportSQLiteProgram supportSQLiteProgram) {
    }
}
