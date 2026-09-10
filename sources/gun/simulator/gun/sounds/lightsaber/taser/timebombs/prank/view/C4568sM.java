package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bytedance.sdk.component.LD.Lxb.IeN;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4568sM implements InterfaceC4669tZ, L30, OnUserEarnedRewardListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4975a;
    public Object b;
    public Object c;
    public Object d;

    public C4568sM(C2847Vz c2847Vz, C2743Rz c2743Rz) {
        this.f4975a = 14;
        this.c = c2847Vz;
        this.d = c2743Rz;
        this.b = new C2510Iz(c2847Vz.f3949a, c2847Vz.b, c2847Vz.e, c2847Vz.f, c2847Vz.g, c2847Vz.h, c2847Vz.i, c2847Vz.j, c2847Vz.k, c2847Vz.c, c2847Vz.l, c2847Vz.m);
    }

    public static C4568sM c(InputStream inputStream) throws KW, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, PK.b));
        ArrayList<IW> arrayList = new ArrayList();
        C4568sM c4568sM = null;
        while (true) {
            String line = bufferedReader.readLine();
            int i = 0;
            int i2 = -1;
            if (TextUtils.isEmpty(line)) {
                if (c4568sM == null) {
                    throw new KW("request line is null");
                }
                int iIndexOf = ((String) c4568sM.c).indexOf("?");
                if (iIndexOf == -1) {
                    throw new KW("path format error, path: " + ((String) c4568sM.c));
                }
                ArrayList arrayList2 = new ArrayList();
                String strDecode = null;
                String strDecode2 = null;
                int i3 = 0;
                for (String str : ((String) c4568sM.c).substring(iIndexOf + 1).split("&")) {
                    String[] strArrSplit = str.split("=");
                    if (strArrSplit.length == 2) {
                        if ("rk".equals(strArrSplit[0])) {
                            strDecode = Uri.decode(strArrSplit[1]);
                        } else if (CampaignEx.JSON_KEY_AD_K.equals(strArrSplit[0])) {
                            strDecode2 = Uri.decode(strArrSplit[1]);
                        } else if (strArrSplit[0].startsWith(com.umeng.analytics.pro.bc.aN)) {
                            arrayList2.add(Uri.decode(strArrSplit[1]));
                        } else if ("f".equals(strArrSplit[0])) {
                            String str2 = strArrSplit[1];
                            if (!TextUtils.isEmpty(str2)) {
                                try {
                                    if (Integer.parseInt(str2) == 1) {
                                        i3 = 1;
                                    }
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
                if (TextUtils.isEmpty(strDecode) || TextUtils.isEmpty(strDecode2)) {
                    throw new KW("rawKey or key is empty, path: " + ((String) c4568sM.c));
                }
                int i4 = 0;
                int i5 = 0;
                for (IW iw : arrayList) {
                    if (iw != null) {
                        if ("Range".equalsIgnoreCase(iw.f3220a)) {
                            String str3 = iw.b;
                            int iIndexOf2 = str3.indexOf("=");
                            if (iIndexOf2 == i2) {
                                throw new KW("Range format error, Range: ".concat(str3));
                            }
                            if (!"bytes".equalsIgnoreCase(str3.substring(i, iIndexOf2).trim())) {
                                throw new KW("Range format error, Range: ".concat(str3));
                            }
                            String strSubstring = str3.substring(iIndexOf2 + 1);
                            if (strSubstring.contains(",")) {
                                throw new KW("Range format error, Range: ".concat(str3));
                            }
                            int iIndexOf3 = strSubstring.indexOf("-");
                            if (iIndexOf3 == -1) {
                                throw new KW("Range format error, Range: ".concat(str3));
                            }
                            String strTrim = strSubstring.substring(0, iIndexOf3).trim();
                            String strTrim2 = strSubstring.substring(iIndexOf3 + 1).trim();
                            try {
                                if (strTrim.length() > 0) {
                                    i4 = Integer.parseInt(strTrim);
                                }
                                if (strTrim2.length() > 0 && i4 > (i5 = Integer.parseInt(strTrim2))) {
                                    throw new KW("Range format error, Range: " + str3);
                                }
                            } catch (NumberFormatException unused2) {
                                throw new KW("Range format error, Range: ".concat(str3));
                            }
                        }
                        i = 0;
                        i2 = -1;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    return new C4568sM((Object) c4568sM, (List) arrayList, (Object) new JW(i3, strDecode, strDecode2, i4, i5, arrayList2), 7);
                }
                throw new KW("no url found: path: " + ((String) c4568sM.c));
            }
            String strTrim3 = line.trim();
            if (c4568sM == null) {
                int iIndexOf4 = strTrim3.indexOf(32);
                if (iIndexOf4 == -1) {
                    throw new KW("request line format error, line: ".concat(strTrim3));
                }
                int iLastIndexOf = strTrim3.lastIndexOf(32);
                if (iLastIndexOf <= iIndexOf4) {
                    throw new KW("request line format error, line: ".concat(strTrim3));
                }
                String strTrim4 = strTrim3.substring(0, iIndexOf4).trim();
                String strTrim5 = strTrim3.substring(iIndexOf4 + 1, iLastIndexOf).trim();
                String strTrim6 = strTrim3.substring(iLastIndexOf + 1).trim();
                if (strTrim4.length() == 0 || strTrim5.length() == 0 || strTrim6.length() == 0) {
                    throw new KW("request line format error, line: ".concat(strTrim3));
                }
                c4568sM = new C4568sM(strTrim4, strTrim5, strTrim6, 6);
            } else {
                int iIndexOf5 = strTrim3.indexOf(":");
                if (iIndexOf5 == -1) {
                    throw new KW("request header format error, header: ".concat(strTrim3));
                }
                String strTrim7 = strTrim3.substring(0, iIndexOf5).trim();
                String strTrim8 = strTrim3.substring(iIndexOf5 + 1).trim();
                if (strTrim7.length() == 0 || strTrim8.length() == 0) {
                    throw new KW("request header format error, header: ".concat(strTrim3));
                }
                arrayList.add(new IW(strTrim7, strTrim8));
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L30
    public final void a(JT jt) {
        long jC;
        FW.t((Mc0) this.c);
        int i = Ug0.f3833a;
        Mc0 mc0 = (Mc0) this.c;
        synchronized (mc0) {
            try {
                long j = mc0.c;
                jC = j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? j + mc0.b : mc0.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        long jD = ((Mc0) this.c).d();
        if (jC == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || jD == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return;
        }
        C4619sw c4619sw = (C4619sw) this.b;
        if (jD != c4619sw.p) {
            C4531rw c4531rwA = c4619sw.a();
            c4531rwA.o = jD;
            C4619sw c4619sw2 = new C4619sw(c4531rwA);
            this.b = c4619sw2;
            ((InterfaceC4326pd0) this.d).e(c4619sw2);
        }
        int iA = jt.a();
        ((InterfaceC4326pd0) this.d).d(iA, jt);
        ((InterfaceC4326pd0) this.d).a(jC, 1, iA, 0, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L30
    public final void b(Mc0 mc0, InterfaceC4353pt interfaceC4353pt, C4416qe0 c4416qe0) {
        this.c = mc0;
        c4416qe0.a();
        c4416qe0.b();
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(c4416qe0.d, 5);
        this.d = interfaceC4326pd0Track;
        interfaceC4326pd0Track.e((C4619sw) this.b);
    }

    public final IW d(String str) {
        List list = (List) this.b;
        if (list != null && list.size() > 0) {
            for (IW iw : (List) this.b) {
                if (str.equals(iw.f3220a)) {
                    return iw;
                }
            }
        }
        return null;
    }

    public final String e(String str) {
        if (d(str) != null) {
            return d(str).b;
        }
        return null;
    }

    public final int f() {
        return ((IeN) this.d).lk();
    }

    public final InputStream g() {
        return ((IeN) this.d).lc().lk();
    }

    public final C3937l8 h() {
        String strH = ((Long) this.b) == null ? " delta" : "";
        if (((Long) this.c) == null) {
            strH = strH.concat(" maxAllowedDelay");
        }
        if (((Set) this.d) == null) {
            strH = DM.h(strH, " flags");
        }
        if (strH.isEmpty()) {
            return new C3937l8(((Long) this.b).longValue(), ((Long) this.c).longValue(), (Set) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(strH));
    }

    public final C4113n8 i() {
        String str = ((Long) this.c) == null ? " tokenExpirationTimestamp" : "";
        if (str.isEmpty()) {
            return new C4113n8((String) this.b, ((Long) this.c).longValue(), (Pc0) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final Bitmap j(BitmapFactory.Options options) {
        switch (this.f4975a) {
            case 1:
                return BitmapFactory.decodeStream(new C2927Zb(AbstractC3092bc.c((ByteBuffer) this.c)), null, options);
            case 2:
                VX vx = (VX) ((com.bumptech.glide.load.data.a) this.c).b;
                vx.reset();
                return BitmapFactory.decodeStream(vx, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.a) this.d).c().getFileDescriptor(), null, options);
        }
    }

    public final void k(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.b;
        C4930wW c4930wW = new C4930wW(byteArrayOutputStream, map, (Map) this.c, (InterfaceC3521gS) this.d);
        InterfaceC3521gS interfaceC3521gS = (InterfaceC3521gS) map.get(obj.getClass());
        if (interfaceC3521gS != null) {
            interfaceC3521gS.a(obj, c4930wW);
        } else {
            throw new C3823jr("No encoder for " + obj.getClass());
        }
    }

    public final long l() {
        Object obj = this.d;
        if (((InterfaceC4265ot) obj) != null) {
            return ((InterfaceC4265ot) obj).getPosition();
        }
        return -1L;
    }

    public final InterfaceC4177nt m(Object... objArr) {
        Constructor constructorI;
        synchronized (((AtomicBoolean) this.c)) {
            if (((AtomicBoolean) this.c).get()) {
                constructorI = (Constructor) this.d;
            } else {
                try {
                    try {
                        constructorI = ((C2953a0) ((InterfaceC3025an) this.b)).i();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.c).set(true);
                        constructorI = (Constructor) this.d;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }
        if (constructorI == null) {
            return null;
        }
        try {
            return (InterfaceC4177nt) constructorI.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public final ImageHeaderParser$ImageType n() throws Throwable {
        switch (this.f4975a) {
            case 1:
                return AbstractC2871Wx.h0((List) this.b, AbstractC3092bc.c((ByteBuffer) this.c));
            case 2:
                List list = (List) this.b;
                VX vx = (VX) ((com.bumptech.glide.load.data.a) this.c).b;
                vx.reset();
                return AbstractC2871Wx.g0((C4391qK) this.d, vx, list);
            default:
                List list2 = (List) this.b;
                com.bumptech.glide.load.data.a aVar = (com.bumptech.glide.load.data.a) this.d;
                C4391qK c4391qK = (C4391qK) this.c;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC3943lC interfaceC3943lC = (InterfaceC3943lC) list2.get(i);
                    VX vx2 = null;
                    try {
                        VX vx3 = new VX(new FileInputStream(aVar.c().getFileDescriptor()), c4391qK);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = interfaceC3943lC.d(vx3);
                            vx3.release();
                            aVar.c();
                            if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeD;
                            }
                        } catch (Throwable th) {
                            th = th;
                            vx2 = vx3;
                            if (vx2 != null) {
                                vx2.release();
                            }
                            aVar.c();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4669tZ
    public final InterfaceC3616hZ o(InterfaceC3616hZ interfaceC3616hZ, YS ys) {
        Drawable drawable = (Drawable) interfaceC3616hZ.get();
        if (drawable instanceof BitmapDrawable) {
            return ((InterfaceC4669tZ) this.c).o(C2485Ia.c(((BitmapDrawable) drawable).getBitmap(), (InterfaceC2459Ha) this.b), ys);
        }
        if (drawable instanceof GifDrawable) {
            return ((InterfaceC4669tZ) this.d).o(interfaceC3616hZ, ys);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public final void onUserEarnedReward(RewardItem rewardItem) {
        O9 o9;
        H3 h3 = (H3) this.d;
        Context contextJ = X0.j.j();
        XZ xz = (XZ) this.c;
        C3491g4 c3491g4 = (C3491g4) xz.f3354a;
        String str = (String) xz.b;
        H3 h4 = H3.n;
        h3.getClass();
        Qm0.D(new byte[]{56, 107, -121, -43, -40, 116, 57, 59, 62, 109, -104, -16, -59, 126, 11, 31, 60, 107, -98, -64}, new byte[]{74, com.umeng.analytics.pro.cw.l, -16, -76, -86, com.umeng.analytics.pro.cw.n, 110, 90});
        h3.o(contextJ, c3491g4, str, Qm0.D(new byte[]{-47, -128, -22, -63, -125, -61, -93, -101, -9, -122, -11, -28, -98, -55, -111}, new byte[]{-125, -27, -99, -96, -15, -89, -12, -6}));
        String str2 = ((H3) this.d).f4440a;
        byte[] bArr = {-5, 89, 21, 104, -15, 34, -89, -128, -24, 88, 66, 110, -26, 50, -30, -106, -52, 75, 3, 123, -25, 102, -79, -111, -54, 95, 7, 122, -16, 32, -73, -120, -59, 69};
        byte[] bArr2 = {-87, 60, 98, 9, -125, 70, -62, -28};
        int i = 0;
        int i2 = 0;
        while (i < 34) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        H3 h5 = (H3) this.d;
        C3491g4 c3491g5 = (C3491g4) this.b;
        synchronized (h5.l) {
            o9 = (O9) h5.l.get(c3491g5);
        }
        if (o9 != null) {
            QI qi = (QI) ((H3) this.d).X((C3491g4) this.b);
            qi.getClass();
            Weapon weapon = qi.f3597a.d;
            if (weapon != null) {
                S3.b("weapon_unlock_success", "click," + weapon.getAnalyticsName());
            }
        }
    }

    public final boolean p() throws IOException {
        String strTrim;
        if (((String) this.d) != null) {
            return true;
        }
        if (!((Queue) this.c).isEmpty()) {
            String str = (String) ((Queue) this.c).poll();
            str.getClass();
            this.d = str;
            return true;
        }
        do {
            String line = ((BufferedReader) this.b).readLine();
            this.d = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.d = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }

    public final void q(InterfaceC4429ql interfaceC4429ql, Uri uri, Map map, long j, long j2, InterfaceC4353pt interfaceC4353pt) throws Ua0 {
        boolean z;
        C2938Zm c2938Zm = new C2938Zm(interfaceC4429ql, j, j2);
        this.d = c2938Zm;
        if (((InterfaceC4177nt) this.c) != null) {
            return;
        }
        InterfaceC4177nt[] interfaceC4177ntArrD = ((InterfaceC4441qt) this.b).d(uri, map);
        boolean z2 = true;
        if (interfaceC4177ntArrD.length == 1) {
            this.c = interfaceC4177ntArrD[0];
        } else {
            for (InterfaceC4177nt interfaceC4177nt : interfaceC4177ntArrD) {
                try {
                    if (interfaceC4177nt.b(c2938Zm)) {
                        this.c = interfaceC4177nt;
                        c2938Zm.f = 0;
                        break;
                    }
                    z = ((InterfaceC4177nt) this.c) != null || c2938Zm.d == j;
                } catch (EOFException unused) {
                    z = ((InterfaceC4177nt) this.c) != null || c2938Zm.d == j;
                } catch (Throwable th) {
                    if (((InterfaceC4177nt) this.c) == null && c2938Zm.d != j) {
                        z2 = false;
                    }
                    FW.s(z2);
                    c2938Zm.f = 0;
                    throw th;
                }
                FW.s(z);
                c2938Zm.f = 0;
            }
            if (((InterfaceC4177nt) this.c) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                int i = Ug0.f3833a;
                StringBuilder sb2 = new StringBuilder();
                for (int i2 = 0; i2 < interfaceC4177ntArrD.length; i2++) {
                    sb2.append(interfaceC4177ntArrD[i2].getClass().getSimpleName());
                    if (i2 < interfaceC4177ntArrD.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String string = sb.toString();
                uri.getClass();
                throw new Ua0(string, null, false, 1);
            }
        }
        ((InterfaceC4177nt) this.c).d(interfaceC4353pt);
    }

    public final String r() {
        int iLk = ((IeN) this.d).lk();
        switch (iLk) {
            case 200:
                return "OK";
            case 201:
                return "Created";
            case 202:
                return "Accepted";
            case 203:
                return "Non-Authoritative";
            case 204:
                return "No Content";
            case 205:
                return "Reset Content";
            case 206:
                return "Partial Content";
            default:
                switch (iLk) {
                    case 300:
                        return "Multiple Choices";
                    case 301:
                        return "Moved Permanently";
                    case 302:
                        return "Temporary Redirect";
                    case 303:
                        return "See Other";
                    case 304:
                        return "Not Modified";
                    case 305:
                        return "Use Proxy";
                    default:
                        switch (iLk) {
                            case 400:
                                return "Bad Request";
                            case 401:
                                return "Unauthorized";
                            case 402:
                                return "Payment Required";
                            case 403:
                                return "Forbidden";
                            case 404:
                                return "Not Found";
                            case 405:
                                return "Method Not Allowed";
                            case 406:
                                return "Not Acceptable";
                            case 407:
                                return "Proxy Authentication Required";
                            case 408:
                                return "Request Time-Out";
                            case 409:
                                return "Conflict";
                            case 410:
                                return "Gone";
                            case 411:
                                return "Length Required";
                            case 412:
                                return "Precondition Failed";
                            case 413:
                                return "Request Entity Too Large";
                            case 414:
                                return "Request-URI Too Large";
                            case 415:
                                return "Unsupported Media Type";
                            default:
                                switch (iLk) {
                                    case 500:
                                        return "Internal Server Error";
                                    case 501:
                                        return "Not Implemented";
                                    case 502:
                                        return "Bad Gateway";
                                    case 503:
                                        return "Service Unavailable";
                                    case 504:
                                        return "Gateway Timeout";
                                    case 505:
                                        return "HTTP Version Not Supported";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }

    public final String s() {
        if (!p()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.d;
        this.d = null;
        return str;
    }

    public final String toString() {
        switch (this.f4975a) {
            case 6:
                StringBuilder sb = new StringBuilder("RequestLine{method='");
                sb.append((String) this.b);
                sb.append("', path='");
                sb.append((String) this.c);
                sb.append("', version='");
                return DM.m(sb, (String) this.d, "'}");
            case 7:
                return "Request{requestLine=" + ((C4568sM) this.c) + ", headers=" + ((List) this.b) + ", extra=" + ((JW) this.d) + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C4568sM(Object obj, Object obj2, Object obj3, int i) {
        this.f4975a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ C4568sM(Object obj, List list, Object obj2, int i) {
        this.f4975a = i;
        this.c = obj;
        this.b = list;
        this.d = obj2;
    }

    public C4568sM(InterfaceC3759j7[] interfaceC3759j7Arr) {
        this.f4975a = 10;
        P60 p60 = new P60();
        C3500g80 c3500g80 = new C3500g80();
        c3500g80.c = 1.0f;
        c3500g80.d = 1.0f;
        C3585h7 c3585h7 = C3585h7.e;
        c3500g80.e = c3585h7;
        c3500g80.f = c3585h7;
        c3500g80.g = c3585h7;
        c3500g80.h = c3585h7;
        ByteBuffer byteBuffer = InterfaceC3759j7.f4537a;
        c3500g80.k = byteBuffer;
        c3500g80.l = byteBuffer.asShortBuffer();
        c3500g80.m = byteBuffer;
        c3500g80.b = -1;
        this(interfaceC3759j7Arr, p60, c3500g80);
    }

    public C4568sM(H3 h3, XZ xz) {
        this.f4975a = 19;
        this.d = h3;
        this.c = xz;
        this.b = (C3491g4) xz.f3354a;
    }

    public C4568sM(Context context) {
        this.f4975a = 20;
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        this.b = context;
        Object systemService = context.getSystemService("connectivity");
        AbstractC2995aW.o(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.c = (ConnectivityManager) systemService;
    }

    public C4568sM(List list) {
        this.f4975a = 0;
        this.d = list;
        this.b = new ArrayList(list.size());
        this.c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((List) this.b).add(new C3584h60((List) ((C4480rM) list.get(i)).b.b));
            ((List) this.c).add(((C4480rM) list.get(i)).c.d());
        }
    }

    public C4568sM(IeN ieN, C4472rE c4472rE) {
        this.f4975a = 5;
        this.d = ieN;
        this.b = new ArrayList();
        com.bytedance.sdk.component.LD.Lxb.lc lcVarEbl = ieN.ebl();
        if (lcVarEbl != null) {
            for (int i = 0; i < lcVarEbl.Lxb(); i++) {
                ((List) this.b).add(new IW(lcVarEbl.Lxb(i), lcVarEbl.LD(i)));
            }
        }
        this.c = c4472rE;
    }

    public C4568sM(String str) {
        this.f4975a = 12;
        C4531rw c4531rw = new C4531rw();
        c4531rw.k = str;
        this.b = new C4619sw(c4531rw);
    }

    public C4568sM(InterfaceC4441qt interfaceC4441qt) {
        this.f4975a = 13;
        this.b = interfaceC4441qt;
    }

    public C4568sM(int i) {
        this.f4975a = i;
    }

    public C4568sM(InterfaceC3759j7[] interfaceC3759j7Arr, P60 p60, C3500g80 c3500g80) {
        this.f4975a = 10;
        InterfaceC3759j7[] interfaceC3759j7Arr2 = new InterfaceC3759j7[interfaceC3759j7Arr.length + 2];
        this.b = interfaceC3759j7Arr2;
        System.arraycopy(interfaceC3759j7Arr, 0, interfaceC3759j7Arr2, 0, interfaceC3759j7Arr.length);
        this.c = p60;
        this.d = c3500g80;
        InterfaceC3759j7[] interfaceC3759j7Arr3 = (InterfaceC3759j7[]) this.b;
        interfaceC3759j7Arr3[interfaceC3759j7Arr.length] = p60;
        interfaceC3759j7Arr3[interfaceC3759j7Arr.length + 1] = c3500g80;
    }

    public C4568sM(C4391qK c4391qK, C4305pM c4305pM, List list) {
        this.f4975a = 2;
        AbstractC2871Wx.V(c4391qK, "Argument must not be null");
        this.d = c4391qK;
        AbstractC2871Wx.V(list, "Argument must not be null");
        this.b = list;
        this.c = new com.bumptech.glide.load.data.a(c4305pM, c4391qK);
    }

    public C4568sM(ParcelFileDescriptor parcelFileDescriptor, List list, C4391qK c4391qK) {
        this.f4975a = 3;
        AbstractC2871Wx.V(c4391qK, "Argument must not be null");
        this.c = c4391qK;
        AbstractC2871Wx.V(list, "Argument must not be null");
        this.b = list;
        this.d = new com.bumptech.glide.load.data.a(parcelFileDescriptor);
    }

    public C4568sM(C2953a0 c2953a0) {
        this.f4975a = 11;
        this.b = c2953a0;
        this.c = new AtomicBoolean(false);
    }

    public C4568sM(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f4975a = 15;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }
}
