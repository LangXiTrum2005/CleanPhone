package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class f implements com.mbridge.msdk.video.module.listener.a {
    @Override // com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        q0.b("NotifyListener", "onNotify,type=" + i10 + ",pt=" + obj);
    }
}
