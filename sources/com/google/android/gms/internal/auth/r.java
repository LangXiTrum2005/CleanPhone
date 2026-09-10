package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f22894g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile j f22895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f22896i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bc.i f22897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f22900d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f22901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22902f;

    static {
        new AtomicReference();
        f22896i = new AtomicInteger();
    }

    public /* synthetic */ r(bc.i iVar, String str, Object obj, int i10) {
        this.f22902f = i10;
        if (((Uri) iVar.f5553c) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f22897a = iVar;
        this.f22898b = str;
        this.f22899c = obj;
    }

    public static void c(Context context) {
        Context context2;
        if (f22895h != null || context == null) {
            return;
        }
        Object obj = f22894g;
        synchronized (obj) {
            try {
                if (f22895h == null) {
                    synchronized (obj) {
                        try {
                            j jVar = f22895h;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (jVar == null || jVar.f22847a != context) {
                                l.b();
                                t.a();
                                synchronized (n.class) {
                                    try {
                                        n nVar = n.f22876c;
                                        if (nVar != null && (context2 = (Context) nVar.f22877a) != null && ((g) nVar.f22878b) != null) {
                                            context2.getContentResolver().unregisterContentObserver((g) n.f22876c.f22878b);
                                        }
                                        n.f22876c = null;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                f22895h = new j(context, d0.c.V(new x0(context, 2)));
                                f22896i.incrementAndGet();
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final Object a(String str) {
        switch (this.f22902f) {
            case 0:
                try {
                    return Long.valueOf(Long.parseLong(str));
                } catch (NumberFormatException unused) {
                    Log.e("PhenotypeFlag", "Invalid long value for " + this.f22898b + ": " + str);
                    return null;
                }
            case 1:
                if (h.f22828b.matcher(str).matches()) {
                    return Boolean.TRUE;
                }
                if (h.f22829c.matcher(str).matches()) {
                    return Boolean.FALSE;
                }
                Log.e("PhenotypeFlag", "Invalid boolean value for " + this.f22898b + ": " + str);
                return null;
            case 2:
                try {
                    return Double.valueOf(Double.parseDouble(str));
                } catch (NumberFormatException unused2) {
                    Log.e("PhenotypeFlag", "Invalid double value for " + this.f22898b + ": " + str);
                    return null;
                }
            default:
                try {
                    return a2.j(Base64.decode(str, 3));
                } catch (IOException | IllegalArgumentException unused3) {
                    Log.e("PhenotypeFlag", "Invalid byte[] value for " + this.f22898b + ": " + str);
                    return null;
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[PHI: r2
  0x0058: PHI (r2v1 com.google.android.gms.internal.auth.v) = 
  (r2v0 com.google.android.gms.internal.auth.v)
  (r2v5 com.google.android.gms.internal.auth.v)
  (r2v5 com.google.android.gms.internal.auth.v)
 binds: [B:8:0x0014, B:10:0x0022, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object b() {
        String str;
        l lVar;
        n nVar;
        Object objA;
        int i10 = f22896i.get();
        if (this.f22900d < i10) {
            synchronized (this) {
                try {
                    if (this.f22900d < i10) {
                        j jVar = f22895h;
                        v vVar = u.f22908a;
                        Object objA2 = null;
                        if (jVar != null) {
                            vVar = (v) jVar.f22848b.zza();
                            if (vVar.g()) {
                                m mVar = (m) vVar.d();
                                Uri uri = (Uri) this.f22897a.f5553c;
                                String str2 = this.f22898b;
                                mVar.getClass();
                                x.i iVar = uri != null ? (x.i) mVar.f22872a.get(uri.toString()) : null;
                                if (iVar == null) {
                                    str = null;
                                } else {
                                    str = (String) iVar.get("".concat(str2));
                                }
                            } else {
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                        if (jVar == null) {
                            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                        }
                        Uri uri2 = (Uri) this.f22897a.f5553c;
                        if (uri2 == null) {
                            x.e eVar = t.f22906a;
                            throw null;
                        }
                        if (p.a(jVar.f22847a, uri2)) {
                            ContentResolver contentResolver = jVar.f22847a.getContentResolver();
                            Uri uri3 = (Uri) this.f22897a.f5553c;
                            x.e eVar2 = l.f22861g;
                            synchronized (l.class) {
                                x.e eVar3 = l.f22861g;
                                lVar = (l) eVar3.get(uri3);
                                if (lVar == null) {
                                    try {
                                        l lVar2 = new l(contentResolver, uri3);
                                        try {
                                            eVar3.put(uri3, lVar2);
                                        } catch (SecurityException unused) {
                                        }
                                        lVar = lVar2;
                                    } catch (SecurityException unused2) {
                                    }
                                }
                            }
                        } else {
                            lVar = null;
                        }
                        Object objA3 = (lVar == null || (objA = lVar.a(this.f22898b)) == null) ? null : a((String) objA);
                        if (objA3 == null) {
                            if (!this.f22897a.f5552b) {
                                Context context = jVar.f22847a;
                                synchronized (n.class) {
                                    try {
                                        if (n.f22876c == null) {
                                            n.f22876c = qk.i0.i(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new n(context) : new n();
                                        }
                                        nVar = n.f22876c;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                String strB = nVar.b(this.f22897a.f5552b ? null : this.f22898b);
                                if (strB != null) {
                                    objA2 = a(strB);
                                }
                            }
                            objA3 = objA2 == null ? this.f22899c : objA2;
                        }
                        if (vVar.g()) {
                            objA3 = str == null ? this.f22899c : a(str);
                        }
                        this.f22901e = objA3;
                        this.f22900d = i10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.f22901e;
    }
}
