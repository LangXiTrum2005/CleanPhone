package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class T5 extends U1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23200e;
    public final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T5(String eventId, String componentType, String eventType, String str) {
        super(eventType, str);
        Intrinsics.f(eventId, "eventId");
        Intrinsics.f(componentType, "componentType");
        Intrinsics.f(eventType, "eventType");
        this.f23200e = eventId;
        this.f = componentType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23247a);
        sb.append('@');
        return androidx.media3.extractor.text.ttml.a.p(sb, this.f, ' ');
    }

    public T5(String str, String str2, String str3) {
        this(androidx.media3.extractor.text.ttml.a.m("toString(...)"), str, str2, str3);
    }
}
