package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import androidx.media3.common.PlaybackException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import saneness.madbrain;
import saneness.psalmodic;
import saneness.rotissomat;

/* JADX INFO: loaded from: classes.dex */
public final class u73 {
    public static final HashMap h = new HashMap();
    public final Context a;
    public final madbrain b;
    public final psalmodic c;
    public final q73 d;
    public final boolean e;
    public xb1 f;
    public final Object g = new Object();

    public u73(Context context, madbrain madbrainVar, psalmodic psalmodicVar, q73 q73Var, boolean z) {
        this.a = context;
        this.b = madbrainVar;
        this.c = psalmodicVar;
        this.d = q73Var;
        this.e = z;
    }

    public final xb1 a() {
        xb1 xb1Var;
        synchronized (this.g) {
            xb1Var = this.f;
        }
        return xb1Var;
    }

    public final xb1 a(w62 w62Var) throws s73 {
        Class<?> clsLoadClass;
        synchronized (this) {
            try {
                j72 j72Var = w62Var.a;
                if (j72Var != null) {
                    String strR = j72Var.r();
                    HashMap map = h;
                    clsLoadClass = (Class) map.get(strR);
                    if (clsLoadClass == null) {
                        try {
                            q73 q73Var = this.d;
                            File file = w62Var.b;
                            q73Var.getClass();
                            if (q73.a(file)) {
                                try {
                                    File file2 = w62Var.c;
                                    if (!file2.exists()) {
                                        file2.mkdirs();
                                    }
                                    clsLoadClass = new DexClassLoader(w62Var.b.getAbsolutePath(), file2.getAbsolutePath(), null, this.a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                                    map.put(strR, clsLoadClass);
                                } catch (ClassNotFoundException e) {
                                    e = e;
                                    throw new s73(2008, e);
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    throw new s73(2008, e);
                                } catch (SecurityException e3) {
                                    e = e3;
                                    throw new s73(2008, e);
                                }
                            } else {
                                throw new s73("VM did not pass signature verification", 2026);
                            }
                        } catch (GeneralSecurityException e4) {
                            throw new s73(2026, e4);
                        }
                    }
                } else {
                    throw new s73("mc", 4010);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            xb1 xb1Var = new xb1(clsLoadClass.getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.a, "msa-r", w62Var.a(), null, new Bundle(), 2), this.b, this.c, this.e);
            if (xb1Var.c()) {
                int iB = xb1Var.b();
                if (iB == 0) {
                    return xb1Var;
                }
                throw new s73(rotissomat.attabal("ci: ", iB), PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
            }
            throw new s73("init failed", 4000);
        } catch (Exception e5) {
            throw new s73(2004, e5);
        }
    }

    public final void a(xb1 xb1Var) {
        synchronized (this.g) {
            xb1 xb1Var2 = this.f;
            if (xb1Var2 != null) {
                try {
                    xb1Var2.a();
                } catch (s73 e) {
                    this.c.a(e.a, -1L, e);
                }
                this.f = xb1Var;
            } else {
                this.f = xb1Var;
            }
            throw th;
        }
    }
}
