package kotlinx.serialization.json.internal;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: AbstractJsonLexer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/serialization/json/internal/impassible;", "", "<init>", "()V", "", "beachfront", "marial", "", "c", "", "esc", "saneness", "(IC)V", "attabal", "(CC)V", "", "cl", "wireman", "(IB)V", "dern", "(CB)V", "", "[C", "ESCAPE_2_CHAR", "", "[B", "CHAR_TO_TOKEN", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final impassible f32510attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final byte[] CHAR_TO_TOKEN;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final char[] ESCAPE_2_CHAR;

    static {
        impassible impassibleVar = new impassible();
        f32510attabal = impassibleVar;
        ESCAPE_2_CHAR = new char[117];
        CHAR_TO_TOKEN = new byte[126];
        impassibleVar.beachfront();
        impassibleVar.marial();
    }

    public final void attabal(char c, char esc) {
        saneness(c, esc);
    }

    public final void beachfront() {
        for (int i = 0; i < 32; i++) {
            saneness(i, 'u');
        }
        saneness(8, 'b');
        saneness(9, 't');
        saneness(10, 'n');
        saneness(12, 'f');
        saneness(13, 'r');
        attabal('/', '/');
        attabal('\"', '\"');
        attabal('\\', '\\');
    }

    public final void dern(char c, byte cl) {
        wireman(c, cl);
    }

    public final void marial() {
        for (int i = 0; i < 33; i++) {
            wireman(i, (byte) 127);
        }
        wireman(9, (byte) 3);
        wireman(10, (byte) 3);
        wireman(13, (byte) 3);
        wireman(32, (byte) 3);
        dern(',', (byte) 4);
        dern(':', (byte) 5);
        dern('{', (byte) 6);
        dern('}', (byte) 7);
        dern('[', (byte) 8);
        dern(']', (byte) 9);
        dern('\"', (byte) 1);
        dern('\\', (byte) 2);
    }

    public final void saneness(int c, char esc) {
        if (esc != 'u') {
            ESCAPE_2_CHAR[esc] = (char) c;
        }
    }

    public final void wireman(int c, byte cl) {
        CHAR_TO_TOKEN[c] = cl;
    }
}
