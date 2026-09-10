package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import formularization.attabal;
import formularization.beachfront;
import java.util.Objects;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2766a7 {
    public static final C2766a7 a = new C2766a7();
    public static InMobiUserDataModel b;
    public static final attabal c;

    static {
        Intrinsics.checkNotNullExpressionValue(C2766a7.class.getSimpleName(), "getSimpleName(...)");
        c = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(InMobiUserDataModel inMobiUserDataModel, ContinuationImpl continuationImpl) {
        Z6 z6;
        attabal attabalVar;
        if (continuationImpl instanceof Z6) {
            z6 = (Z6) continuationImpl;
            int i = z6.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                z6.d = i - Integer.MIN_VALUE;
            } else {
                z6 = new Z6(continuationImpl);
            }
        } else {
            z6 = new Z6(continuationImpl);
        }
        Object obj = z6.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = z6.d;
        if (i2 == 0) {
            dern.saneness(obj);
            attabalVar = c;
            z6.a = inMobiUserDataModel;
            z6.b = attabalVar;
            z6.d = 1;
            if (attabalVar.attabal(null, z6) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabal attabalVar2 = z6.b;
            InMobiUserDataModel inMobiUserDataModel2 = z6.a;
            dern.saneness(obj);
            attabalVar = attabalVar2;
            inMobiUserDataModel = inMobiUserDataModel2;
        }
        try {
            Objects.toString(b);
            Objects.toString(inMobiUserDataModel);
            b = inMobiUserDataModel;
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    public final String toString() {
        return String.valueOf(b);
    }
}
