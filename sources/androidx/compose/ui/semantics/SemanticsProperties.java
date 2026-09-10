package androidx.compose.ui.semantics;

import androidx.compose.ui.state.ToggleableState;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import sealless.cord;
import sealless.cuirassed;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0010\u0010\nR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\nR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\nR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u0007\u0010\nR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b!\u0010\nR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\u0016\u0010\nR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\b\u001a\u0004\b&\u0010\nR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\b\u001a\u0004\b \u0010\nR\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\b\u001a\u0004\b,\u0010\nR&\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010\b\u0012\u0004\b/\u0010\u0003\u001a\u0004\b+\u0010\nR \u00103\u001a\b\u0012\u0004\u0012\u0002010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u0010\b\u001a\u0004\b\u0012\u0010\nR \u00105\u001a\b\u0012\u0004\u0012\u0002040\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010\b\u001a\u0004\b\f\u0010\nR\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002060\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\b\u001a\u0004\b7\u0010\nR\u001d\u0010;\u001a\b\u0012\u0004\u0012\u0002090\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\b\u001a\u0004\b%\u0010\nR\u001d\u0010=\u001a\b\u0012\u0004\u0012\u0002090\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b<\u0010\nR\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b>\u0010\b\u001a\u0004\b?\u0010\nR\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\bA\u0010\nR\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020C0\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\bD\u0010\nR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\bF\u0010\nR#\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u00050\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\b\u001a\u0004\bJ\u0010\nR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020H0\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\bL\u0010\nR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\b\u001a\u0004\b2\u0010\nR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020H0\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010\b\u001a\u0004\b\u001a\u0010\nR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020P0\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\b\u001a\u0004\bQ\u0010\nR\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\b\u001a\u0004\b)\u0010\nR\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\b\u001a\u0004\bI\u0010\nR\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\b\u001a\u0004\bU\u0010\nR\u001d\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b<\u0010\b\u001a\u0004\b>\u0010\nR\u001d\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010\b\u001a\u0004\b\u001e\u0010\nR)\u0010`\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020]0\\0\u00048\u0006¢\u0006\f\n\u0004\b^\u0010\b\u001a\u0004\b_\u0010\nR\u001d\u0010b\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\ba\u0010\b\u001a\u0004\b.\u0010\nR\u001d\u0010d\u001a\b\u0012\u0004\u0012\u00020]0\u00048\u0006¢\u0006\f\n\u0004\bc\u0010\b\u001a\u0004\b:\u0010\n¨\u0006e"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "", "saneness", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "wireman", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "ContentDescription", "dern", "preprohormone", "StateDescription", "Landroidx/compose/ui/semantics/competently;", "adultoid", "ProgressBarRangeInfo", "marial", "molybdenite", "PaneTitle", "", "beachfront", "gintrap", "SelectableGroup", "Landroidx/compose/ui/semantics/saneness;", "competently", "attabal", "CollectionInfo", "Landroidx/compose/ui/semantics/dern;", "impromptu", "CollectionItemInfo", "taiyuan", "cutely", "Heading", "Disabled", "Landroidx/compose/ui/semantics/beachfront;", "apical", "monoploid", "LiveRegion", "", "formularize", "Focused", "impassible", "arytenoidectomy", "IsTraversalGroup", "triweekly", "getInvisibleToUser$annotations", "InvisibleToUser", "Lsealless/cuirassed;", "kowloon", "ContentType", "Lsealless/cord;", "ContentDataType", "", "yemenite", "TraversalIndex", "Landroidx/compose/ui/semantics/taiyuan;", "polloi", "HorizontalScrollAxisRange", "sealless", "VerticalScrollAxisRange", "graveside", "getIsPopup", "IsPopup", "getIsDialog", "IsDialog", "Landroidx/compose/ui/semantics/impromptu;", "dovishness", "Role", "cord", "TestTag", "Landroidx/compose/ui/text/attabal;", "rotuma", "cuirassed", "Text", "trm", "TextSubstitution", "IsShowingTextSubstitution", "EditableText", "Landroidx/compose/ui/text/competently;", "stratoscope", "TextSelectionRange", "Landroidx/compose/ui/text/input/kowloon;", "ImeAction", "oilcan", "Selected", "Landroidx/compose/ui/state/ToggleableState;", "ToggleableState", "Password", "kattegat", "Error", "Lkotlin/Function1;", "", "supplicat", "getIndexForKey", "IndexForKey", "restrictive", "IsEditable", "merc", "MaxTextLength", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SemanticsProperties {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final SemanticsProperties f7561attabal = new SemanticsProperties();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<List<String>> ContentDescription = arytenoidectomy.saneness("ContentDescription", new Function2<List<? extends String>, List<? extends String>, List<? extends String>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            return invoke2((List<String>) list, (List<String>) list2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<String> invoke2(List<String> list, List<String> list2) {
            List<String> listBasify;
            if (list == null || (listBasify = CollectionsKt.basify(list)) == null) {
                return list2;
            }
            listBasify.addAll(list2);
            return listBasify;
        }
    });

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<String> StateDescription = arytenoidectomy.attabal("StateDescription");

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = arytenoidectomy.attabal("ProgressBarRangeInfo");

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<String> PaneTitle = arytenoidectomy.saneness("PaneTitle", new Function2<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // p002kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Unit> SelectableGroup = arytenoidectomy.attabal("SelectableGroup");

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<saneness> CollectionInfo = arytenoidectomy.attabal("CollectionInfo");

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<dern> CollectionItemInfo = arytenoidectomy.attabal("CollectionItemInfo");

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Unit> Heading = arytenoidectomy.attabal("Heading");

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Unit> Disabled = arytenoidectomy.attabal("Disabled");

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<beachfront> LiveRegion = arytenoidectomy.attabal("LiveRegion");

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Boolean> Focused = arytenoidectomy.attabal("Focused");

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Boolean> IsTraversalGroup = arytenoidectomy.attabal("IsTraversalGroup");

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Unit> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    });

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<cuirassed> ContentType = new SemanticsPropertyKey<>("ContentType", new Function2<cuirassed, cuirassed, cuirassed>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentType$1
        @Override // p002kotlin.jvm.functions.Function2
        public final cuirassed invoke(cuirassed cuirassedVar, cuirassed cuirassedVar2) {
            return cuirassedVar;
        }
    });

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<cord> ContentDataType = new SemanticsPropertyKey<>("ContentDataType", new Function2<cord, cord, cord>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDataType$1
        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ cord invoke(cord cordVar, cord cordVar2) {
            return m10invokex33U9Dw(cordVar, cordVar2.getDataType());
        }

        /* JADX INFO: renamed from: invoke-x33U9Dw, reason: not valid java name */
        public final cord m10invokex33U9Dw(cord cordVar, int i) {
            return cordVar;
        }
    });

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Float> TraversalIndex = arytenoidectomy.saneness("TraversalIndex", new Function2<Float, Float, Float>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TraversalIndex$1
        public final Float invoke(Float f, float f2) {
            return f;
        }

        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Float invoke(Float f, Float f2) {
            return invoke(f, f2.floatValue());
        }
    });

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = arytenoidectomy.attabal("HorizontalScrollAxisRange");

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = arytenoidectomy.attabal("VerticalScrollAxisRange");

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Unit> IsPopup = arytenoidectomy.saneness("IsPopup", new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Unit> IsDialog = arytenoidectomy.saneness("IsDialog", new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<impromptu> Role = arytenoidectomy.saneness("Role", new Function2<impromptu, impromptu, impromptu>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ impromptu invoke(impromptu impromptuVar, impromptu impromptuVar2) {
            return m11invokeqtAw6s(impromptuVar, impromptuVar2.getValue());
        }

        /* JADX INFO: renamed from: invoke-qtA-w6s, reason: not valid java name */
        public final impromptu m11invokeqtAw6s(impromptu impromptuVar, int i) {
            return impromptuVar;
        }
    });

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", false, new Function2<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // p002kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            return str;
        }
    });

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<List<androidx.compose.ui.text.attabal>> Text = arytenoidectomy.saneness("Text", new Function2<List<? extends androidx.compose.ui.text.attabal>, List<? extends androidx.compose.ui.text.attabal>, List<? extends androidx.compose.ui.text.attabal>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<? extends androidx.compose.ui.text.attabal> invoke(List<? extends androidx.compose.ui.text.attabal> list, List<? extends androidx.compose.ui.text.attabal> list2) {
            return invoke2((List<androidx.compose.ui.text.attabal>) list, (List<androidx.compose.ui.text.attabal>) list2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<androidx.compose.ui.text.attabal> invoke2(List<androidx.compose.ui.text.attabal> list, List<androidx.compose.ui.text.attabal> list2) {
            List<androidx.compose.ui.text.attabal> listBasify;
            if (list == null || (listBasify = CollectionsKt.basify(list)) == null) {
                return list2;
            }
            listBasify.addAll(list2);
            return listBasify;
        }
    });

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<androidx.compose.ui.text.attabal> TextSubstitution = new SemanticsPropertyKey<>("TextSubstitution", null, 2, null);

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Boolean> IsShowingTextSubstitution = new SemanticsPropertyKey<>("IsShowingTextSubstitution", null, 2, null);

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<androidx.compose.ui.text.attabal> EditableText = arytenoidectomy.attabal("EditableText");

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<androidx.compose.ui.text.competently> TextSelectionRange = arytenoidectomy.attabal("TextSelectionRange");

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<androidx.compose.ui.text.input.kowloon> ImeAction = arytenoidectomy.attabal("ImeAction");

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Boolean> Selected = arytenoidectomy.attabal("Selected");

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<ToggleableState> ToggleableState = arytenoidectomy.attabal("ToggleableState");

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Unit> Password = arytenoidectomy.attabal("Password");

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<String> Error = arytenoidectomy.attabal("Error");

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Function1<Object, Integer>> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", null, 2, null);

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Boolean> IsEditable = new SemanticsPropertyKey<>("IsEditable", null, 2, null);

    /* JADX INFO: renamed from: merc, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Integer> MaxTextLength = new SemanticsPropertyKey<>("MaxTextLength", null, 2, null);

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public static final int f7581polder = 8;

    public final SemanticsPropertyKey<ProgressBarRangeInfo> adultoid() {
        return ProgressBarRangeInfo;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> apical() {
        return HorizontalScrollAxisRange;
    }

    public final SemanticsPropertyKey<Boolean> arytenoidectomy() {
        return IsTraversalGroup;
    }

    public final SemanticsPropertyKey<saneness> attabal() {
        return CollectionInfo;
    }

    public final SemanticsPropertyKey<Unit> beachfront() {
        return Disabled;
    }

    public final SemanticsPropertyKey<androidx.compose.ui.text.attabal> competently() {
        return EditableText;
    }

    public final SemanticsPropertyKey<String> cord() {
        return TestTag;
    }

    public final SemanticsPropertyKey<List<androidx.compose.ui.text.attabal>> cuirassed() {
        return Text;
    }

    public final SemanticsPropertyKey<Unit> cutely() {
        return Heading;
    }

    public final SemanticsPropertyKey<cord> dern() {
        return ContentDataType;
    }

    public final SemanticsPropertyKey<impromptu> dovishness() {
        return Role;
    }

    public final SemanticsPropertyKey<androidx.compose.ui.text.input.kowloon> formularize() {
        return ImeAction;
    }

    public final SemanticsPropertyKey<Unit> gintrap() {
        return SelectableGroup;
    }

    public final SemanticsPropertyKey<Unit> graveside() {
        return Password;
    }

    public final SemanticsPropertyKey<Unit> impassible() {
        return InvisibleToUser;
    }

    public final SemanticsPropertyKey<String> impromptu() {
        return Error;
    }

    public final SemanticsPropertyKey<Boolean> kowloon() {
        return IsShowingTextSubstitution;
    }

    public final SemanticsPropertyKey<cuirassed> marial() {
        return ContentType;
    }

    public final SemanticsPropertyKey<String> molybdenite() {
        return PaneTitle;
    }

    public final SemanticsPropertyKey<beachfront> monoploid() {
        return LiveRegion;
    }

    public final SemanticsPropertyKey<ToggleableState> oilcan() {
        return ToggleableState;
    }

    public final SemanticsPropertyKey<Integer> polloi() {
        return MaxTextLength;
    }

    public final SemanticsPropertyKey<String> preprohormone() {
        return StateDescription;
    }

    public final SemanticsPropertyKey<Boolean> rotuma() {
        return Selected;
    }

    public final SemanticsPropertyKey<dern> saneness() {
        return CollectionItemInfo;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> sealless() {
        return VerticalScrollAxisRange;
    }

    public final SemanticsPropertyKey<androidx.compose.ui.text.competently> stratoscope() {
        return TextSelectionRange;
    }

    public final SemanticsPropertyKey<Boolean> taiyuan() {
        return Focused;
    }

    public final SemanticsPropertyKey<Boolean> triweekly() {
        return IsEditable;
    }

    public final SemanticsPropertyKey<androidx.compose.ui.text.attabal> trm() {
        return TextSubstitution;
    }

    public final SemanticsPropertyKey<List<String>> wireman() {
        return ContentDescription;
    }

    public final SemanticsPropertyKey<Float> yemenite() {
        return TraversalIndex;
    }
}
