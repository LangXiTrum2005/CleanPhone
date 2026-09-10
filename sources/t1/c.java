package t1;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import l1.y;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f50339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f50340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f50341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f50343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f50344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f50345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f50346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s1 f50347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i1.t f50348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f50349k;
    public final i l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f50350m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, i iVar, s1 s1Var, i1.t tVar, Uri uri, ArrayList arrayList) {
        this.f50339a = j10;
        this.f50340b = j11;
        this.f50341c = j12;
        this.f50342d = z10;
        this.f50343e = j13;
        this.f50344f = j14;
        this.f50345g = j15;
        this.f50346h = j16;
        this.l = iVar;
        this.f50347i = s1Var;
        this.f50349k = uri;
        this.f50348j = tVar;
        this.f50350m = arrayList;
    }

    public final h a(int i10) {
        return (h) this.f50350m.get(i10);
    }

    public final long b(int i10) {
        long j10;
        long j11;
        List list = this.f50350m;
        if (i10 == list.size() - 1) {
            j10 = this.f50340b;
            if (j10 == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            j11 = ((h) list.get(i10)).f50373b;
        } else {
            j10 = ((h) list.get(i10 + 1)).f50373b;
            j11 = ((h) list.get(i10)).f50373b;
        }
        return j10 - j11;
    }

    public final long c(int i10) {
        return y.M(b(i10));
    }

    @Override // a2.a
    public final Object copy(List list) {
        long j10;
        long j11;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new l0());
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        int i10 = 0;
        while (true) {
            int size = this.f50350m.size();
            j10 = C.TIME_UNSET;
            if (i10 >= size) {
                break;
            }
            if (((l0) linkedList.peek()).f42574a != i10) {
                long jB = b(i10);
                if (jB != C.TIME_UNSET) {
                    j12 += jB;
                }
            } else {
                h hVarA = a(i10);
                List list2 = hVarA.f50374c;
                l0 l0Var = (l0) linkedList.poll();
                int i11 = l0Var.f42574a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = l0Var.f42575b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f50331c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(l0Var.f42576c));
                        l0Var = (l0) linkedList.poll();
                        if (l0Var.f42574a != i11) {
                            break;
                        }
                    } while (l0Var.f42575b == i12);
                    j11 = j12;
                    arrayList2.add(new a(aVar.f50329a, aVar.f50330b, arrayList3, aVar.f50332d, aVar.f50333e, aVar.f50334f));
                    if (l0Var.f42574a != i11) {
                        break;
                    }
                    j12 = j11;
                }
                linkedList.addFirst(l0Var);
                arrayList.add(new h(hVarA.f50372a, hVarA.f50373b - j11, arrayList2, hVarA.f50375d));
                j12 = j11;
            }
            i10++;
        }
        long j13 = j12;
        long j14 = this.f50340b;
        if (j14 != C.TIME_UNSET) {
            j10 = j14 - j13;
        }
        i1.t tVar = this.f50348j;
        Uri uri = this.f50349k;
        return new c(this.f50339a, j10, this.f50341c, this.f50342d, this.f50343e, this.f50344f, this.f50345g, this.f50346h, this.l, this.f50347i, tVar, uri, arrayList);
    }
}
