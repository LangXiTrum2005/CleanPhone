package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import fg.b;
import java.util.ArrayList;
import jk.a;
import nk.e;
import pn.d;
import rn.h;
import rn.k;
import rn.m;
import rn.p;
import ud.y;
import wj.r;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5824a;

    public /* synthetic */ c(int i10) {
        this.f5824a = i10;
    }

    @Override // jk.a
    public final Object invoke() {
        d[] dVarArr;
        int i10 = this.f5824a;
        int i11 = 2;
        int i12 = 6;
        int i13 = 7;
        int i14 = 1;
        int i15 = 9;
        r rVar = r.f53297a;
        int i16 = 0;
        switch (i10) {
            case 0:
                return new h(i16);
            case 1:
                return new cg.d(v.f53866a);
            case 2:
                return new h(i14);
            case 3:
                return Long.valueOf(System.currentTimeMillis());
            case 4:
                return new h(i11);
            case 5:
                return new h(i11);
            case 6:
                return new b();
            case 7:
                return new h(3);
            case 8:
                nk.d dVar = e.f46785a;
                return Integer.valueOf(e.f46786b.i().nextInt(2147418112) + C.DEFAULT_BUFFER_SEGMENT_SIZE);
            case 9:
                return 33554432;
            case 10:
                return new h(4);
            case 11:
                return new h(5);
            case 12:
                return new h(i12);
            case 13:
                return new h(i12);
            case 14:
                return new h(i13);
            case 15:
                return new h(i13);
            case 16:
                return new oj.b(i14);
            case 17:
                return new h(8);
            case 18:
                return new h(i15);
            case 19:
                return new h(i15);
            case 20:
                ArrayList arrayList = new ArrayList(0);
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                return (arrayList == null || (dVarArr = (d[]) arrayList.toArray(new d[0])) == null) ? k.f49723a : dVarArr;
            case 21:
                return new h(10);
            case 22:
                p pVar = p.f49742a;
                return new h(y.f52186a);
            case 23:
                return new h(11);
            case 24:
                xf.c cVar = xf.c.f53784e;
                return rVar;
            default:
                return rVar;
        }
    }

    public /* synthetic */ c(m mVar) {
        this.f5824a = 20;
    }
}
