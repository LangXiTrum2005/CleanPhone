package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/migration/Migration;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Migration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8315b;

    public Migration(int i2, int i3) {
        this.f8314a = i2;
        this.f8315b = i3;
    }

    public void a(SupportSQLiteDatabase db) {
        Intrinsics.f(db, "db");
        throw new NotImplementedError("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
