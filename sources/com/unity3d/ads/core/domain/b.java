package com.unity3d.ads.core.domain;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2757a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.f2757a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2757a;
        Object obj = this.b;
        switch (i) {
            case 0:
                LegacyLoadUseCase.C22092.invokeSuspend$lambda$0((LegacyLoadUseCase) obj);
                break;
            default:
                CommonInitAwaitingGetHeaderBiddingToken.tokenFailure$lambda$4((CommonInitAwaitingGetHeaderBiddingToken) obj);
                break;
        }
    }
}
