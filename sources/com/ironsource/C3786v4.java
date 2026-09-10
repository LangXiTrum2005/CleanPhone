package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3786v4 implements N8, M8 {
    private final InterfaceC3789v7 a;

    public C3786v4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.M8
    public void a(Context context, EnumC3769u4 source, String key, String value) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        A4 a4A = this.a.a(context, source);
        if (a4A != null) {
            a4A.b(key, value);
            unit = Unit.f29295attabal;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        }
    }

    public C3786v4(InterfaceC3789v7 sharedSignalsStorageFactory) {
        Intrinsics.checkNotNullParameter(sharedSignalsStorageFactory, "sharedSignalsStorageFactory");
        this.a = sharedSignalsStorageFactory;
    }

    @Override // com.ironsource.N8
    public String a(Context context, EnumC3769u4 source, String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        A4 a4A = this.a.a(context, source);
        if (a4A != null) {
            return A4.a(a4A, key, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        return null;
    }

    public /* synthetic */ C3786v4(InterfaceC3789v7 interfaceC3789v7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C3837y4() : interfaceC3789v7);
    }
}
