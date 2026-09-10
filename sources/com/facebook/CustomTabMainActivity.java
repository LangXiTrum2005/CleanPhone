package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.l;
import l7.s;
import oa.k0;
import q7.c;
import q7.e0;
import q7.f;
import q7.v;
import q7.z;
import u.h;
import v0.i;
import v7.a;
import wi.d;
import y7.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CustomTabMainActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10565c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10566a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f10567b;

    public final void a(Intent intent, int i10) {
        Bundle bundle;
        c cVar = this.f10567b;
        if (cVar != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(cVar);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            if (stringExtra != null) {
                Uri uri = Uri.parse(stringExtra);
                bundle = e0.E(uri.getQuery());
                bundle.putAll(e0.E(uri.getFragment()));
            } else {
                bundle = new Bundle();
            }
            Intent intent2 = getIntent();
            n.e(intent2, "intent");
            Intent intentF = z.f(intent2, bundle, null);
            if (intentF != null) {
                intent = intentF;
            }
            setResult(i10, intent);
        } else {
            Intent intent3 = getIntent();
            n.e(intent3, "intent");
            setResult(i10, z.f(intent3, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        int i10;
        k0 k0Var;
        boolean z10;
        Uri uriA;
        super.onCreate(bundle);
        if ("CustomTabActivity.action_customTabRedirect".equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null || (stringExtra = getIntent().getStringExtra("CustomTabMainActivity.extra_action")) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra("CustomTabMainActivity.extra_params");
        String stringExtra2 = getIntent().getStringExtra("CustomTabMainActivity.extra_chromePackage");
        String stringExtra3 = getIntent().getStringExtra("CustomTabMainActivity.extra_targetApp");
        int[] iArrD = i.d(2);
        int length = iArrD.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i10 = 1;
                break;
            }
            i10 = iArrD[i11];
            if (d.e(i10).equals(stringExtra3)) {
                break;
            } else {
                i11++;
            }
        }
        if (l.f45183a[i.c(i10)] == 1) {
            k0Var = new v(bundleExtra, stringExtra);
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            if (stringExtra.equals("oauth")) {
                uriA = e0.a(f.f(), bundleExtra, "oauth/authorize");
            } else {
                uriA = e0.a(f.f(), bundleExtra, s.e() + "/dialog/" + stringExtra);
            }
            if (!a.b(k0Var)) {
                try {
                    k0Var.f47269b = uriA;
                } catch (Throwable th2) {
                    a.a(k0Var, th2);
                }
            }
        } else {
            k0Var = new k0(bundleExtra, stringExtra);
        }
        if (a.b(k0Var)) {
            z10 = false;
        } else {
            try {
                ReentrantLock reentrantLock = b.f54219b;
                reentrantLock.lock();
                reentrantLock.unlock();
                u.i iVarA = new h(null).a();
                iVarA.f51639a.setPackage(stringExtra2);
                try {
                    iVarA.a(this, (Uri) k0Var.f47269b);
                    z10 = true;
                } catch (ActivityNotFoundException unused) {
                    z10 = false;
                }
            } catch (Throwable th3) {
                a.a(k0Var, th3);
            }
        }
        this.f10566a = false;
        if (!z10) {
            setResult(0, getIntent().putExtra("CustomTabMainActivity.no_activity_exception", true));
            finish();
        } else {
            c cVar = new c(this, 13);
            this.f10567b = cVar;
            LocalBroadcastManager.getInstance(this).registerReceiver(cVar, new IntentFilter("CustomTabActivity.action_customTabRedirect"));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        n.f(intent, "intent");
        super.onNewIntent(intent);
        if ("CustomTabMainActivity.action_refresh".equals(intent.getAction())) {
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent("CustomTabActivity.action_destroy"));
            a(intent, -1);
        } else if ("CustomTabActivity.action_customTabRedirect".equals(intent.getAction())) {
            a(intent, -1);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f10566a) {
            a(null, 0);
        }
        this.f10566a = true;
    }
}
