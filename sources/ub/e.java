package ub;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f51959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f51960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb.c f51961d;

    public /* synthetic */ e(g gVar, Runnable runnable, rb.c cVar, int i10) {
        this.f51958a = i10;
        this.f51959b = gVar;
        this.f51960c = runnable;
        this.f51961d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f51958a) {
            case 0:
                ExecutorService executorService = this.f51959b.f51965a;
                final int i10 = 0;
                final Runnable runnable = this.f51960c;
                final rb.c cVar = this.f51961d;
                executorService.execute(new Runnable() { // from class: ub.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) cVar.f49529b).j(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) cVar.f49529b).j(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) cVar.f49529b;
                                try {
                                    runnable2.run();
                                    iVar.i(null);
                                    return;
                                } catch (Exception e12) {
                                    iVar.j(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f51959b.f51965a;
                final int i11 = 2;
                final Runnable runnable2 = this.f51960c;
                final rb.c cVar2 = this.f51961d;
                executorService2.execute(new Runnable() { // from class: ub.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) cVar2.f49529b).j(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) cVar2.f49529b).j(e11);
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                i iVar = (i) cVar2.f49529b;
                                try {
                                    runnable3.run();
                                    iVar.i(null);
                                    return;
                                } catch (Exception e12) {
                                    iVar.j(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f51959b.f51965a;
                final int i12 = 1;
                final Runnable runnable3 = this.f51960c;
                final rb.c cVar3 = this.f51961d;
                executorService3.execute(new Runnable() { // from class: ub.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) cVar3.f49529b).j(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) cVar3.f49529b).j(e11);
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                i iVar = (i) cVar3.f49529b;
                                try {
                                    runnable4.run();
                                    iVar.i(null);
                                    return;
                                } catch (Exception e12) {
                                    iVar.j(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
