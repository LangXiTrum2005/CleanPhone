package cn;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g1 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient q1 f6714a;

    public g1(String str, Throwable th2, q1 q1Var) {
        super(str);
        this.f6714a = q1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (!kotlin.jvm.internal.n.a(g1Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = g1Var.f6714a;
        if (obj2 == null) {
            obj2 = u1.f6774a;
        }
        Object obj3 = this.f6714a;
        if (obj3 == null) {
            obj3 = u1.f6774a;
        }
        return kotlin.jvm.internal.n.a(obj2, obj3) && kotlin.jvm.internal.n.a(g1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.n.c(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f6714a;
        if (obj == null) {
            obj = u1.f6774a;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("; job=");
        Object obj = this.f6714a;
        if (obj == null) {
            obj = u1.f6774a;
        }
        sb2.append(obj);
        return sb2.toString();
    }
}
