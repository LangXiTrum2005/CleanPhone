package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SplashActivity;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3491g4 implements InterfaceC5110ya, L30, LT, InterfaceC2951Zz, BS, InterfaceC3960lT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4400a;
    public Object b;
    public Object c;

    public C3491g4(int i) {
        this.f4400a = i;
        if (i == 8) {
            this.b = new ByteArrayOutputStream(512);
            this.c = new DataOutputStream((ByteArrayOutputStream) this.b);
            return;
        }
        if (i == 15) {
            Yn0 yn0 = new Yn0(0);
            this.b = yn0;
            this.c = new Dn0(yn0, 0);
        } else if (i == 17) {
            Yn0 yn1 = new Yn0(1);
            this.b = yn1;
            this.c = new Dn0(yn1, 1);
        } else if (i == 19) {
            Yn0 yn2 = new Yn0(2);
            this.b = yn2;
            this.c = new Dn0(yn2, 2);
        } else {
            if (i != 24) {
                return;
            }
            this.c = new SparseArray();
            this.b = "";
        }
    }

    public static C3491g4 o(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new C3491g4(12, channel, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            channel = null;
            fileLockLock = null;
        }
    }

    public final File A() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        C4266ou c4266ou = (C4266ou) this.c;
                        c4266ou.a();
                        this.b = new File(c4266ou.f4812a.getFilesDir(), "PersistedInstallation." + ((C4266ou) this.c).c() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.b;
    }

    public final void B(C3761j8 c3761j8) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c3761j8.f4538a);
            jSONObject.put(HttpResponseHeader.Status, c3761j8.b.ordinal());
            jSONObject.put("AuthToken", c3761j8.c);
            jSONObject.put("RefreshToken", c3761j8.d);
            jSONObject.put("TokenCreationEpochInSecs", c3761j8.f);
            jSONObject.put("ExpiresInSecs", c3761j8.e);
            jSONObject.put("FisError", c3761j8.g);
            C4266ou c4266ou = (C4266ou) this.c;
            c4266ou.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", c4266ou.f4812a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(A())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final void C() {
        X0 x0 = (X0) this.c;
        x0.getClass();
        C3.Z().X(x0.d, new U0());
        x0.o().getClass();
        x0.t().getClass();
        E80 e80 = (E80) this.b;
        if (e80 != null) {
            SplashActivity splashActivity = e80.f3011a;
            splashActivity.toAty(MainActivity.class);
            splashActivity.finish();
        }
    }

    public final void D(Exception exc, boolean z) {
        this.c = null;
        AC acJ = AC.j((Set) this.b);
        ((Set) this.b).clear();
        C5086yC c5086yCL = acJ.listIterator(0);
        while (c5086yCL.hasNext()) {
            com.google.android.exoplayer2.drm.a aVar = (com.google.android.exoplayer2.drm.a) c5086yCL.next();
            aVar.getClass();
            aVar.i(z ? 1 : 3, exc);
        }
    }

    public final C3761j8 E() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(A());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt(HttpResponseHeader.Status, 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = C3761j8.h;
        C3274de0 c3274de0 = new C3274de0(5);
        c3274de0.f = 0L;
        c3274de0.k(EnumC3699iU.f4502a);
        c3274de0.e = 0L;
        c3274de0.f4281a = strOptString;
        c3274de0.k(EnumC3699iU.values()[iOptInt]);
        c3274de0.c = strOptString2;
        c3274de0.d = strOptString3;
        c3274de0.f = Long.valueOf(jOptLong);
        c3274de0.e = Long.valueOf(jOptLong2);
        c3274de0.g = strOptString4;
        return c3274de0.f();
    }

    public final void F() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException unused) {
        }
    }

    public final void G() {
        C4626t1 c4626t1X = x(1);
        if (c4626t1X != null) {
            c4626t1X.f = 0;
        }
    }

    public final void H(int i, String str) {
        C4626t1 c4626t1;
        SparseArray sparseArray = (SparseArray) this.c;
        synchronized (this) {
            SparseArray sparseArray2 = (SparseArray) this.c;
            C4626t1 c4626t2 = new C4626t1();
            c4626t2.f5010a = -1;
            c4626t2.b = -1L;
            c4626t2.c = -1L;
            c4626t2.d = -1L;
            c4626t2.f = 0;
            c4626t2.e = str;
            c4626t1 = (C4626t1) sparseArray2.get(i, c4626t2);
        }
        c4626t1.e = str;
        sparseArray.put(i, c4626t1);
    }

    public final void I() {
        C4626t1 c4626t1X = x(1);
        if (c4626t1X != null) {
            ((SparseArray) this.c).put(1, c4626t1X);
        }
    }

    public final void J(long j) {
        C4626t1 c4626t1X = x(1);
        if (c4626t1X != null) {
            c4626t1X.d = j;
            ((SparseArray) this.c).put(1, c4626t1X);
        }
    }

    public final void K(long j) {
        C4626t1 c4626t1X = x(1);
        if (c4626t1X != null) {
            c4626t1X.c = j;
            ((SparseArray) this.c).put(1, c4626t1X);
        }
    }

    public final void L(long j) {
        C4626t1 c4626t1X = x(1);
        if (c4626t1X != null) {
            c4626t1X.b = j;
            ((SparseArray) this.c).put(1, c4626t1X);
        }
    }

    public final void M(int i) {
        C4626t1 c4626t1X = x(1);
        if (c4626t1X != null) {
            c4626t1X.f5010a = i;
            if (1 == i) {
                c4626t1X.f = 0;
                c4626t1X.c = System.currentTimeMillis();
            }
            if (i == 2) {
                c4626t1X.f++;
            }
            ((SparseArray) this.c).put(1, c4626t1X);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L30
    public final void a(JT jt) {
        if (jt.t() == 0 && (jt.t() & 128) != 0) {
            jt.F(6);
            int iA = jt.a() / 4;
            for (int i = 0; i < iA; i++) {
                Uh0 uh0 = (Uh0) this.b;
                jt.d(uh0.d, 0, 4);
                uh0.p(0);
                int i2 = ((Uh0) this.b).i(16);
                ((Uh0) this.b).s(3);
                if (i2 == 0) {
                    ((Uh0) this.b).s(13);
                } else {
                    int i3 = ((Uh0) this.b).i(13);
                    if (((C4240oe0) this.c).f.get(i3) == null) {
                        C4240oe0 c4240oe0 = (C4240oe0) this.c;
                        c4240oe0.f.put(i3, new M30(new C4152ne0(c4240oe0, i3)));
                        ((C4240oe0) this.c).l++;
                    }
                }
            }
            C4240oe0 c4240oe1 = (C4240oe0) this.c;
            if (c4240oe1.f4800a != 2) {
                c4240oe1.f.remove(0);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3960lT
    public final void c() {
        ((C4312pT) this.c).d.set(2);
        synchronized (this) {
            try {
                if (!TextUtils.isEmpty(((C4312pT) this.c).i)) {
                    C4312pT c4312pT = (C4312pT) this.c;
                    if (c4312pT.g.get(c4312pT.i) != null) {
                        C4312pT c4312pT2 = (C4312pT) this.c;
                        AbstractC3950lJ.z(c4312pT2.g.get(c4312pT2.i));
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void d(A70 a70) {
        ES es = (ES) this.b;
        if (es != null) {
            es.d(a70);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void e(InterfaceC3240dB interfaceC3240dB) {
        InterfaceC3592hB interfaceC3592hB = (InterfaceC3592hB) interfaceC3240dB;
        ES es = (ES) this.b;
        if (es != null) {
            es.e(new Rm0(interfaceC3592hB));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3960lT
    public final void f(List list) {
        GB gb = null;
        if (list.isEmpty()) {
            ((C4312pT) this.c).d.set(2);
            synchronized (this) {
                try {
                    if (!TextUtils.isEmpty(((C4312pT) this.c).i)) {
                        C4312pT c4312pT = (C4312pT) this.c;
                        if (c4312pT.g.get(c4312pT.i) != null) {
                            C4312pT c4312pT2 = (C4312pT) this.c;
                            AbstractC3950lJ.z(c4312pT2.g.get(c4312pT2.i));
                            throw null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ((C4312pT) this.c).d.set(1);
        ((C4312pT) this.c).c.clear();
        ((C4312pT) this.c).c.addAll(list);
        synchronized (this) {
            try {
                if (!TextUtils.isEmpty(((C4312pT) this.c).i)) {
                    C4312pT c4312pT3 = (C4312pT) this.c;
                    if (c4312pT3.f.get(c4312pT3.i) != null) {
                        System.currentTimeMillis();
                        if (!((C4312pT) this.c).g.isEmpty()) {
                            C4312pT c4312pT4 = (C4312pT) this.c;
                            if (c4312pT4.g.get(c4312pT4.i) != null) {
                                C4312pT c4312pT5 = (C4312pT) this.c;
                                AbstractC3950lJ.z(c4312pT5.g.get(c4312pT5.i));
                                throw null;
                            }
                        }
                        C4312pT c4312pT6 = (C4312pT) this.c;
                        GB gbA = ((C3818jn0) ((KS) c4312pT6.f.get(c4312pT6.i))).a(list);
                        if (gbA == null) {
                            ((C4312pT) this.c).getClass();
                            C3044b1.b.d().getClass();
                        } else {
                            gb = gbA;
                        }
                        if (gb != null) {
                            String str = ((C4312pT) this.c).f4835a;
                            byte[] bArr = {-75, 76, 73, -32, 61, 35, 69, 77, -92, 107, 74, -32, 39, 43, 84, 77, -105, 53, 39, -19, 38, 43, 87, 105, -127, 47, 104, -17, 10, 37, 93, 78, -116, 104, 65, -28, 61, 41, 91, 123, -112, 108, 100, -28, 58, 57, 27, 1, -59, 34, 57, -95, 43, 35, 93, 76, -95, 110, 115, -32, 105};
                            byte[] bArr2 = {-27, com.umeng.analytics.pro.cw.m, 7, -127, 73, 74, 51, 40};
                            int i = 0;
                            int i2 = 0;
                            while (i < 61) {
                                if (i2 >= 8) {
                                    i2 = 0;
                                }
                                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                                i++;
                                i2++;
                            }
                            new String(bArr, StandardCharsets.UTF_8);
                            C4312pT c4312pT7 = (C4312pT) this.c;
                            c4312pT7.e = true;
                            c4312pT7.a((ViewGroup) ((WeakReference) this.b).get(), ((C4312pT) this.c).c, 2, gb);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f5  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5110ya
    public final C5022xa g(InterfaceC4265ot interfaceC4265ot, long j) {
        int iD;
        C5022xa c5022xa;
        long position = interfaceC4265ot.getPosition();
        int iMin = (int) Math.min(20000L, interfaceC4265ot.getLength() - position);
        ((JT) this.c).B(iMin);
        interfaceC4265ot.peekFully(((JT) this.c).f3266a, 0, iMin);
        JT jt = (JT) this.c;
        int i = -1;
        long j2 = -9223372036854775807L;
        int i2 = -1;
        while (jt.a() >= 4) {
            if (C2816Uu.d(jt.b, jt.f3266a) != 442) {
                jt.F(1);
            } else {
                jt.F(4);
                long jC = CW.c(jt);
                if (jC != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    long jB = ((Mc0) this.b).b(jC);
                    if (jB > j) {
                        if (j2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            return new C5022xa(-1, jB, position);
                        }
                        c5022xa = new C5022xa(0, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, position + ((long) i2));
                    } else if (100000 + jB > j) {
                        c5022xa = new C5022xa(0, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, position + ((long) jt.b));
                    } else {
                        i2 = jt.b;
                        j2 = jB;
                    }
                    return c5022xa;
                }
                int i3 = jt.c;
                if (jt.a() >= 10) {
                    jt.F(9);
                    int iT = jt.t() & 7;
                    if (jt.a() >= iT) {
                        jt.F(iT);
                        if (jt.a() >= 4) {
                            if (C2816Uu.d(jt.b, jt.f3266a) != 443) {
                                while (jt.a() >= 4) {
                                    iD = C2816Uu.d(jt.b, jt.f3266a);
                                    if (iD == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            jt.F(4);
                            int iY = jt.y();
                            if (jt.a() < iY) {
                                jt.E(i3);
                            } else {
                                jt.F(iY);
                                while (jt.a() >= 4) {
                                    iD = C2816Uu.d(jt.b, jt.f3266a);
                                    if (iD == 442 || iD == 441 || (iD >>> 8) != 1) {
                                        break;
                                    }
                                    jt.F(4);
                                    if (jt.a() < 2) {
                                        jt.E(i3);
                                        break;
                                    }
                                    jt.E(Math.min(jt.c, jt.b + jt.y()));
                                }
                            }
                        } else {
                            jt.E(i3);
                        }
                    } else {
                        jt.E(i3);
                    }
                } else {
                    jt.E(i3);
                }
                i = jt.b;
            }
        }
        return j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? new C5022xa(-2, j2, position + ((long) i)) : C5022xa.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void h(boolean z) {
        ES es = (ES) this.b;
        if (es != null) {
            es.h(z);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5110ya
    public final void i() {
        JT jt = (JT) this.c;
        byte[] bArr = Ug0.e;
        jt.getClass();
        jt.C(bArr, bArr.length);
    }

    public final JSONObject j() {
        switch (this.f4400a) {
            case 16:
                break;
            case 18:
                break;
        }
        return (JSONObject) this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2951Zz
    public final LT k() {
        return new C3491g4(9, ((InterfaceC2951Zz) this.b).k(), (List) this.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LT
    public final Object l(Uri uri, C4692tl c4692tl) {
        InterfaceC3564gu interfaceC3564gu = (InterfaceC3564gu) ((LT) this.b).l(uri, c4692tl);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? interfaceC3564gu : (InterfaceC3564gu) interfaceC3564gu.copy((List) this.c);
    }

    public final void m(JSONObject jSONObject) {
        switch (this.f4400a) {
            case 16:
                this.b = jSONObject;
                break;
            case 17:
            default:
                this.b = jSONObject;
                break;
            case 18:
                this.b = jSONObject;
                break;
        }
    }

    public final void n(JSONObject jSONObject, HashSet hashSet, long j) {
        switch (this.f4400a) {
            case 16:
                ((C3844k50) this.c).g(new AsyncTaskC3646ho0(this, hashSet, jSONObject, j, 0));
                break;
            case 17:
            default:
                ((C3844k50) this.c).d(new AsyncTaskC3820jo0(this, hashSet, jSONObject, j, 0));
                break;
            case 18:
                ((C3844k50) this.c).h(new AsyncTaskC3733io0(this, hashSet, jSONObject, j, 0));
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdClicked() {
        ES es = (ES) this.b;
        if (es != null) {
            es.onAdClicked();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdClosed() {
        ES es = (ES) this.b;
        if (es != null) {
            es.onAdClosed();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdImpression() {
        ES es = (ES) this.b;
        if (es != null) {
            es.onAdImpression();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdShowed() {
        ES es = (ES) this.b;
        if (es != null) {
            es.onAdShowed();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2951Zz
    public final LT p(C2847Vz c2847Vz, C2743Rz c2743Rz) {
        return new C3491g4(9, ((InterfaceC2951Zz) this.b).p(c2847Vz, c2743Rz), (List) this.c);
    }

    public final void q() {
        switch (this.f4400a) {
            case 16:
                ((C3844k50) this.c).g(new Zn0(this));
                break;
            case 17:
            default:
                ((C3844k50) this.c).d(new AsyncTaskC3117bo0(this));
                break;
            case 18:
                ((C3844k50) this.c).h(new AsyncTaskC3028ao0(this));
                break;
        }
    }

    public final void r(JSONObject jSONObject, HashSet hashSet, long j) {
        switch (this.f4400a) {
            case 16:
                ((C3844k50) this.c).g(new AsyncTaskC3646ho0(this, hashSet, jSONObject, j, 1));
                break;
            case 17:
            default:
                ((C3844k50) this.c).d(new AsyncTaskC3820jo0(this, hashSet, jSONObject, j, 1));
                break;
            case 18:
                ((C3844k50) this.c).h(new AsyncTaskC3733io0(this, hashSet, jSONObject, j, 1));
                break;
        }
    }

    public final boolean s(int i) {
        return ((C3125bv) this.b).f4194a.get(i);
    }

    public final void t(InterfaceC4353pt interfaceC4353pt, C4416qe0 c4416qe0) {
        for (int i = 0; i < ((InterfaceC4326pd0[]) this.c).length; i++) {
            c4416qe0.a();
            c4416qe0.b();
            InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(c4416qe0.d, 3);
            C4619sw c4619sw = (C4619sw) ((List) this.b).get(i);
            String str = c4619sw.l;
            FW.i(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = c4619sw.f5005a;
            if (str2 == null) {
                c4416qe0.b();
                str2 = c4416qe0.e;
            }
            C4531rw c4531rw = new C4531rw();
            c4531rw.f4954a = str2;
            c4531rw.k = str;
            c4531rw.d = c4619sw.d;
            c4531rw.c = c4619sw.c;
            c4531rw.C = c4619sw.D;
            c4531rw.m = c4619sw.n;
            interfaceC4326pd0Track.e(new C4619sw(c4531rw));
            ((InterfaceC4326pd0[]) this.c)[i] = interfaceC4326pd0Track;
        }
    }

    public final void u(C2599Ml c2599Ml) {
        synchronized (c2599Ml) {
        }
        Object obj = this.b;
        if (((Handler) obj) != null) {
            ((Handler) obj).post(new RunnableC4111n7(this, c2599Ml, 1));
        }
    }

    public final byte[] v(EventMessage eventMessage) {
        ((ByteArrayOutputStream) this.b).reset();
        try {
            DataOutputStream dataOutputStream = (DataOutputStream) this.c;
            dataOutputStream.writeBytes(eventMessage.schemeIdUri);
            dataOutputStream.writeByte(0);
            String str = eventMessage.value;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = (DataOutputStream) this.c;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            ((DataOutputStream) this.c).writeLong(eventMessage.durationMs);
            ((DataOutputStream) this.c).writeLong(eventMessage.id);
            ((DataOutputStream) this.c).write(eventMessage.messageData);
            ((DataOutputStream) this.c).flush();
            return ((ByteArrayOutputStream) this.b).toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final String w(int i) {
        C4626t1 c4626t1X = x(i);
        return c4626t1X == null ? "" : c4626t1X.e;
    }

    public final synchronized C4626t1 x(int i) {
        return (C4626t1) ((SparseArray) this.c).get(i);
    }

    public final long y() {
        C4626t1 c4626t1X = x(1);
        if (c4626t1X != null) {
            return c4626t1X.c;
        }
        return -1L;
    }

    public final int z() {
        C4626t1 c4626t1X = x(1);
        if (c4626t1X != null) {
            return c4626t1X.f5010a;
        }
        return -1;
    }

    public /* synthetic */ C3491g4(int i, Object obj, Object obj2) {
        this.f4400a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3491g4(Mc0 mc0, int i) {
        this(mc0);
        this.f4400a = 5;
    }

    public /* synthetic */ C3491g4(Object obj, int i) {
        this.f4400a = i;
        this.c = obj;
    }

    public /* synthetic */ C3491g4(Object obj, Object obj2, int i) {
        this.f4400a = i;
        this.c = obj;
        this.b = obj2;
    }

    public C3491g4(X0 x0, E80 e80) {
        this.f4400a = 21;
        this.c = x0;
        this.b = e80;
    }

    public C3491g4(List list) {
        this.f4400a = 6;
        this.b = list;
        this.c = new InterfaceC4326pd0[list.size()];
    }

    public C3491g4(AW aw) {
        this.f4400a = 14;
        this.c = Collections.synchronizedMap(new HashMap());
        this.b = aw;
    }

    public C3491g4(Mc0 mc0) {
        this.f4400a = 5;
        this.b = mc0;
        this.c = new JT();
    }

    public C3491g4(C3125bv c3125bv, SparseArray sparseArray) {
        this.f4400a = 0;
        this.b = c3125bv;
        SparseBooleanArray sparseBooleanArray = c3125bv.f4194a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iA = c3125bv.a(i);
            C3403f4 c3403f4 = (C3403f4) sparseArray.get(iA);
            c3403f4.getClass();
            sparseArray2.append(iA, c3403f4);
        }
        this.c = sparseArray2;
    }

    public C3491g4(Handler handler, SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os) {
        this.f4400a = 1;
        this.b = handler;
        this.c = surfaceHolderCallbackC2658Os;
    }

    public C3491g4(C4240oe0 c4240oe0) {
        this.f4400a = 7;
        this.c = c4240oe0;
        this.b = new Uh0(new byte[4], 2, (Object) null);
    }

    public C3491g4() {
        this.f4400a = 2;
        this.b = new HashSet();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L30
    public final void b(Mc0 mc0, InterfaceC4353pt interfaceC4353pt, C4416qe0 c4416qe0) {
    }
}
