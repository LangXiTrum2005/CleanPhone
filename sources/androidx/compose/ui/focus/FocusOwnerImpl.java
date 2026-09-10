package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.restrictive;
import androidx.compose.ui.node.kattegat;
import androidx.compose.ui.node.saran;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FocusOwnerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u007f\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0014\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ2\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\"\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t0\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J(\u0010'\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001a\u0010)\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020 H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00042\u0006\u0010/\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00042\u0006\u0010/\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0011\u00108\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u0010\u0017J\u0015\u0010=\u001a\u0004\u0018\u00010<*\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u001a\u0010?\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010*R*\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010@R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010DR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010DR\"\u0010J\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u00101R\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010LR\u001a\u0010Q\u001a\u00020N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010O\u001a\u0004\bA\u0010PR\u001a\u0010U\u001a\u00020R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010S\u001a\u0004\bE\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010[\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006]"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestApplyChangesListener", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/saneness;", "Lsupplicat/taiyuan;", "", "onRequestFocusForOwner", "onMoveFocusInterop", "onClearFocusForOwner", "onFocusRectInterop", "Landroidx/compose/ui/unit/LayoutDirection;", "onLayoutDirection", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "focusDirection", "previouslyFocusedRect", "impassible", "(Landroidx/compose/ui/focus/saneness;Lsupplicat/taiyuan;)Z", "triweekly", "()V", "force", "kowloon", "(Z)V", "refreshFocusEvents", "clearOwnerFocus", "taiyuan", "(ZZZI)Z", "focusedRect", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "impromptu", "(ILsupplicat/taiyuan;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "Lprivatdozent/saneness;", "keyEvent", "onFocusedItem", "competently", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "wireman", "(Landroid/view/KeyEvent;)Z", "Lwalach/dern;", NotificationCompat.CATEGORY_EVENT, "arytenoidectomy", "(Lwalach/dern;)Z", "node", "marial", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/wireman;", "attabal", "(Landroidx/compose/ui/focus/wireman;)V", "Landroidx/compose/ui/focus/impassible;", "apical", "(Landroidx/compose/ui/focus/impassible;)V", "formularize", "()Lsupplicat/taiyuan;", "molybdenite", "Landroidx/compose/ui/node/marial;", "Landroidx/compose/ui/attabal$dern;", "graveside", "(Landroidx/compose/ui/node/marial;)Landroidx/compose/ui/attabal$dern;", "adultoid", "Lkotlin/jvm/functions/Function2;", "saneness", "Lkotlin/jvm/functions/Function1;", "dern", "Lkotlin/jvm/functions/Function0;", "beachfront", "Landroidx/compose/ui/focus/FocusTargetNode;", "polloi", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setRootFocusNode$ui_release", "rootFocusNode", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "focusInvalidationManager", "Landroidx/compose/ui/focus/adultoid;", "Landroidx/compose/ui/focus/adultoid;", "()Landroidx/compose/ui/focus/adultoid;", "focusTransactionManager", "Landroidx/compose/ui/attabal;", "Landroidx/compose/ui/attabal;", "()Landroidx/compose/ui/attabal;", "modifier", "Landroidx/collection/restrictive;", "cutely", "Landroidx/collection/restrictive;", "keysCurrentlyDown", "Landroidx/compose/ui/focus/molybdenite;", "()Landroidx/compose/ui/focus/molybdenite;", "rootState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusOwnerImpl implements FocusOwner {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function2<saneness, supplicat.taiyuan, Boolean> onRequestFocusForOwner;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final FocusInvalidationManager focusInvalidationManager;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public restrictive keysCurrentlyDown;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Function0<Unit> onClearFocusForOwner;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final Function0<LayoutDirection> onLayoutDirection;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Function1<saneness, Boolean> onMoveFocusInterop;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final Function0<supplicat.taiyuan> onFocusRectInterop;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public FocusTargetNode rootFocusNode = new FocusTargetNode();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final adultoid focusTransactionManager = new adultoid();

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.attabal modifier = formularize.attabal(androidx.compose.ui.attabal.INSTANCE, new Function1<FocusProperties, Unit>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FocusProperties focusProperties) {
            invoke2(focusProperties);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FocusProperties focusProperties) {
            focusProperties.apical(false);
        }
    }).impassible(new kattegat<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        public boolean equals(Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.kattegat
        /* JADX INFO: renamed from: graveside, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode polloi() {
            return this.f6413saneness.getRootFocusNode();
        }

        public int hashCode() {
            return this.f6413saneness.getRootFocusNode().hashCode();
        }

        @Override // androidx.compose.ui.node.kattegat
        /* JADX INFO: renamed from: adultoid, reason: merged with bridge method [inline-methods] */
        public void molybdenite(FocusTargetNode node) {
        }
    });

    /* JADX INFO: compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f6412attabal;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6412attabal = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOwnerImpl(Function1<? super Function0<Unit>, Unit> function1, Function2<? super saneness, ? super supplicat.taiyuan, Boolean> function2, Function1<? super saneness, Boolean> function3, Function0<Unit> function0, Function0<supplicat.taiyuan> function4, Function0<? extends LayoutDirection> function5) {
        this.onRequestFocusForOwner = function2;
        this.onMoveFocusInterop = function3;
        this.onClearFocusForOwner = function0;
        this.onFocusRectInterop = function4;
        this.onLayoutDirection = function5;
        this.focusInvalidationManager = new FocusInvalidationManager(function1, new FocusOwnerImpl$focusInvalidationManager$1(this));
    }

    public final boolean adultoid(KeyEvent keyEvent) {
        long jAttabal = privatdozent.wireman.attabal(keyEvent);
        int iSaneness = privatdozent.wireman.saneness(keyEvent);
        privatdozent.dern.Companion companion = privatdozent.dern.INSTANCE;
        if (privatdozent.dern.beachfront(iSaneness, companion.attabal())) {
            restrictive restrictiveVar = this.keysCurrentlyDown;
            if (restrictiveVar == null) {
                restrictiveVar = new restrictive(3);
                this.keysCurrentlyDown = restrictiveVar;
            }
            restrictiveVar.formularize(jAttabal);
        } else if (privatdozent.dern.beachfront(iSaneness, companion.saneness())) {
            restrictive restrictiveVar2 = this.keysCurrentlyDown;
            if (restrictiveVar2 == null || !restrictiveVar2.attabal(jAttabal)) {
                return false;
            }
            restrictive restrictiveVar3 = this.keysCurrentlyDown;
            if (restrictiveVar3 != null) {
                restrictiveVar3.impassible(jAttabal);
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void apical(impassible node) {
        this.focusInvalidationManager.beachfront(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean arytenoidectomy(walach.RotaryScrollEvent r15) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.arytenoidectomy(walach.dern):boolean");
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void attabal(wireman node) {
        this.focusInvalidationManager.marial(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public androidx.compose.ui.attabal getModifier() {
        return this.modifier;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x016c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0171  */
    /* JADX WARN: Code duplicated, block: B:228:0x0313  */
    /* JADX WARN: Code duplicated, block: B:304:0x0168 A[EDGE_INSN: B:304:0x0168->B:101:0x0168 BREAK  A[LOOP:14: B:62:0x00eb->B:309:0x00eb, LOOP_LABEL: LOOP:14: B:62:0x00eb->B:309:0x00eb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00df  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fc A[ADDED_TO_REGION, LOOP:15: B:65:0x00fc->B:93:0x014f, LOOP_START, PHI: r10
  0x00fc: PHI (r10v9 androidx.compose.ui.attabal$dern) = (r10v4 androidx.compose.ui.attabal$dern), (r10v10 androidx.compose.ui.attabal$dern) binds: [B:64:0x00fa, B:93:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:73:0x010e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean competently(android.view.KeyEvent r17, p002kotlin.jvm.functions.Function0<java.lang.Boolean> r18) {
        /*
            Method dump skipped, instruction units count: 801
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.competently(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public molybdenite cutely() {
        return this.rootFocusNode.lightstruck();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public supplicat.taiyuan formularize() {
        FocusTargetNode focusTargetNodeSaneness = dovishness.saneness(this.rootFocusNode);
        if (focusTargetNodeSaneness != null) {
            return dovishness.wireman(focusTargetNodeSaneness);
        }
        return null;
    }

    public final androidx.compose.ui.attabal.dern graveside(androidx.compose.ui.node.marial marialVar) {
        int iAttabal = saran.attabal(1024) | saran.attabal(8192);
        if (!marialVar.getNode().getIsAttached()) {
            peridotite.attabal.saneness("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.attabal.dern node = marialVar.getNode();
        androidx.compose.ui.attabal.dern dernVar = null;
        if ((node.getAggregateChildKindSet() & iAttabal) != 0) {
            for (androidx.compose.ui.attabal.dern child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iAttabal) != 0) {
                    if ((saran.attabal(1024) & child.getKindSet()) != 0) {
                        return dernVar;
                    }
                    dernVar = child;
                }
            }
        }
        return dernVar;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean impassible(saneness focusDirection, supplicat.taiyuan previouslyFocusedRect) {
        return this.onRequestFocusForOwner.invoke(focusDirection, previouslyFocusedRect).booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Boolean impromptu(int focusDirection, supplicat.taiyuan focusedRect, final Function1<? super FocusTargetNode, Boolean> onFound) {
        final FocusTargetNode focusTargetNodeSaneness = dovishness.saneness(this.rootFocusNode);
        if (focusTargetNodeSaneness != null) {
            FocusRequester focusRequesterAttabal = dovishness.attabal(focusTargetNodeSaneness, focusDirection, this.onLayoutDirection.invoke());
            FocusRequester.Companion companion = FocusRequester.INSTANCE;
            if (Intrinsics.wireman(focusRequesterAttabal, companion.attabal())) {
                return null;
            }
            if (!Intrinsics.wireman(focusRequesterAttabal, companion.saneness())) {
                return Boolean.valueOf(focusRequesterAttabal.dern(onFound));
            }
        } else {
            focusTargetNodeSaneness = null;
        }
        return dovishness.marial(this.rootFocusNode, focusDirection, this.onLayoutDirection.invoke(), focusedRect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                boolean zBooleanValue;
                if (Intrinsics.wireman(focusTargetNode, focusTargetNodeSaneness)) {
                    zBooleanValue = false;
                } else {
                    if (Intrinsics.wireman(focusTargetNode, this.getRootFocusNode())) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = onFound.invoke(focusTargetNode).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            }
        });
    }

    @Override // androidx.compose.ui.focus.impromptu
    public void kowloon(boolean force) {
        taiyuan(force, true, true, saneness.INSTANCE.dern());
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void marial(FocusTargetNode node) {
        this.focusInvalidationManager.competently(node);
    }

    public final void molybdenite() {
        if (this.rootFocusNode.lightstruck() == FocusStateImpl.Inactive) {
            this.onClearFocusForOwner.invoke();
        }
    }

    /* JADX INFO: renamed from: polloi, reason: from getter */
    public final FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: saneness, reason: from getter */
    public adultoid getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean taiyuan(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection) {
        boolean zDern;
        adultoid focusTransactionManager = getFocusTransactionManager();
        FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 = new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // p002kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f29295attabal;
            }
        };
        try {
            if (focusTransactionManager.ongoingTransaction) {
                focusTransactionManager.competently();
            }
            focusTransactionManager.beachfront();
            if (focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 != null) {
                focusTransactionManager.cancellationListener.saneness(focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1);
            }
            if (!force) {
                int i = attabal.f6412attabal[FocusTransactionsKt.marial(this.rootFocusNode, focusDirection).ordinal()];
                zDern = (i == 1 || i == 2 || i == 3) ? false : FocusTransactionsKt.dern(this.rootFocusNode, force, refreshFocusEvents);
            }
            focusTransactionManager.impromptu();
            if (zDern && clearOwnerFocus) {
                this.onClearFocusForOwner.invoke();
            }
            return zDern;
        } catch (Throwable th) {
            focusTransactionManager.impromptu();
            throw th;
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void triweekly() {
        adultoid focusTransactionManager = getFocusTransactionManager();
        if (focusTransactionManager.ongoingTransaction) {
            FocusTransactionsKt.dern(this.rootFocusNode, true, true);
            return;
        }
        try {
            focusTransactionManager.beachfront();
            FocusTransactionsKt.dern(this.rootFocusNode, true, true);
        } finally {
            focusTransactionManager.impromptu();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean wireman(android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.wireman(android.view.KeyEvent):boolean");
    }
}
