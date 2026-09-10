package hoiden;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.molybdenite;
import com.codejoy.boom.clap.widget.ParkinsansFontText;
import com.ironsource.X3;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import sonnetize.restrictive;

/* JADX INFO: compiled from: SoundDurationListAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lhoiden/wireman;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lhoiden/wireman$attabal;", "<init>", "()V", "", "selDuration", "", "impromptu", "(I)V", "wireman", "()I", "Landroid/view/ViewGroup;", "viewGroup", "viewType", "competently", "(Landroid/view/ViewGroup;I)Lhoiden/wireman$attabal;", "holder", X3.i.L, "marial", "(Lhoiden/wireman$attabal;I)V", "getItemCount", "", "attabal", "Ljava/util/List;", "data", "saneness", "I", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class wireman extends RecyclerView.Adapter<attabal> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final List<Integer> data = adultoid.polloi(5, 15, 30, 60);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int selDuration;

    /* JADX INFO: compiled from: SoundDurationListAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhoiden/wireman$attabal;", "Landroidx/recyclerview/widget/RecyclerView$stratoscope;", "Lsonnetize/restrictive;", "binding", "<init>", "(Lsonnetize/restrictive;)V", "saneness", "Lsonnetize/restrictive;", "attabal", "()Lsonnetize/restrictive;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal extends RecyclerView.stratoscope {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final restrictive binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(restrictive binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final restrictive getBinding() {
            return this.binding;
        }
    }

    public static final void beachfront(wireman wiremanVar, int i, View view) {
        wiremanVar.selDuration = i;
        wiremanVar.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public attabal onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        restrictive restrictiveVarDern = restrictive.dern(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(restrictiveVarDern, "inflate(...)");
        return new attabal(restrictiveVarDern);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.data.size();
    }

    public final void impromptu(int selDuration) {
        this.selDuration = selDuration;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(attabal holder, int position) {
        String str;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final int iIntValue = this.data.get(position).intValue();
        boolean z = this.selDuration == iIntValue;
        restrictive binding = holder.getBinding();
        ParkinsansFontText parkinsansFontText = binding.f37948wireman;
        if (iIntValue >= 60) {
            str = "1m";
        } else {
            str = iIntValue + "s";
        }
        parkinsansFontText.setText(str);
        binding.f37948wireman.setSelected(z);
        View selView = binding.f37946dern;
        Intrinsics.checkNotNullExpressionValue(selView, "selView");
        selView.setVisibility(z ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = binding.f37947saneness.getLayoutParams();
        Intrinsics.competently(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = z ? 0 : molybdenite.attabal(3.0f);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = z ? 0 : molybdenite.attabal(3.0f);
        binding.f37947saneness.setLayoutParams(layoutParams2);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: hoiden.dern
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wireman.beachfront(this.f27863kowloon, iIntValue, view);
            }
        });
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final int getSelDuration() {
        return this.selDuration;
    }
}
