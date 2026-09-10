package com.inmobi.media;

import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class S4 {
    public static final P4 k = new P4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f23161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23163c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23164e;
    public final InterfaceC3333z5 f;
    public C3030g5 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public X4 f23165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f23166i = new LinkedHashMap();
    public final Q4 j = new Q4(this);

    public S4(byte b2, String str, int i2, int i3, int i4, InterfaceC3333z5 interfaceC3333z5) {
        this.f23161a = b2;
        this.f23162b = str;
        this.f23163c = i2;
        this.d = i3;
        this.f23164e = i4;
        this.f = interfaceC3333z5;
    }

    public final void a(View view) {
        C3030g5 c3030g5;
        Intrinsics.f(view, "view");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (Intrinsics.a(this.f23162b, "video") || Intrinsics.a(this.f23162b, "audio") || (c3030g5 = this.g) == null) {
            return;
        }
        c3030g5.f23625a.remove(view);
        c3030g5.f23626b.remove(view);
        c3030g5.f23627c.a(view);
        if (c3030g5.f23625a.isEmpty()) {
            InterfaceC3333z5 interfaceC3333z6 = this.f;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).a("HtmlAdTracker", "Impression tracker is free, removing it");
            }
            C3030g5 c3030g6 = this.g;
            if (c3030g6 != null) {
                c3030g6.f23625a.clear();
                c3030g6.f23626b.clear();
                c3030g6.f23627c.a();
                c3030g6.f23628e.removeMessages(0);
                c3030g6.f23627c.b();
            }
            this.g = null;
        }
    }

    public final void b(View view) {
        Intrinsics.f(view, "view");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        X4 x4 = this.f23165h;
        if (x4 != null) {
            x4.a(view);
            if (x4.f23791a.isEmpty()) {
                InterfaceC3333z5 interfaceC3333z6 = this.f;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                X4 x5 = this.f23165h;
                if (x5 != null) {
                    x5.b();
                }
                this.f23165h = null;
            }
        }
        this.f23166i.remove(view);
    }

    public final void a(View view, View token, ef listener, AdConfig.ViewabilityConfig config, boolean z2) {
        int companionVisibilityMinPercentageViewed;
        Intrinsics.f(view, "view");
        Intrinsics.f(token, "token");
        Intrinsics.f(listener, "listener");
        Intrinsics.f(config, "config");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("HtmlAdTracker", "startTrackingForVisibility");
        }
        X4 x4 = this.f23165h;
        if (x4 == null) {
            if (z2) {
                x4 = new D2(config, this.f);
            } else {
                x4 = new X4(config, (byte) 1, this.f);
            }
            this.f23165h = x4;
        }
        R4 r4 = new R4(this);
        InterfaceC3333z5 interfaceC3333z6 = x4.f23794e;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        x4.j = r4;
        this.f23166i.put(view, listener);
        if (z2) {
            companionVisibilityMinPercentageViewed = config.getCompanionVisibilityMinPercentageViewed();
        } else {
            companionVisibilityMinPercentageViewed = this.f23164e;
        }
        x4.a(view, token, companionVisibilityMinPercentageViewed);
    }
}
