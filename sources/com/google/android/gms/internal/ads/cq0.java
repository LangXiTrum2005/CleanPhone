package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cq0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq0 f13229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ou0 f13230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f13231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f00 f13232d;

    public cq0(xq0 xq0Var, ou0 ou0Var, Context context, f00 f00Var) {
        this.f13229a = xq0Var;
        this.f13230b = ou0Var;
        this.f13231c = context;
        this.f13232d = f00Var;
    }

    public static final int b(float f10, int i10) {
        if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        return (int) Math.ceil(i10 / f10);
    }

    public static final f0.b c(f0.b bVar, float f10) {
        return f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f0.b.f40257e : f0.b.b((int) Math.ceil(bVar.f40258a / f10), (int) Math.ceil(bVar.f40259b / f10), (int) Math.ceil(bVar.f40260c / f10), (int) Math.ceil(bVar.f40261d / f10));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v3 com.google.android.gms.internal.ads.dq0, still in use, count: 4, list:
          (r1v3 com.google.android.gms.internal.ads.dq0) from 0x02e6: MOVE (r21v0 com.google.android.gms.internal.ads.dq0) = (r1v3 com.google.android.gms.internal.ads.dq0) (LINE:743)
          (r1v3 com.google.android.gms.internal.ads.dq0) from 0x01f8: MOVE (r21v3 com.google.android.gms.internal.ads.dq0) = (r1v3 com.google.android.gms.internal.ads.dq0) (LINE:505)
          (r1v3 com.google.android.gms.internal.ads.dq0) from 0x022e: MOVE (r21v6 com.google.android.gms.internal.ads.dq0) = (r1v3 com.google.android.gms.internal.ads.dq0) (LINE:559)
          (r1v3 com.google.android.gms.internal.ads.dq0) from 0x016a: MOVE (r21v7 com.google.android.gms.internal.ads.dq0) = (r1v3 com.google.android.gms.internal.ads.dq0) (LINE:363)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final com.google.android.gms.internal.ads.dq0 a() {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cq0.a():com.google.android.gms.internal.ads.dq0");
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        return zw1.z(this.f13229a.zza(), new lx(this, 3), l00.f16615h);
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        return 7;
    }
}
