package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes.dex */
public final class BM {
    public DialogInterface.OnDismissListener A;
    public DialogInterface.OnShowListener B;
    public boolean C;
    public int D;
    public int E;
    public int F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2867a;
    public CharSequence b;
    public final EnumC4885vy c;
    public final EnumC4885vy d;
    public final EnumC4885vy e;
    public final EnumC4885vy f;
    public final EnumC4885vy g;
    public final int h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public View m;
    public int n;
    public ColorStateList o;
    public ColorStateList p;
    public ColorStateList q;
    public final ColorStateList r;
    public boolean s;
    public boolean t;
    public int u;
    public final boolean v;
    public final Typeface w;
    public final Typeface x;
    public C2576Ln y;
    public LinearLayoutManager z;

    /* JADX WARN: Code duplicated, block: B:25:0x0147  */
    /* JADX WARN: Code duplicated, block: B:26:0x0148 A[Catch: all -> 0x015d, TryCatch #2 {all -> 0x015d, blocks: (B:13:0x010b, B:15:0x0115, B:18:0x011e, B:19:0x0132, B:21:0x0135, B:23:0x013f, B:26:0x0148, B:27:0x015c), top: B:46:0x010b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x0148, please report this as an issue */
    public BM(FragmentActivity fragmentActivity) {
        Typeface typefaceA;
        EnumC4885vy enumC4885vy = EnumC4885vy.f5163a;
        this.c = enumC4885vy;
        this.d = enumC4885vy;
        EnumC4885vy enumC4885vy2 = EnumC4885vy.c;
        this.e = enumC4885vy2;
        this.f = enumC4885vy;
        this.g = enumC4885vy;
        this.h = 0;
        this.i = -1;
        this.j = -1;
        this.F = 1;
        this.s = true;
        this.t = true;
        this.u = -1;
        this.v = true;
        this.f2867a = fragmentActivity;
        int iE0 = AbstractC2845Vx.e0(fragmentActivity, R.attr.colorAccent, ContextCompat.getColor(fragmentActivity, R.color.md_material_blue_600));
        this.n = iE0;
        int iE1 = AbstractC2845Vx.e0(fragmentActivity, android.R.attr.colorAccent, iE0);
        this.n = iE1;
        this.o = AbstractC2845Vx.V(fragmentActivity, iE1);
        this.p = AbstractC2845Vx.V(fragmentActivity, this.n);
        this.q = AbstractC2845Vx.V(fragmentActivity, this.n);
        this.r = AbstractC2845Vx.V(fragmentActivity, AbstractC2845Vx.e0(fragmentActivity, R.attr.md_link_color, this.n));
        this.h = AbstractC2845Vx.e0(fragmentActivity, R.attr.md_btn_ripple_color, AbstractC2845Vx.e0(fragmentActivity, R.attr.colorControlHighlight, AbstractC2845Vx.e0(fragmentActivity, android.R.attr.colorControlHighlight, 0)));
        NumberFormat.getPercentInstance();
        this.F = AbstractC2845Vx.X(AbstractC2845Vx.e0(fragmentActivity, android.R.attr.textColorPrimary, 0)) ? 1 : 2;
        if (Zb0.a(false) != null) {
            Zb0.a(true).getClass();
            this.c = enumC4885vy;
            this.d = enumC4885vy;
            this.e = enumC4885vy2;
            this.f = enumC4885vy;
            this.g = enumC4885vy;
        }
        this.c = AbstractC2845Vx.g0(fragmentActivity, R.attr.md_title_gravity, this.c);
        this.d = AbstractC2845Vx.g0(fragmentActivity, R.attr.md_content_gravity, this.d);
        this.e = AbstractC2845Vx.g0(fragmentActivity, R.attr.md_btnstacked_gravity, this.e);
        this.f = AbstractC2845Vx.g0(fragmentActivity, R.attr.md_items_gravity, this.f);
        this.g = AbstractC2845Vx.g0(fragmentActivity, R.attr.md_buttons_gravity, this.g);
        TypedValue typedValue = new TypedValue();
        fragmentActivity.getTheme().resolveAttribute(R.attr.md_medium_font, typedValue, true);
        String str = (String) typedValue.string;
        TypedValue typedValue2 = new TypedValue();
        fragmentActivity.getTheme().resolveAttribute(R.attr.md_regular_font, typedValue2, true);
        String str2 = (String) typedValue2.string;
        if (str != null) {
            try {
                if (!str.trim().isEmpty()) {
                    Typeface typefaceA2 = Ke0.a(fragmentActivity, str);
                    this.x = typefaceA2;
                    if (typefaceA2 == null) {
                        throw new IllegalArgumentException("No font asset found for \"" + str + "\"");
                    }
                }
                if (str2 != null && !str2.trim().isEmpty()) {
                    typefaceA = Ke0.a(fragmentActivity, str2);
                    this.w = typefaceA;
                    if (typefaceA != null) {
                        throw new IllegalArgumentException("No font asset found for \"" + str2 + "\"");
                    }
                }
            } catch (Throwable unused) {
            }
        } else if (str2 != null) {
            typefaceA = Ke0.a(fragmentActivity, str2);
            this.w = typefaceA;
            if (typefaceA != null) {
                throw new IllegalArgumentException("No font asset found for \"" + str2 + "\"");
            }
        }
        if (this.x == null) {
            try {
                this.x = Typeface.create("sans-serif-medium", 0);
            } catch (Throwable unused2) {
                this.x = Typeface.DEFAULT_BOLD;
            }
        }
        if (this.w == null) {
            try {
                this.w = Typeface.create(com.mbridge.msdk.playercommon.exoplayer2.C.SANS_SERIF_NAME, 0);
            } catch (Throwable unused3) {
                Typeface typeface = Typeface.SANS_SERIF;
                this.w = typeface;
                if (typeface == null) {
                    this.w = Typeface.DEFAULT;
                }
            }
        }
    }

    public final void a(View view) {
        if (this.k != null) {
            throw new IllegalStateException("You cannot use customView() when you have content set.");
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        this.m = view;
        this.C = false;
    }
}
