package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import clubfoot.TextLayoutResult;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccessibilityIterators.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/wireman;", "Landroidx/compose/ui/platform/attabal;", "<init>", "()V", "", "lineNumber", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "taiyuan", "(ILandroidx/compose/ui/text/style/ResolvedTextDirection;)I", "", "text", "Lclubfoot/beachfront;", "layoutResult", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "", "cutely", "(Ljava/lang/String;Lclubfoot/beachfront;Landroidx/compose/ui/semantics/SemanticsNode;)V", "current", "", "attabal", "(I)[I", "saneness", "dern", "Lclubfoot/beachfront;", "wireman", "Landroidx/compose/ui/semantics/SemanticsNode;", "Landroid/graphics/Rect;", "marial", "Landroid/graphics/Rect;", "tempRect", "beachfront", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class wireman extends attabal {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static wireman f7524impromptu;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public TextLayoutResult layoutResult;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public Rect tempRect;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public SemanticsNode node;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final int f7522competently = 8;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final ResolvedTextDirection f7525taiyuan = ResolvedTextDirection.Rtl;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final ResolvedTextDirection f7523cutely = ResolvedTextDirection.Ltr;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.wireman$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/wireman$attabal;", "", "<init>", "()V", "Landroidx/compose/ui/platform/wireman;", "attabal", "()Landroidx/compose/ui/platform/wireman;", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/wireman;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wireman attabal() {
            if (wireman.f7524impromptu == null) {
                wireman.f7524impromptu = new wireman(null);
            }
            wireman wiremanVar = wireman.f7524impromptu;
            Intrinsics.competently(wiremanVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return wiremanVar;
        }

        public Companion() {
        }
    }

    public /* synthetic */ wireman(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int taiyuan(int lineNumber, ResolvedTextDirection direction) {
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

    @Override // androidx.compose.ui.platform.beachfront
    public int[] attabal(int current) {
        int iMarial;
        TextLayoutResult textLayoutResult = null;
        if (wireman().length() <= 0 || current >= wireman().length()) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.node;
            if (semanticsNode == null) {
                Intrinsics.preprohormone("node");
                semanticsNode = null;
            }
            int iRound = Math.round(semanticsNode.taiyuan().marial());
            int iWireman = p002kotlin.ranges.wireman.wireman(0, current);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                Intrinsics.preprohormone("layoutResult");
                textLayoutResult2 = null;
            }
            int iImpromptu = textLayoutResult2.impromptu(iWireman);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                Intrinsics.preprohormone("layoutResult");
                textLayoutResult3 = null;
            }
            float fImpassible = textLayoutResult3.impassible(iImpromptu) + iRound;
            TextLayoutResult textLayoutResult4 = this.layoutResult;
            if (textLayoutResult4 == null) {
                Intrinsics.preprohormone("layoutResult");
                textLayoutResult4 = null;
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                Intrinsics.preprohormone("layoutResult");
                textLayoutResult5 = null;
            }
            if (fImpassible < textLayoutResult4.impassible(textLayoutResult5.marial() - 1)) {
                TextLayoutResult textLayoutResult6 = this.layoutResult;
                if (textLayoutResult6 == null) {
                    Intrinsics.preprohormone("layoutResult");
                } else {
                    textLayoutResult = textLayoutResult6;
                }
                iMarial = textLayoutResult.taiyuan(fImpassible);
            } else {
                TextLayoutResult textLayoutResult7 = this.layoutResult;
                if (textLayoutResult7 == null) {
                    Intrinsics.preprohormone("layoutResult");
                } else {
                    textLayoutResult = textLayoutResult7;
                }
                iMarial = textLayoutResult.marial();
            }
            return dern(iWireman, taiyuan(iMarial - 1, f7523cutely) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void cutely(String text, TextLayoutResult layoutResult, SemanticsNode node) {
        beachfront(text);
        this.layoutResult = layoutResult;
        this.node = node;
    }

    @Override // androidx.compose.ui.platform.beachfront
    public int[] saneness(int current) {
        int iTaiyuan;
        TextLayoutResult textLayoutResult = null;
        if (wireman().length() <= 0 || current <= 0) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.node;
            if (semanticsNode == null) {
                Intrinsics.preprohormone("node");
                semanticsNode = null;
            }
            int iRound = Math.round(semanticsNode.taiyuan().marial());
            int iCompetently = p002kotlin.ranges.wireman.competently(wireman().length(), current);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                Intrinsics.preprohormone("layoutResult");
                textLayoutResult2 = null;
            }
            int iImpromptu = textLayoutResult2.impromptu(iCompetently);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                Intrinsics.preprohormone("layoutResult");
                textLayoutResult3 = null;
            }
            float fImpassible = textLayoutResult3.impassible(iImpromptu) - iRound;
            if (fImpassible > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    Intrinsics.preprohormone("layoutResult");
                } else {
                    textLayoutResult = textLayoutResult4;
                }
                iTaiyuan = textLayoutResult.taiyuan(fImpassible);
            } else {
                iTaiyuan = 0;
            }
            if (iCompetently == wireman().length() && iTaiyuan < iImpromptu) {
                iTaiyuan++;
            }
            return dern(taiyuan(iTaiyuan, f7525taiyuan), iCompetently);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public wireman() {
        this.tempRect = new Rect();
    }
}
