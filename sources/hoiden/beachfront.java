package hoiden;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.codejoy.boom.clap.data.SoundData;
import com.codejoy.boom.clap.module.vip.VipInfoManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import sonnetize.merc;
import vintage.taiyuan;

/* JADX INFO: compiled from: SoundsListAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\u000f\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010(R$\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(¨\u0006,"}, d2 = {"Lhoiden/beachfront;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lhoiden/beachfront$attabal;", "<init>", "()V", "", IronSourceConstants.EVENTS_DURATION, "", "cutely", "(I)V", "Lkotlin/Function1;", "Lcom/codejoy/boom/clap/data/SoundData;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "impromptu", "(Lkotlin/jvm/functions/Function1;)V", "competently", "", "data", "selSound", "taiyuan", "(Ljava/util/List;Lcom/codejoy/boom/clap/data/SoundData;)V", "Landroid/view/ViewGroup;", "viewGroup", "p1", "beachfront", "(Landroid/view/ViewGroup;I)Lhoiden/beachfront$attabal;", "getItemCount", "()I", "holder", X3.i.L, "wireman", "(Lhoiden/beachfront$attabal;I)V", "", "attabal", "Ljava/util/List;", "saneness", "I", "selPosition", "dern", "playDurationInSec", "Lkotlin/jvm/functions/Function1;", "itemVipClickListener", "marial", "itemClickListener", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class beachfront extends RecyclerView.Adapter<attabal> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final List<SoundData> data = new ArrayList();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public int playDurationInSec;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public Function1<? super SoundData, Unit> itemClickListener;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int selPosition;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public Function1<? super SoundData, Unit> itemVipClickListener;

    /* JADX INFO: compiled from: SoundsListAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhoiden/beachfront$attabal;", "Landroidx/recyclerview/widget/RecyclerView$stratoscope;", "Lsonnetize/merc;", "binding", "<init>", "(Lsonnetize/merc;)V", "saneness", "Lsonnetize/merc;", "attabal", "()Lsonnetize/merc;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal extends RecyclerView.stratoscope {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final merc binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(merc binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final merc getBinding() {
            return this.binding;
        }
    }

    public static final void marial(SoundData soundData, beachfront beachfrontVar, View view) {
        if (!soundData.getIsVip() || VipInfoManager.INSTANCE.attabal().triweekly()) {
            Function1<? super SoundData, Unit> function1 = beachfrontVar.itemClickListener;
            if (function1 != null) {
                function1.invoke(soundData);
                return;
            }
            return;
        }
        Function1<? super SoundData, Unit> function2 = beachfrontVar.itemVipClickListener;
        if (function2 != null) {
            function2.invoke(soundData);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public attabal onCreateViewHolder(ViewGroup viewGroup, int p1) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        merc mercVarDern = merc.dern(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(mercVarDern, "inflate(...)");
        return new attabal(mercVarDern);
    }

    public final void competently(Function1<? super SoundData, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.itemClickListener = listener;
    }

    public final void cutely(int duration) {
        this.playDurationInSec = duration;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.data.size();
    }

    public final void impromptu(Function1<? super SoundData, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.itemVipClickListener = listener;
    }

    public final void taiyuan(List<SoundData> data, SoundData selSound) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data.clear();
        this.data.addAll(data);
        if (selSound != null) {
            Iterator<SoundData> it = data.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.wireman(it.next().getAudioFile(), selSound.getAudioFile())) {
                    break;
                } else {
                    i++;
                }
            }
            this.selPosition = i;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(attabal holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final SoundData soundData = this.data.get(position);
        boolean z = this.selPosition == position;
        merc binding = holder.getBinding();
        binding.f37886saneness.setImageResource(soundData.getIcon());
        binding.f37887wireman.setText(binding.getRoot().getContext().getString(soundData.getNameResId()));
        if (z) {
            ConstraintLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            taiyuan.polloi(root);
            binding.f37887wireman.setBoldFont();
        } else {
            ConstraintLayout root2 = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            taiyuan.monoploid(root2);
            binding.f37887wireman.setMediumFont();
        }
        binding.f37887wireman.setSelected(z);
        AppCompatImageView ivVip = binding.f37885dern;
        Intrinsics.checkNotNullExpressionValue(ivVip, "ivVip");
        ivVip.setVisibility(soundData.getIsVip() ? 0 : 8);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: hoiden.marial
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                beachfront.marial(soundData, this, view);
            }
        });
    }
}
