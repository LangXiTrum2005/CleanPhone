package com.chartboost.sdk.impl;

import com.thinkup.core.common.n.mo;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes3.dex */
public final class o5 implements l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f14695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3 f14696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c8 f14697c;
    public final n3 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m3 f14698e;
    public final CoroutineDispatcher f;
    public final Function0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Function0 f14700i;
    public final ConcurrentHashMap j;
    public final AtomicLong k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f14701l;
    public final Mutex m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f14702n;

    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14703b;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o5.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f14703b;
            if (i2 == 0) {
                ResultKt.b(obj);
                o5 o5Var = o5.this;
                this.f14703b = 1;
                if (o5Var.a(this) == coroutineSingletons) {
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

    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14710c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14711e;
        public int g;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14711e = obj;
            this.g |= Integer.MIN_VALUE;
            Object objA = o5.this.a((URL) null, (Deferred) null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14713c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f14714e;
        public /* synthetic */ Object f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f14715h;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f = obj;
            this.f14715h |= Integer.MIN_VALUE;
            Object objA = o5.this.a((URL) null, 0L, (Pair) null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14717c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f14718e;
        public Object f;
        public Object g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f14719h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Object f14720i;
        public Object j;
        public long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f14721l;
        public long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f14722n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f14723p;
        public int r;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f14723p = obj;
            this.r |= Integer.MIN_VALUE;
            Object objA = o5.this.a((URL) null, 0L, (b) null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class f extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f14725c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(File file, Continuation continuation) {
            super(2, continuation);
            this.f14725c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.f14725c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f14724b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Boolean.valueOf(this.f14725c.delete());
        }
    }

    public static final class g extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f14727c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(File file, Continuation continuation) {
            super(2, continuation);
            this.f14727c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.f14727c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f14726b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Boolean.valueOf(this.f14727c.delete());
        }
    }

    public static final class h extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f14729c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(File file, Continuation continuation) {
            super(2, continuation);
            this.f14729c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.f14729c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f14728b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Boolean.valueOf(this.f14729c.delete());
        }
    }

    public static final class i extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f14731c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(File file, Continuation continuation) {
            super(2, continuation);
            this.f14731c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new i(this.f14731c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f14730b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Boolean.valueOf(this.f14731c.delete());
        }
    }

    public static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f14733c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(File file, Continuation continuation) {
            super(2, continuation);
            this.f14733c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f14733c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f14732b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Boolean.valueOf(this.f14733c.delete());
        }
    }

    public static final class k extends Lambda implements Function0 {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(o5.this.k.get());
        }
    }

    public static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14736c;
        public /* synthetic */ Object d;
        public int f;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return o5.this.a(this);
        }
    }

    public static final class m extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14739c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f14740e;
        public Object f;
        public long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f14741h;
        public int j;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f14741h = obj;
            this.j |= Integer.MIN_VALUE;
            Object objA = o5.this.a((URL) null, 0L, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14743b;
        public final /* synthetic */ URL d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f14745e;
        public final /* synthetic */ b f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(URL url, long j, b bVar, Continuation continuation) {
            super(2, continuation);
            this.d = url;
            this.f14745e = j;
            this.f = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o5.this.new n(this.d, this.f14745e, this.f, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            if (r10 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
                int r1 = r9.f14743b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.ResultKt.b(r10)
                kotlin.Result r10 = (kotlin.Result) r10
                java.lang.Object r10 = r10.X
                goto L40
            L14:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1c:
                kotlin.ResultKt.b(r10)
                goto L2e
            L20:
                kotlin.ResultKt.b(r10)
                com.chartboost.sdk.impl.o5 r10 = com.chartboost.sdk.impl.o5.this
                r9.f14743b = r3
                java.lang.Object r10 = com.chartboost.sdk.impl.o5.a(r10, r9)
                if (r10 != r0) goto L2e
                goto L3f
            L2e:
                com.chartboost.sdk.impl.o5 r3 = com.chartboost.sdk.impl.o5.this
                java.net.URL r4 = r9.d
                long r5 = r9.f14745e
                com.chartboost.sdk.impl.o5$b r7 = r9.f
                r9.f14743b = r2
                r8 = r9
                java.lang.Object r10 = com.chartboost.sdk.impl.o5.a(r3, r4, r5, r7, r8)
                if (r10 != r0) goto L40
            L3f:
                return r0
            L40:
                kotlin.Result r0 = new kotlin.Result
                r0.<init>(r10)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.o5.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class o extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14747c;
        public /* synthetic */ Object d;
        public int f;

        public o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object objA = o5.this.a(null, null, 0L, 0L, null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class p extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14750c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14751e;

        public p(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f14750c = obj;
            this.f14751e |= Integer.MIN_VALUE;
            Object objB = o5.this.b(null, 0L, this);
            return objB == CoroutineSingletons.X ? objB : new Result(objB);
        }
    }

    public o5(CoroutineScope cacheScope, o3 storage, c8 downloader, n3 policyManager, m3 notifier, CoroutineDispatcher ioDispatcher, Function0 cacheSizeBytesProvider, long j2, Function0 ttlMillisProvider) {
        Intrinsics.f(cacheScope, "cacheScope");
        Intrinsics.f(storage, "storage");
        Intrinsics.f(downloader, "downloader");
        Intrinsics.f(policyManager, "policyManager");
        Intrinsics.f(notifier, "notifier");
        Intrinsics.f(ioDispatcher, "ioDispatcher");
        Intrinsics.f(cacheSizeBytesProvider, "cacheSizeBytesProvider");
        Intrinsics.f(ttlMillisProvider, "ttlMillisProvider");
        this.f14695a = cacheScope;
        this.f14696b = storage;
        this.f14697c = downloader;
        this.d = policyManager;
        this.f14698e = notifier;
        this.f = ioDispatcher;
        this.g = cacheSizeBytesProvider;
        this.f14699h = j2;
        this.f14700i = ttlMillisProvider;
        this.j = new ConcurrentHashMap();
        this.k = new AtomicLong(0L);
        this.f14701l = new AtomicBoolean(false);
        this.m = MutexKt.a();
        this.f14702n = new ConcurrentHashMap();
        BuildersKt.c(cacheScope, ioDispatcher, null, new a(null), 2);
    }

    public final Pair b(URL url, long j2) {
        Object next;
        Pair pair;
        Object next2;
        String string = url.toString();
        Intrinsics.e(string, "toString(...)");
        ConcurrentHashMap concurrentHashMap = this.j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            String str = (String) entry.getKey();
            if (Intrinsics.a(str, string) || StringsKt.M(str, string.concat("_"), false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            za.a("Found " + linkedHashMap.size() + " related ongoing downloads for " + string, (Throwable) null, 2, (Object) null);
            if (j2 == -1) {
                Deferred deferred = (Deferred) linkedHashMap.get(string);
                if (deferred != null) {
                    za.a("Found ongoing complete download for complete file request", (Throwable) null, 2, (Object) null);
                    return new Pair(string, deferred);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (!Intrinsics.a((String) entry2.getKey(), string)) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    next2 = it.next();
                    if (it.hasNext()) {
                        Long lA = a((String) ((Map.Entry) next2).getKey());
                        long jLongValue = lA != null ? lA.longValue() : 0L;
                        do {
                            Object next3 = it.next();
                            Long lA2 = a((String) ((Map.Entry) next3).getKey());
                            long jLongValue2 = lA2 != null ? lA2.longValue() : 0L;
                            if (jLongValue < jLongValue2) {
                                next2 = next3;
                                jLongValue = jLongValue2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next2 = null;
                }
                Map.Entry entry3 = (Map.Entry) next2;
                if (entry3 != null) {
                    Long lA3 = a((String) entry3.getKey());
                    za.a(androidx.media3.extractor.text.ttml.a.j(lA3 != null ? lA3.longValue() : 0L, "Found ongoing partial download of ", " bytes for complete file request"), (Throwable) null, 2, (Object) null);
                    return new Pair(entry3.getKey(), entry3.getValue());
                }
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                    String str2 = (String) entry4.getKey();
                    if (!Intrinsics.a(str2, string)) {
                        Long lA4 = a(str2);
                        if ((lA4 != null ? lA4.longValue() : 0L) >= j2) {
                        }
                    }
                    linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                }
                Deferred deferred2 = (Deferred) linkedHashMap3.get(string);
                if (deferred2 != null) {
                    pair = new Pair(string, deferred2);
                } else {
                    Iterator it2 = linkedHashMap3.entrySet().iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            Long lA5 = a((String) ((Map.Entry) next).getKey());
                            long jLongValue3 = lA5 != null ? lA5.longValue() : Long.MAX_VALUE;
                            do {
                                Object next4 = it2.next();
                                Long lA6 = a((String) ((Map.Entry) next4).getKey());
                                long jLongValue4 = lA6 != null ? lA6.longValue() : Long.MAX_VALUE;
                                if (jLongValue3 > jLongValue4) {
                                    next = next4;
                                    jLongValue3 = jLongValue4;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    Map.Entry entry5 = (Map.Entry) next;
                    pair = entry5 != null ? new Pair(entry5.getKey(), entry5.getValue()) : null;
                }
                if (pair != null) {
                    Long lA7 = a((String) pair.X);
                    za.a("Found ongoing " + (lA7 == null ? "complete" : lA7 + " bytes") + " download that can satisfy " + j2 + " byte request", (Throwable) null, 2, (Object) null);
                    return pair;
                }
            }
        }
        return null;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f14705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f14706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f14707c;
        public final File d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f14708e;
        public final boolean f;

        public b(long j, long j2, long j3, File file, long j4, boolean z2) {
            Intrinsics.f(file, "file");
            this.f14705a = j;
            this.f14706b = j2;
            this.f14707c = j3;
            this.d = file;
            this.f14708e = j4;
            this.f = z2;
        }

        public final boolean a(long j) {
            if (j == -1) {
                return !this.f;
            }
            return this.f14707c < j;
        }

        public final boolean b(long j) {
            if (j == -1) {
                return this.f;
            }
            return this.f14707c >= j;
        }

        public final boolean c() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f14705a == bVar.f14705a && this.f14706b == bVar.f14706b && this.f14707c == bVar.f14707c && Intrinsics.a(this.d, bVar.d) && this.f14708e == bVar.f14708e && this.f == bVar.f;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f) + androidx.media3.extractor.text.ttml.a.b((this.d.hashCode() + androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.b(Long.hashCode(this.f14705a) * 31, 31, this.f14706b), 31, this.f14707c)) * 31, 31, this.f14708e);
        }

        public String toString() {
            long j = this.f14705a;
            long j2 = this.f14706b;
            long j3 = this.f14707c;
            File file = this.d;
            long j4 = this.f14708e;
            boolean z2 = this.f;
            StringBuilder sbV = android.support.v4.media.a.v(j, "DownloadInfo(startByte=", ", endByte=");
            sbV.append(j2);
            androidx.datastore.preferences.protobuf.a.A(sbV, ", actualBytes=", j3, ", file=");
            sbV.append(file);
            sbV.append(", timestamp=");
            sbV.append(j4);
            sbV.append(", isComplete=");
            sbV.append(z2);
            sbV.append(")");
            return sbV.toString();
        }

        public final long a() {
            return this.f14707c;
        }

        public final File b() {
            return this.d;
        }

        public /* synthetic */ b(long j, long j2, long j3, File file, long j4, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, file, (i2 & 16) != 0 ? System.currentTimeMillis() : j4, (i2 & 32) != 0 ? false : z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(URL url, Deferred deferred, Continuation continuation) {
        c cVar;
        URL url2;
        Exception e2;
        CancellationException e3;
        o5 o5Var;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.g = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objR = cVar.f14711e;
        Object obj = CoroutineSingletons.X;
        int i3 = cVar.g;
        try {
            if (i3 == 0) {
                ResultKt.b(objR);
                cVar.f14709b = this;
                cVar.f14710c = url;
                cVar.g = 1;
                objR = deferred.r(cVar);
                if (objR != obj) {
                    o5Var = this;
                }
                return obj;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = cVar.f14710c;
                url2 = (URL) cVar.f14709b;
                try {
                    ResultKt.b(objR);
                    return obj2;
                } catch (CancellationException e4) {
                    e3 = e4;
                    za.e("Awaited download for " + url2 + " was cancelled.", e3);
                    return ResultKt.a(e3);
                } catch (Exception e5) {
                    e2 = e5;
                    za.e("Awaited download for " + url2 + " failed.", e2);
                    return ResultKt.a(e2);
                }
            }
            url = (URL) cVar.f14710c;
            o5Var = (o5) cVar.f14709b;
            ResultKt.b(objR);
            Object obj3 = ((Result) objR).X;
            if (!(obj3 instanceof Result.Failure)) {
                o3 o3Var = o5Var.f14696b;
                cVar.f14709b = url;
                cVar.f14710c = obj3;
                cVar.d = obj3;
                cVar.g = 2;
                if (o3Var.a((File) obj3, cVar) == obj) {
                    return obj;
                }
            }
            return obj3;
        } catch (CancellationException e6) {
            url2 = url;
            e3 = e6;
        } catch (Exception e7) {
            url2 = url;
            e2 = e7;
        }
    }

    public final Long a(String str) {
        if (StringsKt.l(str, "_", false)) {
            return StringsKt.Z(StringsKt.R(str, "_"));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    /* JADX WARN: Code duplicated, block: B:53:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0111  */
    /* JADX WARN: Code duplicated, block: B:58:0x0146 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0147  */
    /* JADX WARN: Code duplicated, block: B:61:0x014b  */
    /* JADX WARN: Code duplicated, block: B:64:0x016b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x016c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0186  */
    /* JADX WARN: Code duplicated, block: B:72:0x019f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.String] */
    public final Object a(URL url, long j2, Pair pair, Continuation continuation) throws Throwable {
        d dVar;
        String str;
        o5 o5Var;
        URL url2;
        Object obj;
        boolean z2;
        File file;
        Long lA;
        Object objB;
        Object objB2;
        String strJ;
        o3 o3Var;
        Object objB3;
        Object objB4;
        long j3 = j2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.f14715h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.f14715h = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj2 = dVar.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        String str2 = dVar.f14715h;
        try {
            switch (str2) {
                case 0:
                    ResultKt.b(obj2);
                    String str3 = (String) pair.X;
                    Deferred deferred = (Deferred) pair.f43249Y;
                    if (j3 == -1) {
                        str = "complete file";
                    } else {
                        str = j3 + " bytes";
                    }
                    za.a(android.support.v4.media.a.o("Awaiting ongoing download: ", str3, " for original request of ", str), (Throwable) null, 2, (Object) null);
                    dVar.f14712b = this;
                    dVar.f14713c = url;
                    dVar.d = str3;
                    dVar.f14714e = j3;
                    dVar.f14715h = 1;
                    Object objR = deferred.r(dVar);
                    if (objR != coroutineSingletons) {
                        o5Var = this;
                        url2 = url;
                        obj2 = objR;
                        str2 = str3;
                        obj = ((Result) obj2).X;
                        z2 = obj instanceof Result.Failure;
                        if (z2) {
                            za.e(android.support.v4.media.a.n("Ongoing download ", str2, " failed, starting new download"), null, 2, null);
                            dVar.f14712b = null;
                            dVar.f14713c = null;
                            dVar.d = null;
                            dVar.f14715h = 2;
                            objB4 = o5Var.b(url2, j3, dVar);
                            if (objB4 == coroutineSingletons) {
                                return objB4;
                            }
                        } else {
                            if (z2) {
                                obj = null;
                            }
                            file = (File) obj;
                            if (file == null) {
                                za.e(android.support.v4.media.a.n("Ongoing download ", str2, " returned null file"), null, 2, null);
                                dVar.f14712b = null;
                                dVar.f14713c = null;
                                dVar.d = null;
                                dVar.f14715h = 3;
                                objB3 = o5Var.b(url2, j3, dVar);
                                if (objB3 == coroutineSingletons) {
                                    return objB3;
                                }
                            } else {
                                lA = o5Var.a((String) str2);
                                if (o5Var.a(j3, file)) {
                                    if (j3 == -1) {
                                        strJ = "complete file request";
                                    } else {
                                        strJ = androidx.media3.extractor.text.ttml.a.j(j3, "partial request (", " bytes)");
                                    }
                                    za.a("Ongoing download (" + file.length() + " bytes) satisfies " + strJ, (Throwable) null, 2, (Object) null);
                                    o3Var = o5Var.f14696b;
                                    dVar.f14712b = file;
                                    dVar.f14713c = null;
                                    dVar.d = null;
                                    dVar.f14715h = 4;
                                    if (o3Var.a(file, dVar) == coroutineSingletons) {
                                        return file;
                                    }
                                } else if (j3 == -1) {
                                    za.a("Ongoing partial download completed, but we need complete file - starting resume download", (Throwable) null, 2, (Object) null);
                                    o5Var.a(url2, file, file.length(), false);
                                    dVar.f14712b = null;
                                    dVar.f14713c = null;
                                    dVar.d = null;
                                    dVar.f14715h = 5;
                                    objB2 = o5Var.b(url2, j3, dVar);
                                    if (objB2 == coroutineSingletons) {
                                        return objB2;
                                    }
                                } else {
                                    za.a(android.support.v4.media.a.j(j3, " bytes) - starting larger download", android.support.v4.media.a.v(file.length(), "Ongoing download (", " bytes) insufficient for request (")), (Throwable) null, 2, (Object) null);
                                    o5Var.a(url2, file, file.length(), lA == null);
                                    dVar.f14712b = null;
                                    dVar.f14713c = null;
                                    dVar.d = null;
                                    dVar.f14715h = 6;
                                    objB = o5Var.b(url2, j3, dVar);
                                    if (objB == coroutineSingletons) {
                                        return objB;
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                case 1:
                    j3 = dVar.f14714e;
                    String str4 = (String) dVar.d;
                    URL url3 = (URL) dVar.f14713c;
                    o5 o5Var2 = (o5) dVar.f14712b;
                    ResultKt.b(obj2);
                    url2 = url3;
                    str2 = str4;
                    o5Var = o5Var2;
                    obj = ((Result) obj2).X;
                    z2 = obj instanceof Result.Failure;
                    if (z2) {
                        za.e(android.support.v4.media.a.n("Ongoing download ", str2, " failed, starting new download"), null, 2, null);
                        dVar.f14712b = null;
                        dVar.f14713c = null;
                        dVar.d = null;
                        dVar.f14715h = 2;
                        objB4 = o5Var.b(url2, j3, dVar);
                        if (objB4 == coroutineSingletons) {
                            return objB4;
                        }
                    } else {
                        if (z2) {
                            obj = null;
                        }
                        file = (File) obj;
                        if (file == null) {
                            za.e(android.support.v4.media.a.n("Ongoing download ", str2, " returned null file"), null, 2, null);
                            dVar.f14712b = null;
                            dVar.f14713c = null;
                            dVar.d = null;
                            dVar.f14715h = 3;
                            objB3 = o5Var.b(url2, j3, dVar);
                            if (objB3 == coroutineSingletons) {
                                return objB3;
                            }
                        } else {
                            lA = o5Var.a((String) str2);
                            if (o5Var.a(j3, file)) {
                                if (j3 == -1) {
                                    strJ = "complete file request";
                                } else {
                                    strJ = androidx.media3.extractor.text.ttml.a.j(j3, "partial request (", " bytes)");
                                }
                                za.a("Ongoing download (" + file.length() + " bytes) satisfies " + strJ, (Throwable) null, 2, (Object) null);
                                o3Var = o5Var.f14696b;
                                dVar.f14712b = file;
                                dVar.f14713c = null;
                                dVar.d = null;
                                dVar.f14715h = 4;
                                if (o3Var.a(file, dVar) == coroutineSingletons) {
                                    return file;
                                }
                            } else if (j3 == -1) {
                                za.a("Ongoing partial download completed, but we need complete file - starting resume download", (Throwable) null, 2, (Object) null);
                                o5Var.a(url2, file, file.length(), false);
                                dVar.f14712b = null;
                                dVar.f14713c = null;
                                dVar.d = null;
                                dVar.f14715h = 5;
                                objB2 = o5Var.b(url2, j3, dVar);
                                if (objB2 == coroutineSingletons) {
                                    return objB2;
                                }
                            } else {
                                za.a(android.support.v4.media.a.j(j3, " bytes) - starting larger download", android.support.v4.media.a.v(file.length(), "Ongoing download (", " bytes) insufficient for request (")), (Throwable) null, 2, (Object) null);
                                o5Var.a(url2, file, file.length(), lA == null);
                                dVar.f14712b = null;
                                dVar.f14713c = null;
                                dVar.d = null;
                                dVar.f14715h = 6;
                                objB = o5Var.b(url2, j3, dVar);
                                if (objB == coroutineSingletons) {
                                    return objB;
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                case 2:
                    ResultKt.b(obj2);
                    return ((Result) obj2).X;
                case 3:
                    ResultKt.b(obj2);
                    return ((Result) obj2).X;
                case 4:
                    File file2 = (File) dVar.f14712b;
                    ResultKt.b(obj2);
                    return file2;
                case 5:
                    ResultKt.b(obj2);
                    return ((Result) obj2).X;
                case 6:
                    ResultKt.b(obj2);
                    return ((Result) obj2).X;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CancellationException e2) {
            za.e("Ongoing download " + str2 + " was cancelled.", e2);
            return ResultKt.a(e2);
        } catch (Exception e3) {
            za.b("Ongoing download " + str2 + " failed.", e3);
            return ResultKt.a(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(URL url, long j2, Continuation continuation) throws Throwable {
        p pVar;
        String str;
        Exception exc;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i2 = pVar.f14751e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.f14751e = i2 - Integer.MIN_VALUE;
            } else {
                pVar = new p(continuation);
            }
        } else {
            pVar = new p(continuation);
        }
        p pVar2 = pVar;
        Object obj = pVar2.f14750c;
        Object obj2 = CoroutineSingletons.X;
        int i3 = pVar2.f14751e;
        if (i3 == 0) {
            ResultKt.b(obj);
            if (j2 == -1) {
                str = "complete file";
            } else {
                str = j2 + " bytes";
            }
            za.a("Starting new download for " + str, (Throwable) null, 2, (Object) null);
            b bVarA = a(url, j2);
            try {
                pVar2.f14749b = url;
                pVar2.f14751e = 1;
                try {
                    Object objA = a(url, j2, bVarA, pVar2);
                    return objA == obj2 ? obj2 : objA;
                } catch (Exception e2) {
                    exc = e2;
                    url = url;
                }
            } catch (Exception e3) {
                e = e3;
                exc = e;
            }
        } else if (i3 == 1) {
            url = (URL) pVar2.f14749b;
            try {
                ResultKt.b(obj);
                return ((Result) obj).X;
            } catch (Exception e4) {
                e = e4;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        exc = e;
        za.b("New download failed for " + url, exc);
        return ResultKt.a(exc);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x047e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0480  */
    /* JADX WARN: Code duplicated, block: B:104:0x0490 A[Catch: all -> 0x05db, TryCatch #22 {all -> 0x05db, blocks: (B:153:0x0603, B:142:0x05c8, B:146:0x05d4, B:149:0x05de, B:102:0x048a, B:104:0x0490, B:106:0x0496, B:109:0x04a0, B:120:0x0518, B:122:0x051e, B:126:0x052a, B:131:0x053b, B:129:0x0533, B:136:0x056e, B:138:0x0576, B:119:0x04e3, B:111:0x04aa, B:85:0x03f9, B:90:0x041d, B:92:0x0423, B:98:0x0459, B:88:0x0407), top: B:400:0x03f9 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:118:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:119:0x04e3 A[Catch: all -> 0x05db, TryCatch #22 {all -> 0x05db, blocks: (B:153:0x0603, B:142:0x05c8, B:146:0x05d4, B:149:0x05de, B:102:0x048a, B:104:0x0490, B:106:0x0496, B:109:0x04a0, B:120:0x0518, B:122:0x051e, B:126:0x052a, B:131:0x053b, B:129:0x0533, B:136:0x056e, B:138:0x0576, B:119:0x04e3, B:111:0x04aa, B:85:0x03f9, B:90:0x041d, B:92:0x0423, B:98:0x0459, B:88:0x0407), top: B:400:0x03f9 }] */
    /* JADX WARN: Code duplicated, block: B:11:0x008d  */
    /* JADX WARN: Code duplicated, block: B:122:0x051e A[Catch: all -> 0x05db, TryCatch #22 {all -> 0x05db, blocks: (B:153:0x0603, B:142:0x05c8, B:146:0x05d4, B:149:0x05de, B:102:0x048a, B:104:0x0490, B:106:0x0496, B:109:0x04a0, B:120:0x0518, B:122:0x051e, B:126:0x052a, B:131:0x053b, B:129:0x0533, B:136:0x056e, B:138:0x0576, B:119:0x04e3, B:111:0x04aa, B:85:0x03f9, B:90:0x041d, B:92:0x0423, B:98:0x0459, B:88:0x0407), top: B:400:0x03f9 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x056a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x056c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:13:0x0095  */
    /* JADX WARN: Code duplicated, block: B:144:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:146:0x05d4 A[Catch: all -> 0x05db, TryCatch #22 {all -> 0x05db, blocks: (B:153:0x0603, B:142:0x05c8, B:146:0x05d4, B:149:0x05de, B:102:0x048a, B:104:0x0490, B:106:0x0496, B:109:0x04a0, B:120:0x0518, B:122:0x051e, B:126:0x052a, B:131:0x053b, B:129:0x0533, B:136:0x056e, B:138:0x0576, B:119:0x04e3, B:111:0x04aa, B:85:0x03f9, B:90:0x041d, B:92:0x0423, B:98:0x0459, B:88:0x0407), top: B:400:0x03f9 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:152:0x0601  */
    /* JADX WARN: Code duplicated, block: B:155:0x0635  */
    /* JADX WARN: Code duplicated, block: B:159:0x0669 A[Catch: all -> 0x0b8f, TryCatch #17 {all -> 0x0b8f, blocks: (B:14:0x00b1, B:17:0x00c6, B:330:0x0c92, B:25:0x010f, B:314:0x0bdd, B:303:0x0b55, B:305:0x0b61, B:309:0x0b98, B:311:0x0ba4, B:33:0x0161, B:287:0x0a82, B:36:0x0171, B:352:0x0dd4, B:39:0x0183, B:267:0x0a02, B:268:0x0a13, B:260:0x09ba, B:262:0x09be, B:269:0x0a19, B:272:0x0a1e, B:274:0x0a22, B:278:0x0a2e, B:284:0x0a45, B:295:0x0ab2, B:297:0x0ade, B:299:0x0aeb, B:281:0x0a3b, B:349:0x0d9d, B:208:0x0863, B:207:0x084e, B:157:0x065f, B:159:0x0669, B:160:0x06a7, B:162:0x06af, B:165:0x06b7, B:167:0x06e7, B:169:0x06ed, B:170:0x070c, B:175:0x0757, B:173:0x072b, B:174:0x074a, B:354:0x0def, B:66:0x0309, B:69:0x0317, B:77:0x0375, B:96:0x0453), top: B:393:0x008a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x06a7 A[Catch: all -> 0x0b8f, TryCatch #17 {all -> 0x0b8f, blocks: (B:14:0x00b1, B:17:0x00c6, B:330:0x0c92, B:25:0x010f, B:314:0x0bdd, B:303:0x0b55, B:305:0x0b61, B:309:0x0b98, B:311:0x0ba4, B:33:0x0161, B:287:0x0a82, B:36:0x0171, B:352:0x0dd4, B:39:0x0183, B:267:0x0a02, B:268:0x0a13, B:260:0x09ba, B:262:0x09be, B:269:0x0a19, B:272:0x0a1e, B:274:0x0a22, B:278:0x0a2e, B:284:0x0a45, B:295:0x0ab2, B:297:0x0ade, B:299:0x0aeb, B:281:0x0a3b, B:349:0x0d9d, B:208:0x0863, B:207:0x084e, B:157:0x065f, B:159:0x0669, B:160:0x06a7, B:162:0x06af, B:165:0x06b7, B:167:0x06e7, B:169:0x06ed, B:170:0x070c, B:175:0x0757, B:173:0x072b, B:174:0x074a, B:354:0x0def, B:66:0x0309, B:69:0x0317, B:77:0x0375, B:96:0x0453), top: B:393:0x008a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x06af A[Catch: all -> 0x0b8f, TryCatch #17 {all -> 0x0b8f, blocks: (B:14:0x00b1, B:17:0x00c6, B:330:0x0c92, B:25:0x010f, B:314:0x0bdd, B:303:0x0b55, B:305:0x0b61, B:309:0x0b98, B:311:0x0ba4, B:33:0x0161, B:287:0x0a82, B:36:0x0171, B:352:0x0dd4, B:39:0x0183, B:267:0x0a02, B:268:0x0a13, B:260:0x09ba, B:262:0x09be, B:269:0x0a19, B:272:0x0a1e, B:274:0x0a22, B:278:0x0a2e, B:284:0x0a45, B:295:0x0ab2, B:297:0x0ade, B:299:0x0aeb, B:281:0x0a3b, B:349:0x0d9d, B:208:0x0863, B:207:0x084e, B:157:0x065f, B:159:0x0669, B:160:0x06a7, B:162:0x06af, B:165:0x06b7, B:167:0x06e7, B:169:0x06ed, B:170:0x070c, B:175:0x0757, B:173:0x072b, B:174:0x074a, B:354:0x0def, B:66:0x0309, B:69:0x0317, B:77:0x0375, B:96:0x0453), top: B:393:0x008a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:19:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:210:0x0869  */
    /* JADX WARN: Code duplicated, block: B:217:0x0898 A[Catch: all -> 0x08be, TRY_LEAVE, TryCatch #9 {all -> 0x08be, blocks: (B:211:0x0874, B:215:0x0880, B:217:0x0898, B:221:0x08ba), top: B:377:0x0874 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0106  */
    /* JADX WARN: Code duplicated, block: B:250:0x0970  */
    /* JADX WARN: Code duplicated, block: B:262:0x09be A[Catch: all -> 0x0b8f, TryCatch #17 {all -> 0x0b8f, blocks: (B:14:0x00b1, B:17:0x00c6, B:330:0x0c92, B:25:0x010f, B:314:0x0bdd, B:303:0x0b55, B:305:0x0b61, B:309:0x0b98, B:311:0x0ba4, B:33:0x0161, B:287:0x0a82, B:36:0x0171, B:352:0x0dd4, B:39:0x0183, B:267:0x0a02, B:268:0x0a13, B:260:0x09ba, B:262:0x09be, B:269:0x0a19, B:272:0x0a1e, B:274:0x0a22, B:278:0x0a2e, B:284:0x0a45, B:295:0x0ab2, B:297:0x0ade, B:299:0x0aeb, B:281:0x0a3b, B:349:0x0d9d, B:208:0x0863, B:207:0x084e, B:157:0x065f, B:159:0x0669, B:160:0x06a7, B:162:0x06af, B:165:0x06b7, B:167:0x06e7, B:169:0x06ed, B:170:0x070c, B:175:0x0757, B:173:0x072b, B:174:0x074a, B:354:0x0def, B:66:0x0309, B:69:0x0317, B:77:0x0375, B:96:0x0453), top: B:393:0x008a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:264:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:265:0x09fe  */
    /* JADX WARN: Code duplicated, block: B:267:0x0a02 A[Catch: all -> 0x0b8f, TryCatch #17 {all -> 0x0b8f, blocks: (B:14:0x00b1, B:17:0x00c6, B:330:0x0c92, B:25:0x010f, B:314:0x0bdd, B:303:0x0b55, B:305:0x0b61, B:309:0x0b98, B:311:0x0ba4, B:33:0x0161, B:287:0x0a82, B:36:0x0171, B:352:0x0dd4, B:39:0x0183, B:267:0x0a02, B:268:0x0a13, B:260:0x09ba, B:262:0x09be, B:269:0x0a19, B:272:0x0a1e, B:274:0x0a22, B:278:0x0a2e, B:284:0x0a45, B:295:0x0ab2, B:297:0x0ade, B:299:0x0aeb, B:281:0x0a3b, B:349:0x0d9d, B:208:0x0863, B:207:0x084e, B:157:0x065f, B:159:0x0669, B:160:0x06a7, B:162:0x06af, B:165:0x06b7, B:167:0x06e7, B:169:0x06ed, B:170:0x070c, B:175:0x0757, B:173:0x072b, B:174:0x074a, B:354:0x0def, B:66:0x0309, B:69:0x0317, B:77:0x0375, B:96:0x0453), top: B:393:0x008a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x0a19 A[Catch: all -> 0x0b8f, TryCatch #17 {all -> 0x0b8f, blocks: (B:14:0x00b1, B:17:0x00c6, B:330:0x0c92, B:25:0x010f, B:314:0x0bdd, B:303:0x0b55, B:305:0x0b61, B:309:0x0b98, B:311:0x0ba4, B:33:0x0161, B:287:0x0a82, B:36:0x0171, B:352:0x0dd4, B:39:0x0183, B:267:0x0a02, B:268:0x0a13, B:260:0x09ba, B:262:0x09be, B:269:0x0a19, B:272:0x0a1e, B:274:0x0a22, B:278:0x0a2e, B:284:0x0a45, B:295:0x0ab2, B:297:0x0ade, B:299:0x0aeb, B:281:0x0a3b, B:349:0x0d9d, B:208:0x0863, B:207:0x084e, B:157:0x065f, B:159:0x0669, B:160:0x06a7, B:162:0x06af, B:165:0x06b7, B:167:0x06e7, B:169:0x06ed, B:170:0x070c, B:175:0x0757, B:173:0x072b, B:174:0x074a, B:354:0x0def, B:66:0x0309, B:69:0x0317, B:77:0x0375, B:96:0x0453), top: B:393:0x008a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:271:0x0a1d  */
    /* JADX WARN: Code duplicated, block: B:274:0x0a22 A[Catch: all -> 0x0b8f, TryCatch #17 {all -> 0x0b8f, blocks: (B:14:0x00b1, B:17:0x00c6, B:330:0x0c92, B:25:0x010f, B:314:0x0bdd, B:303:0x0b55, B:305:0x0b61, B:309:0x0b98, B:311:0x0ba4, B:33:0x0161, B:287:0x0a82, B:36:0x0171, B:352:0x0dd4, B:39:0x0183, B:267:0x0a02, B:268:0x0a13, B:260:0x09ba, B:262:0x09be, B:269:0x0a19, B:272:0x0a1e, B:274:0x0a22, B:278:0x0a2e, B:284:0x0a45, B:295:0x0ab2, B:297:0x0ade, B:299:0x0aeb, B:281:0x0a3b, B:349:0x0d9d, B:208:0x0863, B:207:0x084e, B:157:0x065f, B:159:0x0669, B:160:0x06a7, B:162:0x06af, B:165:0x06b7, B:167:0x06e7, B:169:0x06ed, B:170:0x070c, B:175:0x0757, B:173:0x072b, B:174:0x074a, B:354:0x0def, B:66:0x0309, B:69:0x0317, B:77:0x0375, B:96:0x0453), top: B:393:0x008a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:276:0x0a2a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0117  */
    /* JADX WARN: Code duplicated, block: B:281:0x0a3b A[Catch: all -> 0x0b8f, TryCatch #17 {all -> 0x0b8f, blocks: (B:14:0x00b1, B:17:0x00c6, B:330:0x0c92, B:25:0x010f, B:314:0x0bdd, B:303:0x0b55, B:305:0x0b61, B:309:0x0b98, B:311:0x0ba4, B:33:0x0161, B:287:0x0a82, B:36:0x0171, B:352:0x0dd4, B:39:0x0183, B:267:0x0a02, B:268:0x0a13, B:260:0x09ba, B:262:0x09be, B:269:0x0a19, B:272:0x0a1e, B:274:0x0a22, B:278:0x0a2e, B:284:0x0a45, B:295:0x0ab2, B:297:0x0ade, B:299:0x0aeb, B:281:0x0a3b, B:349:0x0d9d, B:208:0x0863, B:207:0x084e, B:157:0x065f, B:159:0x0669, B:160:0x06a7, B:162:0x06af, B:165:0x06b7, B:167:0x06e7, B:169:0x06ed, B:170:0x070c, B:175:0x0757, B:173:0x072b, B:174:0x074a, B:354:0x0def, B:66:0x0309, B:69:0x0317, B:77:0x0375, B:96:0x0453), top: B:393:0x008a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:284:0x0a45 A[Catch: all -> 0x0b8f, TryCatch #17 {all -> 0x0b8f, blocks: (B:14:0x00b1, B:17:0x00c6, B:330:0x0c92, B:25:0x010f, B:314:0x0bdd, B:303:0x0b55, B:305:0x0b61, B:309:0x0b98, B:311:0x0ba4, B:33:0x0161, B:287:0x0a82, B:36:0x0171, B:352:0x0dd4, B:39:0x0183, B:267:0x0a02, B:268:0x0a13, B:260:0x09ba, B:262:0x09be, B:269:0x0a19, B:272:0x0a1e, B:274:0x0a22, B:278:0x0a2e, B:284:0x0a45, B:295:0x0ab2, B:297:0x0ade, B:299:0x0aeb, B:281:0x0a3b, B:349:0x0d9d, B:208:0x0863, B:207:0x084e, B:157:0x065f, B:159:0x0669, B:160:0x06a7, B:162:0x06af, B:165:0x06b7, B:167:0x06e7, B:169:0x06ed, B:170:0x070c, B:175:0x0757, B:173:0x072b, B:174:0x074a, B:354:0x0def, B:66:0x0309, B:69:0x0317, B:77:0x0375, B:96:0x0453), top: B:393:0x008a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:288:0x0a9e  */
    /* JADX WARN: Code duplicated, block: B:290:0x0aa2  */
    /* JADX WARN: Code duplicated, block: B:293:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:295:0x0ab2 A[Catch: all -> 0x0b8f, TryCatch #17 {all -> 0x0b8f, blocks: (B:14:0x00b1, B:17:0x00c6, B:330:0x0c92, B:25:0x010f, B:314:0x0bdd, B:303:0x0b55, B:305:0x0b61, B:309:0x0b98, B:311:0x0ba4, B:33:0x0161, B:287:0x0a82, B:36:0x0171, B:352:0x0dd4, B:39:0x0183, B:267:0x0a02, B:268:0x0a13, B:260:0x09ba, B:262:0x09be, B:269:0x0a19, B:272:0x0a1e, B:274:0x0a22, B:278:0x0a2e, B:284:0x0a45, B:295:0x0ab2, B:297:0x0ade, B:299:0x0aeb, B:281:0x0a3b, B:349:0x0d9d, B:208:0x0863, B:207:0x084e, B:157:0x065f, B:159:0x0669, B:160:0x06a7, B:162:0x06af, B:165:0x06b7, B:167:0x06e7, B:169:0x06ed, B:170:0x070c, B:175:0x0757, B:173:0x072b, B:174:0x074a, B:354:0x0def, B:66:0x0309, B:69:0x0317, B:77:0x0375, B:96:0x0453), top: B:393:0x008a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:296:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:299:0x0aeb A[Catch: all -> 0x0b8f, TryCatch #17 {all -> 0x0b8f, blocks: (B:14:0x00b1, B:17:0x00c6, B:330:0x0c92, B:25:0x010f, B:314:0x0bdd, B:303:0x0b55, B:305:0x0b61, B:309:0x0b98, B:311:0x0ba4, B:33:0x0161, B:287:0x0a82, B:36:0x0171, B:352:0x0dd4, B:39:0x0183, B:267:0x0a02, B:268:0x0a13, B:260:0x09ba, B:262:0x09be, B:269:0x0a19, B:272:0x0a1e, B:274:0x0a22, B:278:0x0a2e, B:284:0x0a45, B:295:0x0ab2, B:297:0x0ade, B:299:0x0aeb, B:281:0x0a3b, B:349:0x0d9d, B:208:0x0863, B:207:0x084e, B:157:0x065f, B:159:0x0669, B:160:0x06a7, B:162:0x06af, B:165:0x06b7, B:167:0x06e7, B:169:0x06ed, B:170:0x070c, B:175:0x0757, B:173:0x072b, B:174:0x074a, B:354:0x0def, B:66:0x0309, B:69:0x0317, B:77:0x0375, B:96:0x0453), top: B:393:0x008a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:302:0x0b4e  */
    /* JADX WARN: Code duplicated, block: B:305:0x0b61 A[Catch: all -> 0x0b8f, TryCatch #17 {all -> 0x0b8f, blocks: (B:14:0x00b1, B:17:0x00c6, B:330:0x0c92, B:25:0x010f, B:314:0x0bdd, B:303:0x0b55, B:305:0x0b61, B:309:0x0b98, B:311:0x0ba4, B:33:0x0161, B:287:0x0a82, B:36:0x0171, B:352:0x0dd4, B:39:0x0183, B:267:0x0a02, B:268:0x0a13, B:260:0x09ba, B:262:0x09be, B:269:0x0a19, B:272:0x0a1e, B:274:0x0a22, B:278:0x0a2e, B:284:0x0a45, B:295:0x0ab2, B:297:0x0ade, B:299:0x0aeb, B:281:0x0a3b, B:349:0x0d9d, B:208:0x0863, B:207:0x084e, B:157:0x065f, B:159:0x0669, B:160:0x06a7, B:162:0x06af, B:165:0x06b7, B:167:0x06e7, B:169:0x06ed, B:170:0x070c, B:175:0x0757, B:173:0x072b, B:174:0x074a, B:354:0x0def, B:66:0x0309, B:69:0x0317, B:77:0x0375, B:96:0x0453), top: B:393:0x008a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:308:0x0b92  */
    /* JADX WARN: Code duplicated, block: B:311:0x0ba4 A[Catch: all -> 0x0b8f, TryCatch #17 {all -> 0x0b8f, blocks: (B:14:0x00b1, B:17:0x00c6, B:330:0x0c92, B:25:0x010f, B:314:0x0bdd, B:303:0x0b55, B:305:0x0b61, B:309:0x0b98, B:311:0x0ba4, B:33:0x0161, B:287:0x0a82, B:36:0x0171, B:352:0x0dd4, B:39:0x0183, B:267:0x0a02, B:268:0x0a13, B:260:0x09ba, B:262:0x09be, B:269:0x0a19, B:272:0x0a1e, B:274:0x0a22, B:278:0x0a2e, B:284:0x0a45, B:295:0x0ab2, B:297:0x0ade, B:299:0x0aeb, B:281:0x0a3b, B:349:0x0d9d, B:208:0x0863, B:207:0x084e, B:157:0x065f, B:159:0x0669, B:160:0x06a7, B:162:0x06af, B:165:0x06b7, B:167:0x06e7, B:169:0x06ed, B:170:0x070c, B:175:0x0757, B:173:0x072b, B:174:0x074a, B:354:0x0def, B:66:0x0309, B:69:0x0317, B:77:0x0375, B:96:0x0453), top: B:393:0x008a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:313:0x0bdb  */
    /* JADX WARN: Code duplicated, block: B:316:0x0bf9  */
    /* JADX WARN: Code duplicated, block: B:318:0x0c0b  */
    /* JADX WARN: Code duplicated, block: B:323:0x0c45  */
    /* JADX WARN: Code duplicated, block: B:326:0x0c5d A[Catch: all -> 0x0cab, TRY_LEAVE, TryCatch #3 {all -> 0x0cab, blocks: (B:324:0x0c55, B:326:0x0c5d, B:334:0x0caf, B:338:0x0cc1, B:339:0x0ce8), top: B:366:0x0c55 }] */
    /* JADX WARN: Code duplicated, block: B:329:0x0c90  */
    /* JADX WARN: Code duplicated, block: B:32:0x0158  */
    /* JADX WARN: Code duplicated, block: B:334:0x0caf A[Catch: all -> 0x0cab, TRY_ENTER, TryCatch #3 {all -> 0x0cab, blocks: (B:324:0x0c55, B:326:0x0c5d, B:334:0x0caf, B:338:0x0cc1, B:339:0x0ce8), top: B:366:0x0c55 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x0cb8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:342:0x0d2c  */
    /* JADX WARN: Code duplicated, block: B:349:0x0d9d A[Catch: all -> 0x0b8f, TRY_ENTER, TryCatch #17 {all -> 0x0b8f, blocks: (B:14:0x00b1, B:17:0x00c6, B:330:0x0c92, B:25:0x010f, B:314:0x0bdd, B:303:0x0b55, B:305:0x0b61, B:309:0x0b98, B:311:0x0ba4, B:33:0x0161, B:287:0x0a82, B:36:0x0171, B:352:0x0dd4, B:39:0x0183, B:267:0x0a02, B:268:0x0a13, B:260:0x09ba, B:262:0x09be, B:269:0x0a19, B:272:0x0a1e, B:274:0x0a22, B:278:0x0a2e, B:284:0x0a45, B:295:0x0ab2, B:297:0x0ade, B:299:0x0aeb, B:281:0x0a3b, B:349:0x0d9d, B:208:0x0863, B:207:0x084e, B:157:0x065f, B:159:0x0669, B:160:0x06a7, B:162:0x06af, B:165:0x06b7, B:167:0x06e7, B:169:0x06ed, B:170:0x070c, B:175:0x0757, B:173:0x072b, B:174:0x074a, B:354:0x0def, B:66:0x0309, B:69:0x0317, B:77:0x0375, B:96:0x0453), top: B:393:0x008a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0168  */
    /* JADX WARN: Code duplicated, block: B:377:0x0874 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0176  */
    /* JADX WARN: Code duplicated, block: B:413:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x018a  */
    /* JADX WARN: Code duplicated, block: B:47:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x0244  */
    /* JADX WARN: Code duplicated, block: B:58:0x029d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0300  */
    /* JADX WARN: Code duplicated, block: B:68:0x030e  */
    /* JADX WARN: Code duplicated, block: B:71:0x031c  */
    /* JADX WARN: Code duplicated, block: B:76:0x036c  */
    /* JADX WARN: Code duplicated, block: B:79:0x037a  */
    /* JADX WARN: Code duplicated, block: B:81:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:84:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x0404  */
    /* JADX WARN: Code duplicated, block: B:88:0x0407 A[Catch: all -> 0x05db, TryCatch #22 {all -> 0x05db, blocks: (B:153:0x0603, B:142:0x05c8, B:146:0x05d4, B:149:0x05de, B:102:0x048a, B:104:0x0490, B:106:0x0496, B:109:0x04a0, B:120:0x0518, B:122:0x051e, B:126:0x052a, B:131:0x053b, B:129:0x0533, B:136:0x056e, B:138:0x0576, B:119:0x04e3, B:111:0x04aa, B:85:0x03f9, B:90:0x041d, B:92:0x0423, B:98:0x0459, B:88:0x0407), top: B:400:0x03f9 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x041d A[Catch: all -> 0x05db, TryCatch #22 {all -> 0x05db, blocks: (B:153:0x0603, B:142:0x05c8, B:146:0x05d4, B:149:0x05de, B:102:0x048a, B:104:0x0490, B:106:0x0496, B:109:0x04a0, B:120:0x0518, B:122:0x051e, B:126:0x052a, B:131:0x053b, B:129:0x0533, B:136:0x056e, B:138:0x0576, B:119:0x04e3, B:111:0x04aa, B:85:0x03f9, B:90:0x041d, B:92:0x0423, B:98:0x0459, B:88:0x0407), top: B:400:0x03f9 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0459 A[Catch: all -> 0x05db, TRY_ENTER, TryCatch #22 {all -> 0x05db, blocks: (B:153:0x0603, B:142:0x05c8, B:146:0x05d4, B:149:0x05de, B:102:0x048a, B:104:0x0490, B:106:0x0496, B:109:0x04a0, B:120:0x0518, B:122:0x051e, B:126:0x052a, B:131:0x053b, B:129:0x0533, B:136:0x056e, B:138:0x0576, B:119:0x04e3, B:111:0x04aa, B:85:0x03f9, B:90:0x041d, B:92:0x0423, B:98:0x0459, B:88:0x0407), top: B:400:0x03f9 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:119:0x04e3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:159:0x0669, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:262:0x09be, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:267:0x0a02, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:284:0x0a45, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:295:0x0ab2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:299:0x0aeb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:305:0x0b61, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:311:0x0ba4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:326:0x0c5d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:349:0x0d9d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x0407, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v51, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v81 */
    /* JADX WARN: Type inference failed for: r8v89 */
    /* JADX WARN: Type inference failed for: r8v96 */
    public final Object a(URL url, long j2, b bVar, Continuation continuation) throws Throwable {
        String str;
        e eVar;
        Object objA;
        CoroutineSingletons coroutineSingletons;
        String str2;
        String str3;
        String str4;
        String str5;
        ?? r8;
        long jLongValue;
        Mutex mutex;
        o5 o5Var;
        String str6;
        Object obj;
        long j3;
        URL url2;
        long j4;
        b bVar2;
        String string;
        File fileA;
        o5 o5Var2;
        Object objB;
        b bVar3;
        long j5;
        File fileA2;
        String str7;
        long j6;
        URL url3;
        o5 o5Var3;
        b bVar4;
        Object obj2;
        Object objB2;
        Object obj3;
        Object obj4;
        File file;
        URL url4;
        b bVar5;
        long j7;
        o5 o5Var4;
        File file2;
        String str8;
        long j8;
        URL url5;
        b bVar6;
        File file3;
        long j9;
        long j10;
        o5 o5Var5;
        long j11;
        Mutex mutex2;
        Object obj5;
        File file4;
        m3 m3Var;
        s7 s7Var;
        o5 o5Var6;
        String str9;
        Mutex mutex3;
        File fileA3;
        Pair pair;
        File file5;
        o5 o5Var7;
        b bVar7;
        URL url6;
        long j12;
        File file6;
        File file7;
        long j13;
        CoroutineSingletons coroutineSingletons2;
        long j14;
        long j15;
        File file8;
        File file9;
        long j16;
        File file10;
        b bVar8;
        Object objA2;
        File file11;
        File file12;
        long j17;
        Object obj6;
        long j18;
        b bVar9;
        Object obj7;
        Object obj8;
        Object objA3;
        o5 o5Var8;
        String str10;
        long j19;
        File file13;
        File file14;
        long j20;
        CoroutineSingletons coroutineSingletons3;
        File file15;
        URL url7;
        long j21;
        Object obj9;
        Throwable thA;
        long j22;
        long j23;
        long j24;
        long j25;
        Object obj10;
        URL url8;
        long j26;
        b bVar10;
        long j27;
        Object objA4;
        long j28;
        Object obj11;
        File file16;
        File file17;
        File file18;
        long j29;
        long j30;
        Object obj12;
        File file19;
        File file20;
        long j31;
        long j32;
        File file21;
        Mutex mutex4;
        b bVar11;
        URL url9;
        o5 o5Var9;
        Object objA5;
        Object obj13;
        Long l2;
        NonCancellable nonCancellable;
        j jVar;
        long jLongValue2;
        int i2;
        File file22;
        long j33;
        b bVar12;
        int i3;
        URL url10;
        long j34;
        File file23;
        o5 o5Var10;
        int i4;
        o5 o5Var11;
        URL url11;
        long j35;
        CoroutineSingletons coroutineSingletons4;
        long j36;
        long j37;
        String str11;
        o5 o5Var12;
        String str12;
        NonCancellable nonCancellable2;
        g gVar;
        Throwable thA2;
        String str13;
        NonCancellable nonCancellable3;
        f fVar;
        String str14;
        Throwable iOException;
        Object obj14;
        long j38;
        String str15;
        b bVar13;
        URL url12;
        o5 o5Var13;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        b bVar14;
        long j39;
        String str16;
        Object objB3;
        CoroutineSingletons coroutineSingletons5;
        long j40;
        URL url13;
        File file24;
        b bVar15;
        o5 o5Var14;
        long j41;
        long j42;
        File file25;
        String str17;
        Object obj20;
        long jLongValue3;
        String str18;
        NonCancellable nonCancellable4;
        h hVar;
        Object obj21;
        Object obj22;
        String str19;
        long j43;
        File file26;
        l3 l3Var;
        o3 o3Var;
        long j44;
        o5 o5Var15;
        long j45;
        File file27;
        String str20;
        long j46;
        File file28;
        NonCancellable nonCancellable5;
        i iVar;
        Object obj23;
        String str21;
        Object obj24;
        Object obj25;
        ?? r11;
        Object obj26;
        String str22 = ". Required: ";
        String str23 = "temp_";
        String str24 = "Not enough free space on device for ";
        String str25 = "Not enough free disk space to attempt download for ";
        String str26 = "Expired file ";
        Object obj27 = "Evicting expired file ";
        try {
            try {
                if (continuation instanceof e) {
                    eVar = (e) continuation;
                    str = "Cache size limit check: Need to free ";
                    int i5 = eVar.r;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        eVar.r = i5 - Integer.MIN_VALUE;
                    }
                    objA = eVar.f14723p;
                    IntrinsicsKt.a();
                    coroutineSingletons = CoroutineSingletons.X;
                    str2 = "_";
                    str3 = ")";
                    str4 = "toString(...)";
                    str5 = "Download failed for ";
                    switch (eVar.r) {
                        case 0:
                            ResultKt.b(objA);
                            jLongValue = ((Number) this.g.invoke()).longValue();
                            mutex = this.m;
                            eVar.f14716b = this;
                            eVar.f14717c = url;
                            eVar.d = bVar;
                            eVar.f14718e = mutex;
                            eVar.k = j2;
                            eVar.f14721l = jLongValue;
                            eVar.r = 1;
                            if (mutex.a(eVar) != coroutineSingletons) {
                                o5Var = this;
                                str6 = "Resuming download for ";
                                obj = mutex;
                                j3 = jLongValue;
                                url2 = url;
                                j4 = j2;
                                bVar2 = bVar;
                                try {
                                    string = url2.toString();
                                    Intrinsics.e(string, "toString(...)");
                                    if (j4 == -1) {
                                        string = string + "_" + j4;
                                    }
                                    if (bVar2 == null && bVar2.b(j4)) {
                                        za.a("File for " + string + " already available after acquiring lock from partial download.", (Throwable) null, 2, (Object) null);
                                        o3 o3Var2 = o5Var.f14696b;
                                        File fileB = bVar2.b();
                                        eVar.f14716b = bVar2;
                                        eVar.f14717c = obj;
                                        eVar.d = null;
                                        eVar.f14718e = null;
                                        eVar.r = 2;
                                        if (o3Var2.a(fileB, eVar) != coroutineSingletons) {
                                            bVar4 = bVar2;
                                            obj2 = obj;
                                            objB2 = bVar4.b();
                                            obj24 = obj2;
                                            obj25 = objB2;
                                            r11 = obj24;
                                            r11.b(null);
                                            return obj25;
                                        }
                                    } else {
                                        fileA = o5Var.f14696b.a(url2);
                                        o3 o3Var3 = o5Var.f14696b;
                                        eVar.f14716b = o5Var;
                                        eVar.f14717c = url2;
                                        eVar.d = bVar2;
                                        eVar.f14718e = obj;
                                        eVar.f = string;
                                        eVar.g = fileA;
                                        eVar.k = j4;
                                        eVar.f14721l = j3;
                                        o5Var2 = o5Var;
                                        eVar.r = 3;
                                        objB = o3Var3.b(url2, eVar);
                                        if (objB != coroutineSingletons) {
                                            bVar3 = bVar2;
                                            j5 = j4;
                                            fileA2 = fileA;
                                            str7 = string;
                                            j6 = j3;
                                            url3 = url2;
                                            objA = objB;
                                            o5Var3 = o5Var2;
                                            obj3 = obj;
                                            l3 l3Var2 = (l3) objA;
                                            if (j5 == -1 && fileA2.exists() && fileA2.length() >= j5) {
                                                if (l3Var2 == null || !o5Var3.d.a(l3Var2)) {
                                                    za.a("Complete file exists and satisfies partial request for " + str7, (Throwable) null, 2, (Object) null);
                                                    o3 o3Var4 = o5Var3.f14696b;
                                                    eVar.f14716b = obj3;
                                                    eVar.f14717c = fileA2;
                                                    eVar.d = null;
                                                    eVar.f14718e = null;
                                                    eVar.f = null;
                                                    eVar.g = null;
                                                    eVar.r = 4;
                                                    if (o3Var4.a(fileA2, eVar) == coroutineSingletons) {
                                                    }
                                                    obj4 = obj3;
                                                }
                                                objB2 = fileA2;
                                                obj24 = obj4;
                                                obj25 = objB2;
                                                r11 = obj24;
                                                r11.b(null);
                                                return obj25;
                                            }
                                            if (j5 != -1) {
                                                fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                                            }
                                            if (!fileA2.exists() && fileA2.length() > 0 && (j5 != -1 ? fileA2.length() >= j5 : !(l3Var2 != null && o5Var3.d.a(l3Var2)))) {
                                                za.a("File for " + str7 + " became valid after acquiring lock. Returning cached file.", (Throwable) null, 2, (Object) null);
                                                o3 o3Var5 = o5Var3.f14696b;
                                                eVar.f14716b = obj3;
                                                eVar.f14717c = fileA2;
                                                eVar.d = null;
                                                eVar.f14718e = null;
                                                eVar.f = null;
                                                eVar.g = null;
                                                eVar.r = 5;
                                                if (o3Var5.a(fileA2, eVar) == coroutineSingletons) {
                                                }
                                                obj4 = obj3;
                                                objB2 = fileA2;
                                                obj24 = obj4;
                                                obj25 = objB2;
                                                r11 = obj24;
                                                r11.b(null);
                                                return obj25;
                                            }
                                            if (j5 == -1 || l3Var2 == null || !o5Var3.d.a(l3Var2)) {
                                                File file29 = fileA2;
                                                coroutineSingletons = coroutineSingletons;
                                                obj27 = obj3;
                                                file = fileA2;
                                                url4 = url3;
                                                bVar5 = bVar3;
                                                j7 = j5;
                                                o5Var4 = o5Var3;
                                                file2 = file29;
                                                str8 = str7;
                                                j8 = j6;
                                            } else {
                                                za.a("Evicting expired file " + str7 + " before download.", (Throwable) null, 2, (Object) null);
                                                long length = fileA2.length();
                                                o3 o3Var6 = o5Var3.f14696b;
                                                eVar.f14716b = o5Var3;
                                                eVar.f14717c = url5;
                                                bVar6 = bVar3;
                                                eVar.d = bVar6;
                                                eVar.f14718e = obj3;
                                                eVar.f = str7;
                                                File file30 = fileA2;
                                                eVar.g = file30;
                                                eVar.f14719h = fileA2;
                                                eVar.k = j5;
                                                o5 o5Var16 = o5Var3;
                                                file3 = fileA2;
                                                long j47 = j6;
                                                eVar.f14721l = j47;
                                                eVar.m = length;
                                                eVar.r = 6;
                                                objA = o3Var6.a(url5, eVar);
                                                if (objA == coroutineSingletons) {
                                                    url5 = url3;
                                                } else {
                                                    url5 = url3;
                                                    j9 = j47;
                                                    j10 = j5;
                                                    file2 = file30;
                                                    o5Var5 = o5Var16;
                                                    j11 = length;
                                                    obj5 = obj3;
                                                    file4 = file3;
                                                    if (((Boolean) objA).booleanValue()) {
                                                        if (j11 > 0) {
                                                            o5Var5.k.addAndGet(-j11);
                                                        }
                                                        m3Var = o5Var5.f14698e;
                                                        s7Var = s7.TTL_EXPIRED;
                                                        eVar.f14716b = o5Var5;
                                                        eVar.f14717c = url5;
                                                        eVar.d = bVar6;
                                                        eVar.f14718e = obj5;
                                                        eVar.f = str7;
                                                        eVar.g = file2;
                                                        eVar.f14719h = file4;
                                                        eVar.k = j10;
                                                        j8 = j9;
                                                        eVar.f14721l = j8;
                                                        eVar.r = 7;
                                                        if (m3Var.a(url5, s7Var, eVar) == coroutineSingletons) {
                                                            return coroutineSingletons;
                                                        }
                                                        o5Var6 = o5Var5;
                                                        str9 = str7;
                                                        obj7 = obj5;
                                                        File file31 = file4;
                                                        za.a(str26 + str9 + " evicted. New size: " + o5Var6.k.get(), (Throwable) null, 2, (Object) null);
                                                        o5Var4 = o5Var6;
                                                        url4 = url5;
                                                        Object obj28 = obj7;
                                                        file = file31;
                                                        long j48 = j10;
                                                        bVar5 = bVar6;
                                                        j7 = j48;
                                                        str8 = str9;
                                                        obj27 = obj28;
                                                    } else {
                                                        j8 = j9;
                                                        Object obj29 = obj5;
                                                        file = file4;
                                                        o5Var4 = o5Var5;
                                                        obj27 = obj29;
                                                        url4 = url5;
                                                        long j49 = j10;
                                                        bVar5 = bVar6;
                                                        j7 = j49;
                                                        str8 = str7;
                                                    }
                                                }
                                            }
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j50 = o5Var4.f14699h;
                                                StringBuilder sb = new StringBuilder(str25);
                                                sb.append(str8);
                                                String str27 = str22;
                                                sb.append(str27);
                                                sb.append(j50);
                                                za.e(sb.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str27 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null && fileA3.exists()) {
                                                    long j51 = j8;
                                                    CoroutineSingletons coroutineSingletons6 = coroutineSingletons;
                                                    File file32 = file;
                                                    File file33 = new File(fileA3, str23 + System.nanoTime() + str2 + url4.hashCode() + ".tmp");
                                                    if (bVar5 != null && bVar5.a(j7)) {
                                                        za.a(str6 + str8 + " from byte " + bVar5.a(), (Throwable) null, 2, (Object) null);
                                                        try {
                                                            FilesKt.b(bVar5.b(), file33, 6);
                                                            pair = new Pair(Boxing.a(bVar5.a()), Boxing.a(bVar5.a()));
                                                        } catch (Exception e2) {
                                                            za.e("Failed to copy existing data for resume, starting fresh download for " + str8, e2);
                                                            pair = new Pair(Boxing.a(0L), Boxing.a(0L));
                                                        }
                                                    } else {
                                                        pair = new Pair(Boxing.a(0L), Boxing.a(0L));
                                                    }
                                                    Pair pair2 = pair;
                                                    long jLongValue4 = ((Number) pair.getX()).longValue();
                                                    long j52 = j7;
                                                    long jLongValue5 = ((Number) pair2.getF43249Y()).longValue();
                                                    str3 = str3;
                                                    za.d("Starting download task for " + str8 + " to " + file33.getName() + " (resuming from byte " + jLongValue4 + str3, null, 2, null);
                                                    try {
                                                        eVar.f14716b = o5Var4;
                                                        eVar.f14717c = url4;
                                                        eVar.d = bVar5;
                                                        eVar.f14718e = obj27;
                                                        eVar.f = str8;
                                                        eVar.g = file2;
                                                        file5 = file32;
                                                        try {
                                                            eVar.f14719h = file5;
                                                            eVar.f14720i = fileA3;
                                                            eVar.j = file33;
                                                            o5Var7 = o5Var4;
                                                            bVar7 = bVar5;
                                                            try {
                                                                eVar.k = j52;
                                                                j52 = j52;
                                                                j13 = j51;
                                                                try {
                                                                    eVar.f14721l = j13;
                                                                    eVar.m = jLongValue4;
                                                                    eVar.f14722n = jLongValue5;
                                                                    eVar.r = 8;
                                                                    url6 = url4;
                                                                    e eVar2 = eVar;
                                                                    j12 = jLongValue4;
                                                                    file6 = fileA3;
                                                                    file7 = file33;
                                                                    try {
                                                                        objA2 = o5Var7.a(url6, file7, j52, j12, file6, eVar2);
                                                                        eVar = eVar2;
                                                                        coroutineSingletons2 = coroutineSingletons6;
                                                                        if (objA2 == coroutineSingletons2) {
                                                                            return coroutineSingletons2;
                                                                        }
                                                                        j15 = jLongValue5;
                                                                        file8 = file5;
                                                                        file11 = file7;
                                                                        file12 = file6;
                                                                        j17 = j13;
                                                                        obj6 = obj27;
                                                                        j18 = j52;
                                                                        bVar9 = bVar7;
                                                                        try {
                                                                            ResultKt.b(objA2);
                                                                            objA3 = Boxing.a(((Number) objA2).longValue());
                                                                            j19 = j17;
                                                                            file13 = file12;
                                                                            long j53 = j18;
                                                                            obj9 = obj6;
                                                                            str10 = str8;
                                                                            file14 = file11;
                                                                            o5Var8 = o5Var7;
                                                                            j20 = j53;
                                                                            coroutineSingletons3 = coroutineSingletons2;
                                                                            j21 = j12;
                                                                            file15 = file2;
                                                                            url7 = url6;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            File file34 = file12;
                                                                            file9 = file11;
                                                                            file10 = file34;
                                                                            j14 = j17;
                                                                            j16 = j18;
                                                                            obj8 = obj6;
                                                                            bVar8 = bVar9;
                                                                            o5 o5Var17 = o5Var7;
                                                                            objA3 = ResultKt.a(th);
                                                                            String str28 = str8;
                                                                            o5Var8 = o5Var17;
                                                                            bVar9 = bVar8;
                                                                            str10 = str28;
                                                                            j19 = j14;
                                                                            file13 = file10;
                                                                            file14 = file9;
                                                                            j20 = j16;
                                                                            coroutineSingletons3 = coroutineSingletons2;
                                                                            file15 = file2;
                                                                            url7 = url6;
                                                                            j21 = j12;
                                                                            obj9 = obj8;
                                                                        }
                                                                        thA = Result.a(objA3);
                                                                        if (thA != null) {
                                                                            j30 = j21;
                                                                            j25 = j19;
                                                                            obj12 = objA3;
                                                                            file19 = file8;
                                                                            file20 = file14;
                                                                            coroutineSingletons3 = coroutineSingletons3;
                                                                            obj13 = obj9;
                                                                        } else {
                                                                            try {
                                                                                try {
                                                                                    StringBuilder sb2 = new StringBuilder(str5);
                                                                                    sb2.append(str10);
                                                                                    str5 = str5;
                                                                                    sb2.append(" (startByte: ");
                                                                                    sb2.append(j21);
                                                                                    sb2.append(str3);
                                                                                    za.b(sb2.toString(), thA);
                                                                                    if (j21 <= 0 && (thA instanceof IOException)) {
                                                                                        try {
                                                                                            za.e("Retrying download for " + str10 + " from beginning due to resume failure", null, 2, null);
                                                                                            if (file14.exists()) {
                                                                                                file14.delete();
                                                                                            }
                                                                                            eVar.f14716b = o5Var8;
                                                                                            eVar.f14717c = url7;
                                                                                            eVar.d = bVar9;
                                                                                            eVar.f14718e = obj9;
                                                                                            eVar.f = str10;
                                                                                            eVar.g = file15;
                                                                                            eVar.f14719h = file8;
                                                                                            eVar.f14720i = file14;
                                                                                            eVar.j = null;
                                                                                            eVar.k = j20;
                                                                                            j27 = j19;
                                                                                            try {
                                                                                                eVar.f14721l = j27;
                                                                                                eVar.m = j21;
                                                                                                bVar9 = bVar9;
                                                                                                str10 = str10;
                                                                                                j23 = j15;
                                                                                                try {
                                                                                                    eVar.f14722n = j23;
                                                                                                    eVar.r = 9;
                                                                                                    o5Var8 = o5Var8;
                                                                                                    url7 = url7;
                                                                                                    file14 = file14;
                                                                                                    e eVar3 = eVar;
                                                                                                    j22 = j20;
                                                                                                    try {
                                                                                                        objA4 = o5Var8.a(url7, file14, j22, 0L, file13, eVar3);
                                                                                                        coroutineSingletons3 = coroutineSingletons3;
                                                                                                        if (objA4 == coroutineSingletons3) {
                                                                                                            return coroutineSingletons3;
                                                                                                        }
                                                                                                        j15 = j23;
                                                                                                        j28 = j21;
                                                                                                        obj11 = obj9;
                                                                                                        file16 = file8;
                                                                                                        file17 = file14;
                                                                                                        str10 = str10;
                                                                                                        file18 = file15;
                                                                                                        j29 = j27;
                                                                                                        try {
                                                                                                            ResultKt.b(objA4);
                                                                                                            objA5 = Boxing.a(((Number) objA4).longValue());
                                                                                                            j25 = j29;
                                                                                                            file15 = file18;
                                                                                                            j21 = j28;
                                                                                                            file8 = file16;
                                                                                                            obj14 = obj11;
                                                                                                        } catch (Throwable th2) {
                                                                                                            th = th2;
                                                                                                            j25 = j29;
                                                                                                            file14 = file17;
                                                                                                            file15 = file18;
                                                                                                            j21 = j28;
                                                                                                            file8 = file16;
                                                                                                            bVar10 = bVar9;
                                                                                                            url8 = url7;
                                                                                                            j26 = j22;
                                                                                                            obj10 = obj11;
                                                                                                            objA5 = ResultKt.a(th);
                                                                                                            bVar9 = bVar10;
                                                                                                            url7 = url8;
                                                                                                            j22 = j26;
                                                                                                            file17 = file14;
                                                                                                            obj14 = obj10;
                                                                                                        }
                                                                                                        obj13 = obj14;
                                                                                                        j30 = j21;
                                                                                                        o5Var8 = o5Var8;
                                                                                                        url7 = url7;
                                                                                                        bVar9 = bVar9;
                                                                                                        obj12 = objA5;
                                                                                                        file19 = file8;
                                                                                                        file20 = file17;
                                                                                                        j20 = j22;
                                                                                                    } catch (Throwable th3) {
                                                                                                        th = th3;
                                                                                                        eVar = eVar3;
                                                                                                        j24 = j27;
                                                                                                        j15 = j23;
                                                                                                        j25 = j24;
                                                                                                        obj10 = obj9;
                                                                                                        str10 = str10;
                                                                                                        url8 = url7;
                                                                                                        j26 = j22;
                                                                                                        bVar10 = bVar9;
                                                                                                        objA5 = ResultKt.a(th);
                                                                                                        bVar9 = bVar10;
                                                                                                        url7 = url8;
                                                                                                        j22 = j26;
                                                                                                        file17 = file14;
                                                                                                        obj14 = obj10;
                                                                                                    }
                                                                                                } catch (Throwable th4) {
                                                                                                    th = th4;
                                                                                                    o5Var8 = o5Var8;
                                                                                                    url7 = url7;
                                                                                                    file14 = file14;
                                                                                                    j22 = j20;
                                                                                                }
                                                                                            } catch (Throwable th5) {
                                                                                                th = th5;
                                                                                                bVar9 = bVar9;
                                                                                                str10 = str10;
                                                                                                o5Var8 = o5Var8;
                                                                                                url7 = url7;
                                                                                                file14 = file14;
                                                                                                j22 = j20;
                                                                                                j23 = j15;
                                                                                            }
                                                                                        } catch (Throwable th6) {
                                                                                            th = th6;
                                                                                            bVar9 = bVar9;
                                                                                            str10 = str10;
                                                                                            o5Var8 = o5Var8;
                                                                                            url7 = url7;
                                                                                            file14 = file14;
                                                                                            j22 = j20;
                                                                                            j23 = j15;
                                                                                            j27 = j19;
                                                                                        }
                                                                                        break;
                                                                                    } else {
                                                                                        bVar9 = bVar9;
                                                                                        str10 = str10;
                                                                                        o5Var8 = o5Var8;
                                                                                        url7 = url7;
                                                                                        file14 = file14;
                                                                                        j22 = j20;
                                                                                        j23 = j15;
                                                                                        j24 = j19;
                                                                                        try {
                                                                                            throw thA;
                                                                                        } catch (Throwable th7) {
                                                                                            th = th7;
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th8) {
                                                                                    th = th8;
                                                                                    str5 = str5;
                                                                                    j22 = j20;
                                                                                    j23 = j15;
                                                                                    j24 = j19;
                                                                                }
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                            }
                                                                            j15 = j23;
                                                                            j25 = j24;
                                                                            obj10 = obj9;
                                                                            str10 = str10;
                                                                            url8 = url7;
                                                                            j26 = j22;
                                                                            bVar10 = bVar9;
                                                                            objA5 = ResultKt.a(th);
                                                                            bVar9 = bVar10;
                                                                            url7 = url8;
                                                                            j22 = j26;
                                                                            file17 = file14;
                                                                            obj14 = obj10;
                                                                            obj13 = obj14;
                                                                            j30 = j21;
                                                                            o5Var8 = o5Var8;
                                                                            url7 = url7;
                                                                            bVar9 = bVar9;
                                                                            obj12 = objA5;
                                                                            file19 = file8;
                                                                            file20 = file17;
                                                                            j20 = j22;
                                                                        }
                                                                        if (obj12 instanceof Result.Failure) {
                                                                            thA2 = Result.a(obj12);
                                                                            str13 = str5;
                                                                            za.b(str13 + str10 + " after retry attempt", thA2);
                                                                            nonCancellable3 = NonCancellable.X;
                                                                            fVar = new f(file20, null);
                                                                            eVar.f14716b = obj13;
                                                                            eVar.f14717c = str10;
                                                                            eVar.d = thA2;
                                                                            eVar.f14718e = null;
                                                                            eVar.f = null;
                                                                            eVar.g = null;
                                                                            eVar.f14719h = null;
                                                                            eVar.f14720i = null;
                                                                            eVar.j = null;
                                                                            eVar.r = 10;
                                                                            if (BuildersKt.f(nonCancellable3, fVar, eVar) == coroutineSingletons3) {
                                                                                return coroutineSingletons3;
                                                                            }
                                                                            str14 = str10;
                                                                            iOException = thA2;
                                                                            if (iOException == null) {
                                                                                obj15 = obj13;
                                                                                iOException = new IOException(str13 + str14);
                                                                            }
                                                                            obj15 = obj13;
                                                                            objB2 = ResultKt.a(iOException);
                                                                            obj24 = obj15;
                                                                        } else {
                                                                            if (obj12 instanceof Result.Failure) {
                                                                                obj12 = null;
                                                                            }
                                                                            l2 = (Long) obj12;
                                                                            if (l2 != null) {
                                                                                jLongValue2 = l2.longValue();
                                                                                if (j30 > 0 || jLongValue2 <= 0 || file20.length() >= j30 + jLongValue2) {
                                                                                    jLongValue2 = j15 + jLongValue2;
                                                                                }
                                                                                if (jLongValue2 <= 0) {
                                                                                    str12 = "Downloaded file for ";
                                                                                    za.e(str12 + str10 + " is empty or size is zero.", null, 2, null);
                                                                                    nonCancellable2 = NonCancellable.X;
                                                                                    gVar = new g(file20, null);
                                                                                    eVar.f14716b = obj13;
                                                                                    eVar.f14717c = str10;
                                                                                    eVar.d = null;
                                                                                    eVar.f14718e = null;
                                                                                    eVar.f = null;
                                                                                    eVar.g = null;
                                                                                    eVar.f14719h = null;
                                                                                    eVar.f14720i = null;
                                                                                    eVar.j = null;
                                                                                    eVar.r = 12;
                                                                                    if (BuildersKt.f(nonCancellable2, gVar, eVar) == coroutineSingletons3) {
                                                                                        obj17 = obj13;
                                                                                        return coroutineSingletons3;
                                                                                    }
                                                                                    obj17 = obj13;
                                                                                    objB2 = ResultKt.a(new IOException(str12 + str10 + " is empty."));
                                                                                    obj24 = obj17;
                                                                                } else {
                                                                                    if (j20 != -1 || jLongValue2 >= j20) {
                                                                                        i2 = 0;
                                                                                    } else {
                                                                                        i2 = 1;
                                                                                    }
                                                                                    if (i2 != 0) {
                                                                                        za.a("Partial request for " + j20 + " bytes returned complete file of " + jLongValue2 + " bytes", (Throwable) null, 2, (Object) null);
                                                                                        file22 = file15;
                                                                                    } else {
                                                                                        file22 = file19;
                                                                                    }
                                                                                    j33 = (o5Var8.k.get() + jLongValue2) - j25;
                                                                                    if (j33 > 0) {
                                                                                        za.a(str + j33 + " bytes for " + str10, (Throwable) null, 2, (Object) null);
                                                                                        n3 n3Var = o5Var8.d;
                                                                                        k kVar = o5Var8.new k();
                                                                                        eVar.f14716b = o5Var8;
                                                                                        eVar.f14717c = url7;
                                                                                        eVar.d = bVar9;
                                                                                        eVar.f14718e = obj13;
                                                                                        eVar.f = str10;
                                                                                        eVar.g = file20;
                                                                                        eVar.f14719h = file22;
                                                                                        eVar.f14720i = null;
                                                                                        eVar.j = null;
                                                                                        eVar.k = j20;
                                                                                        eVar.f14721l = j25;
                                                                                        i4 = i2;
                                                                                        eVar.o = i4;
                                                                                        o5Var11 = o5Var8;
                                                                                        url11 = url7;
                                                                                        eVar.m = jLongValue2;
                                                                                        j35 = jLongValue2;
                                                                                        eVar.f14722n = j35;
                                                                                        bVar12 = bVar9;
                                                                                        eVar.r = 13;
                                                                                        objA = n3Var.a(kVar, j33, eVar);
                                                                                        coroutineSingletons4 = coroutineSingletons3;
                                                                                        if (objA != coroutineSingletons4) {
                                                                                            j36 = jLongValue2;
                                                                                            j37 = j35;
                                                                                            str11 = str10;
                                                                                            o5Var12 = o5Var11;
                                                                                            obj20 = obj13;
                                                                                            jLongValue2 = j36;
                                                                                            jLongValue3 = ((Number) objA).longValue();
                                                                                            if (jLongValue3 > 0) {
                                                                                                o5Var12.k.addAndGet(-jLongValue3);
                                                                                                za.a("Freed " + jLongValue3 + " bytes via LRU. New cache size: " + o5Var12.k.get(), (Throwable) null, 2, (Object) null);
                                                                                            }
                                                                                            if (o5Var12.k.get() + jLongValue2 > j25) {
                                                                                                str18 = "Cannot cache ";
                                                                                                za.b(str18 + str11 + ". Not enough space freed.", (Throwable) null, 2, (Object) null);
                                                                                                nonCancellable4 = NonCancellable.X;
                                                                                                hVar = new h(file20, null);
                                                                                                eVar.f14716b = obj20;
                                                                                                eVar.f14717c = str11;
                                                                                                eVar.d = null;
                                                                                                eVar.f14718e = null;
                                                                                                eVar.f = null;
                                                                                                eVar.g = null;
                                                                                                eVar.f14719h = null;
                                                                                                eVar.r = 14;
                                                                                                if (BuildersKt.f(nonCancellable4, hVar, eVar) == coroutineSingletons4) {
                                                                                                    obj21 = obj20;
                                                                                                }
                                                                                                obj21 = obj20;
                                                                                                objB2 = ResultKt.a(new IOException(str18 + str11 + ". Not enough space freed after eviction."));
                                                                                                obj24 = obj21;
                                                                                            } else {
                                                                                                url10 = url11;
                                                                                                i3 = i4;
                                                                                                file23 = file22;
                                                                                                coroutineSingletons3 = coroutineSingletons4;
                                                                                                o5Var10 = o5Var12;
                                                                                                str10 = str11;
                                                                                                j34 = j37;
                                                                                                obj18 = obj20;
                                                                                            }
                                                                                        }
                                                                                        return coroutineSingletons4;
                                                                                    }
                                                                                    bVar12 = bVar9;
                                                                                    o5 o5Var18 = o5Var8;
                                                                                    i3 = i2;
                                                                                    url10 = url7;
                                                                                    j34 = jLongValue2;
                                                                                    file23 = file22;
                                                                                    o5Var10 = o5Var18;
                                                                                    obj18 = obj13;
                                                                                    obj19 = obj18;
                                                                                    bVar14 = bVar12;
                                                                                    j39 = jLongValue2;
                                                                                    try {
                                                                                        o3 o3Var7 = o5Var10.f14696b;
                                                                                        eVar.f14716b = o5Var10;
                                                                                        eVar.f14717c = url10;
                                                                                        eVar.d = bVar14;
                                                                                        eVar.f14718e = obj19;
                                                                                        eVar.f = str10;
                                                                                        eVar.g = file20;
                                                                                        eVar.f14719h = file23;
                                                                                        str16 = str10;
                                                                                        eVar.f14720i = null;
                                                                                        eVar.j = null;
                                                                                        eVar.k = j20;
                                                                                        eVar.o = i3;
                                                                                        eVar.f14721l = j39;
                                                                                        eVar.m = j34;
                                                                                        eVar.r = 15;
                                                                                        objB3 = o3Var7.b(file20, file23, eVar);
                                                                                        coroutineSingletons5 = coroutineSingletons3;
                                                                                        if (objB3 != coroutineSingletons5) {
                                                                                            j40 = j34;
                                                                                            url13 = url10;
                                                                                            file24 = file23;
                                                                                            bVar15 = bVar14;
                                                                                            objA = objB3;
                                                                                            o5Var14 = o5Var10;
                                                                                            j41 = j39;
                                                                                            j42 = j20;
                                                                                            file25 = file20;
                                                                                            str17 = str16;
                                                                                            obj22 = obj19;
                                                                                            try {
                                                                                                if (!((Boolean) objA).booleanValue()) {
                                                                                                    za.b("Failed to finalize data file for " + str17, (Throwable) null, 2, (Object) null);
                                                                                                    nonCancellable5 = NonCancellable.X;
                                                                                                    iVar = new i(file25, null);
                                                                                                    eVar.f14716b = obj22;
                                                                                                    eVar.f14717c = str17;
                                                                                                    eVar.d = null;
                                                                                                    eVar.f14718e = null;
                                                                                                    eVar.f = null;
                                                                                                    eVar.g = null;
                                                                                                    eVar.f14719h = null;
                                                                                                    eVar.r = 16;
                                                                                                    if (BuildersKt.f(nonCancellable5, iVar, eVar) != coroutineSingletons5) {
                                                                                                        obj23 = obj22;
                                                                                                        str21 = str17;
                                                                                                        objB2 = ResultKt.a(new IOException("Failed to finalize cached file for " + str21));
                                                                                                        obj24 = obj23;
                                                                                                    }
                                                                                                } else {
                                                                                                    o5Var14.k.addAndGet(j41);
                                                                                                    if (j42 == -1 && i3 == 0) {
                                                                                                        b bVar16 = new b(0L, j42 - 1, j40, file24, 0L, false, 16, null);
                                                                                                        j46 = j40;
                                                                                                        String string2 = url13.toString();
                                                                                                        Intrinsics.e(string2, str4);
                                                                                                        o5Var14.a(string2, bVar16, bVar16);
                                                                                                        file28 = file24;
                                                                                                        obj19 = obj22;
                                                                                                    } else {
                                                                                                        str19 = str4;
                                                                                                        j43 = j40;
                                                                                                        file26 = file24;
                                                                                                        long jCurrentTimeMillis = System.currentTimeMillis() + ((Number) o5Var14.f14700i.invoke()).longValue();
                                                                                                        String string3 = url13.toString();
                                                                                                        Intrinsics.e(string3, str19);
                                                                                                        l3Var = new l3(string3, jCurrentTimeMillis);
                                                                                                        o3Var = o5Var14.f14696b;
                                                                                                        eVar.f14716b = o5Var14;
                                                                                                        eVar.f14717c = url13;
                                                                                                        eVar.d = bVar15;
                                                                                                        eVar.f14718e = obj22;
                                                                                                        eVar.f = str17;
                                                                                                        eVar.g = file26;
                                                                                                        eVar.f14719h = null;
                                                                                                        eVar.k = j41;
                                                                                                        j44 = j41;
                                                                                                        eVar.f14721l = j43;
                                                                                                        eVar.r = 17;
                                                                                                        if (o3Var.a(url13, l3Var, eVar) != coroutineSingletons5) {
                                                                                                            o5Var15 = o5Var14;
                                                                                                            j45 = j43;
                                                                                                            file27 = file26;
                                                                                                            str20 = str17;
                                                                                                            j41 = j44;
                                                                                                            obj26 = obj22;
                                                                                                            b bVar17 = new b(0L, j45 - 1, j45, file27, 0L, true, 16, null);
                                                                                                            String string4 = url13.toString();
                                                                                                            Intrinsics.e(string4, str19);
                                                                                                            o5Var15.a(string4, bVar17, bVar15);
                                                                                                            str17 = str20;
                                                                                                            o5Var14 = o5Var15;
                                                                                                            j46 = j45;
                                                                                                            file28 = file27;
                                                                                                            obj19 = obj26;
                                                                                                        }
                                                                                                    }
                                                                                                    za.a("Successfully cached " + str17 + " (" + file28.getAbsolutePath() + ", " + j46 + " bytes total, " + j41 + " new). New cache size: " + o5Var14.k.get(), (Throwable) null, 2, (Object) null);
                                                                                                    r11 = obj19;
                                                                                                    obj25 = file28;
                                                                                                    r11.b(null);
                                                                                                    return obj25;
                                                                                                }
                                                                                            } catch (Throwable th10) {
                                                                                                th = th10;
                                                                                                obj = obj22;
                                                                                                r8 = obj;
                                                                                                r8.b(null);
                                                                                                throw th;
                                                                                            }
                                                                                        }
                                                                                        return coroutineSingletons5;
                                                                                    } catch (Throwable th11) {
                                                                                        th = th11;
                                                                                        r8 = obj19;
                                                                                        r8.b(null);
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                za.b("Download result was successful but getOrNull() returned null for " + str10, (Throwable) null, 2, (Object) null);
                                                                                nonCancellable = NonCancellable.X;
                                                                                jVar = new j(file20, null);
                                                                                eVar.f14716b = obj13;
                                                                                eVar.f14717c = str10;
                                                                                eVar.d = null;
                                                                                eVar.f14718e = null;
                                                                                eVar.f = null;
                                                                                eVar.g = null;
                                                                                eVar.f14719h = null;
                                                                                eVar.f14720i = null;
                                                                                eVar.j = null;
                                                                                eVar.r = 11;
                                                                                if (BuildersKt.f(nonCancellable, jVar, eVar) == coroutineSingletons3) {
                                                                                    obj16 = obj13;
                                                                                    return coroutineSingletons3;
                                                                                }
                                                                                obj16 = obj13;
                                                                                objB2 = ResultKt.a(new IOException("Download succeeded but result was null for " + str10));
                                                                                obj24 = obj16;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th12) {
                                                                        th = th12;
                                                                        eVar = eVar2;
                                                                        coroutineSingletons2 = coroutineSingletons6;
                                                                        j14 = j13;
                                                                        j15 = jLongValue5;
                                                                        file8 = file5;
                                                                        file9 = file7;
                                                                        j16 = j52;
                                                                        file10 = file6;
                                                                        bVar8 = bVar7;
                                                                        obj8 = obj27;
                                                                        o5 o5Var19 = o5Var7;
                                                                        objA3 = ResultKt.a(th);
                                                                        String str29 = str8;
                                                                        o5Var8 = o5Var19;
                                                                        bVar9 = bVar8;
                                                                        str10 = str29;
                                                                        j19 = j14;
                                                                        file13 = file10;
                                                                        file14 = file9;
                                                                        j20 = j16;
                                                                        coroutineSingletons3 = coroutineSingletons2;
                                                                        file15 = file2;
                                                                        url7 = url6;
                                                                        j21 = j12;
                                                                        obj9 = obj8;
                                                                    }
                                                                } catch (Throwable th13) {
                                                                    th = th13;
                                                                    url6 = url4;
                                                                    j12 = jLongValue4;
                                                                    file6 = fileA3;
                                                                    file7 = file33;
                                                                }
                                                            } catch (Throwable th14) {
                                                                th = th14;
                                                                j52 = j52;
                                                                url6 = url4;
                                                                j12 = jLongValue4;
                                                                file6 = fileA3;
                                                                file7 = file33;
                                                                j13 = j51;
                                                                coroutineSingletons2 = coroutineSingletons6;
                                                                j14 = j13;
                                                                j15 = jLongValue5;
                                                                file8 = file5;
                                                                file9 = file7;
                                                                j16 = j52;
                                                                file10 = file6;
                                                                bVar8 = bVar7;
                                                                obj8 = obj27;
                                                                o5 o5Var110 = o5Var7;
                                                                objA3 = ResultKt.a(th);
                                                                String str210 = str8;
                                                                o5Var8 = o5Var110;
                                                                bVar9 = bVar8;
                                                                str10 = str210;
                                                                j19 = j14;
                                                                file13 = file10;
                                                                file14 = file9;
                                                                j20 = j16;
                                                                coroutineSingletons3 = coroutineSingletons2;
                                                                file15 = file2;
                                                                url7 = url6;
                                                                j21 = j12;
                                                                obj9 = obj8;
                                                                thA = Result.a(objA3);
                                                                if (thA != null) {
                                                                    StringBuilder sb3 = new StringBuilder(str5);
                                                                    sb3.append(str10);
                                                                    str5 = str5;
                                                                    sb3.append(" (startByte: ");
                                                                    sb3.append(j21);
                                                                    sb3.append(str3);
                                                                    za.b(sb3.toString(), thA);
                                                                    if (j21 <= 0) {
                                                                        bVar9 = bVar9;
                                                                        str10 = str10;
                                                                        o5Var8 = o5Var8;
                                                                        url7 = url7;
                                                                        file14 = file14;
                                                                        j22 = j20;
                                                                        j23 = j15;
                                                                        j24 = j19;
                                                                        throw thA;
                                                                    }
                                                                    bVar9 = bVar9;
                                                                    str10 = str10;
                                                                    o5Var8 = o5Var8;
                                                                    url7 = url7;
                                                                    file14 = file14;
                                                                    j22 = j20;
                                                                    j23 = j15;
                                                                    j24 = j19;
                                                                    throw thA;
                                                                    r11.b(null);
                                                                    return obj25;
                                                                }
                                                                j30 = j21;
                                                                j25 = j19;
                                                                obj12 = objA3;
                                                                file19 = file8;
                                                                file20 = file14;
                                                                coroutineSingletons3 = coroutineSingletons3;
                                                                obj13 = obj9;
                                                                if (obj12 instanceof Result.Failure) {
                                                                    thA2 = Result.a(obj12);
                                                                    str13 = str5;
                                                                    za.b(str13 + str10 + " after retry attempt", thA2);
                                                                    nonCancellable3 = NonCancellable.X;
                                                                    fVar = new f(file20, null);
                                                                    eVar.f14716b = obj13;
                                                                    eVar.f14717c = str10;
                                                                    eVar.d = thA2;
                                                                    eVar.f14718e = null;
                                                                    eVar.f = null;
                                                                    eVar.g = null;
                                                                    eVar.f14719h = null;
                                                                    eVar.f14720i = null;
                                                                    eVar.j = null;
                                                                    eVar.r = 10;
                                                                    if (BuildersKt.f(nonCancellable3, fVar, eVar) == coroutineSingletons3) {
                                                                        return coroutineSingletons3;
                                                                    }
                                                                    str14 = str10;
                                                                    iOException = thA2;
                                                                    if (iOException == null) {
                                                                        obj15 = obj13;
                                                                        iOException = new IOException(str13 + str14);
                                                                    }
                                                                    obj15 = obj13;
                                                                    objB2 = ResultKt.a(iOException);
                                                                    obj24 = obj15;
                                                                    obj25 = objB2;
                                                                    r11 = obj24;
                                                                    r11.b(null);
                                                                    return obj25;
                                                                }
                                                                if (obj12 instanceof Result.Failure) {
                                                                    obj12 = null;
                                                                }
                                                                l2 = (Long) obj12;
                                                                if (l2 != null) {
                                                                    za.b("Download result was successful but getOrNull() returned null for " + str10, (Throwable) null, 2, (Object) null);
                                                                    nonCancellable = NonCancellable.X;
                                                                    jVar = new j(file20, null);
                                                                    eVar.f14716b = obj13;
                                                                    eVar.f14717c = str10;
                                                                    eVar.d = null;
                                                                    eVar.f14718e = null;
                                                                    eVar.f = null;
                                                                    eVar.g = null;
                                                                    eVar.f14719h = null;
                                                                    eVar.f14720i = null;
                                                                    eVar.j = null;
                                                                    eVar.r = 11;
                                                                    if (BuildersKt.f(nonCancellable, jVar, eVar) == coroutineSingletons3) {
                                                                        obj16 = obj13;
                                                                        return coroutineSingletons3;
                                                                    }
                                                                    obj16 = obj13;
                                                                    objB2 = ResultKt.a(new IOException("Download succeeded but result was null for " + str10));
                                                                    obj24 = obj16;
                                                                    obj25 = objB2;
                                                                    r11 = obj24;
                                                                    r11.b(null);
                                                                    return obj25;
                                                                }
                                                                jLongValue2 = l2.longValue();
                                                                if (j30 > 0) {
                                                                    jLongValue2 = j15 + jLongValue2;
                                                                } else {
                                                                    jLongValue2 = j15 + jLongValue2;
                                                                }
                                                                if (jLongValue2 <= 0) {
                                                                    str12 = "Downloaded file for ";
                                                                    za.e(str12 + str10 + " is empty or size is zero.", null, 2, null);
                                                                    nonCancellable2 = NonCancellable.X;
                                                                    gVar = new g(file20, null);
                                                                    eVar.f14716b = obj13;
                                                                    eVar.f14717c = str10;
                                                                    eVar.d = null;
                                                                    eVar.f14718e = null;
                                                                    eVar.f = null;
                                                                    eVar.g = null;
                                                                    eVar.f14719h = null;
                                                                    eVar.f14720i = null;
                                                                    eVar.j = null;
                                                                    eVar.r = 12;
                                                                    if (BuildersKt.f(nonCancellable2, gVar, eVar) == coroutineSingletons3) {
                                                                        obj17 = obj13;
                                                                        return coroutineSingletons3;
                                                                    }
                                                                    obj17 = obj13;
                                                                    objB2 = ResultKt.a(new IOException(str12 + str10 + " is empty."));
                                                                    obj24 = obj17;
                                                                    obj25 = objB2;
                                                                    r11 = obj24;
                                                                    r11.b(null);
                                                                    return obj25;
                                                                }
                                                                if (j20 != -1) {
                                                                    i2 = 0;
                                                                } else {
                                                                    i2 = 0;
                                                                }
                                                                if (i2 != 0) {
                                                                    za.a("Partial request for " + j20 + " bytes returned complete file of " + jLongValue2 + " bytes", (Throwable) null, 2, (Object) null);
                                                                    file22 = file15;
                                                                } else {
                                                                    file22 = file19;
                                                                }
                                                                j33 = (o5Var8.k.get() + jLongValue2) - j25;
                                                                if (j33 > 0) {
                                                                    za.a(str + j33 + " bytes for " + str10, (Throwable) null, 2, (Object) null);
                                                                    n3 n3Var2 = o5Var8.d;
                                                                    k kVar2 = o5Var8.new k();
                                                                    eVar.f14716b = o5Var8;
                                                                    eVar.f14717c = url7;
                                                                    eVar.d = bVar9;
                                                                    eVar.f14718e = obj13;
                                                                    eVar.f = str10;
                                                                    eVar.g = file20;
                                                                    eVar.f14719h = file22;
                                                                    eVar.f14720i = null;
                                                                    eVar.j = null;
                                                                    eVar.k = j20;
                                                                    eVar.f14721l = j25;
                                                                    i4 = i2;
                                                                    eVar.o = i4;
                                                                    o5Var11 = o5Var8;
                                                                    url11 = url7;
                                                                    eVar.m = jLongValue2;
                                                                    j35 = jLongValue2;
                                                                    eVar.f14722n = j35;
                                                                    bVar12 = bVar9;
                                                                    eVar.r = 13;
                                                                    objA = n3Var2.a(kVar2, j33, eVar);
                                                                    coroutineSingletons4 = coroutineSingletons3;
                                                                    if (objA != coroutineSingletons4) {
                                                                        j36 = jLongValue2;
                                                                        j37 = j35;
                                                                        str11 = str10;
                                                                        o5Var12 = o5Var11;
                                                                        obj20 = obj13;
                                                                        jLongValue2 = j36;
                                                                        jLongValue3 = ((Number) objA).longValue();
                                                                        if (jLongValue3 > 0) {
                                                                            o5Var12.k.addAndGet(-jLongValue3);
                                                                            za.a("Freed " + jLongValue3 + " bytes via LRU. New cache size: " + o5Var12.k.get(), (Throwable) null, 2, (Object) null);
                                                                        }
                                                                        if (o5Var12.k.get() + jLongValue2 > j25) {
                                                                            str18 = "Cannot cache ";
                                                                            za.b(str18 + str11 + ". Not enough space freed.", (Throwable) null, 2, (Object) null);
                                                                            nonCancellable4 = NonCancellable.X;
                                                                            hVar = new h(file20, null);
                                                                            eVar.f14716b = obj20;
                                                                            eVar.f14717c = str11;
                                                                            eVar.d = null;
                                                                            eVar.f14718e = null;
                                                                            eVar.f = null;
                                                                            eVar.g = null;
                                                                            eVar.f14719h = null;
                                                                            eVar.r = 14;
                                                                            if (BuildersKt.f(nonCancellable4, hVar, eVar) == coroutineSingletons4) {
                                                                                obj21 = obj20;
                                                                            }
                                                                            obj21 = obj20;
                                                                            objB2 = ResultKt.a(new IOException(str18 + str11 + ". Not enough space freed after eviction."));
                                                                            obj24 = obj21;
                                                                            obj25 = objB2;
                                                                            r11 = obj24;
                                                                            r11.b(null);
                                                                            return obj25;
                                                                        }
                                                                        url10 = url11;
                                                                        i3 = i4;
                                                                        file23 = file22;
                                                                        coroutineSingletons3 = coroutineSingletons4;
                                                                        o5Var10 = o5Var12;
                                                                        str10 = str11;
                                                                        j34 = j37;
                                                                        obj18 = obj20;
                                                                    }
                                                                    return coroutineSingletons4;
                                                                }
                                                                bVar12 = bVar9;
                                                                o5 o5Var111 = o5Var8;
                                                                i3 = i2;
                                                                url10 = url7;
                                                                j34 = jLongValue2;
                                                                file23 = file22;
                                                                o5Var10 = o5Var111;
                                                                obj18 = obj13;
                                                                obj19 = obj18;
                                                                bVar14 = bVar12;
                                                                j39 = jLongValue2;
                                                                o3 o3Var8 = o5Var10.f14696b;
                                                                eVar.f14716b = o5Var10;
                                                                eVar.f14717c = url10;
                                                                eVar.d = bVar14;
                                                                eVar.f14718e = obj19;
                                                                eVar.f = str10;
                                                                eVar.g = file20;
                                                                eVar.f14719h = file23;
                                                                str16 = str10;
                                                                eVar.f14720i = null;
                                                                eVar.j = null;
                                                                eVar.k = j20;
                                                                eVar.o = i3;
                                                                eVar.f14721l = j39;
                                                                eVar.m = j34;
                                                                eVar.r = 15;
                                                                objB3 = o3Var8.b(file20, file23, eVar);
                                                                coroutineSingletons5 = coroutineSingletons3;
                                                                if (objB3 != coroutineSingletons5) {
                                                                    j40 = j34;
                                                                    url13 = url10;
                                                                    file24 = file23;
                                                                    bVar15 = bVar14;
                                                                    objA = objB3;
                                                                    o5Var14 = o5Var10;
                                                                    j41 = j39;
                                                                    j42 = j20;
                                                                    file25 = file20;
                                                                    str17 = str16;
                                                                    obj22 = obj19;
                                                                    if (!((Boolean) objA).booleanValue()) {
                                                                        za.b("Failed to finalize data file for " + str17, (Throwable) null, 2, (Object) null);
                                                                        nonCancellable5 = NonCancellable.X;
                                                                        iVar = new i(file25, null);
                                                                        eVar.f14716b = obj22;
                                                                        eVar.f14717c = str17;
                                                                        eVar.d = null;
                                                                        eVar.f14718e = null;
                                                                        eVar.f = null;
                                                                        eVar.g = null;
                                                                        eVar.f14719h = null;
                                                                        eVar.r = 16;
                                                                        if (BuildersKt.f(nonCancellable5, iVar, eVar) != coroutineSingletons5) {
                                                                            obj23 = obj22;
                                                                            str21 = str17;
                                                                            objB2 = ResultKt.a(new IOException("Failed to finalize cached file for " + str21));
                                                                            obj24 = obj23;
                                                                            obj25 = objB2;
                                                                            r11 = obj24;
                                                                            r11.b(null);
                                                                            return obj25;
                                                                        }
                                                                    } else {
                                                                        o5Var14.k.addAndGet(j41);
                                                                        if (j42 == -1) {
                                                                        }
                                                                        str19 = str4;
                                                                        j43 = j40;
                                                                        file26 = file24;
                                                                        long jCurrentTimeMillis2 = System.currentTimeMillis() + ((Number) o5Var14.f14700i.invoke()).longValue();
                                                                        String string5 = url13.toString();
                                                                        Intrinsics.e(string5, str19);
                                                                        l3Var = new l3(string5, jCurrentTimeMillis2);
                                                                        o3Var = o5Var14.f14696b;
                                                                        eVar.f14716b = o5Var14;
                                                                        eVar.f14717c = url13;
                                                                        eVar.d = bVar15;
                                                                        eVar.f14718e = obj22;
                                                                        eVar.f = str17;
                                                                        eVar.g = file26;
                                                                        eVar.f14719h = null;
                                                                        eVar.k = j41;
                                                                        j44 = j41;
                                                                        eVar.f14721l = j43;
                                                                        eVar.r = 17;
                                                                        if (o3Var.a(url13, l3Var, eVar) != coroutineSingletons5) {
                                                                            o5Var15 = o5Var14;
                                                                            j45 = j43;
                                                                            file27 = file26;
                                                                            str20 = str17;
                                                                            j41 = j44;
                                                                            obj26 = obj22;
                                                                            b bVar18 = new b(0L, j45 - 1, j45, file27, 0L, true, 16, null);
                                                                            String string6 = url13.toString();
                                                                            Intrinsics.e(string6, str19);
                                                                            o5Var15.a(string6, bVar18, bVar15);
                                                                            str17 = str20;
                                                                            o5Var14 = o5Var15;
                                                                            j46 = j45;
                                                                            file28 = file27;
                                                                            obj19 = obj26;
                                                                            za.a("Successfully cached " + str17 + " (" + file28.getAbsolutePath() + ", " + j46 + " bytes total, " + j41 + " new). New cache size: " + o5Var14.k.get(), (Throwable) null, 2, (Object) null);
                                                                            r11 = obj19;
                                                                            obj25 = file28;
                                                                            r11.b(null);
                                                                            return obj25;
                                                                        }
                                                                    }
                                                                }
                                                                return coroutineSingletons5;
                                                            }
                                                        } catch (Throwable th15) {
                                                            th = th15;
                                                            o5Var7 = o5Var4;
                                                            bVar7 = bVar5;
                                                            url6 = url4;
                                                            j12 = jLongValue4;
                                                            file6 = fileA3;
                                                            file7 = file33;
                                                            j13 = j51;
                                                            coroutineSingletons2 = coroutineSingletons6;
                                                            j14 = j13;
                                                            j15 = jLongValue5;
                                                            file8 = file5;
                                                            file9 = file7;
                                                            j16 = j52;
                                                            file10 = file6;
                                                            bVar8 = bVar7;
                                                            obj8 = obj27;
                                                            o5 o5Var112 = o5Var7;
                                                            objA3 = ResultKt.a(th);
                                                            String str211 = str8;
                                                            o5Var8 = o5Var112;
                                                            bVar9 = bVar8;
                                                            str10 = str211;
                                                            j19 = j14;
                                                            file13 = file10;
                                                            file14 = file9;
                                                            j20 = j16;
                                                            coroutineSingletons3 = coroutineSingletons2;
                                                            file15 = file2;
                                                            url7 = url6;
                                                            j21 = j12;
                                                            obj9 = obj8;
                                                            thA = Result.a(objA3);
                                                            if (thA != null) {
                                                                StringBuilder sb4 = new StringBuilder(str5);
                                                                sb4.append(str10);
                                                                str5 = str5;
                                                                sb4.append(" (startByte: ");
                                                                sb4.append(j21);
                                                                sb4.append(str3);
                                                                za.b(sb4.toString(), thA);
                                                                if (j21 <= 0) {
                                                                    bVar9 = bVar9;
                                                                    str10 = str10;
                                                                    o5Var8 = o5Var8;
                                                                    url7 = url7;
                                                                    file14 = file14;
                                                                    j22 = j20;
                                                                    j23 = j15;
                                                                    j24 = j19;
                                                                    throw thA;
                                                                }
                                                                bVar9 = bVar9;
                                                                str10 = str10;
                                                                o5Var8 = o5Var8;
                                                                url7 = url7;
                                                                file14 = file14;
                                                                j22 = j20;
                                                                j23 = j15;
                                                                j24 = j19;
                                                                throw thA;
                                                                r11.b(null);
                                                                return obj25;
                                                            }
                                                            j30 = j21;
                                                            j25 = j19;
                                                            obj12 = objA3;
                                                            file19 = file8;
                                                            file20 = file14;
                                                            coroutineSingletons3 = coroutineSingletons3;
                                                            obj13 = obj9;
                                                            if (obj12 instanceof Result.Failure) {
                                                                thA2 = Result.a(obj12);
                                                                str13 = str5;
                                                                za.b(str13 + str10 + " after retry attempt", thA2);
                                                                nonCancellable3 = NonCancellable.X;
                                                                fVar = new f(file20, null);
                                                                eVar.f14716b = obj13;
                                                                eVar.f14717c = str10;
                                                                eVar.d = thA2;
                                                                eVar.f14718e = null;
                                                                eVar.f = null;
                                                                eVar.g = null;
                                                                eVar.f14719h = null;
                                                                eVar.f14720i = null;
                                                                eVar.j = null;
                                                                eVar.r = 10;
                                                                if (BuildersKt.f(nonCancellable3, fVar, eVar) == coroutineSingletons3) {
                                                                    return coroutineSingletons3;
                                                                }
                                                                str14 = str10;
                                                                iOException = thA2;
                                                                if (iOException == null) {
                                                                    obj15 = obj13;
                                                                    iOException = new IOException(str13 + str14);
                                                                }
                                                                obj15 = obj13;
                                                                objB2 = ResultKt.a(iOException);
                                                                obj24 = obj15;
                                                                obj25 = objB2;
                                                                r11 = obj24;
                                                                r11.b(null);
                                                                return obj25;
                                                            }
                                                            if (obj12 instanceof Result.Failure) {
                                                                obj12 = null;
                                                            }
                                                            l2 = (Long) obj12;
                                                            if (l2 != null) {
                                                                za.b("Download result was successful but getOrNull() returned null for " + str10, (Throwable) null, 2, (Object) null);
                                                                nonCancellable = NonCancellable.X;
                                                                jVar = new j(file20, null);
                                                                eVar.f14716b = obj13;
                                                                eVar.f14717c = str10;
                                                                eVar.d = null;
                                                                eVar.f14718e = null;
                                                                eVar.f = null;
                                                                eVar.g = null;
                                                                eVar.f14719h = null;
                                                                eVar.f14720i = null;
                                                                eVar.j = null;
                                                                eVar.r = 11;
                                                                if (BuildersKt.f(nonCancellable, jVar, eVar) == coroutineSingletons3) {
                                                                    obj16 = obj13;
                                                                    return coroutineSingletons3;
                                                                }
                                                                obj16 = obj13;
                                                                objB2 = ResultKt.a(new IOException("Download succeeded but result was null for " + str10));
                                                                obj24 = obj16;
                                                                obj25 = objB2;
                                                                r11 = obj24;
                                                                r11.b(null);
                                                                return obj25;
                                                            }
                                                            jLongValue2 = l2.longValue();
                                                            if (j30 > 0) {
                                                                jLongValue2 = j15 + jLongValue2;
                                                            } else {
                                                                jLongValue2 = j15 + jLongValue2;
                                                            }
                                                            if (jLongValue2 <= 0) {
                                                                str12 = "Downloaded file for ";
                                                                za.e(str12 + str10 + " is empty or size is zero.", null, 2, null);
                                                                nonCancellable2 = NonCancellable.X;
                                                                gVar = new g(file20, null);
                                                                eVar.f14716b = obj13;
                                                                eVar.f14717c = str10;
                                                                eVar.d = null;
                                                                eVar.f14718e = null;
                                                                eVar.f = null;
                                                                eVar.g = null;
                                                                eVar.f14719h = null;
                                                                eVar.f14720i = null;
                                                                eVar.j = null;
                                                                eVar.r = 12;
                                                                if (BuildersKt.f(nonCancellable2, gVar, eVar) == coroutineSingletons3) {
                                                                    obj17 = obj13;
                                                                    return coroutineSingletons3;
                                                                }
                                                                obj17 = obj13;
                                                                objB2 = ResultKt.a(new IOException(str12 + str10 + " is empty."));
                                                                obj24 = obj17;
                                                                obj25 = objB2;
                                                                r11 = obj24;
                                                                r11.b(null);
                                                                return obj25;
                                                            }
                                                            if (j20 != -1) {
                                                                i2 = 0;
                                                            } else {
                                                                i2 = 0;
                                                            }
                                                            if (i2 != 0) {
                                                                za.a("Partial request for " + j20 + " bytes returned complete file of " + jLongValue2 + " bytes", (Throwable) null, 2, (Object) null);
                                                                file22 = file15;
                                                            } else {
                                                                file22 = file19;
                                                            }
                                                            j33 = (o5Var8.k.get() + jLongValue2) - j25;
                                                            if (j33 > 0) {
                                                                za.a(str + j33 + " bytes for " + str10, (Throwable) null, 2, (Object) null);
                                                                n3 n3Var3 = o5Var8.d;
                                                                k kVar3 = o5Var8.new k();
                                                                eVar.f14716b = o5Var8;
                                                                eVar.f14717c = url7;
                                                                eVar.d = bVar9;
                                                                eVar.f14718e = obj13;
                                                                eVar.f = str10;
                                                                eVar.g = file20;
                                                                eVar.f14719h = file22;
                                                                eVar.f14720i = null;
                                                                eVar.j = null;
                                                                eVar.k = j20;
                                                                eVar.f14721l = j25;
                                                                i4 = i2;
                                                                eVar.o = i4;
                                                                o5Var11 = o5Var8;
                                                                url11 = url7;
                                                                eVar.m = jLongValue2;
                                                                j35 = jLongValue2;
                                                                eVar.f14722n = j35;
                                                                bVar12 = bVar9;
                                                                eVar.r = 13;
                                                                objA = n3Var3.a(kVar3, j33, eVar);
                                                                coroutineSingletons4 = coroutineSingletons3;
                                                                if (objA != coroutineSingletons4) {
                                                                    j36 = jLongValue2;
                                                                    j37 = j35;
                                                                    str11 = str10;
                                                                    o5Var12 = o5Var11;
                                                                    obj20 = obj13;
                                                                    jLongValue2 = j36;
                                                                    jLongValue3 = ((Number) objA).longValue();
                                                                    if (jLongValue3 > 0) {
                                                                        o5Var12.k.addAndGet(-jLongValue3);
                                                                        za.a("Freed " + jLongValue3 + " bytes via LRU. New cache size: " + o5Var12.k.get(), (Throwable) null, 2, (Object) null);
                                                                    }
                                                                    if (o5Var12.k.get() + jLongValue2 > j25) {
                                                                        str18 = "Cannot cache ";
                                                                        za.b(str18 + str11 + ". Not enough space freed.", (Throwable) null, 2, (Object) null);
                                                                        nonCancellable4 = NonCancellable.X;
                                                                        hVar = new h(file20, null);
                                                                        eVar.f14716b = obj20;
                                                                        eVar.f14717c = str11;
                                                                        eVar.d = null;
                                                                        eVar.f14718e = null;
                                                                        eVar.f = null;
                                                                        eVar.g = null;
                                                                        eVar.f14719h = null;
                                                                        eVar.r = 14;
                                                                        if (BuildersKt.f(nonCancellable4, hVar, eVar) == coroutineSingletons4) {
                                                                            obj21 = obj20;
                                                                        }
                                                                        obj21 = obj20;
                                                                        objB2 = ResultKt.a(new IOException(str18 + str11 + ". Not enough space freed after eviction."));
                                                                        obj24 = obj21;
                                                                        obj25 = objB2;
                                                                        r11 = obj24;
                                                                        r11.b(null);
                                                                        return obj25;
                                                                    }
                                                                    url10 = url11;
                                                                    i3 = i4;
                                                                    file23 = file22;
                                                                    coroutineSingletons3 = coroutineSingletons4;
                                                                    o5Var10 = o5Var12;
                                                                    str10 = str11;
                                                                    j34 = j37;
                                                                    obj18 = obj20;
                                                                }
                                                                return coroutineSingletons4;
                                                            }
                                                            bVar12 = bVar9;
                                                            o5 o5Var113 = o5Var8;
                                                            i3 = i2;
                                                            url10 = url7;
                                                            j34 = jLongValue2;
                                                            file23 = file22;
                                                            o5Var10 = o5Var113;
                                                            obj18 = obj13;
                                                            obj19 = obj18;
                                                            bVar14 = bVar12;
                                                            j39 = jLongValue2;
                                                            o3 o3Var9 = o5Var10.f14696b;
                                                            eVar.f14716b = o5Var10;
                                                            eVar.f14717c = url10;
                                                            eVar.d = bVar14;
                                                            eVar.f14718e = obj19;
                                                            eVar.f = str10;
                                                            eVar.g = file20;
                                                            eVar.f14719h = file23;
                                                            str16 = str10;
                                                            eVar.f14720i = null;
                                                            eVar.j = null;
                                                            eVar.k = j20;
                                                            eVar.o = i3;
                                                            eVar.f14721l = j39;
                                                            eVar.m = j34;
                                                            eVar.r = 15;
                                                            objB3 = o3Var9.b(file20, file23, eVar);
                                                            coroutineSingletons5 = coroutineSingletons3;
                                                            if (objB3 != coroutineSingletons5) {
                                                                j40 = j34;
                                                                url13 = url10;
                                                                file24 = file23;
                                                                bVar15 = bVar14;
                                                                objA = objB3;
                                                                o5Var14 = o5Var10;
                                                                j41 = j39;
                                                                j42 = j20;
                                                                file25 = file20;
                                                                str17 = str16;
                                                                obj22 = obj19;
                                                                if (!((Boolean) objA).booleanValue()) {
                                                                    za.b("Failed to finalize data file for " + str17, (Throwable) null, 2, (Object) null);
                                                                    nonCancellable5 = NonCancellable.X;
                                                                    iVar = new i(file25, null);
                                                                    eVar.f14716b = obj22;
                                                                    eVar.f14717c = str17;
                                                                    eVar.d = null;
                                                                    eVar.f14718e = null;
                                                                    eVar.f = null;
                                                                    eVar.g = null;
                                                                    eVar.f14719h = null;
                                                                    eVar.r = 16;
                                                                    if (BuildersKt.f(nonCancellable5, iVar, eVar) != coroutineSingletons5) {
                                                                        obj23 = obj22;
                                                                        str21 = str17;
                                                                        objB2 = ResultKt.a(new IOException("Failed to finalize cached file for " + str21));
                                                                        obj24 = obj23;
                                                                        obj25 = objB2;
                                                                        r11 = obj24;
                                                                        r11.b(null);
                                                                        return obj25;
                                                                    }
                                                                } else {
                                                                    o5Var14.k.addAndGet(j41);
                                                                    if (j42 == -1) {
                                                                    }
                                                                    str19 = str4;
                                                                    j43 = j40;
                                                                    file26 = file24;
                                                                    long jCurrentTimeMillis3 = System.currentTimeMillis() + ((Number) o5Var14.f14700i.invoke()).longValue();
                                                                    String string7 = url13.toString();
                                                                    Intrinsics.e(string7, str19);
                                                                    l3Var = new l3(string7, jCurrentTimeMillis3);
                                                                    o3Var = o5Var14.f14696b;
                                                                    eVar.f14716b = o5Var14;
                                                                    eVar.f14717c = url13;
                                                                    eVar.d = bVar15;
                                                                    eVar.f14718e = obj22;
                                                                    eVar.f = str17;
                                                                    eVar.g = file26;
                                                                    eVar.f14719h = null;
                                                                    eVar.k = j41;
                                                                    j44 = j41;
                                                                    eVar.f14721l = j43;
                                                                    eVar.r = 17;
                                                                    if (o3Var.a(url13, l3Var, eVar) != coroutineSingletons5) {
                                                                        o5Var15 = o5Var14;
                                                                        j45 = j43;
                                                                        file27 = file26;
                                                                        str20 = str17;
                                                                        j41 = j44;
                                                                        obj26 = obj22;
                                                                        b bVar19 = new b(0L, j45 - 1, j45, file27, 0L, true, 16, null);
                                                                        String string8 = url13.toString();
                                                                        Intrinsics.e(string8, str19);
                                                                        o5Var15.a(string8, bVar19, bVar15);
                                                                        str17 = str20;
                                                                        o5Var14 = o5Var15;
                                                                        j46 = j45;
                                                                        file28 = file27;
                                                                        obj19 = obj26;
                                                                        za.a("Successfully cached " + str17 + " (" + file28.getAbsolutePath() + ", " + j46 + " bytes total, " + j41 + " new). New cache size: " + o5Var14.k.get(), (Throwable) null, 2, (Object) null);
                                                                        r11 = obj19;
                                                                        obj25 = file28;
                                                                        r11.b(null);
                                                                        return obj25;
                                                                    }
                                                                }
                                                            }
                                                            return coroutineSingletons5;
                                                        }
                                                    } catch (Throwable th16) {
                                                        th = th16;
                                                        file5 = file32;
                                                    }
                                                } else {
                                                    za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                    StringBuilder sb5 = new StringBuilder("Cache directory not available for ");
                                                    sb5.append(str8);
                                                    objB2 = ResultKt.a(new IOException(sb5.toString()));
                                                    obj24 = obj27;
                                                }
                                                break;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                            r11.b(null);
                                            return obj25;
                                        }
                                    }
                                } catch (Throwable th17) {
                                    th = th17;
                                    r8 = obj;
                                    r8.b(null);
                                    throw th;
                                }
                            }
                            return coroutineSingletons;
                        case 1:
                            long j54 = eVar.f14721l;
                            long j55 = eVar.k;
                            Mutex mutex5 = (Mutex) eVar.f14718e;
                            bVar2 = (b) eVar.d;
                            URL url14 = (URL) eVar.f14717c;
                            o5 o5Var20 = (o5) eVar.f14716b;
                            ResultKt.b(objA);
                            url2 = url14;
                            o5Var = o5Var20;
                            obj = mutex5;
                            j4 = j55;
                            str6 = "Resuming download for ";
                            j3 = j54;
                            string = url2.toString();
                            Intrinsics.e(string, "toString(...)");
                            if (j4 == -1) {
                                string = string + "_" + j4;
                            }
                            if (bVar2 == null) {
                                fileA = o5Var.f14696b.a(url2);
                                o3 o3Var10 = o5Var.f14696b;
                                eVar.f14716b = o5Var;
                                eVar.f14717c = url2;
                                eVar.d = bVar2;
                                eVar.f14718e = obj;
                                eVar.f = string;
                                eVar.g = fileA;
                                eVar.k = j4;
                                eVar.f14721l = j3;
                                o5Var2 = o5Var;
                                eVar.r = 3;
                                objB = o3Var10.b(url2, eVar);
                                if (objB != coroutineSingletons) {
                                    bVar3 = bVar2;
                                    j5 = j4;
                                    fileA2 = fileA;
                                    str7 = string;
                                    j6 = j3;
                                    url3 = url2;
                                    objA = objB;
                                    o5Var3 = o5Var2;
                                    obj3 = obj;
                                    l3 l3Var3 = (l3) objA;
                                    if (j5 == -1) {
                                        if (j5 != -1) {
                                            fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                                        }
                                        if (!fileA2.exists()) {
                                            if (j5 == -1) {
                                            }
                                            File file210 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file210;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j56 = o5Var4.f14699h;
                                                StringBuilder sb6 = new StringBuilder(str25);
                                                sb6.append(str8);
                                                String str212 = str22;
                                                sb6.append(str212);
                                                sb6.append(j56);
                                                za.e(sb6.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str212 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb7 = new StringBuilder("Cache directory not available for ");
                                                sb7.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb7.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        } else {
                                            if (j5 == -1) {
                                            }
                                            File file211 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file211;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j57 = o5Var4.f14699h;
                                                StringBuilder sb8 = new StringBuilder(str25);
                                                sb8.append(str8);
                                                String str213 = str22;
                                                sb8.append(str213);
                                                sb8.append(j57);
                                                za.e(sb8.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str213 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb9 = new StringBuilder("Cache directory not available for ");
                                                sb9.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb9.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        }
                                    } else {
                                        if (j5 != -1) {
                                            fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                                        }
                                        if (!fileA2.exists()) {
                                            if (j5 == -1) {
                                            }
                                            File file212 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file212;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j58 = o5Var4.f14699h;
                                                StringBuilder sb10 = new StringBuilder(str25);
                                                sb10.append(str8);
                                                String str214 = str22;
                                                sb10.append(str214);
                                                sb10.append(j58);
                                                za.e(sb10.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str214 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb11 = new StringBuilder("Cache directory not available for ");
                                                sb11.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb11.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        } else {
                                            if (j5 == -1) {
                                            }
                                            File file213 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file213;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j59 = o5Var4.f14699h;
                                                StringBuilder sb12 = new StringBuilder(str25);
                                                sb12.append(str8);
                                                String str215 = str22;
                                                sb12.append(str215);
                                                sb12.append(j59);
                                                za.e(sb12.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str215 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb13 = new StringBuilder("Cache directory not available for ");
                                                sb13.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb13.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        }
                                    }
                                    r11.b(null);
                                    return obj25;
                                }
                            } else {
                                fileA = o5Var.f14696b.a(url2);
                                o3 o3Var11 = o5Var.f14696b;
                                eVar.f14716b = o5Var;
                                eVar.f14717c = url2;
                                eVar.d = bVar2;
                                eVar.f14718e = obj;
                                eVar.f = string;
                                eVar.g = fileA;
                                eVar.k = j4;
                                eVar.f14721l = j3;
                                o5Var2 = o5Var;
                                eVar.r = 3;
                                objB = o3Var11.b(url2, eVar);
                                if (objB != coroutineSingletons) {
                                    bVar3 = bVar2;
                                    j5 = j4;
                                    fileA2 = fileA;
                                    str7 = string;
                                    j6 = j3;
                                    url3 = url2;
                                    objA = objB;
                                    o5Var3 = o5Var2;
                                    obj3 = obj;
                                    l3 l3Var4 = (l3) objA;
                                    if (j5 == -1) {
                                        if (j5 != -1) {
                                            fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                                        }
                                        if (!fileA2.exists()) {
                                            if (j5 == -1) {
                                            }
                                            File file214 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file214;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j510 = o5Var4.f14699h;
                                                StringBuilder sb14 = new StringBuilder(str25);
                                                sb14.append(str8);
                                                String str216 = str22;
                                                sb14.append(str216);
                                                sb14.append(j510);
                                                za.e(sb14.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str216 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb15 = new StringBuilder("Cache directory not available for ");
                                                sb15.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb15.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        } else {
                                            if (j5 == -1) {
                                            }
                                            File file215 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file215;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j511 = o5Var4.f14699h;
                                                StringBuilder sb16 = new StringBuilder(str25);
                                                sb16.append(str8);
                                                String str217 = str22;
                                                sb16.append(str217);
                                                sb16.append(j511);
                                                za.e(sb16.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str217 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb17 = new StringBuilder("Cache directory not available for ");
                                                sb17.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb17.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        }
                                    } else {
                                        if (j5 != -1) {
                                            fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                                        }
                                        if (!fileA2.exists()) {
                                            if (j5 == -1) {
                                            }
                                            File file216 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file216;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j512 = o5Var4.f14699h;
                                                StringBuilder sb18 = new StringBuilder(str25);
                                                sb18.append(str8);
                                                String str218 = str22;
                                                sb18.append(str218);
                                                sb18.append(j512);
                                                za.e(sb18.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str218 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb19 = new StringBuilder("Cache directory not available for ");
                                                sb19.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb19.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        } else {
                                            if (j5 == -1) {
                                            }
                                            File file217 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file217;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j513 = o5Var4.f14699h;
                                                StringBuilder sb110 = new StringBuilder(str25);
                                                sb110.append(str8);
                                                String str219 = str22;
                                                sb110.append(str219);
                                                sb110.append(j513);
                                                za.e(sb110.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str219 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb111 = new StringBuilder("Cache directory not available for ");
                                                sb111.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb111.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        }
                                    }
                                    r11.b(null);
                                    return obj25;
                                }
                            }
                            return coroutineSingletons;
                        case 2:
                            Mutex mutex6 = (Mutex) eVar.f14717c;
                            bVar4 = (b) eVar.f14716b;
                            ResultKt.b(objA);
                            obj2 = mutex6;
                            objB2 = bVar4.b();
                            obj24 = obj2;
                            obj25 = objB2;
                            r11 = obj24;
                            r11.b(null);
                            return obj25;
                        case 3:
                            str23 = "temp_";
                            long j60 = eVar.f14721l;
                            long j61 = eVar.k;
                            File file35 = (File) eVar.g;
                            String str30 = (String) eVar.f;
                            mutex2 = (Mutex) eVar.f14718e;
                            b bVar20 = (b) eVar.d;
                            URL url15 = (URL) eVar.f14717c;
                            o5 o5Var21 = (o5) eVar.f14716b;
                            try {
                                ResultKt.b(objA);
                                o5Var3 = o5Var21;
                                str4 = "toString(...)";
                                bVar3 = bVar20;
                                str7 = str30;
                                j5 = j61;
                                str25 = "Not enough free disk space to attempt download for ";
                                str6 = "Resuming download for ";
                                j6 = j60;
                                obj3 = mutex2;
                                str22 = ". Required: ";
                                str24 = "Not enough free space on device for ";
                                fileA2 = file35;
                                url3 = url15;
                                l3 l3Var5 = (l3) objA;
                                if (j5 == -1) {
                                    if (j5 != -1) {
                                        fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                                    }
                                    if (!fileA2.exists()) {
                                        if (j5 == -1) {
                                        }
                                        File file218 = fileA2;
                                        coroutineSingletons = coroutineSingletons;
                                        obj27 = obj3;
                                        file = fileA2;
                                        url4 = url3;
                                        bVar5 = bVar3;
                                        j7 = j5;
                                        o5Var4 = o5Var3;
                                        file2 = file218;
                                        str8 = str7;
                                        j8 = j6;
                                        if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                            long j514 = o5Var4.f14699h;
                                            StringBuilder sb112 = new StringBuilder(str25);
                                            sb112.append(str8);
                                            String str2110 = str22;
                                            sb112.append(str2110);
                                            sb112.append(j514);
                                            za.e(sb112.toString(), null, 2, null);
                                            objB2 = ResultKt.a(new IOException(str24 + str8 + str2110 + o5Var4.f14699h));
                                            obj24 = obj27;
                                        } else {
                                            fileA3 = o5Var4.f14696b.a();
                                            if (fileA3 == null) {
                                            }
                                            za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                            StringBuilder sb113 = new StringBuilder("Cache directory not available for ");
                                            sb113.append(str8);
                                            objB2 = ResultKt.a(new IOException(sb113.toString()));
                                            obj24 = obj27;
                                        }
                                        obj25 = objB2;
                                        r11 = obj24;
                                    } else {
                                        if (j5 == -1) {
                                        }
                                        File file219 = fileA2;
                                        coroutineSingletons = coroutineSingletons;
                                        obj27 = obj3;
                                        file = fileA2;
                                        url4 = url3;
                                        bVar5 = bVar3;
                                        j7 = j5;
                                        o5Var4 = o5Var3;
                                        file2 = file219;
                                        str8 = str7;
                                        j8 = j6;
                                        if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                            long j515 = o5Var4.f14699h;
                                            StringBuilder sb114 = new StringBuilder(str25);
                                            sb114.append(str8);
                                            String str2111 = str22;
                                            sb114.append(str2111);
                                            sb114.append(j515);
                                            za.e(sb114.toString(), null, 2, null);
                                            objB2 = ResultKt.a(new IOException(str24 + str8 + str2111 + o5Var4.f14699h));
                                            obj24 = obj27;
                                        } else {
                                            fileA3 = o5Var4.f14696b.a();
                                            if (fileA3 == null) {
                                            }
                                            za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                            StringBuilder sb115 = new StringBuilder("Cache directory not available for ");
                                            sb115.append(str8);
                                            objB2 = ResultKt.a(new IOException(sb115.toString()));
                                            obj24 = obj27;
                                        }
                                        obj25 = objB2;
                                        r11 = obj24;
                                    }
                                } else {
                                    if (j5 != -1) {
                                        fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                                    }
                                    if (!fileA2.exists()) {
                                        if (j5 == -1) {
                                        }
                                        File file2110 = fileA2;
                                        coroutineSingletons = coroutineSingletons;
                                        obj27 = obj3;
                                        file = fileA2;
                                        url4 = url3;
                                        bVar5 = bVar3;
                                        j7 = j5;
                                        o5Var4 = o5Var3;
                                        file2 = file2110;
                                        str8 = str7;
                                        j8 = j6;
                                        if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                            long j516 = o5Var4.f14699h;
                                            StringBuilder sb116 = new StringBuilder(str25);
                                            sb116.append(str8);
                                            String str2112 = str22;
                                            sb116.append(str2112);
                                            sb116.append(j516);
                                            za.e(sb116.toString(), null, 2, null);
                                            objB2 = ResultKt.a(new IOException(str24 + str8 + str2112 + o5Var4.f14699h));
                                            obj24 = obj27;
                                        } else {
                                            fileA3 = o5Var4.f14696b.a();
                                            if (fileA3 == null) {
                                            }
                                            za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                            StringBuilder sb117 = new StringBuilder("Cache directory not available for ");
                                            sb117.append(str8);
                                            objB2 = ResultKt.a(new IOException(sb117.toString()));
                                            obj24 = obj27;
                                        }
                                        obj25 = objB2;
                                        r11 = obj24;
                                    } else {
                                        if (j5 == -1) {
                                        }
                                        File file2111 = fileA2;
                                        coroutineSingletons = coroutineSingletons;
                                        obj27 = obj3;
                                        file = fileA2;
                                        url4 = url3;
                                        bVar5 = bVar3;
                                        j7 = j5;
                                        o5Var4 = o5Var3;
                                        file2 = file2111;
                                        str8 = str7;
                                        j8 = j6;
                                        if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                            long j517 = o5Var4.f14699h;
                                            StringBuilder sb118 = new StringBuilder(str25);
                                            sb118.append(str8);
                                            String str2113 = str22;
                                            sb118.append(str2113);
                                            sb118.append(j517);
                                            za.e(sb118.toString(), null, 2, null);
                                            objB2 = ResultKt.a(new IOException(str24 + str8 + str2113 + o5Var4.f14699h));
                                            obj24 = obj27;
                                        } else {
                                            fileA3 = o5Var4.f14696b.a();
                                            if (fileA3 == null) {
                                            }
                                            za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                            StringBuilder sb119 = new StringBuilder("Cache directory not available for ");
                                            sb119.append(str8);
                                            objB2 = ResultKt.a(new IOException(sb119.toString()));
                                            obj24 = obj27;
                                        }
                                        obj25 = objB2;
                                        r11 = obj24;
                                    }
                                }
                                r11.b(null);
                                return obj25;
                            } catch (Throwable th18) {
                                th = th18;
                                r8 = mutex2;
                                r8.b(null);
                                throw th;
                            }
                        case 4:
                            fileA2 = (File) eVar.f14717c;
                            Mutex mutex7 = (Mutex) eVar.f14716b;
                            ResultKt.b(objA);
                            obj4 = mutex7;
                            objB2 = fileA2;
                            obj24 = obj4;
                            obj25 = objB2;
                            r11 = obj24;
                            r11.b(null);
                            return obj25;
                        case 5:
                            fileA2 = (File) eVar.f14717c;
                            Mutex mutex8 = (Mutex) eVar.f14716b;
                            ResultKt.b(objA);
                            obj4 = mutex8;
                            objB2 = fileA2;
                            obj24 = obj4;
                            obj25 = objB2;
                            r11 = obj24;
                            r11.b(null);
                            return obj25;
                        case 6:
                            long j62 = eVar.m;
                            long j63 = eVar.f14721l;
                            long j64 = eVar.k;
                            File file36 = (File) eVar.f14719h;
                            File file37 = (File) eVar.g;
                            file3 = file36;
                            String str31 = (String) eVar.f;
                            mutex3 = (Mutex) eVar.f14718e;
                            b bVar21 = (b) eVar.d;
                            URL url16 = (URL) eVar.f14717c;
                            o5Var5 = (o5) eVar.f14716b;
                            try {
                                ResultKt.b(objA);
                                str26 = "Expired file ";
                                str4 = "toString(...)";
                                str2 = "_";
                                j9 = j63;
                                str7 = str31;
                                obj5 = mutex3;
                                bVar6 = bVar21;
                                str22 = ". Required: ";
                                str24 = "Not enough free space on device for ";
                                url5 = url16;
                                str23 = "temp_";
                                file2 = file37;
                                j11 = j62;
                                str6 = "Resuming download for ";
                                str25 = "Not enough free disk space to attempt download for ";
                                j10 = j64;
                                file4 = file3;
                                if (((Boolean) objA).booleanValue()) {
                                    if (j11 > 0) {
                                        o5Var5.k.addAndGet(-j11);
                                    }
                                    m3Var = o5Var5.f14698e;
                                    s7Var = s7.TTL_EXPIRED;
                                    eVar.f14716b = o5Var5;
                                    eVar.f14717c = url5;
                                    eVar.d = bVar6;
                                    eVar.f14718e = obj5;
                                    eVar.f = str7;
                                    eVar.g = file2;
                                    eVar.f14719h = file4;
                                    eVar.k = j10;
                                    j8 = j9;
                                    eVar.f14721l = j8;
                                    eVar.r = 7;
                                    if (m3Var.a(url5, s7Var, eVar) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    o5Var6 = o5Var5;
                                    str9 = str7;
                                    obj7 = obj5;
                                    File file38 = file4;
                                    za.a(str26 + str9 + " evicted. New size: " + o5Var6.k.get(), (Throwable) null, 2, (Object) null);
                                    o5Var4 = o5Var6;
                                    url4 = url5;
                                    Object obj210 = obj7;
                                    file = file38;
                                    long j410 = j10;
                                    bVar5 = bVar6;
                                    j7 = j410;
                                    str8 = str9;
                                    obj27 = obj210;
                                } else {
                                    j8 = j9;
                                    Object obj211 = obj5;
                                    file = file4;
                                    o5Var4 = o5Var5;
                                    obj27 = obj211;
                                    url4 = url5;
                                    long j411 = j10;
                                    bVar5 = bVar6;
                                    j7 = j411;
                                    str8 = str7;
                                }
                                if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                    long j518 = o5Var4.f14699h;
                                    StringBuilder sb1110 = new StringBuilder(str25);
                                    sb1110.append(str8);
                                    String str2114 = str22;
                                    sb1110.append(str2114);
                                    sb1110.append(j518);
                                    za.e(sb1110.toString(), null, 2, null);
                                    objB2 = ResultKt.a(new IOException(str24 + str8 + str2114 + o5Var4.f14699h));
                                    obj24 = obj27;
                                } else {
                                    fileA3 = o5Var4.f14696b.a();
                                    if (fileA3 == null) {
                                    }
                                    za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                    StringBuilder sb1111 = new StringBuilder("Cache directory not available for ");
                                    sb1111.append(str8);
                                    objB2 = ResultKt.a(new IOException(sb1111.toString()));
                                    obj24 = obj27;
                                }
                                obj25 = objB2;
                                r11 = obj24;
                                r11.b(null);
                                return obj25;
                            } catch (Throwable th19) {
                                th = th19;
                                r8 = mutex3;
                                r8.b(null);
                                throw th;
                            }
                        case 7:
                            long j65 = eVar.f14721l;
                            long j66 = eVar.k;
                            File file39 = (File) eVar.f14719h;
                            File file40 = (File) eVar.g;
                            String str32 = (String) eVar.f;
                            mutex3 = (Mutex) eVar.f14718e;
                            b bVar22 = (b) eVar.d;
                            URL url17 = (URL) eVar.f14717c;
                            o5 o5Var22 = (o5) eVar.f14716b;
                            try {
                                ResultKt.b(objA);
                                file4 = file39;
                                str6 = "Resuming download for ";
                                str25 = "Not enough free disk space to attempt download for ";
                                str26 = "Expired file ";
                                o5Var6 = o5Var22;
                                str4 = "toString(...)";
                                str2 = "_";
                                str9 = str32;
                                bVar6 = bVar22;
                                obj7 = mutex3;
                                str22 = ". Required: ";
                                str24 = "Not enough free space on device for ";
                                j10 = j66;
                                url5 = url17;
                                str23 = "temp_";
                                file2 = file40;
                                coroutineSingletons = coroutineSingletons;
                                j8 = j65;
                                File file310 = file4;
                                za.a(str26 + str9 + " evicted. New size: " + o5Var6.k.get(), (Throwable) null, 2, (Object) null);
                                o5Var4 = o5Var6;
                                url4 = url5;
                                Object obj212 = obj7;
                                file = file310;
                                long j412 = j10;
                                bVar5 = bVar6;
                                j7 = j412;
                                str8 = str9;
                                obj27 = obj212;
                                if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                    long j519 = o5Var4.f14699h;
                                    StringBuilder sb1112 = new StringBuilder(str25);
                                    sb1112.append(str8);
                                    String str2115 = str22;
                                    sb1112.append(str2115);
                                    sb1112.append(j519);
                                    za.e(sb1112.toString(), null, 2, null);
                                    objB2 = ResultKt.a(new IOException(str24 + str8 + str2115 + o5Var4.f14699h));
                                    obj24 = obj27;
                                } else {
                                    fileA3 = o5Var4.f14696b.a();
                                    if (fileA3 == null) {
                                    }
                                    za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                    StringBuilder sb1113 = new StringBuilder("Cache directory not available for ");
                                    sb1113.append(str8);
                                    objB2 = ResultKt.a(new IOException(sb1113.toString()));
                                    obj24 = obj27;
                                }
                                obj25 = objB2;
                                r11 = obj24;
                                r11.b(null);
                                return obj25;
                            } catch (Throwable th20) {
                                th = th20;
                                r8 = mutex3;
                                r8.b(null);
                                throw th;
                            }
                        case 8:
                            long j67 = eVar.f14722n;
                            j31 = eVar.m;
                            j32 = eVar.f14721l;
                            j18 = eVar.k;
                            file11 = (File) eVar.j;
                            file12 = (File) eVar.f14720i;
                            file8 = (File) eVar.f14719h;
                            j15 = j67;
                            file21 = (File) eVar.g;
                            str8 = (String) eVar.f;
                            mutex4 = (Mutex) eVar.f14718e;
                            bVar11 = (b) eVar.d;
                            url9 = (URL) eVar.f14717c;
                            o5Var9 = (o5) eVar.f14716b;
                            try {
                                ResultKt.b(objA);
                                objA2 = ((Result) objA).X;
                                bVar9 = bVar11;
                                url6 = url9;
                                o5Var7 = o5Var9;
                                j12 = j31;
                                j17 = j32;
                                coroutineSingletons2 = coroutineSingletons;
                                str4 = "toString(...)";
                                file2 = file21;
                                obj6 = mutex4;
                                ResultKt.b(objA2);
                                objA3 = Boxing.a(((Number) objA2).longValue());
                                j19 = j17;
                                file13 = file12;
                                long j520 = j18;
                                obj9 = obj6;
                                str10 = str8;
                                file14 = file11;
                                o5Var8 = o5Var7;
                                j20 = j520;
                                coroutineSingletons3 = coroutineSingletons2;
                                j21 = j12;
                                file15 = file2;
                                url7 = url6;
                            } catch (Throwable th21) {
                                th = th21;
                                bVar9 = bVar11;
                                url6 = url9;
                                o5Var7 = o5Var9;
                                j12 = j31;
                                j17 = j32;
                                coroutineSingletons2 = coroutineSingletons;
                                str4 = "toString(...)";
                                file2 = file21;
                                obj6 = mutex4;
                                File file311 = file12;
                                file9 = file11;
                                file10 = file311;
                                j14 = j17;
                                j16 = j18;
                                obj8 = obj6;
                                bVar8 = bVar9;
                                o5 o5Var114 = o5Var7;
                                objA3 = ResultKt.a(th);
                                String str2116 = str8;
                                o5Var8 = o5Var114;
                                bVar9 = bVar8;
                                str10 = str2116;
                                j19 = j14;
                                file13 = file10;
                                file14 = file9;
                                j20 = j16;
                                coroutineSingletons3 = coroutineSingletons2;
                                file15 = file2;
                                url7 = url6;
                                j21 = j12;
                                obj9 = obj8;
                                thA = Result.a(objA3);
                                if (thA != null) {
                                    StringBuilder sb20 = new StringBuilder(str5);
                                    sb20.append(str10);
                                    str5 = str5;
                                    sb20.append(" (startByte: ");
                                    sb20.append(j21);
                                    sb20.append(str3);
                                    za.b(sb20.toString(), thA);
                                    if (j21 <= 0) {
                                        bVar9 = bVar9;
                                        str10 = str10;
                                        o5Var8 = o5Var8;
                                        url7 = url7;
                                        file14 = file14;
                                        j22 = j20;
                                        j23 = j15;
                                        j24 = j19;
                                        throw thA;
                                    }
                                    bVar9 = bVar9;
                                    str10 = str10;
                                    o5Var8 = o5Var8;
                                    url7 = url7;
                                    file14 = file14;
                                    j22 = j20;
                                    j23 = j15;
                                    j24 = j19;
                                    throw thA;
                                    r11.b(null);
                                    return obj25;
                                }
                                j30 = j21;
                                j25 = j19;
                                obj12 = objA3;
                                file19 = file8;
                                file20 = file14;
                                coroutineSingletons3 = coroutineSingletons3;
                                obj13 = obj9;
                                if (obj12 instanceof Result.Failure) {
                                    thA2 = Result.a(obj12);
                                    str13 = str5;
                                    za.b(str13 + str10 + " after retry attempt", thA2);
                                    nonCancellable3 = NonCancellable.X;
                                    fVar = new f(file20, null);
                                    eVar.f14716b = obj13;
                                    eVar.f14717c = str10;
                                    eVar.d = thA2;
                                    eVar.f14718e = null;
                                    eVar.f = null;
                                    eVar.g = null;
                                    eVar.f14719h = null;
                                    eVar.f14720i = null;
                                    eVar.j = null;
                                    eVar.r = 10;
                                    if (BuildersKt.f(nonCancellable3, fVar, eVar) == coroutineSingletons3) {
                                        return coroutineSingletons3;
                                    }
                                    str14 = str10;
                                    iOException = thA2;
                                    if (iOException == null) {
                                        obj15 = obj13;
                                        iOException = new IOException(str13 + str14);
                                    }
                                    obj15 = obj13;
                                    objB2 = ResultKt.a(iOException);
                                    obj24 = obj15;
                                    obj25 = objB2;
                                    r11 = obj24;
                                    r11.b(null);
                                    return obj25;
                                }
                                if (obj12 instanceof Result.Failure) {
                                    obj12 = null;
                                }
                                l2 = (Long) obj12;
                                if (l2 != null) {
                                    za.b("Download result was successful but getOrNull() returned null for " + str10, (Throwable) null, 2, (Object) null);
                                    nonCancellable = NonCancellable.X;
                                    jVar = new j(file20, null);
                                    eVar.f14716b = obj13;
                                    eVar.f14717c = str10;
                                    eVar.d = null;
                                    eVar.f14718e = null;
                                    eVar.f = null;
                                    eVar.g = null;
                                    eVar.f14719h = null;
                                    eVar.f14720i = null;
                                    eVar.j = null;
                                    eVar.r = 11;
                                    if (BuildersKt.f(nonCancellable, jVar, eVar) == coroutineSingletons3) {
                                        obj16 = obj13;
                                        return coroutineSingletons3;
                                    }
                                    obj16 = obj13;
                                    objB2 = ResultKt.a(new IOException("Download succeeded but result was null for " + str10));
                                    obj24 = obj16;
                                    obj25 = objB2;
                                    r11 = obj24;
                                    r11.b(null);
                                    return obj25;
                                }
                                jLongValue2 = l2.longValue();
                                if (j30 > 0) {
                                    jLongValue2 = j15 + jLongValue2;
                                } else {
                                    jLongValue2 = j15 + jLongValue2;
                                }
                                if (jLongValue2 <= 0) {
                                    str12 = "Downloaded file for ";
                                    za.e(str12 + str10 + " is empty or size is zero.", null, 2, null);
                                    nonCancellable2 = NonCancellable.X;
                                    gVar = new g(file20, null);
                                    eVar.f14716b = obj13;
                                    eVar.f14717c = str10;
                                    eVar.d = null;
                                    eVar.f14718e = null;
                                    eVar.f = null;
                                    eVar.g = null;
                                    eVar.f14719h = null;
                                    eVar.f14720i = null;
                                    eVar.j = null;
                                    eVar.r = 12;
                                    if (BuildersKt.f(nonCancellable2, gVar, eVar) == coroutineSingletons3) {
                                        obj17 = obj13;
                                        return coroutineSingletons3;
                                    }
                                    obj17 = obj13;
                                    objB2 = ResultKt.a(new IOException(str12 + str10 + " is empty."));
                                    obj24 = obj17;
                                    obj25 = objB2;
                                    r11 = obj24;
                                    r11.b(null);
                                    return obj25;
                                }
                                if (j20 != -1) {
                                    i2 = 0;
                                } else {
                                    i2 = 0;
                                }
                                if (i2 != 0) {
                                    za.a("Partial request for " + j20 + " bytes returned complete file of " + jLongValue2 + " bytes", (Throwable) null, 2, (Object) null);
                                    file22 = file15;
                                } else {
                                    file22 = file19;
                                }
                                j33 = (o5Var8.k.get() + jLongValue2) - j25;
                                if (j33 > 0) {
                                    za.a(str + j33 + " bytes for " + str10, (Throwable) null, 2, (Object) null);
                                    n3 n3Var4 = o5Var8.d;
                                    k kVar4 = o5Var8.new k();
                                    eVar.f14716b = o5Var8;
                                    eVar.f14717c = url7;
                                    eVar.d = bVar9;
                                    eVar.f14718e = obj13;
                                    eVar.f = str10;
                                    eVar.g = file20;
                                    eVar.f14719h = file22;
                                    eVar.f14720i = null;
                                    eVar.j = null;
                                    eVar.k = j20;
                                    eVar.f14721l = j25;
                                    i4 = i2;
                                    eVar.o = i4;
                                    o5Var11 = o5Var8;
                                    url11 = url7;
                                    eVar.m = jLongValue2;
                                    j35 = jLongValue2;
                                    eVar.f14722n = j35;
                                    bVar12 = bVar9;
                                    eVar.r = 13;
                                    objA = n3Var4.a(kVar4, j33, eVar);
                                    coroutineSingletons4 = coroutineSingletons3;
                                    if (objA != coroutineSingletons4) {
                                        j36 = jLongValue2;
                                        j37 = j35;
                                        str11 = str10;
                                        o5Var12 = o5Var11;
                                        obj20 = obj13;
                                        jLongValue2 = j36;
                                        jLongValue3 = ((Number) objA).longValue();
                                        if (jLongValue3 > 0) {
                                            o5Var12.k.addAndGet(-jLongValue3);
                                            za.a("Freed " + jLongValue3 + " bytes via LRU. New cache size: " + o5Var12.k.get(), (Throwable) null, 2, (Object) null);
                                        }
                                        if (o5Var12.k.get() + jLongValue2 > j25) {
                                            str18 = "Cannot cache ";
                                            za.b(str18 + str11 + ". Not enough space freed.", (Throwable) null, 2, (Object) null);
                                            nonCancellable4 = NonCancellable.X;
                                            hVar = new h(file20, null);
                                            eVar.f14716b = obj20;
                                            eVar.f14717c = str11;
                                            eVar.d = null;
                                            eVar.f14718e = null;
                                            eVar.f = null;
                                            eVar.g = null;
                                            eVar.f14719h = null;
                                            eVar.r = 14;
                                            if (BuildersKt.f(nonCancellable4, hVar, eVar) == coroutineSingletons4) {
                                                obj21 = obj20;
                                            }
                                            obj21 = obj20;
                                            objB2 = ResultKt.a(new IOException(str18 + str11 + ". Not enough space freed after eviction."));
                                            obj24 = obj21;
                                            obj25 = objB2;
                                            r11 = obj24;
                                            r11.b(null);
                                            return obj25;
                                        }
                                        url10 = url11;
                                        i3 = i4;
                                        file23 = file22;
                                        coroutineSingletons3 = coroutineSingletons4;
                                        o5Var10 = o5Var12;
                                        str10 = str11;
                                        j34 = j37;
                                        obj18 = obj20;
                                    }
                                    return coroutineSingletons4;
                                }
                                bVar12 = bVar9;
                                o5 o5Var115 = o5Var8;
                                i3 = i2;
                                url10 = url7;
                                j34 = jLongValue2;
                                file23 = file22;
                                o5Var10 = o5Var115;
                                obj18 = obj13;
                                obj19 = obj18;
                                bVar14 = bVar12;
                                j39 = jLongValue2;
                                o3 o3Var12 = o5Var10.f14696b;
                                eVar.f14716b = o5Var10;
                                eVar.f14717c = url10;
                                eVar.d = bVar14;
                                eVar.f14718e = obj19;
                                eVar.f = str10;
                                eVar.g = file20;
                                eVar.f14719h = file23;
                                str16 = str10;
                                eVar.f14720i = null;
                                eVar.j = null;
                                eVar.k = j20;
                                eVar.o = i3;
                                eVar.f14721l = j39;
                                eVar.m = j34;
                                eVar.r = 15;
                                objB3 = o3Var12.b(file20, file23, eVar);
                                coroutineSingletons5 = coroutineSingletons3;
                                if (objB3 != coroutineSingletons5) {
                                    j40 = j34;
                                    url13 = url10;
                                    file24 = file23;
                                    bVar15 = bVar14;
                                    objA = objB3;
                                    o5Var14 = o5Var10;
                                    j41 = j39;
                                    j42 = j20;
                                    file25 = file20;
                                    str17 = str16;
                                    obj22 = obj19;
                                    if (!((Boolean) objA).booleanValue()) {
                                        za.b("Failed to finalize data file for " + str17, (Throwable) null, 2, (Object) null);
                                        nonCancellable5 = NonCancellable.X;
                                        iVar = new i(file25, null);
                                        eVar.f14716b = obj22;
                                        eVar.f14717c = str17;
                                        eVar.d = null;
                                        eVar.f14718e = null;
                                        eVar.f = null;
                                        eVar.g = null;
                                        eVar.f14719h = null;
                                        eVar.r = 16;
                                        if (BuildersKt.f(nonCancellable5, iVar, eVar) != coroutineSingletons5) {
                                            obj23 = obj22;
                                            str21 = str17;
                                            objB2 = ResultKt.a(new IOException("Failed to finalize cached file for " + str21));
                                            obj24 = obj23;
                                            obj25 = objB2;
                                            r11 = obj24;
                                            r11.b(null);
                                            return obj25;
                                        }
                                    } else {
                                        o5Var14.k.addAndGet(j41);
                                        if (j42 == -1) {
                                        }
                                        str19 = str4;
                                        j43 = j40;
                                        file26 = file24;
                                        long jCurrentTimeMillis4 = System.currentTimeMillis() + ((Number) o5Var14.f14700i.invoke()).longValue();
                                        String string9 = url13.toString();
                                        Intrinsics.e(string9, str19);
                                        l3Var = new l3(string9, jCurrentTimeMillis4);
                                        o3Var = o5Var14.f14696b;
                                        eVar.f14716b = o5Var14;
                                        eVar.f14717c = url13;
                                        eVar.d = bVar15;
                                        eVar.f14718e = obj22;
                                        eVar.f = str17;
                                        eVar.g = file26;
                                        eVar.f14719h = null;
                                        eVar.k = j41;
                                        j44 = j41;
                                        eVar.f14721l = j43;
                                        eVar.r = 17;
                                        if (o3Var.a(url13, l3Var, eVar) != coroutineSingletons5) {
                                            o5Var15 = o5Var14;
                                            j45 = j43;
                                            file27 = file26;
                                            str20 = str17;
                                            j41 = j44;
                                            obj26 = obj22;
                                            b bVar110 = new b(0L, j45 - 1, j45, file27, 0L, true, 16, null);
                                            String string10 = url13.toString();
                                            Intrinsics.e(string10, str19);
                                            o5Var15.a(string10, bVar110, bVar15);
                                            str17 = str20;
                                            o5Var14 = o5Var15;
                                            j46 = j45;
                                            file28 = file27;
                                            obj19 = obj26;
                                            za.a("Successfully cached " + str17 + " (" + file28.getAbsolutePath() + ", " + j46 + " bytes total, " + j41 + " new). New cache size: " + o5Var14.k.get(), (Throwable) null, 2, (Object) null);
                                            r11 = obj19;
                                            obj25 = file28;
                                            r11.b(null);
                                            return obj25;
                                        }
                                    }
                                }
                                return coroutineSingletons5;
                            }
                            thA = Result.a(objA3);
                            if (thA != null) {
                                StringBuilder sb21 = new StringBuilder(str5);
                                sb21.append(str10);
                                str5 = str5;
                                sb21.append(" (startByte: ");
                                sb21.append(j21);
                                sb21.append(str3);
                                za.b(sb21.toString(), thA);
                                if (j21 <= 0) {
                                    bVar9 = bVar9;
                                    str10 = str10;
                                    o5Var8 = o5Var8;
                                    url7 = url7;
                                    file14 = file14;
                                    j22 = j20;
                                    j23 = j15;
                                    j24 = j19;
                                    throw thA;
                                }
                                bVar9 = bVar9;
                                str10 = str10;
                                o5Var8 = o5Var8;
                                url7 = url7;
                                file14 = file14;
                                j22 = j20;
                                j23 = j15;
                                j24 = j19;
                                throw thA;
                                r11.b(null);
                                return obj25;
                            }
                            j30 = j21;
                            j25 = j19;
                            obj12 = objA3;
                            file19 = file8;
                            file20 = file14;
                            coroutineSingletons3 = coroutineSingletons3;
                            obj13 = obj9;
                            if (obj12 instanceof Result.Failure) {
                                thA2 = Result.a(obj12);
                                str13 = str5;
                                za.b(str13 + str10 + " after retry attempt", thA2);
                                nonCancellable3 = NonCancellable.X;
                                fVar = new f(file20, null);
                                eVar.f14716b = obj13;
                                eVar.f14717c = str10;
                                eVar.d = thA2;
                                eVar.f14718e = null;
                                eVar.f = null;
                                eVar.g = null;
                                eVar.f14719h = null;
                                eVar.f14720i = null;
                                eVar.j = null;
                                eVar.r = 10;
                                if (BuildersKt.f(nonCancellable3, fVar, eVar) == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                                str14 = str10;
                                iOException = thA2;
                                if (iOException == null) {
                                    obj15 = obj13;
                                    iOException = new IOException(str13 + str14);
                                }
                                obj15 = obj13;
                                objB2 = ResultKt.a(iOException);
                                obj24 = obj15;
                                obj25 = objB2;
                                r11 = obj24;
                                r11.b(null);
                                return obj25;
                            }
                            if (obj12 instanceof Result.Failure) {
                                obj12 = null;
                            }
                            l2 = (Long) obj12;
                            if (l2 != null) {
                                za.b("Download result was successful but getOrNull() returned null for " + str10, (Throwable) null, 2, (Object) null);
                                nonCancellable = NonCancellable.X;
                                jVar = new j(file20, null);
                                eVar.f14716b = obj13;
                                eVar.f14717c = str10;
                                eVar.d = null;
                                eVar.f14718e = null;
                                eVar.f = null;
                                eVar.g = null;
                                eVar.f14719h = null;
                                eVar.f14720i = null;
                                eVar.j = null;
                                eVar.r = 11;
                                if (BuildersKt.f(nonCancellable, jVar, eVar) == coroutineSingletons3) {
                                    obj16 = obj13;
                                    return coroutineSingletons3;
                                }
                                obj16 = obj13;
                                objB2 = ResultKt.a(new IOException("Download succeeded but result was null for " + str10));
                                obj24 = obj16;
                                obj25 = objB2;
                                r11 = obj24;
                                r11.b(null);
                                return obj25;
                            }
                            jLongValue2 = l2.longValue();
                            if (j30 > 0) {
                                jLongValue2 = j15 + jLongValue2;
                            } else {
                                jLongValue2 = j15 + jLongValue2;
                            }
                            if (jLongValue2 <= 0) {
                                str12 = "Downloaded file for ";
                                za.e(str12 + str10 + " is empty or size is zero.", null, 2, null);
                                nonCancellable2 = NonCancellable.X;
                                gVar = new g(file20, null);
                                eVar.f14716b = obj13;
                                eVar.f14717c = str10;
                                eVar.d = null;
                                eVar.f14718e = null;
                                eVar.f = null;
                                eVar.g = null;
                                eVar.f14719h = null;
                                eVar.f14720i = null;
                                eVar.j = null;
                                eVar.r = 12;
                                if (BuildersKt.f(nonCancellable2, gVar, eVar) == coroutineSingletons3) {
                                    obj17 = obj13;
                                    return coroutineSingletons3;
                                }
                                obj17 = obj13;
                                objB2 = ResultKt.a(new IOException(str12 + str10 + " is empty."));
                                obj24 = obj17;
                                obj25 = objB2;
                                r11 = obj24;
                                r11.b(null);
                                return obj25;
                            }
                            if (j20 != -1) {
                                i2 = 0;
                            } else {
                                i2 = 0;
                            }
                            if (i2 != 0) {
                                za.a("Partial request for " + j20 + " bytes returned complete file of " + jLongValue2 + " bytes", (Throwable) null, 2, (Object) null);
                                file22 = file15;
                            } else {
                                file22 = file19;
                            }
                            j33 = (o5Var8.k.get() + jLongValue2) - j25;
                            if (j33 > 0) {
                                za.a(str + j33 + " bytes for " + str10, (Throwable) null, 2, (Object) null);
                                n3 n3Var5 = o5Var8.d;
                                k kVar5 = o5Var8.new k();
                                eVar.f14716b = o5Var8;
                                eVar.f14717c = url7;
                                eVar.d = bVar9;
                                eVar.f14718e = obj13;
                                eVar.f = str10;
                                eVar.g = file20;
                                eVar.f14719h = file22;
                                eVar.f14720i = null;
                                eVar.j = null;
                                eVar.k = j20;
                                eVar.f14721l = j25;
                                i4 = i2;
                                eVar.o = i4;
                                o5Var11 = o5Var8;
                                url11 = url7;
                                eVar.m = jLongValue2;
                                j35 = jLongValue2;
                                eVar.f14722n = j35;
                                bVar12 = bVar9;
                                eVar.r = 13;
                                objA = n3Var5.a(kVar5, j33, eVar);
                                coroutineSingletons4 = coroutineSingletons3;
                                if (objA != coroutineSingletons4) {
                                    j36 = jLongValue2;
                                    j37 = j35;
                                    str11 = str10;
                                    o5Var12 = o5Var11;
                                    obj20 = obj13;
                                    jLongValue2 = j36;
                                    jLongValue3 = ((Number) objA).longValue();
                                    if (jLongValue3 > 0) {
                                        o5Var12.k.addAndGet(-jLongValue3);
                                        za.a("Freed " + jLongValue3 + " bytes via LRU. New cache size: " + o5Var12.k.get(), (Throwable) null, 2, (Object) null);
                                    }
                                    if (o5Var12.k.get() + jLongValue2 > j25) {
                                        str18 = "Cannot cache ";
                                        za.b(str18 + str11 + ". Not enough space freed.", (Throwable) null, 2, (Object) null);
                                        nonCancellable4 = NonCancellable.X;
                                        hVar = new h(file20, null);
                                        eVar.f14716b = obj20;
                                        eVar.f14717c = str11;
                                        eVar.d = null;
                                        eVar.f14718e = null;
                                        eVar.f = null;
                                        eVar.g = null;
                                        eVar.f14719h = null;
                                        eVar.r = 14;
                                        if (BuildersKt.f(nonCancellable4, hVar, eVar) == coroutineSingletons4) {
                                            obj21 = obj20;
                                        }
                                        obj21 = obj20;
                                        objB2 = ResultKt.a(new IOException(str18 + str11 + ". Not enough space freed after eviction."));
                                        obj24 = obj21;
                                        obj25 = objB2;
                                        r11 = obj24;
                                        r11.b(null);
                                        return obj25;
                                    }
                                    url10 = url11;
                                    i3 = i4;
                                    file23 = file22;
                                    coroutineSingletons3 = coroutineSingletons4;
                                    o5Var10 = o5Var12;
                                    str10 = str11;
                                    j34 = j37;
                                    obj18 = obj20;
                                }
                                return coroutineSingletons4;
                            }
                            bVar12 = bVar9;
                            o5 o5Var116 = o5Var8;
                            i3 = i2;
                            url10 = url7;
                            j34 = jLongValue2;
                            file23 = file22;
                            o5Var10 = o5Var116;
                            obj18 = obj13;
                            obj19 = obj18;
                            bVar14 = bVar12;
                            j39 = jLongValue2;
                            o3 o3Var13 = o5Var10.f14696b;
                            eVar.f14716b = o5Var10;
                            eVar.f14717c = url10;
                            eVar.d = bVar14;
                            eVar.f14718e = obj19;
                            eVar.f = str10;
                            eVar.g = file20;
                            eVar.f14719h = file23;
                            str16 = str10;
                            eVar.f14720i = null;
                            eVar.j = null;
                            eVar.k = j20;
                            eVar.o = i3;
                            eVar.f14721l = j39;
                            eVar.m = j34;
                            eVar.r = 15;
                            objB3 = o3Var13.b(file20, file23, eVar);
                            coroutineSingletons5 = coroutineSingletons3;
                            if (objB3 != coroutineSingletons5) {
                                j40 = j34;
                                url13 = url10;
                                file24 = file23;
                                bVar15 = bVar14;
                                objA = objB3;
                                o5Var14 = o5Var10;
                                j41 = j39;
                                j42 = j20;
                                file25 = file20;
                                str17 = str16;
                                obj22 = obj19;
                                if (!((Boolean) objA).booleanValue()) {
                                    za.b("Failed to finalize data file for " + str17, (Throwable) null, 2, (Object) null);
                                    nonCancellable5 = NonCancellable.X;
                                    iVar = new i(file25, null);
                                    eVar.f14716b = obj22;
                                    eVar.f14717c = str17;
                                    eVar.d = null;
                                    eVar.f14718e = null;
                                    eVar.f = null;
                                    eVar.g = null;
                                    eVar.f14719h = null;
                                    eVar.r = 16;
                                    if (BuildersKt.f(nonCancellable5, iVar, eVar) != coroutineSingletons5) {
                                        obj23 = obj22;
                                        str21 = str17;
                                        objB2 = ResultKt.a(new IOException("Failed to finalize cached file for " + str21));
                                        obj24 = obj23;
                                        obj25 = objB2;
                                        r11 = obj24;
                                        r11.b(null);
                                        return obj25;
                                    }
                                } else {
                                    o5Var14.k.addAndGet(j41);
                                    if (j42 == -1) {
                                    }
                                    str19 = str4;
                                    j43 = j40;
                                    file26 = file24;
                                    long jCurrentTimeMillis5 = System.currentTimeMillis() + ((Number) o5Var14.f14700i.invoke()).longValue();
                                    String string11 = url13.toString();
                                    Intrinsics.e(string11, str19);
                                    l3Var = new l3(string11, jCurrentTimeMillis5);
                                    o3Var = o5Var14.f14696b;
                                    eVar.f14716b = o5Var14;
                                    eVar.f14717c = url13;
                                    eVar.d = bVar15;
                                    eVar.f14718e = obj22;
                                    eVar.f = str17;
                                    eVar.g = file26;
                                    eVar.f14719h = null;
                                    eVar.k = j41;
                                    j44 = j41;
                                    eVar.f14721l = j43;
                                    eVar.r = 17;
                                    if (o3Var.a(url13, l3Var, eVar) != coroutineSingletons5) {
                                        o5Var15 = o5Var14;
                                        j45 = j43;
                                        file27 = file26;
                                        str20 = str17;
                                        j41 = j44;
                                        obj26 = obj22;
                                        b bVar111 = new b(0L, j45 - 1, j45, file27, 0L, true, 16, null);
                                        String string12 = url13.toString();
                                        Intrinsics.e(string12, str19);
                                        o5Var15.a(string12, bVar111, bVar15);
                                        str17 = str20;
                                        o5Var14 = o5Var15;
                                        j46 = j45;
                                        file28 = file27;
                                        obj19 = obj26;
                                        za.a("Successfully cached " + str17 + " (" + file28.getAbsolutePath() + ", " + j46 + " bytes total, " + j41 + " new). New cache size: " + o5Var14.k.get(), (Throwable) null, 2, (Object) null);
                                        r11 = obj19;
                                        obj25 = file28;
                                        r11.b(null);
                                        return obj25;
                                    }
                                }
                            }
                            return coroutineSingletons5;
                        case 9:
                            long j68 = eVar.f14722n;
                            j28 = eVar.m;
                            j29 = eVar.f14721l;
                            j38 = eVar.k;
                            file17 = (File) eVar.f14720i;
                            file16 = (File) eVar.f14719h;
                            file18 = (File) eVar.g;
                            j15 = j68;
                            str15 = (String) eVar.f;
                            obj11 = (Mutex) eVar.f14718e;
                            bVar13 = (b) eVar.d;
                            url12 = (URL) eVar.f14717c;
                            o5Var13 = (o5) eVar.f14716b;
                            try {
                                ResultKt.b(objA);
                                objA4 = ((Result) objA).X;
                                bVar9 = bVar13;
                                url7 = url12;
                                o5Var8 = o5Var13;
                                j22 = j38;
                                coroutineSingletons3 = coroutineSingletons;
                                str4 = "toString(...)";
                                str10 = str15;
                                obj11 = obj11;
                                ResultKt.b(objA4);
                                objA5 = Boxing.a(((Number) objA4).longValue());
                                j25 = j29;
                                file15 = file18;
                                j21 = j28;
                                file8 = file16;
                                obj14 = obj11;
                            } catch (Throwable th22) {
                                th = th22;
                                bVar9 = bVar13;
                                url7 = url12;
                                o5Var8 = o5Var13;
                                j22 = j38;
                                coroutineSingletons3 = coroutineSingletons;
                                str4 = "toString(...)";
                                str10 = str15;
                                j25 = j29;
                                file14 = file17;
                                file15 = file18;
                                j21 = j28;
                                file8 = file16;
                                bVar10 = bVar9;
                                url8 = url7;
                                j26 = j22;
                                obj10 = obj11;
                                objA5 = ResultKt.a(th);
                                bVar9 = bVar10;
                                url7 = url8;
                                j22 = j26;
                                file17 = file14;
                                obj14 = obj10;
                                obj13 = obj14;
                                j30 = j21;
                                o5Var8 = o5Var8;
                                url7 = url7;
                                bVar9 = bVar9;
                                obj12 = objA5;
                                file19 = file8;
                                file20 = file17;
                                j20 = j22;
                                if (obj12 instanceof Result.Failure) {
                                    thA2 = Result.a(obj12);
                                    str13 = str5;
                                    za.b(str13 + str10 + " after retry attempt", thA2);
                                    nonCancellable3 = NonCancellable.X;
                                    fVar = new f(file20, null);
                                    eVar.f14716b = obj13;
                                    eVar.f14717c = str10;
                                    eVar.d = thA2;
                                    eVar.f14718e = null;
                                    eVar.f = null;
                                    eVar.g = null;
                                    eVar.f14719h = null;
                                    eVar.f14720i = null;
                                    eVar.j = null;
                                    eVar.r = 10;
                                    if (BuildersKt.f(nonCancellable3, fVar, eVar) == coroutineSingletons3) {
                                        return coroutineSingletons3;
                                    }
                                    str14 = str10;
                                    iOException = thA2;
                                    if (iOException == null) {
                                        obj15 = obj13;
                                        iOException = new IOException(str13 + str14);
                                    }
                                    obj15 = obj13;
                                    objB2 = ResultKt.a(iOException);
                                    obj24 = obj15;
                                    obj25 = objB2;
                                    r11 = obj24;
                                    r11.b(null);
                                    return obj25;
                                }
                                if (obj12 instanceof Result.Failure) {
                                    obj12 = null;
                                }
                                l2 = (Long) obj12;
                                if (l2 != null) {
                                    za.b("Download result was successful but getOrNull() returned null for " + str10, (Throwable) null, 2, (Object) null);
                                    nonCancellable = NonCancellable.X;
                                    jVar = new j(file20, null);
                                    eVar.f14716b = obj13;
                                    eVar.f14717c = str10;
                                    eVar.d = null;
                                    eVar.f14718e = null;
                                    eVar.f = null;
                                    eVar.g = null;
                                    eVar.f14719h = null;
                                    eVar.f14720i = null;
                                    eVar.j = null;
                                    eVar.r = 11;
                                    if (BuildersKt.f(nonCancellable, jVar, eVar) == coroutineSingletons3) {
                                        obj16 = obj13;
                                        return coroutineSingletons3;
                                    }
                                    obj16 = obj13;
                                    objB2 = ResultKt.a(new IOException("Download succeeded but result was null for " + str10));
                                    obj24 = obj16;
                                    obj25 = objB2;
                                    r11 = obj24;
                                    r11.b(null);
                                    return obj25;
                                }
                                jLongValue2 = l2.longValue();
                                if (j30 > 0) {
                                    jLongValue2 = j15 + jLongValue2;
                                } else {
                                    jLongValue2 = j15 + jLongValue2;
                                }
                                if (jLongValue2 <= 0) {
                                    str12 = "Downloaded file for ";
                                    za.e(str12 + str10 + " is empty or size is zero.", null, 2, null);
                                    nonCancellable2 = NonCancellable.X;
                                    gVar = new g(file20, null);
                                    eVar.f14716b = obj13;
                                    eVar.f14717c = str10;
                                    eVar.d = null;
                                    eVar.f14718e = null;
                                    eVar.f = null;
                                    eVar.g = null;
                                    eVar.f14719h = null;
                                    eVar.f14720i = null;
                                    eVar.j = null;
                                    eVar.r = 12;
                                    if (BuildersKt.f(nonCancellable2, gVar, eVar) == coroutineSingletons3) {
                                        obj17 = obj13;
                                        return coroutineSingletons3;
                                    }
                                    obj17 = obj13;
                                    objB2 = ResultKt.a(new IOException(str12 + str10 + " is empty."));
                                    obj24 = obj17;
                                    obj25 = objB2;
                                    r11 = obj24;
                                    r11.b(null);
                                    return obj25;
                                }
                                if (j20 != -1) {
                                    i2 = 0;
                                } else {
                                    i2 = 0;
                                }
                                if (i2 != 0) {
                                    za.a("Partial request for " + j20 + " bytes returned complete file of " + jLongValue2 + " bytes", (Throwable) null, 2, (Object) null);
                                    file22 = file15;
                                } else {
                                    file22 = file19;
                                }
                                j33 = (o5Var8.k.get() + jLongValue2) - j25;
                                if (j33 > 0) {
                                    za.a(str + j33 + " bytes for " + str10, (Throwable) null, 2, (Object) null);
                                    n3 n3Var6 = o5Var8.d;
                                    k kVar6 = o5Var8.new k();
                                    eVar.f14716b = o5Var8;
                                    eVar.f14717c = url7;
                                    eVar.d = bVar9;
                                    eVar.f14718e = obj13;
                                    eVar.f = str10;
                                    eVar.g = file20;
                                    eVar.f14719h = file22;
                                    eVar.f14720i = null;
                                    eVar.j = null;
                                    eVar.k = j20;
                                    eVar.f14721l = j25;
                                    i4 = i2;
                                    eVar.o = i4;
                                    o5Var11 = o5Var8;
                                    url11 = url7;
                                    eVar.m = jLongValue2;
                                    j35 = jLongValue2;
                                    eVar.f14722n = j35;
                                    bVar12 = bVar9;
                                    eVar.r = 13;
                                    objA = n3Var6.a(kVar6, j33, eVar);
                                    coroutineSingletons4 = coroutineSingletons3;
                                    if (objA != coroutineSingletons4) {
                                        j36 = jLongValue2;
                                        j37 = j35;
                                        str11 = str10;
                                        o5Var12 = o5Var11;
                                        obj20 = obj13;
                                        jLongValue2 = j36;
                                        jLongValue3 = ((Number) objA).longValue();
                                        if (jLongValue3 > 0) {
                                            o5Var12.k.addAndGet(-jLongValue3);
                                            za.a("Freed " + jLongValue3 + " bytes via LRU. New cache size: " + o5Var12.k.get(), (Throwable) null, 2, (Object) null);
                                        }
                                        if (o5Var12.k.get() + jLongValue2 > j25) {
                                            str18 = "Cannot cache ";
                                            za.b(str18 + str11 + ". Not enough space freed.", (Throwable) null, 2, (Object) null);
                                            nonCancellable4 = NonCancellable.X;
                                            hVar = new h(file20, null);
                                            eVar.f14716b = obj20;
                                            eVar.f14717c = str11;
                                            eVar.d = null;
                                            eVar.f14718e = null;
                                            eVar.f = null;
                                            eVar.g = null;
                                            eVar.f14719h = null;
                                            eVar.r = 14;
                                            if (BuildersKt.f(nonCancellable4, hVar, eVar) == coroutineSingletons4) {
                                                obj21 = obj20;
                                            }
                                            obj21 = obj20;
                                            objB2 = ResultKt.a(new IOException(str18 + str11 + ". Not enough space freed after eviction."));
                                            obj24 = obj21;
                                            obj25 = objB2;
                                            r11 = obj24;
                                            r11.b(null);
                                            return obj25;
                                        }
                                        url10 = url11;
                                        i3 = i4;
                                        file23 = file22;
                                        coroutineSingletons3 = coroutineSingletons4;
                                        o5Var10 = o5Var12;
                                        str10 = str11;
                                        j34 = j37;
                                        obj18 = obj20;
                                    }
                                    return coroutineSingletons4;
                                }
                                bVar12 = bVar9;
                                o5 o5Var117 = o5Var8;
                                i3 = i2;
                                url10 = url7;
                                j34 = jLongValue2;
                                file23 = file22;
                                o5Var10 = o5Var117;
                                obj18 = obj13;
                                obj19 = obj18;
                                bVar14 = bVar12;
                                j39 = jLongValue2;
                                o3 o3Var14 = o5Var10.f14696b;
                                eVar.f14716b = o5Var10;
                                eVar.f14717c = url10;
                                eVar.d = bVar14;
                                eVar.f14718e = obj19;
                                eVar.f = str10;
                                eVar.g = file20;
                                eVar.f14719h = file23;
                                str16 = str10;
                                eVar.f14720i = null;
                                eVar.j = null;
                                eVar.k = j20;
                                eVar.o = i3;
                                eVar.f14721l = j39;
                                eVar.m = j34;
                                eVar.r = 15;
                                objB3 = o3Var14.b(file20, file23, eVar);
                                coroutineSingletons5 = coroutineSingletons3;
                                if (objB3 != coroutineSingletons5) {
                                    j40 = j34;
                                    url13 = url10;
                                    file24 = file23;
                                    bVar15 = bVar14;
                                    objA = objB3;
                                    o5Var14 = o5Var10;
                                    j41 = j39;
                                    j42 = j20;
                                    file25 = file20;
                                    str17 = str16;
                                    obj22 = obj19;
                                    if (!((Boolean) objA).booleanValue()) {
                                        za.b("Failed to finalize data file for " + str17, (Throwable) null, 2, (Object) null);
                                        nonCancellable5 = NonCancellable.X;
                                        iVar = new i(file25, null);
                                        eVar.f14716b = obj22;
                                        eVar.f14717c = str17;
                                        eVar.d = null;
                                        eVar.f14718e = null;
                                        eVar.f = null;
                                        eVar.g = null;
                                        eVar.f14719h = null;
                                        eVar.r = 16;
                                        if (BuildersKt.f(nonCancellable5, iVar, eVar) != coroutineSingletons5) {
                                            obj23 = obj22;
                                            str21 = str17;
                                            objB2 = ResultKt.a(new IOException("Failed to finalize cached file for " + str21));
                                            obj24 = obj23;
                                            obj25 = objB2;
                                            r11 = obj24;
                                            r11.b(null);
                                            return obj25;
                                        }
                                    } else {
                                        o5Var14.k.addAndGet(j41);
                                        if (j42 == -1) {
                                        }
                                        str19 = str4;
                                        j43 = j40;
                                        file26 = file24;
                                        long jCurrentTimeMillis6 = System.currentTimeMillis() + ((Number) o5Var14.f14700i.invoke()).longValue();
                                        String string13 = url13.toString();
                                        Intrinsics.e(string13, str19);
                                        l3Var = new l3(string13, jCurrentTimeMillis6);
                                        o3Var = o5Var14.f14696b;
                                        eVar.f14716b = o5Var14;
                                        eVar.f14717c = url13;
                                        eVar.d = bVar15;
                                        eVar.f14718e = obj22;
                                        eVar.f = str17;
                                        eVar.g = file26;
                                        eVar.f14719h = null;
                                        eVar.k = j41;
                                        j44 = j41;
                                        eVar.f14721l = j43;
                                        eVar.r = 17;
                                        if (o3Var.a(url13, l3Var, eVar) != coroutineSingletons5) {
                                            o5Var15 = o5Var14;
                                            j45 = j43;
                                            file27 = file26;
                                            str20 = str17;
                                            j41 = j44;
                                            obj26 = obj22;
                                            b bVar112 = new b(0L, j45 - 1, j45, file27, 0L, true, 16, null);
                                            String string14 = url13.toString();
                                            Intrinsics.e(string14, str19);
                                            o5Var15.a(string14, bVar112, bVar15);
                                            str17 = str20;
                                            o5Var14 = o5Var15;
                                            j46 = j45;
                                            file28 = file27;
                                            obj19 = obj26;
                                            za.a("Successfully cached " + str17 + " (" + file28.getAbsolutePath() + ", " + j46 + " bytes total, " + j41 + " new). New cache size: " + o5Var14.k.get(), (Throwable) null, 2, (Object) null);
                                            r11 = obj19;
                                            obj25 = file28;
                                            r11.b(null);
                                            return obj25;
                                        }
                                    }
                                }
                                return coroutineSingletons5;
                            }
                            obj13 = obj14;
                            j30 = j21;
                            o5Var8 = o5Var8;
                            url7 = url7;
                            bVar9 = bVar9;
                            obj12 = objA5;
                            file19 = file8;
                            file20 = file17;
                            j20 = j22;
                            if (obj12 instanceof Result.Failure) {
                                thA2 = Result.a(obj12);
                                str13 = str5;
                                za.b(str13 + str10 + " after retry attempt", thA2);
                                nonCancellable3 = NonCancellable.X;
                                fVar = new f(file20, null);
                                eVar.f14716b = obj13;
                                eVar.f14717c = str10;
                                eVar.d = thA2;
                                eVar.f14718e = null;
                                eVar.f = null;
                                eVar.g = null;
                                eVar.f14719h = null;
                                eVar.f14720i = null;
                                eVar.j = null;
                                eVar.r = 10;
                                if (BuildersKt.f(nonCancellable3, fVar, eVar) == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                                str14 = str10;
                                iOException = thA2;
                                if (iOException == null) {
                                    obj15 = obj13;
                                    iOException = new IOException(str13 + str14);
                                }
                                obj15 = obj13;
                                objB2 = ResultKt.a(iOException);
                                obj24 = obj15;
                                obj25 = objB2;
                                r11 = obj24;
                                r11.b(null);
                                return obj25;
                            }
                            if (obj12 instanceof Result.Failure) {
                                obj12 = null;
                            }
                            l2 = (Long) obj12;
                            if (l2 != null) {
                                za.b("Download result was successful but getOrNull() returned null for " + str10, (Throwable) null, 2, (Object) null);
                                nonCancellable = NonCancellable.X;
                                jVar = new j(file20, null);
                                eVar.f14716b = obj13;
                                eVar.f14717c = str10;
                                eVar.d = null;
                                eVar.f14718e = null;
                                eVar.f = null;
                                eVar.g = null;
                                eVar.f14719h = null;
                                eVar.f14720i = null;
                                eVar.j = null;
                                eVar.r = 11;
                                if (BuildersKt.f(nonCancellable, jVar, eVar) == coroutineSingletons3) {
                                    obj16 = obj13;
                                    return coroutineSingletons3;
                                }
                                obj16 = obj13;
                                objB2 = ResultKt.a(new IOException("Download succeeded but result was null for " + str10));
                                obj24 = obj16;
                                obj25 = objB2;
                                r11 = obj24;
                                r11.b(null);
                                return obj25;
                            }
                            jLongValue2 = l2.longValue();
                            if (j30 > 0) {
                                jLongValue2 = j15 + jLongValue2;
                            } else {
                                jLongValue2 = j15 + jLongValue2;
                            }
                            if (jLongValue2 <= 0) {
                                str12 = "Downloaded file for ";
                                za.e(str12 + str10 + " is empty or size is zero.", null, 2, null);
                                nonCancellable2 = NonCancellable.X;
                                gVar = new g(file20, null);
                                eVar.f14716b = obj13;
                                eVar.f14717c = str10;
                                eVar.d = null;
                                eVar.f14718e = null;
                                eVar.f = null;
                                eVar.g = null;
                                eVar.f14719h = null;
                                eVar.f14720i = null;
                                eVar.j = null;
                                eVar.r = 12;
                                if (BuildersKt.f(nonCancellable2, gVar, eVar) == coroutineSingletons3) {
                                    obj17 = obj13;
                                    return coroutineSingletons3;
                                }
                                obj17 = obj13;
                                objB2 = ResultKt.a(new IOException(str12 + str10 + " is empty."));
                                obj24 = obj17;
                                obj25 = objB2;
                                r11 = obj24;
                                r11.b(null);
                                return obj25;
                            }
                            if (j20 != -1) {
                                i2 = 0;
                            } else {
                                i2 = 0;
                            }
                            if (i2 != 0) {
                                za.a("Partial request for " + j20 + " bytes returned complete file of " + jLongValue2 + " bytes", (Throwable) null, 2, (Object) null);
                                file22 = file15;
                            } else {
                                file22 = file19;
                            }
                            j33 = (o5Var8.k.get() + jLongValue2) - j25;
                            if (j33 > 0) {
                                za.a(str + j33 + " bytes for " + str10, (Throwable) null, 2, (Object) null);
                                n3 n3Var7 = o5Var8.d;
                                k kVar7 = o5Var8.new k();
                                eVar.f14716b = o5Var8;
                                eVar.f14717c = url7;
                                eVar.d = bVar9;
                                eVar.f14718e = obj13;
                                eVar.f = str10;
                                eVar.g = file20;
                                eVar.f14719h = file22;
                                eVar.f14720i = null;
                                eVar.j = null;
                                eVar.k = j20;
                                eVar.f14721l = j25;
                                i4 = i2;
                                eVar.o = i4;
                                o5Var11 = o5Var8;
                                url11 = url7;
                                eVar.m = jLongValue2;
                                j35 = jLongValue2;
                                eVar.f14722n = j35;
                                bVar12 = bVar9;
                                eVar.r = 13;
                                objA = n3Var7.a(kVar7, j33, eVar);
                                coroutineSingletons4 = coroutineSingletons3;
                                if (objA != coroutineSingletons4) {
                                    j36 = jLongValue2;
                                    j37 = j35;
                                    str11 = str10;
                                    o5Var12 = o5Var11;
                                    obj20 = obj13;
                                    jLongValue2 = j36;
                                    jLongValue3 = ((Number) objA).longValue();
                                    if (jLongValue3 > 0) {
                                        o5Var12.k.addAndGet(-jLongValue3);
                                        za.a("Freed " + jLongValue3 + " bytes via LRU. New cache size: " + o5Var12.k.get(), (Throwable) null, 2, (Object) null);
                                    }
                                    if (o5Var12.k.get() + jLongValue2 > j25) {
                                        str18 = "Cannot cache ";
                                        za.b(str18 + str11 + ". Not enough space freed.", (Throwable) null, 2, (Object) null);
                                        nonCancellable4 = NonCancellable.X;
                                        hVar = new h(file20, null);
                                        eVar.f14716b = obj20;
                                        eVar.f14717c = str11;
                                        eVar.d = null;
                                        eVar.f14718e = null;
                                        eVar.f = null;
                                        eVar.g = null;
                                        eVar.f14719h = null;
                                        eVar.r = 14;
                                        if (BuildersKt.f(nonCancellable4, hVar, eVar) == coroutineSingletons4) {
                                            obj21 = obj20;
                                        }
                                        obj21 = obj20;
                                        objB2 = ResultKt.a(new IOException(str18 + str11 + ". Not enough space freed after eviction."));
                                        obj24 = obj21;
                                        obj25 = objB2;
                                        r11 = obj24;
                                        r11.b(null);
                                        return obj25;
                                    }
                                    url10 = url11;
                                    i3 = i4;
                                    file23 = file22;
                                    coroutineSingletons3 = coroutineSingletons4;
                                    o5Var10 = o5Var12;
                                    str10 = str11;
                                    j34 = j37;
                                    obj18 = obj20;
                                }
                                return coroutineSingletons4;
                            }
                            bVar12 = bVar9;
                            o5 o5Var118 = o5Var8;
                            i3 = i2;
                            url10 = url7;
                            j34 = jLongValue2;
                            file23 = file22;
                            o5Var10 = o5Var118;
                            obj18 = obj13;
                            obj19 = obj18;
                            bVar14 = bVar12;
                            j39 = jLongValue2;
                            o3 o3Var15 = o5Var10.f14696b;
                            eVar.f14716b = o5Var10;
                            eVar.f14717c = url10;
                            eVar.d = bVar14;
                            eVar.f14718e = obj19;
                            eVar.f = str10;
                            eVar.g = file20;
                            eVar.f14719h = file23;
                            str16 = str10;
                            eVar.f14720i = null;
                            eVar.j = null;
                            eVar.k = j20;
                            eVar.o = i3;
                            eVar.f14721l = j39;
                            eVar.m = j34;
                            eVar.r = 15;
                            objB3 = o3Var15.b(file20, file23, eVar);
                            coroutineSingletons5 = coroutineSingletons3;
                            if (objB3 != coroutineSingletons5) {
                                j40 = j34;
                                url13 = url10;
                                file24 = file23;
                                bVar15 = bVar14;
                                objA = objB3;
                                o5Var14 = o5Var10;
                                j41 = j39;
                                j42 = j20;
                                file25 = file20;
                                str17 = str16;
                                obj22 = obj19;
                                if (!((Boolean) objA).booleanValue()) {
                                    za.b("Failed to finalize data file for " + str17, (Throwable) null, 2, (Object) null);
                                    nonCancellable5 = NonCancellable.X;
                                    iVar = new i(file25, null);
                                    eVar.f14716b = obj22;
                                    eVar.f14717c = str17;
                                    eVar.d = null;
                                    eVar.f14718e = null;
                                    eVar.f = null;
                                    eVar.g = null;
                                    eVar.f14719h = null;
                                    eVar.r = 16;
                                    if (BuildersKt.f(nonCancellable5, iVar, eVar) != coroutineSingletons5) {
                                        obj23 = obj22;
                                        str21 = str17;
                                        objB2 = ResultKt.a(new IOException("Failed to finalize cached file for " + str21));
                                        obj24 = obj23;
                                        obj25 = objB2;
                                        r11 = obj24;
                                        r11.b(null);
                                        return obj25;
                                    }
                                } else {
                                    o5Var14.k.addAndGet(j41);
                                    if (j42 == -1) {
                                    }
                                    str19 = str4;
                                    j43 = j40;
                                    file26 = file24;
                                    long jCurrentTimeMillis7 = System.currentTimeMillis() + ((Number) o5Var14.f14700i.invoke()).longValue();
                                    String string15 = url13.toString();
                                    Intrinsics.e(string15, str19);
                                    l3Var = new l3(string15, jCurrentTimeMillis7);
                                    o3Var = o5Var14.f14696b;
                                    eVar.f14716b = o5Var14;
                                    eVar.f14717c = url13;
                                    eVar.d = bVar15;
                                    eVar.f14718e = obj22;
                                    eVar.f = str17;
                                    eVar.g = file26;
                                    eVar.f14719h = null;
                                    eVar.k = j41;
                                    j44 = j41;
                                    eVar.f14721l = j43;
                                    eVar.r = 17;
                                    if (o3Var.a(url13, l3Var, eVar) != coroutineSingletons5) {
                                        o5Var15 = o5Var14;
                                        j45 = j43;
                                        file27 = file26;
                                        str20 = str17;
                                        j41 = j44;
                                        obj26 = obj22;
                                        b bVar113 = new b(0L, j45 - 1, j45, file27, 0L, true, 16, null);
                                        String string16 = url13.toString();
                                        Intrinsics.e(string16, str19);
                                        o5Var15.a(string16, bVar113, bVar15);
                                        str17 = str20;
                                        o5Var14 = o5Var15;
                                        j46 = j45;
                                        file28 = file27;
                                        obj19 = obj26;
                                        za.a("Successfully cached " + str17 + " (" + file28.getAbsolutePath() + ", " + j46 + " bytes total, " + j41 + " new). New cache size: " + o5Var14.k.get(), (Throwable) null, 2, (Object) null);
                                        r11 = obj19;
                                        obj25 = file28;
                                        r11.b(null);
                                        return obj25;
                                    }
                                }
                            }
                            return coroutineSingletons5;
                        case 10:
                            iOException = (Throwable) eVar.d;
                            str14 = (String) eVar.f14717c;
                            Mutex mutex9 = (Mutex) eVar.f14716b;
                            ResultKt.b(objA);
                            str13 = str5;
                            obj15 = mutex9;
                            if (iOException == null) {
                                obj15 = obj13;
                                iOException = new IOException(str13 + str14);
                            }
                            obj15 = obj13;
                            objB2 = ResultKt.a(iOException);
                            obj24 = obj15;
                            obj25 = objB2;
                            r11 = obj24;
                            r11.b(null);
                            return obj25;
                        case 11:
                            str10 = (String) eVar.f14717c;
                            Mutex mutex10 = (Mutex) eVar.f14716b;
                            ResultKt.b(objA);
                            obj16 = mutex10;
                            obj16 = obj13;
                            objB2 = ResultKt.a(new IOException("Download succeeded but result was null for " + str10));
                            obj24 = obj16;
                            obj25 = objB2;
                            r11 = obj24;
                            r11.b(null);
                            return obj25;
                        case 12:
                            str10 = (String) eVar.f14717c;
                            Mutex mutex11 = (Mutex) eVar.f14716b;
                            ResultKt.b(objA);
                            str12 = "Downloaded file for ";
                            obj17 = mutex11;
                            obj17 = obj13;
                            objB2 = ResultKt.a(new IOException(str12 + str10 + " is empty."));
                            obj24 = obj17;
                            obj25 = objB2;
                            r11 = obj24;
                            r11.b(null);
                            return obj25;
                        case 13:
                            long j69 = eVar.f14722n;
                            j36 = eVar.m;
                            i4 = eVar.o;
                            long j70 = eVar.f14721l;
                            j20 = eVar.k;
                            file22 = (File) eVar.f14719h;
                            file20 = (File) eVar.g;
                            j37 = j69;
                            String str33 = (String) eVar.f;
                            Mutex mutex12 = (Mutex) eVar.f14718e;
                            b bVar23 = (b) eVar.d;
                            URL url18 = (URL) eVar.f14717c;
                            o5Var12 = (o5) eVar.f14716b;
                            ResultKt.b(objA);
                            bVar12 = bVar23;
                            coroutineSingletons4 = coroutineSingletons;
                            str4 = "toString(...)";
                            j25 = j70;
                            url11 = url18;
                            obj20 = mutex12;
                            str11 = str33;
                            jLongValue2 = j36;
                            jLongValue3 = ((Number) objA).longValue();
                            if (jLongValue3 > 0) {
                                o5Var12.k.addAndGet(-jLongValue3);
                                za.a("Freed " + jLongValue3 + " bytes via LRU. New cache size: " + o5Var12.k.get(), (Throwable) null, 2, (Object) null);
                            }
                            if (o5Var12.k.get() + jLongValue2 > j25) {
                                str18 = "Cannot cache ";
                                za.b(str18 + str11 + ". Not enough space freed.", (Throwable) null, 2, (Object) null);
                                nonCancellable4 = NonCancellable.X;
                                hVar = new h(file20, null);
                                eVar.f14716b = obj20;
                                eVar.f14717c = str11;
                                eVar.d = null;
                                eVar.f14718e = null;
                                eVar.f = null;
                                eVar.g = null;
                                eVar.f14719h = null;
                                eVar.r = 14;
                                if (BuildersKt.f(nonCancellable4, hVar, eVar) == coroutineSingletons4) {
                                    obj21 = obj20;
                                    return coroutineSingletons4;
                                }
                                obj21 = obj20;
                                objB2 = ResultKt.a(new IOException(str18 + str11 + ". Not enough space freed after eviction."));
                                obj24 = obj21;
                                obj25 = objB2;
                                r11 = obj24;
                                r11.b(null);
                                return obj25;
                            }
                            url10 = url11;
                            i3 = i4;
                            file23 = file22;
                            coroutineSingletons3 = coroutineSingletons4;
                            o5Var10 = o5Var12;
                            str10 = str11;
                            j34 = j37;
                            obj18 = obj20;
                            obj19 = obj18;
                            bVar14 = bVar12;
                            j39 = jLongValue2;
                            o3 o3Var16 = o5Var10.f14696b;
                            eVar.f14716b = o5Var10;
                            eVar.f14717c = url10;
                            eVar.d = bVar14;
                            eVar.f14718e = obj19;
                            eVar.f = str10;
                            eVar.g = file20;
                            eVar.f14719h = file23;
                            str16 = str10;
                            eVar.f14720i = null;
                            eVar.j = null;
                            eVar.k = j20;
                            eVar.o = i3;
                            eVar.f14721l = j39;
                            eVar.m = j34;
                            eVar.r = 15;
                            objB3 = o3Var16.b(file20, file23, eVar);
                            coroutineSingletons5 = coroutineSingletons3;
                            if (objB3 != coroutineSingletons5) {
                                j40 = j34;
                                url13 = url10;
                                file24 = file23;
                                bVar15 = bVar14;
                                objA = objB3;
                                o5Var14 = o5Var10;
                                j41 = j39;
                                j42 = j20;
                                file25 = file20;
                                str17 = str16;
                                obj22 = obj19;
                                if (!((Boolean) objA).booleanValue()) {
                                    za.b("Failed to finalize data file for " + str17, (Throwable) null, 2, (Object) null);
                                    nonCancellable5 = NonCancellable.X;
                                    iVar = new i(file25, null);
                                    eVar.f14716b = obj22;
                                    eVar.f14717c = str17;
                                    eVar.d = null;
                                    eVar.f14718e = null;
                                    eVar.f = null;
                                    eVar.g = null;
                                    eVar.f14719h = null;
                                    eVar.r = 16;
                                    if (BuildersKt.f(nonCancellable5, iVar, eVar) != coroutineSingletons5) {
                                        obj23 = obj22;
                                        str21 = str17;
                                        objB2 = ResultKt.a(new IOException("Failed to finalize cached file for " + str21));
                                        obj24 = obj23;
                                        obj25 = objB2;
                                        r11 = obj24;
                                        r11.b(null);
                                        return obj25;
                                    }
                                } else {
                                    o5Var14.k.addAndGet(j41);
                                    if (j42 == -1) {
                                    }
                                    str19 = str4;
                                    j43 = j40;
                                    file26 = file24;
                                    long jCurrentTimeMillis8 = System.currentTimeMillis() + ((Number) o5Var14.f14700i.invoke()).longValue();
                                    String string17 = url13.toString();
                                    Intrinsics.e(string17, str19);
                                    l3Var = new l3(string17, jCurrentTimeMillis8);
                                    o3Var = o5Var14.f14696b;
                                    eVar.f14716b = o5Var14;
                                    eVar.f14717c = url13;
                                    eVar.d = bVar15;
                                    eVar.f14718e = obj22;
                                    eVar.f = str17;
                                    eVar.g = file26;
                                    eVar.f14719h = null;
                                    eVar.k = j41;
                                    j44 = j41;
                                    eVar.f14721l = j43;
                                    eVar.r = 17;
                                    if (o3Var.a(url13, l3Var, eVar) != coroutineSingletons5) {
                                        o5Var15 = o5Var14;
                                        j45 = j43;
                                        file27 = file26;
                                        str20 = str17;
                                        j41 = j44;
                                        obj26 = obj22;
                                        b bVar114 = new b(0L, j45 - 1, j45, file27, 0L, true, 16, null);
                                        String string18 = url13.toString();
                                        Intrinsics.e(string18, str19);
                                        o5Var15.a(string18, bVar114, bVar15);
                                        str17 = str20;
                                        o5Var14 = o5Var15;
                                        j46 = j45;
                                        file28 = file27;
                                        obj19 = obj26;
                                        za.a("Successfully cached " + str17 + " (" + file28.getAbsolutePath() + ", " + j46 + " bytes total, " + j41 + " new). New cache size: " + o5Var14.k.get(), (Throwable) null, 2, (Object) null);
                                        r11 = obj19;
                                        obj25 = file28;
                                        r11.b(null);
                                        return obj25;
                                    }
                                }
                            }
                            return coroutineSingletons5;
                        case 14:
                            String str34 = (String) eVar.f14717c;
                            Mutex mutex13 = (Mutex) eVar.f14716b;
                            ResultKt.b(objA);
                            str11 = str34;
                            str18 = "Cannot cache ";
                            obj21 = mutex13;
                            obj21 = obj20;
                            objB2 = ResultKt.a(new IOException(str18 + str11 + ". Not enough space freed after eviction."));
                            obj24 = obj21;
                            obj25 = objB2;
                            r11 = obj24;
                            r11.b(null);
                            return obj25;
                        case 15:
                            long j71 = eVar.m;
                            j41 = eVar.f14721l;
                            i3 = eVar.o;
                            j42 = eVar.k;
                            File file41 = (File) eVar.f14719h;
                            file25 = (File) eVar.g;
                            str17 = (String) eVar.f;
                            obj = (Mutex) eVar.f14718e;
                            b bVar24 = (b) eVar.d;
                            url13 = (URL) eVar.f14717c;
                            o5 o5Var23 = (o5) eVar.f14716b;
                            try {
                                ResultKt.b(objA);
                                o5Var14 = o5Var23;
                                file24 = file41;
                                coroutineSingletons5 = coroutineSingletons;
                                str4 = "toString(...)";
                                obj22 = obj;
                                j40 = j71;
                                bVar15 = bVar24;
                                if (!((Boolean) objA).booleanValue()) {
                                    za.b("Failed to finalize data file for " + str17, (Throwable) null, 2, (Object) null);
                                    nonCancellable5 = NonCancellable.X;
                                    iVar = new i(file25, null);
                                    eVar.f14716b = obj22;
                                    eVar.f14717c = str17;
                                    eVar.d = null;
                                    eVar.f14718e = null;
                                    eVar.f = null;
                                    eVar.g = null;
                                    eVar.f14719h = null;
                                    eVar.r = 16;
                                    if (BuildersKt.f(nonCancellable5, iVar, eVar) != coroutineSingletons5) {
                                        obj23 = obj22;
                                        str21 = str17;
                                        objB2 = ResultKt.a(new IOException("Failed to finalize cached file for " + str21));
                                        obj24 = obj23;
                                        obj25 = objB2;
                                        r11 = obj24;
                                        r11.b(null);
                                        return obj25;
                                    }
                                } else {
                                    o5Var14.k.addAndGet(j41);
                                    if (j42 == -1) {
                                    }
                                    str19 = str4;
                                    j43 = j40;
                                    file26 = file24;
                                    long jCurrentTimeMillis9 = System.currentTimeMillis() + ((Number) o5Var14.f14700i.invoke()).longValue();
                                    String string19 = url13.toString();
                                    Intrinsics.e(string19, str19);
                                    l3Var = new l3(string19, jCurrentTimeMillis9);
                                    o3Var = o5Var14.f14696b;
                                    eVar.f14716b = o5Var14;
                                    eVar.f14717c = url13;
                                    eVar.d = bVar15;
                                    eVar.f14718e = obj22;
                                    eVar.f = str17;
                                    eVar.g = file26;
                                    eVar.f14719h = null;
                                    eVar.k = j41;
                                    j44 = j41;
                                    eVar.f14721l = j43;
                                    eVar.r = 17;
                                    if (o3Var.a(url13, l3Var, eVar) != coroutineSingletons5) {
                                        o5Var15 = o5Var14;
                                        j45 = j43;
                                        file27 = file26;
                                        str20 = str17;
                                        j41 = j44;
                                        obj26 = obj22;
                                        b bVar115 = new b(0L, j45 - 1, j45, file27, 0L, true, 16, null);
                                        String string110 = url13.toString();
                                        Intrinsics.e(string110, str19);
                                        o5Var15.a(string110, bVar115, bVar15);
                                        str17 = str20;
                                        o5Var14 = o5Var15;
                                        j46 = j45;
                                        file28 = file27;
                                        obj19 = obj26;
                                        za.a("Successfully cached " + str17 + " (" + file28.getAbsolutePath() + ", " + j46 + " bytes total, " + j41 + " new). New cache size: " + o5Var14.k.get(), (Throwable) null, 2, (Object) null);
                                        r11 = obj19;
                                        obj25 = file28;
                                        r11.b(null);
                                        return obj25;
                                    }
                                }
                                return coroutineSingletons5;
                            } catch (Throwable th23) {
                                th = th23;
                                r8 = obj;
                                r8.b(null);
                                throw th;
                            }
                        case 16:
                            str21 = (String) eVar.f14717c;
                            Mutex mutex14 = (Mutex) eVar.f14716b;
                            ResultKt.b(objA);
                            obj23 = mutex14;
                            objB2 = ResultKt.a(new IOException("Failed to finalize cached file for " + str21));
                            obj24 = obj23;
                            obj25 = objB2;
                            r11 = obj24;
                            r11.b(null);
                            return obj25;
                        case 17:
                            long j72 = eVar.f14721l;
                            j41 = eVar.k;
                            File file42 = (File) eVar.g;
                            str20 = (String) eVar.f;
                            Mutex mutex15 = (Mutex) eVar.f14718e;
                            bVar15 = (b) eVar.d;
                            URL url19 = (URL) eVar.f14717c;
                            o5Var15 = (o5) eVar.f14716b;
                            ResultKt.b(objA);
                            j45 = j72;
                            file27 = file42;
                            url13 = url19;
                            obj26 = mutex15;
                            str19 = "toString(...)";
                            b bVar116 = new b(0L, j45 - 1, j45, file27, 0L, true, 16, null);
                            String string111 = url13.toString();
                            Intrinsics.e(string111, str19);
                            o5Var15.a(string111, bVar116, bVar15);
                            str17 = str20;
                            o5Var14 = o5Var15;
                            j46 = j45;
                            file28 = file27;
                            obj19 = obj26;
                            za.a("Successfully cached " + str17 + " (" + file28.getAbsolutePath() + ", " + j46 + " bytes total, " + j41 + " new). New cache size: " + o5Var14.k.get(), (Throwable) null, 2, (Object) null);
                            r11 = obj19;
                            obj25 = file28;
                            r11.b(null);
                            return obj25;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                str = "Cache size limit check: Need to free ";
                switch (eVar.r) {
                    case 0:
                        ResultKt.b(objA);
                        jLongValue = ((Number) this.g.invoke()).longValue();
                        mutex = this.m;
                        eVar.f14716b = this;
                        eVar.f14717c = url;
                        eVar.d = bVar;
                        eVar.f14718e = mutex;
                        eVar.k = j2;
                        eVar.f14721l = jLongValue;
                        eVar.r = 1;
                        if (mutex.a(eVar) != coroutineSingletons) {
                            o5Var = this;
                            str6 = "Resuming download for ";
                            obj = mutex;
                            j3 = jLongValue;
                            url2 = url;
                            j4 = j2;
                            bVar2 = bVar;
                            string = url2.toString();
                            Intrinsics.e(string, "toString(...)");
                            if (j4 == -1) {
                                string = string + "_" + j4;
                            }
                            if (bVar2 == null) {
                                fileA = o5Var.f14696b.a(url2);
                                o3 o3Var17 = o5Var.f14696b;
                                eVar.f14716b = o5Var;
                                eVar.f14717c = url2;
                                eVar.d = bVar2;
                                eVar.f14718e = obj;
                                eVar.f = string;
                                eVar.g = fileA;
                                eVar.k = j4;
                                eVar.f14721l = j3;
                                o5Var2 = o5Var;
                                eVar.r = 3;
                                objB = o3Var17.b(url2, eVar);
                                if (objB != coroutineSingletons) {
                                    bVar3 = bVar2;
                                    j5 = j4;
                                    fileA2 = fileA;
                                    str7 = string;
                                    j6 = j3;
                                    url3 = url2;
                                    objA = objB;
                                    o5Var3 = o5Var2;
                                    obj3 = obj;
                                    l3 l3Var6 = (l3) objA;
                                    if (j5 == -1) {
                                        if (j5 != -1) {
                                            fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                                        }
                                        if (!fileA2.exists()) {
                                            if (j5 == -1) {
                                            }
                                            File file2112 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file2112;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j5110 = o5Var4.f14699h;
                                                StringBuilder sb1114 = new StringBuilder(str25);
                                                sb1114.append(str8);
                                                String str2117 = str22;
                                                sb1114.append(str2117);
                                                sb1114.append(j5110);
                                                za.e(sb1114.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str2117 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb1115 = new StringBuilder("Cache directory not available for ");
                                                sb1115.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb1115.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        } else {
                                            if (j5 == -1) {
                                            }
                                            File file2113 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file2113;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j5111 = o5Var4.f14699h;
                                                StringBuilder sb1116 = new StringBuilder(str25);
                                                sb1116.append(str8);
                                                String str2118 = str22;
                                                sb1116.append(str2118);
                                                sb1116.append(j5111);
                                                za.e(sb1116.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str2118 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb1117 = new StringBuilder("Cache directory not available for ");
                                                sb1117.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb1117.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        }
                                    } else {
                                        if (j5 != -1) {
                                            fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                                        }
                                        if (!fileA2.exists()) {
                                            if (j5 == -1) {
                                            }
                                            File file2114 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file2114;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j5112 = o5Var4.f14699h;
                                                StringBuilder sb1118 = new StringBuilder(str25);
                                                sb1118.append(str8);
                                                String str2119 = str22;
                                                sb1118.append(str2119);
                                                sb1118.append(j5112);
                                                za.e(sb1118.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str2119 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb1119 = new StringBuilder("Cache directory not available for ");
                                                sb1119.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb1119.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        } else {
                                            if (j5 == -1) {
                                            }
                                            File file2115 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file2115;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j5113 = o5Var4.f14699h;
                                                StringBuilder sb11110 = new StringBuilder(str25);
                                                sb11110.append(str8);
                                                String str21110 = str22;
                                                sb11110.append(str21110);
                                                sb11110.append(j5113);
                                                za.e(sb11110.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str21110 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb11111 = new StringBuilder("Cache directory not available for ");
                                                sb11111.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb11111.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        }
                                    }
                                    r11.b(null);
                                    return obj25;
                                }
                            } else {
                                fileA = o5Var.f14696b.a(url2);
                                o3 o3Var18 = o5Var.f14696b;
                                eVar.f14716b = o5Var;
                                eVar.f14717c = url2;
                                eVar.d = bVar2;
                                eVar.f14718e = obj;
                                eVar.f = string;
                                eVar.g = fileA;
                                eVar.k = j4;
                                eVar.f14721l = j3;
                                o5Var2 = o5Var;
                                eVar.r = 3;
                                objB = o3Var18.b(url2, eVar);
                                if (objB != coroutineSingletons) {
                                    bVar3 = bVar2;
                                    j5 = j4;
                                    fileA2 = fileA;
                                    str7 = string;
                                    j6 = j3;
                                    url3 = url2;
                                    objA = objB;
                                    o5Var3 = o5Var2;
                                    obj3 = obj;
                                    l3 l3Var7 = (l3) objA;
                                    if (j5 == -1) {
                                        if (j5 != -1) {
                                            fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                                        }
                                        if (!fileA2.exists()) {
                                            if (j5 == -1) {
                                            }
                                            File file2116 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file2116;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j5114 = o5Var4.f14699h;
                                                StringBuilder sb11112 = new StringBuilder(str25);
                                                sb11112.append(str8);
                                                String str21111 = str22;
                                                sb11112.append(str21111);
                                                sb11112.append(j5114);
                                                za.e(sb11112.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str21111 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb11113 = new StringBuilder("Cache directory not available for ");
                                                sb11113.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb11113.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        } else {
                                            if (j5 == -1) {
                                            }
                                            File file2117 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file2117;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j5115 = o5Var4.f14699h;
                                                StringBuilder sb11114 = new StringBuilder(str25);
                                                sb11114.append(str8);
                                                String str21112 = str22;
                                                sb11114.append(str21112);
                                                sb11114.append(j5115);
                                                za.e(sb11114.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str21112 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb11115 = new StringBuilder("Cache directory not available for ");
                                                sb11115.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb11115.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        }
                                    } else {
                                        if (j5 != -1) {
                                            fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                                        }
                                        if (!fileA2.exists()) {
                                            if (j5 == -1) {
                                            }
                                            File file2118 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file2118;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j5116 = o5Var4.f14699h;
                                                StringBuilder sb11116 = new StringBuilder(str25);
                                                sb11116.append(str8);
                                                String str21113 = str22;
                                                sb11116.append(str21113);
                                                sb11116.append(j5116);
                                                za.e(sb11116.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str21113 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb11117 = new StringBuilder("Cache directory not available for ");
                                                sb11117.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb11117.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        } else {
                                            if (j5 == -1) {
                                            }
                                            File file2119 = fileA2;
                                            coroutineSingletons = coroutineSingletons;
                                            obj27 = obj3;
                                            file = fileA2;
                                            url4 = url3;
                                            bVar5 = bVar3;
                                            j7 = j5;
                                            o5Var4 = o5Var3;
                                            file2 = file2119;
                                            str8 = str7;
                                            j8 = j6;
                                            if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                                long j5117 = o5Var4.f14699h;
                                                StringBuilder sb11118 = new StringBuilder(str25);
                                                sb11118.append(str8);
                                                String str21114 = str22;
                                                sb11118.append(str21114);
                                                sb11118.append(j5117);
                                                za.e(sb11118.toString(), null, 2, null);
                                                objB2 = ResultKt.a(new IOException(str24 + str8 + str21114 + o5Var4.f14699h));
                                                obj24 = obj27;
                                            } else {
                                                fileA3 = o5Var4.f14696b.a();
                                                if (fileA3 == null) {
                                                }
                                                za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                                StringBuilder sb11119 = new StringBuilder("Cache directory not available for ");
                                                sb11119.append(str8);
                                                objB2 = ResultKt.a(new IOException(sb11119.toString()));
                                                obj24 = obj27;
                                            }
                                            obj25 = objB2;
                                            r11 = obj24;
                                        }
                                    }
                                    r11.b(null);
                                    return obj25;
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        long j521 = eVar.f14721l;
                        long j522 = eVar.k;
                        Mutex mutex16 = (Mutex) eVar.f14718e;
                        bVar2 = (b) eVar.d;
                        URL url110 = (URL) eVar.f14717c;
                        o5 o5Var24 = (o5) eVar.f14716b;
                        ResultKt.b(objA);
                        url2 = url110;
                        o5Var = o5Var24;
                        obj = mutex16;
                        j4 = j522;
                        str6 = "Resuming download for ";
                        j3 = j521;
                        string = url2.toString();
                        Intrinsics.e(string, "toString(...)");
                        if (j4 == -1) {
                            string = string + "_" + j4;
                        }
                        if (bVar2 == null) {
                            fileA = o5Var.f14696b.a(url2);
                            o3 o3Var19 = o5Var.f14696b;
                            eVar.f14716b = o5Var;
                            eVar.f14717c = url2;
                            eVar.d = bVar2;
                            eVar.f14718e = obj;
                            eVar.f = string;
                            eVar.g = fileA;
                            eVar.k = j4;
                            eVar.f14721l = j3;
                            o5Var2 = o5Var;
                            eVar.r = 3;
                            objB = o3Var19.b(url2, eVar);
                            if (objB != coroutineSingletons) {
                                bVar3 = bVar2;
                                j5 = j4;
                                fileA2 = fileA;
                                str7 = string;
                                j6 = j3;
                                url3 = url2;
                                objA = objB;
                                o5Var3 = o5Var2;
                                obj3 = obj;
                                l3 l3Var8 = (l3) objA;
                                if (j5 == -1) {
                                    if (j5 != -1) {
                                        fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                                    }
                                    if (!fileA2.exists()) {
                                        if (j5 == -1) {
                                        }
                                        File file21110 = fileA2;
                                        coroutineSingletons = coroutineSingletons;
                                        obj27 = obj3;
                                        file = fileA2;
                                        url4 = url3;
                                        bVar5 = bVar3;
                                        j7 = j5;
                                        o5Var4 = o5Var3;
                                        file2 = file21110;
                                        str8 = str7;
                                        j8 = j6;
                                        if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                            long j5118 = o5Var4.f14699h;
                                            StringBuilder sb111110 = new StringBuilder(str25);
                                            sb111110.append(str8);
                                            String str21115 = str22;
                                            sb111110.append(str21115);
                                            sb111110.append(j5118);
                                            za.e(sb111110.toString(), null, 2, null);
                                            objB2 = ResultKt.a(new IOException(str24 + str8 + str21115 + o5Var4.f14699h));
                                            obj24 = obj27;
                                        } else {
                                            fileA3 = o5Var4.f14696b.a();
                                            if (fileA3 == null) {
                                            }
                                            za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                            StringBuilder sb111111 = new StringBuilder("Cache directory not available for ");
                                            sb111111.append(str8);
                                            objB2 = ResultKt.a(new IOException(sb111111.toString()));
                                            obj24 = obj27;
                                        }
                                        obj25 = objB2;
                                        r11 = obj24;
                                    } else {
                                        if (j5 == -1) {
                                        }
                                        File file21111 = fileA2;
                                        coroutineSingletons = coroutineSingletons;
                                        obj27 = obj3;
                                        file = fileA2;
                                        url4 = url3;
                                        bVar5 = bVar3;
                                        j7 = j5;
                                        o5Var4 = o5Var3;
                                        file2 = file21111;
                                        str8 = str7;
                                        j8 = j6;
                                        if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                            long j5119 = o5Var4.f14699h;
                                            StringBuilder sb111112 = new StringBuilder(str25);
                                            sb111112.append(str8);
                                            String str21116 = str22;
                                            sb111112.append(str21116);
                                            sb111112.append(j5119);
                                            za.e(sb111112.toString(), null, 2, null);
                                            objB2 = ResultKt.a(new IOException(str24 + str8 + str21116 + o5Var4.f14699h));
                                            obj24 = obj27;
                                        } else {
                                            fileA3 = o5Var4.f14696b.a();
                                            if (fileA3 == null) {
                                            }
                                            za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                            StringBuilder sb111113 = new StringBuilder("Cache directory not available for ");
                                            sb111113.append(str8);
                                            objB2 = ResultKt.a(new IOException(sb111113.toString()));
                                            obj24 = obj27;
                                        }
                                        obj25 = objB2;
                                        r11 = obj24;
                                    }
                                } else {
                                    if (j5 != -1) {
                                        fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                                    }
                                    if (!fileA2.exists()) {
                                        if (j5 == -1) {
                                        }
                                        File file21112 = fileA2;
                                        coroutineSingletons = coroutineSingletons;
                                        obj27 = obj3;
                                        file = fileA2;
                                        url4 = url3;
                                        bVar5 = bVar3;
                                        j7 = j5;
                                        o5Var4 = o5Var3;
                                        file2 = file21112;
                                        str8 = str7;
                                        j8 = j6;
                                        if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                            long j51110 = o5Var4.f14699h;
                                            StringBuilder sb111114 = new StringBuilder(str25);
                                            sb111114.append(str8);
                                            String str21117 = str22;
                                            sb111114.append(str21117);
                                            sb111114.append(j51110);
                                            za.e(sb111114.toString(), null, 2, null);
                                            objB2 = ResultKt.a(new IOException(str24 + str8 + str21117 + o5Var4.f14699h));
                                            obj24 = obj27;
                                        } else {
                                            fileA3 = o5Var4.f14696b.a();
                                            if (fileA3 == null) {
                                            }
                                            za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                            StringBuilder sb111115 = new StringBuilder("Cache directory not available for ");
                                            sb111115.append(str8);
                                            objB2 = ResultKt.a(new IOException(sb111115.toString()));
                                            obj24 = obj27;
                                        }
                                        obj25 = objB2;
                                        r11 = obj24;
                                    } else {
                                        if (j5 == -1) {
                                        }
                                        File file21113 = fileA2;
                                        coroutineSingletons = coroutineSingletons;
                                        obj27 = obj3;
                                        file = fileA2;
                                        url4 = url3;
                                        bVar5 = bVar3;
                                        j7 = j5;
                                        o5Var4 = o5Var3;
                                        file2 = file21113;
                                        str8 = str7;
                                        j8 = j6;
                                        if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                            long j51111 = o5Var4.f14699h;
                                            StringBuilder sb111116 = new StringBuilder(str25);
                                            sb111116.append(str8);
                                            String str21118 = str22;
                                            sb111116.append(str21118);
                                            sb111116.append(j51111);
                                            za.e(sb111116.toString(), null, 2, null);
                                            objB2 = ResultKt.a(new IOException(str24 + str8 + str21118 + o5Var4.f14699h));
                                            obj24 = obj27;
                                        } else {
                                            fileA3 = o5Var4.f14696b.a();
                                            if (fileA3 == null) {
                                            }
                                            za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                            StringBuilder sb111117 = new StringBuilder("Cache directory not available for ");
                                            sb111117.append(str8);
                                            objB2 = ResultKt.a(new IOException(sb111117.toString()));
                                            obj24 = obj27;
                                        }
                                        obj25 = objB2;
                                        r11 = obj24;
                                    }
                                }
                                r11.b(null);
                                return obj25;
                            }
                        } else {
                            fileA = o5Var.f14696b.a(url2);
                            o3 o3Var110 = o5Var.f14696b;
                            eVar.f14716b = o5Var;
                            eVar.f14717c = url2;
                            eVar.d = bVar2;
                            eVar.f14718e = obj;
                            eVar.f = string;
                            eVar.g = fileA;
                            eVar.k = j4;
                            eVar.f14721l = j3;
                            o5Var2 = o5Var;
                            eVar.r = 3;
                            objB = o3Var110.b(url2, eVar);
                            if (objB != coroutineSingletons) {
                                bVar3 = bVar2;
                                j5 = j4;
                                fileA2 = fileA;
                                str7 = string;
                                j6 = j3;
                                url3 = url2;
                                objA = objB;
                                o5Var3 = o5Var2;
                                obj3 = obj;
                                l3 l3Var9 = (l3) objA;
                                if (j5 == -1) {
                                    if (j5 != -1) {
                                        fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                                    }
                                    if (!fileA2.exists()) {
                                        if (j5 == -1) {
                                        }
                                        File file21114 = fileA2;
                                        coroutineSingletons = coroutineSingletons;
                                        obj27 = obj3;
                                        file = fileA2;
                                        url4 = url3;
                                        bVar5 = bVar3;
                                        j7 = j5;
                                        o5Var4 = o5Var3;
                                        file2 = file21114;
                                        str8 = str7;
                                        j8 = j6;
                                        if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                            long j51112 = o5Var4.f14699h;
                                            StringBuilder sb111118 = new StringBuilder(str25);
                                            sb111118.append(str8);
                                            String str21119 = str22;
                                            sb111118.append(str21119);
                                            sb111118.append(j51112);
                                            za.e(sb111118.toString(), null, 2, null);
                                            objB2 = ResultKt.a(new IOException(str24 + str8 + str21119 + o5Var4.f14699h));
                                            obj24 = obj27;
                                        } else {
                                            fileA3 = o5Var4.f14696b.a();
                                            if (fileA3 == null) {
                                            }
                                            za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                            StringBuilder sb111119 = new StringBuilder("Cache directory not available for ");
                                            sb111119.append(str8);
                                            objB2 = ResultKt.a(new IOException(sb111119.toString()));
                                            obj24 = obj27;
                                        }
                                        obj25 = objB2;
                                        r11 = obj24;
                                    } else {
                                        if (j5 == -1) {
                                        }
                                        File file21115 = fileA2;
                                        coroutineSingletons = coroutineSingletons;
                                        obj27 = obj3;
                                        file = fileA2;
                                        url4 = url3;
                                        bVar5 = bVar3;
                                        j7 = j5;
                                        o5Var4 = o5Var3;
                                        file2 = file21115;
                                        str8 = str7;
                                        j8 = j6;
                                        if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                            long j51113 = o5Var4.f14699h;
                                            StringBuilder sb1111110 = new StringBuilder(str25);
                                            sb1111110.append(str8);
                                            String str211110 = str22;
                                            sb1111110.append(str211110);
                                            sb1111110.append(j51113);
                                            za.e(sb1111110.toString(), null, 2, null);
                                            objB2 = ResultKt.a(new IOException(str24 + str8 + str211110 + o5Var4.f14699h));
                                            obj24 = obj27;
                                        } else {
                                            fileA3 = o5Var4.f14696b.a();
                                            if (fileA3 == null) {
                                            }
                                            za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                            StringBuilder sb1111111 = new StringBuilder("Cache directory not available for ");
                                            sb1111111.append(str8);
                                            objB2 = ResultKt.a(new IOException(sb1111111.toString()));
                                            obj24 = obj27;
                                        }
                                        obj25 = objB2;
                                        r11 = obj24;
                                    }
                                } else {
                                    if (j5 != -1) {
                                        fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                                    }
                                    if (!fileA2.exists()) {
                                        if (j5 == -1) {
                                        }
                                        File file21116 = fileA2;
                                        coroutineSingletons = coroutineSingletons;
                                        obj27 = obj3;
                                        file = fileA2;
                                        url4 = url3;
                                        bVar5 = bVar3;
                                        j7 = j5;
                                        o5Var4 = o5Var3;
                                        file2 = file21116;
                                        str8 = str7;
                                        j8 = j6;
                                        if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                            long j51114 = o5Var4.f14699h;
                                            StringBuilder sb1111112 = new StringBuilder(str25);
                                            sb1111112.append(str8);
                                            String str211111 = str22;
                                            sb1111112.append(str211111);
                                            sb1111112.append(j51114);
                                            za.e(sb1111112.toString(), null, 2, null);
                                            objB2 = ResultKt.a(new IOException(str24 + str8 + str211111 + o5Var4.f14699h));
                                            obj24 = obj27;
                                        } else {
                                            fileA3 = o5Var4.f14696b.a();
                                            if (fileA3 == null) {
                                            }
                                            za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                            StringBuilder sb1111113 = new StringBuilder("Cache directory not available for ");
                                            sb1111113.append(str8);
                                            objB2 = ResultKt.a(new IOException(sb1111113.toString()));
                                            obj24 = obj27;
                                        }
                                        obj25 = objB2;
                                        r11 = obj24;
                                    } else {
                                        if (j5 == -1) {
                                        }
                                        File file21117 = fileA2;
                                        coroutineSingletons = coroutineSingletons;
                                        obj27 = obj3;
                                        file = fileA2;
                                        url4 = url3;
                                        bVar5 = bVar3;
                                        j7 = j5;
                                        o5Var4 = o5Var3;
                                        file2 = file21117;
                                        str8 = str7;
                                        j8 = j6;
                                        if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                            long j51115 = o5Var4.f14699h;
                                            StringBuilder sb1111114 = new StringBuilder(str25);
                                            sb1111114.append(str8);
                                            String str211112 = str22;
                                            sb1111114.append(str211112);
                                            sb1111114.append(j51115);
                                            za.e(sb1111114.toString(), null, 2, null);
                                            objB2 = ResultKt.a(new IOException(str24 + str8 + str211112 + o5Var4.f14699h));
                                            obj24 = obj27;
                                        } else {
                                            fileA3 = o5Var4.f14696b.a();
                                            if (fileA3 == null) {
                                            }
                                            za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                            StringBuilder sb1111115 = new StringBuilder("Cache directory not available for ");
                                            sb1111115.append(str8);
                                            objB2 = ResultKt.a(new IOException(sb1111115.toString()));
                                            obj24 = obj27;
                                        }
                                        obj25 = objB2;
                                        r11 = obj24;
                                    }
                                }
                                r11.b(null);
                                return obj25;
                            }
                        }
                        return coroutineSingletons;
                    case 2:
                        Mutex mutex17 = (Mutex) eVar.f14717c;
                        bVar4 = (b) eVar.f14716b;
                        ResultKt.b(objA);
                        obj2 = mutex17;
                        objB2 = bVar4.b();
                        obj24 = obj2;
                        obj25 = objB2;
                        r11 = obj24;
                        r11.b(null);
                        return obj25;
                    case 3:
                        str23 = "temp_";
                        long j610 = eVar.f14721l;
                        long j611 = eVar.k;
                        File file312 = (File) eVar.g;
                        String str35 = (String) eVar.f;
                        mutex2 = (Mutex) eVar.f14718e;
                        b bVar25 = (b) eVar.d;
                        URL url111 = (URL) eVar.f14717c;
                        o5 o5Var25 = (o5) eVar.f14716b;
                        ResultKt.b(objA);
                        o5Var3 = o5Var25;
                        str4 = "toString(...)";
                        bVar3 = bVar25;
                        str7 = str35;
                        j5 = j611;
                        str25 = "Not enough free disk space to attempt download for ";
                        str6 = "Resuming download for ";
                        j6 = j610;
                        obj3 = mutex2;
                        str22 = ". Required: ";
                        str24 = "Not enough free space on device for ";
                        fileA2 = file312;
                        url3 = url111;
                        l3 l3Var10 = (l3) objA;
                        if (j5 == -1) {
                            if (j5 != -1) {
                                fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                            }
                            if (!fileA2.exists()) {
                                if (j5 == -1) {
                                }
                                File file21118 = fileA2;
                                coroutineSingletons = coroutineSingletons;
                                obj27 = obj3;
                                file = fileA2;
                                url4 = url3;
                                bVar5 = bVar3;
                                j7 = j5;
                                o5Var4 = o5Var3;
                                file2 = file21118;
                                str8 = str7;
                                j8 = j6;
                                if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                    long j51116 = o5Var4.f14699h;
                                    StringBuilder sb1111116 = new StringBuilder(str25);
                                    sb1111116.append(str8);
                                    String str211113 = str22;
                                    sb1111116.append(str211113);
                                    sb1111116.append(j51116);
                                    za.e(sb1111116.toString(), null, 2, null);
                                    objB2 = ResultKt.a(new IOException(str24 + str8 + str211113 + o5Var4.f14699h));
                                    obj24 = obj27;
                                } else {
                                    fileA3 = o5Var4.f14696b.a();
                                    if (fileA3 == null) {
                                    }
                                    za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                    StringBuilder sb1111117 = new StringBuilder("Cache directory not available for ");
                                    sb1111117.append(str8);
                                    objB2 = ResultKt.a(new IOException(sb1111117.toString()));
                                    obj24 = obj27;
                                }
                                obj25 = objB2;
                                r11 = obj24;
                            } else {
                                if (j5 == -1) {
                                }
                                File file21119 = fileA2;
                                coroutineSingletons = coroutineSingletons;
                                obj27 = obj3;
                                file = fileA2;
                                url4 = url3;
                                bVar5 = bVar3;
                                j7 = j5;
                                o5Var4 = o5Var3;
                                file2 = file21119;
                                str8 = str7;
                                j8 = j6;
                                if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                    long j51117 = o5Var4.f14699h;
                                    StringBuilder sb1111118 = new StringBuilder(str25);
                                    sb1111118.append(str8);
                                    String str211114 = str22;
                                    sb1111118.append(str211114);
                                    sb1111118.append(j51117);
                                    za.e(sb1111118.toString(), null, 2, null);
                                    objB2 = ResultKt.a(new IOException(str24 + str8 + str211114 + o5Var4.f14699h));
                                    obj24 = obj27;
                                } else {
                                    fileA3 = o5Var4.f14696b.a();
                                    if (fileA3 == null) {
                                    }
                                    za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                    StringBuilder sb1111119 = new StringBuilder("Cache directory not available for ");
                                    sb1111119.append(str8);
                                    objB2 = ResultKt.a(new IOException(sb1111119.toString()));
                                    obj24 = obj27;
                                }
                                obj25 = objB2;
                                r11 = obj24;
                            }
                        } else {
                            if (j5 != -1) {
                                fileA2 = o5Var3.f14696b.a(new URL(url3.getProtocol(), url3.getHost(), url3.getPort(), url3.getFile() + "?partial=" + j5));
                            }
                            if (!fileA2.exists()) {
                                if (j5 == -1) {
                                }
                                File file211110 = fileA2;
                                coroutineSingletons = coroutineSingletons;
                                obj27 = obj3;
                                file = fileA2;
                                url4 = url3;
                                bVar5 = bVar3;
                                j7 = j5;
                                o5Var4 = o5Var3;
                                file2 = file211110;
                                str8 = str7;
                                j8 = j6;
                                if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                    long j51118 = o5Var4.f14699h;
                                    StringBuilder sb11111110 = new StringBuilder(str25);
                                    sb11111110.append(str8);
                                    String str211115 = str22;
                                    sb11111110.append(str211115);
                                    sb11111110.append(j51118);
                                    za.e(sb11111110.toString(), null, 2, null);
                                    objB2 = ResultKt.a(new IOException(str24 + str8 + str211115 + o5Var4.f14699h));
                                    obj24 = obj27;
                                } else {
                                    fileA3 = o5Var4.f14696b.a();
                                    if (fileA3 == null) {
                                    }
                                    za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                    StringBuilder sb11111111 = new StringBuilder("Cache directory not available for ");
                                    sb11111111.append(str8);
                                    objB2 = ResultKt.a(new IOException(sb11111111.toString()));
                                    obj24 = obj27;
                                }
                                obj25 = objB2;
                                r11 = obj24;
                            } else {
                                if (j5 == -1) {
                                }
                                File file211111 = fileA2;
                                coroutineSingletons = coroutineSingletons;
                                obj27 = obj3;
                                file = fileA2;
                                url4 = url3;
                                bVar5 = bVar3;
                                j7 = j5;
                                o5Var4 = o5Var3;
                                file2 = file211111;
                                str8 = str7;
                                j8 = j6;
                                if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                                    long j51119 = o5Var4.f14699h;
                                    StringBuilder sb11111112 = new StringBuilder(str25);
                                    sb11111112.append(str8);
                                    String str211116 = str22;
                                    sb11111112.append(str211116);
                                    sb11111112.append(j51119);
                                    za.e(sb11111112.toString(), null, 2, null);
                                    objB2 = ResultKt.a(new IOException(str24 + str8 + str211116 + o5Var4.f14699h));
                                    obj24 = obj27;
                                } else {
                                    fileA3 = o5Var4.f14696b.a();
                                    if (fileA3 == null) {
                                    }
                                    za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                                    StringBuilder sb11111113 = new StringBuilder("Cache directory not available for ");
                                    sb11111113.append(str8);
                                    objB2 = ResultKt.a(new IOException(sb11111113.toString()));
                                    obj24 = obj27;
                                }
                                obj25 = objB2;
                                r11 = obj24;
                            }
                        }
                        r11.b(null);
                        return obj25;
                    case 4:
                        fileA2 = (File) eVar.f14717c;
                        Mutex mutex18 = (Mutex) eVar.f14716b;
                        ResultKt.b(objA);
                        obj4 = mutex18;
                        objB2 = fileA2;
                        obj24 = obj4;
                        obj25 = objB2;
                        r11 = obj24;
                        r11.b(null);
                        return obj25;
                    case 5:
                        fileA2 = (File) eVar.f14717c;
                        Mutex mutex19 = (Mutex) eVar.f14716b;
                        ResultKt.b(objA);
                        obj4 = mutex19;
                        objB2 = fileA2;
                        obj24 = obj4;
                        obj25 = objB2;
                        r11 = obj24;
                        r11.b(null);
                        return obj25;
                    case 6:
                        long j612 = eVar.m;
                        long j613 = eVar.f14721l;
                        long j614 = eVar.k;
                        File file313 = (File) eVar.f14719h;
                        File file314 = (File) eVar.g;
                        file3 = file313;
                        String str36 = (String) eVar.f;
                        mutex3 = (Mutex) eVar.f14718e;
                        b bVar26 = (b) eVar.d;
                        URL url112 = (URL) eVar.f14717c;
                        o5Var5 = (o5) eVar.f14716b;
                        ResultKt.b(objA);
                        str26 = "Expired file ";
                        str4 = "toString(...)";
                        str2 = "_";
                        j9 = j613;
                        str7 = str36;
                        obj5 = mutex3;
                        bVar6 = bVar26;
                        str22 = ". Required: ";
                        str24 = "Not enough free space on device for ";
                        url5 = url112;
                        str23 = "temp_";
                        file2 = file314;
                        j11 = j612;
                        str6 = "Resuming download for ";
                        str25 = "Not enough free disk space to attempt download for ";
                        j10 = j614;
                        file4 = file3;
                        if (((Boolean) objA).booleanValue()) {
                            if (j11 > 0) {
                                o5Var5.k.addAndGet(-j11);
                            }
                            m3Var = o5Var5.f14698e;
                            s7Var = s7.TTL_EXPIRED;
                            eVar.f14716b = o5Var5;
                            eVar.f14717c = url5;
                            eVar.d = bVar6;
                            eVar.f14718e = obj5;
                            eVar.f = str7;
                            eVar.g = file2;
                            eVar.f14719h = file4;
                            eVar.k = j10;
                            j8 = j9;
                            eVar.f14721l = j8;
                            eVar.r = 7;
                            if (m3Var.a(url5, s7Var, eVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            o5Var6 = o5Var5;
                            str9 = str7;
                            obj7 = obj5;
                            File file315 = file4;
                            za.a(str26 + str9 + " evicted. New size: " + o5Var6.k.get(), (Throwable) null, 2, (Object) null);
                            o5Var4 = o5Var6;
                            url4 = url5;
                            Object obj213 = obj7;
                            file = file315;
                            long j413 = j10;
                            bVar5 = bVar6;
                            j7 = j413;
                            str8 = str9;
                            obj27 = obj213;
                        } else {
                            j8 = j9;
                            Object obj214 = obj5;
                            file = file4;
                            o5Var4 = o5Var5;
                            obj27 = obj214;
                            url4 = url5;
                            long j414 = j10;
                            bVar5 = bVar6;
                            j7 = j414;
                            str8 = str7;
                        }
                        if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                            long j511110 = o5Var4.f14699h;
                            StringBuilder sb11111114 = new StringBuilder(str25);
                            sb11111114.append(str8);
                            String str211117 = str22;
                            sb11111114.append(str211117);
                            sb11111114.append(j511110);
                            za.e(sb11111114.toString(), null, 2, null);
                            objB2 = ResultKt.a(new IOException(str24 + str8 + str211117 + o5Var4.f14699h));
                            obj24 = obj27;
                        } else {
                            fileA3 = o5Var4.f14696b.a();
                            if (fileA3 == null) {
                            }
                            za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                            StringBuilder sb11111115 = new StringBuilder("Cache directory not available for ");
                            sb11111115.append(str8);
                            objB2 = ResultKt.a(new IOException(sb11111115.toString()));
                            obj24 = obj27;
                        }
                        obj25 = objB2;
                        r11 = obj24;
                        r11.b(null);
                        return obj25;
                    case 7:
                        long j615 = eVar.f14721l;
                        long j616 = eVar.k;
                        File file316 = (File) eVar.f14719h;
                        File file43 = (File) eVar.g;
                        String str37 = (String) eVar.f;
                        mutex3 = (Mutex) eVar.f14718e;
                        b bVar27 = (b) eVar.d;
                        URL url113 = (URL) eVar.f14717c;
                        o5 o5Var26 = (o5) eVar.f14716b;
                        ResultKt.b(objA);
                        file4 = file316;
                        str6 = "Resuming download for ";
                        str25 = "Not enough free disk space to attempt download for ";
                        str26 = "Expired file ";
                        o5Var6 = o5Var26;
                        str4 = "toString(...)";
                        str2 = "_";
                        str9 = str37;
                        bVar6 = bVar27;
                        obj7 = mutex3;
                        str22 = ". Required: ";
                        str24 = "Not enough free space on device for ";
                        j10 = j616;
                        url5 = url113;
                        str23 = "temp_";
                        file2 = file43;
                        coroutineSingletons = coroutineSingletons;
                        j8 = j615;
                        File file317 = file4;
                        za.a(str26 + str9 + " evicted. New size: " + o5Var6.k.get(), (Throwable) null, 2, (Object) null);
                        o5Var4 = o5Var6;
                        url4 = url5;
                        Object obj215 = obj7;
                        file = file317;
                        long j415 = j10;
                        bVar5 = bVar6;
                        j7 = j415;
                        str8 = str9;
                        obj27 = obj215;
                        if (!o5Var4.f14696b.a(o5Var4.f14699h)) {
                            long j511111 = o5Var4.f14699h;
                            StringBuilder sb11111116 = new StringBuilder(str25);
                            sb11111116.append(str8);
                            String str211118 = str22;
                            sb11111116.append(str211118);
                            sb11111116.append(j511111);
                            za.e(sb11111116.toString(), null, 2, null);
                            objB2 = ResultKt.a(new IOException(str24 + str8 + str211118 + o5Var4.f14699h));
                            obj24 = obj27;
                        } else {
                            fileA3 = o5Var4.f14696b.a();
                            if (fileA3 == null) {
                            }
                            za.b("Cache directory is not available, cannot download " + str8 + mo.ono, (Throwable) null, 2, (Object) null);
                            StringBuilder sb11111117 = new StringBuilder("Cache directory not available for ");
                            sb11111117.append(str8);
                            objB2 = ResultKt.a(new IOException(sb11111117.toString()));
                            obj24 = obj27;
                        }
                        obj25 = objB2;
                        r11 = obj24;
                        r11.b(null);
                        return obj25;
                    case 8:
                        long j617 = eVar.f14722n;
                        j31 = eVar.m;
                        j32 = eVar.f14721l;
                        j18 = eVar.k;
                        file11 = (File) eVar.j;
                        file12 = (File) eVar.f14720i;
                        file8 = (File) eVar.f14719h;
                        j15 = j617;
                        file21 = (File) eVar.g;
                        str8 = (String) eVar.f;
                        mutex4 = (Mutex) eVar.f14718e;
                        bVar11 = (b) eVar.d;
                        url9 = (URL) eVar.f14717c;
                        o5Var9 = (o5) eVar.f14716b;
                        ResultKt.b(objA);
                        objA2 = ((Result) objA).X;
                        bVar9 = bVar11;
                        url6 = url9;
                        o5Var7 = o5Var9;
                        j12 = j31;
                        j17 = j32;
                        coroutineSingletons2 = coroutineSingletons;
                        str4 = "toString(...)";
                        file2 = file21;
                        obj6 = mutex4;
                        ResultKt.b(objA2);
                        objA3 = Boxing.a(((Number) objA2).longValue());
                        j19 = j17;
                        file13 = file12;
                        long j523 = j18;
                        obj9 = obj6;
                        str10 = str8;
                        file14 = file11;
                        o5Var8 = o5Var7;
                        j20 = j523;
                        coroutineSingletons3 = coroutineSingletons2;
                        j21 = j12;
                        file15 = file2;
                        url7 = url6;
                        thA = Result.a(objA3);
                        if (thA != null) {
                            StringBuilder sb22 = new StringBuilder(str5);
                            sb22.append(str10);
                            str5 = str5;
                            sb22.append(" (startByte: ");
                            sb22.append(j21);
                            sb22.append(str3);
                            za.b(sb22.toString(), thA);
                            if (j21 <= 0) {
                                bVar9 = bVar9;
                                str10 = str10;
                                o5Var8 = o5Var8;
                                url7 = url7;
                                file14 = file14;
                                j22 = j20;
                                j23 = j15;
                                j24 = j19;
                                throw thA;
                            }
                            bVar9 = bVar9;
                            str10 = str10;
                            o5Var8 = o5Var8;
                            url7 = url7;
                            file14 = file14;
                            j22 = j20;
                            j23 = j15;
                            j24 = j19;
                            throw thA;
                            r11.b(null);
                            return obj25;
                        }
                        j30 = j21;
                        j25 = j19;
                        obj12 = objA3;
                        file19 = file8;
                        file20 = file14;
                        coroutineSingletons3 = coroutineSingletons3;
                        obj13 = obj9;
                        if (obj12 instanceof Result.Failure) {
                            thA2 = Result.a(obj12);
                            str13 = str5;
                            za.b(str13 + str10 + " after retry attempt", thA2);
                            nonCancellable3 = NonCancellable.X;
                            fVar = new f(file20, null);
                            eVar.f14716b = obj13;
                            eVar.f14717c = str10;
                            eVar.d = thA2;
                            eVar.f14718e = null;
                            eVar.f = null;
                            eVar.g = null;
                            eVar.f14719h = null;
                            eVar.f14720i = null;
                            eVar.j = null;
                            eVar.r = 10;
                            if (BuildersKt.f(nonCancellable3, fVar, eVar) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            str14 = str10;
                            iOException = thA2;
                            if (iOException == null) {
                                obj15 = obj13;
                                iOException = new IOException(str13 + str14);
                            }
                            obj15 = obj13;
                            objB2 = ResultKt.a(iOException);
                            obj24 = obj15;
                            obj25 = objB2;
                            r11 = obj24;
                            r11.b(null);
                            return obj25;
                        }
                        if (obj12 instanceof Result.Failure) {
                            obj12 = null;
                        }
                        l2 = (Long) obj12;
                        if (l2 != null) {
                            za.b("Download result was successful but getOrNull() returned null for " + str10, (Throwable) null, 2, (Object) null);
                            nonCancellable = NonCancellable.X;
                            jVar = new j(file20, null);
                            eVar.f14716b = obj13;
                            eVar.f14717c = str10;
                            eVar.d = null;
                            eVar.f14718e = null;
                            eVar.f = null;
                            eVar.g = null;
                            eVar.f14719h = null;
                            eVar.f14720i = null;
                            eVar.j = null;
                            eVar.r = 11;
                            if (BuildersKt.f(nonCancellable, jVar, eVar) == coroutineSingletons3) {
                                obj16 = obj13;
                                return coroutineSingletons3;
                            }
                            obj16 = obj13;
                            objB2 = ResultKt.a(new IOException("Download succeeded but result was null for " + str10));
                            obj24 = obj16;
                            obj25 = objB2;
                            r11 = obj24;
                            r11.b(null);
                            return obj25;
                        }
                        jLongValue2 = l2.longValue();
                        if (j30 > 0) {
                            jLongValue2 = j15 + jLongValue2;
                        } else {
                            jLongValue2 = j15 + jLongValue2;
                        }
                        if (jLongValue2 <= 0) {
                            str12 = "Downloaded file for ";
                            za.e(str12 + str10 + " is empty or size is zero.", null, 2, null);
                            nonCancellable2 = NonCancellable.X;
                            gVar = new g(file20, null);
                            eVar.f14716b = obj13;
                            eVar.f14717c = str10;
                            eVar.d = null;
                            eVar.f14718e = null;
                            eVar.f = null;
                            eVar.g = null;
                            eVar.f14719h = null;
                            eVar.f14720i = null;
                            eVar.j = null;
                            eVar.r = 12;
                            if (BuildersKt.f(nonCancellable2, gVar, eVar) == coroutineSingletons3) {
                                obj17 = obj13;
                                return coroutineSingletons3;
                            }
                            obj17 = obj13;
                            objB2 = ResultKt.a(new IOException(str12 + str10 + " is empty."));
                            obj24 = obj17;
                            obj25 = objB2;
                            r11 = obj24;
                            r11.b(null);
                            return obj25;
                        }
                        if (j20 != -1) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                        }
                        if (i2 != 0) {
                            za.a("Partial request for " + j20 + " bytes returned complete file of " + jLongValue2 + " bytes", (Throwable) null, 2, (Object) null);
                            file22 = file15;
                        } else {
                            file22 = file19;
                        }
                        j33 = (o5Var8.k.get() + jLongValue2) - j25;
                        if (j33 > 0) {
                            za.a(str + j33 + " bytes for " + str10, (Throwable) null, 2, (Object) null);
                            n3 n3Var8 = o5Var8.d;
                            k kVar8 = o5Var8.new k();
                            eVar.f14716b = o5Var8;
                            eVar.f14717c = url7;
                            eVar.d = bVar9;
                            eVar.f14718e = obj13;
                            eVar.f = str10;
                            eVar.g = file20;
                            eVar.f14719h = file22;
                            eVar.f14720i = null;
                            eVar.j = null;
                            eVar.k = j20;
                            eVar.f14721l = j25;
                            i4 = i2;
                            eVar.o = i4;
                            o5Var11 = o5Var8;
                            url11 = url7;
                            eVar.m = jLongValue2;
                            j35 = jLongValue2;
                            eVar.f14722n = j35;
                            bVar12 = bVar9;
                            eVar.r = 13;
                            objA = n3Var8.a(kVar8, j33, eVar);
                            coroutineSingletons4 = coroutineSingletons3;
                            if (objA != coroutineSingletons4) {
                                j36 = jLongValue2;
                                j37 = j35;
                                str11 = str10;
                                o5Var12 = o5Var11;
                                obj20 = obj13;
                                jLongValue2 = j36;
                                jLongValue3 = ((Number) objA).longValue();
                                if (jLongValue3 > 0) {
                                    o5Var12.k.addAndGet(-jLongValue3);
                                    za.a("Freed " + jLongValue3 + " bytes via LRU. New cache size: " + o5Var12.k.get(), (Throwable) null, 2, (Object) null);
                                }
                                if (o5Var12.k.get() + jLongValue2 > j25) {
                                    str18 = "Cannot cache ";
                                    za.b(str18 + str11 + ". Not enough space freed.", (Throwable) null, 2, (Object) null);
                                    nonCancellable4 = NonCancellable.X;
                                    hVar = new h(file20, null);
                                    eVar.f14716b = obj20;
                                    eVar.f14717c = str11;
                                    eVar.d = null;
                                    eVar.f14718e = null;
                                    eVar.f = null;
                                    eVar.g = null;
                                    eVar.f14719h = null;
                                    eVar.r = 14;
                                    if (BuildersKt.f(nonCancellable4, hVar, eVar) == coroutineSingletons4) {
                                        obj21 = obj20;
                                    }
                                    obj21 = obj20;
                                    objB2 = ResultKt.a(new IOException(str18 + str11 + ". Not enough space freed after eviction."));
                                    obj24 = obj21;
                                    obj25 = objB2;
                                    r11 = obj24;
                                    r11.b(null);
                                    return obj25;
                                }
                                url10 = url11;
                                i3 = i4;
                                file23 = file22;
                                coroutineSingletons3 = coroutineSingletons4;
                                o5Var10 = o5Var12;
                                str10 = str11;
                                j34 = j37;
                                obj18 = obj20;
                            }
                            return coroutineSingletons4;
                        }
                        bVar12 = bVar9;
                        o5 o5Var119 = o5Var8;
                        i3 = i2;
                        url10 = url7;
                        j34 = jLongValue2;
                        file23 = file22;
                        o5Var10 = o5Var119;
                        obj18 = obj13;
                        obj19 = obj18;
                        bVar14 = bVar12;
                        j39 = jLongValue2;
                        o3 o3Var111 = o5Var10.f14696b;
                        eVar.f14716b = o5Var10;
                        eVar.f14717c = url10;
                        eVar.d = bVar14;
                        eVar.f14718e = obj19;
                        eVar.f = str10;
                        eVar.g = file20;
                        eVar.f14719h = file23;
                        str16 = str10;
                        eVar.f14720i = null;
                        eVar.j = null;
                        eVar.k = j20;
                        eVar.o = i3;
                        eVar.f14721l = j39;
                        eVar.m = j34;
                        eVar.r = 15;
                        objB3 = o3Var111.b(file20, file23, eVar);
                        coroutineSingletons5 = coroutineSingletons3;
                        if (objB3 != coroutineSingletons5) {
                            j40 = j34;
                            url13 = url10;
                            file24 = file23;
                            bVar15 = bVar14;
                            objA = objB3;
                            o5Var14 = o5Var10;
                            j41 = j39;
                            j42 = j20;
                            file25 = file20;
                            str17 = str16;
                            obj22 = obj19;
                            if (!((Boolean) objA).booleanValue()) {
                                za.b("Failed to finalize data file for " + str17, (Throwable) null, 2, (Object) null);
                                nonCancellable5 = NonCancellable.X;
                                iVar = new i(file25, null);
                                eVar.f14716b = obj22;
                                eVar.f14717c = str17;
                                eVar.d = null;
                                eVar.f14718e = null;
                                eVar.f = null;
                                eVar.g = null;
                                eVar.f14719h = null;
                                eVar.r = 16;
                                if (BuildersKt.f(nonCancellable5, iVar, eVar) != coroutineSingletons5) {
                                    obj23 = obj22;
                                    str21 = str17;
                                    objB2 = ResultKt.a(new IOException("Failed to finalize cached file for " + str21));
                                    obj24 = obj23;
                                    obj25 = objB2;
                                    r11 = obj24;
                                    r11.b(null);
                                    return obj25;
                                }
                            } else {
                                o5Var14.k.addAndGet(j41);
                                if (j42 == -1) {
                                }
                                str19 = str4;
                                j43 = j40;
                                file26 = file24;
                                long jCurrentTimeMillis10 = System.currentTimeMillis() + ((Number) o5Var14.f14700i.invoke()).longValue();
                                String string112 = url13.toString();
                                Intrinsics.e(string112, str19);
                                l3Var = new l3(string112, jCurrentTimeMillis10);
                                o3Var = o5Var14.f14696b;
                                eVar.f14716b = o5Var14;
                                eVar.f14717c = url13;
                                eVar.d = bVar15;
                                eVar.f14718e = obj22;
                                eVar.f = str17;
                                eVar.g = file26;
                                eVar.f14719h = null;
                                eVar.k = j41;
                                j44 = j41;
                                eVar.f14721l = j43;
                                eVar.r = 17;
                                if (o3Var.a(url13, l3Var, eVar) != coroutineSingletons5) {
                                    o5Var15 = o5Var14;
                                    j45 = j43;
                                    file27 = file26;
                                    str20 = str17;
                                    j41 = j44;
                                    obj26 = obj22;
                                    b bVar117 = new b(0L, j45 - 1, j45, file27, 0L, true, 16, null);
                                    String string113 = url13.toString();
                                    Intrinsics.e(string113, str19);
                                    o5Var15.a(string113, bVar117, bVar15);
                                    str17 = str20;
                                    o5Var14 = o5Var15;
                                    j46 = j45;
                                    file28 = file27;
                                    obj19 = obj26;
                                    za.a("Successfully cached " + str17 + " (" + file28.getAbsolutePath() + ", " + j46 + " bytes total, " + j41 + " new). New cache size: " + o5Var14.k.get(), (Throwable) null, 2, (Object) null);
                                    r11 = obj19;
                                    obj25 = file28;
                                    r11.b(null);
                                    return obj25;
                                }
                            }
                        }
                        return coroutineSingletons5;
                    case 9:
                        long j618 = eVar.f14722n;
                        j28 = eVar.m;
                        j29 = eVar.f14721l;
                        j38 = eVar.k;
                        file17 = (File) eVar.f14720i;
                        file16 = (File) eVar.f14719h;
                        file18 = (File) eVar.g;
                        j15 = j618;
                        str15 = (String) eVar.f;
                        obj11 = (Mutex) eVar.f14718e;
                        bVar13 = (b) eVar.d;
                        url12 = (URL) eVar.f14717c;
                        o5Var13 = (o5) eVar.f14716b;
                        ResultKt.b(objA);
                        objA4 = ((Result) objA).X;
                        bVar9 = bVar13;
                        url7 = url12;
                        o5Var8 = o5Var13;
                        j22 = j38;
                        coroutineSingletons3 = coroutineSingletons;
                        str4 = "toString(...)";
                        str10 = str15;
                        obj11 = obj11;
                        ResultKt.b(objA4);
                        objA5 = Boxing.a(((Number) objA4).longValue());
                        j25 = j29;
                        file15 = file18;
                        j21 = j28;
                        file8 = file16;
                        obj14 = obj11;
                        obj13 = obj14;
                        j30 = j21;
                        o5Var8 = o5Var8;
                        url7 = url7;
                        bVar9 = bVar9;
                        obj12 = objA5;
                        file19 = file8;
                        file20 = file17;
                        j20 = j22;
                        if (obj12 instanceof Result.Failure) {
                            thA2 = Result.a(obj12);
                            str13 = str5;
                            za.b(str13 + str10 + " after retry attempt", thA2);
                            nonCancellable3 = NonCancellable.X;
                            fVar = new f(file20, null);
                            eVar.f14716b = obj13;
                            eVar.f14717c = str10;
                            eVar.d = thA2;
                            eVar.f14718e = null;
                            eVar.f = null;
                            eVar.g = null;
                            eVar.f14719h = null;
                            eVar.f14720i = null;
                            eVar.j = null;
                            eVar.r = 10;
                            if (BuildersKt.f(nonCancellable3, fVar, eVar) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            str14 = str10;
                            iOException = thA2;
                            if (iOException == null) {
                                obj15 = obj13;
                                iOException = new IOException(str13 + str14);
                            }
                            obj15 = obj13;
                            objB2 = ResultKt.a(iOException);
                            obj24 = obj15;
                            obj25 = objB2;
                            r11 = obj24;
                            r11.b(null);
                            return obj25;
                        }
                        if (obj12 instanceof Result.Failure) {
                            obj12 = null;
                        }
                        l2 = (Long) obj12;
                        if (l2 != null) {
                            za.b("Download result was successful but getOrNull() returned null for " + str10, (Throwable) null, 2, (Object) null);
                            nonCancellable = NonCancellable.X;
                            jVar = new j(file20, null);
                            eVar.f14716b = obj13;
                            eVar.f14717c = str10;
                            eVar.d = null;
                            eVar.f14718e = null;
                            eVar.f = null;
                            eVar.g = null;
                            eVar.f14719h = null;
                            eVar.f14720i = null;
                            eVar.j = null;
                            eVar.r = 11;
                            if (BuildersKt.f(nonCancellable, jVar, eVar) == coroutineSingletons3) {
                                obj16 = obj13;
                                return coroutineSingletons3;
                            }
                            obj16 = obj13;
                            objB2 = ResultKt.a(new IOException("Download succeeded but result was null for " + str10));
                            obj24 = obj16;
                            obj25 = objB2;
                            r11 = obj24;
                            r11.b(null);
                            return obj25;
                        }
                        jLongValue2 = l2.longValue();
                        if (j30 > 0) {
                            jLongValue2 = j15 + jLongValue2;
                        } else {
                            jLongValue2 = j15 + jLongValue2;
                        }
                        if (jLongValue2 <= 0) {
                            str12 = "Downloaded file for ";
                            za.e(str12 + str10 + " is empty or size is zero.", null, 2, null);
                            nonCancellable2 = NonCancellable.X;
                            gVar = new g(file20, null);
                            eVar.f14716b = obj13;
                            eVar.f14717c = str10;
                            eVar.d = null;
                            eVar.f14718e = null;
                            eVar.f = null;
                            eVar.g = null;
                            eVar.f14719h = null;
                            eVar.f14720i = null;
                            eVar.j = null;
                            eVar.r = 12;
                            if (BuildersKt.f(nonCancellable2, gVar, eVar) == coroutineSingletons3) {
                                obj17 = obj13;
                                return coroutineSingletons3;
                            }
                            obj17 = obj13;
                            objB2 = ResultKt.a(new IOException(str12 + str10 + " is empty."));
                            obj24 = obj17;
                            obj25 = objB2;
                            r11 = obj24;
                            r11.b(null);
                            return obj25;
                        }
                        if (j20 != -1) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                        }
                        if (i2 != 0) {
                            za.a("Partial request for " + j20 + " bytes returned complete file of " + jLongValue2 + " bytes", (Throwable) null, 2, (Object) null);
                            file22 = file15;
                        } else {
                            file22 = file19;
                        }
                        j33 = (o5Var8.k.get() + jLongValue2) - j25;
                        if (j33 > 0) {
                            za.a(str + j33 + " bytes for " + str10, (Throwable) null, 2, (Object) null);
                            n3 n3Var9 = o5Var8.d;
                            k kVar9 = o5Var8.new k();
                            eVar.f14716b = o5Var8;
                            eVar.f14717c = url7;
                            eVar.d = bVar9;
                            eVar.f14718e = obj13;
                            eVar.f = str10;
                            eVar.g = file20;
                            eVar.f14719h = file22;
                            eVar.f14720i = null;
                            eVar.j = null;
                            eVar.k = j20;
                            eVar.f14721l = j25;
                            i4 = i2;
                            eVar.o = i4;
                            o5Var11 = o5Var8;
                            url11 = url7;
                            eVar.m = jLongValue2;
                            j35 = jLongValue2;
                            eVar.f14722n = j35;
                            bVar12 = bVar9;
                            eVar.r = 13;
                            objA = n3Var9.a(kVar9, j33, eVar);
                            coroutineSingletons4 = coroutineSingletons3;
                            if (objA != coroutineSingletons4) {
                                j36 = jLongValue2;
                                j37 = j35;
                                str11 = str10;
                                o5Var12 = o5Var11;
                                obj20 = obj13;
                                jLongValue2 = j36;
                                jLongValue3 = ((Number) objA).longValue();
                                if (jLongValue3 > 0) {
                                    o5Var12.k.addAndGet(-jLongValue3);
                                    za.a("Freed " + jLongValue3 + " bytes via LRU. New cache size: " + o5Var12.k.get(), (Throwable) null, 2, (Object) null);
                                }
                                if (o5Var12.k.get() + jLongValue2 > j25) {
                                    str18 = "Cannot cache ";
                                    za.b(str18 + str11 + ". Not enough space freed.", (Throwable) null, 2, (Object) null);
                                    nonCancellable4 = NonCancellable.X;
                                    hVar = new h(file20, null);
                                    eVar.f14716b = obj20;
                                    eVar.f14717c = str11;
                                    eVar.d = null;
                                    eVar.f14718e = null;
                                    eVar.f = null;
                                    eVar.g = null;
                                    eVar.f14719h = null;
                                    eVar.r = 14;
                                    if (BuildersKt.f(nonCancellable4, hVar, eVar) == coroutineSingletons4) {
                                        obj21 = obj20;
                                    }
                                    obj21 = obj20;
                                    objB2 = ResultKt.a(new IOException(str18 + str11 + ". Not enough space freed after eviction."));
                                    obj24 = obj21;
                                    obj25 = objB2;
                                    r11 = obj24;
                                    r11.b(null);
                                    return obj25;
                                }
                                url10 = url11;
                                i3 = i4;
                                file23 = file22;
                                coroutineSingletons3 = coroutineSingletons4;
                                o5Var10 = o5Var12;
                                str10 = str11;
                                j34 = j37;
                                obj18 = obj20;
                            }
                            return coroutineSingletons4;
                        }
                        bVar12 = bVar9;
                        o5 o5Var1110 = o5Var8;
                        i3 = i2;
                        url10 = url7;
                        j34 = jLongValue2;
                        file23 = file22;
                        o5Var10 = o5Var1110;
                        obj18 = obj13;
                        obj19 = obj18;
                        bVar14 = bVar12;
                        j39 = jLongValue2;
                        o3 o3Var112 = o5Var10.f14696b;
                        eVar.f14716b = o5Var10;
                        eVar.f14717c = url10;
                        eVar.d = bVar14;
                        eVar.f14718e = obj19;
                        eVar.f = str10;
                        eVar.g = file20;
                        eVar.f14719h = file23;
                        str16 = str10;
                        eVar.f14720i = null;
                        eVar.j = null;
                        eVar.k = j20;
                        eVar.o = i3;
                        eVar.f14721l = j39;
                        eVar.m = j34;
                        eVar.r = 15;
                        objB3 = o3Var112.b(file20, file23, eVar);
                        coroutineSingletons5 = coroutineSingletons3;
                        if (objB3 != coroutineSingletons5) {
                            j40 = j34;
                            url13 = url10;
                            file24 = file23;
                            bVar15 = bVar14;
                            objA = objB3;
                            o5Var14 = o5Var10;
                            j41 = j39;
                            j42 = j20;
                            file25 = file20;
                            str17 = str16;
                            obj22 = obj19;
                            if (!((Boolean) objA).booleanValue()) {
                                za.b("Failed to finalize data file for " + str17, (Throwable) null, 2, (Object) null);
                                nonCancellable5 = NonCancellable.X;
                                iVar = new i(file25, null);
                                eVar.f14716b = obj22;
                                eVar.f14717c = str17;
                                eVar.d = null;
                                eVar.f14718e = null;
                                eVar.f = null;
                                eVar.g = null;
                                eVar.f14719h = null;
                                eVar.r = 16;
                                if (BuildersKt.f(nonCancellable5, iVar, eVar) != coroutineSingletons5) {
                                    obj23 = obj22;
                                    str21 = str17;
                                    objB2 = ResultKt.a(new IOException("Failed to finalize cached file for " + str21));
                                    obj24 = obj23;
                                    obj25 = objB2;
                                    r11 = obj24;
                                    r11.b(null);
                                    return obj25;
                                }
                            } else {
                                o5Var14.k.addAndGet(j41);
                                if (j42 == -1) {
                                }
                                str19 = str4;
                                j43 = j40;
                                file26 = file24;
                                long jCurrentTimeMillis11 = System.currentTimeMillis() + ((Number) o5Var14.f14700i.invoke()).longValue();
                                String string114 = url13.toString();
                                Intrinsics.e(string114, str19);
                                l3Var = new l3(string114, jCurrentTimeMillis11);
                                o3Var = o5Var14.f14696b;
                                eVar.f14716b = o5Var14;
                                eVar.f14717c = url13;
                                eVar.d = bVar15;
                                eVar.f14718e = obj22;
                                eVar.f = str17;
                                eVar.g = file26;
                                eVar.f14719h = null;
                                eVar.k = j41;
                                j44 = j41;
                                eVar.f14721l = j43;
                                eVar.r = 17;
                                if (o3Var.a(url13, l3Var, eVar) != coroutineSingletons5) {
                                    o5Var15 = o5Var14;
                                    j45 = j43;
                                    file27 = file26;
                                    str20 = str17;
                                    j41 = j44;
                                    obj26 = obj22;
                                    b bVar118 = new b(0L, j45 - 1, j45, file27, 0L, true, 16, null);
                                    String string115 = url13.toString();
                                    Intrinsics.e(string115, str19);
                                    o5Var15.a(string115, bVar118, bVar15);
                                    str17 = str20;
                                    o5Var14 = o5Var15;
                                    j46 = j45;
                                    file28 = file27;
                                    obj19 = obj26;
                                    za.a("Successfully cached " + str17 + " (" + file28.getAbsolutePath() + ", " + j46 + " bytes total, " + j41 + " new). New cache size: " + o5Var14.k.get(), (Throwable) null, 2, (Object) null);
                                    r11 = obj19;
                                    obj25 = file28;
                                    r11.b(null);
                                    return obj25;
                                }
                            }
                        }
                        return coroutineSingletons5;
                    case 10:
                        iOException = (Throwable) eVar.d;
                        str14 = (String) eVar.f14717c;
                        Mutex mutex20 = (Mutex) eVar.f14716b;
                        ResultKt.b(objA);
                        str13 = str5;
                        obj15 = mutex20;
                        if (iOException == null) {
                            obj15 = obj13;
                            iOException = new IOException(str13 + str14);
                        }
                        obj15 = obj13;
                        objB2 = ResultKt.a(iOException);
                        obj24 = obj15;
                        obj25 = objB2;
                        r11 = obj24;
                        r11.b(null);
                        return obj25;
                    case 11:
                        str10 = (String) eVar.f14717c;
                        Mutex mutex110 = (Mutex) eVar.f14716b;
                        ResultKt.b(objA);
                        obj16 = mutex110;
                        obj16 = obj13;
                        objB2 = ResultKt.a(new IOException("Download succeeded but result was null for " + str10));
                        obj24 = obj16;
                        obj25 = objB2;
                        r11 = obj24;
                        r11.b(null);
                        return obj25;
                    case 12:
                        str10 = (String) eVar.f14717c;
                        Mutex mutex111 = (Mutex) eVar.f14716b;
                        ResultKt.b(objA);
                        str12 = "Downloaded file for ";
                        obj17 = mutex111;
                        obj17 = obj13;
                        objB2 = ResultKt.a(new IOException(str12 + str10 + " is empty."));
                        obj24 = obj17;
                        obj25 = objB2;
                        r11 = obj24;
                        r11.b(null);
                        return obj25;
                    case 13:
                        long j619 = eVar.f14722n;
                        j36 = eVar.m;
                        i4 = eVar.o;
                        long j73 = eVar.f14721l;
                        j20 = eVar.k;
                        file22 = (File) eVar.f14719h;
                        file20 = (File) eVar.g;
                        j37 = j619;
                        String str38 = (String) eVar.f;
                        Mutex mutex112 = (Mutex) eVar.f14718e;
                        b bVar28 = (b) eVar.d;
                        URL url114 = (URL) eVar.f14717c;
                        o5Var12 = (o5) eVar.f14716b;
                        ResultKt.b(objA);
                        bVar12 = bVar28;
                        coroutineSingletons4 = coroutineSingletons;
                        str4 = "toString(...)";
                        j25 = j73;
                        url11 = url114;
                        obj20 = mutex112;
                        str11 = str38;
                        jLongValue2 = j36;
                        jLongValue3 = ((Number) objA).longValue();
                        if (jLongValue3 > 0) {
                            o5Var12.k.addAndGet(-jLongValue3);
                            za.a("Freed " + jLongValue3 + " bytes via LRU. New cache size: " + o5Var12.k.get(), (Throwable) null, 2, (Object) null);
                        }
                        if (o5Var12.k.get() + jLongValue2 > j25) {
                            str18 = "Cannot cache ";
                            za.b(str18 + str11 + ". Not enough space freed.", (Throwable) null, 2, (Object) null);
                            nonCancellable4 = NonCancellable.X;
                            hVar = new h(file20, null);
                            eVar.f14716b = obj20;
                            eVar.f14717c = str11;
                            eVar.d = null;
                            eVar.f14718e = null;
                            eVar.f = null;
                            eVar.g = null;
                            eVar.f14719h = null;
                            eVar.r = 14;
                            if (BuildersKt.f(nonCancellable4, hVar, eVar) == coroutineSingletons4) {
                                obj21 = obj20;
                                return coroutineSingletons4;
                            }
                            obj21 = obj20;
                            objB2 = ResultKt.a(new IOException(str18 + str11 + ". Not enough space freed after eviction."));
                            obj24 = obj21;
                            obj25 = objB2;
                            r11 = obj24;
                            r11.b(null);
                            return obj25;
                        }
                        url10 = url11;
                        i3 = i4;
                        file23 = file22;
                        coroutineSingletons3 = coroutineSingletons4;
                        o5Var10 = o5Var12;
                        str10 = str11;
                        j34 = j37;
                        obj18 = obj20;
                        obj19 = obj18;
                        bVar14 = bVar12;
                        j39 = jLongValue2;
                        o3 o3Var113 = o5Var10.f14696b;
                        eVar.f14716b = o5Var10;
                        eVar.f14717c = url10;
                        eVar.d = bVar14;
                        eVar.f14718e = obj19;
                        eVar.f = str10;
                        eVar.g = file20;
                        eVar.f14719h = file23;
                        str16 = str10;
                        eVar.f14720i = null;
                        eVar.j = null;
                        eVar.k = j20;
                        eVar.o = i3;
                        eVar.f14721l = j39;
                        eVar.m = j34;
                        eVar.r = 15;
                        objB3 = o3Var113.b(file20, file23, eVar);
                        coroutineSingletons5 = coroutineSingletons3;
                        if (objB3 != coroutineSingletons5) {
                            j40 = j34;
                            url13 = url10;
                            file24 = file23;
                            bVar15 = bVar14;
                            objA = objB3;
                            o5Var14 = o5Var10;
                            j41 = j39;
                            j42 = j20;
                            file25 = file20;
                            str17 = str16;
                            obj22 = obj19;
                            if (!((Boolean) objA).booleanValue()) {
                                za.b("Failed to finalize data file for " + str17, (Throwable) null, 2, (Object) null);
                                nonCancellable5 = NonCancellable.X;
                                iVar = new i(file25, null);
                                eVar.f14716b = obj22;
                                eVar.f14717c = str17;
                                eVar.d = null;
                                eVar.f14718e = null;
                                eVar.f = null;
                                eVar.g = null;
                                eVar.f14719h = null;
                                eVar.r = 16;
                                if (BuildersKt.f(nonCancellable5, iVar, eVar) != coroutineSingletons5) {
                                    obj23 = obj22;
                                    str21 = str17;
                                    objB2 = ResultKt.a(new IOException("Failed to finalize cached file for " + str21));
                                    obj24 = obj23;
                                    obj25 = objB2;
                                    r11 = obj24;
                                    r11.b(null);
                                    return obj25;
                                }
                            } else {
                                o5Var14.k.addAndGet(j41);
                                if (j42 == -1) {
                                }
                                str19 = str4;
                                j43 = j40;
                                file26 = file24;
                                long jCurrentTimeMillis12 = System.currentTimeMillis() + ((Number) o5Var14.f14700i.invoke()).longValue();
                                String string116 = url13.toString();
                                Intrinsics.e(string116, str19);
                                l3Var = new l3(string116, jCurrentTimeMillis12);
                                o3Var = o5Var14.f14696b;
                                eVar.f14716b = o5Var14;
                                eVar.f14717c = url13;
                                eVar.d = bVar15;
                                eVar.f14718e = obj22;
                                eVar.f = str17;
                                eVar.g = file26;
                                eVar.f14719h = null;
                                eVar.k = j41;
                                j44 = j41;
                                eVar.f14721l = j43;
                                eVar.r = 17;
                                if (o3Var.a(url13, l3Var, eVar) != coroutineSingletons5) {
                                    o5Var15 = o5Var14;
                                    j45 = j43;
                                    file27 = file26;
                                    str20 = str17;
                                    j41 = j44;
                                    obj26 = obj22;
                                    b bVar119 = new b(0L, j45 - 1, j45, file27, 0L, true, 16, null);
                                    String string117 = url13.toString();
                                    Intrinsics.e(string117, str19);
                                    o5Var15.a(string117, bVar119, bVar15);
                                    str17 = str20;
                                    o5Var14 = o5Var15;
                                    j46 = j45;
                                    file28 = file27;
                                    obj19 = obj26;
                                    za.a("Successfully cached " + str17 + " (" + file28.getAbsolutePath() + ", " + j46 + " bytes total, " + j41 + " new). New cache size: " + o5Var14.k.get(), (Throwable) null, 2, (Object) null);
                                    r11 = obj19;
                                    obj25 = file28;
                                    r11.b(null);
                                    return obj25;
                                }
                            }
                        }
                        return coroutineSingletons5;
                    case 14:
                        String str39 = (String) eVar.f14717c;
                        Mutex mutex113 = (Mutex) eVar.f14716b;
                        ResultKt.b(objA);
                        str11 = str39;
                        str18 = "Cannot cache ";
                        obj21 = mutex113;
                        obj21 = obj20;
                        objB2 = ResultKt.a(new IOException(str18 + str11 + ". Not enough space freed after eviction."));
                        obj24 = obj21;
                        obj25 = objB2;
                        r11 = obj24;
                        r11.b(null);
                        return obj25;
                    case 15:
                        long j74 = eVar.m;
                        j41 = eVar.f14721l;
                        i3 = eVar.o;
                        j42 = eVar.k;
                        File file44 = (File) eVar.f14719h;
                        file25 = (File) eVar.g;
                        str17 = (String) eVar.f;
                        obj = (Mutex) eVar.f14718e;
                        b bVar29 = (b) eVar.d;
                        url13 = (URL) eVar.f14717c;
                        o5 o5Var27 = (o5) eVar.f14716b;
                        ResultKt.b(objA);
                        o5Var14 = o5Var27;
                        file24 = file44;
                        coroutineSingletons5 = coroutineSingletons;
                        str4 = "toString(...)";
                        obj22 = obj;
                        j40 = j74;
                        bVar15 = bVar29;
                        if (!((Boolean) objA).booleanValue()) {
                            za.b("Failed to finalize data file for " + str17, (Throwable) null, 2, (Object) null);
                            nonCancellable5 = NonCancellable.X;
                            iVar = new i(file25, null);
                            eVar.f14716b = obj22;
                            eVar.f14717c = str17;
                            eVar.d = null;
                            eVar.f14718e = null;
                            eVar.f = null;
                            eVar.g = null;
                            eVar.f14719h = null;
                            eVar.r = 16;
                            if (BuildersKt.f(nonCancellable5, iVar, eVar) != coroutineSingletons5) {
                                obj23 = obj22;
                                str21 = str17;
                                objB2 = ResultKt.a(new IOException("Failed to finalize cached file for " + str21));
                                obj24 = obj23;
                                obj25 = objB2;
                                r11 = obj24;
                                r11.b(null);
                                return obj25;
                            }
                        } else {
                            o5Var14.k.addAndGet(j41);
                            if (j42 == -1) {
                            }
                            str19 = str4;
                            j43 = j40;
                            file26 = file24;
                            long jCurrentTimeMillis13 = System.currentTimeMillis() + ((Number) o5Var14.f14700i.invoke()).longValue();
                            String string118 = url13.toString();
                            Intrinsics.e(string118, str19);
                            l3Var = new l3(string118, jCurrentTimeMillis13);
                            o3Var = o5Var14.f14696b;
                            eVar.f14716b = o5Var14;
                            eVar.f14717c = url13;
                            eVar.d = bVar15;
                            eVar.f14718e = obj22;
                            eVar.f = str17;
                            eVar.g = file26;
                            eVar.f14719h = null;
                            eVar.k = j41;
                            j44 = j41;
                            eVar.f14721l = j43;
                            eVar.r = 17;
                            if (o3Var.a(url13, l3Var, eVar) != coroutineSingletons5) {
                                o5Var15 = o5Var14;
                                j45 = j43;
                                file27 = file26;
                                str20 = str17;
                                j41 = j44;
                                obj26 = obj22;
                                b bVar1110 = new b(0L, j45 - 1, j45, file27, 0L, true, 16, null);
                                String string119 = url13.toString();
                                Intrinsics.e(string119, str19);
                                o5Var15.a(string119, bVar1110, bVar15);
                                str17 = str20;
                                o5Var14 = o5Var15;
                                j46 = j45;
                                file28 = file27;
                                obj19 = obj26;
                                za.a("Successfully cached " + str17 + " (" + file28.getAbsolutePath() + ", " + j46 + " bytes total, " + j41 + " new). New cache size: " + o5Var14.k.get(), (Throwable) null, 2, (Object) null);
                                r11 = obj19;
                                obj25 = file28;
                                r11.b(null);
                                return obj25;
                            }
                        }
                        return coroutineSingletons5;
                    case 16:
                        str21 = (String) eVar.f14717c;
                        Mutex mutex114 = (Mutex) eVar.f14716b;
                        ResultKt.b(objA);
                        obj23 = mutex114;
                        objB2 = ResultKt.a(new IOException("Failed to finalize cached file for " + str21));
                        obj24 = obj23;
                        obj25 = objB2;
                        r11 = obj24;
                        r11.b(null);
                        return obj25;
                    case 17:
                        long j75 = eVar.f14721l;
                        j41 = eVar.k;
                        File file45 = (File) eVar.g;
                        str20 = (String) eVar.f;
                        Mutex mutex115 = (Mutex) eVar.f14718e;
                        bVar15 = (b) eVar.d;
                        URL url115 = (URL) eVar.f14717c;
                        o5Var15 = (o5) eVar.f14716b;
                        ResultKt.b(objA);
                        j45 = j75;
                        file27 = file45;
                        url13 = url115;
                        obj26 = mutex115;
                        str19 = "toString(...)";
                        b bVar1111 = new b(0L, j45 - 1, j45, file27, 0L, true, 16, null);
                        String string1110 = url13.toString();
                        Intrinsics.e(string1110, str19);
                        o5Var15.a(string1110, bVar1111, bVar15);
                        str17 = str20;
                        o5Var14 = o5Var15;
                        j46 = j45;
                        file28 = file27;
                        obj19 = obj26;
                        za.a("Successfully cached " + str17 + " (" + file28.getAbsolutePath() + ", " + j46 + " bytes total, " + j41 + " new). New cache size: " + o5Var14.k.get(), (Throwable) null, 2, (Object) null);
                        r11 = obj19;
                        obj25 = file28;
                        r11.b(null);
                        return obj25;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th24) {
                th = th24;
                r8 = "Resuming download for ";
            }
        } catch (Throwable th25) {
            th = th25;
            r8 = obj27;
            r8.b(null);
            throw th;
        }
        eVar = new e(continuation);
        objA = eVar.f14723p;
        IntrinsicsKt.a();
        coroutineSingletons = CoroutineSingletons.X;
        str2 = "_";
        str3 = ")";
        str4 = "toString(...)";
        str5 = "Download failed for ";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(Continuation continuation) throws Throwable {
        l lVar;
        Mutex mutex;
        o5 o5Var;
        Mutex mutex2;
        Throwable th;
        Exception e2;
        o5 o5Var2;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i2 = lVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.f = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object obj = lVar.d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = lVar.f;
        Unit unit = Unit.f43263a;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                if (this.f14701l.get()) {
                    return unit;
                }
                mutex = this.m;
                lVar.f14735b = this;
                lVar.f14736c = mutex;
                lVar.f = 1;
                if (mutex.a(lVar) != coroutineSingletons) {
                    o5Var = this;
                }
                return coroutineSingletons;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) lVar.f14736c;
                o5Var2 = (o5) lVar.f14735b;
                try {
                    try {
                        ResultKt.b(obj);
                        long jLongValue = ((Number) obj).longValue();
                        o5Var2.k.set(jLongValue);
                        za.a("Cache initialized. Current size: " + jLongValue + " bytes.", (Throwable) null, 2, (Object) null);
                        o5Var2.f14701l.set(true);
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.b(null);
                        throw th;
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    o5Var = o5Var2;
                    za.b("Failed to initialize cache state. Will retry on next operation.", e2);
                    o5Var.f14701l.set(false);
                }
                mutex2.b(null);
                return unit;
            }
            Mutex mutex3 = (Mutex) lVar.f14736c;
            o5Var = (o5) lVar.f14735b;
            ResultKt.b(obj);
            mutex = mutex3;
            if (o5Var.f14701l.get()) {
                mutex.b(null);
                return unit;
            }
            za.a("Initializing DefaultDownloaderCache state...", (Throwable) null, 2, (Object) null);
            try {
                o3 o3Var = o5Var.f14696b;
                lVar.f14735b = o5Var;
                lVar.f14736c = mutex;
                lVar.f = 2;
                Object objA = o3Var.a(lVar);
                if (objA != coroutineSingletons) {
                    mutex2 = mutex;
                    obj = objA;
                    o5Var2 = o5Var;
                    long jLongValue2 = ((Number) obj).longValue();
                    o5Var2.k.set(jLongValue2);
                    za.a("Cache initialized. Current size: " + jLongValue2 + " bytes.", (Throwable) null, 2, (Object) null);
                    o5Var2.f14701l.set(true);
                    mutex2.b(null);
                    return unit;
                }
                return coroutineSingletons;
            } catch (Exception e4) {
                mutex2 = mutex;
                e2 = e4;
                za.b("Failed to initialize cache state. Will retry on next operation.", e2);
                o5Var.f14701l.set(false);
            }
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.b(null);
            throw th;
        }
    }

    public final b a(URL url, long j2) {
        String string = url.toString();
        Intrinsics.e(string, "toString(...)");
        b bVar = (b) this.f14702n.get(string);
        if (bVar == null) {
            return null;
        }
        if (!bVar.b().exists()) {
            this.f14702n.remove(string);
            return null;
        }
        if (j2 == -1) {
            za.a("Found cached download to resume complete file for " + string + ": " + bVar.a() + " bytes (complete=" + bVar.c() + ")", (Throwable) null, 2, (Object) null);
            return bVar;
        }
        if (bVar.b(j2)) {
            za.a("Found suitable cached download for " + string + ": " + bVar.a() + " bytes (requested " + j2 + ")", (Throwable) null, 2, (Object) null);
            return bVar;
        }
        if (bVar.a(j2)) {
            za.a("Found cached download to resume from for " + string + ": " + bVar.a() + " bytes (requested " + j2 + ")", (Throwable) null, 2, (Object) null);
            return bVar;
        }
        za.a("Cached download exists but can't be used for " + string + ": " + bVar.a() + " bytes (requested " + j2 + ")", (Throwable) null, 2, (Object) null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:107:0x0309  */
    /* JADX WARN: Code duplicated, block: B:110:0x0314 A[Catch: all -> 0x032e, Exception -> 0x0331, CancellationException -> 0x0334, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x0334, Exception -> 0x0331, all -> 0x032e, blocks: (B:108:0x030c, B:110:0x0314), top: B:147:0x030c }] */
    /* JADX WARN: Code duplicated, block: B:52:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x012e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0148 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0149  */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:64:0x017c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x017d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0183  */
    /* JADX WARN: Code duplicated, block: B:68:0x0191  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x023c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0242  */
    /* JADX WARN: Code duplicated, block: B:88:0x0246  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0282 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x0283  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b1  */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x032b, code lost:
    
        if (r2.a((java.io.File) r0, r10) == r4) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0233, code lost:
    
        if (r0.a(r1, r10) == r4) goto L112;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x010f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0150, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x0191, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:99:0x02b1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [com.chartboost.sdk.impl.o3] */
    /* JADX WARN: Type inference failed for: r0v51, types: [com.chartboost.sdk.impl.o3] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.chartboost.sdk.impl.o5$m, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [com.chartboost.sdk.impl.o5] */
    /* JADX WARN: Type inference failed for: r10v12, types: [com.chartboost.sdk.impl.o5] */
    /* JADX WARN: Type inference failed for: r10v14, types: [com.chartboost.sdk.impl.o5] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [com.chartboost.sdk.impl.o5] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.chartboost.sdk.impl.o5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.chartboost.sdk.impl.o5] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.chartboost.sdk.impl.o5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.chartboost.sdk.impl.o5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlinx.coroutines.Deferred, kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v25, types: [com.chartboost.sdk.impl.o3] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.chartboost.sdk.impl.o3] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.chartboost.sdk.impl.o5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.chartboost.sdk.impl.o5] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24, types: [kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30, types: [kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.chartboost.sdk.impl.o5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.chartboost.sdk.impl.l6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.net.URL r28, long r29, kotlin.coroutines.Continuation r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.o5.a(java.net.URL, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.chartboost.sdk.impl.l6
    public Object a(URL url, Continuation continuation) {
        return l6.a.a(this, url, continuation);
    }

    @Override // com.chartboost.sdk.impl.l6
    public Flow a(URL url) {
        Intrinsics.f(url, "url");
        return this.f14698e.a(url);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
    
        if (r2 == r10) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.net.URL r18, java.io.File r19, long r20, long r22, java.io.File r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.o5.a(java.net.URL, java.io.File, long, long, java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public final void a(String str, b bVar, b bVar2) {
        b bVar3;
        File fileB;
        File fileB2;
        b bVar4 = (b) this.f14702n.get(str);
        if (bVar.c()) {
            za.a("Storing complete download for " + str + " (" + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
            if (bVar4 != null && !Intrinsics.a(bVar4.b(), bVar.b()) && bVar4.b().exists()) {
                long length = bVar4.b().length();
                if (bVar4.b().delete()) {
                    this.k.addAndGet(-length);
                    za.a(android.support.v4.media.a.j(length, " bytes.", new StringBuilder("Cleaned up old partial file. Freed ")), (Throwable) null, 2, (Object) null);
                }
            }
            this.f14702n.put(str, bVar);
            return;
        }
        if (bVar4 == null) {
            za.a("Storing first partial download for " + str + " (" + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
        } else {
            if (bVar4.c()) {
                za.a("Keeping existing complete download for " + str + " instead of partial (" + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
            } else if (bVar.a() > bVar4.a()) {
                za.a("Replacing smaller partial download for " + str + " (" + bVar4.a() + " -> " + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
            } else {
                za.a("Keeping existing larger partial download for " + str + " (" + bVar4.a() + " vs " + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
            }
            if (!Intrinsics.a(bVar4.b(), bVar.b()) && bVar.b().exists()) {
                long length2 = bVar.b().length();
                if (bVar.b().delete()) {
                    this.k.addAndGet(-length2);
                    za.a(android.support.v4.media.a.j(length2, " bytes.", new StringBuilder("Cleaned up inferior new partial file. Freed ")), (Throwable) null, 2, (Object) null);
                }
            }
            if (bVar2 != null) {
                bVar3 = (b) this.f14702n.get(str);
                if (Intrinsics.a(bVar2.b(), bVar.b())) {
                }
                fileB = bVar2.b();
                if (bVar3 != null) {
                    fileB2 = bVar3.b();
                } else {
                    fileB2 = null;
                }
                if (Intrinsics.a(fileB, fileB2) && bVar2.b().exists()) {
                    long length3 = bVar2.b().length();
                    if (bVar2.b().delete()) {
                        this.k.addAndGet(-length3);
                        za.a(android.support.v4.media.a.j(length3, " bytes.", new StringBuilder("Cleaned up resumed partial file. Freed ")), (Throwable) null, 2, (Object) null);
                        return;
                    }
                    return;
                }
            }
        }
        if (bVar4 != null && !Intrinsics.a(bVar4.b(), bVar.b()) && bVar4.b().exists()) {
            long length4 = bVar4.b().length();
            if (bVar4.b().delete()) {
                this.k.addAndGet(-length4);
                za.a(android.support.v4.media.a.j(length4, " bytes.", new StringBuilder("Cleaned up replaced partial file. Freed ")), (Throwable) null, 2, (Object) null);
            }
        }
        this.f14702n.put(str, bVar);
        if (bVar2 != null) {
            bVar3 = (b) this.f14702n.get(str);
            if (Intrinsics.a(bVar2.b(), bVar.b())) {
                fileB = bVar2.b();
                if (bVar3 != null) {
                    fileB2 = bVar3.b();
                } else {
                    fileB2 = null;
                }
                if (Intrinsics.a(fileB, fileB2)) {
                }
            }
        }
    }

    public final void a(URL url, File file, long j2, boolean z2) {
        String string = url.toString();
        Intrinsics.e(string, "toString(...)");
        za.a("Updating download info for " + string + ": " + j2 + " bytes, complete=" + z2, (Throwable) null, 2, (Object) null);
        b bVar = new b(0L, j2 - 1, j2, file, System.currentTimeMillis(), z2);
        b bVar2 = (b) this.f14702n.get(string);
        if (bVar2 != null) {
            if (bVar.c() && !bVar2.c()) {
                za.a("Replacing partial download with complete download for ".concat(string), (Throwable) null, 2, (Object) null);
                if (!Intrinsics.a(bVar2.b(), bVar.b()) && bVar2.b().exists()) {
                    long length = bVar2.b().length();
                    if (bVar2.b().delete()) {
                        this.k.addAndGet(-length);
                        za.a("Cleaned up old partial file: " + bVar2.b().getName(), (Throwable) null, 2, (Object) null);
                    }
                }
                this.f14702n.put(string, bVar);
                this.k.addAndGet(j2);
                return;
            }
            if (bVar.a() > bVar2.a()) {
                long jA = bVar2.a();
                long jA2 = bVar.a();
                StringBuilder sbV = android.support.v4.media.a.v(jA, "Replacing smaller download (", ") with larger (");
                sbV.append(jA2);
                sbV.append(") for ");
                sbV.append(string);
                za.a(sbV.toString(), (Throwable) null, 2, (Object) null);
                if (!Intrinsics.a(bVar2.b(), bVar.b()) && bVar2.b().exists()) {
                    long length2 = bVar2.b().length();
                    if (bVar2.b().delete()) {
                        this.k.addAndGet(-length2);
                        za.a("Cleaned up old smaller file: " + bVar2.b().getName(), (Throwable) null, 2, (Object) null);
                    }
                }
                this.f14702n.put(string, bVar);
                this.k.addAndGet(j2 - bVar2.a());
                return;
            }
            za.a("Keeping existing download for " + string + " (existing: " + bVar2.a() + ", new: " + bVar.a() + ")", (Throwable) null, 2, (Object) null);
            return;
        }
        za.a("Storing new download info for ".concat(string), (Throwable) null, 2, (Object) null);
        this.f14702n.put(string, bVar);
        this.k.addAndGet(j2);
    }

    public final boolean a(long j2, File file) {
        if (j2 == -1) {
            return file.exists() && file.length() > 0;
        }
        return file.exists() && file.length() >= j2;
    }
}
