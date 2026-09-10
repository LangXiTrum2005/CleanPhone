package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hg {
    public static Gg a(String content, String markupType) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        int iHashCode = markupType.hashCode();
        if (iHashCode != -1084172778) {
            if (iHashCode != 3213227) {
                if (iHashCode == 1236050372 && markupType.equals("htmlUrl")) {
                    return new V7(content);
                }
            } else if (markupType.equals("html")) {
                return new U7(content);
            }
        } else if (markupType.equals("inmobiJson")) {
            return new C3047l9(content);
        }
        throw new IllegalArgumentException("Unsupported markup type: " + markupType);
    }
}
