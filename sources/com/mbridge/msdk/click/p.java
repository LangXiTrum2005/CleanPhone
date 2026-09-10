package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.u0;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class p extends f implements com.mbridge.msdk.foundation.same.task.a.InterfaceC0129a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f31723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JumpLoaderResult f31724c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f31727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f31728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f31729h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31725d = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f31730i = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements k {
        public a() {
        }

        @Override // com.mbridge.msdk.click.k
        public void a(JumpLoaderResult jumpLoaderResult) {
            p.this.f31724c = jumpLoaderResult;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (p.this.f31723b != null) {
                if (p.this.f31724c.isSuccess()) {
                    p.this.f31723b.a(p.this.f31724c);
                } else {
                    p.this.f31723b.a(p.this.f31724c, p.this.f31724c.getMsg());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends com.mbridge.msdk.foundation.same.task.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f31734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f31735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f31736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f31737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f31738f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f31739g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f31740h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f31741i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Semaphore f31733a = new Semaphore(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private o.f f31742j = new a();

        public c(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z10, boolean z11, int i10) {
            this.f31734b = context;
            this.f31735c = str;
            this.f31736d = str2;
            this.f31737e = str3;
            this.f31738f = campaignEx;
            this.f31739g = z10;
            this.f31740h = z11;
            this.f31741i = i10;
        }

        private boolean a(int i10) {
            return i10 == 200;
        }

        private boolean b(int i10) {
            return i10 == 301 || i10 == 302 || i10 == 307;
        }

        private boolean c(String str) {
            return str.startsWith("/");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d(String str) {
            return q.a(str, this.f31738f, p.this.f31724c);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            if (p.this.f31723b != null) {
                p.this.f31723b.b(null);
            }
            p.this.f31724c = new JumpLoaderResult();
            p.this.f31724c.setUrl(this.f31735c);
            p.this.f31724c = a(this.f31735c, this.f31739g, this.f31740h, this.f31738f, this.f31741i);
            if (!TextUtils.isEmpty(p.this.f31724c.getExceptionMsg())) {
                p.this.f31724c.setSuccess(true);
            }
            if (p.this.f31725d && p.this.f31724c.isSuccess()) {
                if (p.this.f31729h != null) {
                    p.this.f31724c.setStatusCode(p.this.f31729h.f31653f);
                }
                q.a(this.f31738f, p.this.f31724c, p.this.f31729h, this.f31736d, this.f31737e, this.f31734b, this.f31742j, this.f31733a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements o.f {
            public a() {
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean a(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean b(String str) {
                return false;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean c(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(String str, boolean z10, String str2) {
                c.this.d(str);
                p.this.f31724c.setContent(str2);
                a();
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(int i10, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    p.this.f31724c.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    p.this.f31724c.setContent(str3);
                }
                c.this.d(str);
                a();
            }

            private void a() {
                synchronized (p.this) {
                    p.this.f31724c.setSuccess(true);
                    c.this.a();
                }
            }
        }

        private boolean b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.f31733a.release();
        }

        private JumpLoaderResult a(String str, boolean z10, boolean z11, CampaignEx campaignEx, int i10) {
            String scheme;
            String str2;
            String scheme2 = "";
            if (p.this.f31726e) {
                String strA = com.mbridge.msdk.setting.b.a(this.f31734b, str);
                if (!TextUtils.isEmpty(strA)) {
                    str = wi.d.h(str, strA);
                }
            }
            if (com.mbridge.msdk.util.b.a()) {
                str = q.a(this.f31738f, str);
            }
            JumpLoaderResult jumpLoaderResult = new JumpLoaderResult();
            i iVar = new i();
            try {
                if (b(str)) {
                    str2 = "";
                } else {
                    URI uriCreate = URI.create(str);
                    scheme = uriCreate.getScheme();
                    try {
                        scheme2 = uriCreate.getHost();
                    } catch (Exception e10) {
                        e = e10;
                        e.printStackTrace();
                    }
                    str2 = scheme2;
                    scheme2 = scheme;
                }
            } catch (Exception e11) {
                e = e11;
                scheme = "";
            }
            String strA2 = str;
            String host = str2;
            for (int i11 = 0; i11 < 10; i11++) {
                if (!p.this.f31725d) {
                    return null;
                }
                p.this.f31729h = iVar.a(strA2, z10, z11, campaignEx);
                if (p.this.f31729h != null) {
                    if (!TextUtils.isEmpty(p.this.f31729h.f31655h)) {
                        jumpLoaderResult.setUrl(strA2);
                        jumpLoaderResult.setExceptionMsg(p.this.f31729h.f31655h);
                        jumpLoaderResult.setType(1);
                        jumpLoaderResult.setHeader(p.this.f31729h.a());
                        jumpLoaderResult.setSuccess(false);
                        if (i11 != 0) {
                            break;
                        }
                        com.mbridge.msdk.click.retry.a.b().a(strA2, p.this.f31729h.f31655h, campaignEx, this.f31737e, z10, z11, i10);
                        break;
                    }
                    jumpLoaderResult.setSuccess(true);
                    if (!b(p.this.f31729h.f31653f)) {
                        if (a(p.this.f31729h.f31653f)) {
                            jumpLoaderResult.setjumpDone(true);
                            jumpLoaderResult.setUrl(strA2);
                            jumpLoaderResult.setContent(p.this.f31729h.f31654g);
                            break;
                        }
                        jumpLoaderResult.setjumpDone(false);
                        jumpLoaderResult.setUrl(strA2);
                        if (i11 != 0) {
                            break;
                        }
                        com.mbridge.msdk.click.retry.a.b().a(strA2, "error code:" + p.this.f31729h.f31653f, campaignEx, this.f31737e, z10, z11, i10);
                        break;
                    }
                    jumpLoaderResult.setIs302Jump(true);
                    if (!TextUtils.isEmpty(p.this.f31729h.f31648a)) {
                        strA2 = p.this.f31729h.f31648a;
                        if (b(strA2)) {
                            if (c(strA2) && !TextUtils.isEmpty(scheme2) && !TextUtils.isEmpty(host)) {
                                strA2 = q4.a.i(scheme2, "://", host, strA2);
                                host = null;
                                scheme2 = null;
                            } else {
                                jumpLoaderResult.setjumpDone(true);
                                jumpLoaderResult.setUrl(strA2);
                                break;
                            }
                        } else if (!b(strA2)) {
                            try {
                                URI uriCreate2 = URI.create(strA2);
                                scheme2 = uriCreate2.getScheme();
                                host = uriCreate2.getHost();
                            } catch (Exception e12) {
                                e12.printStackTrace();
                            }
                        }
                        if (!a(strA2)) {
                            if (p.this.f31726e) {
                                String strA3 = com.mbridge.msdk.setting.b.a(this.f31734b, strA2);
                                if (!TextUtils.isEmpty(strA3)) {
                                    strA2 = wi.d.h(strA2, strA3);
                                }
                            }
                            if (com.mbridge.msdk.util.b.a()) {
                                strA2 = q.a(this.f31738f, strA2);
                            }
                        } else {
                            jumpLoaderResult.setjumpDone(true);
                            jumpLoaderResult.setUrl(strA2);
                            break;
                        }
                    } else {
                        jumpLoaderResult.setjumpDone(true);
                        jumpLoaderResult.setUrl(strA2);
                        break;
                    }
                } else {
                    jumpLoaderResult.setUrl(strA2);
                    jumpLoaderResult.setSuccess(false);
                    jumpLoaderResult.setMsg("request url is invalided");
                    break;
                }
            }
            return jumpLoaderResult;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }

        private boolean a(String str) {
            return u0.a.b(str);
        }
    }

    public p(Context context) {
        this.f31727f = context;
        this.f31728g = new com.mbridge.msdk.foundation.same.task.b(context, 2);
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
    public void a(String str, g gVar, boolean z10, String str2, String str3, CampaignEx campaignEx, boolean z11, boolean z12, int i10) {
        com.mbridge.msdk.foundation.same.task.a cVar;
        this.f31723b = gVar;
        this.f31726e = z10;
        com.mbridge.msdk.click.entity.b bVar = new com.mbridge.msdk.click.entity.b();
        bVar.a(this.f31727f);
        bVar.c(str);
        bVar.b(z10);
        bVar.a(str2);
        bVar.b(str3);
        bVar.a(campaignEx);
        bVar.a(z11);
        bVar.c(z12);
        bVar.a(i10);
        if (str.startsWith("tcp")) {
            l lVar = new l(bVar);
            lVar.a(this.f31723b);
            lVar.a(new a());
            cVar = lVar;
        } else {
            cVar = new c(this.f31727f, str, str2, str3, campaignEx, z11, z12, i10);
        }
        this.f31728g.b(cVar, this);
    }

    @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0129a
    public void a(com.mbridge.msdk.foundation.same.task.a.b bVar) {
        if (bVar == com.mbridge.msdk.foundation.same.task.a.b.FINISH && this.f31725d) {
            this.f31730i.post(new b());
        }
    }
}
