package g4;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f41515a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f41516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile l4.f f41517c;

    public j(f fVar) {
        this.f41516b = fVar;
    }

    public final l4.f a() {
        this.f41516b.a();
        if (!this.f41515a.compareAndSet(false, true)) {
            String strB = b();
            f fVar = this.f41516b;
            fVar.a();
            fVar.b();
            return new l4.f(((SQLiteDatabase) fVar.f41497c.getWritableDatabase().f45023b).compileStatement(strB));
        }
        if (this.f41517c == null) {
            String strB2 = b();
            f fVar2 = this.f41516b;
            fVar2.a();
            fVar2.b();
            this.f41517c = new l4.f(((SQLiteDatabase) fVar2.f41497c.getWritableDatabase().f45023b).compileStatement(strB2));
        }
        return this.f41517c;
    }

    public abstract String b();

    public final void c(l4.f fVar) {
        if (fVar == this.f41517c) {
            this.f41515a.set(false);
        }
    }
}
