package com.inmobi.media;

import kotlinx.coroutines.flow.wireman;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2961hm implements wireman {
    public final /* synthetic */ wireman a;

    public C2961hm(wireman wiremanVar) {
        this.a = wiremanVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, dern dernVar) {
        C2936gm c2936gm;
        if (dernVar instanceof C2936gm) {
            c2936gm = (C2936gm) dernVar;
            int i = c2936gm.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2936gm.b = i - Integer.MIN_VALUE;
            } else {
                c2936gm = new C2936gm(this, dernVar);
            }
        } else {
            c2936gm = new C2936gm(this, dernVar);
        }
        Object obj2 = c2936gm.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c2936gm.b;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj2);
            wireman wiremanVar = this.a;
            Rl rl = (Rl) obj;
            if (Intrinsics.wireman(rl, C2986in.a) || (rl instanceof Pl)) {
                c2936gm.b = 1;
                if (wiremanVar.emit(obj, c2936gm) == objBeachfront) {
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
