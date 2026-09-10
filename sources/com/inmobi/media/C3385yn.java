package com.inmobi.media;

import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.wireman;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3385yn implements wireman {
    public final /* synthetic */ saran a;
    public final /* synthetic */ Bn b;

    public C3385yn(saran saranVar, Bn bn) {
        this.b = bn;
        this.a = saranVar;
    }

    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, dern dernVar) {
        saran saranVar = this.a;
        boolean z = true;
        if (((Mn) obj) == Mn.VISIBLE) {
            Cn cn = this.b.d;
            if (!cn.b) {
                monroe monroeVar = cn.a;
                if (!(monroeVar != null ? monroeVar.isActive() : false)) {
                    z = false;
                }
            }
            if (!z) {
                Bn bn = this.b;
                bn.d.a = cutely.wireman(saranVar, null, null, new An(bn, null), 3, null);
            }
        } else {
            Bn bn2 = this.b;
            monroe monroeVar2 = bn2.d.a;
            if (monroeVar2 != null) {
                monroe.attabal.attabal(monroeVar2, null, 1, null);
            }
            bn2.d.a = null;
        }
        return Unit.f29295attabal;
    }
}
