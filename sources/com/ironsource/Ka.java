package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ka {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(InterfaceC0499ob<LevelPlayAdInfo> interfaceC0499ob) {
        if (interfaceC0499ob instanceof InterfaceC0499ob.b) {
            return "success";
        }
        if (interfaceC0499ob instanceof InterfaceC0499ob.a) {
            return "failure";
        }
        throw new aa.b((byte) 0, 20);
    }
}
