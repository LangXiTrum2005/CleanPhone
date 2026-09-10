package com.inmobi.media;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class O7 implements ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T7 f23040a;

    public O7(T7 t7) {
        this.f23040a = t7;
    }

    @Override // com.inmobi.media.ef
    public final void a(View view, boolean z2) {
        C2943b1 c2943b1;
        Intrinsics.f(view, "view");
        T7 t7 = this.f23040a;
        if (z2) {
            t7.p();
            return;
        }
        D8 d8H = t7.h();
        if (d8H == null || (c2943b1 = d8H.f22772l) == null) {
            return;
        }
        c2943b1.a();
    }
}
