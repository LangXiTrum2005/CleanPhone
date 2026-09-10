package nonexistence;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.codejoy.boom.clap.widget.ParkinsansFontText;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.X3;
import dabble.LanguageBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import sonnetize.kattegat;

/* JADX INFO: compiled from: GuideLanguageListAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u000b\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lnonexistence/saneness;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lnonexistence/saneness$attabal;", "<init>", "()V", "", "Ldabble/attabal;", "data", "", "selLanguage", "", "taiyuan", "(Ljava/util/List;Ljava/lang/String;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "impromptu", "(Lkotlin/jvm/functions/Function1;)V", "wireman", "()Ldabble/attabal;", "Landroid/view/ViewGroup;", "viewGroup", "", "p1", "competently", "(Landroid/view/ViewGroup;I)Lnonexistence/saneness$attabal;", "getItemCount", "()I", "holder", X3.i.L, "marial", "(Lnonexistence/saneness$attabal;I)V", "", "attabal", "Ljava/util/List;", "saneness", "I", "selectPos", "dern", "Lkotlin/jvm/functions/Function1;", "itemClickListener", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class saneness extends RecyclerView.Adapter<attabal> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final List<LanguageBean> data = new ArrayList();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public Function1<? super LanguageBean, Unit> itemClickListener;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int selectPos;

    /* JADX INFO: compiled from: GuideLanguageListAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnonexistence/saneness$attabal;", "Landroidx/recyclerview/widget/RecyclerView$stratoscope;", "Lsonnetize/kattegat;", "binding", "<init>", "(Lsonnetize/kattegat;)V", "saneness", "Lsonnetize/kattegat;", "attabal", "()Lsonnetize/kattegat;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal extends RecyclerView.stratoscope {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final kattegat binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(kattegat binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final kattegat getBinding() {
            return this.binding;
        }
    }

    public static final void beachfront(attabal attabalVar, saneness sanenessVar, View view) {
        Function1<? super LanguageBean, Unit> function1;
        int bindingAdapterPosition = attabalVar.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int i = sanenessVar.selectPos;
        sanenessVar.selectPos = bindingAdapterPosition;
        if (i != -1) {
            sanenessVar.notifyItemChanged(i);
        }
        sanenessVar.notifyItemChanged(sanenessVar.selectPos);
        LanguageBean languageBean = (LanguageBean) CollectionsKt.lotta(sanenessVar.data, bindingAdapterPosition);
        if (languageBean == null || (function1 = sanenessVar.itemClickListener) == null) {
            return;
        }
        function1.invoke(languageBean);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public attabal onCreateViewHolder(ViewGroup viewGroup, int p1) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        kattegat kattegatVarDern = kattegat.dern(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(kattegatVarDern, "inflate(...)");
        return new attabal(kattegatVarDern);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.data.size();
    }

    public final void impromptu(Function1<? super LanguageBean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.itemClickListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final attabal holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        LanguageBean languageBean = this.data.get(position);
        boolean z = this.selectPos == position;
        kattegat binding = holder.getBinding();
        binding.f37867saneness.setImageResource(languageBean.getIcon());
        binding.f37866dern.setText(languageBean.getLanguageName());
        binding.f37868wireman.setText(languageBean.getLanguageName());
        ParkinsansFontText tvLanguage = binding.f37866dern;
        Intrinsics.checkNotNullExpressionValue(tvLanguage, "tvLanguage");
        tvLanguage.setVisibility(!z ? 0 : 8);
        ParkinsansFontText tvSelLanguage = binding.f37868wireman;
        Intrinsics.checkNotNullExpressionValue(tvSelLanguage, "tvSelLanguage");
        tvSelLanguage.setVisibility(z ? 0 : 8);
        binding.getRoot().setSelected(z);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: nonexistence.attabal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                saneness.beachfront(holder, this, view);
            }
        });
    }

    public final void taiyuan(List<LanguageBean> data, String selLanguage) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selLanguage, "selLanguage");
        this.data.clear();
        this.data.addAll(data);
        Iterator<LanguageBean> it = data.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.wireman(it.next().getLanguageCode(), selLanguage)) {
                this.selectPos = i;
                notifyDataSetChanged();
            }
            i++;
        }
        i = -1;
        this.selectPos = i;
        notifyDataSetChanged();
    }

    public final LanguageBean wireman() {
        return (LanguageBean) CollectionsKt.lotta(this.data, this.selectPos);
    }
}
