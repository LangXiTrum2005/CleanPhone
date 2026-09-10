package y7;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import q7.e0;
import q7.l0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends u {
    public static final Parcelable.Creator<x> CREATOR = new l7.h(19);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l0 f54321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f54322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f54323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l7.g f54324h;

    public x(Parcel parcel) {
        super(parcel, 1);
        this.f54323g = "web_view";
        this.f54324h = l7.g.f45125d;
        this.f54322f = parcel.readString();
    }

    @Override // y7.t
    public final void b() {
        l0 l0Var = this.f54321e;
        if (l0Var != null) {
            if (l0Var != null) {
                l0Var.cancel();
            }
            this.f54321e = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // y7.t
    public final String e() {
        return this.f54323g;
    }

    @Override // y7.t
    public final int k(n request) {
        FragmentActivity fragmentActivity;
        l0 l0Var;
        Uri uriA;
        kotlin.jvm.internal.n.f(request, "request");
        String str = request.f54269e;
        Bundle bundleN = n(request);
        l(bundleN, request);
        v6.c cVar = new v6.c(this, request);
        String strE = go.k.E();
        this.f54322f = strE;
        a("e2e", strE);
        FragmentActivity fragmentActivityE = d().e();
        if (fragmentActivityE == null) {
            return 0;
        }
        boolean zHasSystemFeature = fragmentActivityE.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        String applicationId = request.f54268d;
        kotlin.jvm.internal.n.f(applicationId, "applicationId");
        q7.f.n(applicationId, "applicationId");
        String str2 = this.f54322f;
        kotlin.jvm.internal.n.d(str2, "null cannot be cast to non-null type kotlin.String");
        String str3 = zHasSystemFeature ? "fbconnect://chrome_os_success" : "fbconnect://success";
        String authType = request.f54274j;
        kotlin.jvm.internal.n.f(authType, "authType");
        int i10 = request.f54265a;
        d5.u.n(i10, "loginBehavior");
        int i11 = request.f54277n;
        d5.u.n(i11, "targetApp");
        boolean z10 = request.f54278o;
        boolean z11 = request.f54279p;
        boolean z12 = str == null || str.length() == 0;
        if (!bundleN.containsKey("redirect_uri")) {
            bundleN.putString("redirect_uri", str3);
        }
        bundleN.putString("client_id", applicationId);
        bundleN.putString("e2e", str2);
        bundleN.putString("response_type", i11 == 2 ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
        bundleN.putString("return_scopes", com.ironsource.mediationsdk.metadata.a.f29610g);
        bundleN.putString("auth_type", authType);
        bundleN.putString("login_behavior", wi.d.o(i10));
        if (z10) {
            bundleN.putString("fx_app", wi.d.e(i11));
        }
        if (z11) {
            bundleN.putString("skip_dedupe", com.ironsource.mediationsdk.metadata.a.f29610g);
        }
        if (z12) {
            int i12 = l0.f48710m;
            d5.u.n(i11, "targetApp");
            l0.b(fragmentActivityE);
            fragmentActivity = fragmentActivityE;
            l0Var = new l0(fragmentActivity, "oauth", bundleN, i11, cVar);
        } else {
            int i13 = w.f54319o;
            kotlin.jvm.internal.n.c(str);
            d5.u.n(i11, "targetApp");
            Bundle bundle = new Bundle(bundleN);
            bundle.putString(X3.i.f27786d, "touch");
            bundle.putString("client_id", l7.s.c());
            bundle.putString("sdk", "android-18.3.0");
            if (v.f54318a[v0.i.c(i11)] == 1) {
                uriA = e0.a(q7.f.f(), bundle, "oauth/authorize");
            } else {
                uriA = e0.a(q7.f.e(), bundle, l7.s.e() + "/dialog/oauth");
            }
            l0.b(fragmentActivityE);
            String string = uriA.toString();
            kotlin.jvm.internal.n.e(string, "uri.toString()");
            w wVar = new w(fragmentActivityE, string, str);
            wVar.f48713c = cVar;
            fragmentActivity = fragmentActivityE;
            l0Var = wVar;
        }
        this.f54321e = l0Var;
        q7.h hVar = new q7.h();
        hVar.setRetainInstance(true);
        hVar.f48691q = this.f54321e;
        hVar.F(fragmentActivity.F(), "FacebookDialogFragment");
        return 1;
    }

    @Override // y7.u
    public final l7.g p() {
        return this.f54324h;
    }

    @Override // y7.t, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.f(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f54322f);
    }

    public x(p pVar) {
        this.f54315b = pVar;
        this.f54323g = "web_view";
        this.f54324h = l7.g.f45125d;
    }
}
