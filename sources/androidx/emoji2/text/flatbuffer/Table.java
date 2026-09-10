package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class Table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f5017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5018c;
    public int d;

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.Table$1, reason: invalid class name */
    class AnonymousClass1 implements Comparator<Integer> {
        @Override // java.util.Comparator
        public final int compare(Integer num, Integer num2) {
            throw null;
        }
    }

    public Table() {
        if (Utf8.f5019a == null) {
            Utf8.f5019a = new Utf8Safe();
        }
    }

    public final int a(int i2) {
        if (i2 < this.d) {
            return this.f5017b.getShort(this.f5018c + i2);
        }
        return 0;
    }
}
