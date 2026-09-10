package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;

/* JADX INFO: loaded from: classes.dex */
public final class MetadataRepo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetadataList f4995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f4996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Node f4997c = new Node(1024);
    public final Typeface d;

    public static class Node {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray f4998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public EmojiMetadata f4999b;

        public Node(int i2) {
            this.f4998a = new SparseArray(i2);
        }

        public final void a(EmojiMetadata emojiMetadata, int i2, int i3) {
            int iA = emojiMetadata.a(i2);
            SparseArray sparseArray = this.f4998a;
            Node node = sparseArray == null ? null : (Node) sparseArray.get(iA);
            if (node == null) {
                node = new Node(1);
                sparseArray.put(emojiMetadata.a(i2), node);
            }
            if (i3 > i2) {
                node.a(emojiMetadata, i2 + 1, i3);
            } else {
                node.f4999b = emojiMetadata;
            }
        }
    }

    public MetadataRepo(Typeface typeface, MetadataList metadataList) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.d = typeface;
        this.f4995a = metadataList;
        int iA = metadataList.a(6);
        if (iA != 0) {
            int i6 = iA + metadataList.f5016a;
            i2 = metadataList.f5017b.getInt(metadataList.f5017b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        this.f4996b = new char[i2 * 2];
        int iA2 = metadataList.a(6);
        if (iA2 != 0) {
            int i7 = iA2 + metadataList.f5016a;
            i3 = metadataList.f5017b.getInt(metadataList.f5017b.getInt(i7) + i7);
        } else {
            i3 = 0;
        }
        for (int i8 = 0; i8 < i3; i8++) {
            EmojiMetadata emojiMetadata = new EmojiMetadata(this, i8);
            MetadataItem metadataItemB = emojiMetadata.b();
            int iA3 = metadataItemB.a(4);
            Character.toChars(iA3 != 0 ? metadataItemB.f5017b.getInt(iA3 + metadataItemB.f5016a) : 0, this.f4996b, i8 * 2);
            MetadataItem metadataItemB2 = emojiMetadata.b();
            int iA4 = metadataItemB2.a(16);
            if (iA4 != 0) {
                int i9 = iA4 + metadataItemB2.f5016a;
                i4 = metadataItemB2.f5017b.getInt(metadataItemB2.f5017b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            Preconditions.a("invalid metadata codepoint length", i4 > 0);
            MetadataItem metadataItemB3 = emojiMetadata.b();
            int iA5 = metadataItemB3.a(16);
            if (iA5 != 0) {
                int i10 = iA5 + metadataItemB3.f5016a;
                i5 = metadataItemB3.f5017b.getInt(metadataItemB3.f5017b.getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            this.f4997c.a(emojiMetadata, 0, i5 - 1);
        }
    }
}
