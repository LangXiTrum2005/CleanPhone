package com.p004ironsource;

import android.content.Context;
import com.p004ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\"\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/z9;", "Lcom/ironsource/li;", "Lcom/ironsource/ki;", "Landroid/content/Context;", "context", "Lcom/ironsource/y9;", "source", "", "key", "value", "", "a", "Lcom/ironsource/uf;", "Lcom/ironsource/uf;", "sharedSignalsStorageFactory", "<init>", "(Lcom/ironsource/uf;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class z9 implements li, ki {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uf sharedSignalsStorageFactory;

    public z9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.p004ironsource.li
    public String a(Context context, y9 source, String key) {
        Intrinsics.f(context, "context");
        Intrinsics.f(source, "source");
        Intrinsics.f(key, "key");
        ea eaVarA = this.sharedSignalsStorageFactory.a(context, source);
        if (eaVarA != null) {
            return ea.a(eaVarA, key, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        return null;
    }

    public z9(uf sharedSignalsStorageFactory) {
        Intrinsics.f(sharedSignalsStorageFactory, "sharedSignalsStorageFactory");
        this.sharedSignalsStorageFactory = sharedSignalsStorageFactory;
    }

    @Override // com.p004ironsource.ki
    public void a(Context context, y9 source, String key, String value) {
        Unit unit;
        Intrinsics.f(context, "context");
        Intrinsics.f(source, "source");
        Intrinsics.f(key, "key");
        Intrinsics.f(value, "value");
        ea eaVarA = this.sharedSignalsStorageFactory.a(context, source);
        if (eaVarA != null) {
            eaVarA.a(key, value);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        }
    }

    public /* synthetic */ z9(uf ufVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ca() : ufVar);
    }
}
