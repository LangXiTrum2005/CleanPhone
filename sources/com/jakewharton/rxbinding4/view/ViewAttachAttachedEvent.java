package com.jakewharton.rxbinding4.view;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/view/ViewAttachAttachedEvent;", "Lcom/jakewharton/rxbinding4/view/ViewAttachEvent;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ViewAttachAttachedEvent extends ViewAttachEvent {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewAttachAttachedEvent)) {
            return false;
        }
        ((ViewAttachAttachedEvent) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "ViewAttachAttachedEvent(view=null)";
    }
}
