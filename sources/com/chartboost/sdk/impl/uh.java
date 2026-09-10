package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class uh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final th f15311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f15313c;

    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15315c;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(qh qhVar, Continuation continuation) {
            return ((a) create(qhVar, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f15315c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objC;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f15314b;
            if (i2 == 0) {
                ResultKt.b(obj);
                qh qhVar = (qh) this.f15315c;
                this.f15314b = 1;
                objC = com.chartboost.sdk.internal.clickthrough.b.c(qhVar, null, null, null, null, this, 30, null);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objC = ((Result) obj).X;
            }
            return new Result(objC);
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15317c;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(qh qhVar, Continuation continuation) {
            return ((b) create(qhVar, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f15317c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f15316b;
            if (i2 == 0) {
                ResultKt.b(obj);
                qh qhVar = (qh) this.f15317c;
                this.f15316b = 1;
                objA = com.chartboost.sdk.internal.clickthrough.b.a(qhVar, null, null, null, null, null, this, 62, null);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objA = ((Result) obj).X;
            }
            return new Result(objA);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15319c;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(qh qhVar, Continuation continuation) {
            return ((c) create(qhVar, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(continuation);
            cVar.f15319c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f15318b;
            if (i2 == 0) {
                ResultKt.b(obj);
                qh qhVar = (qh) this.f15319c;
                this.f15318b = 1;
                objA = com.chartboost.sdk.internal.clickthrough.b.a(qhVar, null, null, null, null, this, 30, null);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objA = ((Result) obj).X;
            }
            return new Result(objA);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15321c;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(qh qhVar, Continuation continuation) {
            return ((d) create(qhVar, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(continuation);
            dVar.f15321c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f15320b;
            if (i2 == 0) {
                ResultKt.b(obj);
                qh qhVar = (qh) this.f15321c;
                this.f15320b = 1;
                objB = com.chartboost.sdk.internal.clickthrough.b.b(qhVar, null, null, null, null, this, 30, null);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objB = ((Result) obj).X;
            }
            return new Result(objB);
        }
    }

    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f15322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f15323c;
        public /* synthetic */ Object d;
        public int f;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object objA = uh.this.a((Function2) null, (qh) null, (g4) null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f15325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f15326c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f15327e;
        public /* synthetic */ Object f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f15328h;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.f15328h |= Integer.MIN_VALUE;
            return uh.this.a((qh) null, (g4) null, this);
        }
    }

    public static final class g extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15329b;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g4 f15331e;
        public final /* synthetic */ c4 f;
        public final /* synthetic */ boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, g4 g4Var, c4 c4Var, boolean z2, Continuation continuation) {
            super(2, continuation);
            this.d = str;
            this.f15331e = g4Var;
            this.f = c4Var;
            this.g = z2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return uh.this.new g(this.d, this.f15331e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f15329b;
            if (i2 == 0) {
                ResultKt.b(obj);
                uh uhVar = uh.this;
                Object objA = uhVar.a(th.a(uhVar.f15311a, this.d, 0, 2, null), this.d, this.f15331e);
                String strA = this.d;
                Throwable thA = Result.a(objA);
                if (thA == null) {
                    strA = (String) objA;
                } else if (thA instanceof th.b.e) {
                    strA = ((th.b.e) thA).a();
                }
                qh qhVar = new qh(strA, this.f, this.g);
                uh uhVar2 = uh.this;
                g4 g4Var = this.f15331e;
                this.f15329b = 1;
                if (uhVar2.a(qhVar, g4Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f43263a;
        }
    }

    public uh(th urlRedirect, List actions, CoroutineDispatcher ioDispatcher) {
        Intrinsics.f(urlRedirect, "urlRedirect");
        Intrinsics.f(actions, "actions");
        Intrinsics.f(ioDispatcher, "ioDispatcher");
        this.f15311a = urlRedirect;
        this.f15312b = actions;
        this.f15313c = ioDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Function2 function2, qh qhVar, g4 g4Var, Continuation continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.f = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objInvoke = eVar.d;
        Object obj = CoroutineSingletons.X;
        int i3 = eVar.f;
        if (i3 == 0) {
            ResultKt.b(objInvoke);
            eVar.f15322b = qhVar;
            eVar.f15323c = g4Var;
            eVar.f = 1;
            objInvoke = function2.invoke(qhVar, eVar);
            if (objInvoke == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g4Var = (g4) eVar.f15323c;
            qhVar = (qh) eVar.f15322b;
            ResultKt.b(objInvoke);
        }
        Object obj2 = ((Result) objInvoke).X;
        if (!(obj2 instanceof Result.Failure)) {
            ph phVar = (ph) obj2;
            g4Var.a("Url " + qhVar.b() + " opened with action " + phVar.a());
            za.a(android.support.v4.media.a.o("Url ", qhVar.b(), " opened with action ", phVar.a()), (Throwable) null, 2, (Object) null);
        }
        Throwable thA = Result.a(obj2);
        if (thA != null && !(thA instanceof com.chartboost.sdk.internal.clickthrough.a)) {
            g4Var.b("Url " + qhVar.b() + " opening failed with error " + thA);
            za.b("Url " + qhVar.b() + " opening failed with error " + thA, (Throwable) null, 2, (Object) null);
        }
        return obj2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public uh(th thVar, List list, CoroutineDispatcher coroutineDispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        list = (i2 & 2) != 0 ? CollectionsKt.I(new a(null), new b(null), new c(null), new d(null)) : list;
        if ((i2 & 4) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher = DefaultIoScheduler.f45062Y;
        }
        this(thVar, list, coroutineDispatcher);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x006c A[LOOP:0: B:15:0x005a->B:19:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0081 A[EDGE_INSN: B:23:0x0081->B:24:0x0085 BREAK  A[LOOP:0: B:15:0x005a->B:19:0x006c]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0081 -> B:24:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(com.chartboost.sdk.impl.qh r9, com.chartboost.sdk.impl.g4 r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.chartboost.sdk.impl.uh.f
            if (r0 == 0) goto L13
            r0 = r11
            com.chartboost.sdk.impl.uh$f r0 = (com.chartboost.sdk.impl.uh.f) r0
            int r1 = r0.f15328h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15328h = r1
            goto L18
        L13:
            com.chartboost.sdk.impl.uh$f r0 = new com.chartboost.sdk.impl.uh$f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r2 = r0.f15328h
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r9 = r0.f15327e
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r0.d
            com.chartboost.sdk.impl.g4 r10 = (com.chartboost.sdk.impl.g4) r10
            java.lang.Object r2 = r0.f15326c
            com.chartboost.sdk.impl.qh r2 = (com.chartboost.sdk.impl.qh) r2
            java.lang.Object r4 = r0.f15325b
            com.chartboost.sdk.impl.uh r4 = (com.chartboost.sdk.impl.uh) r4
            kotlin.ResultKt.b(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.X
            goto L85
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L43:
            kotlin.ResultKt.b(r11)
            java.util.List r11 = r8.f15312b
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            kotlin.Result$Failure r2 = kotlin.ResultKt.a(r2)
            java.util.Iterator r11 = r11.iterator()
            r4 = r10
            r10 = r9
            r9 = r11
            r11 = r4
            r4 = r8
        L5a:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L8a
            java.lang.Object r5 = r9.next()
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Throwable r6 = kotlin.Result.a(r2)
            if (r6 != 0) goto L70
            r5 = r2
            com.chartboost.sdk.impl.ph r5 = (com.chartboost.sdk.impl.ph) r5
            goto L5a
        L70:
            r0.f15325b = r4
            r0.f15326c = r10
            r0.d = r11
            r0.f15327e = r9
            r0.f15328h = r3
            java.lang.Object r2 = r4.a(r5, r10, r11, r0)
            if (r2 != r1) goto L81
            return r1
        L81:
            r7 = r2
            r2 = r10
            r10 = r11
            r11 = r7
        L85:
            r7 = r11
            r11 = r10
            r10 = r2
            r2 = r7
            goto L5a
        L8a:
            java.lang.Throwable r9 = kotlin.Result.a(r2)
            if (r9 == 0) goto Lba
            java.lang.String r9 = r10.b()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "None of the actions was able to process URL "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r11.b(r9)
            java.lang.String r9 = r10.b()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r1)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r10 = 2
            r11 = 0
            com.chartboost.sdk.impl.za.b(r9, r11, r10, r11)
        Lba:
            kotlin.Unit r9 = kotlin.Unit.f43263a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.uh.a(com.chartboost.sdk.impl.qh, com.chartboost.sdk.impl.g4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final CBError.Click a(String str, c4 clkp, g4 clickTracking, boolean z2) {
        Intrinsics.f(clkp, "clkp");
        Intrinsics.f(clickTracking, "clickTracking");
        za.a("Resolving url: " + str + ", clickPreference: " + clkp + ", userGesture: " + z2, (Throwable) null, 2, (Object) null);
        if (str != null && str.length() != 0) {
            BuildersKt.c(CoroutineScopeKt.a(this.f15313c), null, null, new g(str, clickTracking, clkp, z2, null), 3);
            return null;
        }
        CBError.Click click = CBError.Click.URI_INVALID;
        za.e("Url is null or empty.", null, 2, null);
        return click;
    }

    public final Object a(Object obj, String str, g4 g4Var) {
        Throwable thA = Result.a(obj);
        if (thA == null) {
            String str2 = (String) obj;
            g4Var.a("Redirection successful from " + str + " to " + str2);
            za.a(android.support.v4.media.a.o("Redirection successful from ", str, " to ", str2), (Throwable) null, 2, (Object) null);
            return obj;
        }
        g4Var.b("Redirection failed for " + str + ": " + thA);
        za.e("Redirection failed for " + str + ": " + thA, null, 2, null);
        return obj;
    }
}
