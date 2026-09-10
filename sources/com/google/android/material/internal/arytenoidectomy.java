package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.core.view.hardpan;
import androidx.core.view.premeiotic;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: NavigationMenuPresenter.java */
/* JADX INFO: loaded from: classes3.dex */
public class arytenoidectomy implements androidx.appcompat.view.menu.apical {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public LayoutInflater f20384adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public LinearLayout f20385arytenoidectomy;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public ColorStateList f20386cord;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public int f20387creditor;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public ColorStateList f20388cuirassed;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public ColorStateList f20390gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public dern f20391graveside;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public int f20394kattegat;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public NavigationMenuView f20395kowloon;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public int f20396merc;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f20397molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public androidx.appcompat.view.menu.apical.attabal f20398monoploid;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public int f20399oilcan;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public int f20400polder;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public androidx.appcompat.view.menu.marial f20401polloi;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public int f20403privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public int f20404restrictive;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public int f20406saran;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public int f20407sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public boolean f20408seminary;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public Drawable f20410stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public int f20411supplicat;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public RippleDrawable f20412trm;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public int f20413yemenite;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f20389dovishness = 0;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public int f20405rotuma = 0;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public boolean f20402preprohormone = true;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public boolean f20392grimness = true;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public int f20409starveling = -1;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public final View.OnClickListener f20393hydrovane = new attabal();

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class apical extends formularize {
        public apical(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(bubbles.taiyuan.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public class attabal implements View.OnClickListener {
        public attabal() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            arytenoidectomy.this.starveling(true);
            androidx.appcompat.view.menu.competently itemData = ((NavigationMenuItemView) view).getItemData();
            arytenoidectomy arytenoidectomyVar = arytenoidectomy.this;
            boolean zCreditor = arytenoidectomyVar.f20401polloi.creditor(itemData, arytenoidectomyVar, 0);
            if (itemData != null && itemData.isCheckable() && zCreditor) {
                arytenoidectomy.this.f20391graveside.polloi(itemData);
            } else {
                z = false;
            }
            arytenoidectomy.this.starveling(false);
            if (z) {
                arytenoidectomy.this.updateMenuView(false);
            }
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class beachfront implements marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f20415attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f20416saneness;

        public beachfront(int i, int i2) {
            this.f20415attabal = i;
            this.f20416saneness = i2;
        }

        public int attabal() {
            return this.f20416saneness;
        }

        public int saneness() {
            return this.f20415attabal;
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class competently implements marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final androidx.appcompat.view.menu.competently f20417attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public boolean f20418saneness;

        public competently(androidx.appcompat.view.menu.competently competentlyVar) {
            this.f20417attabal = competentlyVar;
        }

        public androidx.appcompat.view.menu.competently attabal() {
            return this.f20417attabal;
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class cutely extends formularize {
        public cutely(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(bubbles.taiyuan.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public class dern extends RecyclerView.Adapter<formularize> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ArrayList<marial> f20419attabal = new ArrayList<>();

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f20420dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public androidx.appcompat.view.menu.competently f20421saneness;

        /* JADX INFO: compiled from: NavigationMenuPresenter.java */
        public class attabal extends androidx.core.view.attabal {

            /* JADX INFO: renamed from: marial, reason: collision with root package name */
            public final /* synthetic */ boolean f20424marial;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public final /* synthetic */ int f20425wireman;

            public attabal(int i, boolean z) {
                this.f20425wireman = i;
                this.f20424marial = z;
            }

            @Override // androidx.core.view.attabal
            public void competently(View view, outmarry.rotuma rotumaVar) {
                super.competently(view, rotumaVar);
                rotumaVar.gusty(outmarry.rotuma.beachfront.attabal(dern.this.competently(this.f20425wireman), 1, 1, 1, this.f20424marial, view.isSelected()));
            }
        }

        public dern() {
            kowloon();
        }

        public final void adultoid() {
            for (int i = 0; i < this.f20419attabal.size(); i++) {
                if (this.f20419attabal.get(i) instanceof beachfront) {
                    notifyItemChanged(i);
                }
            }
        }

        public int apical() {
            int i = 0;
            for (int i2 = 0; i2 < arytenoidectomy.this.f20391graveside.getItemCount(); i2++) {
                int itemViewType = arytenoidectomy.this.f20391graveside.getItemViewType(i2);
                if (itemViewType == 0 || itemViewType == 1) {
                    i++;
                }
            }
            return i;
        }

        public void arytenoidectomy(Bundle bundle) {
            androidx.appcompat.view.menu.competently competentlyVarAttabal;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            androidx.appcompat.view.menu.competently competentlyVarAttabal2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f20420dern = true;
                int size = this.f20419attabal.size();
                for (int i2 = 0; i2 < size; i2++) {
                    marial marialVar = this.f20419attabal.get(i2);
                    if ((marialVar instanceof competently) && (competentlyVarAttabal2 = ((competently) marialVar).attabal()) != null && competentlyVarAttabal2.getItemId() == i) {
                        polloi(competentlyVarAttabal2);
                        break;
                    }
                }
                this.f20420dern = false;
                kowloon();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f20419attabal.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    marial marialVar2 = this.f20419attabal.get(i3);
                    if ((marialVar2 instanceof competently) && (competentlyVarAttabal = ((competently) marialVar2).attabal()) != null && (actionView = competentlyVarAttabal.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(competentlyVarAttabal.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public final int competently(int i) {
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                if (arytenoidectomy.this.f20391graveside.getItemViewType(i3) == 2 || arytenoidectomy.this.f20391graveside.getItemViewType(i3) == 3) {
                    i2--;
                }
            }
            return i2;
        }

        public androidx.appcompat.view.menu.competently cutely() {
            return this.f20421saneness;
        }

        public final void dovishness() {
            for (int i = 0; i < this.f20419attabal.size(); i++) {
                if ((this.f20419attabal.get(i) instanceof competently) && getItemViewType(i) == 1) {
                    notifyItemChanged(i);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(formularize formularizeVar, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    beachfront beachfrontVar = (beachfront) this.f20419attabal.get(i);
                    formularizeVar.itemView.setPaddingRelative(arytenoidectomy.this.f20411supplicat, beachfrontVar.saneness(), arytenoidectomy.this.f20404restrictive, beachfrontVar.attabal());
                    return;
                }
                TextView textView = (TextView) formularizeVar.itemView;
                textView.setText(((competently) this.f20419attabal.get(i)).attabal().getTitle());
                androidx.core.widget.formularize.impassible(textView, arytenoidectomy.this.f20389dovishness);
                textView.setPaddingRelative(arytenoidectomy.this.f20396merc, textView.getPaddingTop(), arytenoidectomy.this.f20400polder, textView.getPaddingBottom());
                ColorStateList colorStateList = arytenoidectomy.this.f20390gintrap;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                monoploid(textView, i, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) formularizeVar.itemView;
            navigationMenuItemView.setIconTintList(arytenoidectomy.this.f20388cuirassed);
            navigationMenuItemView.setTextAppearance(arytenoidectomy.this.f20405rotuma);
            ColorStateList colorStateList2 = arytenoidectomy.this.f20386cord;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = arytenoidectomy.this.f20410stratoscope;
            navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = arytenoidectomy.this.f20412trm;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            competently competentlyVar = (competently) this.f20419attabal.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(competentlyVar.f20418saneness);
            arytenoidectomy arytenoidectomyVar = arytenoidectomy.this;
            int i2 = arytenoidectomyVar.f20399oilcan;
            int i3 = arytenoidectomyVar.f20413yemenite;
            navigationMenuItemView.setPadding(i2, i3, i2, i3);
            navigationMenuItemView.setIconPadding(arytenoidectomy.this.f20407sealless);
            arytenoidectomy arytenoidectomyVar2 = arytenoidectomy.this;
            if (arytenoidectomyVar2.f20408seminary) {
                navigationMenuItemView.setIconSize(arytenoidectomyVar2.f20394kattegat);
            }
            navigationMenuItemView.setMaxLines(arytenoidectomy.this.f20406saran);
            navigationMenuItemView.rotuma(competentlyVar.attabal(), arytenoidectomy.this.f20402preprohormone);
            monoploid(navigationMenuItemView, i, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f20419attabal.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            marial marialVar = this.f20419attabal.get(i);
            if (marialVar instanceof beachfront) {
                return 2;
            }
            if (marialVar instanceof wireman) {
                return 3;
            }
            if (marialVar instanceof competently) {
                return ((competently) marialVar).attabal().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public final void gintrap() {
            for (int i = 0; i < this.f20419attabal.size(); i++) {
                if ((this.f20419attabal.get(i) instanceof competently) && getItemViewType(i) == 0) {
                    notifyItemChanged(i);
                }
            }
        }

        public void graveside() {
            int size = this.f20419attabal.size();
            kowloon();
            notifyDataSetChanged();
            if (size == this.f20419attabal.size()) {
                notifyItemRangeChanged(0, this.f20419attabal.size());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public formularize onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                arytenoidectomy arytenoidectomyVar = arytenoidectomy.this;
                return new taiyuan(arytenoidectomyVar.f20384adultoid, viewGroup, arytenoidectomyVar.f20393hydrovane);
            }
            if (i == 1) {
                return new apical(arytenoidectomy.this.f20384adultoid, viewGroup);
            }
            if (i == 2) {
                return new cutely(arytenoidectomy.this.f20384adultoid, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new saneness(arytenoidectomy.this.f20385arytenoidectomy);
        }

        public final void impromptu(int i, int i2) {
            while (i < i2) {
                ((competently) this.f20419attabal.get(i)).f20418saneness = true;
                i++;
            }
        }

        public final void kowloon() {
            if (this.f20420dern) {
                return;
            }
            this.f20420dern = true;
            this.f20419attabal.clear();
            this.f20419attabal.add(new wireman());
            int size = arytenoidectomy.this.f20401polloi.kattegat().size();
            int i = -1;
            boolean z = false;
            int size2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                androidx.appcompat.view.menu.competently competentlyVar = arytenoidectomy.this.f20401polloi.kattegat().get(i2);
                if (competentlyVar.isChecked()) {
                    polloi(competentlyVar);
                }
                if (competentlyVar.isCheckable()) {
                    competentlyVar.graveside(false);
                }
                if (competentlyVar.hasSubMenu()) {
                    SubMenu subMenu = competentlyVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.f20419attabal.add(new beachfront(arytenoidectomy.this.f20387creditor, 0));
                        }
                        this.f20419attabal.add(new competently(competentlyVar));
                        int size3 = this.f20419attabal.size();
                        int size4 = subMenu.size();
                        boolean z2 = false;
                        for (int i3 = 0; i3 < size4; i3++) {
                            androidx.appcompat.view.menu.competently competentlyVar2 = (androidx.appcompat.view.menu.competently) subMenu.getItem(i3);
                            if (competentlyVar2.isVisible()) {
                                if (!z2 && competentlyVar2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (competentlyVar2.isCheckable()) {
                                    competentlyVar2.graveside(false);
                                }
                                if (competentlyVar2.isChecked()) {
                                    polloi(competentlyVar2);
                                }
                                this.f20419attabal.add(new competently(competentlyVar2));
                            }
                        }
                        if (z2) {
                            impromptu(size3, this.f20419attabal.size());
                        }
                    }
                } else {
                    int groupId = competentlyVar.getGroupId();
                    if (groupId != i) {
                        size2 = this.f20419attabal.size();
                        z = competentlyVar.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            ArrayList<marial> arrayList = this.f20419attabal;
                            int i4 = arytenoidectomy.this.f20387creditor;
                            arrayList.add(new beachfront(i4, i4));
                        }
                    } else if (!z && competentlyVar.getIcon() != null) {
                        impromptu(size2, this.f20419attabal.size());
                        z = true;
                    }
                    competently competentlyVar3 = new competently(competentlyVar);
                    competentlyVar3.f20418saneness = z;
                    this.f20419attabal.add(competentlyVar3);
                    i = groupId;
                }
            }
            this.f20420dern = false;
        }

        public void molybdenite(boolean z) {
            this.f20420dern = z;
        }

        public final void monoploid(View view, int i, boolean z) {
            premeiotic.sayid(view, new attabal(i, z));
        }

        public void polloi(androidx.appcompat.view.menu.competently competentlyVar) {
            if (this.f20421saneness == competentlyVar || !competentlyVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.competently competentlyVar2 = this.f20421saneness;
            if (competentlyVar2 != null) {
                competentlyVar2.setChecked(false);
            }
            this.f20421saneness = competentlyVar;
            competentlyVar.setChecked(true);
        }

        public Bundle taiyuan() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.competently competentlyVar = this.f20421saneness;
            if (competentlyVar != null) {
                bundle.putInt("android:menu:checked", competentlyVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f20419attabal.size();
            for (int i = 0; i < size; i++) {
                marial marialVar = this.f20419attabal.get(i);
                if (marialVar instanceof competently) {
                    androidx.appcompat.view.menu.competently competentlyVarAttabal = ((competently) marialVar).attabal();
                    View actionView = competentlyVarAttabal != null ? competentlyVarAttabal.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(competentlyVarAttabal.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(formularize formularizeVar) {
            if (formularizeVar instanceof taiyuan) {
                ((NavigationMenuItemView) formularizeVar.itemView).preprohormone();
            }
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static abstract class formularize extends RecyclerView.stratoscope {
        public formularize(View view) {
            super(view);
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public class impromptu extends androidx.recyclerview.widget.apical {
        public impromptu(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.apical, androidx.core.view.attabal
        public void competently(View view, outmarry.rotuma rotumaVar) {
            super.competently(view, rotumaVar);
            rotumaVar.igbo(outmarry.rotuma.marial.attabal(arytenoidectomy.this.f20391graveside.apical(), 1, false));
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public interface marial {
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class saneness extends formularize {
        public saneness(View view) {
            super(view);
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class taiyuan extends formularize {
        public taiyuan(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(bubbles.taiyuan.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class wireman implements marial {
    }

    public void adultoid(View view) {
        this.f20385arytenoidectomy.removeView(view);
        if (molybdenite()) {
            return;
        }
        NavigationMenuView navigationMenuView = this.f20395kowloon;
        navigationMenuView.setPadding(0, this.f20403privatdozent, 0, navigationMenuView.getPaddingBottom());
    }

    public int apical() {
        return this.f20407sealless;
    }

    public androidx.appcompat.view.menu.formularize arytenoidectomy(ViewGroup viewGroup) {
        if (this.f20395kowloon == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f20384adultoid.inflate(bubbles.taiyuan.design_navigation_menu, viewGroup, false);
            this.f20395kowloon = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new impromptu(this.f20395kowloon));
            if (this.f20391graveside == null) {
                dern dernVar = new dern();
                this.f20391graveside = dernVar;
                dernVar.setHasStableIds(true);
            }
            int i = this.f20409starveling;
            if (i != -1) {
                this.f20395kowloon.setOverScrollMode(i);
            }
            LinearLayout linearLayout = (LinearLayout) this.f20384adultoid.inflate(bubbles.taiyuan.design_navigation_item_header, (ViewGroup) this.f20395kowloon, false);
            this.f20385arytenoidectomy = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            this.f20395kowloon.setAdapter(this.f20391graveside);
        }
        return this.f20395kowloon;
    }

    public int beachfront() {
        return this.f20411supplicat;
    }

    @Override // androidx.appcompat.view.menu.apical
    public boolean collapseItemActionView(androidx.appcompat.view.menu.marial marialVar, androidx.appcompat.view.menu.competently competentlyVar) {
        return false;
    }

    public int competently() {
        return this.f20385arytenoidectomy.getChildCount();
    }

    public void cord(int i) {
        this.f20397molybdenite = i;
    }

    public void creditor(int i) {
        this.f20389dovishness = i;
        walach();
    }

    public void cuirassed(Drawable drawable) {
        this.f20410stratoscope = drawable;
        peridotite();
    }

    public int cutely() {
        return this.f20399oilcan;
    }

    public void dern(hardpan hardpanVar) {
        int iImpassible = hardpanVar.impassible();
        if (this.f20403privatdozent != iImpassible) {
            this.f20403privatdozent = iImpassible;
            mathsort();
        }
        NavigationMenuView navigationMenuView = this.f20395kowloon;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, hardpanVar.cutely());
        premeiotic.competently(this.f20385arytenoidectomy, hardpanVar);
    }

    public void dovishness(boolean z) {
        if (this.f20392grimness != z) {
            this.f20392grimness = z;
            mathsort();
        }
    }

    @Override // androidx.appcompat.view.menu.apical
    public boolean expandItemActionView(androidx.appcompat.view.menu.marial marialVar, androidx.appcompat.view.menu.competently competentlyVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.apical
    public boolean flagActionItems() {
        return false;
    }

    public int formularize() {
        return this.f20406saran;
    }

    @Override // androidx.appcompat.view.menu.apical
    public int getId() {
        return this.f20397molybdenite;
    }

    public void gintrap(androidx.appcompat.view.menu.competently competentlyVar) {
        this.f20391graveside.polloi(competentlyVar);
    }

    public View graveside(int i) {
        View viewInflate = this.f20384adultoid.inflate(i, (ViewGroup) this.f20385arytenoidectomy, false);
        saneness(viewInflate);
        return viewInflate;
    }

    public void grimness(ColorStateList colorStateList) {
        this.f20390gintrap = colorStateList;
        walach();
    }

    public final void hydrovane() {
        dern dernVar = this.f20391graveside;
        if (dernVar != null) {
            dernVar.adultoid();
        }
    }

    public ColorStateList impassible() {
        return this.f20386cord;
    }

    public View impromptu(int i) {
        return this.f20385arytenoidectomy.getChildAt(i);
    }

    @Override // androidx.appcompat.view.menu.apical
    public void initForMenu(Context context, androidx.appcompat.view.menu.marial marialVar) {
        this.f20384adultoid = LayoutInflater.from(context);
        this.f20401polloi = marialVar;
        this.f20387creditor = context.getResources().getDimensionPixelOffset(bubbles.marial.design_navigation_separator_vertical_padding);
    }

    public void kattegat(int i) {
        this.f20406saran = i;
        peridotite();
    }

    public int kowloon() {
        return this.f20413yemenite;
    }

    public int marial() {
        return this.f20404restrictive;
    }

    public final void mathsort() {
        int i = (molybdenite() || !this.f20392grimness) ? 0 : this.f20403privatdozent;
        NavigationMenuView navigationMenuView = this.f20395kowloon;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    public void merc(ColorStateList colorStateList) {
        this.f20386cord = colorStateList;
        peridotite();
    }

    public final boolean molybdenite() {
        return competently() > 0;
    }

    public int monoploid() {
        return this.f20400polder;
    }

    public void oilcan(int i) {
        this.f20407sealless = i;
        peridotite();
    }

    @Override // androidx.appcompat.view.menu.apical
    public void onCloseMenu(androidx.appcompat.view.menu.marial marialVar, boolean z) {
        androidx.appcompat.view.menu.apical.attabal attabalVar = this.f20398monoploid;
        if (attabalVar != null) {
            attabalVar.onCloseMenu(marialVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.apical
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(ListMenuPresenter.VIEWS_TAG);
            if (sparseParcelableArray != null) {
                this.f20395kowloon.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f20391graveside.arytenoidectomy(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f20385arytenoidectomy.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.apical
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.f20395kowloon != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f20395kowloon.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(ListMenuPresenter.VIEWS_TAG, sparseArray);
        }
        dern dernVar = this.f20391graveside;
        if (dernVar != null) {
            bundle.putBundle("android:menu:adapter", dernVar.taiyuan());
        }
        if (this.f20385arytenoidectomy != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f20385arytenoidectomy.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.apical
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.arytenoidectomy arytenoidectomyVar) {
        return false;
    }

    public final void peridotite() {
        dern dernVar = this.f20391graveside;
        if (dernVar != null) {
            dernVar.gintrap();
        }
    }

    public void polder(int i) {
        this.f20413yemenite = i;
        peridotite();
    }

    public int polloi() {
        return this.f20396merc;
    }

    public void preprohormone(int i) {
        this.f20411supplicat = i;
        hydrovane();
    }

    public void privatdozent(int i) {
        this.f20396merc = i;
        walach();
    }

    public void restrictive(boolean z) {
        this.f20402preprohormone = z;
        peridotite();
    }

    public void rotuma(int i) {
        this.f20404restrictive = i;
        hydrovane();
    }

    public void saneness(View view) {
        this.f20385arytenoidectomy.addView(view);
        NavigationMenuView navigationMenuView = this.f20395kowloon;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void saran(int i) {
        this.f20400polder = i;
        walach();
    }

    public void sealless(ColorStateList colorStateList) {
        this.f20388cuirassed = colorStateList;
        peridotite();
    }

    public void seminary(int i) {
        this.f20409starveling = i;
        NavigationMenuView navigationMenuView = this.f20395kowloon;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    public void starveling(boolean z) {
        dern dernVar = this.f20391graveside;
        if (dernVar != null) {
            dernVar.molybdenite(z);
        }
    }

    public void stratoscope(RippleDrawable rippleDrawable) {
        this.f20412trm = rippleDrawable;
        peridotite();
    }

    public void supplicat(int i) {
        this.f20405rotuma = i;
        peridotite();
    }

    public Drawable taiyuan() {
        return this.f20410stratoscope;
    }

    public ColorStateList triweekly() {
        return this.f20388cuirassed;
    }

    public void trm(int i) {
        this.f20399oilcan = i;
        peridotite();
    }

    @Override // androidx.appcompat.view.menu.apical
    public void updateMenuView(boolean z) {
        dern dernVar = this.f20391graveside;
        if (dernVar != null) {
            dernVar.graveside();
        }
    }

    public final void walach() {
        dern dernVar = this.f20391graveside;
        if (dernVar != null) {
            dernVar.dovishness();
        }
    }

    public androidx.appcompat.view.menu.competently wireman() {
        return this.f20391graveside.cutely();
    }

    public void yemenite(int i) {
        if (this.f20394kattegat != i) {
            this.f20394kattegat = i;
            this.f20408seminary = true;
            peridotite();
        }
    }
}
