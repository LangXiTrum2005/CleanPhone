package premed;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: FrameworkSQLiteProgram.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman implements iconoclasm.wireman {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final SQLiteProgram f35642kowloon;

    public wireman(SQLiteProgram sQLiteProgram) {
        this.f35642kowloon = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f35642kowloon.close();
    }

    @Override // iconoclasm.wireman
    public void lotta(int i) {
        this.f35642kowloon.bindNull(i);
    }

    @Override // iconoclasm.wireman
    public void peridotite(int i, String str) {
        this.f35642kowloon.bindString(i, str);
    }

    @Override // iconoclasm.wireman
    public void permissivist(int i, long j) {
        this.f35642kowloon.bindLong(i, j);
    }

    @Override // iconoclasm.wireman
    public void polloi(int i, double d) {
        this.f35642kowloon.bindDouble(i, d);
    }

    @Override // iconoclasm.wireman
    public void premeiotic(int i, byte[] bArr) {
        this.f35642kowloon.bindBlob(i, bArr);
    }
}
