package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.thinkup.core.common.n.mo;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f14326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f14327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f14328c;
    public final AtomicReference d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ng f14329e;
    public final a8 f;
    public int g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v1 f14330h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PriorityQueue f14331i = new PriorityQueue();
    public final y6 j;

    public k6(Executor executor, a8 a8Var, z2 z2Var, a3 a3Var, AtomicReference atomicReference, ng ngVar, y6 y6Var) {
        this.f14326a = executor;
        this.f = a8Var;
        this.f14327b = z2Var;
        this.f14328c = a3Var;
        this.d = atomicReference;
        this.f14329e = ngVar;
        this.j = y6Var;
    }

    public synchronized void a(AtomicInteger atomicInteger) {
        atomicInteger.set(-10000);
        if (this.g == 2) {
            v1 v1Var = this.f14330h;
            if (v1Var.m.g == atomicInteger && v1Var.b()) {
                this.f14330h = null;
                d();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0147 A[PHI: r9
  0x0147: PHI (r9v6 long) = (r9v3 long), (r9v2 long) binds: [B:68:0x016d, B:62:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
    public synchronized void b() {
        Object obj;
        try {
            if (this.g != 1) {
                return;
            }
            try {
                za.a("########### Trimming the disk cache", null);
                File file = this.f.a().f13491a;
                ArrayList arrayList = new ArrayList();
                String[] list = file.list();
                if (list != null && list.length > 0) {
                    for (String str : list) {
                        if (!str.equalsIgnoreCase("requests") && !str.equalsIgnoreCase("track") && !str.equalsIgnoreCase("session") && !str.equalsIgnoreCase("videoCompletionEvents") && !str.equalsIgnoreCase("precache") && !str.contains(mo.ono)) {
                            arrayList.addAll(g3.a(new File(file, str), true));
                        }
                    }
                }
                int size = arrayList.size();
                File[] fileArr = new File[size];
                arrayList.toArray(fileArr);
                if (size > 1) {
                    Arrays.sort(fileArr, new androidx.core.provider.a(2));
                }
                if (size > 0) {
                    qf qfVar = (qf) this.d.get();
                    long j = qfVar.f14946n;
                    a8 a8Var = this.f;
                    long jB = a8Var.b(a8Var.a().g);
                    long jA = this.f14329e.a();
                    List list2 = qfVar.d;
                    za.a("Total local file count:" + size, null);
                    za.a("Video Folder Size in bytes :" + jB, null);
                    za.a("Max Bytes allowed:" + j, null);
                    int i2 = 0;
                    while (i2 < size) {
                        File file2 = fileArr[i2];
                        long j2 = j;
                        qf qfVar2 = qfVar;
                        boolean z2 = TimeUnit.MILLISECONDS.toDays(jA - file2.lastModified()) >= ((long) qfVar.f14947p);
                        boolean zEndsWith = file2.getName().endsWith(".tmp");
                        File parentFile = file2.getParentFile();
                        String absolutePath = parentFile != null ? parentFile.getAbsolutePath() : null;
                        boolean zContains = absolutePath != null ? absolutePath.contains("/videos") : false;
                        boolean z3 = jB > j2 && zContains;
                        if (file2.length() == 0 || zEndsWith || z2 || list2.contains(parentFile.getName()) || z3) {
                            if (zContains) {
                                jB -= file2.length();
                            }
                            za.a("Deleting file at path:" + file2.getPath(), null);
                            if (file2.delete()) {
                                obj = null;
                            } else {
                                obj = null;
                                za.b("Unable to delete " + file2.getPath(), null);
                            }
                        } else {
                            obj = null;
                        }
                        i2++;
                        qfVar = qfVar2;
                        j = j2;
                    }
                }
            } catch (Exception e2) {
                za.b("reduceCacheSize", e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void c() {
        try {
            int i2 = this.g;
            if (i2 == 3) {
                za.a("Change state to DOWNLOADING", null);
                this.g = 2;
            } else if (i2 == 4) {
                za.a("Change state to IDLE", null);
                this.g = 1;
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        u1 u1Var;
        u1 u1Var2;
        if (this.f14330h != null && (u1Var2 = (u1) this.f14331i.peek()) != null && this.f14330h.m.f15244b.b() > u1Var2.f15244b.b() && this.f14330h.b()) {
            this.f14331i.add(this.f14330h.m);
            this.f14330h = null;
        }
        while (this.f14330h == null && (u1Var = (u1) this.f14331i.poll()) != null) {
            if (u1Var.g.get() > 0) {
                File file = new File(this.f.a().f13491a, u1Var.f15246e);
                if (file.exists() || file.mkdirs() || file.isDirectory()) {
                    File file2 = new File(file, u1Var.f15245c);
                    if (file2.exists()) {
                        this.f.d(file2);
                        u1Var.a(this.f14326a, true);
                    } else {
                        v1 v1Var = new v1(this, this.f14328c, u1Var, file2, this.f14327b.a());
                        this.f14330h = v1Var;
                        this.f14327b.a(v1Var);
                    }
                } else {
                    za.b("Unable to create directory " + file.getPath(), null);
                    u1Var.a(this.f14326a, false);
                }
            }
        }
        if (this.f14330h != null) {
            if (this.g != 2) {
                za.a("Change state to DOWNLOADING", null);
                this.g = 2;
                return;
            }
            return;
        }
        if (this.g != 1) {
            za.a("Change state to IDLE", null);
            this.g = 1;
        }
    }

    public synchronized void a(ae aeVar, Map map, AtomicInteger atomicInteger, q1 q1Var, String str) {
        try {
            AtomicInteger atomicInteger2 = new AtomicInteger();
            AtomicReference atomicReference = new AtomicReference(q1Var);
            for (p1 p1Var : map.values()) {
                ae aeVar2 = aeVar;
                AtomicInteger atomicInteger3 = atomicInteger;
                String str2 = str;
                this.f14331i.add(new u1(aeVar2, p1Var.f14798b, p1Var.f14799c, p1Var.f14797a, atomicInteger3, atomicReference, atomicInteger2, str2));
                aeVar = aeVar2;
                atomicInteger = atomicInteger3;
                str = str2;
            }
            int i2 = this.g;
            if (i2 == 1 || i2 == 2) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(v1 v1Var, CBError cBError, y2 y2Var) {
        String str;
        try {
            int i2 = this.g;
            if (i2 == 2 || i2 == 3) {
                if (v1Var != this.f14330h) {
                    return;
                }
                this.f14330h = null;
                long millis = TimeUnit.NANOSECONDS.toMillis(v1Var.f);
                u1 u1Var = v1Var.m;
                u1Var.f15248i.addAndGet((int) millis);
                u1Var.a(this.f14326a, cBError == null);
                if (cBError == null) {
                    za.a("Downloaded " + u1Var.d, null);
                } else {
                    String str2 = v1Var.m.f;
                    String errorDesc = cBError.getErrorDesc();
                    StringBuilder sb = new StringBuilder("Failed to download ");
                    sb.append(u1Var.d);
                    if (y2Var != null) {
                        str = " Status code=" + y2Var.b();
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    sb.append(" Error message=");
                    sb.append(errorDesc);
                    za.a(sb.toString(), null);
                    this.j.mo189track(new u6(fh.a.ASSET_DOWNLOAD_ERROR, "Name: " + u1Var.f15245c + " Url: " + u1Var.d + " Error: " + errorDesc, str2, "", null));
                }
                if (this.g == 3) {
                    za.a("Change state to PAUSED", null);
                    this.g = 4;
                } else {
                    d();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a() {
        try {
            int i2 = this.g;
            if (i2 == 1) {
                za.a("Change state to PAUSED", null);
                this.g = 4;
            } else if (i2 == 2) {
                if (this.f14330h.b()) {
                    this.f14331i.add(this.f14330h.m);
                    this.f14330h = null;
                    za.a("Change state to PAUSED", null);
                    this.g = 4;
                } else {
                    za.a("Change state to PAUSING", null);
                    this.g = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
