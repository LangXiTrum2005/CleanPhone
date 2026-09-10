package kd;

import md.h;
import nd.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f44585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f44586c;

    public /* synthetic */ a(b bVar, h hVar, int i10) {
        this.f44584a = i10;
        this.f44585b = bVar;
        this.f44586c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44584a) {
            case 0:
                h hVar = this.f44586c;
                b bVar = this.f44585b;
                o oVarB = bVar.b(hVar);
                if (oVarB != null) {
                    bVar.f44589a.add(oVarB);
                }
                break;
            default:
                h hVar2 = this.f44586c;
                b bVar2 = this.f44585b;
                o oVarB2 = bVar2.b(hVar2);
                if (oVarB2 != null) {
                    bVar2.f44589a.add(oVarB2);
                }
                break;
        }
    }
}
