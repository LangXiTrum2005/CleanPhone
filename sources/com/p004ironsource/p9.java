package com.p004ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/ironsource/p9;", "", "", "a", "throwable", "", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/Throwable;", "c", "()Ljava/lang/Throwable;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "stackTrace", "Z", "d", "()Z", "isIronsourceCrash", "<init>", "(Ljava/lang/Throwable;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class p9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Throwable throwable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String stackTrace;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isIronsourceCrash;

    public p9(Throwable throwable) {
        Intrinsics.f(throwable, "throwable");
        this.throwable = throwable;
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        Intrinsics.e(stackTrace, "throwable.stackTrace");
        sb.append(throwable.toString());
        sb.append(System.lineSeparator());
        boolean z2 = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append(";" + System.lineSeparator());
            String string = stackTraceElement.toString();
            Intrinsics.e(string, "elem.toString()");
            String strE = q9.d().e();
            Intrinsics.e(strE, "getInstance().keyword");
            if (StringsKt.l(string, strE, false)) {
                z2 = true;
            }
        }
        Throwable cause = this.throwable.getCause();
        if (cause != null) {
            sb.append("--CAUSE");
            sb.append(System.lineSeparator());
            sb.append(cause.toString());
            sb.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            Intrinsics.e(stackTrace2, "cause.stackTrace");
            for (StackTraceElement stackTraceElement2 : stackTrace2) {
                sb.append(stackTraceElement2.toString());
                sb.append(";" + System.lineSeparator());
                String string2 = stackTraceElement2.toString();
                Intrinsics.e(string2, "elem.toString()");
                String strE2 = q9.d().e();
                Intrinsics.e(strE2, "getInstance().keyword");
                if (StringsKt.l(string2, strE2, false)) {
                    z2 = true;
                }
            }
        }
        String string3 = sb.toString();
        Intrinsics.e(string3, "builder.toString()");
        this.stackTrace = string3;
        this.isIronsourceCrash = z2;
    }

    public static /* synthetic */ p9 a(p9 p9Var, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            th = p9Var.throwable;
        }
        return p9Var.a(th);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStackTrace() {
        return this.stackTrace;
    }

    public final Throwable c() {
        return this.throwable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsIronsourceCrash() {
        return this.isIronsourceCrash;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof p9) && Intrinsics.a(this.throwable, ((p9) other).throwable);
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public String toString() {
        return "CrashReportWrapper(throwable=" + this.throwable + ')';
    }

    public final p9 a(Throwable throwable) {
        Intrinsics.f(throwable, "throwable");
        return new p9(throwable);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }
}
