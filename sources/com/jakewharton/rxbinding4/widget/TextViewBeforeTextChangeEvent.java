package com.jakewharton.rxbinding4.widget;

import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/TextViewBeforeTextChangeEvent;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class TextViewBeforeTextChangeEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f27998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28000c;
    public final int d;

    public TextViewBeforeTextChangeEvent(int i2, int i3, int i4, CharSequence charSequence) {
        Intrinsics.g(null, "view");
        this.f27998a = charSequence;
        this.f27999b = i2;
        this.f28000c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextViewBeforeTextChangeEvent)) {
            return false;
        }
        TextViewBeforeTextChangeEvent textViewBeforeTextChangeEvent = (TextViewBeforeTextChangeEvent) obj;
        textViewBeforeTextChangeEvent.getClass();
        return this.f27998a.equals(textViewBeforeTextChangeEvent.f27998a) && this.f27999b == textViewBeforeTextChangeEvent.f27999b && this.f28000c == textViewBeforeTextChangeEvent.f28000c && this.d == textViewBeforeTextChangeEvent.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + a.a(this.f28000c, a.a(this.f27999b, this.f27998a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextViewBeforeTextChangeEvent(view=null, text=");
        sb.append(this.f27998a);
        sb.append(", start=");
        sb.append(this.f27999b);
        sb.append(", count=");
        sb.append(this.f28000c);
        sb.append(", after=");
        return android.support.v4.media.a.i(this.d, ")", sb);
    }
}
