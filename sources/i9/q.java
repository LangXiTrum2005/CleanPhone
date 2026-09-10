package i9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import k9.a0;
import k9.b0;
import k9.c0;
import k9.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f42955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f42956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile b0 f42957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f42958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f42959e;

    static {
        new l(m.y1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), 0);
        new l(m.y1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 1);
        new l(m.y1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 2);
        new l(m.y1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 3);
        f42955a = new l(m.y1("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 4);
        f42956b = new l(m.y1("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 5);
        f42958d = new Object();
    }

    public static void a() {
        b0 zVar;
        if (f42957c != null) {
            return;
        }
        c0.h(f42959e);
        synchronized (f42958d) {
            try {
                if (f42957c == null) {
                    IBinder iBinderB = t9.d.c(f42959e, t9.d.f50566e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i10 = a0.f44398b;
                    if (iBinderB == null) {
                        zVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        zVar = iInterfaceQueryLocalInterface instanceof b0 ? (b0) iInterfaceQueryLocalInterface : new z(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 5);
                    }
                    f42957c = zVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static t b(String str, n nVar, boolean z10, boolean z11) {
        try {
            a();
            c0.h(f42959e);
            try {
                b0 b0Var = f42957c;
                s9.b bVar = new s9.b(f42959e.getPackageManager());
                z zVar = (z) b0Var;
                Parcel parcelU1 = zVar.u1();
                int i10 = z9.g.f54667a;
                boolean z12 = true;
                parcelU1.writeInt(1);
                int iR = r9.b.R(parcelU1, 20293);
                r9.b.J(parcelU1, 1, str);
                r9.b.F(parcelU1, 2, nVar);
                r9.b.Q(parcelU1, 3, 4);
                parcelU1.writeInt(z10 ? 1 : 0);
                r9.b.Q(parcelU1, 4, 4);
                parcelU1.writeInt(z11 ? 1 : 0);
                r9.b.S(parcelU1, iR);
                z9.g.b(parcelU1, bVar);
                Parcel parcelR = zVar.r(parcelU1, 5);
                if (parcelR.readInt() == 0) {
                    z12 = false;
                }
                parcelR.recycle();
                return z12 ? t.f42966d : new s(new o(z10, str, nVar));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return t.c("module call", e10);
            }
        } catch (t9.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return t.c("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }
}
