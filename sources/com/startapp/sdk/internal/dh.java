package com.startapp.sdk.internal;

import android.os.Handler;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class dh implements lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f40914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hh f40915b;

    public dh(Handler handler, hh hhVar) {
        this.f40914a = handler;
        this.f40915b = hhVar;
    }

    public static void a(hh hhVar) {
        if (jh.v == 1) {
            jh.v = 2;
        }
        hhVar.getClass();
        WeakHashMap weakHashMap = vi.f41589a;
        hhVar.d = true;
        boolean z2 = hhVar.f41066e;
        if (z2 && z2 && !hhVar.f41064b) {
            hhVar.f41064b = true;
            h0.a(hhVar.f41063a);
        }
    }

    public final void b() {
        this.f40914a.post(new C(this.f40915b, 1));
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z2) {
        b();
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a() {
        b();
    }
}
