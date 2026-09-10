package ld;

import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import cc.a2;
import com.google.android.gms.internal.ads.fz1;
import com.google.android.gms.internal.ads.mk0;
import com.google.android.gms.internal.consent_sdk.x;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.tasks.TaskCompletionSource;
import ea.f4;
import i1.k0;
import i1.n0;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.n;
import l7.q;
import m0.s1;
import m5.k;
import nd.c0;
import nd.e0;
import nd.f0;
import nd.l;
import nd.r0;
import nd.u;
import oa.j0;
import oa.n1;
import org.json.JSONObject;
import p1.b0;
import r1.t;
import tj.g0;
import tj.s0;
import wj.h;
import wj.r;
import x0.i;
import x0.m;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f45299d;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i10) {
        this.f45296a = i10;
        this.f45297b = obj;
        this.f45299d = obj2;
        this.f45298c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObjectOptJSONObject;
        switch (this.f45296a) {
            case 0:
                g gVar = (g) this.f45297b;
                u uVar = (u) this.f45299d;
                l lVar = (l) this.f45298c;
                e0 e0VarN = f0.n();
                e0VarN.h(uVar);
                gVar.d(e0VarN, lVar);
                return;
            case 1:
                g gVar2 = (g) this.f45297b;
                r0 r0Var = (r0) this.f45299d;
                l lVar2 = (l) this.f45298c;
                e0 e0VarN2 = f0.n();
                e0VarN2.j(r0Var);
                gVar2.d(e0VarN2, lVar2);
                return;
            case 2:
                g gVar3 = (g) this.f45297b;
                c0 c0Var = (c0) this.f45299d;
                l lVar3 = (l) this.f45298c;
                gVar3.getClass();
                e0 e0VarN3 = f0.n();
                e0VarN3.i(c0Var);
                gVar3.d(e0VarN3, lVar3);
                return;
            case 3:
                ((com.mbridge.msdk.config.dynamic.binddata.wrapper.d) this.f45297b).a((String) this.f45299d, this.f45298c);
                return;
            case 4:
                k kVar = (k) this.f45297b;
                ArrayList arrayList = (ArrayList) this.f45299d;
                hj.b bVar = (hj.b) this.f45298c;
                kVar.getClass();
                try {
                    d0.c.K((Context) kVar.f45902b, arrayList);
                    bVar.invoke(new h(r.f53297a));
                    return;
                } catch (Exception unused) {
                    bVar.invoke(new h(t9.e.c(new nj.e("quick_action_setshortcutitems_failure", "Exception thrown when setting dynamic shortcuts", null))));
                    return;
                }
            case 5:
                fz1 fz1Var = (fz1) this.f45297b;
                oa.e0 e0Var = (oa.e0) this.f45299d;
                f2.c0 c0Var2 = (f2.c0) this.f45298c;
                q1.f fVar = (q1.f) fz1Var.f14615j;
                n1 n1VarG = e0Var.g();
                x xVar = fVar.f48532d;
                k0 k0Var = fVar.f48535g;
                k0Var.getClass();
                xVar.getClass();
                xVar.f23261b = j0.x(n1VarG);
                if (!n1VarG.isEmpty()) {
                    xVar.f23264e = (f2.c0) n1VarG.get(0);
                    c0Var2.getClass();
                    xVar.f23265f = c0Var2;
                }
                if (((f2.c0) xVar.f23263d) == null) {
                    xVar.f23263d = x.h(k0Var, (j0) xVar.f23261b, (f2.c0) xVar.f23264e, (n0) xVar.f23260a);
                }
                xVar.D(((b0) k0Var).Q0());
                return;
            case 6:
                pd.h hVar = (pd.h) this.f45297b;
                String str = (String) this.f45299d;
                qd.c cVar = (qd.c) this.f45298c;
                s1 s1Var = hVar.f48336a;
                qb.b bVar2 = (qb.b) ((tc.b) s1Var.f45751b).get();
                if (bVar2 == null) {
                    return;
                }
                JSONObject jSONObject = cVar.f48949e;
                if (jSONObject.length() < 1) {
                    return;
                }
                JSONObject jSONObject2 = cVar.f48946b;
                if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                    if (strOptString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) s1Var.f45752c)) {
                        try {
                            if (!strOptString.equals(((Map) s1Var.f45752c).get(str))) {
                                ((Map) s1Var.f45752c).put(str, strOptString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str);
                                bundle.putString("arm_value", jSONObject2.optString(str));
                                bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                qb.c cVar2 = (qb.c) bVar2;
                                cVar2.a("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", strOptString);
                                cVar2.a("fp", "_fpc", bundle2);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            case 7:
                AudioTrack audioTrack = (AudioTrack) this.f45297b;
                Handler handler = (Handler) this.f45299d;
                mk0 mk0Var = (mk0) this.f45298c;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new q1.c(mk0Var, 4));
                    }
                    synchronized (t.f49341p) {
                        try {
                            int i10 = t.f49343r - 1;
                            t.f49343r = i10;
                            if (i10 == 0) {
                                ScheduledExecutorService scheduledExecutorService = t.f49342q;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                t.f49342q = null;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th4) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new q1.c(mk0Var, 4));
                    }
                    synchronized (t.f49341p) {
                        try {
                            int i11 = t.f49343r - 1;
                            t.f49343r = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = t.f49342q;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                t.f49342q = null;
                            }
                            throw th4;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            case 8:
                s0 s0Var = (s0) this.f45297b;
                WebView viewArg = (WebView) this.f45299d;
                ClientCertRequest requestArg = (ClientCertRequest) this.f45298c;
                tj.l lVar4 = s0Var.f50905a;
                bh.a aVar = new bh.a(26);
                lVar4.getClass();
                n.f(viewArg, "viewArg");
                n.f(requestArg, "requestArg");
                nf nfVar = lVar4.f50859a;
                nfVar.getClass();
                if (((tj.c) nfVar.f23783c).d(s0Var)) {
                    new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", nfVar.e(), (Object) null).y(o.Q(s0Var, viewArg, requestArg), new g0(aVar, 6));
                    return;
                } else {
                    q4.a.p("missing-instance-error", "Callback to `WebViewClient.onReceivedClientCertRequest` failed because native instance was not in the instance manager.", "");
                    return;
                }
            case 9:
                s0 s0Var2 = (s0) this.f45297b;
                WebView webViewArg = (WebView) this.f45299d;
                WebResourceRequest requestArg2 = (WebResourceRequest) this.f45298c;
                tj.l lVar5 = s0Var2.f50905a;
                bh.a aVar2 = new bh.a(26);
                lVar5.getClass();
                n.f(webViewArg, "webViewArg");
                n.f(requestArg2, "requestArg");
                nf nfVar2 = lVar5.f50859a;
                nfVar2.getClass();
                if (((tj.c) nfVar2.f23783c).d(s0Var2)) {
                    new k5.g((xi.f) nfVar2.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", nfVar2.e(), (Object) null).y(o.Q(s0Var2, webViewArg, requestArg2), new g0(aVar2, 7));
                    return;
                } else {
                    q4.a.p("missing-instance-error", "Callback to `WebViewClient.requestLoading` failed because native instance was not in the instance manager.", "");
                    return;
                }
            case 10:
                f4 f4Var = (f4) this.f45297b;
                com.bumptech.glide.c cVar3 = (com.bumptech.glide.c) this.f45299d;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f45298c;
                try {
                    m mVarD = a2.d(f4Var.f39414b);
                    if (mVarD == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    x0.l lVar6 = (x0.l) ((x0.f) mVarD.f4731b);
                    synchronized (lVar6.f53530d) {
                        lVar6.f53532f = threadPoolExecutor;
                        break;
                    }
                    ((x0.f) mVarD.f4731b).c(new i(cVar3, threadPoolExecutor));
                    return;
                } catch (Throwable th6) {
                    cVar3.y(th6);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 11:
                y7.a aVar3 = (y7.a) this.f45297b;
                y7.n nVar = (y7.n) this.f45299d;
                Bundle bundle3 = (Bundle) this.f45298c;
                try {
                    aVar3.i(bundle3, nVar);
                    aVar3.s(nVar, bundle3, null);
                    return;
                } catch (l7.n e10) {
                    aVar3.s(nVar, null, e10);
                    return;
                }
            case 12:
                y7.u uVar2 = (y7.u) this.f45297b;
                y7.n nVar2 = (y7.n) this.f45299d;
                Bundle bundle4 = (Bundle) this.f45298c;
                try {
                    uVar2.i(bundle4, nVar2);
                    uVar2.r(bundle4, nVar2);
                    return;
                } catch (l7.u e11) {
                    q qVar = e11.f45231b;
                    uVar2.q(nVar2, qVar.f45205d, qVar.a(), String.valueOf(qVar.f45203b));
                    return;
                } catch (l7.n e12) {
                    uVar2.q(nVar2, null, e12.getMessage(), null);
                    return;
                }
            default:
                zc.g gVar4 = (zc.g) this.f45297b;
                Intent intent = (Intent) this.f45299d;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f45298c;
                try {
                    gVar4.b(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
        }
    }
}
