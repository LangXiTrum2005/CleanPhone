package ads_mobile_sdk;

import com.google.android.gms.ads.AdError;
import complexometry.MediationAdError;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.impassible;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coreopsis;

/* JADX INFO: loaded from: classes.dex */
public final class fx2 implements coreopsis {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ impassible b;
    public final /* synthetic */ jx2 c;

    public fx2(jx2 jx2Var, AtomicBoolean atomicBoolean, impassible impassibleVar) {
        this.a = atomicBoolean;
        this.b = impassibleVar;
        this.c = jx2Var;
    }

    public final void a(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        if (this.a.getAndSet(true)) {
            return;
        }
        impassible impassibleVar = this.b;
        Result.Companion companion = Result.INSTANCE;
        impassibleVar.resumeWith(Result.m3351constructorimpl(new qn0(new MediationAdError(adError.getCode(), adError.getMessage(), adError.getCom.ironsource.X3.j.D java.lang.String()))));
    }

    public final void a() {
        if (this.a.getAndSet(true)) {
            return;
        }
        impassible impassibleVar = this.b;
        Result.Companion companion = Result.INSTANCE;
        impassibleVar.resumeWith(Result.m3351constructorimpl(new tn0(Unit.f29295attabal)));
    }
}
