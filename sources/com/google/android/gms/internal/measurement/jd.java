package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.ads.zs;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jd implements na.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i9.i f23624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f23625c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q6 f23626d;

    public jd(String str, i9.i iVar) {
        this.f23623a = str;
        this.f23624b = iVar;
    }

    public abstract Object a();

    public abstract Object b(String str);

    public abstract Object c(Object obj);

    public abstract Object d();

    public abstract void e(Object obj);

    /* JADX WARN: Code duplicated, block: B:102:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x010e A[Catch: all -> 0x00a9, TryCatch #3 {all -> 0x00a9, blocks: (B:30:0x0094, B:32:0x0098, B:36:0x00ad, B:38:0x00b9, B:40:0x00cb, B:42:0x00d9, B:50:0x00fa, B:55:0x010e, B:56:0x0114, B:58:0x0125, B:60:0x012d, B:61:0x0146, B:64:0x0159, B:68:0x016a, B:73:0x0174, B:75:0x017a, B:76:0x017f, B:67:0x015f, B:53:0x0100, B:46:0x00ee, B:43:0x00e6, B:78:0x0181), top: B:99:0x0094, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0125 A[Catch: all -> 0x00a9, TryCatch #3 {all -> 0x00a9, blocks: (B:30:0x0094, B:32:0x0098, B:36:0x00ad, B:38:0x00b9, B:40:0x00cb, B:42:0x00d9, B:50:0x00fa, B:55:0x010e, B:56:0x0114, B:58:0x0125, B:60:0x012d, B:61:0x0146, B:64:0x0159, B:68:0x016a, B:73:0x0174, B:75:0x017a, B:76:0x017f, B:67:0x015f, B:53:0x0100, B:46:0x00ee, B:43:0x00e6, B:78:0x0181), top: B:99:0x0094, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0170  */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:73:0x0174 A[Catch: all -> 0x00a9, TryCatch #3 {all -> 0x00a9, blocks: (B:30:0x0094, B:32:0x0098, B:36:0x00ad, B:38:0x00b9, B:40:0x00cb, B:42:0x00d9, B:50:0x00fa, B:55:0x010e, B:56:0x0114, B:58:0x0125, B:60:0x012d, B:61:0x0146, B:64:0x0159, B:68:0x016a, B:73:0x0174, B:75:0x017a, B:76:0x017f, B:67:0x015f, B:53:0x0100, B:46:0x00ee, B:43:0x00e6, B:78:0x0181), top: B:99:0x0094, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x017a A[Catch: all -> 0x00a9, TryCatch #3 {all -> 0x00a9, blocks: (B:30:0x0094, B:32:0x0098, B:36:0x00ad, B:38:0x00b9, B:40:0x00cb, B:42:0x00d9, B:50:0x00fa, B:55:0x010e, B:56:0x0114, B:58:0x0125, B:60:0x012d, B:61:0x0146, B:64:0x0159, B:68:0x016a, B:73:0x0174, B:75:0x017a, B:76:0x017f, B:67:0x015f, B:53:0x0100, B:46:0x00ee, B:43:0x00e6, B:78:0x0181), top: B:99:0x0094, inners: #0, #5 }] */
    @Override // na.r
    public final Object get() {
        ud udVarD;
        Object objA;
        String str;
        int i10;
        Object obj;
        x.i iVar;
        pb pbVar;
        if (gb.f23511e == null) {
            Object obj2 = pb.f23842j;
            gb.f23511e = new zs(4);
        }
        Context context = (Context) pb.f23843k.get();
        if (context == null) {
            synchronized (gb.f23509c) {
            }
            throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
        pb pbVar2 = pb.l;
        Object objC = null;
        if (pbVar2 == null) {
            Context context2 = context.getApplicationContext();
            try {
                kotlin.jvm.internal.n.f(context2, "context");
                Context applicationContext = context2.getApplicationContext();
                kotlin.jvm.internal.n.e(applicationContext, "getApplicationContext(...)");
                Class<?> cls = applicationContext.getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            } catch (IllegalStateException unused) {
                synchronized (pb.f23842j) {
                    try {
                        if (pb.l != null) {
                            pbVar = pb.l;
                        } else {
                            pbVar = (pb) new qb(context2, 0).get();
                            pb.l = pbVar;
                            gb.g(Level.CONFIG, pbVar.a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        pbVar2 = pbVar;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        int i11 = this.f23625c;
        if (i11 == -1 || i11 < ((AtomicInteger) this.f23626d.f23891b).get()) {
            synchronized (this) {
                try {
                    int i12 = this.f23625c;
                    if (i12 == -1) {
                        pb.b();
                        pbVar2.getClass();
                        udVarD = this.f23624b.d(pbVar2);
                        this.f23626d = udVarD.f24045g;
                    } else {
                        udVarD = null;
                    }
                    int i13 = ((AtomicInteger) this.f23626d.f23891b).get();
                    if (i12 < i13) {
                        pb.b();
                        pbVar2.getClass();
                        na.h hVarD = mb.d(pbVar2.f23846b);
                        if (hVarD.g()) {
                            lb lbVar = (lb) hVarD.d();
                            Uri uriA = nb.a();
                            String str2 = this.f23623a;
                            if (uriA != null) {
                                iVar = (x.i) lbVar.f23702a.get(uriA.toString());
                            } else {
                                lbVar.getClass();
                                iVar = null;
                            }
                            String str3 = iVar == null ? null : (String) iVar.get(str2);
                            if (str3 == null) {
                                objA = null;
                                if (udVarD == null) {
                                    udVarD = this.f23624b.d(pbVar2);
                                }
                                str = udVarD.f24041c;
                                i10 = 1;
                                if (!pbVar2.f23846b.getPackageName().equals("com.android.vending") && !str.startsWith("com.google.android.gms.measurement#")) {
                                    ListenableFuture listenableFutureA = ((ta.t0) pbVar2.a()).a(new wd(pbVar2, str));
                                    listenableFutureA.addListener(new ae(listenableFutureA, i10), ta.c0.f50592a);
                                }
                                obj = ((oa.s1) udVarD.a().f5779d).get(this.f23623a);
                                if (obj != null) {
                                    try {
                                        objC = c(obj);
                                    } catch (IOException | ClassCastException e10) {
                                        Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f23623a), e10);
                                    }
                                }
                                if (true != hVarD.g()) {
                                    objA = objC;
                                }
                                if (objA == null) {
                                    objA = a();
                                }
                                if (objA != null) {
                                    e(objA);
                                    this.f23625c = i13;
                                }
                            } else {
                                try {
                                    objA = b(str3);
                                } catch (IOException | IllegalArgumentException e11) {
                                    Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f23623a), e11);
                                    objA = null;
                                }
                                if (udVarD == null) {
                                    udVarD = this.f23624b.d(pbVar2);
                                }
                                str = udVarD.f24041c;
                                i10 = 1;
                                if (!pbVar2.f23846b.getPackageName().equals("com.android.vending")) {
                                    ListenableFuture listenableFutureA2 = ((ta.t0) pbVar2.a()).a(new wd(pbVar2, str));
                                    listenableFutureA2.addListener(new ae(listenableFutureA2, i10), ta.c0.f50592a);
                                }
                                obj = ((oa.s1) udVarD.a().f5779d).get(this.f23623a);
                                if (obj != null) {
                                    objC = c(obj);
                                }
                                if (true != hVarD.g()) {
                                    objA = objC;
                                }
                                if (objA == null) {
                                    objA = a();
                                }
                                if (objA != null) {
                                    e(objA);
                                    this.f23625c = i13;
                                }
                            }
                        } else {
                            objA = null;
                            if (udVarD == null) {
                                udVarD = this.f23624b.d(pbVar2);
                            }
                            str = udVarD.f24041c;
                            i10 = 1;
                            if (!pbVar2.f23846b.getPackageName().equals("com.android.vending")) {
                                ListenableFuture listenableFutureA3 = ((ta.t0) pbVar2.a()).a(new wd(pbVar2, str));
                                listenableFutureA3.addListener(new ae(listenableFutureA3, i10), ta.c0.f50592a);
                            }
                            obj = ((oa.s1) udVarD.a().f5779d).get(this.f23623a);
                            if (obj != null) {
                                objC = c(obj);
                            }
                            if (true != hVarD.g()) {
                                objA = objC;
                            }
                            if (objA == null) {
                                objA = a();
                            }
                            if (objA != null) {
                                e(objA);
                                this.f23625c = i13;
                            }
                        }
                    } else {
                        objA = d();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } else {
            objA = d();
        }
        objA.getClass();
        return objA;
    }
}
