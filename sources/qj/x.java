package qj;

import android.content.Context;
import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.h1;
import cl.d0;
import cl.f0;
import cl.h0;
import cl.n0;
import cl.o0;
import cl.p0;
import cl.x0;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.storage.androidcleaner.R;
import fn.a1;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m0.s1;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import s0.f1;
import s0.g1;
import tk.b1;
import tk.e0;
import tk.g0;
import tk.i0;
import tk.k0;
import tk.v0;
import tk.y0;
import ud.j0;
import ud.t0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class x implements j2.o, s4.q, t8.b, s1.g, zk.l, wd.b, ph.b, xi.n, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f49096b;

    public /* synthetic */ x(Object obj, int i10) {
        this.f49095a = i10;
        this.f49096b = obj;
    }

    public static x t(xi.f messenger, String instanceName) {
        m5.k kVar = new m5.k(12);
        na.g gVar = new na.g(kVar, 7);
        kotlin.jvm.internal.n.f(messenger, "messenger");
        kotlin.jvm.internal.n.f(instanceName, "instanceName");
        new qd.i(messenger, instanceName.length() > 0 ? "dev.flutter.pigeon.video_player_android.VideoEventChannel.videoEvents.".concat(instanceName) : "dev.flutter.pigeon.video_player_android.VideoEventChannel.videoEvents", m.f49070a, 14).A(new od.c(gVar, 28));
        return new x(kVar, 0);
    }

    @Override // s1.g
    public long A() {
        return 0L;
    }

    @Override // s1.g
    public long B(long j10, long j11) {
        return 1L;
    }

    @Override // zk.l
    public Object a(cl.k kVar, Object obj) {
        return null;
    }

    @Override // s4.q
    public String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f49096b).getSupportedFeatures();
    }

    public void c(t.p pVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        h1 h1Var = (h1) this.f49096b;
        if (h1Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (h1Var.N()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        h1 h1Var2 = (h1) this.f49096b;
        t.l lVar = (t.l) h1Var2.C("androidx.biometric.BiometricFragment");
        if (lVar == null) {
            lVar = new t.l();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(h1Var2);
            aVar.g(0, lVar, "androidx.biometric.BiometricFragment");
            aVar.f(true, true);
            h1Var2.z(true);
            h1Var2.D();
        }
        if (lVar.getActivity() == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        t.t tVar = lVar.f50295a;
        tVar.f50307f = pVar;
        tVar.getClass();
        if (lVar.f50295a.f50311j) {
            return;
        }
        if (lVar.getContext() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        t.t tVar2 = lVar.f50295a;
        tVar2.f50311j = true;
        tVar2.f50312k = true;
        lVar.F();
        BiometricPrompt.Builder builderC = t.i.c(lVar.requireContext().getApplicationContext());
        t.p pVar2 = lVar.f50295a.f50307f;
        CharSequence charSequence = null;
        CharSequence charSequence2 = pVar2 != null ? pVar2.f50296a : null;
        CharSequence charSequence3 = pVar2 != null ? pVar2.f50297b : null;
        CharSequence charSequence4 = pVar2 != null ? pVar2.f50298c : null;
        if (charSequence2 != null) {
            t.i.g(builderC, charSequence2);
        }
        if (charSequence3 != null) {
            t.i.f(builderC, charSequence3);
        }
        if (charSequence4 != null) {
            t.i.d(builderC, charSequence4);
        }
        t.p pVar3 = lVar.f50295a.f50307f;
        if (pVar3 != null && (charSequence = pVar3.f50299d) == null) {
            charSequence = "";
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Executor uVar = lVar.f50295a.f50305d;
            if (uVar == null) {
                uVar = new com.google.android.gms.common.api.internal.u(4);
            }
            t.t tVar3 = lVar.f50295a;
            if (tVar3.f50310i == null) {
                tVar3.f50310i = new t.s(tVar3);
            }
            t.i.e(builderC, charSequence, uVar, tVar3.f50310i);
        }
        t.p pVar4 = lVar.f50295a.f50307f;
        int i10 = 0;
        t.j.a(builderC, pVar4 == null || pVar4.f50300e);
        t.p pVar5 = lVar.f50295a.f50307f;
        if (pVar5 != null && (i10 = pVar5.f50301f) == 0) {
            i10 = 255;
        }
        t.k.a(builderC, i10);
        BiometricPrompt biometricPromptB = t.i.b(builderC);
        Context context = lVar.getContext();
        lVar.f50295a.getClass();
        t.t tVar4 = lVar.f50295a;
        if (tVar4.f50309h == null) {
            tVar4.f50309h = new m5.k(17, false);
        }
        m5.k kVar = tVar4.f50309h;
        if (((CancellationSignal) kVar.f45902b) == null) {
            kVar.f45902b = t.u.b();
        }
        CancellationSignal cancellationSignal = (CancellationSignal) kVar.f45902b;
        com.google.android.gms.common.api.internal.u uVar2 = new com.google.android.gms.common.api.internal.u(3);
        t.t tVar5 = lVar.f50295a;
        if (tVar5.f50308g == null) {
            tVar5.f50308g = new s1(new t.r(tVar5));
        }
        s1 s1Var = tVar5.f50308g;
        if (((BiometricPrompt.AuthenticationCallback) s1Var.f45751b) == null) {
            s1Var.f45751b = t.b.a((t.r) s1Var.f45752c);
        }
        try {
            t.i.a(biometricPromptB, cancellationSignal, uVar2, (BiometricPrompt.AuthenticationCallback) s1Var.f45751b);
        } catch (NullPointerException e10) {
            Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e10);
            lVar.G(1, context != null ? context.getString(R.string.default_error_msg) : "");
        }
    }

    @Override // s4.q
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) no.b.e(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f49096b).createWebView(webView));
    }

    @Override // zk.l
    public Object e(d0 d0Var, Object obj) {
        return null;
    }

    @Override // zk.l
    public Object f(h0 h0Var, Object obj) {
        return null;
    }

    @Override // s1.g
    public long g(long j10, long j11) {
        return 0L;
    }

    @Override // vj.a
    public Object get() {
        switch (this.f49095a) {
            case 6:
                return new qd.i((Context) ((x) this.f49096b).f49096b, new rc.d(1), new fd.b(1), 3);
            case 9:
                return this.f49096b;
            case 12:
                return new j0((t0) ((wd.c) this.f49096b).get());
            case 22:
                return new xd.a((Context) ((rb.c) this.f49096b).f49529b);
            default:
                return new y8.j((Context) ((vj.a) this.f49096b).get(), "com.google.android.datatransport.events", Integer.valueOf(y8.j.f54346d).intValue());
        }
    }

    @Override // s4.q
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) no.b.e(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f49096b).getProfileStore());
    }

    @Override // s4.q
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) no.b.e(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f49096b).getStatics());
    }

    @Override // s1.g
    public long getTimeUs(long j10) {
        return 0L;
    }

    @Override // s4.q
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) no.b.e(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f49096b).getWebkitToCompatConverter());
    }

    @Override // s1.g
    public long h(long j10, long j11) {
        return C.TIME_UNSET;
    }

    @Override // s1.g
    public t1.j i(long j10) {
        return (t1.j) this.f49096b;
    }

    @Override // zk.l
    public Object j(cl.l lVar, Object obj) {
        return m(lVar, obj);
    }

    @Override // s1.g
    public long k(long j10, long j11) {
        return 0L;
    }

    @Override // zk.l
    public Object l(o0 o0Var, Object obj) {
        return m(o0Var, obj);
    }

    @Override // zk.l
    public Object m(zk.s sVar, Object obj) {
        return new e0((tk.c0) this.f49096b, sVar);
    }

    @Override // j2.o
    public void maybeThrowError() throws IOException {
        s1.f fVar = (s1.f) this.f49096b;
        fVar.A.maybeThrowError();
        IOException iOException = fVar.C;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // zk.l
    public Object n(cl.z zVar, Object obj) {
        return null;
    }

    @Override // zk.l
    public Object o(x0 x0Var, Object obj) {
        return null;
    }

    @Override // ph.b
    public void onAdLoaded() {
        m0 m0Var = (m0) this.f49096b;
        ((ConcurrentHashMap) ((rh.a) m0Var.f11736d).f38583b).put(((ph.c) m0Var.f11734b).f48371a, (xh.c) m0Var.f11735c);
    }

    @Override // xi.n
    public void onMethodCall(xi.m mVar, xi.o oVar) {
        wi.b bVar = (wi.b) this.f49096b;
        if (((io.flutter.plugin.platform.l) bVar.f53212b) == null) {
            return;
        }
        String str = mVar.f53822a;
        Object obj = mVar.f53823b;
        str.getClass();
        switch (str) {
            case "create":
                Map map = (Map) obj;
                try {
                    ((io.flutter.plugin.platform.l) bVar.f53212b).a(new wi.f(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 0, map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null));
                    ((wi.j) oVar).a(null);
                    break;
                } catch (IllegalStateException e10) {
                    ((wi.j) oVar).b("error", Log.getStackTraceString(e10), null);
                    return;
                }
                break;
            case "clearFocus":
                try {
                    ((io.flutter.plugin.platform.l) bVar.f53212b).B0(((Integer) obj).intValue());
                    ((wi.j) oVar).a(null);
                    break;
                } catch (IllegalStateException e11) {
                    ((wi.j) oVar).b("error", Log.getStackTraceString(e11), null);
                    return;
                }
                break;
            case "touch":
                List list = (List) obj;
                try {
                    ((io.flutter.plugin.platform.l) bVar.f53212b).g(new wi.g(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                    ((wi.j) oVar).a(null);
                    break;
                } catch (IllegalStateException e12) {
                    ((wi.j) oVar).b("error", Log.getStackTraceString(e12), null);
                    return;
                }
                break;
            case "setDirection":
                Map map2 = (Map) obj;
                try {
                    ((io.flutter.plugin.platform.l) bVar.f53212b).f(((Integer) map2.get("id")).intValue(), ((Integer) map2.get("direction")).intValue());
                    ((wi.j) oVar).a(null);
                    break;
                } catch (IllegalStateException e13) {
                    ((wi.j) oVar).b("error", Log.getStackTraceString(e13), null);
                    return;
                }
                break;
            case "isSurfaceControlEnabled":
                FlutterJNI flutterJNI = ((io.flutter.plugin.platform.m) ((io.flutter.plugin.platform.l) bVar.f53212b).f43335b).f43340e;
                ((wi.j) oVar).a(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                break;
            case "dispose":
                try {
                    ((io.flutter.plugin.platform.l) bVar.f53212b).K(((Integer) ((Map) obj).get("id")).intValue());
                    ((wi.j) oVar).a(null);
                    break;
                } catch (IllegalStateException e14) {
                    ((wi.j) oVar).b("error", Log.getStackTraceString(e14), null);
                    return;
                }
                break;
            default:
                ((wi.j) oVar).c();
                break;
        }
    }

    @Override // zk.l
    public Object p(f0 f0Var, Object obj) {
        return null;
    }

    @Override // s1.g
    public long q(long j10) {
        return 1L;
    }

    @Override // zk.l
    public Object r(n0 descriptor, Object obj) {
        tk.c0 c0Var = (tk.c0) this.f49096b;
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        int i10 = (descriptor.f6573t != null ? 1 : 0) + (descriptor.f6574u != null ? 1 : 0);
        if (descriptor.f6560f) {
            if (i10 == 0) {
                return new g0(c0Var, descriptor);
            }
            if (i10 == 1) {
                return new i0(c0Var, descriptor);
            }
            if (i10 == 2) {
                return new k0(c0Var, descriptor);
            }
        } else {
            if (i10 == 0) {
                return new v0(c0Var, descriptor);
            }
            if (i10 == 1) {
                return new y0(c0Var, descriptor);
            }
            if (i10 == 2) {
                return new b1(c0Var, descriptor);
            }
        }
        throw new cn.c0("Unsupported property: " + descriptor, 3);
    }

    @Override // zk.l
    public Object s(p0 p0Var, Object obj) {
        return m(p0Var, obj);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        hc.b bVar = (hc.b) obj;
        v6.c cVar = (v6.c) this.f49096b;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        zb.l lVar = (zb.l) cVar.f52488b;
        zb.l lVar2 = (zb.l) cVar.f52488b;
        zb.l.b(lVar);
        lVar2.f54715m.J(null, lVar2.f54708e.f3462a);
        lVar2.f54720r.trySetResult(null);
        return Tasks.forResult(null);
    }

    public f1 u() {
        return (f1) ((a1) this.f49096b).getValue();
    }

    @Override // zk.l
    public Object v(cl.b0 b0Var, Object obj) {
        return null;
    }

    @Override // zk.l
    public Object w(nm.s sVar, Object obj) {
        return null;
    }

    public void x(Exception exc) {
        l1.a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        l2.v vVar = ((r1.c0) this.f49096b).F0;
        Handler handler = vVar.f44941a;
        if (handler != null) {
            handler.post(new r1.l(vVar, exc, 8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    public void y(f1 newState) {
        Object value;
        f1 f1Var;
        kotlin.jvm.internal.n.f(newState, "newState");
        a1 a1Var = (a1) this.f49096b;
        do {
            value = a1Var.getValue();
            f1Var = (f1) value;
            if (f1Var instanceof s0.y0 ? true : kotlin.jvm.internal.n.a(f1Var, g1.f49812b)) {
                f1Var = newState;
            } else if (f1Var instanceof s0.d) {
                if (newState.f49805a > f1Var.f49805a) {
                    f1Var = newState;
                }
            } else if (!(f1Var instanceof s0.o0)) {
                throw new aa.b((byte) 0, 20);
            }
        } while (!a1Var.c0(value, f1Var));
    }

    @Override // s1.g
    public boolean z() {
        return true;
    }

    public x(n.j jVar, int i10) {
        this.f49095a = i10;
        switch (i10) {
            case 20:
                new xi.p(jVar, "flutter/scribe", xi.k.f53821a).b(new na.g(this, 27));
                break;
            case 21:
                new xi.p(jVar, "flutter/spellcheck", xi.v.f53830b).b(new na.g(this, 28));
                break;
            default:
                new xi.p(jVar, "flutter/mousecursor", xi.v.f53830b).b(new na.g(this, 25));
                break;
        }
    }

    public x(int i10) {
        this.f49095a = i10;
        switch (i10) {
            case 13:
                this.f49096b = new v1.d(5, 1.0f, false);
                break;
            case 14:
                this.f49096b = new ArrayList();
                break;
            case 23:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                kotlin.jvm.internal.n.f(timeUnit, "timeUnit");
                this.f49096b = new bo.l(ao.d.f5064i);
                break;
            default:
                this.f49096b = fn.g.c(g1.f49812b);
                break;
        }
    }

    public x(xi.f fVar) {
        this.f49095a = 17;
        this.f49096b = new k5.g(fVar, "flutter/keyevent", xi.j.f53820a, (Object) null);
    }

    public x(EditText editText) {
        this.f49095a = 26;
        wi.b bVar = new wi.b();
        bVar.f53211a = editText;
        z0.h hVar = new z0.h(editText);
        bVar.f53212b = hVar;
        editText.addTextChangedListener(hVar);
        if (z0.a.f54598b == null) {
            synchronized (z0.a.f54597a) {
                try {
                    if (z0.a.f54598b == null) {
                        z0.a aVar = new z0.a();
                        try {
                            z0.a.f54599c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, z0.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        z0.a.f54598b = aVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        editText.setEditableFactory(z0.a.f54598b);
        this.f49096b = bVar;
    }

    public x(FragmentActivity fragmentActivity, Executor executor, mj.b bVar) {
        this.f49095a = 7;
        if (fragmentActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            h1 h1VarF = fragmentActivity.F();
            t.t tVar = (t.t) new g9.k(fragmentActivity).n(t.t.class);
            this.f49096b = h1VarF;
            tVar.f50305d = executor;
            tVar.f50306e = bVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // s1.g
    public long d(long j10, long j11) {
        return j11;
    }
}
