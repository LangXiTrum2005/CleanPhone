package com.chartboost.sdk.impl;

import com.smartdigimkt.sdk.basead.ui.BaseATView;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class di {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tc f13698a;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f13699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f13700c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13701e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13700c = obj;
            this.f13701e |= Integer.MIN_VALUE;
            Object objA = di.this.a(null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public di(tc networkClient) {
        Intrinsics.f(networkClient, "networkClient");
        this.f13698a = networkClient;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:26:0x0054, B:28:0x005c, B:30:0x0062, B:36:0x006d, B:37:0x007b, B:38:0x007c, B:39:0x0096), top: B:57:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0062 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:26:0x0054, B:28:0x005c, B:30:0x0062, B:36:0x006d, B:37:0x007b, B:38:0x007c, B:39:0x0096), top: B:57:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:26:0x0054, B:28:0x005c, B:30:0x0062, B:36:0x006d, B:37:0x007b, B:38:0x007c, B:39:0x0096), top: B:57:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:48:0x00a9, B:50:0x00bc, B:53:0x00c0, B:54:0x00e2), top: B:62:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c0 A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:48:0x00a9, B:50:0x00bc, B:53:0x00c0, B:54:0x00e2), top: B:62:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x007c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00c0, please report this as an issue */
    public final Object a(String str, Continuation continuation) {
        a aVar;
        Throwable th;
        Object objA;
        Throwable thA;
        xc xcVar;
        String strA;
        String str2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f13701e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f13701e = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object objA2 = aVar2.f13700c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = aVar2.f13701e;
        if (i3 == 0) {
            ResultKt.b(objA2);
            try {
                tc tcVar = this.f13698a;
                aVar2.f13699b = str;
                aVar2.f13701e = 1;
                try {
                    objA2 = tc.a.a(tcVar, str, null, aVar2, 2, null);
                    if (objA2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str;
                    xcVar = (xc) objA2;
                    if (xcVar.f()) {
                        throw new ci("Failed to fetch VAST. HTTP response code: " + xcVar.e(), new Integer(301));
                    }
                    strA = xcVar.a();
                    if (strA != null) {
                        if (strA.length() > 0) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            str2 = strA;
                            objA = str2;
                        }
                    }
                    str2 = strA;
                    throw new ci("Received empty VAST response.", new Integer(BaseATView.g.f38290N));
                } catch (Throwable th2) {
                    th = th2;
                    str = str;
                    objA = ResultKt.a(th);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                objA = ResultKt.a(th);
                thA = Result.a(objA);
                if (thA == null) {
                    return objA;
                }
                try {
                    za.b("Error fetching VAST from URL: " + str, thA);
                    if (thA instanceof ci) {
                        throw thA;
                    }
                    throw new ci("Error fetching VAST from URL: " + str + ". " + thA.getMessage(), new Integer(301));
                } catch (Throwable th4) {
                    return ResultKt.a(th4);
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar2.f13699b;
            try {
                ResultKt.b(objA2);
                xcVar = (xc) objA2;
                if (xcVar.f()) {
                    throw new ci("Failed to fetch VAST. HTTP response code: " + xcVar.e(), new Integer(301));
                }
                strA = xcVar.a();
                if (strA != null) {
                    if (strA.length() > 0) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str2 = strA;
                        objA = str2;
                    }
                }
                str2 = strA;
                throw new ci("Received empty VAST response.", new Integer(BaseATView.g.f38290N));
            } catch (Throwable th5) {
                th = th5;
                th = th;
                objA = ResultKt.a(th);
            }
        }
        thA = Result.a(objA);
        if (thA == null) {
            return objA;
        }
        za.b("Error fetching VAST from URL: " + str, thA);
        if (thA instanceof ci) {
            throw thA;
        }
        throw new ci("Error fetching VAST from URL: " + str + ". " + thA.getMessage(), new Integer(301));
    }
}
