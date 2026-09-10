package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wv0 implements zb0, qv0, yd1, p81, q81, li0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21612b;

    public /* synthetic */ wv0(zz1 zz1Var, Object obj, int i10) {
        this.f21611a = i10;
        this.f21612b = obj;
    }

    public void a(String str, kx1 kx1Var) {
        if (kx1Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        ((LinkedHashMap) this.f21612b).put(str, kx1Var);
    }

    public void b(String str, kx1 kx1Var) {
        a(str, kx1Var);
    }

    public ix1 c() {
        return new ix1((LinkedHashMap) this.f21612b);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public /* synthetic */ Iterator e(t6.l lVar, CharSequence charSequence) {
        return new l81(lVar, charSequence, (z71) this.f21612b, 0);
    }

    @Override // com.google.android.gms.internal.ads.q81
    public /* synthetic */ Object zza() {
        int i10 = fy1.f14575z;
        return (m) this.f21612b;
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
        m31 m31Var = (m31) obj;
        g31 g31Var = (g31) ((q31) this.f21612b).f18913c;
        synchronized (g31Var.f14731m) {
            ld ldVar = g31Var.f14734p;
            String strZza = m31Var.zza();
            ldVar.b();
            ((md) ldVar.f19193b).J(strZza);
        }
    }

    public /* synthetic */ wv0(Object obj, int i10) {
        this.f21611a = i10;
        this.f21612b = obj;
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
    }

    public wv0() {
        this.f21611a = 6;
        this.f21612b = new AtomicBoolean(false);
    }

    @Override // com.google.android.gms.internal.ads.qv0
    public /* synthetic */ Object zza(Object obj) {
        if (((Boolean) an.f12466c.o()).booleanValue()) {
            ((fw0) this.f21612b).zza();
        }
        return obj;
    }

    public wv0(int i10) {
        this.f21611a = 8;
        this.f21612b = gc1.i(i10);
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public void mo160zza(Object obj) {
        switch (this.f21611a) {
            case 0:
                uv0 uv0Var = (uv0) this.f21612b;
                ((zv0) obj).O((vv0) uv0Var.f20913a, uv0Var.f20914b);
                break;
            case 11:
                ((a02) obj).o((xx1) this.f21612b);
                break;
            default:
                lt ltVar = (lt) this.f21612b;
                ((a02) obj).b(ltVar);
                int i10 = ltVar.f17122a;
                break;
        }
    }
}
