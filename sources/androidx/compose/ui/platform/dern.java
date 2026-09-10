package androidx.compose.ui.platform;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import clubfoot.TextLayoutResult;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccessibilityIterators.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/dern;", "Landroidx/compose/ui/platform/attabal;", "<init>", "()V", "", "text", "Lclubfoot/beachfront;", "layoutResult", "", "cutely", "(Ljava/lang/String;Lclubfoot/beachfront;)V", "", "current", "", "attabal", "(I)[I", "saneness", "lineNumber", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "taiyuan", "(ILandroidx/compose/ui/text/style/ResolvedTextDirection;)I", "dern", "Lclubfoot/beachfront;", "wireman", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class dern extends attabal {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static dern f7425beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public TextLayoutResult layoutResult;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int f7428marial = 8;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final ResolvedTextDirection f7426competently = ResolvedTextDirection.Rtl;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final ResolvedTextDirection f7427impromptu = ResolvedTextDirection.Ltr;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.dern$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/dern$attabal;", "", "<init>", "()V", "Landroidx/compose/ui/platform/dern;", "attabal", "()Landroidx/compose/ui/platform/dern;", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/dern;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dern attabal() {
            if (dern.f7425beachfront == null) {
                dern.f7425beachfront = new dern(null);
            }
            dern dernVar = dern.f7425beachfront;
            Intrinsics.competently(dernVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return dernVar;
        }

        public Companion() {
        }
    }

    public /* synthetic */ dern(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // androidx.compose.ui.platform.beachfront
    public int[] attabal(int current) {
        int iImpromptu;
        if (wireman().length() <= 0 || current >= wireman().length()) {
            return null;
        }
        if (current < 0) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                Intrinsics.preprohormone("layoutResult");
                textLayoutResult = null;
            }
            iImpromptu = textLayoutResult.impromptu(0);
        } else {
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                Intrinsics.preprohormone("layoutResult");
                textLayoutResult2 = null;
            }
            int iImpromptu2 = textLayoutResult2.impromptu(current);
            iImpromptu = taiyuan(iImpromptu2, f7426competently) == current ? iImpromptu2 : iImpromptu2 + 1;
        }
        TextLayoutResult textLayoutResult3 = this.layoutResult;
        if (textLayoutResult3 == null) {
            Intrinsics.preprohormone("layoutResult");
            textLayoutResult3 = null;
        }
        if (iImpromptu >= textLayoutResult3.marial()) {
            return null;
        }
        return dern(taiyuan(iImpromptu, f7426competently), taiyuan(iImpromptu, f7427impromptu) + 1);
    }

    public final void cutely(String text, TextLayoutResult layoutResult) {
        beachfront(text);
        this.layoutResult = layoutResult;
    }

    @Override // androidx.compose.ui.platform.beachfront
    public int[] saneness(int current) {
        int iImpromptu;
        if (wireman().length() <= 0 || current <= 0) {
            return null;
        }
        if (current > wireman().length()) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                Intrinsics.preprohormone("layoutResult");
                textLayoutResult = null;
            }
            iImpromptu = textLayoutResult.impromptu(wireman().length());
        } else {
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                Intrinsics.preprohormone("layoutResult");
                textLayoutResult2 = null;
            }
            int iImpromptu2 = textLayoutResult2.impromptu(current);
            iImpromptu = taiyuan(iImpromptu2, f7427impromptu) + 1 == current ? iImpromptu2 : iImpromptu2 - 1;
        }
        if (iImpromptu < 0) {
            return null;
        }
        return dern(taiyuan(iImpromptu, f7426competently), taiyuan(iImpromptu, f7427impromptu) + 1);
    }

    public final int taiyuan(int lineNumber, ResolvedTextDirection direction) {
        TextLayoutResult textLayoutResult = this.layoutResult;
        TextLayoutResult textLayoutResult2 = null;
        if (textLayoutResult == null) {
            Intrinsics.preprohormone("layoutResult");
            textLayoutResult = null;
        }
        int iFormularize = textLayoutResult.formularize(lineNumber);
        TextLayoutResult textLayoutResult3 = this.layoutResult;
        if (textLayoutResult3 == null) {
            Intrinsics.preprohormone("layoutResult");
            textLayoutResult3 = null;
        }
        if (direction != textLayoutResult3.kowloon(iFormularize)) {
            TextLayoutResult textLayoutResult4 = this.layoutResult;
            if (textLayoutResult4 == null) {
                Intrinsics.preprohormone("layoutResult");
            } else {
                textLayoutResult2 = textLayoutResult4;
            }
            return textLayoutResult2.formularize(lineNumber);
        }
        TextLayoutResult textLayoutResult5 = this.layoutResult;
        if (textLayoutResult5 == null) {
            Intrinsics.preprohormone("layoutResult");
            textLayoutResult5 = null;
        }
        return TextLayoutResult.competently(textLayoutResult5, lineNumber, false, 2, null) - 1;
    }

    public dern() {
    }
}
