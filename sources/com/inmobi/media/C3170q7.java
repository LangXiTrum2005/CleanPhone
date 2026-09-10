package com.inmobi.media;

import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.q7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3170q7 {
    public static final C3095n7 k = new C3095n7();
    public final byte a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final InterfaceC3072m9 f;
    public J8 g;
    public T7 h;
    public final LinkedHashMap i = new LinkedHashMap();
    public final C3120o7 j = new C3120o7(this);

    public C3170q7(byte b, String str, int i, int i2, int i3, InterfaceC3072m9 interfaceC3072m9) {
        this.a = b;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = interfaceC3072m9;
    }

    public final void a(View view) {
        J8 j8;
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC3072m9 interfaceC3072m9 = this.f;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (Intrinsics.wireman(this.b, "video") || Intrinsics.wireman(this.b, "audio") || (j8 = this.g) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        j8.a.remove(view);
        j8.b.remove(view);
        j8.c.a(view);
        if (j8.a.isEmpty()) {
            InterfaceC3072m9 interfaceC3072m10 = this.f;
            if (interfaceC3072m10 != null) {
                ((C3097n9) interfaceC3072m10).a("HtmlAdTracker", "Impression tracker is free, removing it");
            }
            J8 j9 = this.g;
            if (j9 != null) {
                j9.a.clear();
                j9.b.clear();
                j9.c.a();
                j9.e.removeMessages(0);
                j9.c.b();
            }
            this.g = null;
        }
    }

    public final void b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC3072m9 interfaceC3072m9 = this.f;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        T7 t7 = this.h;
        if (t7 != null) {
            t7.a(view);
            if (t7.a.isEmpty()) {
                InterfaceC3072m9 interfaceC3072m10 = this.f;
                if (interfaceC3072m10 != null) {
                    ((C3097n9) interfaceC3072m10).a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                T7 t8 = this.h;
                if (t8 != null) {
                    t8.b();
                }
                this.h = null;
            }
        }
        this.i.remove(view);
    }

    public final void a(View view, View token, Ln listener, AdConfig.ViewabilityConfig config, boolean z) {
        int companionVisibilityMinPercentageViewed;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(config, "config");
        InterfaceC3072m9 interfaceC3072m9 = this.f;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("HtmlAdTracker", "startTrackingForVisibility");
        }
        T7 t7 = this.h;
        if (t7 == null) {
            if (z) {
                t7 = new S3(config, this.f);
            } else {
                t7 = new T7(config, (byte) 1, this.f);
            }
            this.h = t7;
        }
        C3145p7 c3145p7 = new C3145p7(this);
        InterfaceC3072m9 interfaceC3072m10 = t7.d;
        if (interfaceC3072m10 != null) {
            ((C3097n9) interfaceC3072m10).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        t7.h = c3145p7;
        this.i.put(view, listener);
        if (z) {
            companionVisibilityMinPercentageViewed = config.getCompanionVisibilityMinPercentageViewed();
        } else {
            companionVisibilityMinPercentageViewed = this.e;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        t7.a(view, view, token, companionVisibilityMinPercentageViewed);
    }

    public final void a() {
        InterfaceC3072m9 interfaceC3072m9 = this.f;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("HtmlAdTracker", "onActivityStarted");
        }
        J8 j8 = this.g;
        if (j8 != null) {
            String TAG = j8.d;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            for (Map.Entry entry : j8.a.entrySet()) {
                View view = (View) entry.getKey();
                H8 h8 = (H8) entry.getValue();
                T7 t7 = j8.c;
                View view2 = h8.a;
                int i = h8.b;
                t7.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                t7.a(view, view, view2, i);
            }
            if (!j8.e.hasMessages(0)) {
                j8.e.postDelayed(j8.f, j8.g);
            }
            j8.c.e();
        }
        T7 t8 = this.h;
        if (t8 != null) {
            t8.e();
        }
    }

    public final J8 a(byte b, AdConfig.ViewabilityConfig viewabilityConfig) {
        J8 j8 = this.g;
        if (j8 != null) {
            return j8;
        }
        InterfaceC3072m9 interfaceC3072m9 = this.f;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("HtmlAdTracker", "creating Visibility Tracker for " + ((int) b));
        }
        T7 t7 = new T7(viewabilityConfig, b, this.f);
        InterfaceC3072m9 interfaceC3072m10 = this.f;
        if (interfaceC3072m10 != null) {
            ((C3097n9) interfaceC3072m10).c("HtmlAdTracker", "creating Impression Tracker for " + ((int) b));
        }
        J8 j9 = new J8(viewabilityConfig, t7, this.j);
        this.g = j9;
        return j9;
    }
}
