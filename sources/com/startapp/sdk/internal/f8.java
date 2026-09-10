package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class f8 extends u1 {
    public final lb m;

    public f8(Context context, wd wdVar, AdPreferences adPreferences, AdEventListener adEventListener, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5) {
        super(context, wdVar, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL, lbVar, lbVar2, lbVar3, lbVar4);
        this.m = lbVar5;
    }

    @Override // com.startapp.sdk.internal.u1
    public final void a(Ad ad) {
        wd wdVar = (wd) ad;
        List list = wdVar.f41005a;
        ub ubVarA = ((vb) this.m.a()).a(wdVar.f41632b);
        ubVarA.getClass();
        ubVarA.f41542b = new ArrayList();
        ubVarA.f41543c = "";
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rb rbVar = new rb((AdDetails) it.next());
                ubVarA.f41542b.add(rbVar);
                ubVarA.f41541a.a(rbVar.f41435a, ubVarA.f41542b.size() - 1, rbVar.f41440i);
            }
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a aVarC = super.c();
        if (aVarC == null) {
            return null;
        }
        aVarC.t0 = AdsCommonMetaData.k().t();
        return aVarC;
    }
}
