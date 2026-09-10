package com.jakewharton.rxbinding4.widget;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/TextViewEditorActionEvent;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class TextViewEditorActionEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KeyEvent f28002b;

    public TextViewEditorActionEvent(int i2, KeyEvent keyEvent) {
        Intrinsics.g(null, "view");
        this.f28001a = i2;
        this.f28002b = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextViewEditorActionEvent)) {
            return false;
        }
        TextViewEditorActionEvent textViewEditorActionEvent = (TextViewEditorActionEvent) obj;
        textViewEditorActionEvent.getClass();
        return this.f28001a == textViewEditorActionEvent.f28001a && Intrinsics.a(this.f28002b, textViewEditorActionEvent.f28002b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f28001a) * 31;
        KeyEvent keyEvent = this.f28002b;
        return iHashCode + (keyEvent != null ? keyEvent.hashCode() : 0);
    }

    public final String toString() {
        return "TextViewEditorActionEvent(view=null, actionId=" + this.f28001a + ", keyEvent=" + this.f28002b + ")";
    }
}
