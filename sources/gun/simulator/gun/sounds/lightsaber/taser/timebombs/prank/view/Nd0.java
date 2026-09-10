package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import androidx.core.view.PointerIconCompat;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Nd0 implements Interpolator, C20, InterfaceC2512Jb, BI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3465a;

    public /* synthetic */ Nd0(int i) {
        this.f3465a = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C20
    public final Object apply(Object obj) {
        switch (this.f3465a) {
            case 9:
                C3736ir c3736ir = E20.f;
                throw new Ja0("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 10:
                C3736ir c3736ir2 = E20.f;
                throw new Ja0("Timed out while trying to open db.", (Throwable) obj);
            case 11:
                C3736ir c3736ir3 = E20.f;
                return (List) E20.p(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new Nd0(13));
            case 12:
                Cursor cursor = (Cursor) obj;
                C3736ir c3736ir4 = E20.f;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            case 13:
                Cursor cursor2 = (Cursor) obj;
                C3736ir c3736ir5 = E20.f;
                ArrayList arrayList = new ArrayList();
                while (cursor2.moveToNext()) {
                    C4201o8 c4201o8A = Sd0.a();
                    c4201o8A.b(cursor2.getString(1));
                    c4201o8A.c(JV.b(cursor2.getInt(2)));
                    String string = cursor2.getString(3);
                    c4201o8A.b = string == null ? null : Base64.decode(string, 0);
                    arrayList.add(c4201o8A.a());
                }
                return arrayList;
            case 14:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            case 15:
                C3736ir c3736ir6 = E20.f;
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            case 16:
                Cursor cursor3 = (Cursor) obj;
                C3736ir c3736ir7 = E20.f;
                if (cursor3.moveToNext()) {
                    return Long.valueOf(cursor3.getLong(0));
                }
                return null;
            default:
                Cursor cursor4 = (Cursor) obj;
                C3736ir c3736ir8 = E20.f;
                ArrayList arrayList2 = new ArrayList();
                int length = 0;
                while (cursor4.moveToNext()) {
                    byte[] blob = cursor4.getBlob(0);
                    arrayList2.add(blob);
                    length += blob.length;
                }
                byte[] bArr = new byte[length];
                int length2 = 0;
                for (int i = 0; i < arrayList2.size(); i++) {
                    byte[] bArr2 = (byte[]) arrayList2.get(i);
                    System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                    length2 += bArr2.length;
                }
                return bArr;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2512Jb
    public final InterfaceC2538Kb g(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        boolean z = true;
        int i = 0;
        switch (this.f3465a) {
            case 23:
                C4619sw c4619sw = C4619sw.I;
                C4531rw c4531rw = new C4531rw();
                if (bundle != null) {
                    ClassLoader classLoader = FW.class.getClassLoader();
                    int i2 = Ug0.f3833a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(C4619sw.J);
                C4619sw c4619sw2 = C4619sw.I;
                String str = c4619sw2.f5005a;
                if (string == null) {
                    string = str;
                }
                c4531rw.f4954a = string;
                String string2 = bundle.getString(C4619sw.K);
                if (string2 == null) {
                    string2 = c4619sw2.b;
                }
                c4531rw.b = string2;
                String string3 = bundle.getString(C4619sw.L);
                if (string3 == null) {
                    string3 = c4619sw2.c;
                }
                c4531rw.c = string3;
                c4531rw.d = bundle.getInt(C4619sw.M, c4619sw2.d);
                c4531rw.e = bundle.getInt(C4619sw.N, c4619sw2.e);
                c4531rw.f = bundle.getInt(C4619sw.O, c4619sw2.f);
                c4531rw.g = bundle.getInt(C4619sw.P, c4619sw2.g);
                String string4 = bundle.getString(C4619sw.Q);
                if (string4 == null) {
                    string4 = c4619sw2.i;
                }
                c4531rw.h = string4;
                Metadata metadata = (Metadata) bundle.getParcelable(C4619sw.R);
                if (metadata == null) {
                    metadata = c4619sw2.j;
                }
                c4531rw.i = metadata;
                String string5 = bundle.getString(C4619sw.S);
                if (string5 == null) {
                    string5 = c4619sw2.k;
                }
                c4531rw.j = string5;
                String string6 = bundle.getString(C4619sw.T);
                if (string6 == null) {
                    string6 = c4619sw2.l;
                }
                c4531rw.k = string6;
                c4531rw.l = bundle.getInt(C4619sw.U, c4619sw2.m);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(C4619sw.V + "_" + Integer.toString(i, 36));
                    if (byteArray == null) {
                        c4531rw.m = arrayList;
                        c4531rw.n = (DrmInitData) bundle.getParcelable(C4619sw.W);
                        c4531rw.o = bundle.getLong(C4619sw.X, c4619sw2.p);
                        c4531rw.p = bundle.getInt(C4619sw.Y, c4619sw2.q);
                        c4531rw.q = bundle.getInt(C4619sw.Z, c4619sw2.r);
                        c4531rw.r = bundle.getFloat(C4619sw.a0, c4619sw2.s);
                        c4531rw.s = bundle.getInt(C4619sw.b0, c4619sw2.t);
                        c4531rw.t = bundle.getFloat(C4619sw.c0, c4619sw2.u);
                        c4531rw.u = bundle.getByteArray(C4619sw.d0);
                        c4531rw.v = bundle.getInt(C4619sw.e0, c4619sw2.w);
                        Bundle bundle4 = bundle.getBundle(C4619sw.f0);
                        if (bundle4 != null) {
                            c4531rw.w = (C2879Xf) C2879Xf.j.g(bundle4);
                        }
                        c4531rw.x = bundle.getInt(C4619sw.g0, c4619sw2.y);
                        c4531rw.y = bundle.getInt(C4619sw.h0, c4619sw2.z);
                        c4531rw.z = bundle.getInt(C4619sw.i0, c4619sw2.A);
                        c4531rw.A = bundle.getInt(C4619sw.j0, c4619sw2.B);
                        c4531rw.B = bundle.getInt(C4619sw.k0, c4619sw2.C);
                        c4531rw.C = bundle.getInt(C4619sw.l0, c4619sw2.D);
                        c4531rw.D = bundle.getInt(C4619sw.n0, c4619sw2.E);
                        c4531rw.E = bundle.getInt(C4619sw.o0, c4619sw2.F);
                        c4531rw.F = bundle.getInt(C4619sw.m0, c4619sw2.G);
                        return new C4619sw(c4531rw);
                    }
                    arrayList.add(byteArray);
                    i++;
                }
                break;
            case 24:
                String str2 = C5150yz.e;
                FW.h(bundle.getInt(AbstractC4843vX.f5134a, -1) == 0);
                return bundle.getBoolean(C5150yz.e, false) ? new C5150yz(bundle.getBoolean(C5150yz.f, false)) : new C5150yz();
            case 25:
                String string7 = bundle.getString(C3693iO.h, "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(C3693iO.i);
                C3164cO c3164cO = bundle5 == null ? C3164cO.f : (C3164cO) C3164cO.l.g(bundle5);
                Bundle bundle6 = bundle.getBundle(C3693iO.j);
                C3955lO c3955lO = bundle6 == null ? C3955lO.I : (C3955lO) C3955lO.q0.g(bundle6);
                Bundle bundle7 = bundle.getBundle(C3693iO.k);
                YN yn = bundle7 == null ? YN.m : (YN) XN.l.g(bundle7);
                Bundle bundle8 = bundle.getBundle(C3693iO.l);
                return new C3693iO(string7, yn, null, c3164cO, c3955lO, bundle8 == null ? C3429fO.d : (C3429fO) C3429fO.h.g(bundle8));
            case 26:
                WN wn = new WN();
                YN yn2 = XN.f;
                long j = bundle.getLong(XN.g, yn2.f3965a);
                FW.h(j >= 0);
                wn.f3918a = j;
                long j2 = bundle.getLong(XN.h, yn2.b);
                if (j2 != Long.MIN_VALUE && j2 < 0) {
                    z = false;
                }
                FW.h(z);
                wn.b = j2;
                wn.c = bundle.getBoolean(XN.i, yn2.c);
                wn.d = bundle.getBoolean(XN.j, yn2.d);
                wn.e = bundle.getBoolean(XN.k, yn2.e);
                return new YN(wn);
            case 27:
                return new C3164cO(bundle.getLong(C3164cO.g, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET), bundle.getLong(C3164cO.h, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET), bundle.getLong(C3164cO.i, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET), bundle.getFloat(C3164cO.j, -3.4028235E38f), bundle.getFloat(C3164cO.k, -3.4028235E38f));
            case 28:
                C4568sM c4568sM = new C4568sM(9);
                c4568sM.b = (Uri) bundle.getParcelable(C3429fO.e);
                c4568sM.c = bundle.getString(C3429fO.f);
                c4568sM.d = bundle.getBundle(C3429fO.g);
                return new C3429fO(c4568sM);
            default:
                C3867kO c3867kO = new C3867kO();
                c3867kO.f4596a = bundle.getCharSequence(C3955lO.J);
                c3867kO.b = bundle.getCharSequence(C3955lO.K);
                c3867kO.c = bundle.getCharSequence(C3955lO.L);
                c3867kO.d = bundle.getCharSequence(C3955lO.M);
                c3867kO.e = bundle.getCharSequence(C3955lO.N);
                c3867kO.f = bundle.getCharSequence(C3955lO.O);
                c3867kO.g = bundle.getCharSequence(C3955lO.P);
                byte[] byteArray2 = bundle.getByteArray(C3955lO.S);
                String str3 = C3955lO.l0;
                Integer numValueOf = bundle.containsKey(str3) ? Integer.valueOf(bundle.getInt(str3)) : null;
                c3867kO.j = byteArray2 != null ? (byte[]) byteArray2.clone() : null;
                c3867kO.k = numValueOf;
                c3867kO.l = (Uri) bundle.getParcelable(C3955lO.T);
                c3867kO.x = bundle.getCharSequence(C3955lO.e0);
                c3867kO.y = bundle.getCharSequence(C3955lO.f0);
                c3867kO.z = bundle.getCharSequence(C3955lO.g0);
                c3867kO.C = bundle.getCharSequence(C3955lO.j0);
                c3867kO.D = bundle.getCharSequence(C3955lO.k0);
                c3867kO.E = bundle.getCharSequence(C3955lO.m0);
                c3867kO.G = bundle.getBundle(C3955lO.p0);
                String str4 = C3955lO.Q;
                if (bundle.containsKey(str4) && (bundle3 = bundle.getBundle(str4)) != null) {
                    c3867kO.h = (AbstractC4843vX) AbstractC4843vX.b.g(bundle3);
                }
                String str5 = C3955lO.R;
                if (bundle.containsKey(str5) && (bundle2 = bundle.getBundle(str5)) != null) {
                    c3867kO.i = (AbstractC4843vX) AbstractC4843vX.b.g(bundle2);
                }
                String str6 = C3955lO.U;
                if (bundle.containsKey(str6)) {
                    c3867kO.m = Integer.valueOf(bundle.getInt(str6));
                }
                String str7 = C3955lO.V;
                if (bundle.containsKey(str7)) {
                    c3867kO.n = Integer.valueOf(bundle.getInt(str7));
                }
                String str8 = C3955lO.W;
                if (bundle.containsKey(str8)) {
                    c3867kO.o = Integer.valueOf(bundle.getInt(str8));
                }
                String str9 = C3955lO.o0;
                if (bundle.containsKey(str9)) {
                    c3867kO.p = Boolean.valueOf(bundle.getBoolean(str9));
                }
                String str10 = C3955lO.X;
                if (bundle.containsKey(str10)) {
                    c3867kO.q = Boolean.valueOf(bundle.getBoolean(str10));
                }
                String str11 = C3955lO.Y;
                if (bundle.containsKey(str11)) {
                    c3867kO.r = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = C3955lO.Z;
                if (bundle.containsKey(str12)) {
                    c3867kO.s = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = C3955lO.a0;
                if (bundle.containsKey(str13)) {
                    c3867kO.t = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = C3955lO.b0;
                if (bundle.containsKey(str14)) {
                    c3867kO.u = Integer.valueOf(bundle.getInt(str14));
                }
                String str15 = C3955lO.c0;
                if (bundle.containsKey(str15)) {
                    c3867kO.v = Integer.valueOf(bundle.getInt(str15));
                }
                String str16 = C3955lO.d0;
                if (bundle.containsKey(str16)) {
                    c3867kO.w = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = C3955lO.h0;
                if (bundle.containsKey(str17)) {
                    c3867kO.A = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = C3955lO.i0;
                if (bundle.containsKey(str18)) {
                    c3867kO.B = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = C3955lO.n0;
                if (bundle.containsKey(str19)) {
                    c3867kO.F = Integer.valueOf(bundle.getInt(str19));
                }
                return new C3955lO(c3867kO);
        }
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f) {
        switch (this.f3465a) {
            case 0:
                return Transition.lambda$getInterpolator$1(f);
            case 1:
                return Transition.lambda$getInterpolator$2(f);
            case 2:
                return Transition.lambda$getInterpolator$3(f);
            case 3:
                return Transition.lambda$getInterpolator$4(f);
            case 4:
                return Transition.lambda$getInterpolator$5(f);
            case 5:
                return Transition.lambda$getInterpolator$6(f);
            default:
                return Transition.lambda$getInterpolator$7(f);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
    public final void invoke(Object obj) {
        JU ju = (JU) obj;
        switch (this.f3465a) {
            case 20:
                int i = C2736Rs.k0;
                ju.n(new C2321Bs(2, new C3034at(1), PointerIconCompat.TYPE_HELP));
                break;
            case 21:
                ju.onSeekProcessed();
                break;
            default:
                ju.onRenderedFirstFrame();
                break;
        }
    }
}
