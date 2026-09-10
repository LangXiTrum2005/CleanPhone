package com.smartdigimkt.y3;

import android.media.AudioAttributes;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f40038e = new C0644b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40041c;
    private AudioAttributes d;

    /* JADX INFO: renamed from: com.smartdigimkt.y3.b$b, reason: collision with other inner class name */
    public static final class C0644b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f40042a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f40043b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f40044c = 1;

        public C0644b a(int i2) {
            this.f40042a = i2;
            return this;
        }

        public C0644b b(int i2) {
            this.f40043b = i2;
            return this;
        }

        public C0644b c(int i2) {
            this.f40044c = i2;
            return this;
        }

        public b a() {
            return new b(this.f40042a, this.f40043b, this.f40044c);
        }
    }

    public AudioAttributes a() {
        if (this.d == null) {
            this.d = new AudioAttributes.Builder().setContentType(this.f40039a).setFlags(this.f40040b).setUsage(this.f40041c).build();
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f40039a == bVar.f40039a && this.f40040b == bVar.f40040b && this.f40041c == bVar.f40041c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f40039a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f40040b) * 31) + this.f40041c;
    }

    private b(int i2, int i3, int i4) {
        this.f40039a = i2;
        this.f40040b = i3;
        this.f40041c = i4;
    }
}
