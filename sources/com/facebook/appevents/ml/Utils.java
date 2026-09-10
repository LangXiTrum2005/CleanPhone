package com.facebook.appevents.ml;

import an.h;
import android.text.TextUtils;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import j1.f;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import org.json.JSONArray;
import org.json.JSONObject;
import v7.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u001e\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/ml/Utils;", "", "()V", "DIR_NAME", "", "getMlDir", "Ljava/io/File;", "normalizeString", "str", "parseModelWeights", "", "Lcom/facebook/appevents/ml/MTensor;", X3.i.f27782b, "vectorize", "", "texts", "maxLen", "", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Utils {
    private static final String DIR_NAME = "facebook_ml/";
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public static final File getMlDir() {
        if (a.b(Utils.class)) {
            return null;
        }
        try {
            File file = new File(s.b().getFilesDir(), DIR_NAME);
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th2) {
            a.a(Utils.class, th2);
            return null;
        }
    }

    public static final Map<String, MTensor> parseModelWeights(File file) {
        Map<String, MTensor> map;
        if (!a.b(Utils.class)) {
            try {
                n.f(file, "file");
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    int iAvailable = fileInputStream.available();
                    DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                    byte[] bArr = new byte[iAvailable];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    if (iAvailable >= 4) {
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                        int i10 = byteBufferWrap.getInt();
                        int i11 = i10 + 4;
                        if (iAvailable >= i11) {
                            JSONObject jSONObject = new JSONObject(new String(bArr, 4, i10, an.a.f3768a));
                            JSONArray jSONArrayNames = jSONObject.names();
                            int length = jSONArrayNames.length();
                            String[] strArr = new String[length];
                            for (int i12 = 0; i12 < length; i12++) {
                                strArr[i12] = jSONArrayNames.getString(i12);
                            }
                            int i13 = 1;
                            if (length > 1) {
                                Arrays.sort(strArr);
                            }
                            HashMap map2 = new HashMap();
                            int i14 = 0;
                            while (i14 < length) {
                                String str = strArr[i14];
                                if (str != null) {
                                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                                    int length2 = jSONArray.length();
                                    int[] iArr = new int[length2];
                                    map = null;
                                    for (int i15 = 0; i15 < length2; i15++) {
                                        try {
                                            int i16 = jSONArray.getInt(i15);
                                            iArr[i15] = i16;
                                            i13 *= i16;
                                        } catch (Exception unused) {
                                            return null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            a.a(Utils.class, th);
                                            return map;
                                        }
                                    }
                                    int i17 = i13 * 4;
                                    int i18 = i11 + i17;
                                    if (i18 > iAvailable) {
                                        return null;
                                    }
                                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i11, i17);
                                    byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                                    MTensor mTensor = new MTensor(iArr);
                                    byteBufferWrap2.asFloatBuffer().get(mTensor.getData(), 0, i13);
                                    map2.put(str, mTensor);
                                    i11 = i18;
                                }
                                i14++;
                                i13 = 1;
                            }
                            return map2;
                        }
                    }
                } catch (Exception unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
                map = null;
            }
        }
        return null;
    }

    public final String normalizeString(String str) {
        List listC;
        if (a.b(this)) {
            return null;
        }
        try {
            n.f(str, "str");
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = n.h(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            String input = str.subSequence(i10, length + 1).toString();
            Pattern patternCompile = Pattern.compile("\\s+");
            n.e(patternCompile, "compile(...)");
            n.f(input, "input");
            h.G0(0);
            Matcher matcher = patternCompile.matcher(input);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(input.subSequence(iEnd, input.length()).toString());
                listC = arrayList;
            } else {
                listC = f.C(input.toString());
            }
            String strJoin = TextUtils.join(" ", (String[]) listC.toArray(new String[0]));
            n.e(strJoin, "join(\" \", strArray)");
            return strJoin;
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    public final int[] vectorize(String texts, int maxLen) {
        if (a.b(this)) {
            return null;
        }
        try {
            n.f(texts, "texts");
            int[] iArr = new int[maxLen];
            String strNormalizeString = normalizeString(texts);
            Charset charsetForName = Charset.forName("UTF-8");
            n.e(charsetForName, "forName(\"UTF-8\")");
            byte[] bytes = strNormalizeString.getBytes(charsetForName);
            n.e(bytes, "this as java.lang.String).getBytes(charset)");
            for (int i10 = 0; i10 < maxLen; i10++) {
                if (i10 < bytes.length) {
                    iArr[i10] = bytes[i10] & 255;
                } else {
                    iArr[i10] = 0;
                }
            }
            return iArr;
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }
}
