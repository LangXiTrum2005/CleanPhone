package com.google.android.gms.internal.ads;

import com.ironsource.F9;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ot1 extends xl1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18358b;

    public ot1() {
        this.f18358b = 1;
    }

    public static ot1 a(int i10, IOException iOException) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = F9.b.f26076b;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !x10.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i11 == 2007 ? new ys1("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new ot1(i11, i10, iOException);
    }

    public ot1(int i10, int i11, IOException iOException) {
        super(i10 == 2000 ? i11 != 1 ? 2000 : 2001 : i10, iOException);
        this.f18358b = i11;
    }

    public ot1(String str, int i10, int i11) {
        super(str, i10 == 2000 ? i11 != 1 ? 2000 : 2001 : i10);
        this.f18358b = i11;
    }

    public ot1(String str, IOException iOException, int i10, int i11) {
        super(i10 == 2000 ? i11 != 1 ? 2000 : 2001 : i10, iOException, str);
        this.f18358b = i11;
    }
}
