package com.charging.screenshow.battery.animations.themes.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.activity.x;
import com.charging.screenshow.battery.animations.themes.databinding.ItemChargingCategoryBinding;
import com.charging.screenshow.battery.animations.themes.entity.ChargingCategoryBean;
import com.charging.screenshow.battery.animations.themes.fragment.HomeFrag$initViews$1;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.view.CustomItemDecoration;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/ChargingCategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/charging/screenshow/battery/animations/themes/adapter/ChargingCategoryAdapter$VH;", "OnItemClickListener", "VH", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChargingCategoryAdapter extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FragmentActivity f13070i;
    public final ArrayList j;
    public ChargingHorizontalAdapter k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HomeFrag$initViews$1 f13071l;
    public final CustomItemDecoration m;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/ChargingCategoryAdapter$OnItemClickListener;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnItemClickListener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/ChargingCategoryAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VH extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ItemChargingCategoryBinding f13072c;
    }

    public ChargingCategoryAdapter(FragmentActivity fragmentActivity, ArrayList list) {
        Intrinsics.f(list, "list");
        this.f13070i = fragmentActivity;
        this.j = list;
        this.m = new CustomItemDecoration(6, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        VH holder = (VH) viewHolder;
        Intrinsics.f(holder, "holder");
        ArrayList arrayList = this.j;
        if (!arrayList.isEmpty() && i2 < arrayList.size()) {
            ChargingCategoryBean chargingCategoryBean = (ChargingCategoryBean) arrayList.get(i2);
            ItemChargingCategoryBinding itemChargingCategoryBinding = holder.f13072c;
            if (itemChargingCategoryBinding != null) {
                itemChargingCategoryBinding.f13205c.setText(chargingCategoryBean.get_title());
            }
            if (itemChargingCategoryBinding != null) {
                RecyclerView recyclerView = itemChargingCategoryBinding.f13204b;
                ChargingHorizontalAdapter chargingHorizontalAdapter = new ChargingHorizontalAdapter(this.f13070i, chargingCategoryBean.get_list());
                this.k = chargingHorizontalAdapter;
                chargingHorizontalAdapter.k = new ChargingCategoryAdapter$onBindViewHolder$1$1(this, holder);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.setOrientation(0);
                recyclerView.setLayoutManager(linearLayoutManager);
                CustomItemDecoration customItemDecoration = this.m;
                recyclerView.removeItemDecoration(customItemDecoration);
                recyclerView.addItemDecoration(customItemDecoration);
                ChargingHorizontalAdapter chargingHorizontalAdapter2 = this.k;
                Intrinsics.c(chargingHorizontalAdapter2);
                recyclerView.setAdapter(chargingHorizontalAdapter2);
            }
            if (itemChargingCategoryBinding != null) {
                ViewExt.c(itemChargingCategoryBinding.f13203a, new x(2, this, holder));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.f(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f13070i).inflate(R.layout.item_charging_category, parent, false);
        int i3 = R.id.llMore;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.a(R.id.llMore, viewInflate);
        if (linearLayout != null) {
            i3 = R.id.rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.a(R.id.rv, viewInflate);
            if (recyclerView != null) {
                i3 = R.id.tvTitle;
                TextView textView = (TextView) ViewBindings.a(R.id.tvTitle, viewInflate);
                if (textView != null) {
                    LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                    ItemChargingCategoryBinding itemChargingCategoryBinding = new ItemChargingCategoryBinding(linearLayout2, linearLayout, recyclerView, textView);
                    Intrinsics.e(linearLayout2, "getRoot(...)");
                    VH vh = new VH(linearLayout2);
                    vh.f13072c = itemChargingCategoryBinding;
                    return vh;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }
}
