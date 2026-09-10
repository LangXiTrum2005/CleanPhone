package crosspiece;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.premeiotic;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: FragmentViewHolder.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness extends RecyclerView.stratoscope {
    public saneness(FrameLayout frameLayout) {
        super(frameLayout);
    }

    public static saneness attabal(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(premeiotic.apical());
        frameLayout.setSaveEnabled(false);
        return new saneness(frameLayout);
    }

    public FrameLayout saneness() {
        return (FrameLayout) this.itemView;
    }
}
