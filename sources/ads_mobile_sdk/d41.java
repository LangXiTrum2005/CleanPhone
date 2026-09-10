package ads_mobile_sdk;

import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.phytopathogen;

/* JADX INFO: loaded from: classes.dex */
public final class d41 extends v21 {
    public final View k;
    public final phytopathogen l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d41(View view, String adId, h1 adConfiguration, ur commonConfiguration, l13 traceMetaSet, Optional gmaWebView, e2 adEventEmitter, wb0 delegatingAdEventListener, x12 phantomReferences, gk2 safeBrowsingManager, a22 placementIdWrapper, phytopathogen refreshListener) {
        super(adId, adConfiguration, commonConfiguration, traceMetaSet, gmaWebView, adEventEmitter, delegatingAdEventListener, phantomReferences, safeBrowsingManager, placementIdWrapper);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(delegatingAdEventListener, "delegatingAdEventListener");
        Intrinsics.checkNotNullParameter(phantomReferences, "phantomReferences");
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        Intrinsics.checkNotNullParameter(placementIdWrapper, "placementIdWrapper");
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        this.k = view;
        this.l = refreshListener;
    }

    public final liquory.attabal j() {
        if (b().p0) {
            List list = b().Y;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!StringsKt.overspeculate((String) it.next(), "FirstParty", false, 2, null));
            }
            return new liquory.attabal(this.k.getWidth(), this.k.getHeight());
        }
        n1 n1Var = !b().y.isEmpty() ? (n1) b().y.get(0) : (n1) b().g.get(0);
        return n1Var.c ? liquory.attabal.f33064impassible : new liquory.attabal(n1Var.a, n1Var.b);
    }

    public final phytopathogen k() {
        return this.l;
    }

    public final View l() {
        return this.k;
    }
}
