package com.codejoy.boom.clap.module.vip;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import loungewear.PurchaseItem;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import sonnetize.polder;

/* JADX INFO: compiled from: VipListAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/codejoy/boom/clap/module/vip/gintrap;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/codejoy/boom/clap/module/vip/gintrap$attabal;", "<init>", "()V", "Lkotlin/Function1;", "Lloungewear/marial;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "taiyuan", "(Lkotlin/jvm/functions/Function1;)V", "", "data", "cutely", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "impromptu", "(Landroid/view/ViewGroup;I)Lcom/codejoy/boom/clap/module/vip/gintrap$attabal;", "getItemCount", "()I", "holder", X3.i.L, "beachfront", "(Lcom/codejoy/boom/clap/module/vip/gintrap$attabal;I)V", "", "attabal", "Ljava/util/List;", "getData", "()Ljava/util/List;", "saneness", "I", "selPos", "dern", "Lkotlin/jvm/functions/Function1;", "itemClickListener", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class gintrap extends RecyclerView.Adapter<attabal> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final List<PurchaseItem> data = new ArrayList();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public Function1<? super PurchaseItem, Unit> itemClickListener = new Function1() { // from class: com.codejoy.boom.clap.module.vip.dovishness
        @Override // p002kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return gintrap.marial((PurchaseItem) obj);
        }
    };

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int selPos;

    /* JADX INFO: compiled from: VipListAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/codejoy/boom/clap/module/vip/gintrap$attabal;", "Landroidx/recyclerview/widget/RecyclerView$stratoscope;", "Lsonnetize/polder;", "binding", "<init>", "(Lsonnetize/polder;)V", "saneness", "Lsonnetize/polder;", "attabal", "()Lsonnetize/polder;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal extends RecyclerView.stratoscope {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final polder binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(polder binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final polder getBinding() {
            return this.binding;
        }
    }

    public static final void competently(attabal attabalVar, gintrap gintrapVar, View view) {
        int bindingAdapterPosition;
        Intrinsics.beachfront(view);
        if (vintage.taiyuan.taiyuan(view) || (bindingAdapterPosition = attabalVar.getBindingAdapterPosition()) == -1) {
            return;
        }
        gintrapVar.selPos = bindingAdapterPosition;
        gintrapVar.notifyDataSetChanged();
        gintrapVar.itemClickListener.invoke(gintrapVar.data.get(bindingAdapterPosition));
    }

    public static final Unit marial(PurchaseItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f29295attabal;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final attabal holder, int position) {
        String localFormattedPrice;
        Number price;
        StringBuilder sb;
        Number rawPrice;
        StringBuilder sb2;
        String string;
        Intrinsics.checkNotNullParameter(holder, "holder");
        PurchaseItem purchaseItem = this.data.get(position);
        polder binding = holder.getBinding();
        String lowerCase = purchaseItem.getType().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.wireman(lowerCase, "year")) {
            AppCompatTextView appCompatTextView = binding.f37920wireman;
            appCompatTextView.setText(appCompatTextView.getContext().getString(com.codejoy.boom.clap.arytenoidectomy.best_value));
            FrameLayout flBestSale = binding.f37917dern;
            Intrinsics.checkNotNullExpressionValue(flBestSale, "flBestSale");
            flBestSale.setVisibility(8);
            binding.f37916competently.setText(binding.getRoot().getContext().getString(com.codejoy.boom.clap.arytenoidectomy.annual));
            AppCompatTextView appCompatTextView2 = binding.f37915beachfront;
            String localFormattedPrice2 = purchaseItem.getLocalFormattedPrice();
            if (localFormattedPrice2.length() == 0) {
                localFormattedPrice2 = "$ " + purchaseItem.getPrice();
            }
            appCompatTextView2.setText(localFormattedPrice2);
            AppCompatTextView tvOriginPrice = binding.f37918marial;
            Intrinsics.checkNotNullExpressionValue(tvOriginPrice, "tvOriginPrice");
            tvOriginPrice.setVisibility(8);
        } else if (Intrinsics.wireman(lowerCase, "week")) {
            AppCompatTextView appCompatTextView3 = binding.f37920wireman;
            appCompatTextView3.setText(appCompatTextView3.getContext().getString(com.codejoy.boom.clap.arytenoidectomy.best_sale));
            binding.f37916competently.setText(binding.getRoot().getContext().getString(com.codejoy.boom.clap.arytenoidectomy.weekly));
            AppCompatTextView appCompatTextView4 = binding.f37915beachfront;
            if (purchaseItem.getOpenOffer()) {
                localFormattedPrice = purchaseItem.getOfferPrice();
                if (localFormattedPrice.length() == 0) {
                    price = purchaseItem.getPrice();
                    sb = new StringBuilder();
                    sb.append("$");
                    sb.append(price);
                    localFormattedPrice = sb.toString();
                }
            } else {
                localFormattedPrice = purchaseItem.getLocalFormattedPrice();
                if (localFormattedPrice.length() == 0) {
                    price = purchaseItem.getPrice();
                    sb = new StringBuilder();
                    sb.append("$");
                    sb.append(price);
                    localFormattedPrice = sb.toString();
                }
            }
            appCompatTextView4.setText(localFormattedPrice);
            AppCompatTextView appCompatTextView5 = binding.f37918marial;
            if (purchaseItem.getOpenOffer()) {
                string = purchaseItem.getLocalFormattedPrice();
                if (string.length() == 0) {
                    rawPrice = purchaseItem.getRawPrice();
                    sb2 = new StringBuilder();
                }
                appCompatTextView5.setText(string);
                AppCompatTextView appCompatTextView6 = binding.f37918marial;
                appCompatTextView6.setPaintFlags(appCompatTextView6.getPaintFlags() | 16);
            } else {
                rawPrice = purchaseItem.getRawPrice();
                sb2 = new StringBuilder();
            }
            sb2.append("$");
            sb2.append(rawPrice);
            string = sb2.toString();
            appCompatTextView5.setText(string);
            AppCompatTextView appCompatTextView7 = binding.f37918marial;
            appCompatTextView7.setPaintFlags(appCompatTextView7.getPaintFlags() | 16);
        }
        FrameLayout flBestSale2 = binding.f37917dern;
        Intrinsics.checkNotNullExpressionValue(flBestSale2, "flBestSale");
        flBestSale2.setVisibility(this.selPos == position ? 0 : 8);
        if (this.selPos == position) {
            binding.f37919saneness.setSelected(true);
            binding.f37915beachfront.setSelected(true);
            binding.f37918marial.setSelected(true);
            binding.f37916competently.setSelected(true);
        } else {
            binding.f37919saneness.setSelected(false);
            binding.f37915beachfront.setSelected(false);
            binding.f37918marial.setSelected(false);
            binding.f37916competently.setSelected(false);
        }
        binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.vip.adultoid
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gintrap.competently(holder, this, view);
            }
        });
    }

    public final void cutely(List<PurchaseItem> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data.clear();
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public attabal onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        polder polderVarDern = polder.dern(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(polderVarDern, "inflate(...)");
        return new attabal(polderVarDern);
    }

    public final void taiyuan(Function1<? super PurchaseItem, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.itemClickListener = listener;
    }
}
