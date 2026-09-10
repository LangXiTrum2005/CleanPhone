package com.smartdigimkt.d7;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.smartdigimkt.n8.l;
import com.smartdigimkt.w6.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class d {
    public static final String f = "about:blank";
    private static final String g = "sdm_internal_resouce";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f34496h = "sdm_custom_resouce";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f34497i = "sdm_internal_extra_resource";
    private static final String j = "sdm_internal_video_resource";
    private static final String k = "sdm_internal_html_resouce";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f34498l = "sdm_internal_html_template";
    private static volatile d m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f34499n = "foldername";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f34501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f34502c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34500a = getClass().getSimpleName();
    ConcurrentHashMap<Integer, a> d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f34503e = 172800000;

    private d() {
        Context contextK = com.smartdigimkt.m6.b.p().k();
        this.f34501b = contextK;
        this.f34502c = l.b(contextK);
    }

    public static d c() {
        if (m == null) {
            synchronized (d.class) {
                try {
                    if (m == null) {
                        m = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public long a(int i2) {
        if (i2 == 1 || i2 == 4 || i2 == 5) {
            return com.smartdigimkt.k8.a.e().g() * 1024;
        }
        return 26214400L;
    }

    public void b(com.smartdigimkt.v6.a aVar, f fVar) {
        try {
            File file = new File(new File(this.f34502c, k), aVar.f + "_" + fVar.L() + ".html");
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable unused) {
        }
    }

    public String d() {
        return this.f34502c.getAbsolutePath();
    }

    public boolean e(int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(d(i2, str)).exists();
    }

    public String a(String str, com.smartdigimkt.v6.a aVar, f fVar) {
        FileOutputStream fileOutputStream;
        File file = new File(this.f34502c, k);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, aVar.f + "_" + fVar.L() + ".html");
        try {
            try {
                byte[] bytes = str.getBytes("utf-8");
                fileOutputStream = new FileOutputStream(file2);
                try {
                    fileOutputStream.write(bytes, 0, bytes.length);
                    String string = file2.toURI().toString();
                    fileOutputStream.close();
                    return string;
                } catch (Throwable unused) {
                    str = "";
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    return str;
                }
            } catch (Throwable unused2) {
                fileOutputStream = null;
            }
        } catch (Throwable unused3) {
        }
    }

    public String d(int i2, String str) {
        return b(i2) + File.separator + c(i2, str);
    }

    public void b() {
        File[] fileArrListFiles;
        try {
            File file = new File(this.f34502c, k);
            if (!file.exists() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length <= 0) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                try {
                    if (file2.isFile() && System.currentTimeMillis() - file2.lastModified() > 86400000) {
                        file2.delete();
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public String c(int i2, String str) {
        if (i2 != 4) {
            if (i2 == 5) {
                return android.support.v4.media.a.m(str, ".zip");
            }
            if (i2 != 6) {
                return android.support.v4.media.a.m(str, ".0");
            }
        }
        return str;
    }

    public void a() {
        try {
            long jA = a(1);
            String strB = c().b(1);
            long jA2 = l.a(strB);
            if (jA2 <= 0 || jA2 <= jA * 1.5d) {
                return;
            }
            File[] fileArrListFiles = new File(strB).listFiles();
            ArrayList arrayList = new ArrayList();
            if (fileArrListFiles != null) {
                Collections.addAll(arrayList, fileArrListFiles);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (arrayList.size() > 0) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    File file = (File) arrayList.get(i2);
                    if (jCurrentTimeMillis - file.lastModified() > 172800000) {
                        try {
                            file.delete();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public FileInputStream b(int i2, String str) throws Throwable {
        InputStream inputStreamA;
        if (i2 != 4) {
            String strB = b(i2);
            if (TextUtils.isEmpty(strB)) {
                return null;
            }
            File file = new File(strB);
            if (!file.exists()) {
                file.mkdirs();
            }
            a aVarA = a(i2, file);
            if (aVarA != null) {
                try {
                    a.d dVarB = aVarA.b(str);
                    if (dVarB != null && (inputStreamA = dVarB.a(0)) != null) {
                        return (FileInputStream) inputStreamA;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return null;
        }
        try {
            return new FileInputStream(new File(d(4, str)));
        } catch (Throwable unused) {
            return null;
        }
    }

    public File a(com.smartdigimkt.v6.a aVar, f fVar) {
        File file = new File(new File(this.f34502c, k), aVar.f + "_" + fVar.L() + ".html");
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public String b(int i2) {
        String str;
        if (i2 == 1) {
            str = g;
        } else if (i2 == 3) {
            str = f34497i;
        } else if (i2 == 4) {
            str = j;
        } else if (i2 != 5 && i2 != 6) {
            str = f34496h;
        } else {
            str = f34498l;
        }
        return new File(this.f34502c, str).getAbsolutePath();
    }

    public String a(String str) {
        String strD = d(6, l.b(str));
        try {
            if (!new File(strD).exists()) {
                return "";
            }
            String str2 = strD + File.separator + "index.html";
            return !new File(str2).exists() ? "" : str2;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public boolean a(int i2, String str, InputStream inputStream) throws Throwable {
        OutputStream outputStream;
        boolean z2 = false;
        if (str != null && inputStream != null) {
            String strB = b(i2);
            if (TextUtils.isEmpty(strB)) {
                return false;
            }
            File file = new File(strB);
            if (!file.exists()) {
                file.mkdirs();
            }
            a aVarA = a(i2, file);
            if (aVarA != null) {
                a.b bVar = null;
                outputStreamC = null;
                outputStreamC = null;
                OutputStream outputStreamC = null;
                OutputStream outputStream2 = null;
                try {
                    try {
                        a.d dVarB = aVarA.b(str);
                        if (dVarB == null) {
                            a.b bVarA = aVarA.a(str);
                            if (bVarA != null) {
                                try {
                                    outputStreamC = bVarA.c(0);
                                    byte[] bArr = new byte[com.p004ironsource.mediationsdk.metadata.a.f25965n];
                                    while (true) {
                                        int i3 = inputStream.read(bArr);
                                        if (i3 == -1) {
                                            break;
                                        }
                                        outputStreamC.write(bArr, 0, i3);
                                    }
                                    bVarA.b();
                                    outputStreamC.close();
                                } catch (Exception e2) {
                                    e = e2;
                                    OutputStream outputStream3 = outputStreamC;
                                    bVar = bVarA;
                                    outputStream = outputStream3;
                                    try {
                                        e.toString();
                                        if (bVar != null) {
                                            try {
                                                bVar.a();
                                            } catch (Exception e3) {
                                                e3.printStackTrace();
                                            }
                                        }
                                        if (outputStream != null) {
                                            outputStreamC = outputStream;
                                        }
                                        return z2;
                                    } catch (Throwable th) {
                                        outputStream2 = outputStream;
                                        th = th;
                                        if (outputStream2 != null) {
                                            try {
                                                outputStream2.close();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } else {
                            dVarB.a(0).close();
                        }
                        z2 = true;
                        if (outputStreamC == null) {
                            return true;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        outputStream = null;
                    }
                    try {
                        outputStreamC.close();
                    } catch (IOException unused2) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (outputStream2 != null) {
                        outputStream2.close();
                    }
                    throw th;
                }
            }
        }
        return z2;
    }

    private synchronized a a(int i2, File file) {
        a aVarA;
        aVarA = this.d.get(Integer.valueOf(i2));
        if (aVarA == null) {
            try {
                aVarA = a.a(file, 1, 1, a(i2));
                this.d.put(Integer.valueOf(i2), aVarA);
            } catch (Throwable th) {
                if (com.smartdigimkt.m6.b.p().D()) {
                    Log.e(this.f34500a, "Create DiskCache error.");
                    th.printStackTrace();
                }
            }
        }
        return aVarA;
    }

    public void a(int i2, String str) {
        File file;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (i2 != 4) {
                file = new File(b(i2) + File.separator + str + ".0");
            } else {
                file = new File(b(i2) + File.separator + str);
            }
            file.delete();
        } catch (Throwable unused) {
        }
    }
}
