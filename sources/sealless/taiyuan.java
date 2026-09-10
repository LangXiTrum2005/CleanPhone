package sealless;

import android.view.ViewStructure;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AutofillUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lsealless/taiyuan;", "", "<init>", "()V", "Landroid/view/ViewStructure;", "structure", "", "index", "saneness", "(Landroid/view/ViewStructure;I)Landroid/view/ViewStructure;", "num", "attabal", "(Landroid/view/ViewStructure;I)I", "id", "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "typeName", "entryName", "", "wireman", "(Landroid/view/ViewStructure;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", TtmlNode.LEFT, "top", "scrollX", "scrollY", "width", "height", "dern", "(Landroid/view/ViewStructure;IIIIII)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final taiyuan f37452attabal = new taiyuan();

    public final int attabal(ViewStructure structure, int num) {
        return structure.addChildCount(num);
    }

    public final void dern(ViewStructure structure, int left, int top, int scrollX, int scrollY, int width, int height) {
        structure.setDimens(left, top, scrollX, scrollY, width, height);
    }

    public final ViewStructure saneness(ViewStructure structure, int index) {
        return structure.newChild(index);
    }

    public final void wireman(ViewStructure structure, int id, String packageName, String typeName, String entryName) {
        structure.setId(id, packageName, typeName, entryName);
    }
}
