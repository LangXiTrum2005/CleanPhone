package com.inmobi.media;

import kotlinx.coroutines.flow.wireman;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Um implements wireman {
    public final /* synthetic */ wireman a;

    public Um(wireman wiremanVar) {
        this.a = wiremanVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, dern dernVar) {
        Tm tm;
        if (dernVar instanceof Tm) {
            tm = (Tm) dernVar;
            int i = tm.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tm.b = i - Integer.MIN_VALUE;
            } else {
                tm = new Tm(this, dernVar);
            }
        } else {
            tm = new Tm(this, dernVar);
        }
        Object obj2 = tm.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = tm.b;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj2);
            wireman wiremanVar = this.a;
            Boolean boolAttabal = igo.attabal.attabal(((Mn) obj) == Mn.VISIBLE);
            tm.b = 1;
            if (wiremanVar.emit(boolAttabal, tm) == objBeachfront) {
                return objBeachfront;
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
