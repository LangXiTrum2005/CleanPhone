package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.ironsource.C0375hc;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o6 extends k5 implements r0.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f8902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r0.e f8903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f6.b f8904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private z4 f8905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private z4 f8906k;
    private String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected r0.b f8907m;

    public o6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
        this(aVar, lVar, false);
    }

    public abstract void a(String str, int i10, String str2, Object obj);

    public abstract void a(String str, Object obj, int i10);

    @Override // java.lang.Runnable
    public void run() {
        r0 r0VarX = b().x();
        if (!b().G0() && !b().D0()) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.f8902g.f(), -22, null, null);
            return;
        }
        e();
        if (!StringUtils.isValidString(this.f8902g.f()) || this.f8902g.f().length() < 4) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Task has an invalid or null request endpoint.");
            }
            a(this.f8902g.f(), AppLovinErrorCodes.INVALID_URL, null, null);
        } else {
            if (TextUtils.isEmpty(this.f8902g.h())) {
                this.f8902g.c(this.f8902g.b() != null ? C0375hc.f28789b : C0375hc.f28788a);
            }
            r0VarX.a(this.f8902g, this.f8907m, this.f8903h);
        }
    }

    public o6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, boolean z10) {
        super("TaskRepeatRequest", lVar, z10);
        this.f8904i = f6.b.OTHER;
        if (aVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        a(aVar.f());
        this.f8902g = aVar;
        this.f8907m = new r0.b();
        this.f8903h = new a(lVar);
    }

    private void e() {
        if (((Boolean) this.f8297a.a(z4.f10298z3)).booleanValue() && b().x().a(StringUtils.getHostAndPath(this.f8902g.f()))) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.d(this.f8298b, "Swapping primary endpoint with backup endpoint " + this.f8902g.a());
            }
            String strF = this.f8902g.f();
            com.applovin.impl.sdk.network.a aVar = this.f8902g;
            aVar.b(aVar.a());
            this.f8902g.a(strF);
        }
    }

    public void b(z4 z4Var) {
        this.f8906k = z4Var;
    }

    public void c(z4 z4Var) {
        this.f8905j = z4Var;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements r0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.l f8908a;

        public a(com.applovin.impl.sdk.l lVar) {
            this.f8908a = lVar;
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, Object obj, int i10) {
            o6.this.b().x().b(o6.this.l);
            o6.this.f8902g.a(0);
            o6.this.a(str, obj, i10);
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, Object obj) {
            long millis;
            boolean z10 = false;
            boolean z11 = i10 < 200 || i10 >= 500;
            boolean z12 = i10 == 429;
            boolean z13 = i10 != -1009 || o6.this.f8902g.q();
            boolean z14 = (i10 == -900 || i10 == -1000) ? false : true;
            if (z13 && z14 && (z11 || z12 || o6.this.f8902g.p())) {
                String strA = o6.this.f8902g.a();
                if (o6.this.f8902g.j() <= 0) {
                    if (strA != null && strA.equals(o6.this.f8902g.f())) {
                        o6 o6Var = o6.this;
                        o6Var.a(o6Var.f8906k);
                    } else {
                        o6 o6Var2 = o6.this;
                        o6Var2.a(o6Var2.f8905j);
                    }
                    o6 o6Var3 = o6.this;
                    o6Var3.a(o6Var3.f8902g.f(), i10, str2, obj);
                    return;
                }
                com.applovin.impl.sdk.p pVar = o6.this.f8299c;
                if (com.applovin.impl.sdk.p.a()) {
                    o6 o6Var4 = o6.this;
                    com.applovin.impl.sdk.p pVar2 = o6Var4.f8299c;
                    String str3 = o6Var4.f8298b;
                    StringBuilder sbU = defpackage.e.u(i10, "Unable to send request due to server failure (code ", "). ");
                    sbU.append(o6.this.f8902g.j());
                    sbU.append(" attempts left, retrying in ");
                    sbU.append(TimeUnit.MILLISECONDS.toSeconds(o6.this.f8902g.k()));
                    sbU.append(" seconds...");
                    pVar2.k(str3, sbU.toString());
                }
                int iJ = o6.this.f8902g.j() - 1;
                o6.this.f8902g.a(iJ);
                if (iJ == 0) {
                    o6 o6Var5 = o6.this;
                    o6Var5.a(o6Var5.f8905j);
                    if (StringUtils.isValidString(strA) && strA.length() >= 4) {
                        com.applovin.impl.sdk.p pVar3 = o6.this.f8299c;
                        if (com.applovin.impl.sdk.p.a()) {
                            o6 o6Var6 = o6.this;
                            o6Var6.f8299c.d(o6Var6.f8298b, "Switching to backup endpoint ".concat(strA));
                        }
                        o6 o6Var7 = o6.this;
                        o6Var7.l = o6Var7.f8902g.f();
                        o6.this.f8902g.b(strA);
                        z10 = true;
                    }
                }
                if (((Boolean) this.f8908a.a(z4.f10193l3)).booleanValue() && z10) {
                    millis = 0;
                } else {
                    millis = o6.this.f8902g.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, o6.this.f8902g.c())) : o6.this.f8902g.k();
                }
                f6 f6VarS0 = this.f8908a.s0();
                o6 o6Var8 = o6.this;
                f6VarS0.a(o6Var8, o6Var8.f8904i, millis);
                return;
            }
            o6 o6Var9 = o6.this;
            o6Var9.a(o6Var9.f8902g.f(), i10, str2, obj);
        }
    }

    public void a(f6.b bVar) {
        this.f8904i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(z4 z4Var) {
        if (z4Var != null) {
            b().q0().a(z4Var, z4Var.a());
        }
    }
}
