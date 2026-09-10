package com.unity3d.ads.core.extensions;

import an.h;
import an.r;
import com.unity3d.services.SDKErrorHandler;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import qk.i0;
import zm.b;
import zm.c;
import zm.d;
import zm.i;
import zm.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0006"}, d2 = {"getShortenedStackTrace", "", "", "maxLines", "", "retrieveUnityCrashValue", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ExceptionExtensionsKt {
    public static final String getShortenedStackTrace(Throwable th2, int i10) {
        i iVarB;
        n.f(th2, "<this>");
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th2.printStackTrace(printWriter);
                    String string = stringWriter.toString();
                    n.e(string, "stringWriter.toString()");
                    String string2 = h.T0(string).toString();
                    n.f(string2, "<this>");
                    i rVar = new r(string2, 0);
                    if (i10 < 0) {
                        throw new IllegalArgumentException(e.h(i10, "Requested element count ", " is less than zero.").toString());
                    }
                    if (i10 == 0) {
                        iVarB = d.f55098a;
                    } else {
                        iVarB = rVar instanceof c ? ((c) rVar).b(i10) : new b(rVar, i10, 1);
                    }
                    String strT = l.T(iVarB, "\n");
                    printWriter.close();
                    stringWriter.close();
                    return strT;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        i0.j(printWriter, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    i0.j(stringWriter, th5);
                    throw th6;
                }
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ String getShortenedStackTrace$default(Throwable th2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 15;
        }
        return getShortenedStackTrace(th2, i10);
    }

    public static final String retrieveUnityCrashValue(Throwable th2) {
        StackTraceElement stackTraceElement;
        String className;
        n.f(th2, "<this>");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        n.e(stackTrace, "this.stackTrace");
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                stackTraceElement = null;
                break;
            }
            stackTraceElement = stackTrace[i10];
            if ((stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? false : h.q0(className, SDKErrorHandler.UNITY_PACKAGE, false)) {
                break;
            }
            i10++;
        }
        if (stackTraceElement != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "unknown";
            }
            String str = fileName + '_' + stackTraceElement.getLineNumber();
            if (str != null) {
                return str;
            }
        }
        return "unknown";
    }
}
