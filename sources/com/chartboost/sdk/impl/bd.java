package com.chartboost.sdk.impl;

import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bd {

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Call f13519b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Call call) {
            super(1);
            this.f13519b = call;
        }

        public final void a(Throwable th) {
            this.f13519b.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f43263a;
        }
    }

    public static final class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f13520a;

        public b(CancellableContinuation cancellableContinuation) {
            this.f13520a = cancellableContinuation;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e2) {
            Intrinsics.f(call, "call");
            Intrinsics.f(e2, "e");
            if (this.f13520a.isActive()) {
                this.f13520a.resumeWith(ResultKt.a(e2));
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.f(call, "call");
            Intrinsics.f(response, "response");
            if (this.f13520a.isActive()) {
                this.f13520a.resumeWith(response);
            } else {
                response.close();
            }
        }
    }

    public static final Object a(OkHttpClient okHttpClient, Request request, Continuation continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.q();
        Call callNewCall = okHttpClient.newCall(request);
        cancellableContinuationImpl.s(new a(callNewCall));
        callNewCall.enqueue(new b(cancellableContinuationImpl));
        Object objP = cancellableContinuationImpl.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        return objP;
    }
}
