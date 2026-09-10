package com.ironsource;

import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.ironsource.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC3582j9 {
    APP_ACTIVITY(0),
    DIRECT_INTENT(1);

    public static final a b = new a(null);
    private final int a;

    /* JADX INFO: renamed from: com.ironsource.j9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        public final EnumC3582j9 a(int i) {
            for (EnumC3582j9 enumC3582j9 : EnumC3582j9.values()) {
                if (enumC3582j9.b() == i) {
                    if (enumC3582j9 == null) {
                        return EnumC3582j9.APP_ACTIVITY;
                    }
                    return enumC3582j9;
                }
            }
            enumC3582j9 = null;
            if (enumC3582j9 == null) {
                return EnumC3582j9.APP_ACTIVITY;
            }
            return enumC3582j9;
        }

        private a() {
        }
    }

    EnumC3582j9(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
