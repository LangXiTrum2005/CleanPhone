package l4;

import android.content.Context;
import ea.f2;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements k4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f2 f45031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f45033e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f45034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45035g;

    public e(Context context, String str, f2 f2Var, boolean z10) {
        this.f45029a = context;
        this.f45030b = str;
        this.f45031c = f2Var;
        this.f45032d = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d().close();
    }

    public final d d() {
        d dVar;
        synchronized (this.f45033e) {
            try {
                if (this.f45034f == null) {
                    b[] bVarArr = new b[1];
                    if (this.f45030b == null || !this.f45032d) {
                        this.f45034f = new d(this.f45029a, this.f45030b, bVarArr, this.f45031c);
                    } else {
                        this.f45034f = new d(this.f45029a, new File(this.f45029a.getNoBackupFilesDir(), this.f45030b).getAbsolutePath(), bVarArr, this.f45031c);
                    }
                    this.f45034f.setWriteAheadLoggingEnabled(this.f45035g);
                }
                dVar = this.f45034f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @Override // k4.b
    public final b getWritableDatabase() {
        return d().d();
    }

    @Override // k4.b
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f45033e) {
            try {
                d dVar = this.f45034f;
                if (dVar != null) {
                    dVar.setWriteAheadLoggingEnabled(z10);
                }
                this.f45035g = z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
