package wf;

import com.google.android.gms.internal.ads.j30;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import xj.o;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements eg.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j30 f53207b;

    public /* synthetic */ i(j30 j30Var, int i10) {
        this.f53206a = i10;
        this.f53207b = j30Var;
    }

    public Object b() {
        switch (this.f53206a) {
            case 0:
                return (Long) l(vf.c.AUDIO);
            default:
                return (Double) l(vf.c.AUDIO);
        }
    }

    public Object h() {
        switch (this.f53206a) {
            case 0:
                return (Long) l(vf.c.VIDEO);
            default:
                return (Double) l(vf.c.VIDEO);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f53206a) {
            case 0:
                break;
            case 1:
                break;
        }
        return eg.a.b(this);
    }

    @Override // eg.e
    public final Object j() {
        switch (this.f53206a) {
            case 0:
                return (Long) eg.a.a(this, vf.c.VIDEO);
            case 1:
                return (Long) eg.a.a(this, vf.c.VIDEO);
            default:
                return (Double) eg.a.a(this, vf.c.VIDEO);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // eg.e
    public final boolean k(vf.c type) {
        switch (this.f53206a) {
        }
        n.f(type, "type");
        return true;
    }

    @Override // eg.e
    public final Object l(vf.c type) {
        switch (this.f53206a) {
            case 0:
                n.f(type, "type");
                j30 j30Var = this.f53207b;
                long positionUs = 0;
                if (((e) ((u) j30Var.f15949c).f54882e).k(type)) {
                    List listH = ((f) j30Var.f15948b).l(type);
                    int iIntValue = ((Number) ((eg.e) j30Var.f15950d).l(type)).intValue();
                    int i10 = 0;
                    for (Object obj : listH) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            o.V();
                            throw null;
                        }
                        jg.b bVar = (jg.b) obj;
                        positionUs += i10 < iIntValue ? bVar.getPositionUs() : bVar.getDurationUs();
                        i10 = i11;
                    }
                }
                return Long.valueOf(positionUs);
            case 1:
                n.f(type, "type");
                j30 j30Var2 = this.f53207b;
                long positionUs2 = 0;
                if (((e) ((u) j30Var2.f15949c).f54882e).k(type)) {
                    List listH2 = ((f) j30Var2.f15948b).l(type);
                    int iIntValue2 = ((Number) ((eg.e) j30Var2.f15950d).l(type)).intValue();
                    int i12 = 0;
                    for (Object obj2 : listH2) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            o.V();
                            throw null;
                        }
                        jg.b bVar2 = (jg.b) obj2;
                        if (i12 <= iIntValue2) {
                            positionUs2 = bVar2.getPositionUs() + positionUs2;
                        }
                        i12 = i13;
                    }
                }
                return Long.valueOf(positionUs2);
            default:
                n.f(type, "type");
                j30 j30Var3 = this.f53207b;
                long jLongValue = ((Number) ((i) j30Var3.f15951e).l(type)).longValue();
                long jLongValue2 = ((Number) ((i) j30Var3.f15952f).l(type)).longValue();
                return Double.valueOf(jLongValue2 == 0 ? 0.0d : jLongValue / jLongValue2);
        }
    }

    @Override // eg.e
    public final Object o() {
        switch (this.f53206a) {
            case 0:
                return (Long) eg.a.a(this, vf.c.AUDIO);
            case 1:
                return (Long) eg.a.a(this, vf.c.AUDIO);
            default:
                return (Double) eg.a.a(this, vf.c.AUDIO);
        }
    }
}
