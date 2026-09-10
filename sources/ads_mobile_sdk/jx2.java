package ads_mobile_sdk;

import com.google.android.gms.ads.AdError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import complexometry.MediationAdError;
import complexometry.formularize;
import igo.beachfront;
import java.util.Iterator;
import java.util.Optional;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.marial;
import kotlinx.coroutines.kowloon;
import kotlinx.coroutines.saran;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.conclusively;
import saneness.igo;
import saneness.kaolinize;
import saneness.naming;
import saneness.permanently;
import saneness.spartacist;
import saneness.tympanoplasty;

/* JADX INFO: loaded from: classes.dex */
public final class jx2 extends l1 {
    public final tympanoplasty k;
    public final tympanoplasty l;
    public final Optional m;
    public final naming n;
    public final yb0 o;
    public final saran p;
    public String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx2(tympanoplasty adapterWrapper, tympanoplasty rtbAdapterWrapper, Optional oldAdapterWrapper, naming mediationAdapterProxyFactory, yb0 delegatingThirdPartyEventEmitter, saran uiScope, l13 traceMetaSet, formularize baseRequest, yf2 requestType, long j, int i, h1 adConfiguration, ur commonConfiguration, jm2 serverTransaction, String renderId, a22 placementIdWrapper) {
        super(traceMetaSet, baseRequest, requestType, j, i, adConfiguration, commonConfiguration, serverTransaction, renderId, placementIdWrapper);
        Intrinsics.checkNotNullParameter(adapterWrapper, "adapterWrapper");
        Intrinsics.checkNotNullParameter(rtbAdapterWrapper, "rtbAdapterWrapper");
        Intrinsics.checkNotNullParameter(oldAdapterWrapper, "oldAdapterWrapper");
        Intrinsics.checkNotNullParameter(mediationAdapterProxyFactory, "mediationAdapterProxyFactory");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        Intrinsics.checkNotNullParameter(placementIdWrapper, "placementIdWrapper");
        this.k = adapterWrapper;
        this.l = rtbAdapterWrapper;
        this.m = oldAdapterWrapper;
        this.n = mediationAdapterProxyFactory;
        this.o = delegatingThirdPartyEventEmitter;
        this.p = uiScope;
    }

    public final String a(int i) {
        String str = this.q;
        if (str == null) {
            Intrinsics.preprohormone("renderedAdapterClassName");
            str = null;
        }
        return "Error from: " + str + ", code: " + i;
    }

    @Override // saneness.idolatry
    public final boolean b() {
        return !this.f.b.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(conclusively conclusivelyVar, wretchedly.dern dernVar) {
        hx2 hx2Var;
        jx2 jx2Var;
        if (dernVar instanceof hx2) {
            hx2Var = (hx2) dernVar;
            int i = hx2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                hx2Var.e = i - Integer.MIN_VALUE;
            } else {
                hx2Var = new hx2(this, dernVar);
            }
        } else {
            hx2Var = new hx2(this, dernVar);
        }
        Object objCuirassed = hx2Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = hx2Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objCuirassed);
            hx2Var.a = this;
            hx2Var.b = conclusivelyVar;
            hx2Var.e = 1;
            if (!(conclusivelyVar instanceof su1) || this.m.isPresent()) {
                kowloon kowloonVar = new kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(hx2Var), 1);
                kowloonVar.kattegat();
                saran saranVar = this.p;
                gx2 block = new gx2(conclusivelyVar, this, kowloonVar, null);
                EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
                objCuirassed = kowloonVar.cuirassed();
                if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    beachfront.dern(hx2Var);
                }
            } else {
                objCuirassed = new rn0("oldAdapterWrapper is empty for OldMediationAdapterProxy", k41.INTERNAL_ERROR);
            }
            if (objCuirassed == objBeachfront) {
                return objBeachfront;
            }
            jx2Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            conclusivelyVar = hx2Var.b;
            jx2Var = hx2Var.a;
            p002kotlin.dern.saneness(objCuirassed);
        }
        spartacist spartacistVar = (spartacist) objCuirassed;
        if (spartacistVar instanceof nn0) {
            return spartacistVar;
        }
        if (!(spartacistVar instanceof tn0)) {
            throw new NoWhenBranchMatchedException();
        }
        jx2Var.getClass();
        spartacist spartacistVarA = jx2Var.a(conclusivelyVar);
        if (spartacistVarA instanceof nn0) {
            return (nn0) spartacistVarA;
        }
        Intrinsics.competently(spartacistVarA, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        boolean z = conclusivelyVar instanceof ij2;
        kaolinize kaolinizeVar = (kaolinize) jx2Var.a((permanently) ((tn0) spartacistVarA).b, z).a();
        yb0 yb0Var = jx2Var.o;
        igo thirdPartyEventEmitter = kaolinizeVar.f();
        yb0Var.getClass();
        Intrinsics.checkNotNullParameter(thirdPartyEventEmitter, "thirdPartyEventEmitter");
        yb0Var.a.setValue(yb0Var, yb0.b[0], thirdPartyEventEmitter);
        if (conclusivelyVar instanceof fe1) {
            jx2Var.k.a(kaolinizeVar);
        } else if (z) {
            jx2Var.l.a(kaolinizeVar);
        } else if ((conclusivelyVar instanceof su1) && jx2Var.m.isPresent()) {
            ((tympanoplasty) jx2Var.m.get()).a(kaolinizeVar);
        }
        return new tn0(kaolinizeVar.a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ads_mobile_sdk.l1
    public final Object a(boolean z, wretchedly.dern dernVar) {
        ix2 ix2Var;
        conclusively conclusivelyVarAttabal;
        if (dernVar instanceof ix2) {
            ix2Var = (ix2) dernVar;
            int i = ix2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ix2Var.c = i - Integer.MIN_VALUE;
            } else {
                ix2Var = new ix2(this, dernVar);
            }
        } else {
            ix2Var = new ix2(this, dernVar);
        }
        Object objA = ix2Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ix2Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            Iterator it = c().b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    conclusivelyVarAttabal = null;
                    break;
                }
                String str = (String) it.next();
                this.q = str;
                boolean z2 = z;
                conclusivelyVarAttabal = naming.attabal(this.n, str, z2, false, this.c, 4);
                if (conclusivelyVarAttabal != null) {
                    break;
                }
                z = z2;
            }
            if (conclusivelyVarAttabal == null) {
                return new qn0(new MediationAdError(LoadAdError.ErrorCode.NOT_FOUND.getValue(), "Unable to instantiate any mediation adapter class: " + c().b + ".", AdError.UNDEFINED_DOMAIN));
            }
            ix2Var.c = 1;
            objA = a(conclusivelyVarAttabal, ix2Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objA);
        }
        spartacist spartacistVar = (spartacist) objA;
        if (spartacistVar instanceof nn0) {
            return spartacistVar;
        }
        if (spartacistVar instanceof tn0) {
            return new tn0(marial.gintrap(spartacistVar));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final spartacist a(conclusively conclusivelyVar) {
        if (conclusivelyVar instanceof fe1) {
            return new tn0(this.k.a(d(), c(), conclusivelyVar));
        }
        if (conclusivelyVar instanceof ij2) {
            return new tn0(this.l.a(d(), c(), conclusivelyVar));
        }
        if (conclusivelyVar instanceof su1) {
            if (this.m.isPresent()) {
                return new tn0(((tympanoplasty) this.m.get()).a(d(), c(), conclusivelyVar));
            }
            return new rn0("OldAdapterWrapper is empty, unable to wrap " + conclusivelyVar + ".");
        }
        throw new NoWhenBranchMatchedException();
    }
}
