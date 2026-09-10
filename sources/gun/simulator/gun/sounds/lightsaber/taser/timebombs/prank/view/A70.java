package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.util.SparseArray;
import com.badlogic.gdx.net.HttpRequestHeader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class A70 implements InterfaceC5110ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2803a;
    public int b;
    public Object c;
    public Object d;

    public A70(int i) {
        this.f2803a = i;
        if (i != 12) {
            return;
        }
        this.d = new Object[8];
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = -1;
        }
        this.c = iArr;
        this.b = -1;
    }

    public final void a(int i, T20 t20) {
        if (this.b == -1) {
            FW.s(((SparseArray) this.c).size() == 0);
            this.b = 0;
        }
        if (((SparseArray) this.c).size() > 0) {
            SparseArray sparseArray = (SparseArray) this.c;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            FW.h(i >= iKeyAt);
            if (iKeyAt == i) {
                InterfaceC2494Ij interfaceC2494Ij = (InterfaceC2494Ij) this.d;
                SparseArray sparseArray2 = (SparseArray) this.c;
                interfaceC2494Ij.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        ((SparseArray) this.c).append(i, t20);
    }

    public final long b(InterfaceC4265ot interfaceC4265ot) {
        int iF;
        while (interfaceC4265ot.getPeekPosition() < interfaceC4265ot.getLength() - 6) {
            C3036av c3036av = (C3036av) this.c;
            int i = this.b;
            C2868Wu c2868Wu = (C2868Wu) this.d;
            long peekPosition = interfaceC4265ot.getPeekPosition();
            byte[] bArr = new byte[2];
            int i2 = 0;
            interfaceC4265ot.peekFully(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) == i) {
                JT jt = new JT(16);
                System.arraycopy(bArr, 0, jt.f3266a, 0, 2);
                byte[] bArr2 = jt.f3266a;
                while (i2 < 14 && (iF = interfaceC4265ot.f(bArr2, 2 + i2, 14 - i2)) != -1) {
                    i2 += iF;
                }
                jt.D(i2);
                interfaceC4265ot.resetPeekPosition();
                interfaceC4265ot.advancePeekPosition((int) (peekPosition - interfaceC4265ot.getPosition()));
                if (AbstractC2340Cl.m(jt, c3036av, i, c2868Wu)) {
                    break;
                }
            } else {
                interfaceC4265ot.resetPeekPosition();
                interfaceC4265ot.advancePeekPosition((int) (peekPosition - interfaceC4265ot.getPosition()));
            }
            interfaceC4265ot.advancePeekPosition(1);
        }
        if (interfaceC4265ot.getPeekPosition() < interfaceC4265ot.getLength() - 6) {
            return ((C2868Wu) this.d).b;
        }
        interfaceC4265ot.advancePeekPosition((int) (interfaceC4265ot.getLength() - interfaceC4265ot.getPeekPosition()));
        return ((C3036av) this.c).j;
    }

    public final Object c(int i) {
        if (this.b == -1) {
            this.b = 0;
        }
        while (true) {
            int i2 = this.b;
            if (i2 <= 0 || i >= ((SparseArray) this.c).keyAt(i2)) {
                break;
            }
            this.b--;
        }
        while (this.b < ((SparseArray) this.c).size() - 1 && i >= ((SparseArray) this.c).keyAt(this.b + 1)) {
            this.b++;
        }
        return ((SparseArray) this.c).valueAt(this.b);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.d)[i2];
            if (obj instanceof D40) {
                D40 d40 = (D40) obj;
                if (!AbstractC2995aW.i(d40.getKind(), C3442fa0.b)) {
                    int i3 = ((int[]) this.c)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(d40.e(i3));
                    }
                } else if (((int[]) this.c)[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.c)[i2]);
                    sb.append("]");
                }
            } else if (obj != G7.f) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String string = sb.toString();
        AbstractC2995aW.p(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final C3574h10 e(int i, String str, Map map, Uri uri) {
        String str2 = ((R00) this.d).c;
        int i2 = this.b;
        this.b = i2 + 1;
        C4559sD c4559sD = new C4559sD(str2, str, i2);
        R00 r00 = (R00) this.d;
        if (r00.n != null) {
            FW.t(r00.k);
            try {
                Object obj = this.d;
                c4559sD.a(HttpRequestHeader.Authorization, ((R00) obj).n.c(((R00) obj).k, uri, i));
            } catch (KT e) {
                R00.r((R00) this.d, new C3124bu((Throwable) e));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            c4559sD.a((String) entry.getKey(), (String) entry.getValue());
        }
        return new C3574h10(uri, i, new S00(c4559sD), "");
    }

    public final void f() {
        int i = this.b * 2;
        Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.d, i);
        AbstractC2995aW.p(objArrCopyOf, "copyOf(this, newSize)");
        this.d = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf((int[]) this.c, i);
        AbstractC2995aW.p(iArrCopyOf, "copyOf(this, newSize)");
        this.c = iArrCopyOf;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5110ya
    public final C5022xa g(InterfaceC4265ot interfaceC4265ot, long j) {
        long position = interfaceC4265ot.getPosition();
        long jB = b(interfaceC4265ot);
        long peekPosition = interfaceC4265ot.getPeekPosition();
        interfaceC4265ot.advancePeekPosition(Math.max(6, ((C3036av) this.c).c));
        long jB2 = b(interfaceC4265ot);
        long peekPosition2 = interfaceC4265ot.getPeekPosition();
        if (jB > j || jB2 <= j) {
            return jB2 <= j ? new C5022xa(-2, jB2, peekPosition2) : new C5022xa(-1, jB, position);
        }
        return new C5022xa(0, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, peekPosition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        FW.t((C3574h10) this.c);
        CC cc = ((C3574h10) this.c).c.f3693a;
        HashMap map = new HashMap();
        Yf0 yf0G = ((C4229oY) cc.d.keySet()).iterator();
        while (true) {
            AbstractC4272p abstractC4272p = (AbstractC4272p) yf0G;
            if (!abstractC4272p.hasNext()) {
                C3574h10 c3574h10 = (C3574h10) this.c;
                k(e(c3574h10.b, ((R00) this.d).l, map, c3574h10.f4442a));
                return;
            }
            String str = (String) abstractC4272p.next();
            if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals(HttpRequestHeader.Authorization)) {
                map.put(str, (String) FW.H(cc.h(str)));
            }
        }
    }

    public final void j(Uri uri, String str) {
        k(e(2, str, C4405qY.g, uri));
    }

    public final void k(C3574h10 c3574h10) {
        String strC = c3574h10.c.c("CSeq");
        strC.getClass();
        int i = Integer.parseInt(strC);
        FW.s(((R00) this.d).g.get(i) == null);
        ((R00) this.d).g.append(i, c3574h10);
        C3965lY c3965lYH = AbstractC3486g10.h(c3574h10);
        R00.t((R00) this.d, c3965lYH);
        ((R00) this.d).j.b(c3965lYH);
        this.c = c3574h10;
    }

    public final String toString() {
        switch (this.f2803a) {
            case 12:
                return d();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ A70(int i, Object obj, String str, int i2) {
        this.f2803a = i2;
        this.b = i;
        this.c = obj;
        this.d = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A70(C3036av c3036av, int i) {
        this(i, c3036av);
        this.f2803a = 3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A70(RU ru) {
        this.f2803a = 10;
        int i = 1;
        this(ru, i, (Serializable) null, 10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A70(R00 r00, int i) {
        this(r00);
        this.f2803a = 6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A70(S00 s00) {
        this.f2803a = 8;
        int i = 405;
        this(i, s00, "", 8);
    }

    public /* synthetic */ A70(Object obj, int i, Serializable serializable, int i2) {
        this.f2803a = i2;
        this.c = obj;
        this.b = i;
        this.d = serializable;
    }

    public A70(int i, C3662i10 c3662i10, C3965lY c3965lY) {
        this.f2803a = 7;
        this.b = i;
        this.c = c3662i10;
        this.d = AC.j(c3965lY);
    }

    public A70(String str, String[] strArr, int i) {
        this.f2803a = 2;
        this.c = str;
        this.d = strArr;
        this.b = i;
    }

    public A70(C2911Yl c2911Yl) {
        this.f2803a = 5;
        this.c = new SparseArray();
        this.d = c2911Yl;
        this.b = -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5110ya
    public final /* synthetic */ void i() {
    }

    public A70(int i, C3036av c3036av) {
        this.f2803a = 3;
        this.c = c3036av;
        this.b = i;
        this.d = new C2868Wu(0);
    }

    public A70(R00 r00) {
        this.f2803a = 6;
        this.d = r00;
    }
}
