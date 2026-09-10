package com.p004ironsource;

import android.os.OutcomeReceiver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/Continuation;", "", "Landroid/os/OutcomeReceiver;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "a", "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
public final class r3 {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\t\u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0003j\u0002`\u0004H\u0016¨\u0006\n"}, d2 = {"com/ironsource/r3$a", "Landroid/os/OutcomeReceiver;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "result", "", "onResult", "error", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements OutcomeReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation<Unit> f26660a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Continuation<? super Unit> continuation) {
            this.f26660a = continuation;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            Intrinsics.f(error, "error");
            this.f26660a.resumeWith(ResultKt.a(error));
        }

        public void onResult(Object result) {
            this.f26660a.resumeWith(Unit.f43263a);
        }
    }

    public static final OutcomeReceiver a(Continuation<? super Unit> continuation) {
        Intrinsics.f(continuation, "<this>");
        return new a(continuation);
    }
}
