package rj;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.Objects;
import k3.j;
import qj.r;
import qj.w;
import xi.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends io.flutter.plugin.platform.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49609a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f49610b;

    public b(tj.c cVar) {
        super(u.f53827a);
        this.f49610b = cVar;
    }

    @Override // io.flutter.plugin.platform.e
    public final io.flutter.plugin.platform.d create(Context context, int i10, Object obj) {
        switch (this.f49609a) {
            case 0:
                r rVar = (r) obj;
                Objects.requireNonNull(rVar);
                return new a(context, ((w) ((LongSparseArray) ((j) this.f49610b).f44293b).get(rVar.f49083a)).f49093e);
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    throw new IllegalStateException("An identifier is required to retrieve a View instance.");
                }
                Object objE = ((tj.c) this.f49610b).e(num.intValue());
                if (objE instanceof io.flutter.plugin.platform.d) {
                    return (io.flutter.plugin.platform.d) objE;
                }
                if (objE instanceof View) {
                    return new a((View) objE);
                }
                throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + objE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar) {
        super(qj.b.a());
        qj.c.f49031y9.getClass();
        this.f49610b = jVar;
    }
}
