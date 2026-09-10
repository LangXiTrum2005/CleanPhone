package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.R;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.ScriptInjector;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class id {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf f14180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hf f14181c;
    public final AtomicReference d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineDispatcher f14182e;

    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14183b;

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
            return id.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f14183b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            try {
                Omid.activate(id.this.f14179a);
                za.a("OMSDK is initialized successfully!", (Throwable) null, 2, (Object) null);
            } catch (Exception e2) {
                za.b("OMSDK initialization exception", e2);
            }
            return Unit.f43263a;
        }
    }

    public id(Context context, wf sharedPrefsHelper, hf resourcesLoader, AtomicReference sdkConfig, CoroutineDispatcher mainDispatcher) {
        Intrinsics.f(context, "context");
        Intrinsics.f(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.f(resourcesLoader, "resourcesLoader");
        Intrinsics.f(sdkConfig, "sdkConfig");
        Intrinsics.f(mainDispatcher, "mainDispatcher");
        this.f14179a = context;
        this.f14180b = sharedPrefsHelper;
        this.f14181c = resourcesLoader;
        this.d = sdkConfig;
        this.f14182e = mainDispatcher;
    }

    public final dd b() {
        qf qfVar = (qf) this.d.get();
        dd ddVarB = qfVar != null ? qfVar.b() : null;
        if (ddVarB == null) {
            return new dd(false, false, 0, 0, 0L, 0, null, 127, null);
        }
        return ddVarB;
    }

    public final Partner c() {
        try {
            return Partner.createPartner(i(), "9.10.2");
        } catch (Exception e2) {
            za.b("Omid Partner exception", e2);
            return null;
        }
    }

    public final List d() {
        dd ddVarB;
        List listE;
        qf qfVar = (qf) this.d.get();
        return (qfVar == null || (ddVarB = qfVar.b()) == null || (listE = ddVarB.e()) == null) ? EmptyList.X : listE;
    }

    public final void e() {
        if (!g()) {
            za.a("OMSDK initialize is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        if (f()) {
            za.a("OMSDK initialize is already active!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            BuildersKt.c(CoroutineScopeKt.a(this.f14182e), null, null, new a(null), 3);
        } catch (Exception e2) {
            za.b("Error launching om activate job", e2);
        }
    }

    public final boolean f() {
        try {
            return Omid.isActive();
        } catch (Exception e2) {
            za.a("OMSDK error when checking isActive", e2);
            return false;
        }
    }

    public final boolean g() {
        dd ddVarB;
        qf qfVar = (qf) this.d.get();
        if (qfVar == null || (ddVarB = qfVar.b()) == null) {
            return false;
        }
        return ddVarB.g();
    }

    public final boolean h() {
        dd ddVarB;
        qf qfVar = (qf) this.d.get();
        if (qfVar == null || (ddVarB = qfVar.b()) == null) {
            return false;
        }
        return ddVarB.d();
    }

    public final String i() {
        return "Chartboost";
    }

    public final String a() {
        return a(R.raw.omsdk_v1, "com.chartboost.sdk.omidjs");
    }

    public final String a(int i2, String str) {
        try {
            String strA = this.f14180b.a(str);
            return strA == null ? a(str, i2) : strA;
        } catch (Exception e2) {
            za.b("OmidJS exception", e2);
            return null;
        }
    }

    public final String a(String html) {
        Intrinsics.f(html, "html");
        if (!g()) {
            za.b("OMSDK injectOmidJsIntoHtml is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return html;
        }
        if (Omid.isActive()) {
            try {
                String strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(a(), html);
                Intrinsics.c(strInjectScriptContentIntoHtml);
                return strInjectScriptContentIntoHtml;
            } catch (Exception e2) {
                za.b("OmidJS injection exception", e2);
            }
        }
        return html;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public id(Context context, wf wfVar, hf hfVar, AtomicReference atomicReference, CoroutineDispatcher coroutineDispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 16) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher = MainDispatcherLoader.f45042a;
        }
        this(context, wfVar, hfVar, atomicReference, coroutineDispatcher);
    }

    public final String a(String str, int i2) {
        try {
            String strA = this.f14181c.a(i2);
            if (strA == null) {
                return null;
            }
            this.f14180b.a(str, strA);
            return strA;
        } catch (Exception e2) {
            za.b("OmidJS resource file exception", e2);
            return null;
        }
    }
}
