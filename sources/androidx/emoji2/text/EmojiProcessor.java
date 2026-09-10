package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.core.graphics.PaintCompat;
import androidx.emoji2.text.flatbuffer.MetadataItem;

/* JADX INFO: loaded from: classes.dex */
final class EmojiProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetadataRepo f4981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EmojiCompat.GlyphChecker f4982b;

    public static final class CodepointIndexFinder {
    }

    public static final class ProcessorSm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4983a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MetadataRepo.Node f4984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public MetadataRepo.Node f4985c;
        public MetadataRepo.Node d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4986e;
        public int f;

        public ProcessorSm(MetadataRepo.Node node) {
            this.f4984b = node;
            this.f4985c = node;
        }

        public final int a(int i2) {
            SparseArray sparseArray = this.f4985c.f4998a;
            MetadataRepo.Node node = sparseArray == null ? null : (MetadataRepo.Node) sparseArray.get(i2);
            int i3 = 1;
            int i4 = 2;
            if (this.f4983a == 2) {
                if (node != null) {
                    this.f4985c = node;
                    this.f++;
                } else if (i2 == 65038) {
                    b();
                } else if (i2 != 65039) {
                    MetadataRepo.Node node2 = this.f4985c;
                    if (node2.f4999b != null) {
                        i4 = 3;
                        if (this.f != 1) {
                            this.d = node2;
                            b();
                        } else if (c()) {
                            this.d = this.f4985c;
                            b();
                        } else {
                            b();
                        }
                    } else {
                        b();
                    }
                }
                i3 = i4;
            } else if (node == null) {
                b();
            } else {
                this.f4983a = 2;
                this.f4985c = node;
                this.f = 1;
                i3 = i4;
            }
            this.f4986e = i2;
            return i3;
        }

        public final void b() {
            this.f4983a = 1;
            this.f4985c = this.f4984b;
            this.f = 0;
        }

        public final boolean c() {
            MetadataItem metadataItemB = this.f4985c.f4999b.b();
            int iA = metadataItemB.a(6);
            return !(iA == 0 || metadataItemB.f5017b.get(iA + metadataItemB.f5016a) == 0) || this.f4986e == 65039;
        }
    }

    public EmojiProcessor(MetadataRepo metadataRepo, EmojiCompat.SpanFactory spanFactory, EmojiCompat.GlyphChecker glyphChecker) {
        this.f4981a = metadataRepo;
        this.f4982b = glyphChecker;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z2) {
        EmojiSpan[] emojiSpanArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i2, int i3, EmojiMetadata emojiMetadata) {
        if (emojiMetadata.f4980c == 0) {
            EmojiCompat.GlyphChecker glyphChecker = this.f4982b;
            MetadataItem metadataItemB = emojiMetadata.b();
            int iA = metadataItemB.a(8);
            if (iA != 0) {
                metadataItemB.f5017b.getShort(iA + metadataItemB.f5016a);
            }
            DefaultGlyphChecker defaultGlyphChecker = (DefaultGlyphChecker) glyphChecker;
            defaultGlyphChecker.getClass();
            ThreadLocal threadLocal = DefaultGlyphChecker.f4959b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            emojiMetadata.f4980c = PaintCompat.a(defaultGlyphChecker.f4960a, sb.toString()) ? 2 : 1;
        }
        return emojiMetadata.f4980c == 2;
    }
}
