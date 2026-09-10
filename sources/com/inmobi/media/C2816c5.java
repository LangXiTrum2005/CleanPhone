package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import arytenoidectomy.apical;
import arytenoidectomy.competently;
import arytenoidectomy.wireman;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2816c5 extends competently {
    public final /* synthetic */ C2867e5 a;

    public C2816c5(C2867e5 c2867e5) {
        this.a = c2867e5;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a.a = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // arytenoidectomy.competently
    public final void onCustomTabsServiceConnected(ComponentName name, wireman client) {
        int iA;
        Ya ya;
        Rh rh;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(client, "client");
        C2867e5 c2867e5 = this.a;
        c2867e5.a = client;
        R2 r2 = c2867e5.c;
        if (r2 != null) {
            try {
                C2867e5 c2867e6 = r2.e;
                apical apicalVarMarial = c2867e6.d;
                if (apicalVarMarial == null) {
                    wireman wiremanVar = c2867e6.a;
                    apicalVarMarial = wiremanVar != null ? wiremanVar.marial(new C2842d5(c2867e6)) : null;
                    c2867e6.d = apicalVarMarial;
                }
                if (apicalVarMarial != null) {
                    Bundle bundle = Bundle.EMPTY;
                    if (apicalVarMarial.impromptu(bundle)) {
                        apicalVarMarial.impassible(new Q2(r2), bundle);
                    }
                }
            } catch (RemoteException | Error unused) {
            }
            try {
                try {
                    Uri uri = Uri.parse(r2.a);
                    Intrinsics.checkNotNullExpressionValue(uri, "Uri.parse(this)");
                    r2.a(uri);
                } catch (Throwable unused2) {
                    Context context = r2.f;
                    String str = r2.a;
                    Object obj = r2.j.get();
                    Intrinsics.beachfront(obj);
                    iA = AbstractC3340x3.a(context, str, (InterfaceC3105nh) obj, r2.d);
                    ya = r2.c;
                    if (ya != null) {
                        ya.f = "EX_NATIVE";
                    }
                    if (iA != 0) {
                    }
                    rh = (Rh) r2.i.get();
                    if (rh != null) {
                        J2.a(rh, Na.LPStartSuccess, r2.c);
                    }
                }
            } catch (Exception unused3) {
                iA = 9;
                ya = r2.c;
                if (ya != null) {
                    ya.f = "EX_NATIVE";
                }
                if (iA != 0 || iA == 1) {
                    rh = (Rh) r2.i.get();
                    if (rh != null) {
                        J2.a(rh, Na.LPStartSuccess, r2.c);
                    }
                }
                Rh rh2 = (Rh) r2.i.get();
                if (rh2 != null) {
                    Na landingPageFunnelState = Na.LPBrowserOpenFailed;
                    Ya ya2 = r2.c;
                    Integer numValueOf = Integer.valueOf(iA);
                    Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                    rh2.a.getLandingPageHandler().a(landingPageFunnelState, ya2, numValueOf);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        C2867e5 c2867e5 = this.a;
        c2867e5.a = null;
        R2 r2 = c2867e5.c;
        if (r2 != null) {
            Ya ya = r2.c;
            if (ya != null) {
                ya.f = "IN_NATIVE";
            }
            Rh rh = (Rh) r2.i.get();
            if (rh != null) {
                Na landingPageFunnelState = Na.LPBrowserOpenFailed;
                Ya ya2 = r2.c;
                Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                rh.a.getLandingPageHandler().a(landingPageFunnelState, ya2, (Integer) 8009);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a.a = null;
    }
}
