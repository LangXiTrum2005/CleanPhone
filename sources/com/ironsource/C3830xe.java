package com.ironsource;

import android.content.Context;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3830xe implements InterfaceC3813we {
    private final I8 a;

    /* JADX INFO: renamed from: com.ironsource.xe$a */
    public static final class a {
        public static final a a = new a();
        public static final String b = "sessionNumber";
        public static final String c = "firstSessionTimestamp";

        private a() {
        }
    }

    public C3830xe() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC3847ye
    public void a(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a.a(context, a.b, i);
    }

    @Override // com.ironsource.InterfaceC3847ye
    public int b(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.a.b(context, a.b, i);
    }

    public C3830xe(I8 sdkSharedPref) {
        Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.a = sdkSharedPref;
    }

    @Override // com.ironsource.InterfaceC3480de
    public long a(Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.a.b(context, "firstSessionTimestamp", j);
    }

    @Override // com.ironsource.InterfaceC3480de
    public void b(Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a.a(context, "firstSessionTimestamp", j);
    }

    public /* synthetic */ C3830xe(I8 i8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C3864ze() : i8);
    }
}
