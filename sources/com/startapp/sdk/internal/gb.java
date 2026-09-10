package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gb extends Ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f41005a;

    public gb(Context context, AdPreferences.Placement placement, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9) {
        super(context, placement, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9);
        this.f41005a = Collections.EMPTY_LIST;
    }

    public final void a(ArrayList arrayList) {
        boolean z2;
        this.f41005a = arrayList;
        Iterator it = arrayList.iterator();
        Long lA = null;
        while (it.hasNext()) {
            AdDetails adDetails = (AdDetails) it.next();
            if (adDetails != null && adDetails.A() != null && (lA == null || adDetails.A().longValue() < lA.longValue())) {
                lA = adDetails.A();
            }
        }
        if (lA != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(lA.longValue()));
        }
        Iterator it2 = this.f41005a.iterator();
        while (it2.hasNext()) {
            if (!((AdDetails) it2.next()).q()) {
                z2 = false;
                this.belowMinCPM = z2;
            }
        }
        z2 = true;
        this.belowMinCPM = z2;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getAdId() {
        if (this.f41005a.isEmpty()) {
            return null;
        }
        return ((AdDetails) this.f41005a.get(0)).a();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getDParam() {
        List<AdDetails> list = this.f41005a;
        if (list == null) {
            return null;
        }
        try {
            String strA = null;
            for (AdDetails adDetails : list) {
                try {
                    if (adDetails != null) {
                        String strH = adDetails.h();
                        String[] strArrY = adDetails.y();
                        strA = h0.a(strH, (strArrY == null || strArrY.length <= 0) ? null : strArrY[0]);
                        if (strA != null) {
                            break;
                        }
                    }
                } catch (Throwable unused) {
                    return strA;
                }
            }
            return strA;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
