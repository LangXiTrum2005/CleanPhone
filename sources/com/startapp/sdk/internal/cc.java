package com.startapp.sdk.internal;

import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class cc {
    public static final cc d = new cc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ac f40872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40873c;

    public cc(Locale primary, LinkedHashSet linkedHashSet) {
        Intrinsics.f(primary, "primary");
        this.f40871a = primary.toString();
        this.f40872b = new ac(linkedHashSet);
        this.f40873c = bc.a(primary, linkedHashSet, AbstractJsonLexerKt.COMMA);
    }

    public cc() {
        this.f40871a = null;
        this.f40872b = null;
        this.f40873c = null;
    }
}
