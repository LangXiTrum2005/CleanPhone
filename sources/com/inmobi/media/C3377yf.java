package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3377yf extends En {
    public final Fn d;
    public Ae e;
    public final C3195r8 f;
    public final InterfaceC3072m9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3377yf(Context context, GestureDetectorOnGestureListenerC2829ci adContainer, Fn mViewableAd, saran hybridScope, Ae ae, C3195r8 c3195r8, InterfaceC3072m9 interfaceC3072m9) {
        super(adContainer);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(mViewableAd, "mViewableAd");
        Intrinsics.checkNotNullParameter(hybridScope, "hybridScope");
        this.d = mViewableAd;
        this.e = ae;
        this.f = c3195r8;
        this.g = interfaceC3072m9;
        saran saranVarA = P4.a(hybridScope);
        Intrinsics.checkNotNullParameter(context, "context");
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("yf", "TAG");
            ((C3097n9) interfaceC3072m9).b("yf", "initializeOMSDK called");
        }
        int i = AbstractC3028kf.a;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        AbstractC3028kf.a(applicationContext);
        cutely.wireman(saranVarA, null, null, new C3352xf(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(C3377yf c3377yf, ContinuationImpl continuationImpl) {
        C3327wf c3327wf;
        InterfaceC3072m9 interfaceC3072m9;
        c3377yf.getClass();
        if (continuationImpl instanceof C3327wf) {
            c3327wf = (C3327wf) continuationImpl;
            int i = c3327wf.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3327wf.c = i - Integer.MIN_VALUE;
            } else {
                c3327wf = new C3327wf(c3377yf, continuationImpl);
            }
        } else {
            c3327wf = new C3327wf(c3377yf, continuationImpl);
        }
        Object objCompetently = c3327wf.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3327wf.c;
        Unit unit = null;
        if (i2 == 0) {
            dern.saneness(objCompetently);
            C3153pf c3153pf = C3153pf.a;
            c3327wf.c = 1;
            Context context = Ji.a;
            objCompetently = context == null ? "" : impromptu.competently(premeiotic.saneness(), new C3103nf(context, null), c3327wf);
            if (objCompetently == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(objCompetently);
        }
        String str = (String) objCompetently;
        C3195r8 c3195r8 = c3377yf.f;
        if (c3195r8 == null) {
            interfaceC3072m9 = c3377yf.g;
            if (interfaceC3072m9 != null) {
                Intrinsics.checkNotNullExpressionValue("yf", "TAG");
                ((C3097n9) interfaceC3072m9).a("yf", "OmidInfo is null, cannot track ad");
                Unit unit2 = Unit.f29295attabal;
            }
        } else {
            Ae ae = c3377yf.e;
            if (ae != null) {
                ae.a(str, c3195r8.a, c3195r8.b, c3195r8.d, c3195r8.c, c3195r8.e);
                unit = Unit.f29295attabal;
            }
            if (unit == null) {
                interfaceC3072m9 = c3377yf.g;
                if (interfaceC3072m9 != null) {
                    Intrinsics.checkNotNullExpressionValue("yf", "TAG");
                    ((C3097n9) interfaceC3072m9).a("yf", "OmidInfo is null, cannot track ad");
                    Unit unit3 = Unit.f29295attabal;
                }
            }
        }
        return Unit.f29295attabal;
    }

    @Override // com.inmobi.media.Fn
    public final View b() {
        return this.d.b();
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        InterfaceC3072m9 interfaceC3072m9 = this.g;
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("yf", "TAG");
            ((C3097n9) interfaceC3072m9).c("yf", "inflateView called");
        }
        return this.d.c();
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
        InterfaceC3072m9 interfaceC3072m9 = this.g;
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("yf", "TAG");
            ((C3097n9) interfaceC3072m9).a("yf", "stopTrackingForImpression");
        }
        this.d.d();
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView, FriendlyObstructionPurpose friendlyObstruction) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(friendlyObstruction, "obstructionCode");
        Ae ae = this.e;
        if (ae != null) {
            Intrinsics.checkNotNullParameter(childView, "childView");
            Intrinsics.checkNotNullParameter(friendlyObstruction, "friendlyObstruction");
            if (ae.c == null) {
                InterfaceC3072m9 interfaceC3072m9 = ae.b;
                if (interfaceC3072m9 != null) {
                    ((C3097n9) interfaceC3072m9).a(AbstractC2863e1.f, "Failed to addObstruction: adSession is null");
                    return;
                }
                return;
            }
            InterfaceC3072m9 interfaceC3072m10 = ae.b;
            if (interfaceC3072m10 != null) {
                ((C3097n9) interfaceC3072m10).a(AbstractC2863e1.f, "addObstruction");
            }
            P4.a(ae.a, new X0(ae, childView, friendlyObstruction, null));
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Ae ae = this.e;
        if (ae != null) {
            Intrinsics.checkNotNullParameter(childView, "childView");
            if (ae.c == null) {
                return;
            }
            P4.a(ae.a, new C2760a1(ae, childView, null));
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
        InterfaceC3072m9 interfaceC3072m9 = this.g;
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("yf", "TAG");
            ((C3097n9) interfaceC3072m9).a("yf", "startTrackingForImpression");
        }
        this.d.a(map);
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d.a(context, b);
    }

    @Override // com.inmobi.media.Fn
    public final void a() {
        InterfaceC3072m9 interfaceC3072m9 = this.g;
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("yf", "TAG");
            ((C3097n9) interfaceC3072m9).c("yf", "destroy");
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.e = null;
        this.d.a();
    }
}
