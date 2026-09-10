package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.f2;
import com.applovin.impl.f4;
import com.applovin.impl.f6;
import com.applovin.impl.i2;
import com.applovin.impl.j2;
import com.applovin.impl.k5;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u6;
import com.applovin.impl.z4;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f9546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f9547c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f9550f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9545a = "FileManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f9548d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f9549e = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i2 f9551g = a();

    public n(l lVar) {
        this.f9546b = lVar;
        this.f9547c = lVar.Q();
        this.f9550f = ((Boolean) lVar.a(z4.V0)).booleanValue();
    }

    private boolean e(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f9548d) {
            try {
                if (this.f9549e.contains(absolutePath)) {
                    return false;
                }
                d(file);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean g(File file) {
        if (p.a()) {
            this.f9547c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            d(file);
            boolean zDelete = file.delete();
            if (!zDelete) {
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
                mapHashMap.put("details", b(file));
                this.f9546b.E().a(f2.Y0, "removeFile", mapHashMap);
            }
            h(file);
            return zDelete;
        } catch (Throwable th2) {
            try {
                if (p.a()) {
                    this.f9547c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th2);
                }
                this.f9546b.E().a("FileManager", "removeFile", th2);
                return false;
            } finally {
                h(file);
            }
        }
    }

    private void h(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f9548d) {
            try {
                if (!this.f9549e.remove(absolutePath)) {
                    this.f9546b.E().a(f2.Y0, "unlockFile", CollectionUtils.hashMap("path", absolutePath));
                }
                this.f9548d.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f9546b.s0().a((k5) new u6(this.f9546b, false, "removeCachedResourcesForAd", new d0(this, bVar, context, 0)), f6.b.CACHING);
    }

    public void d(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f9546b.s0().a((k5) new u6(this.f9546b, false, "removeCachedVideoResourceForAd", new d0(this, bVar, context, 1)), f6.b.CACHING);
    }

    public String f(File file) {
        if (file == null) {
            return null;
        }
        if (p.a()) {
            this.f9547c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        boolean z10 = true;
        try {
            try {
                try {
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                d(file);
                                String strA = a(fileInputStream);
                                boolean z11 = strA == null;
                                fileInputStream.close();
                                if (z11 && ((Boolean) this.f9546b.a(z4.N0)).booleanValue()) {
                                    a(file, "removeFileAfterReadFail");
                                }
                                h(file);
                                return strA;
                            } catch (Throwable th2) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (FileNotFoundException e10) {
                            if (p.a()) {
                                this.f9547c.d("FileManager", "File not found. " + e10);
                            }
                            this.f9547c.a("FileManager", e10);
                            this.f9546b.E().a("FileManager", "readFileNotFound", e10);
                            if (0 != 0 && ((Boolean) this.f9546b.a(z4.N0)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            h(file);
                            return null;
                        }
                    } catch (Throwable th4) {
                        if (p.a()) {
                            this.f9547c.a("FileManager", "Unknown failure to read file.", th4);
                        }
                        this.f9547c.a("FileManager", th4);
                        this.f9546b.E().a("FileManager", "readFile", th4);
                        if (((Boolean) this.f9546b.a(z4.N0)).booleanValue()) {
                            a(file, "removeFileAfterReadFail");
                        }
                        h(file);
                        return null;
                    }
                } catch (IOException e11) {
                    if (p.a()) {
                        this.f9547c.a("FileManager", "Failed to read file: " + file.getName() + e11);
                    }
                    this.f9547c.a("FileManager", e11);
                    this.f9546b.E().a("FileManager", "readFileIO", e11);
                    if (((Boolean) this.f9546b.a(z4.N0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    h(file);
                    return null;
                }
            } catch (Throwable th5) {
                th = th5;
                if (z10 && ((Boolean) this.f9546b.a(z4.N0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            z10 = false;
        }
    }

    private i2 a() {
        if (((Boolean) this.f9546b.a(z4.f10282x3)).booleanValue()) {
            try {
                return new f4(this.f9546b);
            } catch (Throwable th2) {
                if (p.a()) {
                    this.f9547c.a("FileManager", "Error instantiating OkHttpLoader, falling back to HttpUrlConnectionLoader", th2);
                }
                this.f9546b.E().a("FileManager", "instantiateOkHttpLoader", th2);
            }
        }
        return new j2(this.f9546b);
    }

    private boolean c(File file) {
        boolean zContains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f9548d) {
            zContains = this.f9549e.contains(absolutePath);
        }
        return zContains;
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f9548d) {
            boolean zAdd = this.f9549e.add(absolutePath);
            while (!zAdd) {
                try {
                    this.f9548d.wait();
                    zAdd = this.f9549e.add(absolutePath);
                } catch (InterruptedException e10) {
                    if (p.a()) {
                        this.f9547c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e10);
                    }
                    throw new RuntimeException(e10);
                }
            }
        }
    }

    public void b(Context context) {
        if (this.f9546b.G0()) {
            if (p.a()) {
                this.f9547c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (bVar.k0() == null) {
            return;
        }
        g(a(bVar.k0().getLastPathSegment(), context));
    }

    private List c(Context context) {
        File[] fileArrListFiles;
        File fileD = d(context);
        if (fileD.isDirectory() && (fileArrListFiles = fileD.listFiles()) != null) {
            return Arrays.asList(fileArrListFiles);
        }
        return Collections.EMPTY_LIST;
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    public void e(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(d(context), ".nomedia");
            if (a(file)) {
                return;
            }
            if (p.a()) {
                this.f9547c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (p.a()) {
                this.f9547c.b("FileManager", "Failed to create .nomedia file");
            }
            this.f9546b.E().a(f2.Y0, "createNoMediaFile");
        } catch (IOException e10) {
            if (p.a()) {
                this.f9547c.a("FileManager", "Failed to create .nomedia file", e10);
            }
        }
    }

    private File a(String str, boolean z10, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (p.a()) {
                this.f9547c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (p.a()) {
            defpackage.e.A("Looking up cached resource: ", str, this.f9547c, "FileManager");
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File fileD = d(context);
        File file = new File(fileD, str);
        if (!z10) {
            return file;
        }
        try {
            fileD.mkdirs();
            return file;
        } catch (Throwable th2) {
            if (p.a()) {
                this.f9547c.a("FileManager", "Unable to make cache directory at " + fileD, th2);
            }
            this.f9546b.E().a("FileManager", "createCacheDir", th2);
            return null;
        }
    }

    private String b(File file) {
        try {
            boolean zExists = file.exists();
            boolean zIsDirectory = file.isDirectory();
            String[] list = file.list();
            boolean z10 = false;
            boolean z11 = zIsDirectory && list != null && list.length == 0;
            File parentFile = file.getParentFile();
            boolean z12 = parentFile != null && parentFile.exists();
            if (z12 && parentFile.canWrite()) {
                z10 = true;
            }
            return "fileExists: " + zExists + "\nisDirectory: " + zIsDirectory + "\nisEmptyDirectory: " + z11 + "\nparentDirectoryExists: " + z12 + "\nisParentDirectoryWritable: " + z10;
        } catch (Throwable th2) {
            return "Error retrieving file deletion failure reason: " + th2;
        }
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), CampaignEx.JSON_KEY_AD_AL);
    }

    public boolean c(String str, Context context) {
        if (this.f9550f) {
            return b(str, context);
        }
        boolean z10 = false;
        File fileA = a(str, false, context);
        if (!e(fileA)) {
            return false;
        }
        if (fileA.exists() && !fileA.isDirectory()) {
            z10 = true;
        }
        h(fileA);
        return z10;
    }

    private long b() {
        long jLongValue = ((Long) this.f9546b.a(z4.C0)).longValue();
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return -1L;
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public String a(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[Segment.SIZE];
                while (true) {
                    int i10 = inputStream.read(bArr, 0, Segment.SIZE);
                    if (i10 >= 0) {
                        byteArrayOutputStream.write(bArr, 0, i10);
                    } else {
                        String string = byteArrayOutputStream.toString("UTF-8");
                        byteArrayOutputStream.close();
                        return string;
                    }
                    this.f9547c.a("FileManager", th);
                    this.f9546b.E().a("FileManager", "readInputStreamAsString", th);
                    return null;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f9547c.a("FileManager", th4);
            this.f9546b.E().a("FileManager", "readInputStreamAsString", th4);
            return null;
        }
    }

    public boolean a(InputStream inputStream, File file, boolean z10) {
        return a(inputStream, file, z10, false);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0142 */
    /* JADX WARN: Code duplicated, block: B:133:0x0250 A[Catch: all -> 0x01d5, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x01d5, blocks: (B:109:0x01d1, B:112:0x01d8, B:115:0x01ea, B:117:0x01f0, B:119:0x01f6, B:120:0x020e, B:133:0x0250), top: B:244:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x02be  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f6 A[Catch: all -> 0x02fc, TRY_LEAVE, TryCatch #19 {all -> 0x02fc, blocks: (B:181:0x02f0, B:183:0x02f6), top: B:257:0x02f0 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x030a  */
    /* JADX WARN: Code duplicated, block: B:191:0x030f  */
    /* JADX WARN: Code duplicated, block: B:228:0x0322 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0264 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x02d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x02b9 A[EDGE_INSN: B:269:0x02b9->B:163:0x02b9 BREAK  A[LOOP:1: B:137:0x025d->B:270:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.io.InputStream r20, java.io.File r21, boolean r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 893
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.n.a(java.io.InputStream, java.io.File, boolean, boolean):boolean");
    }

    public boolean a(File file, String str, List list, int i10, String str2, Map map) {
        return a(file, str, list, true, i10, str2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(File file, String str, List list, boolean z10, int i10, String str2, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        Map map2 = map;
        mapHashMap.putAll(map2);
        this.f9546b.g().d(f2.M, mapHashMap);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i11 = 1;
        while (i11 <= i10) {
            if (a(file, str, list, z10, str2, map2)) {
                a(true, str, i11, jElapsedRealtime, map);
                return true;
            }
            i11++;
            map2 = map;
        }
        a(false, str, i10, jElapsedRealtime, map);
        return false;
    }

    private boolean a(File file, String str, List list, boolean z10, String str2, Map map) {
        Boolean bool = (Boolean) this.f9546b.a(z4.W0);
        if (bool.booleanValue()) {
            d(file);
        }
        if (a(file)) {
            if (p.a()) {
                defpackage.e.A("File exists for ", str, this.f9547c, "FileManager");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
            mapHashMap.putAll(map);
            this.f9546b.g().d(f2.N, mapHashMap);
            if (((Boolean) this.f9546b.a(z4.Y0)).booleanValue() && !file.setLastModified(System.currentTimeMillis())) {
                if (p.a()) {
                    this.f9547c.b("FileManager", "Failed to refresh cache TTL for " + file.getName());
                }
                this.f9546b.E().a(f2.Y0, "setLastModifiedFailed", mapHashMap);
            }
            if (!bool.booleanValue()) {
                return true;
            }
            h(file);
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            InputStream inputStreamA = a(str, list, z10, map);
            try {
                if (p.a()) {
                    this.f9547c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
                }
                boolean zA = a(inputStreamA, file, false, bool.booleanValue());
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (zA) {
                    if (p.a()) {
                        this.f9547c.a("FileManager", "Caching completed for " + file);
                    }
                    double d10 = q7.d(jElapsedRealtime2);
                    double dC = q7.c(file.length());
                    long j10 = (long) (dC / d10);
                    Map mapA = a(file, str, jElapsedRealtime2, map);
                    CollectionUtils.putObjectToStringIfValid("network_throughput_kbps", Long.valueOf(j10), mapA);
                    CollectionUtils.putObjectToStringIfValid("details", Double.valueOf(dC), mapA);
                    this.f9546b.g().d(f2.S, mapA);
                    this.f9546b.f0().b(j10, str, str2);
                } else {
                    if (p.a()) {
                        this.f9547c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
                    }
                    this.f9546b.g().d(f2.T, a(file, str, jElapsedRealtime2, map));
                }
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
                if (bool.booleanValue()) {
                    h(file);
                }
                return zA;
            } catch (Throwable th2) {
                if (inputStreamA != null) {
                    try {
                        inputStreamA.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                this.f9547c.a("FileManager", th4);
                this.f9546b.E().a("FileManager", "loadAndCacheResource", th4);
                return false;
            } finally {
                if (bool.booleanValue()) {
                    h(file);
                }
            }
        }
    }

    private Map a(File file, String str, long j10, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
        CollectionUtils.putStringIfValid("url", str, mapHashMap);
        CollectionUtils.putObjectToStringIfValid("duration_ms", Long.valueOf(j10), mapHashMap);
        mapHashMap.putAll(map);
        return mapHashMap;
    }

    private void a(boolean z10, String str, int i10, long j10, Map map) {
        f2 f2Var = z10 ? f2.O : f2.P;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        HashMap map2 = new HashMap(3);
        map2.put("attempt_number", Integer.toString(i10));
        map2.put("url", str);
        map2.put("duration_ms", String.valueOf(jElapsedRealtime));
        map2.putAll(map);
        this.f9546b.g().d(f2Var, map2);
    }

    public InputStream a(String str, List list, boolean z10, Map map) {
        if (z10 && !q7.a(str, list)) {
            if (p.a()) {
                defpackage.e.A("Domain is not whitelisted, skipping precache for url: ", str, this.f9547c, "FileManager");
            }
            return null;
        }
        String httpsString = StringUtils.toHttpsString(str);
        if (p.a()) {
            this.f9547c.a("FileManager", "Loading " + httpsString + "...");
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", httpsString);
        mapHashMap.putAll(map);
        this.f9546b.g().d(f2.Q, mapHashMap);
        try {
            return this.f9551g.a(httpsString, map);
        } catch (Throwable th2) {
            if (p.a()) {
                this.f9547c.a("FileManager", "Error loading " + httpsString, th2);
            }
            this.f9546b.E().a("FileManager", "loadResource", th2, CollectionUtils.hashMap("url", httpsString));
            return null;
        }
    }

    public int a(String str, com.applovin.impl.sdk.ad.b bVar) {
        List listT = bVar.T();
        if (bVar.I0() || listT.contains(str)) {
            return bVar.B();
        }
        return 1;
    }

    public String a(Context context, String str, String str2, List list, boolean z10, int i10, String str3, Map map) {
        return a(context, str, str2, list, z10, false, i10, str3, map);
    }

    public String a(Context context, String str, String str2, List list, boolean z10, boolean z11, int i10, String str3, Map map) {
        if (!StringUtils.isValidString(str)) {
            if (p.a()) {
                this.f9547c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.f9546b.E().a(f2.Y0, "cacheResource");
            return null;
        }
        String strA = q7.a(Uri.parse(str), str2, this.f9546b);
        File fileA = a(strA, context);
        if (!a(fileA, str, list, z10, i10, str3, map)) {
            return null;
        }
        if (p.a()) {
            defpackage.e.A("Caching succeeded for file ", strA, this.f9547c, "FileManager");
        }
        return z11 ? Uri.fromFile(fileA).toString() : strA;
    }

    private long a(Context context) {
        boolean zG;
        long jB = b();
        boolean z10 = jB != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List listC = this.f9546b.c(z4.H0);
        long length = 0;
        for (File file : c(context)) {
            if (!z10 || listC.contains(file.getName()) || c(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= jB) {
                zG = false;
            } else {
                if (p.a()) {
                    this.f9547c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                zG = g(file);
            }
            if (!zG) {
                length += file.length();
            }
        }
        return length;
    }

    private void a(long j10, Context context) {
        long jIntValue = ((Integer) this.f9546b.a(z4.D0)).intValue();
        if (jIntValue == -1) {
            if (p.a()) {
                this.f9547c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (a(j10) > jIntValue) {
                if (p.a()) {
                    this.f9547c.a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                Iterator it = c(context).iterator();
                while (it.hasNext()) {
                    g((File) it.next());
                }
                return;
            }
            if (p.a()) {
                this.f9547c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        Iterator it = new ArrayList(bVar.l().keySet()).iterator();
        while (it.hasNext()) {
            g(a(Uri.parse((String) it.next()).getLastPathSegment(), context));
        }
        Uri uriK0 = bVar.k0();
        if (uriK0 != null) {
            g(a(uriK0.getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (p.a()) {
            this.f9547c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
            mapHashMap.put("details", b(file));
            this.f9546b.E().a(f2.Y0, str, mapHashMap);
        } catch (Throwable th2) {
            if (p.a()) {
                this.f9547c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th2);
            }
            this.f9546b.E().a("FileManager", str, th2);
        }
    }

    private long a(long j10) {
        return j10 / 1048576;
    }

    public boolean a(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : true;
    }
}
