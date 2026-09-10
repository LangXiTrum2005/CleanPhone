package v0;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.c1;
import androidx.datastore.preferences.protobuf.d1;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.j1;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b0 {
    private static final e DEFAULT_INSTANCE;
    private static volatile z0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private q0 preferences_ = q0.f4153b;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        b0.j(e.class, eVar);
    }

    public static q0 l(e eVar) {
        q0 q0Var = eVar.preferences_;
        if (!q0Var.f4154a) {
            eVar.preferences_ = q0Var.i();
        }
        return eVar.preferences_;
    }

    public static c n() {
        return (c) ((z) DEFAULT_INSTANCE.c(5));
    }

    public static e o(FileInputStream fileInputStream) throws g0 {
        e eVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.l lVar = new androidx.datastore.preferences.protobuf.l(fileInputStream);
        s sVarA = s.a();
        b0 b0VarI = eVar.i();
        try {
            a1 a1Var = a1.f4050c;
            a1Var.getClass();
            d1 d1VarA = a1Var.a(b0VarI.getClass());
            n nVar = (n) lVar.f4131b;
            if (nVar == null) {
                nVar = new n(lVar);
            }
            d1VarA.f(b0VarI, nVar, sVarA);
            d1VarA.b(b0VarI);
            if (b0.f(b0VarI, true)) {
                return (e) b0VarI;
            }
            throw new g0(new j1().getMessage());
        } catch (g0 e10) {
            if (e10.f4081a) {
                throw new g0(e10.getMessage(), e10);
            }
            throw e10;
        } catch (j1 e11) {
            throw new g0(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof g0) {
                throw ((g0) e12.getCause());
            }
            throw new g0(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof g0) {
                throw ((g0) e13.getCause());
            }
            throw e13;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final Object c(int i10) {
        z0 a0Var;
        switch (i.c(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new c1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f52285a});
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0 z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (e.class) {
                    try {
                        a0Var = PARSER;
                        if (a0Var == null) {
                            a0Var = new a0();
                            PARSER = a0Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return a0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
