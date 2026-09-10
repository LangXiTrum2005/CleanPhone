package n1;

import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.F9;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class s extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46406b;

    public s() {
        super(2008);
        this.f46406b = 1;
    }

    public static s a(int i10, IOException iOException) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = F9.b.f26076b;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !q1.F(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i11 == 2007 ? new r(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted") : new s(i11, i10, iOException);
    }

    public s(String str, int i10) {
        super(str, i10 == 2000 ? 2001 : i10);
        this.f46406b = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s(int i10, int i11, IOException iOException) {
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        super(i10, iOException);
        this.f46406b = i11;
    }

    public s(int i10, IOException iOException, String str) {
        super(i10 == 2000 ? 2001 : i10, iOException, str);
        this.f46406b = 1;
    }
}
