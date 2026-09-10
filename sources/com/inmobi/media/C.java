package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f22731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f22732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22733c;
    public final int d;

    public C(RectF visibleRect, ArrayList obstructions, int i2, int i3) {
        Intrinsics.f(visibleRect, "visibleRect");
        Intrinsics.f(obstructions, "obstructions");
        this.f22731a = visibleRect;
        this.f22732b = obstructions;
        this.f22733c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        return Intrinsics.a(this.f22731a, c2.f22731a) && Intrinsics.a(this.f22732b, c2.f22732b) && this.f22733c == c2.f22733c && this.d == c2.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + androidx.media3.extractor.text.ttml.a.a(this.f22733c, (this.f22732b.hashCode() + (this.f22731a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExposureInputData(visibleRect=");
        sb.append(this.f22731a);
        sb.append(", obstructions=");
        sb.append(this.f22732b);
        sb.append(", screenWidth=");
        sb.append(this.f22733c);
        sb.append(", screenHeight=");
        return android.support.v4.media.a.p(sb, this.d, ')');
    }
}
