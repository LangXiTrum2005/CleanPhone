package saneness;

import ads_mobile_sdk.ff0;
import ads_mobile_sdk.nh2;
import ads_mobile_sdk.oh2;
import ads_mobile_sdk.ph2;
import ads_mobile_sdk.x13;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vinyl extends ff0 implements sclerosis {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vinyl(kotlinx.coroutines.saran backgroundScope, Map listeners) {
        super(backgroundScope, listeners);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
    }

    @Override // saneness.sclerosis
    public final Unit a(scarbroite.attabal attabalVar, wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            nh2 block = new nh2("onRewardGranted", str, value, null, attabalVar);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.sclerosis
    public final Object f(wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            oh2 block = new oh2("onRewardedVideoComplete", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.sclerosis
    public final Object k(wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            ph2 block = new ph2("onRewardedVideoStart", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }
}
