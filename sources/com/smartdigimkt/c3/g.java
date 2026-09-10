package com.smartdigimkt.c3;

import android.webkit.URLUtil;
import com.smartdigimkt.v0.y;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34106a = "DownLoadUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f34107b = "<anythinkloadend></anythinkloadend>";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f34108c = 20000;
    private static final int d = 30000;

    public class a extends com.smartdigimkt.s0.a {
        final /* synthetic */ i.d e0;
        final /* synthetic */ String f0;
        final /* synthetic */ String g0;

        public a(i.d dVar, String str, String str2) {
            this.e0 = dVar;
            this.f0 = str;
            this.g0 = str2;
        }

        @Override // com.smartdigimkt.s0.a
        public void a(boolean z2) {
        }

        @Override // com.smartdigimkt.s0.a
        public void c() {
        }

        /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:48:0x00a9 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:49:0x00ab A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #8 {all -> 0x00a7, blocks: (B:45:0x00a3, B:49:0x00ab), top: B:92:0x00a3 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x00ba A[Catch: all -> 0x00c2, TryCatch #5 {all -> 0x00c2, blocks: (B:52:0x00b6, B:54:0x00ba, B:57:0x00c4, B:59:0x00c8), top: B:87:0x00b6 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x00c4 A[Catch: all -> 0x00c2, TryCatch #5 {all -> 0x00c2, blocks: (B:52:0x00b6, B:54:0x00ba, B:57:0x00c4, B:59:0x00c8), top: B:87:0x00b6 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x00c8 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #5 {all -> 0x00c2, blocks: (B:52:0x00b6, B:54:0x00ba, B:57:0x00c4, B:59:0x00c8), top: B:87:0x00b6 }] */
        /* JADX WARN: Code duplicated, block: B:78:0x0104 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:79:0x0106 A[Catch: all -> 0x0102, TRY_LEAVE, TryCatch #4 {all -> 0x0102, blocks: (B:75:0x00fe, B:79:0x0106), top: B:85:0x00fe }] */
        /* JADX WARN: Code duplicated, block: B:85:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:59:0x00c8, please report this as an issue */
        @Override // com.smartdigimkt.s0.a
        public void f() throws Throwable {
            FileOutputStream fileOutputStream;
            FileOutputStream fileOutputStream2;
            InputStream inputStream;
            FileOutputStream fileOutputStream3;
            FileOutputStream fileOutputStream4;
            Throwable th;
            InputStream inputStream2;
            String message;
            String str;
            i.d dVar;
            boolean z2;
            InputStream inputStream3 = null;
            fileOutputStream = null;
            fileOutputStream = null;
            FileOutputStream fileOutputStream5 = null;
            InputStream inputStream4 = null;
            boolean z3 = false;
            try {
                i.d dVar2 = this.e0;
                if (dVar2 != null) {
                    dVar2.a();
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f0).openConnection();
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setConnectTimeout(20000);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    inputStream2 = httpURLConnection.getInputStream();
                    try {
                        fileOutputStream4 = new FileOutputStream(this.g0);
                        try {
                            byte[] bArr = new byte[com.p004ironsource.mediationsdk.metadata.a.f25965n];
                            while (true) {
                                int i2 = inputStream2.read(bArr);
                                if (i2 == -1) {
                                    break;
                                } else {
                                    fileOutputStream4.write(bArr, 0, i2);
                                }
                            }
                            fileOutputStream4.close();
                            z2 = true;
                            message = "";
                            fileOutputStream5 = fileOutputStream4;
                        } catch (Exception e2) {
                            inputStream = inputStream2;
                            e = e2;
                            fileOutputStream3 = fileOutputStream4;
                            try {
                                message = e.getMessage();
                                e.getLocalizedMessage();
                                if (fileOutputStream3 != null) {
                                    try {
                                        fileOutputStream3.close();
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                    } catch (Throwable th2) {
                                        th2.printStackTrace();
                                        message = th2.getMessage();
                                    }
                                } else if (inputStream != null) {
                                    inputStream.close();
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream = fileOutputStream3;
                                inputStream3 = inputStream;
                                InputStream inputStream5 = inputStream3;
                                th = th;
                                inputStream2 = inputStream5;
                                fileOutputStream4 = fileOutputStream;
                                if (fileOutputStream4 != null) {
                                    try {
                                        fileOutputStream4.close();
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                    } catch (Throwable th4) {
                                        th4.printStackTrace();
                                        th4.getMessage();
                                        throw th;
                                    }
                                } else if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            if (fileOutputStream4 != null) {
                                fileOutputStream4.close();
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                            } else if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        FileOutputStream fileOutputStream6 = fileOutputStream5;
                        inputStream4 = inputStream2;
                        e = e3;
                        fileOutputStream2 = fileOutputStream6;
                        FileOutputStream fileOutputStream7 = fileOutputStream2;
                        inputStream = inputStream4;
                        fileOutputStream3 = fileOutputStream7;
                        message = e.getMessage();
                        e.getLocalizedMessage();
                        if (fileOutputStream3 != null) {
                            fileOutputStream3.close();
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } else if (inputStream != null) {
                            inputStream.close();
                        }
                        str = this.g0;
                        if (z3) {
                            this.e0.a(str, this.f0);
                            return;
                        }
                        dVar = this.e0;
                        if (dVar != null) {
                            dVar.a("content write failed:" + message);
                        }
                    } catch (Throwable th6) {
                        FileOutputStream fileOutputStream8 = fileOutputStream5;
                        inputStream3 = inputStream2;
                        th = th6;
                        fileOutputStream = fileOutputStream8;
                        InputStream inputStream6 = inputStream3;
                        th = th;
                        inputStream2 = inputStream6;
                        fileOutputStream4 = fileOutputStream;
                        if (fileOutputStream4 != null) {
                            fileOutputStream4.close();
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                        } else if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        throw th;
                    }
                } else {
                    message = "responseCode is " + responseCode;
                    inputStream2 = null;
                    z2 = false;
                }
                httpURLConnection.disconnect();
                if (fileOutputStream5 != null) {
                    try {
                        fileOutputStream5.close();
                    } catch (Throwable th7) {
                        th7.printStackTrace();
                        message = th7.getMessage();
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                z3 = z2;
            } catch (Exception e4) {
                e = e4;
                fileOutputStream2 = null;
            } catch (Throwable th8) {
                th = th8;
                fileOutputStream = null;
            }
            try {
                str = this.g0;
                if (z3) {
                    this.e0.a(str, this.f0);
                    return;
                }
                dVar = this.e0;
                if (dVar != null) {
                    dVar.a("content write failed:" + message);
                }
            } catch (Throwable th9) {
                if (com.smartdigimkt.b.b.f33800a) {
                    th9.printStackTrace();
                }
                i.d dVar3 = this.e0;
                if (dVar3 != null) {
                    try {
                        dVar3.a(th9.getMessage());
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
    }

    public static void a(String str, String str2, i.d dVar) {
        try {
            if (!y.a(str) && URLUtil.isNetworkUrl(str)) {
                h.a().a(new a(dVar, str, str2));
                return;
            }
            if (dVar != null) {
                dVar.a("url is error");
            }
        } catch (Throwable th) {
            if (com.smartdigimkt.b.b.f33800a) {
                th.printStackTrace();
            }
        }
    }
}
