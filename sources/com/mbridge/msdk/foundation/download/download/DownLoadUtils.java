package com.mbridge.msdk.foundation.download.download;

import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class DownLoadUtils {
    private static final int DOWNLOAD_CONNECTION_TIME_OUT = 20000;
    private static final int DOWNLOAD_READ_TIME_OUT = 30000;
    public static final String END_TAG = "<mbridgeloadend></mbridgeloadend>";
    private static final String TAG = "DownLoadUtils";

    public static void getSourceCodeFromNetUrl(final String str, final H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source, final boolean z10) {
        try {
            if (!a1.a(str) && URLUtil.isNetworkUrl(str)) {
                DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.DownLoadUtils.1
                    /* JADX WARN: Code duplicated, block: B:106:0x0177 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:107:0x0179 A[Catch: Exception -> 0x0175, TRY_LEAVE, TryCatch #4 {Exception -> 0x0175, blocks: (B:103:0x0171, B:107:0x0179), top: B:119:0x0171 }] */
                    /* JADX WARN: Code duplicated, block: B:117:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:119:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:126:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:63:0x00fa A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:64:0x00fc A[Catch: Exception -> 0x00f8, TRY_LEAVE, TryCatch #3 {Exception -> 0x00f8, blocks: (B:60:0x00f4, B:64:0x00fc), top: B:117:0x00f4 }] */
                    /* JADX WARN: Code duplicated, block: B:71:0x010e A[ADDED_TO_REGION] */
                    /* JADX WARN: Code duplicated, block: B:77:0x011d  */
                    /* JADX WARN: Code duplicated, block: B:78:0x011f A[Catch: all -> 0x011b, TryCatch #12 {all -> 0x011b, blocks: (B:69:0x010a, B:72:0x0110, B:74:0x0113, B:78:0x011f, B:80:0x0125, B:82:0x012b, B:84:0x0133, B:86:0x0137, B:87:0x013d, B:89:0x0141), top: B:126:0x010a }] */
                    /* JADX WARN: Code duplicated, block: B:87:0x013d A[Catch: all -> 0x011b, TryCatch #12 {all -> 0x011b, blocks: (B:69:0x010a, B:72:0x0110, B:74:0x0113, B:78:0x011f, B:80:0x0125, B:82:0x012b, B:84:0x0133, B:86:0x0137, B:87:0x013d, B:89:0x0141), top: B:126:0x010a }] */
                    /* JADX WARN: Code duplicated, block: B:89:0x0141 A[Catch: all -> 0x011b, TRY_LEAVE, TryCatch #12 {all -> 0x011b, blocks: (B:69:0x010a, B:72:0x0110, B:74:0x0113, B:78:0x011f, B:80:0x0125, B:82:0x012b, B:84:0x0133, B:86:0x0137, B:87:0x013d, B:89:0x0141), top: B:126:0x010a }] */
                    /* JADX WARN: Instruction removed from duplicated block: B:89:0x0141, please report this as an issue */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v13, types: [com.mbridge.msdk.foundation.download.download.H5DownLoadManager$IOnDownLoadH5Source] */
                    /* JADX WARN: Type inference failed for: r6v0 */
                    /* JADX WARN: Type inference failed for: r6v13 */
                    /* JADX WARN: Type inference failed for: r6v14, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v15 */
                    /* JADX WARN: Type inference failed for: r6v17 */
                    /* JADX WARN: Type inference failed for: r6v18 */
                    /* JADX WARN: Type inference failed for: r6v19 */
                    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v20 */
                    /* JADX WARN: Type inference failed for: r6v21 */
                    /* JADX WARN: Type inference failed for: r6v22 */
                    /* JADX WARN: Type inference failed for: r6v23 */
                    /* JADX WARN: Type inference failed for: r6v24 */
                    /* JADX WARN: Type inference failed for: r6v3 */
                    /* JADX WARN: Type inference failed for: r6v4 */
                    /* JADX WARN: Type inference failed for: r6v5 */
                    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v7 */
                    /* JADX WARN: Type inference failed for: r7v17 */
                    /* JADX WARN: Type inference failed for: r7v18 */
                    /* JADX WARN: Type inference failed for: r7v19 */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void runTask() throws Throwable {
                        ?? r10;
                        InputStream inputStream;
                        byte[] bArr;
                        Object obj;
                        ?? r11;
                        InputStream inputStream2;
                        ?? r12;
                        Object obj2;
                        Exception e10;
                        String message;
                        byte[] byteArray;
                        ?? r13;
                        ?? r14;
                        H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source2;
                        String str2;
                        boolean z11;
                        String str3;
                        InputStream inputStream3 = null;
                        boolean z12 = false;
                        try {
                            H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source3 = iOnDownLoadH5Source;
                            if (iOnDownLoadH5Source3 != null) {
                                iOnDownLoadH5Source3.onStart();
                            }
                            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                            httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(str));
                            httpsURLConnection.setReadTimeout(30000);
                            httpsURLConnection.setConnectTimeout(20000);
                            int responseCode = httpsURLConnection.getResponseCode();
                            q0.a(DownLoadUtils.TAG, "response code " + responseCode);
                            try {
                                try {
                                    if (responseCode == 200) {
                                        inputStream2 = httpsURLConnection.getInputStream();
                                        try {
                                            byte[] bArr2 = new byte[6144];
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            while (true) {
                                                try {
                                                    try {
                                                        int i10 = inputStream2.read(bArr2);
                                                        if (i10 == -1) {
                                                            break;
                                                        } else {
                                                            byteArrayOutputStream.write(bArr2, 0, i10);
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        r11 = byteArrayOutputStream;
                                                        if (inputStream2 != null) {
                                                            try {
                                                                inputStream2.close();
                                                                if (r11 != 0) {
                                                                    r11.close();
                                                                }
                                                            } catch (Exception e11) {
                                                                e11.printStackTrace();
                                                                e11.getMessage();
                                                                throw th;
                                                            }
                                                        } else if (r11 != 0) {
                                                            r11.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception e12) {
                                                    e10 = e12;
                                                    bArr = null;
                                                }
                                                obj2 = null;
                                                r12 = byteArrayOutputStream;
                                                message = e10.getMessage();
                                                q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e10.getLocalizedMessage());
                                                if (inputStream2 != null) {
                                                    try {
                                                        inputStream2.close();
                                                        if (r12 != 0) {
                                                            r12.close();
                                                        }
                                                    } catch (Exception e13) {
                                                        e13.printStackTrace();
                                                        message = e13.getMessage();
                                                    }
                                                } else if (r12 != 0) {
                                                    r12.close();
                                                }
                                                byteArray = bArr;
                                                r14 = obj2;
                                                if (z12) {
                                                    try {
                                                        if (!z10 && byteArray != null && byteArray.length > 0) {
                                                            iOnDownLoadH5Source.onSuccess(null, byteArray, str);
                                                        } else if (z12 || !a1.b(r14) || r14.length() <= 0 || !r14.contains(DownLoadUtils.END_TAG)) {
                                                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                            if (iOnDownLoadH5Source2 != null) {
                                                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                            }
                                                        } else {
                                                            ?? r0 = iOnDownLoadH5Source;
                                                            if (r0 != 0) {
                                                                r0.onSuccess(r14, byteArray, str);
                                                            }
                                                        }
                                                    } catch (Throwable th3) {
                                                        if (MBridgeConstans.DEBUG) {
                                                            th3.printStackTrace();
                                                        }
                                                        H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source4 = iOnDownLoadH5Source;
                                                        if (iOnDownLoadH5Source4 != null) {
                                                            try {
                                                                iOnDownLoadH5Source4.onFailed(th3.getMessage());
                                                                return;
                                                            } catch (Exception e14) {
                                                                e14.printStackTrace();
                                                                return;
                                                            }
                                                        }
                                                        return;
                                                    }
                                                } else if (z12) {
                                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                    if (iOnDownLoadH5Source2 != null) {
                                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                    }
                                                } else {
                                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                    if (iOnDownLoadH5Source2 != null) {
                                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                    }
                                                }
                                            }
                                            if (byteArrayOutputStream.toByteArray() != null) {
                                                byteArray = byteArrayOutputStream.toByteArray();
                                                try {
                                                    str3 = !z10 ? new String(byteArray) : null;
                                                } catch (Exception e15) {
                                                    bArr = byteArray;
                                                    e10 = e15;
                                                    obj2 = null;
                                                    r12 = byteArrayOutputStream;
                                                    message = e10.getMessage();
                                                    q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e10.getLocalizedMessage());
                                                    if (inputStream2 != null) {
                                                        inputStream2.close();
                                                        if (r12 != 0) {
                                                            r12.close();
                                                        }
                                                    } else if (r12 != 0) {
                                                        r12.close();
                                                    }
                                                    byteArray = bArr;
                                                    r14 = obj2;
                                                }
                                            } else {
                                                byteArray = null;
                                                str3 = null;
                                            }
                                            message = "";
                                            z11 = true;
                                            r12 = byteArrayOutputStream;
                                            str2 = str3;
                                        } catch (Exception e16) {
                                            inputStream = inputStream2;
                                            e = e16;
                                            bArr = null;
                                            byte[] bArr3 = bArr;
                                            obj = bArr3;
                                            r13 = bArr3;
                                            InputStream inputStream4 = inputStream;
                                            e10 = e;
                                            inputStream2 = inputStream4;
                                            r12 = r13;
                                            obj2 = obj;
                                            message = e10.getMessage();
                                            q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e10.getLocalizedMessage());
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                                if (r12 != 0) {
                                                    r12.close();
                                                }
                                            } else if (r12 != 0) {
                                                r12.close();
                                            }
                                            byteArray = bArr;
                                            r14 = obj2;
                                            if (z12) {
                                                if (!z10) {
                                                    if (z12) {
                                                        iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                        if (iOnDownLoadH5Source2 != null) {
                                                            iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                        }
                                                    } else {
                                                        iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                        if (iOnDownLoadH5Source2 != null) {
                                                            iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                        }
                                                    }
                                                } else if (z12) {
                                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                    if (iOnDownLoadH5Source2 != null) {
                                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                    }
                                                } else {
                                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                    if (iOnDownLoadH5Source2 != null) {
                                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                    }
                                                }
                                            } else if (z12) {
                                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                if (iOnDownLoadH5Source2 != null) {
                                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                }
                                            } else {
                                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                if (iOnDownLoadH5Source2 != null) {
                                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            r12 = 0;
                                            inputStream3 = inputStream2;
                                            r10 = r12;
                                            inputStream2 = inputStream3;
                                            r11 = r10;
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                                if (r11 != 0) {
                                                    r11.close();
                                                }
                                            } else if (r11 != 0) {
                                                r11.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        message = "responseCode is " + responseCode;
                                        inputStream2 = null;
                                        byteArray = null;
                                        r12 = 0;
                                        str2 = null;
                                        z11 = false;
                                    }
                                    httpsURLConnection.disconnect();
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (Exception e17) {
                                            e17.printStackTrace();
                                            message = e17.getMessage();
                                            r14 = str2;
                                        }
                                    }
                                    if (r12 != 0) {
                                        r12.close();
                                    }
                                    z12 = z11;
                                    r14 = str2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStream3 = inputStream2;
                                    r10 = r12;
                                    inputStream2 = inputStream3;
                                    r11 = r10;
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                        if (r11 != 0) {
                                            r11.close();
                                        }
                                    } else if (r11 != 0) {
                                        r11.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e18) {
                                byte[] bArr4 = byteArray;
                                inputStream = inputStream2;
                                e = e18;
                                bArr = bArr4;
                                r13 = r12;
                                obj = str2;
                                InputStream inputStream5 = inputStream;
                                e10 = e;
                                inputStream2 = inputStream5;
                                r12 = r13;
                                obj2 = obj;
                                message = e10.getMessage();
                                q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e10.getLocalizedMessage());
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                    if (r12 != 0) {
                                        r12.close();
                                    }
                                } else if (r12 != 0) {
                                    r12.close();
                                }
                                byteArray = bArr;
                                r14 = obj2;
                            }
                        } catch (Exception e19) {
                            e = e19;
                            inputStream = null;
                            bArr = null;
                        } catch (Throwable th6) {
                            th = th6;
                            r10 = 0;
                            inputStream2 = inputStream3;
                            r11 = r10;
                            if (inputStream2 != null) {
                                inputStream2.close();
                                if (r11 != 0) {
                                    r11.close();
                                }
                            } else if (r11 != 0) {
                                r11.close();
                            }
                            throw th;
                        }
                        if (z12) {
                            if (!z10) {
                                if (z12) {
                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                    if (iOnDownLoadH5Source2 != null) {
                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                    }
                                } else {
                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                    if (iOnDownLoadH5Source2 != null) {
                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                    }
                                }
                            } else if (z12) {
                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                if (iOnDownLoadH5Source2 != null) {
                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                }
                            } else {
                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                if (iOnDownLoadH5Source2 != null) {
                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                }
                            }
                        } else if (z12) {
                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                            if (iOnDownLoadH5Source2 != null) {
                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                            }
                        } else {
                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                            if (iOnDownLoadH5Source2 != null) {
                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                            }
                        }
                    }

                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void cancelTask() {
                    }

                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void pauseTask(boolean z11) {
                    }
                });
                return;
            }
            if (iOnDownLoadH5Source != null) {
                iOnDownLoadH5Source.onFailed("url is error");
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }
}
