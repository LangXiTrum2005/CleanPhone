package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class C9 extends AbstractC3209r9 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D9 f22740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9(D9 d9) {
        super(d9);
        this.f22740e = d9;
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final View a(Context context) {
        Intrinsics.f(context, "context");
        try {
            Context applicationContext = context.getApplicationContext();
            tf tfVar = new tf(null);
            Cc cc = new Cc("adUnit", "default");
            Intrinsics.c(applicationContext);
            return new GestureDetectorOnGestureListenerC3005ec(applicationContext, (byte) 0, null, null, false, null, 0L, null, null, cc, tfVar, null, 252);
        } catch (Exception e2) {
            HashMap map = D9.f22775c;
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
            return null;
        }
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final void a(View view, C2984d8 asset, AdConfig adConfig) {
        Intrinsics.f(view, "view");
        Intrinsics.f(asset, "asset");
        Intrinsics.f(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof GestureDetectorOnGestureListenerC3005ec) {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) view;
            this.f22740e.getClass();
            try {
                F9 f9 = asset instanceof F9 ? (F9) asset : null;
                gestureDetectorOnGestureListenerC3005ec.a(GestureDetectorOnGestureListenerC3005ec.Z0, adConfig);
                InterfaceC3333z5 interfaceC3333z5 = gestureDetectorOnGestureListenerC3005ec.f23587i;
                if (interfaceC3333z5 != null) {
                    String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z5).a(TAG, "disableUrlsToOpenInExternalApp " + gestureDetectorOnGestureListenerC3005ec);
                }
                gestureDetectorOnGestureListenerC3005ec.y = true;
                Object obj = asset.f23516e;
                String str = obj instanceof String ? (String) obj : null;
                String str2 = f9 != null ? f9.y : null;
                if (str2 != null) {
                    int iHashCode = str2.hashCode();
                    if (iHashCode == -1081286672) {
                        if (!str2.equals("REF_IFRAME")) {
                        }
                        gestureDetectorOnGestureListenerC3005ec.e(str);
                        return;
                    }
                    if (iHashCode == 84303) {
                        if (!str2.equals("URL")) {
                        }
                        gestureDetectorOnGestureListenerC3005ec.e(str);
                        return;
                    } else if (iHashCode != 2228139) {
                        if (iHashCode != 83774455 || !str2.equals("REF_HTML")) {
                        }
                        gestureDetectorOnGestureListenerC3005ec.d(str);
                        return;
                    } else {
                        if (!str2.equals("HTML")) {
                        }
                        gestureDetectorOnGestureListenerC3005ec.d(str);
                        return;
                    }
                }
                gestureDetectorOnGestureListenerC3005ec.e(str);
            } catch (Exception e2) {
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e2, "event"));
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final void a(View view) {
        Intrinsics.f(view, "view");
        if (!(view instanceof GestureDetectorOnGestureListenerC3005ec) || ((GestureDetectorOnGestureListenerC3005ec) view).h0) {
            return;
        }
        super.a(view);
    }
}
