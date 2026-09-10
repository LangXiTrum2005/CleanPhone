package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.w4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0635w4 implements P8, O8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0656x7 f30918a;

    public C0635w4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.O8
    public void a(Context context, EnumC0617v4 source, String key, String value) {
        wj.r rVar;
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(source, "source");
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(value, "value");
        B4 b4A = this.f30918a.a(context, source);
        if (b4A != null) {
            b4A.b(key, value);
            rVar = wj.r.f53297a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        }
    }

    public C0635w4(InterfaceC0656x7 sharedSignalsStorageFactory) {
        kotlin.jvm.internal.n.f(sharedSignalsStorageFactory, "sharedSignalsStorageFactory");
        this.f30918a = sharedSignalsStorageFactory;
    }

    @Override // com.ironsource.P8
    public String a(Context context, EnumC0617v4 source, String key) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(source, "source");
        kotlin.jvm.internal.n.f(key, "key");
        B4 b4A = this.f30918a.a(context, source);
        if (b4A != null) {
            return B4.a(b4A, key, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        return null;
    }

    public /* synthetic */ C0635w4(InterfaceC0656x7 interfaceC0656x7, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? new C0689z4() : interfaceC0656x7);
    }
}
