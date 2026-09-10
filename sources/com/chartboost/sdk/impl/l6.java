package com.chartboost.sdk.impl;

import java.net.URL;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public interface l6 {

    public static final class a {

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.l6$a$a, reason: collision with other inner class name */
        public static final class C0170a extends ContinuationImpl {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f14408b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f14409c;

            public C0170a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f14408b = obj;
                this.f14409c |= Integer.MIN_VALUE;
                Object objA = a.a(null, null, this);
                return objA == CoroutineSingletons.X ? objA : new Result(objA);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static Object a(l6 l6Var, URL url, Continuation continuation) {
            C0170a c0170a;
            if (continuation instanceof C0170a) {
                c0170a = (C0170a) continuation;
                int i2 = c0170a.f14409c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0170a.f14409c = i2 - Integer.MIN_VALUE;
                } else {
                    c0170a = new C0170a(continuation);
                }
            } else {
                c0170a = new C0170a(continuation);
            }
            Object obj = c0170a.f14408b;
            Object obj2 = CoroutineSingletons.X;
            int i3 = c0170a.f14409c;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return ((Result) obj).X;
            }
            ResultKt.b(obj);
            c0170a.f14409c = 1;
            Object objA = l6Var.a(url, -1L, c0170a);
            return objA == obj2 ? obj2 : objA;
        }
    }

    Object a(URL url, long j, Continuation continuation);

    Object a(URL url, Continuation continuation);

    Flow a(URL url);
}
