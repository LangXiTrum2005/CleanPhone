package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3235t3 extends CustomTabsServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3267v3 f23998a;

    public C3235t3(C3267v3 c3267v3) {
        this.f23998a = c3267v3;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName name) {
        Intrinsics.f(name, "name");
        this.f23998a.f24044a = null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName name, CustomTabsClient client) {
        int iA;
        R6 r6;
        InterfaceC2995e2 interfaceC2995e2;
        Intrinsics.f(name, "name");
        Intrinsics.f(client, "client");
        C3267v3 c3267v3 = this.f23998a;
        c3267v3.f24044a = client;
        C3091k2 c3091k2 = c3267v3.f24046c;
        if (c3091k2 != null) {
            try {
                C3267v3 c3267v4 = c3091k2.f23743e;
                CustomTabsSession customTabsSessionD = c3267v4.d;
                if (customTabsSessionD == null) {
                    CustomTabsClient customTabsClient = c3267v4.f24044a;
                    customTabsSessionD = customTabsClient != null ? customTabsClient.d(new C3251u3(c3267v4)) : null;
                    c3267v4.d = customTabsSessionD;
                }
                if (customTabsSessionD != null) {
                    Bundle bundle = Bundle.EMPTY;
                    if (customTabsSessionD.b()) {
                        customTabsSessionD.e(new C3075j2(c3091k2));
                    }
                }
            } catch (RemoteException | Error unused) {
            }
            try {
                try {
                    Uri uri = Uri.parse(c3091k2.f23740a);
                    Intrinsics.e(uri, "parse(...)");
                    c3091k2.a(uri);
                } catch (Exception unused2) {
                    iA = 9;
                    r6 = c3091k2.f23742c;
                    if (r6 != null) {
                        r6.g = "EX_NATIVE";
                    }
                    if (iA != 0) {
                    }
                    interfaceC2995e2 = (InterfaceC2995e2) c3091k2.f23745i.get();
                    if (interfaceC2995e2 != null) {
                        interfaceC2995e2.a(F6.LPStartSuccess, c3091k2.f23742c, (Integer) null);
                    }
                }
            } catch (Error unused3) {
                Context context = c3091k2.f;
                String str = c3091k2.f23740a;
                Object obj = c3091k2.j.get();
                Intrinsics.c(obj);
                iA = AbstractC3330z2.a(context, str, (InterfaceC3323yb) obj, c3091k2.d);
                r6 = c3091k2.f23742c;
                if (r6 != null) {
                    r6.g = "EX_NATIVE";
                }
                if (iA != 0 || iA == 1) {
                    interfaceC2995e2 = (InterfaceC2995e2) c3091k2.f23745i.get();
                    if (interfaceC2995e2 != null) {
                        interfaceC2995e2.a(F6.LPStartSuccess, c3091k2.f23742c, (Integer) null);
                    }
                }
                InterfaceC2995e2 interfaceC2995e3 = (InterfaceC2995e2) c3091k2.f23745i.get();
                if (interfaceC2995e3 != null) {
                    interfaceC2995e3.a(F6.LPBrowserOpenFailed, c3091k2.f23742c, Integer.valueOf(iA));
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        C3267v3 c3267v3 = this.f23998a;
        c3267v3.f24044a = null;
        C3091k2 c3091k2 = c3267v3.f24046c;
        if (c3091k2 != null) {
            R6 r6 = c3091k2.f23742c;
            if (r6 != null) {
                r6.g = "IN_NATIVE";
            }
            InterfaceC2995e2 interfaceC2995e2 = (InterfaceC2995e2) c3091k2.f23745i.get();
            if (interfaceC2995e2 != null) {
                interfaceC2995e2.a(F6.LPBrowserOpenFailed, c3091k2.f23742c, (Integer) 8009);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.f(name, "name");
        this.f23998a.f24044a = null;
    }
}
