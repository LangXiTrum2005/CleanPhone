package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1905lI implements C5D {
    public final /* synthetic */ MR A00;
    public final /* synthetic */ AnonymousClass58 A01;

    public C1905lI(MR mr, AnonymousClass58 anonymousClass58) {
        this.A00 = mr;
        this.A01 = anonymousClass58;
    }

    @Override // com.facebook.ads.redexgen.core.C5D
    public final Object A56(int i) {
        AnonymousClass56 compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.C5D
    public final List<Object> A6O(String str, int i) {
        List<AnonymousClass56> listA03 = this.A01.A03(str, i);
        if (listA03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = listA03.size();
        for (int i2 = 0; i2 < infoCount; i2++) {
            arrayList.add(listA03.get(i2).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.core.C5D
    public final Object A6P(int i) {
        AnonymousClass56 compatInfo = this.A01.A01(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.C5D
    public final boolean AG3(int i, int i2, Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}
