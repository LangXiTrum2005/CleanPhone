package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: BaseMenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class saneness implements apical {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f4977adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public Context f4978arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f4979dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public formularize f4980gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public apical.attabal f4981graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Context f4982kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public LayoutInflater f4983molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public marial f4984monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public LayoutInflater f4985polloi;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public int f4986rotuma;

    public saneness(Context context, int i, int i2) {
        this.f4982kowloon = context;
        this.f4985polloi = LayoutInflater.from(context);
        this.f4977adultoid = i;
        this.f4979dovishness = i2;
    }

    public apical.attabal beachfront() {
        return this.f4981graveside;
    }

    @Override // androidx.appcompat.view.menu.apical
    public boolean collapseItemActionView(marial marialVar, competently competentlyVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View competently(competently competentlyVar, View view, ViewGroup viewGroup) {
        formularize.attabal attabalVarWireman = view instanceof formularize.attabal ? (formularize.attabal) view : wireman(viewGroup);
        dern(competentlyVar, attabalVarWireman);
        return (View) attabalVarWireman;
    }

    public abstract boolean cutely(int i, competently competentlyVar);

    public abstract void dern(competently competentlyVar, formularize.attabal attabalVar);

    @Override // androidx.appcompat.view.menu.apical
    public boolean expandItemActionView(marial marialVar, competently competentlyVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.apical
    public int getId() {
        return this.f4986rotuma;
    }

    public formularize impromptu(ViewGroup viewGroup) {
        if (this.f4980gintrap == null) {
            formularize formularizeVar = (formularize) this.f4985polloi.inflate(this.f4977adultoid, viewGroup, false);
            this.f4980gintrap = formularizeVar;
            formularizeVar.initialize(this.f4984monoploid);
            updateMenuView(true);
        }
        return this.f4980gintrap;
    }

    @Override // androidx.appcompat.view.menu.apical
    public void initForMenu(Context context, marial marialVar) {
        this.f4978arytenoidectomy = context;
        this.f4983molybdenite = LayoutInflater.from(context);
        this.f4984monoploid = marialVar;
    }

    public boolean marial(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // androidx.appcompat.view.menu.apical
    public void onCloseMenu(marial marialVar, boolean z) {
        apical.attabal attabalVar = this.f4981graveside;
        if (attabalVar != null) {
            attabalVar.onCloseMenu(marialVar, z);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.apical
    public boolean onSubMenuSelected(arytenoidectomy arytenoidectomyVar) {
        apical.attabal attabalVar = this.f4981graveside;
        marial marialVar = arytenoidectomyVar;
        if (attabalVar == null) {
            return false;
        }
        if (arytenoidectomyVar == null) {
            marialVar = this.f4984monoploid;
        }
        return attabalVar.attabal(marialVar);
    }

    public void saneness(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f4980gintrap).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.apical
    public void setCallback(apical.attabal attabalVar) {
        this.f4981graveside = attabalVar;
    }

    public void taiyuan(int i) {
        this.f4986rotuma = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.apical
    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f4980gintrap;
        if (viewGroup == null) {
            return;
        }
        marial marialVar = this.f4984monoploid;
        int i = 0;
        if (marialVar != null) {
            marialVar.graveside();
            ArrayList<competently> arrayListKattegat = this.f4984monoploid.kattegat();
            int size = arrayListKattegat.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                competently competentlyVar = arrayListKattegat.get(i3);
                if (cutely(i2, competentlyVar)) {
                    View childAt = viewGroup.getChildAt(i2);
                    competently itemData = childAt instanceof formularize.attabal ? ((formularize.attabal) childAt).getItemData() : null;
                    View viewCompetently = competently(competentlyVar, childAt, viewGroup);
                    if (competentlyVar != itemData) {
                        viewCompetently.setPressed(false);
                        viewCompetently.jumpDrawablesToCurrentState();
                    }
                    if (viewCompetently != childAt) {
                        saneness(viewCompetently, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!marial(viewGroup, i)) {
                i++;
            }
        }
    }

    public formularize.attabal wireman(ViewGroup viewGroup) {
        return (formularize.attabal) this.f4985polloi.inflate(this.f4979dovishness, viewGroup, false);
    }
}
