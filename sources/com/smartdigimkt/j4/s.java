package com.smartdigimkt.j4;

import android.os.Handler;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface s {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36017c;
        public final long d;

        public a(int i2) {
            this(i2, -1L);
        }

        public a a(int i2) {
            return this.f36015a == i2 ? this : new a(i2, this.f36016b, this.f36017c, this.d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f36015a == aVar.f36015a && this.f36016b == aVar.f36016b && this.f36017c == aVar.f36017c && this.d == aVar.d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((((this.f36015a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f36016b) * 31) + this.f36017c) * 31) + ((int) this.d);
        }

        public a(int i2, long j) {
            this(i2, -1, -1, j);
        }

        public a(int i2, int i3, int i4, long j) {
            this.f36015a = i2;
            this.f36016b = i3;
            this.f36017c = i4;
            this.d = j;
        }

        public boolean a() {
            return this.f36016b != -1;
        }
    }

    public interface b {
        void a(s sVar, com.smartdigimkt.w3.e0 e0Var, Object obj);
    }

    r a(a aVar, com.smartdigimkt.n4.b bVar);

    void a(Handler handler, t tVar);

    void a(r rVar);

    void a(b bVar);

    void a(t tVar);

    void a(com.smartdigimkt.w3.h hVar, boolean z2, b bVar);

    void b() throws IOException;
}
