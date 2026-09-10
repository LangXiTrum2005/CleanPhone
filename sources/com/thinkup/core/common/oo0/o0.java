package com.thinkup.core.common.oo0;

import android.content.Context;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n.oo0;
import com.thinkup.core.common.n0.o0o;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.onm;
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

/* JADX INFO: loaded from: classes6.dex */
public class o0 {
    private static volatile o0 m;
    private Context m0;
    private AtomicInteger mm;
    private File mo;
    private final String o = "Agent";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42284n = 5;
    private int o0 = 10;
    private long oo = 1800000;
    private String om = "";
    private String on = "";
    private boolean mn = false;
    private String n0 = "";
    private o0o no = new o0o() { // from class: com.thinkup.core.common.oo0.o0.1
        @Override // com.thinkup.core.common.n0.o0o
        public final void onLoadCanceled(int i2) {
            o0.o(o0.this);
        }

        @Override // com.thinkup.core.common.n0.o0o
        public final void onLoadError(int i2, String str, AdError adError) {
            o0.o(o0.this);
        }

        @Override // com.thinkup.core.common.n0.o0o
        public final void onLoadFinish(int i2, Object obj) {
            try {
                o0.this.o(((Integer) obj).intValue());
                o0.o(o0.this);
                onm.o(o0.this.m0, oo0.m.o, "LOG_SEND_TIME", System.currentTimeMillis());
            } catch (Throwable unused) {
                o0.o(o0.this);
            }
        }

        @Override // com.thinkup.core.common.n0.o0o
        public final void onLoadStart(int i2) {
        }
    };
    private com.thinkup.core.common.n0.o0.o0.o nm = new com.thinkup.core.common.n0.o0.o0.o() { // from class: com.thinkup.core.common.oo0.o0.2
        @Override // com.thinkup.core.common.n0.o0.o0.o
        public final void o(Object obj) {
            if (obj instanceof com.thinkup.core.common.n0.o0.o) {
                o0.this.o(((com.thinkup.core.common.n0.o0.o) obj).m());
                o0.o(o0.this);
                onm.o(o0.this.m0, oo0.m.o, "LOG_SEND_TIME", System.currentTimeMillis());
            }
        }

        @Override // com.thinkup.core.common.n0.o0.o0.o
        public final void o(Throwable th) {
            o0.o(o0.this);
        }
    };
    private Object nn = new Object();

