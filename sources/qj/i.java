package qj;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.g7;
import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.w0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import m0.s1;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends al.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f49062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49063d;

    public i(String str, int i10, HashMap map, String str2) {
        super(str);
        this.f49061b = i10;
        this.f49062c = map;
        this.f49063d = str2;
    }

    @Override // al.b
    public final i1.y B0() {
        String str;
        q2 q2Var = new q2();
        new w0();
        List list = Collections.EMPTY_LIST;
        n1 n1Var = n1.f47281e;
        i1.t tVar = new i1.t();
        i1.w wVar = i1.w.f42711a;
        Uri uri = Uri.parse((String) this.f3623a);
        int iC = v0.i.c(this.f49061b);
        if (iC == 1) {
            str = MimeTypes.APPLICATION_SS;
        } else if (iC != 2) {
            str = iC != 3 ? null : MimeTypes.APPLICATION_M3U8;
        } else {
            str = MimeTypes.APPLICATION_MPD;
        }
        return new i1.y("", new i1.s(q2Var), uri != null ? new i1.v(uri, str != null ? str : null, null, list, n1Var, C.TIME_UNSET) : null, new i1.u(tVar), i1.a0.B, wVar);
    }

    @Override // al.b
    public final f2.b0 C0(Context context) {
        g7 g7Var = new g7(2);
        HashMap map = this.f49062c;
        g7Var.f14781e = this.f49063d;
        g7Var.f14779c = true;
        if (!map.isEmpty()) {
            m5.k kVar = (m5.k) g7Var.f14780d;
            synchronized (kVar) {
                kVar.f45903c = null;
                ((HashMap) kVar.f45902b).clear();
                ((HashMap) kVar.f45902b).putAll(map);
            }
        }
        s1 s1Var = new s1(context, g7Var);
        f2.q qVar = new f2.q(context);
        qVar.f40427b = s1Var;
        com.google.android.gms.common.api.internal.t tVar = qVar.f40426a;
        if (s1Var != ((s1) tVar.f11769e)) {
            tVar.f11769e = s1Var;
            ((HashMap) tVar.f11767c).clear();
            ((HashMap) tVar.f11768d).clear();
        }
        return qVar;
    }
}
