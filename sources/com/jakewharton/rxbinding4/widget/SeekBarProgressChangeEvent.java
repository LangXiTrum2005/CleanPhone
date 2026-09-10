package com.jakewharton.rxbinding4.widget;

import android.widget.SeekBar;
import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/SeekBarProgressChangeEvent;", "Lcom/jakewharton/rxbinding4/widget/SeekBarChangeEvent;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class SeekBarProgressChangeEvent extends SeekBarChangeEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SeekBar f27992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27994c;

    public SeekBarProgressChangeEvent(SeekBar seekBar, int i2, boolean z2) {
        this.f27992a = seekBar;
        this.f27993b = i2;
        this.f27994c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeekBarProgressChangeEvent)) {
            return false;
        }
        SeekBarProgressChangeEvent seekBarProgressChangeEvent = (SeekBarProgressChangeEvent) obj;
        return Intrinsics.a(this.f27992a, seekBarProgressChangeEvent.f27992a) && this.f27993b == seekBarProgressChangeEvent.f27993b && this.f27994c == seekBarProgressChangeEvent.f27994c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        SeekBar seekBar = this.f27992a;
        int iA = a.a(this.f27993b, (seekBar != null ? seekBar.hashCode() : 0) * 31, 31);
        boolean z2 = this.f27994c;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return iA + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeekBarProgressChangeEvent(view=");
        sb.append(this.f27992a);
        sb.append(", progress=");
        sb.append(this.f27993b);
        sb.append(", fromUser=");
        return android.support.v4.media.a.t(sb, this.f27994c, ")");
    }
}
