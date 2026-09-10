package ads_mobile_sdk;

import com.google.android.gms.ads.AdError;
import complexometry.MediationAdError;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.impassible;
import kotlinx.coroutines.saran;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.conclusively;
import saneness.tympanoplasty;

/* JADX INFO: loaded from: classes.dex */
public final class gx2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ conclusively a;
    public final /* synthetic */ jx2 b;
    public final /* synthetic */ impassible c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx2(conclusively conclusivelyVar, jx2 jx2Var, impassible impassibleVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = conclusivelyVar;
        this.b = jx2Var;
        this.c = impassibleVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new gx2(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gx2) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            conclusively conclusivelyVar = this.a;
            if (conclusivelyVar instanceof fe1) {
                jx2 jx2Var = this.b;
                jx2Var.k.a(jx2Var.h, jx2Var.f, conclusivelyVar, new fx2(jx2Var, atomicBoolean, this.c));
            } else if (conclusivelyVar instanceof ij2) {
                jx2 jx2Var2 = this.b;
                jx2Var2.l.a(jx2Var2.h, jx2Var2.f, conclusivelyVar, new fx2(jx2Var2, atomicBoolean, this.c));
            } else if (conclusivelyVar instanceof su1) {
                tympanoplasty tympanoplastyVar = (tympanoplasty) this.b.m.get();
                jx2 jx2Var3 = this.b;
                tympanoplastyVar.a(jx2Var3.h, jx2Var3.f, this.a, new fx2(jx2Var3, atomicBoolean, this.c));
            }
        } catch (Throwable th) {
            if (atomicBoolean.getAndSet(true)) {
                return Unit.f29295attabal;
            }
            impassible impassibleVar = this.c;
            int value = k41.INTERNAL_ERROR.a().getValue();
            String message = th.getMessage();
            if (message == null) {
                message = th.toString();
            }
            impassibleVar.resumeWith(Result.m3351constructorimpl(new qn0(new MediationAdError(value, message, AdError.GOOGLE_MOBILE_ADS_DOMAIN))));
        }
        return Unit.f29295attabal;
    }
}
