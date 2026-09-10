package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Df implements yf {
    public static final WeakHashMap g = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Af f22788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3333z5 f22789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f22790c;
    public final ConcurrentHashMap d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f22791e;
    public EnumC3179pa f;

    public Df(Activity activity, Af windowInsetListener, InterfaceC3333z5 interfaceC3333z5) {
        Window window;
        Intrinsics.f(windowInsetListener, "windowInsetListener");
        this.f22788a = windowInsetListener;
        this.f22789b = interfaceC3333z5;
        this.d = new ConcurrentHashMap();
        WeakReference weakReference = new WeakReference(activity);
        this.f22791e = weakReference;
        if (!L3.f22938a.F()) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        Activity activity2 = (Activity) weakReference.get();
        View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            this.f22790c = decorView;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("WindowInsetsHandler", "startListeningToInsets");
            }
            WeakHashMap weakHashMap = g;
            Object zfVar = weakHashMap.get(decorView);
            if (zfVar == null) {
                zfVar = new zf(decorView);
                weakHashMap.put(decorView, zfVar);
            }
            ((zf) zfVar).f24168a.add(this);
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
            }
        }
    }

    public final void a(Bf insets, int i2) {
        EnumC3179pa orientation = AbstractC3195qa.a(U3.g());
        Cf cf = (Cf) this.d.get(Integer.valueOf(i2));
        if (cf == null) {
            cf = new Cf();
            this.d.put(Integer.valueOf(i2), cf);
        }
        Intrinsics.f(orientation, "orientation");
        Bf bf = (Bf) cf.f22753a.get(orientation);
        if (bf == null || !Intrinsics.a(insets, bf)) {
            InterfaceC3333z5 interfaceC3333z5 = this.f22789b;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("WindowInsetsHandler", "safeArea - New value, updating to KV store");
            }
            Intrinsics.f(insets, "insets");
            cf.f22753a.put(orientation, insets);
            ConcurrentHashMap concurrentHashMap = this.d;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(concurrentHashMap.size()));
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((Cf) entry.getValue()).a());
            }
            U3.a(linkedHashMap);
        } else {
            InterfaceC3333z5 interfaceC3333z6 = this.f22789b;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).a("WindowInsetsHandler", "SafeArea - Same value, no need to update");
            }
        }
        if (this.f != orientation) {
            this.f = orientation;
            Af af = this.f22788a;
            Object obj = this.d.get(Integer.valueOf(i2));
            Intrinsics.c(obj);
            af.a(orientation, (Cf) obj);
        }
    }

    public final void a() {
        View view = this.f22790c;
        if (view != null) {
            WeakHashMap weakHashMap = g;
            zf zfVar = (zf) weakHashMap.get(view);
            if (zfVar != null) {
                zfVar.f24168a.remove(this);
                if (zfVar.f24168a.isEmpty()) {
                    zfVar.a();
                    weakHashMap.remove(view);
                }
            }
            InterfaceC3333z5 interfaceC3333z5 = this.f22789b;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("WindowInsetsHandler_INSTANCE", this + " destroy - " + weakHashMap.size());
            }
        }
    }
}
