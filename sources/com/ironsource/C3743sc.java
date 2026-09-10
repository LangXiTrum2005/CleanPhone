package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3743sc implements InterfaceC3727rd {
    private final String a;

    /* JADX INFO: renamed from: com.ironsource.sc$a */
    public static final class a {
        public static final a a = new a();
        public static final String b = "IronSource";

        private a() {
        }
    }

    public C3743sc(String networkInstanceId) {
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        this.a = networkInstanceId;
    }

    @Override // com.ironsource.InterfaceC3727rd
    public String value() {
        if (this.a.length() == 0) {
            return "";
        }
        if (Intrinsics.wireman(this.a, "0") || Intrinsics.wireman(this.a, "IronSource")) {
            return "IronSource";
        }
        return "IronSource_" + this.a;
    }
}
