package okio;

import kotlin.Metadata;

/* JADX INFO: renamed from: okio.-Base64, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Base64 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f45128a;

    static {
        ByteString byteString = ByteString.e0;
        f45128a = ByteString.Companion.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").data;
        ByteString.Companion.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }
}
