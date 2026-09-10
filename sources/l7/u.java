package l7;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends n {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f45231b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q requestError, String str) {
        super(str);
        kotlin.jvm.internal.n.f(requestError, "requestError");
        this.f45231b = requestError;
    }

    @Override // l7.n, java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        q qVar = this.f45231b;
        sb2.append(qVar.f45202a);
        sb2.append(", facebookErrorCode: ");
        sb2.append(qVar.f45203b);
        sb2.append(", facebookErrorType: ");
        sb2.append(qVar.f45205d);
        sb2.append(", message: ");
        sb2.append(qVar.a());
        sb2.append("}");
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }
}
