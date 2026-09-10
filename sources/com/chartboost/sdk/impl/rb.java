package com.chartboost.sdk.impl;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.startapp.sdk.internal.C;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class rb implements dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f15014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f15015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zb f15016c;
    public final bc d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cc f15017e;
    public final hc f;
    public ec g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public jc f15018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f15019i;
    public yb j;
    public Float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f15020l;
    public final Runnable m;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15021a;

        static {
            int[] iArr = new int[gc.values().length];
            try {
                iArr[gc.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gc.SET_ORIENTATION_PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gc.UNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15021a = iArr;
        }
    }

    public rb(Context context, WebView webView, zb placementType, bc orientationProvider, cc volumeProvider, hc synchronizerTask) {
        Intrinsics.f(context, "context");
        Intrinsics.f(webView, "webView");
        Intrinsics.f(placementType, "placementType");
        Intrinsics.f(orientationProvider, "orientationProvider");
        Intrinsics.f(volumeProvider, "volumeProvider");
        Intrinsics.f(synchronizerTask, "synchronizerTask");
        this.f15014a = context;
        this.f15015b = webView;
        this.f15016c = placementType;
        this.d = orientationProvider;
        this.f15017e = volumeProvider;
        this.f = synchronizerTask;
        this.f15018h = new jc(context);
        this.f15020l = new Rect();
        C c2 = new C(this, 20);
        this.m = c2;
        synchronizerTask.a(c2);
    }

    public final void a(ab abVar) {
        za.a("MRAID command: " + abVar.a(), (Throwable) null, 2, (Object) null);
        this.f15015b.loadUrl("javascript:" + abVar.a());
    }

    public ec b() {
        return this.g;
    }

    public final boolean c() {
        ec ecVarB = b();
        if (ecVarB == null) {
            return false;
        }
        ecVarB.a(ck.MRAID_UNLOAD);
        return true;
    }

    public final void d() {
        if (this.f15018h.a().a()) {
            a(ab.f13420b.b(this.f15018h));
        }
        if (this.f15018h.b().a()) {
            a(ab.f13420b.c(this.f15018h));
        }
        if (this.f15018h.c().a()) {
            ab.a aVar = ab.f13420b;
            a(aVar.d(this.f15018h));
            a(aVar.a(this.f15018h));
        }
        if (this.f15018h.d().a()) {
            a(ab.f13420b.e(this.f15018h));
        }
    }

    public final void e() {
        ab.a aVar = ab.f13420b;
        a(aVar.b());
        a(aVar.b("9.10.2"));
        a(aVar.a(this.f15016c));
        a(aVar.a(ac.DEFAULT));
        f();
        a(aVar.a());
        this.f.start();
    }

    public final void f() {
        yb ybVarA = this.d.a();
        if (ybVarA != null && ybVarA != this.j) {
            this.j = ybVarA;
            a(ab.f13420b.a(ybVarA, this.d.isLocked()));
        }
        this.f15018h.a(this.f15015b);
        d();
        Float fA = this.f15017e.a();
        Float f = this.k;
        if (fA != null ? f == null || fA.floatValue() != f.floatValue() : f != null) {
            this.k = fA;
            a(ab.f13420b.a(fA));
        }
        boolean zA = a(this.f15015b);
        if (Boolean.valueOf(zA).equals(this.f15019i)) {
            return;
        }
        this.f15019i = Boolean.valueOf(zA);
        a(ab.f13420b.a(zA));
    }

    @Override // com.chartboost.sdk.impl.dc
    public void pause() {
        this.f.pause();
    }

    @Override // com.chartboost.sdk.impl.dc
    public void start() {
        e();
    }

    public final boolean b(Uri uri) {
        rd rdVar;
        Intrinsics.f(uri, "uri");
        ec ecVarB = b();
        if (ecVarB == null) {
            return false;
        }
        Map mapC = c(uri);
        String str = (String) mapC.get("forceOrientation");
        if (str == null) {
            return false;
        }
        String str2 = (String) mapC.get("allowOrientationChange");
        boolean z2 = str2 != null ? Boolean.parseBoolean(str2) : true;
        if (str.equals(com.ironsource.d9.h.C)) {
            rdVar = rd.LANDSCAPE_ONLY;
        } else if (str.equals(com.ironsource.d9.h.D)) {
            rdVar = rd.PORTRAIT_ONLY;
        } else {
            rdVar = z2 ? rd.ENABLE_ORIENTATION_CHANGE : rd.DISABLE_ORIENTATION_CHANGE;
        }
        ecVarB.b(rdVar);
        a(ab.f13420b.a(gc.SET_ORIENTATION_PROPERTIES));
        return true;
    }

    public final boolean a(Uri uri, boolean z2) {
        String host = uri.getHost();
        if (host == null) {
            return false;
        }
        try {
            int i2 = a.f15021a[gc.f14010c.a(host).ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return b(uri);
                }
                if (i2 == 3) {
                    return c();
                }
                throw new NoWhenBranchMatchedException();
            }
            if (z2) {
                return a(uri);
            }
            za.e("MRAID open command was not preceded with a recognized gesture.", null, 2, null);
            a(ab.f13420b.a(gc.OPEN));
            return true;
        } catch (IllegalArgumentException e2) {
            za.e("Invalid MRAID command: ".concat(host), e2);
            return true;
        }
    }

    public final Map c(Uri uri) {
        String query = uri.getQuery();
        if (query == null) {
            return EmptyMap.X;
        }
        List listJ = StringsKt.J(query, 0, 6, new String[]{com.ironsource.d9.i.f24749c});
        int iH = MapsKt.h(CollectionsKt.n(listJ, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            List listJ2 = StringsKt.J((String) it.next(), 2, 2, new String[]{com.ironsource.d9.i.f24747b});
            linkedHashMap.put((String) listJ2.get(0), listJ2.size() > 1 ? (String) listJ2.get(1) : "");
        }
        return linkedHashMap;
    }

    public final boolean d(Uri uri) {
        za.a("Attempting to open URI with Intent: " + uri, (Throwable) null, 2, (Object) null);
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        try {
            this.f15014a.startActivity(intent);
            za.a("Successfully started activity for URI: " + uri, (Throwable) null, 2, (Object) null);
            ec ecVarB = b();
            if (ecVarB != null) {
                ecVarB.a(null, ak.WEBVIEW_CLICK, true);
            }
            return true;
        } catch (ActivityNotFoundException e2) {
            za.e("No activity found to handle URI: " + uri + ". Cannot open.", e2);
            return false;
        } catch (SecurityException e3) {
            za.b("Security exception trying to open URI: " + uri, e3);
            return false;
        } catch (Exception e4) {
            za.b("Unexpected error trying to open URI: " + uri, e4);
            return false;
        }
    }

    public /* synthetic */ rb(Context context, WebView webView, zb zbVar, bc bcVar, cc ccVar, hc hcVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, webView, zbVar, (i2 & 8) != 0 ? new qb(context) : bcVar, (i2 & 16) != 0 ? new sb(context) : ccVar, (i2 & 32) != 0 ? new ic(null, 0L, null, 7, null) : hcVar);
    }

    public final boolean a(Uri uri) {
        String lowerCase;
        String str = (String) c(uri).get("url");
        if (str == null) {
            return false;
        }
        ec ecVarB = b();
        try {
            Uri uri2 = Uri.parse(str);
            String scheme = uri2.getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (!Intrinsics.a(lowerCase, "http") && !Intrinsics.a(lowerCase, HttpRequest.DEFAULT_SCHEME)) {
                za.a("MRAID open: Handling as non-standard URI (deeplink, custom scheme, etc.): " + uri2, (Throwable) null, 2, (Object) null);
                d(uri2);
            } else {
                try {
                    URL url = new URL(str);
                    if (ecVarB != null) {
                        ecVarB.a(str, ak.MRAID_OPEN, true);
                    } else {
                        za.e("MRAID open: No listener, attempting to open standard URL with Intent: " + url, null, 2, null);
                        d(uri2);
                    }
                } catch (MalformedURLException e2) {
                    za.e("MRAID open: Malformed standard URL '" + str + "', attempting to open with Intent as fallback.", e2);
                    d(uri2);
                }
            }
            a(ab.f13420b.a(gc.OPEN));
            return true;
        } catch (Exception e3) {
            za.b("MRAID open: Failed to parse 'url' parameter value as URI: '" + str + "'", e3);
            a(ab.f13420b.a(gc.OPEN));
            return true;
        }
    }

    @Override // com.chartboost.sdk.impl.dc
    public boolean a(WebResourceRequest request, boolean z2, boolean z3) {
        Intrinsics.f(request, "request");
        Uri url = request.getUrl();
        String scheme = url.getScheme();
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != -1368728362) {
                if (iHashCode == 104156535 && scheme.equals("mraid")) {
                    return a(url, z3);
                }
            } else if (scheme.equals("cb-log")) {
                String string = url.toString();
                Intrinsics.e(string, "toString(...)");
                za.c(string, null, 2, null);
                return true;
            }
        }
        if (z2) {
            return false;
        }
        try {
            URL url2 = new URL(url.toString());
            ec ecVarB = b();
            if (ecVarB != null) {
                ecVarB.a(url2.toString(), ak.WEBVIEW_CLICK, z3);
            }
        } catch (MalformedURLException e2) {
            za.a("WebView click: Malformed or non-standard URL '" + url + "', attempting to open with Intent.", e2);
            d(url);
        }
        return true;
    }

    public final boolean a(View view) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null || !view.getGlobalVisibleRect(this.f15020l)) {
            return false;
        }
        long jHeight = ((long) this.f15020l.height()) * ((long) this.f15020l.width());
        if (((long) view.getHeight()) * ((long) view.getWidth()) > 0 && jHeight > 0) {
            return view.isShown();
        }
        return false;
    }

    public static final void a(rb this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.f();
    }

    @Override // com.chartboost.sdk.impl.dc
    public void a() {
        this.f.a();
    }

    @Override // com.chartboost.sdk.impl.dc
    public void a(ec ecVar) {
        this.g = ecVar;
    }

    @Override // com.chartboost.sdk.impl.dc
    public void a(fg reason) {
        Intrinsics.f(reason, "reason");
        this.f.cancel();
    }
}
