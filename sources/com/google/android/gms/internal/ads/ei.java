package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ei implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13983a;

    public /* synthetic */ ei(int i10) {
        this.f13983a = i10;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f13983a) {
            case 0:
                return new di();
            case 1:
                b40 b40Var = new b40();
                b40Var.f12627a = null;
                return b40Var;
            case 2:
                return zzt.zzh();
            case 3:
                ExecutorService executorService = l00.f16614g;
                ic1.h(executorService);
                return new wv0(executorService, 2);
            case 4:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                intent.setData(Uri.parse("https://play.google.com/d"));
                return intent;
            case 5:
                String strZzf = zzay.zzf();
                ic1.h(strZzf);
                return strZzf;
            case 6:
                return new ArrayDeque();
            case 7:
                return new s6(28);
            case 8:
                return new jq(9);
            case 9:
                return new jq(13);
            case 10:
                return new s6(27);
            case 11:
                return zzt.zzD();
            case 12:
                return new g60();
            case 13:
                return qj.APP_OPEN;
            case 14:
                return "app_open_ad";
            case 15:
                return qj.BANNER;
            case 16:
                return "banner";
            case 17:
                return new d90();
            case 18:
                return new nb0();
            case 19:
                ub0 ub0Var = new ub0();
                ub0Var.f20717a = ((Integer) zzba.zzc().a(am.X1)).intValue();
                ub0Var.f20718b = ((Integer) zzba.zzc().a(am.Ce)).intValue();
                return ub0Var;
            case 20:
                Set set = Collections.EMPTY_SET;
                ic1.h(set);
                return set;
            case 21:
                Set set2 = Collections.EMPTY_SET;
                ic1.h(set2);
                return set2;
            case 22:
                Set set3 = Collections.EMPTY_SET;
                ic1.h(set3);
                return set3;
            case 23:
                Set set4 = Collections.EMPTY_SET;
                ic1.h(set4);
                return set4;
            case 24:
                Set set5 = Collections.EMPTY_SET;
                ic1.h(set5);
                return set5;
            case 25:
                Set set6 = Collections.EMPTY_SET;
                ic1.h(set6);
                return set6;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                Set set7 = Collections.EMPTY_SET;
                ic1.h(set7);
                return set7;
            case 27:
                return new ic0();
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return qj.INTERSTITIAL;
            default:
                return "interstitial";
        }
    }

    public ei(bc0 bc0Var) {
        this.f13983a = 21;
    }
}
