package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f20268Y;
    public final /* synthetic */ Runnable Z;
    public final /* synthetic */ DelegatingScheduledFuture.AnonymousClass1 e0;

    public /* synthetic */ e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.AnonymousClass1 anonymousClass1, int i2) {
        this.X = i2;
        this.f20268Y = delegatingScheduledExecutorService;
        this.Z = runnable;
        this.e0 = anonymousClass1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f20268Y;
                final DelegatingScheduledFuture.AnonymousClass1 anonymousClass1 = this.e0;
                final Runnable runnable = this.Z;
                final int i2 = 0;
                delegatingScheduledExecutorService.X.execute(new Runnable() { // from class: com.google.firebase.concurrent.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    anonymousClass1.b(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e3) {
                                    anonymousClass1.b(e3);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                DelegatingScheduledFuture.AnonymousClass1 anonymousClass2 = anonymousClass1;
                                try {
                                    runnable2.run();
                                    anonymousClass2.a(null);
                                    return;
                                } catch (Exception e4) {
                                    anonymousClass2.b(e4);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                DelegatingScheduledExecutorService delegatingScheduledExecutorService2 = this.f20268Y;
                final DelegatingScheduledFuture.AnonymousClass1 anonymousClass2 = this.e0;
                final Runnable runnable2 = this.Z;
                final int i3 = 2;
                delegatingScheduledExecutorService2.X.execute(new Runnable() { // from class: com.google.firebase.concurrent.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    anonymousClass2.b(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e3) {
                                    anonymousClass2.b(e3);
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                DelegatingScheduledFuture.AnonymousClass1 anonymousClass3 = anonymousClass2;
                                try {
                                    runnable3.run();
                                    anonymousClass3.a(null);
                                    return;
                                } catch (Exception e4) {
                                    anonymousClass3.b(e4);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                DelegatingScheduledExecutorService delegatingScheduledExecutorService3 = this.f20268Y;
                final DelegatingScheduledFuture.AnonymousClass1 anonymousClass3 = this.e0;
                final Runnable runnable3 = this.Z;
                final int i4 = 1;
                delegatingScheduledExecutorService3.X.execute(new Runnable() { // from class: com.google.firebase.concurrent.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i4) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    anonymousClass3.b(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e3) {
                                    anonymousClass3.b(e3);
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                DelegatingScheduledFuture.AnonymousClass1 anonymousClass4 = anonymousClass3;
                                try {
                                    runnable4.run();
                                    anonymousClass4.a(null);
                                    return;
                                } catch (Exception e4) {
                                    anonymousClass4.b(e4);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
