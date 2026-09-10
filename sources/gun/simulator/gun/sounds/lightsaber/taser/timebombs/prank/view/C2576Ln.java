package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2576Ln extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EM f3373a;
    public final int b;
    public final EnumC4885vy c;
    public InterfaceC2550Kn d;

    public C2576Ln(EM em, int i) {
        this.f3373a = em;
        this.b = i;
        this.c = em.c.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        this.f3373a.c.getClass();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewOnClickListenerC2524Jn viewOnClickListenerC2524Jn = (ViewOnClickListenerC2524Jn) viewHolder;
        View view = viewOnClickListenerC2524Jn.itemView;
        EM em = this.f3373a;
        em.c.getClass();
        BM bm = em.c;
        int i2 = bm.E;
        viewOnClickListenerC2524Jn.itemView.setEnabled(true);
        int iD = DM.D(em.p);
        CompoundButton compoundButton = viewOnClickListenerC2524Jn.f3284a;
        if (iD == 1) {
            RadioButton radioButton = (RadioButton) compoundButton;
            boolean z = bm.u == i;
            int i3 = bm.n;
            int I = AbstractC2845Vx.I(0.3f, AbstractC2845Vx.X(AbstractC2845Vx.e0(radioButton.getContext(), R.attr.textColorPrimary, 0)) ? ViewCompat.MEASURED_STATE_MASK : -1);
            ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, -16842912}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, R.attr.state_checked}}, new int[]{AbstractC2845Vx.e0(radioButton.getContext(), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.attr.colorControlNormal, 0), i3, I, I});
            if (Build.VERSION.SDK_INT >= 22) {
                radioButton.setButtonTintList(colorStateList);
            } else {
                Drawable drawableWrap = DrawableCompat.wrap(ContextCompat.getDrawable(radioButton.getContext(), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.drawable.abc_btn_radio_material));
                DrawableCompat.setTintList(drawableWrap, colorStateList);
                radioButton.setButtonDrawable(drawableWrap);
            }
            radioButton.setChecked(z);
            radioButton.setEnabled(true);
        } else if (iD == 2) {
            throw null;
        }
        bm.getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.b, viewGroup, false);
        EM em = this.f3373a;
        BM bm = em.c;
        bm.getClass();
        Drawable drawableF0 = AbstractC2845Vx.f0(bm.f2867a, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.attr.md_list_selector);
        if (drawableF0 == null) {
            drawableF0 = AbstractC2845Vx.f0(em.getContext(), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.attr.md_list_selector);
        }
        viewInflate.setBackground(drawableF0);
        return new ViewOnClickListenerC2524Jn(viewInflate, this);
    }
}
