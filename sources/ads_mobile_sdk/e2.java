package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.ironsource.If;
import complexometry.taiyuan;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.lemures;
import saneness.undertread;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends ff0 implements undertread, lemures {
    public final h1 c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(saran backgroundScope, Map listeners, h1 adConfiguration) {
        super(backgroundScope, listeners);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.c = adConfiguration;
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
    }

    @Override // saneness.undertread
    public final Object a(wretchedly.dern dernVar) {
        if (!this.f.getAndSet(true)) {
            for (Map.Entry entry : this.b.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                saran saranVar = this.a;
                q1 block = new q1("onAdDestroyed", str, value, null);
                EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
            }
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.lemures
    public final Unit d(wretchedly.dern dernVar) {
        Unit unitO = o(dernVar);
        return unitO == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? unitO : Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Unit e(wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            saran saranVar = this.a;
            y1 block = new y1("onAdSwipeGestureClicked", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Unit g(wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            saran saranVar = this.a;
            s1 block = new s1("onAdDismissedFullscreenContent", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.lemures
    public final Unit h(wretchedly.dern dernVar) {
        Unit unitG = g(dernVar);
        return unitG == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? unitG : Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Object i(wretchedly.dern dernVar) {
        Object objMarial = privatdozent.marial(new a2(this, "onAdWillBeReturned", null), dernVar);
        return objMarial == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objMarial : Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Object j(wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            saran saranVar = this.a;
            w1 block = new w1("onAdPresentation", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Object n(wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            saran saranVar = this.a;
            p1 block = new p1(If.f, str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Unit o(wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            saran saranVar = this.a;
            x1 block = new x1("onAdShowedFullscreenContent", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Object q(wretchedly.dern dernVar) {
        Unit unitA;
        if (this.d.getAndSet(true)) {
            return Unit.f29295attabal;
        }
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            saran saranVar = this.a;
            u1 block = new u1("onAdImpression", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        k7 k7Var = this.c.m;
        if (k7Var == null) {
            return Unit.f29295attabal;
        }
        return (k7Var.a == m7.ONE_PIXEL && !this.e.getAndSet(true) && (unitA = a(new taiyuan(k7Var.c, k7Var.b, k7Var.d), dernVar)) == p002kotlin.coroutines.intrinsics.attabal.beachfront()) ? unitA : Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Object a(FullScreenContentError fullScreenContentError, wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            saran saranVar = this.a;
            t1 block = new t1("onAdFailedToShowFullScreenContent", str, value, null, fullScreenContentError);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Unit a(taiyuan taiyuanVar, wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            saran saranVar = this.a;
            v1 block = new v1("onAdPaid", str, value, null, taiyuanVar);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    public final Unit a(taiyuan taiyuanVar, kg2 kg2Var) {
        if (this.e.getAndSet(true)) {
            return Unit.f29295attabal;
        }
        Unit unitA = a(taiyuanVar, (wretchedly.dern) kg2Var);
        return unitA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? unitA : Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Unit a(String str, String str2, wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            saran saranVar = this.a;
            b2 block = new b2("onAppEvent", str3, value, null, str, str2);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Unit a(String str, wretchedly.dern dernVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            saran saranVar = this.a;
            c2 block = new c2("onCustomClick", str2, value, null, str);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }
}
