package com.google.firebase.components;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class Dependency {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Qualified f20220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20222c;

    public Dependency(int i2, int i3, Class cls) {
        this(Qualified.a(cls), i2, i3);
    }

    public static Dependency a(Qualified qualified) {
        return new Dependency(qualified, 1, 0);
    }

    public static Dependency b(Class cls) {
        return new Dependency(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        return this.f20220a.equals(dependency.f20220a) && this.f20221b == dependency.f20221b && this.f20222c == dependency.f20222c;
    }

    public final int hashCode() {
        return ((((this.f20220a.hashCode() ^ 1000003) * 1000003) ^ this.f20221b) * 1000003) ^ this.f20222c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f20220a);
        sb.append(", type=");
        int i2 = this.f20221b;
        if (i2 == 1) {
            str = "required";
        } else {
            str = i2 == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i3 = this.f20222c;
        if (i3 == 0) {
            str2 = DevicePublicKeyStringDef.DIRECT;
        } else if (i3 == 1) {
            str2 = IronSourceConstants.EVENTS_PROVIDER;
        } else {
            if (i3 != 2) {
                throw new AssertionError(android.support.v4.media.a.h(i3, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return android.support.v4.media.a.r(sb, str2, "}");
    }

    public Dependency(Qualified qualified, int i2, int i3) {
        Preconditions.a(qualified, "Null dependency anInterface.");
        this.f20220a = qualified;
        this.f20221b = i2;
        this.f20222c = i3;
    }
}
