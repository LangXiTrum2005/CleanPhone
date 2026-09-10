package com.smartdigimkt.y4;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class f extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f40226p;

    public f(Context context, c.g gVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.l8.f fVar) {
        super(context, gVar, aVar, fVar);
        this.f40226p = aVar.f39173w;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030  */
    public a p() {
        com.smartdigimkt.b5.d dVarA;
        d dVar;
        if (TextUtils.isEmpty(((com.smartdigimkt.w6.d) this.f).W0())) {
            com.smartdigimkt.a5.c cVar = this.k;
            if (cVar != null) {
                dVarA = cVar.a(this.f40187c, this.f, this.d, this.f40226p);
            } else {
                dVarA = null;
            }
        } else {
            com.smartdigimkt.a5.c cVar2 = this.k;
            if (cVar2 != null) {
                dVarA = cVar2.a(this.f40187c, this.f, this.d, this.f40226p);
            } else {
                dVarA = null;
            }
        }
        if (dVarA != null && (dVar = this.f40188e) != null) {
            dVarA.a(dVar.b(), this.f40188e.a());
            dVarA.a(this.f40188e.g());
            dVarA.setMute(this.f40188e.m() == 0);
            dVarA.setAutoPlay(this.f40188e.h());
        }
        return dVarA;
    }
}
