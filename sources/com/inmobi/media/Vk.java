package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import androidx.window.embedding.ActivityFilter;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.RuleController;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.privatdozent;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.text.Regex;
import patroclinal.taiyuan;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Vk extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vk(Context context, dern dernVar) {
        super(1, dernVar);
        this.b = context;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new Vk(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Vk(this.b, (dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        String string;
        ?? Formularize;
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            taiyuan taiyuanVar = AbstractC2948h9.a;
            Context context = Ji.a;
            if (context != null) {
                String[] strArrDatabaseList = context.databaseList();
                if (strArrDatabaseList != null) {
                    Formularize = new ArrayList();
                    for (String str : strArrDatabaseList) {
                        Intrinsics.beachfront(str);
                        if (new Regex("com\\.im_([0-9]+\\.){2}[0-9]+([-.\\w]*).db(-wal)?(-shm)?").matches(str) && !Intrinsics.wireman(str, "com.im_11.1.0.db")) {
                            Formularize.add(str);
                        }
                    }
                } else {
                    Formularize = adultoid.formularize();
                }
                for (String str2 : Formularize) {
                    File databasePath = context.getDatabasePath(str2);
                    if (databasePath != null && databasePath.exists()) {
                        context.deleteDatabase(str2);
                    }
                }
            }
            K4 k4 = K4.a;
            Intrinsics.checkNotNullExpressionValue("K4", "TAG");
            kotlinx.coroutines.taiyuan.saneness(null, new F4(null), 1, null);
            if (E0.b == null) {
                E0.b = new A0();
            }
            C2968i4 c2968i4 = Y3.a;
            Y3.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, E0.d);
            A0 a0 = E0.b;
            if (a0 == null) {
                Intrinsics.preprohormone("executor");
                a0 = null;
            }
            if (!a0.a.get()) {
                A0 a1 = E0.b;
                if (a1 == null) {
                    Intrinsics.preprohormone("executor");
                    a1 = null;
                }
                if (!a1.a.get()) {
                    Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
                    if (((AdConfig) Y3.a.a(AdConfig.class)).getAdQuality().getEnabled()) {
                        a1.a();
                    }
                }
            }
            F9.b();
            F9.a();
            L5 l5 = J5.a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) Y3.a.a(AdConfig.class);
            N0 adReqDeprecateChecker = adConfig.getAdReqDeprecateChecker();
            boolean zA = adReqDeprecateChecker != null ? adReqDeprecateChecker.a(true) : true;
            J5.e = zA;
            if (!zA && J5.c == null) {
                Context context2 = Ji.a;
                if (context2 == null) {
                    string = null;
                } else {
                    ConcurrentHashMap concurrentHashMap = Ea.b;
                    Ea eaA = Da.a(context2, "display_info_store");
                    Intrinsics.checkNotNullParameter("gesture_margin", com.ironsource.X3.i.W);
                    string = eaA.a.getString("gesture_margin", null);
                }
                J5.c = string;
            }
            if (adConfig.getRendering().getEnableImmersive()) {
                J5.j();
                J5.i();
            }
            Vg.b();
            Yk yk = Yk.a;
            this.a = 1;
            if (yk.b(this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        Context context3 = this.b;
        Intrinsics.checkNotNullParameter(context3, "context");
        try {
            polloi.saneness(ActivityFilter.class).taiyuan();
            polloi.saneness(ActivityRule.class).taiyuan();
            polloi.saneness(RuleController.class).taiyuan();
            RuleController.Companion.getInstance(context3).addRule(new ActivityRule.Builder(privatdozent.wireman(new ActivityFilter(new ComponentName(context3, (Class<?>) InMobiAdActivity.class), (String) null))).setAlwaysExpand(true).build());
        } catch (NoClassDefFoundError unused) {
        }
        Context context4 = this.b;
        Intrinsics.checkNotNullParameter(context4, "context");
        ConcurrentHashMap concurrentHashMap2 = Ea.b;
        Da.a(context4, "sdk_version_store").a("sdk_version", "11.1.0", false);
        Yk.b = true;
        return Unit.f29295attabal;
    }
}
