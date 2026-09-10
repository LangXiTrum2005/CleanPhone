package com.jakewharton.rxbinding4.widget;

import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/TextViewTextChangeEvent;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class TextViewTextChangeEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f28003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28005c;
    public final int d;

    public TextViewTextChangeEvent(int i2, int i3, int i4, CharSequence charSequence) {
        Intrinsics.g(null, "view");
        this.f28003a = charSequence;
        this.f28004b = i2;
        this.f28005c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextViewTextChangeEvent)) {
            return false;
        }
        TextViewTextChangeEvent textViewTextChangeEvent = (TextViewTextChangeEvent) obj;
        textViewTextChangeEvent.getClass();
        return this.f28003a.equals(textViewTextChangeEvent.f28003a) && this.f28004b == textViewTextChangeEvent.f28004b && this.f28005c == textViewTextChangeEvent.f28005c && this.d == textViewTextChangeEvent.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + a.a(this.f28005c, a.a(this.f28004b, this.f28003a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextViewTextChangeEvent(view=null, text=");
        sb.append(this.f28003a);
        sb.append(", start=");
        sb.append(this.f28004b);
        sb.append(", before=");
        sb.append(this.f28005c);
        sb.append(", count=");
        return android.support.v4.media.a.i(this.d, ")", sb);
    }
}
