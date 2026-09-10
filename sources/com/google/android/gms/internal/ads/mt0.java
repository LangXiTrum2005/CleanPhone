package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mt0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx1 f17543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f17544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f17545d;

    public /* synthetic */ mt0(hx1 hx1Var, fx1 fx1Var, fx1 fx1Var2, int i10) {
        this.f17542a = i10;
        this.f17543b = hx1Var;
        this.f17544c = fx1Var;
        this.f17545d = fx1Var2;
    }

    public lt0 a() {
        switch (this.f17542a) {
            case 0:
                Context context = (Context) this.f17543b.f15424a;
                zu0 zu0Var = (zu0) this.f17544c.zzb();
                kv0 kv0Var = (kv0) this.f17545d.zzb();
                c00 c00VarZzi = ((Boolean) zzba.zzc().a(am.f12344s7)).booleanValue() ? zzt.zzh().g().zzi() : zzt.zzh().g().zzj();
                boolean z10 = false;
                if (c00VarZzi != null && c00VarZzi.f12966j) {
                    z10 = true;
                }
                if (((Integer) zzba.zzc().a(am.I7)).intValue() > 0) {
                    if (!((Boolean) zzba.zzc().a(am.f12328r7)).booleanValue() || z10) {
                        jv0 jv0VarA = kv0Var.a(cv0.f13259c, context, zu0Var, new at0(new x11(23), 0));
                        md0 md0Var = new md0(new vf(29), 25);
                        vu0 vu0Var = jv0VarA.f16199a;
                        k00 k00Var = l00.f16608a;
                        return new v90(md0Var, new vu0(vu0Var, k00Var), jv0VarA.f16200b, ((ev0) vu0Var.f21275c).f14097g, k00Var);
                    }
                }
                return new vf(29);
            default:
                Context context2 = (Context) this.f17543b.f15424a;
                zu0 zu0Var2 = (zu0) this.f17544c.zzb();
                kv0 kv0Var2 = (kv0) this.f17545d.zzb();
                c00 c00VarZzi2 = ((Boolean) zzba.zzc().a(am.f12344s7)).booleanValue() ? zzt.zzh().g().zzi() : zzt.zzh().g().zzj();
                boolean z11 = false;
                if (c00VarZzi2 != null && c00VarZzi2.f12966j) {
                    z11 = true;
                }
                if (((Integer) zzba.zzc().a(am.f12375u7)).intValue() > 0) {
                    if (!((Boolean) zzba.zzc().a(am.f12328r7)).booleanValue() || z11) {
                        jv0 jv0VarA2 = kv0Var2.a(cv0.f13257a, context2, zu0Var2, new at0(new x11(23), 0));
                        md0 md0Var2 = new md0(new vf(29), 25);
                        vu0 vu0Var2 = jv0VarA2.f16199a;
                        k00 k00Var2 = l00.f16608a;
                        return new v90(md0Var2, new vu0(vu0Var2, k00Var2), jv0VarA2.f16200b, ((ev0) vu0Var2.f21275c).f14097g, k00Var2);
                    }
                }
                return new vf(29);
        }
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f17542a) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return new r41("StEAvb/iigDIlQhq4PghExfp73gHg8IUtO74V2AuLhqk3CKzmFDPWKX0qTLgtCrl", "a0akqO7gmy+q2qeS0xD9lQHxt87lQ1nAIIevL4sq6Y8=", (xd) this.f17543b.f15424a, (h41) this.f17544c.zzb(), ((a71) this.f17545d.zzb()).a(114), 1);
            default:
                return new r41("yqnoA3qkrpGdV0UDHfD7DkNdKz4CD4Omw8LwQ+mqDfnJnY5wPxLFUyGI2UEZc+9I", "QVM5zcLU6Zl19Cag2KVJanZ3HUWi7v3pEqNBU6r5voo=", (xd) this.f17543b.f15424a, (h41) this.f17544c.zzb(), ((a71) this.f17545d.zzb()).a(117), 0);
        }
    }
}
