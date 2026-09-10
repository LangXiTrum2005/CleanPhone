package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.R;
import com.ironsource.X3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u.g f7961b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends u.k {
        public a() {
        }

        @Override // u.k
        public void onCustomTabsServiceConnected(ComponentName componentName, u.g gVar) {
            g1.this.f7960a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                g1.this.f7960a.Q().a("CustomTabsManager", "Connection successful: " + componentName);
            }
            g1.this.f7961b = gVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            g1.this.f7960a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                g1.this.f7960a.Q().a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            g1.this.f7961b = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f7963a;

        public b(com.applovin.impl.adview.a aVar) {
            this.f7963a = new WeakReference(aVar);
        }

        @Override // u.a
        public void onNavigationEvent(int i10, Bundle bundle) {
            com.applovin.impl.adview.a aVar = (com.applovin.impl.adview.a) this.f7963a.get();
            if (aVar == null) {
                g1.this.f7960a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    g1.this.f7960a.Q().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). Controller is null.");
                }
                return;
            }
            com.applovin.impl.sdk.ad.b bVarG = aVar.g();
            if (bVarG == null) {
                g1.this.f7960a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    g1.this.f7960a.Q().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        g1.this.f7960a.l().trackCustomTabsNavigationStarted(bVarG);
                    }
                    break;
                case 2:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        g1.this.f7960a.l().trackCustomTabsNavigationFinished(bVarG);
                    }
                    break;
                case 3:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        g1.this.f7960a.l().trackCustomTabsNavigationFailed(bVarG);
                    }
                    break;
                case 4:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        g1.this.f7960a.l().trackCustomTabsNavigationAborted(bVarG);
                    }
                    break;
                case 5:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        g1.this.f7960a.l().trackCustomTabsTabShown(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    v2.c(aVar.e(), bVarG, aVar.i());
                    break;
                case 6:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        g1.this.f7960a.l().trackCustomTabsTabHidden(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    v2.a(aVar.e(), bVarG, aVar.i());
                    break;
                default:
                    g1.this.f7960a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        g1.this.f7960a.Q().a("CustomTabsManager", "Unknown navigation event: " + i10);
                    }
                    break;
            }
        }

        @Override // u.a
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            g1.this.f7960a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                com.applovin.impl.sdk.p pVarQ = g1.this.f7960a.Q();
                StringBuilder sb2 = new StringBuilder("Validation ");
                sb2.append(z10 ? "succeeded" : X3.i.f27815t);
                sb2.append(" for session-URL relation(");
                sb2.append(i10);
                sb2.append("), requestedOrigin(");
                sb2.append(uri);
                sb2.append(")");
                pVarQ.a("CustomTabsManager", sb2.toString());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f7965a;

        public c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f7965a = new WeakReference(appLovinNativeAdImpl);
        }

        @Override // u.a
        public void onNavigationEvent(int i10, Bundle bundle) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) this.f7965a.get();
            if (appLovinNativeAdImpl == null) {
                g1.this.f7960a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    g1.this.f7960a.Q().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). Native ad is null.");
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f7960a.l().trackNativeAdCustomTabsNavigationStarted(appLovinNativeAdImpl);
                    }
                    break;
                case 2:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f7960a.l().trackNativeAdCustomTabsNavigationFinished(appLovinNativeAdImpl);
                    }
                    break;
                case 3:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f7960a.l().trackNativeAdCustomTabsNavigationFailed(appLovinNativeAdImpl);
                    }
                    break;
                case 4:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f7960a.l().trackNativeAdCustomTabsNavigationAborted(appLovinNativeAdImpl);
                    }
                    break;
                case 5:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f7960a.l().trackNativeAdCustomTabsTabShown(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    break;
                case 6:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f7960a.l().trackNativeAdCustomTabsTabHidden(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    break;
                default:
                    g1.this.f7960a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        g1.this.f7960a.Q().a("CustomTabsManager", "Unknown navigation event: " + i10);
                    }
                    break;
            }
        }

        @Override // u.a
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            g1.this.f7960a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                com.applovin.impl.sdk.p pVarQ = g1.this.f7960a.Q();
                StringBuilder sb2 = new StringBuilder("Validation ");
                sb2.append(z10 ? "succeeded" : X3.i.f27815t);
                sb2.append(" for session-URL relation(");
                sb2.append(i10);
                sb2.append("), requestedOrigin(");
                sb2.append(uri);
                sb2.append(")");
                pVarQ.a("CustomTabsManager", sb2.toString());
            }
        }
    }

    public g1(com.applovin.impl.sdk.l lVar) {
        this.f7960a = lVar;
    }

    public void b(List list, u.l lVar) {
        if (list.isEmpty()) {
            return;
        }
        if (lVar != null) {
            a("warmup urls", new androidx.fragment.app.d(this, list, lVar, 8));
            return;
        }
        this.f7960a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7960a.Q().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
        }
    }

    public void a() {
        if (((Boolean) this.f7960a.a(z4.f10171i7)).booleanValue() && this.f7961b == null) {
            String strB = u.g.b(com.applovin.impl.sdk.l.p(), this.f7960a.c(z4.f10180j7), true);
            String strB2 = u.g.b(com.applovin.impl.sdk.l.p(), null, false);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.f7960a.a(z4.f10189k7)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(strB2, linkedList);
                CollectionUtils.addUniqueObjectIfExists(strB, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(strB, linkedList);
                CollectionUtils.addUniqueObjectIfExists(strB2, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.f7960a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7960a.Q().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            a(linkedList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(h1 h1Var, u.l lVar) {
        u.g gVar = this.f7961b;
        gVar.getClass();
        try {
            ((c.b) gVar.f51630a).x1();
        } catch (RemoteException unused) {
        }
        if (h1Var == null) {
            return;
        }
        Integer numE = h1Var.e();
        String strB = h1Var.b();
        if (numE == null || TextUtils.isEmpty(strB)) {
            return;
        }
        if (lVar == null) {
            this.f7960a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7960a.Q().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f7960a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7960a.Q().a("CustomTabsManager", "Validating session-URL relation: " + numE + " with digital asset link: " + strB);
        }
        int iIntValue = numE.intValue();
        Uri uri = Uri.parse(strB);
        if (iIntValue < 1 || iIntValue > 2) {
            return;
        }
        try {
            ((c.b) lVar.f51642b).w1(lVar.f51643c, iIntValue, uri, new Bundle());
        } catch (RemoteException unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[DONT_GENERATE] */
    private void a(LinkedList linkedList) {
        boolean zA = false;
        try {
            zA = u.g.a(com.applovin.impl.sdk.l.p(), (String) linkedList.poll(), new a());
            if (!zA) {
                this.f7960a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7960a.Q().b("CustomTabsManager", "Custom Tabs service not available");
                }
            }
            if (zA || linkedList.isEmpty()) {
                return;
            }
            this.f7960a.Q();
            if (com.applovin.impl.sdk.p.a()) {
            }
        } catch (Throwable th2) {
            try {
                this.f7960a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7960a.Q().a("CustomTabsManager", "Failed to bind to service", th2);
                }
            } finally {
                if (!zA && !linkedList.isEmpty()) {
                    this.f7960a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f7960a.Q().a("CustomTabsManager", "Retrying with next package name...");
                    }
                    a(linkedList);
                }
            }
        }
    }

    public u.l a(com.applovin.impl.adview.a aVar) {
        if (this.f7961b == null) {
            this.f7960a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7960a.Q().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f7960a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7960a.Q().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            u.l lVarC = this.f7961b.c(new b(aVar));
            a(lVarC, aVar.g());
            return lVarC;
        } catch (Exception e10) {
            this.f7960a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7960a.Q().a("CustomTabsManager", "Failed to create Custom Tabs session", e10);
            }
            return null;
        }
    }

    public u.l a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (this.f7961b == null) {
            this.f7960a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7960a.Q().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f7960a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7960a.Q().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            u.l lVarC = this.f7961b.c(new c(appLovinNativeAdImpl));
            a(lVarC, appLovinNativeAdImpl);
            return lVarC;
        } catch (Exception e10) {
            this.f7960a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7960a.Q().a("CustomTabsManager", "Failed to create Custom Tabs session", e10);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List list, u.l lVar) {
        this.f7960a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7960a.Q().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        boolean zQ = false;
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse(str2));
            arrayList.add(bundle);
        }
        Uri uri = Uri.parse(str);
        lVar.getClass();
        try {
            zQ = ((c.b) lVar.f51642b).q(lVar.f51643c, uri, new Bundle(), arrayList);
        } catch (RemoteException unused) {
        }
        this.f7960a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7960a.Q().a("CustomTabsManager", "Warmup for URLs ".concat(zQ ? "succeeded" : X3.i.f27815t));
        }
    }

    public void a(Uri uri, com.applovin.impl.adview.a aVar, Activity activity) {
        if (aVar.h() == null) {
            this.f7960a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7960a.Q().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return;
        }
        if (a("launch uri", new bc.r(this, aVar, activity, uri, 3))) {
            this.f7960a.o0().pauseForClick();
            return;
        }
        this.f7960a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7960a.Q().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, Uri uri) {
        a(aVar, activity).a(activity, uri);
    }

    public boolean a(Uri uri, AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        if (appLovinNativeAdImpl.getCustomTabsSession() == null) {
            this.f7960a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7960a.Q().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return false;
        }
        boolean zA = a("launch uri", new bc.r(this, appLovinNativeAdImpl, activity, uri, 2));
        if (zA) {
            this.f7960a.o0().pauseForClick();
            return zA;
        }
        this.f7960a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7960a.Q().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
        return zA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity, Uri uri) {
        a(appLovinNativeAdImpl, activity).a(activity, uri);
    }

    private void a(u.l lVar, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(bVar.getCustomTabsSettings(), lVar);
    }

    private void a(u.l lVar, AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (appLovinNativeAdImpl == null || !appLovinNativeAdImpl.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(appLovinNativeAdImpl.getCustomTabsSettings(), lVar);
    }

    private void a(h1 h1Var, u.l lVar) {
        a("client warmup", new androidx.fragment.app.d(this, h1Var, lVar, 7));
    }

    private u.i a(com.applovin.impl.adview.a aVar, Activity activity) {
        com.applovin.impl.sdk.ad.b bVarG = aVar.g();
        return a(bVarG != null ? bVarG.getCustomTabsSettings() : null, bVarG != null ? bVarG.getCustomTabsHeaders() : Bundle.EMPTY, aVar.h(), activity);
    }

    private u.i a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        return a(appLovinNativeAdImpl.getCustomTabsSettings(), appLovinNativeAdImpl.getCustomTabsHeaders(), appLovinNativeAdImpl.getCustomTabsSession(), activity);
    }

    private u.i a(h1 h1Var, Bundle bundle, u.l lVar, Activity activity) {
        this.f7960a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7960a.Q().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        u.h hVar = new u.h(lVar);
        boolean zBooleanValue = ((Boolean) this.f7960a.a(z4.f10197l7)).booleanValue();
        Intent intent = hVar.f51632a;
        if (zBooleanValue) {
            hVar.f51634c = ActivityOptions.makeCustomAnimation(activity, R.anim.applovin_slide_up_animation, R.anim.applovin_slide_down_animation);
            intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(activity, R.anim.applovin_slide_up_animation, R.anim.applovin_slide_down_animation).toBundle());
        }
        if (h1Var != null) {
            Integer numH = h1Var.h();
            if (numH != null) {
                int iIntValue = numH.intValue() | (-16777216);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", iIntValue);
                hVar.f51636e = bundle2;
            }
            Integer numA = h1Var.a();
            if (numA != null) {
                int iIntValue2 = numA.intValue() | (-16777216);
                if (hVar.f51635d == null) {
                    hVar.f51635d = new SparseArray();
                }
                SparseArray sparseArray = hVar.f51635d;
                Bundle bundle3 = new Bundle();
                bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", iIntValue2);
                sparseArray.put(2, bundle3);
            }
            Boolean boolI = h1Var.i();
            if (boolI != null) {
                intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", boolI.booleanValue());
            }
            Boolean boolG = h1Var.g();
            if (boolG != null) {
                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", boolG.booleanValue() ? 1 : 0);
            }
            Boolean boolC = h1Var.c();
            if (boolC != null) {
                hVar.f51638g = boolC.booleanValue();
            }
            Integer numF = h1Var.f();
            if (numF != null) {
                int iIntValue3 = numF.intValue();
                if (iIntValue3 >= 0 && iIntValue3 <= 2) {
                    hVar.f51637f = iIntValue3;
                    if (iIntValue3 == 1) {
                        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                    } else if (iIntValue3 == 2) {
                        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                    } else {
                        intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
                    }
                } else {
                    throw new IllegalArgumentException("Invalid value for the shareState argument");
                }
            }
        }
        u.i iVarA = hVar.a();
        Intent intent2 = iVarA.f51639a;
        if (h1Var != null) {
            String strD = h1Var.d();
            if (strD != null) {
                intent2.putExtra("android.intent.extra.REFERRER", Uri.parse(strD));
            }
            if (!bundle.isEmpty()) {
                intent2.putExtra("com.android.browser.headers", bundle);
            }
        }
        return iVarA;
    }

    private void a(Uri uri, Activity activity) {
        if (((Boolean) this.f7960a.a(z4.m7)).booleanValue()) {
            n7.a(uri, activity, this.f7960a);
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_failure"), CollectionUtils.map("url", uri));
    }

    private boolean a(String str, Runnable runnable) {
        try {
            this.f7960a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7960a.Q().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f7960a.Q();
            if (!com.applovin.impl.sdk.p.a()) {
                return true;
            }
            this.f7960a.Q().a("CustomTabsManager", "Finished operation: " + str);
            return true;
        } catch (Throwable th2) {
            this.f7960a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7960a.Q().a("CustomTabsManager", "Failed to run operation: " + str, th2);
            }
            this.f7960a.E().a("CustomTabsManager", str, th2);
            return false;
        }
    }
}
