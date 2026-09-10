package com.inmobi.media;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3236t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3204r4 f23999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3274va f24000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Db f24001c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f24002e;
    public final AtomicBoolean f;
    public final LinkedList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ScheduledExecutorService f24003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C3189q4 f24004i;

    public C3236t4(AbstractC3204r4 mEventDao, InterfaceC3274va mPayloadProvider, C3189q4 eventConfig, Db db) {
        Intrinsics.f(mEventDao, "mEventDao");
        Intrinsics.f(mPayloadProvider, "mPayloadProvider");
        Intrinsics.f(eventConfig, "eventConfig");
        this.f23999a = mEventDao;
        this.f24000b = mPayloadProvider;
        this.f24001c = db;
        this.d = "t4";
        this.f24002e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.g = new LinkedList();
        this.f24004i = eventConfig;
    }

    public final void a(long j, boolean z2) {
        if (this.g.contains("default")) {
            return;
        }
        this.g.add("default");
        if (this.f24003h == null) {
            String TAG = this.d;
            Intrinsics.e(TAG, "TAG");
            this.f24003h = Executors.newSingleThreadScheduledExecutor(new K5(TAG));
        }
        Intrinsics.e(this.d, "TAG");
        ScheduledExecutorService scheduledExecutorService = this.f24003h;
        if (scheduledExecutorService != null) {
            A.K k = new A.K(2, this, z2);
            C3189q4 c3189q4 = this.f24004i;
            AbstractC3204r4 abstractC3204r4 = this.f23999a;
            abstractC3204r4.getClass();
            Context contextD = Uc.d();
            long j2 = -1;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                C6 c6A = B6.a(contextD, "batch_processing_info");
                String key = abstractC3204r4.f23193a.concat("_last_batch_process");
                Intrinsics.f(key, "key");
                j2 = c6A.f22735a.getLong(key, -1L);
            }
            if (((int) j2) == -1) {
                this.f23999a.a(System.currentTimeMillis());
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            scheduledExecutorService.scheduleAtFixedRate(k, Math.max(0L, (timeUnit.toSeconds(j2) + (c3189q4 != null ? c3189q4.f23917c : 0L)) - timeUnit.toSeconds(System.currentTimeMillis())), j, TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
    public static final void a(C3236t4 this$0, C3262ue c3262ue, boolean z2) {
        int i2;
        long j;
        boolean z3;
        boolean z4;
        C3220s4 c3220s4A;
        Intrinsics.f(this$0, "this$0");
        C3189q4 c3189q4 = this$0.f24004i;
        if (this$0.f.get() || this$0.f24002e.get() || c3189q4 == null) {
            return;
        }
        String TAG = this$0.d;
        Intrinsics.e(TAG, "TAG");
        AbstractC3204r4 abstractC3204r4 = this$0.f23999a;
        long j2 = c3189q4.f23916b;
        abstractC3204r4.getClass();
        abstractC3204r4.a("ts<?", new String[]{String.valueOf(System.currentTimeMillis() - (j2 * ((long) 1000)))});
        AbstractC3204r4 abstractC3204r5 = this$0.f23999a;
        abstractC3204r5.getClass();
        int iA = T1.a(abstractC3204r5, null, null, 63);
        int iP = L3.f22938a.p();
        C3189q4 c3189q5 = this$0.f24004i;
        if (c3189q5 == null) {
            i2 = 0;
        } else if (iP == 0 || iP != 1) {
            i2 = c3189q5.g;
        } else {
            i2 = c3189q5.f23918e;
        }
        if (c3189q5 == null) {
            j = 0;
        } else if (iP == 0 || iP != 1) {
            j = c3189q5.j;
        } else {
            j = c3189q5.f23920i;
        }
        AbstractC3204r4 abstractC3204r6 = this$0.f23999a;
        long j3 = c3189q4.d;
        ArrayList arrayListB = abstractC3204r6.b(1);
        if (arrayListB.isEmpty()) {
            z3 = false;
        } else {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = arrayListB.get(0);
            Intrinsics.c(obj);
            if (timeUnit.toSeconds(jCurrentTimeMillis - ((U1) obj).f23248b) > j3) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        AbstractC3204r4 abstractC3204r7 = this$0.f23999a;
        long j4 = c3189q4.f23917c;
        long j5 = c3189q4.d;
        abstractC3204r7.getClass();
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long seconds = timeUnit2.toSeconds(System.currentTimeMillis()) + j4;
        ArrayList arrayListB2 = abstractC3204r7.b(1);
        if (arrayListB2.isEmpty()) {
            z4 = false;
        } else {
            Object obj2 = arrayListB2.get(0);
            Intrinsics.c(obj2);
            if (seconds - timeUnit2.toSeconds(((U1) obj2).f23248b) >= j5) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        if ((i2 <= iA || z3 || z4) && (c3220s4A = this$0.f24000b.a()) != null) {
            this$0.f24002e.set(true);
            Lazy lazy = AbstractC3268v4.f24047a;
            String str = c3189q4.k;
            int i3 = c3189q4.f23915a + 1;
            AbstractC3268v4.a(c3220s4A, str, i3, i3, j, c3262ue, this$0, z2);
        }
    }

    public final void a(C3220s4 eventPayload, boolean z2) {
        Intrinsics.f(eventPayload, "eventPayload");
        String TAG = this.d;
        Intrinsics.e(TAG, "TAG");
        this.f23999a.a(System.currentTimeMillis());
        if (this.f24001c != null) {
            ArrayList eventIds = eventPayload.f23979a;
            Intrinsics.f(eventIds, "eventIds");
            Integer num = Ud.f23278c;
            if (num != null && eventIds.contains(Integer.valueOf(num.intValue()))) {
                Ud.f23278c = null;
            }
        }
        this.f24002e.set(false);
    }
}
