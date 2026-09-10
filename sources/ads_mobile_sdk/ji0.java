package ads_mobile_sdk;

import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.lemures;
import saneness.libya;

/* JADX INFO: loaded from: classes.dex */
public final class ji0 implements lemures {
    public final gq0 a;
    public final saran b;

    public ji0(gq0 gmaWebView, saran uiScope) {
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.a = gmaWebView;
        this.b = uiScope;
    }

    @Override // saneness.lemures
    public final Object c(wretchedly.dern dernVar) {
        libya libyaVar = this.a.m;
        if (libyaVar != null) {
            saran saranVar = this.b;
            ii0 block = new ii0(libyaVar, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }
}
