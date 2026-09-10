package wi;

import android.content.Context;
import android.hardware.biometrics.BiometricPrompt;
import android.util.Log;
import com.applovin.impl.ca;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.u3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.internal.play_billing.y3;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d5.u;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import oa.k0;
import qj.x;
import xi.p;
import xi.q;
import xi.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements xi.c, xi.d, y5.d, t8.b, ye.g, SuccessContinuation {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static zi.a f53210c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f53211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f53212b;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f53212b = obj;
        this.f53211a = obj2;
    }

    public static HashMap b(String str, int i10, int i11, int i12, int i13) {
        HashMap mapN = ca.n("text", str);
        u.p(i10, mapN, "selectionBase", i11, "selectionExtent");
        u.p(i12, mapN, "composingBase", i13, "composingExtent");
        return mapN;
    }

    public void a() {
        String str = (String) this.f53211a;
        try {
            fc.f fVar = (fc.f) this.f53212b;
            fVar.getClass();
            new File((File) fVar.f40782d, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    public void c(f3 f3Var) {
        try {
            p(f3Var, (p3) this.f53211a);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void d(f3 f3Var, int i10) {
        try {
            o3 o3Var = (o3) ((p3) this.f53211a).g();
            o3Var.c();
            p3.p((p3) o3Var.f24469b, i10);
            this.f53211a = (p3) o3Var.a();
            c(f3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // xi.c
    public void e(Object obj) {
        ((oi.f) this.f53211a).a(((xi.l) ((k5.g) ((v6.c) this.f53212b).f52488b).f44327c).a(obj));
    }

    @Override // ye.g
    public void f(BiometricPrompt.AuthenticationResult authenticationResult) {
        ye.g gVar = (ye.g) this.f53211a;
        try {
            ye.d dVar = (ye.d) this.f53212b;
            dVar.f54375d = dVar.f54376e.i(dVar.f54373b, authenticationResult.getCryptoObject().getCipher());
            Log.d("FlutterSecureStorage", "Biometric authentication succeeded");
        } catch (Exception e10) {
            Log.e("FlutterSecureStorage", "Failed to initialize storage cipher after authentication", e10);
            gVar.h(e10);
        }
        gVar.f(null);
    }

    @Override // xi.d
    public void g(ByteBuffer byteBuffer, oi.f fVar) throws Throwable {
        p pVar = (p) this.f53211a;
        q qVar = pVar.f53826c;
        try {
            ((xi.n) this.f53212b).onMethodCall(qVar.a(byteBuffer), new j(1, this, fVar));
        } catch (RuntimeException e10) {
            Log.e("MethodChannel#" + pVar.f53825b, "Failed to handle method call", e10);
            fVar.a(qVar.e(e10.getMessage(), Log.getStackTraceString(e10)));
        }
    }

    @Override // vj.a
    public Object get() {
        int i10 = 1;
        rc.d dVar = new rc.d(i10);
        fd.b bVar = new fd.b(i10);
        Object obj = ((vj.a) this.f53211a).get();
        vj.a aVar = (vj.a) this.f53212b;
        return new y8.h(dVar, bVar, y8.a.f54325f, (y8.j) obj, aVar);
    }

    @Override // ye.g
    public void h(Exception exc) {
        ((ye.g) this.f53211a).h(exc);
    }

    public void i(f3 f3Var, int i10, long j10) {
        try {
            o3 o3Var = (o3) ((p3) this.f53211a).g();
            o3Var.c();
            p3.p((p3) o3Var.f24469b, i10);
            p3 p3Var = (p3) o3Var.a();
            this.f53211a = p3Var;
            if (j10 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f24469b, j10);
                p3Var = (p3) o3Var2.a();
            }
            p(f3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void j(f3 f3Var, long j10, boolean z10) {
        p3 p3Var;
        try {
            e3 e3Var = (e3) f3Var.g();
            u3 u3Var = (u3) f3Var.o().g();
            u3Var.c();
            w3.n((w3) u3Var.f24469b, z10);
            e3Var.c();
            f3.s((f3) e3Var.f24469b, (w3) u3Var.a());
            f3 f3Var2 = (f3) e3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.f53211a;
            } else {
                o3 o3Var = (o3) ((p3) this.f53211a).g();
                o3Var.c();
                p3.r((p3) o3Var.f24469b, j10);
                p3Var = (p3) o3Var.a();
            }
            p(f3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void k(f3 f3Var, int i10, long j10, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.f53211a).g();
            o3Var.c();
            p3.p((p3) o3Var.f24469b, i10);
            this.f53211a = (p3) o3Var.a();
            e3 e3Var = (e3) f3Var.g();
            u3 u3Var = (u3) f3Var.o().g();
            u3Var.c();
            w3.n((w3) u3Var.f24469b, z10);
            e3Var.c();
            f3.s((f3) e3Var.f24469b, (w3) u3Var.a());
            f3 f3Var2 = (f3) e3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.f53211a;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f53211a).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f24469b, j10);
                p3Var = (p3) o3Var2.a();
            }
            p(f3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void l(h3 h3Var, long j10, boolean z10) {
        p3 p3Var;
        try {
            g3 g3Var = (g3) h3Var.g();
            u3 u3Var = (u3) h3Var.n().g();
            u3Var.c();
            w3.n((w3) u3Var.f24469b, z10);
            g3Var.c();
            h3.q((h3) g3Var.f24469b, (w3) u3Var.a());
            h3 h3Var2 = (h3) g3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.f53211a;
            } else {
                o3 o3Var = (o3) ((p3) this.f53211a).g();
                o3Var.c();
                p3.r((p3) o3Var.f24469b, j10);
                p3Var = (p3) o3Var.a();
            }
            q(h3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void m(l3 l3Var) {
        try {
            x3 x3VarT = y3.t();
            x3VarT.d((p3) this.f53211a);
            x3VarT.c();
            y3.p((y3) x3VarT.f24469b, l3Var);
            ((bc.i) this.f53212b).i((y3) x3VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void n(b4 b4Var) {
        try {
            bc.i iVar = (bc.i) this.f53212b;
            x3 x3VarT = y3.t();
            x3VarT.d((p3) this.f53211a);
            x3VarT.c();
            y3.r((y3) x3VarT.f24469b, b4Var);
            iVar.i((y3) x3VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void o(c4 c4Var) {
        if (c4Var == null) {
            return;
        }
        try {
            x3 x3VarT = y3.t();
            x3VarT.d((p3) this.f53211a);
            x3VarT.c();
            y3.s((y3) x3VarT.f24469b, c4Var);
            ((bc.i) this.f53212b).i((y3) x3VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void p(f3 f3Var, p3 p3Var) {
        if (f3Var == null) {
            return;
        }
        try {
            x3 x3VarT = y3.t();
            x3VarT.d(p3Var);
            x3VarT.c();
            y3.n((y3) x3VarT.f24469b, f3Var);
            ((bc.i) this.f53212b).i((y3) x3VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void q(h3 h3Var, p3 p3Var) {
        if (h3Var == null) {
            return;
        }
        try {
            x3 x3VarT = y3.t();
            x3VarT.d(p3Var);
            x3VarT.c();
            y3.o((y3) x3VarT.f24469b, h3Var);
            ((bc.i) this.f53212b).i((y3) x3VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        hc.b bVar = (hc.b) obj;
        zb.j jVar = (zb.j) this.f53212b;
        zb.l lVar = jVar.f54699f;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        return Tasks.whenAll((Task<?>[]) new Task[]{zb.l.b(lVar), lVar.f54715m.J(jVar.f54698e ? (String) this.f53211a : null, lVar.f54708e.f3462a)});
    }

    public /* synthetic */ b(boolean z10, Object obj, Object obj2) {
        this.f53211a = obj;
        this.f53212b = obj2;
    }

    public b(Context context, p3 p3Var) {
        bc.i iVar = new bc.i(14, false);
        try {
            r8.p.b(context);
            iVar.f5553c = r8.p.a().c(p8.a.f48267e).a("PLAY_BILLING_LIBRARY", new o8.c("proto"), new o8.e() { // from class: com.android.billingclient.api.zzcm
                @Override // o8.e
                public final Object apply(Object obj) {
                    return ((y3) obj).a();
                }
            });
        } catch (Throwable unused) {
            iVar.f5552b = true;
        }
        this.f53212b = iVar;
        this.f53211a = p3Var;
    }

    public b(n.j jVar, int i10) {
        switch (i10) {
            case 1:
                x xVar = new x(this, 19);
                p pVar = new p(jVar, "flutter/platform_views_2", v.f53830b);
                this.f53211a = pVar;
                pVar.b(xVar);
                break;
            case 2:
            default:
                k0 k0Var = new k0(this, 21);
                p pVar2 = new p(jVar, "flutter/localization", xi.k.f53821a);
                this.f53211a = pVar2;
                pVar2.b(k0Var);
                break;
            case 3:
                k0 k0Var2 = new k0(this, 25);
                p pVar3 = new p(jVar, "flutter/textinput", xi.k.f53821a);
                this.f53211a = pVar3;
                pVar3.b(k0Var2);
                break;
        }
    }
}
