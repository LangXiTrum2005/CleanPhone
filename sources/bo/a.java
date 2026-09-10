package bo;

import com.ironsource.C0375hc;
import java.io.IOException;
import xn.n;
import xn.q;
import xn.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5758a = new a();

    @Override // xn.n
    public final w a(co.g gVar) throws IOException {
        i iVar = gVar.f6795a;
        synchronized (iVar) {
            try {
                if (!iVar.l) {
                    throw new IllegalStateException("released");
                }
                if (iVar.f5796k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (iVar.f5795j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b2.a finder = iVar.f5792g;
        kotlin.jvm.internal.n.c(finder);
        q qVar = iVar.f5786a;
        try {
            co.e eVarJ = finder.c(gVar.f6800f, gVar.f6801g, gVar.f6802h, qVar.f54032f, !kotlin.jvm.internal.n.a(gVar.f6799e.f54061b, C0375hc.f28788a)).j(qVar, gVar);
            kotlin.jvm.internal.n.f(finder, "finder");
            e eVar = new e();
            eVar.f5777b = iVar;
            eVar.f5778c = finder;
            eVar.f5779d = eVarJ;
            eVar.f5780e = eVarJ.getConnection();
            iVar.f5794i = eVar;
            iVar.f5798n = eVar;
            synchronized (iVar) {
                iVar.f5795j = true;
                iVar.f5796k = true;
            }
            if (iVar.f5797m) {
                throw new IOException("Canceled");
            }
            return co.g.a(gVar, 0, eVar, null, 61).b(gVar.f6799e);
        } catch (m e10) {
            finder.e(e10.f5823b);
            throw e10;
        } catch (IOException e11) {
            finder.e(e11);
            throw new m(e11);
        }
    }
}
