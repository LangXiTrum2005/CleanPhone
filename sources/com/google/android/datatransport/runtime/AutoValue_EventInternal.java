package com.google.android.datatransport.runtime;

import android.support.v4.media.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_EventInternal extends EventInternal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f16809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EncodedPayload f16810c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f16811e;
    public final HashMap f;
    public final Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f16813i;
    public final byte[] j;

    public static final class Builder extends EventInternal.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f16815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public EncodedPayload f16816c;
        public Long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f16817e;
        public HashMap f;
        public Integer g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f16818h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f16819i;
        public byte[] j;

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal b() {
            String strM = this.f16814a == null ? " transportName" : "";
            if (this.f16816c == null) {
                strM = strM.concat(" encodedPayload");
            }
            if (this.d == null) {
                strM = a.m(strM, " eventMillis");
            }
            if (this.f16817e == null) {
                strM = a.m(strM, " uptimeMillis");
            }
            if (this.f == null) {
                strM = a.m(strM, " autoMetadata");
            }
            if (strM.isEmpty()) {
                return new AutoValue_EventInternal(this.f16814a, this.f16815b, this.f16816c, this.d.longValue(), this.f16817e.longValue(), this.f, this.g, this.f16818h, this.f16819i, this.j);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM));
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final Map c() {
            HashMap map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder d(Integer num) {
            this.f16815b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder e(EncodedPayload encodedPayload) {
            if (encodedPayload == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f16816c = encodedPayload;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder f(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder g(byte[] bArr) {
            this.f16819i = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder h(byte[] bArr) {
            this.j = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder i(Integer num) {
            this.g = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder j(String str) {
            this.f16818h = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder k(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f16814a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder l(long j) {
            this.f16817e = Long.valueOf(j);
            return this;
        }
    }

    public AutoValue_EventInternal(String str, Integer num, EncodedPayload encodedPayload, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f16808a = str;
        this.f16809b = num;
        this.f16810c = encodedPayload;
        this.d = j;
        this.f16811e = j2;
        this.f = map;
        this.g = num2;
        this.f16812h = str2;
        this.f16813i = bArr;
        this.j = bArr2;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final Map c() {
        return this.f;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final Integer d() {
        return this.f16809b;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final EncodedPayload e() {
        return this.f16810c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventInternal)) {
            return false;
        }
        EventInternal eventInternal = (EventInternal) obj;
        if (!this.f16808a.equals(eventInternal.l())) {
            return false;
        }
        Integer num = this.f16809b;
        if (num == null) {
            if (eventInternal.d() != null) {
                return false;
            }
        } else if (!num.equals(eventInternal.d())) {
            return false;
        }
        if (!this.f16810c.equals(eventInternal.e()) || this.d != eventInternal.f() || this.f16811e != eventInternal.m() || !this.f.equals(eventInternal.c())) {
            return false;
        }
        Integer num2 = this.g;
        if (num2 == null) {
            if (eventInternal.j() != null) {
                return false;
            }
        } else if (!num2.equals(eventInternal.j())) {
            return false;
        }
        String str = this.f16812h;
        if (str == null) {
            if (eventInternal.k() != null) {
                return false;
            }
        } else if (!str.equals(eventInternal.k())) {
            return false;
        }
        boolean z2 = eventInternal instanceof AutoValue_EventInternal;
        if (Arrays.equals(this.f16813i, z2 ? ((AutoValue_EventInternal) eventInternal).f16813i : eventInternal.g())) {
            return Arrays.equals(this.j, z2 ? ((AutoValue_EventInternal) eventInternal).j : eventInternal.h());
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final long f() {
        return this.d;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final byte[] g() {
        return this.f16813i;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final byte[] h() {
        return this.j;
    }

    public final int hashCode() {
        int iHashCode = (this.f16808a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f16809b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f16810c.hashCode()) * 1000003;
        long j = this.d;
        int i2 = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f16811e;
        int iHashCode3 = (((i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f16812h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f16813i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final Integer j() {
        return this.g;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final String k() {
        return this.f16812h;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final String l() {
        return this.f16808a;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final long m() {
        return this.f16811e;
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f16808a + ", code=" + this.f16809b + ", encodedPayload=" + this.f16810c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f16811e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.f16812h + ", experimentIdsClear=" + Arrays.toString(this.f16813i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
