package androidx.compose.ui.semantics;

import clubfoot.TextLayoutResult;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R5\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR)\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR)\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rR5\u0010\u001a\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00160\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR9\u0010\u001f\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR/\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b\"\u0010\rR2\u0010'\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b&\u0010\rR/\u0010)\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b(\u0010\rR;\u0010,\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0*0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b+\u0010\rR/\u0010/\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u000b\u001a\u0004\b.\u0010\rR/\u00101\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b0\u0010\rR/\u00104\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\b3\u0010\rR)\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u000b\u001a\u0004\b6\u0010\rR/\u0010:\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u000b\u001a\u0004\b9\u0010\rR)\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u000b\u001a\u0004\b-\u0010\rR2\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010\u000b\u0012\u0004\b?\u0010\u0003\u001a\u0004\b>\u0010\rR)\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u000b\u001a\u0004\b\u0010\u0010\rR)\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0018\u0010\rR)\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b=\u0010\rR)\u0010E\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u000b\u001a\u0004\b!\u0010\rR)\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u000b\u001a\u0004\b\n\u0010\rR)\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\b\u001d\u0010\rR)\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u000b\u001a\u0004\bA\u0010\rR#\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I0\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u000b\u001a\u0004\b\u0013\u0010\rR)\u0010M\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\u000b\u001a\u0004\b;\u0010\rR)\u0010O\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u000b\u001a\u0004\b5\u0010\rR)\u0010Q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bP\u0010\u000b\u001a\u0004\b2\u0010\rR)\u0010S\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u000b\u001a\u0004\b8\u0010\rR5\u0010U\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\u000b\u001a\u0004\b%\u0010\r¨\u0006V"}, d2 = {"Landroidx/compose/ui/semantics/cutely;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/attabal;", "Lkotlin/Function1;", "", "Lclubfoot/beachfront;", "", "saneness", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "taiyuan", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "GetTextLayoutResult", "Lkotlin/Function0;", "dern", "cutely", "OnClick", "wireman", "formularize", "OnLongClick", "Lkotlin/Function2;", "", "marial", "molybdenite", "ScrollBy", "Lsupplicat/competently;", "Lwretchedly/dern;", "beachfront", "graveside", "ScrollByOffset", "", "competently", "getScrollToIndex", "ScrollToIndex", "Landroidx/compose/ui/text/attabal;", "impromptu", "getOnAutofillText$ui_release", "OnAutofillText", "adultoid", "SetProgress", "Lkotlin/Function3;", "dovishness", "SetSelection", "apical", "gintrap", "SetText", "rotuma", "SetTextSubstitution", "impassible", "preprohormone", "ShowTextSubstitution", "triweekly", "attabal", "ClearTextSubstitution", "kowloon", "getInsertTextAtCursor", "InsertTextAtCursor", "arytenoidectomy", "OnImeAction", "monoploid", "getPerformImeAction", "getPerformImeAction$annotations", "PerformImeAction", "polloi", "CopyText", "CutText", "PasteText", "Expand", "Collapse", "Dismiss", "RequestFocus", "", "Landroidx/compose/ui/semantics/wireman;", "CustomActions", "cord", "PageUp", "cuirassed", "PageLeft", "stratoscope", "PageDown", "trm", "PageRight", "oilcan", "GetScrollViewportLength", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class cutely {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Expand;

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function1<androidx.compose.ui.text.attabal, Boolean>>> SetText;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnImeAction;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final cutely f7617attabal = new cutely();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Function2<supplicat.competently, wretchedly.dern<? super supplicat.competently>, Object>> ScrollByOffset;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> ScrollToIndex;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageUp;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageLeft;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<tetrahedral.triweekly<Integer, Integer, Boolean, Boolean>>> SetSelection;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnClick;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Collapse;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function1<androidx.compose.ui.text.attabal, Boolean>>> SetTextSubstitution;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Dismiss;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PasteText;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function1<Boolean, Boolean>>> ShowTextSubstitution;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function1<androidx.compose.ui.text.attabal, Boolean>>> OnAutofillText;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function1<androidx.compose.ui.text.attabal, Boolean>>> InsertTextAtCursor;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function2<Float, Float, Boolean>>> ScrollBy;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> CutText;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PerformImeAction;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function1<List<Float>, Boolean>>> GetScrollViewportLength;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> CopyText;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> RequestFocus;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageDown;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> SetProgress;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> ClearTextSubstitution;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageRight;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnLongClick;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public static final int f7644yemenite;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = new Function2<AccessibilityAction<patroclinal.beachfront<? extends Boolean>>, AccessibilityAction<patroclinal.beachfront<? extends Boolean>>, AccessibilityAction<patroclinal.beachfront<? extends Boolean>>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
            @Override // p002kotlin.jvm.functions.Function2
            public final AccessibilityAction<patroclinal.beachfront<? extends Boolean>> invoke(AccessibilityAction<patroclinal.beachfront<? extends Boolean>> accessibilityAction, AccessibilityAction<patroclinal.beachfront<? extends Boolean>> accessibilityAction2) {
                String label;
                patroclinal.beachfront beachfrontVarAttabal;
                if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                    label = accessibilityAction2.getLabel();
                }
                if (accessibilityAction == null || (beachfrontVarAttabal = accessibilityAction.attabal()) == null) {
                    beachfrontVarAttabal = accessibilityAction2.attabal();
                }
                return new AccessibilityAction<>(label, beachfrontVarAttabal);
            }
        };
        GetTextLayoutResult = arytenoidectomy.saneness("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        OnClick = arytenoidectomy.saneness("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        OnLongClick = arytenoidectomy.saneness("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollBy = arytenoidectomy.saneness("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollByOffset = new SemanticsPropertyKey<>("ScrollByOffset", null, 2, null);
        ScrollToIndex = arytenoidectomy.saneness("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$1);
        OnAutofillText = arytenoidectomy.saneness("OnAutofillText", semanticsPropertiesKt$ActionPropertyKey$1);
        SetProgress = arytenoidectomy.saneness("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        SetSelection = arytenoidectomy.saneness("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        SetText = arytenoidectomy.saneness("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        SetTextSubstitution = arytenoidectomy.saneness("SetTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        ShowTextSubstitution = arytenoidectomy.saneness("ShowTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        ClearTextSubstitution = arytenoidectomy.saneness("ClearTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        InsertTextAtCursor = arytenoidectomy.saneness("InsertTextAtCursor", semanticsPropertiesKt$ActionPropertyKey$1);
        OnImeAction = arytenoidectomy.saneness("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$1);
        PerformImeAction = arytenoidectomy.saneness("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$1);
        CopyText = arytenoidectomy.saneness("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        CutText = arytenoidectomy.saneness("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        PasteText = arytenoidectomy.saneness("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        Expand = arytenoidectomy.saneness("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        Collapse = arytenoidectomy.saneness("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        Dismiss = arytenoidectomy.saneness("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        RequestFocus = arytenoidectomy.saneness("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
        CustomActions = arytenoidectomy.attabal("CustomActions");
        PageUp = arytenoidectomy.saneness("PageUp", semanticsPropertiesKt$ActionPropertyKey$1);
        PageLeft = arytenoidectomy.saneness("PageLeft", semanticsPropertiesKt$ActionPropertyKey$1);
        PageDown = arytenoidectomy.saneness("PageDown", semanticsPropertiesKt$ActionPropertyKey$1);
        PageRight = arytenoidectomy.saneness("PageRight", semanticsPropertiesKt$ActionPropertyKey$1);
        GetScrollViewportLength = arytenoidectomy.saneness("GetScrollViewportLength", semanticsPropertiesKt$ActionPropertyKey$1);
        f7644yemenite = 8;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> adultoid() {
        return SetProgress;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> apical() {
        return OnImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> arytenoidectomy() {
        return PageUp;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> attabal() {
        return ClearTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> beachfront() {
        return Dismiss;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> competently() {
        return Expand;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> cutely() {
        return OnClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> dern() {
        return CopyText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<tetrahedral.triweekly<Integer, Integer, Boolean, Boolean>>> dovishness() {
        return SetSelection;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> formularize() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<androidx.compose.ui.text.attabal, Boolean>>> gintrap() {
        return SetText;
    }

    public final SemanticsPropertyKey<Function2<supplicat.competently, wretchedly.dern<? super supplicat.competently>, Object>> graveside() {
        return ScrollByOffset;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> impassible() {
        return PageDown;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<List<Float>, Boolean>>> impromptu() {
        return GetScrollViewportLength;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> kowloon() {
        return PageRight;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> marial() {
        return CutText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function2<Float, Float, Boolean>>> molybdenite() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> monoploid() {
        return PasteText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> polloi() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Boolean, Boolean>>> preprohormone() {
        return ShowTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<androidx.compose.ui.text.attabal, Boolean>>> rotuma() {
        return SetTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> saneness() {
        return Collapse;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> taiyuan() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> triweekly() {
        return PageLeft;
    }

    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> wireman() {
        return CustomActions;
    }
}
