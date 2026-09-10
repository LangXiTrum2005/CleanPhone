package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.h1;
import com.storage.androidcleaner.R;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.p;
import l7.s;
import q7.e0;
import q7.h;
import q7.z;
import v7.a;
import y7.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public class FacebookActivity extends FragmentActivity {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f10568i = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Fragment f10569h;

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void dump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        if (a.b(this)) {
            return;
        }
        try {
            n.f(prefix, "prefix");
            n.f(writer, "writer");
            super.dump(prefix, fileDescriptor, writer, strArr);
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        n.f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.f10569h;
        if (fragment != null) {
            fragment.onConfigurationChanged(newConfig);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        Fragment fragment2;
        l7.n nVar;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!s.f45226p.get()) {
            e0.B("com.facebook.FacebookActivity", "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            n.e(applicationContext, "applicationContext");
            synchronized (s.class) {
                s.k(applicationContext);
            }
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if ("PassThrough".equals(intent.getAction())) {
            Intent requestIntent = getIntent();
            n.e(requestIntent, "requestIntent");
            Bundle bundleJ = z.j(requestIntent);
            if (a.b(z.class) || bundleJ == null) {
                nVar = null;
            } else {
                try {
                    String string = bundleJ.getString("error_type");
                    if (string == null) {
                        string = bundleJ.getString("com.facebook.platform.status.ERROR_TYPE");
                    }
                    String string2 = bundleJ.getString("error_description");
                    if (string2 == null) {
                        string2 = bundleJ.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                    }
                    nVar = (string == null || !string.equalsIgnoreCase("UserCanceled")) ? new l7.n(string2) : new p(string2);
                } catch (Throwable th2) {
                    a.a(z.class, th2);
                    nVar = null;
                }
            }
            Intent intent2 = getIntent();
            n.e(intent2, "intent");
            setResult(0, z.f(intent2, null, nVar));
            finish();
            return;
        }
        Intent intent3 = getIntent();
        h1 supportFragmentManager = F();
        n.e(supportFragmentManager, "supportFragmentManager");
        Fragment fragmentC = supportFragmentManager.C("SingleFragment");
        if (fragmentC == null) {
            if ("FacebookDialogFragment".equals(intent3.getAction())) {
                fragment = fragmentC;
                h hVar = new h();
                hVar.setRetainInstance(true);
                hVar.F(supportFragmentManager, "SingleFragment");
                fragment2 = hVar;
            } else {
                fragment = fragmentC;
                q qVar = new q();
                qVar.setRetainInstance(true);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.g(R.id.com_facebook_fragment_container, qVar, "SingleFragment");
                aVar.e();
                fragment2 = qVar;
            }
            fragment = fragment2;
        }
        fragment = fragmentC;
        this.f10569h = fragment;
    }
}
