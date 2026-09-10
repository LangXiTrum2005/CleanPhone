package bb;

import eb.x;
import java.security.InvalidAlgorithmParameterException;
import jb.f0;
import jb.w0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f5516a = new x(a.class, va.b.class, new ae.b(11));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eb.f f5517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wa.f f5518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5519d;

    static {
        f0.D();
        f5517b = new eb.f("type.googleapis.com/google.crypto.tink.AesSivKey", va.b.class, w0.SYMMETRIC);
        f5518c = new wa.f();
        f5519d = new b(0);
    }

    public static void a(e eVar) {
        if (eVar.f5524a != 64) {
            throw new InvalidAlgorithmParameterException(l1.d.i(new StringBuilder("invalid key size: "), eVar.f5524a, ". Valid keys must have 64 bytes."));
        }
    }
}
