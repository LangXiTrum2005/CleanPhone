package com.facebook.internal;

import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/SmartLoginOption;", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public enum SmartLoginOption {
    /* JADX INFO: Fake field, exist only in values array */
    None(0),
    Enabled(1),
    RequireConfirm(2);

    public static final EnumSet f0;
    public final long X;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/SmartLoginOption$Companion;", "", "Ljava/util/EnumSet;", "Lcom/facebook/internal/SmartLoginOption;", "ALL", "Ljava/util/EnumSet;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        EnumSet enumSetAllOf = EnumSet.allOf(SmartLoginOption.class);
        Intrinsics.e(enumSetAllOf, "EnumSet.allOf(SmartLoginOption::class.java)");
        f0 = enumSetAllOf;
    }

    SmartLoginOption(long j) {
        this.X = j;
    }
}
