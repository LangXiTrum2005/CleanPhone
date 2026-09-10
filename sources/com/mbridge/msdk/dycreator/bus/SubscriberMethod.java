package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class SubscriberMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Method f33205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadMode f33206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Class<?> f33207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f33208d;

    public SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f33205a = method;
        this.f33206b = threadMode;
        this.f33207c = cls;
    }

    private synchronized void a() {
        if (this.f33208d == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f33205a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f33205a.getName());
            sb2.append('(');
            sb2.append(this.f33207c.getName());
            this.f33208d = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        a();
        return this.f33208d.equals(((SubscriberMethod) obj).f33208d);
    }

    public int hashCode() {
        return this.f33205a.hashCode();
    }
}
