package l7;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends n {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45189c;

    public m(String str, int i10, String str2) {
        super(str);
        this.f45188b = i10;
        this.f45189c = str2;
    }

    @Override // l7.n, java.lang.Throwable
    public final String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.f45188b + ", message: " + getMessage() + ", url: " + this.f45189c + "}";
        kotlin.jvm.internal.n.e(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
