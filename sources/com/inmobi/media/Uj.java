package com.inmobi.media;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.saran;
import org.json.JSONObject;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Uj extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ EnumC2779ak d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uj(String str, Map map, EnumC2779ak enumC2779ak, dern dernVar) {
        super(2, dernVar);
        this.b = str;
        this.c = map;
        this.d = enumC2779ak;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new Uj(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Uj) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int iA;
        String str;
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                Wj wj = Wj.a;
                Map map = this.c;
                EnumC2779ak enumC2779ak = this.d;
                Objects.toString(map);
                Objects.toString(enumC2779ak);
                if (Wj.g == null) {
                    return Unit.f29295attabal;
                }
                if (Wj.a(this.b, this.c, this.d)) {
                    return Unit.f29295attabal;
                }
                C3008jk c3008jk = Wj.g;
                if (c3008jk == null) {
                    Intrinsics.preprohormone("mTelemetryValidator");
                    c3008jk = null;
                }
                EnumC2779ak telemetryEventType = this.d;
                String eventType = this.b;
                c3008jk.getClass();
                Intrinsics.checkNotNullParameter(telemetryEventType, "telemetryEventType");
                Intrinsics.checkNotNullParameter(eventType, "eventType");
                int iOrdinal = telemetryEventType.ordinal();
                if (iOrdinal == 0) {
                    iA = c3008jk.b.a(eventType);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iA = c3008jk.c.a(eventType);
                }
                if (iA != 0) {
                    if (iA != 1) {
                        return Unit.f29295attabal;
                    }
                    if (this.c.get("samplingRate") == null) {
                        this.c.put("samplingRate", igo.attabal.wireman(100));
                    }
                } else if (this.c.get("samplingRate") == null) {
                    this.c.put("samplingRate", igo.attabal.wireman(pastie.dern.dern((((double) 1) - Wj.b().getSamplingFactor()) * ((double) 100))));
                }
                String str2 = this.b;
                int iOrdinal2 = this.d.ordinal();
                if (iOrdinal2 == 0) {
                    str = "sdk";
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "template";
                }
                C2882ek c2882ek = new C2882ek(str2, null, str);
                this.c.put("eventType", c2882ek.a);
                Map map2 = this.c;
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                map2.put("eventId", string);
                this.c.put("isTemplateEvent", igo.attabal.attabal(this.d == EnumC2779ak.TEMPLATE));
                Map map3 = this.c;
                Intrinsics.competently(map3, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                String payload = new JSONObject(map3).toString();
                Intrinsics.checkNotNullExpressionValue(payload, "toString(...)");
                Intrinsics.checkNotNullParameter(payload, "payload");
                c2882ek.b = payload;
                this.a = 1;
                if (wj.a(c2882ek, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
            Wj.a.a();
        } catch (Exception e) {
            Wj wj2 = Wj.a;
            e.getMessage();
        }
        return Unit.f29295attabal;
    }
}
