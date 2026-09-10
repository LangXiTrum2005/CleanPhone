package com.jakewharton.rxbinding4.widget;

import android.text.Editable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/TextViewAfterTextChangeEvent;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class TextViewAfterTextChangeEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Editable f27997a;

    public TextViewAfterTextChangeEvent(Editable editable) {
        Intrinsics.g(null, "view");
        this.f27997a = editable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextViewAfterTextChangeEvent)) {
            return false;
        }
        TextViewAfterTextChangeEvent textViewAfterTextChangeEvent = (TextViewAfterTextChangeEvent) obj;
        textViewAfterTextChangeEvent.getClass();
        return this.f27997a.equals(textViewAfterTextChangeEvent.f27997a);
    }

    public final int hashCode() {
        return this.f27997a.hashCode();
    }

    public final String toString() {
        return "TextViewAfterTextChangeEvent(view=null, editable=" + ((Object) this.f27997a) + ")";
    }
}
