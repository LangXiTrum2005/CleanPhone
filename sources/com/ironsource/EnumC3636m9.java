package com.ironsource;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.m9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC3636m9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);

    public static final a b = new a(null);
    private final int a;

    /* JADX INFO: renamed from: com.ironsource.m9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        public final EnumC3636m9 a(int i) {
            for (EnumC3636m9 enumC3636m9 : EnumC3636m9.values()) {
                if (enumC3636m9.a == i) {
                    if (enumC3636m9 == null) {
                        return EnumC3636m9.NotSupported;
                    }
                    return enumC3636m9;
                }
            }
            enumC3636m9 = null;
            if (enumC3636m9 == null) {
                return EnumC3636m9.NotSupported;
            }
            return enumC3636m9;
        }

        private a() {
        }
    }

    EnumC3636m9(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }

    public final boolean b(EnumC3636m9 instanceType) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        return instanceType.b() == this.a;
    }
}
