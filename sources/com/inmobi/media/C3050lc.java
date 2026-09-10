package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlinx.coroutines.flow.apical;
import kotlinx.coroutines.flow.monoploid;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.saran;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3050lc {
    public final C3097n9 a;
    public AbstractC2990j2 b;
    public final MediaView c;
    public final C3343x6 d;
    public final apical e;

    public C3050lc(Context context, saran coroutineScope, C3097n9 c3097n9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.a = c3097n9;
        apical apicalVarSaneness = monoploid.saneness(0, 0, null, 7, null);
        this.c = new MediaView(context);
        this.d = new C3343x6(context, coroutineScope, apicalVarSaneness, c3097n9);
        this.e = apicalVarSaneness;
    }

    public final Object a(AbstractC3368y6 abstractC3368y6, ContinuationImpl continuationImpl) {
        C3097n9 c3097n9 = this.a;
        if (c3097n9 != null) {
            c3097n9.a("MediaViewManager", "load called - experienceModel: " + abstractC3368y6);
        }
        return this.b != null ? this.c : impromptu.competently(premeiotic.saneness(), new C3025kc(this, abstractC3368y6, null), continuationImpl);
    }
}
