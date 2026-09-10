package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.Be;
import com.ironsource.C0350g5;
import com.ironsource.C0484ne;
import com.ironsource.C0606ub;
import com.ironsource.C0627ve;
import com.ironsource.InterfaceC0591te;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10327f;

    public /* synthetic */ z8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f10322a = i10;
        this.f10323b = obj;
        this.f10324c = obj2;
        this.f10325d = obj3;
        this.f10326e = obj4;
        this.f10327f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i10 = this.f10322a;
        int i11 = 26;
        Intent intent = null;
        Object obj = this.f10327f;
        Object obj2 = this.f10326e;
        Object obj3 = this.f10325d;
        Object obj4 = this.f10324c;
        Object obj5 = this.f10323b;
        switch (i10) {
            case 0:
                ((f1) obj5).a((View) obj4, (FrameLayout) obj3, (ViewTreeObserver) obj2, (y8) obj);
                return;
            case 1:
                ((i6) obj5).a((String) obj4, (a3) obj3, (Activity) obj2, (MaxAdFormat) obj);
                return;
            case 2:
                ((MediationServiceImpl) obj5).a((e3) obj4, (Map) obj3, (Map) obj2, (Activity) obj);
                return;
            case 3:
                ((p2) obj5).a((androidx.lifecycle.o) obj4, (AppLovinAd) obj3, (ViewGroup) obj2, (Activity) obj);
                return;
            case 4:
                Be.a((Be) obj5, (InterfaceC0591te) obj4, (Context) obj3, (C0627ve) obj2, (Context) obj);
                return;
            case 5:
                C0606ub.a.a((C0484ne) obj5, (LevelPlayInitRequest) obj4, (Context) obj3, (C0350g5) obj2, (LevelPlayInitListener) obj);
                return;
            case 6:
                Context context = (Context) obj5;
                dj.a aVar = (dj.a) obj4;
                String str = (String) obj3;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                dj.l lVar = (dj.l) obj;
                try {
                    if (context == null) {
                        throw new IllegalStateException("FlutterFirebaseCorePlugin is not attached to an engine");
                    }
                    String str2 = aVar.f38904a;
                    k9.c0.f(str2, "ApiKey must be set.");
                    String str3 = aVar.f38905b;
                    k9.c0.f(str3, "ApplicationId must be set.");
                    mb.i iVar = new mb.i(str3, str2, aVar.f38909f, aVar.f38912i, aVar.f38906c, aVar.f38910g, null, aVar.f38907d);
                    try {
                        Looper.prepare();
                        break;
                    } catch (Exception unused) {
                    }
                    String str4 = aVar.f38908e;
                    if (str4 != null) {
                        Map<String, String> customAuthDomain = FlutterFirebasePlugin.customAuthDomain;
                        kotlin.jvm.internal.n.e(customAuthDomain, "customAuthDomain");
                        customAuthDomain.put(str, str4);
                    }
                    mb.g gVarJ = mb.g.j(context, str, iVar);
                    lVar.getClass();
                    TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new dj.k(gVarJ, taskCompletionSource2, lVar));
                    Task task = taskCompletionSource2.getTask();
                    kotlin.jvm.internal.n.e(task, "getTask(...)");
                    taskCompletionSource.setResult(Tasks.await(task));
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 7:
                jj.b bVar = (jj.b) obj5;
                jj.j jVar = (jj.j) obj3;
                UserRecoverableAuthException userRecoverableAuthException = (UserRecoverableAuthException) obj2;
                String str5 = (String) obj;
                if (!((Boolean) obj4).booleanValue() || bVar.f43933e != null) {
                    jVar.b(new jj.e("user_recoverable_auth", userRecoverableAuthException.getLocalizedMessage()));
                    return;
                }
                Activity activity = bVar.f43930b;
                if (activity == null) {
                    jVar.b(new jj.e("user_recoverable_auth", "Cannot recover auth because app is not in foreground. " + userRecoverableAuthException.getLocalizedMessage()));
                    return;
                }
                bVar.a("getTokens", null, null, null, jVar, str5);
                Intent intent2 = userRecoverableAuthException.f11600b;
                if (intent2 == null) {
                    int iC = v0.i.c(userRecoverableAuthException.f11601c);
                    if (iC == 0) {
                        Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
                    } else if (iC == 1) {
                        Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
                    } else if (iC == 2) {
                        Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
                    }
                } else {
                    intent = new Intent(intent2);
                }
                activity.startActivityForResult(intent, 53294);
                return;
            case 8:
                ta.x0 x0Var = (ta.x0) obj5;
                ta.v0 v0Var = (ta.v0) obj4;
                ListenableFuture listenableFuture = (ListenableFuture) obj3;
                ListenableFuture listenableFuture2 = (ListenableFuture) obj2;
                ta.e0 e0Var = (ta.e0) obj;
                if (x0Var.isDone()) {
                    v0Var.o(listenableFuture);
                    return;
                } else {
                    if (listenableFuture2.isCancelled()) {
                        int i12 = ta.e0.f50604e;
                        if (e0Var.compareAndSet(ta.d0.f50598a, ta.d0.f50599b)) {
                            x0Var.cancel(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 9:
                tj.s0 s0Var = (tj.s0) obj5;
                WebView viewArg = (WebView) obj4;
                String realmArg = (String) obj3;
                String str6 = (String) obj2;
                String argsArg = (String) obj;
                tj.l lVar2 = s0Var.f50905a;
                bh.a aVar2 = new bh.a(i11);
                lVar2.getClass();
                kotlin.jvm.internal.n.f(viewArg, "viewArg");
                kotlin.jvm.internal.n.f(realmArg, "realmArg");
                kotlin.jvm.internal.n.f(argsArg, "argsArg");
                nf nfVar = lVar2.f50859a;
                nfVar.getClass();
                if (!((tj.c) nfVar.f23783c).d(s0Var)) {
                    q4.a.p("missing-instance-error", "Callback to `WebViewClient.onReceivedLoginRequest` failed because native instance was not in the instance manager.", "");
                    return;
                } else {
                    new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", nfVar.e(), intent).y(xj.o.Q(s0Var, viewArg, realmArg, str6, argsArg), new tj.g0(aVar2, 4));
                    return;
                }
            case 10:
                tj.s0 s0Var2 = (tj.s0) obj5;
                WebView webViewArg = (WebView) obj4;
                HttpAuthHandler handlerArg = (HttpAuthHandler) obj3;
                String hostArg = (String) obj2;
                String realmArg2 = (String) obj;
                tj.l lVar3 = s0Var2.f50905a;
                bh.a aVar3 = new bh.a(i11);
                lVar3.getClass();
                kotlin.jvm.internal.n.f(webViewArg, "webViewArg");
                kotlin.jvm.internal.n.f(handlerArg, "handlerArg");
                kotlin.jvm.internal.n.f(hostArg, "hostArg");
                kotlin.jvm.internal.n.f(realmArg2, "realmArg");
                nf nfVar2 = lVar3.f50859a;
                nfVar2.getClass();
                if (!((tj.c) nfVar2.f23783c).d(s0Var2)) {
                    q4.a.p("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpAuthRequest` failed because native instance was not in the instance manager.", "");
                    return;
                } else {
                    new k5.g((xi.f) nfVar2.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", nfVar2.e(), intent).y(xj.o.Q(s0Var2, webViewArg, handlerArg, hostArg, realmArg2), new tj.g0(aVar3, 11));
                    return;
                }
            default:
                URL openIdKeyUrl = (URL) obj5;
                kotlin.jvm.internal.c0 result = (kotlin.jvm.internal.c0) obj4;
                String kid = (String) obj3;
                ReentrantLock lock = (ReentrantLock) obj2;
                Condition condition = (Condition) obj;
                kotlin.jvm.internal.n.f(openIdKeyUrl, "$openIdKeyUrl");
                kotlin.jvm.internal.n.f(result, "$result");
                kotlin.jvm.internal.n.f(kid, "$kid");
                kotlin.jvm.internal.n.f(lock, "$lock");
                URLConnection uRLConnectionOpenConnection = openIdKeyUrl.openConnection();
                kotlin.jvm.internal.n.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        kotlin.jvm.internal.n.e(inputStream, "connection.inputStream");
                        String strP = t9.e.p(new BufferedReader(new InputStreamReader(inputStream, an.a.f3768a), Segment.SIZE));
                        httpURLConnection.getInputStream().close();
                        result.f44760a = new JSONObject(strP).optString(kid);
                        httpURLConnection.disconnect();
                        lock.lock();
                        try {
                            condition.signal();
                        } finally {
                            lock.unlock();
                        }
                        break;
                    } catch (Exception e11) {
                        String name = x7.a.class.getName();
                        String message = e11.getMessage();
                        if (message == null) {
                            message = "Error getting public key";
                        }
                        Log.d(name, message);
                        httpURLConnection.disconnect();
                        lock.lock();
                        try {
                            condition.signal();
                        } finally {
                            lock.unlock();
                        }
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    httpURLConnection.disconnect();
                    lock.lock();
                    try {
                        condition.signal();
                        throw th2;
                    } finally {
                        lock.unlock();
                    }
                }
        }
    }
}
