package patroclinal;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\b*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"", "", "dern", "(Ljava/lang/Throwable;)Ljava/lang/String;", "exception", "", "attabal", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "", "saneness", "(Ljava/lang/Throwable;)Ljava/util/List;", "getSuppressedExceptions$annotations", "(Ljava/lang/Throwable;)V", "suppressedExceptions", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/ExceptionsKt")
public class marial {
    public static void attabal(Throwable th, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (th != exception) {
            dessertspoon.saneness.f25228attabal.attabal(th, exception);
        }
    }

    public static String dern(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static List<Throwable> saneness(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return dessertspoon.saneness.f25228attabal.dern(th);
    }
}
