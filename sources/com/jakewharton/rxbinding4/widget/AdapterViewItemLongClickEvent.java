package com.jakewharton.rxbinding4.widget;

import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/AdapterViewItemLongClickEvent;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class AdapterViewItemLongClickEvent {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdapterViewItemLongClickEvent)) {
            return false;
        }
        ((AdapterViewItemLongClickEvent) obj).getClass();
        return Intrinsics.a(null, null) && Intrinsics.a(null, null) && 0 == 0;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + a.a(0, ((0 * 31) + 0) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdapterViewItemLongClickEvent(view=");
        sb.append((Object) null);
        sb.append(", clickedView=");
        sb.append((Object) null);
        sb.append(", position=");
        sb.append(0);
        sb.append(", id=");
        return android.support.v4.media.a.j(0L, ")", sb);
    }
}
