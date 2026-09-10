package a4;

import ae.r;
import ae.y;
import android.os.Handler;
import android.view.View;
import cn.h0;
import com.adjust.sdk.sig.e2;
import com.adjust.sdk.sig.l2;
import com.adjust.sdk.sig.r0;
import com.applovin.applovin_max.AppLovinMAX;
import com.applovin.applovin_max.AppLovinMAXAdView;
import com.applovin.applovin_max.AppLovinMAXNativeAdView;
import com.applovin.impl.j5;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.d;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.internal.Util;
import com.bumptech.glide.c;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.ironsource.B;
import com.ironsource.C;
import com.ironsource.C0321ec;
import com.ironsource.C0361gg;
import com.ironsource.C0547r6;
import com.ironsource.C0568s9;
import com.ironsource.C0659xa;
import com.ironsource.E;
import com.ironsource.I;
import com.ironsource.InterfaceC0343fg;
import com.ironsource.L2;
import com.ironsource.N2;
import com.mbridge.msdk.config.component.vc.VCCpt;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.services.core.webview.WebView;
import i1.q0;
import i2.f;
import i2.i;
import i2.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.Callable;
import k3.h;
import l1.g;
import l1.q;
import m0.r1;
import m0.v;
import oa.e0;
import oa.j0;
import oa.n1;
import xi.n;
import xi.o;
import z.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements j, EventListener.Factory, Continuation, r, r0, AppLovinCmpService.OnCompletedListener, n, s.a, d.b, E, InterfaceC0343fg, N2, com.mbridge.msdk.config.activity.backdispatcher.b, v, ej.b, com.mbridge.msdk.config.component.info.provider.listener.a, m1.r, m, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3382b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f3381a = i10;
        this.f3382b = obj;
    }

    @Override // com.ironsource.E
    public B a(C c4, I i10) {
        int i11 = this.f3381a;
        Object obj = this.f3382b;
        switch (i11) {
            case 13:
                return L2.a((L2) obj, c4, i10);
            case 14:
                return C0321ec.a((C0321ec) obj, c4, i10);
            default:
                return C0547r6.b((C0547r6) obj, c4, i10);
        }
    }

    @Override // l1.g
    public void accept(Object obj) {
        h hVar = (h) this.f3382b;
        k3.a aVar = (k3.a) obj;
        k3.g gVar = new k3.g(aVar.f44269b, jj.d.t(aVar.f44270c, aVar.f44268a));
        hVar.f44283c.add(gVar);
        long j10 = hVar.f44290j;
        if (j10 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || aVar.f44271d >= j10) {
            hVar.e(gVar);
        }
    }

    @Override // s.a
    public Object apply(Object obj) {
        return com.applovin.impl.sdk.ad.b.a((e) this.f3382b, (j5) obj);
    }

    @Override // i2.m
    public n1 b(int i10, q0 q0Var, int[] iArr) {
        i iVar = (i) this.f3382b;
        e0 e0VarU = j0.u();
        for (int i11 = 0; i11 < q0Var.f42659a; i11++) {
            e0VarU.b(new f(i10, q0Var, i11, iVar, iArr[i11]));
        }
        return e0VarU.g();
    }

    @Override // z.j
    public Object c(z.i iVar) {
        h0 h0Var = (h0) this.f3382b;
        h0Var.n(new b(0, iVar, h0Var));
        return "Deferred.asListenableFuture";
    }

    @Override // com.applovin.shadow.okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.asFactory$lambda$8((EventListener) this.f3382b, call);
    }

    @Override // ae.r
    public Object d() {
        int i10 = this.f3381a;
        Object obj = this.f3382b;
        switch (i10) {
            case 3:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e10) {
                    c cVar = de.c.f38839a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException("Failed to invoke constructor '" + de.c.b(constructor) + "' with no args", e11);
                } catch (InvocationTargetException e12) {
                    throw new RuntimeException("Failed to invoke constructor '" + de.c.b(constructor) + "' with no args", e12.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return y.f3549a.a(cls);
                } catch (Exception e13) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e13);
                }
        }
    }

    @Override // m0.v
    public r1 f(View view, r1 r1Var) {
        int i10 = this.f3381a;
        Object obj = this.f3382b;
        switch (i10) {
            case 20:
                return AndroidWebViewContainer.applySafeAreaInsets$lambda$6((AndroidWebViewContainer) obj, view, r1Var);
            default:
                return WebView.applySafeAreaInsets$lambda$3((WebView) obj, view, r1Var);
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService.OnCompletedListener
    public void onCompleted(AppLovinCmpError appLovinCmpError) {
        AppLovinMAX.lambda$showCmpForExistingUser$1((o) this.f3382b, appLovinCmpError);
    }

    @Override // xi.n
    public void onMethodCall(xi.m mVar, o oVar) {
        int i10 = this.f3381a;
        Object obj = this.f3382b;
        switch (i10) {
            case 9:
                ((AppLovinMAXAdView) obj).lambda$new$0(mVar, (wi.j) oVar);
                break;
            default:
                ((AppLovinMAXNativeAdView) obj).lambda$new$0(mVar, (wi.j) oVar);
                break;
        }
    }

    @Override // ej.b
    public InputStream open() {
        return new FileInputStream((File) this.f3382b);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (Task) ((Callable) this.f3382b).call();
    }

    @Override // com.ironsource.N2
    public L2 a(boolean z10) {
        return C0659xa.a((C0659xa) this.f3382b, z10);
    }

    @Override // com.adjust.sdk.sig.r0
    public Object a(Object obj) {
        int i10 = this.f3381a;
        Object obj2 = this.f3382b;
        switch (i10) {
            case 6:
                return com.adjust.sdk.sig.d.a((com.adjust.sdk.sig.d) obj2, obj);
            default:
                return e2.a((l2) obj2, ((Integer) obj).intValue());
        }
    }

    @Override // com.mbridge.msdk.config.activity.backdispatcher.b
    public void a() {
        ((VCCpt) this.f3382b).k();
    }

    @Override // com.applovin.impl.sdk.d.b
    public void a(d.a aVar) {
        ((com.applovin.impl.sdk.e) this.f3382b).c(aVar);
    }

    @Override // com.mbridge.msdk.config.component.info.provider.listener.a
    public void a(Map map) {
        ((com.mbridge.msdk.config.component.info.provider.a) this.f3382b).b(map);
    }

    @Override // com.ironsource.InterfaceC0343fg
    public void a(jk.a aVar) {
        int i10 = this.f3381a;
        Object obj = this.f3382b;
        switch (i10) {
            case 15:
                C0361gg.a((C0568s9) obj, aVar);
                break;
            default:
                C0361gg.a((Handler) obj, aVar);
                break;
        }
    }

    @Override // m1.r
    public void a(long j10, q qVar) {
        n2.b.f(j10, qVar, ((h3.g) this.f3382b).L);
    }
}
