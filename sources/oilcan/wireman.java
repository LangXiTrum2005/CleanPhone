package oilcan;

import androidx.compose.runtime.tooling.DiagnosticComposeException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.cuirassed;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ComposeStackTrace.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\r\u001a\u00020\f*\u00060\nj\u0002`\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "Lkotlin/Function0;", "", "Loilcan/dern;", "trace", "", "dern", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Z", "saneness", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Ljava/lang/Throwable;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "attabal", "(Ljava/lang/StringBuilder;Ljava/util/List;)V", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class wireman {
    /* JADX WARN: Code duplicated, block: B:13:0x0037 A[PHI: r9
  0x0037: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v14 java.lang.String) binds: [B:5:0x0024, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void attabal(StringBuilder sb, List<ComposeStackTraceFrame> list) {
        List listDern = p002kotlin.collections.graveside.dern();
        List listStarveling = cuirassed.starveling(list);
        int size = listStarveling.size();
        String str = null;
        String str2 = null;
        for (int i = 0; i < size; i++) {
            ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) listStarveling.get(i);
            adultoid sourceInfo = composeStackTraceFrame.getSourceInfo();
            String str3 = sourceInfo.getCom.ironsource.X3.g.b java.lang.String();
            if (str3 != null) {
                str = str3;
            } else {
                str3 = sourceInfo.getIsCall() ? "<lambda>" : null;
                if (str3 != null) {
                    str = str3;
                } else if (str == null) {
                    str = "<unknown function>";
                }
            }
            String sourceFile = sourceInfo.getSourceFile();
            if (sourceFile != null) {
                str2 = sourceFile;
            } else if (str2 == null) {
                str2 = "<unknown file>";
            }
            List<arytenoidectomy> listSaneness = sourceInfo.saneness();
            String str4 = str + '(' + str2 + ':' + ((composeStackTraceFrame.getGroupOffset() == null || composeStackTraceFrame.getGroupOffset().intValue() >= listSaneness.size()) ? "<unknown line>" : String.valueOf(listSaneness.get(composeStackTraceFrame.getGroupOffset().intValue()).getLineNumber())) + ')';
            Intrinsics.checkNotNullExpressionValue(str4, "toString(...)");
            if (!sourceInfo.getIsCall()) {
            }
            if (!Intrinsics.wireman(sourceInfo.getCom.ironsource.X3.g.b java.lang.String(), "rememberCompositionContext") || !Intrinsics.wireman(sourceInfo.getPackageHash(), "9igjgp")) {
                listDern.add(str4);
            }
        }
        List listStarveling2 = cuirassed.starveling(p002kotlin.collections.graveside.attabal(listDern));
        int size2 = listStarveling2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            sb.append("\tat " + ((String) listStarveling2.get(i2)));
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        }
    }

    public static final boolean dern(Throwable th, Function0<? extends List<ComposeStackTraceFrame>> function0) throws IllegalAccessException, InvocationTargetException {
        DiagnosticComposeException diagnosticComposeException;
        List<Throwable> listSaneness = patroclinal.marial.saneness(th);
        boolean z = false;
        if (!(listSaneness instanceof Collection) || !listSaneness.isEmpty()) {
            Iterator<T> it = listSaneness.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof DiagnosticComposeException) {
                    return false;
                }
            }
        }
        try {
            List<ComposeStackTraceFrame> listInvoke = function0.invoke();
            boolean zIsEmpty = listInvoke.isEmpty();
            z = !zIsEmpty;
            diagnosticComposeException = !zIsEmpty ? new DiagnosticComposeException(listInvoke) : null;
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            patroclinal.marial.attabal(th, diagnosticComposeException);
        }
        return z;
    }

    public static final Throwable saneness(Throwable th, Function0<? extends List<ComposeStackTraceFrame>> function0) throws IllegalAccessException, InvocationTargetException {
        dern(th, function0);
        return th;
    }
}
