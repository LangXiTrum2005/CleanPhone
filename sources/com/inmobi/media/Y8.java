package com.inmobi.media;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Y8 implements ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2934a9 f23372a;

    public Y8(C2934a9 c2934a9) {
        this.f23372a = c2934a9;
    }

    @Override // com.inmobi.media.ef
    public final void a(View view, boolean z2) {
        C2943b1 c2943b1;
        Intrinsics.f(view, "view");
        C2934a9 c2934a9 = this.f23372a;
        if (z2) {
            c2934a9.p();
        } else {
            D8 d8H = c2934a9.h();
            if (d8H != null && (c2943b1 = d8H.f22772l) != null) {
                c2943b1.a();
            }
        }
        this.f23372a.a(view, z2);
    }
}
