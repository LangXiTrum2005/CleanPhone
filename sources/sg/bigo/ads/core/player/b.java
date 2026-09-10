package sg.bigo.ads.core.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import com.inmobi.commons.core.configs.CrashConfig;
import com.thinkup.core.common.om.n;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements sg.bigo.ads.common.h.b.a, sg.bigo.ads.core.player.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f48774a = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f48776c;
    public List<o> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<o> f48777e;
    public Map<String, a> f;
    public sg.bigo.ads.common.h.b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public sg.bigo.ads.core.player.a f48778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public sg.bigo.ads.common.h.a.a f48779i;
    private sg.bigo.ads.core.player.a.d k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f48775b = new AtomicBoolean(false);
    private long j = 0;

    public interface a {
        void a();

        void a(int i2);

        void a(String str, sg.bigo.ads.common.h.a aVar);

        void b(int i2);
    }

    private b() {
    }

    private static sg.bigo.ads.api.a.d a(o oVar) {
        h hVar;
        if (!oVar.aR() || oVar.aS() || (hVar = i.f46986a) == null || hVar.r() == null) {
            return null;
        }
        return hVar.r();
    }

    private static sg.bigo.ads.core.player.a.d d() {
        sg.bigo.ads.common.h.b.a("start HttpProxyCacheServer ServerSocket", (sg.bigo.ads.common.h.a) null);
        return new sg.bigo.ads.core.player.a.d();
    }

    private void e() {
        if (System.currentTimeMillis() - this.j > n.m) {
            c();
        }
    }

    public final sg.bigo.ads.core.player.a.d b() {
        sg.bigo.ads.core.player.a.d dVar = this.k;
        if (dVar != null) {
            return dVar;
        }
        sg.bigo.ads.core.player.a.d dVarD = d();
        this.k = dVarD;
        return dVarD;
    }

    public final void c() {
        this.j = System.currentTimeMillis();
        sg.bigo.ads.common.h.b.a("start resource delete task", (sg.bigo.ads.common.h.a) null);
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.b(b.this);
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
    }

    private static sg.bigo.ads.common.h.a a(Context context, String str, String str2, o oVar, sg.bigo.ads.api.a.d dVar) {
        if (dVar == null) {
            return new sg.bigo.ads.common.h.a(str, oVar.a(context), str2, oVar.aR(), oVar.al(), oVar.aS(), null);
        }
        return new sg.bigo.ads.common.h.a(str, oVar.a(context), str2, oVar.aR(), oVar.al(), false, new sg.bigo.ads.common.h.c(dVar.a(oVar.v(), oVar.x()), dVar.c(oVar.x()), dVar.a(oVar.x()), dVar.b(oVar.x()), dVar.d(oVar.x())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, o oVar, a aVar) {
        String strAP = oVar.aP();
        String strAQ = oVar.aQ();
        sg.bigo.ads.common.h.a aVarA = a(context, strAP, strAQ, oVar, a(oVar));
        if (aVarA.c()) {
            sg.bigo.ads.common.t.a.a(0, 3, "DownloadInfo", "info SupportFillTime: " + aVarA.toString());
            this.f48777e.add(oVar);
        }
        boolean z2 = i.f46986a.n().a(9) && URLUtil.isHttpUrl(strAP);
        if (z2) {
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) oVar, strAP, "Invalid http url", 0L, 0L, 2, "", false);
        }
        if (!z2 && !q.a((CharSequence) strAP) && !q.a((CharSequence) strAQ)) {
            this.d.add(oVar);
            this.f.put(oVar.aJ(), aVar);
            sg.bigo.ads.common.h.b.a("downloadMedia", aVarA);
            this.g.a(aVarA, false);
            this.f48778h.a(aVarA);
            return;
        }
        oVar.i(5);
        if (!aVarA.c()) {
            aVar.b(z2 ? 10118 : 10103);
            return;
        }
        aVar.a();
        this.f.put(oVar.aJ(), aVar);
        this.f48778h.c(aVarA);
    }

    @Override // sg.bigo.ads.core.player.a.c
    public final void c(sg.bigo.ads.common.h.a aVar) {
        sg.bigo.ads.common.h.b.a("callback download check Process source=", aVar);
        int iG = aVar.g();
        long j = aVar.f47256i;
        if (j > 0 && aVar.g * 100 >= j * ((long) iG)) {
            sg.bigo.ads.common.h.b.a("video download process is enough. download percent: " + aVar.g + ", total size:" + aVar.f47256i, aVar);
            return;
        }
        sg.bigo.ads.common.h.b.a("video download process is not enough. download size: " + aVar.g + ", total size:" + aVar.f47256i + ", begin to download backup", aVar);
        boolean zA = q.a((CharSequence) aVar.f47259p);
        for (o oVar : this.d) {
            if (a(oVar, aVar)) {
                if (!zA) {
                    oVar.d(aVar.f47259p);
                }
                a aVar2 = this.f.get(oVar.aJ());
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        }
    }

    @Override // sg.bigo.ads.core.player.a.c
    public final void b(sg.bigo.ads.common.h.a aVar) {
        sg.bigo.ads.common.h.b.a("callback download fill time source=", aVar);
        sg.bigo.ads.common.h.b.a("callback download fill time", aVar);
        Iterator<o> it = this.f48777e.iterator();
        boolean zA = q.a((CharSequence) aVar.f47259p);
        while (it.hasNext()) {
            o next = it.next();
            if (a(next, aVar)) {
                if (!zA) {
                    next.d(aVar.f47259p);
                }
                next.i(2);
                a aVar2 = this.f.get(next.aJ());
                if (aVar2 != null) {
                    aVar2.a("", aVar);
                    if (aVar.f47252b == null) {
                        this.f.remove(next.aJ());
                    }
                }
                it.remove();
            }
        }
        e();
    }

    public static b a() {
        return f48774a;
    }

    public static /* synthetic */ void b(b bVar) {
        bVar.a(new File(sg.bigo.ads.common.o.b(bVar.f48776c)));
        bVar.a(new File(sg.bigo.ads.common.o.c(bVar.f48776c)));
    }

    public final void a(final Context context, final o oVar, final a aVar) {
        if (!this.f48775b.get()) {
            sg.bigo.ads.common.h.b.a("please execute initAdResource first", (sg.bigo.ads.common.h.a) null);
        } else if (sg.bigo.ads.common.n.d.a()) {
            b(context, oVar, aVar);
        } else {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.b(context, oVar, aVar);
                }
            });
        }
    }

    private void a(File file) {
        sg.bigo.ads.common.h.b.a("filterAdFiles dir = " + file.getAbsolutePath(), (sg.bigo.ads.common.h.a) null);
        if (file.exists()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strD = sg.bigo.ads.common.o.d(this.f48776c);
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: sg.bigo.ads.core.player.b.4
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file2, File file3) {
                    long jLastModified = file2.lastModified() - file3.lastModified();
                    if (jLastModified > 0) {
                        return -1;
                    }
                    return jLastModified == 0 ? 0 : 1;
                }
            });
            int i2 = 0;
            while (i2 < fileArrListFiles.length) {
                File file2 = fileArrListFiles[i2];
                sg.bigo.ads.common.h.a.a aVar = this.f48779i;
                long jLastModified = file2.lastModified();
                int iA = aVar.a();
                boolean z2 = aVar.d + jLastModified < jCurrentTimeMillis || i2 >= iA;
                sg.bigo.ads.common.t.a.a(0, 3, "DownloadConfig", "needDelete lastModifiedTs=" + jLastModified + ", numTmp=" + iA);
                if (z2) {
                    sg.bigo.ads.common.h.b.a("delete expired file name = " + file2.getName(), (sg.bigo.ads.common.h.a) null);
                    File file3 = new File(strD, file2.getName());
                    if (file3.exists()) {
                        sg.bigo.ads.common.h.b.a("delete expired cover name = " + file2.getName(), (sg.bigo.ads.common.h.a) null);
                        file3.delete();
                    }
                    file2.delete();
                }
                i2++;
            }
        }
    }

    public final void a(final String str, final ValueCallback<Boolean> valueCallback) {
        if (this.f48775b.get()) {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    ValueCallback valueCallback2 = valueCallback;
                    sg.bigo.ads.common.h.b bVar = b.this.g;
                    String str2 = str;
                    valueCallback2.onReceiveValue(Boolean.valueOf(sg.bigo.ads.common.h.b.a(bVar.f47265a, str2) || sg.bigo.ads.common.h.b.a(bVar.f47267c, str2)));
                }
            });
        } else {
            valueCallback.onReceiveValue(Boolean.FALSE);
        }
    }

    @Override // sg.bigo.ads.common.h.b.a
    public final void a(sg.bigo.ads.common.h.a aVar) {
        Iterator<o> it = this.d.iterator();
        boolean zA = q.a((CharSequence) aVar.f47259p);
        while (!zA && it.hasNext()) {
            o next = it.next();
            if (a(next, aVar)) {
                next.d(aVar.f47259p);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0134 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0137  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0145  */
    /* JADX WARN: Code duplicated, block: B:58:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x01a6 A[PHI: r13 r14 r15 r22 r24
  0x01a6: PHI (r13v6 java.util.ArrayList) = (r13v4 java.util.ArrayList), (r13v7 java.util.ArrayList), (r13v8 java.util.ArrayList) binds: [B:73:0x01bd, B:69:0x019f, B:68:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x01a6: PHI (r14v11 java.util.ArrayList) = (r14v8 java.util.ArrayList), (r14v14 java.util.ArrayList), (r14v16 java.util.ArrayList) binds: [B:73:0x01bd, B:69:0x019f, B:68:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x01a6: PHI (r15v7 sg.bigo.ads.api.core.n) = (r15v4 sg.bigo.ads.api.core.n), (r15v8 sg.bigo.ads.api.core.n), (r15v9 sg.bigo.ads.api.core.n) binds: [B:73:0x01bd, B:69:0x019f, B:68:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x01a6: PHI (r22v3 java.lang.String) = (r22v1 java.lang.String), (r22v4 java.lang.String), (r22v5 java.lang.String) binds: [B:73:0x01bd, B:69:0x019f, B:68:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x01a6: PHI (r24v6 boolean) = (r24v4 boolean), (r24v7 boolean), (r24v8 boolean) binds: [B:73:0x01bd, B:69:0x019f, B:68:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x0208  */
    /* JADX WARN: Code duplicated, block: B:87:0x022b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0238  */
    /* JADX WARN: Code duplicated, block: B:92:0x0247  */
    /* JADX WARN: Code duplicated, block: B:93:0x026b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0273  */
    /* JADX WARN: Code duplicated, block: B:99:0x0286  */
    @Override // sg.bigo.ads.common.h.b.a
    public final void a(sg.bigo.ads.common.h.a aVar, int i2, long j) {
        String strExtractMetadata;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        sg.bigo.ads.api.core.n nVar;
        String str;
        boolean zA;
        a aVarRemove;
        boolean z3;
        o.d dVarAB;
        sg.bigo.ads.core.player.a aVar2;
        boolean z4;
        sg.bigo.ads.api.core.n nVar2;
        ArrayList arrayList3;
        String str2;
        ArrayList arrayList4;
        int i3 = i2;
        sg.bigo.ads.common.h.b.a("callback download completed source=".concat(String.valueOf(i3)), aVar);
        int i4 = 1;
        int i5 = 2;
        boolean z5 = i3 == 2;
        sg.bigo.ads.api.core.n nVar3 = new sg.bigo.ads.api.core.n();
        if (sg.bigo.ads.common.o.a(this.f48776c, aVar.f47253c) && aVar.f47254e == 1 && !aVar.f) {
            File file = new File(sg.bigo.ads.common.o.d(this.f48776c), aVar.d);
            if ((!file.exists() || file.length() < 0) && aVar.a() != null && !TextUtils.isEmpty(aVar.d)) {
                String strA = aVar.a();
                if (z5) {
                    strA = f.d(strA);
                }
                Bitmap bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(strA, 1);
                if (bitmapCreateVideoThumbnail != null) {
                    String strD = sg.bigo.ads.common.o.d(this.f48776c);
                    StringBuilder sbW = android.support.v4.media.a.w(strD);
                    sbW.append(File.separator);
                    f.a(sbW.toString(), aVar.d);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(strD, aVar.d));
                        bitmapCreateVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Exception unused) {
                    }
                }
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(z5 ? f.d(aVar.a()) : aVar.a());
                    nVar3.f47054a = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    nVar3.f47055b = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    nVar3.f47056c = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(12);
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    mediaMetadataRetriever.release();
                    strExtractMetadata = "";
                    boolean zA2 = b().a();
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    while (r19.hasNext()) {
                        if (a(oVar, aVar)) {
                            if (i3 != 0) {
                                if (i3 != i4) {
                                    oVar.h(4);
                                } else if (i3 == i5) {
                                    oVar.h(3);
                                    oVar.i(3);
                                }
                                if (oVar.aO()) {
                                    z4 = z5;
                                    nVar2 = nVar3;
                                    arrayList3 = arrayList;
                                    str2 = strExtractMetadata;
                                    arrayList4 = arrayList2;
                                    if (z4) {
                                        i3 = i2;
                                    } else {
                                        arrayList3.add(oVar);
                                        arrayList4.add(oVar);
                                        i3 = i2;
                                        sg.bigo.ads.core.d.b.a(oVar, aVar.f47252b, i3, j, aVar.g / 1024, aVar.k, 2, "video", aVar.o);
                                    }
                                } else {
                                    z4 = z5;
                                    nVar2 = nVar3;
                                    arrayList3 = arrayList;
                                    str2 = strExtractMetadata;
                                    arrayList4 = arrayList2;
                                    if (z4) {
                                        arrayList3.add(oVar);
                                        arrayList4.add(oVar);
                                        i3 = i2;
                                        sg.bigo.ads.core.d.b.a(oVar, aVar.f47252b, i3, j, aVar.g / 1024, aVar.k, 2, "video", aVar.o);
                                    } else {
                                        i3 = i2;
                                    }
                                }
                                arrayList = arrayList3;
                                arrayList2 = arrayList4;
                                nVar3 = nVar2;
                                strExtractMetadata = str2;
                                z5 = z4;
                                i4 = 1;
                                i5 = 2;
                            } else {
                                oVar.h(i4);
                            }
                            oVar.i(4);
                            if (oVar.aO()) {
                                z4 = z5;
                                nVar2 = nVar3;
                                arrayList3 = arrayList;
                                str2 = strExtractMetadata;
                                arrayList4 = arrayList2;
                                if (z4) {
                                    arrayList3.add(oVar);
                                    arrayList4.add(oVar);
                                    i3 = i2;
                                    sg.bigo.ads.core.d.b.a(oVar, aVar.f47252b, i3, j, aVar.g / 1024, aVar.k, 2, "video", aVar.o);
                                } else {
                                    i3 = i2;
                                }
                            } else {
                                z4 = z5;
                                nVar2 = nVar3;
                                arrayList3 = arrayList;
                                str2 = strExtractMetadata;
                                arrayList4 = arrayList2;
                                if (z4) {
                                    arrayList3.add(oVar);
                                    arrayList4.add(oVar);
                                    i3 = i2;
                                    sg.bigo.ads.core.d.b.a(oVar, aVar.f47252b, i3, j, aVar.g / 1024, aVar.k, 2, "video", aVar.o);
                                } else {
                                    i3 = i2;
                                }
                            }
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                            nVar3 = nVar2;
                            strExtractMetadata = str2;
                            z5 = z4;
                            i4 = 1;
                            i5 = 2;
                        } else {
                            sg.bigo.ads.common.h.b.a("not match addata=" + oVar.aK(), aVar);
                        }
                    }
                    z2 = z5;
                    nVar = nVar3;
                    ArrayList<o> arrayList5 = arrayList;
                    str = strExtractMetadata;
                    this.d.removeAll(arrayList2);
                    zA = q.a((CharSequence) str);
                    if (!zA) {
                        aVar.f47259p = str;
                    }
                    for (o oVar : arrayList5) {
                        if (oVar.aW()) {
                            if (!zA) {
                                oVar.d(str);
                            }
                            nVar.d = aVar.f47256i;
                            nVar.f47057e = aVar.h();
                            oVar.a(nVar);
                            aVarRemove = this.f.remove(oVar.aJ());
                            this.f48777e.remove(oVar);
                            if (aVarRemove != null) {
                                sg.bigo.ads.common.h.b.a("listener is valid, execute AdProxy successful callback", aVar);
                                dVarAB = oVar.aB();
                                z3 = z2;
                                if (dVarAB != null) {
                                    dVarAB.a(z3);
                                }
                                aVar2 = this.f48778h;
                                if (aVar2.f48731b.containsKey(aVar.f47251a)) {
                                    sg.bigo.ads.common.n.d.a(aVar2.f48731b.get(aVar.f47251a));
                                    aVar2.f48731b.remove(aVar.f47251a);
                                    p005e.a.f(new StringBuilder("stopFillTime: "), 0, aVar.f47251a, 3, "AdFillStrategyManager");
                                }
                                aVar2.b(aVar);
                                aVarRemove.a(i3);
                            } else {
                                z3 = z2;
                                sg.bigo.ads.common.h.b.a("Not found target listener.", aVar);
                            }
                            oVar.aX();
                            z2 = z3;
                        }
                    }
                    if (z2) {
                    }
                    e();
                } catch (Throwable th) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused4) {
                    }
                    throw th;
                }
            } catch (Exception unused5) {
                strExtractMetadata = "";
            }
        } else {
            strExtractMetadata = "";
        }
        boolean zA3 = b().a();
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        for (o oVar2 : this.d) {
            if (a(oVar2, aVar)) {
                sg.bigo.ads.common.h.b.a("not match addata=" + oVar2.aK(), aVar);
            } else {
                if (i3 != 0) {
                    if (i3 != i4) {
                        oVar2.h(4);
                    } else if (i3 == i5) {
                        oVar2.h(3);
                        oVar2.i(3);
                    }
                    if (oVar2.aO() || !z5) {
                        z4 = z5;
                        nVar2 = nVar3;
                        arrayList3 = arrayList;
                        str2 = strExtractMetadata;
                        arrayList4 = arrayList2;
                        if (z4) {
                            arrayList3.add(oVar2);
                            arrayList4.add(oVar2);
                            i3 = i2;
                            sg.bigo.ads.core.d.b.a(oVar2, aVar.f47252b, i3, j, aVar.g / 1024, aVar.k, 2, "video", aVar.o);
                        }
                        arrayList = arrayList3;
                        arrayList2 = arrayList4;
                        nVar3 = nVar2;
                        strExtractMetadata = str2;
                        z5 = z4;
                        i4 = 1;
                        i5 = 2;
                    } else {
                        long j2 = aVar.f47256i;
                        long j3 = j2 > 0 ? (aVar.g * 100) / j2 : 0L;
                        if (zA3 && !oVar2.aW() && oVar2.c(j3)) {
                            sg.bigo.ads.common.h.b.a("Video partial download done, target callback.", aVar);
                            arrayList.add(oVar2);
                            nVar2 = nVar3;
                            arrayList3 = arrayList;
                            str2 = strExtractMetadata;
                            z4 = z5;
                            arrayList4 = arrayList2;
                            sg.bigo.ads.core.d.b.a(oVar2, aVar.f47252b, i3, j, aVar.g / 1024, aVar.k, 2, "video", aVar.o);
                        } else {
                            z4 = z5;
                            nVar2 = nVar3;
                            arrayList3 = arrayList;
                            str2 = strExtractMetadata;
                            arrayList4 = arrayList2;
                        }
                    }
                    i3 = i2;
                    arrayList = arrayList3;
                    arrayList2 = arrayList4;
                    nVar3 = nVar2;
                    strExtractMetadata = str2;
                    z5 = z4;
                    i4 = 1;
                    i5 = 2;
                } else {
                    oVar2.h(i4);
                }
                oVar2.i(4);
                if (oVar2.aO()) {
                    z4 = z5;
                    nVar2 = nVar3;
                    arrayList3 = arrayList;
                    str2 = strExtractMetadata;
                    arrayList4 = arrayList2;
                    if (z4) {
                        arrayList3.add(oVar2);
                        arrayList4.add(oVar2);
                        i3 = i2;
                        sg.bigo.ads.core.d.b.a(oVar2, aVar.f47252b, i3, j, aVar.g / 1024, aVar.k, 2, "video", aVar.o);
                    } else {
                        i3 = i2;
                    }
                } else {
                    z4 = z5;
                    nVar2 = nVar3;
                    arrayList3 = arrayList;
                    str2 = strExtractMetadata;
                    arrayList4 = arrayList2;
                    if (z4) {
                        arrayList3.add(oVar2);
                        arrayList4.add(oVar2);
                        i3 = i2;
                        sg.bigo.ads.core.d.b.a(oVar2, aVar.f47252b, i3, j, aVar.g / 1024, aVar.k, 2, "video", aVar.o);
                    } else {
                        i3 = i2;
                    }
                }
                arrayList = arrayList3;
                arrayList2 = arrayList4;
                nVar3 = nVar2;
                strExtractMetadata = str2;
                z5 = z4;
                i4 = 1;
                i5 = 2;
            }
        }
        z2 = z5;
        nVar = nVar3;
        ArrayList<o> arrayList6 = arrayList;
        str = strExtractMetadata;
        this.d.removeAll(arrayList2);
        zA = q.a((CharSequence) str);
        if (!zA) {
            aVar.f47259p = str;
        }
        while (r3.hasNext()) {
            if (oVar.aW()) {
                if (!zA) {
                    oVar.d(str);
                }
                nVar.d = aVar.f47256i;
                nVar.f47057e = aVar.h();
                oVar.a(nVar);
                aVarRemove = this.f.remove(oVar.aJ());
                this.f48777e.remove(oVar);
                if (aVarRemove != null) {
                    sg.bigo.ads.common.h.b.a("listener is valid, execute AdProxy successful callback", aVar);
                    dVarAB = oVar.aB();
                    z3 = z2;
                    if (dVarAB != null) {
                        dVarAB.a(z3);
                    }
                    aVar2 = this.f48778h;
                    if (aVar2.f48731b.containsKey(aVar.f47251a)) {
                        sg.bigo.ads.common.n.d.a(aVar2.f48731b.get(aVar.f47251a));
                        aVar2.f48731b.remove(aVar.f47251a);
                        p005e.a.f(new StringBuilder("stopFillTime: "), 0, aVar.f47251a, 3, "AdFillStrategyManager");
                    }
                    aVar2.b(aVar);
                    aVarRemove.a(i3);
                } else {
                    z3 = z2;
                    sg.bigo.ads.common.h.b.a("Not found target listener.", aVar);
                }
                oVar.aX();
                z2 = z3;
            }
        }
        if (z2) {
            e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
    @Override // sg.bigo.ads.common.h.b.a
    public final void a(sg.bigo.ads.common.h.a aVar, String str, long j, long j2) {
        String str2;
        int i2;
        String str3 = str;
        sg.bigo.ads.common.h.b.a("callback download failed error= ".concat(String.valueOf(str3)), aVar);
        this.f48778h.b(aVar);
        Iterator<o> it = this.d.iterator();
        boolean zA = q.a((CharSequence) aVar.f47259p);
        while (it.hasNext()) {
            o next = it.next();
            if (a(next, aVar)) {
                if (!zA) {
                    next.d(aVar.f47259p);
                }
                if (next != null) {
                    if ("Unable to download media file.".equals(str3) || "internal storage is not enough".equals(str3)) {
                        i2 = 5;
                    } else {
                        i2 = j2 == 0 ? 0 : 1;
                    }
                    next.i(i2);
                }
                if (!aVar.c() || "internal storage is not enough".equalsIgnoreCase(str3)) {
                    a aVarRemove = this.f.remove(next.aJ());
                    if (aVarRemove != null) {
                        str3 = str;
                        sg.bigo.ads.core.d.b.a(next, aVar.f47252b, str3, j, aVar.g / 1024, 2, "video", aVar.o);
                        sg.bigo.ads.common.h.b.a("listener is valid, execute AdProxy failure callback", aVar);
                        aVarRemove.b(q.a(str3, -1));
                        this.f.remove(next.aJ());
                    }
                    if ("internal storage is not enough".equalsIgnoreCase(str3)) {
                        this.f48777e.remove(next);
                    }
                    it.remove();
                } else {
                    a aVar2 = this.f.get(next.aJ());
                    if (aVar2 != null) {
                        sg.bigo.ads.core.d.b.a(next, aVar.f47252b, str3, j, aVar.g / 1024, 2, "video", aVar.o);
                        if (next.bd() != 2) {
                            str2 = "video download failed when support fillStrategy, so download backupImg";
                        } else if (aVar.d()) {
                            str2 = "video download failed but filled success, so download backupImg";
                        } else {
                            sg.bigo.ads.common.h.b.a("video download failed and filled fail, so don't download backupImg", aVar);
                        }
                        sg.bigo.ads.common.h.b.a(str2, aVar);
                        aVar2.a();
                    }
                }
                str3 = str;
                if ("internal storage is not enough".equalsIgnoreCase(str3)) {
                    this.f48777e.remove(next);
                }
                it.remove();
            }
        }
        e();
    }

    private boolean a(o oVar, sg.bigo.ads.common.h.a aVar) {
        return TextUtils.equals(oVar.b(this.f48776c), aVar.a());
    }
}
