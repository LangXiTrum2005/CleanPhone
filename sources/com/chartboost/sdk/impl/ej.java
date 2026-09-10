package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class ej implements dj, gj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final si f13829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h7 f13830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f13831c;
    public final CoroutineDispatcher d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f13832e;
    public final Lazy f;
    public m7 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Job f13833h;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f13834b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n7 invoke(Context c2) {
            Intrinsics.f(c2, "c");
            return new n7(c2, null, null, null, 14, null);
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f13835b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap invoke() {
            return new ConcurrentHashMap();
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13836b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ej.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f13836b;
            if (i2 == 0) {
                ResultKt.b(obj);
                long jI = ej.this.f13829a.i();
                this.f13836b = 1;
                if (DelayKt.a(jI, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            ej.this.f13833h = null;
            try {
                dj.a.a(ej.this, null, 0, false, 7, null);
            } catch (IllegalStateException e2) {
                za.b("Cannot start download", e2);
            }
            return Unit.f43263a;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f13838b = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap invoke() {
            return new ConcurrentHashMap();
        }
    }

    public ej(si policy, h7 downloadManager, Function1 fileCachingFactory, CoroutineDispatcher dispatcher) {
        Intrinsics.f(policy, "policy");
        Intrinsics.f(downloadManager, "downloadManager");
        Intrinsics.f(fileCachingFactory, "fileCachingFactory");
        Intrinsics.f(dispatcher, "dispatcher");
        this.f13829a = policy;
        this.f13830b = downloadManager;
        this.f13831c = fileCachingFactory;
        this.d = dispatcher;
        this.f13832e = LazyKt.b(b.f13835b);
        this.f = LazyKt.b(d.f13838b);
    }

    public final ConcurrentHashMap b() {
        return (ConcurrentHashMap) this.f.getX();
    }

    public final File c(String str) {
        m7 m7Var = this.g;
        if (m7Var != null) {
            return m7Var.a(str);
        }
        return null;
    }

    public final void d() {
        if (this.f13833h == null) {
            this.f13833h = BuildersKt.c(CoroutineScopeKt.a(this.d), null, null, new c(null), 3);
        }
    }

    public final void e(oi oiVar) {
        h6 h6Var;
        if (this.f13829a.g()) {
            d();
            h6Var = h6.MAX_COUNT_TIME_WINDOW;
        } else {
            h6Var = h6.NONE;
        }
        a(oiVar, h6Var);
    }

    @Override // com.chartboost.sdk.impl.dj
    public oi b(String filename) {
        Intrinsics.f(filename, "filename");
        return (oi) a().get(filename);
    }

    public final void c() {
        h6 h6Var;
        if (this.f13829a.g()) {
            d();
            h6Var = h6.MAX_COUNT_TIME_WINDOW;
        } else {
            h6Var = h6.NONE;
        }
        if (h6Var == h6.NONE) {
            this.f13829a.a();
        }
        this.f13830b.a(h6Var);
    }

    @Override // com.chartboost.sdk.impl.dj
    public void a(String url, String filename, boolean z2, p0 p0Var) {
        oi oiVarA;
        oi oiVarB;
        Intrinsics.f(url, "url");
        Intrinsics.f(filename, "filename");
        StringBuilder sb = new StringBuilder("downloadVideoFile() - url: ");
        androidx.media3.extractor.text.ttml.a.C(sb, url, ", filename: ", filename, ", showImmediately: ");
        sb.append(z2);
        sb.append(", callback: ");
        sb.append(p0Var);
        za.a(sb.toString(), (Throwable) null, 2, (Object) null);
        if (p0Var != null) {
            b().put(url, p0Var);
        }
        File fileC = c(filename);
        if (fileC == null || (oiVarA = a(fileC, url)) == null || (oiVarB = b(oiVarA)) == null || c(oiVarB) == null) {
            za.a("downloadVideoFile() - cache file is null", (Throwable) null, 2, (Object) null);
        }
        dj.a.a(this, filename, 0, z2, 2, null);
    }

    public final oi b(oi oiVar) {
        a().put(oiVar.d(), oiVar);
        return oiVar;
    }

    public final void d(oi oiVar) {
        za.a("startForcedDownload() - " + oiVar, (Throwable) null, 2, (Object) null);
        this.f13829a.a();
        this.f13830b.a(oiVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ej(si siVar, h7 h7Var, Function1 function1, CoroutineDispatcher coroutineDispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        function1 = (i2 & 4) != 0 ? a.f13834b : function1;
        if ((i2 & 8) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher = DefaultIoScheduler.f45062Y;
        }
        this(siVar, h7Var, function1, coroutineDispatcher);
    }

    public final oi c(oi oiVar) {
        za.a("queueDownload() - asset: " + oiVar, (Throwable) null, 2, (Object) null);
        a(oiVar, h6.STOPPED_QUEUE);
        return oiVar;
    }

    public final ConcurrentHashMap a() {
        return (ConcurrentHashMap) this.f13832e.getX();
    }

    @Override // com.chartboost.sdk.impl.dj
    public int a(oi oiVar) {
        if (oiVar != null) {
            return df.a(this.f13830b.d(oiVar.d()));
        }
        return 0;
    }

    @Override // com.chartboost.sdk.impl.dj
    public void a(Context context) {
        Intrinsics.f(context, "context");
        za.a("initialize()", (Throwable) null, 2, (Object) null);
        this.g = (m7) this.f13831c.invoke(context);
        h7 h7Var = this.f13830b;
        h7Var.a();
        h7Var.a(this);
        h7Var.b();
    }

    @Override // com.chartboost.sdk.impl.dj
    public boolean a(String videoFilename) {
        Intrinsics.f(videoFilename, "videoFilename");
        return this.f13830b.a(videoFilename);
    }

    @Override // com.chartboost.sdk.impl.gj.a
    public void a(String uri, String videoFileName, CBError cBError) {
        Intrinsics.f(uri, "uri");
        Intrinsics.f(videoFileName, "videoFileName");
        StringBuilder sb = new StringBuilder("onError() - uri ");
        androidx.media3.extractor.text.ttml.a.C(sb, uri, ", videoFileName ", videoFileName, ", error ");
        sb.append(cBError);
        za.a(sb.toString(), (Throwable) null, 2, (Object) null);
        b().remove(uri);
    }

    @Override // com.chartboost.sdk.impl.gj.a
    public void a(String uri, String videoFileName) {
        Intrinsics.f(uri, "uri");
        Intrinsics.f(videoFileName, "videoFileName");
        za.a(android.support.v4.media.a.s(new StringBuilder("onSuccess() - uri "), uri, ", videoFileName ", videoFileName), (Throwable) null, 2, (Object) null);
        b().remove(uri);
        dj.a.a(this, null, 0, false, 7, null);
    }

    public final void a(oi oiVar, h6 h6Var) {
        za.a("sendDownloadToDownloadManager() - " + oiVar, (Throwable) null, 2, (Object) null);
        if (h6Var == h6.NONE) {
            this.f13829a.a();
        }
        this.f13830b.a(oiVar, h6Var);
    }

    @Override // com.chartboost.sdk.impl.dj
    public void a(String str, int i2, boolean z2) {
        Unit unit;
        oi oiVar;
        za.a("startDownloadIfPossible() - filename " + str + ", forceDownload " + z2, (Throwable) null, 2, (Object) null);
        if (str == null || (oiVar = (oi) a().get(str)) == null) {
            unit = null;
        } else {
            za.a("startDownloadIfPossible() - asset: " + oiVar, (Throwable) null, 2, (Object) null);
            if (z2) {
                d(oiVar);
            } else {
                e(oiVar);
            }
            unit = Unit.f43263a;
        }
        if (unit == null) {
            za.a("startDownloadIfPossible() - null asset, resume next download in Download Manager index", (Throwable) null, 2, (Object) null);
            c();
        }
    }

    @Override // com.chartboost.sdk.impl.gj.a
    public void a(String url, String videoFileName, long j, p0 p0Var) {
        Intrinsics.f(url, "url");
        Intrinsics.f(videoFileName, "videoFileName");
        za.a(android.support.v4.media.a.s(new StringBuilder("tempFileIsReady() - url "), url, ", videoFileName ", videoFileName), (Throwable) null, 2, (Object) null);
        if (p0Var == null) {
            p0Var = (p0) b().get(url);
        }
        if (p0Var != null) {
            p0Var.a(url);
        }
    }

    public final oi a(File file, String str) {
        String name = file.getName();
        Intrinsics.e(name, "getName(...)");
        oi oiVar = new oi(str, name, file, file.getParentFile(), 0L, null, 0L, 112, null);
        file.setLastModified(oiVar.a());
        return oiVar;
    }
}
