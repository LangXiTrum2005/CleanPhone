package ads_mobile_sdk;

import android.net.Uri;
import android.os.Bundle;
import com.ironsource.X3;
import com.unity3d.services.core.fid.Constants;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;
import saneness.grout;

/* JADX INFO: loaded from: classes.dex */
public final class ch0 {
    public final wg0 a;
    public final saran b;
    public final jk0 c;

    public ch0(wg0 firebaseAnalyticsAdapter, saran backgroundScope, jk0 flags) {
        Intrinsics.checkNotNullParameter(firebaseAnalyticsAdapter, "firebaseAnalyticsAdapter");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = firebaseAnalyticsAdapter;
        this.b = backgroundScope;
        this.c = flags;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Uri.Builder builder, wretchedly.dern dernVar) {
        zg0 zg0Var;
        Uri.Builder builder2;
        Uri.Builder builder3;
        Uri uri;
        ch0 ch0Var;
        if (dernVar instanceof zg0) {
            zg0Var = (zg0) dernVar;
            int i = zg0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                zg0Var.g = i - Integer.MIN_VALUE;
            } else {
                zg0Var = new zg0(this, dernVar);
            }
        } else {
            zg0Var = new zg0(this, dernVar);
        }
        Object obj = zg0Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = zg0Var.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Uri uriBuild = builder.build();
            wg0 wg0Var = this.a;
            zg0Var.a = this;
            zg0Var.b = builder;
            zg0Var.c = builder;
            zg0Var.d = uriBuild;
            zg0Var.g = 1;
            wg0Var.getClass();
            Object objA = wg0.a(wg0Var, zg0Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            builder2 = builder;
            builder3 = builder2;
            uri = uriBuild;
            obj = objA;
            ch0Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uri = zg0Var.d;
            builder2 = zg0Var.c;
            builder3 = zg0Var.b;
            ch0Var = zg0Var.a;
            p002kotlin.dern.saneness(obj);
        }
        String str = (String) obj;
        if (str != null && uri.getQueryParameter("gmp_app_id") == null) {
            builder2.appendQueryParameter("gmp_app_id", str);
        }
        Object objA2 = ch0Var.a.a(Constants.GET_APP_INSTANCE_ID);
        String string = objA2 != null ? objA2.toString() : null;
        if (string != null && uri.getQueryParameter("fbs_aiid") == null) {
            builder2.appendQueryParameter("fbs_aiid", string);
        }
        return builder3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(Uri uri, tg0 tg0Var, Bundle bundle, wretchedly.dern dernVar) {
        bh0 bh0Var;
        ch0 ch0Var;
        Uri.Builder builder;
        tg0 tg0Var2;
        Bundle bundle2;
        if (dernVar instanceof bh0) {
            bh0Var = (bh0) dernVar;
            int i = bh0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                bh0Var.g = i - Integer.MIN_VALUE;
            } else {
                bh0Var = new bh0(this, dernVar);
            }
        } else {
            bh0Var = new bh0(this, dernVar);
        }
        Object obj = bh0Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = bh0Var.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            jk0 jk0Var = this.c;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:firebase_analytics_integration:enabled", X3.i.W);
            if (!((Boolean) jk0Var.a("gads:firebase_analytics_integration:enabled", Boolean.TRUE, zk.b)).booleanValue()) {
                return uri;
            }
            Uri.Builder builderBuildUpon = uri.buildUpon();
            Intrinsics.beachfront(builderBuildUpon);
            String string = builderBuildUpon.build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            jk0 jk0Var2 = this.c;
            grout.attabal(jk0Var2, "gads_firebase_analytics_url_macro", X3.i.W, "%5Bgw_fbsaeid%5D", "defaultValue");
            if (StringsKt.overspeculate(string, (String) jk0Var2.a("gads_firebase_analytics_url_macro", "%5Bgw_fbsaeid%5D", zk.o), false, 2, null)) {
                bh0Var.a = this;
                bh0Var.b = tg0Var;
                bh0Var.c = bundle;
                bh0Var.d = builderBuildUpon;
                bh0Var.g = 1;
                if (a(builderBuildUpon, bh0Var) == objBeachfront) {
                    return objBeachfront;
                }
                ch0Var = this;
                builder = builderBuildUpon;
                tg0Var2 = tg0Var;
                bundle2 = bundle;
            } else {
                Uri uriBuild = builderBuildUpon.build();
                Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
                return uriBuild;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            builder = bh0Var.d;
            Bundle bundle3 = bh0Var.c;
            tg0 tg0Var3 = bh0Var.b;
            ch0 ch0Var2 = bh0Var.a;
            p002kotlin.dern.saneness(obj);
            ch0Var = ch0Var2;
            bundle2 = bundle3;
            tg0Var2 = tg0Var3;
        }
        Intrinsics.beachfront(builder);
        Object objA = ch0Var.a.a("generateEventId");
        String string2 = objA != null ? objA.toString() : null;
        if (string2 != null) {
            saran saranVar = ch0Var.b;
            ah0 block = new ah0(ch0Var, tg0Var2, bundle2, string2, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
            String string3 = builder.build().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            jk0 jk0Var3 = ch0Var.c;
            grout.attabal(jk0Var3, "gads_firebase_analytics_url_macro", X3.i.W, "%5Bgw_fbsaeid%5D", "defaultValue");
            Uri uri2 = Uri.parse(dovishness.polder(string3, (String) jk0Var3.a("gads_firebase_analytics_url_macro", "%5Bgw_fbsaeid%5D", zk.o), string2, false, 4, null));
            Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
            return uri2;
        }
        Uri uriBuild2 = builder.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild2, "build(...)");
        return uriBuild2;
    }
}
