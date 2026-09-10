package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.Utf8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3046h5 implements InterfaceC2929a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3078j5 f23656a;

    public C3046h5(C3078j5 c3078j5) {
        this.f23656a = c3078j5;
    }

    public final void a(String expandInput, Z3 inputType, float f, boolean z2, long j, R6 r6) {
        String adType;
        String creativeId;
        String impressionId;
        Y3 y3;
        Intrinsics.f(expandInput, "expandInput");
        Intrinsics.f(inputType, "inputType");
        C3078j5 c3078j5 = this.f23656a;
        Activity activity = (Activity) c3078j5.f23715a.get();
        if (activity == null) {
            return;
        }
        if (c3078j5.f23718e == null) {
            Y3 y4 = new Y3(activity);
            InterfaceC3333z5 interfaceC3333z5 = c3078j5.f23719h;
            if (interfaceC3333z5 != null) {
                y4.setLogger(interfaceC3333z5);
            }
            y4.setId(65518);
            y4.setEmbeddedBrowserUpdateListener(c3078j5.f23720i);
            c3078j5.f23718e = y4;
        }
        InterfaceC3295x interfaceC3295x = c3078j5.f23716b;
        if ((interfaceC3295x instanceof GestureDetectorOnGestureListenerC3005ec) && (y3 = c3078j5.f23718e) != null) {
            y3.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC3005ec) interfaceC3295x).getListener());
        }
        Y3 y5 = c3078j5.f23718e;
        if (y5 != null) {
            InterfaceC3295x interfaceC3295x2 = c3078j5.f23716b;
            if (interfaceC3295x2 == null || (adType = interfaceC3295x2.getAdType()) == null) {
                adType = "banner";
            }
            String str = adType;
            InterfaceC3295x interfaceC3295x3 = c3078j5.f23716b;
            String str2 = (interfaceC3295x3 == null || (impressionId = interfaceC3295x3.getImpressionId()) == null) ? "" : impressionId;
            InterfaceC3295x interfaceC3295x4 = c3078j5.f23716b;
            String str3 = (interfaceC3295x4 == null || (creativeId = interfaceC3295x4.getCreativeId()) == null) ? "" : creativeId;
            if (y5.f23365c == null) {
                Context context = y5.getContext();
                Intrinsics.e(context, "getContext(...)");
                C3045h4 c3045h4 = new C3045h4(context, j, str, str2, str3, new X3(y5), y5.f);
                y5.f23365c = c3045h4;
                c3045h4.setId(65517);
            }
            C3045h4 c3045h5 = y5.f23365c;
            if (c3045h5 != null) {
                c3045h5.setLandingPageTelemetryControlInfo(r6);
            }
            if (y5.f23364b != expandInput.hashCode()) {
                if (inputType == Z3.URL) {
                    C3045h4 c3045h6 = y5.f23365c;
                    if (c3045h6 != null) {
                        c3045h6.loadUrl(expandInput);
                    }
                } else {
                    C3045h4 c3045h7 = y5.f23365c;
                    if (c3045h7 != null) {
                        c3045h7.loadData(expandInput, "text/html", "UTF-8");
                    }
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                layoutParams.addRule(2, Utf8.REPLACEMENT_CODE_POINT);
                C3045h4 c3045h8 = y5.f23365c;
                if (c3045h8 != null) {
                    c3045h8.setLayoutParams(layoutParams);
                }
                if (y5.findViewById(65517) == null) {
                    y5.addView(y5.f23365c, layoutParams);
                }
            }
            y5.f23364b = expandInput.hashCode();
            if (!z2) {
                View viewFindViewById = y5.findViewById(Utf8.REPLACEMENT_CODE_POINT);
                if (viewFindViewById != null) {
                    y5.removeView(viewFindViewById);
                }
            } else if (y5.findViewById(Utf8.REPLACEMENT_CODE_POINT) == null) {
                float f2 = U3.d().f23294c;
                LinearLayout linearLayout = new LinearLayout(y5.getContext());
                linearLayout.setOrientation(0);
                linearLayout.setId(Utf8.REPLACEMENT_CODE_POINT);
                linearLayout.setWeightSum(100.0f);
                linearLayout.setBackgroundResource(R.drawable.bottom_bar);
                linearLayout.setBackgroundColor(-7829368);
                y5.setBackgroundColor(-7829368);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48 * f2));
                layoutParams2.addRule(12);
                y5.addView(linearLayout, layoutParams2);
                if (B2.a(y5.f23363a)) {
                    Df df = y5.g;
                    if (df != null) {
                        df.a();
                    }
                    y5.g = new Df(y5.f23363a, new W3(layoutParams2), y5.f);
                }
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams3.weight = 25.0f;
                y5.b(linearLayout, layoutParams3);
                y5.d(linearLayout, layoutParams3);
                y5.a(linearLayout, layoutParams3);
                y5.c(linearLayout, layoutParams3);
            }
        }
        float f3 = 1 - f;
        c3078j5.g = f3;
        P p2 = c3078j5.f23717c;
        if (p2 != null) {
            p2.f23057c = f3;
            p2.e();
        }
        c3078j5.c();
    }
}
