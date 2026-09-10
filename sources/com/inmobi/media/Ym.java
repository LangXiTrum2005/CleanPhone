package com.inmobi.media;

import android.widget.ProgressBar;
import kotlinx.coroutines.flow.wireman;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Ym implements wireman {
    public final /* synthetic */ C2808bn a;

    public Ym(saran saranVar, C2808bn c2808bn) {
        this.a = c2808bn;
    }

    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, dern dernVar) {
        ProgressBar progressBar;
        Rl rl = (Rl) obj;
        C2808bn c2808bn = this.a;
        c2808bn.getClass();
        if (rl instanceof C3036kn) {
            ProgressBar progressBar2 = c2808bn.e;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        } else if (rl instanceof Xm) {
            int i = ((Xm) rl).b;
            ProgressBar progressBar3 = c2808bn.e;
            if (progressBar3 != null) {
                H6.a(c2808bn.f);
                c2808bn.f = P4.a(c2808bn.a, new C2782an(progressBar3, c2808bn, i, null));
            }
        } else if ((rl instanceof Pl) && c2808bn.c.b && (progressBar = c2808bn.e) != null) {
            progressBar.setVisibility(8);
        }
        return Unit.f29295attabal;
    }
}
