package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3796ve implements H8, H8.a {
    private final InterfaceC3813we a;
    private final InterfaceC3623le b;
    private final InterfaceC3667o4 c;
    private int d;
    private long e;

    /* JADX INFO: renamed from: com.ironsource.ve$a */
    public static final class a {
        public static final a a = new a();
        public static final int b = -1;
        public static final int c = 0;
        public static final long d = -1;

        private a() {
        }
    }

    public C3796ve(InterfaceC3813we storage, InterfaceC3623le initResponseStorage, InterfaceC3667o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initResponseStorage, "initResponseStorage");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = storage;
        this.b = initResponseStorage;
        this.c = currentTimeProvider;
        this.d = -1;
        this.e = -1L;
    }

    private final int b(Context context, InterfaceC3813we interfaceC3813we) {
        int iB = interfaceC3813we.b(context, 0) + 1;
        interfaceC3813we.a(context, iB);
        return iB;
    }

    @Override // com.ironsource.H8.a
    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = b(context, this.a);
        this.e = a(context, this.a);
    }

    @Override // com.ironsource.H8
    public int c() {
        return this.d;
    }

    private final long a(Context context, InterfaceC3813we interfaceC3813we) {
        long jA = interfaceC3813we.a(context, -1L);
        if (this.b.a(context) || jA != -1) {
            return jA;
        }
        long jA2 = this.c.a();
        IronLog.INTERNAL.verbose("set first session timestamp = " + jA2);
        interfaceC3813we.b(context, jA2);
        return jA2;
    }

    @Override // com.ironsource.H8
    public String b() {
        String strD = IronSourceUtils.d();
        Intrinsics.checkNotNullExpressionValue(strD, "getSessionId()");
        return strD;
    }

    public /* synthetic */ C3796ve(InterfaceC3813we interfaceC3813we, InterfaceC3623le interfaceC3623le, InterfaceC3667o4 interfaceC3667o4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3813we, (i & 2) != 0 ? new C3641me() : interfaceC3623le, (i & 4) != 0 ? new InterfaceC3667o4.a() : interfaceC3667o4);
    }

    @Override // com.ironsource.H8
    public long a() {
        return this.e;
    }
}
