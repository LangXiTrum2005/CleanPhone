package com.inmobi.media;

import com.inmobi.media.AbstractC3268v4;
import com.p004ironsource.ko;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3268v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f24047a = LazyKt.b(C3252u4.f24020a);

    public static final void a(N9 request, C3236t4 listener, C3220s4 eventPayload, int i2, String str, int i3, long j, C3262ue c3262ue, boolean z2) {
        Intrinsics.f(request, "$request");
        Intrinsics.f(listener, "$listener");
        Intrinsics.f(eventPayload, "$eventPayload");
        P9 p9B = request.b();
        if (p9B.b()) {
            boolean z3 = T9.f23231a;
            I9 i9 = p9B.d;
            EnumC3157o4 enumC3157o4 = i9 != null ? i9.f22886a : null;
            if (T9.f23231a && (enumC3157o4 == EnumC3157o4.q || enumC3157o4 == EnumC3157o4.f23860p || enumC3157o4 == EnumC3157o4.o || enumC3157o4 == EnumC3157o4.f23859n || enumC3157o4 == EnumC3157o4.r)) {
                listener.a(eventPayload, false);
                return;
            } else if (i2 <= 1) {
                listener.a(eventPayload, true);
                return;
            } else {
                p9B.a();
                a(eventPayload, str, i3, i2 - 1, j, c3262ue, listener, z2);
                return;
            }
        }
        String TAG = listener.d;
        Intrinsics.e(TAG, "TAG");
        listener.f23999a.a(eventPayload.f23979a);
        listener.f23999a.a(System.currentTimeMillis());
        if (listener.f24001c != null) {
            ArrayList eventIds = eventPayload.f23979a;
            Intrinsics.f(eventIds, "eventIds");
            Integer num = Ud.f23278c;
            if (num != null && eventIds.contains(Integer.valueOf(num.intValue()))) {
                Ud.f23277b = 0;
                C6 c6 = Ud.f23276a;
                if (c6 != null) {
                    C6.a(c6, "count", 0, false, 4, (Object) null);
                }
                Ud.f23278c = null;
            }
        }
        listener.f24002e.set(false);
    }

    public static void a(final C3220s4 c3220s4, final String str, final int i2, final int i3, final long j, final C3262ue c3262ue, final C3236t4 c3236t4, final boolean z2) {
        long j2;
        if (T9.a(false) == null && Uc.m()) {
            final N9 n9 = new N9(ko.f25535b, str, c3262ue, false, (InterfaceC3333z5) null, (String) null, 104);
            HashMap mapG = MapsKt.g(new Pair("payload", c3220s4.f23980b));
            HashMap map = n9.k;
            if (map != null) {
                map.putAll(mapG);
            }
            int i4 = i2 - i3;
            if (i4 > 0) {
                n9.f23010i.putAll(MapsKt.g(new Pair("X-im-retry-count", String.valueOf(i4))));
            }
            n9.x = false;
            n9.t = false;
            n9.f23014u = false;
            if (z2) {
                long jPow = i3 != i2 ? ((long) Math.pow(2.0d, i4)) * j : 0L;
                j2 = jPow;
                Object x = f24047a.getX();
                Intrinsics.e(x, "getValue(...)");
                ((ScheduledExecutorService) x).schedule(new Runnable() { // from class: A.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC3268v4.a(n9, c3236t4, c3220s4, i3, str, i2, j, c3262ue, z2);
                    }
                }, j2, TimeUnit.SECONDS);
                return;
            }
            if (i3 != i2) {
                j2 = j;
            }
            Object x2 = f24047a.getX();
            Intrinsics.e(x2, "getValue(...)");
            ((ScheduledExecutorService) x2).schedule(new Runnable() { // from class: A.z0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3268v4.a(n9, c3236t4, c3220s4, i3, str, i2, j, c3262ue, z2);
                }
            }, j2, TimeUnit.SECONDS);
            return;
            j2 = jPow;
            Object x3 = f24047a.getX();
            Intrinsics.e(x3, "getValue(...)");
            ((ScheduledExecutorService) x3).schedule(new Runnable() { // from class: A.z0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3268v4.a(n9, c3236t4, c3220s4, i3, str, i2, j, c3262ue, z2);
                }
            }, j2, TimeUnit.SECONDS);
            return;
        }
        c3236t4.a(c3220s4, false);
    }
}
