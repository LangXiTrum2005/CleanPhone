package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import clubfoot.TextLayoutResult;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: CursorAnchorInfoBuilder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/input/taiyuan;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Lclubfoot/beachfront;", "textLayoutResult", "Lsupplicat/taiyuan;", "innerTextFieldBounds", "attabal", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lclubfoot/beachfront;Lsupplicat/taiyuan;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final taiyuan f7911attabal = new taiyuan();

    public static final CursorAnchorInfo.Builder attabal(CursorAnchorInfo.Builder builder, TextLayoutResult textLayoutResult, supplicat.taiyuan innerTextFieldBounds) {
        int iTaiyuan;
        int iTaiyuan2;
        if (!innerTextFieldBounds.formularize() && (iTaiyuan = textLayoutResult.taiyuan(innerTextFieldBounds.getTop())) <= (iTaiyuan2 = textLayoutResult.taiyuan(innerTextFieldBounds.getBottom()))) {
            while (true) {
                builder.addVisibleLineBounds(textLayoutResult.cutely(iTaiyuan), textLayoutResult.impassible(iTaiyuan), textLayoutResult.apical(iTaiyuan), textLayoutResult.wireman(iTaiyuan));
                if (iTaiyuan == iTaiyuan2) {
                    break;
                }
                iTaiyuan++;
            }
        }
        return builder;
    }
}
