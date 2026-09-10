package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.ur1;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 extends t1 {
    private static final f3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private k3 zzh;
    private int zzi;

    static {
        f3 f3Var = new f3();
        zzb = f3Var;
        t1.k(f3.class, f3Var);
    }

    public static f3 n(byte[] bArr, l1 l1Var) throws b2 {
        t1 t1Var = zzb;
        int length = bArr.length;
        if (length != 0) {
            t1 t1Var2 = (t1) t1Var.d(4);
            try {
                s2 s2VarA = p2.f24443c.a(t1Var2.getClass());
                ur1 ur1Var = new ur1();
                l1Var.getClass();
                s2VarA.g(t1Var2, bArr, 0, length, ur1Var);
                s2VarA.b(t1Var2);
                t1Var = t1Var2;
            } catch (b2 e10) {
                throw e10;
            } catch (v2 e11) {
                throw new b2(e11.getMessage());
            } catch (IOException e12) {
                if (e12.getCause() instanceof b2) {
                    throw ((b2) e12.getCause());
                }
                throw new b2(e12.getMessage(), e12);
            } catch (IndexOutOfBoundsException unused) {
                throw new b2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (t1Var == null || t1.c(t1Var, true)) {
            return (f3) t1Var;
        }
        throw new b2(new v2().getMessage());
    }

    public static void p(f3 f3Var, m3 m3Var) {
        f3Var.zzi = m3Var.f24425a;
        f3Var.zzd |= 4;
    }

    public static /* synthetic */ void q(f3 f3Var, k3 k3Var) {
        f3Var.zzh = k3Var;
        f3Var.zzd |= 2;
    }

    public static /* synthetic */ void r(f3 f3Var, s3 s3Var) {
        f3Var.zzf = s3Var;
        f3Var.zze = 4;
    }

    public static /* synthetic */ void s(f3 f3Var, w3 w3Var) {
        f3Var.zzf = w3Var;
        f3Var.zze = 7;
    }

    public static /* synthetic */ void t(f3 f3Var, e4 e4Var) {
        f3Var.zzf = e4Var;
        f3Var.zze = 6;
    }

    public static /* synthetic */ void u(f3 f3Var, int i10) {
        f3Var.zzg = i10 - 1;
        f3Var.zzd |= 1;
    }

    public static e3 v() {
        return (e3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", b1.f24223c, "zzh", s3.class, "zzi", b1.f24225e, e4.class, w3.class});
        }
        if (i11 == 3) {
            return new f3();
        }
        if (i11 == 4) {
            return new e3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }

    public final w3 o() {
        return this.zze == 7 ? (w3) this.zzf : w3.o();
    }
}
