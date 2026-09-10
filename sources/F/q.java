package f;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.UUID;
import ud.h1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements jk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40247b;

    public /* synthetic */ q(Object obj, int i10) {
        this.f40246a = i10;
        this.f40247b = obj;
    }

    @Override // jk.a
    public final Object invoke() throws InterruptedException {
        int i10 = this.f40246a;
        Object obj = this.f40247b;
        switch (i10) {
            case 0:
                return new r((t) obj);
            case 1:
                android.support.v4.media.session.a.B(new fh.a((List) obj, null, 0));
                return wj.r.f53297a;
            case 2:
                fc.f fVar = (fc.f) obj;
                Context context = (Activity) fVar.f40781c;
                if (context == null) {
                    context = (Context) fVar.f40780b;
                }
                return wi.d.h(context.getPackageName(), ".flutter.share_provider");
            case 3:
                ((h1) obj).getClass();
                UUID uuidRandomUUID = UUID.randomUUID();
                kotlin.jvm.internal.n.e(uuidRandomUUID, "randomUUID(...)");
                String string = uuidRandomUUID.toString();
                kotlin.jvm.internal.n.e(string, "toString(...)");
                return string;
            case 4:
                ((vd.a) obj).f52555a.await();
                return wj.r.f53297a;
            case 5:
                ((zf.d) obj).f54938c.invoke(Boolean.FALSE);
                return wj.r.f53297a;
            case 6:
                return kotlin.jvm.internal.m.a((Object[]) obj);
            case 7:
                return ((Iterable) obj).iterator();
            case 8:
                return yg.b.a((yg.b) obj);
            default:
                return obj;
        }
    }
}
