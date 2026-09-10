package com.smartdigimkt.b4;

import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes5.dex */
public interface k {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f33922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f33923b;

        public a(l lVar) {
            this(lVar, lVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f33922a.equals(aVar.f33922a) && this.f33923b.equals(aVar.f33923b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f33923b.hashCode() + (this.f33922a.hashCode() * 31);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder(d9.i.d);
            sb.append(this.f33922a);
            if (this.f33922a.equals(this.f33923b)) {
                str = "";
            } else {
                str = ", " + this.f33923b;
            }
            return android.support.v4.media.a.r(sb, str, d9.i.f24752e);
        }

        public a(l lVar, l lVar2) {
            this.f33922a = (l) com.smartdigimkt.p4.a.a(lVar);
            this.f33923b = (l) com.smartdigimkt.p4.a.a(lVar2);
        }
    }

    public static final class b implements k {
        private final long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f33924e;

        public b(long j) {
            this(j, 0L);
        }

        @Override // com.smartdigimkt.b4.k
        public boolean a() {
            return false;
        }

        @Override // com.smartdigimkt.b4.k
        public long b() {
            return this.d;
        }

        public b(long j, long j2) {
            this.d = j;
            this.f33924e = new a(j2 == 0 ? l.f33925c : new l(0L, j2));
        }

        @Override // com.smartdigimkt.b4.k
        public a a(long j) {
            return this.f33924e;
        }
    }

    a a(long j);

    boolean a();

    long b();
}
