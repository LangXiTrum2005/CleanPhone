package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: compiled from: AppCompatDrawableManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class competently {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static competently f5418dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final PorterDuff.Mode f5419saneness = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public cuirassed f5420attabal;

    /* JADX INFO: compiled from: AppCompatDrawableManager.java */
    public class attabal implements cuirassed.dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int[] f5421attabal = {beachfront.marial.abc_textfield_search_default_mtrl_alpha, beachfront.marial.abc_textfield_default_mtrl_alpha, beachfront.marial.abc_ab_share_pack_mtrl_alpha};

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int[] f5425saneness = {beachfront.marial.abc_ic_commit_search_api_mtrl_alpha, beachfront.marial.abc_seekbar_tick_mark_material, beachfront.marial.abc_ic_menu_share_mtrl_alpha, beachfront.marial.abc_ic_menu_copy_mtrl_am_alpha, beachfront.marial.abc_ic_menu_cut_mtrl_alpha, beachfront.marial.abc_ic_menu_selectall_mtrl_alpha, beachfront.marial.abc_ic_menu_paste_mtrl_am_alpha};

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int[] f5423dern = {beachfront.marial.abc_textfield_activated_mtrl_alpha, beachfront.marial.abc_textfield_search_activated_mtrl_alpha, beachfront.marial.abc_cab_background_top_mtrl_alpha, beachfront.marial.abc_text_cursor_material, beachfront.marial.abc_text_select_handle_left_mtrl, beachfront.marial.abc_text_select_handle_middle_mtrl, beachfront.marial.abc_text_select_handle_right_mtrl};

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int[] f5426wireman = {beachfront.marial.abc_popup_background_mtrl_mult, beachfront.marial.abc_cab_background_internal_bg, beachfront.marial.abc_menu_hardkey_panel_mtrl_mult};

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int[] f5424marial = {beachfront.marial.abc_tab_indicator_material, beachfront.marial.abc_textfield_search_material};

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final int[] f5422beachfront = {beachfront.marial.abc_btn_check_material, beachfront.marial.abc_btn_radio_material, beachfront.marial.abc_btn_check_material_anim, beachfront.marial.abc_btn_radio_material_anim};

        public final ColorStateList apical(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListMarial = yemenite.marial(context, beachfront.attabal.colorSwitchThumbNormal);
            if (colorStateListMarial == null || !colorStateListMarial.isStateful()) {
                iArr[0] = yemenite.f5603saneness;
                iArr2[0] = yemenite.saneness(context, beachfront.attabal.colorSwitchThumbNormal);
                iArr[1] = yemenite.f5597beachfront;
                iArr2[1] = yemenite.dern(context, beachfront.attabal.colorControlActivated);
                iArr[2] = yemenite.f5604taiyuan;
                iArr2[2] = yemenite.dern(context, beachfront.attabal.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = yemenite.f5603saneness;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListMarial.getColorForState(iArr3, 0);
                iArr[1] = yemenite.f5597beachfront;
                iArr2[1] = yemenite.dern(context, beachfront.attabal.colorControlActivated);
                iArr[2] = yemenite.f5604taiyuan;
                iArr2[2] = colorStateListMarial.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        @Override // androidx.appcompat.widget.cuirassed.dern
        public Drawable attabal(cuirassed cuirassedVar, Context context, int i) {
            if (i == beachfront.marial.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{cuirassedVar.taiyuan(context, beachfront.marial.abc_cab_background_internal_bg), cuirassedVar.taiyuan(context, beachfront.marial.abc_cab_background_top_mtrl_alpha)});
            }
            if (i == beachfront.marial.abc_ratingbar_material) {
                return formularize(cuirassedVar, context, beachfront.wireman.abc_star_big);
            }
            if (i == beachfront.marial.abc_ratingbar_indicator_material) {
                return formularize(cuirassedVar, context, beachfront.wireman.abc_star_medium);
            }
            if (i == beachfront.marial.abc_ratingbar_small_material) {
                return formularize(cuirassedVar, context, beachfront.wireman.abc_star_small);
            }
            return null;
        }

        public final boolean beachfront(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList competently(Context context) {
            return impromptu(context, 0);
        }

        public final ColorStateList cutely(Context context) {
            return impromptu(context, yemenite.dern(context, beachfront.attabal.colorButtonNormal));
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0061  */
        /* JADX WARN: Code duplicated, block: B:27:0x0065 A[RETURN] */
        @Override // androidx.appcompat.widget.cuirassed.dern
        public boolean dern(Context context, int i, Drawable drawable) {
            int i2;
            boolean z;
            int iRound;
            Drawable drawableMutate;
            PorterDuff.Mode mode = competently.f5419saneness;
            if (!beachfront(this.f5421attabal, i)) {
                if (beachfront(this.f5423dern, i)) {
                    i2 = beachfront.attabal.colorControlActivated;
                } else {
                    if (beachfront(this.f5426wireman, i)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else {
                        if (i == beachfront.marial.abc_list_divider_mtrl_alpha) {
                            iRound = Math.round(40.8f);
                            i2 = 16842800;
                            mode = mode;
                        } else if (i != beachfront.marial.abc_dialog_material_background) {
                            i2 = 0;
                            z = false;
                            iRound = -1;
                        }
                        z = true;
                    }
                    mode = mode;
                    iRound = -1;
                    i2 = 16842801;
                    z = true;
                }
                if (z) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(competently.marial(yemenite.dern(context, i2), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            i2 = beachfront.attabal.colorControlNormal;
            z = true;
            iRound = -1;
            if (z) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(competently.marial(yemenite.dern(context, i2), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }

        public final LayerDrawable formularize(cuirassed cuirassedVar, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableTaiyuan = cuirassedVar.taiyuan(context, beachfront.marial.abc_star_black_48dp);
            Drawable drawableTaiyuan2 = cuirassedVar.taiyuan(context, beachfront.marial.abc_star_half_black_48dp);
            if ((drawableTaiyuan instanceof BitmapDrawable) && drawableTaiyuan.getIntrinsicWidth() == dimensionPixelSize && drawableTaiyuan.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableTaiyuan;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableTaiyuan.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableTaiyuan.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableTaiyuan2 instanceof BitmapDrawable) && drawableTaiyuan2.getIntrinsicWidth() == dimensionPixelSize && drawableTaiyuan2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableTaiyuan2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableTaiyuan2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableTaiyuan2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        public final void impassible(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = competently.f5419saneness;
            }
            drawableMutate.setColorFilter(competently.marial(i, mode));
        }

        public final ColorStateList impromptu(Context context, int i) {
            int iDern = yemenite.dern(context, beachfront.attabal.colorControlHighlight);
            return new ColorStateList(new int[][]{yemenite.f5603saneness, yemenite.f5602marial, yemenite.f5600dern, yemenite.f5604taiyuan}, new int[]{yemenite.saneness(context, beachfront.attabal.colorButtonNormal), monroe.dern.competently(iDern, i), monroe.dern.competently(iDern, i), i});
        }

        @Override // androidx.appcompat.widget.cuirassed.dern
        public boolean marial(Context context, int i, Drawable drawable) {
            if (i == beachfront.marial.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                impassible(layerDrawable.findDrawableByLayerId(R.id.background), yemenite.dern(context, beachfront.attabal.colorControlNormal), competently.f5419saneness);
                impassible(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), yemenite.dern(context, beachfront.attabal.colorControlNormal), competently.f5419saneness);
                impassible(layerDrawable.findDrawableByLayerId(R.id.progress), yemenite.dern(context, beachfront.attabal.colorControlActivated), competently.f5419saneness);
                return true;
            }
            if (i != beachfront.marial.abc_ratingbar_material && i != beachfront.marial.abc_ratingbar_indicator_material && i != beachfront.marial.abc_ratingbar_small_material) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            impassible(layerDrawable2.findDrawableByLayerId(R.id.background), yemenite.saneness(context, beachfront.attabal.colorControlNormal), competently.f5419saneness);
            impassible(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), yemenite.dern(context, beachfront.attabal.colorControlActivated), competently.f5419saneness);
            impassible(layerDrawable2.findDrawableByLayerId(R.id.progress), yemenite.dern(context, beachfront.attabal.colorControlActivated), competently.f5419saneness);
            return true;
        }

        @Override // androidx.appcompat.widget.cuirassed.dern
        public ColorStateList saneness(Context context, int i) {
            if (i == beachfront.marial.abc_edit_text_material) {
                return competently.attabal.attabal(context, beachfront.dern.abc_tint_edittext);
            }
            if (i == beachfront.marial.abc_switch_track_mtrl_alpha) {
                return competently.attabal.attabal(context, beachfront.dern.abc_tint_switch_track);
            }
            if (i == beachfront.marial.abc_switch_thumb_material) {
                return apical(context);
            }
            if (i == beachfront.marial.abc_btn_default_mtrl_shape) {
                return cutely(context);
            }
            if (i == beachfront.marial.abc_btn_borderless_material) {
                return competently(context);
            }
            if (i == beachfront.marial.abc_btn_colored_material) {
                return taiyuan(context);
            }
            if (i == beachfront.marial.abc_spinner_mtrl_am_alpha || i == beachfront.marial.abc_spinner_textfield_background_material) {
                return competently.attabal.attabal(context, beachfront.dern.abc_tint_spinner);
            }
            if (beachfront(this.f5425saneness, i)) {
                return yemenite.marial(context, beachfront.attabal.colorControlNormal);
            }
            if (beachfront(this.f5424marial, i)) {
                return competently.attabal.attabal(context, beachfront.dern.abc_tint_default);
            }
            if (beachfront(this.f5422beachfront, i)) {
                return competently.attabal.attabal(context, beachfront.dern.abc_tint_btn_checkable);
            }
            if (i == beachfront.marial.abc_seekbar_thumb_material) {
                return competently.attabal.attabal(context, beachfront.dern.abc_tint_seek_thumb);
            }
            return null;
        }

        public final ColorStateList taiyuan(Context context) {
            return impromptu(context, yemenite.dern(context, beachfront.attabal.colorAccent));
        }

        @Override // androidx.appcompat.widget.cuirassed.dern
        public PorterDuff.Mode wireman(int i) {
            if (i == beachfront.marial.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }
    }

    public static synchronized void impromptu() {
        if (f5418dern == null) {
            competently competentlyVar = new competently();
            f5418dern = competentlyVar;
            competentlyVar.f5420attabal = cuirassed.competently();
            f5418dern.f5420attabal.graveside(new attabal());
        }
    }

    public static synchronized PorterDuffColorFilter marial(int i, PorterDuff.Mode mode) {
        return cuirassed.apical(i, mode);
    }

    public static synchronized competently saneness() {
        try {
            if (f5418dern == null) {
                impromptu();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5418dern;
    }

    public static void taiyuan(Drawable drawable, kattegat kattegatVar, int[] iArr) {
        cuirassed.dovishness(drawable, kattegatVar, iArr);
    }

    public synchronized ColorStateList beachfront(Context context, int i) {
        return this.f5420attabal.formularize(context, i);
    }

    public synchronized void competently(Context context) {
        this.f5420attabal.polloi(context);
    }

    public synchronized Drawable dern(Context context, int i) {
        return this.f5420attabal.taiyuan(context, i);
    }

    public synchronized Drawable wireman(Context context, int i, boolean z) {
        return this.f5420attabal.cutely(context, i, z);
    }
}
