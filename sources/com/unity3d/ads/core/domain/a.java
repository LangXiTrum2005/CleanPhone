package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.LoadResult;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2756a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f2756a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2756a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                LegacyLoadUseCase.AnonymousClass2.invokeSuspend$lambda$0((LegacyLoadUseCase) obj2, (LoadResult.Failure) obj);
                break;
            default:
                CommonInitAwaitingGetHeaderBiddingToken.tokenSuccess$lambda$0((CommonInitAwaitingGetHeaderBiddingToken) obj2, (String) obj);
                break;
        }
    }
}
