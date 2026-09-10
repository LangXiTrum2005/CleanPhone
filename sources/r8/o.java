package r8;

import com.google.android.gms.internal.measurement.nf;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements o8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f49502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f49503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f49504c;

    public o(Set set, i iVar, p pVar) {
        this.f49502a = set;
        this.f49503b = iVar;
        this.f49504c = pVar;
    }

    public final nf a(String str, o8.c cVar, o8.e eVar) {
        Set set = this.f49502a;
        if (!set.contains(cVar)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
        }
        return new nf(this.f49503b, str, cVar, eVar, this.f49504c, 4);
    }
}
