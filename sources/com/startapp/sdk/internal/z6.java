package com.startapp.sdk.internal;

import com.applovin.impl.H0;
import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.adsbase.remoteconfig.EventTracerMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
public final class z6 implements y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3 f41758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f41759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f41760c;
    public final Lazy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f41761e;
    public final Lazy f;
    public final Lazy g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f41762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f41763i;
    public final ArrayList j;

    public z6(f3 clock, final kb metadataRef, lb executorRef, Function2 sendReport) {
        Intrinsics.f(clock, "clock");
        Intrinsics.f(metadataRef, "metadataRef");
        Intrinsics.f(executorRef, "executorRef");
        Intrinsics.f(sendReport, "sendReport");
        this.f41758a = clock;
        this.f41759b = sendReport;
        this.f41760c = LazyKt.b(new com.charging.screenshow.battery.animations.themes.activity.f(6, metadataRef, this));
        final int i2 = 0;
        this.d = LazyKt.b(new Function0() { // from class: com.startapp.sdk.internal.H
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Integer.valueOf(z6.d(metadataRef));
                    case 1:
                        return z6.e(metadataRef);
                    case 2:
                        return z6.c(metadataRef);
                    case 3:
                        return z6.a(metadataRef);
                    default:
                        return z6.b(metadataRef);
                }
            }
        });
        final int i3 = 1;
        this.f41761e = LazyKt.b(new Function0() { // from class: com.startapp.sdk.internal.H
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return Integer.valueOf(z6.d(metadataRef));
                    case 1:
                        return z6.e(metadataRef);
                    case 2:
                        return z6.c(metadataRef);
                    case 3:
                        return z6.a(metadataRef);
                    default:
                        return z6.b(metadataRef);
                }
            }
        });
        final int i4 = 2;
        this.f = LazyKt.b(new Function0() { // from class: com.startapp.sdk.internal.H
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return Integer.valueOf(z6.d(metadataRef));
                    case 1:
                        return z6.e(metadataRef);
                    case 2:
                        return z6.c(metadataRef);
                    case 3:
                        return z6.a(metadataRef);
                    default:
                        return z6.b(metadataRef);
                }
            }
        });
        final int i5 = 3;
        this.g = LazyKt.b(new Function0() { // from class: com.startapp.sdk.internal.H
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return Integer.valueOf(z6.d(metadataRef));
                    case 1:
                        return z6.e(metadataRef);
                    case 2:
                        return z6.c(metadataRef);
                    case 3:
                        return z6.a(metadataRef);
                    default:
                        return z6.b(metadataRef);
                }
            }
        });
        final int i6 = 4;
        this.f41762h = LazyKt.b(new Function0() { // from class: com.startapp.sdk.internal.H
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return Integer.valueOf(z6.d(metadataRef));
                    case 1:
                        return z6.e(metadataRef);
                    case 2:
                        return z6.c(metadataRef);
                    case 3:
                        return z6.a(metadataRef);
                    default:
                        return z6.b(metadataRef);
                }
            }
        });
        this.f41763i = LazyKt.b(new androidx.room.c(executorRef, 5));
        this.j = new ArrayList();
    }

    public static final String a(kb metadataRef) {
        String strB;
        Intrinsics.f(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f41182a.a()).get();
        if (eventTracerMetadata == null || (strB = eventTracerMetadata.b()) == null) {
            return "[=,:;]";
        }
        if (strB.length() < 6) {
            strB = null;
        }
        return strB == null ? "[=,:;]" : strB;
    }

    public static final String b(kb metadataRef) {
        String strC;
        Intrinsics.f(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f41182a.a()).get();
        if (eventTracerMetadata == null || (strC = eventTracerMetadata.c()) == null) {
            return "_";
        }
        if (strC.length() < 1) {
            strC = null;
        }
        return strC == null ? "_" : strC;
    }

    public static final String c(kb metadataRef) {
        String strA;
        Intrinsics.f(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f41182a.a()).get();
        if (eventTracerMetadata == null || (strA = eventTracerMetadata.a()) == null) {
            return "=,:;";
        }
        if (strA.length() < 4) {
            strA = null;
        }
        return strA == null ? "=,:;" : strA;
    }

    public static final int d(kb metadataRef) {
        int iE;
        Intrinsics.f(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f41182a.a()).get();
        if (eventTracerMetadata == null || (iE = eventTracerMetadata.e()) < 1) {
            return Integer.MAX_VALUE;
        }
        return iE;
    }

    public static final Set e(kb metadataRef) {
        Set setF;
        Intrinsics.f(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f41182a.a()).get();
        return (eventTracerMetadata == null || (setF = eventTracerMetadata.f()) == null) ? EmptySet.X : setF;
    }

    public final void a(Object emitterObj, Object relativeEmitterObject) {
        Intrinsics.f(emitterObj, "emitterObj");
        Intrinsics.f(relativeEmitterObject, "relativeEmitterObject");
        if (((Boolean) this.f41760c.getX()).booleanValue()) {
            synchronized (this.j) {
                try {
                    ArrayList arrayList = this.j;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        a7 a7Var = (a7) obj;
                        a7Var.getClass();
                        if (a7Var.f40793c.a(emitterObj)) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((a7) it.next()).a(emitterObj, relativeEmitterObject);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(Object rootEmitterObj, hi startEvent) {
        Intrinsics.f(rootEmitterObj, "rootEmitterObj");
        Intrinsics.f(startEvent, "startEvent");
        if (((Boolean) this.f41760c.getX()).booleanValue()) {
            synchronized (this.j) {
                try {
                    ArrayList arrayList = this.j;
                    ArrayList<a7> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        a7 a7Var = (a7) obj;
                        a7Var.getClass();
                        x6 x6Var = a7Var.f40793c;
                        x6Var.getClass();
                        if (x6Var.f41666a.get() == rootEmitterObj && Intrinsics.a(a7Var.f40791a, startEvent)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (a7 a7Var2 : arrayList2) {
                        a7Var2.getClass();
                        x6 x6Var2 = a7Var2.f40793c;
                        x6Var2.getClass();
                        if (x6Var2.f41666a.get() == rootEmitterObj) {
                            a(this, a7Var2.d, a7Var2.f40794e);
                        }
                        this.j.remove(a7Var2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(Object emitterObj, hi event) {
        Intrinsics.f(emitterObj, "emitterObj");
        Intrinsics.f(event, "event");
        if (((Boolean) this.f41760c.getX()).booleanValue()) {
            synchronized (this.j) {
                try {
                    ArrayList arrayList = this.j;
                    ArrayList<a7> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        a7 a7Var = (a7) obj;
                        a7Var.getClass();
                        if (a7Var.f40793c.a(emitterObj)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (a7 a7Var2 : arrayList2) {
                        a7Var2.getClass();
                        if (a7Var2.f40793c.a(emitterObj)) {
                            a7Var2.d.add(new Pair(event, Long.valueOf(a7Var2.f40792b.a())));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final boolean a(kb metadataRef, z6 this$0) {
        EnabledConfig enabledConfigD;
        Intrinsics.f(metadataRef, "$metadataRef");
        Intrinsics.f(this$0, "this$0");
        f3 f3Var = this$0.f41758a;
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f41182a.a()).get();
        return (eventTracerMetadata == null || (enabledConfigD = eventTracerMetadata.d()) == null || !enabledConfigD.a(f3Var)) ? false : true;
    }

    public final boolean a(Object rootEmitterObj, hi startEvent) {
        Intrinsics.f(rootEmitterObj, "rootEmitterObj");
        Intrinsics.f(startEvent, "startEvent");
        boolean z2 = false;
        if (!((Boolean) this.f41760c.getX()).booleanValue() || !((Set) this.f41761e.getX()).contains(startEvent.f41067a)) {
            return false;
        }
        synchronized (this.j) {
            try {
                if (this.j.size() < ((Number) this.d.getX()).intValue()) {
                    ArrayList<a7> arrayList = this.j;
                    if (arrayList == null || !arrayList.isEmpty()) {
                        for (a7 a7Var : arrayList) {
                            a7Var.getClass();
                            x6 x6Var = a7Var.f40793c;
                            x6Var.getClass();
                            if (x6Var.f41666a.get() != rootEmitterObj || !Intrinsics.a(a7Var.f40791a, startEvent)) {
                            }
                        }
                    }
                    ArrayList arrayList2 = this.j;
                    f3 f3Var = this.f41758a;
                    a7 a7Var2 = new a7(rootEmitterObj, startEvent, f3Var);
                    if (a7Var2.f40793c.a(rootEmitterObj)) {
                        a7Var2.d.add(new Pair(startEvent, Long.valueOf(f3Var.a())));
                    }
                    if (arrayList2.add(a7Var2)) {
                        z2 = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final void b(z6 this$0, List events, Map data) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(events, "$events");
        Intrinsics.f(data, "$data");
        if (events.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = ((String) this$0.f.getX()).charAt(0);
        char cCharAt2 = ((String) this$0.f.getX()).charAt(1);
        char cCharAt3 = ((String) this$0.f.getX()).charAt(2);
        char cCharAt4 = ((String) this$0.f.getX()).charAt(3);
        Iterator it = events.iterator();
        long j = 0;
        String str = null;
        long j2 = 0;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str2 = ((hi) pair.X).f41067a;
            long jLongValue = ((Number) pair.f43249Y).longValue();
            if (str == null) {
                str = str2;
                j2 = jLongValue;
            } else {
                sb.append(str2);
                sb.append(cCharAt);
                sb.append(jLongValue - j);
                sb.append(cCharAt2);
            }
            j = jLongValue;
        }
        if (str == null) {
            return;
        }
        sb.append(com.ironsource.d9.h.f24727l);
        sb.append(cCharAt);
        sb.append(j - j2);
        sb.append(cCharAt4);
        for (Map.Entry entry : data.entrySet()) {
            hi hiVar = (hi) entry.getKey();
            List<Pair> list = (List) entry.getValue();
            sb.append(hiVar.f41067a);
            char c2 = cCharAt3;
            for (Pair pair2 : list) {
                String strC = new Regex((String) this$0.g.getX()).c((String) this$0.f41762h.getX(), (CharSequence) pair2.X);
                long jLongValue2 = ((Number) pair2.f43249Y).longValue() - j2;
                sb.append(c2);
                sb.append(strC);
                sb.append(cCharAt);
                sb.append(jLongValue2);
                c2 = cCharAt2;
            }
            sb.append(cCharAt4);
        }
        Function2 function2 = this$0.f41759b;
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        function2.invoke(str, string);
    }

    public final void a(p8 emitterObj, HashMap keyValues) {
        Intrinsics.f(emitterObj, "emitterObj");
        Intrinsics.f(keyValues, "keyValues");
        if (((Boolean) this.f41760c.getX()).booleanValue()) {
            synchronized (this.j) {
                try {
                    ArrayList arrayList = this.j;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        a7 a7Var = (a7) obj;
                        a7Var.getClass();
                        if (a7Var.f40793c.a(emitterObj)) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((a7) it.next()).a(emitterObj, keyValues);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final Executor a(lb executorRef) {
        Intrinsics.f(executorRef, "$executorRef");
        return (Executor) executorRef.a();
    }

    public static final Unit a(z6 this$0, List events, Map data) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(events, "events");
        Intrinsics.f(data, "data");
        Object x = this$0.f41763i.getX();
        Intrinsics.e(x, "getValue(...)");
        ((Executor) x).execute(new H0(this$0, events, data, 29));
        return Unit.f43263a;
    }
}
