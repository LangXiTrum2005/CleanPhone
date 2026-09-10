package com.inmobi.media;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3251u3 extends CustomTabsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3267v3 f24019a;

    public C3251u3(C3267v3 c3267v3) {
        this.f24019a = c3267v3;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onActivityLayout(int i2, int i3, int i4, int i5, int i6, Bundle extras) {
        InterfaceC2995e2 interfaceC2995e2;
        Intrinsics.f(extras, "extras");
        super.onActivityLayout(i2, i3, i4, i5, i6, extras);
        C3091k2 c3091k2 = this.f24019a.f24046c;
        if (c3091k2 == null || (interfaceC2995e2 = (InterfaceC2995e2) c3091k2.f23745i.get()) == null) {
            return;
        }
        interfaceC2995e2.a(i2, i3, i4, i5, i6);
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i2, Bundle bundle) {
        C3091k2 c3091k2 = this.f24019a.f24046c;
        if (c3091k2 != null) {
            C3283w3 c3283w3 = c3091k2.g;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 6 && c3283w3.f24069c == null) {
                            if (c3283w3.d == 4) {
                                c3283w3.f24069c = Boolean.TRUE;
                            } else {
                                c3283w3.f24069c = Boolean.FALSE;
                            }
                            if (Intrinsics.a(c3283w3.f24069c, Boolean.TRUE)) {
                                InterfaceC2995e2 interfaceC2995e2 = (InterfaceC2995e2) c3283w3.f24070e.get();
                                if (interfaceC2995e2 != null) {
                                    interfaceC2995e2.a(F6.LPCompleteSuccess, c3283w3.f24067a, (Integer) 8003);
                                }
                                InterfaceC2995e2 interfaceC2995e3 = (InterfaceC2995e2) c3283w3.f24070e.get();
                                if (interfaceC2995e3 != null) {
                                    interfaceC2995e3.c();
                                }
                            } else {
                                InterfaceC2995e2 interfaceC2995e4 = (InterfaceC2995e2) c3283w3.f24070e.get();
                                if (interfaceC2995e4 != null) {
                                    interfaceC2995e4.a(F6.LPCompleteFailed, c3283w3.f24067a, (Integer) 8005);
                                }
                            }
                        }
                    } else if (c3283w3.f24069c == null) {
                        c3283w3.f24069c = Boolean.FALSE;
                        InterfaceC2995e2 interfaceC2995e5 = (InterfaceC2995e2) c3283w3.f24070e.get();
                        if (interfaceC2995e5 != null) {
                            interfaceC2995e5.a(F6.LPCompleteFailed, c3283w3.f24067a, (Integer) 8004);
                        }
                    }
                } else if (c3283w3.f24069c == null) {
                    c3283w3.f24069c = Boolean.TRUE;
                    InterfaceC2995e2 interfaceC2995e6 = (InterfaceC2995e2) c3283w3.f24070e.get();
                    if (interfaceC2995e6 != null) {
                        interfaceC2995e6.a(F6.LPCompleteSuccess, c3283w3.f24067a, (Integer) null);
                    }
                    InterfaceC2995e2 interfaceC2995e7 = (InterfaceC2995e2) c3283w3.f24070e.get();
                    if (interfaceC2995e7 != null) {
                        interfaceC2995e7.c();
                    }
                }
            } else if (!c3283w3.f24068b) {
                c3283w3.f24068b = true;
                InterfaceC2995e2 interfaceC2995e8 = (InterfaceC2995e2) c3283w3.f24070e.get();
                if (interfaceC2995e8 != null) {
                    interfaceC2995e8.a(F6.LPPageStart, c3283w3.f24067a, (Integer) null);
                }
            }
            c3283w3.d = i2;
            if (i2 == 1) {
                InterfaceC2995e2 interfaceC2995e9 = (InterfaceC2995e2) c3091k2.f23745i.get();
                if (interfaceC2995e9 != null) {
                    GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
                    interfaceC2995e9.a(Gb.a("IN_NATIVE_BROWSER", "onPageStart"));
                    return;
                }
                return;
            }
            if (i2 == 4) {
                InterfaceC2995e2 interfaceC2995e10 = (InterfaceC2995e2) c3091k2.f23745i.get();
                if (interfaceC2995e10 != null) {
                    GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
                    interfaceC2995e10.a(Gb.a("IN_NATIVE_BROWSER", "onNavigatingAway"));
                    return;
                }
                return;
            }
            if (i2 == 5) {
                InterfaceC2995e2 interfaceC2995e11 = (InterfaceC2995e2) c3091k2.f23745i.get();
                if (interfaceC2995e11 != null) {
                    GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
                    interfaceC2995e11.a(Gb.a("IN_NATIVE_BROWSER", "onVisible"));
                }
                InterfaceC2995e2 interfaceC2995e12 = (InterfaceC2995e2) c3091k2.f23745i.get();
                if (interfaceC2995e12 != null) {
                    interfaceC2995e12.b();
                    return;
                }
                return;
            }
            if (i2 != 6) {
                return;
            }
            InterfaceC2995e2 interfaceC2995e13 = (InterfaceC2995e2) c3091k2.f23745i.get();
            if (interfaceC2995e13 != null) {
                GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
                interfaceC2995e13.a(Gb.a("IN_NATIVE_BROWSER", "onHidden"));
            }
            InterfaceC2995e2 interfaceC2995e14 = (InterfaceC2995e2) c3091k2.f23745i.get();
            if (interfaceC2995e14 != null) {
                interfaceC2995e14.a();
            }
        }
    }
}
