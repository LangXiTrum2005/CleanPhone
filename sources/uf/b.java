package uf;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.ur1;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ea.b0;
import ig.c;
import j2.n;
import java.util.ArrayList;
import java.util.concurrent.Future;
import jj.d;
import kg.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f52198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f52199b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f52200c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f52201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kg.c f52202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ne.a f52203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f52204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n f52205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b0 f52206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f52207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Handler f52208k;

    public b(String str) {
        this.f52198a = new c(str);
    }

    public Future a() {
        ArrayList arrayList = this.f52200c;
        ArrayList arrayList2 = this.f52199b;
        if (this.f52207j == null) {
            throw new IllegalStateException("listener can't be null");
        }
        if (arrayList2.isEmpty() && arrayList.isEmpty()) {
            throw new IllegalStateException("we need at least one data source");
        }
        if (this.f52208k == null) {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            this.f52208k = new Handler(looperMyLooper);
        }
        if (this.f52201d == null) {
            ur1 ur1Var = new ur1();
            ur1Var.f20874a = -1;
            ur1Var.f20877d = -1;
            ur1Var.f20876c = MimeTypes.AUDIO_AAC;
            ur1Var.f20875b = Long.MIN_VALUE;
            kg.a aVar = new kg.a();
            aVar.f44623a = ur1Var;
            this.f52201d = aVar;
        }
        int i10 = 1;
        if (this.f52202e == null) {
            ec.a aVar2 = kg.c.f44629b;
            hg.b bVar = new hg.b(0);
            hg.b bVar2 = new hg.b(1);
            ((ArrayList) bVar2.f42349b).add(bVar);
            kg.b bVar3 = new kg.b();
            bVar3.f44624a = bVar2;
            bVar3.f44626c = 30;
            bVar3.f44625b = 2000000L;
            bVar3.f44627d = 3.0f;
            bVar3.f44628e = "video/avc";
            this.f52202e = new kg.c(bVar3);
        }
        if (this.f52203f == null) {
            this.f52203f = new ne.a(i10);
        }
        if (this.f52204g == null) {
            this.f52204g = new d(24);
        }
        if (this.f52205h == null) {
            this.f52205h = new n(17);
        }
        if (this.f52206i == null) {
            this.f52206i = new b0(18);
        }
        b bVar4 = new b();
        bVar4.f52207j = this.f52207j;
        bVar4.f52200c = arrayList2;
        bVar4.f52199b = arrayList;
        bVar4.f52198a = this.f52198a;
        bVar4.f52208k = this.f52208k;
        bVar4.f52201d = this.f52201d;
        bVar4.f52202e = this.f52202e;
        bVar4.f52203f = this.f52203f;
        bVar4.f52204g = this.f52204g;
        bVar4.f52205h = this.f52205h;
        bVar4.f52206i = this.f52206i;
        return eg.d.f40043a.submit(new c6.a(bVar4, 4));
    }
}
