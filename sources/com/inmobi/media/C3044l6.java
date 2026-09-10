package com.inmobi.media;

import android.content.Context;
import com.unity3d.ads.BuildConfig;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3044l6 {
    public final String a;
    public final AbstractC2843d6 b;
    public final Jf c;
    public final Wj d;
    public final String e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final LinkedList h;
    public final saran i;
    public C2817c6 j;

    public C3044l6(String tableName, AbstractC2843d6 mEventDao, Jf mPayloadProvider, C2817c6 eventConfig, Wj wj) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(mEventDao, "mEventDao");
        Intrinsics.checkNotNullParameter(mPayloadProvider, "mPayloadProvider");
        Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
        this.a = tableName;
        this.b = mEventDao;
        this.c = mPayloadProvider;
        this.d = wj;
        this.e = C3044l6.class.getSimpleName();
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.i = A9.c;
        this.h = new LinkedList();
        this.j = eventConfig;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0110  */
    /* JADX WARN: Code duplicated, block: B:55:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x0157  */
    /* JADX WARN: Code duplicated, block: B:62:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x017a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0181  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public static final Object a(C3044l6 listener, boolean z, ContinuationImpl continuationImpl) throws InterruptedException {
        C2894f6 c2894f6;
        C2817c6 c2817c6;
        boolean z2;
        Ak ak;
        C2817c6 c2817c7;
        boolean z3;
        Ak ak2;
        int iIntValue;
        int iL;
        C2817c6 c2817c8;
        int i;
        long j;
        Object objA;
        int i2;
        boolean zBooleanValue;
        boolean z4;
        boolean z5;
        int i3;
        boolean z6;
        Ak ak3;
        long j2;
        C2868e6 payload;
        listener.getClass();
        if (continuationImpl instanceof C2894f6) {
            c2894f6 = (C2894f6) continuationImpl;
            int i4 = c2894f6.j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c2894f6.j = i4 - Integer.MIN_VALUE;
            } else {
                c2894f6 = new C2894f6(listener, continuationImpl);
            }
        } else {
            c2894f6 = new C2894f6(listener, continuationImpl);
        }
        C2894f6 c2894f7 = c2894f6;
        Object objA2 = c2894f7.h;
        Object objBeachfront = attabal.beachfront();
        int i5 = c2894f7.j;
        if (i5 == 0) {
            dern.saneness(objA2);
            c2817c6 = listener.j;
            if (listener.g.get() || listener.f.get() || c2817c6 == null) {
                return Unit.f29295attabal;
            }
            String TAG = listener.e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            long jCurrentTimeMillis = System.currentTimeMillis() - (c2817c6.b * ((long) 1000));
            AbstractC2843d6 abstractC2843d6 = listener.b;
            c2894f7.a = null;
            c2894f7.b = c2817c6;
            z2 = z;
            c2894f7.c = z2;
            c2894f7.j = 1;
            if (abstractC2843d6.a(jCurrentTimeMillis, c2894f7) != objBeachfront) {
                ak = null;
            }
            return objBeachfront;
        }
        if (i5 == 1) {
            boolean z7 = c2894f7.c;
            c2817c6 = c2894f7.b;
            ak = c2894f7.a;
            dern.saneness(objA2);
            z2 = z7;
        } else {
            if (i5 == 2) {
                boolean z8 = c2894f7.c;
                C2817c6 c2817c9 = c2894f7.b;
                Ak ak4 = c2894f7.a;
                dern.saneness(objA2);
                c2817c7 = c2817c9;
                ak2 = ak4;
                z3 = z8;
                iIntValue = ((Number) objA2).intValue();
                C3342x5.a.getClass();
                iL = C3342x5.l();
                c2817c8 = listener.j;
                if (c2817c8 == null) {
                    i = 0;
                } else {
                    i = (iL == 0 || iL != 1) ? c2817c8.g : c2817c8.e;
                }
                if (c2817c8 == null) {
                    j = 0;
                } else {
                    j = (iL == 0 || iL != 1) ? c2817c8.j : c2817c8.i;
                }
                long j3 = c2817c7.d;
                c2894f7.a = ak2;
                c2894f7.b = c2817c7;
                c2894f7.c = z3;
                c2894f7.e = iIntValue;
                c2894f7.f = i;
                c2894f7.g = j;
                c2894f7.j = 3;
                objA = listener.a(j3, c2894f7);
                if (objA != objBeachfront) {
                    i2 = iIntValue;
                    objA2 = objA;
                    zBooleanValue = ((Boolean) objA2).booleanValue();
                    long j4 = c2817c7.c;
                    long j5 = c2817c7.d;
                    c2894f7.a = ak2;
                    c2894f7.b = c2817c7;
                    c2894f7.c = z3;
                    c2894f7.e = i2;
                    c2894f7.f = i;
                    c2894f7.g = j;
                    c2894f7.d = zBooleanValue;
                    c2894f7.j = 4;
                    objA2 = listener.a(j4, j5, c2894f7);
                    if (objA2 != objBeachfront) {
                        z4 = z3;
                        z5 = zBooleanValue;
                        i3 = i;
                        boolean zBooleanValue2 = ((Boolean) objA2).booleanValue();
                        if (i3 > i2) {
                        }
                        Jf jf = listener.c;
                        c2894f7.a = ak2;
                        c2894f7.b = c2817c7;
                        c2894f7.c = z4;
                        c2894f7.g = j;
                        c2894f7.j = 5;
                        objA2 = jf.a(c2894f7);
                        if (objA2 != objBeachfront) {
                            z6 = z4;
                            ak3 = ak2;
                            j2 = j;
                        }
                    }
                }
                return objBeachfront;
            }
            if (i5 == 3) {
                long j6 = c2894f7.g;
                int i6 = c2894f7.f;
                int i7 = c2894f7.e;
                z3 = c2894f7.c;
                c2817c7 = c2894f7.b;
                ak2 = c2894f7.a;
                dern.saneness(objA2);
                j = j6;
                i = i6;
                i2 = i7;
                zBooleanValue = ((Boolean) objA2).booleanValue();
                long j7 = c2817c7.c;
                long j8 = c2817c7.d;
                c2894f7.a = ak2;
                c2894f7.b = c2817c7;
                c2894f7.c = z3;
                c2894f7.e = i2;
                c2894f7.f = i;
                c2894f7.g = j;
                c2894f7.d = zBooleanValue;
                c2894f7.j = 4;
                objA2 = listener.a(j7, j8, c2894f7);
                if (objA2 != objBeachfront) {
                    z4 = z3;
                    z5 = zBooleanValue;
                    i3 = i;
                    boolean zBooleanValue3 = ((Boolean) objA2).booleanValue();
                    if (i3 > i2) {
                    }
                    Jf jf2 = listener.c;
                    c2894f7.a = ak2;
                    c2894f7.b = c2817c7;
                    c2894f7.c = z4;
                    c2894f7.g = j;
                    c2894f7.j = 5;
                    objA2 = jf2.a(c2894f7);
                    if (objA2 != objBeachfront) {
                        z6 = z4;
                        ak3 = ak2;
                        j2 = j;
                    }
                }
                return objBeachfront;
            }
            if (i5 == 4) {
                z5 = c2894f7.d;
                long j9 = c2894f7.g;
                i3 = c2894f7.f;
                i2 = c2894f7.e;
                boolean z9 = c2894f7.c;
                c2817c7 = c2894f7.b;
                ak2 = c2894f7.a;
                dern.saneness(objA2);
                j = j9;
                z4 = z9;
                boolean zBooleanValue4 = ((Boolean) objA2).booleanValue();
                if (i3 > i2 || z5 || zBooleanValue4) {
                    Jf jf3 = listener.c;
                    c2894f7.a = ak2;
                    c2894f7.b = c2817c7;
                    c2894f7.c = z4;
                    c2894f7.g = j;
                    c2894f7.j = 5;
                    objA2 = jf3.a(c2894f7);
                    if (objA2 != objBeachfront) {
                        z6 = z4;
                        ak3 = ak2;
                        j2 = j;
                    }
                    return objBeachfront;
                }
                return Unit.f29295attabal;
            }
            if (i5 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j10 = c2894f7.g;
            boolean z10 = c2894f7.c;
            C2817c6 c2817c10 = c2894f7.b;
            Ak ak5 = c2894f7.a;
            dern.saneness(objA2);
            z6 = z10;
            c2817c7 = c2817c10;
            ak3 = ak5;
            j2 = j10;
        }
        payload = (C2868e6) objA2;
        if (payload != null) {
            listener.f.set(true);
            taiyuan taiyuanVar = AbstractC3094n6.a;
            String str = c2817c7.k;
            int i8 = c2817c7.a + 1;
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(listener, "listener");
            AbstractC3094n6.a(payload, str, i8, i8, j2, ak3, listener, z6);
        }
        return Unit.f29295attabal;
        AbstractC2843d6 abstractC2843d7 = listener.b;
        c2894f7.a = ak;
        c2894f7.b = c2817c6;
        c2894f7.c = z2;
        c2894f7.j = 2;
        objA2 = abstractC2843d7.a(c2894f7);
        if (objA2 != objBeachfront) {
            c2817c7 = c2817c6;
            z3 = z2;
            ak2 = ak;
            iIntValue = ((Number) objA2).intValue();
            C3342x5.a.getClass();
            iL = C3342x5.l();
            c2817c8 = listener.j;
            if (c2817c8 == null) {
                i = 0;
            } else if (iL == 0) {
                i = c2817c8.g;
            }
            if (c2817c8 == null) {
                j = 0;
            } else if (iL == 0) {
                j = c2817c8.j;
            }
            long j11 = c2817c7.d;
            c2894f7.a = ak2;
            c2894f7.b = c2817c7;
            c2894f7.c = z3;
            c2894f7.e = iIntValue;
            c2894f7.f = i;
            c2894f7.g = j;
            c2894f7.j = 3;
            objA = listener.a(j11, c2894f7);
            if (objA != objBeachfront) {
                i2 = iIntValue;
                objA2 = objA;
                zBooleanValue = ((Boolean) objA2).booleanValue();
                long j12 = c2817c7.c;
                long j13 = c2817c7.d;
                c2894f7.a = ak2;
                c2894f7.b = c2817c7;
                c2894f7.c = z3;
                c2894f7.e = i2;
                c2894f7.f = i;
                c2894f7.g = j;
                c2894f7.d = zBooleanValue;
                c2894f7.j = 4;
                objA2 = listener.a(j12, j13, c2894f7);
                if (objA2 != objBeachfront) {
                    z4 = z3;
                    z5 = zBooleanValue;
                    i3 = i;
                    boolean zBooleanValue5 = ((Boolean) objA2).booleanValue();
                    if (i3 > i2) {
                    }
                    Jf jf4 = listener.c;
                    c2894f7.a = ak2;
                    c2894f7.b = c2817c7;
                    c2894f7.c = z4;
                    c2894f7.g = j;
                    c2894f7.j = 5;
                    objA2 = jf4.a(c2894f7);
                    if (objA2 != objBeachfront) {
                        z6 = z4;
                        ak3 = ak2;
                        j2 = j;
                        payload = (C2868e6) objA2;
                        if (payload != null) {
                            listener.f.set(true);
                            taiyuan taiyuanVar2 = AbstractC3094n6.a;
                            String str2 = c2817c7.k;
                            int i9 = c2817c7.a + 1;
                            Intrinsics.checkNotNullParameter(payload, "payload");
                            Intrinsics.checkNotNullParameter(listener, "listener");
                            AbstractC3094n6.a(payload, str2, i9, i9, j2, ak3, listener, z6);
                        }
                        return Unit.f29295attabal;
                    }
                }
            }
        }
        return objBeachfront;
    }

    public final long a() {
        Context context = Ji.a;
        if (context == null) {
            return -1L;
        }
        ConcurrentHashMap concurrentHashMap = Ea.b;
        Ea eaA = Da.a(context, "batch_processing_info");
        String key = this.a + "_last_batch_process";
        Intrinsics.checkNotNullParameter(key, "key");
        return eaA.a.getLong(key, -1L);
    }

    public final void a(long j) {
        Context context = Ji.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.b;
            Da.a(context, "batch_processing_info").a(this.a + "_last_batch_process", j, false);
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [T, kotlinx.coroutines.monroe] */
    public final void a(boolean z) {
        C2817c6 c2817c6 = this.j;
        if (this.g.get() || c2817c6 == null) {
            return;
        }
        long j = c2817c6.c;
        if (this.h.contains(BuildConfig.FLAVOR)) {
            return;
        }
        this.h.add(BuildConfig.FLAVOR);
        String TAG = this.e;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        saran saranVar = this.i;
        C2817c6 c2817c7 = this.j;
        long jA = a();
        if (jA == -1) {
            a(System.currentTimeMillis());
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ref$ObjectRef.element = F3.a(saranVar, Math.max(0L, (timeUnit.toSeconds(jA) + (c2817c7 != null ? c2817c7.c : 0L)) - timeUnit.toSeconds(System.currentTimeMillis())) * 1000, 1000 * j, new C2994j6(this, z, ref$ObjectRef, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        C2920g6 c2920g6;
        if (continuationImpl instanceof C2920g6) {
            c2920g6 = (C2920g6) continuationImpl;
            int i = c2920g6.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2920g6.d = i - Integer.MIN_VALUE;
            } else {
                c2920g6 = new C2920g6(this, continuationImpl);
            }
        } else {
            c2920g6 = new C2920g6(this, continuationImpl);
        }
        Object objB = c2920g6.b;
        Object objBeachfront = attabal.beachfront();
        int i2 = c2920g6.d;
        if (i2 == 0) {
            dern.saneness(objB);
            AbstractC2843d6 abstractC2843d6 = this.b;
            c2920g6.a = j;
            c2920g6.d = 1;
            objB = abstractC2843d6.b(1, c2920g6);
            if (objB == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c2920g6.a;
            dern.saneness(objB);
        }
        List list = (List) objB;
        return igo.attabal.attabal(!list.isEmpty() && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - ((AbstractC2966i2) list.get(0)).c) > j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, long j2, ContinuationImpl continuationImpl) {
        C3019k6 c3019k6;
        long seconds;
        if (continuationImpl instanceof C3019k6) {
            c3019k6 = (C3019k6) continuationImpl;
            int i = c3019k6.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3019k6.e = i - Integer.MIN_VALUE;
            } else {
                c3019k6 = new C3019k6(this, continuationImpl);
            }
        } else {
            c3019k6 = new C3019k6(this, continuationImpl);
        }
        Object objB = c3019k6.c;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3019k6.e;
        if (i2 == 0) {
            dern.saneness(objB);
            seconds = j + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            AbstractC2843d6 abstractC2843d6 = this.b;
            c3019k6.a = j2;
            c3019k6.b = seconds;
            c3019k6.e = 1;
            objB = abstractC2843d6.b(1, c3019k6);
            if (objB == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            seconds = c3019k6.b;
            j2 = c3019k6.a;
            dern.saneness(objB);
        }
        List list = (List) objB;
        return igo.attabal.attabal(!list.isEmpty() && seconds - TimeUnit.MILLISECONDS.toSeconds(((AbstractC2966i2) list.get(0)).c) >= j2);
    }
}
