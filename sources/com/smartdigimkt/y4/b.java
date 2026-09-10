package com.smartdigimkt.y4;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class b extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f40184p;

    public b(Context context, c.g gVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.l8.f fVar) {
        super(context, gVar, aVar, fVar);
        this.f40184p = getClass().getSimpleName();
    }

    @Override // com.smartdigimkt.y4.c
    public void c() {
        super.c();
        this.g = null;
    }

    public View p() {
        com.smartdigimkt.a5.c cVar = this.k;
        if (cVar != null) {
            return cVar.a(this.f40187c);
        }
        return null;
    }
}
