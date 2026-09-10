package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.a1;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.u;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends ComponentActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h.c f7183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h.c f7184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h.c f7185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ResultReceiver f7186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ResultReceiver f7187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ResultReceiver f7188g;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7183b = registerForActivityResult(new a1(4), new h.b() { // from class: com.android.billingclient.api.zzct
            @Override // h.b
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.zza;
                h.a aVar = (h.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f42049b;
                int responseCode = u.e(intent, "ProxyBillingActivityV2").getResponseCode();
                ResultReceiver resultReceiver = proxyBillingActivityV2.f7186e;
                if (resultReceiver != null) {
                    resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
                }
                int i10 = aVar.f42048a;
                if (i10 != -1 || responseCode != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i10 + " and billing's responseCode: " + responseCode);
                }
                proxyBillingActivityV2.finish();
            }
        });
        this.f7184c = registerForActivityResult(new a1(4), new h.b() { // from class: com.android.billingclient.api.zzcu
            @Override // h.b
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.zza;
                h.a aVar = (h.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f42049b;
                int responseCode = u.e(intent, "ProxyBillingActivityV2").getResponseCode();
                ResultReceiver resultReceiver = proxyBillingActivityV2.f7187f;
                if (resultReceiver != null) {
                    resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
                }
                int i10 = aVar.f42048a;
                if (i10 != -1 || responseCode != 0) {
                    u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i10 + " and billing's responseCode: " + responseCode);
                }
                proxyBillingActivityV2.finish();
            }
        });
        this.f7185d = registerForActivityResult(new a1(4), new h.b() { // from class: com.android.billingclient.api.zzcv
            @Override // h.b
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.zza;
                h.a aVar = (h.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f42049b;
                int i10 = aVar.f42048a;
                Bundle extras = intent == null ? null : intent.getExtras();
                if (i10 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
                }
                int responseCode = u.e(intent, "ProxyBillingActivityV2").getResponseCode();
                ResultReceiver resultReceiver = proxyBillingActivityV2.f7188g;
                if (resultReceiver != null) {
                    resultReceiver.send(responseCode, extras);
                } else {
                    u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (responseCode != 0) {
                    u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + responseCode);
                }
                proxyBillingActivityV2.finish();
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f7186e = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.f7187f = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f7188g = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
                return;
            }
            return;
        }
        u.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f7186e = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            h.c cVar = this.f7183b;
            n.f(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            n.e(intentSender, "getIntentSender(...)");
            cVar.a(new h.j(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f7187f = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            h.c cVar2 = this.f7184c;
            n.f(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            n.e(intentSender2, "getIntentSender(...)");
            cVar2.a(new h.j(intentSender2, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f7188g = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            h.c cVar3 = this.f7185d;
            n.f(pendingIntent3, "pendingIntent");
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            n.e(intentSender3, "getIntentSender(...)");
            cVar3.a(new h.j(intentSender3, null, 0, 0));
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f7186e;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f7187f;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f7188g;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
    }
}
