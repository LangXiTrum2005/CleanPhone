package com.inmobi.media;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2927gd implements Nn {
    public final Jn a;
    public final Be b;

    public C2927gd(Jn viewableConfig, Be nativeViewabilityViewHolder) {
        Intrinsics.checkNotNullParameter(viewableConfig, "viewableConfig");
        Intrinsics.checkNotNullParameter(nativeViewabilityViewHolder, "nativeViewabilityViewHolder");
        this.a = viewableConfig;
        this.b = nativeViewabilityViewHolder;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    @Override // com.inmobi.media.Nn
    public final Mn a() {
        boolean z;
        boolean z2;
        Jn jn;
        ViewGroup viewGroup = this.b.a;
        Rect rect = new Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return Mn.HIDDEN;
        }
        Be be = this.b;
        Fe fe = be.e;
        if (fe.b.a || fe.a.a) {
            C3335wn c3335wn = fe.a;
            ImageView imageView = be.b;
            if (c3335wn.a) {
                if ((imageView == null || !c3335wn.b) ? false : Un.a(imageView, c3335wn.c)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                jn = this.a;
                if (Un.a(viewGroup, rect, jn.a, jn.b)) {
                    return Mn.VISIBLE;
                }
            } else {
                C3335wn c3335wn2 = fe.b;
                MediaView mediaView = this.b.c;
                if (c3335wn2.a) {
                    z2 = (mediaView == null || !c3335wn2.b) ? false : Un.a(mediaView, c3335wn2.c);
                }
                if (z2) {
                    jn = this.a;
                    if (Un.a(viewGroup, rect, jn.a, jn.b) && Un.a(viewGroup, rect, this.a.a, this.b.d)) {
                        return Mn.VISIBLE;
                    }
                }
            }
        } else {
            jn = this.a;
            if (Un.a(viewGroup, rect, jn.a, jn.b)) {
                return Mn.VISIBLE;
            }
        }
        return Mn.HIDDEN;
    }
}
