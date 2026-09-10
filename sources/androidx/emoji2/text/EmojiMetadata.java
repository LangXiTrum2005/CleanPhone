package androidx.emoji2.text;

import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class EmojiMetadata {
    public static final ThreadLocal d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MetadataRepo f4979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f4980c = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HasGlyph {
    }

    public EmojiMetadata(MetadataRepo metadataRepo, int i2) {
        this.f4979b = metadataRepo;
        this.f4978a = i2;
    }

    public final int a(int i2) {
        MetadataItem metadataItemB = b();
        int iA = metadataItemB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = metadataItemB.f5017b;
        int i3 = iA + metadataItemB.f5016a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    public final MetadataItem b() {
        ThreadLocal threadLocal = d;
        MetadataItem metadataItem = (MetadataItem) threadLocal.get();
        if (metadataItem == null) {
            metadataItem = new MetadataItem();
            threadLocal.set(metadataItem);
        }
        MetadataList metadataList = this.f4979b.f4995a;
        int iA = metadataList.a(6);
        if (iA != 0) {
            int i2 = iA + metadataList.f5016a;
            int i3 = (this.f4978a * 4) + metadataList.f5017b.getInt(i2) + i2 + 4;
            int i4 = metadataList.f5017b.getInt(i3) + i3;
            ByteBuffer byteBuffer = metadataList.f5017b;
            metadataItem.f5017b = byteBuffer;
            if (byteBuffer != null) {
                metadataItem.f5016a = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                metadataItem.f5018c = i5;
                metadataItem.d = metadataItem.f5017b.getShort(i5);
                return metadataItem;
            }
            metadataItem.f5016a = 0;
            metadataItem.f5018c = 0;
            metadataItem.d = 0;
        }
        return metadataItem;
    }

    public final String toString() {
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        MetadataItem metadataItemB = b();
        int iA = metadataItemB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? metadataItemB.f5017b.getInt(iA + metadataItemB.f5016a) : 0));
        sb.append(", codepoints:");
        MetadataItem metadataItemB2 = b();
        int iA2 = metadataItemB2.a(16);
        if (iA2 != 0) {
            int i3 = iA2 + metadataItemB2.f5016a;
            i2 = metadataItemB2.f5017b.getInt(metadataItemB2.f5017b.getInt(i3) + i3);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(Integer.toHexString(a(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
