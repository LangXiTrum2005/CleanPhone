package com.smartdigimkt.i7;

import android.content.Context;
import com.smartdigimkt.n8.p;
import com.smartdigimkt.sdk.api.AdError;
import com.thinkup.core.oo.m0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private static volatile e o;
    private Context g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private File f35874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AtomicInteger f35875i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35870a = "Agent";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35871b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35872c = 10;
    private long d = 1800000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35873e = "";
    private String f = "";
    private boolean j = false;
    private String k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.smartdigimkt.w7.c f35876l = new a();
    private com.smartdigimkt.d8.c.a m = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f35877n = new Object();

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (e.this.g == null) {
                    return;
                }
                if ((System.currentTimeMillis() - p.a(e.this.g, "sdm_sdk", "LOG_SEND_TIME", 0L) > e.this.d || (e.this.f35875i != null && e.this.f35875i.get() >= e.this.f35871b)) && !e.this.j && e.this.f35875i != null && e.this.f35875i.get() > 0) {
                    e.this.b();
                }
            } catch (Throwable unused) {
            }
        }
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.smartdigimkt.i7.e] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.BufferedReader] */
    public synchronized void b() {
        ?? bufferedReader;
        ?? r2;
        Object obj;
        String line;
        int iOptInt;
        boolean z2;
        this.j = true;
        ?? r3 = 0;
        ?? r4 = 0;
        ?? r5 = 0;
        ?? r6 = 0;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader(this.f35874h));
                    try {
                        try {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            int i2 = 0;
                            while (i2 < this.f35872c && (line = bufferedReader.readLine()) != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(line);
                                    try {
                                        iOptInt = jSONObject.optInt("send_count", 0);
                                        try {
                                            long j = Long.parseLong(jSONObject.optString("timestamp"));
                                            z2 = j > 0 && System.currentTimeMillis() - j > m0.om;
                                        } catch (Throwable unused) {
                                        }
                                    } catch (Throwable unused2) {
                                        iOptInt = 0;
                                    }
                                    if (iOptInt > 5 || z2) {
                                        arrayList2.add(jSONObject.toString());
                                    } else {
                                        jSONObject.put("send_count", iOptInt + 1);
                                        arrayList.add(jSONObject.toString());
                                    }
                                } catch (Throwable unused3) {
                                }
                                i2++;
                            }
                            bufferedReader.close();
                            if (i2 == 0) {
                                this.j = false;
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused4) {
                                }
                                return;
                            }
                            if (!arrayList2.isEmpty()) {
                                a(arrayList2.size());
                                b();
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused5) {
                                }
                                return;
                            }
                            a(arrayList);
                            com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
                            if (aVarB == null) {
                                com.smartdigimkt.b8.c cVar = new com.smartdigimkt.b8.c(this.g, 0, arrayList);
                                com.smartdigimkt.w7.c cVar2 = this.f35876l;
                                cVar.a(0, cVar2);
                                obj = cVar2;
                            } else if (aVarB.A0() != 1) {
                                com.smartdigimkt.b8.c cVar3 = new com.smartdigimkt.b8.c(this.g, aVarB.A0(), arrayList);
                                com.smartdigimkt.w7.c cVar4 = this.f35876l;
                                cVar3.a(0, cVar4);
                                obj = cVar4;
                            } else {
                                com.smartdigimkt.d8.a aVar = new com.smartdigimkt.d8.a(arrayList);
                                String strZ0 = aVarB.z0();
                                aVar.a(1, strZ0);
                                aVar.a(this.m);
                                obj = strZ0;
                            }
                            bufferedReader.close();
                            r3 = obj;
                        } catch (Error unused6) {
                            r5 = bufferedReader;
                            this.j = false;
                            r3 = r5;
                            if (r5 != 0) {
                                r2 = r5;
                                r2.close();
                                r3 = r2;
                            }
                        } catch (Exception unused7) {
                            r6 = bufferedReader;
                            this.j = false;
                            r3 = r6;
                            r2 = r6;
                            if (r6 != 0) {
                                r2.close();
                                r3 = r2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedReader != 0) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused8) {
                                }
                            }
                            throw th;
                        }
                    } catch (OutOfMemoryError | StackOverflowError unused9) {
                        r4 = bufferedReader;
                        this.j = false;
                        System.gc();
                        r3 = r4;
                        if (r4 != 0) {
                            r2 = r4;
                            r2.close();
                            r3 = r2;
                        }
                    }
                } catch (OutOfMemoryError | StackOverflowError unused10) {
                } catch (Error unused11) {
                } catch (Exception unused12) {
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = r3;
            }
        } catch (Exception unused13) {
        }
    }

    public void c() {
        if (this.g != null && com.smartdigimkt.m6.b.p().E() && com.smartdigimkt.n8.h.h(this.g)) {
            com.smartdigimkt.l7.b.a().b((Runnable) new c(), 13);
        }
    }

    public class a implements com.smartdigimkt.w7.c {
        public a() {
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, Object obj) {
            try {
                e.this.a(((Integer) obj).intValue());
                e.this.j = false;
                p.b(e.this.g, "sdm_sdk", "LOG_SEND_TIME", System.currentTimeMillis());
            } catch (Throwable unused) {
                e.this.j = false;
            }
        }

        @Override // com.smartdigimkt.w7.c
        public void b(int i2) {
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, String str, AdError adError) {
            e.this.j = false;
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2) {
            e.this.j = false;
        }
    }

    public class b implements com.smartdigimkt.d8.c.a {
        public b() {
        }

        @Override // com.smartdigimkt.d8.c.a
        public void a(Object obj) {
            if (obj instanceof com.smartdigimkt.d8.a) {
                e.this.a(((com.smartdigimkt.d8.a) obj).j());
                e.this.j = false;
                p.b(e.this.g, "sdm_sdk", "LOG_SEND_TIME", System.currentTimeMillis());
            }
        }

        @Override // com.smartdigimkt.d8.c.a
        public void a(Throwable th) {
            e.this.j = false;
        }
    }

    public static e a() {
        if (o == null) {
            synchronized (e.class) {
                try {
                    if (o == null) {
                        o = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f0 A[Catch: all -> 0x0097, Error -> 0x0134, OutOfMemoryError | StackOverflowError -> 0x013e, OutOfMemoryError | StackOverflowError -> 0x013e, Exception -> 0x0157, TryCatch #4 {OutOfMemoryError | StackOverflowError -> 0x013e, blocks: (B:10:0x0020, B:12:0x007a, B:14:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:29:0x00d6, B:39:0x00ec, B:39:0x00ec, B:41:0x00f0, B:41:0x00f0, B:42:0x00f7, B:42:0x00f7, B:44:0x0105, B:44:0x0105, B:46:0x010c, B:46:0x010c, B:48:0x011c, B:48:0x011c, B:50:0x0123, B:50:0x0123, B:49:0x0121, B:49:0x0121, B:45:0x010a, B:45:0x010a, B:35:0x00e3, B:35:0x00e3, B:36:0x00e6, B:36:0x00e6, B:38:0x00e9, B:38:0x00e9), top: B:84:0x0020, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0105 A[Catch: all -> 0x0097, Error -> 0x0134, OutOfMemoryError | StackOverflowError -> 0x013e, OutOfMemoryError | StackOverflowError -> 0x013e, Exception -> 0x0157, TryCatch #4 {OutOfMemoryError | StackOverflowError -> 0x013e, blocks: (B:10:0x0020, B:12:0x007a, B:14:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:29:0x00d6, B:39:0x00ec, B:39:0x00ec, B:41:0x00f0, B:41:0x00f0, B:42:0x00f7, B:42:0x00f7, B:44:0x0105, B:44:0x0105, B:46:0x010c, B:46:0x010c, B:48:0x011c, B:48:0x011c, B:50:0x0123, B:50:0x0123, B:49:0x0121, B:49:0x0121, B:45:0x010a, B:45:0x010a, B:35:0x00e3, B:35:0x00e3, B:36:0x00e6, B:36:0x00e6, B:38:0x00e9, B:38:0x00e9), top: B:84:0x0020, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x010a A[Catch: all -> 0x0097, Error -> 0x0134, OutOfMemoryError | StackOverflowError -> 0x013e, OutOfMemoryError | StackOverflowError -> 0x013e, Exception -> 0x0157, TryCatch #4 {OutOfMemoryError | StackOverflowError -> 0x013e, blocks: (B:10:0x0020, B:12:0x007a, B:14:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:29:0x00d6, B:39:0x00ec, B:39:0x00ec, B:41:0x00f0, B:41:0x00f0, B:42:0x00f7, B:42:0x00f7, B:44:0x0105, B:44:0x0105, B:46:0x010c, B:46:0x010c, B:48:0x011c, B:48:0x011c, B:50:0x0123, B:50:0x0123, B:49:0x0121, B:49:0x0121, B:45:0x010a, B:45:0x010a, B:35:0x00e3, B:35:0x00e3, B:36:0x00e6, B:36:0x00e6, B:38:0x00e9, B:38:0x00e9), top: B:84:0x0020, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x011c A[Catch: all -> 0x0097, Error -> 0x0134, OutOfMemoryError | StackOverflowError -> 0x013e, OutOfMemoryError | StackOverflowError -> 0x013e, Exception -> 0x0157, TryCatch #4 {OutOfMemoryError | StackOverflowError -> 0x013e, blocks: (B:10:0x0020, B:12:0x007a, B:14:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:29:0x00d6, B:39:0x00ec, B:39:0x00ec, B:41:0x00f0, B:41:0x00f0, B:42:0x00f7, B:42:0x00f7, B:44:0x0105, B:44:0x0105, B:46:0x010c, B:46:0x010c, B:48:0x011c, B:48:0x011c, B:50:0x0123, B:50:0x0123, B:49:0x0121, B:49:0x0121, B:45:0x010a, B:45:0x010a, B:35:0x00e3, B:35:0x00e3, B:36:0x00e6, B:36:0x00e6, B:38:0x00e9, B:38:0x00e9), top: B:84:0x0020, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0121 A[Catch: all -> 0x0097, Error -> 0x0134, OutOfMemoryError | StackOverflowError -> 0x013e, OutOfMemoryError | StackOverflowError -> 0x013e, Exception -> 0x0157, TryCatch #4 {OutOfMemoryError | StackOverflowError -> 0x013e, blocks: (B:10:0x0020, B:12:0x007a, B:14:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:29:0x00d6, B:39:0x00ec, B:39:0x00ec, B:41:0x00f0, B:41:0x00f0, B:42:0x00f7, B:42:0x00f7, B:44:0x0105, B:44:0x0105, B:46:0x010c, B:46:0x010c, B:48:0x011c, B:48:0x011c, B:50:0x0123, B:50:0x0123, B:49:0x0121, B:49:0x0121, B:45:0x010a, B:45:0x010a, B:35:0x00e3, B:35:0x00e3, B:36:0x00e6, B:36:0x00e6, B:38:0x00e9, B:38:0x00e9), top: B:84:0x0020, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x012c A[Catch: all -> 0x0132, TryCatch #2 {all -> 0x0132, blocks: (B:4:0x0007, B:8:0x000f, B:51:0x0128, B:53:0x012c, B:71:0x0160, B:72:0x0162, B:64:0x014b, B:66:0x014f, B:67:0x0156, B:56:0x0134, B:58:0x0138, B:61:0x0141, B:63:0x0145, B:68:0x0157, B:70:0x015b, B:74:0x0164, B:10:0x0020, B:12:0x007a, B:14:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:39:0x00ec, B:41:0x00f0, B:42:0x00f7, B:44:0x0105, B:46:0x010c, B:48:0x011c, B:50:0x0123, B:49:0x0121, B:45:0x010a, B:35:0x00e3, B:36:0x00e6, B:38:0x00e9, B:60:0x013e), top: B:81:0x0007, inners: #4, #5, #7, #9 }] */
    public void a(Context context) {
        AtomicInteger atomicInteger;
        com.smartdigimkt.l8.a aVarB;
        int iE;
        long jD;
        synchronized (this.f35877n) {
            try {
                if (this.g == null && context != null) {
                    this.k = com.smartdigimkt.m6.b.p().f();
                    this.g = context.getApplicationContext();
                    try {
                        try {
                            try {
                                try {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(this.g.getApplicationContext().getFilesDir().getAbsolutePath());
                                    String str = File.separator;
                                    sb.append(str);
                                    sb.append("log");
                                    sb.append(str);
                                    sb.append("sdm_agent_log");
                                    this.f35873e = sb.toString();
                                    this.f = this.g.getApplicationContext().getFilesDir().getAbsolutePath() + str + "log" + str + "sdm_temp_log";
                                    if (this.f35874h == null) {
                                        File file = new File(this.f35873e);
                                        this.f35874h = file;
                                        if (!file.getParentFile().exists()) {
                                            this.f35874h.getParentFile().mkdirs();
                                        }
                                        if (!this.f35874h.exists()) {
                                            this.f35874h.createNewFile();
                                        }
                                    }
                                    LineNumberReader lineNumberReader = null;
                                    try {
                                        try {
                                            LineNumberReader lineNumberReader2 = new LineNumberReader(new FileReader(this.f35874h));
                                            try {
                                                lineNumberReader2.skip(Long.MAX_VALUE);
                                                int lineNumber = lineNumberReader2.getLineNumber();
                                                if (this.f35875i == null) {
                                                    this.f35875i = new AtomicInteger(lineNumber);
                                                }
                                                lineNumberReader2.close();
                                                this.f35875i.get();
                                                lineNumberReader2.close();
                                            } catch (Exception unused) {
                                                lineNumberReader = lineNumberReader2;
                                                if (lineNumberReader != null) {
                                                    lineNumberReader.close();
                                                } else {
                                                    if (this.f35875i == null) {
                                                        this.f35875i = new AtomicInteger(0);
                                                    }
                                                    aVarB = com.smartdigimkt.k8.a.e().b();
                                                    if (aVarB.E() != 0) {
                                                        iE = aVarB.E();
                                                    } else {
                                                        iE = this.f35871b;
                                                    }
                                                    this.f35871b = iE;
                                                    this.f35872c = iE * 2;
                                                    if (aVarB.D() != 0) {
                                                        jD = aVarB.D();
                                                    } else {
                                                        jD = this.d;
                                                    }
                                                    this.d = jD;
                                                    c();
                                                    if (this.f35875i == null) {
                                                        atomicInteger = new AtomicInteger(0);
                                                        this.f35875i = atomicInteger;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                lineNumberReader = lineNumberReader2;
                                                if (lineNumberReader != null) {
                                                    try {
                                                        lineNumberReader.close();
                                                    } catch (IOException unused2) {
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (Exception unused3) {
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (IOException unused4) {
                                    }
                                    if (this.f35875i == null) {
                                        this.f35875i = new AtomicInteger(0);
                                    }
                                    aVarB = com.smartdigimkt.k8.a.e().b();
                                    if (aVarB.E() != 0) {
                                        iE = aVarB.E();
                                    } else {
                                        iE = this.f35871b;
                                    }
                                    this.f35871b = iE;
                                    this.f35872c = iE * 2;
                                    if (aVarB.D() != 0) {
                                        jD = aVarB.D();
                                    } else {
                                        jD = this.d;
                                    }
                                    this.d = jD;
                                    c();
                                    if (this.f35875i == null) {
                                        atomicInteger = new AtomicInteger(0);
                                        this.f35875i = atomicInteger;
                                    }
                                } catch (Error unused5) {
                                    if (this.f35875i == null) {
                                        atomicInteger = new AtomicInteger(0);
                                    }
                                }
                            } catch (Exception unused6) {
                                if (this.f35875i == null) {
                                    atomicInteger = new AtomicInteger(0);
                                }
                            }
                        } catch (OutOfMemoryError | StackOverflowError unused7) {
                            System.gc();
                            if (this.f35875i == null) {
                                atomicInteger = new AtomicInteger(0);
                            }
                        }
                    } catch (Throwable th3) {
                        if (this.f35875i == null) {
                            this.f35875i = new AtomicInteger(0);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        if (r0 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
    
        if (r0 != null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void a(com.smartdigimkt.a7.c r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.io.File r0 = r4.f35874h     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Ld
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f35875i     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto L18
            goto Ld
        La:
            r5 = move-exception
            goto L93
        Ld:
            com.smartdigimkt.m6.b r0 = com.smartdigimkt.m6.b.p()     // Catch: java.lang.Throwable -> La
            android.content.Context r0 = r0.k()     // Catch: java.lang.Throwable -> La
            r4.a(r0)     // Catch: java.lang.Throwable -> La
        L18:
            java.io.File r0 = r4.f35874h     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L91
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f35875i     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto L22
            goto L91
        L22:
            com.smartdigimkt.k8.a r0 = com.smartdigimkt.k8.a.e()     // Catch: java.lang.Throwable -> La
            com.smartdigimkt.l8.a r0 = r0.b()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L45
            int r1 = r0.E()     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L37
            int r1 = r0.E()     // Catch: java.lang.Throwable -> La
            goto L39
        L37:
            int r1 = r4.f35871b     // Catch: java.lang.Throwable -> La
        L39:
            r4.f35871b = r1     // Catch: java.lang.Throwable -> La
            int r1 = r1 * 2
            r4.f35872c = r1     // Catch: java.lang.Throwable -> La
            long r0 = r0.D()     // Catch: java.lang.Throwable -> La
            r4.d = r0     // Catch: java.lang.Throwable -> La
        L45:
            r0 = 0
            org.json.JSONObject r5 = r5.a()     // Catch: java.lang.Throwable -> L75 java.lang.Error -> L77 java.lang.Throwable -> L7a java.lang.Exception -> L87
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L75 java.lang.Error -> L77 java.lang.Throwable -> L7a java.lang.Exception -> L87
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L75 java.lang.Error -> L77 java.lang.Throwable -> L7a java.lang.Exception -> L87
            java.io.File r2 = r4.f35874h     // Catch: java.lang.Throwable -> L75 java.lang.Error -> L77 java.lang.Throwable -> L7a java.lang.Exception -> L87
            r3 = 1
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L75 java.lang.Error -> L77 java.lang.Throwable -> L7a java.lang.Exception -> L87
            r1.append(r5)     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L6f java.lang.Throwable -> L71 java.lang.Exception -> L73
            java.lang.String r5 = "\n"
            r1.append(r5)     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L6f java.lang.Throwable -> L71 java.lang.Exception -> L73
            r1.flush()     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L6f java.lang.Throwable -> L71 java.lang.Exception -> L73
            r1.close()     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L6f java.lang.Throwable -> L71 java.lang.Exception -> L73
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f35875i     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L6f java.lang.Throwable -> L71 java.lang.Exception -> L73
            r5.incrementAndGet()     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L6f java.lang.Throwable -> L71 java.lang.Exception -> L73
            r1.close()     // Catch: java.lang.Throwable -> La java.io.IOException -> L8c
            goto L8c
        L6d:
            r5 = move-exception
            goto L81
        L6f:
            r0 = r1
            goto L77
        L71:
            r0 = r1
            goto L7a
        L73:
            r0 = r1
            goto L87
        L75:
            r5 = move-exception
            goto L80
        L77:
            if (r0 == 0) goto L8c
            goto L89
        L7a:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L8c
            goto L89
        L80:
            r1 = r0
        L81:
            if (r1 == 0) goto L86
            r1.close()     // Catch: java.lang.Throwable -> La java.io.IOException -> L86
        L86:
            throw r5     // Catch: java.lang.Throwable -> La
        L87:
            if (r0 == 0) goto L8c
        L89:
            r0.close()     // Catch: java.lang.Throwable -> La java.io.IOException -> L8c
        L8c:
            r4.a(r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r4)
            return
        L91:
            monitor-exit(r4)
            return
        L93:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartdigimkt.i7.e.a(com.smartdigimkt.a7.c, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        if (r1 != 0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void a(boolean r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            android.content.Context r0 = r5.g     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L7
            monitor-exit(r5)
            return
        L7:
            com.smartdigimkt.m6.b r0 = com.smartdigimkt.m6.b.p()     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.E()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L13
            monitor-exit(r5)
            return
        L13:
            boolean r0 = r5.j     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto Lb6
            if (r6 != 0) goto L29
            java.util.concurrent.atomic.AtomicInteger r6 = r5.f35875i     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto Lb6
            int r6 = r6.get()     // Catch: java.lang.Throwable -> L26
            int r0 = r5.f35871b     // Catch: java.lang.Throwable -> L26
            if (r6 < r0) goto Lb6
            goto L29
        L26:
            r6 = move-exception
            goto Lb8
        L29:
            r6 = 1
            r5.j = r6     // Catch: java.lang.Throwable -> L26
            r0 = 0
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L99 java.lang.Throwable -> La0 java.lang.Exception -> La8
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L99 java.lang.Throwable -> La0 java.lang.Exception -> La8
            java.io.File r4 = r5.f35874h     // Catch: java.lang.Throwable -> L99 java.lang.Throwable -> La0 java.lang.Exception -> La8
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L99 java.lang.Throwable -> La0 java.lang.Exception -> La8
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L99 java.lang.Throwable -> La0 java.lang.Exception -> La8
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            r1.<init>()     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            r3 = r0
        L40:
            int r4 = r5.f35872c     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            if (r3 >= r4) goto L50
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            if (r4 == 0) goto L50
            r1.add(r4)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            int r3 = r3 + 1
            goto L40
        L50:
            com.smartdigimkt.k8.a r3 = com.smartdigimkt.k8.a.e()     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            com.smartdigimkt.l8.a r3 = r3.b()     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            if (r3 == 0) goto L83
            int r4 = r3.A0()     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            if (r4 == r6) goto L71
            com.smartdigimkt.b8.c r6 = new com.smartdigimkt.b8.c     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            android.content.Context r4 = r5.g     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            int r3 = r3.A0()     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            r6.<init>(r4, r3, r1)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            com.smartdigimkt.w7.c r1 = r5.f35876l     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            r6.a(r0, r1)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            goto L8f
        L71:
            com.smartdigimkt.d8.a r4 = new com.smartdigimkt.d8.a     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            java.lang.String r1 = r3.z0()     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            r4.a(r6, r1)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            com.smartdigimkt.d8.c$a r6 = r5.m     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            r4.a(r6)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            goto L8f
        L83:
            com.smartdigimkt.b8.c r6 = new com.smartdigimkt.b8.c     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            android.content.Context r3 = r5.g     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            r6.<init>(r3, r0, r1)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            com.smartdigimkt.w7.c r1 = r5.f35876l     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
            r6.a(r0, r1)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L95 java.lang.Exception -> L97
        L8f:
            r2.close()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> Lb6
            goto Lb6
        L93:
            r1 = r2
            goto L99
        L95:
            r1 = r2
            goto La0
        L97:
            r1 = r2
            goto La8
        L99:
            r5.j = r0     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto Lb6
            goto Lac
        L9e:
            r6 = move-exception
            goto Lb0
        La0:
            r5.j = r0     // Catch: java.lang.Throwable -> L9e
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto Lb6
            goto Lac
        La8:
            r5.j = r0     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto Lb6
        Lac:
            r1.close()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> Lb6
            goto Lb6
        Lb0:
            if (r1 == 0) goto Lb5
            r1.close()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> Lb5
        Lb5:
            throw r6     // Catch: java.lang.Throwable -> L26
        Lb6:
            monitor-exit(r5)
            return
        Lb8:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L26
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartdigimkt.i7.e.a(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r0 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r0 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r0 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r0 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        r0.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void a(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L73 java.lang.Exception -> L80
            java.lang.String r2 = r6.f     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L73 java.lang.Exception -> L80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L73 java.lang.Exception -> L80
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L73 java.lang.Exception -> L80
            if (r2 != 0) goto L12
            r1.createNewFile()     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L73 java.lang.Exception -> L80
        L12:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L73 java.lang.Exception -> L80
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L73 java.lang.Exception -> L80
            java.io.File r4 = r6.f35874h     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L73 java.lang.Exception -> L80
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L73 java.lang.Exception -> L80
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L73 java.lang.Exception -> L80
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r3 = 0
            r4 = r3
        L25:
            java.lang.String r5 = r2.readLine()     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            if (r5 == 0) goto L38
            int r4 = r4 + 1
            if (r4 <= r7) goto L25
            r0.append(r5)     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.lang.String r5 = "\n"
            r0.append(r5)     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            goto L25
        L38:
            r0.flush()     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r0.close()     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r2.close()     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f35875i     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            int r4 = r0.get()     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            int r4 = r4 - r7
            if (r4 >= 0) goto L4b
            goto L52
        L4b:
            java.util.concurrent.atomic.AtomicInteger r3 = r6.f35875i     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            int r3 = r3 - r7
        L52:
            r0.set(r3)     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.io.File r7 = r6.f35874h     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r7.delete()     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.io.File r7 = r6.f35874h     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r1.renameTo(r7)     // Catch: java.lang.Throwable -> L65 java.lang.Error -> L67 java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r2.close()     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L88
            goto L88
        L63:
            r7 = move-exception
            goto L86
        L65:
            r0 = r2
            goto L6d
        L67:
            r0 = r2
            goto L70
        L69:
            r0 = r2
            goto L73
        L6b:
            r0 = r2
            goto L80
        L6d:
            if (r0 == 0) goto L88
            goto L82
        L70:
            if (r0 == 0) goto L88
            goto L82
        L73:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L88
            goto L82
        L79:
            r7 = move-exception
            if (r0 == 0) goto L7f
            r0.close()     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L7f
        L7f:
            throw r7     // Catch: java.lang.Throwable -> L63
        L80:
            if (r0 == 0) goto L88
        L82:
            r0.close()     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L88
            goto L88
        L86:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L63
            throw r7
        L88:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartdigimkt.i7.e.a(int):void");
    }

    private synchronized void a(List<String> list) {
        BufferedWriter bufferedWriter;
        if (this.f35874h != null && list != null && !list.isEmpty()) {
            int size = list.size();
            list.size();
            BufferedReader bufferedReader = null;
            try {
                try {
                    File file = new File(this.f);
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f35874h));
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter(file));
                        for (int i2 = 0; i2 < size; i2++) {
                            try {
                                if (bufferedReader2.readLine() == null) {
                                    break;
                                }
                            } catch (Throwable unused) {
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (bufferedWriter != null) {
                                    bufferedWriter.close();
                                }
                            }
                        }
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            bufferedWriter.write(it.next());
                            bufferedWriter.newLine();
                        }
                        while (true) {
                            String line = bufferedReader2.readLine();
                            if (line != null) {
                                bufferedWriter.write(line);
                                bufferedWriter.newLine();
                            } else {
                                try {
                                    break;
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                        bufferedReader2.close();
                        bufferedWriter.close();
                        this.f35874h.delete();
                        file.renameTo(this.f35874h);
                        bufferedReader2.close();
                        bufferedWriter.close();
                    } catch (Throwable unused3) {
                        bufferedWriter = null;
                    }
                } catch (Throwable unused4) {
                    bufferedWriter = null;
                }
            } catch (Throwable unused5) {
            }
        }
    }
}
