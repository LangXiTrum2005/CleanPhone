package sg.bigo.ads.controller.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.ne;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.common.u.a;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T extends sg.bigo.ads.common.u.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f48146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final sg.bigo.ads.common.g f48147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final sg.bigo.ads.controller.a.b f48148c;
    protected final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final String f48149e;
    protected final String f;
    protected final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f48150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f48151i;
    private final sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.b, sg.bigo.ads.common.u.c.d> j;

    /* JADX INFO: renamed from: sg.bigo.ads.controller.g.a$a, reason: collision with other inner class name */
    public static class C0861a extends sg.bigo.ads.common.u.b.b<sg.bigo.ads.controller.a.f> {
        private final long o;

        public C0861a(Context context, int i2, sg.bigo.ads.controller.a.f fVar, long j) {
            super(i2, fVar, context);
            this.o = j;
        }

        @Override // sg.bigo.ads.common.u.b.c
        public final void h() {
            super.h();
            sg.bigo.ads.controller.a.f fVar = (sg.bigo.ads.controller.a.f) this.j;
            HashMap map = new HashMap();
            map.put("pre_host", fVar.f());
            map.put("host_cfg_clear", Integer.valueOf(fVar.h() ? 1 : 0));
            map.put("host_src", fVar.i());
            sg.bigo.ads.controller.a.j jVarG = fVar.g();
            if (jVarG != null) {
                map.put("host_type", Integer.valueOf(jVarG.d()));
            }
            a(map);
            long j = this.o;
            if (j > 0) {
                fVar.a(j);
            }
        }
    }

    public interface b {
        void a(String str, Object obj);
    }

    public a(sg.bigo.ads.common.g gVar, sg.bigo.ads.controller.a.b bVar) {
        this(gVar, bVar, MBInterstitialActivity.WEB_LOAD_TIME);
    }

    public final int a() {
        return this.f48146a;
    }

    public abstract void a(int i2, int i3, String str);

    public abstract void a(String str, Map<String, Object> map);

    public abstract void a(b bVar);

    public final void b() {
        final JSONObject jSONObject;
        String str;
        Object objA;
        String str2;
        sg.bigo.ads.common.u.a aVarF = f();
        sg.bigo.ads.common.u.b.b c0861a = aVarF instanceof sg.bigo.ads.controller.a.f ? new C0861a(this.f48147b.af(), this.f48146a, (sg.bigo.ads.controller.a.f) aVarF, e()) : new sg.bigo.ads.common.u.b.b(this.f48146a, aVarF, this.f48147b.af());
        int i2 = 0;
        if (sg.bigo.ads.common.x.a.q() && !(this instanceof l)) {
            String str3 = "Missing CCPA consent";
            if (sg.bigo.ads.common.x.a.m() == 2) {
                str2 = "Missing GDPR consent";
                i2 = 1;
            } else {
                str2 = "Missing CCPA consent";
            }
            if (sg.bigo.ads.common.x.a.o() == 2) {
                i2++;
                str2 = "Missing LGPD consent";
            }
            if (sg.bigo.ads.common.x.a.n() == 2) {
                i2++;
            } else {
                str3 = str2;
            }
            if (sg.bigo.ads.common.x.a.p() == 2) {
                i2++;
                str3 = "Missing COPPA consent";
            }
            if (i2 > 1) {
                str3 = "Missing user consent";
            }
            this.j.a(c0861a, new sg.bigo.ads.common.u.h(800, str3));
            return;
        }
        try {
            jSONObject = new JSONObject();
            jSONObject.putOpt("app_key", sg.bigo.ads.common.utils.q.a(this.f48147b.a()));
            jSONObject.putOpt("pkg_name", sg.bigo.ads.common.utils.q.a(this.f48147b.b()));
            jSONObject.putOpt("pkg_ver", sg.bigo.ads.common.utils.q.a(this.f48147b.c()));
            jSONObject.putOpt("pkg_vc", Integer.valueOf(this.f48147b.d()));
            jSONObject.putOpt("pkg_ch", this.f48147b.e());
            jSONObject.putOpt(ne.f26256E, sg.bigo.ads.common.utils.q.a(this.f48147b.i()));
            jSONObject.putOpt("os_ver", sg.bigo.ads.common.utils.q.a(this.f48147b.j()));
            jSONObject.putOpt("os_lang", this.f48147b.k());
            jSONObject.putOpt("vendor", this.f48147b.l());
            jSONObject.putOpt("model", this.f48147b.m());
            jSONObject.putOpt("resolution", this.f48147b.o());
            jSONObject.putOpt("dpi", Integer.valueOf(this.f48147b.p()));
            jSONObject.putOpt("dpi_f", this.f48147b.q());
            jSONObject.putOpt("net", this.f48147b.r());
            jSONObject.putOpt("timezone", this.f48147b.s());
            jSONObject.putOpt("country", this.f48147b.t());
            jSONObject.putOpt("sdk_ver", sg.bigo.ads.common.utils.q.a(this.f48147b.y()));
            jSONObject.putOpt("sdk_vc", 50501);
            if (sg.bigo.ads.common.x.a.q()) {
                str = "consent_status";
                objA = Integer.valueOf(sg.bigo.ads.core.d.b.b());
            } else {
                jSONObject.putOpt("gaid", sg.bigo.ads.common.utils.q.a(this.f48147b.A()));
                jSONObject.putOpt("hw_id", sg.bigo.ads.common.utils.q.a(this.f48147b.G()));
                jSONObject.putOpt("fire_id", sg.bigo.ads.common.utils.q.a(this.f48147b.ae()));
                str = "af_id";
                objA = sg.bigo.ads.common.utils.q.a(this.f48147b.B());
            }
            jSONObject.putOpt(str, objA);
            jSONObject.putOpt("uid", sg.bigo.ads.common.utils.q.a(this.f48147b.C()));
            long jD = this.f48147b.D();
            jSONObject.putOpt("timestamp", Long.valueOf(jD));
            jSONObject.putOpt("abflags", this.f48147b.E());
            jSONObject.putOpt("batsa", Integer.valueOf(this.f48147b.ag() ? 1 : 0));
            jSONObject.putOpt("datasa", Integer.valueOf(this.f48147b.ah()));
            jSONObject.putOpt("root", Integer.valueOf(this.f48147b.ai() ? 1 : 0));
            String string = UUID.randomUUID().toString();
            jSONObject.putOpt("request_id", sg.bigo.ads.common.utils.q.a(string));
            jSONObject.putOpt("sdk_channel", this.f48147b.aa());
            jSONObject.putOpt("simulator_file", Integer.valueOf(this.f48147b.ab()));
            jSONObject.putOpt("sim_country", this.f);
            jSONObject.putOpt("system_country", this.g);
            jSONObject.putOpt("inst_src", this.f48147b.T());
            a(new b() { // from class: sg.bigo.ads.controller.g.a.3
                @Override // sg.bigo.ads.controller.g.a.b
                public final void a(String str4, Object obj) {
                    if (TextUtils.isEmpty(str4)) {
                        return;
                    }
                    try {
                        jSONObject.putOpt(str4, obj);
                    } catch (JSONException unused) {
                    }
                }
            });
            jSONObject.putOpt("sign", sg.bigo.ads.common.utils.m.a(a(jD, string).toString()));
        } catch (JSONException unused) {
            jSONObject = null;
        }
        boolean z2 = sg.bigo.ads.common.x.a.t() && j();
        sg.bigo.ads.common.u.f fVarD = d();
        c0861a.f47467b = jSONObject;
        c0861a.f47468c = null;
        c0861a.d = fVarD;
        c0861a.f47469e = z2;
        c0861a.f47472l = this.d;
        c0861a.a("SDK-Version-Code", BigoAdSdk.getSDKVersion());
        c0861a.k = c();
        sg.bigo.ads.common.u.b bVar = this.j;
        if (bVar == null) {
            bVar = sg.bigo.ads.common.u.b.d;
        }
        sg.bigo.ads.common.u.g.f47490a.a(c0861a, bVar);
    }

    public abstract sg.bigo.ads.common.n.e c();

    public sg.bigo.ads.common.u.f d() {
        return sg.bigo.ads.common.u.b.b.f47466a;
    }

    public long e() {
        return 0L;
    }

    public abstract T f();

    public boolean g() {
        return true;
    }

    public boolean h() {
        return true;
    }

    public abstract void i();

    public abstract boolean j();

    public a(sg.bigo.ads.common.g gVar, sg.bigo.ads.controller.a.b bVar, long j) {
        this.f48150h = new q();
        this.f48151i = null;
        this.j = new sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.b, sg.bigo.ads.common.u.c.d>() { // from class: sg.bigo.ads.controller.g.a.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f48153b = -1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f48154c = false;

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ sg.bigo.ads.common.u.c.c a(sg.bigo.ads.common.u.c.a aVar) {
                return new sg.bigo.ads.common.u.c.d(aVar);
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(sg.bigo.ads.common.u.b.c cVar) {
                super.a((sg.bigo.ads.common.u.b.b) cVar);
                this.f48153b = SystemClock.elapsedRealtime();
                this.f48154c = sg.bigo.ads.common.f.b.d();
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.c.c cVar2) {
                sg.bigo.ads.common.u.b.b bVar2 = (sg.bigo.ads.common.u.b.b) cVar;
                sg.bigo.ads.common.u.c.d dVar = (sg.bigo.ads.common.u.c.d) cVar2;
                String strA = dVar.a();
                if (bVar2.f) {
                    try {
                        if (TextUtils.isEmpty(strA) || !strA.trim().startsWith("{")) {
                            String strA2 = sg.bigo.ads.common.j.a.a(strA, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F", null);
                            if (TextUtils.isEmpty(strA2)) {
                                bVar2.g = 0;
                            } else {
                                try {
                                    bVar2.g = 1;
                                    strA = strA2;
                                } catch (Exception unused) {
                                    strA = strA2;
                                    bVar2.g = 2;
                                    try {
                                        bVar2.f47470h = dVar.a("logid");
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
                        } else {
                            bVar2.g = 3;
                        }
                        bVar2.f47470h = dVar.a("logid");
                    } catch (Exception unused3) {
                    }
                }
                a aVar = a.this;
                q qVar = aVar.f48150h;
                boolean z2 = bVar2.f47469e;
                boolean z3 = bVar2.f;
                int i2 = bVar2.g;
                String str = bVar2.f47470h;
                qVar.f47059a = z2;
                qVar.f47060b = z3;
                qVar.f47061c = i2;
                qVar.d = str;
                if (z2 && (!z3 || i2 != 1)) {
                    if (z3) {
                        aVar.i();
                    } else {
                        sg.bigo.ads.common.x.a.u();
                    }
                }
                sg.bigo.ads.controller.h.a aVar2 = new sg.bigo.ads.controller.h.a(strA);
                if (aVar2.a()) {
                    a.this.a(bVar2.g(), aVar2.f48167c, aVar2.d);
                } else {
                    a.this.a(bVar2.g(), 1005, aVar2.f48165a, aVar2.f48166b, aVar2.d);
                }
                a.a(a.this, sg.bigo.ads.common.utils.l.a(aVar2.d, "host_cfg"), bVar2.g(), this.f48153b);
                if (a.this.g() && a.this.f48151i == null) {
                    long jElapsedRealtime = this.f48153b > 0 ? SystemClock.elapsedRealtime() - this.f48153b : 0L;
                    T t = bVar2.j;
                    String strD = t.e() ? t.d() : "";
                    String strG = bVar2.g();
                    int i3 = dVar.f47484a.f47477a;
                    boolean z4 = this.f48154c;
                    int iE = bVar2.e();
                    a aVar3 = a.this;
                    String str2 = aVar3.f48149e;
                    String str3 = aVar3.f;
                    String str4 = aVar3.g;
                    sg.bigo.ads.common.g gVar2 = aVar3.f48147b;
                    sg.bigo.ads.core.d.b.a(strG, strD, true, jElapsedRealtime, i3, "", z4, iE, str2, str3, str4, gVar2 != null ? gVar2.X() : null, bVar2.f47469e, bVar2.f, bVar2.g, bVar2.f47470h);
                }
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.h hVar) {
                int i2;
                String str;
                sg.bigo.ads.common.u.b.b bVar2 = (sg.bigo.ads.common.u.b.b) cVar;
                if (a.this.g() && a.this.f48151i == null) {
                    long jElapsedRealtime = this.f48153b > 0 ? SystemClock.elapsedRealtime() - this.f48153b : 0L;
                    String strG = bVar2.g();
                    if (hVar.f47491a == 900) {
                        strG = "https://invalid.url";
                    }
                    String str2 = strG;
                    T t = bVar2.j;
                    String strD = t.e() ? t.d() : "";
                    int i3 = hVar.f47491a;
                    String message = hVar.getMessage();
                    boolean z2 = this.f48154c;
                    int iE = bVar2.e();
                    a aVar = a.this;
                    String str3 = aVar.f48149e;
                    String str4 = aVar.f;
                    String str5 = aVar.g;
                    sg.bigo.ads.common.g gVar2 = aVar.f48147b;
                    sg.bigo.ads.core.d.b.a(str2, strD, false, jElapsedRealtime, i3, message, z2, iE, str3, str4, str5, gVar2 == null ? null : gVar2.X(), bVar2.f47469e, bVar2.f, bVar2.g, bVar2.f47470h);
                }
                int i4 = hVar.f47491a;
                if (i4 == 701 || i4 == 702) {
                    i2 = IronSourceError.ERROR_LOAD_FAILED_TIMEOUT;
                    str = "Request timeout.";
                } else {
                    str = "(" + hVar.f47491a + ") " + hVar.getMessage();
                    i2 = IronSourceError.ERROR_RV_LOAD_DURING_LOAD;
                }
                a.this.a(bVar2.g(), i2, hVar.f47491a, str, null);
                a.this.a(bVar2.g());
            }
        };
        this.f48146a = sg.bigo.ads.common.y.a.a();
        this.f48147b = gVar;
        this.f48148c = bVar;
        this.d = j;
        this.f48149e = gVar.Q();
        this.f = gVar.R();
        this.g = gVar.S();
    }

    public StringBuilder a(long j, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(sg.bigo.ads.common.utils.q.a(this.f48147b.a()));
        sb.append(",");
        sb.append(sg.bigo.ads.common.utils.q.a(this.f48147b.b()));
        sb.append(",");
        sb.append(sg.bigo.ads.common.utils.q.a(this.f48147b.c()));
        sb.append(",");
        sb.append(this.f48147b.d());
        sb.append(",");
        sb.append(sg.bigo.ads.common.utils.q.a(this.f48147b.i()));
        sb.append(",");
        sb.append(sg.bigo.ads.common.utils.q.a(this.f48147b.j()));
        sb.append(",");
        sb.append(sg.bigo.ads.common.utils.q.a(this.f48147b.y()));
        sb.append(",50501,");
        sb.append(j);
        if (sg.bigo.ads.common.x.a.q()) {
            sb.append(",,,");
            sb.append(sg.bigo.ads.common.utils.q.a(this.f48147b.C()));
            sb.append(",");
        } else {
            sb.append(",");
            sb.append(sg.bigo.ads.common.utils.q.a(this.f48147b.A()));
            sb.append(",");
            sb.append(sg.bigo.ads.common.utils.q.a(this.f48147b.B()));
            sb.append(",");
            sb.append(sg.bigo.ads.common.utils.q.a(this.f48147b.C()));
            sb.append(",");
            sb.append(sg.bigo.ads.common.utils.q.a(this.f48147b.G()));
        }
        sb.append(",");
        sb.append(sg.bigo.ads.common.utils.q.a(str));
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f48148c != null && h() && this.f48151i == null) {
            this.f48148c.a(100L, str);
        }
    }

    public void a(String str, int i2, int i3, String str2, Map<String, Object> map) {
        a(i2, i3, str2);
    }

    public void a(String str, String str2, Map<String, Object> map) {
        a(str2, map);
    }

    public static /* synthetic */ void a(a aVar, final String str, final String str2, final long j) {
        if (aVar.f48148c != null) {
            if (TextUtils.isEmpty(str)) {
                aVar.a(str2);
            } else {
                sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.g.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a aVar2 = a.this;
                        sg.bigo.ads.controller.a.b bVar = aVar2.f48148c;
                        if (bVar == null || bVar.a(str, str2, j, aVar2.g()).d == 0) {
                            return;
                        }
                        a.this.a(str2);
                    }
                });
            }
        }
    }
}
