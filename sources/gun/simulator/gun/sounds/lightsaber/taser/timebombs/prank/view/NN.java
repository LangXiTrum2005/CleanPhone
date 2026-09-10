package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.WorkRequest;
import com.badlogic.gdx.Input;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bytedance.sdk.component.LD.Lxb.IeN;
import com.bytedance.sdk.component.LD.Lxb.VVE;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd;
import com.google.ads.mediation.pangle.renderer.PangleAppOpenAd;
import com.google.ads.mediation.pangle.renderer.PangleNativeAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.MissingFormatArgumentException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class NN implements ModelLoaderFactory, InterfaceC4724u6, InterfaceC2693Qb, InterfaceC4257on, GG, com.bytedance.sdk.component.LD.Lxb.lk, MediaViewListener, PAGAppOpenAdInteractionListener, PAGNativeAdInteractionListener, InterfaceC4968wt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3455a;
    public final Object b;

    public NN(int i, int i2) {
        this.f3455a = i;
        if (i == 24) {
            this.b = new SparseArray();
            return;
        }
        if (i == 25) {
            this.b = new CopyOnWriteArrayList();
        } else if (i == 29) {
            this.b = null;
        } else {
            char[] cArr = Tg0.f3783a;
            this.b = new ArrayDeque(0);
        }
    }

    public static void A(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public static ByteArrayInputStream i(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    public static boolean t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01ab A[Catch: all -> 0x01d4, TryCatch #5 {all -> 0x01d4, blocks: (B:77:0x01a6, B:79:0x01ab, B:80:0x01ae, B:82:0x01b9, B:84:0x01cd), top: B:103:0x01a6 }] */
    @Override // com.bytedance.sdk.component.LD.Lxb.lk
    public final void Lxb(com.bytedance.sdk.component.LD.Lxb.LD ld, IeN ieN) {
        VVE vveLc;
        InputStream inputStream;
        long length;
        long j;
        if (ieN == null) {
            ((NG) this.b).g = false;
            NG ng = (NG) this.b;
            ng.getClass();
            ng.f3449a = -1L;
            return;
        }
        InputStream inputStreamLk = null;
        try {
            ((NG) this.b).g = ieN.ZU();
            if (((NG) this.b).g) {
                vveLc = ieN.lc();
                try {
                    if (((NG) this.b).g && vveLc != null) {
                        ((NG) this.b).f3449a = vveLc.Lxb() + ((NG) this.b).e;
                        inputStreamLk = vveLc.lk();
                    }
                    inputStream = inputStreamLk;
                    if (inputStream == null) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        if (vveLc != null) {
                            vveLc.close();
                        }
                        ieN.close();
                        if (((NG) this.b).g && ((NG) this.b).c.length() == ((NG) this.b).f3449a) {
                            NG.b((NG) this.b);
                            return;
                        }
                        return;
                    }
                    try {
                        byte[] bArr = new byte[8192];
                        long j2 = ((NG) this.b).e;
                        long j3 = 0;
                        long j4 = 0;
                        int i = 0;
                        while (true) {
                            int i2 = inputStream.read(bArr, i, 8192 - i);
                            if (i2 == -1) {
                                break;
                            }
                            i += i2;
                            j4 += (long) i2;
                            boolean z = j4 % PlaybackStateCompat.ACTION_PLAY_FROM_URI == j3 || j4 == ((NG) this.b).f3449a - ((NG) this.b).e;
                            long j5 = ((NG) this.b).f3449a;
                            Object obj = this.b;
                            long j6 = ((NG) obj).e;
                            ((NG) obj).i.STP();
                            ((NG) this.b).i.NXR();
                            if (z) {
                                synchronized (((NG) this.b).b) {
                                    RandomAccessFile randomAccessFile = ((NG) this.b).h;
                                    int iIntValue = Long.valueOf(j2).intValue();
                                    ((NG) this.b).i.STP();
                                    try {
                                        randomAccessFile.seek(iIntValue);
                                        randomAccessFile.write(bArr, 0, i);
                                    } catch (Throwable unused2) {
                                    }
                                }
                                j2 += (long) i;
                                i = 0;
                            }
                            j3 = 0;
                        }
                        Object obj2 = this.b;
                        long j7 = ((NG) obj2).e;
                        long j8 = ((NG) obj2).f3449a;
                        long j9 = ((NG) this.b).f3449a;
                        Object obj3 = this.b;
                        long j10 = ((NG) obj3).e;
                        ((NG) obj3).i.NXR();
                        inputStreamLk = inputStream;
                    } catch (Throwable unused3) {
                        try {
                            ((NG) this.b).g = false;
                            Object obj4 = this.b;
                            ((NG) obj4).getClass();
                            ((NG) obj4).f3449a = -1L;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable unused4) {
                                    return;
                                }
                            }
                            if (vveLc != null) {
                                vveLc.close();
                            }
                            ieN.close();
                            if (((NG) this.b).g) {
                                if (length == j) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        } finally {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                    if (vveLc != null) {
                                        vveLc.close();
                                    }
                                    ieN.close();
                                    if (((NG) this.b).g && ((NG) this.b).c.length() == ((NG) this.b).f3449a) {
                                        NG.b((NG) this.b);
                                    }
                                } catch (Throwable unused5) {
                                }
                            } else {
                                if (vveLc != null) {
                                    vveLc.close();
                                }
                                ieN.close();
                                if (((NG) this.b).g) {
                                    NG.b((NG) this.b);
                                }
                            }
                        }
                    }
                } catch (Throwable unused6) {
                    inputStream = null;
                }
            } else {
                ((NG) this.b).g = false;
                Object obj5 = this.b;
                ((NG) obj5).getClass();
                ((NG) obj5).f3449a = -1L;
                vveLc = null;
            }
            if (inputStreamLk != null) {
                try {
                    inputStreamLk.close();
                } catch (Throwable unused7) {
                    return;
                }
            }
            if (vveLc != null) {
                vveLc.close();
            }
            ieN.close();
            if (((NG) this.b).g && ((NG) this.b).c.length() == ((NG) this.b).f3449a) {
                NG.b((NG) this.b);
            }
        } catch (Throwable unused8) {
            vveLc = null;
            inputStream = null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2693Qb
    public final Class a() {
        switch (this.f3455a) {
            case 7:
                return ByteBuffer.class;
            default:
                return InputStream.class;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4257on
    public final int b() {
        return (e() << 8) | e();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4257on
    public final int c(int i, byte[] bArr) throws C4169nn {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.b).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new C4169nn();
        }
        return i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GG
    public final void d(UG ug) throws Throwable {
        ((C4172no0) this.b).c.addAndGet(ug.c.get());
        ((C4172no0) this.b).d.addAndGet(ug.d.get());
        synchronized (ug.o) {
            ug.o.notifyAll();
        }
        if (ug.j.get() == 2) {
            C4172no0 c4172no0 = (C4172no0) this.b;
            c4172no0.o.a(c4172no0.f(), null);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4257on
    public final short e() throws IOException {
        int i = ((InputStream) this.b).read();
        if (i != -1) {
            return (short) i;
        }
        throw new C4169nn();
    }

    public final void f() {
        RandomAccessFile randomAccessFile = (RandomAccessFile) this.b;
        Handler handler = PK.f3546a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void g(long j) throws C3433fS {
        try {
            ((RandomAccessFile) this.b).seek(j);
        } catch (IOException e) {
            throw new C3433fS(e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5194zW
    public final Object get() {
        InterfaceC2438Gf interfaceC2438Gf = (InterfaceC2438Gf) ((InterfaceC5194zW) this.b).get();
        HashMap map = new HashMap();
        HV hv = HV.f3174a;
        C4568sM c4568sM = new C4568sM(8);
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            throw new NullPointerException("Null flags");
        }
        c4568sM.d = setEmptySet;
        c4568sM.b = Long.valueOf(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        c4568sM.c = 86400000L;
        map.put(hv, c4568sM.h());
        HV hv2 = HV.c;
        C4568sM c4568sM2 = new C4568sM(8);
        Set setEmptySet2 = Collections.emptySet();
        if (setEmptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        c4568sM2.d = setEmptySet2;
        c4568sM2.b = 1000L;
        c4568sM2.c = 86400000L;
        map.put(hv2, c4568sM2.h());
        HV hv3 = HV.b;
        C4568sM c4568sM3 = new C4568sM(8);
        Set setEmptySet3 = Collections.emptySet();
        if (setEmptySet3 == null) {
            throw new NullPointerException("Null flags");
        }
        c4568sM3.d = setEmptySet3;
        c4568sM3.b = 86400000L;
        c4568sM3.c = 86400000L;
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(EnumC3314e30.b)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        c4568sM3.d = setUnmodifiableSet;
        map.put(hv3, c4568sM3.h());
        if (interfaceC2438Gf == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (map.keySet().size() < HV.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new C3849k8(interfaceC2438Gf, map);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x029a  */
    public final void h(int i, int i2, InterfaceC4265ot interfaceC4265ot) throws KT {
        OM om;
        OM om2;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        PM pm = (PM) this.b;
        SparseArray sparseArray = pm.c;
        int i7 = 4;
        int i8 = 1;
        int i9 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (pm.G != 2) {
                    return;
                }
                OM om3 = (OM) sparseArray.get(pm.M);
                if (pm.P != 4 || !"V_VP9".equals(om3.b)) {
                    interfaceC4265ot.skipFully(i2);
                    return;
                }
                JT jt = pm.n;
                jt.B(i2);
                interfaceC4265ot.readFully(jt.f3266a, 0, i2);
                return;
            }
            if (i == 16877) {
                pm.e(i);
                OM om4 = pm.u;
                int i10 = om4.g;
                if (i10 != 1685485123 && i10 != 1685480259) {
                    interfaceC4265ot.skipFully(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                om4.N = bArr;
                interfaceC4265ot.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                pm.e(i);
                OM om5 = pm.u;
                byte[] bArr2 = new byte[i2];
                om5.i = bArr2;
                interfaceC4265ot.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                interfaceC4265ot.readFully(bArr3, 0, i2);
                pm.e(i);
                pm.u.j = new C4238od0(1, bArr3, 0, 0);
                return;
            }
            if (i == 21419) {
                JT jt2 = pm.i;
                Arrays.fill(jt2.f3266a, (byte) 0);
                interfaceC4265ot.readFully(jt2.f3266a, 4 - i2, i2);
                jt2.E(0);
                pm.w = (int) jt2.u();
                return;
            }
            if (i == 25506) {
                pm.e(i);
                OM om6 = pm.u;
                byte[] bArr4 = new byte[i2];
                om6.k = bArr4;
                interfaceC4265ot.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw KT.a("Unexpected id: " + i, null);
            }
            pm.e(i);
            OM om7 = pm.u;
            byte[] bArr5 = new byte[i2];
            om7.v = bArr5;
            interfaceC4265ot.readFully(bArr5, 0, i2);
            return;
        }
        int i11 = pm.G;
        JT jt3 = pm.g;
        if (i11 == 0) {
            C3456fh0 c3456fh0 = pm.b;
            pm.M = (int) c3456fh0.c(interfaceC4265ot, false, true, 8);
            pm.N = c3456fh0.c;
            pm.I = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            pm.G = 1;
            jt3.B(0);
        }
        OM om8 = (OM) sparseArray.get(pm.M);
        if (om8 == null) {
            interfaceC4265ot.skipFully(i2 - pm.N);
            pm.G = 0;
            return;
        }
        om8.X.getClass();
        if (pm.G == 1) {
            pm.h(interfaceC4265ot, 3);
            int i12 = (jt3.f3266a[2] & 6) >> 1;
            byte b = 255;
            if (i12 == 0) {
                pm.K = 1;
                int[] iArr = pm.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                pm.L = iArr;
                iArr[0] = (i2 - pm.N) - 3;
            } else {
                pm.h(interfaceC4265ot, 4);
                int i13 = (jt3.f3266a[3] & 255) + 1;
                pm.K = i13;
                int[] iArr2 = pm.L;
                if (iArr2 == null) {
                    iArr2 = new int[i13];
                } else if (iArr2.length < i13) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i13)];
                }
                pm.L = iArr2;
                if (i12 == 2) {
                    int i14 = (i2 - pm.N) - 4;
                    int i15 = pm.K;
                    Arrays.fill(iArr2, 0, i15, i14 / i15);
                } else {
                    if (i12 == 1) {
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i3 = pm.K - 1;
                            if (i16 >= i3) {
                                break;
                            }
                            pm.L[i16] = 0;
                            while (true) {
                                i4 = i7 + 1;
                                pm.h(interfaceC4265ot, i4);
                                int i18 = jt3.f3266a[i7] & 255;
                                int[] iArr3 = pm.L;
                                i5 = iArr3[i16] + i18;
                                iArr3[i16] = i5;
                                if (i18 != 255) {
                                    break;
                                } else {
                                    i7 = i4;
                                }
                            }
                            i17 += i5;
                            i16++;
                            i7 = i4;
                        }
                        pm.L[i3] = ((i2 - pm.N) - i7) - i17;
                    } else {
                        if (i12 != 3) {
                            throw KT.a("Unexpected lacing value: " + i12, null);
                        }
                        int i19 = 0;
                        int i20 = 0;
                        while (true) {
                            int i21 = pm.K - i8;
                            if (i19 >= i21) {
                                om2 = om8;
                                pm.L[i21] = ((i2 - pm.N) - i7) - i20;
                                break;
                            }
                            pm.L[i19] = i9;
                            int i22 = i7 + 1;
                            pm.h(interfaceC4265ot, i22);
                            if (jt3.f3266a[i7] == 0) {
                                throw KT.a("No valid varint length mask found", null);
                            }
                            int i23 = 0;
                            while (true) {
                                if (i23 >= 8) {
                                    j = 0;
                                    i7 = i22;
                                    break;
                                }
                                int i24 = i8 << (7 - i23);
                                if ((jt3.f3266a[i7] & i24) != 0) {
                                    int i25 = i22 + i23;
                                    pm.h(interfaceC4265ot, i25);
                                    j = jt3.f3266a[i7] & b & (~i24);
                                    while (i22 < i25) {
                                        j = (j << 8) | ((long) (jt3.f3266a[i22] & 255));
                                        i22++;
                                        i25 = i25;
                                    }
                                    int i26 = i25;
                                    if (i19 > 0) {
                                        j -= (1 << ((i23 * 7) + 6)) - 1;
                                    }
                                    i7 = i26;
                                    break;
                                }
                                i23++;
                                b = 255;
                                i8 = 1;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw KT.a("EBML lacing sample size out of range.", null);
                            }
                            int i27 = (int) j;
                            int[] iArr4 = pm.L;
                            if (i19 != 0) {
                                i27 += iArr4[i19 - 1];
                            }
                            iArr4[i19] = i27;
                            i20 += i27;
                            i19++;
                            om8 = om8;
                            b = 255;
                            i8 = 1;
                            i9 = 0;
                        }
                    }
                    byte[] bArr6 = jt3.f3266a;
                    pm.H = pm.j((bArr6[1] & 255) | (bArr6[0] << 8)) + pm.B;
                    om = om2;
                    if (om.d != 2 || (i == 163 && (jt3.f3266a[2] & 128) == 128)) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    pm.O = i6;
                    pm.G = 2;
                    pm.J = 0;
                }
            }
            om2 = om8;
            byte[] bArr7 = jt3.f3266a;
            pm.H = pm.j((bArr7[1] & 255) | (bArr7[0] << 8)) + pm.B;
            om = om2;
            if (om.d != 2) {
                i6 = 1;
            } else {
                i6 = 1;
            }
            pm.O = i6;
            pm.G = 2;
            pm.J = 0;
        } else {
            om = om8;
        }
        if (i == 163) {
            while (true) {
                int i28 = pm.J;
                if (i28 >= pm.K) {
                    pm.G = 0;
                    return;
                }
                pm.f(om, ((long) ((pm.J * om.e) / 1000)) + pm.H, pm.O, pm.k(interfaceC4265ot, om, pm.L[i28], false), 0);
                pm.J++;
                om = om;
            }
        } else {
            OM om9 = om;
            while (true) {
                int i29 = pm.J;
                if (i29 >= pm.K) {
                    return;
                }
                int[] iArr5 = pm.L;
                iArr5[i29] = pm.k(interfaceC4265ot, om9, iArr5[i29], true);
                pm.J++;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2693Qb
    public final Object j(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    public final void k(AbstractC3441fa abstractC3441fa, BufferedWriter bufferedWriter) throws IOException {
        C3684iF c3684iF = (C3684iF) this.b;
        ZF zf = new ZF(bufferedWriter, c3684iF.f4494a, c3684iF.b, c3684iF.c, c3684iF.d);
        zf.f(abstractC3441fa);
        zf.h();
        zf.b.flush();
    }

    public final void l(int i, double d) {
        PM pm = (PM) this.b;
        if (i == 181) {
            pm.e(i);
            pm.u.Q = (int) d;
        }
        if (i == 17545) {
            pm.s = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                pm.e(i);
                pm.u.D = (float) d;
                break;
            case 21970:
                pm.e(i);
                pm.u.E = (float) d;
                break;
            case 21971:
                pm.e(i);
                pm.u.F = (float) d;
                break;
            case 21972:
                pm.e(i);
                pm.u.G = (float) d;
                break;
            case 21973:
                pm.e(i);
                pm.u.H = (float) d;
                break;
            case 21974:
                pm.e(i);
                pm.u.I = (float) d;
                break;
            case 21975:
                pm.e(i);
                pm.u.J = (float) d;
                break;
            case 21976:
                pm.e(i);
                pm.u.K = (float) d;
                break;
            case 21977:
                pm.e(i);
                pm.u.L = (float) d;
                break;
            case 21978:
                pm.e(i);
                pm.u.M = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        pm.e(i);
                        pm.u.s = (float) d;
                        break;
                    case 30324:
                        pm.e(i);
                        pm.u.t = (float) d;
                        break;
                    case 30325:
                        pm.e(i);
                        pm.u.u = (float) d;
                        break;
                    default:
                        pm.getClass();
                        break;
                }
                break;
        }
    }

    public final boolean m(String str) {
        String strQ = q(str);
        return "1".equals(strQ) || Boolean.parseBoolean(strQ);
    }

    public final Integer n(String str) {
        String strQ = q(str);
        if (TextUtils.isEmpty(strQ)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strQ));
        } catch (NumberFormatException unused) {
            A(str);
            return null;
        }
    }

    public final JSONArray o(String str) {
        String strQ = q(str);
        if (TextUtils.isEmpty(strQ)) {
            return null;
        }
        try {
            return new JSONArray(strQ);
        } catch (JSONException unused) {
            A(str);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        switch (this.f3455a) {
            case 16:
                MediationAppOpenAdCallback mediationAppOpenAdCallback = ((PangleAppOpenAd) this.b).g;
                if (mediationAppOpenAdCallback != null) {
                    mediationAppOpenAdCallback.reportAdClicked();
                }
                break;
            default:
                MediationNativeAdCallback mediationNativeAdCallback = ((PangleNativeAd) this.b).g;
                if (mediationNativeAdCallback != null) {
                    mediationNativeAdCallback.reportAdClicked();
                }
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        switch (this.f3455a) {
            case 16:
                MediationAppOpenAdCallback mediationAppOpenAdCallback = ((PangleAppOpenAd) this.b).g;
                if (mediationAppOpenAdCallback != null) {
                    mediationAppOpenAdCallback.onAdClosed();
                }
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        switch (this.f3455a) {
            case 16:
                MediationAppOpenAdCallback mediationAppOpenAdCallback = ((PangleAppOpenAd) this.b).g;
                if (mediationAppOpenAdCallback != null) {
                    mediationAppOpenAdCallback.onAdOpened();
                    ((PangleAppOpenAd) this.b).g.reportAdImpression();
                }
                break;
            default:
                MediationNativeAdCallback mediationNativeAdCallback = ((PangleNativeAd) this.b).g;
                if (mediationNativeAdCallback != null) {
                    mediationNativeAdCallback.reportAdImpression();
                }
                break;
        }
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onComplete(MediaView mediaView) {
        Object obj = this.b;
        if (((FacebookRtbNativeAd) obj).d != null) {
            ((FacebookRtbNativeAd) obj).d.onVideoComplete();
        }
    }

    public final String p(Resources resources, String str, String str2) {
        String[] strArr;
        String strQ = q(str2);
        if (!TextUtils.isEmpty(strQ)) {
            return strQ;
        }
        String strQ2 = q(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strQ2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strQ2, TypedValues.Custom.S_STRING, str);
        if (identifier == 0) {
            A(str2.concat("_loc_key"));
            return null;
        }
        JSONArray jSONArrayO = o(str2.concat("_loc_args"));
        if (jSONArrayO == null) {
            strArr = null;
        } else {
            int length = jSONArrayO.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayO.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            A(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    public final String q(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (((Bundle) this.b).containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public final void r(int i, long j) throws KT {
        PM pm = (PM) this.b;
        pm.getClass();
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw KT.a("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw KT.a("ContentEncodingScope " + j + " not supported", null);
        }
        int i2 = 3;
        switch (i) {
            case 131:
                pm.e(i);
                pm.u.d = (int) j;
                return;
            case 136:
                pm.e(i);
                pm.u.V = j == 1;
                return;
            case Input.Keys.NUMPAD_MULTIPLY /* 155 */:
                pm.I = pm.j(j);
                return;
            case Input.Keys.NUMPAD_COMMA /* 159 */:
                pm.e(i);
                pm.u.O = (int) j;
                return;
            case 176:
                pm.e(i);
                pm.u.m = (int) j;
                return;
            case 179:
                pm.c(i);
                pm.C.a(pm.j(j));
                return;
            case Input.Keys.F16 /* 186 */:
                pm.e(i);
                pm.u.n = (int) j;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                pm.e(i);
                pm.u.c = (int) j;
                return;
            case 231:
                pm.B = pm.j(j);
                return;
            case 238:
                pm.P = (int) j;
                return;
            case 241:
                if (pm.E) {
                    return;
                }
                pm.c(i);
                pm.D.a(j);
                pm.E = true;
                return;
            case 251:
                pm.Q = true;
                return;
            case 16871:
                pm.e(i);
                pm.u.g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw KT.a("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw KT.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw KT.a("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw KT.a("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw KT.a("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                pm.x = j + pm.q;
                return;
            case 21432:
                int i3 = (int) j;
                pm.e(i);
                if (i3 == 0) {
                    pm.u.w = 0;
                    return;
                }
                if (i3 == 1) {
                    pm.u.w = 2;
                    return;
                } else if (i3 == 3) {
                    pm.u.w = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    pm.u.w = 3;
                    return;
                }
            case 21680:
                pm.e(i);
                pm.u.o = (int) j;
                return;
            case 21682:
                pm.e(i);
                pm.u.q = (int) j;
                return;
            case 21690:
                pm.e(i);
                pm.u.p = (int) j;
                return;
            case 21930:
                pm.e(i);
                pm.u.U = j == 1;
                return;
            case 21998:
                pm.e(i);
                pm.u.f = (int) j;
                return;
            case 22186:
                pm.e(i);
                pm.u.R = j;
                return;
            case 22203:
                pm.e(i);
                pm.u.S = j;
                return;
            case 25188:
                pm.e(i);
                pm.u.P = (int) j;
                return;
            case 30114:
                pm.R = j;
                return;
            case 30321:
                pm.e(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    pm.u.r = 0;
                    return;
                }
                if (i4 == 1) {
                    pm.u.r = 1;
                    return;
                } else if (i4 == 2) {
                    pm.u.r = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    pm.u.r = 3;
                    return;
                }
            case 2352003:
                pm.e(i);
                pm.u.e = (int) j;
                return;
            case 2807729:
                pm.r = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        pm.e(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            pm.u.A = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            pm.u.A = 1;
                            return;
                        }
                    case 21946:
                        pm.e(i);
                        int i6 = (int) j;
                        String str = C2879Xf.f;
                        if (i6 != 1) {
                            if (i6 == 16) {
                                i2 = 6;
                            } else if (i6 == 18) {
                                i2 = 7;
                            } else if (i6 != 6 && i6 != 7) {
                                i2 = -1;
                            }
                        }
                        if (i2 != -1) {
                            pm.u.z = i2;
                            return;
                        }
                        return;
                    case 21947:
                        pm.e(i);
                        pm.u.x = true;
                        int iA = C2879Xf.a((int) j);
                        if (iA != -1) {
                            pm.u.y = iA;
                            return;
                        }
                        return;
                    case 21948:
                        pm.e(i);
                        pm.u.B = (int) j;
                        return;
                    case 21949:
                        pm.e(i);
                        pm.u.C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4724u6
    public final C2711Qt s(AssetManager assetManager, String str) {
        return new C2711Qt(assetManager, str, 0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4257on
    public final long skip(long j) throws IOException {
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long jSkip = ((InputStream) this.b).skip(j2);
            if (jSkip <= 0) {
                if (((InputStream) this.b).read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j2 -= jSkip;
        }
        return j - j2;
    }

    public final Bundle u() {
        Bundle bundle = new Bundle((Bundle) this.b);
        for (String str : ((Bundle) this.b).keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals(TypedValues.TransitionType.S_FROM)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final synchronized void v(C2741Rx c2741Rx) {
        c2741Rx.b = null;
        c2741Rx.c = null;
        ((Queue) this.b).offer(c2741Rx);
    }

    public final void w(InterfaceC3050b4 interfaceC3050b4) {
        for (E8 e8 : (CopyOnWriteArrayList) this.b) {
            if (e8.b == interfaceC3050b4) {
                e8.c = true;
                ((CopyOnWriteArrayList) this.b).remove(e8);
            }
        }
    }

    public final void x(int i, long j, long j2) throws KT {
        PM pm = (PM) this.b;
        FW.t(pm.b0);
        if (i == 160) {
            pm.Q = false;
            pm.R = 0L;
            return;
        }
        if (i != 174) {
            if (i == 187) {
                pm.E = false;
                return;
            }
            if (i == 19899) {
                pm.w = -1;
                pm.x = -1L;
                return;
            }
            if (i == 20533) {
                pm.e(i);
                pm.u.h = true;
                return;
            }
            if (i == 21968) {
                pm.e(i);
                pm.u.x = true;
                return;
            }
            if (i == 408125543) {
                long j3 = pm.q;
                if (j3 != -1 && j3 != j) {
                    throw KT.a("Multiple Segment elements not supported", null);
                }
                pm.q = j;
                pm.p = j2;
                return;
            }
            if (i == 475249515) {
                pm.C = new C2329Ca(5);
                pm.D = new C2329Ca(5);
                return;
            } else {
                if (i == 524531317 && !pm.v) {
                    if (pm.d && pm.z != -1) {
                        pm.y = true;
                        return;
                    } else {
                        pm.b0.a(new C2946Zu(pm.t));
                        pm.v = true;
                        return;
                    }
                }
                return;
            }
        }
        OM om = new OM();
        om.m = -1;
        om.n = -1;
        om.o = -1;
        om.p = -1;
        om.q = 0;
        om.r = -1;
        om.s = 0.0f;
        om.t = 0.0f;
        om.u = 0.0f;
        om.v = null;
        om.w = -1;
        om.x = false;
        om.y = -1;
        om.z = -1;
        om.A = -1;
        om.B = 1000;
        om.C = 200;
        om.D = -1.0f;
        om.E = -1.0f;
        om.F = -1.0f;
        om.G = -1.0f;
        om.H = -1.0f;
        om.I = -1.0f;
        om.J = -1.0f;
        om.K = -1.0f;
        om.L = -1.0f;
        om.M = -1.0f;
        om.O = 1;
        om.P = -1;
        om.Q = 8000;
        om.R = 0L;
        om.S = 0L;
        om.V = true;
        om.W = "eng";
        pm.u = om;
    }

    public final void y(int i, String str) throws KT {
        PM pm = (PM) this.b;
        pm.getClass();
        if (i == 134) {
            pm.e(i);
            pm.u.b = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw KT.a("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            pm.e(i);
            pm.u.f3501a = str;
        } else {
            if (i != 2274716) {
                return;
            }
            pm.e(i);
            pm.u.W = str;
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final FP z(C3166cQ c3166cQ) {
        return new C4812v6((AssetManager) this.b, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NN(com.google.android.exoplayer2.drm.b bVar) {
        this(bVar, 20);
        this.f3455a = 20;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NN(Z6 z6, int i) {
        this(z6);
        this.f3455a = 19;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NN(PM pm) {
        this(pm, 22);
        this.f3455a = 22;
    }

    public /* synthetic */ NN(Object obj, int i) {
        this.f3455a = i;
        this.b = obj;
    }

    public NN(File file, String str) throws C3433fS {
        this.f3455a = 12;
        try {
            this.b = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e) {
            throw new C3433fS(e);
        }
    }

    public NN() {
        this.f3455a = 9;
        this.b = new C4830vK(this);
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onEnterFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onExitFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onFullscreenBackground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onFullscreenForeground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onPause(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onPlay(MediaView mediaView) {
    }

    public NN(int i) {
        this.f3455a = 23;
        this.b = new C2610Mw(5);
    }

    public NN(Z6 z6) {
        this.f3455a = 19;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(z6.f4055a).setFlags(z6.b).setUsage(z6.c);
        int i = Ug0.f3833a;
        if (i >= 29) {
            X6.a(usage, z6.d);
        }
        if (i >= 32) {
            Y6.a(usage, z6.e);
        }
        this.b = usage.build();
    }

    public NN(Bundle bundle) {
        this.f3455a = 28;
        this.b = new Bundle(bundle);
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onVolumeChange(MediaView mediaView, float f) {
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.lk
    public final void Lxb(com.bytedance.sdk.component.LD.Lxb.LD ld, IOException iOException) {
        ((NG) this.b).g = false;
        ((NG) this.b).f3449a = -1L;
    }
}
