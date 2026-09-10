package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.storage.androidcleaner.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f47811b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static t f47812c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h2 f47813a;

    public static synchronized t a() {
        try {
            if (f47812c == null) {
                c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f47812c;
    }

    public static synchronized void c() {
        if (f47812c == null) {
            t tVar = new t();
            f47812c = tVar;
            tVar.f47813a = h2.b();
            h2 h2Var = f47812c.f47813a;
            com.google.android.gms.internal.consent_sdk.x xVar = new com.google.android.gms.internal.consent_sdk.x();
            xVar.f23260a = new int[]{2131230806, 2131230804, 2131230730};
            xVar.f23261b = new int[]{2131230754, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            xVar.f23262c = new int[]{2131230803, 2131230805, 2131230747, R.drawable.abc_text_cursor_material, 2131230800, 2131230801, 2131230802};
            xVar.f23263d = new int[]{2131230779, R.drawable.abc_cab_background_internal_bg, 2131230778};
            xVar.f23264e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            xVar.f23265f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            synchronized (h2Var) {
                h2Var.f47668e = xVar;
            }
        }
    }

    public static void d(Drawable drawable, l7.z zVar, int[] iArr) {
        PorterDuff.Mode mode = h2.f47661f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = zVar.f45237b;
        if (!z10 && !zVar.f45236a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z10 ? (ColorStateList) zVar.f45238c : null;
        PorterDuff.Mode mode2 = zVar.f45236a ? (PorterDuff.Mode) zVar.f45239d : h2.f47661f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = h2.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f47813a.c(context, i10);
    }
}
