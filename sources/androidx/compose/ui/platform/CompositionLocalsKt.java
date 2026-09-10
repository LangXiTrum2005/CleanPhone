package androidx.compose.ui.platform;

import androidx.compose.runtime.licking;
import androidx.compose.ui.unit.LayoutDirection;
import org.objectweb.asm.Opcodes;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CompositionLocals.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r\"\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"(\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0012\"&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001c\u0010\u0012\"\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e8\u0006¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012\"\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u000e8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b$\u0010\u0012\"\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010\u0010\u001a\u0004\b(\u0010\u0012\"\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010\u0010\u001a\u0004\b,\u0010\u0012\"&\u00102\u001a\b\u0012\u0004\u0012\u00020.0\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010\u0010\u0012\u0004\b1\u0010\u0018\u001a\u0004\b0\u0010\u0012\"\u001d\u00106\u001a\b\u0012\u0004\u0012\u0002030\u000e8\u0006¢\u0006\f\n\u0004\b4\u0010\u0010\u001a\u0004\b5\u0010\u0012\"\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002070\u000e8\u0006¢\u0006\f\n\u0004\b8\u0010\u0010\u001a\u0004\b9\u0010\u0012\"\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020;0\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010\u0010\u001a\u0004\b=\u0010\u0012\"\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020?0\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010\u0010\u001a\u0004\bA\u0010\u0012\"(\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010\u0010\u0012\u0004\bF\u0010\u0018\u001a\u0004\bE\u0010\u0012\"\u001f\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0\u000e8\u0006¢\u0006\f\n\u0004\bI\u0010\u0010\u001a\u0004\bJ\u0010\u0012\"\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020L0\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010\u0010\u001a\u0004\bN\u0010\u0012\"\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\bP\u0010\u0010\u001a\u0004\bQ\u0010\u0012\"\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00020S0\u000e8\u0006¢\u0006\f\n\u0004\bT\u0010\u0010\u001a\u0004\bU\u0010\u0012\"\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020W0\u000e8\u0006¢\u0006\f\n\u0004\bX\u0010\u0010\u001a\u0004\bY\u0010\u0012\"\"\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010[0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010\u0010\u001a\u0004\b]\u0010\u0012\" \u0010a\u001a\b\u0012\u0004\u0012\u00020_0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012\"\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020_0b8F¢\u0006\u0006\u001a\u0004\b \u0010c¨\u0006e"}, d2 = {"Landroidx/compose/ui/node/peridotite;", "owner", "Landroidx/compose/ui/platform/hardpan;", "uriHandler", "Lkotlin/Function0;", "", "content", "attabal", "(Landroidx/compose/ui/node/peridotite;Landroidx/compose/ui/platform/hardpan;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/taiyuan;I)V", "", "name", "", "marial", "(Ljava/lang/String;)Ljava/lang/Void;", "Landroidx/compose/runtime/unconsolidated;", "Landroidx/compose/ui/platform/impromptu;", "Landroidx/compose/runtime/unconsolidated;", "getLocalAccessibilityManager", "()Landroidx/compose/runtime/unconsolidated;", "LocalAccessibilityManager", "Lsealless/impromptu;", "saneness", "getLocalAutofill", "getLocalAutofill$annotations", "()V", "LocalAutofill", "Lsealless/preprohormone;", "dern", "getLocalAutofillTree", "getLocalAutofillTree$annotations", "LocalAutofillTree", "Landroidx/compose/ui/platform/hydrovane;", "wireman", "getLocalClipboardManager", "LocalClipboardManager", "Lrestrictive/milliradian;", "getLocalGraphicsContext", "LocalGraphicsContext", "Lmilliradian/wireman;", "beachfront", "getLocalDensity", "LocalDensity", "Landroidx/compose/ui/focus/impromptu;", "competently", "getLocalFocusManager", "LocalFocusManager", "Landroidx/compose/ui/text/font/impromptu$saneness;", "impromptu", "getLocalFontLoader", "getLocalFontLoader$annotations", "LocalFontLoader", "Landroidx/compose/ui/text/font/taiyuan$saneness;", "taiyuan", "getLocalFontFamilyResolver", "LocalFontFamilyResolver", "Lgrimness/attabal;", "cutely", "getLocalHapticFeedback", "LocalHapticFeedback", "Lsaran/saneness;", "apical", "getLocalInputModeManager", "LocalInputModeManager", "Landroidx/compose/ui/unit/LayoutDirection;", "formularize", "getLocalLayoutDirection", "LocalLayoutDirection", "Landroidx/compose/ui/text/input/oilcan;", "impassible", "getLocalTextInputService", "getLocalTextInputService$annotations", "LocalTextInputService", "Landroidx/compose/ui/platform/unconsolidated;", "triweekly", "getLocalSoftwareKeyboardController", "LocalSoftwareKeyboardController", "Landroidx/compose/ui/platform/claque;", "kowloon", "getLocalTextToolbar", "LocalTextToolbar", "arytenoidectomy", "getLocalUriHandler", "LocalUriHandler", "Landroidx/compose/ui/platform/outmarry;", "monoploid", "getLocalViewConfiguration", "LocalViewConfiguration", "Landroidx/compose/ui/platform/homozygous;", "polloi", "getLocalWindowInfo", "LocalWindowInfo", "Lstarveling/polloi;", "molybdenite", "getLocalPointerIconService", "LocalPointerIconService", "", "graveside", "LocalProvidableScrollCaptureInProgress", "Landroidx/compose/runtime/preprohormone;", "()Landroidx/compose/runtime/preprohormone;", "LocalScrollCaptureInProgress", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CompositionLocalsKt {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<impromptu> f7283attabal = androidx.compose.runtime.stratoscope.taiyuan(new Function0<impromptu>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAccessibilityManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final impromptu invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<sealless.impromptu> f7297saneness = androidx.compose.runtime.stratoscope.taiyuan(new Function0<sealless.impromptu>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofill$1
        @Override // p002kotlin.jvm.functions.Function0
        public final sealless.impromptu invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<sealless.preprohormone> f7287dern = androidx.compose.runtime.stratoscope.taiyuan(new Function0<sealless.preprohormone>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillTree$1
        @Override // p002kotlin.jvm.functions.Function0
        public final sealless.preprohormone invoke() {
            CompositionLocalsKt.marial("LocalAutofillTree");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<hydrovane> f7300wireman = androidx.compose.runtime.stratoscope.taiyuan(new Function0<hydrovane>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboardManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final hydrovane invoke() {
            CompositionLocalsKt.marial("LocalClipboardManager");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<restrictive.milliradian> f7293marial = androidx.compose.runtime.stratoscope.taiyuan(new Function0<restrictive.milliradian>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalGraphicsContext$1
        @Override // p002kotlin.jvm.functions.Function0
        public final restrictive.milliradian invoke() {
            CompositionLocalsKt.marial("LocalGraphicsContext");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<milliradian.wireman> f7284beachfront = androidx.compose.runtime.stratoscope.taiyuan(new Function0<milliradian.wireman>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalDensity$1
        @Override // p002kotlin.jvm.functions.Function0
        public final milliradian.wireman invoke() {
            CompositionLocalsKt.marial("LocalDensity");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<androidx.compose.ui.focus.impromptu> f7285competently = androidx.compose.runtime.stratoscope.taiyuan(new Function0<androidx.compose.ui.focus.impromptu>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFocusManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final androidx.compose.ui.focus.impromptu invoke() {
            CompositionLocalsKt.marial("LocalFocusManager");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<androidx.compose.ui.text.font.impromptu.saneness> f7291impromptu = androidx.compose.runtime.stratoscope.taiyuan(new Function0<androidx.compose.ui.text.font.impromptu.saneness>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontLoader$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final androidx.compose.ui.text.font.impromptu.saneness invoke() {
            CompositionLocalsKt.marial("LocalFontLoader");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<androidx.compose.ui.text.font.taiyuan.saneness> f7298taiyuan = androidx.compose.runtime.stratoscope.taiyuan(new Function0<androidx.compose.ui.text.font.taiyuan.saneness>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontFamilyResolver$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final androidx.compose.ui.text.font.taiyuan.saneness invoke() {
            CompositionLocalsKt.marial("LocalFontFamilyResolver");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<grimness.attabal> f7286cutely = androidx.compose.runtime.stratoscope.taiyuan(new Function0<grimness.attabal>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalHapticFeedback$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final grimness.attabal invoke() {
            CompositionLocalsKt.marial("LocalHapticFeedback");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<saran.saneness> f7281apical = androidx.compose.runtime.stratoscope.taiyuan(new Function0<saran.saneness>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalInputModeManager$1
        @Override // p002kotlin.jvm.functions.Function0
        public final saran.saneness invoke() {
            CompositionLocalsKt.marial("LocalInputManager");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<LayoutDirection> f7288formularize = androidx.compose.runtime.stratoscope.taiyuan(new Function0<LayoutDirection>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLayoutDirection$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final LayoutDirection invoke() {
            CompositionLocalsKt.marial("LocalLayoutDirection");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<androidx.compose.ui.text.input.oilcan> f7290impassible = androidx.compose.runtime.stratoscope.taiyuan(new Function0<androidx.compose.ui.text.input.oilcan>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextInputService$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final androidx.compose.ui.text.input.oilcan invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<unconsolidated> f7299triweekly = androidx.compose.runtime.stratoscope.taiyuan(new Function0<unconsolidated>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalSoftwareKeyboardController$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final unconsolidated invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<claque> f7292kowloon = androidx.compose.runtime.stratoscope.taiyuan(new Function0<claque>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextToolbar$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final claque invoke() {
            CompositionLocalsKt.marial("LocalTextToolbar");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<hardpan> f7282arytenoidectomy = androidx.compose.runtime.stratoscope.taiyuan(new Function0<hardpan>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalUriHandler$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final hardpan invoke() {
            CompositionLocalsKt.marial("LocalUriHandler");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<outmarry> f7295monoploid = androidx.compose.runtime.stratoscope.taiyuan(new Function0<outmarry>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalViewConfiguration$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final outmarry invoke() {
            CompositionLocalsKt.marial("LocalViewConfiguration");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<homozygous> f7296polloi = androidx.compose.runtime.stratoscope.taiyuan(new Function0<homozygous>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalWindowInfo$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final homozygous invoke() {
            CompositionLocalsKt.marial("LocalWindowInfo");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<starveling.polloi> f7294molybdenite = androidx.compose.runtime.stratoscope.taiyuan(new Function0<starveling.polloi>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalPointerIconService$1
        @Override // p002kotlin.jvm.functions.Function0
        public final starveling.polloi invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<Boolean> f7289graveside = androidx.compose.runtime.stratoscope.impromptu(null, new Function0<Boolean>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }, 1, null);

    public static final void attabal(final androidx.compose.ui.node.peridotite peridotiteVar, final hardpan hardpanVar, final Function2<? super androidx.compose.runtime.taiyuan, ? super Integer, Unit> function2, androidx.compose.runtime.taiyuan taiyuanVar, final int i) {
        int i2;
        androidx.compose.runtime.taiyuan taiyuanVarAttabal = taiyuanVar.attabal(874662829);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? taiyuanVarAttabal.molybdenite(peridotiteVar) : taiyuanVarAttabal.impassible(peridotiteVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? taiyuanVarAttabal.molybdenite(hardpanVar) : taiyuanVarAttabal.impassible(hardpanVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= taiyuanVarAttabal.impassible(function2) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) == 146 && taiyuanVarAttabal.saneness()) {
            taiyuanVarAttabal.kowloon();
        } else {
            if (androidx.compose.runtime.polloi.grimness()) {
                androidx.compose.runtime.polloi.mathsort(874662829, i2, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:214)");
            }
            androidx.compose.runtime.stratoscope.wireman(new androidx.compose.runtime.claque[]{f7283attabal.wireman(peridotiteVar.getAccessibilityManager()), f7297saneness.wireman(peridotiteVar.getAutofill()), f7287dern.wireman(peridotiteVar.getAutofillTree()), f7300wireman.wireman(peridotiteVar.getClipboardManager()), f7284beachfront.wireman(peridotiteVar.getDensity()), f7285competently.wireman(peridotiteVar.getFocusOwner()), f7291impromptu.marial(peridotiteVar.getFontLoader()), f7298taiyuan.marial(peridotiteVar.getFontFamilyResolver()), f7286cutely.wireman(peridotiteVar.getHapticFeedBack()), f7281apical.wireman(peridotiteVar.getInputModeManager()), f7288formularize.wireman(peridotiteVar.getLayoutDirection()), f7290impassible.wireman(peridotiteVar.getTextInputService()), f7299triweekly.wireman(peridotiteVar.getSoftwareKeyboardController()), f7292kowloon.wireman(peridotiteVar.getTextToolbar()), f7282arytenoidectomy.wireman(hardpanVar), f7295monoploid.wireman(peridotiteVar.getViewConfiguration()), f7296polloi.wireman(peridotiteVar.getWindowInfo()), f7294molybdenite.wireman(peridotiteVar.getPointerIconService()), f7293marial.wireman(peridotiteVar.getGraphicsContext())}, function2, taiyuanVarAttabal, ((i2 >> 3) & 112) | androidx.compose.runtime.claque.f5860taiyuan);
            if (androidx.compose.runtime.polloi.grimness()) {
                androidx.compose.runtime.polloi.peridotite();
            }
        }
        licking lickingVarDern = taiyuanVarAttabal.dern();
        if (lickingVarDern != null) {
            lickingVarDern.attabal(new Function2<androidx.compose.runtime.taiyuan, Integer, Unit>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // p002kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.taiyuan taiyuanVar2, Integer num) {
                    invoke(taiyuanVar2, num.intValue());
                    return Unit.f29295attabal;
                }

                public final void invoke(androidx.compose.runtime.taiyuan taiyuanVar2, int i3) {
                    CompositionLocalsKt.attabal(peridotiteVar, hardpanVar, function2, taiyuanVar2, androidx.compose.runtime.outmarry.attabal(i | 1));
                }
            });
        }
    }

    public static final androidx.compose.runtime.unconsolidated<Boolean> dern() {
        return f7289graveside;
    }

    public static final Void marial(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final androidx.compose.runtime.preprohormone<Boolean> wireman() {
        return f7289graveside;
    }
}
