package m5;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.cardview.widget.CardView;
import androidx.work.impl.WorkDatabase_Impl;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.xd1;
import com.google.android.gms.internal.play_billing.q1;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.Y3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import eb.a0;
import eb.b0;
import eb.c0;
import eb.g0;
import eb.o;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jb.c1;
import jb.d1;
import jb.e1;
import jb.f1;
import jb.s1;
import jb.v0;
import jb.w0;
import jb.x0;
import jb.y0;
import k3.l;
import kotlin.jvm.internal.n;
import l1.q;
import mi.y;
import n6.m;
import n6.v;
import oa.k0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pm.a1;
import pm.h0;
import pm.p0;
import pm.q0;
import pm.t0;
import qj.p;
import qj.u;
import qj.x;
import qk.i0;
import ta.d0;
import ta.e0;
import ta.l0;
import u3.r;
import u3.s;
import u3.t;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements y, m, nj.c, lm.e, t8.b, k3.m, ta.y, r, x4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f45902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f45903c;

    public /* synthetic */ k(int i10, Object obj, Object obj2) {
        this.f45901a = i10;
        this.f45902b = obj;
        this.f45903c = obj2;
    }

    public static boolean C(y0 y0Var) {
        int iOrdinal = y0Var.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3;
    }

    public static i0 I(e1 e1Var) {
        c0 c0VarJ = J(e1Var);
        o oVar = o.f40004b;
        eb.i0 i0Var = (eb.i0) oVar.f40005a.get();
        i0Var.getClass();
        return !i0Var.f39991b.containsKey(new g0(c0.class, c0VarJ.f39968b)) ? new eb.h(c0VarJ) : oVar.a(c0VarJ);
    }

    public static c0 J(e1 e1Var) {
        return c0.a(e1Var.C().D(), e1Var.C().E(), e1Var.C().C(), e1Var.E(), e1Var.E() == s1.RAW ? null : Integer.valueOf(e1Var.D()));
    }

    public static void d(k kVar, p1.b bVar) {
        kVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) kVar.f45902b).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!h(bVar, list).equals(h((p1.b) kVar.f45903c, list))) {
                throw null;
            }
        }
        kVar.f45903c = bVar;
    }

    public static k f(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new k(22, channel, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException e10) {
                    e = e10;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e11) {
                e = e11;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e12) {
            e = e12;
            channel = null;
            fileLockLock = null;
        }
    }

    public static p1.b h(p1.b bVar, List list) {
        bVar.getClass();
        Map map = bVar.f47927a;
        HashMap map2 = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new p1.b(map2);
    }

    public static e1 k(i0 i0Var, y0 y0Var, int i10) throws GeneralSecurityException {
        c0 c0Var = (c0) o.f40004b.g(i0Var);
        Integer numI = i0Var.I();
        if (numI != null && numI.intValue() != i10) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        d1 d1VarH = e1.H();
        v0 v0VarF = x0.F();
        String str = c0Var.f39967a;
        v0VarF.e();
        x0.y((x0) v0VarF.f24645b, str);
        com.google.crypto.tink.shaded.protobuf.i iVar = c0Var.f39969c;
        v0VarF.e();
        x0.z((x0) v0VarF.f24645b, iVar);
        w0 w0Var = c0Var.f39970d;
        v0VarF.e();
        x0.A((x0) v0VarF.f24645b, w0Var);
        d1VarH.e();
        e1.y((e1) d1VarH.f24645b, (x0) v0VarF.a());
        d1VarH.e();
        e1.A((e1) d1VarH.f24645b, y0Var);
        d1VarH.e();
        e1.B((e1) d1VarH.f24645b, i10);
        s1 s1Var = c0Var.f39971e;
        d1VarH.e();
        e1.z((e1) d1VarH.f24645b, s1Var);
        return (e1) d1VarH.a();
    }

    public static n6.y n(ImageDecoder.Source source, int i10, int i11, e6.i iVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new m6.b(i10, i11, iVar));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new n6.y((AnimatedImageDrawable) drawableDecodeDrawable, 2);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    public static final k o(f1 f1Var) throws GeneralSecurityException {
        i0 hVar;
        boolean z10;
        if (f1Var.B() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(f1Var.B());
        for (e1 e1Var : f1Var.C()) {
            int iD = e1Var.D();
            try {
                hVar = I(e1Var);
                z10 = false;
            } catch (GeneralSecurityException e10) {
                if (((AtomicBoolean) za.a.f54668a.f47269b).get()) {
                    throw e10;
                }
                hVar = new eb.h(J(e1Var));
                z10 = true;
            }
            if (((AtomicBoolean) za.a.f54668a.f47269b).get() && !C(e1Var.F())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayList.add(new va.f(hVar, e1Var.F(), iD, iD == f1Var.D(), z10));
        }
        return new k(new HashMap(), Collections.unmodifiableList(arrayList));
    }

    public ArrayList A(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f45902b;
        g4.h hVarB = g4.h.b(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            hVarB.h(1);
        } else {
            hVarB.j(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(hVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            hVarB.k();
            return arrayList;
        } catch (Throwable th2) {
            cursorG.close();
            hVarB.k();
            throw th2;
        }
    }

    public void B(vc.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f52543a);
            jSONObject.put("Status", v0.i.c(bVar.f52544b));
            jSONObject.put("AuthToken", bVar.f52545c);
            jSONObject.put("RefreshToken", bVar.f52546d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f52548f);
            jSONObject.put("ExpiresInSecs", bVar.f52547e);
            jSONObject.put("FisError", bVar.f52549g);
            mb.g gVar = (mb.g) this.f45903c;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f45928a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(r())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void D() {
        ArrayList arrayList = (ArrayList) this.f45903c;
        if (((k0) this.f45902b) == null) {
            return;
        }
        for (Object obj : arrayList) {
            if (obj instanceof u) {
                k0 k0Var = (k0) this.f45902b;
                String str = ((u) obj).f49087a;
                k0Var.getClass();
                ((xi.g) k0Var.f47269b).a("VideoError", str);
            } else {
                ((xi.g) ((k0) this.f45902b).f47269b).b((p) obj);
            }
        }
        arrayList.clear();
    }

    public vc.b E() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        try {
            FileInputStream fileInputStream = new FileInputStream(r());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                    if (i10 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i11 = vc.b.f52542h;
        byte b10 = (byte) (((byte) (0 | 2)) | 1);
        int i12 = v0.i.d(5)[iOptInt];
        if (i12 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        byte b11 = (byte) (((byte) (b10 | 2)) | 1);
        if (b11 == 3 && i12 != 0) {
            return new vc.b(strOptString, i12, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i12 == 0) {
            sb2.append(" registrationStatus");
        }
        if ((b11 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b11 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }

    public void F() {
        try {
            ((FileLock) this.f45903c).release();
            ((FileChannel) this.f45902b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public void G(int i10, int i11, int i12, int i13) {
        CardView cardView = (CardView) this.f45903c;
        cardView.f4006d.set(i10, i11, i12, i13);
        Rect rect = cardView.f4005c;
        super/*android.view.View*/.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x0130  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ba  */
    public yj.k H(pm.w0 w0Var, List list, nl.a aVar) {
        a1 a1VarQ;
        yj.k kVar = new yj.k(new yj.f());
        Iterator it = list.iterator();
        if (it.hasNext()) {
            pm.y yVar = (pm.y) it.next();
            zk.g gVarE = yVar.P().e();
            if (gVarE instanceof zk.e) {
                Set set = aVar.f46791e;
                a1 a1VarB0 = yVar.b0();
                if (a1VarB0 instanceof pm.r) {
                    pm.r rVar = (pm.r) a1VarB0;
                    pm.c0 c0VarQ = rVar.f48470b;
                    if (!c0VarQ.P().getParameters().isEmpty() && c0VarQ.P().e() != null) {
                        List parameters = c0VarQ.P().getParameters();
                        n.e(parameters, "constructor.parameters");
                        List<m0> list2 = parameters;
                        ArrayList arrayList = new ArrayList(xj.p.W(list2, 10));
                        for (m0 m0Var : list2) {
                            q0 h0Var = (q0) xj.n.r0(m0Var.getIndex(), yVar.t());
                            boolean z10 = set != null && set.contains(m0Var);
                            if (h0Var == null || z10) {
                                h0Var = new h0(m0Var);
                            } else {
                                t0 t0VarF = w0Var.f();
                                pm.y yVarB = h0Var.b();
                                n.e(yVarB, "argument.type");
                                if (t0VarF.d(yVarB) == null) {
                                    h0Var = new h0(m0Var);
                                }
                            }
                            arrayList.add(h0Var);
                        }
                        c0VarQ = pm.c.q(c0VarQ, arrayList, null, 2);
                    }
                    pm.c0 c0VarQ2 = rVar.f48471c;
                    if (!c0VarQ2.P().getParameters().isEmpty() && c0VarQ2.P().e() != null) {
                        List parameters2 = c0VarQ2.P().getParameters();
                        n.e(parameters2, "constructor.parameters");
                        List<m0> list3 = parameters2;
                        ArrayList arrayList2 = new ArrayList(xj.p.W(list3, 10));
                        for (m0 m0Var2 : list3) {
                            q0 h0Var2 = (q0) xj.n.r0(m0Var2.getIndex(), yVar.t());
                            boolean z11 = set != null && set.contains(m0Var2);
                            if (h0Var2 == null || z11) {
                                h0Var2 = new h0(m0Var2);
                            } else {
                                t0 t0VarF2 = w0Var.f();
                                pm.y yVarB2 = h0Var2.b();
                                n.e(yVarB2, "argument.type");
                                if (t0VarF2.d(yVarB2) == null) {
                                    h0Var2 = new h0(m0Var2);
                                }
                            }
                            arrayList2.add(h0Var2);
                        }
                        c0VarQ2 = pm.c.q(c0VarQ2, arrayList2, null, 2);
                    }
                    a1VarQ = pm.f.j(c0VarQ, c0VarQ2);
                } else {
                    if (!(a1VarB0 instanceof pm.c0)) {
                        throw new aa.b((byte) 0, 20);
                    }
                    pm.c0 c0Var = (pm.c0) a1VarB0;
                    if (c0Var.P().getParameters().isEmpty() || c0Var.P().e() == null) {
                        a1VarQ = c0Var;
                    } else {
                        List parameters3 = c0Var.P().getParameters();
                        n.e(parameters3, "constructor.parameters");
                        List<m0> list4 = parameters3;
                        ArrayList arrayList3 = new ArrayList(xj.p.W(list4, 10));
                        for (m0 m0Var3 : list4) {
                            q0 h0Var3 = (q0) xj.n.r0(m0Var3.getIndex(), yVar.t());
                            boolean z12 = set != null && set.contains(m0Var3);
                            if (h0Var3 == null || z12) {
                                h0Var3 = new h0(m0Var3);
                            } else {
                                t0 t0VarF3 = w0Var.f();
                                pm.y yVarB3 = h0Var3.b();
                                n.e(yVarB3, "argument.type");
                                if (t0VarF3.d(yVarB3) == null) {
                                    h0Var3 = new h0(m0Var3);
                                }
                            }
                            arrayList3.add(h0Var3);
                        }
                        a1VarQ = pm.c.q(c0Var, arrayList3, null, 2);
                    }
                }
                kVar.add(w0Var.g(3, pm.c.h(a1VarQ, a1VarB0)));
            } else if (gVarE instanceof m0) {
                Set set2 = aVar.f46791e;
                if (set2 == null || !set2.contains(gVarE)) {
                    List upperBounds = ((m0) gVarE).getUpperBounds();
                    n.e(upperBounds, "declaration.upperBounds");
                    kVar.addAll(H(w0Var, upperBounds, aVar));
                } else {
                    kVar.add(s(aVar));
                }
            }
        }
        yj.f fVar = kVar.f54441a;
        fVar.g();
        return fVar.f54430i > 0 ? kVar : yj.k.f54440b;
    }

    @Override // u3.r
    public void b(q qVar) {
        t tVar = (t) this.f45903c;
        SparseArray sparseArray = tVar.f51864h;
        xd1 xd1Var = (xd1) this.f45902b;
        if (qVar.z() == 0 && (qVar.z() & 128) != 0) {
            qVar.N(6);
            int iA = qVar.a() / 4;
            for (int i10 = 0; i10 < iA; i10++) {
                qVar.k(xd1Var.f21843b, 0, 4);
                xd1Var.q(0);
                int i11 = xd1Var.i(16);
                xd1Var.t(3);
                if (i11 == 0) {
                    xd1Var.t(13);
                } else {
                    int i12 = xd1Var.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new s(new i3.f(tVar, i12)));
                        tVar.f51869n++;
                    }
                }
            }
            if (tVar.f51857a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // mi.y
    public void c(KeyEvent keyEvent, bc.i iVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            iVar.c(false);
            return;
        }
        Character chB = ((d5.o) this.f45903c).b(keyEvent.getUnicodeChar());
        boolean z10 = action != 0;
        x xVar = (x) this.f45902b;
        k3.j jVar = new k3.j(iVar, 10);
        k5.g gVar = (k5.g) xVar.f49096b;
        HashMap map = new HashMap();
        map.put("type", z10 ? "keyup" : "keydown");
        map.put("keymap", "android");
        map.put("flags", Integer.valueOf(keyEvent.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        map.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        map.put(Y3.f27967j, Integer.valueOf(keyEvent.getMetaState()));
        map.put("character", chB.toString());
        map.put("source", Integer.valueOf(keyEvent.getSource()));
        map.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        gVar.y(map, new tj.i0(jVar, 7));
    }

    @Override // ta.y
    public ListenableFuture call() {
        e0 e0Var = (e0) this.f45902b;
        int i10 = e0.f50604e;
        if (e0Var.compareAndSet(d0.f50598a, d0.f50600c)) {
            return ((ta.y) this.f45903c).call();
        }
        l0 l0Var = l0.f50626h;
        return l0Var != null ? l0Var : new l0();
    }

    /* JADX WARN: Code duplicated, block: B:121:0x022d  */
    /* JADX WARN: Code duplicated, block: B:130:0x024e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0259  */
    /* JADX WARN: Code duplicated, block: B:133:0x0262  */
    /* JADX WARN: Code duplicated, block: B:134:0x026c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0274  */
    /* JADX WARN: Code duplicated, block: B:138:0x027c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0280  */
    /* JADX WARN: Code duplicated, block: B:141:0x0288  */
    /* JADX WARN: Code duplicated, block: B:142:0x028f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0297  */
    /* JADX WARN: Code duplicated, block: B:150:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:152:0x02af  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:159:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x02db  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:171:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:173:0x0305  */
    /* JADX WARN: Code duplicated, block: B:175:0x0315  */
    /* JADX WARN: Code duplicated, block: B:176:0x032f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0340  */
    /* JADX WARN: Code duplicated, block: B:182:0x0349  */
    /* JADX WARN: Code duplicated, block: B:183:0x034b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0354  */
    /* JADX WARN: Code duplicated, block: B:187:0x0356  */
    /* JADX WARN: Code duplicated, block: B:190:0x035f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0369  */
    /* JADX WARN: Code duplicated, block: B:195:0x036e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0373  */
    /* JADX WARN: Code duplicated, block: B:198:0x0386  */
    /* JADX WARN: Code duplicated, block: B:239:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:175:0x0315, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // k3.m
    public void e(byte[] bArr, int i10, int i11, l lVar, l1.g gVar) {
        t3.c cVarD;
        String strTrim;
        int i12;
        String string;
        int i13;
        Matcher matcher;
        String strGroup;
        byte b10;
        boolean z10;
        k kVar = this;
        q qVar = (q) kVar.f45902b;
        qVar.K(bArr, i10 + i11);
        qVar.M(i10);
        ArrayList arrayList = new ArrayList();
        try {
            t3.h.d(qVar);
            while (!TextUtils.isEmpty(qVar.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z11 = false;
                int i14 = -1;
                int i15 = 0;
                byte b11 = -1;
                while (true) {
                    int i16 = 1;
                    if (b11 == -1) {
                        i15 = qVar.f44814b;
                        String strN = qVar.n(StandardCharsets.UTF_8);
                        if (strN == null) {
                            b11 = 0;
                        } else if ("STYLE".equals(strN)) {
                            b11 = 2;
                        } else {
                            b11 = strN.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        qVar.M(i15);
                        if (b11 == 0) {
                            i0.n0(new qd.i(arrayList2), lVar, gVar);
                            return;
                        }
                        if (b11 == 1) {
                            while (!TextUtils.isEmpty(qVar.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str = null;
                            if (b11 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new IllegalArgumentException("A style block was found after the first cue.");
                                }
                                qVar.n(StandardCharsets.UTF_8);
                                t3.a aVar = (t3.a) kVar.f45903c;
                                q qVar2 = aVar.f50444a;
                                StringBuilder sb2 = aVar.f50445b;
                                sb2.setLength(0);
                                int i17 = qVar.f44814b;
                                while (!TextUtils.isEmpty(qVar.n(StandardCharsets.UTF_8))) {
                                }
                                qVar2.K(qVar.f44813a, qVar.f44814b);
                                qVar2.M(i17);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    t3.a.c(qVar2);
                                    if (qVar2.a() >= 5 && "::cue".equals(qVar2.x(5, StandardCharsets.UTF_8))) {
                                        int i18 = qVar2.f44814b;
                                        String strB = t3.a.b(qVar2, sb2);
                                        if (strB == null) {
                                            strTrim = str;
                                        } else if ("{".equals(strB)) {
                                            qVar2.M(i18);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i19 = qVar2.f44814b;
                                                int i20 = qVar2.f44815c;
                                                int i21 = z11 ? 1 : 0;
                                                while (i19 < i20 && i21 == 0) {
                                                    int i22 = i19 + 1;
                                                    i21 = ((char) qVar2.f44813a[i19]) == ')' ? i16 : z11 ? 1 : 0;
                                                    i19 = i22;
                                                }
                                                strTrim = qVar2.x((i19 - 1) - qVar2.f44814b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = str;
                                            }
                                            if (!")".equals(t3.a.b(qVar2, sb2))) {
                                                strTrim = str;
                                            }
                                        }
                                    } else {
                                        strTrim = str;
                                    }
                                    if (strTrim != null && "{".equals(t3.a.b(qVar2, sb2))) {
                                        t3.b bVar = new t3.b();
                                        bVar.f50446a = "";
                                        bVar.f50447b = "";
                                        bVar.f50448c = Collections.EMPTY_SET;
                                        bVar.f50449d = "";
                                        bVar.f50450e = str;
                                        bVar.f50452g = z11;
                                        bVar.f50454i = z11;
                                        bVar.f50455j = i14;
                                        bVar.f50456k = i14;
                                        bVar.l = i14;
                                        bVar.f50457m = i14;
                                        bVar.f50458n = i14;
                                        bVar.f50460p = i14;
                                        bVar.f50461q = z11;
                                        if (!strTrim.isEmpty()) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i14) {
                                                Matcher matcher2 = t3.a.f50442c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i16);
                                                    strGroup2.getClass();
                                                    bVar.f50449d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(z11 ? 1 : 0, iIndexOf);
                                            }
                                            String str2 = l1.y.f44830a;
                                            String[] strArrSplit = strTrim.split("\\.", i14);
                                            String str3 = strArrSplit[z11 ? 1 : 0];
                                            int iIndexOf2 = str3.indexOf(35);
                                            if (iIndexOf2 != i14) {
                                                bVar.f50447b = str3.substring(z11 ? 1 : 0, iIndexOf2);
                                                bVar.f50446a = str3.substring(iIndexOf2 + 1);
                                            } else {
                                                bVar.f50447b = str3;
                                            }
                                            if (strArrSplit.length > i16) {
                                                int length = strArrSplit.length;
                                                go.k.i(length <= strArrSplit.length ? i16 : z11 ? 1 : 0);
                                                bVar.f50448c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i16, length)));
                                            }
                                        }
                                        ?? r10 = z11 ? 1 : 0;
                                        String strB2 = str;
                                        while (r10 == 0) {
                                            int i23 = qVar2.f44814b;
                                            strB2 = t3.a.b(qVar2, sb2);
                                            ?? r15 = (strB2 == null || "}".equals(strB2)) ? i16 : z11;
                                            if (r15 == 0) {
                                                qVar2.M(i23);
                                                t3.a.c(qVar2);
                                                String strA = t3.a.a(qVar2, sb2);
                                                if (!strA.isEmpty() && ":".equals(t3.a.b(qVar2, sb2))) {
                                                    t3.a.c(qVar2);
                                                    StringBuilder sb3 = new StringBuilder();
                                                    boolean z12 = false;
                                                    while (true) {
                                                        if (z12) {
                                                            string = sb3.toString();
                                                        } else {
                                                            int i24 = qVar2.f44814b;
                                                            String strB3 = t3.a.b(qVar2, sb2);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                                qVar2.M(i24);
                                                                z12 = true;
                                                            } else {
                                                                sb3.append(strB3);
                                                            }
                                                        }
                                                    }
                                                    if (string == null || string.isEmpty()) {
                                                        i12 = 1;
                                                    } else {
                                                        int i25 = qVar2.f44814b;
                                                        String strB4 = t3.a.b(qVar2, sb2);
                                                        if (";".equals(strB4)) {
                                                            if ("color".equals(strA)) {
                                                                i13 = 1;
                                                                bVar.f50451f = l1.e.a(string, true);
                                                                bVar.f50452g = true;
                                                            } else {
                                                                i13 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    bVar.f50453h = l1.e.a(string, true);
                                                                    bVar.f50454i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string)) {
                                                                            z10 = true;
                                                                        } else {
                                                                            z10 = true;
                                                                        }
                                                                        bVar.f50461q = z10;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if (TtmlNode.UNDERLINE.equals(string)) {
                                                                            i13 = 1;
                                                                            bVar.f50456k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        bVar.f50450e = q1.F(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i13 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if (TtmlNode.ITALIC.equals(string)) {
                                                                                bVar.f50457m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = t3.a.f50443d.matcher(q1.F(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b10 = 0;
                                                                                        }
                                                                                        switch (b10) {
                                                                                            case 0:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i12);
                                                                                        strGroup3.getClass();
                                                                                        bVar.f50459o = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals(UserDataStore.EMAIL)) {
                                                                                            b10 = 1;
                                                                                        }
                                                                                        switch (b10) {
                                                                                            case 0:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i12);
                                                                                        strGroup4.getClass();
                                                                                        bVar.f50459o = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b10 = 2;
                                                                                        }
                                                                                        switch (b10) {
                                                                                            case 0:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i12);
                                                                                        strGroup5.getClass();
                                                                                        bVar.f50459o = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b10 = -1;
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i12 = 1;
                                                                                        bVar.f50458n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i12 = 1;
                                                                                        bVar.f50458n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i12 = 1;
                                                                                        bVar.f50458n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup6 = matcher.group(i12);
                                                                                strGroup6.getClass();
                                                                                bVar.f50459o = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                l1.a.s("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            }
                                                                        }
                                                                    } else if (TtmlNode.BOLD.equals(string)) {
                                                                        i13 = 1;
                                                                        bVar.l = 1;
                                                                    }
                                                                    i12 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    bVar.f50460p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    bVar.f50460p = 2;
                                                                    i12 = 1;
                                                                } else {
                                                                    i12 = 1;
                                                                }
                                                            }
                                                            i12 = i13;
                                                        } else if ("}".equals(strB4)) {
                                                            qVar2.M(i25);
                                                            if ("color".equals(strA)) {
                                                                i13 = 1;
                                                                bVar.f50451f = l1.e.a(string, true);
                                                                bVar.f50452g = true;
                                                            } else {
                                                                i13 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    bVar.f50453h = l1.e.a(string, true);
                                                                    bVar.f50454i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                                            z10 = true;
                                                                        } else {
                                                                            z10 = false;
                                                                        }
                                                                        bVar.f50461q = z10;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if (TtmlNode.UNDERLINE.equals(string)) {
                                                                            i13 = 1;
                                                                            bVar.f50456k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        bVar.f50450e = q1.F(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i13 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if (TtmlNode.ITALIC.equals(string)) {
                                                                                bVar.f50457m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = t3.a.f50443d.matcher(q1.F(string));
                                                                            if (matcher.matches()) {
                                                                                l1.a.s("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            } else {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b10 = 0;
                                                                                        }
                                                                                        switch (b10) {
                                                                                            case 0:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup7 = matcher.group(i12);
                                                                                        strGroup7.getClass();
                                                                                        bVar.f50459o = Float.parseFloat(strGroup7);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals(UserDataStore.EMAIL)) {
                                                                                            b10 = 1;
                                                                                        }
                                                                                        switch (b10) {
                                                                                            case 0:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup8 = matcher.group(i12);
                                                                                        strGroup8.getClass();
                                                                                        bVar.f50459o = Float.parseFloat(strGroup8);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b10 = 2;
                                                                                        }
                                                                                        switch (b10) {
                                                                                            case 0:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i12 = 1;
                                                                                                bVar.f50458n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup9 = matcher.group(i12);
                                                                                        strGroup9.getClass();
                                                                                        bVar.f50459o = Float.parseFloat(strGroup9);
                                                                                        break;
                                                                                }
                                                                                b10 = -1;
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i12 = 1;
                                                                                        bVar.f50458n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i12 = 1;
                                                                                        bVar.f50458n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i12 = 1;
                                                                                        bVar.f50458n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup10 = matcher.group(i12);
                                                                                strGroup10.getClass();
                                                                                bVar.f50459o = Float.parseFloat(strGroup10);
                                                                            }
                                                                        }
                                                                    } else if (TtmlNode.BOLD.equals(string)) {
                                                                        i13 = 1;
                                                                        bVar.l = 1;
                                                                    }
                                                                    i12 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    bVar.f50460p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    bVar.f50460p = 2;
                                                                    i12 = 1;
                                                                } else {
                                                                    i12 = 1;
                                                                }
                                                            }
                                                            i12 = i13;
                                                        } else {
                                                            i12 = 1;
                                                        }
                                                    }
                                                } else {
                                                    i12 = i16;
                                                }
                                            } else {
                                                i12 = i16;
                                            }
                                            i16 = i12;
                                            r10 = r15;
                                            z11 = false;
                                        }
                                        int i26 = i16;
                                        if ("}".equals(strB2)) {
                                            arrayList3.add(bVar);
                                        }
                                        i16 = i26;
                                        z11 = false;
                                        i14 = -1;
                                        str = null;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b11 == 3) {
                                Pattern pattern = t3.g.f50474a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strN2 = qVar.n(charset);
                                if (strN2 == null) {
                                    cVarD = null;
                                } else {
                                    Pattern pattern2 = t3.g.f50474a;
                                    Matcher matcher3 = pattern2.matcher(strN2);
                                    if (matcher3.matches()) {
                                        cVarD = t3.g.d(null, matcher3, qVar, arrayList);
                                    } else {
                                        cVarD = null;
                                        String strN3 = qVar.n(charset);
                                        if (strN3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strN3);
                                            if (matcher4.matches()) {
                                                cVarD = t3.g.d(strN2.trim(), matcher4, qVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (cVarD != null) {
                                    arrayList2.add(cVarD);
                                }
                            }
                            kVar = this;
                        }
                    }
                }
            }
        } catch (i1.e0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // vj.a
    public Object get() {
        return new s8.d((Context) ((x) this.f45902b).f49096b, (qd.i) ((x) this.f45903c).get());
    }

    @Override // k3.m
    public int i() {
        return 1;
    }

    @Override // lm.e
    public lm.d j(yl.b classId) {
        n.f(classId, "classId");
        el.c cVar = (el.c) this.f45902b;
        rl.d dVar = (rl.d) this.f45903c;
        n.f(dVar.c().f45539c, "<this>");
        el.b bVarN = q1.n(cVar, classId, xl.f.f53902g);
        if (bVarN == null) {
            return null;
        }
        fl.c.a(bVarN.f40112a).equals(classId);
        return dVar.f(bVarN);
    }

    @Override // n6.m
    public void l() {
        v vVar = (v) this.f45902b;
        synchronized (vVar) {
            vVar.f46614c = vVar.f46612a.length;
        }
    }

    @Override // n6.m
    public void m(Bitmap bitmap, h6.a aVar) throws IOException {
        IOException iOException = ((a7.f) this.f45903c).f3424b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            aVar.b(bitmap);
            throw iOException;
        }
    }

    public td.d p(qd.c cVar) throws pd.c {
        String string;
        JSONArray jSONArray = cVar.f48951g;
        long j10 = cVar.f48950f;
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                qd.c cVarC = ((qd.b) this.f45902b).c();
                String string3 = null;
                if (cVarC == null) {
                    string = null;
                } else {
                    try {
                        string = cVarC.f48946b.getString(strOptString);
                    } catch (JSONException unused) {
                        string = null;
                    }
                }
                if (string == null) {
                    qd.c cVarC2 = ((qd.b) this.f45903c).c();
                    if (cVarC2 != null) {
                        try {
                            string3 = cVarC2.f48946b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i11 = td.e.f50742a;
                td.b bVar = new td.b();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                bVar.f50730a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                bVar.f50731b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                bVar.f50732c = strOptString;
                bVar.f50733d = string;
                bVar.f50734e = j10;
                bVar.f50735f = (byte) (bVar.f50735f | 1);
                hashSet.add(bVar.a());
            } catch (JSONException e10) {
                throw new pd.c("Exception parsing rollouts metadata to create RolloutsState.", e10);
            }
        }
        return new td.d(hashSet);
    }

    public va.f q(int i10) {
        List list = (List) this.f45902b;
        if (i10 < 0 || i10 >= list.size()) {
            StringBuilder sbU = defpackage.e.u(i10, "Invalid index ", " for keyset of size ");
            sbU.append(list.size());
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        va.f fVar = (va.f) list.get(i10);
        if (!C(fVar.f52521b)) {
            throw new IllegalStateException(defpackage.e.h(i10, "Keyset-Entry at position ", " has wrong status"));
        }
        if (fVar.f52525f) {
            throw new IllegalStateException(defpackage.e.h(i10, "Keyset-Entry at position ", " didn't parse correctly"));
        }
        return (va.f) list.get(i10);
    }

    public File r() {
        if (((File) this.f45902b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f45902b) == null) {
                        String str = "PersistedInstallation." + ((mb.g) this.f45903c).g() + ".json";
                        mb.g gVar = (mb.g) this.f45903c;
                        gVar.a();
                        File file = new File(gVar.f45928a.getNoBackupFilesDir(), str);
                        this.f45902b = file;
                        if (file.exists()) {
                            return (File) this.f45902b;
                        }
                        mb.g gVar2 = (mb.g) this.f45903c;
                        gVar2.a();
                        File file2 = new File(gVar2.f45928a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f45902b)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (File) this.f45902b;
    }

    public a1 s(nl.a aVar) {
        a1 a1VarH0;
        pm.c0 c0Var = aVar.f46792f;
        return (c0Var == null || (a1VarH0 = i0.h0(c0Var)) == null) ? (rm.f) ((wj.j) this.f45902b).getValue() : a1VarH0;
    }

    public pm.y t(m0 typeParameter, nl.a typeAttr) {
        n.f(typeParameter, "typeParameter");
        n.f(typeAttr, "typeAttr");
        return (pm.y) ((om.e) this.f45903c).invoke(new p0(typeParameter, typeAttr));
    }

    public String toString() {
        switch (this.f45901a) {
            case 19:
                return ((ta.y) this.f45903c).toString();
            case 25:
                return va.j.a(u()).toString();
            default:
                return super.toString();
        }
    }

    public f1 u() {
        try {
            c1 c1VarE = f1.E();
            for (va.f fVar : (List) this.f45902b) {
                i0 i0VarA = fVar.a();
                int i10 = fVar.f52523d;
                e1 e1VarK = k(i0VarA, fVar.f52521b, i10);
                c1VarE.e();
                f1.z((f1) c1VarE.f24645b, e1VarK);
                if (fVar.f52524e) {
                    c1VarE.e();
                    f1.y((f1) c1VarE.f24645b, i10);
                }
            }
            return (f1) c1VarE.a();
        } catch (GeneralSecurityException e10) {
            throw new aa.b(e10, 11);
        }
    }

    public synchronized List v(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f45902b).contains(str)) {
                ((ArrayList) this.f45902b).add(str);
            }
            arrayList = (List) ((HashMap) this.f45903c).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f45903c).put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public va.f w() {
        for (va.f fVar : (List) this.f45902b) {
            if (fVar != null && fVar.f52524e) {
                if (fVar.f52522c == va.c.f52510c) {
                    return fVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public Object x(Class cls) throws GeneralSecurityException {
        List list = (List) this.f45902b;
        f1 f1VarU = u();
        int i10 = va.j.f52528a;
        int iD = f1VarU.D();
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (e1 e1Var : f1VarU.C()) {
            if (e1Var.F() == y0.ENABLED) {
                if (!e1Var.G()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(e1Var.D())));
                }
                if (e1Var.E() == s1.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(e1Var.D())));
                }
                if (e1Var.F() == y0.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(e1Var.D())));
                }
                if (e1Var.D() == iD) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (e1Var.C().C() != w0.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i11++;
            }
        }
        if (i11 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (((va.f) list.get(i12)).f52525f || !C(((va.f) list.get(i12)).f52521b)) {
                e1 e1VarA = f1VarU.A(i12);
                StringBuilder sbU = defpackage.e.u(i12, "Key parsing of key with index ", " and type_url ");
                sbU.append(e1VarA.C().D());
                sbU.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sbU.toString());
            }
        }
        a0 a0Var = (a0) eb.n.f40002b.f40003a.get();
        HashMap map = a0Var.f39964b;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException(defpackage.e.l(cls, "No wrapper found for "));
        }
        b0 b0Var = (b0) map.get(cls);
        return b0Var.b(this, new cj.h(16, a0Var, b0Var));
    }

    public synchronized ArrayList y(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f45902b).iterator();
        while (it.hasNext()) {
            List<v6.d> list = (List) ((HashMap) this.f45903c).get((String) it.next());
            if (list != null) {
                for (v6.d dVar : list) {
                    if ((dVar.f52489a.isAssignableFrom(cls) && cls2.isAssignableFrom(dVar.f52490b)) && !arrayList.contains(dVar.f52490b)) {
                        arrayList.add(dVar.f52490b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized Map z() {
        try {
            if (((Map) this.f45903c) == null) {
                this.f45903c = Collections.unmodifiableMap(new HashMap((HashMap) this.f45902b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f45903c;
    }

    public /* synthetic */ k(int i10, boolean z10) {
        this.f45901a = i10;
    }

    public /* synthetic */ k(Object obj, int i10) {
        this.f45901a = i10;
        this.f45903c = obj;
    }

    public k(ne.a aVar) {
        this.f45901a = 9;
        om.l lVar = new om.l("Type parameter upper bound erasure results");
        this.f45902b = r9.b.u(new al.l(this, 20));
        this.f45903c = lVar.b(new al.f(this, 22));
    }

    public k(WorkDatabase_Impl workDatabase_Impl) {
        this.f45901a = 0;
        this.f45902b = workDatabase_Impl;
        this.f45903c = new b(workDatabase_Impl, 6);
    }

    public k(Object obj) {
        this.f45901a = 6;
        this.f45902b = obj;
        this.f45903c = Thread.currentThread();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(jk.b bVar) {
        this.f45901a = 20;
        this.f45902b = (kotlin.jvm.internal.o) bVar;
        this.f45903c = new ConcurrentHashMap();
    }

    public k(x xVar) {
        this.f45901a = 1;
        this.f45903c = new d5.o(13);
        this.f45902b = xVar;
    }

    public k(Context context) {
        this.f45901a = 5;
        this.f45902b = context;
    }

    public k(x4.b bVar) {
        this.f45901a = 28;
        k kVar = new k(23);
        this.f45902b = bVar;
        this.f45903c = kVar;
    }

    public k(int i10) {
        this.f45901a = i10;
        switch (i10) {
            case 7:
                this.f45902b = new HashMap();
                this.f45903c = p1.b.f47926b;
                break;
            case 12:
                this.f45903c = new ArrayList();
                break;
            case 18:
                this.f45902b = new q();
                this.f45903c = new t3.a();
                break;
            case 23:
                this.f45902b = new ReentrantLock();
                this.f45903c = new LinkedHashMap();
                break;
            case 24:
                this.f45902b = new ArrayList();
                this.f45903c = new HashMap();
                break;
            default:
                this.f45902b = new HashMap();
                break;
        }
    }

    public k(t tVar) {
        this.f45901a = 21;
        this.f45903c = tVar;
        this.f45902b = new xd1(new byte[4], 4);
    }

    public k(Map map, List list) throws GeneralSecurityException {
        this.f45901a = 25;
        this.f45902b = list;
        this.f45903c = map;
        if (((AtomicBoolean) za.a.f54668a.f47269b).get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                va.f fVar = (va.f) it.next();
                int i10 = fVar.f52523d;
                if (!hashSet.contains(Integer.valueOf(i10))) {
                    hashSet.add(Integer.valueOf(i10));
                    if (fVar.f52524e) {
                        z10 = true;
                    }
                } else {
                    throw new GeneralSecurityException(defpackage.e.h(i10, "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
            }
            if (!z10) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
    }

    @Override // u3.r
    public void a(l1.x xVar, n2.m mVar, ga gaVar) {
    }
}
