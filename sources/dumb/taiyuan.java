package dumb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: DrawableDecoderCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static volatile boolean f25383attabal = true;

    public static Drawable attabal(Context context, int i, Resources.Theme theme) {
        return dern(context, context, i, theme);
    }

    public static Drawable dern(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f25383attabal) {
                return marial(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return picketboat.saneness.getDrawable(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f25383attabal = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return wireman(context2, i, theme);
    }

    public static Drawable marial(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            apical.wireman wiremanVar = new apical.wireman(context, theme);
            wiremanVar.attabal(theme.getResources().getConfiguration());
            context = wiremanVar;
        }
        return competently.attabal.saneness(context, i);
    }

    public static Drawable saneness(Context context, Context context2, int i) {
        return dern(context, context2, i, null);
    }

    public static Drawable wireman(Context context, int i, Resources.Theme theme) {
        return lightstruck.impromptu.marial(context.getResources(), i, theme);
    }
}
