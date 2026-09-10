package eb;

import java.security.GeneralSecurityException;
import jb.s1;
import jb.w0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb.a f39968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.crypto.tink.shaded.protobuf.i f39969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w0 f39970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s1 f39971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f39972f;

    public c0(String str, lb.a aVar, com.google.crypto.tink.shaded.protobuf.i iVar, w0 w0Var, s1 s1Var, Integer num) {
        this.f39967a = str;
        this.f39968b = aVar;
        this.f39969c = iVar;
        this.f39970d = w0Var;
        this.f39971e = s1Var;
        this.f39972f = num;
    }

    public static c0 a(String str, com.google.crypto.tink.shaded.protobuf.i iVar, w0 w0Var, s1 s1Var, Integer num) throws GeneralSecurityException {
        if (s1Var == s1.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new c0(str, j0.a(str), iVar, w0Var, s1Var, num);
    }
}
