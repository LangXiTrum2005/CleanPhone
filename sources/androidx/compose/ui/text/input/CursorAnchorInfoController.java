package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import clubfoot.TextLayoutResult;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import restrictive.lerp;
import restrictive.merc;

/* JADX INFO: compiled from: CursorAnchorInfoController.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010.\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010;\u001a\u00020+8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "", "Lstarveling/yemenite;", "rootPositionCalculator", "Landroidx/compose/ui/text/input/polloi;", "inputMethodManager", "<init>", "(Lstarveling/yemenite;Landroidx/compose/ui/text/input/polloi;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "", "attabal", "(ZZZZZZ)V", "saneness", "()V", "Lstarveling/yemenite;", "Landroidx/compose/ui/text/input/polloi;", "dern", "Ljava/lang/Object;", "lock", "wireman", "Z", "monitorEnabled", "marial", "hasPendingImmediateRequest", "beachfront", "competently", "impromptu", "taiyuan", "Landroidx/compose/ui/text/input/TextFieldValue;", "cutely", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Lclubfoot/beachfront;", "apical", "Lclubfoot/beachfront;", "textLayoutResult", "Lkotlin/Function1;", "Lrestrictive/lerp;", "formularize", "Lkotlin/jvm/functions/Function1;", "textFieldToRootTransform", "Lsupplicat/taiyuan;", "impassible", "Lsupplicat/taiyuan;", "innerTextFieldBounds", "triweekly", "decorationBoxBounds", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "kowloon", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "arytenoidectomy", "[F", "matrix", "Landroid/graphics/Matrix;", "monoploid", "Landroid/graphics/Matrix;", "androidMatrix", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@patroclinal.wireman
public final class CursorAnchorInfoController {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public TextLayoutResult textLayoutResult;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final starveling.yemenite rootPositionCalculator;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public boolean includeInsertionMarker;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public boolean includeCharacterBounds;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public TextFieldValue textFieldValue;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public supplicat.taiyuan innerTextFieldBounds;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public boolean includeEditorBounds;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public boolean hasPendingImmediateRequest;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final polloi inputMethodManager;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public boolean includeLineBounds;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public supplicat.taiyuan decorationBoxBounds;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public boolean monitorEnabled;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Object lock = new Object();

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public Function1<? super lerp, Unit> textFieldToRootTransform = new Function1<lerp, Unit>() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$textFieldToRootTransform$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(lerp lerpVar) {
            m22invoke58bKbWc(lerpVar.getValues());
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
        public final void m22invoke58bKbWc(float[] fArr) {
        }
    };

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final float[] matrix = lerp.dern(null, 1, null);

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final Matrix androidMatrix = new Matrix();

    public CursorAnchorInfoController(starveling.yemenite yemeniteVar, polloi polloiVar) {
        this.rootPositionCalculator = yemeniteVar;
        this.inputMethodManager = polloiVar;
    }

    public final void attabal(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        synchronized (this.lock) {
            try {
                this.includeInsertionMarker = includeInsertionMarker;
                this.includeCharacterBounds = includeCharacterBounds;
                this.includeEditorBounds = includeEditorBounds;
                this.includeLineBounds = includeLineBounds;
                if (immediate) {
                    this.hasPendingImmediateRequest = true;
                    if (this.textFieldValue != null) {
                        saneness();
                    }
                }
                this.monitorEnabled = monitor;
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void saneness() {
        if (this.inputMethodManager.isActive()) {
            this.textFieldToRootTransform.invoke(lerp.attabal(this.matrix));
            this.rootPositionCalculator.apical(this.matrix);
            merc.attabal(this.androidMatrix, this.matrix);
            polloi polloiVar = this.inputMethodManager;
            CursorAnchorInfo.Builder builder = this.builder;
            TextFieldValue textFieldValue = this.textFieldValue;
            Intrinsics.beachfront(textFieldValue);
            Intrinsics.beachfront(null);
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            Intrinsics.beachfront(textLayoutResult);
            Matrix matrix = this.androidMatrix;
            supplicat.taiyuan taiyuanVar = this.innerTextFieldBounds;
            Intrinsics.beachfront(taiyuanVar);
            supplicat.taiyuan taiyuanVar2 = this.decorationBoxBounds;
            Intrinsics.beachfront(taiyuanVar2);
            polloiVar.attabal(cutely.saneness(builder, textFieldValue, null, textLayoutResult, matrix, taiyuanVar, taiyuanVar2, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
            this.hasPendingImmediateRequest = false;
        }
    }
}
