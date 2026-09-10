package com.inmobi.media;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class X7 implements ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f23345a = new Rect();

    @Override // com.inmobi.media.ff
    public final boolean a(View rootView, View adView, int i2) {
        Intrinsics.f(rootView, "rootView");
        Intrinsics.f(adView, "adView");
        return true;
    }

    @Override // com.inmobi.media.ff
    public final boolean a(View view, View view2, int i2, Object obj) {
        G8 mediaPlayer;
        if (!(obj instanceof T7) || ((T7) obj).t) {
            return false;
        }
        if ((!(view2 instanceof C3114l9) || (mediaPlayer = ((C3114l9) view2).getMediaPlayer()) == null || 3 == mediaPlayer.f22844a) && view2 != null && view2.isShown()) {
            if ((view != null ? view.getParent() : null) == null || !view2.getGlobalVisibleRect(this.f23345a)) {
                return false;
            }
            long jHeight = ((long) this.f23345a.height()) * ((long) this.f23345a.width());
            long width = ((long) view.getWidth()) * ((long) view.getHeight());
            if (width > 0 && ((long) 100) * jHeight >= ((long) i2) * width) {
                return true;
            }
        }
        return false;
    }
}
