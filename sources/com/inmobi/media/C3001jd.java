package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.webkit.URLUtil;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3001jd {
    public final C3026kd a;
    public long b;
    public String c;
    public String d;
    public final Ua e;

    public C3001jd(C3026kd landingPageModel) {
        Intrinsics.checkNotNullParameter(landingPageModel, "landingPageModel");
        this.a = landingPageModel;
        C2952hd c2952hd = new C2952hd(this);
        C2977id c2977id = new C2977id(this);
        this.e = new Ua(landingPageModel.a, new Va(false, landingPageModel.d.i, landingPageModel.b.a.b.getCctEnabled(), 16), c2952hd, c2977id, landingPageModel.d, landingPageModel.g, 128);
    }

    public final void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.b = jElapsedRealtime;
        InterfaceC3072m9 interfaceC3072m9 = this.a.g;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("PublisherViewClickHandler", "handleLandingPageUrl: viewTouchTimestamp=" + jElapsedRealtime + ", lastClickedAssetUrl=" + this.c);
        }
        String str = this.c;
        if (str != null) {
            a(str, this.d);
        }
    }

    public final void b(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC3072m9 interfaceC3072m9 = this.a.g;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("PublisherViewClickHandler", "handleNativeAssetClickUrl: url=" + url + ", fallbackUrl=" + str);
        }
        this.c = url;
        this.d = str;
        C3026kd c3026kd = this.a;
        if (c3026kd.b.a.a.f) {
            InterfaceC3072m9 interfaceC3072m10 = c3026kd.g;
            if (interfaceC3072m10 != null) {
                ((C3097n9) interfaceC3072m10).a("PublisherViewClickHandler", "Lock screen ad clicked, firing callback only");
            }
            ((AbstractC2938h) this.a.f).a(seminary.taiyuan());
            return;
        }
        InterfaceC3072m9 interfaceC3072m11 = c3026kd.g;
        if (interfaceC3072m11 != null) {
            ((C3097n9) interfaceC3072m11).a("PublisherViewClickHandler", "Firing onAdClicked callback and handling landing page URL");
        }
        ((AbstractC2938h) this.a.f).a(seminary.taiyuan());
        a();
    }

    public final void a(String str, String str2) {
        InterfaceC3072m9 interfaceC3072m9 = this.a.g;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("PublisherViewClickHandler", "handleLandingPageUrl: processing url=" + str + ", isNetworkUrl=" + URLUtil.isNetworkUrl(str));
        }
        Ta taA = Ua.a(this.e, "nativeOpen", (String) null, str, (Ya) null, 24);
        InterfaceC3072m9 interfaceC3072m10 = this.a.g;
        if (interfaceC3072m10 != null) {
            ((C3097n9) interfaceC3072m10).a("PublisherViewClickHandler", "processOpenRequest result: " + taA.a);
        }
        if (taA.a == 1) {
            InterfaceC3072m9 interfaceC3072m11 = this.a.g;
            if (interfaceC3072m11 != null) {
                ((C3097n9) interfaceC3072m11).a("PublisherViewClickHandler", "Redirection resolved successfully");
                return;
            }
            return;
        }
        if (str2 != null) {
            InterfaceC3072m9 interfaceC3072m12 = this.a.g;
            if (interfaceC3072m12 != null) {
                ((C3097n9) interfaceC3072m12).a("PublisherViewClickHandler", "Primary URL failed, trying fallback URL: " + str2);
            }
            a(str2, null);
            return;
        }
        InterfaceC3072m9 interfaceC3072m13 = this.a.g;
        if (interfaceC3072m13 != null) {
            ((C3097n9) interfaceC3072m13).b("PublisherViewClickHandler", "Landing Page Handling Failed - no fallback URL available");
        }
    }

    public final void b() {
        C3026kd c3026kd = this.a;
        InterfaceC3072m9 interfaceC3072m9 = c3026kd.g;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("PublisherViewClickHandler", "takeAction called, isLockScreen=" + c3026kd.b.a.a.f);
        }
        if (this.a.b.a.a.f) {
            a();
        }
    }

    public final void a(Intent intent) {
        C3026kd c3026kd = this.a;
        InterfaceC3072m9 interfaceC3072m9 = c3026kd.g;
        if (interfaceC3072m9 != null) {
            G g = c3026kd.b;
            ((C3097n9) interfaceC3072m9).a("PublisherViewClickHandler", "openEmbeddedBrowser: creativeId=" + g.e + ", placementId=" + g.a.a.a);
        }
        intent.putExtra("creativeId", this.a.b.e);
        intent.putExtra("impressionId", this.a.b.m.b);
        intent.putExtra("placementId", this.a.b.a.a.a);
        intent.putExtra("supportLockScreen", this.a.c);
        Context context = Ji.a;
        Context context2 = this.a.a;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!(context2 instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context2.startActivity(intent);
        InterfaceC3072m9 interfaceC3072m10 = this.a.g;
        if (interfaceC3072m10 != null) {
            ((C3097n9) interfaceC3072m10).a("PublisherViewClickHandler", "Embedded browser activity started");
        }
    }
}
