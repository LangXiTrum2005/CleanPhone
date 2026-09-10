package saneness;

import ads_mobile_sdk.ff0;
import ads_mobile_sdk.kg1;
import ads_mobile_sdk.lg1;
import ads_mobile_sdk.mg1;
import ads_mobile_sdk.x13;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ahermatype extends ff0 implements lemures {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahermatype(kotlinx.coroutines.saran backgroundScope, Map listeners) {
        super(backgroundScope, listeners);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
    }

    @Override // saneness.lemures
    public final Object c(wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            mg1 block = new mg1("onMraidUnload", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.lemures
    public final Unit d(wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            kg1 block = new kg1("onMraidAdResized", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.lemures
    public final Unit h(wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            lg1 block = new lg1("onMraidResizedAdClosed", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }
}
