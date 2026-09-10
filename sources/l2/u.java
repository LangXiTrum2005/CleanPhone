package l2;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.Handler;
import android.os.Process;
import android.os.StrictMode;
import android.util.Pair;
import android.view.View;
import com.adjust.sdk.Constants;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.AppEventsLoggerImpl;
import com.facebook.appevents.aam.MetadataViewObserver;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.google.android.gms.internal.ads.ln0;
import com.google.android.gms.internal.ads.xx1;
import com.google.android.gms.internal.measurement.nf;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.Z3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import f2.c0;
import i1.n0;
import i1.p0;
import i1.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import l7.d0;
import l7.g0;
import org.json.JSONException;
import org.json.JSONObject;
import p1.b0;
import p1.b1;
import p1.w0;
import q7.e0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44940c;

    public /* synthetic */ u(int i10, Object obj, Object obj2) {
        this.f44938a = i10;
        this.f44939b = obj;
        this.f44940c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        long j10;
        boolean z10;
        ln0 ln0Var;
        tc.a aVar;
        boolean z11 = true;
        Object obj = null;
        switch (this.f44938a) {
            case 0:
                v vVar = (v) this.f44939b;
                p1.b bVar = (p1.b) this.f44940c;
                p1.v vVar2 = vVar.f44942b;
                String str = l1.y.f44830a;
                m5.k.d(vVar2.f48170a.G, bVar);
                return;
            case 1:
                v vVar3 = (v) this.f44939b;
                z0 z0Var = (z0) this.f44940c;
                p1.v vVar4 = vVar3.f44942b;
                String str2 = l1.y.f44830a;
                b0 b0Var = vVar4.f48170a;
                b0Var.f47938f0 = z0Var;
                b0Var.f47947m.e(25, new p1.s(z0Var));
                return;
            case 2:
                v vVar5 = (v) this.f44939b;
                i1.p pVar = (i1.p) this.f44940c;
                p1.v vVar6 = vVar5.f44942b;
                String str3 = l1.y.f44830a;
                b0 b0Var2 = vVar6.f48170a;
                b0Var2.R = pVar;
                q1.f fVar = b0Var2.f47953s;
                fVar.I(fVar.H(), 1017, new q1.d(9));
                return;
            case 3:
                v vVar7 = (v) this.f44939b;
                xx1 xx1Var = (xx1) this.f44940c;
                synchronized (xx1Var) {
                }
                p1.v vVar8 = vVar7.f44942b;
                String str4 = l1.y.f44830a;
                b0 b0Var3 = vVar8.f48170a;
                q1.f fVar2 = b0Var3.f47953s;
                q1.a aVarE = fVar2.E((c0) fVar2.f48532d.f23264e);
                fVar2.I(aVarE, 1020, new k3.j(aVarE, xx1Var, 21));
                b0Var3.R = null;
                return;
            case 4:
                Context context = (Context) this.f44939b;
                String str5 = (String) this.f44940c;
                l7.s sVar = l7.s.f45212a;
                try {
                    if (v7.a.b(sVar)) {
                        return;
                    }
                    try {
                        q7.b bVarB = q7.f.b(context);
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                        String strConcat = str5.concat("ping");
                        long j11 = sharedPreferences.getLong(strConcat, 0L);
                        try {
                            JSONObject jSONObjectForGraphAPICall = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, bVarB, AppEventsLogger.INSTANCE.getAnonymousAppDeviceGUID(context), l7.s.g(context), context);
                            String installReferrer = AppEventsLoggerImpl.INSTANCE.getInstallReferrer();
                            if (installReferrer != null) {
                                jSONObjectForGraphAPICall.put(Constants.INSTALL_REFERRER, installReferrer);
                            }
                            String str6 = String.format("%s/activities", Arrays.copyOf(new Object[]{str5}, 1));
                            l7.s.f45229s.getClass();
                            String str7 = l7.b0.f45085j;
                            l7.b0 b0VarA = j2.n.A(null, str6, jSONObjectForGraphAPICall, null);
                            if (j11 == 0 && b0VarA.c().f45111c == null) {
                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                editorEdit.putLong(strConcat, System.currentTimeMillis());
                                editorEdit.apply();
                                q7.x.f48792c.s(g0.f45136d, "l7.s", "MOBILE_APP_INSTALL has been logged");
                                return;
                            }
                            return;
                        } catch (JSONException e10) {
                            throw new l7.n("An error occurred while publishing install.", e10);
                        }
                    } catch (Exception e11) {
                        e0.A("Facebook-publish", e11);
                        return;
                    }
                } catch (Throwable th2) {
                    v7.a.a(sVar, th2);
                    return;
                }
            case 5:
                ArrayList<Pair> arrayList = (ArrayList) this.f44939b;
                d0 requests = (d0) this.f44940c;
                kotlin.jvm.internal.n.f(requests, "$requests");
                for (Pair pair : arrayList) {
                    l7.w wVar = (l7.w) pair.first;
                    Object obj2 = pair.second;
                    kotlin.jvm.internal.n.e(obj2, "pair.second");
                    wVar.a((l7.e0) obj2);
                }
                Iterator it = requests.f45107d.iterator();
                while (it.hasNext()) {
                    ((l7.d) it.next()).f45102a.run();
                }
                return;
            case 6:
                try {
                    ((wi.j) this.f44939b).a(this.f44940c);
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            case 7:
                ld.g gVar = (ld.g) this.f44939b;
                ld.b bVar2 = (ld.b) this.f44940c;
                gVar.getClass();
                gVar.d(bVar2.f45278a, bVar2.f45279b);
                return;
            case 8:
                MetadataViewObserver.process$lambda$0((View) this.f44939b, (MetadataViewObserver) this.f44940c);
                return;
            case 9:
                ((qj.x) this.f44940c).c(((mj.b) this.f44939b).f46099g);
                return;
            case 10:
                b0 b0Var4 = (b0) this.f44939b;
                androidx.recyclerview.widget.w wVar2 = (androidx.recyclerview.widget.w) this.f44940c;
                int i11 = b0Var4.I - wVar2.f4945c;
                b0Var4.I = i11;
                if (wVar2.f4946d) {
                    b0Var4.J = wVar2.f4947e;
                    b0Var4.K = true;
                }
                if (i11 == 0) {
                    p0 p0Var = ((w0) wVar2.f4948f).f48179a;
                    int iM0 = -1;
                    if (!b0Var4.f47941h0.f48179a.p() && p0Var.p()) {
                        b0Var4.f47943i0 = -1;
                        b0Var4.f47945j0 = 0L;
                    }
                    if (!p0Var.p()) {
                        List listAsList = Arrays.asList(((b1) p0Var).f47968h);
                        go.k.t(listAsList.size() == b0Var4.f47950p.size());
                        for (int i12 = 0; i12 < listAsList.size(); i12++) {
                            ((p1.x) b0Var4.f47950p.get(i12)).f48199b = (p0) listAsList.get(i12);
                        }
                    }
                    boolean z12 = b0Var4.K;
                    long j12 = C.TIME_UNSET;
                    if (z12) {
                        boolean z13 = ((w0) wVar2.f4948f).f48179a.p() && b0Var4.f47941h0.f48179a.p();
                        boolean zEquals = ((w0) wVar2.f4948f).f48180b.equals(b0Var4.f47941h0.f48180b);
                        boolean z14 = ((w0) wVar2.f4948f).f48182d == b0Var4.f47941h0.f48196s;
                        if (z13 || (zEquals && z14)) {
                            z11 = false;
                        }
                        if (z11) {
                            iM0 = b0Var4.M0();
                            if (p0Var.p() || ((w0) wVar2.f4948f).f48180b.b()) {
                                j12 = ((w0) wVar2.f4948f).f48182d;
                            } else {
                                w0 w0Var = (w0) wVar2.f4948f;
                                c0 c0Var = w0Var.f48180b;
                                long j13 = w0Var.f48182d;
                                Object obj3 = c0Var.f40307a;
                                n0 n0Var = b0Var4.f47949o;
                                p0Var.g(obj3, n0Var);
                                j12 = j13 + n0Var.f42586e;
                            }
                        }
                        i10 = iM0;
                        j10 = j12;
                        z10 = z11;
                    } else {
                        i10 = -1;
                        j10 = -9223372036854775807L;
                        z10 = false;
                    }
                    b0Var4.K = false;
                    b0Var4.j1((w0) wVar2.f4948f, 1, z10, b0Var4.J, j10, i10);
                    return;
                }
                return;
            case 11:
                ((q1.i) this.f44939b).f48557d.reportTrackChangeEvent((TrackChangeEvent) this.f44940c);
                return;
            case 12:
                ((q1.i) this.f44939b).f48557d.reportNetworkEvent((NetworkEvent) this.f44940c);
                return;
            case 13:
                ((q1.i) this.f44939b).f48557d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f44940c);
                return;
            case 14:
                ((q1.i) this.f44939b).f48557d.reportPlaybackMetrics((PlaybackMetrics) this.f44940c);
                return;
            case 15:
                ((q1.i) this.f44939b).f48557d.reportPlaybackStateEvent((PlaybackStateEvent) this.f44940c);
                return;
            case 16:
                ((q7.t) this.f44939b).onSuccess((q7.r) this.f44940c);
                return;
            case 17:
                v vVar9 = (v) this.f44939b;
                p1.b bVar3 = (p1.b) this.f44940c;
                p1.v vVar10 = vVar9.f44942b;
                String str8 = l1.y.f44830a;
                m5.k.d(vVar10.f48170a.F, bVar3);
                return;
            case 18:
                v vVar11 = (v) this.f44939b;
                synchronized (((xx1) this.f44940c)) {
                }
                p1.v vVar12 = vVar11.f44942b;
                String str9 = l1.y.f44830a;
                q1.f fVar3 = vVar12.f48170a.f47953s;
                fVar3.I(fVar3.E((c0) fVar3.f48532d.f23264e), Z3.f28072i, new q1.d(7));
                return;
            case 19:
                k5.g gVar2 = (k5.g) this.f44939b;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.f44940c).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) gVar2.f44327c).post(new u(20, gVar2, routedDevice));
                    return;
                }
                return;
            case 20:
                k5.g gVar3 = (k5.g) this.f44939b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f44940c;
                if (((r1.r) gVar3.f44328d) == null || (ln0Var = ((r1.u) ((na.g) gVar3.f44326b).f46631b).f49365h) == null || audioDeviceInfo.equals((AudioDeviceInfo) ln0Var.f17078i)) {
                    return;
                }
                ln0Var.f17078i = audioDeviceInfo;
                ln0Var.e(r1.b.c((Context) ln0Var.f17071b, (i1.e) ln0Var.f17079j, audioDeviceInfo));
                return;
            case 21:
                ((ta.b0) this.f44939b).t((ListenableFuture) this.f44940c);
                return;
            case 22:
                ((ta.b0) this.f44939b).q((oa.c0) this.f44940c);
                return;
            case 23:
                tb.o oVar = (tb.o) this.f44939b;
                tc.b bVar4 = (tc.b) this.f44940c;
                if (oVar.f50712b != tb.o.f50710d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (oVar) {
                    aVar = oVar.f50711a;
                    oVar.f50711a = null;
                    oVar.f50712b = bVar4;
                    break;
                }
                aVar.b(bVar4);
                return;
            case 24:
                tb.m mVar = (tb.m) this.f44939b;
                tc.b bVar5 = (tc.b) this.f44940c;
                synchronized (mVar) {
                    try {
                        if (mVar.f50705b == null) {
                            mVar.f50704a.add(bVar5);
                        } else {
                            mVar.f50705b.add(bVar5.get());
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 25:
                ((qc.b) ((Map.Entry) this.f44939b).getKey()).a((qc.a) this.f44940c);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                tj.s sVar2 = (tj.s) this.f44939b;
                String messageArg = (String) this.f44940c;
                tj.l lVar = sVar2.f50903b;
                bh.a aVar2 = new bh.a(24);
                kotlin.jvm.internal.n.f(messageArg, "messageArg");
                nf nfVar = lVar.f50859a;
                nfVar.getClass();
                if (((tj.c) nfVar.f23783c).d(sVar2)) {
                    new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage", nfVar.e(), obj).y(xj.o.Q(sVar2, messageArg), new r1.q(aVar2, 16));
                    return;
                } else {
                    q4.a.p("missing-instance-error", "Callback to `JavaScriptChannel.postMessage` failed because native instance was not in the instance manager.", "");
                    return;
                }
            case 27:
                ub.a aVar3 = (ub.a) this.f44939b;
                Runnable runnable = (Runnable) this.f44940c;
                Process.setThreadPriority(aVar3.f51942c);
                StrictMode.ThreadPolicy threadPolicy = aVar3.f51943d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                Callable callable = (Callable) this.f44939b;
                ub.i iVar = (ub.i) ((rb.c) this.f44940c).f49529b;
                try {
                    iVar.i(callable.call());
                    return;
                } catch (Exception e12) {
                    iVar.j(e12);
                    return;
                }
            default:
                ((w1.c) ((v1.l) ((v1.r) this.f44939b).f52395c.f49529b).f52349b.f52760d.get(((v1.k) this.f44940c).f52334m)).e(true);
                return;
        }
    }

    public /* synthetic */ u(v vVar, i1.p pVar, p1.c cVar) {
        this.f44938a = 2;
        this.f44939b = vVar;
        this.f44940c = pVar;
    }

    public /* synthetic */ u(ta.b0 b0Var, int i10, ListenableFuture listenableFuture) {
        this.f44938a = 21;
        this.f44939b = b0Var;
        this.f44940c = listenableFuture;
    }
}
