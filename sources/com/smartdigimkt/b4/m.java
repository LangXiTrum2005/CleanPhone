package com.smartdigimkt.b4;

import com.smartdigimkt.p4.s;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public interface m {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f33929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f33930c;
        public final int d;

        public a(int i2, byte[] bArr, int i3, int i4) {
            this.f33928a = i2;
            this.f33929b = bArr;
            this.f33930c = i3;
            this.d = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f33928a == aVar.f33928a && this.f33930c == aVar.f33930c && this.d == aVar.d && Arrays.equals(this.f33929b, aVar.f33929b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.f33929b) + (this.f33928a * 31)) * 31) + this.f33930c) * 31) + this.d;
        }
    }

    int a(f fVar, int i2, boolean z2) throws InterruptedException, IOException;

    void a(long j, int i2, int i3, int i4, a aVar);

    void a(s sVar, int i2);

    void a(com.smartdigimkt.w3.m mVar);
}
