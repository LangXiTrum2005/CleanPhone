package com.unity3d.scar.adapter.common;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends i {
    public static a a(ph.c cVar) {
        String strN = defpackage.e.n("Cannot show ad that is not loaded for placement ", cVar.f48371a);
        return new a(b.f38574s, strN, cVar.f48371a, cVar.f48372b, strN);
    }

    @Override // com.unity3d.scar.adapter.common.i
    public final String getDomain() {
        return "GMA";
    }
}
