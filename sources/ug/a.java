package ug;

import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52211c;

    public a(String str, String str2, String str3) {
        super(str2, null);
        this.f52209a = str;
        this.f52210b = str2;
        this.f52211c = str3;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        Throwable cause = getCause();
        String simpleName = cause != null ? cause.getClass().getSimpleName() : null;
        StringBuilder sbV = e.v("ProjectFlutterError(code=", this.f52209a, ", message=", this.f52210b, ", details=");
        sbV.append((Object) this.f52211c);
        sbV.append(", cause=");
        sbV.append(simpleName);
        sbV.append(")");
        return sbV.toString();
    }
}
