package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f31914a;

    public j(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f31914a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, Object obj2) {
        try {
            if (com.mbridge.msdk.config.component.common.util.c.c("870").equals(str)) {
                return a(obj2);
            }
            if (com.mbridge.msdk.config.component.common.util.c.c("901").equals(str)) {
                return b(obj2);
            }
            File file = new File(String.valueOf(obj));
            if (!file.exists()) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            if (!com.mbridge.msdk.config.component.common.util.c.c("871").equals(str) && !com.mbridge.msdk.config.component.common.util.c.c("872").equals(str)) {
                if (com.mbridge.msdk.config.component.common.util.c.c("873").equals(str)) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Long.valueOf(file.length()));
                }
                if (com.mbridge.msdk.config.component.common.util.c.c("874").equals(str)) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(file));
                }
                q0.b("OperatorFile", "Unknown file operation: " + str);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Long.valueOf(file.lastModified()));
        } catch (Exception e10) {
            StringBuilder sbK = d5.u.k("Error handling file operation: ", str, ", ");
            sbK.append(e10.getMessage());
            q0.b("OperatorFile", sbK.toString(), e10);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, Object obj2) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        return a(str) ? b(str, obj, obj2) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj) {
        String strValueOf;
        int i10;
        String strG;
        int i11 = 0;
        if (obj instanceof List) {
            List list = (List) obj;
            String strValueOf2 = String.valueOf(list.get(0));
            if (list.size() > 1) {
                strValueOf = String.valueOf(list.get(1));
            } else {
                strValueOf = "1";
            }
            if (!TextUtils.isEmpty(strValueOf2) && !strValueOf2.equalsIgnoreCase("null")) {
                if (TextUtils.isEmpty(strValueOf) || strValueOf.equalsIgnoreCase("null")) {
                    i10 = 1;
                } else {
                    try {
                        i10 = Integer.parseInt(strValueOf);
                    } catch (Throwable unused) {
                        i10 = 1;
                    }
                }
                if (i10 == 1) {
                    strG = com.mbridge.msdk.config.component.common.file.a.c(strValueOf2);
                } else {
                    strG = com.mbridge.msdk.config.component.common.file.a.g(strValueOf2);
                }
                i11 = !TextUtils.isEmpty(strG) ? 1 : 0;
            } else {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(i11));
    }

    private String a(File file) {
        int i10;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            byte[] bArr = new byte[Segment.SIZE];
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int i11 = fileInputStream.read(bArr);
                if (i11 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i11);
            }
            fileInputStream.close();
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(Integer.toString((b10 & 255) + NotificationCompat.FLAG_LOCAL_ONLY, 16).substring(1));
            }
            return sb2.toString();
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("Calculate MD5 error: "), "OperatorFile");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj) {
        String strG;
        String strValueOf;
        int i10;
        if (obj instanceof List) {
            List list = (List) obj;
            String strValueOf2 = String.valueOf(list.get(0));
            if (list.size() > 1) {
                strValueOf = String.valueOf(list.get(1));
            } else {
                strValueOf = "1";
            }
            if (!TextUtils.isEmpty(strValueOf2) && !strValueOf2.equalsIgnoreCase("null")) {
                if (TextUtils.isEmpty(strValueOf) || strValueOf.equalsIgnoreCase("null")) {
                    i10 = 1;
                } else {
                    try {
                        i10 = Integer.parseInt(strValueOf);
                    } catch (Throwable unused) {
                        i10 = 1;
                    }
                }
                if (i10 == 1) {
                    String strConcat = "template".concat("/").concat(strValueOf2);
                    if (com.mbridge.msdk.config.component.common.file.a.j(strConcat)) {
                        strG = "assets://".concat(strConcat);
                    } else {
                        strG = "";
                    }
                } else {
                    strG = com.mbridge.msdk.config.component.common.file.a.g(strValueOf2);
                }
            } else {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
        } else {
            strG = "";
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(TextUtils.isEmpty(strG) ? "" : strG);
    }

    private boolean a(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("870")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("871")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("872")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("873")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("874")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("901"));
    }
}
