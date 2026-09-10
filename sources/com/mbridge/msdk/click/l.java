package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class l extends com.mbridge.msdk.foundation.same.task.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f31677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f31680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CampaignEx f31681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f31682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f31683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f31684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f31685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f31686k;
    private JumpLoaderResult l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g f31687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private k f31688n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Semaphore f31676a = new Semaphore(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final o.f f31689o = new a();

    public l(com.mbridge.msdk.click.entity.b bVar) {
        this.f31677b = bVar.c();
        this.f31678c = bVar.e();
        this.f31679d = bVar.b();
        this.f31680e = bVar.d();
        this.f31681f = bVar.a();
        this.f31682g = bVar.g();
        this.f31683h = bVar.i();
        this.f31684i = bVar.f();
        this.f31685j = bVar.h();
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void runTask() {
        JumpLoaderResult jumpLoaderResult;
        g gVar = this.f31687m;
        if (gVar != null) {
            gVar.b(null);
        }
        JumpLoaderResult jumpLoaderResult2 = new JumpLoaderResult();
        this.l = jumpLoaderResult2;
        jumpLoaderResult2.setUrl(this.f31678c);
        JumpLoaderResult jumpLoaderResultC = c(this.f31678c);
        this.l = jumpLoaderResultC;
        if (jumpLoaderResultC != null && !TextUtils.isEmpty(jumpLoaderResultC.getExceptionMsg())) {
            this.l.setSuccess(true);
        }
        if (this.mState != com.mbridge.msdk.foundation.same.task.a.b.RUNNING) {
            k kVar = this.f31688n;
            if (kVar != null) {
                kVar.a(this.l);
                return;
            }
            return;
        }
        JumpLoaderResult jumpLoaderResult3 = this.l;
        if (jumpLoaderResult3 != null && !jumpLoaderResult3.isSuccess()) {
            k kVar2 = this.f31688n;
            if (kVar2 != null) {
                kVar2.a(this.l);
                return;
            }
            return;
        }
        com.mbridge.msdk.click.entity.a aVar = this.f31686k;
        if (aVar != null && (jumpLoaderResult = this.l) != null) {
            jumpLoaderResult.setStatusCode(aVar.f31653f);
        }
        m.a(this.f31681f, this.l, this.f31686k, this.f31679d, this.f31680e, this.f31677b, this.f31689o, this.f31688n, this.f31676a);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements o.f {
        public a() {
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean a(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean b(String str) {
            return false;
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean c(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(String str, boolean z10, String str2) {
            l.this.b(str);
            l.this.l.setContent(str2);
            a();
        }

        private void a() {
            synchronized (this) {
                try {
                    l.this.l.setSuccess(true);
                    if (l.this.f31688n != null) {
                        l.this.f31688n.a(l.this.l);
                    }
                    l.this.a();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(int i10, String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                l.this.l.setExceptionMsg(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                l.this.l.setContent(str3);
            }
            l.this.b(str);
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        return m.a(str, this.f31681f, this.l);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0151 A[LOOP:0: B:15:0x003e->B:65:0x0151, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x014a A[SYNTHETIC] */
    private JumpLoaderResult c(String str) {
        String scheme;
        String str2;
        int i10;
        String strA = a(str);
        JumpLoaderResult jumpLoaderResult = new JumpLoaderResult();
        n nVar = new n();
        i iVar = new i();
        String host = "";
        try {
            if (URLUtil.isNetworkUrl(strA)) {
                URI uriCreate = URI.create(strA);
                scheme = uriCreate.getScheme();
                try {
                    host = uriCreate.getHost();
                } catch (Exception e10) {
                    e = e10;
                    q0.b("SocketRequestTask", e.getMessage());
                }
                str2 = host;
                host = scheme;
            } else {
                str2 = "";
            }
        } catch (Exception e11) {
            e = e11;
            scheme = "";
        }
        String strA2 = strA;
        for (int i11 = 0; i11 < 10; i11++) {
            if (this.mState != com.mbridge.msdk.foundation.same.task.a.b.RUNNING) {
                return null;
            }
            if (strA2.startsWith("tcp")) {
                this.f31686k = nVar.a(strA2, this.f31681f, this.f31682g, this.f31683h);
                i10 = 3;
            } else {
                this.f31686k = iVar.a(strA2, this.f31682g, this.f31683h, this.f31681f);
                i10 = 1;
            }
            com.mbridge.msdk.click.entity.a aVar = this.f31686k;
            if (aVar == null) {
                jumpLoaderResult.setUrl(strA2);
                jumpLoaderResult.setSuccess(false);
                break;
            }
            if (!TextUtils.isEmpty(aVar.f31655h)) {
                jumpLoaderResult.setUrl(strA2);
                jumpLoaderResult.setExceptionMsg(this.f31686k.f31655h);
                jumpLoaderResult.setType(i10);
                jumpLoaderResult.setHeader(this.f31686k.a());
                jumpLoaderResult.setSuccess(false);
                if (i11 != 0) {
                    break;
                }
                com.mbridge.msdk.click.retry.a.b().a(strA2, this.f31686k.f31655h, this.f31681f, this.f31680e, this.f31682g, this.f31683h, this.f31684i);
                break;
            }
            int i12 = this.f31686k.f31653f;
            if (i12 == 200) {
                jumpLoaderResult.setjumpDone(true);
                jumpLoaderResult.setUrl(strA2);
                jumpLoaderResult.setSuccess(true);
                String str3 = this.f31686k.f31654g;
                jumpLoaderResult.setContent(str3 != null ? str3 : null);
                break;
            }
            if (i12 != 301 && i12 != 302 && i12 != 307) {
                jumpLoaderResult.setjumpDone(false);
                jumpLoaderResult.setUrl(strA2);
                if (i11 != 0) {
                    break;
                }
                com.mbridge.msdk.click.retry.a.b().a(strA2, this.f31686k.f31655h, this.f31681f, this.f31680e, this.f31682g, this.f31683h, this.f31684i);
                break;
            }
            jumpLoaderResult.setSuccess(true);
            jumpLoaderResult.setIs302Jump(true);
            if (TextUtils.isEmpty(this.f31686k.f31648a)) {
                jumpLoaderResult.setjumpDone(true);
                jumpLoaderResult.setUrl(strA2);
                break;
            }
            String strI = this.f31686k.f31648a;
            if (strI.startsWith("http")) {
                if (u0.a.b(strI)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(strI);
                    break;
                }
                strA2 = a(strI);
            } else {
                if (!strI.startsWith("/") || TextUtils.isEmpty(host) || TextUtils.isEmpty(str2)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(strI);
                    break;
                }
                strI = q4.a.i(host, "://", str2, strI);
                str2 = null;
                host = null;
                if (u0.a.b(strI)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(strI);
                    break;
                }
                strA2 = a(strI);
            }
        }
        return jumpLoaderResult;
    }

    public void a(g gVar) {
        this.f31687m = gVar;
    }

    public void a(k kVar) {
        this.f31688n = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f31676a.release();
    }

    private String a(String str) {
        if (this.f31685j) {
            String strA = com.mbridge.msdk.setting.b.a(this.f31677b, str);
            if (!TextUtils.isEmpty(strA)) {
                str = wi.d.h(str, strA);
            }
        }
        return com.mbridge.msdk.util.b.a() ? m.a(this.f31681f, str) : str;
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void pauseTask(boolean z10) {
    }
}
