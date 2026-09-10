package com.applovin.impl.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.B;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import java.util.Objects;
import tj.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9406e;

    public /* synthetic */ c0(B b10, AdapterErrorType adapterErrorType, int i10, String str) {
        this.f9402a = 1;
        this.f9405d = b10;
        this.f9406e = adapterErrorType;
        this.f9403b = i10;
        this.f9404c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9402a) {
            case 0:
                ((m) this.f9405d).a((String) this.f9404c, this.f9403b, (String) this.f9406e);
                return;
            case 1:
                B.a((B) this.f9405d, (AdapterErrorType) this.f9406e, this.f9403b, (String) this.f9404c);
                return;
            default:
                com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f9405d;
                r8.i iVar = (r8.i) this.f9404c;
                int i10 = this.f9403b;
                Runnable runnable = (Runnable) this.f9406e;
                z8.c cVar = (z8.c) dVar.f22986f;
                try {
                    try {
                        y8.d dVar2 = (y8.d) dVar.f22983c;
                        Objects.requireNonNull(dVar2);
                        ((y8.h) cVar).o(new i0(dVar2, 11));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) dVar.f22981a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((y8.h) cVar).o(new p1.r(dVar, iVar, i10));
                        } else {
                            dVar.n(iVar, i10);
                        }
                        break;
                    } catch (z8.a unused) {
                        ((r1.s) dVar.f22984d).m(iVar, i10 + 1, false);
                    }
                    return;
                } finally {
                    runnable.run();
                }
        }
    }

    public /* synthetic */ c0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f9402a = i11;
        this.f9405d = obj;
        this.f9404c = obj2;
        this.f9403b = i10;
        this.f9406e = obj3;
    }
}
