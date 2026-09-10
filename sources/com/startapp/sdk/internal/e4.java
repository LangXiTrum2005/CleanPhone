package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class e4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f40924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lb f40925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f40926c;

    public e4(com.startapp.sdk.components.a aVar, Context context, lb lbVar) {
        this.f40926c = aVar;
        this.f40924a = context;
        this.f40925b = lbVar;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 2, 5L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new v5("info"));
        k9 k9Var = new k9(this.f40924a);
        m8 m8Var = (m8) this.f40925b.a();
        c4 c4Var = new c4(threadPoolExecutor);
        com.startapp.sdk.components.a aVar = this.f40926c;
        return new w9(k9Var, m8Var, threadPoolExecutor, c4Var, aVar.t, new aa(this.f40924a, aVar.f40741n, aVar.f40739i), new d4());
    }
}
