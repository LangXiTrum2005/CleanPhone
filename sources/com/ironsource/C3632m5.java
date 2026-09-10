package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Locale;
import org.json.JSONObject;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import p002kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.ironsource.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3632m5 implements InterfaceC3840y7, InterfaceC3840y7.a {
    private JSONObject a = new JSONObject();
    private final patroclinal.taiyuan b = p002kotlin.saneness.saneness(new f());
    private final patroclinal.taiyuan c = p002kotlin.saneness.saneness(new i());
    private final patroclinal.taiyuan d = p002kotlin.saneness.saneness(new d());
    private final patroclinal.taiyuan e = p002kotlin.saneness.saneness(new c());
    private final patroclinal.taiyuan f = p002kotlin.saneness.saneness(new b());
    private final patroclinal.taiyuan g = p002kotlin.saneness.saneness(new h());
    private final patroclinal.taiyuan h = p002kotlin.saneness.saneness(new e());
    private final patroclinal.taiyuan i = p002kotlin.saneness.saneness(new g());
    private final patroclinal.taiyuan j = p002kotlin.saneness.saneness(new a());

    /* JADX INFO: renamed from: com.ironsource.m5$a */
    public static final class a extends Lambda implements Function0<Boolean> {
        public a() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C3632m5.this.M().optBoolean(C3686p5.n, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$b */
    public static final class b extends Lambda implements Function0<Boolean> {
        public b() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C3632m5.this.M().optBoolean(C3686p5.r, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$c */
    public static final class c extends Lambda implements Function0<Boolean> {
        public c() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C3632m5.this.M().optBoolean(C3686p5.v, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$d */
    public static final class d extends Lambda implements Function0<Boolean> {
        public d() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C3632m5.this.M().optBoolean(C3686p5.u, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$e */
    public static final class e extends Lambda implements Function0<Boolean> {
        public e() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C3632m5.this.M().optBoolean(C3686p5.p, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$f */
    public static final class f extends Lambda implements Function0<Boolean> {
        public f() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C3632m5.this.M().optBoolean(C3686p5.s, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$g */
    public static final class g extends Lambda implements Function0<Boolean> {
        public g() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C3632m5.this.M().optBoolean(C3686p5.o, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$h */
    public static final class h extends Lambda implements Function0<Boolean> {
        public h() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C3632m5.this.M().optBoolean(C3686p5.q, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$i */
    public static final class i extends Lambda implements Function0<Boolean> {
        public i() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C3632m5.this.M().optBoolean(C3686p5.t, false));
        }
    }

    private final boolean D() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    private final boolean E() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    private final boolean F() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    private final boolean G() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    private final boolean H() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    private final boolean I() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    private final boolean J() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    private final boolean K() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    private final boolean L() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject M() {
        JSONObject jSONObjectOptJSONObject = this.a.optJSONObject(C3650n5.a);
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean A() {
        return K();
    }

    @Override // com.ironsource.InterfaceC3668o5
    public long B() {
        String strOptString = M().optString(C3686p5.d);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(CTRL_LOAD_TIME)");
        Long lGraveside = StringsKt.graveside(strOptString);
        if (lGraveside != null) {
            return lGraveside.longValue();
        }
        return 50L;
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean C() {
        return D();
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean b() {
        return E();
    }

    @Override // com.ironsource.InterfaceC3668o5
    public int c() {
        String strOptString = M().optString(C3686p5.c);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(CTRL_LOAD_ATTEMPTS)");
        Integer intOrNull = StringsKt.toIntOrNull(strOptString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 3;
    }

    @Override // com.ironsource.InterfaceC3840y7
    public JSONObject config() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean d() {
        return M().optBoolean(C3686p5.h, true);
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean e() {
        return M().optBoolean(C3686p5.y, false);
    }

    @Override // com.ironsource.InterfaceC3668o5
    public long f() {
        String strOptString = M().optString(C3686p5.e);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        Long lGraveside = StringsKt.graveside(strOptString);
        if (lGraveside != null) {
            return lGraveside.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean g() {
        return M().optBoolean(C3686p5.C, false);
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean h() {
        return M().optBoolean(C3686p5.z, false);
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean i() {
        return M().optBoolean(C3686p5.i, true);
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean j() {
        return G();
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean k() {
        return M().optBoolean(C3686p5.g, false);
    }

    @Override // com.ironsource.InterfaceC3668o5
    public long l() {
        String strOptString = M().optString(C3686p5.f);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        Long lGraveside = StringsKt.graveside(strOptString);
        if (lGraveside != null) {
            return lGraveside.longValue();
        }
        return 2000L;
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean m() {
        return I();
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean n() {
        return F();
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean o() {
        return L();
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean p() {
        return J();
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean q() {
        return M().optBoolean(C3686p5.l, false);
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean r() {
        return M().optBoolean(C3686p5.A, false);
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean s() {
        return M().optBoolean(C3686p5.w, false);
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean t() {
        return M().optBoolean(C3686p5.j, false);
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean u() {
        String strOptString = M().optString(C3686p5.a);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(IS_EP_CONFIG_ENABLED)");
        String lowerCase = strOptString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return Intrinsics.wireman(lowerCase, com.ironsource.mediationsdk.metadata.a.g);
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean v() {
        return M().optBoolean(C3686p5.B, true);
    }

    @Override // com.ironsource.InterfaceC3668o5
    public int w() {
        String strOptString = M().optString(C3686p5.b);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        Integer intOrNull = StringsKt.toIntOrNull(strOptString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean x() {
        return M().optBoolean(C3686p5.k, false);
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean y() {
        return M().optBoolean(C3686p5.m, false);
    }

    @Override // com.ironsource.InterfaceC3668o5
    public boolean z() {
        return H();
    }

    @Override // com.ironsource.InterfaceC3840y7.a
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.a;
        }
        this.a = jSONObject;
        IronLog.INTERNAL.verbose("setEpConfig: " + jSONObject);
    }

    @Override // com.ironsource.InterfaceC3668o5
    public String a() {
        String strOptString = M().optString("controllerUrl", "");
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(CONTROLLER_URL, \"\")");
        return strOptString;
    }
}
