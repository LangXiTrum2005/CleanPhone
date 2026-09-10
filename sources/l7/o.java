package l7;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f45200b;

    public o(e0 e0Var, String str) {
        super(str);
        this.f45200b = e0Var;
    }

    @Override // l7.n, java.lang.Throwable
    public final String toString() {
        e0 e0Var = this.f45200b;
        q qVar = e0Var != null ? e0Var.f45111c : null;
        StringBuilder sb2 = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (qVar != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(qVar.f45202a);
            sb2.append(", facebookErrorCode: ");
            sb2.append(qVar.f45203b);
            sb2.append(", facebookErrorType: ");
            sb2.append(qVar.f45205d);
            sb2.append(", message: ");
            sb2.append(qVar.a());
            sb2.append("}");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "errorStringBuilder.toString()");
        return string;
    }
}
