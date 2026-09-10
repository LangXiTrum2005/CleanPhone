package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class A5 implements InterfaceC3333z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ab f22682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Kd f22683b;

    public A5(Context context, double d, EnumC2932a7 logLevel, boolean z2, boolean z3, int i2, long j, boolean z4) {
        Intrinsics.f(context, "context");
        Intrinsics.f(logLevel, "logLevel");
        if (!z3) {
            this.f22683b = new Kd();
        }
        if (z2) {
            return;
        }
        Ab ab = new Ab(context, d, logLevel, j, i2, z4);
        this.f22682a = ab;
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3080j7.f23723a;
        Objects.toString(ab);
        AbstractC3080j7.f23723a.add(new WeakReference(ab));
    }

    public final void a(String tag, String message) {
        Intrinsics.f(tag, "tag");
        Intrinsics.f(message, "message");
        Ab ab = this.f22682a;
        if (ab != null) {
            ab.a(EnumC2932a7.DEBUG, tag, message);
        }
    }

    public final void b(String tag, String message) {
        Intrinsics.f(tag, "tag");
        Intrinsics.f(message, "message");
        Ab ab = this.f22682a;
        if (ab != null) {
            ab.a(EnumC2932a7.ERROR, tag, message);
        }
    }

    public final void c(String tag, String message) {
        Intrinsics.f(tag, "tag");
        Intrinsics.f(message, "message");
        Ab ab = this.f22682a;
        if (ab != null) {
            ab.a(EnumC2932a7.INFO, tag, message);
        }
    }

    public final void d(String tag, String message) {
        Intrinsics.f(tag, "tag");
        Intrinsics.f(message, "message");
        Ab ab = this.f22682a;
        if (ab != null) {
            ab.a(EnumC2932a7.STATE, tag, message);
        }
        if (this.f22683b != null) {
            Intrinsics.f("STATE_CHANGE: ".concat(message), "message");
        }
    }

    public final void e(String key, String value) {
        Intrinsics.f(key, "key");
        Intrinsics.f(value, "value");
        Ab ab = this.f22682a;
        if (ab != null) {
            Objects.toString(ab.f22699i);
            if (ab.f22699i.get()) {
                return;
            }
            ab.f22698h.put(key, value);
        }
    }

    public final void a(String tag, String message, Exception error) {
        Intrinsics.f(tag, "tag");
        Intrinsics.f(message, "message");
        Intrinsics.f(error, "error");
        Ab ab = this.f22682a;
        if (ab != null) {
            EnumC2932a7 enumC2932a7 = EnumC2932a7.ERROR;
            StringBuilder sbX = android.support.v4.media.a.x(message, "\nError: ");
            sbX.append(ExceptionsKt.b(error));
            ab.a(enumC2932a7, tag, sbX.toString());
        }
    }

    public final void b() {
        Ab ab = this.f22682a;
        if (ab != null) {
            ab.a();
        }
    }

    public final void a(boolean z2) {
        Ab ab = this.f22682a;
        if (ab != null) {
            Objects.toString(ab.f22699i);
            if (!ab.f22699i.get()) {
                ab.d = z2;
            }
        }
        if (z2) {
            return;
        }
        Ab ab2 = this.f22682a;
        if (ab2 == null || !ab2.f.a()) {
            CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3080j7.f23723a;
            AbstractC3064i7.a(this.f22682a);
            this.f22682a = null;
        }
    }

    public final void a() {
        Ab ab = this.f22682a;
        if (ab != null) {
            ab.b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3080j7.f23723a;
        AbstractC3064i7.a(this.f22682a);
    }
}
