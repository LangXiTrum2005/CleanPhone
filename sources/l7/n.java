package l7;

import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class n extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SecureRandom f45199a = new SecureRandom();
    public static final long serialVersionUID = 1;

    public n(String str) {
        super(str);
        if (str == null || !s.f45226p.get() || f45199a.nextInt(100) <= 50) {
            return;
        }
        q7.p.a(new ae.a(str, 3), q7.n.ErrorReport);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }
}
