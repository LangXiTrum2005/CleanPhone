package saneness;

import ads_mobile_sdk.ff0;
import ads_mobile_sdk.jm2;
import ads_mobile_sdk.l31;
import ads_mobile_sdk.m31;
import ads_mobile_sdk.n31;
import ads_mobile_sdk.o31;
import ads_mobile_sdk.x13;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dragline extends ff0 implements rockless {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dragline(kotlinx.coroutines.saran backgroundScope, Map listeners) {
        super(backgroundScope, listeners);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
    }

    @Override // saneness.rockless
    public final Object a(jm2 jm2Var, wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            l31 block = new l31("onAdResponse", str, value, null, jm2Var);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.rockless
    public final Object b(wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            m31 block = new m31("onRequestStarted", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.rockless
    public final Unit f() {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            o31 block = new o31("onSignalCollectionSucceeded", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.rockless
    public final Object a(complexometry.formularize formularizeVar, wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            n31 block = new n31("onSignalCollectionStarted", str, value, null, formularizeVar);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }
}
