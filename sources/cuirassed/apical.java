package cuirassed;

import androidx.collection.ScatterSet;
import androidx.collection.grimness;
import androidx.collection.mathsort;
import androidx.collection.saran;
import androidx.compose.runtime.basify;
import androidx.compose.runtime.immediately;
import androidx.compose.runtime.rajahship;
import androidx.compose.runtime.technofreak;
import androidx.compose.runtime.tectonization;
import com.ironsource.C3700q2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: RememberEventDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0003J\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u0003J\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0003J\u001d\u0010\u001f\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020!0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R \u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0-0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010)R$\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u000201\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00102R$\u00106\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001d\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00105R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcuirassed/apical;", "Landroidx/compose/runtime/immediately;", "<init>", "()V", "", "Landroidx/compose/runtime/basify;", "abandoning", "Loilcan/beachfront;", "traceContext", "", "formularize", "(Ljava/util/Set;Loilcan/beachfront;)V", "beachfront", "Landroidx/compose/runtime/tectonization;", C3700q2.p, "marial", "(Landroidx/compose/runtime/tectonization;)V", "wireman", "Landroidx/compose/runtime/competently;", "attabal", "(Landroidx/compose/runtime/competently;)V", "Landroidx/compose/runtime/technofreak;", "scope", "dern", "(Landroidx/compose/runtime/technofreak;)V", "saneness", "taiyuan", "cutely", "competently", "Landroidx/compose/runtime/collection/dern;", "list", "impromptu", "(Landroidx/compose/runtime/collection/dern;)V", "", "impassible", "(Ljava/lang/Object;)V", "Ljava/util/Set;", "Loilcan/beachfront;", "Landroidx/compose/runtime/collection/dern;", "remembering", "Landroidx/collection/saran;", "Landroidx/collection/saran;", "rememberSet", "currentRememberingList", "leaving", "Lkotlin/Function0;", "sideEffects", "releasing", "Landroidx/collection/grimness;", "Lcuirassed/competently;", "Landroidx/collection/grimness;", "pausedPlaceholders", "Landroidx/compose/runtime/rajahship;", "Ljava/util/ArrayList;", "nestedRemembersLists", "Landroidx/collection/ScatterSet;", "apical", "Landroidx/collection/ScatterSet;", "ignoreLeavingSet", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class apical implements immediately {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public ScatterSet<tectonization> ignoreLeavingSet;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public Set<basify> abandoning;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<Object> leaving;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<Function0<Unit>> sideEffects;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public ArrayList nestedRemembersLists;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<tectonization> remembering;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public saran<androidx.compose.runtime.competently> releasing;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.runtime.collection.dern<tectonization> currentRememberingList;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public oilcan.beachfront traceContext;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public grimness<technofreak, competently> pausedPlaceholders;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public saran<tectonization> rememberSet;

    public apical() {
        androidx.compose.runtime.collection.dern<tectonization> dernVar = new androidx.compose.runtime.collection.dern<>(new tectonization[16], 0);
        this.remembering = dernVar;
        this.rememberSet = mathsort.attabal();
        this.currentRememberingList = dernVar;
        this.leaving = new androidx.compose.runtime.collection.dern<>(new Object[16], 0);
        this.sideEffects = new androidx.compose.runtime.collection.dern<>(new Function0[16], 0);
    }

    public static final boolean apical(tectonization tectonizationVar, androidx.compose.runtime.collection.dern<tectonization> dernVar) {
        tectonization[] tectonizationVarArr = dernVar.content;
        int size = dernVar.getSize();
        for (int i = 0; i < size; i++) {
            basify wrapped = tectonizationVarArr[i].getWrapped();
            if (wrapped instanceof competently) {
                androidx.compose.runtime.collection.dern<tectonization> dernVarAttabal = ((competently) wrapped).attabal();
                if (dernVarAttabal.monoploid(tectonizationVar) || apical(tectonizationVar, dernVarAttabal)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.immediately
    public void attabal(androidx.compose.runtime.competently instance) {
        saran<androidx.compose.runtime.competently> saranVarAttabal = this.releasing;
        if (saranVarAttabal == null) {
            saranVarAttabal = mathsort.attabal();
            this.releasing = saranVarAttabal;
        }
        saranVarAttabal.rotuma(instance);
        impassible(instance);
    }

    public final void beachfront() {
        this.abandoning = null;
        this.traceContext = null;
        this.remembering.impromptu();
        this.rememberSet.impassible();
        this.currentRememberingList = this.remembering;
        this.leaving.impromptu();
        this.sideEffects.impromptu();
        this.releasing = null;
        this.pausedPlaceholders = null;
        this.nestedRemembersLists = null;
    }

    public final void competently() {
        Set<basify> set = this.abandoning;
        if (set == null || set.isEmpty()) {
            return;
        }
        Object objAttabal = polloi.f24276attabal.attabal("Compose:abandons");
        try {
            Iterator<basify> it = set.iterator();
            while (it.hasNext()) {
                basify next = it.next();
                it.remove();
                next.marial();
            }
            Unit unit = Unit.f29295attabal;
        } finally {
            polloi.f24276attabal.saneness(objAttabal);
        }
    }

    public final void cutely() {
        if (this.sideEffects.getSize() != 0) {
            Object objAttabal = polloi.f24276attabal.attabal("Compose:sideeffects");
            try {
                androidx.compose.runtime.collection.dern<Function0<Unit>> dernVar = this.sideEffects;
                Function0<Unit>[] function0Arr = dernVar.content;
                int size = dernVar.getSize();
                for (int i = 0; i < size; i++) {
                    function0Arr[i].invoke();
                }
                this.sideEffects.impromptu();
                Unit unit = Unit.f29295attabal;
            } finally {
                polloi.f24276attabal.saneness(objAttabal);
            }
        }
    }

    @Override // androidx.compose.runtime.immediately
    public void dern(technofreak scope) {
        grimness<technofreak, competently> grimnessVar = this.pausedPlaceholders;
        competently competentlyVarDern = grimnessVar != null ? grimnessVar.dern(scope) : null;
        if (competentlyVarDern != null) {
            ArrayList arrayListDern = this.nestedRemembersLists;
            if (arrayListDern == null) {
                arrayListDern = rajahship.dern(null, 1, null);
                this.nestedRemembersLists = arrayListDern;
            }
            rajahship.cutely(arrayListDern, this.currentRememberingList);
            this.currentRememberingList = competentlyVarDern.attabal();
        }
    }

    public final void formularize(Set<basify> abandoning, oilcan.beachfront traceContext) {
        beachfront();
        this.abandoning = abandoning;
        this.traceContext = traceContext;
    }

    public final void impassible(Object instance) {
        this.leaving.saneness(instance);
    }

    public final void impromptu(androidx.compose.runtime.collection.dern<tectonization> list) {
        Set<basify> set = this.abandoning;
        if (set == null) {
            return;
        }
        tectonization[] tectonizationVarArr = list.content;
        int size = list.getSize();
        for (int i = 0; i < size; i++) {
            tectonization tectonizationVar = tectonizationVarArr[i];
            basify wrapped = tectonizationVar.getWrapped();
            set.remove(wrapped);
            try {
                wrapped.wireman();
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                oilcan.beachfront beachfrontVar = this.traceContext;
                if (beachfrontVar != null) {
                    beachfrontVar.wireman(th, tectonizationVar);
                }
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.immediately
    public void marial(tectonization instance) {
        this.currentRememberingList.saneness(instance);
        this.rememberSet.impromptu(instance);
    }

    @Override // androidx.compose.runtime.immediately
    public void saneness(technofreak scope) {
        androidx.compose.runtime.collection.dern<tectonization> dernVar;
        grimness<technofreak, competently> grimnessVar = this.pausedPlaceholders;
        if (grimnessVar == null || grimnessVar.dern(scope) == null) {
            return;
        }
        ArrayList arrayList = this.nestedRemembersLists;
        if (arrayList != null && (dernVar = (androidx.compose.runtime.collection.dern) rajahship.taiyuan(arrayList)) != null) {
            this.currentRememberingList = dernVar;
        }
        grimnessVar.monoploid(scope);
    }

    public final void taiyuan() {
        Set<basify> set = this.abandoning;
        if (set == null) {
            return;
        }
        this.ignoreLeavingSet = null;
        if (this.leaving.getSize() != 0) {
            Object objAttabal = polloi.f24276attabal.attabal("Compose:onForgotten");
            try {
                saran<androidx.compose.runtime.competently> saranVar = this.releasing;
                int size = this.leaving.getSize();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = this.leaving.content[size];
                    try {
                        if (obj instanceof tectonization) {
                            basify wrapped = ((tectonization) obj).getWrapped();
                            set.remove(wrapped);
                            wrapped.beachfront();
                        }
                        if (obj instanceof androidx.compose.runtime.competently) {
                            if (saranVar == null || !saranVar.attabal((androidx.compose.runtime.competently) obj)) {
                                ((androidx.compose.runtime.competently) obj).dern();
                            } else {
                                ((androidx.compose.runtime.competently) obj).saneness();
                            }
                        }
                        Unit unit = Unit.f29295attabal;
                    } catch (Throwable th) {
                        oilcan.beachfront beachfrontVar = this.traceContext;
                        if (beachfrontVar != null) {
                            beachfrontVar.wireman(th, obj);
                        }
                        throw th;
                    }
                }
                Unit unit2 = Unit.f29295attabal;
                polloi.f24276attabal.saneness(objAttabal);
            } catch (Throwable th2) {
                polloi.f24276attabal.saneness(objAttabal);
                throw th2;
            }
        }
        if (this.remembering.getSize() != 0) {
            Object objAttabal2 = polloi.f24276attabal.attabal("Compose:onRemembered");
            try {
                impromptu(this.remembering);
                Unit unit3 = Unit.f29295attabal;
            } finally {
                polloi.f24276attabal.saneness(objAttabal2);
            }
        }
    }

    @Override // androidx.compose.runtime.immediately
    public void wireman(tectonization instance) {
        if (this.rememberSet.attabal(instance)) {
            this.rememberSet.preprohormone(instance);
            if (!this.currentRememberingList.monoploid(instance) && !this.remembering.monoploid(instance)) {
                apical(instance, this.remembering);
            }
            Set<basify> set = this.abandoning;
            if (set == null) {
                return;
            } else {
                set.add(instance.getWrapped());
            }
        }
        ScatterSet<tectonization> scatterSet = this.ignoreLeavingSet;
        if (scatterSet == null || !scatterSet.attabal(instance)) {
            impassible(instance);
        }
    }
}
