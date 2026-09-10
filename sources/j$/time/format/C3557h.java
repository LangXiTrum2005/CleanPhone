package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: j$.time.format.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3557h implements InterfaceC3555f {
    @Override // j$.time.format.InterfaceC3555f
    public final boolean p(z zVar, StringBuilder sb) {
        boolean z2;
        Long lE = zVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor temporalAccessorD = zVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = temporalAccessorD.d(aVar) ? Long.valueOf(zVar.d().e(aVar)) : null;
        int i2 = 0;
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        int iB0 = aVar.b0(lValueOf != null ? lValueOf.longValue() : 0L);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jFloorDiv = Math.floorDiv(j, 315569520000L) + 1;
            LocalDateTime localDateTimeF0 = LocalDateTime.f0(Math.floorMod(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jFloorDiv > 0) {
                sb.append('+');
                sb.append(jFloorDiv);
            }
            sb.append(localDateTimeF0);
            if (localDateTimeF0.U() == 0) {
                sb.append(":00");
            }
            z2 = true;
        } else {
            long j2 = jLongValue + 62167219200L;
            z2 = true;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime localDateTimeF1 = LocalDateTime.f0(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeF1);
            if (localDateTimeF1.U() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (localDateTimeF1.V() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iB0 > 0) {
            sb.append('.');
            int i3 = 100000000;
            while (true) {
                if (iB0 <= 0 && i2 % 3 == 0 && i2 >= -2) {
                    break;
                }
                int i4 = iB0 / i3;
                sb.append((char) (i4 + 48));
                iB0 -= i4 * i3;
                i3 /= 10;
                i2++;
            }
        }
        sb.append('Z');
        return z2;
    }

    @Override // j$.time.format.InterfaceC3555f
    public final int r(w wVar, CharSequence charSequence, int i2) {
        int i3;
        int i4;
        v vVar = new v();
        vVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
        vVar.e('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        vVar.o(aVar, 2);
        vVar.e(AbstractJsonLexerKt.COLON);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        vVar.o(aVar2, 2);
        vVar.e(AbstractJsonLexerKt.COLON);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        vVar.o(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        int i5 = 0;
        vVar.b(aVar4, 0, 9, true);
        vVar.e('Z');
        C3554e c3554eG = vVar.x().g();
        w wVarD = wVar.d();
        int iR = c3554eG.r(wVarD, charSequence, i2);
        if (iR < 0) {
            return iR;
        }
        long jLongValue = wVarD.j(j$.time.temporal.a.YEAR).longValue();
        int iIntValue = wVarD.j(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int iIntValue2 = wVarD.j(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int iIntValue3 = wVarD.j(aVar).intValue();
        int iIntValue4 = wVarD.j(aVar2).intValue();
        Long lJ = wVarD.j(aVar3);
        Long lJ2 = wVarD.j(aVar4);
        int iIntValue5 = lJ != null ? lJ.intValue() : 0;
        int iIntValue6 = lJ2 != null ? lJ2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            i3 = 0;
            i4 = iIntValue5;
            i5 = 1;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            wVar.p();
            i3 = iIntValue3;
            i4 = 59;
        } else {
            i3 = iIntValue3;
            i4 = iIntValue5;
        }
        try {
            return wVar.o(aVar4, iIntValue6, i2, wVar.o(j$.time.temporal.a.INSTANT_SECONDS, LocalDateTime.d0(((int) jLongValue) % 10000, iIntValue, iIntValue2, i3, iIntValue4, i4).h0(i5).a0(ZoneOffset.UTC) + Math.multiplyExact(jLongValue / 10000, 315569520000L), i2, iR));
        } catch (RuntimeException unused) {
            return ~i2;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
