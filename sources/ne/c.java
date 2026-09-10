package ne;

import android.app.usage.StorageStatsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Path;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import cc.a2;
import com.google.android.gms.internal.ads.t0;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import e6.i;
import e6.l;
import fh.r;
import fh.s;
import g6.a0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.x;
import org.json.JSONArray;
import org.json.JSONObject;
import q7.e0;
import qk.i0;
import t6.j;
import xi.m;
import xi.o;
import xj.b0;
import xj.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements d, x, l, tb.d, s0.c, j, t9.c, sg.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c f46713b = new c(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46714a;

    public /* synthetic */ c(int i10) {
        this.f46714a = i10;
    }

    public static String c(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (sb2.charAt(0) << 18) + ((length >= 2 ? sb2.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb2.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb2.charAt(3) : (char) 0);
        char c4 = (char) ((iCharAt >> 16) & 255);
        char c5 = (char) ((iCharAt >> 8) & 255);
        char c10 = (char) (iCharAt & 255);
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append(c4);
        if (length >= 2) {
            sb3.append(c5);
        }
        if (length >= 3) {
            sb3.append(c10);
        }
        return sb3.toString();
    }

    public static q7.j j() {
        return new q7.j(null, b0.N(new wj.f(2, null), new wj.f(4, null), new wj.f(9, null), new wj.f(17, null), new wj.f(341, null)), b0.N(new wj.f(Integer.valueOf(InterfaceC0435l1.d.b.f29106c), null), new wj.f(190, null), new wj.f(412, null)), null, null, null);
    }

    public static Path l(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    public static HashMap q(JSONObject jSONObject) {
        int iOptInt;
        HashSet hashSet;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return null;
        }
        HashMap map = new HashMap();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        int iOptInt2 = jSONArrayOptJSONArray2.optInt(i11);
                        if (iOptInt2 != 0) {
                            hashSet.add(Integer.valueOf(iOptInt2));
                        }
                    }
                }
                map.put(Integer.valueOf(iOptInt), hashSet);
            }
        }
        return map;
    }

    public static void r() {
        File[] fileArrListFiles;
        if (e0.u()) {
            return;
        }
        File fileT = a2.t();
        if (fileT == null) {
            fileArrListFiles = new File[0];
        } else {
            fileArrListFiles = fileT.listFiles(new fc.a(3));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(android.support.v4.media.session.a.C(file));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((s7.c) obj).a()) {
                arrayList2.add(obj);
            }
        }
        List listI0 = n.I0(arrayList2, new b2.j(20));
        JSONArray jSONArray = new JSONArray();
        pk.b it = com.bumptech.glide.d.O(0, Math.min(listI0.size(), 5)).iterator();
        while (it.f48398c) {
            jSONArray.put(listI0.get(it.nextInt()));
        }
        a2.J("crash_reports", jSONArray, new t7.b(listI0, 1));
    }

    public static void s(boolean z10, boolean z11) {
        go.c.f42027a = z10;
        bf.b bVar = s.f40919j;
        bVar.a(com.bumptech.glide.d.K(bVar));
        if (s.f40913d) {
            return;
        }
        String message = "startScan call with useRecordingFolders=" + z10 + ", shouldRestartScan=" + z11;
        kotlin.jvm.internal.n.f(message, "message");
        Log.i("ProjectLogger", message);
        android.support.v4.media.session.a.B(new r(z11, null));
    }

    public String a(List list) throws IOException {
        kotlin.jvm.internal.n.f(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        kotlin.jvm.internal.n.e(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    @Override // e6.b
    public boolean d(Object obj, File file, i iVar) throws Throwable {
        try {
            a7.c.d(((r6.c) ((a0) obj).get()).f49419a.f49418a.f49437a.f38740d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            return false;
        }
    }

    @Override // e6.l
    public int e(i iVar) {
        return 1;
    }

    @Override // tb.d
    public /* synthetic */ Object g(tb.s sVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(sVar);
    }

    public synchronized q7.j i() {
        q7.j jVar;
        try {
            if (q7.j.f48702e == null) {
                q7.j.f48702e = j();
            }
            jVar = q7.j.f48702e;
            kotlin.jvm.internal.n.d(jVar, "null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
        } catch (Throwable th2) {
            throw th2;
        }
        return jVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020 A[DONT_INVERT, PHI: r4
  0x0020: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:5:0x0019, B:7:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // t9.c
    public t0 k(Context context, String str, t9.b bVar) {
        switch (this.f46714a) {
            case 18:
                t0 t0Var = new t0();
                int iA = bVar.a(context, str, true);
                t0Var.f20104b = iA;
                if (iA != 0) {
                    t0Var.f20105c = 1;
                } else {
                    int iD = bVar.d(context, str);
                    t0Var.f20103a = iD;
                    if (iD != 0) {
                        t0Var.f20105c = -1;
                    }
                }
                return t0Var;
            default:
                t0 t0Var2 = new t0();
                t0Var2.f20103a = bVar.d(context, str);
                int i10 = 1;
                int iA2 = bVar.a(context, str, true);
                t0Var2.f20104b = iA2;
                int i11 = t0Var2.f20103a;
                if (i11 == 0) {
                    i11 = 0;
                    if (iA2 == 0) {
                        i10 = 0;
                    } else if (i11 >= iA2) {
                        i10 = -1;
                    }
                } else if (i11 >= iA2) {
                    i10 = -1;
                }
                t0Var2.f20105c = i10;
                return t0Var2;
        }
    }

    public double m() {
        long totalBytes;
        try {
            totalBytes = ((StorageStatsManager) super.h().getSystemService(StorageStatsManager.class)).getTotalBytes(StorageManager.UUID_DEFAULT);
        } catch (Exception unused) {
            totalBytes = 0;
        }
        double d10 = totalBytes / 1.073741824E9d;
        if (d10 <= 0.0d) {
            return 0.0d;
        }
        return Math.pow(2.0d, Math.rint(Math.log(d10) / lk.a.f45484a));
    }

    public String n(String str) throws IOException {
        ContentResolver contentResolver = super.h().getContentResolver();
        kotlin.jvm.internal.n.e(contentResolver, "getContentResolver(...)");
        Cursor cursorQuery = contentResolver.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{IronSourceConstants.EVENTS_DURATION}, "_id = ?", new String[]{str}, null);
        if (cursorQuery == null) {
            return "00:00";
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            if (!cursor2.moveToFirst()) {
                cursor.close();
                return "00:00";
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(cursor2.getLong(cursor2.getColumnIndexOrThrow(IronSourceConstants.EVENTS_DURATION)));
            if (seconds < 0) {
                seconds = 0;
            }
            long j10 = 60;
            String str2 = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds / j10), Long.valueOf(seconds % j10)}, 2));
            cursor.close();
            return str2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursor, th2);
                throw th3;
            }
        }
    }

    @Override // ne.d
    public void o(b0.n nVar) {
        boolean z10;
        String str = nVar.f5153a;
        StringBuilder sb2 = (StringBuilder) nVar.f5158f;
        StringBuilder sb3 = new StringBuilder();
        while (true) {
            z10 = true;
            if (!nVar.b()) {
                break;
            }
            char cA = nVar.a();
            if (cA >= ' ' && cA <= '?') {
                sb3.append(cA);
            } else {
                if (cA < '@' || cA > '^') {
                    r9.b.n(cA);
                    throw null;
                }
                sb3.append((char) (cA - '@'));
            }
            nVar.f5154b++;
            if (sb3.length() >= 4) {
                sb2.append(c(sb3));
                sb3.delete(0, 4);
                if (r9.b.v(str, nVar.f5154b, 4) != 4) {
                    nVar.f5155c = 0;
                    break;
                }
            }
        }
        sb3.append((char) 31);
        try {
            int length = sb3.length();
            if (length == 0) {
                nVar.f5155c = 0;
                return;
            }
            if (length == 1) {
                nVar.d(sb2.length());
                int length2 = ((f) nVar.f5159g).f46721b - sb2.length();
                int length3 = (str.length() - nVar.f5156d) - nVar.f5154b;
                if (length3 > length2) {
                    nVar.d(sb2.length() + 1);
                    length2 = ((f) nVar.f5159g).f46721b - sb2.length();
                }
                if (length3 <= length2 && length2 <= 2) {
                    nVar.f5155c = 0;
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i10 = length - 1;
            String strC = c(sb3);
            if (nVar.b() || i10 > 2) {
                z10 = false;
            }
            if (i10 <= 2) {
                nVar.d(sb2.length() + i10);
                if (((f) nVar.f5159g).f46721b - sb2.length() >= 3) {
                    nVar.d(sb2.length() + strC.length());
                    z10 = false;
                }
            }
            if (z10) {
                nVar.f5159g = null;
                nVar.f5154b -= i10;
            } else {
                sb2.append(strC);
            }
            nVar.f5155c = 0;
        } catch (Throwable th2) {
            nVar.f5155c = 0;
            throw th2;
        }
    }

    public void p(m call, o oVar) {
        ak.f fVar;
        Object next;
        kotlin.jvm.internal.n.f(call, "call");
        Iterator<E> it = rg.c.f49582c.iterator();
        do {
            fVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((rg.c) next).f49583a.equals(call.f53822a));
        rg.c cVar = (rg.c) next;
        if (cVar == null) {
            ((wi.j) oVar).c();
            return;
        }
        try {
            switch (cVar.ordinal()) {
                case 0:
                    double dM = m();
                    StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                    ((wi.j) oVar).a(Double.valueOf((dM - ((statFs.getBlockSizeLong() * statFs.getFreeBlocksLong()) / 1.0E9d)) / m()));
                    return;
                case 1:
                    StatFs statFs2 = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                    ((wi.j) oVar).a(Integer.valueOf((int) ((statFs2.getBlockSizeLong() * statFs2.getFreeBlocksLong()) / 1.0E9d)));
                    return;
                case 2:
                    ((wi.j) oVar).a(Integer.valueOf((int) m()));
                    return;
                case 3:
                    double dM2 = m();
                    StatFs statFs3 = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                    ((wi.j) oVar).a(Integer.valueOf((int) (dM2 - ((statFs3.getBlockSizeLong() * statFs3.getFreeBlocksLong()) / 1.0E9d))));
                    return;
                case 4:
                    String str = (String) call.a("uri");
                    if (str == null) {
                        ((wi.j) oVar).b("ARG", "uri required", null);
                        return;
                    } else {
                        ((wi.j) oVar).a(n(str));
                        return;
                    }
                case 5:
                    List list = (List) call.a("ids");
                    if (list == null) {
                        ((wi.j) oVar).b("ARG", "uris required", null);
                        return;
                    } else {
                        android.support.v4.media.session.a.B(new b4.b((wi.j) oVar, list, fVar, 14));
                        return;
                    }
                case 6:
                    zg.a aVar = zg.a.f54953a;
                    AudioManager audioManager = zg.a.f54955c;
                    ((wi.j) oVar).a(Boolean.valueOf(audioManager.getRingerMode() == 0 || audioManager.getRingerMode() == 1));
                    return;
                case 7:
                    Boolean bool = (Boolean) call.a("useRecordingFolders");
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    Boolean bool2 = (Boolean) call.a("shouldRestartScan");
                    s(zBooleanValue, bool2 != null ? bool2.booleanValue() : false);
                    ((wi.j) oVar).a(Boolean.TRUE);
                    return;
                case 8:
                    File filesDir = super.h().getFilesDir();
                    gh.b bVar = gh.b.f41895a;
                    ((wi.j) oVar).a(new File(filesDir, gh.b.d().a()).getAbsolutePath());
                    return;
                default:
                    throw new aa.b((byte) 0, 20);
            }
        } catch (Throwable th2) {
            ((wi.j) oVar).b("NATIVE_ERR", th2.getMessage(), null);
        }
    }

    @Override // o.x
    public boolean u(o.m mVar) {
        return false;
    }

    public c() {
        this.f46714a = 6;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override // s0.c
    public Object f(s0.b bVar) throws s0.b {
        throw bVar;
    }

    @Override // o.x
    public void b(o.m mVar, boolean z10) {
    }
}
