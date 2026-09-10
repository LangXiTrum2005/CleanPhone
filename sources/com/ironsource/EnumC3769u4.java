package com.ironsource;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC3769u4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");

    public static final a b = new a(null);
    private final String a;

    /* JADX INFO: renamed from: com.ironsource.u4$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        public final EnumC3769u4 a(String str) {
            for (EnumC3769u4 enumC3769u4 : EnumC3769u4.values()) {
                if (Intrinsics.wireman(enumC3769u4.b(), str)) {
                    if (enumC3769u4 == null) {
                        return EnumC3769u4.NONE;
                    }
                    return enumC3769u4;
                }
            }
            enumC3769u4 = null;
            if (enumC3769u4 == null) {
                return EnumC3769u4.NONE;
            }
            return enumC3769u4;
        }

        private a() {
        }
    }

    EnumC3769u4(String str) {
        this.a = str;
    }

    public final String b() {
        return this.a;
    }

    public static final EnumC3769u4 a(String str) {
        return b.a(str);
    }
}
