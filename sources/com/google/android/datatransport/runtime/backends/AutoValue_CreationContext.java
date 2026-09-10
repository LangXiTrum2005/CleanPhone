package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import android.support.v4.media.a;
import com.google.android.datatransport.runtime.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CreationContext extends CreationContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f16857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clock f16858c;
    public final String d;

    public AutoValue_CreationContext(Context context, Clock clock, Clock clock2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f16856a = context;
        if (clock == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f16857b = clock;
        if (clock2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f16858c = clock2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final Context a() {
        return this.f16856a;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final String b() {
        return this.d;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final Clock c() {
        return this.f16858c;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final Clock d() {
        return this.f16857b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreationContext)) {
            return false;
        }
        CreationContext creationContext = (CreationContext) obj;
        return this.f16856a.equals(creationContext.a()) && this.f16857b.equals(creationContext.d()) && this.f16858c.equals(creationContext.c()) && this.d.equals(creationContext.b());
    }

    public final int hashCode() {
        return ((((((this.f16856a.hashCode() ^ 1000003) * 1000003) ^ this.f16857b.hashCode()) * 1000003) ^ this.f16858c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f16856a);
        sb.append(", wallClock=");
        sb.append(this.f16857b);
        sb.append(", monotonicClock=");
        sb.append(this.f16858c);
        sb.append(", backendName=");
        return a.r(sb, this.d, "}");
    }
}
