package ads_mobile_sdk;

import android.content.Context;
import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.graveside;
import androidx.privacysandbox.ads.adservices.topics.impromptu;
import com.ironsource.X3;
import java.util.List;
import java.util.regex.Pattern;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.leh;
import saneness.loun;
import saneness.portwide;
import saneness.sevenfold;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class q03 implements portwide {
    public final Context a;
    public final iv b;
    public final loun c;
    public final jk0 d;

    public q03(Context context, iv consentManager, loun traceLogger, jk0 flags) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = context;
        this.b = consentManager;
        this.c = traceLogger;
        this.d = flags;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.TOPICS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        p03 p03Var;
        q03 q03Var;
        o03 o03Var;
        if (dernVar instanceof p03) {
            p03Var = (p03) dernVar;
            int i = p03Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p03Var.d = i - Integer.MIN_VALUE;
            } else {
                p03Var = new p03(this, dernVar);
            }
        } else {
            p03Var = new p03(this, dernVar);
        }
        Object objA = p03Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = p03Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            jk0 jk0Var = this.d;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:topics_app_allowlist:enabled", X3.i.W);
            if (((Boolean) jk0Var.a("gads:topics_app_allowlist:enabled", Boolean.TRUE, zk.b)).booleanValue()) {
                jk0 jk0Var2 = this.d;
                jk0Var2.getClass();
                List defaultValue = adultoid.formularize();
                Intrinsics.checkNotNullParameter("gads:allowlisted_apps_list_for_topics", X3.i.W);
                Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
                if (!((List) jk0Var2.a("gads:allowlisted_apps_list_for_topics", defaultValue, zk.g)).contains(this.a.getPackageName())) {
                    return new tn0(new n03(3, (Integer) null));
                }
            }
            iv ivVar = this.b;
            p03Var.a = this;
            p03Var.d = 1;
            Pattern pattern = iv.P;
            ivVar.getClass();
            objA = iv.a(ivVar, false, (wretchedly.dern) p03Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            q03Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q03Var = p03Var.a;
            p002kotlin.dern.saneness(objA);
        }
        spartacist spartacistVar = (spartacist) objA;
        if (spartacistVar == null) {
            return new tn0(new n03(3, (Integer) null));
        }
        if (!(spartacistVar instanceof tn0)) {
            if (!(spartacistVar instanceof nn0)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((nn0) spartacistVar) instanceof on0) {
                on0 on0Var = (on0) spartacistVar;
                ((d13) q03Var.c).a("TopicsSignalSource.getSignalInternal", on0Var.c);
                Throwable th = on0Var.c;
                o03Var = th instanceof IllegalStateException ? o03.INCOMPATIBLE_BUILD : th instanceof SecurityException ? o03.UNAUTHORIZED : o03.UNKNOWN_ERROR;
            } else {
                o03Var = o03.UNKNOWN_ERROR;
            }
            return new tn0(new n03(2, igo.attabal.wireman(o03Var.a)));
        }
        List<graveside> listAttabal = ((impromptu) ((tn0) spartacistVar).b).attabal();
        if (listAttabal.isEmpty()) {
            o03 o03Var2 = o03.UNKNOWN_ERROR;
            return new tn0(new n03(2, igo.attabal.wireman(1)));
        }
        leh builder = j03.o();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (graveside gravesideVar : listAttabal) {
            List listDern = builder.dern();
            Intrinsics.checkNotNullExpressionValue(listDern, "getAndroidTopicsList(...)");
            yd0 yd0Var = new yd0(listDern);
            sevenfold builder2 = h03.o();
            Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder2, "builder");
            builder2.attabal(gravesideVar.getTopicCode());
            builder2.dern(gravesideVar.getModelVersion());
            builder2.wireman(gravesideVar.getTaxonomyVersion());
            xm0 xm0VarA = builder2.a();
            Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
            h03 value = (h03) xm0VarA;
            Intrinsics.checkNotNullParameter(yd0Var, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            builder.attabal(value);
        }
        xm0 xm0VarA2 = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA2, "build(...)");
        String strEncodeToString = Base64.encodeToString(((j03) xm0VarA2).a(), 1);
        o03 o03Var3 = o03.UNKNOWN_ERROR;
        return new tn0(new n03(igo.attabal.wireman(1), strEncodeToString));
    }
}
