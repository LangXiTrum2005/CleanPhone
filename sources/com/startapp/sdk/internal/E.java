package com.startapp.sdk.internal;

import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class E implements cj, ek, pe {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ l8 f40772Y;

    public /* synthetic */ E(l8 l8Var, int i2) {
        this.X = i2;
        this.f40772Y = l8Var;
    }

    @Override // com.startapp.sdk.internal.ek, com.startapp.sdk.internal.pe
    public void a(String str) {
        switch (this.X) {
            case 1:
                this.f40772Y.a(str);
                break;
            default:
                this.f40772Y.b(str);
                break;
        }
    }

    @Override // com.startapp.sdk.internal.cj
    public void a(List list, VASTErrorCodes vASTErrorCodes) {
        this.f40772Y.a(list, vASTErrorCodes);
    }
}
