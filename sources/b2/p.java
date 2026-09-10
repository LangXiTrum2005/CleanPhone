package b2;

import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.u6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import oa.e2;
import oa.q1;
import oa.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements i8.b, n2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5365d;

    public /* synthetic */ p(byte b10, int i10) {
        this.f5362a = i10;
    }

    @Override // n2.f
    public n2.e a(n2.l lVar, long j10) {
        long j11;
        long position = lVar.getPosition();
        int iMin = (int) Math.min(112800, lVar.getLength() - position);
        l1.q qVar = (l1.q) this.f5365d;
        qVar.J(iMin);
        lVar.peekFully(qVar.f44813a, 0, iMin);
        int i10 = qVar.f44815c;
        long j12 = -1;
        long j13 = -1;
        long j14 = C.TIME_UNSET;
        while (true) {
            if (qVar.a() < 188) {
                j11 = C.TIME_UNSET;
                break;
            }
            byte[] bArr = qVar.f44813a;
            int i11 = qVar.f44814b;
            while (true) {
                if (i11 >= i10) {
                    j11 = C.TIME_UNSET;
                    break;
                }
                byte b10 = bArr[i11];
                j11 = C.TIME_UNSET;
                if (b10 == 71) {
                    break;
                }
                i11++;
            }
            int i12 = i11 + 188;
            if (i12 > i10) {
                break;
            }
            long J = x7.a.J(qVar, i11, this.f5363b);
            if (J != j11) {
                long jB = ((l1.x) this.f5364c).b(J);
                if (jB > j10) {
                    return j14 == j11 ? new n2.e(-1, jB, position) : new n2.e(0, C.TIME_UNSET, position + j13);
                }
                j14 = jB;
                if (100000 + j14 > j10) {
                    return new n2.e(0, C.TIME_UNSET, position + ((long) i11));
                }
                j13 = i11;
            }
            qVar.M(i12);
            j12 = i12;
        }
        return j14 != j11 ? new n2.e(-2, j14, position + j12) : n2.e.f46453d;
    }

    @Override // n2.f
    public void b() {
        l1.q qVar = (l1.q) this.f5365d;
        byte[] bArr = l1.y.f44831b;
        qVar.getClass();
        qVar.K(bArr, bArr.length);
    }

    public s1 c(boolean z10) {
        oa.m0 m0Var;
        oa.m0 m0Var2;
        if (z10 && (m0Var2 = (oa.m0) this.f5365d) != null) {
            throw m0Var2.a();
        }
        s1 s1VarJ = s1.j(this.f5363b, (Object[]) this.f5364c, this);
        if (!z10 || (m0Var = (oa.m0) this.f5365d) == null) {
            return s1VarJ;
        }
        throw m0Var.a();
    }

    public void d(String str, Object... objArr) {
        if (this.f5363b <= 3) {
            Log.d((String) this.f5364c, e(str, objArr));
        }
    }

    public String e(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return ((String) this.f5365d).concat(str);
    }

    @Override // i8.b
    public void f(List needPermissions) {
        kotlin.jvm.internal.n.f(needPermissions, "needPermissions");
        l8.b bVar = (l8.b) this.f5364c;
        i8.c cVar = ((d8.f) this.f5365d).f38777c;
        int i10 = this.f5363b;
        i8.a aVar = cVar.f42911c;
        Application application = cVar.f42910b;
        kotlin.jvm.internal.n.c(application);
        bVar.b(Integer.valueOf(aVar.a(application, i10).f39176a));
    }

    @Override // i8.b
    public void h(List deniedPermissions, List grantedPermissions, List needPermissions) {
        kotlin.jvm.internal.n.f(deniedPermissions, "deniedPermissions");
        kotlin.jvm.internal.n.f(grantedPermissions, "grantedPermissions");
        kotlin.jvm.internal.n.f(needPermissions, "needPermissions");
        i8.c cVar = ((d8.f) this.f5365d).f38777c;
        int i10 = this.f5363b;
        i8.a aVar = cVar.f42911c;
        Application application = cVar.f42910b;
        kotlin.jvm.internal.n.c(application);
        ((l8.b) this.f5364c).b(Integer.valueOf(aVar.a(application, i10).f39176a));
    }

    public Object i(int i10) {
        SparseArray sparseArray = (SparseArray) this.f5364c;
        if (this.f5363b == -1) {
            this.f5363b = 0;
        }
        while (true) {
            int i11 = this.f5363b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f5363b--;
        }
        while (this.f5363b < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f5363b + 1)) {
            this.f5363b++;
        }
        return sparseArray.valueAt(this.f5363b);
    }

    public String j() {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = this.f5363b + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = ((Object[]) this.f5364c)[i11];
            if (obj instanceof pn.d) {
                pn.d dVar = (pn.d) obj;
                if (!kotlin.jvm.internal.n.a(dVar.getKind(), pn.f.f48504f)) {
                    int i12 = ((int[]) this.f5365d)[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(dVar.e(i12));
                    }
                } else if (((int[]) this.f5365d)[i11] != -1) {
                    sb2.append(X3.j.f27834d);
                    sb2.append(((int[]) this.f5365d)[i11]);
                    sb2.append(X3.j.f27836e);
                }
            } else if (obj != tn.h.f51598a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "toString(...)");
        return string;
    }

    public k0 k(int i10, String str, Map map, Uri uri) {
        q qVar = (q) this.f5365d;
        String str2 = qVar.f5372c;
        int i11 = this.f5363b;
        this.f5363b = i11 + 1;
        n5.f fVar = new n5.f(str2, str, i11);
        if (qVar.f5382n != null) {
            qVar.f5379j.getClass();
            try {
                fVar.a("Authorization", qVar.f5382n.b(qVar.f5379j, uri, i10));
            } catch (i1.e0 e10) {
                q.a(qVar, new z(e10));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            fVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        return new k0(uri, i10, new r(fVar), "");
    }

    public void l(Object obj, Object obj2) {
        int i10 = (this.f5363b + 1) * 2;
        Object[] objArr = (Object[]) this.f5364c;
        if (i10 > objArr.length) {
            this.f5364c = Arrays.copyOf(objArr, oa.b0.f(objArr.length, i10));
        }
        oa.q.c(obj, obj2);
        Object[] objArr2 = (Object[]) this.f5364c;
        int i11 = this.f5363b;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f5363b = i11 + 1;
    }

    public void m(Set set) {
        if (set != null) {
            int size = (set.size() + this.f5363b) * 2;
            Object[] objArr = (Object[]) this.f5364c;
            if (size > objArr.length) {
                this.f5364c = Arrays.copyOf(objArr, oa.b0.f(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            l(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n() {
        ((k0) this.f5364c).getClass();
        oa.l0 l0Var = ((k0) this.f5364c).f5315c.f5392a;
        HashMap map = new HashMap();
        e2 it = ((q1) l0Var.f47296d.keySet()).iterator();
        while (true) {
            oa.f0 f0Var = (oa.f0) it;
            if (!f0Var.hasNext()) {
                k0 k0Var = (k0) this.f5364c;
                o(k(k0Var.f5314b, ((q) this.f5365d).f5380k, map, k0Var.f5313a));
                return;
            }
            String str = (String) f0Var.next();
            if (!str.equals("CSeq") && !str.equals(Command.HTTP_HEADER_USER_AGENT) && !str.equals("Session") && !str.equals("Authorization")) {
                map.put(str, (String) oa.q.k(l0Var.k(str)));
            }
        }
    }

    public void o(k0 k0Var) {
        String strB = k0Var.f5315c.b("CSeq");
        strB.getClass();
        int i10 = Integer.parseInt(strB);
        q qVar = (q) this.f5365d;
        SparseArray sparseArray = qVar.f5375f;
        go.k.t(sparseArray.get(i10) == null);
        sparseArray.append(i10, k0Var);
        qVar.f5378i.b(j0.f(k0Var));
        this.f5364c = k0Var;
    }

    public void p(String str, Object... objArr) {
        Log.w((String) this.f5364c, e(str, objArr));
    }

    public void q(String str, com.google.android.gms.common.api.internal.g gVar) {
        Map map = (Map) this.f5364c;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(q4.a.j(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, gVar);
        if (this.f5363b > 0) {
            new u6(Looper.getMainLooper(), 3).post(new com.google.android.gms.common.api.internal.m0(this, gVar, str, 0));
        }
    }

    public void r(Bundle bundle) {
        this.f5363b = 1;
        this.f5365d = bundle;
        for (Map.Entry entry : ((Map) this.f5364c).entrySet()) {
            ((com.google.android.gms.common.api.internal.g) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void s(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f5364c).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((com.google.android.gms.common.api.internal.g) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public String toString() {
        switch (this.f5362a) {
            case 2:
                StringBuilder sb2 = new StringBuilder();
                if (((xn.r) this.f5364c) == xn.r.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(this.f5363b);
                sb2.append(' ');
                sb2.append((String) this.f5365d);
                String string = sb2.toString();
                kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            case 13:
                return j();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ p(String str, int i10, int i11, Object obj) {
        this.f5362a = i11;
        this.f5364c = obj;
        this.f5363b = i10;
        this.f5365d = str;
    }

    public p() {
        this.f5362a = 3;
        this.f5364c = Collections.synchronizedMap(new x.e(0));
        this.f5363b = 0;
    }

    public p(String str, String[] strArr) {
        String string;
        this.f5362a = 9;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f5365d = string;
        this.f5364c = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (length <= 23) {
            int i10 = 2;
            while (i10 <= 7 && !Log.isLoggable((String) this.f5364c, i10)) {
                i10++;
            }
            this.f5363b = i10;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    @Override // i8.b
    public void g() {
    }

    public p(int i10, r rVar, String str) {
        this.f5362a = 1;
        this.f5363b = i10;
        this.f5364c = rVar;
        this.f5365d = str;
    }

    public p(com.unity3d.ads.adplayer.b bVar) {
        this.f5362a = 7;
        this.f5364c = new SparseArray();
        this.f5365d = bVar;
        this.f5363b = -1;
    }

    public p(int i10, l1.x xVar) {
        this.f5362a = 14;
        this.f5363b = i10;
        this.f5364c = xVar;
        this.f5365d = new l1.q();
    }

    public p(n1.g gVar) {
        this.f5362a = 12;
        bc.i iVar = new bc.i(6, false);
        iVar.f5553c = new j2.n(3);
        this.f5365d = iVar;
        this.f5364c = gVar;
        this.f5363b = 1;
    }

    public p(l8.b bVar, d8.f fVar, int i10, boolean z10) {
        this.f5362a = 6;
        this.f5364c = bVar;
        this.f5365d = fVar;
        this.f5363b = i10;
    }

    public p(q qVar) {
        this.f5362a = 0;
        this.f5365d = qVar;
    }

    public p(int i10) {
        this.f5362a = 10;
        this.f5364c = new Object[i10 * 2];
        this.f5363b = 0;
    }

    public p(i9.i iVar) {
        this.f5362a = 8;
        this.f5365d = b7.d.a(150, new s4.i(this));
        this.f5364c = iVar;
    }
}
