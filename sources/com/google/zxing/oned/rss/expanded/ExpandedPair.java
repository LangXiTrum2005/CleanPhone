package com.google.zxing.oned.rss.expanded;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
final class ExpandedPair {
    public final boolean equals(Object obj) {
        if (!(obj instanceof ExpandedPair)) {
            return false;
        }
        ((ExpandedPair) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "[ null , null : " + ((Object) AbstractJsonLexerKt.NULL) + " ]";
    }
}
