package tj;

import android.app.Activity;
import android.content.Context;
import cc.a2;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.internal.play_billing.q1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class t0 implements ti.b, ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ti.a f50910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nf f50911b;

    @Override // ui.a
    public final void onAttachedToActivity(ui.b bVar) {
        nf nfVar = this.f50911b;
        if (nfVar != null) {
            nfVar.f23785e = (Activity) ((fc.f) bVar).f40780b;
        }
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
        this.f50910a = aVar;
        xi.f fVar = aVar.f50789c;
        Context context = aVar.f50787a;
        nf nfVar = new nf(fVar, context, new q(context.getAssets(), aVar.f50792f));
        this.f50911b = nfVar;
        aVar.f50791e.e("plugins.flutter.io/webview", new rj.b((c) nfVar.f23783c));
        nf nfVar2 = this.f50911b;
        nfVar2.getClass();
        wj.j jVar = e.f50818b;
        xi.f fVar2 = (xi.f) nfVar2.f23782b;
        a2.M(fVar2, (c) nfVar2.f23783c);
        com.bumptech.glide.d.L(fVar2, new l(nfVar2, 0));
        no.b.F(fVar2, new o(nfVar2, 3));
        j1.f.H(fVar2, new r(nfVar2, 2));
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", nfVar2.e(), (Object) null).C(new v(new l(nfVar2, 1), 10));
        l lVar = new l(nfVar2, 3);
        xi.l lVarE = nfVar2.e();
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", lVarE, (Object) null).C(new v(lVar, 28));
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", lVarE, (Object) null).C(new g0(lVar, 16));
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", nfVar2.e(), (Object) null).C(new v(new o(nfVar2, 0), 5));
        go.k.W(fVar2, new o(nfVar2, 2));
        com.google.android.gms.internal.auth.i.F(fVar2, new r(nfVar2, 0));
        h hVar = new h(nfVar2, 3);
        xi.l lVarE2 = nfVar2.e();
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", lVarE2, (Object) null).C(new v(hVar, 25));
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", lVarE2, (Object) null).C(new g0(hVar, 0));
        ne.c cVar = new ne.c(25);
        xi.l lVarE3 = nfVar2.e();
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", lVarE3, (Object) null).C(new r1.q(cVar, 17));
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", lVarE3, (Object) null).C(new r1.q(cVar, 18));
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", nfVar2.e(), (Object) null).C(new r1.q(new ne.c(22), 13));
        go.c.G(fVar2, new l(nfVar2, 2));
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", nfVar2.e(), (Object) null).C(new r1.q(new ne.c(23), 15));
        com.google.android.gms.internal.auth.o.x(fVar2, new h(nfVar2, 1));
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", nfVar2.e(), (Object) null).C(new r1.q(new ne.a(24), 11));
        com.bumptech.glide.c.F(fVar2, new h(nfVar2, 0));
        ne.a aVar2 = new ne.a(26);
        xi.l lVarE4 = nfVar2.e();
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", lVarE4, (Object) null).C(new r1.q(aVar2, 20));
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", lVarE4, (Object) null).C(new r1.q(aVar2, 21));
        h hVar2 = new h(nfVar2, 2);
        xi.l lVarE5 = nfVar2.e();
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", lVarE5, (Object) null).C(new r1.q(hVar2, 19));
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", lVarE5, (Object) null).C(new v(hVar2, 16));
        d0.c.L(fVar2, new o(nfVar2, 1));
        q1.y(fVar2, new r(nfVar2, 1));
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", nfVar2.e(), (Object) null).C(new r1.q(new ne.c(21), 12));
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", nfVar2.e(), (Object) null).C(new r1.q(new ne.a(27), 29));
        new k5.g(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", nfVar2.e(), (Object) null).C(new g0(new ne.c(27), 17));
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        this.f50911b.f23785e = this.f50910a.f50787a;
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f50911b.f23785e = this.f50910a.f50787a;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
        nf nfVar = this.f50911b;
        if (nfVar != null) {
            wj.j jVar = e.f50818b;
            xi.f fVar = (xi.f) nfVar.f23782b;
            a2.M(fVar, null);
            com.bumptech.glide.d.L(fVar, null);
            no.b.F(fVar, null);
            j1.f.H(fVar, null);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", new defpackage.h(10), (Object) null).C(null);
            defpackage.h hVar = new defpackage.h(10);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", hVar, (Object) null).C(null);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", hVar, (Object) null).C(null);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", new defpackage.h(10), (Object) null).C(null);
            go.k.W(fVar, null);
            com.google.android.gms.internal.auth.i.F(fVar, null);
            defpackage.h hVar2 = new defpackage.h(10);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", hVar2, (Object) null).C(null);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", hVar2, (Object) null).C(null);
            defpackage.h hVar3 = new defpackage.h(10);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", hVar3, (Object) null).C(null);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", hVar3, (Object) null).C(null);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", new defpackage.h(10), (Object) null).C(null);
            go.c.G(fVar, null);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", new defpackage.h(10), (Object) null).C(null);
            com.google.android.gms.internal.auth.o.x(fVar, null);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", new defpackage.h(10), (Object) null).C(null);
            com.bumptech.glide.c.F(fVar, null);
            defpackage.h hVar4 = new defpackage.h(10);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", hVar4, (Object) null).C(null);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", hVar4, (Object) null).C(null);
            defpackage.h hVar5 = new defpackage.h(10);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", hVar5, (Object) null).C(null);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", hVar5, (Object) null).C(null);
            d0.c.L(fVar, null);
            q1.y(fVar, null);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", new defpackage.h(10), (Object) null).C(null);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", new defpackage.h(10), (Object) null).C(null);
            new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", new defpackage.h(10), (Object) null).C(null);
            c cVar = (c) this.f50911b.f23783c;
            cVar.f50807g.removeCallbacks(cVar.f50808h);
            cVar.f50810j = true;
            this.f50911b = null;
        }
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b bVar) {
        this.f50911b.f23785e = (Activity) ((fc.f) bVar).f40780b;
    }
}
