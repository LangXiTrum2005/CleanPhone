package bi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import ea.f2;
import fc.f;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import ti.b;
import wi.j;
import xi.m;
import xi.n;
import xi.o;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbi/a;", "Lti/b;", "Lxi/n;", "Lui/a;", "<init>", "()V", "in_app_review_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class a implements b, n, ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f5702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f5703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f5704c;

    public final boolean a(j jVar) {
        Log.i("InAppReviewPlugin", "noContextOrActivity: called");
        if (this.f5703b == null) {
            Log.e("InAppReviewPlugin", "noContextOrActivity: Android context not available");
            if (jVar != null) {
                jVar.b("error", "Android context not available", null);
                return true;
            }
        } else {
            if (this.f5704c != null) {
                return false;
            }
            Log.e("InAppReviewPlugin", "noContextOrActivity: Android activity not available");
            if (jVar != null) {
                jVar.b("error", "Android activity not available", null);
            }
        }
        return true;
    }

    @Override // ui.a
    public final void onAttachedToActivity(ui.b binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        this.f5704c = (Activity) ((f) binding).f40780b;
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a flutterPluginBinding) {
        kotlin.jvm.internal.n.f(flutterPluginBinding, "flutterPluginBinding");
        p pVar = new p(flutterPluginBinding.f50789c, "dev.britannio.in_app_review");
        this.f5702a = pVar;
        pVar.b(this);
        this.f5703b = flutterPluginBinding.f50787a;
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        this.f5704c = null;
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f5704c = null;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        p pVar = this.f5702a;
        if (pVar == null) {
            kotlin.jvm.internal.n.l("channel");
            throw null;
        }
        pVar.b(null);
        this.f5703b = null;
    }

    @Override // xi.n
    public final void onMethodCall(m call, o oVar) {
        kotlin.jvm.internal.n.f(call, "call");
        String str = call.f53822a;
        Log.i("InAppReviewPlugin", "onMethodCall: " + str);
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 159262157) {
                if (iHashCode != 444517567) {
                    if (iHashCode == 1361080007 && str.equals("requestReview")) {
                        Log.i("InAppReviewPlugin", "requestReview: called");
                        j jVar = (j) oVar;
                        if (a(jVar)) {
                            return;
                        }
                        try {
                            Context context = this.f5703b;
                            kotlin.jvm.internal.n.c(context);
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            f2 f2Var = new f2(new ka.f(context));
                            Task taskC = f2Var.C();
                            kotlin.jvm.internal.n.e(taskC, "requestReviewFlow(...)");
                            kotlin.jvm.internal.n.c(taskC.addOnCompleteListener(new ac.a(this, (j) oVar, f2Var, 1)));
                            return;
                        } catch (Exception e10) {
                            Log.e("InAppReviewPlugin", "requestReview: error", e10);
                            jVar.b("error", "An error occurred during the request review flow", null);
                            return;
                        }
                    }
                } else if (str.equals("isAvailable")) {
                    Log.i("InAppReviewPlugin", "isAvailable: called");
                    if (a(null)) {
                        ((j) oVar).a(Boolean.FALSE);
                        return;
                    }
                    try {
                        Context context2 = this.f5703b;
                        kotlin.jvm.internal.n.c(context2);
                        Context applicationContext2 = context2.getApplicationContext();
                        if (applicationContext2 != null) {
                            context2 = applicationContext2;
                        }
                        Task taskC2 = new f2(new ka.f(context2)).C();
                        kotlin.jvm.internal.n.e(taskC2, "requestReviewFlow(...)");
                        kotlin.jvm.internal.n.c(taskC2.addOnCompleteListener(new b6.a((j) oVar, 3)));
                        return;
                    } catch (Exception e11) {
                        Log.e("InAppReviewPlugin", "isAvailable: error", e11);
                        ((j) oVar).a(Boolean.FALSE);
                        return;
                    }
                }
            } else if (str.equals("openStoreListing")) {
                Log.i("InAppReviewPlugin", "openStoreListing: called");
                j jVar2 = (j) oVar;
                if (a(jVar2)) {
                    return;
                }
                try {
                    Context context3 = this.f5703b;
                    kotlin.jvm.internal.n.c(context3);
                    String packageName = context3.getPackageName();
                    Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
                    kotlin.jvm.internal.n.e(data, "setData(...)");
                    Activity activity = this.f5704c;
                    kotlin.jvm.internal.n.c(activity);
                    activity.startActivity(data);
                    ((j) oVar).a(null);
                    return;
                } catch (Exception e12) {
                    Log.e("InAppReviewPlugin", "openStoreListing: error", e12);
                    jVar2.b("error", "An error occurred while opening the play store", null);
                    return;
                }
            }
        }
        ((j) oVar).c();
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        this.f5704c = (Activity) ((f) binding).f40780b;
    }
}
