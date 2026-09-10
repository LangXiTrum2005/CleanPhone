package com.inmobi.media;

import android.os.Bundle;
import arytenoidectomy.dern;
import org.json.JSONException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2842d5 extends dern {
    public final /* synthetic */ C2867e5 a;

    public C2842d5(C2867e5 c2867e5) {
        this.a = c2867e5;
    }

    @Override // arytenoidectomy.dern
    public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle extras) throws JSONException {
        Intrinsics.checkNotNullParameter(extras, "extras");
        super.onActivityLayout(i, i2, i3, i4, i5, extras);
        Intrinsics.checkNotNullExpressionValue("e5", "access$getLOG_TAG$cp(...)");
        R2 r2 = this.a.c;
        if (r2 != null) {
            r2.a(i, i2, i3, i4, i5);
        }
    }

    @Override // arytenoidectomy.dern
    public final void onNavigationEvent(int i, Bundle bundle) {
        super.onNavigationEvent(i, bundle);
        Intrinsics.checkNotNullExpressionValue("e5", "access$getLOG_TAG$cp(...)");
        R2 r2 = this.a.c;
        if (r2 != null) {
            C2893f5 c2893f5 = r2.g;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6 && c2893f5.c == null) {
                            if (c2893f5.d == 4) {
                                c2893f5.c = Boolean.TRUE;
                            } else {
                                c2893f5.c = Boolean.FALSE;
                            }
                            if (Intrinsics.wireman(c2893f5.c, Boolean.TRUE)) {
                                Rh rh = (Rh) c2893f5.e.get();
                                if (rh != null) {
                                    Na landingPageFunnelState = Na.LPCompleteSuccess;
                                    Ya ya = c2893f5.a;
                                    Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                                    rh.a.getLandingPageHandler().a(landingPageFunnelState, ya, (Integer) 8003);
                                }
                                Rh rh2 = (Rh) c2893f5.e.get();
                                if (rh2 != null) {
                                    InterfaceC3072m9 interfaceC3072m9 = rh2.a.i;
                                    if (interfaceC3072m9 != null) {
                                        String str = GestureDetectorOnGestureListenerC2829ci.g1;
                                        Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                                        ((C3097n9) interfaceC3072m9).a(str, "onCCTPageLoadedSuccessfully");
                                    }
                                    rh2.a.D();
                                }
                            } else {
                                Rh rh3 = (Rh) c2893f5.e.get();
                                if (rh3 != null) {
                                    Na landingPageFunnelState2 = Na.LPCompleteFailed;
                                    Ya ya2 = c2893f5.a;
                                    Intrinsics.checkNotNullParameter(landingPageFunnelState2, "landingPageFunnelState");
                                    rh3.a.getLandingPageHandler().a(landingPageFunnelState2, ya2, (Integer) 8005);
                                }
                            }
                        }
                    } else if (c2893f5.c == null) {
                        c2893f5.c = Boolean.FALSE;
                        Rh rh4 = (Rh) c2893f5.e.get();
                        if (rh4 != null) {
                            Na landingPageFunnelState3 = Na.LPCompleteFailed;
                            Ya ya3 = c2893f5.a;
                            Intrinsics.checkNotNullParameter(landingPageFunnelState3, "landingPageFunnelState");
                            rh4.a.getLandingPageHandler().a(landingPageFunnelState3, ya3, (Integer) 8004);
                        }
                    }
                } else if (c2893f5.c == null) {
                    c2893f5.c = Boolean.TRUE;
                    Rh rh5 = (Rh) c2893f5.e.get();
                    if (rh5 != null) {
                        J2.a(rh5, Na.LPCompleteSuccess, c2893f5.a);
                    }
                    Rh rh6 = (Rh) c2893f5.e.get();
                    if (rh6 != null) {
                        InterfaceC3072m9 interfaceC3072m10 = rh6.a.i;
                        if (interfaceC3072m10 != null) {
                            String str2 = GestureDetectorOnGestureListenerC2829ci.g1;
                            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$cp(...)");
                            ((C3097n9) interfaceC3072m10).a(str2, "onCCTPageLoadedSuccessfully");
                        }
                        rh6.a.D();
                    }
                }
            } else if (!c2893f5.b) {
                c2893f5.b = true;
                Rh rh7 = (Rh) c2893f5.e.get();
                if (rh7 != null) {
                    J2.a(rh7, Na.LPPageStart, c2893f5.a);
                }
            }
            c2893f5.d = i;
            if (i == 1) {
                Rh rh8 = (Rh) r2.i.get();
                if (rh8 != null) {
                    GestureDetectorOnGestureListenerC2829ci.e1.getClass();
                    rh8.a(Mh.a("IN_NATIVE_BROWSER", "onPageStart"));
                    return;
                }
                return;
            }
            if (i == 4) {
                Rh rh9 = (Rh) r2.i.get();
                if (rh9 != null) {
                    GestureDetectorOnGestureListenerC2829ci.e1.getClass();
                    rh9.a(Mh.a("IN_NATIVE_BROWSER", "onNavigatingAway"));
                    return;
                }
                return;
            }
            if (i == 5) {
                Rh rh10 = (Rh) r2.i.get();
                if (rh10 != null) {
                    GestureDetectorOnGestureListenerC2829ci.e1.getClass();
                    rh10.a(Mh.a("IN_NATIVE_BROWSER", "onVisible"));
                }
                Rh rh11 = (Rh) r2.i.get();
                if (rh11 != null) {
                    InterfaceC3072m9 interfaceC3072m11 = rh11.a.i;
                    if (interfaceC3072m11 != null) {
                        String str3 = GestureDetectorOnGestureListenerC2829ci.g1;
                        Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$cp(...)");
                        ((C3097n9) interfaceC3072m11).a(str3, "onCCTScreenDisplayed");
                    }
                    rh11.a.getListener().f(rh11.a);
                    rh11.a.b((String) null, (String) null, (String) null);
                    return;
                }
                return;
            }
            if (i != 6) {
                return;
            }
            Rh rh12 = (Rh) r2.i.get();
            if (rh12 != null) {
                GestureDetectorOnGestureListenerC2829ci.e1.getClass();
                rh12.a(Mh.a("IN_NATIVE_BROWSER", "onHidden"));
            }
            Rh rh13 = (Rh) r2.i.get();
            if (rh13 != null) {
                InterfaceC3072m9 interfaceC3072m12 = rh13.a.i;
                if (interfaceC3072m12 != null) {
                    String str4 = GestureDetectorOnGestureListenerC2829ci.g1;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$cp(...)");
                    ((C3097n9) interfaceC3072m12).a(str4, "onCCTScreenDismissed");
                }
                rh13.a.W();
            }
        }
    }
}
