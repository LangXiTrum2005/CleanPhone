package com.inmobi.media;

import com.inmobi.media.Ce;

/* JADX INFO: loaded from: classes5.dex */
public final class Ce implements InterfaceC3058i1 {
    public static final void b(boolean z2) {
        if (z2) {
            De.a(De.f22785a);
        } else {
            De.a();
        }
    }

    public final void a(final boolean z2) {
        Uc.a(z2);
        Uc.a(new Runnable() { // from class: A.j
            @Override // java.lang.Runnable
            public final void run() {
                Ce.b(z2);
            }
        });
    }
}
