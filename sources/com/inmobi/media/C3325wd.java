package com.inmobi.media;

import kotlinx.coroutines.flow.wireman;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3325wd implements wireman {
    public final /* synthetic */ wireman a;

    public C3325wd(wireman wiremanVar) {
        this.a = wiremanVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, dern dernVar) {
        C3300vd c3300vd;
        if (dernVar instanceof C3300vd) {
            c3300vd = (C3300vd) dernVar;
            int i = c3300vd.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3300vd.b = i - Integer.MIN_VALUE;
            } else {
                c3300vd = new C3300vd(this, dernVar);
            }
        } else {
            c3300vd = new C3300vd(this, dernVar);
        }
        Object obj2 = c3300vd.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3300vd.b;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj2);
            wireman wiremanVar = this.a;
            if (((AbstractC2797bc) obj) instanceof Rl) {
                c3300vd.b = 1;
                if (wiremanVar.emit(obj, c3300vd) == objBeachfront) {
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
