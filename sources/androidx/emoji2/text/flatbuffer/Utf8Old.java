package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class Utf8Old extends Utf8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5020b = 0;

    public static class Cache {
    }

    static {
        final a aVar = new a();
        new ThreadLocal() { // from class: androidx.emoji2.text.flatbuffer.b
            @Override // java.lang.ThreadLocal
            public final /* synthetic */ Object initialValue() {
                return aVar.get();
            }
        };
    }
}
