package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.basic.lib.basic.BasicRvViewHolderNotBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseRvAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ItemRvSceneBackgroundBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class RvSceneChangeAdapter extends BaseRvAdapter<Integer, SceneViewHolder> {

    public static final class SceneViewHolder extends BaseRvAdapter.ViewHolder<Integer, ItemRvSceneBackgroundBinding> {
        @Override // com.basic.lib.basic.BasicRvViewHolderNotBinding
        public final void c(Object obj) {
            ((ItemRvSceneBackgroundBinding) this.b).ivScene.setImageResource(((Number) obj).intValue());
        }

        @Override // com.basic.lib.basic.BasicRvViewHolderNotBinding
        public final void d(boolean z) {
            super.d(z);
            ViewBinding viewBinding = this.b;
            ((ItemRvSceneBackgroundBinding) viewBinding).ivBorder.setVisibility(this.itemView.isSelected() ? 0 : 8);
            ((ItemRvSceneBackgroundBinding) viewBinding).ivTick.setVisibility(this.itemView.isSelected() ? 0 : 8);
            ((ItemRvSceneBackgroundBinding) viewBinding).ivStroke.setVisibility(this.itemView.isSelected() ? 8 : 0);
        }
    }

    @Override // com.basic.lib.withbinding.BasicRvAdapter
    public final BasicRvViewHolderNotBinding c(ViewGroup viewGroup, int i) {
        AbstractC2995aW.q(viewGroup, "parent");
        ItemRvSceneBackgroundBinding itemRvSceneBackgroundBindingInflate = ItemRvSceneBackgroundBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AbstractC2995aW.p(itemRvSceneBackgroundBindingInflate, "inflate(...)");
        return new SceneViewHolder(itemRvSceneBackgroundBindingInflate);
    }

    @Override // com.basic.lib.withbinding.BasicRvAdapter
    /* JADX INFO: renamed from: e */
    public final void onBindViewHolder(BasicRvViewHolderNotBinding basicRvViewHolderNotBinding, int i) {
        SceneViewHolder sceneViewHolder = (SceneViewHolder) basicRvViewHolderNotBinding;
        AbstractC2995aW.q(sceneViewHolder, "holder");
        super.onBindViewHolder(sceneViewHolder, i);
    }

    @Override // com.basic.lib.withbinding.BasicRvAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SceneViewHolder sceneViewHolder = (SceneViewHolder) viewHolder;
        AbstractC2995aW.q(sceneViewHolder, "holder");
        super.onBindViewHolder(sceneViewHolder, i);
    }
}
