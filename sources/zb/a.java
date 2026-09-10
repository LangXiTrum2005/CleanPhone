package zb;

import cc.d0;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f54669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f54671c;

    public a(d0 d0Var, String str, File file) {
        this.f54669a = d0Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f54670b = str;
        this.f54671c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f54669a.equals(aVar.f54669a) && this.f54670b.equals(aVar.f54670b) && this.f54671c.equals(aVar.f54671c);
    }

    public final int hashCode() {
        return this.f54671c.hashCode() ^ ((((this.f54669a.hashCode() ^ 1000003) * 1000003) ^ this.f54670b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f54669a + ", sessionId=" + this.f54670b + ", reportFile=" + this.f54671c + "}";
    }
}
