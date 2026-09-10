package androidx.sqlite.db.framework;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelperFactory;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrameworkSQLiteOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public final SupportSQLiteOpenHelper a(SupportSQLiteOpenHelper.Configuration configuration) {
        return new FrameworkSQLiteOpenHelper(configuration.f8366a, configuration.f8367b, configuration.f8368c, configuration.d);
    }
}
