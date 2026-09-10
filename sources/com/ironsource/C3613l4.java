package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.ironsource.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3613l4 {
    private final Throwable a;
    private final String b;
    private final boolean c;

    public C3613l4(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.a = throwable;
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace");
        sb.append(throwable.toString());
        sb.append(System.lineSeparator());
        boolean z = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append(";" + System.lineSeparator());
            String string = stackTraceElement.toString();
            Intrinsics.checkNotNullExpressionValue(string, "elem.toString()");
            String strE = C3631m4.d().e();
            Intrinsics.checkNotNullExpressionValue(strE, "getInstance().keyword");
            if (StringsKt.overspeculate(string, strE, false, 2, null)) {
                z = true;
            }
        }
        Throwable cause = this.a.getCause();
        if (cause != null) {
            sb.append("--CAUSE");
            sb.append(System.lineSeparator());
            sb.append(cause.toString());
            sb.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace2, "cause.stackTrace");
            for (StackTraceElement stackTraceElement2 : stackTrace2) {
                sb.append(stackTraceElement2.toString());
                sb.append(";" + System.lineSeparator());
                String string2 = stackTraceElement2.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "elem.toString()");
                String strE2 = C3631m4.d().e();
                Intrinsics.checkNotNullExpressionValue(strE2, "getInstance().keyword");
                if (StringsKt.overspeculate(string2, strE2, false, 2, null)) {
                    z = true;
                }
            }
        }
        String string3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "builder.toString()");
        this.b = string3;
        this.c = z;
    }

    public final Throwable a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Throwable c() {
        return this.a;
    }

    public final boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3613l4) && Intrinsics.wireman(this.a, ((C3613l4) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "CrashReportWrapper(throwable=" + this.a + ")";
    }

    public final C3613l4 a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new C3613l4(throwable);
    }

    public static /* synthetic */ C3613l4 a(C3613l4 c3613l4, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = c3613l4.a;
        }
        return c3613l4.a(th);
    }
}
