package com.startapp.sdk.internal;

import android.content.Context;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class f7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f40958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f40960c;

    public f7(Context context, String str, Serializable serializable) {
        this.f40958a = context;
        this.f40959b = str;
        this.f40960c = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g7.a(this.f40958a, this.f40959b, this.f40960c);
    }
}
