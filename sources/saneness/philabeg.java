package saneness;

import ads_mobile_sdk.bi;
import ads_mobile_sdk.en0;
import ads_mobile_sdk.f80;
import ads_mobile_sdk.h80;
import ads_mobile_sdk.i60;
import ads_mobile_sdk.ra2;
import ads_mobile_sdk.yf2;
import ads_mobile_sdk.yh;
import ads_mobile_sdk.z51;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class philabeg {
    public static kotlinx.coroutines.channels.wireman attabal(String adResponse, complexometry.wireman adLoadCallback) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
        terni.f37333attabal.getClass();
        patroclinal.taiyuan taiyuanVar = en0.c;
        z51 z51Var = (z51) ((i60) ((terni) taiyuanVar.getValue())).p2.get();
        i60 i60Var = ((i60) ((terni) taiyuanVar.getValue())).c;
        adResponse.getClass();
        f80 f80Var = new f80(i60Var, yf2.f, adResponse, Boolean.FALSE);
        z51Var.a((Function1) new bi((ra2) f80Var.i.get(), adLoadCallback, null));
        return (kotlinx.coroutines.channels.wireman) f80Var.h.get();
    }

    public static kotlinx.coroutines.channels.wireman saneness(liquory.marial adRequest, complexometry.wireman adLoadCallback, boolean z) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
        terni.f37333attabal.getClass();
        patroclinal.taiyuan taiyuanVar = en0.c;
        z51 z51Var = (z51) ((i60) ((terni) taiyuanVar.getValue())).p2.get();
        i60 i60Var = ((i60) ((terni) taiyuanVar.getValue())).c;
        yf2 yf2Var = yf2.f;
        adRequest.getClass();
        Boolean bool = Boolean.FALSE;
        h80 h80Var = new h80(i60Var, adRequest, yf2Var, bool, bool, adRequest);
        z51Var.a((Function1) new yh(h80Var, adLoadCallback, z, null));
        return (kotlinx.coroutines.channels.wireman) h80Var.j.get();
    }
}
