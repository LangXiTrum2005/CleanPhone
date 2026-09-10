package com.inmobi.media;

import kotlinx.coroutines.flow.wireman;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3086mn implements wireman {
    public final /* synthetic */ C3161pn a;

    public C3086mn(saran saranVar, C3161pn c3161pn) {
        this.a = c3161pn;
    }

    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, dern dernVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C3097n9 c3097n9 = this.a.c;
        if (c3097n9 != null) {
            c3097n9.a("VideoSurfaceViewabilityController", "Viewability " + zBooleanValue);
        }
        if (zBooleanValue) {
            Ij ij = this.a.h;
            if (ij != null) {
                ij.a();
            }
        } else {
            Ij ij2 = this.a.h;
            if (ij2 != null) {
                ij2.b();
            }
        }
        return Unit.f29295attabal;
    }
}
