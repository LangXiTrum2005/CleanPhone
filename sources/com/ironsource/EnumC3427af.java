package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC3427af {
    LoadSuccess(0),
    ShowSuccess(1),
    ShowFailed(2),
    Destroyed(3),
    LoadRequest(-1);

    private final int a;

    EnumC3427af(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
