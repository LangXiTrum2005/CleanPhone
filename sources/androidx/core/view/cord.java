package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;

/* JADX INFO: compiled from: MenuItemCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class cord {

    /* JADX INFO: compiled from: MenuItemCompat.java */
    public static class attabal {
        public static MenuItem attabal(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        public static MenuItem beachfront(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }

        public static MenuItem dern(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        public static MenuItem marial(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        public static MenuItem saneness(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        public static MenuItem wireman(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }
    }

    public static MenuItem attabal(MenuItem menuItem, saneness sanenessVar) {
        return menuItem instanceof julian.saneness ? ((julian.saneness) menuItem).saneness(sanenessVar) : menuItem;
    }

    public static void beachfront(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof julian.saneness) {
            ((julian.saneness) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            attabal.marial(menuItem, c, i);
        }
    }

    public static void competently(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof julian.saneness) {
            ((julian.saneness) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            attabal.beachfront(menuItem, charSequence);
        }
    }

    public static void dern(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof julian.saneness) {
            ((julian.saneness) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            attabal.saneness(menuItem, charSequence);
        }
    }

    public static void marial(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof julian.saneness) {
            ((julian.saneness) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            attabal.wireman(menuItem, mode);
        }
    }

    public static void saneness(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof julian.saneness) {
            ((julian.saneness) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            attabal.attabal(menuItem, c, i);
        }
    }

    public static void wireman(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof julian.saneness) {
            ((julian.saneness) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            attabal.dern(menuItem, colorStateList);
        }
    }
}
