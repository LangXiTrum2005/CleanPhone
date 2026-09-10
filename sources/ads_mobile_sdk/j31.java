package ads_mobile_sdk;

import com.ironsource.X3;
import complexometry.ResponseInfo;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.alloy;
import saneness.dragline;
import saneness.fright;
import saneness.marial;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class j31 implements alloy {
    public final String a;
    public final int b;
    public final d6 c;
    public final fright d;
    public final q02 e;
    public final l13 f;
    public final dragline g;
    public final jk0 h;
    public final marial i;

    public j31(String requestId, int i, d6 adSourceResponseInfoCollector, fright transactionRequester, q02 transactionRenderer, l13 traceMetaSet, dragline internalAdRequestEventEmitter, jk0 flags, marial internalAdLoadEventEmitter) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(adSourceResponseInfoCollector, "adSourceResponseInfoCollector");
        Intrinsics.checkNotNullParameter(transactionRequester, "transactionRequester");
        Intrinsics.checkNotNullParameter(transactionRenderer, "transactionRenderer");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(internalAdRequestEventEmitter, "internalAdRequestEventEmitter");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(internalAdLoadEventEmitter, "internalAdLoadEventEmitter");
        this.a = requestId;
        this.b = i;
        this.c = adSourceResponseInfoCollector;
        this.d = transactionRequester;
        this.e = transactionRenderer;
        this.f = traceMetaSet;
        this.g = internalAdRequestEventEmitter;
        this.h = flags;
        this.i = internalAdLoadEventEmitter;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ads_mobile_sdk.j31] */
    public final Object a(wretchedly.dern dernVar) {
        h31 h31Var;
        ResponseInfo responseInfo;
        un0 un0Var;
        j31 j31Var;
        spartacist spartacistVar;
        ResponseInfo responseInfoA;
        spartacist spartacistVar2;
        ResponseInfo responseInfo2;
        if (dernVar instanceof h31) {
            h31Var = (h31) dernVar;
            int i = h31Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                h31Var.e = i - Integer.MIN_VALUE;
            } else {
                h31Var = new h31(this, dernVar);
            }
        } else {
            h31Var = new h31(this, dernVar);
        }
        Object objWireman = h31Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        j31 j31Var2 = h31Var.e;
        try {
            if (j31Var2 == 0) {
                p002kotlin.dern.saneness(objWireman);
                w03 w03VarA = j13.a();
                l13 l13Var = this.f;
                Intrinsics.checkNotNullParameter(l13Var, "<set-?>");
                w03VarA.a = l13Var;
                j71 j71Var = this.f.b;
                j71Var.a = this.a;
                j71Var.c = this.b;
                dragline draglineVar = this.g;
                h31Var.a = this;
                h31Var.e = 1;
                if (draglineVar.b(h31Var) != objBeachfront) {
                    j31Var = this;
                }
                return objBeachfront;
            }
            if (j31Var2 == 1) {
                j31 j31Var3 = (j31) h31Var.a;
                p002kotlin.dern.saneness(objWireman);
                j31Var = j31Var3;
            } else {
                if (j31Var2 == 2) {
                    j31 j31Var4 = (j31) h31Var.a;
                    p002kotlin.dern.saneness(objWireman);
                    j31Var2 = j31Var4;
                    spartacistVar = (spartacist) objWireman;
                    if (spartacistVar instanceof tn0) {
                        return new g31((kotlinx.coroutines.flow.dern) ((tn0) spartacistVar).b, j31Var2);
                    }
                    if (spartacistVar instanceof nn0) {
                        throw new NoWhenBranchMatchedException();
                    }
                    responseInfoA = j31Var2.c.a();
                    h31Var.a = spartacistVar;
                    h31Var.b = responseInfoA;
                    h31Var.e = 4;
                    if (j31Var2.i.a((nn0) spartacistVar, responseInfoA, h31Var) != objBeachfront) {
                        spartacistVar2 = spartacistVar;
                        responseInfo2 = responseInfoA;
                    }
                    return objBeachfront;
                }
                if (j31Var2 == 3) {
                    un0Var = (un0) h31Var.b;
                    responseInfo = (ResponseInfo) h31Var.a;
                    p002kotlin.dern.saneness(objWireman);
                    return kotlinx.coroutines.flow.marial.gintrap(new Pair(un0Var, responseInfo));
                }
                if (j31Var2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                responseInfo2 = (ResponseInfo) h31Var.b;
                spartacistVar2 = (spartacist) h31Var.a;
                p002kotlin.dern.saneness(objWireman);
            }
            return kotlinx.coroutines.flow.marial.gintrap(new Pair(spartacistVar2, responseInfo2));
            jk0 jk0Var = j31Var.h;
            jk0Var.getClass();
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            long jMolybdenite = p002kotlin.time.dern.molybdenite(5, DurationUnit.MINUTES);
            Intrinsics.checkNotNullParameter("gads:load_timeout:milliseconds", X3.i.W);
            long rawValue = ((p002kotlin.time.saneness) jk0Var.a("gads:load_timeout:milliseconds", p002kotlin.time.saneness.cutely(jMolybdenite), zk.j)).getRawValue();
            i31 i31Var = new i31(j31Var, null);
            h31Var.a = j31Var;
            h31Var.e = 2;
            objWireman = TimeoutKt.wireman(rawValue, i31Var, h31Var);
            j31Var2 = j31Var;
            if (objWireman != objBeachfront) {
                spartacistVar = (spartacist) objWireman;
                if (spartacistVar instanceof tn0) {
                    return new g31((kotlinx.coroutines.flow.dern) ((tn0) spartacistVar).b, j31Var2);
                }
                if (spartacistVar instanceof nn0) {
                    throw new NoWhenBranchMatchedException();
                }
                responseInfoA = j31Var2.c.a();
                h31Var.a = spartacistVar;
                h31Var.b = responseInfoA;
                h31Var.e = 4;
                if (j31Var2.i.a((nn0) spartacistVar, responseInfoA, h31Var) != objBeachfront) {
                    spartacistVar2 = spartacistVar;
                    responseInfo2 = responseInfoA;
                    return kotlinx.coroutines.flow.marial.gintrap(new Pair(spartacistVar2, responseInfo2));
                }
            }
        } catch (TimeoutCancellationException e) {
            ResponseInfo responseInfoA2 = j31Var2.c.a();
            un0 un0Var2 = new un0(e, 1);
            marial marialVar = j31Var2.i;
            h31Var.a = responseInfoA2;
            h31Var.b = un0Var2;
            h31Var.e = 3;
            if (marialVar.a(un0Var2, responseInfoA2, h31Var) != objBeachfront) {
                responseInfo = responseInfoA2;
                un0Var = un0Var2;
            }
            return objBeachfront;
        }
        return objBeachfront;
    }
}
