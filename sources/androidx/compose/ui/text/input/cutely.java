package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import clubfoot.TextLayoutResult;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: CursorAnchorInfoBuilder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\u001ak\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001f\u001a\u00020\f*\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/dovishness;", "offsetMapping", "Lclubfoot/beachfront;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Lsupplicat/taiyuan;", "innerTextFieldBounds", "decorationBoxBounds", "", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo;", "saneness", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/dovishness;Lclubfoot/beachfront;Landroid/graphics/Matrix;Lsupplicat/taiyuan;Lsupplicat/taiyuan;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "", "selectionStart", "wireman", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILandroidx/compose/ui/text/input/dovishness;Lclubfoot/beachfront;Lsupplicat/taiyuan;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "endOffset", "attabal", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILandroidx/compose/ui/text/input/dovishness;Lclubfoot/beachfront;Lsupplicat/taiyuan;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "", "x", "y", "dern", "(Lsupplicat/taiyuan;FF)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class cutely {
    public static final CursorAnchorInfo.Builder attabal(CursorAnchorInfo.Builder builder, int i, int i2, dovishness dovishnessVar, TextLayoutResult textLayoutResult, supplicat.taiyuan taiyuanVar) {
        int iAttabal = dovishnessVar.attabal(i);
        int iAttabal2 = dovishnessVar.attabal(i2);
        float[] fArr = new float[(iAttabal2 - iAttabal) * 4];
        textLayoutResult.triweekly();
        clubfoot.impromptu.saneness(iAttabal, iAttabal2);
        throw null;
    }

    public static final boolean dern(supplicat.taiyuan taiyuanVar, float f, float f2) {
        float f3 = taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String();
        if (f > taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String() || f3 > f) {
            return false;
        }
        return f2 <= taiyuanVar.getBottom() && taiyuanVar.getTop() <= f2;
    }

    @patroclinal.wireman
    public static final CursorAnchorInfo saneness(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, dovishness dovishnessVar, TextLayoutResult textLayoutResult, Matrix matrix, supplicat.taiyuan taiyuanVar, supplicat.taiyuan taiyuanVar2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        int iTaiyuan = androidx.compose.ui.text.competently.taiyuan(textFieldValue.getSelection());
        builder.setSelectionRange(iTaiyuan, androidx.compose.ui.text.competently.impromptu(textFieldValue.getSelection()));
        if (z) {
            wireman(builder, iTaiyuan, dovishnessVar, textLayoutResult, taiyuanVar);
        }
        if (z2) {
            androidx.compose.ui.text.competently composition = textFieldValue.getComposition();
            int iTaiyuan2 = composition != null ? androidx.compose.ui.text.competently.taiyuan(composition.getPackedValue()) : -1;
            androidx.compose.ui.text.competently composition2 = textFieldValue.getComposition();
            int iImpromptu = composition2 != null ? androidx.compose.ui.text.competently.impromptu(composition2.getPackedValue()) : -1;
            if (iTaiyuan2 >= 0 && iTaiyuan2 < iImpromptu) {
                builder.setComposingText(iTaiyuan2, textFieldValue.wireman().subSequence(iTaiyuan2, iImpromptu));
                attabal(builder, iTaiyuan2, iImpromptu, dovishnessVar, textLayoutResult, taiyuanVar);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && z3) {
            competently.attabal(builder, taiyuanVar2);
        }
        if (i >= 34 && z4) {
            taiyuan.attabal(builder, textLayoutResult, taiyuanVar);
        }
        return builder.build();
    }

    public static final CursorAnchorInfo.Builder wireman(CursorAnchorInfo.Builder builder, int i, dovishness dovishnessVar, TextLayoutResult textLayoutResult, supplicat.taiyuan taiyuanVar) {
        if (i < 0) {
            return builder;
        }
        int iAttabal = dovishnessVar.attabal(i);
        supplicat.taiyuan taiyuanVarSaneness = textLayoutResult.saneness(iAttabal);
        float fCutely = p002kotlin.ranges.wireman.cutely(taiyuanVarSaneness.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, milliradian.monoploid.competently(textLayoutResult.getSize()));
        boolean zDern = dern(taiyuanVar, fCutely, taiyuanVarSaneness.getTop());
        boolean zDern2 = dern(taiyuanVar, fCutely, taiyuanVarSaneness.getBottom());
        boolean z = textLayoutResult.attabal(iAttabal) == ResolvedTextDirection.Rtl;
        int i2 = (zDern || zDern2) ? 1 : 0;
        if (!zDern || !zDern2) {
            i2 |= 2;
        }
        if (z) {
            i2 |= 4;
        }
        builder.setInsertionMarkerLocation(fCutely, taiyuanVarSaneness.getTop(), taiyuanVarSaneness.getBottom(), taiyuanVarSaneness.getBottom(), i2);
        return builder;
    }
}
