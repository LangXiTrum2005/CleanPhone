package kotlin.reflect.jvm.internal.impl.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class Internal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f44216a;

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends EnumLite> {
    }

    static {
        byte[] bArr = new byte[0];
        f44216a = bArr;
        ByteBuffer.wrap(bArr);
    }
}
