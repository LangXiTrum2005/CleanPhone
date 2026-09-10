package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC2524Jn extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompoundButton f3284a;
    public final TextView b;
    public final C2576Ln c;

    public ViewOnClickListenerC2524Jn(View view, C2576Ln c2576Ln) {
        super(view);
        this.f3284a = (CompoundButton) view.findViewById(R.id.md_control);
        this.b = (TextView) view.findViewById(R.id.md_title);
        this.c = c2576Ln;
        view.setOnClickListener(this);
        c2576Ln.f3373a.c.getClass();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2576Ln c2576Ln = this.c;
        if (c2576Ln.d == null || getAdapterPosition() == -1) {
            return;
        }
        c2576Ln.f3373a.c.getClass();
        ((EM) c2576Ln.d).d(view, getAdapterPosition(), false);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C2576Ln c2576Ln = this.c;
        if (c2576Ln.d == null || getAdapterPosition() == -1) {
            return false;
        }
        c2576Ln.f3373a.c.getClass();
        return ((EM) c2576Ln.d).d(view, getAdapterPosition(), true);
    }
}
