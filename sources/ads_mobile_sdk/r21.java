package ads_mobile_sdk;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class r21 {
    public static final byte[] a;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static void a(Object obj) {
        obj.getClass();
    }
}
