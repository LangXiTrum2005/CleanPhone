package androidx.compose.ui.platform;

import com.ironsource.D1;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccessibilityIterators.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0004¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\bR\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/attabal;", "Landroidx/compose/ui/platform/beachfront;", "<init>", "()V", "", "text", "", "marial", "(Ljava/lang/String;)V", "", "start", TtmlNode.END, "", "dern", "(II)[I", "attabal", "Ljava/lang/String;", "wireman", "()Ljava/lang/String;", "beachfront", "saneness", "[I", D1.i, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class attabal implements beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public String text;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int[] segment = new int[2];

    public final void beachfront(String str) {
        this.text = str;
    }

    public final int[] dern(int start, int end) {
        if (start < 0 || end < 0 || start == end) {
            return null;
        }
        int[] iArr = this.segment;
        iArr[0] = start;
        iArr[1] = end;
        return iArr;
    }

    public void marial(String text) {
        beachfront(text);
    }

    public final String wireman() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        Intrinsics.preprohormone("text");
        return null;
    }
}
