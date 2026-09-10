package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.thinkup.core.common.n.mo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements p8 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f14553n = new a(null);
    public static final Map o = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.chartboost.sdk.impl.j f14554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mediation f14555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jj f14556c;
    public final vg d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jg f14557e;
    public final we f;
    public final b2 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineScope f14558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Mutex f14559i;
    public c j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Job f14560l;
    public final d m;

    public static final class a {
        public a() {
        }

        public final boolean a(b2 base64Wrapper, String bidResponse) {
            Intrinsics.f(base64Wrapper, "base64Wrapper");
            Intrinsics.f(bidResponse, "bidResponse");
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(base64Wrapper.b(bidResponse)).optJSONArray("seatbid");
                return jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0;
            } catch (JSONException unused) {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map a() {
            return o.o;
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14561a = new a();

            public a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1722768625;
            }

            public String toString() {
                return "AdClosed";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$b$b, reason: collision with other inner class name */
        public static final class C0172b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final s7 f14562a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0172b(s7 reason) {
                super(null);
                Intrinsics.f(reason, "reason");
                this.f14562a = reason;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0172b) && this.f14562a == ((C0172b) obj).f14562a;
            }

            public int hashCode() {
                return this.f14562a.hashCode();
            }

            public String toString() {
                return "AdExpired(reason=" + this.f14562a + ")";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f14563a = new c();

            public c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 104302499;
            }

            public String toString() {
                return "ClearRequested";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f14564a = new d();

            public d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -812566506;
            }

            public String toString() {
                return "DestroyRequested";
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f14565a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Throwable exception) {
                super(null);
                Intrinsics.f(exception, "exception");
                this.f14565a = exception;
            }

            public final Throwable a() {
                return this.f14565a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && Intrinsics.a(this.f14565a, ((e) obj).f14565a);
            }

            public int hashCode() {
                return this.f14565a.hashCode();
            }

            public String toString() {
                return "LoadFailed(exception=" + this.f14565a + ")";
            }
        }

        public static final class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f14566a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f14567b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CompletableDeferred f14568c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Context context, String str, CompletableDeferred completion) {
                super(null);
                Intrinsics.f(context, "context");
                Intrinsics.f(completion, "completion");
                this.f14566a = context;
                this.f14567b = str;
                this.f14568c = completion;
            }

            public final String a() {
                return this.f14567b;
            }

            public final CompletableDeferred b() {
                return this.f14568c;
            }

            public final Context c() {
                return this.f14566a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.a(this.f14566a, fVar.f14566a) && Intrinsics.a(this.f14567b, fVar.f14567b) && Intrinsics.a(this.f14568c, fVar.f14568c);
            }

            public int hashCode() {
                int iHashCode = this.f14566a.hashCode() * 31;
                String str = this.f14567b;
                return this.f14568c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public String toString() {
                return "LoadRequested(context=" + this.f14566a + ", bidResponse=" + this.f14567b + ", completion=" + this.f14568c + ")";
            }
        }

        public static final class g extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ya f14569a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(ya loadedAd) {
                super(null);
                Intrinsics.f(loadedAd, "loadedAd");
                this.f14569a = loadedAd;
            }

            public final ya a() {
                return this.f14569a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && Intrinsics.a(this.f14569a, ((g) obj).f14569a);
            }

            public int hashCode() {
                return this.f14569a.hashCode();
            }

            public String toString() {
                return "LoadSucceeded(loadedAd=" + this.f14569a + ")";
            }
        }

        public static final class h extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f14570a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(Throwable exception) {
                super(null);
                Intrinsics.f(exception, "exception");
                this.f14570a = exception;
            }

            public final Throwable a() {
                return this.f14570a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && Intrinsics.a(this.f14570a, ((h) obj).f14570a);
            }

            public int hashCode() {
                return this.f14570a.hashCode();
            }

            public String toString() {
                return "ShowFailed(exception=" + this.f14570a + ")";
            }
        }

        public static final class i extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f14571a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CompletableDeferred f14572b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(Context context, CompletableDeferred completion) {
                super(null);
                Intrinsics.f(context, "context");
                Intrinsics.f(completion, "completion");
                this.f14571a = context;
                this.f14572b = completion;
            }

            public final CompletableDeferred a() {
                return this.f14572b;
            }

            public final Context b() {
                return this.f14571a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return Intrinsics.a(this.f14571a, iVar.f14571a) && Intrinsics.a(this.f14572b, iVar.f14572b);
            }

            public int hashCode() {
                return this.f14572b.hashCode() + (this.f14571a.hashCode() * 31);
            }

            public String toString() {
                return "ShowRequested(context=" + this.f14571a + ", completion=" + this.f14572b + ")";
            }
        }

        public static final class j extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final View f14573a;

            public j(View view) {
                super(null);
                this.f14573a = view;
            }

            public final View a() {
                return this.f14573a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && Intrinsics.a(this.f14573a, ((j) obj).f14573a);
            }

            public int hashCode() {
                View view = this.f14573a;
                if (view == null) {
                    return 0;
                }
                return view.hashCode();
            }

            public String toString() {
                return "ShowSucceeded(view=" + this.f14573a + ")";
            }
        }

        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14574a = new a();

            public a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1843455502;
            }

            public String toString() {
                return "Destroyed";
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f14575a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Throwable exception) {
                super(null);
                Intrinsics.f(exception, "exception");
                this.f14575a = exception;
            }

            public final Throwable a() {
                return this.f14575a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.a(this.f14575a, ((b) obj).f14575a);
            }

            public int hashCode() {
                return this.f14575a.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.f14575a + ")";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$c$c, reason: collision with other inner class name */
        public static final class C0173c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0173c f14576a = new C0173c();

            public C0173c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0173c);
            }

            public int hashCode() {
                return 1837959871;
            }

            public String toString() {
                return "Idle";
            }
        }

        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ya f14577a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(ya loadedAd) {
                super(null);
                Intrinsics.f(loadedAd, "loadedAd");
                this.f14577a = loadedAd;
            }

            public final ya a() {
                return this.f14577a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.a(this.f14577a, ((d) obj).f14577a);
            }

            public int hashCode() {
                return this.f14577a.hashCode();
            }

            public String toString() {
                return "Loaded(loadedAd=" + this.f14577a + ")";
            }
        }

        public static final class e extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f14578a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CompletableDeferred f14579b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String bidResponse, CompletableDeferred completion) {
                super(null);
                Intrinsics.f(bidResponse, "bidResponse");
                Intrinsics.f(completion, "completion");
                this.f14578a = bidResponse;
                this.f14579b = completion;
            }

            public final CompletableDeferred a() {
                return this.f14579b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.a(this.f14578a, eVar.f14578a) && Intrinsics.a(this.f14579b, eVar.f14579b);
            }

            public int hashCode() {
                return this.f14579b.hashCode() + (this.f14578a.hashCode() * 31);
            }

            public String toString() {
                return "Loading(bidResponse=" + this.f14578a + ", completion=" + this.f14579b + ")";
            }
        }

        public static final class f extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ya f14580a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CompletableDeferred f14581b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(ya adBeingShown, CompletableDeferred completion) {
                super(null);
                Intrinsics.f(adBeingShown, "adBeingShown");
                Intrinsics.f(completion, "completion");
                this.f14580a = adBeingShown;
                this.f14581b = completion;
            }

            public final ya a() {
                return this.f14580a;
            }

            public final CompletableDeferred b() {
                return this.f14581b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.a(this.f14580a, fVar.f14580a) && Intrinsics.a(this.f14581b, fVar.f14581b);
            }

            public int hashCode() {
                return this.f14581b.hashCode() + (this.f14580a.hashCode() * 31);
            }

            public String toString() {
                return "Showing(adBeingShown=" + this.f14580a + ", completion=" + this.f14581b + ")";
            }
        }

        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class d implements com.chartboost.sdk.impl.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.chartboost.sdk.impl.l f14582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f14583b;

        public static final class a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f14584b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f14585c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o oVar, Continuation continuation) {
                super(2, continuation);
                this.f14585c = oVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f14585c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i2 = this.f14584b;
                if (i2 == 0) {
                    ResultKt.b(obj);
                    o oVar = this.f14585c;
                    b.a aVar = b.a.f14561a;
                    this.f14584b = 1;
                    if (oVar.a(aVar, this) == coroutineSingletons) {
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

        public static final class b extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f14586b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f14587c;
            public final /* synthetic */ s7 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o oVar, s7 s7Var, Continuation continuation) {
                super(2, continuation);
                this.f14587c = oVar;
                this.d = s7Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f14587c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i2 = this.f14586b;
                if (i2 == 0) {
                    ResultKt.b(obj);
                    o oVar = this.f14587c;
                    b.C0172b c0172b = new b.C0172b(this.d);
                    this.f14586b = 1;
                    if (oVar.a(c0172b, this) == coroutineSingletons) {
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

        public static final class c extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f14588b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f14589c;
            public final /* synthetic */ ya d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(o oVar, ya yaVar, Continuation continuation) {
                super(2, continuation);
                this.f14589c = oVar;
                this.d = yaVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new c(this.f14589c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                if (this.f14588b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                this.f14589c.a(this.d, false);
                return Unit.f43263a;
            }
        }

        public d(com.chartboost.sdk.impl.l lVar, o oVar) {
            this.f14582a = lVar;
            this.f14583b = oVar;
        }

        @Override // com.chartboost.sdk.impl.l
        public void a() {
            this.f14582a.a();
        }

        @Override // com.chartboost.sdk.impl.l
        public void b() {
            BuildersKt.c(this.f14583b.f14558h, null, null, new a(this.f14583b, null), 3);
            this.f14582a.b();
        }

        @Override // com.chartboost.sdk.impl.l
        public void c() {
            com.chartboost.sdk.impl.l.a.a(this);
        }

        @Override // com.chartboost.sdk.impl.l
        public void d() {
            ya yaVarA;
            if (this.f14583b.k) {
                return;
            }
            this.f14582a.d();
            this.f14583b.k = true;
            c cVarG = this.f14583b.g();
            c.f fVar = cVarG instanceof c.f ? (c.f) cVarG : null;
            if (fVar == null || (yaVarA = fVar.a()) == null) {
                return;
            }
            o oVar = this.f14583b;
            BuildersKt.c(oVar.f14558h, null, null, new c(oVar, yaVarA, null), 3);
        }

        @Override // com.chartboost.sdk.impl.l
        public void e() {
            this.f14582a.e();
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(s7 expirationReason) {
            Intrinsics.f(expirationReason, "expirationReason");
            BuildersKt.c(this.f14583b.f14558h, null, null, new b(this.f14583b, expirationReason, null), 3);
            this.f14582a.a(expirationReason);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(String url) {
            Intrinsics.f(url, "url");
            this.f14582a.a(url);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(rd request) {
            Intrinsics.f(request, "request");
            this.f14582a.a(request);
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14590b;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f14590b;
            if (i2 == 0) {
                ResultKt.b(obj);
                o oVar = o.this;
                b.c cVar = b.c.f14563a;
                this.f14590b = 1;
                if (oVar.a(cVar, this) == coroutineSingletons) {
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

    public static final class f extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14592b;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f14592b;
            if (i2 == 0) {
                ResultKt.b(obj);
                o oVar = o.this;
                b.d dVar = b.d.f14564a;
                this.f14592b = 1;
                if (oVar.a(dVar, this) == coroutineSingletons) {
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

    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14595c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14596e;
        public int g;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14596e = obj;
            this.g |= Integer.MIN_VALUE;
            return o.this.a((b) null, this);
        }
    }

    public static final class h extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14597b;
        public final /* synthetic */ b d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b bVar, Continuation continuation) {
            super(2, continuation);
            this.d = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new h(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f14597b;
            if (i2 == 0) {
                ResultKt.b(obj);
                o oVar = o.this;
                Context contextC = ((b.f) this.d).c();
                String strA = ((b.f) this.d).a();
                this.f14597b = 1;
                if (oVar.b(contextC, strA, this) == coroutineSingletons) {
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

    public static final class i extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14599b;
        public final /* synthetic */ b d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f14601e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(b bVar, c cVar, Continuation continuation) {
            super(2, continuation);
            this.d = bVar;
            this.f14601e = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new i(this.d, this.f14601e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f14599b;
            if (i2 == 0) {
                ResultKt.b(obj);
                o oVar = o.this;
                Context contextB = ((b.i) this.d).b();
                ya yaVarA = ((c.d) this.f14601e).a();
                this.f14599b = 1;
                if (oVar.a(contextB, yaVarA, this) == coroutineSingletons) {
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

    public static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14603c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f14604e;
        public /* synthetic */ Object f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f14605h;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.f14605h |= Integer.MIN_VALUE;
            Object objA = o.this.a((Context) null, (String) null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14607c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14608e;
        public int g;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14608e = obj;
            this.g |= Integer.MIN_VALUE;
            return o.this.b(null, null, this);
        }
    }

    public static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14610c;
        public /* synthetic */ Object d;
        public int f;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return o.this.a((Context) null, (ya) null, this);
        }
    }

    public static final class m extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14613c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14614e;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14613c = obj;
            this.f14614e |= Integer.MIN_VALUE;
            Object objA = o.this.a((Context) null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f14616c;
        public final /* synthetic */ o d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i2, o oVar, Continuation continuation) {
            super(2, continuation);
            this.f14616c = i2;
            this.d = oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f14616c, this.d, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            if (r9.a(r1, r8) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
                int r1 = r8.f14615b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.ResultKt.b(r9)
                goto L40
            L10:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L18:
                kotlin.ResultKt.b(r9)
                goto L2e
            L1c:
                kotlin.ResultKt.b(r9)
                int r9 = r8.f14616c
                long r4 = (long) r9
                r6 = 1000(0x3e8, double:4.94E-321)
                long r4 = r4 * r6
                r8.f14615b = r3
                java.lang.Object r9 = kotlinx.coroutines.DelayKt.a(r4, r8)
                if (r9 != r0) goto L2e
                goto L3f
            L2e:
                com.chartboost.sdk.impl.o r9 = r8.d
                com.chartboost.sdk.impl.o$b$b r1 = new com.chartboost.sdk.impl.o$b$b
                com.chartboost.sdk.impl.s7 r3 = com.chartboost.sdk.impl.s7.TTL_EXPIRED
                r1.<init>(r3)
                r8.f14615b = r2
                java.lang.Object r9 = r9.a(r1, r8)
                if (r9 != r0) goto L40
            L3f:
                return r0
            L40:
                kotlin.Unit r9 = kotlin.Unit.f43263a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.o.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public o(com.chartboost.sdk.impl.j adConfig, Mediation mediation, com.chartboost.sdk.impl.l externalAdContainerListener, jj viewabilityComponent, vg trackerComponent, jg telemetryManager, we renderableFactory, b2 base64Wrapper) {
        Intrinsics.f(adConfig, "adConfig");
        Intrinsics.f(externalAdContainerListener, "externalAdContainerListener");
        Intrinsics.f(viewabilityComponent, "viewabilityComponent");
        Intrinsics.f(trackerComponent, "trackerComponent");
        Intrinsics.f(telemetryManager, "telemetryManager");
        Intrinsics.f(renderableFactory, "renderableFactory");
        Intrinsics.f(base64Wrapper, "base64Wrapper");
        this.f14554a = adConfig;
        this.f14555b = mediation;
        this.f14556c = viewabilityComponent;
        this.d = trackerComponent;
        this.f14557e = telemetryManager;
        this.f = renderableFactory;
        this.g = base64Wrapper;
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        this.f14558h = CoroutineScopeKt.a(MainDispatcherLoader.f45042a.j0().plus(SupervisorKt.b()));
        this.f14559i = MutexKt.a();
        this.j = c.C0173c.f14576a;
        this.m = new d(externalAdContainerListener, this);
    }

    @Override // com.chartboost.sdk.impl.p8
    public void c() {
        BuildersKt.c(this.f14558h, null, null, new e(null), 3);
    }

    public final void d(ya yaVar) {
        jg jgVar = this.f14557e;
        xf xfVar = new xf(yaVar.b(), EmptyList.X, null, null, null, null, this.f14555b, 56, null);
        List listC = yaVar.a().c();
        ArrayList<x6> arrayList = new ArrayList();
        for (Object obj : listC) {
            if (Intrinsics.a(((x6) obj).d(), x6.b.SHOW.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        for (x6 x6Var : arrayList) {
            arrayList2.add(new wg(x6Var.e(), x6Var.c(), x6Var.a(), x6Var.b()));
        }
        jgVar.a(xfVar, arrayList2);
    }

    public final void e() {
        Job job = this.f14560l;
        if (job != null) {
            job.a(null);
        }
    }

    public final ya f() {
        c cVar = this.j;
        if (cVar instanceof c.d) {
            return ((c.d) cVar).a();
        }
        if (cVar instanceof c.f) {
            return ((c.f) cVar).a();
        }
        return null;
    }

    public final c g() {
        return this.j;
    }

    @Override // com.chartboost.sdk.impl.p8
    public void b() {
        BuildersKt.c(this.f14558h, null, null, new f(null), 3);
    }

    public final void c(ya ad) {
        pc pcVarC;
        Intrinsics.f(ad, "ad");
        jg jgVar = this.f14557e;
        r9 r9Var = new r9(ad.b(), EmptyList.X, null, null, null, null, this.f14555b, 60, null);
        List listC = ad.a().c();
        ArrayList<x6> arrayList = new ArrayList();
        for (Object obj : listC) {
            if (Intrinsics.a(((x6) obj).d(), x6.b.IMPRESSION.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        for (x6 x6Var : arrayList) {
            arrayList2.add(new wg(x6Var.e(), x6Var.c(), x6Var.a(), x6Var.b()));
        }
        jgVar.a(r9Var, arrayList2);
        ya yaVarF = f();
        if (yaVarF == null || (pcVarC = yaVarF.c()) == null) {
            return;
        }
        pcVarC.o();
    }

    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0121  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x0136  */
    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:62:0x014a  */
    /* JADX WARN: Code duplicated, block: B:64:0x014e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0151  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
    
        if (r0 == r3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0184, code lost:
    
        if (r12.a(r4, r2) == r3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ba, code lost:
    
        if (r12.a(r0, r2) == r3) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [com.chartboost.sdk.impl.o] */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.chartboost.sdk.impl.o] */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.chartboost.sdk.impl.o] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [com.chartboost.sdk.impl.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r24, java.lang.String r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.o.b(android.content.Context, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a(c cVar, fg fgVar) {
        if (this.j instanceof c.a) {
            return;
        }
        if (!(cVar instanceof c.e)) {
            if (cVar instanceof c.d) {
                ((c.d) cVar).a().c().a(fgVar);
            } else if (cVar instanceof c.f) {
                ((c.f) cVar).a().c().a(fgVar);
            }
        }
        Job job = this.f14560l;
        if (job != null) {
            job.a(null);
        }
        CoroutineScopeKt.c(this.f14558h, ExceptionsKt.a("AdController Destroyed with reason: " + fgVar, null));
        this.j = c.a.f14574a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(b bVar, Continuation continuation) {
        g gVar;
        Mutex mutex;
        o oVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.g = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.f14596e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = gVar.g;
        if (i3 == 0) {
            ResultKt.b(obj);
            mutex = this.f14559i;
            gVar.f14594b = this;
            gVar.f14595c = bVar;
            gVar.d = mutex;
            gVar.g = 1;
            if (mutex.a(gVar) == coroutineSingletons) {
                return coroutineSingletons;
            }
            oVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) gVar.d;
            b bVar2 = (b) gVar.f14595c;
            oVar = (o) gVar.f14594b;
            ResultKt.b(obj);
            mutex = mutex2;
            bVar = bVar2;
        }
        try {
            c cVar = oVar.j;
            Class<?> cls = cVar.getClass();
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            za.a(reflectionFactory.b(cls).l() + " --> " + reflectionFactory.b(bVar.getClass()).l(), (Throwable) null, 2, (Object) null);
            boolean z2 = cVar instanceof c.a;
            Unit unit = Unit.f43263a;
            if (z2) {
                za.a("AdController is already destroyed. Ignoring event " + reflectionFactory.b(bVar.getClass()).l() + mo.ono, (Throwable) null, 2, (Object) null);
            } else {
                if (cVar instanceof c.C0173c) {
                    if (bVar instanceof b.f) {
                        String strA = ((b.f) bVar).a();
                        if (strA != null && !StringsKt.w(strA)) {
                            oVar.j = new c.e(((b.f) bVar).a(), ((b.f) bVar).b());
                            CoroutineScope coroutineScope = oVar.f14558h;
                            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                            BuildersKt.c(coroutineScope, DefaultIoScheduler.f45062Y, null, oVar.new h(bVar, null), 2);
                        } else {
                            ChartboostError.Load.InvalidAdm invalidAdm = new ChartboostError.Load.InvalidAdm("Bid response is null or empty", null);
                            oVar.j = new c.b(invalidAdm);
                            ((b.f) bVar).b().H(new Result(ResultKt.a(invalidAdm)));
                        }
                    }
                } else if (cVar instanceof c.e) {
                    if (bVar instanceof b.g) {
                        oVar.j = new c.d(((b.g) bVar).a());
                        oVar.a(((b.g) bVar).a().a().d());
                        ((c.e) cVar).a().H(new Result(unit));
                    } else if (bVar instanceof b.e) {
                        oVar.j = new c.b(((b.e) bVar).a());
                        ((c.e) cVar).a().H(new Result(ResultKt.a(((b.e) bVar).a())));
                    } else if (bVar instanceof b.c) {
                        ChartboostError.Load.Internal internal = new ChartboostError.Load.Internal("Load operation was cancelled by clear request", new IllegalStateException("Load cancelled"));
                        za.b(com.ironsource.d9.i.d + internal.getCode() + "] " + internal.getConstant() + " - Load cancelled", internal);
                        ((c.e) cVar).a().H(new Result(ResultKt.a(internal)));
                        oVar.a(cVar, fg.FAILURE);
                    }
                } else if (cVar instanceof c.d) {
                    if (bVar instanceof b.i) {
                        oVar.j = new c.f(((c.d) cVar).a(), ((b.i) bVar).a());
                        BuildersKt.c(oVar.f14558h, null, null, oVar.new i(bVar, cVar, null), 3);
                    } else if (bVar instanceof b.c) {
                        oVar.a(cVar, fg.FAILURE);
                    } else if (bVar instanceof b.C0172b) {
                        oVar.b(((c.d) cVar).a());
                        oVar.a(cVar, fg.FAILURE);
                    }
                } else if (cVar instanceof c.f) {
                    if (bVar instanceof b.j) {
                        ((c.f) cVar).b().H(new Result(((b.j) bVar).a()));
                    } else if (bVar instanceof b.a) {
                        oVar.a(((c.f) cVar).a());
                        if (oVar.f14554a.a() == r.REWARDED && !oVar.k) {
                            oVar.a(((c.f) cVar).a(), true);
                        }
                        oVar.k = false;
                        oVar.a(cVar, fg.CLOSE);
                    } else if (bVar instanceof b.h) {
                        ((c.f) cVar).b().H(new Result(ResultKt.a(((b.h) bVar).a())));
                        oVar.j = new c.b(((b.h) bVar).a());
                    }
                } else if (!(cVar instanceof c.b)) {
                    boolean z3 = cVar instanceof c.a;
                }
                if (bVar instanceof b.d) {
                    oVar.a(cVar, cVar instanceof c.f ? fg.CLOSE : fg.FAILURE);
                }
                String strL = reflectionFactory.b(bVar.getClass()).l();
                c cVar2 = oVar.j;
                String strL2 = reflectionFactory.b(cVar2.getClass()).l();
                if ((cVar2 instanceof c.b) && (((c.b) cVar2).a() instanceof ChartboostError)) {
                    Throwable thA = ((c.b) cVar2).a();
                    za.a(strL + " --> " + strL2 + " [" + ((ChartboostError) thA).getCode() + "] " + ((ChartboostError) thA).getConstant(), (Throwable) null, 2, (Object) null);
                } else {
                    za.a(strL + " --> " + strL2, (Throwable) null, 2, (Object) null);
                }
            }
            return unit;
        } finally {
            mutex.b(null);
        }
    }

    public /* synthetic */ o(com.chartboost.sdk.impl.j jVar, Mediation mediation, com.chartboost.sdk.impl.l lVar, jj jjVar, vg vgVar, jg jgVar, we weVar, b2 b2Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, mediation, lVar, jjVar, vgVar, jgVar, weVar, (i2 & 128) != 0 ? new b2() : b2Var);
    }

    public final void b(ya yaVar) {
        jg jgVar = this.f14557e;
        r7 r7Var = new r7(yaVar.b(), EmptyList.X, null, null, null, null, this.f14555b, 60, null);
        List listC = yaVar.a().c();
        ArrayList<x6> arrayList = new ArrayList();
        for (Object obj : listC) {
            if (Intrinsics.a(((x6) obj).d(), x6.b.EXPIRATION.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        for (x6 x6Var : arrayList) {
            arrayList2.add(new wg(x6Var.e(), x6Var.c(), x6Var.a(), x6Var.b()));
        }
        jgVar.a(r7Var, arrayList2);
    }

    @Override // com.chartboost.sdk.impl.p8
    public boolean a() {
        return this.j instanceof c.d;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.chartboost.sdk.impl.p8
    public Object a(Context context, String str, Continuation continuation) {
        j jVar;
        CompletableDeferred completableDeferredA;
        String str2;
        long j2;
        o oVar;
        String str3;
        o oVar2;
        Object obj;
        long jCurrentTimeMillis;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f14605h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f14605h = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object objR = jVar.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = jVar.f14605h;
        if (i3 == 0) {
            ResultKt.b(objR);
            completableDeferredA = CompletableDeferredKt.a();
            b.f fVar = new b.f(context, str, completableDeferredA);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            jVar.f14602b = this;
            jVar.f14603c = str;
            jVar.d = completableDeferredA;
            jVar.f14604e = jCurrentTimeMillis2;
            jVar.f14605h = 1;
            if (a(fVar, jVar) != coroutineSingletons) {
                str2 = str;
                j2 = jCurrentTimeMillis2;
                oVar = this;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            j2 = jVar.f14604e;
            completableDeferredA = (CompletableDeferred) jVar.d;
            str2 = (String) jVar.f14603c;
            oVar = (o) jVar.f14602b;
            ResultKt.b(objR);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = jVar.f14604e;
            str3 = (String) jVar.f14603c;
            oVar2 = (o) jVar.f14602b;
            ResultKt.b(objR);
        }
        obj = ((Result) objR).X;
        jCurrentTimeMillis = System.currentTimeMillis() - j2;
        if (str3 != null) {
            oVar2.a(obj, str3, jCurrentTimeMillis);
        }
        return obj;
        jVar.f14602b = oVar;
        jVar.f14603c = str2;
        jVar.d = null;
        jVar.f14604e = j2;
        jVar.f14605h = 2;
        objR = completableDeferredA.r(jVar);
        if (objR != coroutineSingletons) {
            str3 = str2;
            oVar2 = oVar;
            obj = ((Result) objR).X;
            jCurrentTimeMillis = System.currentTimeMillis() - j2;
            if (str3 != null) {
                oVar2.a(obj, str3, jCurrentTimeMillis);
            }
            return obj;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:51:0x0107  */
    /* JADX WARN: Code duplicated, block: B:53:0x0118  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x012c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ef, code lost:
    
        if (a(r0, r12) == r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016f, code lost:
    
        if (r3.a(r2, r12) == r13) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r17, com.chartboost.sdk.impl.ya r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.o.a(android.content.Context, com.chartboost.sdk.impl.ya, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r7 == r1) goto L22;
     */
    @Override // com.chartboost.sdk.impl.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(android.content.Context r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.chartboost.sdk.impl.o.m
            if (r0 == 0) goto L13
            r0 = r7
            com.chartboost.sdk.impl.o$m r0 = (com.chartboost.sdk.impl.o.m) r0
            int r1 = r0.f14614e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14614e = r1
            goto L18
        L13:
            com.chartboost.sdk.impl.o$m r0 = new com.chartboost.sdk.impl.o$m
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14613c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r2 = r0.f14614e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f14612b
            kotlinx.coroutines.CompletableDeferred r6 = (kotlinx.coroutines.CompletableDeferred) r6
            kotlin.ResultKt.b(r7)
            goto L52
        L3a:
            kotlin.ResultKt.b(r7)
            kotlinx.coroutines.CompletableDeferred r7 = kotlinx.coroutines.CompletableDeferredKt.a()
            com.chartboost.sdk.impl.o$b$i r2 = new com.chartboost.sdk.impl.o$b$i
            r2.<init>(r6, r7)
            r0.f14612b = r7
            r0.f14614e = r4
            java.lang.Object r6 = r5.a(r2, r0)
            if (r6 != r1) goto L51
            goto L5d
        L51:
            r6 = r7
        L52:
            r7 = 0
            r0.f14612b = r7
            r0.f14614e = r3
            java.lang.Object r7 = r6.r(r0)
            if (r7 != r1) goto L5e
        L5d:
            return r1
        L5e:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.X
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.o.a(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a(int i2) {
        Job job = this.f14560l;
        if (job != null) {
            job.a(null);
        }
        this.f14560l = BuildersKt.c(this.f14558h, null, null, new n(i2, this, null), 3);
    }

    public final void a(ya yaVar) {
        jg jgVar = this.f14557e;
        k4 k4Var = new k4(yaVar.b(), EmptyList.X, null, null, null, null, this.f14555b, 60, null);
        List listC = yaVar.a().c();
        ArrayList<x6> arrayList = new ArrayList();
        for (Object obj : listC) {
            if (Intrinsics.a(((x6) obj).d(), x6.b.CLOSE.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        for (x6 x6Var : arrayList) {
            arrayList2.add(new wg(x6Var.e(), x6Var.c(), x6Var.a(), x6Var.b()));
        }
        jgVar.a(k4Var, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[PHI: r7
  0x0059: PHI (r7v9 java.lang.String) = (r7v1 java.lang.String), (r7v2 java.lang.String), (r7v10 java.lang.String) binds: [B:34:0x0064, B:37:0x006c, B:28:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.chartboost.sdk.impl.jg] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
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
    public final void a(Object obj, String bidResponse, long j2) {
        Object objA;
        String strA;
        String message;
        String str;
        w wVarA;
        List listC;
        w wVarA2;
        Intrinsics.f(bidResponse, "bidResponse");
        try {
            objA = v.f15334c.a(new JSONObject(this.g.b(bidResponse)));
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        v vVar = (v) (objA instanceof Result.Failure ? null : objA);
        Throwable thA = Result.a(obj);
        ChartboostError.Load load = thA instanceof ChartboostError.Load ? (ChartboostError.Load) thA : null;
        if (vVar == null || (wVarA2 = vVar.a()) == null || (strA = wVarA2.a()) == null) {
            strA = a(bidResponse);
        }
        ChartboostError.Load load2 = load;
        ?? arrayList = EmptyList.X;
        if (load2 == null || (message = load2.getMessage()) == null) {
            message = thA != null ? thA.getMessage() : null;
            if (message != null) {
                str = message;
            } else {
                Throwable thA2 = Result.a(objA);
                if (thA2 != null) {
                    message = thA2.getMessage();
                    str = message;
                } else {
                    str = null;
                }
            }
        } else {
            str = message;
        }
        va vaVar = new va(strA, arrayList, str, load2 != null ? load2.getCode() : null, load2 != null ? load2.getConstant() : null, load2 != null ? load2.getCauseDescription() : null, Long.valueOf(j2), bidResponse, this.f14555b);
        if (vVar != null && (wVarA = vVar.a()) != null && (listC = wVarA.c()) != null) {
            ArrayList<x6> arrayList2 = new ArrayList();
            for (Object obj2 : listC) {
                if (Intrinsics.a(((x6) obj2).d(), x6.b.LOAD.b())) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = new ArrayList(CollectionsKt.n(arrayList2, 10));
            for (x6 x6Var : arrayList2) {
                arrayList.add(new wg(x6Var.e(), x6Var.c(), x6Var.a(), null, 8, null));
            }
        }
        this.f14557e.a(vaVar, arrayList);
    }

    public final void a(ya yaVar, boolean z2) {
        jg jgVar = this.f14557e;
        Cif cif = new Cif(yaVar.b(), EmptyList.X, z2, null, null, null, null, this.f14555b, 120, null);
        List listC = yaVar.a().c();
        ArrayList<x6> arrayList = new ArrayList();
        for (Object obj : listC) {
            if (Intrinsics.a(((x6) obj).d(), x6.b.REWARD.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        for (x6 x6Var : arrayList) {
            arrayList2.add(new wg(x6Var.e(), x6Var.c(), x6Var.a(), x6Var.b()));
        }
        jgVar.a(cif, arrayList2);
    }

    public final void a(ya ad, Throwable throwable) {
        Intrinsics.f(ad, "ad");
        Intrinsics.f(throwable, "throwable");
        ChartboostError.Show show = throwable instanceof ChartboostError.Show ? (ChartboostError.Show) throwable : null;
        jg jgVar = this.f14557e;
        xf xfVar = new xf(ad.b(), EmptyList.X, throwable.getMessage(), show != null ? show.getCode() : null, show != null ? show.getCauseDescription() : null, show != null ? show.getConstant() : null, this.f14555b);
        List listC = ad.a().c();
        ArrayList<x6> arrayList = new ArrayList();
        for (Object obj : listC) {
            if (Intrinsics.a(((x6) obj).d(), x6.b.SHOW.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        for (x6 x6Var : arrayList) {
            arrayList2.add(new wg(x6Var.e(), x6Var.c(), x6Var.a(), x6Var.b()));
        }
        jgVar.a(xfVar, arrayList2);
    }

    public final String a(String str) {
        try {
            String strOptString = new JSONObject(this.g.b(str)).optString("auction_id");
            Intrinsics.c(strOptString);
            return strOptString;
        } catch (JSONException unused) {
            return "";
        }
    }
}
