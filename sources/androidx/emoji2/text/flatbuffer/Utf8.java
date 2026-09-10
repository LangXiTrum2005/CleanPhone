package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class Utf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Utf8Safe f5019a;

    public static class DecodeUtil {
        public static boolean a(byte b2) {
            return b2 > -65;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
    }
}
