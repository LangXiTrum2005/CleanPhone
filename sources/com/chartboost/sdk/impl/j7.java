package com.chartboost.sdk.impl;

import android.net.Uri;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.video.repository.exoplayer.VideoRepositoryDownloadService;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class j7 implements h7, DownloadManager.Listener, t3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f14237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DownloadManager f14238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DataSource.Factory f14239c;
    public m7 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z7 f14240e;
    public volatile List f;
    public volatile Map g;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i6 f14241b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i6 i6Var) {
            super(1);
            this.f14241b = i6Var;
        }

        public final void a(gj.a forEachListener) {
            Intrinsics.f(forEachListener, "$this$forEachListener");
            forEachListener.a(this.f14241b.f(), this.f14241b.b());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((gj.a) obj);
            return Unit.f43263a;
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i6 f14242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CBError f14243c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i6 i6Var, CBError cBError) {
            super(1);
            this.f14242b = i6Var;
            this.f14243c = cBError;
        }

        public final void a(gj.a forEachListener) {
            Intrinsics.f(forEachListener, "$this$forEachListener");
            forEachListener.a(this.f14242b.f(), this.f14242b.b(), this.f14243c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((gj.a) obj);
            return Unit.f43263a;
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i6 f14244b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i6 i6Var) {
            super(1);
            this.f14244b = i6Var;
        }

        public final void a(gj.a forEachListener) {
            Intrinsics.f(forEachListener, "$this$forEachListener");
            forEachListener.a(this.f14244b.f(), this.f14244b.b(), 0L, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((gj.a) obj);
            return Unit.f43263a;
        }
    }

    public j7(i7 dependencies) {
        Intrinsics.f(dependencies, "dependencies");
        this.f14237a = dependencies;
        this.f = EmptyList.X;
        this.g = EmptyMap.X;
    }

    @Override // com.chartboost.sdk.impl.h7
    public void a(oi asset, h6 stopReason) {
        Intrinsics.f(asset, "asset");
        Intrinsics.f(stopReason, "stopReason");
        za.a("addDownload() - asset: " + asset + ", stopReason " + stopReason, (Throwable) null, 2, (Object) null);
        b(asset, stopReason);
    }

    @Override // com.chartboost.sdk.impl.h7
    public void b() {
        a(wh.a(d()));
    }

    @Override // com.chartboost.sdk.impl.h7
    public DataSource.Factory c() {
        DataSource.Factory factory = this.f14239c;
        if (factory != null) {
            return factory;
        }
        Intrinsics.m("cacheDataSourceFactory");
        throw null;
    }

    @Override // com.chartboost.sdk.impl.h7
    public float d(String id) {
        Intrinsics.f(id, "id");
        i6 i6VarB = b(id);
        return (i6VarB != null ? i6VarB.c() : 0.0f) / 100.0f;
    }

    public final void e(i6 i6Var) {
        try {
            DownloadService.sendRemoveDownload(this.f14237a.c(), VideoRepositoryDownloadService.class, i6Var.b(), false);
            z7 z7Var = this.f14240e;
            if (z7Var != null) {
                z7Var.d(i6Var);
            } else {
                Intrinsics.m("fakePrecacheFilesManager");
                throw null;
            }
        } catch (Exception e2) {
            za.b("Error sending remove download", e2);
        }
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc) throws IOException {
        Intrinsics.f(downloadManager, "downloadManager");
        Intrinsics.f(download, "download");
        int i2 = download.f18256b;
        za.a("onDownloadChanged() - state " + j6.a(i2) + ", finalException " + exc, (Throwable) null, 2, (Object) null);
        if (i2 == 0 || i2 == 1) {
            z7 z7Var = this.f14240e;
            if (z7Var != null) {
                z7Var.c(j6.a(download));
                return;
            } else {
                Intrinsics.m("fakePrecacheFilesManager");
                throw null;
            }
        }
        if (i2 == 2) {
            c(j6.a(download));
            return;
        }
        if (i2 == 3) {
            b(j6.a(download));
        } else if (i2 == 4) {
            a(j6.a(download), exc);
        } else {
            if (i2 != 5) {
                return;
            }
            d(j6.a(download));
        }
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* bridge */ /* synthetic */ void onDownloadRemoved(DownloadManager downloadManager, Download download) {
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* bridge */ /* synthetic */ void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z2) {
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* bridge */ /* synthetic */ void onIdle(DownloadManager downloadManager) {
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* bridge */ /* synthetic */ void onInitialized(DownloadManager downloadManager) {
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* bridge */ /* synthetic */ void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i2) {
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* bridge */ /* synthetic */ void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z2) {
    }

    public final void c(i6 i6Var) throws IOException {
        za.a("notifyTempFileIsReady() - download " + i6Var + ", listeners: " + this.f, (Throwable) null, 2, (Object) null);
        String strF = i6Var.f();
        StringBuilder sb = new StringBuilder("Start downloading ");
        sb.append(strF);
        nf.a(sb.toString());
        z7 z7Var = this.f14240e;
        if (z7Var == null) {
            Intrinsics.m("fakePrecacheFilesManager");
            throw null;
        }
        z7Var.e(i6Var);
        a(2, i6Var.f(), new c(i6Var));
    }

    @Override // com.chartboost.sdk.impl.h7
    public DownloadManager d() {
        j7 j7Var;
        if (this.f14238b == null) {
            DatabaseProvider databaseProvider = (DatabaseProvider) this.f14237a.d().invoke(this.f14237a.c());
            this.d = (m7) this.f14237a.g().invoke(this.f14237a.c());
            Function4 function4B = this.f14237a.b();
            m7 m7Var = this.d;
            if (m7Var != null) {
                Cache cache = (Cache) function4B.invoke(m7Var, this.f14237a.j(), databaseProvider, this);
                this.f14239c = (DataSource.Factory) this.f14237a.a().invoke(cache, this.f14237a.h());
                Function1 function1F = this.f14237a.f();
                m7 m7Var2 = this.d;
                if (m7Var2 != null) {
                    this.f14240e = (z7) function1F.invoke(m7Var2);
                    j7Var = this;
                    j7Var.f14238b = (DownloadManager) this.f14237a.e().invoke(this.f14237a.c(), databaseProvider, cache, this.f14237a.h(), j7Var);
                } else {
                    Intrinsics.m("fileCaching");
                    throw null;
                }
            } else {
                Intrinsics.m("fileCaching");
                throw null;
            }
        } else {
            j7Var = this;
        }
        DownloadManager downloadManager = j7Var.f14238b;
        if (downloadManager != null) {
            return downloadManager;
        }
        Intrinsics.m("downloadManager");
        throw null;
    }

    @Override // com.chartboost.sdk.impl.h7
    public void a(gj.a listener) {
        Intrinsics.f(listener, "listener");
        this.f = CollectionsKt.P(listener, this.f);
    }

    public final void b(oi oiVar) {
        this.g = MapsKt.k(oiVar.g(), this.g);
    }

    @Override // com.chartboost.sdk.impl.h7
    public i6 b(String id) {
        Intrinsics.f(id, "id");
        return wh.a(d(), id);
    }

    public /* synthetic */ j7(i7 i7Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new i7(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null) : i7Var);
    }

    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (a((i6) obj)) {
                arrayList.add(obj);
            }
        }
        b(arrayList);
        return list;
    }

    public final void b(i6 i6Var) {
        za.a("notifyDownloadCompleted() - download " + i6Var + ", listeners: " + this.f, (Throwable) null, 2, (Object) null);
        String strF = i6Var.f();
        StringBuilder sb = new StringBuilder("Video downloaded success ");
        sb.append(strF);
        nf.a(sb.toString());
        a(3, i6Var.f(), new a(i6Var));
    }

    @Override // com.chartboost.sdk.impl.t3.b
    public void c(String url) {
        Object next;
        Intrinsics.f(url, "url");
        Iterator it = wh.a(d()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.a(((i6) next).f(), url));
        i6 i6Var = (i6) next;
        if (i6Var != null) {
            e(i6Var);
        }
    }

    public final void c(oi oiVar) {
        for (i6 i6Var : wh.a(d())) {
            if (!Intrinsics.a(i6Var.b(), oiVar.d())) {
                a(i6Var, h6.FORCED_OUT);
            }
        }
    }

    public final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((i6) it.next());
        }
    }

    public final void a(int i2, String str, Function1 function1) {
        for (gj.a aVar : this.f) {
            Integer num = (Integer) this.g.get(str);
            if (num == null || num.intValue() != i2) {
                this.g = MapsKt.o(this.g, new Pair(str, Integer.valueOf(i2)));
                function1.invoke(aVar);
            }
        }
    }

    public final void b(oi oiVar, h6 h6Var) {
        za.a("VideoAsset.addDownload() - videoAsset " + oiVar + ", stopReason " + h6Var, (Throwable) null, 2, (Object) null);
        if (StringsKt.w(oiVar.g())) {
            return;
        }
        try {
            DownloadService.sendAddDownload(this.f14237a.c(), VideoRepositoryDownloadService.class, new DownloadRequest.Builder(oiVar.d(), Uri.parse(oiVar.g())).a(), h6Var.b(), false);
        } catch (Exception e2) {
            za.b("Error sending add download", e2);
        }
    }

    @Override // com.chartboost.sdk.impl.h7
    public synchronized void a() {
        za.a("initialize()", (Throwable) null, 2, (Object) null);
        this.f14237a.i().invoke();
        d();
    }

    @Override // com.chartboost.sdk.impl.h7
    public boolean a(String id) {
        Intrinsics.f(id, "id");
        i6 i6VarB = b(id);
        if (i6VarB != null) {
            return i6VarB.d() == 3 || i6VarB.d() == 2;
        }
        return false;
    }

    public final void d(i6 i6Var) {
        za.a("downloadRemoved() - download " + i6Var + ", listeners: " + this.f, (Throwable) null, 2, (Object) null);
        z7 z7Var = this.f14240e;
        if (z7Var != null) {
            z7Var.d(i6Var);
            this.g = MapsKt.k(i6Var.f(), this.g);
            return;
        }
        Intrinsics.m("fakePrecacheFilesManager");
        throw null;
    }

    public final boolean a(i6 i6Var) {
        return this.f14237a.j().a(i6Var.e());
    }

    public final void a(i6 i6Var, Exception exc) {
        CBError cBErrorA = a(exc);
        nf.a("Video downloaded failed " + i6Var.f() + " with error " + cBErrorA.getErrorDesc());
        a(4, i6Var.f(), new b(i6Var, cBErrorA));
    }

    public static /* synthetic */ void a(j7 j7Var, oi oiVar, h6 h6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            h6Var = h6.NONE;
        }
        j7Var.b(oiVar, h6Var);
    }

    public final void a(i6 i6Var, h6 h6Var) {
        za.a("Download.sendStopReason() - download " + i6Var + ", stopReason " + h6Var, (Throwable) null, 2, (Object) null);
        try {
            DownloadService.sendSetStopReason(this.f14237a.c(), VideoRepositoryDownloadService.class, i6Var.b(), h6Var.b(), false);
        } catch (Exception e2) {
            za.b("Error sending stop reason", e2);
        }
    }

    @Override // com.chartboost.sdk.impl.h7
    public void a(oi asset) {
        Intrinsics.f(asset, "asset");
        za.a("startDownload() - asset: " + asset, (Throwable) null, 2, (Object) null);
        b(asset);
        c(asset);
        a(this, asset, null, 1, null);
    }

    @Override // com.chartboost.sdk.impl.h7
    public void a(h6 currentDownloadStopReason) {
        i6 i6VarA;
        Intrinsics.f(currentDownloadStopReason, "currentDownloadStopReason");
        List list = d().m;
        Intrinsics.e(list, "getCurrentDownloads(...)");
        Download download = (Download) CollectionsKt.y(list);
        if (download == null || (i6VarA = j6.a(download)) == null) {
            return;
        }
        a(i6VarA, currentDownloadStopReason);
    }

    public final CBError a(Exception exc) {
        if (exc instanceof IOException) {
            return new CBError(CBError.Internal.NETWORK_FAILURE, c7.a(exc));
        }
        return new CBError(CBError.Internal.MISCELLANEOUS, c7.a(exc));
    }
}
