package adultoid;

import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.cosy;
import androidx.compose.runtime.graveside;
import androidx.compose.runtime.immediately;
import androidx.compose.runtime.lerp;
import androidx.compose.runtime.molybdenite;
import androidx.compose.runtime.nosophobia;
import androidx.compose.runtime.supplicat;
import androidx.compose.runtime.technofreak;
import androidx.compose.runtime.tectonization;
import cuirassed.IntRef;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ChangeList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J3\u0010\u0012\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010 \u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001d2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001e¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\u0003J\u0017\u0010-\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\b¢\u0006\u0004\b/\u0010\u0003J\u0015\u00100\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\b¢\u0006\u0004\b2\u0010\u0003J\r\u00103\u001a\u00020\b¢\u0006\u0004\b3\u0010\u0003J\r\u00104\u001a\u00020\b¢\u0006\u0004\b4\u0010\u0003J\u001d\u00107\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J%\u0010;\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u00106\u001a\u0002052\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u001e¢\u0006\u0004\b>\u0010*J)\u0010C\u001a\u00020\b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0?2\u0006\u0010B\u001a\u00020@¢\u0006\u0004\bC\u0010DJ\u001d\u0010G\u001a\u00020\b2\u0006\u0010E\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020\u001e¢\u0006\u0004\bG\u0010HJ%\u0010J\u001a\u00020\b2\u0006\u0010I\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u001e¢\u0006\u0004\bJ\u0010KJ\u0015\u0010M\u001a\u00020\b2\u0006\u0010L\u001a\u00020\u001e¢\u0006\u0004\bM\u0010*J\u0015\u0010N\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001e¢\u0006\u0004\bN\u0010*J\u001d\u0010Q\u001a\u00020\b2\u000e\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0O¢\u0006\u0004\bQ\u0010RJ\u001d\u0010U\u001a\u00020\b2\u0006\u0010T\u001a\u00020S2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\bU\u0010VJ%\u0010Y\u001a\u00020\b2\u000e\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0W2\u0006\u0010X\u001a\u00020S¢\u0006\u0004\bY\u0010ZJ/\u0010`\u001a\u00020\b2\b\u0010\\\u001a\u0004\u0018\u00010[2\u0006\u0010^\u001a\u00020]2\u0006\u00106\u001a\u00020_2\u0006\u0010I\u001a\u00020_¢\u0006\u0004\b`\u0010aJ%\u0010d\u001a\u00020\b2\u0006\u0010B\u001a\u00020b2\u0006\u0010^\u001a\u00020]2\u0006\u0010c\u001a\u00020_¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\b¢\u0006\u0004\bf\u0010\u0003J!\u0010h\u001a\u00020\b2\u0006\u0010g\u001a\u00020\u00002\n\b\u0002\u0010X\u001a\u0004\u0018\u00010S¢\u0006\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010k¨\u0006m"}, d2 = {"Ladultoid/attabal;", "Ladultoid/cutely;", "<init>", "()V", "", "dern", "()Z", "wireman", "", "attabal", "Landroidx/compose/runtime/wireman;", "applier", "Landroidx/compose/runtime/cig;", "slots", "Landroidx/compose/runtime/immediately;", "rememberManager", "Ladultoid/beachfront;", "errorContext", "saneness", "(Landroidx/compose/runtime/wireman;Landroidx/compose/runtime/cig;Landroidx/compose/runtime/immediately;Ladultoid/beachfront;)V", "Landroidx/compose/runtime/tectonization;", "value", "gintrap", "(Landroidx/compose/runtime/tectonization;)V", "Landroidx/compose/runtime/technofreak;", "scope", "stratoscope", "(Landroidx/compose/runtime/technofreak;)V", "triweekly", "", "", "groupSlotIndex", "sealless", "(Ljava/lang/Object;I)V", "Landroidx/compose/runtime/saneness;", "anchor", "oilcan", "(Ljava/lang/Object;Landroidx/compose/runtime/saneness;I)V", "beachfront", "(Landroidx/compose/runtime/saneness;Ljava/lang/Object;)V", "count", "trm", "(I)V", "cord", "data", "yemenite", "(Ljava/lang/Object;)V", "arytenoidectomy", "kowloon", "(Landroidx/compose/runtime/saneness;)V", "formularize", "cuirassed", "rotuma", "Landroidx/compose/runtime/cosy;", "from", "polloi", "(Landroidx/compose/runtime/saneness;Landroidx/compose/runtime/cosy;)V", "Ladultoid/dern;", "fixups", "molybdenite", "(Landroidx/compose/runtime/saneness;Landroidx/compose/runtime/cosy;Ladultoid/dern;)V", "offset", "graveside", "Lkotlin/Function1;", "Landroidx/compose/runtime/molybdenite;", "action", "composition", "apical", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/molybdenite;)V", "removeFrom", "moveCount", "preprohormone", "(II)V", "to", "adultoid", "(III)V", "distance", "marial", "kattegat", "", "nodes", "cutely", "([Ljava/lang/Object;)V", "Lcuirassed/beachfront;", "effectiveNodeIndexOut", "taiyuan", "(Lcuirassed/beachfront;Landroidx/compose/runtime/saneness;)V", "", "effectiveNodeIndex", "competently", "(Ljava/util/List;Lcuirassed/beachfront;)V", "Landroidx/compose/runtime/lerp;", "resolvedState", "Landroidx/compose/runtime/graveside;", "parentContext", "Landroidx/compose/runtime/nosophobia;", "impromptu", "(Landroidx/compose/runtime/lerp;Landroidx/compose/runtime/graveside;Landroidx/compose/runtime/nosophobia;Landroidx/compose/runtime/nosophobia;)V", "Landroidx/compose/runtime/supplicat;", "reference", "dovishness", "(Landroidx/compose/runtime/supplicat;Landroidx/compose/runtime/graveside;Landroidx/compose/runtime/nosophobia;)V", "impassible", "changeList", "monoploid", "(Ladultoid/attabal;Lcuirassed/beachfront;)V", "Ladultoid/taiyuan;", "Ladultoid/taiyuan;", "operations", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class attabal extends cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final taiyuan operations = new taiyuan();

    public final void adultoid(int to, int from, int count) {
        taiyuan taiyuanVar = this.operations;
        wireman.monoploid monoploidVar = wireman.monoploid.f3800dern;
        taiyuanVar.cutely(monoploidVar);
        taiyuan taiyuanVarAttabal = taiyuan.saneness.attabal(taiyuanVar);
        int ints = taiyuanVarAttabal.intArgsSize - taiyuanVarAttabal.opCodes[taiyuanVarAttabal.opCodesSize - 1].getInts();
        int[] iArr = taiyuanVarAttabal.intArgs;
        iArr[ints + 1] = to;
        iArr[ints] = from;
        iArr[ints + 2] = count;
        taiyuanVar.dern(monoploidVar);
    }

    public final void apical(Function1<? super molybdenite, Unit> action, molybdenite composition) {
        taiyuan taiyuanVar = this.operations;
        wireman.impromptu impromptuVar = wireman.impromptu.f3796dern;
        taiyuanVar.cutely(impromptuVar);
        taiyuan.saneness.dern(taiyuan.saneness.attabal(taiyuanVar), wireman.polloi.attabal(0), action, wireman.polloi.attabal(1), composition);
        taiyuanVar.dern(impromptuVar);
    }

    public final void arytenoidectomy() {
        this.operations.taiyuan(wireman.impassible.f3795dern);
    }

    public final void attabal() {
        this.operations.attabal();
    }

    public final void beachfront(androidx.compose.runtime.saneness anchor, Object value) {
        taiyuan taiyuanVar = this.operations;
        wireman.saneness sanenessVar = wireman.saneness.f3804dern;
        taiyuanVar.cutely(sanenessVar);
        taiyuan.saneness.dern(taiyuan.saneness.attabal(taiyuanVar), wireman.polloi.attabal(0), anchor, wireman.polloi.attabal(1), value);
        taiyuanVar.dern(sanenessVar);
    }

    public final void competently(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        if (nodes.isEmpty()) {
            return;
        }
        taiyuan taiyuanVar = this.operations;
        wireman.C0002wireman c0002wireman = wireman.C0002wireman.f3809dern;
        taiyuanVar.cutely(c0002wireman);
        taiyuan.saneness.dern(taiyuan.saneness.attabal(taiyuanVar), wireman.polloi.attabal(1), nodes, wireman.polloi.attabal(0), effectiveNodeIndex);
        taiyuanVar.dern(c0002wireman);
    }

    public final void cord() {
        this.operations.taiyuan(wireman.gintrap.f3793dern);
    }

    public final void cuirassed() {
        this.operations.taiyuan(wireman.rotuma.f3803dern);
    }

    public final void cutely(Object[] nodes) {
        if (nodes.length == 0) {
            return;
        }
        taiyuan taiyuanVar = this.operations;
        wireman.competently competentlyVar = wireman.competently.f3786dern;
        taiyuanVar.cutely(competentlyVar);
        taiyuan.saneness.saneness(taiyuan.saneness.attabal(taiyuanVar), wireman.polloi.attabal(0), nodes);
        taiyuanVar.dern(competentlyVar);
    }

    public final boolean dern() {
        return this.operations.beachfront();
    }

    public final void dovishness(supplicat composition, graveside parentContext, nosophobia reference) {
        taiyuan taiyuanVar = this.operations;
        wireman.molybdenite molybdeniteVar = wireman.molybdenite.f3799dern;
        taiyuanVar.cutely(molybdeniteVar);
        taiyuan.saneness.marial(taiyuan.saneness.attabal(taiyuanVar), wireman.polloi.attabal(0), composition, wireman.polloi.attabal(1), parentContext, wireman.polloi.attabal(2), reference);
        taiyuanVar.dern(molybdeniteVar);
    }

    public final void formularize() {
        this.operations.taiyuan(wireman.taiyuan.f3806dern);
    }

    public final void gintrap(tectonization value) {
        taiyuan taiyuanVar = this.operations;
        wireman.graveside gravesideVar = wireman.graveside.f3794dern;
        taiyuanVar.cutely(gravesideVar);
        taiyuan.saneness.saneness(taiyuan.saneness.attabal(taiyuanVar), wireman.polloi.attabal(0), value);
        taiyuanVar.dern(gravesideVar);
    }

    public final void graveside(int offset) {
        taiyuan taiyuanVar = this.operations;
        wireman.arytenoidectomy arytenoidectomyVar = wireman.arytenoidectomy.f3783dern;
        taiyuanVar.cutely(arytenoidectomyVar);
        taiyuan taiyuanVarAttabal = taiyuan.saneness.attabal(taiyuanVar);
        taiyuanVarAttabal.intArgs[taiyuanVarAttabal.intArgsSize - taiyuanVarAttabal.opCodes[taiyuanVarAttabal.opCodesSize - 1].getInts()] = offset;
        taiyuanVar.dern(arytenoidectomyVar);
    }

    public final void impassible() {
        this.operations.taiyuan(wireman.cutely.f3789dern);
    }

    public final void impromptu(lerp resolvedState, graveside parentContext, nosophobia from, nosophobia to) {
        taiyuan taiyuanVar = this.operations;
        wireman.marial marialVar = wireman.marial.f3798dern;
        taiyuanVar.cutely(marialVar);
        taiyuan.saneness.wireman(taiyuan.saneness.attabal(taiyuanVar), wireman.polloi.attabal(0), resolvedState, wireman.polloi.attabal(1), parentContext, wireman.polloi.attabal(3), to, wireman.polloi.attabal(2), from);
        taiyuanVar.dern(marialVar);
    }

    public final void kattegat(int count) {
        taiyuan taiyuanVar = this.operations;
        wireman.oilcan oilcanVar = wireman.oilcan.f3801dern;
        taiyuanVar.cutely(oilcanVar);
        taiyuan taiyuanVarAttabal = taiyuan.saneness.attabal(taiyuanVar);
        taiyuanVarAttabal.intArgs[taiyuanVarAttabal.intArgsSize - taiyuanVarAttabal.opCodes[taiyuanVarAttabal.opCodesSize - 1].getInts()] = count;
        taiyuanVar.dern(oilcanVar);
    }

    public final void kowloon(androidx.compose.runtime.saneness anchor) {
        taiyuan taiyuanVar = this.operations;
        wireman.formularize formularizeVar = wireman.formularize.f3792dern;
        taiyuanVar.cutely(formularizeVar);
        taiyuan.saneness.saneness(taiyuan.saneness.attabal(taiyuanVar), wireman.polloi.attabal(0), anchor);
        taiyuanVar.dern(formularizeVar);
    }

    public final void marial(int distance) {
        taiyuan taiyuanVar = this.operations;
        wireman.attabal attabalVar = wireman.attabal.f3784dern;
        taiyuanVar.cutely(attabalVar);
        taiyuan taiyuanVarAttabal = taiyuan.saneness.attabal(taiyuanVar);
        taiyuanVarAttabal.intArgs[taiyuanVarAttabal.intArgsSize - taiyuanVarAttabal.opCodes[taiyuanVarAttabal.opCodesSize - 1].getInts()] = distance;
        taiyuanVar.dern(attabalVar);
    }

    public final void molybdenite(androidx.compose.runtime.saneness anchor, cosy from, dern fixups) {
        taiyuan taiyuanVar = this.operations;
        wireman.kowloon kowloonVar = wireman.kowloon.f3797dern;
        taiyuanVar.cutely(kowloonVar);
        taiyuan.saneness.marial(taiyuan.saneness.attabal(taiyuanVar), wireman.polloi.attabal(0), anchor, wireman.polloi.attabal(1), from, wireman.polloi.attabal(2), fixups);
        taiyuanVar.dern(kowloonVar);
    }

    public final void monoploid(attabal changeList, IntRef effectiveNodeIndex) {
        if (changeList.wireman()) {
            taiyuan taiyuanVar = this.operations;
            wireman.dern dernVar = wireman.dern.f3790dern;
            taiyuanVar.cutely(dernVar);
            taiyuan.saneness.dern(taiyuan.saneness.attabal(taiyuanVar), wireman.polloi.attabal(0), changeList, wireman.polloi.attabal(1), effectiveNodeIndex);
            taiyuanVar.dern(dernVar);
        }
    }

    public final void oilcan(Object value, androidx.compose.runtime.saneness anchor, int groupSlotIndex) {
        taiyuan taiyuanVar = this.operations;
        wireman.cuirassed cuirassedVar = wireman.cuirassed.f3788dern;
        taiyuanVar.cutely(cuirassedVar);
        taiyuan taiyuanVarAttabal = taiyuan.saneness.attabal(taiyuanVar);
        taiyuan.saneness.dern(taiyuanVarAttabal, wireman.polloi.attabal(0), value, wireman.polloi.attabal(1), anchor);
        taiyuanVarAttabal.intArgs[taiyuanVarAttabal.intArgsSize - taiyuanVarAttabal.opCodes[taiyuanVarAttabal.opCodesSize - 1].getInts()] = groupSlotIndex;
        taiyuanVar.dern(cuirassedVar);
    }

    public final void polloi(androidx.compose.runtime.saneness anchor, cosy from) {
        taiyuan taiyuanVar = this.operations;
        wireman.triweekly triweeklyVar = wireman.triweekly.f3807dern;
        taiyuanVar.cutely(triweeklyVar);
        taiyuan.saneness.dern(taiyuan.saneness.attabal(taiyuanVar), wireman.polloi.attabal(0), anchor, wireman.polloi.attabal(1), from);
        taiyuanVar.dern(triweeklyVar);
    }

    public final void preprohormone(int removeFrom, int moveCount) {
        taiyuan taiyuanVar = this.operations;
        wireman.dovishness dovishnessVar = wireman.dovishness.f3791dern;
        taiyuanVar.cutely(dovishnessVar);
        taiyuan taiyuanVarAttabal = taiyuan.saneness.attabal(taiyuanVar);
        int ints = taiyuanVarAttabal.intArgsSize - taiyuanVarAttabal.opCodes[taiyuanVarAttabal.opCodesSize - 1].getInts();
        int[] iArr = taiyuanVarAttabal.intArgs;
        iArr[ints] = removeFrom;
        iArr[ints + 1] = moveCount;
        taiyuanVar.dern(dovishnessVar);
    }

    public final void rotuma() {
        this.operations.taiyuan(wireman.adultoid.f3781dern);
    }

    public final void saneness(androidx.compose.runtime.wireman<?> applier, SlotWriter slots, immediately rememberManager, beachfront errorContext) {
        this.operations.wireman(applier, slots, rememberManager, errorContext);
    }

    public final void sealless(Object value, int groupSlotIndex) {
        taiyuan taiyuanVar = this.operations;
        wireman.trm trmVar = wireman.trm.f3808dern;
        taiyuanVar.cutely(trmVar);
        taiyuan taiyuanVarAttabal = taiyuan.saneness.attabal(taiyuanVar);
        taiyuan.saneness.saneness(taiyuanVarAttabal, wireman.polloi.attabal(0), value);
        taiyuanVarAttabal.intArgs[taiyuanVarAttabal.intArgsSize - taiyuanVarAttabal.opCodes[taiyuanVarAttabal.opCodesSize - 1].getInts()] = groupSlotIndex;
        taiyuanVar.dern(trmVar);
    }

    public final void stratoscope(technofreak scope) {
        taiyuan taiyuanVar = this.operations;
        wireman.preprohormone preprohormoneVar = wireman.preprohormone.f3802dern;
        taiyuanVar.cutely(preprohormoneVar);
        taiyuan.saneness.saneness(taiyuan.saneness.attabal(taiyuanVar), wireman.polloi.attabal(0), scope);
        taiyuanVar.dern(preprohormoneVar);
    }

    public final void taiyuan(IntRef effectiveNodeIndexOut, androidx.compose.runtime.saneness anchor) {
        taiyuan taiyuanVar = this.operations;
        wireman.beachfront beachfrontVar = wireman.beachfront.f3785dern;
        taiyuanVar.cutely(beachfrontVar);
        taiyuan.saneness.dern(taiyuan.saneness.attabal(taiyuanVar), wireman.polloi.attabal(0), effectiveNodeIndexOut, wireman.polloi.attabal(1), anchor);
        taiyuanVar.dern(beachfrontVar);
    }

    public final void triweekly(technofreak scope) {
        taiyuan taiyuanVar = this.operations;
        wireman.apical apicalVar = wireman.apical.f3782dern;
        taiyuanVar.cutely(apicalVar);
        taiyuan.saneness.saneness(taiyuan.saneness.attabal(taiyuanVar), wireman.polloi.attabal(0), scope);
        taiyuanVar.dern(apicalVar);
    }

    public final void trm(int count) {
        taiyuan taiyuanVar = this.operations;
        wireman.cord cordVar = wireman.cord.f3787dern;
        taiyuanVar.cutely(cordVar);
        taiyuan taiyuanVarAttabal = taiyuan.saneness.attabal(taiyuanVar);
        taiyuanVarAttabal.intArgs[taiyuanVarAttabal.intArgsSize - taiyuanVarAttabal.opCodes[taiyuanVarAttabal.opCodesSize - 1].getInts()] = count;
        taiyuanVar.dern(cordVar);
    }

    public final boolean wireman() {
        return this.operations.competently();
    }

    public final void yemenite(Object data) {
        taiyuan taiyuanVar = this.operations;
        wireman.stratoscope stratoscopeVar = wireman.stratoscope.f3805dern;
        taiyuanVar.cutely(stratoscopeVar);
        taiyuan.saneness.saneness(taiyuan.saneness.attabal(taiyuanVar), wireman.polloi.attabal(0), data);
        taiyuanVar.dern(stratoscopeVar);
    }
}
