package kotlin.jdk7;

import androidx.sqlite.SQLiteStatement;
import kotlin.ExceptionsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u001a\b\u0007\u0010\u0004\"\u00020\u00002\u00020\u0000B\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u0003¨\u0006\u0005"}, d2 = {"Ljava/lang/AutoCloseable;", "Lkotlin/SinceKotlin;", "version", "2.0", "AutoCloseable", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AutoCloseableKt {
    public static final void a(SQLiteStatement sQLiteStatement, Throwable th) throws Exception {
        if (sQLiteStatement != null) {
            if (th == null) {
                sQLiteStatement.close();
                return;
            }
            try {
                sQLiteStatement.close();
            } catch (Throwable th2) {
                ExceptionsKt.a(th, th2);
            }
        }
    }
}
