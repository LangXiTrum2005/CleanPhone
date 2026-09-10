package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class QA extends C4604sl {
    public final int c;

    public QA() {
        super(a(2008, 1));
        this.c = 1;
    }

    public static int a(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public static QA b(IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !FW.h0(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new OA("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, 2007) : new QA(iOException, i2, i);
    }

    public QA(String str, int i) {
        super(str, a(i, 1));
        this.c = 1;
    }

    public QA(String str, IOException iOException, int i) {
        super(str, iOException, a(i, 1));
        this.c = 1;
    }

    public QA(IOException iOException, int i, int i2) {
        super(iOException, a(i, i2));
        this.c = i2;
    }
}
