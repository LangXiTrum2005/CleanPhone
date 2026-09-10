package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.entity.Header;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.thinkup.core.oo.m0;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static o f10357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f10358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f10359c;
    private File d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f10360e;
    private a f = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f10363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f10364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f10365c;
        private JSONObject d;

        public /* synthetic */ a(File file, byte b2) {
            this(file);
        }

        public static /* synthetic */ void d(a aVar) {
            aVar.f10365c.delete();
        }

        private a(File file) {
            this.d = null;
            this.f10365c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f10363a = Long.parseLong(strArrSplit[0]);
                this.f10364b = Long.parseLong(strArrSplit[1]);
                return;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name) || name.length() < 13) {
                return;
            }
            String strSubstring = name.substring(0, 13);
            if (TextUtils.isDigitsOnly(strSubstring)) {
                long j = Long.parseLong(strSubstring);
                this.f10363a = j;
                this.f10364b = j;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject a() {
            if (this.d == null) {
                try {
                    this.d = new JSONObject(com.apm.insight.l.f.a(this.f10365c.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX));
                } catch (Throwable unused) {
                }
                if (this.d == null) {
                    this.d = new JSONObject();
                }
            }
            return this.d;
        }

        public static /* synthetic */ boolean a(a aVar, long j) {
            long j2 = aVar.f10363a;
            if (j2 > j && j2 - j > m0.om) {
                return true;
            }
            long j3 = aVar.f10364b;
            if (j3 >= j || j - j3 <= m0.om) {
                return aVar.f10365c.lastModified() < j && j - aVar.f10365c.lastModified() > m0.om;
            }
            return true;
        }
    }

    private o(Context context) {
        File fileC = com.apm.insight.l.j.c(context);
        if (!fileC.exists() || (!fileC.isDirectory() && fileC.delete())) {
            fileC.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.f10358b = fileC;
        this.f10359c = new File(fileC, "did");
        this.d = new File(fileC, "device_uuid");
        this.f10360e = context;
    }

    public static o a() {
        if (f10357a == null) {
            f10357a = new o(com.apm.insight.e.g());
        }
        return f10357a;
    }

    public final String b() {
        try {
            return com.apm.insight.l.f.a(this.f10359c.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
        } catch (Throwable unused) {
            return "0";
        }
    }

    public final String c() {
        try {
            return com.apm.insight.l.f.a(this.d.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
        } catch (Throwable unused) {
            return null;
        }
    }

    private ArrayList<a> c(final String str) {
        File[] fileArrListFiles = this.f10358b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.o.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (fileArrListFiles != null) {
            com.apm.insight.a.a((Object) ("foundRuntimeContextFiles " + fileArrListFiles.length));
            byte b2 = 0;
            a aVar = null;
            for (File file : fileArrListFiles) {
                try {
                    a aVar2 = new a(file, b2);
                    arrayList.add(aVar2);
                    if (this.f == null && ".ctx".equals(str) && (aVar == null || aVar2.f10364b >= aVar.f10364b)) {
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    j.a(th, "NPTH_CATCH");
                }
            }
            if (this.f == null && aVar != null) {
                this.f = aVar;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    public final void a(Map<String, Object> map, JSONArray jSONArray) {
        char c2;
        JSONObject jSONObjectA = Header.a(this.f10360e).a(map);
        if (Header.c(jSONObjectA)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f == null) {
            c(".ctx");
        }
        a aVar = this.f;
        if (aVar != null) {
            JSONObject jSONObjectA2 = aVar.a();
            if (Header.c(jSONObjectA2)) {
                c2 = 2;
            } else if (Header.c(jSONObjectA)) {
                c2 = 0;
            } else if (String.valueOf(jSONObjectA.opt("update_version_code")).equals(String.valueOf(jSONObjectA2.opt("update_version_code"))) && Header.d(jSONObjectA2)) {
                c2 = 1;
            } else {
                c2 = 2;
            }
            if (c2 == 1) {
                a(aVar.f10363a, jCurrentTimeMillis, jSONObjectA, jSONArray);
                jCurrentTimeMillis = jCurrentTimeMillis;
                com.apm.insight.l.f.a(aVar.f10365c);
            } else if (c2 == 2) {
                a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectA, jSONArray);
            }
            try {
                ArrayList<a> arrayListC = c("");
                if (arrayListC.size() <= 6) {
                    return;
                }
                for (a aVar2 : arrayListC) {
                    if (a.a(aVar2, jCurrentTimeMillis)) {
                        a.d(aVar2);
                    }
                }
                return;
            } catch (Throwable th) {
                com.apm.insight.c.a();
                j.a(th, "NPTH_CATCH");
                return;
            }
        }
        a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectA, jSONArray);
    }

    public final void b(String str) {
        try {
            com.apm.insight.l.f.a(this.d, str, false);
        } catch (Throwable unused) {
        }
    }

    public final JSONArray b(long j) {
        File file;
        String strA;
        Iterator<a> it = c(".allData").iterator();
        while (true) {
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j >= next.f10363a && j <= next.f10364b) {
                file = next.f10365c;
                break;
            }
        }
        if (file == null) {
            a aVar = null;
            for (a aVar2 : c(".allData")) {
                if (aVar == null || Math.abs(aVar.f10364b - j) > Math.abs(aVar2.f10364b - j)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.f10365c;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
                try {
                    return new JSONArray(strA);
                } catch (Throwable th) {
                    th = th;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                strA = null;
            }
        }
        return null;
    }

    private void a(long j, long j2, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f10358b, j + TokenBuilder.TOKEN_DELIMITER + j2 + ".ctx");
        File file2 = new File(this.f10358b, j + TokenBuilder.TOKEN_DELIMITER + j2 + ".allData");
        try {
            com.apm.insight.l.f.a(file, jSONObject);
            com.apm.insight.l.f.a(file2, jSONArray);
            this.f = new a(file, (byte) 0);
        } catch (IOException e2) {
            com.apm.insight.c.a();
            j.a(e2, "NPTH_CATCH");
        }
    }

    public final void a(String str) {
        try {
            com.apm.insight.l.f.a(this.f10359c, str, false);
        } catch (Throwable unused) {
        }
    }

    public final JSONObject a(long j) {
        JSONObject jSONObject;
        File file;
        boolean z2;
        String strA;
        Iterator<a> it = c(".ctx").iterator();
        while (true) {
            jSONObject = null;
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j >= next.f10363a && j <= next.f10364b) {
                file = next.f10365c;
                break;
            }
        }
        if (file == null) {
            a aVar = null;
            for (a aVar2 : c(".ctx")) {
                if (aVar == null || Math.abs(aVar.f10364b - j) > Math.abs(aVar2.f10364b - j)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.f10365c;
            z2 = true;
        } else {
            z2 = false;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
                try {
                    jSONObject = new JSONObject(strA);
                } catch (Throwable th) {
                    th = th;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                }
            } catch (Throwable th2) {
                th = th2;
                strA = null;
            }
        }
        if (jSONObject != null && z2) {
            try {
                jSONObject.put("unauthentic_version", 1);
            } catch (JSONException e2) {
                com.apm.insight.c.a();
                j.a(e2, "NPTH_CATCH");
            }
        }
        return jSONObject;
    }
}
