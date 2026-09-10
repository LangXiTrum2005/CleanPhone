package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.SDKInitStatusListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3692iN implements InterfaceC4207oC, InterfaceC3463fl, InterfaceC4742uK, InterfaceC4230oZ, InterfaceC2603Mp, SDKInitStatusListener, RewardItem, BiddingTokenCallback, InterfaceC4968wt, EO, InterfaceC3120bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4498a;
    public Object b;
    public Object c;

    public C3692iN(int i) {
        this.f4498a = i;
        if (i == 8) {
            this.b = new C5061xy(null);
            this.c = new HashMap();
            return;
        }
        if (i == 9) {
            this.b = new HashMap();
            this.c = new Wm0(4);
            return;
        }
        if (i == 15) {
            this.b = new AtomicReference();
            this.c = new ArrayMap();
            return;
        }
        if (i == 16) {
            this.b = new ArrayList();
            this.c = new HashMap();
            return;
        }
        switch (i) {
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            default:
                switch (i) {
                    case 26:
                        this.b = "";
                        this.c = new ArrayList();
                        break;
                    case 27:
                        this.c = new HashMap();
                        break;
                    case 28:
                        break;
                    default:
                        this.b = new F4(0);
                        this.c = new C3692iN(8);
                        break;
                }
                break;
        }
    }

    public static String A(int i, int i2, Bitmap.Config config) {
        StringBuilder sbT = AbstractC3950lJ.t("[", i, "x", i2, "], ");
        sbT.append(config);
        return sbT.toString();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x005b, TryCatch #0 {IOException -> 0x005b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:27:0x005d), top: B:31:0x0000 }] */
    public static C3692iN I(String... strArr) {
        String str;
        try {
            C3971lc[] c3971lcArr = new C3971lc[strArr.length];
            C4848vb c4848vb = new C4848vb();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = MF.e;
                c4848vb.R(34);
                int length = str2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = str2.charAt(i3);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i2 < i3) {
                                c4848vb.X(i2, i3, str2);
                            }
                            c4848vb.Y(str);
                            i2 = i3 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i2 < i3) {
                            c4848vb.X(i2, i3, str2);
                        }
                        c4848vb.Y(str);
                        i2 = i3 + 1;
                    }
                }
                if (i2 < length) {
                    c4848vb.X(i2, length, str2);
                }
                c4848vb.R(34);
                c4848vb.readByte();
                c3971lcArr[i] = c4848vb.F(c4848vb.b);
            }
            return new C3692iN(2, (String[]) strArr.clone(), FW.P(c3971lcArr));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static C5121yf0 p(ImageDecoder.Source source, int i, int i2, YS ys) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C2394En(i, i2, ys));
        if (AbstractC3745j0.q(drawableDecodeDrawable)) {
            return new C5121yf0(AbstractC3745j0.c(drawableDecodeDrawable), 2);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    public final Pair B(int i, C5186zO c5186zO) {
        C5186zO c5186zOB;
        C5186zO c5186zO2 = null;
        if (c5186zO != null) {
            MO mo = (MO) this.b;
            int i2 = 0;
            while (true) {
                if (i2 >= mo.c.size()) {
                    c5186zOB = null;
                    break;
                }
                if (((C5186zO) mo.c.get(i2)).d == c5186zO.d) {
                    Object obj = mo.b;
                    int i3 = AbstractC3832k.h;
                    c5186zOB = c5186zO.b(Pair.create(obj, c5186zO.f4977a));
                    break;
                }
                i2++;
            }
            if (c5186zOB == null) {
                return null;
            }
            c5186zO2 = c5186zOB;
        }
        return Pair.create(Integer.valueOf(i + ((MO) this.b).d), c5186zO2);
    }

    public final synchronized List C(String str) {
        List arrayList;
        try {
            if (!((List) this.b).contains(str)) {
                ((List) this.b).add(str);
            }
            arrayList = (List) ((Map) this.c).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((Map) this.c).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void D(int i, C5186zO c5186zO, int i2) {
        Pair pairB = B(i, c5186zO);
        if (pairB != null) {
            ((Qa0) ((OO) this.c).i).c(new RunnableC2602Mo(this, pairB, i2, 1));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void E(int i, C5186zO c5186zO, Exception exc) {
        Pair pairB = B(i, c5186zO);
        if (pairB != null) {
            ((Qa0) ((OO) this.c).i).c(new RunnableC4746uO(this, pairB, exc, 1));
        }
    }

    public final synchronized ArrayList F(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((List) this.b).iterator();
        while (it.hasNext()) {
            List<C4054mZ> list = (List) ((Map) this.c).get((String) it.next());
            if (list != null) {
                for (C4054mZ c4054mZ : list) {
                    if (c4054mZ.f4699a.isAssignableFrom(cls) && cls2.isAssignableFrom(c4054mZ.b) && !arrayList.contains(c4054mZ.b)) {
                        arrayList.add(c4054mZ.b);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void G(int i, C5186zO c5186zO) {
        Pair pairB = B(i, c5186zO);
        if (pairB != null) {
            ((Qa0) ((OO) this.c).i).c(new JO(this, pairB, 1));
        }
    }

    public final byte[] H(int i) {
        Object obj = this.c;
        return ((C4391qK) obj) == null ? new byte[i] : (byte[]) ((C4391qK) obj).d(i, byte[].class);
    }

    public final void J(InterfaceC4226oV interfaceC4226oV, Object obj) {
        C5061xy c5061xy = (C5061xy) ((Map) this.c).get(interfaceC4226oV);
        if (c5061xy == null) {
            c5061xy = new C5061xy(interfaceC4226oV);
            c5061xy.c = c5061xy;
            c5061xy.d = c5061xy;
            C5061xy c5061xy2 = (C5061xy) this.b;
            c5061xy.d = c5061xy2.d;
            c5061xy.c = c5061xy2;
            c5061xy2.d = c5061xy;
            c5061xy.d.c = c5061xy;
            ((Map) this.c).put(interfaceC4226oV, c5061xy);
        } else {
            interfaceC4226oV.a();
        }
        if (c5061xy.b == null) {
            c5061xy.b = new ArrayList();
        }
        c5061xy.b.add(obj);
    }

    public final void K(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((ArrayMap) this.c)) {
            ((ArrayMap) this.c).put(new XP(cls, cls2, cls3), list);
        }
    }

    public final void L(String str) {
        C3029ap c3029ap;
        synchronized (this) {
            try {
                Object obj = ((Map) this.b).get(str);
                AbstractC2871Wx.V(obj, "Argument must not be null");
                c3029ap = (C3029ap) obj;
                int i = c3029ap.b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c3029ap.b);
                }
                int i2 = i - 1;
                c3029ap.b = i2;
                if (i2 == 0) {
                    C3029ap c3029ap2 = (C3029ap) ((Map) this.b).remove(str);
                    if (!c3029ap2.equals(c3029ap)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c3029ap + ", but actually removed: " + c3029ap2 + ", safeKey: " + str);
                    }
                    ((Wm0) this.c).B(c3029ap2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c3029ap.f4143a.unlock();
    }

    public final Object M() {
        C5061xy c5061xy = ((C5061xy) this.b).d;
        while (true) {
            if (c5061xy.equals((C5061xy) this.b)) {
                return null;
            }
            ArrayList arrayList = c5061xy.b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c5061xy.b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C5061xy c5061xy2 = c5061xy.d;
            c5061xy2.c = c5061xy.c;
            c5061xy.c.d = c5061xy2;
            Map map = (Map) this.c;
            Object obj = c5061xy.f5253a;
            map.remove(obj);
            ((InterfaceC4226oV) obj).a();
            c5061xy = c5061xy.d;
        }
    }

    public final void N(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        ((Messenger) this.b).send(messageObtain);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4742uK
    public final void a(Bitmap bitmap) {
        F4 f4 = (F4) this.b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        InterfaceC4226oV interfaceC4226oVI = (InterfaceC4226oV) ((Queue) f4.b).poll();
        if (interfaceC4226oVI == null) {
            interfaceC4226oVI = f4.i();
        }
        V6 v6 = (V6) interfaceC4226oVI;
        v6.b = width;
        v6.c = height;
        v6.d = config;
        ((C3692iN) this.c).J(v6, bitmap);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4742uK
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        F4 f4 = (F4) this.b;
        InterfaceC4226oV interfaceC4226oVI = (InterfaceC4226oV) ((Queue) f4.b).poll();
        if (interfaceC4226oVI == null) {
            interfaceC4226oVI = f4.i();
        }
        V6 v6 = (V6) interfaceC4226oVI;
        v6.b = i;
        v6.c = i2;
        v6.d = config;
        return (Bitmap) ((C3692iN) this.c).y(v6);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void c(int i, C5186zO c5186zO, C3779jO c3779jO) {
        Pair pairB = B(i, c5186zO);
        if (pairB != null) {
            ((Qa0) ((OO) this.c).i).c(new IO(this, pairB, c3779jO, 1));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3463fl
    public final void d(Exception exc) {
        C3676i80 c3676i80 = (C3676i80) this.c;
        EP ep = (EP) this.b;
        EP ep2 = c3676i80.f;
        if (ep2 == null || ep2 != ep) {
            return;
        }
        C3676i80 c3676i81 = (C3676i80) this.c;
        EP ep3 = (EP) this.b;
        InterfaceC3639hl interfaceC3639hl = c3676i81.b;
        C3198cl c3198cl = c3676i81.g;
        InterfaceC3551gl interfaceC3551gl = ep3.c;
        interfaceC3639hl.a(c3198cl, exc, interfaceC3551gl, interfaceC3551gl.e());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void e(int i, C5186zO c5186zO) {
        Pair pairB = B(i, c5186zO);
        if (pairB != null) {
            ((Qa0) ((OO) this.c).i).c(new JO(this, pairB, 3));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void f(int i, C5186zO c5186zO) {
        Pair pairB = B(i, c5186zO);
        if (pairB != null) {
            ((Qa0) ((OO) this.c).i).c(new JO(this, pairB, 0));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4207oC
    public final int g(InterfaceC3943lC interfaceC3943lC) throws IOException {
        switch (this.f4498a) {
            case 3:
                try {
                    return interfaceC3943lC.a((ByteBuffer) this.b, (C4391qK) this.c);
                } finally {
                    AbstractC3092bc.c((ByteBuffer) this.b);
                }
            default:
                try {
                    return interfaceC3943lC.c((InputStream) this.b, (C4391qK) this.c);
                } finally {
                    ((InputStream) this.b).reset();
                }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        switch (this.f4498a) {
            case 18:
                try {
                    return Integer.getInteger(((RewardInfo) this.b).getRewardAmount()).intValue();
                } catch (Exception unused) {
                    return 0;
                }
            default:
                return ((PAGRewardItem) this.b).getRewardAmount();
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        switch (this.f4498a) {
            case 18:
                return ((RewardInfo) this.b).getRewardName();
            default:
                return ((PAGRewardItem) this.b).getRewardName();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4742uK
    public final String h(Bitmap bitmap) {
        return A(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4742uK
    public final String i(int i, int i2, Bitmap.Config config) {
        return A(i, i2, config);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void j(int i, C5186zO c5186zO, FI fi, C3779jO c3779jO, IOException iOException, boolean z) {
        Pair pairB = B(i, c5186zO);
        if (pairB != null) {
            ((Qa0) ((OO) this.c).i).c(new KO(this, pairB, fi, c3779jO, iOException, z, 0));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r3 == gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4516rl.b) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r3 != gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4516rl.e) goto L16;
     */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3463fl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.i80 r0 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3676i80) r0
            java.lang.Object r1 = r7.b
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EP r1 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EP) r1
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EP r0 = r0.f
            if (r0 == 0) goto L53
            if (r0 != r1) goto L53
            java.lang.Object r0 = r7.c
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.i80 r0 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3676i80) r0
            java.lang.Object r1 = r7.b
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EP r1 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EP) r1
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.El r2 = r0.f4491a
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zo r2 = r2.p
            if (r8 == 0) goto L3e
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gl r3 = r1.c
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rl r3 = r3.e()
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yo r2 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2914Yo) r2
            int r2 = r2.e
            switch(r2) {
                case 1: goto L3e;
                case 2: goto L2e;
                case 3: goto L3e;
                default: goto L29;
            }
        L29:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rl r2 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4516rl.b
            if (r3 != r2) goto L3e
            goto L36
        L2e:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rl r2 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4516rl.c
            if (r3 == r2) goto L3e
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rl r2 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4516rl.e
            if (r3 == r2) goto L3e
        L36:
            r0.e = r8
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hl r8 = r0.b
            r8.d()
            goto L53
        L3e:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hl r2 = r0.b
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tG r3 = r1.f3021a
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gl r4 = r1.c
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rl r5 = r4.e()
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cl r6 = r0.g
            r0 = r2
            r1 = r3
            r2 = r8
            r3 = r4
            r4 = r5
            r5 = r6
            r0.b(r1, r2, r3, r4, r5)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3692iN.k(java.lang.Object):void");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4742uK
    public final int l(Bitmap bitmap) {
        return Tg0.c(bitmap);
    }

    public final void m() {
        this.b = null;
        this.c = null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4230oZ
    public final int n(YS ys) {
        return ((InterfaceC4230oZ) this.c).n(ys);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2603Mp
    public final void o(Bitmap bitmap, InterfaceC2459Ha interfaceC2459Ha) throws IOException {
        IOException iOException = ((C3737is) this.c).b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC2459Ha.a(bitmap);
            throw iOException;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback
    public final void onBiddingTokenCollected(String str) {
        ((SignalCallbacks) this.b).onSuccess(str);
    }

    @Override // com.mbridge.msdk.out.SDKInitStatusListener
    public final void onInitFail(String str) {
        AdError adErrorCreateSdkError = MintegralConstants.createSdkError(105, str);
        ((InitializationCompleteCallback) this.b).onInitializationFailed(adErrorCreateSdkError.getMessage());
        adErrorCreateSdkError.toString();
    }

    @Override // com.mbridge.msdk.out.SDKInitStatusListener
    public final void onInitSuccess() {
        ((InitializationCompleteCallback) this.b).onInitializationSucceeded();
    }

    public final CctBackendFactory q(String str) {
        Bundle bundle;
        Map mapEmptyMap;
        ServiceInfo serviceInfo;
        if (((Map) this.c) == null) {
            Context context = (Context) this.b;
            try {
                PackageManager packageManager = context.getPackageManager();
                bundle = (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) ? null : serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (bundle == null) {
                mapEmptyMap = Collections.emptyMap();
            } else {
                HashMap map = new HashMap();
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if ((obj instanceof String) && str2.startsWith("backend:")) {
                        for (String str3 : ((String) obj).split(",", -1)) {
                            String strTrim = str3.trim();
                            if (!strTrim.isEmpty()) {
                                map.put(strTrim, str2.substring(8));
                            }
                        }
                    }
                }
                mapEmptyMap = map;
            }
            this.c = mapEmptyMap;
        }
        String str4 = (String) ((Map) this.c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(str4);
            sb.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(str4);
            sb2.append(".");
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(".");
            return null;
        } catch (NoSuchMethodException unused5) {
            "Could not instantiate ".concat(str4);
            return null;
        } catch (InvocationTargetException unused6) {
            "Could not instantiate ".concat(str4);
            return null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void r(int i, C5186zO c5186zO, FI fi, C3779jO c3779jO) {
        Pair pairB = B(i, c5186zO);
        if (pairB != null) {
            ((Qa0) ((OO) this.c).i).c(new HO(this, pairB, fi, c3779jO, 2));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4742uK
    public final Bitmap removeLast() {
        return (Bitmap) ((C3692iN) this.c).M();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void s(int i, C5186zO c5186zO, C3779jO c3779jO) {
        Pair pairB = B(i, c5186zO);
        if (pairB != null) {
            ((Qa0) ((OO) this.c).i).c(new IO(this, pairB, c3779jO, 0));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2603Mp
    public final void t() {
        VX vx = (VX) this.b;
        synchronized (vx) {
            vx.c = vx.f3874a.length;
        }
    }

    public final String toString() {
        switch (this.f4498a) {
            case 7:
                return "AttributeStrategy:\n  " + ((C3692iN) this.c);
            case 8:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C5061xy c5061xy = ((C5061xy) this.b).c;
                boolean z = false;
                while (!c5061xy.equals((C5061xy) this.b)) {
                    sb.append('{');
                    sb.append(c5061xy.f5253a);
                    sb.append(':');
                    ArrayList arrayList = c5061xy.b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c5061xy = c5061xy.c;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void u(int i, C5186zO c5186zO, FI fi, C3779jO c3779jO) {
        Pair pairB = B(i, c5186zO);
        if (pairB != null) {
            ((Qa0) ((OO) this.c).i).c(new HO(this, pairB, fi, c3779jO, 1));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5194zW
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final C4571sP get() {
        return new C4571sP((Context) ((InterfaceC5194zW) this.b).get(), (C4866vk) ((InterfaceC5194zW) this.c).get());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3473fr
    public final boolean w(Object obj, File file, YS ys) {
        return ((InterfaceC4230oZ) this.c).w(new C2485Ia(((BitmapDrawable) ((InterfaceC3616hZ) obj).get()).getBitmap(), (InterfaceC2459Ha) this.b), file, ys);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void x(int i, C5186zO c5186zO) {
        Pair pairB = B(i, c5186zO);
        if (pairB != null) {
            ((Qa0) ((OO) this.c).i).c(new JO(this, pairB, 2));
        }
    }

    public final Object y(InterfaceC4226oV interfaceC4226oV) {
        C5061xy c5061xy = (C5061xy) ((Map) this.c).get(interfaceC4226oV);
        if (c5061xy == null) {
            c5061xy = new C5061xy(interfaceC4226oV);
            ((Map) this.c).put(interfaceC4226oV, c5061xy);
        } else {
            interfaceC4226oV.a();
        }
        C5061xy c5061xy2 = c5061xy.d;
        c5061xy2.c = c5061xy.c;
        c5061xy.c.d = c5061xy2;
        C5061xy c5061xy3 = (C5061xy) this.b;
        c5061xy.d = c5061xy3;
        C5061xy c5061xy4 = c5061xy3.c;
        c5061xy.c = c5061xy4;
        c5061xy4.d = c5061xy;
        c5061xy.d.c = c5061xy;
        ArrayList arrayList = c5061xy.b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c5061xy.b.remove(size - 1);
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void z(int i, C5186zO c5186zO, FI fi, C3779jO c3779jO) {
        Pair pairB = B(i, c5186zO);
        if (pairB != null) {
            ((Qa0) ((OO) this.c).i).c(new HO(this, pairB, fi, c3779jO, 0));
        }
    }

    public /* synthetic */ C3692iN(int i, Object obj, Object obj2) {
        this.f4498a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ C3692iN(Object obj, Object obj2, int i) {
        this.f4498a = i;
        this.c = obj;
        this.b = obj2;
    }

    public C3692iN(Context context) {
        this.f4498a = 24;
        this.c = null;
        this.b = context;
    }

    public C3692iN(IBinder iBinder, Bundle bundle) {
        this.f4498a = 0;
        this.b = new Messenger(iBinder);
        this.c = bundle;
    }
}
