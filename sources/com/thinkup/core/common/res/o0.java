package com.thinkup.core.common.res;

import android.content.Context;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Log;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.nm;
import com.thinkup.core.common.ooo.oom;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class o0 {
    private static final String m0 = "thinkup_internal_extra_resource";
    private static final String mm = "thinkup_internal_html_resouce";
    private static final String mn = "thinkup_internal_html_template";
    private static final String mo = "thinkup_internal_video_resource";
    private static volatile o0 n0 = null;
    public static final String o = "about:blank";
    public static final String o0 = "foldername";
    private static final String om = "thinkup_internal_resouce";
    private static final String on = "thinkup_custom_resouce";
    private File nm;
    private Context no;
    private final String oo = getClass().getSimpleName();
    ConcurrentHashMap<Integer, o> m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final long f42376n = 172800000;

    private o0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.no = applicationContext;
        this.nm = oom.o(applicationContext);
    }

    public static void n() {
        try {
            long jO0 = o0n.m().o0(1);
            String strO = o(o0n.m().on()).o(1);
            long jO = oom.o(strO);
            if (jO <= 0 || jO <= jO0 * 1.5d) {
                return;
            }
            File[] fileArrListFiles = new File(strO).listFiles();
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

    public static o0 o(Context context) {
        if (n0 == null) {
            synchronized (o0.class) {
                try {
                    if (n0 == null) {
                        n0 = new o0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return n0;
    }

    private void o0(int i2, String str) {
        File file;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (i2 != 4) {
                file = new File(o(i2) + File.separator + str + ".0");
            } else {
                file = new File(o(i2) + File.separator + str);
            }
            file.delete();
        } catch (Throwable unused) {
        }
    }

    public final void m() {
        File[] fileArrListFiles;
        try {
            File file = new File(this.nm, mm);
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

    public final String o() {
        return this.nm.getAbsolutePath();
    }

    private File m(com.thinkup.core.common.on.oom oomVar, ooo oooVar) {
        File file = new File(new File(this.nm, mm), oomVar.om + "_" + oooVar.mo() + ".html");
        if (file.exists()) {
            return file;
        }
        return null;
    }

    private String o(String str, com.thinkup.core.common.on.oom oomVar, ooo oooVar) {
        FileOutputStream fileOutputStream;
        File file = new File(this.nm, mm);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, oomVar.om + "_" + oooVar.mo() + ".html");
        try {
            byte[] bytes = str.getBytes("utf-8");
            fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(bytes, 0, bytes.length);
                String string = file2.toURI().toString();
                try {
                    fileOutputStream.close();
                    return string;
                } catch (Throwable unused) {
                    return string;
                }
            } catch (Throwable unused2) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                }
                return "";
            }
        } catch (Throwable unused4) {
            fileOutputStream = null;
        }
    }

    private boolean m(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(m(5, str)).exists();
    }

    private static String n(int i2, String str) {
        if (i2 != 4) {
            if (i2 == 5) {
                return a.m(str, ".zip");
            }
            if (i2 != 6) {
                return a.m(str, ".0");
            }
        }
        return str;
    }

    public final String m(int i2, String str) {
        return o(i2) + File.separator + n(i2, str);
    }

    private void o(com.thinkup.core.common.on.oom oomVar, ooo oooVar) {
        try {
            File file = new File(new File(this.nm, mm), oomVar.om + "_" + oooVar.mo() + ".html");
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final boolean o(int i2, String str, InputStream inputStream) throws Throwable {
        OutputStream outputStream;
        if (str == null || inputStream == null) {
            return false;
        }
        String strO = o(i2);
        if (TextUtils.isEmpty(strO)) {
            return false;
        }
        File file = new File(strO);
        if (!file.exists()) {
            file.mkdirs();
        }
        o oVarO = o(i2, file);
        if (oVarO == null) {
            return false;
        }
        o.C0693o c0693o = null;
        outputStreamO = null;
        outputStreamO = null;
        OutputStream outputStreamO = null;
        OutputStream outputStream2 = null;
        try {
            try {
                o.n nVarO = oVarO.o(str);
                if (nVarO == null) {
                    o.C0693o c0693oM = oVarO.m(str);
                    if (c0693oM != null) {
                        try {
                            outputStreamO = c0693oM.o(0);
                            byte[] bArr = new byte[com.p004ironsource.mediationsdk.metadata.a.f25965n];
                            while (true) {
                                int i3 = inputStream.read(bArr);
                                if (i3 == -1) {
                                    break;
                                }
                                outputStreamO.write(bArr, 0, i3);
                            }
                            c0693oM.o();
                            outputStreamO.close();
                        } catch (Exception e2) {
                            e = e2;
                            OutputStream outputStream3 = outputStreamO;
                            c0693o = c0693oM;
                            outputStream = outputStream3;
                            try {
                                e.toString();
                                if (c0693o != null) {
                                    try {
                                        c0693o.m();
                                    } catch (Exception e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (outputStream == null) {
                                    return false;
                                }
                                try {
                                    outputStream.close();
                                    return false;
                                } catch (IOException unused) {
                                    return false;
                                }
                            } catch (Throwable th) {
                                outputStream2 = outputStream;
                                th = th;
                                if (outputStream2 != null) {
                                    try {
                                        outputStream2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    nVarO.o().close();
                }
                if (outputStreamO != null) {
                    try {
                        outputStreamO.close();
                    } catch (IOException unused3) {
                    }
                }
                return true;
            } catch (Exception e4) {
                e = e4;
                outputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            if (outputStream2 != null) {
                outputStream2.close();
            }
            throw th;
        }
    }

    public final FileInputStream o(int i2, String str) throws Throwable {
        InputStream inputStreamO;
        if (i2 != 4) {
            String strO = o(i2);
            if (TextUtils.isEmpty(strO)) {
                return null;
            }
            File file = new File(strO);
            if (!file.exists()) {
                file.mkdirs();
            }
            o oVarO = o(i2, file);
            if (oVarO != null) {
                try {
                    o.n nVarO = oVarO.o(str);
                    if (nVarO != null && (inputStreamO = nVarO.o()) != null) {
                        return (FileInputStream) inputStreamO;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return null;
        }
        try {
            return new FileInputStream(new File(m(4, str)));
        } catch (Throwable unused) {
            return null;
        }
    }

    private synchronized o o(int i2, File file) {
        o oVarO;
        oVarO = this.m.get(Integer.valueOf(i2));
        if (oVarO == null) {
            try {
                oVarO = o.o(file, o0n.m().o0(i2));
                this.m.put(Integer.valueOf(i2), oVarO);
            } catch (Throwable th) {
                if (o0n.m().m0o()) {
                    Log.e(this.oo, "Create DiskCache error.");
                    th.printStackTrace();
                }
            }
        }
        return oVarO;
    }

    public final String o(int i2) {
        String str;
        if (i2 == 1) {
            str = om;
        } else if (i2 == 3) {
            str = m0;
        } else if (i2 == 4) {
            str = mo;
        } else if (i2 != 5 && i2 != 6) {
            str = on;
        } else {
            str = mn;
        }
        return new File(this.nm, str).getAbsolutePath();
    }

    public final String o(String str) {
        String strM = m(6, nm.o(str));
        try {
            if (!new File(strM).exists()) {
                return "";
            }
            String str2 = strM + File.separator + "index.html";
            return !new File(str2).exists() ? "" : str2;
        } catch (Throwable unused) {
            return "";
        }
    }
}
