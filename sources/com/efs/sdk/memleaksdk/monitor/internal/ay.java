package com.efs.sdk.memleaksdk.monitor.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5073y40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ZX;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ay implements am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f574a = new a(0);
    private static int i = PathInterpolatorCompat.MAX_NUM_POINTS;
    private final aq b;
    private final cn<Long, ba.a.AbstractC0127a> c;
    private final av.b d;
    private Map<Long, ba.a.AbstractC0127a.C0128a> e;
    private final ax f;
    private final bt g;
    private final cj h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final am a(File file, bs bsVar, Set<? extends bc> set) {
            AbstractC2995aW.q(file, "$this$openHeapGraph");
            AbstractC2995aW.q(set, "indexedGcRootTypes");
            return a(new ao(file), bsVar, set);
        }

        public final am a(an anVar, bs bsVar, Set<? extends bc> set) throws IllegalAccessException, IOException, InvocationTargetException {
            AbstractC2995aW.q(anVar, "$this$openHeapGraph");
            AbstractC2995aW.q(set, "indexedGcRootTypes");
            n nVarA = anVar.a();
            try {
                ax axVarA = ax.d.a(nVarA);
                AbstractC3375el.n(nVarA, null);
                return az.f583a.a(anVar, axVarA, bsVar, set).a();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3375el.n(nVarA, th);
                    throw th2;
                }
            }
        }
    }

    public static final class b extends WG implements InterfaceC2766Sw {
        final /* synthetic */ ZX b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ZX zx) {
            super(1);
            this.b = zx;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final av.c invoke(db<cm.b> dbVar) {
            AbstractC2995aW.q(dbVar, "it");
            long j = dbVar.f677a;
            cm.b bVar = dbVar.b;
            ay ayVar = ay.this;
            ZX zx = this.b;
            int i = zx.f4074a;
            zx.f4074a = i + 1;
            return new av.c(ayVar, bVar, j, i);
        }
    }

    public static final class c extends WG implements InterfaceC2766Sw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f576a = new c();

        public c() {
            super(1);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ba.a.AbstractC0127a.C0128a invoke(bb bbVar) {
            AbstractC2995aW.q(bbVar, "$receiver");
            return bbVar.r();
        }
    }

    public static final class d extends WG implements InterfaceC2766Sw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f577a = new d();

        public d() {
            super(1);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ba.a.AbstractC0127a.b invoke(bb bbVar) {
            AbstractC2995aW.q(bbVar, "$receiver");
            return bbVar.q();
        }
    }

    public static final class e extends WG implements InterfaceC2766Sw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f578a = new e();

        public e() {
            super(1);
        }

        public final int a(bb bbVar) {
            AbstractC2995aW.q(bbVar, "$receiver");
            return bbVar.G();
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(a((bb) obj));
        }
    }

    public static final class f extends WG implements InterfaceC2766Sw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f579a = new f();

        public f() {
            super(1);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ba.a.AbstractC0127a.c invoke(bb bbVar) {
            AbstractC2995aW.q(bbVar, "$receiver");
            return bbVar.t();
        }
    }

    public static final class g extends WG implements InterfaceC2766Sw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2766Sw f580a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC2766Sw interfaceC2766Sw) {
            super(1);
            this.f580a = interfaceC2766Sw;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lcom/efs/sdk/memleaksdk/monitor/internal/bb;)TT; */
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ba.a.AbstractC0127a invoke(bb bbVar) {
            AbstractC2995aW.q(bbVar, "$receiver");
            return (ba.a.AbstractC0127a) this.f580a.invoke(bbVar);
        }
    }

    public static final class h extends WG implements InterfaceC2766Sw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f581a = new h();

        public h() {
            super(1);
        }

        public final int a(bb bbVar) {
            AbstractC2995aW.q(bbVar, "$receiver");
            return bbVar.G();
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(a((bb) obj));
        }
    }

    public static final class i extends WG implements InterfaceC2766Sw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f582a = new i();

        public i() {
            super(1);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ba.a.AbstractC0127a.d invoke(bb bbVar) {
            AbstractC2995aW.q(bbVar, "$receiver");
            return bbVar.s();
        }
    }

    public ay(ax axVar, bt btVar, cj cjVar) {
        AbstractC2995aW.q(axVar, "header");
        AbstractC2995aW.q(btVar, "reader");
        AbstractC2995aW.q(cjVar, "index");
        this.f = axVar;
        this.g = btVar;
        this.h = cjVar;
        this.b = new aq();
        this.c = new cn<>(i);
        this.d = a("java.lang.Object");
        this.e = new LinkedHashMap();
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.au
    public int a() {
        return this.f.c;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.au
    public aq b() {
        return this.b;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.au
    public int c() {
        return this.h.b.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.g.close();
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.au
    public List<ap> d() {
        return this.h.c;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.au
    public InterfaceC4545s40 e() {
        ZX zx = new ZX();
        zx.f4074a = f();
        return AbstractC5073y40.M0(this.h.a(), new b(zx));
    }

    public int f() {
        return this.h.f638a.c;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.au
    public av b(long j) {
        av.b bVar = this.d;
        if (bVar != null && j == bVar.a()) {
            return this.d;
        }
        cy<cm> cyVarB = this.h.b(j);
        if (cyVarB != null) {
            return a(cyVarB.f671a, cyVarB.b, j);
        }
        return null;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.au
    public av a(long j) {
        av avVarB = b(j);
        if (avVarB != null) {
            return avVarB;
        }
        throw new IllegalArgumentException(AbstractC5044xl.i("Object id ", j, " not found in heap dump."));
    }

    public final String d(long j) {
        String strA = this.h.a(j);
        if (this.f.b == bd.ANDROID || !AbstractC3089ba0.O0(strA, '[')) {
            return strA;
        }
        int iW0 = AbstractC3089ba0.w0(strA, '[', 0, 6);
        int i2 = iW0 + 1;
        String strF0 = AbstractC3089ba0.F0("[]", i2);
        char cCharAt = strA.charAt(i2);
        if (cCharAt == 'F') {
            return AbstractC3888ke0.i(TypedValues.Custom.S_FLOAT, strF0);
        }
        if (cCharAt == 'L') {
            StringBuilder sb = new StringBuilder();
            String strSubstring = strA.substring(iW0 + 2, strA.length() - 1);
            AbstractC2995aW.p(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(strSubstring);
            sb.append(strF0);
            return sb.toString();
        }
        if (cCharAt == 'S') {
            return AbstractC3888ke0.i("short", strF0);
        }
        if (cCharAt == 'Z') {
            return AbstractC3888ke0.i(TypedValues.Custom.S_BOOLEAN, strF0);
        }
        if (cCharAt == 'I') {
            return AbstractC3888ke0.i("int", strF0);
        }
        if (cCharAt != 'J') {
            switch (cCharAt) {
                case 'B':
                    return AbstractC3888ke0.i("byte", strF0);
                case 'C':
                    return AbstractC3888ke0.i("char", strF0);
                case Input.Keys.GRAVE /* 68 */:
                    return AbstractC3888ke0.i("double", strF0);
                default:
                    throw new IllegalStateException(("Unexpected type char " + cCharAt).toString());
            }
        }
        return AbstractC3888ke0.i("long", strF0);
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.au
    public boolean c(long j) {
        return this.h.c(j);
    }

    public final boolean c(cm.a aVar) {
        AbstractC2995aW.q(aVar, "indexedClass");
        return this.h.d.c(aVar);
    }

    public final List<ba.a.AbstractC0127a.C0128a.C0129a> b(cm.a aVar) {
        AbstractC2995aW.q(aVar, "indexedClass");
        return this.h.d.b(aVar);
    }

    public final int b(long j, cm.c cVar) {
        int iIntValue;
        int iA;
        AbstractC2995aW.q(cVar, "indexedObject");
        ba.a.AbstractC0127a.c cVar2 = (ba.a.AbstractC0127a.c) this.c.a(Long.valueOf(j));
        if (cVar2 != null) {
            iIntValue = cVar2.f589a.length;
            iA = a();
        } else {
            long jA = cVar.a() + ((long) a());
            int i2 = br.INT.j;
            iIntValue = ((Number) this.g.a(jA + ((long) i2), i2, e.f578a)).intValue();
            iA = a();
        }
        return iA * iIntValue;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    @Override // com.efs.sdk.memleaksdk.monitor.internal.au
    public av.b a(String str) {
        int iS0;
        Object objR;
        AbstractC2995aW.q(str, "className");
        if (this.f.b != bd.ANDROID && (iS0 = AbstractC3089ba0.s0(str, '[', 0, false, 6)) != -1) {
            int length = (str.length() - iS0) / 2;
            String strSubstring = str.substring(0, iS0);
            AbstractC2995aW.p(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC3089ba0.F0("[", length));
            switch (strSubstring) {
                case "double":
                    objR = 'D';
                    break;
                case "int":
                    objR = 'I';
                    break;
                case "byte":
                    objR = 'B';
                    break;
                case "char":
                    objR = 'C';
                    break;
                case "long":
                    objR = 'J';
                    break;
                case "float":
                    objR = 'F';
                    break;
                case "short":
                    objR = 'S';
                    break;
                default:
                    objR = AbstractC3950lJ.r("L", strSubstring, ';');
                    break;
            }
            sb.append(objR);
            str = sb.toString();
        }
        Long lA = this.h.a(str);
        if (lA == null) {
            return null;
        }
        av avVarA = a(lA.longValue());
        if (avVarA != null) {
            return (av.b) avVarA;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.efs.sdk.memleaksdk.monitor.shark.HeapObject.HeapClass");
    }

    public final int b(long j, cm.d dVar) {
        int length;
        int i2;
        AbstractC2995aW.q(dVar, "indexedObject");
        ba.a.AbstractC0127a.d dVar2 = (ba.a.AbstractC0127a.d) this.c.a(Long.valueOf(j));
        if (dVar2 != null) {
            if (dVar2 instanceof ba.a.AbstractC0127a.d.C0130a) {
                length = ((ba.a.AbstractC0127a.d.C0130a) dVar2).f590a.length;
                i2 = br.BOOLEAN.j;
            } else if (dVar2 instanceof ba.a.AbstractC0127a.d.c) {
                length = ((ba.a.AbstractC0127a.d.c) dVar2).f592a.length;
                i2 = br.CHAR.j;
            } else if (dVar2 instanceof ba.a.AbstractC0127a.d.e) {
                length = ((ba.a.AbstractC0127a.d.e) dVar2).f594a.length;
                i2 = br.FLOAT.j;
            } else if (dVar2 instanceof ba.a.AbstractC0127a.d.C0131d) {
                length = ((ba.a.AbstractC0127a.d.C0131d) dVar2).f593a.length;
                i2 = br.DOUBLE.j;
            } else if (dVar2 instanceof ba.a.AbstractC0127a.d.b) {
                length = ((ba.a.AbstractC0127a.d.b) dVar2).f591a.length;
                i2 = br.BYTE.j;
            } else if (dVar2 instanceof ba.a.AbstractC0127a.d.h) {
                length = ((ba.a.AbstractC0127a.d.h) dVar2).f597a.length;
                i2 = br.SHORT.j;
            } else if (dVar2 instanceof ba.a.AbstractC0127a.d.f) {
                length = ((ba.a.AbstractC0127a.d.f) dVar2).f595a.length;
                i2 = br.INT.j;
            } else if (dVar2 instanceof ba.a.AbstractC0127a.d.g) {
                length = ((ba.a.AbstractC0127a.d.g) dVar2).f596a.length;
                i2 = br.LONG.j;
            } else {
                throw new C3770jF(7, 0);
            }
            return length * i2;
        }
        long jA = dVar.a() + ((long) a());
        long j2 = br.INT.j;
        return ((Number) this.g.a(jA + j2, j2, h.f581a)).intValue() * dVar.c().j;
    }

    public final List<ba.a.AbstractC0127a.C0128a.b> a(cm.a aVar) {
        AbstractC2995aW.q(aVar, "indexedClass");
        return this.h.d.a(aVar);
    }

    public final String a(long j, ba.a.AbstractC0127a.C0128a.C0129a c0129a) {
        AbstractC2995aW.q(c0129a, "fieldRecord");
        return this.h.a(j, c0129a.f586a);
    }

    public final String a(long j, ba.a.AbstractC0127a.C0128a.b bVar) {
        AbstractC2995aW.q(bVar, "fieldRecord");
        return this.h.a(j, bVar.f587a);
    }

    public final ci a(ba.a.AbstractC0127a.b bVar) {
        AbstractC2995aW.q(bVar, "record");
        return new ci(bVar, a());
    }

    public final ba.a.AbstractC0127a.c a(long j, cm.c cVar) {
        AbstractC2995aW.q(cVar, "indexedObject");
        return (ba.a.AbstractC0127a.c) a(j, cVar, f.f579a);
    }

    public final ba.a.AbstractC0127a.d a(long j, cm.d dVar) {
        AbstractC2995aW.q(dVar, "indexedObject");
        return (ba.a.AbstractC0127a.d) a(j, dVar, i.f582a);
    }

    public final ba.a.AbstractC0127a.C0128a a(long j, cm.a aVar) {
        AbstractC2995aW.q(aVar, "indexedObject");
        ba.a.AbstractC0127a.C0128a c0128a = this.e.get(Long.valueOf(j));
        if (c0128a != null) {
            return c0128a;
        }
        ba.a.AbstractC0127a.C0128a c0128a2 = (ba.a.AbstractC0127a.C0128a) a(j, aVar, c.f576a);
        this.e.put(Long.valueOf(j), c0128a2);
        return c0128a2;
    }

    public final ba.a.AbstractC0127a.b a(long j, cm.b bVar) {
        AbstractC2995aW.q(bVar, "indexedObject");
        return (ba.a.AbstractC0127a.b) a(j, bVar, d.f577a);
    }

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
    private final <T extends ba.a.AbstractC0127a> T a(long j, cm cmVar, InterfaceC2766Sw interfaceC2766Sw) {
        T t = (T) this.c.a(Long.valueOf(j));
        if (t != null) {
            return t;
        }
        T t2 = (T) this.g.a(cmVar.a(), cmVar.b(), new g(interfaceC2766Sw));
        this.c.a(Long.valueOf(j), t2);
        return t2;
    }

    private final av a(int i2, cm cmVar, long j) {
        if (cmVar instanceof cm.a) {
            return new av.b(this, (cm.a) cmVar, j, i2);
        }
        if (cmVar instanceof cm.b) {
            return new av.c(this, (cm.b) cmVar, j, i2);
        }
        if (cmVar instanceof cm.c) {
            return new av.d(this, (cm.c) cmVar, j, i2);
        }
        if (cmVar instanceof cm.d) {
            return new av.e(this, (cm.d) cmVar, j, i2);
        }
        throw new C3770jF(7, 0);
    }
}
