package com.jakewharton.rxbinding4.widget;

import android.widget.SeekBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/SeekBarStartChangeEvent;", "Lcom/jakewharton/rxbinding4/widget/SeekBarChangeEvent;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class SeekBarStartChangeEvent extends SeekBarChangeEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SeekBar f27995a;

    public SeekBarStartChangeEvent(SeekBar seekBar) {
        this.f27995a = seekBar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeekBarStartChangeEvent) {
            return Intrinsics.a(this.f27995a, ((SeekBarStartChangeEvent) obj).f27995a);
        }
        return false;
    }

    public final int hashCode() {
        SeekBar seekBar = this.f27995a;
        if (seekBar != null) {
            return seekBar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SeekBarStartChangeEvent(view=" + this.f27995a + ")";
    }
}
