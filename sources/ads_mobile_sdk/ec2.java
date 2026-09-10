package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.clue;

/* JADX INFO: loaded from: classes.dex */
public final class ec2 {
    public final saran a;
    public final vg b;
    public final po2 c;
    public final clue d;

    public ec2(saran backgroundScope, vg appState, po2 signalCache, clue publicJavascriptBridgeFactory) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(signalCache, "signalCache");
        Intrinsics.checkNotNullParameter(publicJavascriptBridgeFactory, "publicJavascriptBridgeFactory");
        this.a = backgroundScope;
        this.b = appState;
        this.c = signalCache;
        this.d = publicJavascriptBridgeFactory;
    }
}
