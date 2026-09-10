package androidx.sqlite.driver;

import android.support.v4.media.a;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteDriver;", "Landroidx/sqlite/SQLiteDriver;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SupportSQLiteDriver implements SQLiteDriver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SupportSQLiteOpenHelper f8382a;

    public SupportSQLiteDriver(SupportSQLiteOpenHelper openHelper) {
        Intrinsics.f(openHelper, "openHelper");
        this.f8382a = openHelper;
    }

    @Override // androidx.sqlite.SQLiteDriver
    public final SQLiteConnection open(String fileName) {
        Intrinsics.f(fileName, "fileName");
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.f8382a;
        String f8373y = supportSQLiteOpenHelper.getF8373Y();
        if (f8373y == null) {
            if (!fileName.equals(":memory:")) {
                throw new IllegalArgumentException(a.n("This driver is configured to open an in-memory database but a file-based named '", fileName, "' was requested.").toString());
            }
        } else if (!f8373y.equals(fileName) && !StringsKt.Q(IOUtils.DIR_SEPARATOR_UNIX, f8373y, f8373y).equals(StringsKt.Q(IOUtils.DIR_SEPARATOR_UNIX, fileName, fileName))) {
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + supportSQLiteOpenHelper.getF8373Y() + "' but '" + fileName + "' was requested.").toString());
        }
        return new SupportSQLiteConnection(supportSQLiteOpenHelper.getWritableDatabase());
    }
}
