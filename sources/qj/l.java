package qj;

import android.content.Context;
import android.net.Uri;
import b2.b0;
import b2.r0;
import com.google.android.gms.internal.ads.q2;
import com.google.android.gms.internal.play_billing.q1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import f2.a;
import fd.b;
import i1.v;
import i1.w0;
import i1.y;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends al.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49069b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, int i10) {
        super(str);
        this.f49069b = i10;
    }

    @Override // al.b
    public final i1.y B0() {
        switch (this.f49069b) {
            case 0:
                q2 q2Var = new q2();
                new w0();
                List list = Collections.EMPTY_LIST;
                n1 n1Var = n1.f47281e;
                i1.t tVar = new i1.t();
                i1.w wVar = i1.w.f42711a;
                Uri uri = Uri.parse((String) this.f3623a);
                return new i1.y("", new i1.s(q2Var), uri != null ? new i1.v(uri, null, null, list, n1Var, C.TIME_UNSET) : null, new i1.u(tVar), i1.a0.B, wVar);
            default:
                q2 q2Var2 = new q2();
                new w0();
                List list2 = Collections.EMPTY_LIST;
                n1 n1Var2 = n1.f47281e;
                i1.t tVar2 = new i1.t();
                i1.w wVar2 = i1.w.f42711a;
                Uri uri2 = Uri.parse((String) this.f3623a);
                return new i1.y("", new i1.s(q2Var2), uri2 != null ? new i1.v(uri2, null, null, list2, n1Var2, C.TIME_UNSET) : null, new i1.u(tVar2), i1.a0.B, wVar2);
        }
    }

    @Override // al.b
    public final f2.b0 C0(Context context) {
        switch (this.f49069b) {
            case 0:
                return new f2.q(context);
            default:
                return new f2.b0() { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final SocketFactory f4658a = SocketFactory.getDefault();

                    @Override // f2.b0
                    public final a a(y yVar) {
                        yVar.f42714b.getClass();
                        v vVar = yVar.f42714b;
                        vVar.getClass();
                        String scheme = vVar.f42704a.getScheme();
                        return new b0(yVar, (scheme == null || !q1.m("rtspt", scheme)) ? new b(4) : new r0(), this.f4658a);
                    }
                };
        }
    }
}
