package petrol;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.gson.Gson;
import com.yolo.networklibrary.common.model.HttpConfigModel;
import com.yolo.networklibrary.common.model.HttpYoloConfigModel;
import com.yolo.networklibrary.common.util.cutely;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.CharsKt;
import p002kotlin.text.Charsets;
import regie.saneness;

/* JADX INFO: compiled from: RepositoryCipherManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000eJ)\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u000eJ!\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 JC\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b!\u0010\"JC\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010\u0014J\u0019\u0010&\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\u0014¨\u0006'"}, d2 = {"Lpetrol/attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "initVector", "value", "", "cutely", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)[B", "encrypted", "impromptu", "(Landroid/content/Context;Ljava/lang/String;[B)Ljava/lang/String;", "taiyuan", "apical", "triweekly", "()Ljava/lang/String;", "formularize", "(Landroid/content/Context;)[B", "impassible", "rawByteArray", "competently", "(Landroid/content/Context;[B)[B", "type", "marial", "assertName", "Lcom/yolo/networklibrary/common/model/HttpYoloConfigModel;", "monoploid", "(Landroid/content/Context;Ljava/lang/String;)Lcom/yolo/networklibrary/common/model/HttpYoloConfigModel;", "arytenoidectomy", "(Landroid/content/Context;Ljava/lang/String;)[B", "attabal", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[B[B)Ljava/lang/String;", "dern", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)[B", "polloi", "kowloon", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f35179attabal = new attabal();

    public static /* synthetic */ String beachfront(attabal attabalVar, Context context, String str, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bArr = null;
        }
        return attabalVar.marial(context, str, bArr);
    }

    public static /* synthetic */ String saneness(attabal attabalVar, Context context, String str, String str2, byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            bArr2 = null;
        }
        return attabalVar.attabal(context, str, str2, bArr, bArr2);
    }

    public static /* synthetic */ byte[] wireman(attabal attabalVar, Context context, String str, String str2, String str3, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            bArr = null;
        }
        return attabalVar.dern(context, str, str2, str3, bArr);
    }

    public final byte[] apical(Context context, String initVector, String value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        return wireman(this, context, "http_common", initVector, value, null, 16, null);
    }

    public final byte[] arytenoidectomy(Context context, String assertName) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assertName, "assertName");
        InputStream inputStreamOpen = context.getResources().getAssets().open(assertName);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.resources.assets.open(assertName)");
        byte[] bArr = new byte[inputStreamOpen.available()];
        inputStreamOpen.read(bArr);
        inputStreamOpen.close();
        return bArr;
    }

    public final String attabal(Context context, String type, String initVector, byte[] encrypted, byte[] rawByteArray) {
        byte[] bArrCompetently;
        byte[] bytes;
        try {
            if (Intrinsics.wireman(type, "http_business")) {
                bArrCompetently = formularize(context);
            } else if (Intrinsics.wireman(type, "http_common")) {
                bArrCompetently = impassible(context);
            } else {
                if (rawByteArray == null) {
                    return null;
                }
                bArrCompetently = competently(context, rawByteArray);
            }
            if (bArrCompetently == null) {
                return null;
            }
            if (initVector != null) {
                bytes = initVector.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            } else {
                bytes = null;
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrCompetently, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            byte[] original = cipher.doFinal(encrypted);
            Intrinsics.checkNotNullExpressionValue(original, "original");
            return new String(original, Charsets.UTF_8);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final byte[] competently(Context context, byte[] rawByteArray) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rawByteArray, "rawByteArray");
        String strMarial = marial(context, null, rawByteArray);
        if (strMarial == null) {
            return null;
        }
        byte[] bytes = strMarial.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public final byte[] cutely(Context context, String initVector, String value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        return wireman(this, context, "http_business", initVector, value, null, 16, null);
    }

    public final byte[] dern(Context context, String type, String initVector, String value, byte[] rawByteArray) {
        byte[] bArrCompetently;
        byte[] bytes;
        try {
            if (Intrinsics.wireman(type, "http_business")) {
                bArrCompetently = formularize(context);
            } else if (Intrinsics.wireman(type, "http_common")) {
                bArrCompetently = impassible(context);
            } else {
                if (rawByteArray == null) {
                    return null;
                }
                bArrCompetently = competently(context, rawByteArray);
            }
            if (bArrCompetently == null) {
                return null;
            }
            if (initVector != null) {
                bytes = initVector.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            } else {
                bytes = null;
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrCompetently, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            byte[] bytes2 = value.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            return cipher.doFinal(bytes2);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final byte[] formularize(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strBeachfront = beachfront(this, context, "http_business", null, 4, null);
        if (strBeachfront == null) {
            return null;
        }
        byte[] bytes = strBeachfront.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public final byte[] impassible(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strBeachfront = beachfront(this, context, "http_common", null, 4, null);
        if (strBeachfront == null) {
            return null;
        }
        byte[] bytes = strBeachfront.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public final String impromptu(Context context, String initVector, byte[] encrypted) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(encrypted, "encrypted");
        return saneness(this, context, "http_business", initVector, encrypted, null, 16, null);
    }

    public final byte[] kowloon(Context context) {
        HttpConfigModel httpConfigModel = revolt.attabal.f36720attabal.taiyuan().get("http_common");
        if (httpConfigModel != null) {
            return httpConfigModel.getRawXTokenByteArray();
        }
        return null;
    }

    public final String marial(Context context, String type, byte[] rawByteArray) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.wireman(type, "http_business")) {
            rawByteArray = polloi(context);
            if (rawByteArray == null) {
                return null;
            }
        } else if (Intrinsics.wireman(type, "http_common")) {
            rawByteArray = kowloon(context);
            if (rawByteArray == null) {
                return null;
            }
        } else if (rawByteArray == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = rawByteArray.length - (rawByteArray.length % 4);
        for (int i = 0; i < length; i += 4) {
            byte b = rawByteArray[i];
            byte b2 = rawByteArray[i + 1];
            byte b3 = rawByteArray[i + 2];
            byte b4 = (byte) (rawByteArray[i + 3] & 1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Byte.valueOf((byte) (b & 1)));
            sb2.append(Byte.valueOf((byte) (b2 & 1)));
            sb2.append(Byte.valueOf((byte) (b3 & 1)));
            sb2.append(Byte.valueOf(b4));
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "binaryStr.toString()");
            sb.append(Integer.toString(Integer.parseInt(string, CharsKt.checkRadix(2)), 16));
        }
        return saneness.attabal(sb.toString());
    }

    public final HttpYoloConfigModel monoploid(Context context, String assertName) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        AssetManager assets = context.getResources().getAssets();
        if (assertName == null) {
            assertName = "http_yolo_config.json";
        }
        InputStream inputStreamOpen = assets.open(assertName);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.resources.assets…er.HTTP_YOLO_CONFIG_JSON)");
        int iAvailable = inputStreamOpen.available();
        if (iAvailable <= 0) {
            throw new IllegalStateException("未配置 http_yolo_config.json");
        }
        byte[] bArr = new byte[iAvailable];
        inputStreamOpen.read(bArr);
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        Object objFromJson = new Gson().fromJson(new String(bArr, UTF_8), (Class<Object>) HttpYoloConfigModel.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "Gson().fromJson<HttpYolo…oConfigModel::class.java)");
        return (HttpYoloConfigModel) objFromJson;
    }

    public final byte[] polloi(Context context) {
        HttpConfigModel httpConfigModel = revolt.attabal.f36720attabal.taiyuan().get("http_business");
        if (httpConfigModel != null) {
            return httpConfigModel.getRawXTokenByteArray();
        }
        return null;
    }

    public final String taiyuan(Context context, String initVector, byte[] encrypted) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(encrypted, "encrypted");
        return saneness(this, context, "http_common", initVector, encrypted, null, 16, null);
    }

    public final String triweekly() {
        String strWireman = cutely.wireman(16);
        Intrinsics.checkNotNullExpressionValue(strWireman, "randomAlphanumeric(16)");
        return strWireman;
    }
}
