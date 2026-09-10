package apical;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.impassible;
import androidx.collection.splinterproof;
import java.util.ArrayList;

/* JADX INFO: compiled from: SupportActionModeWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront extends ActionMode {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f14234attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final saneness f14235saneness;

    /* JADX INFO: compiled from: SupportActionModeWrapper.java */
    public static class attabal implements saneness.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ActionMode.Callback f14236attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Context f14238saneness;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final ArrayList<beachfront> f14237dern = new ArrayList<>();

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final splinterproof<Menu, Menu> f14239wireman = new splinterproof<>();

        public attabal(Context context, ActionMode.Callback callback) {
            this.f14238saneness = context;
            this.f14236attabal = callback;
        }

        @Override // apical.saneness.attabal
        public boolean attabal(saneness sanenessVar, MenuItem menuItem) {
            return this.f14236attabal.onActionItemClicked(marial(sanenessVar), new androidx.appcompat.view.menu.impromptu(this.f14238saneness, (julian.saneness) menuItem));
        }

        public final Menu beachfront(Menu menu) {
            Menu menu2 = this.f14239wireman.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            impassible impassibleVar = new impassible(this.f14238saneness, (julian.attabal) menu);
            this.f14239wireman.put(menu, impassibleVar);
            return impassibleVar;
        }

        @Override // apical.saneness.attabal
        public boolean dern(saneness sanenessVar, Menu menu) {
            return this.f14236attabal.onCreateActionMode(marial(sanenessVar), beachfront(menu));
        }

        public ActionMode marial(saneness sanenessVar) {
            int size = this.f14237dern.size();
            for (int i = 0; i < size; i++) {
                beachfront beachfrontVar = this.f14237dern.get(i);
                if (beachfrontVar != null && beachfrontVar.f14235saneness == sanenessVar) {
                    return beachfrontVar;
                }
            }
            beachfront beachfrontVar2 = new beachfront(this.f14238saneness, sanenessVar);
            this.f14237dern.add(beachfrontVar2);
            return beachfrontVar2;
        }

        @Override // apical.saneness.attabal
        public boolean saneness(saneness sanenessVar, Menu menu) {
            return this.f14236attabal.onPrepareActionMode(marial(sanenessVar), beachfront(menu));
        }

        @Override // apical.saneness.attabal
        public void wireman(saneness sanenessVar) {
            this.f14236attabal.onDestroyActionMode(marial(sanenessVar));
        }
    }

    public beachfront(Context context, saneness sanenessVar) {
        this.f14234attabal = context;
        this.f14235saneness = sanenessVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f14235saneness.dern();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f14235saneness.wireman();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new impassible(this.f14234attabal, (julian.attabal) this.f14235saneness.marial());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f14235saneness.beachfront();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f14235saneness.competently();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f14235saneness.impromptu();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f14235saneness.taiyuan();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f14235saneness.cutely();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f14235saneness.apical();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f14235saneness.formularize();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f14235saneness.impassible(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f14235saneness.kowloon(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f14235saneness.arytenoidectomy(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f14235saneness.polloi(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f14235saneness.molybdenite(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f14235saneness.triweekly(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f14235saneness.monoploid(i);
    }
}
