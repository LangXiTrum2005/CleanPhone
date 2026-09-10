package com.inmobi.media;

import android.view.ViewGroup;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.dovishness;
import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.flow.gintrap;
import kotlinx.coroutines.flow.graveside;
import kotlinx.coroutines.flow.marial;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yo {
    public final monroe a;
    public final formularize b;

    public yo(long j, saran scope, ViewGroup observableView, InterfaceC3072m9 interfaceC3072m9) {
        Intrinsics.checkNotNullParameter(scope, "coroutineScope");
        Intrinsics.checkNotNullParameter(observableView, "observableView");
        formularize formularizeVarAttabal = gintrap.attabal(Boolean.FALSE);
        this.b = formularizeVarAttabal;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("WindowLifecycleHandler", "WindowLifecycleHandler init - observableView: " + observableView + ", isAttachedToWindow: " + observableView.isAttachedToWindow());
        }
        dovishness dovishnessVarRestrictive = marial.restrictive(marial.rotuma(marial.marial(new Ao(observableView, null)), premeiotic.dern()), scope, graveside.INSTANCE.dern(), Boolean.valueOf(observableView.isAttachedToWindow()));
        M1 collector = new M1(j, observableView, interfaceC3072m9, scope, formularizeVarAttabal);
        Intrinsics.checkNotNullParameter(dovishnessVarRestrictive, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(collector, "collector");
        this.a = cutely.wireman(scope, null, null, new N4(dovishnessVarRestrictive, collector, null), 3, null);
    }
}
