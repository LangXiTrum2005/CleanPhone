package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.internal.Model.CBError;
import com.startapp.sdk.internal.C;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class fj implements gj.a, dj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f13958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final si f13959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f13960c;
    public final a8 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lg f13961e;
    public final ScheduledExecutorService f;
    public final Queue g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentLinkedQueue f13962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f13963i;
    public final ConcurrentHashMap j;
    public AtomicInteger k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Runnable f13964l;

    public enum a {
        CAN_NOT_DOWNLOAD,
        CREATE_ASSET_AND_DOWNLOAD,
        BRING_TO_FRONT_QUEUE_AND_DOWNLOAD;

        public static final /* synthetic */ EnumEntries f = EnumEntriesKt.a(a());
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13968a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.CAN_NOT_DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.CREATE_ASSET_AND_DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.BRING_TO_FRONT_QUEUE_AND_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13968a = iArr;
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.a(Long.valueOf(((oi) obj).a()), Long.valueOf(((oi) obj2).a()));
        }
    }

    public fj(z2 networkRequestService, si policy, a3 a3Var, a8 a8Var, lg tempHelper, ScheduledExecutorService backgroundExecutor) {
        Intrinsics.f(networkRequestService, "networkRequestService");
        Intrinsics.f(policy, "policy");
        Intrinsics.f(tempHelper, "tempHelper");
        Intrinsics.f(backgroundExecutor, "backgroundExecutor");
        this.f13958a = networkRequestService;
        this.f13959b = policy;
        this.f13960c = a3Var;
        this.d = a8Var;
        this.f13961e = tempHelper;
        this.f = backgroundExecutor;
        this.g = new ConcurrentLinkedQueue();
        this.f13962h = new ConcurrentLinkedQueue();
        this.f13963i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new AtomicInteger(1);
        this.f13964l = new C(this, 19);
    }

    public final a a(String str, String str2, boolean z2, p0 p0Var, boolean z3, File file) {
        p0 p0Var2;
        String str3;
        String str4;
        String str5;
        fj fjVar;
        if (z2) {
            if (z3) {
                if (this.f13963i.containsKey(str)) {
                    za.a("Already downloading for show operation: " + str2, (Throwable) null, 2, (Object) null);
                    nf.a("Already downloading for show operation: " + str2);
                    a(str, str2, file != null ? file.length() : 0L, p0Var);
                    return a.CAN_NOT_DOWNLOAD;
                }
                str5 = str;
                p0Var2 = p0Var;
                str3 = "Register callback for show operation: ";
                str4 = str2;
                if (p0Var2 != null) {
                    za.a(str3 + str4, (Throwable) null, 2, (Object) null);
                    nf.a(str3 + str4);
                    a(str5, str4, file != null ? file.length() : 0L, p0Var2);
                    return a.CAN_NOT_DOWNLOAD;
                }
                fjVar = this;
            } else {
                p0Var2 = p0Var;
                str3 = "Register callback for show operation: ";
                str4 = str2;
                str5 = str;
                fjVar = this;
                za.a("Not downloading for show operation: " + str4, (Throwable) null, 2, (Object) null);
                if (p0Var2 != null) {
                    oi oiVar = (oi) fjVar.j.get(str4);
                    if (Intrinsics.a(oiVar != null ? oiVar.d() : null, str4) || fjVar.f13963i.containsKey(str5)) {
                        fjVar.f13963i.put(str5, p0Var2);
                        return a.BRING_TO_FRONT_QUEUE_AND_DOWNLOAD;
                    }
                }
            }
            if (p0Var2 != null) {
                za.a(str3 + str4, (Throwable) null, 2, (Object) null);
                nf.a(str3 + str4);
                fjVar.f13963i.put(str5, p0Var2);
            }
        } else if (b(str, str2) || z3) {
            za.a("Already queued or downloading for cache operation: " + str2, (Throwable) null, 2, (Object) null);
            nf.a("Already queued or downloading for cache operation: " + str2);
            return a.CAN_NOT_DOWNLOAD;
        }
        return a.CREATE_ASSET_AND_DOWNLOAD;
    }

    @Override // com.chartboost.sdk.impl.dj
    public oi b(String filename) {
        Intrinsics.f(filename, "filename");
        return (oi) this.j.get(filename);
    }

    public final boolean c() {
        a3 a3Var = this.f13960c;
        return a3Var != null && a3Var.e() && !this.f13959b.g() && this.f13962h.isEmpty();
    }

    public final File d(oi oiVar) {
        return this.f13961e.a(oiVar.b(), oiVar.d());
    }

    public final boolean e(oi oiVar) {
        a8 a8Var;
        if (oiVar == null || oiVar.e() == null || (a8Var = this.d) == null) {
            return false;
        }
        return a8Var.c(oiVar.e());
    }

    public final boolean f(oi oiVar) {
        return this.f13961e.b(oiVar.b(), oiVar.d());
    }

    public boolean g(oi oiVar) {
        if (oiVar == null || !e(oiVar)) {
            return false;
        }
        File fileE = oiVar.e();
        String strD = oiVar.d();
        a8 a8Var = this.d;
        if (a8Var == null || !a8Var.a(fileE)) {
            return false;
        }
        this.j.remove(strD);
        return true;
    }

    public final void h(oi oiVar) {
        za.a("startDownloadNow: " + oiVar.g(), (Throwable) null, 2, (Object) null);
        if (a(oiVar.d())) {
            nf.a("File already downloaded or downloading: " + oiVar.d());
            String strG = oiVar.g();
            p0 p0Var = (p0) this.f13963i.remove(strG);
            if (p0Var != null) {
                p0Var.a(strG);
                return;
            }
            return;
        }
        nf.a("Start downloading " + oiVar.g());
        this.f13959b.a();
        this.f13962h.add(oiVar.g());
        a3 a3Var = this.f13960c;
        File fileE = oiVar.e();
        Intrinsics.c(fileE);
        this.f13958a.a(new gj(a3Var, fileE, oiVar.g(), this, ae.NORMAL, this.f13958a.a()));
    }

    public final oi d(String str) {
        Object objPoll;
        if (str == null) {
            objPoll = this.g.poll();
        } else {
            oi oiVar = null;
            for (oi oiVar2 : this.g) {
                if (Intrinsics.a(oiVar2.d(), str)) {
                    oiVar = oiVar2;
                }
            }
            objPoll = oiVar;
        }
        oi oiVar3 = (oi) objPoll;
        if (oiVar3 != null) {
            c(oiVar3);
        }
        return oiVar3;
    }

    public final boolean b(String str, String str2) {
        if (this.g.size() <= 0) {
            return false;
        }
        for (oi oiVar : this.g) {
            if (Intrinsics.a(oiVar.g(), str) && Intrinsics.a(oiVar.d(), str2)) {
                return true;
            }
        }
        return false;
    }

    public final void c(oi oiVar) {
        if (nf.f14544a.d()) {
            File file = new File(oiVar.f());
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public final boolean b() {
        a8 a8Var = this.d;
        if (a8Var == null) {
            return false;
        }
        return this.f13959b.b(a8Var.b(a8Var.b()));
    }

    public final void c(String str) {
        for (oi oiVar : new LinkedList(this.g)) {
            if (oiVar != null && Intrinsics.a(oiVar.g(), str)) {
                this.g.remove(oiVar);
            }
        }
    }

    public final void b(oi oiVar) {
        if (nf.f14544a.d()) {
            File file = new File(oiVar.f());
            try {
                file.createNewFile();
                file.setLastModified(gg.a());
            } catch (IOException e2) {
                za.b("Error while creating queue empty file: " + e2, (Throwable) null, 2, (Object) null);
            }
        }
    }

    public final void a() {
        if (b()) {
            Collection collectionValues = this.j.values();
            Intrinsics.e(collectionValues, "<get-values>(...)");
            Iterator it = CollectionsKt.c0(new c(), collectionValues).iterator();
            while (it.hasNext()) {
                g((oi) it.next());
                if (!b()) {
                    return;
                }
            }
        }
    }

    public final void a(String str, String str2, File file, File file2) {
        File fileD;
        a8 a8Var = this.d;
        oi oiVar = new oi(str, str2, file, file2, 0L, android.support.v4.media.a.D((a8Var == null || (fileD = a8Var.d()) == null) ? null : fileD.getAbsolutePath(), File.separator, str2), 0L, 80, null);
        file.setLastModified(oiVar.a());
        b(oiVar);
        this.j.putIfAbsent(str2, oiVar);
        this.g.offer(oiVar);
    }

    public static final void a(fj this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.a((String) null, this$0.k.incrementAndGet(), false);
    }

    @Override // com.chartboost.sdk.impl.dj
    public synchronized void a(String url, String filename, boolean z2, p0 p0Var) throws Throwable {
        Throwable th;
        File fileB;
        try {
            Intrinsics.f(url, "url");
            Intrinsics.f(filename, "filename");
            za.a("downloadVideoFile: ".concat(url), (Throwable) null, 2, (Object) null);
            a8 a8Var = this.d;
            if (a8Var != null) {
                try {
                    fileB = a8Var.b();
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } else {
                fileB = null;
            }
            a8 a8Var2 = this.d;
            try {
                int i2 = b.f13968a[a(url, filename, z2, p0Var, a(filename), a8Var2 != null ? a8Var2.a(fileB, filename) : null).ordinal()];
                if (i2 == 2) {
                    a(url, filename, new File(fileB, filename), fileB);
                    a(z2 ? filename : null, this.k.get(), z2);
                } else if (i2 == 3) {
                    dj.a.a(this, filename, 0, true, 2, null);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.chartboost.sdk.impl.dj
    public int a(oi oiVar) {
        if (oiVar == null) {
            return 0;
        }
        if (e(oiVar)) {
            return 5;
        }
        File fileD = d(oiVar);
        long length = fileD != null ? fileD.length() : 0L;
        if (oiVar.c() == 0) {
            return 0;
        }
        return df.a(length / oiVar.c());
    }

    @Override // com.chartboost.sdk.impl.dj
    public void a(Context context) {
        File[] fileArrC;
        Intrinsics.f(context, "context");
        a8 a8Var = this.d;
        if (a8Var == null || (fileArrC = a8Var.c()) == null) {
            return;
        }
        int length = fileArrC.length;
        boolean z2 = false;
        int i2 = 0;
        while (i2 < length) {
            File file = fileArrC[i2];
            if (file.exists()) {
                String name = file.getName();
                Intrinsics.e(name, "getName(...)");
                if (StringsKt.l(name, ".tmp", z2)) {
                    a8Var.a(file);
                    return;
                }
            }
            if (this.f13959b.a(file)) {
                a8Var.a(file);
            } else {
                String name2 = file.getName();
                Intrinsics.e(name2, "getName(...)");
                oi oiVar = new oi("", name2, file, a8Var.b(), file.lastModified(), null, file.length(), 32, null);
                ConcurrentHashMap concurrentHashMap = this.j;
                String name3 = file.getName();
                Intrinsics.e(name3, "getName(...)");
                concurrentHashMap.put(name3, oiVar);
            }
            i2++;
            z2 = false;
        }
    }

    @Override // com.chartboost.sdk.impl.dj
    public boolean a(String videoFilename) {
        Intrinsics.f(videoFilename, "videoFilename");
        oi oiVarB = b(videoFilename);
        return (oiVarB != null && f(oiVarB)) || (oiVarB != null && e(oiVarB));
    }

    @Override // com.chartboost.sdk.impl.gj.a
    public void a(String uri, String videoFileName, CBError cBError) {
        String errorDesc;
        Unit unit;
        File fileE;
        Intrinsics.f(uri, "uri");
        Intrinsics.f(videoFileName, "videoFileName");
        za.a("onError: ".concat(uri), (Throwable) null, 2, (Object) null);
        if (cBError == null || (errorDesc = cBError.getErrorDesc()) == null) {
            errorDesc = "Unknown error";
        }
        oi oiVarB = b(videoFileName);
        if (oiVarB != null && (fileE = oiVarB.e()) != null) {
            fileE.delete();
        }
        if (cBError == null || cBError.getType() != CBError.Internal.INTERNET_UNAVAILABLE) {
            c(uri);
            p0 p0Var = (p0) this.f13963i.get(uri);
            if (p0Var != null) {
                p0Var.a(uri);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.b("Missing callback on error", (Throwable) null, 2, (Object) null);
            }
        } else if (oiVarB != null) {
            this.g.add(oiVarB);
            b(oiVarB);
        }
        this.f13963i.remove(uri);
        this.j.remove(videoFileName);
        a((String) null, this.k.get(), false);
        za.b(android.support.v4.media.a.s(new StringBuilder("Video download failed: "), uri, " with error ", errorDesc), (Throwable) null, 2, (Object) null);
        nf.a("Video downloaded failed " + uri + " with error " + errorDesc);
        this.f13962h.remove(uri);
    }

    @Override // com.chartboost.sdk.impl.gj.a
    public void a(String uri, String videoFileName) {
        Intrinsics.f(uri, "uri");
        Intrinsics.f(videoFileName, "videoFileName");
        za.a("onSuccess: ".concat(uri), (Throwable) null, 2, (Object) null);
        nf.a("Video downloaded success ".concat(uri));
        a();
        this.f13962h.remove(uri);
        this.f13963i.remove(uri);
        this.k = new AtomicInteger(1);
        c(uri);
        a((String) null, this.k.get(), false);
    }

    @Override // com.chartboost.sdk.impl.dj
    public void a(String str, int i2, boolean z2) {
        za.a("startDownloadIfPossible: " + str, (Throwable) null, 2, (Object) null);
        if (this.g.size() > 0) {
            if (!z2 && !c()) {
                nf.a("Can't cache next video at the moment");
                this.f.schedule(this.f13964l, ((long) i2) * 5000, TimeUnit.MILLISECONDS);
                return;
            }
            oi oiVarD = d(str);
            if (oiVarD != null) {
                h(oiVarD);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.gj.a
    public void a(String url, String videoFileName, long j, p0 p0Var) {
        Intrinsics.f(url, "url");
        Intrinsics.f(videoFileName, "videoFileName");
        za.a("tempFileIsReady: ".concat(videoFileName), (Throwable) null, 2, (Object) null);
        oi oiVarB = b(videoFileName);
        if (j > 0 && oiVarB != null) {
            oiVarB.a(j);
        }
        if (oiVarB != null) {
            this.j.remove(videoFileName);
        }
        if (p0Var == null) {
            p0Var = (p0) this.f13963i.get(url);
        }
        if (p0Var != null) {
            p0Var.a(url);
        }
    }
}
