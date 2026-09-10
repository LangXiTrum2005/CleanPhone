package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import q7.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/CustomTabActivity;", "Landroid/app/Activity;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CustomTabActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f10564a;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            Intent intent2 = new Intent("CustomTabActivity.action_customTabRedirect");
            intent2.putExtra("CustomTabMainActivity.extra_url", getIntent().getDataString());
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent2);
            c cVar = new c(this, 12);
            LocalBroadcastManager.getInstance(this).registerReceiver(cVar, new IntentFilter("CustomTabActivity.action_destroy"));
            this.f10564a = cVar;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction("CustomTabActivity.action_customTabRedirect");
        intent.putExtra("CustomTabMainActivity.extra_url", getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        c cVar = this.f10564a;
        if (cVar != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(cVar);
        }
        super.onDestroy();
    }
}
