package i9;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f42949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f42950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f42951c;

    public /* synthetic */ o(boolean z10, String str, n nVar) {
        this.f42949a = z10;
        this.f42950b = str;
        this.f42951c = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z10 = this.f42949a;
        String str = this.f42950b;
        n nVar = this.f42951c;
        String str2 = (z10 || !q.b(str, nVar, true, false).f42967a) ? "not allowed" : "debug cert rejected";
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    c0.h(messageDigest);
                    return str2 + ": pkg=" + str + ", sha256=" + p9.c.b(messageDigest.digest(nVar.f42948c)) + ", atk=" + z10 + ", ver=12451000.false";
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        messageDigest = null;
        c0.h(messageDigest);
        return str2 + ": pkg=" + str + ", sha256=" + p9.c.b(messageDigest.digest(nVar.f42948c)) + ", atk=" + z10 + ", ver=12451000.false";
    }
}
