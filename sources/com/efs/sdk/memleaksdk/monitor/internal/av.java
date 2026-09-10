package com.efs.sdk.memleaksdk.monitor.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5073y40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3653hv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3156cG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4035mG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ld0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Set<String> f565a;
    public static final a b = new a(0 == true ? 1 : 0);
    private static final Map<String, br> c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b extends av {
        private InterfaceC4545s40 c;
        private final ay d;
        private final cm.a e;
        private final long f;
        private final int g;

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f566a = new a();

            public a() {
                super(1);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b invoke(b bVar) {
                AbstractC2995aW.q(bVar, "it");
                return bVar.j();
            }
        }

        /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.av$b$b, reason: collision with other inner class name */
        public static final class C0126b extends WG implements InterfaceC2766Sw {
            public C0126b() {
                super(1);
            }

            public final boolean a(c cVar) {
                AbstractC2995aW.q(cVar, "it");
                return cVar.c.f643a == b.this.a();
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((c) obj));
            }
        }

        public static final class c extends WG implements InterfaceC2766Sw {
            public c() {
                super(1);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final at invoke(ba.a.AbstractC0127a.C0128a.b bVar) {
                AbstractC2995aW.q(bVar, "fieldRecord");
                b bVar2 = b.this;
                return new at(bVar2, bVar2.d.a(b.this.a(), bVar), new aw(b.this.d, bVar.b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ay ayVar, cm.a aVar, long j, int i) {
            super((byte) 0);
            AbstractC2995aW.q(ayVar, "hprofGraph");
            AbstractC2995aW.q(aVar, "indexedObject");
            this.d = ayVar;
            this.e = aVar;
            this.f = j;
            this.g = i;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.av
        public int c() {
            return (int) this.e.b();
        }

        public final String f() {
            return this.d.d(a());
        }

        public final int g() {
            return this.e.b;
        }

        public final boolean h() {
            return this.d.c(this.e);
        }

        public final int i() {
            int iA = 0;
            for (ba.a.AbstractC0127a.C0128a.C0129a c0129a : o()) {
                iA += c0129a.b == 2 ? this.d.a() : ((Number) U5.q0(br.m, Integer.valueOf(c0129a.b))).intValue();
            }
            return iA;
        }

        public final b j() {
            long j = this.e.f642a;
            if (j == 0) {
                return null;
            }
            av avVarA = this.d.a(j);
            if (avVarA != null) {
                return (b) avVarA;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.efs.sdk.memleaksdk.monitor.shark.HeapObject.HeapClass");
        }

        public final InterfaceC4545s40 k() {
            if (this.c == null) {
                this.c = A40.I0(a.f566a, this);
            }
            InterfaceC4545s40 interfaceC4545s40 = this.c;
            AbstractC2995aW.n(interfaceC4545s40);
            return interfaceC4545s40;
        }

        public final InterfaceC4545s40 l() {
            return AbstractC5073y40.J0(this.d.e(), new C0126b());
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.av
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public ba.a.AbstractC0127a.C0128a b() {
            return this.d.a(a(), this.e);
        }

        public final List<ba.a.AbstractC0127a.C0128a.b> n() {
            return this.d.a(this.e);
        }

        public final List<ba.a.AbstractC0127a.C0128a.C0129a> o() {
            return this.d.b(this.e);
        }

        public final InterfaceC4545s40 p() {
            return AbstractC5073y40.M0(AbstractC2853Wf.c0(n()), new c());
        }

        public String toString() {
            return "class " + f();
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.av
        public long a() {
            return this.f;
        }

        public final at b(String str) {
            AbstractC2995aW.q(str, "fieldName");
            return a(str);
        }

        public final String a(ba.a.AbstractC0127a.C0128a.C0129a c0129a) {
            AbstractC2995aW.q(c0129a, "fieldRecord");
            return this.d.a(a(), c0129a);
        }

        public final at a(String str) {
            AbstractC2995aW.q(str, "fieldName");
            for (ba.a.AbstractC0127a.C0128a.b bVar : n()) {
                if (AbstractC2995aW.i(this.d.a(a(), bVar), str)) {
                    return new at(this, str, new aw(this.d, bVar.b));
                }
            }
            return null;
        }
    }

    public static final class d extends av {
        private final ay c;
        private final cm.c d;
        private final long e;
        private final int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ay ayVar, cm.c cVar, long j, int i) {
            super((byte) 0);
            AbstractC2995aW.q(ayVar, "hprofGraph");
            AbstractC2995aW.q(cVar, "indexedObject");
            this.c = ayVar;
            this.d = cVar;
            this.e = j;
            this.f = i;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.av
        public long a() {
            return this.e;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.av
        public int c() {
            return (int) this.d.b();
        }

        public final String f() {
            return this.c.d(this.d.f644a);
        }

        public final int g() {
            return this.c.b(a(), this.d);
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.av
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public ba.a.AbstractC0127a.c b() {
            return this.c.a(a(), this.d);
        }

        public String toString() {
            return "object array @" + a() + " of " + f();
        }
    }

    public static final class e extends av {
        private final ay c;
        private final cm.d d;
        private final long e;
        private final int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ay ayVar, cm.d dVar, long j, int i) {
            super((byte) 0);
            AbstractC2995aW.q(ayVar, "hprofGraph");
            AbstractC2995aW.q(dVar, "indexedObject");
            this.c = ayVar;
            this.d = dVar;
            this.e = j;
            this.f = i;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.av
        public long a() {
            return this.e;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.av
        public int c() {
            return (int) this.d.b();
        }

        public final int f() {
            return this.c.b(a(), this.d);
        }

        public final String g() {
            String strName = this.d.c().name();
            Locale locale = Locale.US;
            AbstractC2995aW.p(locale, "Locale.US");
            if (strName == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strName.toLowerCase(locale);
            AbstractC2995aW.p(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase.concat("[]");
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.av
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public ba.a.AbstractC0127a.d b() {
            return this.c.a(a(), this.d);
        }

        public String toString() {
            return "primitive array @" + a() + " of " + g();
        }
    }

    static {
        br[] brVarArrValues = br.values();
        ArrayList arrayList = new ArrayList(brVarArrValues.length);
        for (br brVar : brVarArrValues) {
            StringBuilder sb = new StringBuilder();
            String strName = brVar.name();
            Locale locale = Locale.US;
            AbstractC2995aW.p(locale, "Locale.US");
            if (strName == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strName.toLowerCase(locale);
            AbstractC2995aW.p(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            sb.append("[]");
            arrayList.add(new C4839vT(sb.toString(), brVar));
        }
        c = U5.A0(arrayList);
        f565a = AbstractC2995aW.q0(Boolean.class.getName(), Character.class.getName(), Float.class.getName(), Double.class.getName(), Byte.class.getName(), Short.class.getName(), Integer.class.getName(), Long.class.getName());
    }

    private av() {
    }

    public /* synthetic */ av(byte b2) {
        this();
    }

    public abstract long a();

    public abstract ba.a.AbstractC0127a b();

    public abstract int c();

    public final b d() {
        if (this instanceof b) {
            return (b) this;
        }
        return null;
    }

    public final c e() {
        if (this instanceof c) {
            return (c) this;
        }
        return null;
    }

    public static final class c extends av {
        public final cm.b c;
        private final ay d;
        private final long e;
        private final int f;

        public static final class a extends WG implements InterfaceC2766Sw {
            final /* synthetic */ InterfaceC3069bH b;
            final /* synthetic */ InterfaceC4035mG c;

            /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.av$c$a$1, reason: invalid class name */
            public static final class AnonymousClass1 extends WG implements InterfaceC2766Sw {
                final /* synthetic */ b b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(b bVar) {
                    super(1);
                    this.b = bVar;
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final at invoke(ba.a.AbstractC0127a.C0128a.C0129a c0129a) {
                    AbstractC2995aW.q(c0129a, "fieldRecord");
                    return new at(this.b, c.this.d.a(this.b.a(), c0129a), new aw(c.this.d, ((ci) a.this.b.getValue()).a(c0129a)));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3069bH interfaceC3069bH, InterfaceC4035mG interfaceC4035mG) {
                super(1);
                this.b = interfaceC3069bH;
                this.c = interfaceC4035mG;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC4545s40 invoke(b bVar) {
                AbstractC2995aW.q(bVar, "heapClass");
                return AbstractC5073y40.M0(AbstractC2853Wf.c0(bVar.o()), new AnonymousClass1(bVar));
            }
        }

        public static final class b extends WG implements InterfaceC2714Qw {
            public b() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ci invoke() {
                return c.this.d.a(c.this.b());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ay ayVar, cm.b bVar, long j, int i) {
            super((byte) 0);
            AbstractC2995aW.q(ayVar, "hprofGraph");
            AbstractC2995aW.q(bVar, "indexedObject");
            this.d = ayVar;
            this.c = bVar;
            this.e = j;
            this.f = i;
        }

        public final at a(InterfaceC3156cG interfaceC3156cG, String str) {
            AbstractC2995aW.q(interfaceC3156cG, "declaringClass");
            AbstractC2995aW.q(str, "fieldName");
            return a(AbstractC2995aW.K(interfaceC3156cG).getName(), str);
        }

        public final at b(InterfaceC3156cG interfaceC3156cG, String str) {
            AbstractC2995aW.q(interfaceC3156cG, "declaringClass");
            AbstractC2995aW.q(str, "fieldName");
            return a(interfaceC3156cG, str);
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.av
        public int c() {
            return (int) this.c.b();
        }

        public final boolean f() {
            return av.f565a.contains(h());
        }

        public au g() {
            return this.d;
        }

        public final String h() {
            return this.d.d(this.c.f643a);
        }

        public final b i() {
            av avVarA = this.d.a(this.c.f643a);
            if (avVarA != null) {
                return (b) avVarA;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.efs.sdk.memleaksdk.monitor.shark.HeapObject.HeapClass");
        }

        public final long j() {
            return this.c.f643a;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.av
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ba.a.AbstractC0127a.b b() {
            return this.d.a(a(), this.c);
        }

        public final InterfaceC4545s40 l() {
            Ld0 ld0M0 = AbstractC5073y40.M0(i().k(), new a(AbstractC2340Cl.I(new b()), null));
            return new C3653hv(ld0M0.f3363a, ld0M0.b);
        }

        public final String m() {
            char[] cArrCopyOfRange;
            aw awVar;
            aw awVar2;
            Integer numB = null;
            if (!AbstractC2995aW.i(h(), "java.lang.String")) {
                return null;
            }
            at atVarB = b("java.lang.String", "count");
            Integer numB2 = (atVarB == null || (awVar2 = atVarB.c) == null) ? null : awVar2.b();
            if (numB2 != null && numB2.intValue() == 0) {
                return "";
            }
            at atVarB2 = b("java.lang.String", AppMeasurementSdk.ConditionalUserProperty.VALUE);
            AbstractC2995aW.n(atVarB2);
            av avVarF = atVarB2.c.f();
            AbstractC2995aW.n(avVarF);
            ba.a.AbstractC0127a abstractC0127aB = avVarF.b();
            if (!(abstractC0127aB instanceof ba.a.AbstractC0127a.d.c)) {
                if (abstractC0127aB instanceof ba.a.AbstractC0127a.d.b) {
                    byte[] bArr = ((ba.a.AbstractC0127a.d.b) abstractC0127aB).f591a;
                    Charset charsetForName = Charset.forName(C.UTF8_NAME);
                    AbstractC2995aW.p(charsetForName, "Charset.forName(\"UTF-8\")");
                    return new String(bArr, charsetForName);
                }
                StringBuilder sb = new StringBuilder("'value' field ");
                at atVarB3 = b("java.lang.String", AppMeasurementSdk.ConditionalUserProperty.VALUE);
                AbstractC2995aW.n(atVarB3);
                sb.append(atVarB3.c);
                sb.append(" was expected to be either a char or byte array in string instance with id ");
                sb.append(a());
                throw new UnsupportedOperationException(sb.toString());
            }
            at atVarB4 = b("java.lang.String", TypedValues.CycleType.S_WAVE_OFFSET);
            if (atVarB4 != null && (awVar = atVarB4.c) != null) {
                numB = awVar.b();
            }
            if (numB2 == null || numB == null) {
                cArrCopyOfRange = ((ba.a.AbstractC0127a.d.c) abstractC0127aB).f592a;
            } else {
                int iIntValue = numB2.intValue() + numB.intValue();
                ba.a.AbstractC0127a.d.c cVar = (ba.a.AbstractC0127a.d.c) abstractC0127aB;
                char[] cArr = cVar.f592a;
                int length = iIntValue > cArr.length ? cArr.length : numB2.intValue() + numB.intValue();
                char[] cArr2 = cVar.f592a;
                int iIntValue2 = numB.intValue();
                AbstractC2995aW.q(cArr2, "<this>");
                AbstractC3375el.t(length, cArr2.length);
                cArrCopyOfRange = Arrays.copyOfRange(cArr2, iIntValue2, length);
                AbstractC2995aW.p(cArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            }
            return new String(cArrCopyOfRange);
        }

        public String toString() {
            return "instance @" + a() + " of " + h();
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.av
        public long a() {
            return this.e;
        }

        public final at b(String str, String str2) {
            AbstractC2995aW.q(str, "declaringClassName");
            AbstractC2995aW.q(str2, "fieldName");
            return a(str, str2);
        }

        public final boolean a(String str) {
            AbstractC2995aW.q(str, "className");
            Iterator it = i().k().iterator();
            while (it.hasNext()) {
                if (AbstractC2995aW.i(((b) it.next()).f(), str)) {
                    return true;
                }
            }
            return false;
        }

        public final at a(String str, String str2) {
            Object next;
            AbstractC2995aW.q(str, "declaringClassName");
            AbstractC2995aW.q(str2, "fieldName");
            Iterator it = l().iterator();
            while (it.hasNext()) {
                next = it.next();
                at atVar = (at) next;
                if (AbstractC2995aW.i(atVar.f564a.f(), str) && AbstractC2995aW.i(atVar.b, str2)) {
                    return (at) next;
                }
            }
            next = null;
            return (at) next;
        }
    }
}
