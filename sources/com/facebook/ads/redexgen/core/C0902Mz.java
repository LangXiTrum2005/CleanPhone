package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0902Mz extends AbstractC1985me {
    public final C1828k1 A00;
    public final AW A01;

    public C0902Mz(C1828k1 c1828k1, C0X c0x, List<C1744ie> list, AW aw) {
        super(c0x, list, c1828k1);
        this.A00 = c1828k1;
        this.A01 = aw == null ? new AW() : aw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04805q
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1698hr A0D(ViewGroup viewGroup, int i) {
        return new C1698hr(new DX(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04805q
    /* JADX INFO: renamed from: A0I */
    public final void A0E(C1698hr c1698hr, int i) {
        super.A0E(c1698hr, i);
        DX dx = (DX) c1698hr.A0j();
        A0G(dx.getImageCardView(), i);
        if (((AbstractC1985me) this).A01.get(i) != null) {
            dx.setTitle(((AbstractC1985me) this).A01.get(i).getAdHeadline());
            dx.setSubtitle(((AbstractC1985me) this).A01.get(i).getAdLinkDescription());
            dx.setButtonText(((AbstractC1985me) this).A01.get(i).getAdCallToAction());
        }
        C1744ie c1744ie = ((AbstractC1985me) this).A01.get(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dx);
        c1744ie.A1P(dx, dx, arrayList);
    }
}
