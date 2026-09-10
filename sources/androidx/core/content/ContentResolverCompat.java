package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.OperationCanceledException;
import androidx.core.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class ContentResolverCompat {
    public static Cursor a(ContentResolver contentResolver, CancellationSignal cancellationSignal) throws Exception {
        android.os.CancellationSignal cancellationSignal2;
        if (cancellationSignal != null) {
            synchronized (cancellationSignal) {
                try {
                    if (cancellationSignal.f4352c == null) {
                        android.os.CancellationSignal cancellationSignal3 = new android.os.CancellationSignal();
                        cancellationSignal.f4352c = cancellationSignal3;
                        if (cancellationSignal.f4350a) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = cancellationSignal.f4352c;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            cancellationSignal2 = null;
        }
        try {
            return contentResolver.query(null, null, null, null, null, cancellationSignal2);
        } catch (Exception e2) {
            if (e2 instanceof OperationCanceledException) {
                throw new androidx.core.os.OperationCanceledException();
            }
            throw e2;
        }
    }
}
