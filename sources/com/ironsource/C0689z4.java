package com.ironsource;

import android.content.Context;

/* JADX INFO: renamed from: com.ironsource.z4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0689z4 implements InterfaceC0656x7 {

    /* JADX INFO: renamed from: com.ironsource.z4$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31334a;

        static {
            int[] iArr = new int[EnumC0617v4.values().length];
            try {
                iArr[EnumC0617v4.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0617v4.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0617v4.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0617v4.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f31334a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC0656x7
    public B4 a(Context context, EnumC0617v4 source) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(source, "source");
        int i10 = a.f31334a[source.ordinal()];
        if (i10 == 1) {
            return new C0671y4(context, "supersonic_shared_preferen");
        }
        if (i10 == 2) {
            return new C0671y4(context, "unityads-installinfo");
        }
        if (i10 == 3) {
            return new C0671y4(context, A4.f25613c);
        }
        if (i10 == 4) {
            return null;
        }
        throw new aa.b((byte) 0, 20);
    }
}
