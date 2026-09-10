package com.inmobi.media;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import kotlinx.coroutines.cutely;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3274uc extends ContentObserver implements Zb {
    public final String a;
    public final Context b;
    public int c;
    public final /* synthetic */ C3324wc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3274uc(C3324wc c3324wc, String mJsCallbackNamespace, Context context, Handler handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(mJsCallbackNamespace, "mJsCallbackNamespace");
        this.d = c3324wc;
        this.a = mJsCallbackNamespace;
        this.b = context;
        this.c = -1;
    }

    @Override // com.inmobi.media.Zb
    public final void a() {
        Context context = Ji.a;
        if (context == null) {
            return;
        }
        context.getContentResolver().unregisterContentObserver(this);
    }

    @Override // com.inmobi.media.Zb
    public final void b() {
        Context context = Ji.a;
        if (context == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        cutely.wireman(A9.c, null, null, new C3249tc(this, this.d, z, null), 3, null);
    }
}
