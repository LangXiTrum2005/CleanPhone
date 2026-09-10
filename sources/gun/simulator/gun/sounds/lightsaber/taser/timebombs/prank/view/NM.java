package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.simplelist.MaterialSimpleListAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class NM extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialSimpleListAdapter f3454a;

    public NM(View view, MaterialSimpleListAdapter materialSimpleListAdapter) {
        super(view);
        this.f3454a = materialSimpleListAdapter;
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3454a.getClass();
    }
}
