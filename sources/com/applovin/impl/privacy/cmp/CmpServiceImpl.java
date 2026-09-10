package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.impl.m0;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class CmpServiceImpl implements AppLovinCmpService, com.applovin.impl.privacy.cmp.a.InterfaceC0014a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8993a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AppLovinCmpError f8997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f8998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f8999g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8995c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f8996d = d.NONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.privacy.cmp.a f8994b = c();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppLovinCmpService.OnCompletedListener f9000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f9001b;

        /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class C0013a implements f {
            public C0013a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.f9000a.onCompleted(appLovinCmpError);
            }
        }

        public a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f9000a = onCompletedListener;
            this.f9001b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f9000a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.f9001b, new C0013a());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f9004a;

        public b(Activity activity) {
            this.f9004a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f8994b.b(this.f9004a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f9006a;

        public c(Activity activity) {
            this.f9006a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f8994b.a(this.f9006a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum d {
        NONE,
        LOADING,
        COMPLETED
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface e {
        void a(AppLovinCmpError appLovinCmpError);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface f {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(l lVar) {
        this.f8993a = lVar;
    }

    private com.applovin.impl.privacy.cmp.a c() {
        if (q7.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.f8993a);
        }
        if (!this.f8993a.y().j()) {
            return null;
        }
        p.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }

    private void d() {
        if (hasSupportedCmp()) {
            this.f8994b.c();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.f8994b != null;
    }

    public void loadCmp(Activity activity, e eVar) {
        a(activity, eVar);
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0014a
    public void onFlowHidden(Bundle bundle) {
        b((AppLovinCmpError) null);
        b();
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0014a
    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        b();
        synchronized (this.f8995c) {
            try {
                if (this.f8998f == null) {
                    this.f8996d = d.COMPLETED;
                    this.f8997e = cmpErrorImpl;
                } else {
                    this.f8996d = d.NONE;
                    a(cmpErrorImpl);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0014a
    public void onFlowLoaded(Bundle bundle) {
        synchronized (this.f8995c) {
            try {
                if (this.f8998f == null) {
                    this.f8996d = d.COMPLETED;
                } else {
                    this.f8996d = d.NONE;
                    a((AppLovinCmpError) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0014a
    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        b(cmpErrorImpl);
        b();
    }

    public void preloadCmp(Activity activity) {
        a(activity, null);
    }

    public void showCmp(Activity activity, f fVar) {
        b bVar = new b(activity);
        this.f8999g = fVar;
        if (this.f8994b.e()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(@NonNull Activity activity, @NonNull AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f8993a.Q();
        if (p.a()) {
            this.f8993a.Q().a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!this.f8993a.y().j()) {
            p.h("AppLovinCmpService", "Unable to show CMP for existing user. Please enable the consent flow.");
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "Consent flow is not enabled"));
        } else if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
        } else {
            d();
            loadCmp(activity, new a(onCompletedListener, activity));
        }
    }

    @NonNull
    public String toString() {
        return "[CmpService]";
    }

    private void a(AppLovinCmpError appLovinCmpError) {
        e eVar = this.f8998f;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.f8998f = null;
        this.f8997e = null;
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        f fVar = this.f8999g;
        if (fVar == null) {
            return;
        }
        fVar.a(appLovinCmpError);
        this.f8999g = null;
    }

    private void b() {
        com.applovin.impl.privacy.cmp.a aVar = this.f8994b;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private void a(Activity activity, e eVar) {
        boolean z10;
        if (!hasSupportedCmp()) {
            if (eVar != null) {
                eVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
                return;
            }
            return;
        }
        synchronized (this.f8995c) {
            if (eVar != null) {
                try {
                    this.f8998f = eVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            d dVar = this.f8996d;
            d dVar2 = d.NONE;
            if (dVar == dVar2) {
                this.f8996d = d.LOADING;
                z10 = false;
            } else {
                if (dVar == d.LOADING) {
                    return;
                }
                this.f8996d = dVar2;
                z10 = true;
            }
            if (z10) {
                a(this.f8997e);
                return;
            }
            c cVar = new c(activity);
            if (this.f8994b.d()) {
                AppLovinSdkUtils.runOnUiThread(cVar);
            } else {
                cVar.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public m0 a() {
        return new m0(this.f8993a.y().d());
    }
}
