package com.startapp.sdk.internal;

import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public final class qa implements zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za f41399a;

    public qa(za zaVar) {
        this.f41399a = zaVar;
    }

    @Override // com.startapp.sdk.internal.zf
    public final void a(String str) {
        za zaVar = this.f41399a;
        zaVar.getClass();
        Intent intent = new Intent("com.startapp.android.ShowDisplayBroadcastListener");
        intent.putExtra("dParam", str);
        zb.a(zaVar.f41606a).a(intent);
    }
}
