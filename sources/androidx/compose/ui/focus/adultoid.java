package androidx.compose.ui.focus;

import androidx.collection.grimness;
import androidx.collection.peridotite;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: FocusTransactionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R,\u0010\u001c\u001a\u0004\u0018\u00010\n*\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/focus/adultoid;", "", "<init>", "()V", "", "beachfront", "impromptu", "competently", "Landroidx/collection/grimness;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusStateImpl;", "attabal", "Landroidx/collection/grimness;", "states", "Landroidx/compose/runtime/collection/dern;", "Lkotlin/Function0;", "saneness", "Landroidx/compose/runtime/collection/dern;", "cancellationListener", "", "dern", "Z", "ongoingTransaction", "value", "taiyuan", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusStateImpl;", "cutely", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusStateImpl;)V", "uncommittedFocusState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class adultoid {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public boolean ongoingTransaction;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final grimness<FocusTargetNode, FocusStateImpl> states = peridotite.dern();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<Function0<Unit>> cancellationListener = new androidx.compose.runtime.collection.dern<>(new Function0[16], 0);

    public final void beachfront() {
        this.ongoingTransaction = true;
    }

    public final void competently() {
        this.states.taiyuan();
        int i = 0;
        this.ongoingTransaction = false;
        androidx.compose.runtime.collection.dern<Function0<Unit>> dernVar = this.cancellationListener;
        int size = dernVar.getSize();
        if (size > 0) {
            Function0<Unit>[] function0ArrApical = dernVar.apical();
            do {
                function0ArrApical[i].invoke();
                i++;
            } while (i < size);
        }
        this.cancellationListener.impromptu();
    }

    public final void cutely(FocusTargetNode focusTargetNode, FocusStateImpl focusStateImpl) {
        grimness<FocusTargetNode, FocusStateImpl> grimnessVar = this.states;
        if (focusStateImpl != null) {
            grimnessVar.graveside(focusTargetNode, focusStateImpl);
        } else {
            peridotite.attabal.dern("requires a non-null focus state");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    public final void impromptu() {
        grimness<FocusTargetNode, FocusStateImpl> grimnessVar = this.states;
        Object[] objArr = grimnessVar.keys;
        long[] jArr = grimnessVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((FocusTargetNode) objArr[(i << 3) + i3]).gusty();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.states.taiyuan();
        this.ongoingTransaction = false;
        this.cancellationListener.impromptu();
    }

    public final FocusStateImpl taiyuan(FocusTargetNode focusTargetNode) {
        return this.states.dern(focusTargetNode);
    }
}
