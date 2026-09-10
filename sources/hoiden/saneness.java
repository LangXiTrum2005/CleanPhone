package hoiden;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.codejoy.boom.clap.data.SoundData;
import com.codejoy.boom.clap.formularize;
import com.codejoy.boom.clap.module.vip.VipInfoManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import sonnetize.supplicat;

/* JADX INFO: compiled from: HorSoundListAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001a\u00020\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\t2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R*\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010*¨\u0006,"}, d2 = {"Lhoiden/saneness;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lhoiden/saneness$attabal;", "<init>", "()V", "", "Lcom/codejoy/boom/clap/data/SoundData;", "data", "selSoundData", "", "taiyuan", "(Ljava/util/List;Lcom/codejoy/boom/clap/data/SoundData;)V", "cutely", "(Lcom/codejoy/boom/clap/data/SoundData;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "impromptu", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "", "competently", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "viewGroup", "viewType", "beachfront", "(Landroid/view/ViewGroup;I)Lhoiden/saneness$attabal;", "holder", X3.i.L, "wireman", "(Lhoiden/saneness$attabal;I)V", "getItemCount", "()I", "", "attabal", "Ljava/util/List;", "saneness", "I", "selPosition", "dern", "Lkotlin/jvm/functions/Function1;", "itemVipClickListener", "Lkotlin/jvm/functions/Function2;", "itemClickListener", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class saneness extends RecyclerView.Adapter<attabal> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final List<SoundData> data = new ArrayList();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public Function1<? super SoundData, Unit> itemVipClickListener;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int selPosition;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public Function2<? super Integer, ? super SoundData, Unit> itemClickListener;

    /* JADX INFO: compiled from: HorSoundListAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhoiden/saneness$attabal;", "Landroidx/recyclerview/widget/RecyclerView$stratoscope;", "Lsonnetize/supplicat;", "binding", "<init>", "(Lsonnetize/supplicat;)V", "saneness", "Lsonnetize/supplicat;", "attabal", "()Lsonnetize/supplicat;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal extends RecyclerView.stratoscope {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final supplicat binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(supplicat binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final supplicat getBinding() {
            return this.binding;
        }
    }

    public static final void marial(SoundData soundData, saneness sanenessVar, attabal attabalVar, View view) {
        if (soundData.getIsVip() && !VipInfoManager.INSTANCE.attabal().triweekly()) {
            Function1<? super SoundData, Unit> function1 = sanenessVar.itemVipClickListener;
            if (function1 != null) {
                function1.invoke(soundData);
                return;
            }
            return;
        }
        int i = sanenessVar.selPosition;
        sanenessVar.selPosition = attabalVar.getAbsoluteAdapterPosition();
        sanenessVar.notifyItemChanged(i);
        sanenessVar.notifyItemChanged(sanenessVar.selPosition);
        Function2<? super Integer, ? super SoundData, Unit> function2 = sanenessVar.itemClickListener;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(sanenessVar.selPosition), soundData);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public attabal onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        supplicat supplicatVarDern = supplicat.dern(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(supplicatVarDern, "inflate(...)");
        return new attabal(supplicatVarDern);
    }

    public final void competently(Function2<? super Integer, ? super SoundData, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.itemClickListener = listener;
    }

    public final void cutely(SoundData selSoundData) {
        if (selSoundData != null) {
            int i = this.selPosition;
            Iterator<SoundData> it = this.data.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (Intrinsics.wireman(it.next().getAudioFile(), selSoundData.getAudioFile())) {
                    this.selPosition = i2;
                    notifyItemChanged(i);
                    notifyItemChanged(this.selPosition);
                }
                i2++;
            }
            i2 = -1;
            this.selPosition = i2;
            notifyItemChanged(i);
            notifyItemChanged(this.selPosition);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.data.size();
    }

    public final void impromptu(Function1<? super SoundData, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.itemVipClickListener = listener;
    }

    public final void taiyuan(List<SoundData> data, SoundData selSoundData) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (selSoundData != null) {
            Iterator<SoundData> it = data.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.wireman(it.next().getAudioFile(), selSoundData.getAudioFile())) {
                    break;
                } else {
                    i++;
                }
            }
            this.selPosition = i;
        }
        this.data.clear();
        this.data.addAll(data);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final attabal holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final SoundData soundData = this.data.get(position);
        boolean z = this.selPosition == position;
        supplicat binding = holder.getBinding();
        try {
            Result.Companion companion = Result.INSTANCE;
            binding.f37977dern.setImageResource(soundData.getIcon());
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        binding.f37978saneness.setBackgroundResource(z ? formularize.bg_sound_sel_item : formularize.bg_sound_next_item);
        AppCompatImageView ivPro = binding.f37979wireman;
        Intrinsics.checkNotNullExpressionValue(ivPro, "ivPro");
        ivPro.setVisibility(soundData.getIsVip() ? 0 : 8);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: hoiden.attabal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                saneness.marial(soundData, this, holder, view);
            }
        });
    }
}
