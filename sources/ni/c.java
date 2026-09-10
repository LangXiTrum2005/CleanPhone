package ni;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import b2.l;
import com.google.android.gms.internal.ads.p12;
import eb.d0;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.m;
import io.flutter.plugin.platform.n;
import java.util.HashMap;
import java.util.HashSet;
import oa.k0;
import p.s;
import qj.x;
import xi.p;
import xi.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements uj.b {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static long f46735y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final HashMap f46736z = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f46737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f46738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n.j f46739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p12 f46740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yi.a f46741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qd.i f46742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f46743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f46744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final rb.c f46745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wi.a f46746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s f46747k;
    public final v6.c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f46748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k0 f46749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final wi.l f46750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f46751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rb.c f46752q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wi.b f46753r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f46754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f46755t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d0 f46756u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashSet f46757v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f46758w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f46759x;

    public c(Context context) {
        this(context, null, new n(), true, false);
    }

    public c(Context context, FlutterJNI flutterJNI, n nVar, boolean z10, boolean z11) {
        AssetManager assets;
        this.f46757v = new HashSet();
        this.f46759x = new a(this);
        long j10 = f46735y;
        f46735y = 1 + j10;
        this.f46758w = j10;
        f46736z.put(Long.valueOf(j10), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        v9.e eVarF = v9.e.F();
        if (flutterJNI == null) {
            Object obj = eVarF.f52504c;
            flutterJNI = new FlutterJNI();
        }
        this.f46737a = flutterJNI;
        n.j jVar = new n.j(flutterJNI, assets, this.f46758w);
        this.f46739c = jVar;
        flutterJNI.setPlatformMessageHandler((oi.h) jVar.f46323e);
        v9.e.F().getClass();
        this.f46742f = new qd.i(jVar, flutterJNI);
        new un.a(jVar);
        this.f46743g = new l(jVar);
        wi.b bVar = new wi.b(jVar, 0);
        this.f46744h = new x(jVar, 18);
        this.f46745i = new rb.c(jVar, 16);
        this.f46746j = new wi.a(jVar);
        this.l = new v6.c(jVar, 8);
        PackageManager packageManager = context.getPackageManager();
        wi.b bVar2 = new wi.b();
        rb.c cVar = new rb.c(bVar2, 17);
        bVar2.f53211a = packageManager;
        new p(jVar, "flutter/processtext", v.f53830b).b(cVar);
        p pVar = new p(jVar, "flutter/restoration", v.f53830b);
        s sVar = new s();
        sVar.f47791d = false;
        sVar.f47792e = false;
        k0 k0Var = new k0(sVar, 23);
        sVar.f47788a = pVar;
        sVar.f47790c = z11;
        pVar.b(k0Var);
        this.f46747k = sVar;
        this.f46748m = new x(jVar, 20);
        this.f46749n = new k0(jVar);
        wi.l lVar = new wi.l(jVar);
        this.f46750o = lVar;
        this.f46751p = new x(jVar, 21);
        this.f46752q = new rb.c(jVar, 19);
        this.f46753r = new wi.b(jVar, 3);
        yi.a aVar = new yi.a(context, bVar);
        this.f46741e = aVar;
        ri.d dVar = (ri.d) eVarF.f52503b;
        if (!flutterJNI.isAttached()) {
            dVar.d(context.getApplicationContext());
            dVar.a(context, null);
        }
        m mVar = new m();
        mVar.f43336a = nVar.f43352a;
        mVar.f43340e = flutterJNI;
        nVar.f43356e = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f46759x);
        flutterJNI.setPlatformViewsController(nVar);
        flutterJNI.setPlatformViewsController2(mVar);
        flutterJNI.setLocalizationPlugin(aVar);
        eVarF.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(lVar);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f46738b = new io.flutter.embedding.engine.renderer.h(flutterJNI);
        this.f46754s = nVar;
        this.f46755t = mVar;
        d0 d0Var = new d0(22, false);
        d0Var.f39976b = nVar;
        d0Var.f39977c = mVar;
        this.f46756u = d0Var;
        p12 p12Var = new p12(context.getApplicationContext(), this, dVar);
        this.f46740d = p12Var;
        aVar.b(context.getResources().getConfiguration());
        if (z10 && dVar.f49603d.f5776a) {
            com.bumptech.glide.d.J(this);
        }
        com.bumptech.glide.d.d(context, this);
        p12Var.a(new aj.a(bVar2));
    }
}
