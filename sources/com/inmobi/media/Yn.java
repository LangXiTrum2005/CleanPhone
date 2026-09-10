package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.Objects;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;
import p002kotlin.text.Charsets;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Yn extends R0 {
    public final Le b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yn(Le networkRequest, C3097n9 c3097n9) {
        super(c3097n9);
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        this.b = networkRequest;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.R0
    public final Object a(dern dernVar) {
        Xn xn;
        if (dernVar instanceof Xn) {
            xn = (Xn) dernVar;
            int i = xn.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xn.c = i - Integer.MIN_VALUE;
            } else {
                xn = new Xn(this, (ContinuationImpl) dernVar);
            }
        } else {
            xn = new Xn(this, (ContinuationImpl) dernVar);
        }
        Object objA = xn.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = xn.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            C3212s0 c3212s0 = C3212s0.a;
            Le le = this.b;
            xn.c = 1;
            objA = c3212s0.a(le, xn);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objA);
        }
        Ne ne = (Ne) objA;
        IntRange intRange = Se.a;
        Intrinsics.checkNotNullParameter(ne, "<this>");
        return ne.d().string(Charsets.UTF_8);
    }

    @Override // com.inmobi.media.R0
    public final Unit a(AdResponse adResponse, Function1 function1) {
        Objects.toString(adResponse);
        V0.a(adResponse, this.a, function1);
        return Unit.f29295attabal;
    }
}
