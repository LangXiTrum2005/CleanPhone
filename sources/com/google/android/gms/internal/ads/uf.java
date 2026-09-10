package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uf extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20746b;

    public /* synthetic */ uf(Object obj, int i10) {
        this.f20745a = i10;
        this.f20746b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f20745a) {
            case 1:
                ((f00) this.f20746b).f14143p.set(true);
                break;
            case 2:
                sx0 sx0Var = (sx0) this.f20746b;
                sx0Var.getClass();
                if (((Boolean) zzba.zzc().a(am.C)).booleanValue()) {
                    sx0Var.a(true);
                }
                break;
            case 3:
                ((zx0) this.f20746b).b(true);
                break;
            case 4:
            case 6:
            default:
                super.onAvailable(network);
                break;
            case 5:
                ei.a aVar = (ei.a) this.f20746b;
                aVar.f40098c.post(new com.unity3d.services.ads.operation.show.b(8, aVar, od.c.h(((ConnectivityManager) aVar.f40096a.f47386b).getNetworkCapabilities(network))));
                break;
            case 7:
                a7.p.f().post(new com.adjust.sdk.f0(5, this, true));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f20745a) {
            case 0:
                synchronized (vf.class) {
                    ((vf) this.f20746b).f21157b = networkCapabilities;
                    break;
                }
                return;
            case 1:
            case 2:
            case 3:
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
            case 4:
                s61 s61Var = (s61) this.f20746b;
                synchronized (s61Var) {
                    s61Var.f19880c = networkCapabilities;
                    break;
                }
                return;
            case 5:
                ei.a aVar = (ei.a) this.f20746b;
                aVar.f40096a.getClass();
                aVar.f40098c.post(new com.unity3d.services.ads.operation.show.b(8, aVar, od.c.h(networkCapabilities)));
                return;
            case 6:
                d5.o.g().e(k5.e.f44320i, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                k5.e eVar = (k5.e) this.f20746b;
                eVar.c(eVar.f());
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f20745a) {
            case 0:
                synchronized (vf.class) {
                    ((vf) this.f20746b).f21157b = null;
                    break;
                }
                return;
            case 1:
                ((f00) this.f20746b).f14143p.set(false);
                return;
            case 2:
                sx0 sx0Var = (sx0) this.f20746b;
                sx0Var.getClass();
                if (((Boolean) zzba.zzc().a(am.C)).booleanValue()) {
                    sx0Var.a(false);
                    return;
                }
                return;
            case 3:
                ((zx0) this.f20746b).b(false);
                return;
            case 4:
                s61 s61Var = (s61) this.f20746b;
                synchronized (s61Var) {
                    s61Var.f19880c = null;
                    break;
                }
                return;
            case 5:
                ei.a aVar = (ei.a) this.f20746b;
                aVar.f40098c.postDelayed(new com.mbridge.msdk.config.component.info.provider.subprovider.f(aVar, 13), 500L);
                return;
            case 6:
                d5.o.g().e(k5.e.f44320i, "Network connection lost", new Throwable[0]);
                k5.e eVar = (k5.e) this.f20746b;
                eVar.c(eVar.f());
                return;
            default:
                a7.p.f().post(new com.adjust.sdk.f0(5, this, false));
                return;
        }
    }

    public uf(f00 f00Var) {
        this.f20745a = 1;
        Objects.requireNonNull(f00Var);
        this.f20746b = f00Var;
    }

    public uf(sx0 sx0Var) {
        this.f20745a = 2;
        Objects.requireNonNull(sx0Var);
        this.f20746b = sx0Var;
    }

    public uf(zx0 zx0Var) {
        this.f20745a = 3;
        Objects.requireNonNull(zx0Var);
        this.f20746b = zx0Var;
    }
}
