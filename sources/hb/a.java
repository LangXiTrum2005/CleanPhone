package hb;

import java.security.GeneralSecurityException;
import qk.i0;
import s4.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f42293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f42294c;

    public a(b bVar, i iVar) {
        this.f42293b = bVar;
        this.f42294c = iVar;
    }

    public static a t0(b bVar, i iVar) throws GeneralSecurityException {
        if (bVar.f42295a == ((lb.a) iVar.f50111a).f45273a.length) {
            return new a(bVar, iVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // qk.i0
    public final Integer I() {
        return null;
    }

    @Override // qk.i0
    public final va.i N() {
        return this.f42293b;
    }
}
