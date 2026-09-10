package com.facebook.appevents.integrity;

import com.ironsource.X3;
import com.ironsource.mediationsdk.metadata.a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import q7.e0;
import q7.r;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/integrity/BlocklistEventsManager;", "", "<init>", "()V", "Lwj/r;", a.f29613j, "disable", "loadBlocklistEvents", "", X3.i.f27798j0, "", "isInBlocklist", "(Ljava/lang/String;)Z", "enabled", "Z", "", "blocklist", "Ljava/util/Set;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class BlocklistEventsManager {
    public static final BlocklistEventsManager INSTANCE = new BlocklistEventsManager();
    private static Set<String> blocklist = new HashSet();
    private static boolean enabled;

    private BlocklistEventsManager() {
    }

    public static final void disable() {
        if (v7.a.b(BlocklistEventsManager.class)) {
            return;
        }
        try {
            enabled = false;
            blocklist = new HashSet();
        } catch (Throwable th2) {
            v7.a.a(BlocklistEventsManager.class, th2);
        }
    }

    public static final void enable() {
        if (v7.a.b(BlocklistEventsManager.class)) {
            return;
        }
        try {
            INSTANCE.loadBlocklistEvents();
            Set<String> set = blocklist;
            if (set != null && !set.isEmpty()) {
                enabled = true;
            }
        } catch (Throwable th2) {
            v7.a.a(BlocklistEventsManager.class, th2);
        }
    }

    public static final boolean isInBlocklist(String eventName) {
        if (v7.a.b(BlocklistEventsManager.class)) {
            return false;
        }
        try {
            n.f(eventName, "eventName");
            if (enabled) {
                return blocklist.contains(eventName);
            }
            return false;
        } catch (Throwable th2) {
            v7.a.a(BlocklistEventsManager.class, th2);
            return false;
        }
    }

    private final void loadBlocklistEvents() {
        HashSet hashSetE;
        if (v7.a.b(this)) {
            return;
        }
        try {
            r rVarK = u.k(s.c(), false);
            if (rVarK == null || (hashSetE = e0.e(rVarK.f48770o)) == null) {
                return;
            }
            blocklist = hashSetE;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }
}
