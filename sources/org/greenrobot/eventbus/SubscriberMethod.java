package org.greenrobot.eventbus;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public class SubscriberMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f45263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadMode f45264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f45265c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45266e;
    public String f;

    public SubscriberMethod(Method method, Class cls, ThreadMode threadMode, int i2, boolean z2) {
        this.f45263a = method;
        this.f45264b = threadMode;
        this.f45265c = cls;
        this.d = i2;
        this.f45266e = z2;
    }

    public final synchronized void a() {
        if (this.f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f45263a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f45263a.getName());
            sb.append('(');
            sb.append(this.f45265c.getName());
            this.f = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        a();
        SubscriberMethod subscriberMethod = (SubscriberMethod) obj;
        subscriberMethod.a();
        return this.f.equals(subscriberMethod.f);
    }

    public final int hashCode() {
        return this.f45263a.hashCode();
    }
}
