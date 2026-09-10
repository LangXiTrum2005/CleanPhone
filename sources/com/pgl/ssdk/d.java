package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f33466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f33467b;

        public a(long j, q qVar) {
            this.f33466a = j;
            this.f33467b = qVar;
        }

        public q a() {
            return this.f33467b;
        }

        public long b() {
            return this.f33466a;
        }
    }

    public static t a(q qVar) throws IOException, s {
        o<ByteBuffer, Long> oVarA = p.a(qVar);
        if (oVarA == null) {
            throw new s("ZIP End of Central Directory record not found");
        }
        ByteBuffer byteBufferA = oVarA.a();
        long jLongValue = oVarA.b().longValue();
        byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
        long jC = p.c(byteBufferA);
        if (jC > jLongValue) {
            StringBuilder sbV = android.support.v4.media.a.v(jC, "ZIP Central Directory start offset out of range: ", ". ZIP End of Central Directory offset: ");
            sbV.append(jLongValue);
            throw new s(sbV.toString());
        }
        long jD = p.d(byteBufferA);
        long j = jC + jD;
        if (j <= jLongValue) {
            return new t(jC, jD, p.e(byteBufferA), jLongValue, byteBufferA);
        }
        StringBuilder sbV2 = android.support.v4.media.a.v(j, "ZIP Central Directory overlaps with End of Central Directory. CD end: ", ", EoCD start: ");
        sbV2.append(jLongValue);
        throw new s(sbV2.toString());
    }

    public static a a(q qVar, t tVar) throws b, IOException {
        long jA = tVar.a();
        long jC = tVar.c() + jA;
        long jE = tVar.e();
        if (jC != jE) {
            StringBuilder sbV = android.support.v4.media.a.v(jC, "ZIP Central Directory is not immediately followed by End of Central Directory. CD end: ", ", EoCD start: ");
            sbV.append(jE);
            throw new b(sbV.toString());
        }
        if (jA >= 32) {
            ByteBuffer byteBufferA = qVar.a(jA - 24, 24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferA.order(byteOrder);
            if (byteBufferA.getLong(8) == 2334950737559900225L && byteBufferA.getLong(16) == 3617552046287187010L) {
                long j = byteBufferA.getLong(0);
                if (j < byteBufferA.capacity() || j > 2147483639) {
                    throw new b("APK Signing Block size out of range: ".concat(String.valueOf(j)));
                }
                long j2 = (int) (8 + j);
                long j3 = jA - j2;
                if (j3 >= 0) {
                    ByteBuffer byteBufferA2 = qVar.a(j3, 8);
                    byteBufferA2.order(byteOrder);
                    long j4 = byteBufferA2.getLong(0);
                    if (j4 == j) {
                        return new a(j3, qVar.a(j3, j2));
                    }
                    StringBuilder sbV2 = android.support.v4.media.a.v(j4, "APK Signing Block sizes in header and footer do not match: ", " vs ");
                    sbV2.append(j);
                    throw new b(sbV2.toString());
                }
                throw new b("APK Signing Block offset out of range: ".concat(String.valueOf(j3)));
            }
            throw new b("No APK Signing Block before ZIP Central Directory");
        }
        throw new b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(jA)));
    }
}
