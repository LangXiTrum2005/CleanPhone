package l2;

import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import f2.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f44937b;

    public /* synthetic */ t(v vVar, int i10, long j10) {
        this.f44936a = 3;
        this.f44937b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f44936a;
        v vVar = this.f44937b;
        switch (i10) {
            case 0:
                p1.v vVar2 = vVar.f44942b;
                String str = l1.y.f44830a;
                q1.f fVar = vVar2.f48170a.f47953s;
                fVar.I(fVar.H(), Z3.l, new ni.g(27));
                break;
            case 1:
                p1.v vVar3 = vVar.f44942b;
                String str2 = l1.y.f44830a;
                q1.f fVar2 = vVar3.f48170a.f47953s;
                fVar2.I(fVar2.H(), IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new ni.g(10));
                break;
            case 2:
                p1.v vVar4 = vVar.f44942b;
                String str3 = l1.y.f44830a;
                q1.f fVar3 = vVar4.f48170a.f47953s;
                fVar3.I(fVar3.H(), 1019, new ni.g(17));
                break;
            case 3:
                p1.v vVar5 = vVar.f44942b;
                String str4 = l1.y.f44830a;
                q1.f fVar4 = vVar5.f48170a.f47953s;
                fVar4.I(fVar4.E((c0) fVar4.f48532d.f23264e), 1018, new q1.d(3));
                break;
            case 4:
                p1.v vVar6 = vVar.f44942b;
                String str5 = l1.y.f44830a;
                q1.f fVar5 = vVar6.f48170a.f47953s;
                fVar5.I(fVar5.E((c0) fVar5.f48532d.f23264e), IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new q1.d(5));
                break;
            default:
                p1.v vVar7 = vVar.f44942b;
                String str6 = l1.y.f44830a;
                q1.f fVar6 = vVar7.f48170a.f47953s;
                fVar6.I(fVar6.H(), 1015, new q1.d(13));
                break;
        }
    }

    public /* synthetic */ t(v vVar, long j10, int i10) {
        this.f44936a = 4;
        this.f44937b = vVar;
    }

    public /* synthetic */ t(v vVar, Object obj, int i10) {
        this.f44936a = i10;
        this.f44937b = vVar;
    }

    public /* synthetic */ t(v vVar, String str, long j10, long j11) {
        this.f44936a = 0;
        this.f44937b = vVar;
    }
}
