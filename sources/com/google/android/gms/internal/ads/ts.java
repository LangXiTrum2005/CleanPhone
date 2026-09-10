package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ts implements i6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f20474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f20475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f20476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f20477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f20478e;

    public /* synthetic */ ts(ea.e4 e4Var) {
        this.f20478e = e4Var;
    }

    public synchronized c6.d a() {
        try {
            if (((c6.d) this.f20478e) == null) {
                this.f20478e = c6.d.n((File) this.f20476c, this.f20474a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (c6.d) this.f20478e;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5 A[RETURN] */
    public boolean b(long j10, com.google.android.gms.internal.measurement.v9 v9Var) {
        com.google.android.gms.internal.measurement.da daVar;
        if (((ArrayList) this.f20477d) == null) {
            this.f20477d = new ArrayList();
        }
        if (((ArrayList) this.f20476c) == null) {
            this.f20476c = new ArrayList();
        }
        if (((ArrayList) this.f20477d).isEmpty() || ((((com.google.android.gms.internal.measurement.v9) ((ArrayList) this.f20477d).get(0)).B() / 1000) / 60) / 60 == ((v9Var.B() / 1000) / 60) / 60) {
            long jN = this.f20474a + ((long) v9Var.n());
            ea.e4 e4Var = (ea.e4) this.f20478e;
            if (!e4Var.e0().R0(null, ea.d0.Y0)) {
                e4Var.e0();
                if (jN < Math.max(0, ((Integer) ea.d0.f39312j.a(null)).intValue())) {
                    this.f20474a = jN;
                    ((ArrayList) this.f20477d).add(v9Var);
                    ((ArrayList) this.f20476c).add(Long.valueOf(j10));
                    daVar = (com.google.android.gms.internal.measurement.da) this.f20475b;
                    if (((ArrayList) this.f20477d).size() < Math.max(1, e4Var.e0().P0(daVar != null ? daVar.u() : null, ea.d0.f39315k))) {
                        return true;
                    }
                }
            } else if (((ArrayList) this.f20477d).isEmpty()) {
                this.f20474a = jN;
                ((ArrayList) this.f20477d).add(v9Var);
                ((ArrayList) this.f20476c).add(Long.valueOf(j10));
                daVar = (com.google.android.gms.internal.measurement.da) this.f20475b;
                if (((ArrayList) this.f20477d).size() < Math.max(1, e4Var.e0().P0(daVar != null ? daVar.u() : null, ea.d0.f39315k))) {
                    return true;
                }
            } else {
                e4Var.e0();
                if (jN < Math.max(0, ((Integer) ea.d0.f39312j.a(null)).intValue())) {
                    this.f20474a = jN;
                    ((ArrayList) this.f20477d).add(v9Var);
                    ((ArrayList) this.f20476c).add(Long.valueOf(j10));
                    daVar = (com.google.android.gms.internal.measurement.da) this.f20475b;
                    if (((ArrayList) this.f20477d).size() < Math.max(1, e4Var.e0().P0(daVar != null ? daVar.u() : null, ea.d0.f39315k))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void c() {
        ea.a1 a1Var = (ea.a1) this.f20478e;
        a1Var.G0();
        ((ea.m1) a1Var.f3623a).f39592k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = a1Var.K0().edit();
        editorEdit.remove((String) this.f20476c);
        editorEdit.remove((String) this.f20477d);
        editorEdit.putLong((String) this.f20475b, jCurrentTimeMillis);
        editorEdit.apply();
    }

    @Override // i6.a
    public synchronized void clear() {
        try {
            try {
                c6.d dVarA = a();
                dVarA.close();
                c6.g.a(dVarA.f5934a);
                synchronized (this) {
                    this.f20478e = null;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e10);
                }
                synchronized (this) {
                    this.f20478e = null;
                }
            }
        } catch (Throwable th2) {
            synchronized (this) {
                this.f20478e = null;
                throw th2;
            }
        }
    }

    @Override // i6.a
    public File j(e6.f fVar) {
        String strU0 = ((eb.d0) this.f20475b).U0(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strU0 + " for for Key: " + fVar);
        }
        try {
            s4.i iVarJ = a().j(strU0);
            if (iVarJ != null) {
                return ((File[]) iVarJ.f50111a)[0];
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    @Override // i6.a
    public void l(e6.f fVar, v9.e eVar) {
        i6.b bVar;
        String strU0 = ((eb.d0) this.f20475b).U0(fVar);
        ea.f2 f2Var = (ea.f2) this.f20477d;
        synchronized (f2Var) {
            bVar = (i6.b) ((HashMap) f2Var.f39409b).get(strU0);
            if (bVar == null) {
                i6.c cVar = (i6.c) f2Var.f39410c;
                synchronized (cVar.f42895a) {
                    bVar = (i6.b) cVar.f42895a.poll();
                }
                if (bVar == null) {
                    bVar = new i6.b();
                }
                ((HashMap) f2Var.f39409b).put(strU0, bVar);
            }
            bVar.f42894b++;
        }
        bVar.f42893a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strU0 + " for for Key: " + fVar);
            }
            try {
                c6.d dVarA = a();
                if (dVarA.j(strU0) == null) {
                    bc.s sVarD = dVarA.d(strU0);
                    if (sVarD == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strU0));
                    }
                    try {
                        if (((e6.b) eVar.f52503b).d(eVar.f52504c, sVarD.b(), (e6.i) eVar.f52505d)) {
                            c6.d.a((c6.d) sVarD.f5583d, sVarD, true);
                            sVarD.f5580a = true;
                        }
                        if (!sVarD.f5580a) {
                            try {
                                sVarD.a();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th2) {
                        if (!sVarD.f5580a) {
                            try {
                                sVarD.a();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
            ((ea.f2) this.f20477d).A(strU0);
        } catch (Throwable th3) {
            ((ea.f2) this.f20477d).A(strU0);
            throw th3;
        }
    }
}
