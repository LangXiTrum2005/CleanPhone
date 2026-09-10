package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.badlogic.gdx.net.HttpResponseHeader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class O00 implements InterfaceC3133c10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f3488a = Ug0.m(null);
    public final /* synthetic */ R00 b;

    public O00(R00 r00) {
        this.b = r00;
    }

    public static void a(O00 o00, List list) {
        C3965lY c3965lYN;
        R00 r00 = o00.b;
        R00.t(r00, list);
        Pattern pattern = AbstractC3486g10.f4397a;
        if (!AbstractC3486g10.b.matcher((CharSequence) list.get(0)).matches()) {
            A70 a70 = r00.h;
            Matcher matcher = AbstractC3486g10.f4397a.matcher((CharSequence) list.get(0));
            FW.h(matcher.matches());
            String strGroup = matcher.group(1);
            strGroup.getClass();
            AbstractC3486g10.a(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            Uri.parse(strGroup2);
            int iIndexOf = list.indexOf("");
            FW.h(iIndexOf > 0);
            List listSubList = list.subList(1, iIndexOf);
            C4559sD c4559sD = new C4559sD();
            c4559sD.b(listSubList);
            S00 s00C = c4559sD.c();
            SE.c(AbstractC3486g10.h).b(list.subList(iIndexOf + 1, list.size()));
            String strC = s00C.c("CSeq");
            strC.getClass();
            int i = Integer.parseInt(strC);
            R00 r01 = (R00) a70.d;
            C3965lY c3965lYI = AbstractC3486g10.i(new A70(new C4559sD(r01.c, r01.l, i).c()));
            R00.t((R00) a70.d, c3965lYI);
            ((R00) a70.d).j.b(c3965lYI);
            a70.b = Math.max(a70.b, i + 1);
            return;
        }
        A70 a70C = AbstractC3486g10.c(list);
        String strC2 = ((S00) a70C.c).c("CSeq");
        FW.o(strC2);
        int i2 = Integer.parseInt(strC2);
        C3574h10 c3574h10 = (C3574h10) r00.g.get(i2);
        if (c3574h10 == null) {
            return;
        }
        r00.g.remove(i2);
        try {
            try {
                int i3 = a70C.b;
                int i4 = c3574h10.b;
                if (i3 == 200) {
                    switch (i4) {
                        case 1:
                        case 3:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                            return;
                        case 2:
                            o00.b(new C2329Ca(i3, AbstractC4723u50.a((String) a70C.d)));
                            return;
                        case 4:
                            o00.c(new C2329Ca(i3, AbstractC3486g10.b(((S00) a70C.c).c("Public"))));
                            return;
                        case 5:
                            o00.d();
                            return;
                        case 6:
                            String strC3 = ((S00) a70C.c).c("Range");
                            C3662i10 c3662i10A = strC3 == null ? C3662i10.c : C3662i10.a(strC3);
                            try {
                                String strC4 = ((S00) a70C.c).c("RTP-Info");
                                c3965lYN = strC4 == null ? AC.n() : C3748j10.a(r00.i, strC4);
                            } catch (KT unused) {
                                c3965lYN = AC.n();
                            }
                            o00.e(new A70(a70C.b, c3662i10A, c3965lYN));
                            return;
                        case 10:
                            String strC5 = ((S00) a70C.c).c("Session");
                            String strC6 = ((S00) a70C.c).c("Transport");
                            if (strC5 == null || strC6 == null) {
                                throw KT.b("Missing mandatory session or transport header", null);
                            }
                            o00.f(new A70(a70C.b, AbstractC3486g10.d(strC5), strC6, 9));
                            return;
                        default:
                            throw new IllegalStateException();
                    }
                }
                if (i3 != 401) {
                    if (i3 == 301 || i3 == 302) {
                        if (r00.o != -1) {
                            r00.o = 0;
                        }
                        String strC7 = ((S00) a70C.c).c(HttpResponseHeader.Location);
                        if (strC7 == null) {
                            ((U00) r00.f3638a).g("Redirection without new location.", null);
                            return;
                        }
                        Uri uri = Uri.parse(strC7);
                        r00.i = AbstractC3486g10.g(uri);
                        r00.k = AbstractC3486g10.e(uri);
                        r00.h.j(r00.i, r00.l);
                        return;
                    }
                } else if (r00.k != null && !r00.q) {
                    AC acD = ((S00) a70C.c).d(HttpResponseHeader.WWWAuthenticate);
                    if (acD.isEmpty()) {
                        throw KT.b("Missing WWW-Authenticate header in a 401 response.", null);
                    }
                    for (int i5 = 0; i5 < acD.size(); i5++) {
                        r00.n = AbstractC3486g10.f((String) acD.get(i5));
                        if (r00.n.f2872a == 2) {
                            break;
                        }
                    }
                    r00.h.h();
                    r00.q = true;
                    return;
                }
                R00.r(r00, new C3124bu(AbstractC3486g10.j(i4) + " " + a70C.b));
            } catch (IllegalArgumentException e) {
                e = e;
                R00.r(r00, new C3124bu(e));
            }
        } catch (KT e2) {
            e = e2;
            R00.r(r00, new C3124bu(e));
        }
    }

    public final void b(C2329Ca c2329Ca) {
        C3662i10 c3662i10A = C3662i10.c;
        String str = (String) ((C4635t50) c2329Ca.b).f5015a.get("range");
        R00 r00 = this.b;
        if (str != null) {
            try {
                c3662i10A = C3662i10.a(str);
            } catch (KT e) {
                ((U00) r00.f3638a).g("SDP format error.", e);
                return;
            }
        }
        C3965lY c3965lYK = R00.k((C4635t50) c2329Ca.b, r00.i);
        boolean zIsEmpty = c3965lYK.isEmpty();
        Q00 q00 = r00.f3638a;
        if (zIsEmpty) {
            ((U00) q00).g("No playable track.", null);
        } else {
            ((U00) q00).h(c3662i10A, c3965lYK);
            r00.p = true;
        }
    }

    public final void c(C2329Ca c2329Ca) {
        R00 r00 = this.b;
        if (r00.m != null) {
            return;
        }
        AC ac = (AC) c2329Ca.b;
        if (ac.isEmpty() || ac.contains(2)) {
            r00.h.j(r00.i, r00.l);
        } else {
            ((U00) r00.f3638a).g("DESCRIBE not supported.", null);
        }
    }

    public final void d() {
        R00 r00 = this.b;
        FW.s(r00.o == 2);
        r00.o = 1;
        r00.r = false;
        long j = r00.s;
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            r00.y(Ug0.W(j));
        }
    }

    public final void e(A70 a70) {
        R00 r00 = this.b;
        FW.s(r00.o == 1);
        r00.o = 2;
        if (r00.m == null) {
            N00 n00 = new N00(r00);
            r00.m = n00;
            if (!n00.b) {
                n00.b = true;
                n00.f3434a.postDelayed(n00, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
            }
        }
        r00.s = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        ((U00) r00.b).b(Ug0.L(((C3662i10) a70.c).f4484a), (AC) a70.d);
    }

    public final void f(A70 a70) {
        R00 r00 = this.b;
        FW.s(r00.o != -1);
        r00.o = 1;
        r00.l = (String) ((FG) a70.c).b;
        r00.u();
    }
}
