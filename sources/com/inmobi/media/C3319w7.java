package com.inmobi.media;

import kotlinx.coroutines.flow.wireman;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.w7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3319w7 implements wireman {
    public final /* synthetic */ wireman a;

    public C3319w7(wireman wiremanVar) {
        this.a = wiremanVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, dern dernVar) {
        C3294v7 c3294v7;
        if (dernVar instanceof C3294v7) {
            c3294v7 = (C3294v7) dernVar;
            int i = c3294v7.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3294v7.b = i - Integer.MIN_VALUE;
            } else {
                c3294v7 = new C3294v7(this, dernVar);
            }
        } else {
            c3294v7 = new C3294v7(this, dernVar);
        }
        Object obj2 = c3294v7.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3294v7.b;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj2);
            wireman wiremanVar = this.a;
            if (((Rl) obj) instanceof Pl) {
                c3294v7.b = 1;
                if (wiremanVar.emit(obj, c3294v7) == objBeachfront) {
                    return objBeachfront;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj2);
        }
        return Unit.f29295attabal;
    }
}
