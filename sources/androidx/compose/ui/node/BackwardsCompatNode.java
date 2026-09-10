package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.input.pointer.PointerEventPass;
import com.ironsource.Y3;
import java.util.HashSet;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BackwardsCompatNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u001b\u0010\u001d\u001a\u00020\u00142\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\"\u0010\u0016J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0016J&\u0010*\u001a\u00020)*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0013\u0010-\u001a\u00020\u0014*\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020\u0014*\u00020/H\u0016¢\u0006\u0004\b0\u00101J*\u00108\u001a\u00020\u00142\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0014H\u0016¢\u0006\u0004\b:\u0010\u0016J\u000f\u0010;\u001a\u00020\u0017H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0017H\u0016¢\u0006\u0004\b=\u0010<J\u001f\u0010A\u001a\u0004\u0018\u00010?*\u00020>2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u00142\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u00020\u00142\u0006\u0010G\u001a\u000206H\u0016ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00142\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bJ\u0010FJ\u0017\u0010M\u001a\u00020\u00142\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00142\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bT\u0010UR*\u0010\u0011\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\u0013R\u0016\u0010^\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR:\u0010k\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030d0cj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030d`e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0018\u0010n\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006t"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "Landroidx/compose/ui/node/graveside;", "Landroidx/compose/ui/node/apical;", "Landroidx/compose/ui/node/premeiotic;", "Landroidx/compose/ui/node/dent;", "Landroidx/compose/ui/modifier/competently;", "Landroidx/compose/ui/modifier/cutely;", "Landroidx/compose/ui/node/splinterproof;", "Landroidx/compose/ui/node/molybdenite;", "Landroidx/compose/ui/node/impassible;", "Landroidx/compose/ui/focus/wireman;", "Landroidx/compose/ui/focus/impassible;", "Landroidx/compose/ui/focus/polloi;", "Landroidx/compose/ui/node/mathsort;", "Lkattegat/attabal;", "Landroidx/compose/ui/attabal$dern;", "Landroidx/compose/ui/attabal$saneness;", "element", "<init>", "(Landroidx/compose/ui/attabal$saneness;)V", "", "palmyra", "()V", "", "duringAttach", "igbo", "(Z)V", "lightstruck", "Landroidx/compose/ui/modifier/taiyuan;", "julian", "(Landroidx/compose/ui/modifier/taiyuan;)V", "cultivated", "premeiotic", "supplicat", "gusty", "monroe", "Landroidx/compose/ui/layout/monoploid;", "Landroidx/compose/ui/layout/triweekly;", "measurable", "Lmilliradian/saneness;", "constraints", "Landroidx/compose/ui/layout/arytenoidectomy;", "attabal", "(Landroidx/compose/ui/layout/monoploid;Landroidx/compose/ui/layout/triweekly;J)Landroidx/compose/ui/layout/arytenoidectomy;", "Lmerc/dern;", "beachfront", "(Lmerc/dern;)V", "Landroidx/compose/ui/semantics/monoploid;", "polder", "(Landroidx/compose/ui/semantics/monoploid;)V", "Lstarveling/impassible;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lmilliradian/monoploid;", "bounds", "dovishness", "(Lstarveling/impassible;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "kattegat", "merc", "()Z", "kowloon", "Lmilliradian/wireman;", "", "parentData", "competently", "(Lmilliradian/wireman;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/competently;", Y3.f, "impromptu", "(Landroidx/compose/ui/layout/competently;)V", "size", "saneness", "(J)V", "dern", "Landroidx/compose/ui/focus/molybdenite;", "focusState", "taiyuan", "(Landroidx/compose/ui/focus/molybdenite;)V", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "yemenite", "(Landroidx/compose/ui/focus/FocusProperties;)V", "", "toString", "()Ljava/lang/String;", "value", "stratoscope", "Landroidx/compose/ui/attabal$saneness;", "preterite", "()Landroidx/compose/ui/attabal$saneness;", "picketboat", "trm", "Z", "invalidateCache", "Landroidx/compose/ui/modifier/attabal;", "oilcan", "Landroidx/compose/ui/modifier/attabal;", "_providedValues", "Ljava/util/HashSet;", "Landroidx/compose/ui/modifier/dern;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "wostteth", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "readValues", "sealless", "Landroidx/compose/ui/layout/competently;", "lastOnPlacedCoordinates", "Landroidx/compose/ui/modifier/beachfront;", "arytenoidectomy", "()Landroidx/compose/ui/modifier/beachfront;", "providedValues", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BackwardsCompatNode extends androidx.compose.ui.attabal.dern implements graveside, apical, premeiotic, dent, androidx.compose.ui.modifier.competently, androidx.compose.ui.modifier.cutely, splinterproof, molybdenite, impassible, androidx.compose.ui.focus.wireman, androidx.compose.ui.focus.impassible, androidx.compose.ui.focus.polloi, mathsort, kattegat.attabal {

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.modifier.attabal _providedValues;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.layout.competently lastOnPlacedCoordinates;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.attabal.saneness element;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public boolean invalidateCache;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public HashSet<androidx.compose.ui.modifier.dern<?>> readValues;

    /* JADX INFO: compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/node/BackwardsCompatNode$attabal", "Landroidx/compose/ui/node/peridotite$saneness;", "", "wireman", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements peridotite.saneness {
        public attabal() {
        }

        @Override // androidx.compose.ui.node.peridotite.saneness
        public void wireman() {
            if (BackwardsCompatNode.this.lastOnPlacedCoordinates == null) {
                BackwardsCompatNode backwardsCompatNode = BackwardsCompatNode.this;
                backwardsCompatNode.dern(beachfront.competently(backwardsCompatNode, saran.attabal(128)));
            }
        }
    }

    public BackwardsCompatNode(androidx.compose.ui.attabal.saneness sanenessVar) {
        lotta(privatdozent.beachfront(sanenessVar));
        this.element = sanenessVar;
        this.invalidateCache = true;
        this.readValues = new HashSet<>();
    }

    @Override // androidx.compose.ui.modifier.competently
    public androidx.compose.ui.modifier.beachfront arytenoidectomy() {
        androidx.compose.ui.modifier.attabal attabalVar = this._providedValues;
        return attabalVar != null ? attabalVar : androidx.compose.ui.modifier.impromptu.attabal();
    }

    @Override // androidx.compose.ui.node.graveside
    public androidx.compose.ui.layout.arytenoidectomy attabal(androidx.compose.ui.layout.monoploid monoploidVar, androidx.compose.ui.layout.triweekly triweeklyVar, long j) {
        androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        Intrinsics.competently(sanenessVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.cutely) sanenessVar).attabal(monoploidVar, triweeklyVar, j);
    }

    @Override // androidx.compose.ui.node.apical
    public void beachfront(merc.dern dernVar) {
        androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        Intrinsics.competently(sanenessVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        kattegat.wireman wiremanVar = (kattegat.wireman) sanenessVar;
        if (this.invalidateCache && (sanenessVar instanceof kattegat.dern)) {
            lightstruck();
        }
        wiremanVar.beachfront(dernVar);
    }

    @Override // androidx.compose.ui.node.splinterproof
    public Object competently(milliradian.wireman wiremanVar, Object obj) {
        androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        Intrinsics.competently(sanenessVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((androidx.compose.ui.layout.dovishness) sanenessVar).competently(wiremanVar, obj);
    }

    @Override // androidx.compose.ui.attabal.dern
    public void cultivated() {
        igbo(true);
    }

    @Override // androidx.compose.ui.node.molybdenite
    public void dern(androidx.compose.ui.layout.competently coordinates) {
        this.lastOnPlacedCoordinates = coordinates;
        androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        if (sanenessVar instanceof androidx.compose.ui.layout.molybdenite) {
            ((androidx.compose.ui.layout.molybdenite) sanenessVar).dern(coordinates);
        }
    }

    @Override // androidx.compose.ui.node.dent
    public void dovishness(starveling.impassible pointerEvent, PointerEventPass pass, long bounds) {
        androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        Intrinsics.competently(sanenessVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((starveling.stratoscope) sanenessVar).arytenoidectomy();
        throw null;
    }

    public final void gusty() {
        this.invalidateCache = true;
        formularize.attabal(this);
    }

    public final void igbo(boolean duringAttach) {
        if (!getIsAttached()) {
            peridotite.attabal.saneness("initializeModifier called on unattached node");
        }
        androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        if ((saran.attabal(32) & getKindSet()) != 0) {
            if (sanenessVar instanceof androidx.compose.ui.modifier.wireman) {
                czestochowa(new Function0<Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$2
                    {
                        super(0);
                    }

                    @Override // p002kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f29295attabal;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.monroe();
                    }
                });
            }
            if (sanenessVar instanceof androidx.compose.ui.modifier.taiyuan) {
                julian((androidx.compose.ui.modifier.taiyuan) sanenessVar);
            }
        }
        if ((saran.attabal(4) & getKindSet()) != 0) {
            if (sanenessVar instanceof kattegat.dern) {
                this.invalidateCache = true;
            }
            if (!duringAttach) {
                gintrap.attabal(this);
            }
        }
        if ((saran.attabal(2) & getKindSet()) != 0) {
            if (BackwardsCompatNodeKt.marial(this)) {
                NodeCoordinator coordinator = getCoordinator();
                Intrinsics.beachfront(coordinator);
                ((adultoid) coordinator).wittig(this);
                coordinator.saccharic();
            }
            if (!duringAttach) {
                gintrap.attabal(this);
                beachfront.impromptu(this).underbelly();
            }
        }
        if (sanenessVar instanceof androidx.compose.ui.layout.preprohormone) {
            ((androidx.compose.ui.layout.preprohormone) sanenessVar).formularize(beachfront.impromptu(this));
        }
        if ((saran.attabal(128) & getKindSet()) != 0) {
            if ((sanenessVar instanceof androidx.compose.ui.layout.graveside) && BackwardsCompatNodeKt.marial(this)) {
                beachfront.impromptu(this).underbelly();
            }
            if (sanenessVar instanceof androidx.compose.ui.layout.molybdenite) {
                this.lastOnPlacedCoordinates = null;
                if (BackwardsCompatNodeKt.marial(this)) {
                    beachfront.taiyuan(this).impassible(new attabal());
                }
            }
        }
        if ((saran.attabal(256) & getKindSet()) != 0 && (sanenessVar instanceof androidx.compose.ui.layout.polloi) && BackwardsCompatNodeKt.marial(this)) {
            beachfront.impromptu(this).underbelly();
        }
        if (sanenessVar instanceof androidx.compose.ui.focus.monoploid) {
            ((androidx.compose.ui.focus.monoploid) sanenessVar).apical().marial().saneness(this);
        }
        if ((saran.attabal(16) & getKindSet()) != 0 && (sanenessVar instanceof starveling.stratoscope)) {
            ((starveling.stratoscope) sanenessVar).arytenoidectomy();
            getCoordinator();
            throw null;
        }
        if ((saran.attabal(8) & getKindSet()) != 0) {
            beachfront.taiyuan(this).rotuma();
        }
    }

    @Override // androidx.compose.ui.node.impassible
    public void impromptu(androidx.compose.ui.layout.competently coordinates) {
        androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        Intrinsics.competently(sanenessVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((androidx.compose.ui.layout.polloi) sanenessVar).impromptu(coordinates);
    }

    public final void julian(androidx.compose.ui.modifier.taiyuan<?> element) {
        androidx.compose.ui.modifier.attabal attabalVar = this._providedValues;
        if (attabalVar != null && attabalVar.attabal(element.getKey())) {
            attabalVar.dern(element);
            beachfront.taiyuan(this).getModifierLocalManager().beachfront(this, element.getKey());
        } else {
            this._providedValues = new androidx.compose.ui.modifier.attabal(element);
            if (BackwardsCompatNodeKt.marial(this)) {
                beachfront.taiyuan(this).getModifierLocalManager().attabal(this, element.getKey());
            }
        }
    }

    @Override // androidx.compose.ui.node.dent
    public void kattegat() {
        androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        Intrinsics.competently(sanenessVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((starveling.stratoscope) sanenessVar).arytenoidectomy();
        throw null;
    }

    @Override // androidx.compose.ui.node.dent
    public boolean kowloon() {
        androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        Intrinsics.competently(sanenessVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((starveling.stratoscope) sanenessVar).arytenoidectomy();
        throw null;
    }

    public final void lightstruck() {
        final androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        if (sanenessVar instanceof kattegat.dern) {
            beachfront.taiyuan(this).getSnapshotObserver().taiyuan(this, BackwardsCompatNodeKt.f6796saneness, new Function0<Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateDrawCache$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((kattegat.dern) sanenessVar).cutely(this);
                }
            });
        }
        this.invalidateCache = false;
    }

    @Override // androidx.compose.ui.node.dent
    public boolean merc() {
        androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        Intrinsics.competently(sanenessVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((starveling.stratoscope) sanenessVar).arytenoidectomy();
        throw null;
    }

    public final void monroe() {
        if (getIsAttached()) {
            this.readValues.clear();
            beachfront.taiyuan(this).getSnapshotObserver().taiyuan(this, BackwardsCompatNodeKt.f6795dern, new Function0<Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.attabal.saneness element = this.this$0.getElement();
                    Intrinsics.competently(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                    ((androidx.compose.ui.modifier.wireman) element).triweekly(this.this$0);
                }
            });
        }
    }

    @Override // androidx.compose.ui.node.mathsort
    public boolean oilcan() {
        return getIsAttached();
    }

    public final void palmyra() {
        if (!getIsAttached()) {
            peridotite.attabal.saneness("unInitializeModifier called on unattached node");
        }
        androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        if ((saran.attabal(32) & getKindSet()) != 0) {
            if (sanenessVar instanceof androidx.compose.ui.modifier.taiyuan) {
                beachfront.taiyuan(this).getModifierLocalManager().wireman(this, ((androidx.compose.ui.modifier.taiyuan) sanenessVar).getKey());
            }
            if (sanenessVar instanceof androidx.compose.ui.modifier.wireman) {
                ((androidx.compose.ui.modifier.wireman) sanenessVar).triweekly(BackwardsCompatNodeKt.f6794attabal);
            }
        }
        if ((saran.attabal(8) & getKindSet()) != 0) {
            beachfront.taiyuan(this).rotuma();
        }
        if (sanenessVar instanceof androidx.compose.ui.focus.monoploid) {
            ((androidx.compose.ui.focus.monoploid) sanenessVar).apical().marial().monoploid(this);
        }
    }

    public final void picketboat(androidx.compose.ui.attabal.saneness sanenessVar) {
        if (getIsAttached()) {
            palmyra();
        }
        this.element = sanenessVar;
        lotta(privatdozent.beachfront(sanenessVar));
        if (getIsAttached()) {
            igbo(false);
        }
    }

    @Override // androidx.compose.ui.node.premeiotic
    public void polder(androidx.compose.ui.semantics.monoploid monoploidVar) {
        androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        Intrinsics.competently(sanenessVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        androidx.compose.ui.semantics.apical apicalVarMonoploid = ((androidx.compose.ui.semantics.formularize) sanenessVar).monoploid();
        Intrinsics.competently(monoploidVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((androidx.compose.ui.semantics.apical) monoploidVar).wireman(apicalVarMonoploid);
    }

    @Override // androidx.compose.ui.attabal.dern
    public void premeiotic() {
        palmyra();
    }

    /* JADX INFO: renamed from: preterite, reason: from getter */
    public final androidx.compose.ui.attabal.saneness getElement() {
        return this.element;
    }

    @Override // androidx.compose.ui.node.molybdenite
    public void saneness(long size) {
        androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        if (sanenessVar instanceof androidx.compose.ui.layout.graveside) {
            ((androidx.compose.ui.layout.graveside) sanenessVar).saneness(size);
        }
    }

    @Override // androidx.compose.ui.node.apical
    public void supplicat() {
        this.invalidateCache = true;
        formularize.attabal(this);
    }

    @Override // androidx.compose.ui.focus.wireman
    public void taiyuan(androidx.compose.ui.focus.molybdenite focusState) {
        androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        if (!(sanenessVar instanceof androidx.compose.ui.focus.dern)) {
            peridotite.attabal.saneness("onFocusEvent called on wrong node");
        }
        ((androidx.compose.ui.focus.dern) sanenessVar).taiyuan(focusState);
    }

    public String toString() {
        return this.element.toString();
    }

    public final HashSet<androidx.compose.ui.modifier.dern<?>> wostteth() {
        return this.readValues;
    }

    @Override // androidx.compose.ui.focus.impassible
    public void yemenite(FocusProperties focusProperties) {
        androidx.compose.ui.attabal.saneness sanenessVar = this.element;
        if (!(sanenessVar instanceof androidx.compose.ui.focus.cutely)) {
            peridotite.attabal.saneness("applyFocusProperties called on wrong node");
        }
        ((androidx.compose.ui.focus.cutely) sanenessVar).kowloon(new androidx.compose.ui.focus.taiyuan(focusProperties));
    }
}
