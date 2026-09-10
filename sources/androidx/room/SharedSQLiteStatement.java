package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/SharedSQLiteStatement;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class SharedSQLiteStatement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f8248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f8249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f8250c;

    public SharedSQLiteStatement(RoomDatabase database) {
        Intrinsics.f(database, "database");
        this.f8248a = database;
        this.f8249b = new AtomicBoolean(false);
        this.f8250c = LazyKt.b(new c(this, 0));
    }

    public final SupportSQLiteStatement a() {
        RoomDatabase roomDatabase = this.f8248a;
        roomDatabase.a();
        if (this.f8249b.compareAndSet(false, true)) {
            return (SupportSQLiteStatement) this.f8250c.getX();
        }
        String strB = b();
        roomDatabase.getClass();
        roomDatabase.a();
        roomDatabase.b();
        return roomDatabase.h().getWritableDatabase().f0(strB);
    }

    public abstract String b();

    public final void c(SupportSQLiteStatement statement) {
        Intrinsics.f(statement, "statement");
        if (statement == ((SupportSQLiteStatement) this.f8250c.getX())) {
            this.f8249b.set(false);
        }
    }
}
