package ads_mobile_sdk;

import android.content.Context;
import androidx.work.NetworkType;
import androidx.work.formularize;
import androidx.work.polloi;
import com.google.android.libraries.ads.mobile.sdk.internal.offline.OfflinePingSender;
import com.google.common.base.triweekly;
import formularization.beachfront;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.blighty;

/* JADX INFO: loaded from: classes.dex */
public final class mu1 {
    public final Context a;
    public final int b;
    public final long c;
    public final blighty d;
    public final formularization.attabal e;
    public boolean f;

    public mu1(Context context, int i, long j, blighty userAgentProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        this.a = context;
        this.b = i;
        this.c = j;
        this.d = userAgentProvider;
        this.e = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(mu1 mu1Var, wretchedly.dern dernVar) {
        ku1 ku1Var;
        formularization.attabal attabalVar;
        polloi polloiVarWireman;
        androidx.work.saneness sanenessVarAttabal;
        Class cls;
        String str;
        mu1 mu1Var2;
        androidx.work.wireman.attabal attabalVar2;
        if (dernVar instanceof ku1) {
            ku1Var = (ku1) dernVar;
            int i = ku1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ku1Var.j = i - Integer.MIN_VALUE;
            } else {
                ku1Var = new ku1(mu1Var, dernVar);
            }
        } else {
            ku1Var = new ku1(mu1Var, dernVar);
        }
        Object obj = ku1Var.h;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ku1Var.j;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                formularization.attabal attabalVar3 = mu1Var.e;
                ku1Var.a = mu1Var;
                ku1Var.b = attabalVar3;
                ku1Var.j = 1;
                if (attabalVar3.attabal(null, ku1Var) != objBeachfront) {
                    attabalVar = attabalVar3;
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                formularization.attabal attabalVar4 = ku1Var.b;
                mu1 mu1Var3 = ku1Var.a;
                p002kotlin.dern.saneness(obj);
                attabalVar = attabalVar4;
                mu1Var = mu1Var3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar2 = ku1Var.g;
                str = ku1Var.f;
                sanenessVarAttabal = ku1Var.e;
                cls = ku1Var.d;
                polloiVarWireman = ku1Var.c;
                attabalVar = ku1Var.b;
                mu1Var2 = ku1Var.a;
                p002kotlin.dern.saneness(obj);
            }
            androidx.work.wireman wiremanVarAttabal = attabalVar2.competently(str, (String) obj).beachfront("HTTP_CLIENT_TIMEOUT", mu1Var2.c).attabal();
            Intrinsics.checkNotNullExpressionValue(wiremanVarAttabal, "build(...)");
            formularize formularizeVarSaneness = new formularize.attabal(cls).marial(sanenessVarAttabal).beachfront(wiremanVarAttabal).attabal("offline_ping_sender_work").saneness();
            Intrinsics.checkNotNullExpressionValue(formularizeVarSaneness, "build(...)");
            polloiVarWireman.saneness(formularizeVarSaneness);
            attabalVar.wireman(null);
            return Unit.f29295attabal;
            if (!mu1Var.f) {
                try {
                    polloi.marial(mu1Var.a, new androidx.work.attabal.saneness().attabal());
                    mu1Var.f = true;
                } catch (Exception e) {
                    triweekly triweeklyVar = kn0.a;
                    kn0.a(new lu1(e));
                }
            }
            polloiVarWireman = polloi.wireman(mu1Var.a);
            polloiVarWireman.attabal("offline_ping_sender_work");
            sanenessVarAttabal = new androidx.work.saneness.attabal().saneness(NetworkType.CONNECTED).attabal();
            Intrinsics.checkNotNullExpressionValue(sanenessVarAttabal, "build(...)");
            androidx.work.wireman.attabal attabalVarMarial = new androidx.work.wireman.attabal().marial("OFFLINE_DATABASE_VERSION", mu1Var.b);
            blighty blightyVar = mu1Var.d;
            ku1Var.a = mu1Var;
            ku1Var.b = attabalVar;
            ku1Var.c = polloiVarWireman;
            ku1Var.d = OfflinePingSender.class;
            ku1Var.e = sanenessVarAttabal;
            ku1Var.f = "USER_AGENT";
            ku1Var.g = attabalVarMarial;
            ku1Var.j = 2;
            Object objA = blightyVar.a(ku1Var);
            if (objA != objBeachfront) {
                cls = OfflinePingSender.class;
                obj = objA;
                str = "USER_AGENT";
                mu1Var2 = mu1Var;
                attabalVar2 = attabalVarMarial;
                androidx.work.wireman wiremanVarAttabal2 = attabalVar2.competently(str, (String) obj).beachfront("HTTP_CLIENT_TIMEOUT", mu1Var2.c).attabal();
                Intrinsics.checkNotNullExpressionValue(wiremanVarAttabal2, "build(...)");
                formularize formularizeVarSaneness2 = new formularize.attabal(cls).marial(sanenessVarAttabal).beachfront(wiremanVarAttabal2).attabal("offline_ping_sender_work").saneness();
                Intrinsics.checkNotNullExpressionValue(formularizeVarSaneness2, "build(...)");
                polloiVarWireman.saneness(formularizeVarSaneness2);
                attabalVar.wireman(null);
                return Unit.f29295attabal;
            }
            return objBeachfront;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }
}
