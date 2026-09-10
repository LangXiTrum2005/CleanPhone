package ads_mobile_sdk;

import java.util.List;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.rajahmundry;

/* JADX INFO: loaded from: classes.dex */
public final class y13 {
    public static final y13 a = new y13();

    public static void a(Exception exc) {
        List list = rajahmundry.attabal(exc, "t", exc).s;
        String message = exc.getMessage();
        if (message == null) {
            message = exc.getClass().getName();
        }
        Intrinsics.beachfront(message);
        list.add(message);
    }

    public static void b(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        a(true, null, exception, false);
    }

    public static void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        w03 w03VarA = j13.a();
        w03VarA.e().m = false;
        w03VarA.e().s.add(message);
    }

    public static monroe a(saran saranVar, Function2 block) {
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    public static void a(nn0 error, boolean z) {
        String strC;
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof rn0) {
            strC = ((rn0) error).c();
        } else if (error instanceof on0) {
            on0 on0Var = (on0) error;
            String strD = on0Var.d();
            strC = strD == null ? on0Var.c().getClass().getName() : strD;
        } else if (error instanceof wn0) {
            strC = "WebView destroyed when method invoked.";
        } else if (error instanceof vn0) {
            vn0 vn0Var = (vn0) error;
            strC = vn0Var.d() + ": " + vn0Var.c() + " on url: " + vn0Var.e();
        } else if (error instanceof qn0) {
            qn0 qn0Var = (qn0) error;
            strC = qn0Var.c().attabal() + ": " + qn0Var.c().getMessage();
        } else if (error instanceof pn0) {
            pn0 pn0Var = (pn0) error;
            strC = "Code: " + pn0Var.c().b() + ", Message: " + pn0Var.c().c();
        } else if (error instanceof sn0) {
            strC = ((sn0) error).c();
        } else {
            if (!(error instanceof un0)) {
                throw new NoWhenBranchMatchedException();
            }
            strC = ((un0) error).c();
        }
        a(false, strC, error.b(), z);
    }

    public static void a(String message, Exception exc, int i) {
        if ((i & 2) != 0) {
            exc = null;
        }
        Intrinsics.checkNotNullParameter(message, "message");
        a(true, message, exc, false);
    }

    public static void a(boolean z, String str, Throwable th, boolean z2) {
        w03 w03VarA;
        if (z2) {
            w03VarA = j13.b().a;
            if (w03VarA == null) {
                return;
            }
        } else {
            w03VarA = j13.a();
        }
        if (str != null) {
            w03VarA.e().s.add(str);
        }
        w03VarA.e().m = false;
        if (th != null) {
            if (z) {
                w03VarA.a(th);
            } else {
                w03VarA.b(th);
            }
        }
    }
}
