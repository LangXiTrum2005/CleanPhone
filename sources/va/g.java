package va;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f52527a = new CopyOnWriteArrayList();

    public static db.c a(String str) throws GeneralSecurityException {
        for (db.c cVar : f52527a) {
            cVar.getClass();
            if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                return cVar;
            }
        }
        throw new GeneralSecurityException(defpackage.e.n("No KMS client does support: ", str));
    }
}
