package com.smartdigimkt.u8;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class e extends com.smartdigimkt.s8.c {
    @Override // com.smartdigimkt.s8.c
    public boolean b(com.smartdigimkt.s8.b bVar) {
        if (bVar.g() == null || TextUtils.isEmpty(bVar.n())) {
            bVar.a(com.smartdigimkt.v7.b.a("10001", "The context or placementId can not be empty."));
            return false;
        }
        if (!com.smartdigimkt.m6.b.p().B()) {
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39186b));
            return false;
        }
        if (!TextUtils.isEmpty(com.smartdigimkt.m6.b.p().f()) && !TextUtils.isEmpty(com.smartdigimkt.m6.b.p().g())) {
            return true;
        }
        bVar.a(com.smartdigimkt.v7.b.a("10003"));
        return false;
    }
}
