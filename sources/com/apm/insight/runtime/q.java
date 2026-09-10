package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;
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
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static q f193a;
    private File b;
    private File c;
    private File d;
    private Context e;
    private a f = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f195a;
        private long b;
        private File c;
        private JSONObject d;

        public /* synthetic */ a(File file, byte b) {
            this(file);
        }

        public static /* synthetic */ void d(a aVar) {
            aVar.c.delete();
        }

        private a(File file) {
            this.d = null;
            this.c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f195a = Long.parseLong(strArrSplit[0]);
                this.b = Long.parseLong(strArrSplit[1]);
                return;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name) || name.length() < 13) {
                return;
            }
            String strSubstring = name.substring(0, 13);
            if (TextUtils.isDigitsOnly(strSubstring)) {
                long j = Long.parseLong(strSubstring);
                this.f195a = j;
                this.b = j;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject a() {
            if (this.d == null) {
                try {
                    this.d = new JSONObject(com.apm.insight.l.f.a(this.c.getAbsolutePath(), "\n"));
                } catch (Throwable unused) {
                }
                if (this.d == null) {
                    this.d = new JSONObject();
                }
            }
            return this.d;
        }

        public static /* synthetic */ boolean a(a aVar, long j) {
            long j2 = aVar.f195a;
            if (j2 > j && j2 - j > 604800000) {
                return true;
            }
            long j3 = aVar.b;
            if (j3 >= j || j - j3 <= 604800000) {
                return aVar.c.lastModified() < j && j - aVar.c.lastModified() > 604800000;
            }
            return true;
        }
    }

    private q(Context context) {
        File fileC = com.apm.insight.l.j.c(context);
        if (!fileC.exists() || (!fileC.isDirectory() && fileC.delete())) {
            fileC.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.b = fileC;
        this.c = new File(fileC, "did");
        this.d = new File(fileC, "device_uuid");
        this.e = context;
    }

    public static q a() {
        if (f193a == null) {
            f193a = new q(com.apm.insight.e.g());
        }
        return f193a;
    }

    public final String b() {
        try {
            return com.apm.insight.l.f.a(this.c.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return "0";
        }
    }

    public final String c() {
        try {
            return com.apm.insight.l.f.a(this.d.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return null;
        }
    }

    private ArrayList<a> c(final String str) {
        File[] fileArrListFiles = this.b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.q.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (fileArrListFiles == null) {
            return arrayList;
        }
        com.apm.insight.a.a((Object) ("foundRuntimeContextFiles " + fileArrListFiles.length));
        byte b = 0;
        a aVar = null;
        for (File file : fileArrListFiles) {
            try {
                a aVar2 = new a(file, b);
                arrayList.add(aVar2);
                if (this.f == null && ".ctx".equals(str) && (aVar == null || aVar2.b >= aVar.b)) {
                    aVar = aVar2;
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                k.a(th, "NPTH_CATCH");
            }
        }
        if (this.f == null && aVar != null) {
            this.f = aVar;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    public final void a(Map<String, Object> map, JSONArray jSONArray) {
        char c;
        JSONObject jSONObjectA = Header.a(this.e).a(map);
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
                c = 2;
            } else if (Header.c(jSONObjectA)) {
                c = 0;
            } else if (String.valueOf(jSONObjectA.opt("update_version_code")).equals(String.valueOf(jSONObjectA2.opt("update_version_code"))) && Header.d(jSONObjectA2)) {
                c = 1;
            } else {
                c = 2;
            }
            if (c == 1) {
                a(aVar.f195a, jCurrentTimeMillis, jSONObjectA, jSONArray);
                com.apm.insight.l.f.a(aVar.c);
            } else if (c == 2) {
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
                k.a(th, "NPTH_CATCH");
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

    @Nullable
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
            if (j >= next.f195a && j <= next.b) {
                file = next.c;
                break;
            }
        }
        if (file == null) {
            a aVar = null;
            for (a aVar2 : c(".allData")) {
                if (aVar == null || Math.abs(aVar.b - j) > Math.abs(aVar2.b - j)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.c;
        }
        if (file == null) {
            return null;
        }
        try {
            strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
            try {
                return new JSONArray(strA);
            } catch (Throwable th) {
                th = th;
                com.apm.insight.c.a();
                k.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            strA = null;
        }
    }

    private void a(long j, long j2, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.b, j + "-" + j2 + ".ctx");
        File file2 = new File(this.b, j + "-" + j2 + ".allData");
        try {
            com.apm.insight.l.f.a(file, jSONObject);
            com.apm.insight.l.f.a(file2, jSONArray);
            this.f = new a(file, (byte) 0);
        } catch (IOException e) {
            com.apm.insight.c.a();
            k.a(e, "NPTH_CATCH");
        }
    }

    public final void a(String str) {
        try {
            com.apm.insight.l.f.a(this.c, str, false);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final JSONObject a(long j) {
        JSONObject jSONObject;
        File file;
        boolean z;
        String strA;
        Iterator<a> it = c(".ctx").iterator();
        while (true) {
            jSONObject = null;
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j >= next.f195a && j <= next.b) {
                file = next.c;
                break;
            }
        }
        if (file == null) {
            a aVar = null;
            for (a aVar2 : c(".ctx")) {
                if (aVar == null || Math.abs(aVar.b - j) > Math.abs(aVar2.b - j)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.c;
            z = true;
        } else {
            z = false;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    jSONObject = new JSONObject(strA);
                } catch (Throwable th) {
                    th = th;
                    com.apm.insight.c.a();
                    k.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                }
            } catch (Throwable th2) {
                th = th2;
                strA = null;
            }
        }
        if (jSONObject != null && z) {
            try {
                jSONObject.put("unauthentic_version", 1);
            } catch (JSONException e) {
                com.apm.insight.c.a();
                k.a(e, "NPTH_CATCH");
            }
        }
        return jSONObject;
    }
}