    private o0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void n() {
        String line;
        int iOptInt;
        boolean z2;
        this.mn = true;
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.mo));
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = 0;
                        while (i2 < this.o0 && (line = bufferedReader2.readLine()) != null) {
                            try {
                                JSONObject jSONObject = new JSONObject(line);
                                try {
                                    iOptInt = jSONObject.optInt("send_count", 0);
                                    try {
                                        long j = Long.parseLong(jSONObject.optString("timestamp"));
                                        z2 = j > 0 && System.currentTimeMillis() - j > com.thinkup.core.oo.m0.om;
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
                        bufferedReader2.close();
                        if (i2 == 0) {
                            this.mn = false;
                            try {
                                bufferedReader2.close();
                                return;
                            } catch (Exception unused4) {
                                return;
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            o(arrayList2.size());
                            n();
                            try {
                                bufferedReader2.close();
                                return;
                            } catch (Exception unused5) {
                                return;
                            }
                        }
                        o(arrayList);
                        com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(o0n.m().on()).m(o0n.m().o00());
                        if (mVarM == null) {
                            new com.thinkup.core.common.n0.o0(this.m0, 0, arrayList).o(0, this.no);
                        } else if (mVarM.omm() != 1) {
                            new com.thinkup.core.common.n0.o0(this.m0, mVarM.omm(), arrayList).o(0, this.no);
                        } else {
                            com.thinkup.core.common.n0.o0.o oVar = new com.thinkup.core.common.n0.o0.o(arrayList);
                            oVar.o(1, mVarM.omo());
                            oVar.o(this.nm);
                        }
                        try {
                            bufferedReader2.close();
                        } catch (Exception unused6) {
                        }
                    } catch (Error unused7) {
                        bufferedReader = bufferedReader2;
                        this.mn = false;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused8) {
                            }
                        }
                    } catch (Exception unused9) {
                        bufferedReader = bufferedReader2;
                        this.mn = false;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused10) {
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused11) {
                            }
                        }
                        throw th;
                    }
                } catch (OutOfMemoryError | StackOverflowError unused12) {
                    bufferedReader = bufferedReader2;
                    this.mn = false;
                    System.gc();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused13) {
                        }
                    }
                }
            } catch (Error unused14) {
            } catch (Exception unused15) {
            } catch (OutOfMemoryError | StackOverflowError unused16) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static /* synthetic */ boolean o(o0 o0Var) {
        o0Var.mn = false;
        return false;
    }

    public final void m() {
        if (this.m0 != null && o0n.m().o() && o00.o(this.m0)) {
            com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.oo0.o0.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (o0.this.m0 == null) {
                            return;
                        }
                        if ((System.currentTimeMillis() - onm.m(o0.this.m0, oo0.m.o, "LOG_SEND_TIME", 0L) > o0.this.oo || (o0.this.mm != null && o0.this.mm.get() >= o0.this.f42284n)) && !o0.this.mn && o0.this.mm != null && o0.this.mm.get() > 0) {
                            o0.this.n();
                        }
                    } catch (Throwable unused) {
                    }
                }
            }, 13);
        }
    }

    public static o0 o() {
        if (m == null) {
            synchronized (o0.class) {
                try {
                    if (m == null) {
                        m = new o0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ef A[Catch: all -> 0x0097, Error -> 0x0139, OutOfMemoryError | StackOverflowError -> 0x0143, OutOfMemoryError | StackOverflowError -> 0x0143, Exception -> 0x015c, TryCatch #0 {OutOfMemoryError | StackOverflowError -> 0x0143, blocks: (B:10:0x001c, B:12:0x007a, B:14:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:29:0x00d6, B:39:0x00eb, B:39:0x00eb, B:41:0x00ef, B:41:0x00ef, B:42:0x00f6, B:42:0x00f6, B:44:0x0108, B:44:0x0108, B:46:0x010f, B:46:0x010f, B:48:0x011f, B:48:0x011f, B:50:0x0126, B:50:0x0126, B:49:0x0124, B:49:0x0124, B:45:0x010d, B:45:0x010d, B:35:0x00e2, B:35:0x00e2, B:36:0x00e5, B:36:0x00e5, B:38:0x00e8, B:38:0x00e8), top: B:81:0x001c, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0108 A[Catch: all -> 0x0097, Error -> 0x0139, OutOfMemoryError | StackOverflowError -> 0x0143, OutOfMemoryError | StackOverflowError -> 0x0143, Exception -> 0x015c, TryCatch #0 {OutOfMemoryError | StackOverflowError -> 0x0143, blocks: (B:10:0x001c, B:12:0x007a, B:14:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:29:0x00d6, B:39:0x00eb, B:39:0x00eb, B:41:0x00ef, B:41:0x00ef, B:42:0x00f6, B:42:0x00f6, B:44:0x0108, B:44:0x0108, B:46:0x010f, B:46:0x010f, B:48:0x011f, B:48:0x011f, B:50:0x0126, B:50:0x0126, B:49:0x0124, B:49:0x0124, B:45:0x010d, B:45:0x010d, B:35:0x00e2, B:35:0x00e2, B:36:0x00e5, B:36:0x00e5, B:38:0x00e8, B:38:0x00e8), top: B:81:0x001c, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x010d A[Catch: all -> 0x0097, Error -> 0x0139, OutOfMemoryError | StackOverflowError -> 0x0143, OutOfMemoryError | StackOverflowError -> 0x0143, Exception -> 0x015c, TryCatch #0 {OutOfMemoryError | StackOverflowError -> 0x0143, blocks: (B:10:0x001c, B:12:0x007a, B:14:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:29:0x00d6, B:39:0x00eb, B:39:0x00eb, B:41:0x00ef, B:41:0x00ef, B:42:0x00f6, B:42:0x00f6, B:44:0x0108, B:44:0x0108, B:46:0x010f, B:46:0x010f, B:48:0x011f, B:48:0x011f, B:50:0x0126, B:50:0x0126, B:49:0x0124, B:49:0x0124, B:45:0x010d, B:45:0x010d, B:35:0x00e2, B:35:0x00e2, B:36:0x00e5, B:36:0x00e5, B:38:0x00e8, B:38:0x00e8), top: B:81:0x001c, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x011f A[Catch: all -> 0x0097, Error -> 0x0139, OutOfMemoryError | StackOverflowError -> 0x0143, OutOfMemoryError | StackOverflowError -> 0x0143, Exception -> 0x015c, TryCatch #0 {OutOfMemoryError | StackOverflowError -> 0x0143, blocks: (B:10:0x001c, B:12:0x007a, B:14:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:29:0x00d6, B:39:0x00eb, B:39:0x00eb, B:41:0x00ef, B:41:0x00ef, B:42:0x00f6, B:42:0x00f6, B:44:0x0108, B:44:0x0108, B:46:0x010f, B:46:0x010f, B:48:0x011f, B:48:0x011f, B:50:0x0126, B:50:0x0126, B:49:0x0124, B:49:0x0124, B:45:0x010d, B:45:0x010d, B:35:0x00e2, B:35:0x00e2, B:36:0x00e5, B:36:0x00e5, B:38:0x00e8, B:38:0x00e8), top: B:81:0x001c, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0124 A[Catch: all -> 0x0097, Error -> 0x0139, OutOfMemoryError | StackOverflowError -> 0x0143, OutOfMemoryError | StackOverflowError -> 0x0143, Exception -> 0x015c, TryCatch #0 {OutOfMemoryError | StackOverflowError -> 0x0143, blocks: (B:10:0x001c, B:12:0x007a, B:14:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:29:0x00d6, B:39:0x00eb, B:39:0x00eb, B:41:0x00ef, B:41:0x00ef, B:42:0x00f6, B:42:0x00f6, B:44:0x0108, B:44:0x0108, B:46:0x010f, B:46:0x010f, B:48:0x011f, B:48:0x011f, B:50:0x0126, B:50:0x0126, B:49:0x0124, B:49:0x0124, B:45:0x010d, B:45:0x010d, B:35:0x00e2, B:35:0x00e2, B:36:0x00e5, B:36:0x00e5, B:38:0x00e8, B:38:0x00e8), top: B:81:0x001c, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x012f A[Catch: all -> 0x0137, TryCatch #5 {all -> 0x0137, blocks: (B:4:0x0003, B:8:0x000b, B:51:0x012b, B:53:0x012f, B:54:0x0134, B:72:0x0166, B:65:0x0150, B:67:0x0154, B:68:0x015b, B:57:0x0139, B:59:0x013d, B:62:0x0146, B:64:0x014a, B:69:0x015c, B:71:0x0160, B:74:0x0168, B:10:0x001c, B:12:0x007a, B:14:0x008d, B:17:0x009a, B:19:0x00a2, B:29:0x00d6, B:39:0x00eb, B:41:0x00ef, B:42:0x00f6, B:44:0x0108, B:46:0x010f, B:48:0x011f, B:50:0x0126, B:49:0x0124, B:45:0x010d, B:35:0x00e2, B:36:0x00e5, B:38:0x00e8, B:61:0x0143), top: B:85:0x0003, inners: #4, #11 }] */
    public final void o(Context context) {
        AtomicInteger atomicInteger;
        LineNumberReader lineNumberReader;
        Throwable th;
        com.thinkup.core.oo.m mVarM;
        int iNnn;
        long jO00o;
        synchronized (this.nn) {
            try {
                if (this.m0 == null && context != null) {
                    this.n0 = o0n.m().o00();
                    this.m0 = context.getApplicationContext();
                    try {
                        try {
                            try {
                                StringBuilder sb = new StringBuilder();
                                sb.append(this.m0.getApplicationContext().getFilesDir().getAbsolutePath());
                                String str = File.separator;
                                sb.append(str);
                                sb.append("log");
                                sb.append(str);
                                sb.append("thinkup_agent_log");
                                this.om = sb.toString();
                                this.on = this.m0.getApplicationContext().getFilesDir().getAbsolutePath() + str + "log" + str + "thinkup_temp_log";
                                if (this.mo == null) {
                                    File file = new File(this.om);
                                    this.mo = file;
                                    if (!file.getParentFile().exists()) {
                                        this.mo.getParentFile().mkdirs();
                                    }
                                    if (!this.mo.exists()) {
                                        this.mo.createNewFile();
                                    }
                                }
                                LineNumberReader lineNumberReader2 = null;
                                try {
                                    try {
                                        lineNumberReader = new LineNumberReader(new FileReader(this.mo));
                                        try {
                                            lineNumberReader.skip(Long.MAX_VALUE);
                                            int lineNumber = lineNumberReader.getLineNumber();
                                            if (this.mm == null) {
                                                this.mm = new AtomicInteger(lineNumber);
                                            }
                                            lineNumberReader.close();
                                            this.mm.get();
                                            lineNumberReader.close();
                                        } catch (Exception unused) {
                                            lineNumberReader2 = lineNumberReader;
                                            if (lineNumberReader2 != null) {
                                                lineNumberReader2.close();
                                            } else {
                                                if (this.mm == null) {
                                                    this.mm = new AtomicInteger(0);
                                                }
                                                mVarM = com.thinkup.core.oo.o0.o(this.m0).m(this.n0);
                                                if (mVarM.nnn() != 0) {
                                                    iNnn = mVarM.nnn();
                                                } else {
                                                    iNnn = this.f42284n;
                                                }
                                                this.f42284n = iNnn;
                                                this.o0 = iNnn * 2;
                                                if (mVarM.o00o() != 0) {
                                                    jO00o = mVarM.o00o();
                                                } else {
                                                    jO00o = this.oo;
                                                }
                                                this.oo = jO00o;
                                                m();
                                                if (this.mm == null) {
                                                    atomicInteger = new AtomicInteger(0);
                                                    this.mm = atomicInteger;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (lineNumberReader != null) {
                                                try {
                                                    lineNumberReader.close();
                                                    throw th;
                                                } catch (IOException unused2) {
                                                    throw th;
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (Exception unused3) {
                                    } catch (Throwable th3) {
                                        lineNumberReader = null;
                                        th = th3;
                                    }
                                } catch (IOException unused4) {
                                }
                                if (this.mm == null) {
                                    this.mm = new AtomicInteger(0);
                                }
                                mVarM = com.thinkup.core.oo.o0.o(this.m0).m(this.n0);
                                if (mVarM.nnn() != 0) {
                                    iNnn = mVarM.nnn();
                                } else {
                                    iNnn = this.f42284n;
                                }
                                this.f42284n = iNnn;
                                this.o0 = iNnn * 2;
                                if (mVarM.o00o() != 0) {
                                    jO00o = mVarM.o00o();
                                } else {
                                    jO00o = this.oo;
                                }
                                this.oo = jO00o;
                                m();
                                if (this.mm == null) {
                                    atomicInteger = new AtomicInteger(0);
                                    this.mm = atomicInteger;
                                }
                            } catch (Error unused5) {
                                if (this.mm == null) {
                                    atomicInteger = new AtomicInteger(0);
                                }
                            } catch (Exception unused6) {
                                if (this.mm == null) {
                                    atomicInteger = new AtomicInteger(0);
                                }
                            }
                        } catch (OutOfMemoryError | StackOverflowError unused7) {
                            System.gc();
                            if (this.mm == null) {
                                atomicInteger = new AtomicInteger(0);
                            }
                        }
                    } catch (Throwable th4) {
                        if (this.mm == null) {
                            this.mm = new AtomicInteger(0);
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        if (r0 != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void o(com.thinkup.core.common.on.o0n r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.io.File r0 = r4.mo     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Ld
            java.util.concurrent.atomic.AtomicInteger r0 = r4.mm     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto L18
            goto Ld
        La:
            r5 = move-exception
            goto L98
        Ld:
            com.thinkup.core.common.n.o0n r0 = com.thinkup.core.common.n.o0n.m()     // Catch: java.lang.Throwable -> La
            android.content.Context r0 = r0.on()     // Catch: java.lang.Throwable -> La
            r4.o(r0)     // Catch: java.lang.Throwable -> La
        L18:
            java.io.File r0 = r4.mo     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L96
            java.util.concurrent.atomic.AtomicInteger r0 = r4.mm     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto L22
            goto L96
        L22:
            android.content.Context r0 = r4.m0     // Catch: java.lang.Throwable -> La
            com.thinkup.core.oo.o0 r0 = com.thinkup.core.oo.o0.o(r0)     // Catch: java.lang.Throwable -> La
            java.lang.String r1 = r4.n0     // Catch: java.lang.Throwable -> La
            com.thinkup.core.oo.m r0 = r0.m(r1)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L49
            int r1 = r0.nnn()     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L3b
            int r1 = r0.nnn()     // Catch: java.lang.Throwable -> La
            goto L3d
        L3b:
            int r1 = r4.f42284n     // Catch: java.lang.Throwable -> La
        L3d:
            r4.f42284n = r1     // Catch: java.lang.Throwable -> La
            int r1 = r1 * 2
            r4.o0 = r1     // Catch: java.lang.Throwable -> La
            long r0 = r0.o00o()     // Catch: java.lang.Throwable -> La
            r4.oo = r0     // Catch: java.lang.Throwable -> La
        L49:
            r0 = 0
            org.json.JSONObject r5 = r5.o()     // Catch: java.lang.Throwable -> L7a java.lang.Error -> L7c java.lang.Throwable -> L82 java.lang.Exception -> L8e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L7a java.lang.Error -> L7c java.lang.Throwable -> L82 java.lang.Exception -> L8e
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L7a java.lang.Error -> L7c java.lang.Throwable -> L82 java.lang.Exception -> L8e
            java.io.File r2 = r4.mo     // Catch: java.lang.Throwable -> L7a java.lang.Error -> L7c java.lang.Throwable -> L82 java.lang.Exception -> L8e
            r3 = 1
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L7a java.lang.Error -> L7c java.lang.Throwable -> L82 java.lang.Exception -> L8e
            r1.append(r5)     // Catch: java.lang.Throwable -> L71 java.lang.Error -> L74 java.lang.Throwable -> L76 java.lang.Exception -> L78
            java.lang.String r5 = "\n"
            r1.append(r5)     // Catch: java.lang.Throwable -> L71 java.lang.Error -> L74 java.lang.Throwable -> L76 java.lang.Exception -> L78
            r1.flush()     // Catch: java.lang.Throwable -> L71 java.lang.Error -> L74 java.lang.Throwable -> L76 java.lang.Exception -> L78
            r1.close()     // Catch: java.lang.Throwable -> L71 java.lang.Error -> L74 java.lang.Throwable -> L76 java.lang.Exception -> L78
            java.util.concurrent.atomic.AtomicInteger r5 = r4.mm     // Catch: java.lang.Throwable -> L71 java.lang.Error -> L74 java.lang.Throwable -> L76 java.lang.Exception -> L78
            r5.incrementAndGet()     // Catch: java.lang.Throwable -> L71 java.lang.Error -> L74 java.lang.Throwable -> L76 java.lang.Exception -> L78
            r1.close()     // Catch: java.lang.Throwable -> La java.io.IOException -> L91
            goto L91
        L71:
            r5 = move-exception
            r0 = r1
            goto L88
        L74:
            r0 = r1
            goto L7c
        L76:
            r0 = r1
            goto L82
        L78:
            r0 = r1
            goto L8e
        L7a:
            r5 = move-exception
            goto L88
        L7c:
            if (r0 == 0) goto L91
        L7e:
            r0.close()     // Catch: java.lang.Throwable -> La java.io.IOException -> L91
            goto L91
        L82:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L91
            goto L7e
        L88:
            if (r0 == 0) goto L8d
            r0.close()     // Catch: java.lang.Throwable -> La java.io.IOException -> L8d
        L8d:
            throw r5     // Catch: java.lang.Throwable -> La
        L8e:
            if (r0 == 0) goto L91
            goto L7e
        L91:
            r4.o(r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r4)
            return
        L96:
            monitor-exit(r4)
            return
        L98:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thinkup.core.common.oo0.o0.o(com.thinkup.core.common.on.o0n, boolean):void");
    }

    private synchronized void o(boolean z2) {
        String line;
        AtomicInteger atomicInteger;
        try {
            if (this.m0 == null) {
                return;
            }
            if (!o0n.m().o()) {
                return;
            }
            if (this.mn || (!z2 && ((atomicInteger = this.mm) == null || atomicInteger.get() < this.f42284n))) {
                return;
            }
            this.mn = true;
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.mo));
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < this.o0 && (line = bufferedReader2.readLine()) != null; i2++) {
                            arrayList.add(line);
                        }
                        com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(o0n.m().on()).m(o0n.m().o00());
                        if (mVarM != null) {
                            if (mVarM.omm() != 1) {
                                new com.thinkup.core.common.n0.o0(this.m0, mVarM.omm(), arrayList).o(0, this.no);
                            } else {
                                com.thinkup.core.common.n0.o0.o oVar = new com.thinkup.core.common.n0.o0.o(arrayList);
                                oVar.o(1, mVarM.omo());
                                oVar.o(this.nm);
                            }
                        } else {
                            new com.thinkup.core.common.n0.o0(this.m0, 0, arrayList).o(0, this.no);
                        }
                        try {
                            bufferedReader2.close();
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        bufferedReader = bufferedReader2;
                        this.mn = false;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused3) {
                            }
                        }
                    } catch (OutOfMemoryError | StackOverflowError unused4) {
                        bufferedReader = bufferedReader2;
                        this.mn = false;
                        System.gc();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused5) {
                            }
                        }
                    } catch (Throwable unused6) {
                        bufferedReader = bufferedReader2;
                        this.mn = false;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused7) {
                            }
                        }
                    }
                } catch (Exception unused8) {
                } catch (OutOfMemoryError | StackOverflowError unused9) {
                } catch (Throwable unused10) {
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused11) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(int i2) {
        BufferedReader bufferedReader = null;
        try {
            File file = new File(this.on);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.mo));
            try {
                FileWriter fileWriter = new FileWriter(file);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        break;
                    }
                    i4++;
                    if (i4 > i2) {
                        fileWriter.append((CharSequence) line);
                        fileWriter.append((CharSequence) IOUtils.LINE_SEPARATOR_UNIX);
                    }
                }
                fileWriter.flush();
                fileWriter.close();
                bufferedReader2.close();
                AtomicInteger atomicInteger = this.mm;
                if (atomicInteger.get() - i2 >= 0) {
                    i3 = this.mm.get() - i2;
                }
                atomicInteger.set(i3);
                this.mo.delete();
                file.renameTo(this.mo);
                try {
                    bufferedReader2.close();
                } catch (IOException unused) {
                }
            } catch (Error unused2) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Exception unused4) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused5) {
                    }
                }
            } catch (OutOfMemoryError | StackOverflowError unused6) {
                bufferedReader = bufferedReader2;
                try {
                    System.gc();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused7) {
                        }
                    }
                } catch (Throwable th) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused8) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable unused9) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused10) {
                    }
                }
            }
        } catch (Exception unused11) {
        } catch (OutOfMemoryError | StackOverflowError unused12) {
        } catch (Error unused13) {
        } catch (Throwable unused14) {
        }
    }

    private synchronized void o(List<String> list) {
        BufferedWriter bufferedWriter;
        if (this.mo != null && !list.isEmpty()) {
            int size = list.size();
            list.size();
            BufferedReader bufferedReader = null;
            try {
                File file = new File(this.on);
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.mo));
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
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused2) {
                                    return;
                                }
                            }
                            if (bufferedWriter != null) {
                                bufferedWriter.close();
                            }
                            return;
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
                            } catch (Throwable unused3) {
                            }
                        }
                    }
                    bufferedReader2.close();
                    bufferedWriter.close();
                    this.mo.delete();
                    file.renameTo(this.mo);
                    try {
                        bufferedReader2.close();
                        bufferedWriter.close();
                    } catch (Throwable unused4) {
                    }
                } catch (Throwable unused5) {
                    bufferedWriter = null;
                }
            } catch (Throwable unused6) {
                bufferedWriter = null;
            }
        }
    }
}
