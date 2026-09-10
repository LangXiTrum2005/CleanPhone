package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f40225h;

    public j(ComponentActivity componentActivity) {
        this.f40225h = componentActivity;
    }

    @Override // h.h
    public final void b(int i10, i.a contract, Object obj) {
        Bundle bundleExtra;
        int i11;
        kotlin.jvm.internal.n.f(contract, "contract");
        ComponentActivity componentActivity = this.f40225h;
        n5.f fVarB = contract.b(componentActivity, obj);
        if (fVarB != null) {
            new Handler(Looper.getMainLooper()).post(new com.applovin.mediation.nativeAds.adPlacer.a(i10, 2, this, fVarB));
            return;
        }
        Intent intentA = contract.a(componentActivity, obj);
        if (intentA.getExtras() != null) {
            Bundle extras = intentA.getExtras();
            kotlin.jvm.internal.n.c(extras);
            if (extras.getClassLoader() == null) {
                intentA.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            b0.b.i(componentActivity, stringArrayExtra, i10);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
            componentActivity.startActivityForResult(intentA, i10, bundle);
            return;
        }
        h.j jVar = (h.j) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            kotlin.jvm.internal.n.c(jVar);
            i11 = i10;
            try {
                componentActivity.startIntentSenderForResult(jVar.f42069a, i11, jVar.f42070b, jVar.f42071c, jVar.f42072d, 0, bundle);
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                new Handler(Looper.getMainLooper()).post(new com.applovin.mediation.nativeAds.adPlacer.a(i11, 3, this, e));
            }
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
            i11 = i10;
        }
    }
}
