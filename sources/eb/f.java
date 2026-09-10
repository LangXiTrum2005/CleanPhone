package eb;

import java.security.GeneralSecurityException;
import jb.s1;
import jb.w0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f39980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f39981c;

    public f(String str, Class cls, w0 w0Var) {
        this.f39979a = str;
        this.f39980b = cls;
        this.f39981c = w0Var;
    }

    public final Object a(com.google.crypto.tink.shaded.protobuf.i iVar) throws GeneralSecurityException {
        return n.f40002b.a(o.f40004b.a(c0.a(this.f39979a, iVar, this.f39981c, s1.RAW, null)), this.f39980b);
    }
}
