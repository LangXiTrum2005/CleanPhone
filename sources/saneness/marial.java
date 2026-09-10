package saneness;

import ads_mobile_sdk.ff0;
import ads_mobile_sdk.h1;
import ads_mobile_sdk.jm2;
import ads_mobile_sdk.nn0;
import ads_mobile_sdk.x13;
import ads_mobile_sdk.y21;
import ads_mobile_sdk.z21;
import com.ironsource.If;
import complexometry.ResponseInfo;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class marial extends ff0 implements basify {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public marial(kotlinx.coroutines.saran backgroundScope, Map listeners) {
        super(backgroundScope, listeners);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
    }

    @Override // saneness.basify
    public final Object a(nn0 nn0Var, ResponseInfo responseInfo, wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            y21 block = new y21("onAdFailedToLoad", str, value, null, nn0Var, responseInfo);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.basify
    public final Object a(jm2 jm2Var, h1 h1Var, ResponseInfo responseInfo, wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            z21 block = new z21(If.j, str, value, null, jm2Var, h1Var, responseInfo);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }
}
