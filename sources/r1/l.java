package r1;

import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l2.v f49322b;

    public /* synthetic */ l(l2.v vVar, int i10, long j10, long j11) {
        this.f49321a = 1;
        this.f49322b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f49321a;
        l2.v vVar = this.f49322b;
        switch (i10) {
            case 0:
                p1.v vVar2 = vVar.f44942b;
                String str = l1.y.f44830a;
                q1.f fVar = vVar2.f48170a.f47953s;
                fVar.I(fVar.H(), IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, new ni.g(9));
                break;
            case 1:
                p1.v vVar3 = vVar.f44942b;
                String str2 = l1.y.f44830a;
                q1.f fVar2 = vVar3.f48170a.f47953s;
                fVar2.I(fVar2.H(), 1011, new q1.d(19));
                break;
            case 2:
                p1.v vVar4 = vVar.f44942b;
                String str3 = l1.y.f44830a;
                q1.f fVar3 = vVar4.f48170a.f47953s;
                fVar3.I(fVar3.H(), 1010, new q1.d(20));
                break;
            case 3:
                p1.v vVar5 = vVar.f44942b;
                String str4 = l1.y.f44830a;
                q1.f fVar4 = vVar5.f48170a.f47953s;
                fVar4.I(fVar4.H(), IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new ni.g(25));
                break;
            case 4:
                p1.v vVar6 = vVar.f44942b;
                String str5 = l1.y.f44830a;
                q1.f fVar5 = vVar6.f48170a.f47953s;
                fVar5.I(fVar5.H(), 1008, new ni.g(15));
                break;
            case 5:
                p1.v vVar7 = vVar.f44942b;
                String str6 = l1.y.f44830a;
                q1.f fVar6 = vVar7.f48170a.f47953s;
                fVar6.I(fVar6.H(), 1012, new q1.d(22));
                break;
            case 6:
                p1.v vVar8 = vVar.f44942b;
                String str7 = l1.y.f44830a;
                q1.f fVar7 = vVar8.f48170a.f47953s;
                fVar7.I(fVar7.H(), 1007, new q1.d(1));
                break;
            case 7:
                p1.v vVar9 = vVar.f44942b;
                String str8 = l1.y.f44830a;
                q1.f fVar8 = vVar9.f48170a.f47953s;
                fVar8.I(fVar8.H(), IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, new q1.d(10));
                break;
            case 8:
                p1.v vVar10 = vVar.f44942b;
                String str9 = l1.y.f44830a;
                q1.f fVar9 = vVar10.f48170a.f47953s;
                fVar9.I(fVar9.H(), Z3.f28073j, new q1.d(17));
                break;
            default:
                p1.v vVar11 = vVar.f44942b;
                String str10 = l1.y.f44830a;
                q1.f fVar10 = vVar11.f48170a.f47953s;
                fVar10.I(fVar10.H(), 1009, new q1.d(12));
                break;
        }
    }

    public /* synthetic */ l(l2.v vVar, long j10) {
        this.f49321a = 2;
        this.f49322b = vVar;
    }

    public /* synthetic */ l(l2.v vVar, i1.p pVar, p1.c cVar) {
        this.f49321a = 9;
        this.f49322b = vVar;
    }

    public /* synthetic */ l(l2.v vVar, Object obj, int i10) {
        this.f49321a = i10;
        this.f49322b = vVar;
    }

    public /* synthetic */ l(l2.v vVar, String str, long j10, long j11) {
        this.f49321a = 4;
        this.f49322b = vVar;
    }
}
