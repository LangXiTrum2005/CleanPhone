package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o01 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f18066h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p01 f18068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qz0 f18069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pz0 f18070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m01 f18072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f18073g = new Object();

    public o01(Context context, p01 p01Var, qz0 qz0Var, pz0 pz0Var, boolean z10) {
        this.f18067a = context;
        this.f18068b = p01Var;
        this.f18069c = qz0Var;
        this.f18070d = pz0Var;
        this.f18071e = z10;
    }

    public final boolean a(i01 i01Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                m01 m01Var = new m01(c(i01Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f18067a, "msa-r", i01Var.a(), null, new Bundle(), 2), i01Var, this.f18068b, this.f18069c, this.f18071e);
                if (!m01Var.j()) {
                    throw new n01(4000, "init failed");
                }
                int iL = m01Var.l();
                if (iL != 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iL).length() + 4);
                    sb2.append("ci: ");
                    sb2.append(iL);
                    throw new n01(4001, sb2.toString());
                }
                synchronized (this.f18073g) {
                    m01 m01Var2 = this.f18072f;
                    if (m01Var2 != null) {
                        try {
                            m01Var2.k();
                        } catch (n01 e10) {
                            this.f18069c.c(e10.f17605a, -1L, e10);
                        }
                        this.f18072f = m01Var;
                    } else {
                        this.f18072f = m01Var;
                    }
                    throw th;
                }
                this.f18069c.b(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e11) {
                throw new n01(2004, e11);
            }
        } catch (n01 e12) {
            this.f18069c.c(e12.f17605a, System.currentTimeMillis() - jCurrentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.f18069c.c(4010, System.currentTimeMillis() - jCurrentTimeMillis, e13);
            return false;
        }
    }

    public final m01 b() {
        m01 m01Var;
        synchronized (this.f18073g) {
            m01Var = this.f18072f;
        }
        return m01Var;
    }

    public final synchronized Class c(i01 i01Var) {
        try {
            nh nhVar = i01Var.f15463a;
            if (nhVar == null) {
                throw new n01(4010, "mc");
            }
            String strZ = nhVar.z();
            HashMap map = f18066h;
            Class cls = (Class) map.get(strZ);
            if (cls != null) {
                return cls;
            }
            try {
                pz0 pz0Var = this.f18070d;
                File file = i01Var.f15464b;
                pz0Var.getClass();
                if (!pz0.a(file)) {
                    throw new n01(2026, "VM did not pass signature verification");
                }
                try {
                    File file2 = i01Var.f15465c;
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(i01Var.f15464b.getAbsolutePath(), file2.getAbsolutePath(), null, this.f18067a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZ, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e10) {
                    throw new n01(2008, e10);
                }
            } catch (GeneralSecurityException e11) {
                throw new n01(2026, e11);
            }
            throw th;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
