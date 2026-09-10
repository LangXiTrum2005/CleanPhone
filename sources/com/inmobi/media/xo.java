package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.collections.polder;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xo implements so {
    public static final WeakHashMap g = new WeakHashMap();
    public final uo a;
    public final InterfaceC3072m9 b;
    public View c;
    public final ConcurrentHashMap d;
    public final WeakReference e;
    public Df f;

    public xo(Activity activity, uo windowInsetListener, InterfaceC3072m9 interfaceC3072m9) {
        Window window;
        Intrinsics.checkNotNullParameter(windowInsetListener, "windowInsetListener");
        this.a = windowInsetListener;
        this.b = interfaceC3072m9;
        this.d = new ConcurrentHashMap();
        WeakReference weakReference = new WeakReference(activity);
        this.e = weakReference;
        C3342x5.a.getClass();
        if (!C3342x5.u()) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        Activity activity2 = (Activity) weakReference.get();
        View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            this.c = decorView;
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a("WindowInsetsHandler", "startListeningToInsets");
            }
            WeakHashMap weakHashMap = g;
            Object toVar = weakHashMap.get(decorView);
            if (toVar == null) {
                toVar = new to(decorView);
                weakHashMap.put(decorView, toVar);
            }
            Intrinsics.checkNotNullParameter(this, "listener");
            ((to) toVar).a.add(this);
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
            }
        }
    }

    public final void a(WindowInsets windowInsets) {
        try {
            Activity activity = (Activity) this.e.get();
            if (!this.a.a()) {
                InterfaceC3072m9 interfaceC3072m9 = this.b;
                if (interfaceC3072m9 != null) {
                    ((C3097n9) interfaceC3072m9).a("WindowInsetsHandler", "listener is not interested in computing insets, skipping");
                    return;
                }
                return;
            }
            if (activity == null) {
                InterfaceC3072m9 interfaceC3072m10 = this.b;
                if (interfaceC3072m10 != null) {
                    ((C3097n9) interfaceC3072m10).b("WindowInsetsHandler", "Activity is null, skipping safeArea computation");
                    return;
                }
                return;
            }
            vo voVarB = F3.a(activity) ? AbstractC3255ti.b(windowInsets) : AbstractC3255ti.a(windowInsets);
            Integer numF = J5.f();
            int iIntValue = numF != null ? numF.intValue() : J5.a(windowInsets);
            J5.a(Integer.valueOf(iIntValue));
            a(voVarB, iIntValue);
        } catch (Error e) {
            InterfaceC3072m9 interfaceC3072m11 = this.b;
            if (interfaceC3072m11 != null) {
                ((C3097n9) interfaceC3072m11).b("WindowInsetsHandler", "Error in getting safeArea " + e.getMessage());
            }
        } catch (Exception e2) {
            InterfaceC3072m9 interfaceC3072m12 = this.b;
            if (interfaceC3072m12 != null) {
                ((C3097n9) interfaceC3072m12).a("WindowInsetsHandler", "Exception in getting safeArea", e2);
            }
        }
    }

    public final void a(vo insets, int i) {
        Df orientation = Ef.a(J5.g());
        wo woVar = (wo) this.d.get(Integer.valueOf(i));
        if (woVar == null) {
            woVar = new wo();
            this.d.put(Integer.valueOf(i), woVar);
        }
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        vo voVar = (vo) woVar.a.get(orientation);
        if (voVar != null && Intrinsics.wireman(insets, voVar)) {
            InterfaceC3072m9 interfaceC3072m9 = this.b;
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a("WindowInsetsHandler", "SafeArea - Same value, no need to update");
            }
        } else {
            InterfaceC3072m9 interfaceC3072m10 = this.b;
            if (interfaceC3072m10 != null) {
                ((C3097n9) interfaceC3072m10).a("WindowInsetsHandler", "safeArea - New value, updating to KV store");
            }
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            Intrinsics.checkNotNullParameter(insets, "insets");
            woVar.a.put(orientation, insets);
            ConcurrentHashMap concurrentHashMap = this.d;
            LinkedHashMap linkedHashMap = new LinkedHashMap(polder.marial(concurrentHashMap.size()));
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((wo) entry.getValue()).a());
            }
            J5.a(linkedHashMap);
        }
        if (this.f != orientation) {
            this.f = orientation;
            uo uoVar = this.a;
            Object obj = this.d.get(Integer.valueOf(i));
            Intrinsics.beachfront(obj);
            uoVar.a(orientation, (wo) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xo(GestureDetectorOnGestureListenerC2829ci view, uo windowInsetListener, InterfaceC3072m9 interfaceC3072m9) {
        this((Activity) null, windowInsetListener, interfaceC3072m9);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsetListener, "windowInsetListener");
        C3342x5.a.getClass();
        if (!C3342x5.u()) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        this.c = view;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("WindowInsetsHandler", "startListeningToInsets");
        }
        WeakHashMap weakHashMap = g;
        Object toVar = weakHashMap.get(view);
        if (toVar == null) {
            toVar = new to(view);
            weakHashMap.put(view, toVar);
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        ((to) toVar).a.add(this);
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
        }
    }

    public final void a() {
        View view = this.c;
        if (view != null) {
            WeakHashMap weakHashMap = g;
            to toVar = (to) weakHashMap.get(view);
            if (toVar != null) {
                Intrinsics.checkNotNullParameter(this, "listener");
                toVar.a.remove(this);
                if (toVar.a.isEmpty()) {
                    toVar.a();
                    weakHashMap.remove(view);
                }
            }
            InterfaceC3072m9 interfaceC3072m9 = this.b;
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a("WindowInsetsHandler_INSTANCE", this + " destroy - " + weakHashMap.size());
            }
        }
        this.c = null;
        this.d.clear();
    }
}
