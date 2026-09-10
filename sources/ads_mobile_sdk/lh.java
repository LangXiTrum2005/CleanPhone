package ads_mobile_sdk;

import android.net.Uri;
import android.view.InputEvent;
import com.ironsource.X3;
import java.util.Random;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;
import saneness.grout;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class lh extends SuspendLambda implements Function1 {
    public Uri.Builder a;
    public int b;
    public final /* synthetic */ oh c;
    public final /* synthetic */ Uri d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(oh ohVar, Uri uri, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.c = ohVar;
        this.d = uri;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new lh(this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new lh(this.c, this.d, (wretchedly.dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Uri.Builder builder;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.b;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            oh ohVar = this.c;
            Uri uri = this.d;
            ohVar.getClass();
            if (!dovishness.trm(uri.getQueryParameter("ase"), "3", false, 2, null)) {
                return this.d;
            }
            Uri.Builder builderBuildUpon = this.d.buildUpon();
            this.c.d.getClass();
            String strValueOf = String.valueOf(new Random().nextInt(Integer.MAX_VALUE));
            jk0 jk0Var = this.c.e;
            grout.attabal(jk0Var, "gads:debug_key_param_for_ara", X3.i.W, "uk", "defaultValue");
            xk xkVar = zk.o;
            builderBuildUpon.appendQueryParameter((String) jk0Var.a("gads:debug_key_param_for_ara", "uk", xkVar), strValueOf);
            InputEvent inputEvent = this.c.b.a;
            if (inputEvent == null) {
                oh ohVar2 = this.c;
                Intrinsics.beachfront(builderBuildUpon);
                jk0 jk0Var2 = ohVar2.e;
                grout.attabal(jk0Var2, "gads:nis_param_for_ara", X3.i.W, "nis", "defaultValue");
                return builderBuildUpon.appendQueryParameter((String) jk0Var2.a("gads:nis_param_for_ara", "nis", xkVar), "11").build();
            }
            oh ohVar3 = this.c;
            Intrinsics.beachfront(builderBuildUpon);
            Uri uri2 = this.d;
            ohVar3.getClass();
            Uri.Builder builderBuildUpon2 = builderBuildUpon.build().buildUpon();
            builderBuildUpon2.appendQueryParameter("asr", "1");
            jk0 jk0Var3 = ohVar3.e;
            grout.attabal(jk0Var3, "gads:nis_param_for_ara", X3.i.W, "nis", "defaultValue");
            builderBuildUpon2.appendQueryParameter((String) jk0Var3.a("gads:nis_param_for_ara", "nis", xkVar), "12");
            Intrinsics.beachfront(builderBuildUpon2);
            if (dovishness.trm(uri2.getQueryParameter("asrd"), "1", false, 2, null)) {
                jk0 jk0Var4 = ohVar3.e;
                grout.attabal(jk0Var4, "gads:source_registration_domain_for_ara", X3.i.W, "www.googleadservices.com", "defaultValue");
                builderBuildUpon2.authority((String) jk0Var4.a("gads:source_registration_domain_for_ara", "www.googleadservices.com", xkVar));
            }
            Uri uriBuild = builderBuildUpon2.build();
            Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
            iv ivVar = this.c.c;
            this.a = builderBuildUpon;
            this.b = 1;
            ivVar.getClass();
            objA = iv.a(ivVar, uriBuild, inputEvent, this);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            builder = builderBuildUpon;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            builder = this.a;
            p002kotlin.dern.saneness(obj);
            objA = obj;
        }
        spartacist spartacistVar = (spartacist) objA;
        if (spartacistVar == null) {
            return this.d;
        }
        if (spartacistVar instanceof tn0) {
            oh ohVar4 = this.c;
            Intrinsics.beachfront(builder);
            jk0 jk0Var5 = ohVar4.e;
            grout.attabal(jk0Var5, "gads:nis_param_for_ara", X3.i.W, "nis", "defaultValue");
            return builder.appendQueryParameter((String) jk0Var5.a("gads:nis_param_for_ara", "nis", zk.o), "12").build();
        }
        if (!(spartacistVar instanceof on0)) {
            oh ohVar5 = this.c;
            Intrinsics.beachfront(builder);
            jk0 jk0Var6 = ohVar5.e;
            grout.attabal(jk0Var6, "gads:nis_param_for_ara", X3.i.W, "nis", "defaultValue");
            return builder.appendQueryParameter((String) jk0Var6.a("gads:nis_param_for_ara", "nis", zk.o), "9").build();
        }
        on0 on0Var = (on0) spartacistVar;
        ((d13) this.c.f).a("AttributionReportingManager.handleRegisterSource", on0Var.c);
        if (on0Var.c instanceof IllegalStateException) {
            oh ohVar6 = this.c;
            Intrinsics.beachfront(builder);
            jk0 jk0Var7 = ohVar6.e;
            grout.attabal(jk0Var7, "gads:nis_param_for_ara", X3.i.W, "nis", "defaultValue");
            return builder.appendQueryParameter((String) jk0Var7.a("gads:nis_param_for_ara", "nis", zk.o), "10").build();
        }
        oh ohVar7 = this.c;
        Intrinsics.beachfront(builder);
        jk0 jk0Var8 = ohVar7.e;
        grout.attabal(jk0Var8, "gads:nis_param_for_ara", X3.i.W, "nis", "defaultValue");
        return builder.appendQueryParameter((String) jk0Var8.a("gads:nis_param_for_ara", "nis", zk.o), "9").build();
    }
}
