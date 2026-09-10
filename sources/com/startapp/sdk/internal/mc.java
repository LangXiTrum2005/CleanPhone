package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.common.utils.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class mc extends z1 {
    public static final Set t0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("ispCarrId", "ispCarrIdName", "isma", "root", "appSessionDuration")));
    public final int j0;
    public final int k0;
    public final boolean l0;
    public final float m0;
    public final MetaDataRequest$RequestReason n0;
    public final String o0;
    public final Pair p0;
    public final Integer q0;
    public final Boolean r0;
    public final long s0;

    public mc(Context context, vf vfVar, MetaDataRequest$RequestReason metaDataRequest$RequestReason) {
        super(2);
        this.j0 = vfVar.getInt("totalSessions", 0);
        this.k0 = (int) ((System.currentTimeMillis() - vfVar.getLong("firstSessionTime", System.currentTimeMillis())) / 86400000);
        this.m0 = vfVar.getFloat("inAppPurchaseAmount", 0.0f);
        this.l0 = vfVar.getBoolean("payingUser", false);
        this.o0 = MetaData.E().Q();
        this.n0 = metaDataRequest$RequestReason;
        this.p0 = com.startapp.sdk.adsbase.g.a();
        this.s0 = com.startapp.sdk.adsbase.g.f40661c;
        h6 h6Var = (h6) com.startapp.sdk.components.a.a(context).j.a();
        this.q0 = h6Var.c();
        this.r0 = h6Var.b();
        this.f41740Y = ((o0) com.startapp.sdk.components.a.a(context).f40742p.a()).a();
    }

    @Override // com.startapp.sdk.internal.z1
    public final Set a() {
        return t0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.z1
    public final void a(ve veVar) {
        super.a(veVar);
        veVar.a(AbstractC3396g.f40988b, AbstractC3396g.a(), true, true);
        veVar.a("totalSessions", Integer.valueOf(this.j0), true, true);
        veVar.a("daysSinceFirstSession", Integer.valueOf(this.k0), true, true);
        veVar.a("profileId", this.o0, false, true);
        boolean z2 = this.l0;
        if (z2) {
            veVar.a("payingUser", Boolean.valueOf(z2), true, true);
            veVar.a("paidAmount", Float.valueOf(this.m0), true, true);
        }
        veVar.a("reason", this.n0, true, true);
        veVar.a(com.smartdigimkt.o1.b.y3, this.q0, false, true);
        veVar.a("apc", this.r0, false, true);
        veVar.a("testAdsEnabled", ih.f41097a.t ? Boolean.TRUE : null, false, true);
        veVar.a("apkHash", null, false, true);
        veVar.a("ian", null, false, true);
        Pair pair = this.p0;
        veVar.a((String) pair.first, pair.second, false, true);
        long j = this.s0;
        if (j != 0) {
            veVar.a("firstInstalledAppTS", Long.valueOf(j), false, true);
        }
    }
}
