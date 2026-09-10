package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qd0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19026a;

    public /* synthetic */ qd0(int i10) {
        this.f19026a = i10;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f19026a) {
            case 0:
                return qj.AD_LOADER;
            case 1:
                return IronSourceConstants.EVENTS_NATIVE;
            case 2:
                return null;
            case 3:
                return new ip0();
            case 4:
            case 5:
            case 6:
                return null;
            case 7:
                return new rg0();
            case 8:
                return new hh0();
            case 9:
                return new mh0();
            case 10:
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new ph0(k00Var);
            case 11:
                return new rh0(11, 12, 1007);
            case 12:
                return new rh0(19, 20, 1008);
            case 13:
                return new rh0(13, 14, 1004);
            case 14:
                return new rh0(1001, 1002, 1003);
            case 15:
                return new rh0(15, 16, 1005);
            case 16:
                return new rh0(17, 18, 1006);
            case 17:
                return new zh0(vv0.SIGNALS, "ttc");
            case 18:
                return new zh0(vv0.PRELOADED_LOADER, "t_load_as");
            case 19:
                return new ji0();
            case 20:
                return new zi0();
            case 21:
                zzt.zzc();
                String string = UUID.randomUUID().toString();
                ic1.h(string);
                return string;
            case 22:
                return new pl0();
            case 23:
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                return new yo0(k00Var2);
            case 24:
                return new jp0();
            case 25:
                return new gq0();
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                k00 k00Var3 = l00.f16608a;
                ic1.h(k00Var3);
                return new yq0(k00Var3, 0);
            case 27:
                List arrayList = new ArrayList();
                ul ulVar = am.f12381ud;
                if (!((String) zzba.zzc().a(ulVar)).isEmpty()) {
                    arrayList = Arrays.asList(((String) zzba.zzc().a(ulVar)).split(","));
                }
                ic1.h(arrayList);
                return arrayList;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                ul ulVar2 = am.f12058a;
                return zzba.zzb().a();
            default:
                k00 k00Var4 = l00.f16608a;
                ic1.h(k00Var4);
                return new yq0(k00Var4, 1);
        }
    }
}
