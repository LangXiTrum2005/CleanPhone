package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2375hw implements QD {
    public final /* synthetic */ C7Q A00;
    public final /* synthetic */ Q8 A01;

    public C2375hw(C7Q c7q, Q8 q8) {
        this.A00 = c7q;
        this.A01 = q8;
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public final Object A5G(int i2) {
        Q6 compatInfo = this.A01.A00(i2);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public final List<Object> A6Y(String str, int i2) {
        List<Q6> listA03 = this.A01.A03(str, i2);
        if (listA03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = listA03.size();
        for (int i3 = 0; i3 < infoCount; i3++) {
            arrayList.add(listA03.get(i3).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public final Object A6Z(int i2) {
        Q6 compatInfo = this.A01.A01(i2);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public final boolean AGv(int i2, int i3, Bundle bundle) {
        return this.A01.A04(i2, i3, bundle);
    }
}
