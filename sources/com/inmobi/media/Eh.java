package com.inmobi.media;

import org.json.JSONObject;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Eh extends SuspendLambda implements Function1 {
    public final /* synthetic */ Gh a;
    public final /* synthetic */ Ab b;
    public final /* synthetic */ JSONObject c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eh(Gh gh, Ab ab, JSONObject jSONObject, dern dernVar) {
        super(1, dernVar);
        this.a = gh;
        this.b = ab;
        this.c = jSONObject;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new Eh(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Eh) create((dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0047 A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:3:0x0006, B:11:0x0025, B:16:0x002c, B:17:0x0031, B:18:0x0032, B:20:0x0036, B:23:0x003b, B:25:0x003f, B:27:0x0043, B:29:0x0047), top: B:34:0x0006 }] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        try {
            Cb cb = this.a.e;
            Ab eventLogLevel = this.b;
            cb.getClass();
            Intrinsics.checkNotNullParameter(eventLogLevel, "eventLogLevel");
            int iOrdinal = cb.a.ordinal();
            if (iOrdinal == 0) {
                this.a.g.add(this.c);
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (eventLogLevel == Ab.STATE) {
                        this.a.g.add(this.c);
                    }
                } else if (eventLogLevel == Ab.ERROR || eventLogLevel == Ab.STATE) {
                    this.a.g.add(this.c);
                }
            } else if (eventLogLevel == Ab.DEBUG || eventLogLevel == Ab.ERROR || eventLogLevel == Ab.STATE) {
                this.a.g.add(this.c);
            }
        } catch (Exception e) {
            this.a.getClass();
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e);
        }
        return Unit.f29295attabal;
    }
}
