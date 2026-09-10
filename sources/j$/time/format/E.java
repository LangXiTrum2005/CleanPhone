package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC3540b;
import j$.time.chrono.InterfaceC3543e;
import j$.time.chrono.InterfaceC3548j;
import j$.time.temporal.TemporalAccessor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
final class E implements TemporalAccessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ZoneId f43077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j$.time.chrono.m f43078c;
    boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private F f43079e;
    private InterfaceC3540b f;
    private j$.time.k g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final HashMap f43076a = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    j$.time.q f43080h = j$.time.q.d;

    E() {
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (this.f43076a.containsKey(rVar)) {
            return true;
        }
        InterfaceC3540b interfaceC3540b = this.f;
        if (interfaceC3540b != null && interfaceC3540b.d(rVar)) {
            return true;
        }
        j$.time.k kVar = this.g;
        if (kVar == null || !kVar.d(rVar)) {
            return (rVar == null || (rVar instanceof j$.time.temporal.a) || !rVar.Y(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        Objects.requireNonNull(rVar, "field");
        Long l2 = (Long) this.f43076a.get(rVar);
        if (l2 != null) {
            return l2.longValue();
        }
        InterfaceC3540b interfaceC3540b = this.f;
        if (interfaceC3540b != null && interfaceC3540b.d(rVar)) {
            return this.f.e(rVar);
        }
        j$.time.k kVar = this.g;
        if (kVar != null && kVar.d(rVar)) {
            return this.g.e(rVar);
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.g()) {
            return this.f43077b;
        }
        if (tVar == j$.time.temporal.s.a()) {
            return this.f43078c;
        }
        if (tVar == j$.time.temporal.s.b()) {
            InterfaceC3540b interfaceC3540b = this.f;
            if (interfaceC3540b != null) {
                return j$.time.h.J(interfaceC3540b);
            }
            return null;
        }
        if (tVar == j$.time.temporal.s.c()) {
            return this.g;
        }
        if (tVar == j$.time.temporal.s.d()) {
            Long l2 = (Long) this.f43076a.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l2 != null) {
                return ZoneOffset.f0(l2.intValue());
            }
            ZoneId zoneId = this.f43077b;
            return zoneId instanceof ZoneOffset ? zoneId : tVar.i(this);
        }
        if (tVar == j$.time.temporal.s.f()) {
            return tVar.i(this);
        }
        if (tVar == j$.time.temporal.s.e()) {
            return null;
        }
        return tVar.i(this);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d7  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    final void r(F f) {
        long j;
        j$.time.temporal.r rVar;
        j$.time.temporal.r rVar2;
        HashMap map = this.f43076a;
        this.f43079e = f;
        s();
        A(this.f43078c.R(map, this.f43079e));
        x();
        if (map.size() > 0) {
            int i2 = 0;
            loop0: while (i2 < 50) {
                Iterator it = map.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    rVar2 = (j$.time.temporal.r) ((Map.Entry) it.next()).getKey();
                    TemporalAccessor temporalAccessorU = rVar2.U(map, this, this.f43079e);
                    if (temporalAccessorU != null) {
                        if (temporalAccessorU instanceof InterfaceC3548j) {
                            InterfaceC3548j interfaceC3548j = (InterfaceC3548j) temporalAccessorU;
                            ZoneId zoneId = this.f43077b;
                            if (zoneId == null) {
                                this.f43077b = interfaceC3548j.S();
                            } else if (!zoneId.equals(interfaceC3548j.S())) {
                                throw new j$.time.c("ChronoZonedDateTime must use the effective parsed zone: " + this.f43077b);
                            }
                            temporalAccessorU = interfaceC3548j.B();
                        }
                        if (temporalAccessorU instanceof InterfaceC3543e) {
                            InterfaceC3543e interfaceC3543e = (InterfaceC3543e) temporalAccessorU;
                            y(interfaceC3543e.n(), j$.time.q.d);
                            A(interfaceC3543e.o());
                            break;
                        } else if (temporalAccessorU instanceof InterfaceC3540b) {
                            A((InterfaceC3540b) temporalAccessorU);
                            break;
                        } else {
                            if (temporalAccessorU instanceof j$.time.k) {
                                y((j$.time.k) temporalAccessorU, j$.time.q.d);
                                break;
                            }
                            throw new j$.time.c("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        }
                    }
                } while (map.containsKey(rVar2));
                i2++;
            }
            if (i2 == 50) {
                throw new j$.time.c("One of the parsed fields has an incorrectly implemented resolve method");
            }
            if (i2 > 0) {
                s();
                A(this.f43078c.R(map, this.f43079e));
                x();
            }
        }
        long j2 = 1000000;
        if (this.g == null) {
            j$.time.temporal.a aVar = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar)) {
                long jLongValue = ((Long) map.remove(aVar)).longValue();
                j$.time.temporal.a aVar2 = j$.time.temporal.a.MICRO_OF_SECOND;
                if (map.containsKey(aVar2)) {
                    long jLongValue2 = (((Long) map.get(aVar2)).longValue() % 1000) + (jLongValue * 1000);
                    C(aVar, aVar2, Long.valueOf(jLongValue2));
                    map.remove(aVar2);
                    map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                } else {
                    map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                }
            } else {
                Object obj = j$.time.temporal.a.MICRO_OF_SECOND;
                if (map.containsKey(obj)) {
                    map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) map.remove(obj)).longValue() * 1000));
                }
            }
            Object obj2 = j$.time.temporal.a.HOUR_OF_DAY;
            Long l2 = (Long) map.get(obj2);
            if (l2 != null) {
                Object obj3 = j$.time.temporal.a.MINUTE_OF_HOUR;
                Long l3 = (Long) map.get(obj3);
                Object obj4 = j$.time.temporal.a.SECOND_OF_MINUTE;
                Long l4 = (Long) map.get(obj4);
                Object obj5 = j$.time.temporal.a.NANO_OF_SECOND;
                Long l5 = (Long) map.get(obj5);
                if ((l3 != null || (l4 == null && l5 == null)) && (l3 == null || l4 != null || l5 == null)) {
                    j = 0;
                    w(l2.longValue(), l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L, l5 != null ? l5.longValue() : 0L);
                    map.remove(obj2);
                    map.remove(obj3);
                    map.remove(obj4);
                    map.remove(obj5);
                } else {
                    j2 = 1000000;
                    j = 0;
                }
            } else {
                j = 0;
            }
            if (this.f43079e != F.LENIENT && map.size() > 0) {
                for (Map.Entry entry : map.entrySet()) {
                    rVar = (j$.time.temporal.r) entry.getKey();
                    if (!(rVar instanceof j$.time.temporal.a) && ((j$.time.temporal.a) rVar).d0()) {
                        ((j$.time.temporal.a) rVar).c0(((Long) entry.getValue()).longValue());
                    }
                }
            }
        } else {
            j = 0;
            if (this.f43079e != F.LENIENT) {
                while (r1.hasNext()) {
                    rVar = (j$.time.temporal.r) entry.getKey();
                    if (!(rVar instanceof j$.time.temporal.a)) {
                    }
                }
            }
        }
        InterfaceC3540b interfaceC3540b = this.f;
        if (interfaceC3540b != null) {
            q(interfaceC3540b);
        }
        j$.time.k kVar = this.g;
        if (kVar != null) {
            q(kVar);
            if (this.f != null && map.size() > 0) {
                q(this.f.L(this.g));
            }
        }
        if (this.f != null && this.g != null) {
            j$.time.q qVar = this.f43080h;
            qVar.getClass();
            j$.time.q qVar2 = j$.time.q.d;
            if (qVar != qVar2) {
                this.f = this.f.N(this.f43080h);
                this.f43080h = qVar2;
            }
        }
        if (this.g == null && (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS) || map.containsKey(j$.time.temporal.a.SECOND_OF_DAY) || map.containsKey(j$.time.temporal.a.SECOND_OF_MINUTE))) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
            if (map.containsKey(aVar3)) {
                long jLongValue3 = ((Long) map.get(aVar3)).longValue();
                map.put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                map.put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / j2));
            } else {
                map.put(aVar3, Long.valueOf(j));
                map.put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(j));
                map.put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(j));
            }
        }
        if (this.f == null || this.g == null) {
            return;
        }
        Long l6 = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
        if (l6 != null) {
            map.put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(this.f.L(this.g).H(ZoneOffset.f0(l6.intValue())).Q()));
        } else if (this.f43077b != null) {
            map.put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(this.f.L(this.g).H(this.f43077b).Q()));
        }
    }

    private void C(j$.time.temporal.r rVar, j$.time.temporal.a aVar, Long l2) {
        Long l3 = (Long) this.f43076a.put(aVar, l2);
        if (l3 == null || l3.longValue() == l2.longValue()) {
            return;
        }
        throw new j$.time.c("Conflict found: " + aVar + " " + l3 + " differs from " + aVar + " " + l2 + " while resolving  " + rVar);
    }

    private void s() {
        HashMap map = this.f43076a;
        if (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f43077b;
            if (zoneId != null) {
                t(zoneId);
                return;
            }
            Long l2 = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l2 != null) {
                t(ZoneOffset.f0(l2.intValue()));
            }
        }
    }

    private void t(ZoneId zoneId) {
        HashMap map = this.f43076a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        InterfaceC3548j interfaceC3548jY = this.f43078c.y(Instant.U(((Long) map.remove(aVar)).longValue()), zoneId);
        A(interfaceC3548jY.o());
        C(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(interfaceC3548jY.n().n0()));
    }

    private void A(InterfaceC3540b interfaceC3540b) {
        InterfaceC3540b interfaceC3540b2 = this.f;
        if (interfaceC3540b2 != null) {
            if (interfaceC3540b == null || interfaceC3540b2.equals(interfaceC3540b)) {
                return;
            }
            throw new j$.time.c("Conflict found: Fields resolved to two different dates: " + this.f + " " + interfaceC3540b);
        }
        if (interfaceC3540b != null) {
            if (!this.f43078c.equals(interfaceC3540b.f())) {
                throw new j$.time.c("ChronoLocalDate must use the effective parsed chronology: " + this.f43078c);
            }
            this.f = interfaceC3540b;
        }
    }

    private void x() {
        HashMap map = this.f43076a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(aVar)) {
            long jLongValue = ((Long) map.remove(aVar)).longValue();
            F f = this.f43079e;
            if (f == F.STRICT || (f == F.SMART && jLongValue != 0)) {
                aVar.c0(jLongValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            C(aVar, aVar2, Long.valueOf(jLongValue));
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(aVar3)) {
            long jLongValue2 = ((Long) map.remove(aVar3)).longValue();
            F f2 = this.f43079e;
            if (f2 == F.STRICT || (f2 == F.SMART && jLongValue2 != 0)) {
                aVar3.c0(jLongValue2);
            }
            C(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (map.containsKey(aVar4)) {
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (map.containsKey(aVar5)) {
                long jLongValue3 = ((Long) map.remove(aVar4)).longValue();
                long jLongValue4 = ((Long) map.remove(aVar5)).longValue();
                if (this.f43079e == F.LENIENT) {
                    C(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(jLongValue3, 12), jLongValue4)));
                } else {
                    aVar4.c0(jLongValue3);
                    aVar5.c0(jLongValue3);
                    C(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (map.containsKey(aVar6)) {
            long jLongValue5 = ((Long) map.remove(aVar6)).longValue();
            if (this.f43079e != F.LENIENT) {
                aVar6.c0(jLongValue5);
            }
            C(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            C(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            C(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            C(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (map.containsKey(aVar7)) {
            long jLongValue6 = ((Long) map.remove(aVar7)).longValue();
            if (this.f43079e != F.LENIENT) {
                aVar7.c0(jLongValue6);
            }
            C(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            C(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (map.containsKey(aVar8)) {
            long jLongValue7 = ((Long) map.remove(aVar8)).longValue();
            if (this.f43079e != F.LENIENT) {
                aVar8.c0(jLongValue7);
            }
            C(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            C(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (map.containsKey(aVar9)) {
            long jLongValue8 = ((Long) map.remove(aVar9)).longValue();
            if (this.f43079e != F.LENIENT) {
                aVar9.c0(jLongValue8);
            }
            C(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / com.smartdigimkt.o1.b.f37307P));
            C(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            C(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (map.containsKey(aVar10)) {
            long jLongValue9 = ((Long) map.remove(aVar10)).longValue();
            if (this.f43079e != F.LENIENT) {
                aVar10.c0(jLongValue9);
            }
            C(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            C(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (map.containsKey(aVar11)) {
            long jLongValue10 = ((Long) map.get(aVar11)).longValue();
            F f3 = this.f43079e;
            F f4 = F.LENIENT;
            if (f3 != f4) {
                aVar11.c0(jLongValue10);
            }
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (map.containsKey(aVar12)) {
                long jLongValue11 = ((Long) map.remove(aVar12)).longValue();
                if (this.f43079e != f4) {
                    aVar12.c0(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                C(aVar12, aVar11, Long.valueOf(jLongValue10));
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar13)) {
                long jLongValue12 = ((Long) map.remove(aVar13)).longValue();
                if (this.f43079e != f4) {
                    aVar13.c0(jLongValue12);
                }
                C(aVar13, aVar11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (map.containsKey(aVar14)) {
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (map.containsKey(aVar15)) {
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (map.containsKey(aVar16) && map.containsKey(aVar11)) {
                    w(((Long) map.remove(aVar14)).longValue(), ((Long) map.remove(aVar15)).longValue(), ((Long) map.remove(aVar16)).longValue(), ((Long) map.remove(aVar11)).longValue());
                }
            }
        }
    }

    private void w(long j, long j2, long j3, long j4) {
        if (this.f43079e == F.LENIENT) {
            long jAddExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j, 3600000000000L), Math.multiplyExact(j2, 60000000000L)), Math.multiplyExact(j3, 1000000000L)), j4);
            y(j$.time.k.e0(Math.floorMod(jAddExact, 86400000000000L)), j$.time.q.b((int) Math.floorDiv(jAddExact, 86400000000000L)));
            return;
        }
        int iB0 = j$.time.temporal.a.MINUTE_OF_HOUR.b0(j2);
        int iB1 = j$.time.temporal.a.NANO_OF_SECOND.b0(j4);
        if (this.f43079e == F.SMART && j == 24 && iB0 == 0 && j3 == 0 && iB1 == 0) {
            y(j$.time.k.g, j$.time.q.b(1));
        } else {
            y(j$.time.k.d0(j$.time.temporal.a.HOUR_OF_DAY.b0(j), iB0, j$.time.temporal.a.SECOND_OF_MINUTE.b0(j3), iB1), j$.time.q.d);
        }
    }

    private void y(j$.time.k kVar, j$.time.q qVar) {
        j$.time.k kVar2 = this.g;
        if (kVar2 != null) {
            if (!kVar2.equals(kVar)) {
                throw new j$.time.c("Conflict found: Fields resolved to different times: " + this.g + " " + kVar);
            }
            j$.time.q qVar2 = this.f43080h;
            qVar2.getClass();
            j$.time.q qVar3 = j$.time.q.d;
            if (qVar2 != qVar3 && qVar != qVar3 && !this.f43080h.equals(qVar)) {
                throw new j$.time.c("Conflict found: Fields resolved to different excess periods: " + this.f43080h + " " + qVar);
            }
            this.f43080h = qVar;
            return;
        }
        this.g = kVar;
        this.f43080h = qVar;
    }

    private void q(TemporalAccessor temporalAccessor) {
        Iterator it = this.f43076a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.r rVar = (j$.time.temporal.r) entry.getKey();
            if (temporalAccessor.d(rVar)) {
                try {
                    long jE = temporalAccessor.e(rVar);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jE != jLongValue) {
                        throw new j$.time.c("Conflict found: Field " + rVar + " " + jE + " differs from " + rVar + " " + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f43076a);
        sb.append(AbstractJsonLexerKt.COMMA);
        sb.append(this.f43078c);
        if (this.f43077b != null) {
            sb.append(AbstractJsonLexerKt.COMMA);
            sb.append(this.f43077b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            InterfaceC3540b interfaceC3540b = this.f;
            if (interfaceC3540b != null) {
                sb.append(interfaceC3540b);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }
}
