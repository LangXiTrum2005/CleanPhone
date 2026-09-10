package kotlin;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlin/ExceptionsKt__ExceptionsKt"}, k = 4, mv = {2, 1, 0}, xi = 49)
public final class ExceptionsKt extends ExceptionsKt__ExceptionsKt {
    public static void a(Throwable th, Throwable exception) {
        Intrinsics.f(th, "<this>");
        Intrinsics.f(exception, "exception");
        if (th != exception) {
            PlatformImplementationsKt.f43300a.a(th, exception);
        }
    }

    public static String b(Throwable th) {
        Intrinsics.f(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }
}
