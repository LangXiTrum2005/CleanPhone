package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi f40791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f3 f40792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x6 f40793c;
    public final ArrayList d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f40794e;

    public a7(Object emitterObj, hi startEvent, f3 clock) {
        Intrinsics.f(emitterObj, "emitterObj");
        Intrinsics.f(startEvent, "startEvent");
        Intrinsics.f(clock, "clock");
        this.f40791a = startEvent;
        this.f40792b = clock;
        this.f40793c = new x6(emitterObj);
        this.d = new ArrayList();
        this.f40794e = new LinkedHashMap();
    }

    public final void a(Object emitterObject, Object relativeEmitterObject) {
        Intrinsics.f(emitterObject, "emitterObject");
        Intrinsics.f(relativeEmitterObject, "relativeEmitterObject");
        if (this.f40793c.a(emitterObject)) {
            x6 x6Var = this.f40793c;
            x6Var.getClass();
            if (x6Var.a(relativeEmitterObject)) {
                return;
            }
            x6Var.f41667b.add(new x6(relativeEmitterObject));
        }
    }

    public final void a(p8 emitterObject, HashMap keyValues) {
        Intrinsics.f(emitterObject, "emitterObject");
        Intrinsics.f(keyValues, "keyValues");
        if (this.f40793c.a(emitterObject)) {
            long jA = this.f40792b.a();
            for (Map.Entry entry : keyValues.entrySet()) {
                hi hiVar = (hi) entry.getKey();
                String str = (String) entry.getValue();
                List arrayList = (List) this.f40794e.get(hiVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f40794e.put(hiVar, arrayList);
                }
                arrayList.add(new Pair(str, Long.valueOf(jA)));
            }
        }
    }
}
