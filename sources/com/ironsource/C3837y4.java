package com.ironsource;

import android.content.Context;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3837y4 implements InterfaceC3789v7 {

    /* JADX INFO: renamed from: com.ironsource.y4$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC3769u4.values().length];
            try {
                iArr[EnumC3769u4.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3769u4.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3769u4.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3769u4.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC3789v7
    public A4 a(Context context, EnumC3769u4 source) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        int i = a.a[source.ordinal()];
        if (i == 1) {
            return new C3820x4(context, "supersonic_shared_preferen");
        }
        if (i == 2) {
            return new C3820x4(context, "unityads-installinfo");
        }
        if (i == 3) {
            return new C3820x4(context, C3854z4.c);
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
