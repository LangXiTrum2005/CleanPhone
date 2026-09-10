package com.p004ironsource;

import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/xp;", "", "", "a", "", "duration", "", "errorCode", "", "reason", "b", "c", "", "bidFloor", "Lcom/ironsource/c2;", "Lcom/ironsource/c2;", "eventsWrapper", "<init>", "(Lcom/ironsource/c2;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class xp {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c2 eventsWrapper;

    public xp(c2 eventsWrapper) {
        Intrinsics.f(eventsWrapper, "eventsWrapper");
        this.eventsWrapper = eventsWrapper;
    }

    public final void a() {
        this.eventsWrapper.a(z1.OPERATIONAL_LOAD_AD, new HashMap());
    }

    public final void b() {
        this.eventsWrapper.a(z1.PAUSE_AD, null);
    }

    public final void c() {
        this.eventsWrapper.a(z1.RESUME_AD, null);
    }

    public final void a(long duration) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(duration));
        this.eventsWrapper.a(z1.OPERATIONAL_LOAD_SUCCESS, map);
    }

    public final void a(long duration, int errorCode, String reason) {
        Intrinsics.f(reason, "reason");
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(errorCode));
        map.put("reason", reason);
        map.put("duration", Long.valueOf(duration));
        this.eventsWrapper.a(z1.OPERATIONAL_LOAD_FAILED, map);
    }

    public final void a(double bidFloor) {
        this.eventsWrapper.a(z1.OPERATIONAL_SET_CONFIGURATIONS, MapsKt.i(new Pair(IronSourceConstants.EVENTS_EXT1, "flooring=" + bidFloor)));
    }
}
