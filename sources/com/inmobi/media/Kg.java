package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import org.json.JSONObject;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Kg extends SuspendLambda implements Function2 {
    public int a;

    public Kg(dern dernVar) {
        super(2, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new Kg(dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Kg((dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                Og og = Og.a;
                og.getClass();
                Context context = Ji.a;
                JSONObject jSONObject = null;
                if (context != null) {
                    if (Og.d == null) {
                        Og.d = new C3403zg(context, "pub_signals_store");
                    }
                    C3403zg c3403zg = Og.d;
                    if (c3403zg == null) {
                        Intrinsics.preprohormone("prefDao");
                        c3403zg = null;
                    }
                    String strA = c3403zg.a("saved_signals");
                    if (strA != null) {
                        jSONObject = new JSONObject(strA);
                    }
                }
                if (jSONObject == null) {
                    return Unit.f29295attabal;
                }
                SignalsConfig.PublisherConfig publisherConfigC = Og.c();
                JSONObject jSONObjectA = Pg.a(Pg.a(Pg.a(jSONObject, "obj_", publisherConfigC.getObj().getExpiry()), "auto_", publisherConfigC.getAuto().getExpiry()), "dir_", publisherConfigC.getDirect().getExpiry());
                this.a = 1;
                if (og.a(jSONObjectA, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
        } catch (Exception e) {
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e);
        }
        return Unit.f29295attabal;
    }
}
