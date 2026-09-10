package com.smartdigimkt.z2;

import android.app.Activity;
import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.smartdigimkt.f1.q;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class c implements com.smartdigimkt.x2.c {
    protected static final String q0 = "DefaultJSCommon";
    protected String k0;
    protected com.smartdigimkt.f3.d l0;
    protected com.smartdigimkt.d3.c m0;
    protected com.smartdigimkt.o.a n0;
    protected boolean X = false;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    protected boolean f40321Y = false;
    protected int Z = 0;
    protected int e0 = 0;
    protected int f0 = 0;
    protected int g0 = 0;
    protected int h0 = 0;
    protected int i0 = 1;
    protected int j0 = -1;
    public com.smartdigimkt.x2.c.a o0 = new a();
    protected int p0 = 2;

    public static class a implements com.smartdigimkt.x2.c.a {
        @Override // com.smartdigimkt.x2.c.a
        public void a() {
        }

        @Override // com.smartdigimkt.x2.c.a
        public void b() {
        }

        @Override // com.smartdigimkt.f1.q.c
        public boolean c() {
            return false;
        }

        @Override // com.smartdigimkt.f1.q.c
        public void d(com.smartdigimkt.f1.k kVar) {
            Objects.toString(kVar);
        }

        @Override // com.smartdigimkt.f1.q.c
        public void onFinishRedirection(com.smartdigimkt.f1.k kVar, String str) {
            Objects.toString(kVar);
        }

        @Override // com.smartdigimkt.f1.q.c
        public void onRedirectionFailed(com.smartdigimkt.f1.k kVar, String str) {
            Objects.toString(kVar);
        }

        @Override // com.smartdigimkt.f1.q.c
        public void a(int i2) {
        }

        @Override // com.smartdigimkt.f1.q.c
        public void b(com.smartdigimkt.f1.k kVar) {
            Objects.toString(kVar);
        }

        @Override // com.smartdigimkt.f1.q.c
        public void c(com.smartdigimkt.f1.k kVar) {
            Objects.toString(kVar);
        }

        @Override // com.smartdigimkt.x2.c.a
        public void a(int i2, String str) {
        }

        @Override // com.smartdigimkt.x2.c.a
        public void a(com.smartdigimkt.x.d dVar, boolean z2) {
        }

        @Override // com.smartdigimkt.f1.q.c
        public void a(com.smartdigimkt.x.d dVar, String str) {
            Objects.toString(dVar);
        }

        @Override // com.smartdigimkt.f1.q.c
        public void a(com.smartdigimkt.f1.k kVar) {
            Objects.toString(kVar);
        }
    }

    public static class b implements com.smartdigimkt.x2.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.smartdigimkt.x2.c f40322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.smartdigimkt.x2.c.a f40323b;

        public b(com.smartdigimkt.x2.c cVar, com.smartdigimkt.x2.c.a aVar) {
            this.f40322a = cVar;
            this.f40323b = aVar;
        }

        @Override // com.smartdigimkt.f1.q.c
        public void a(com.smartdigimkt.x.d dVar, String str) {
            com.smartdigimkt.x2.c.a aVar = this.f40323b;
            if (aVar != null) {
                aVar.a(dVar, str);
            }
        }

        @Override // com.smartdigimkt.f1.q.c
        public void b(com.smartdigimkt.f1.k kVar) {
            com.smartdigimkt.x2.c.a aVar = this.f40323b;
            if (aVar != null) {
                aVar.b(kVar);
            }
        }

        @Override // com.smartdigimkt.f1.q.c
        public boolean c() {
            com.smartdigimkt.x2.c.a aVar = this.f40323b;
            return aVar != null && aVar.c();
        }

        @Override // com.smartdigimkt.f1.q.c
        public void d(com.smartdigimkt.f1.k kVar) {
            com.smartdigimkt.x2.c.a aVar = this.f40323b;
            if (aVar != null) {
                aVar.d(kVar);
            }
        }

        @Override // com.smartdigimkt.f1.q.c
        public void onFinishRedirection(com.smartdigimkt.f1.k kVar, String str) {
            com.smartdigimkt.x2.c.a aVar = this.f40323b;
            if (aVar != null) {
                aVar.onFinishRedirection(kVar, str);
            }
            com.smartdigimkt.x2.c cVar = this.f40322a;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // com.smartdigimkt.f1.q.c
        public void onRedirectionFailed(com.smartdigimkt.f1.k kVar, String str) {
            com.smartdigimkt.x2.c.a aVar = this.f40323b;
            if (aVar != null) {
                aVar.onRedirectionFailed(kVar, str);
            }
            com.smartdigimkt.x2.c cVar = this.f40322a;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // com.smartdigimkt.f1.q.c
        public void c(com.smartdigimkt.f1.k kVar) {
            com.smartdigimkt.x2.c.a aVar = this.f40323b;
            if (aVar != null) {
                aVar.c(kVar);
            }
        }

        @Override // com.smartdigimkt.f1.q.c
        public void a(com.smartdigimkt.f1.k kVar) {
            com.smartdigimkt.x2.c.a aVar = this.f40323b;
            if (aVar != null) {
                aVar.a(kVar);
            }
        }

        @Override // com.smartdigimkt.x2.c.a
        public void b() {
            com.smartdigimkt.x2.c.a aVar = this.f40323b;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.smartdigimkt.f1.q.c
        public void a(int i2) {
            com.smartdigimkt.x2.c.a aVar = this.f40323b;
            if (aVar != null) {
                aVar.a(i2);
            }
        }

        @Override // com.smartdigimkt.x2.c.a
        public void a() {
            com.smartdigimkt.x2.c.a aVar = this.f40323b;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.smartdigimkt.x2.c.a
        public void a(com.smartdigimkt.x.d dVar, boolean z2) {
            com.smartdigimkt.x2.c.a aVar = this.f40323b;
            if (aVar != null) {
                aVar.a(dVar, z2);
            }
        }

        @Override // com.smartdigimkt.x2.c.a
        public void a(int i2, String str) {
            com.smartdigimkt.x2.c.a aVar = this.f40323b;
            if (aVar != null) {
                aVar.a(i2, str);
            }
        }
    }

    @Override // com.smartdigimkt.x2.c
    public void a() {
    }

    @Override // com.smartdigimkt.x2.c
    public void b(int i2) {
        this.Z = i2;
    }

    @Override // com.smartdigimkt.x2.c
    public void c(int i2) {
        this.f0 = i2;
    }

    @Override // com.smartdigimkt.x2.d
    public void click(int i2, String str) {
    }

    @Override // com.smartdigimkt.x2.c
    public void d(int i2) {
        this.i0 = i2;
    }

    @Override // com.smartdigimkt.x2.c
    public void e(int i2) {
        this.e0 = i2;
    }

    @Override // com.smartdigimkt.x2.c
    public String f(int i2) {
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.smartdigimkt.x2.c
    public String g() {
        return null;
    }

    @Override // com.smartdigimkt.x2.c
    public int getH5CloseType() {
        if (this.Z == 0 && this.f40321Y) {
            this.Z = 1;
        }
        return this.Z;
    }

    @Override // com.smartdigimkt.x2.c
    public int getH5MuteState() {
        if (this.e0 == 0 && this.f40321Y) {
            this.e0 = 1;
        }
        return this.e0;
    }

    @Override // com.smartdigimkt.x2.c
    public void h() {
    }

    @Override // com.smartdigimkt.x2.d
    public void handlerH5Exception(int i2, String str) {
    }

    @Override // com.smartdigimkt.x2.c
    public int i() {
        if (this.f0 == 0 && this.f40321Y) {
            this.f0 = 1;
        }
        return this.f0;
    }

    @Override // com.smartdigimkt.x2.c
    public boolean j() {
        return this.f40321Y;
    }

    @Override // com.smartdigimkt.x2.c
    public int k() {
        return this.j0;
    }

    @Override // com.smartdigimkt.x2.c
    public void release() {
        com.smartdigimkt.o.a aVar = this.n0;
        if (aVar != null) {
            aVar.a(false);
            this.n0.a((q.c) null);
            this.n0.g();
        }
    }

    @Override // com.smartdigimkt.x2.c
    public void setActivity(Activity activity) {
    }

    @Override // com.smartdigimkt.x2.c
    public void setH5Cbp(int i2) {
        this.g0 = i2;
    }

    @Override // com.smartdigimkt.x2.c
    public void setRewardUnitSetting(com.smartdigimkt.f3.d dVar) {
        Objects.toString(dVar);
        this.l0 = dVar;
    }

    @Override // com.smartdigimkt.x2.c
    public void setUnitId(String str) {
        this.k0 = str;
    }

    @Override // com.smartdigimkt.x2.c
    public void setWebViewFront(int i2) {
        this.h0 = i2;
    }

    @Override // com.smartdigimkt.x2.c
    public void a(int i2, String str) {
    }

    @Override // com.smartdigimkt.x2.c
    public boolean b() {
        return this.X;
    }

    @Override // com.smartdigimkt.x2.c
    public int c() {
        return this.h0;
    }

    @Override // com.smartdigimkt.x2.c
    public String d() {
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.smartdigimkt.x2.c
    public int e() {
        return this.g0;
    }

    @Override // com.smartdigimkt.x2.c
    public int f() {
        return this.i0;
    }

    @Override // com.smartdigimkt.x2.c
    public void g(int i2) {
        this.p0 = i2;
    }

    @Override // com.smartdigimkt.x2.c
    public void a(Context context) {
    }

    @Override // com.smartdigimkt.x2.c
    public void b(boolean z2) {
        this.X = z2;
    }

    @Override // com.smartdigimkt.x2.c
    public void a(String str) {
    }

    public void a(com.smartdigimkt.d3.c cVar) {
        this.m0 = cVar;
    }

    @Override // com.smartdigimkt.x2.c
    public void a(boolean z2) {
        this.f40321Y = z2;
    }

    @Override // com.smartdigimkt.x2.c
    public void a(com.smartdigimkt.x2.c.a aVar) {
        Objects.toString(aVar);
        this.o0 = aVar;
    }

    @Override // com.smartdigimkt.x2.c
    public void a(int i2) {
        this.j0 = i2;
    }
}
