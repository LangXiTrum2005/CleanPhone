package com.mbridge.msdk.timer;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f36827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<i> f36829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LinkedList<i> f36830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f36833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.a f36834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l f36835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f36836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Handler f36837k;

    /* JADX INFO: renamed from: com.mbridge.msdk.timer.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class HandlerC0190a extends Handler {
        public HandlerC0190a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (a.this) {
                try {
                    int i10 = message.what;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            a.this.c();
                        }
                    } else {
                        if (a.this.f36828b) {
                            return;
                        }
                        a aVar = a.this;
                        aVar.a(aVar.f36827a);
                        sendMessageDelayed(obtainMessage(1), a.this.f36827a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements com.mbridge.msdk.reward.adapter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f36839a;

        public b(com.mbridge.msdk.reward.adapter.c cVar) {
            this.f36839a = cVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f36837k.sendMessage(a.this.f36837k.obtainMessage(2));
            this.f36839a.a((com.mbridge.msdk.reward.adapter.a) null);
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f36837k.sendMessage(a.this.f36837k.obtainMessage(2));
            this.f36839a.a((com.mbridge.msdk.reward.adapter.a) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static a f36841a = new a(null);
    }

    public /* synthetic */ a(HandlerC0190a handlerC0190a) {
        this();
    }

    private a() {
        this.f36828b = false;
        this.f36829c = new LinkedList<>();
        this.f36830d = new LinkedList<>();
        this.f36831e = 0;
        this.f36832f = 0;
        this.f36837k = new HandlerC0190a();
    }

    private void b() {
        if (this.f36836j == null) {
            this.f36836j = g.a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        if (this.f36835i == null) {
            this.f36835i = l.a(this.f36836j);
        }
        List<i> listA = this.f36835i.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        if (listA != null) {
            this.f36830d.addAll(listA);
            for (i iVar : listA) {
                a(iVar.d(), iVar.g());
            }
        }
        List<i> listA2 = this.f36835i.a(94);
        if (listA2 != null) {
            this.f36829c.addAll(listA2);
            for (i iVar2 : listA2) {
                b(iVar2.d(), iVar2.g());
            }
        }
        if (this.f36833g == null) {
            this.f36833g = e.a(this.f36836j);
        }
        if (this.f36834h == null) {
            this.f36834h = com.mbridge.msdk.videocommon.setting.b.b().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            LinkedList<i> linkedList = this.f36829c;
            if (linkedList != null && linkedList.size() > 0 && this.f36831e < this.f36829c.size()) {
                i iVar = this.f36829c.get(this.f36831e);
                this.f36831e++;
                if (a(iVar)) {
                    a(iVar.d(), iVar.g(), false);
                    return;
                }
                return;
            }
            LinkedList<i> linkedList2 = this.f36830d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f36832f >= this.f36830d.size()) {
                return;
            }
            i iVar2 = this.f36830d.get(this.f36832f);
            this.f36832f++;
            if (a(iVar2)) {
                c(iVar2.d(), iVar2.g());
            }
        } catch (Throwable th2) {
            q0.b("LoopTimer", th2.getMessage(), th2);
        }
    }

    public static a a() {
        return c.f36841a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        LinkedList<i> linkedList = this.f36829c;
        if (linkedList == null || linkedList.size() <= 0 || this.f36831e == 0 || this.f36829c.size() <= this.f36831e) {
            LinkedList<i> linkedList2 = this.f36830d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f36832f == 0 || this.f36830d.size() == this.f36832f) {
                this.f36832f = 0;
                this.f36831e = 0;
                Handler handler = this.f36837k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    private boolean a(i iVar) {
        boolean z10 = false;
        if (iVar != null && !TextUtils.isEmpty(iVar.g())) {
            String strG = iVar.g();
            try {
                if (this.f36833g == null) {
                    return true;
                }
                com.mbridge.msdk.videocommon.setting.a aVar = this.f36834h;
                int iA = this.f36833g.a(strG, aVar != null ? aVar.e() : 0L);
                if (iA == -1) {
                    a(strG);
                } else if (iA == 1) {
                    return true;
                }
                try {
                    Handler handler = this.f36837k;
                    handler.sendMessage(handler.obtainMessage(2));
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = true;
            }
            q0.b("LoopTimer", th.getMessage(), th);
        }
        return z10;
    }

    private void c(String str, String str2) {
        a(str, str2, true);
    }

    private void a(String str, String str2, boolean z10) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(contextD, str, str2);
            cVar.d(z10);
            cVar.a(new b(cVar));
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar2.i(SameMD5.getMD5(v0.d()));
            cVar2.n(str2);
            if (z10) {
                cVar2.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
            } else {
                cVar2.a(94);
            }
            cVar2.h("0");
            cVar2.f("1");
            cVar.a(1, 8000, false, cVar2);
        } catch (Exception e10) {
            q0.b("LoopTimer", e10.getMessage(), e10);
        }
    }

    public void b(long j10) {
        b();
        this.f36827a = j10;
        this.f36828b = false;
        Handler handler = this.f36837k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f36827a);
    }

    public void b(String str, String str2) {
        if (this.f36829c.contains(str2)) {
            return;
        }
        this.f36829c.add(new i(str, str2, 94));
        l lVar = this.f36835i;
        if (lVar != null) {
            lVar.a(str, str2, 94);
        }
    }

    private void b(String str) {
        l lVar = this.f36835i;
        if (lVar != null) {
            lVar.a(str);
        }
    }

    public void a(String str, String str2) {
        if (this.f36830d.contains(str2)) {
            return;
        }
        this.f36830d.add(new i(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO));
        l lVar = this.f36835i;
        if (lVar != null) {
            lVar.a(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LinkedList<i> linkedList = this.f36829c;
        if (linkedList != null && linkedList.contains(str)) {
            this.f36829c.remove(str);
        } else {
            LinkedList<i> linkedList2 = this.f36830d;
            if (linkedList2 != null && linkedList2.contains(str)) {
                this.f36830d.remove(str);
            }
        }
        b(str);
    }
}
