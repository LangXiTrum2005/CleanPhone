package com.ironsource;

import android.os.Debug;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3439b9 {
    private final InterfaceC3667o4 a;
    private Long b;
    private Long c;
    private Integer d;
    private Integer e;
    private Integer f;
    private C3421a9 g;

    public C3439b9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final C3421a9 a() {
        return this.g;
    }

    public final C3421a9 b() {
        Long l = this.c;
        if (l != null) {
            long jLongValue = l.longValue();
            Long l2 = this.b;
            if (l2 != null) {
                long jLongValue2 = l2.longValue();
                Integer num = this.d;
                if (num != null) {
                    int iIntValue = num.intValue();
                    Integer num2 = this.e;
                    if (num2 != null) {
                        int iIntValue2 = num2.intValue();
                        Integer num3 = this.f;
                        if (num3 != null) {
                            int iIntValue3 = num3.intValue();
                            long jA = this.a.a();
                            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                            Debug.getMemoryInfo(memoryInfo);
                            int i = memoryInfo.dalvikPss;
                            int i2 = memoryInfo.nativePss;
                            int totalPss = memoryInfo.getTotalPss();
                            long jMax = Math.max(0L, i - iIntValue);
                            long jMax2 = Math.max(0L, i2 - iIntValue2);
                            C3421a9 c3421a9 = new C3421a9(jA - jLongValue, new C3421a9.a(jMax, jMax2, Math.max(0L, (Math.max(0L, totalPss - iIntValue3) - jMax2) - jMax)), jLongValue2 / ((long) 1024));
                            this.g = c3421a9;
                            return c3421a9;
                        }
                    }
                }
            }
        }
        return null;
    }

    public C3439b9(InterfaceC3667o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = currentTimeProvider;
    }

    public final void a(String serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.b = Long.valueOf(serverResponse.length());
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        this.d = Integer.valueOf(memoryInfo.dalvikPss);
        this.e = Integer.valueOf(memoryInfo.nativePss);
        this.f = Integer.valueOf(memoryInfo.getTotalPss());
        this.c = Long.valueOf(this.a.a());
    }

    public /* synthetic */ C3439b9(InterfaceC3667o4 interfaceC3667o4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InterfaceC3667o4.a() : interfaceC3667o4);
    }
}
