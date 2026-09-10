package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.m4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0456m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f29242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29244c;

    public C0456m4(Throwable throwable) {
        kotlin.jvm.internal.n.f(throwable, "throwable");
        this.f29242a = throwable;
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        kotlin.jvm.internal.n.e(stackTrace, "throwable.stackTrace");
        sb2.append(throwable.toString());
        sb2.append(System.lineSeparator());
        boolean z10 = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb2.append(stackTraceElement.toString());
            sb2.append(";" + System.lineSeparator());
            String string = stackTraceElement.toString();
            kotlin.jvm.internal.n.e(string, "elem.toString()");
            String strE = C0474n4.d().e();
            kotlin.jvm.internal.n.e(strE, "getInstance().keyword");
            if (an.h.q0(string, strE, false)) {
                z10 = true;
            }
        }
        Throwable cause = this.f29242a.getCause();
        if (cause != null) {
            sb2.append("--CAUSE");
            sb2.append(System.lineSeparator());
            sb2.append(cause.toString());
            sb2.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            kotlin.jvm.internal.n.e(stackTrace2, "cause.stackTrace");
            for (StackTraceElement stackTraceElement2 : stackTrace2) {
                sb2.append(stackTraceElement2.toString());
                sb2.append(";" + System.lineSeparator());
                String string2 = stackTraceElement2.toString();
                kotlin.jvm.internal.n.e(string2, "elem.toString()");
                String strE2 = C0474n4.d().e();
                kotlin.jvm.internal.n.e(strE2, "getInstance().keyword");
                if (an.h.q0(string2, strE2, false)) {
                    z10 = true;
                }
            }
        }
        String string3 = sb2.toString();
        kotlin.jvm.internal.n.e(string3, "builder.toString()");
        this.f29243b = string3;
        this.f29244c = z10;
    }

    public final Throwable a() {
        return this.f29242a;
    }

    public final String b() {
        return this.f29243b;
    }

    public final Throwable c() {
        return this.f29242a;
    }

    public final boolean d() {
        return this.f29244c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0456m4) && kotlin.jvm.internal.n.a(this.f29242a, ((C0456m4) obj).f29242a);
    }

    public int hashCode() {
        return this.f29242a.hashCode();
    }

    public String toString() {
        return "CrashReportWrapper(throwable=" + this.f29242a + ")";
    }

    public final C0456m4 a(Throwable throwable) {
        kotlin.jvm.internal.n.f(throwable, "throwable");
        return new C0456m4(throwable);
    }

    public static /* synthetic */ C0456m4 a(C0456m4 c0456m4, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = c0456m4.f29242a;
        }
        return c0456m4.a(th2);
    }
}
