package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Set;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v50 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f21035b;

    public /* synthetic */ v50(kx1 kx1Var, int i10) {
        this.f21034a = i10;
        this.f21035b = kx1Var;
    }

    public uk0 a() {
        Context contextA = ((o40) this.f21035b).a();
        uk0 uk0Var = new uk0();
        uk0Var.f20811h = 1;
        uk0Var.f19991f = new hj(contextA, zzt.zzs().zza(), uk0Var, uk0Var, 2);
        return uk0Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f21034a) {
            case 0:
                return new zzbl(((o40) this.f21035b).a());
            case 1:
                return new a60(((k40) this.f21035b).zzb(), 0);
            case 2:
                return new a60(((k40) this.f21035b).zzb(), 1);
            case 3:
                return new b60((lj0) this.f21035b.zzb(), 0);
            case 4:
                return new f60((lj0) this.f21035b.zzb(), 0);
            case 5:
                return new h60(((o40) this.f21035b).a());
            case 6:
                return new a60(((k40) this.f21035b).zzb(), 2);
            case 7:
                return new i60((DeviceTierManager) this.f21035b.zzb());
            case 8:
                return new d60((cu0) this.f21035b.zzb(), 1);
            case 9:
                hz hzVarF = hz.f(((u50) this.f21035b).f20630a.a());
                return new f60(new lj1(hzVarF.f15433b, false, ((fx1) hzVarF.f15435d).zzb(), 11), 1);
            case 10:
                return new a60(((k40) this.f21035b).zzb(), 3);
            case 11:
                return new b60((lj0) this.f21035b.zzb(), 1);
            case 12:
                return new kt(((dt) this.f21035b.zzb()).f13671a);
            case 13:
                return new nc0(new r70((jb0) ((h80) this.f21035b).f15207a.f17399b, 0), l00.f16615h);
            case 14:
                return new nc0((dk0) this.f21035b.zzb(), l00.f16615h);
            case 15:
                return new nc0((e90) this.f21035b.zzb(), l00.f16615h);
            case 16:
                return new nc0((e90) this.f21035b.zzb(), l00.f16615h);
            case 17:
                return ((n70) this.f21035b).zzb();
            case 18:
                VersionInfoParcel versionInfoParcelA = ((u40) this.f21035b).a();
                zzt.zzc();
                return new yh(UUID.randomUUID().toString(), versionInfoParcelA, IronSourceConstants.EVENTS_NATIVE, new JSONObject(), true);
            case 19:
                String packageName = ((o40) this.f21035b).a().getPackageName();
                ic1.h(packageName);
                return packageName;
            case 20:
                Context contextA = ((o40) this.f21035b).a();
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new ok0(contextA, k00Var, 1);
            case 21:
                return a();
            case 22:
                return new b21(((w40) this.f21035b).zzb(), 24);
            case 23:
                return new nl0(((o40) this.f21035b).a());
            case 24:
                return new lm0(((o40) this.f21035b).a());
            case 25:
                return new mm0(((o40) this.f21035b).a());
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return new vo0((nh0) this.f21035b.zzb());
            case 27:
                return new hp0((yh0) this.f21035b.zzb());
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return new qp0((Set) this.f21035b.zzb(), 1);
            default:
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                return new hq0(k00Var2, ((o40) this.f21035b).a(), 0);
        }
    }
}
