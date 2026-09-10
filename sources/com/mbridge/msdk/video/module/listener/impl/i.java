package com.mbridge.msdk.video.module.listener.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class i extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.listener.a f37788a;

    public i(com.mbridge.msdk.video.module.listener.a aVar) {
        this.f37788a = aVar;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        com.mbridge.msdk.video.module.listener.a aVar = this.f37788a;
        if (aVar != null) {
            aVar.a(i10, obj);
        }
    }
}
