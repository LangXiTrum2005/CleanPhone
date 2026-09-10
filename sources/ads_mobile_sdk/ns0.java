package ads_mobile_sdk;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.coffeecake;
import saneness.hemolysin;
import saneness.undertread;

/* JADX INFO: loaded from: classes.dex */
public final class ns0 implements hemolysin, undertread {
    public final saran a;
    public final oq1 b;
    public final adultoid c;

    public ns0(saran uiScope, oq1 nativePolicyValidatorState, coffeecake nativeAdCore) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(nativePolicyValidatorState, "nativePolicyValidatorState");
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        this.a = uiScope;
        this.b = nativePolicyValidatorState;
        this.c = nativeAdCore;
    }

    @Override // saneness.undertread
    public final Object a(wretchedly.dern dernVar) {
        Object objA;
        gq0 gq0Var = (gq0) this.b.d.get();
        return (gq0Var != null && (objA = a(gq0Var, seminary.taiyuan(), dernVar)) == p002kotlin.coroutines.intrinsics.attabal.beachfront()) ? objA : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_HIDE_VALIDATOR_OVERLAY;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        cutely.wireman(this.a, null, null, new ms0(gq0Var, this, null), 3, null);
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.b.b.get();
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.b.c.get();
        if (onScrollChangedListener != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
        } else {
            y13.a("Failed to detach scroll changed listener.", null, 6);
        }
        oq1 oq1Var = this.b;
        WeakReference weakReference = new WeakReference(null);
        oq1Var.getClass();
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        oq1Var.a = weakReference;
        oq1 oq1Var2 = this.b;
        WeakReference weakReference2 = new WeakReference(null);
        oq1Var2.getClass();
        Intrinsics.checkNotNullParameter(weakReference2, "<set-?>");
        oq1Var2.b = weakReference2;
        oq1 oq1Var3 = this.b;
        WeakReference weakReference3 = new WeakReference(null);
        oq1Var3.getClass();
        Intrinsics.checkNotNullParameter(weakReference3, "<set-?>");
        oq1Var3.c = weakReference3;
        Object objA = gq0Var.a(dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
