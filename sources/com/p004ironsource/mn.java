package com.p004ironsource;

import com.smartdigimkt.h5.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lcom/ironsource/mn;", "Lcom/ironsource/iq;", "", "e", f.j, "", "b", "", "isPaused", "<init>", "(Z)V", "d", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class mn extends iq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f26184e = "ManualTrigger";

    public mn() {
        this(false, 1, null);
    }

    @Override // com.p004ironsource.iq
    public String b() {
        return f26184e;
    }

    public final void e() {
        a(true);
    }

    public final void f() {
        a(false);
    }

    public mn(boolean z2) {
        super(z2);
    }

    public /* synthetic */ mn(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2);
    }
}
